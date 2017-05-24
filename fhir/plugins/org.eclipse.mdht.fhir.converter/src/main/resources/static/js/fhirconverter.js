/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

var app = angular.module('myApp', []);

app.directive('bindFile', [ function() {
	return {
		require : "ngModel",
		restrict : 'A',
		link : function($scope, el, attrs, ngModel) {
			el.bind('change', function(event) {
				ngModel.$setViewValue(event.target.files[0]);
				$scope.$apply();
			});

			$scope.$watch(function() {
				return ngModel.$viewValue;
			}, function(value) {
				if (!value) {
					el.val("");
				}
			});
		}
	};
} ]);

app.controller('myCtrl', function($scope, $http) {
	
	$scope.onlyFiles = false;

	$scope.isOnlyFiles = function () {
		return $scope.onlyFiles;
	};

	$scope.status = {
						message : "Press buttons to convert between left or right representations !",
						color : "black"
					};

	$scope.hasFormatInput = function(LeftPane) {
		var pane = $scope.fhirData(LeftPane);
		return pane.formatIsBinary() ? pane.data : pane.text;
	};

	$scope.fhirData = function(LeftPane) {
		var id = LeftPane ? "pane1" : "pane2";
		return angular.element(document.getElementById(id)).scope();
	};
	
	$scope.loadExample = function(url, format1, format2) {
		var pane1 = $scope.fhirData(true);
		var pane2 = $scope.fhirData(false);
		pane1.format = format1;
		pane2.format = format2;
		$scope.beforeRequest();
		$http({
			transformResponse : undefined,
			headers : {
				'Accept' : 'text/plain'
			},
			method : 'GET',
			url : url
		}).then($scope.loadExampleCallback, $scope.updateStatus);
	};
	
	$scope.loadExampleCallback = function (data) {
		if ($scope.updateStatus(data)) {
			var pane1 = $scope.fhirData(true);
			var pane2 = $scope.fhirData(false);
			pane1.text = data.data;
			pane2.text = "";
		}
	}

	$scope.updateStatus = function (xhr) {
		
		if (xhr.status != 200) {

			var text = xhr.responseType != 'arraybuffer' ? xhr.responseText
					: new TextDecoder("utf-8")
			.decode(new DataView(xhr.response));
			var data = text ? JSON.parse(text) : {error: "No further error message available", message: ""};
			
			$scope.status = {
					message : "#"+xhr.status+": " + data.error + ". "+ data.message,
					color : "red"
			};
			return false;
		} else {
			$scope.status = {
					message : "Request processed in " + (new Date().getTime() - $scope.status.startRestRequest) + "ms",
					color : "green",
					startRestRequest: $scope.status.startRestRequest
			};
			return true;
		}
	}

	$scope.beforeRequest = function () {
		$scope.status = {
				message : "Waiting for response...",
				color : "gray",
				startRestRequest : new Date().getTime()
		};
	}

	$scope.transformFHIR = function (LeftPane) {

		$scope.beforeRequest();

		var from = $scope.fhirData(LeftPane);
		var to = $scope.fhirData(!LeftPane);

		var formData = new FormData();
		if (from.formatIsBinary()) {
			formData.append("content", from.data);
		} else {
			var blob = new Blob([ from.text ], {
				type : "application/" + from.format
			});
			formData.append("content", blob);
		}

		// see http://stackoverflow.com/questions/16086162/handle-file-download-from-ajax-post#answer-23797348
		// jQuery mangles the binary data!	
		var xhr = new XMLHttpRequest();
		xhr.open('POST', "/convert", true);
		if (to.formatIsBinary())
			xhr.responseType = 'arraybuffer';
		xhr.onload = function() {
			if (!$scope.updateStatus(xhr)) {
				return;
			}
			if (to.formatIsBinary()) {
				var filename = "response." + to.fileExtension();
				var disposition = xhr.getResponseHeader('Content-Disposition');
				if (disposition && disposition.indexOf('attachment') !== -1) {
					var filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
					var matches = filenameRegex.exec(disposition);
					if (matches != null && matches[1])
						filename = matches[1].replace(/['"]/g, '');
				}
				var type = xhr.getResponseHeader('Content-Type');

				var blob = new Blob([ this.response ], {
					type : "application/" + to.format
				});
				to.response = this.response;
				if (typeof window.navigator.msSaveBlob !== 'undefined') {
					// IE workaround for "HTML7007: One or more blob URLs were revoked by closing the blob for which they were created. These URLs will no longer resolve as the data backing the URL has been freed."
					window.navigator.msSaveBlob(blob, filename);
				} else {
					var URL = window.URL || window.webkitURL;
					var downloadUrl = URL.createObjectURL(blob);

					if (filename) {
						// use HTML5 a[download] attribute to specify filename
						var a = document.createElement("a");
						// safari doesn't support this yet
						if (typeof a.download === 'undefined') {
							window.location = downloadUrl;
						} else {
							a.href = downloadUrl;
							a.download = filename;
							document.body.appendChild(a);
							a.click();
							// store resulting file, however input[file] UI is not updated correspondingly 
							var file = blobToFile(blob);
							to.data = file;
							$scope.$digest();
						}
					} else {
						window.location = downloadUrl;
					}

					setTimeout(function() {
						URL.revokeObjectURL(downloadUrl);
					}, 100); // cleanup
				}
			} else {
				var str = "";
				if (to.formatIsBinary()) {
					var arr = new Uint8Array(xhr.response);
					str = String.fromCharCode.apply(String, arr);
				} else {
					str = xhr.responseText;
				}

				to.text = str;
				$scope.$digest();

			}
		};
		 xhr.onreadystatechange = function(oEvent) {
			if (xhr.readyState === 4) {
				$scope.updateStatus(xhr);
				$scope.$digest();
			}
		};
		// add also application/json as second Accept to enable Json error messages!
		xhr.setRequestHeader('Accept', 'application/' + to.format + ", application/json");
		xhr.send(formData);
	};

});

app.controller('FhirData', function($scope) {
	
	$scope.formatIsBinary = function() {
		return $scope.isOnlyFiles() || ["bson", "avro", "cbor", "protobuf", "smile", "ion"].includes($scope.format);
	};
	
	$scope.clearInputs = function() {
		$scope.data = "";
		$scope.text = "";
	};
	
	$scope.fileExtension = function() {
		return $scope.format.replace('smile','sml').toLowerCase();
	};
	
});

function blobToFile(theBlob, fileName) {
	//A Blob() is almost a File() - it's just missing the two properties below which we will add
	theBlob.lastModifiedDate = new Date();
	theBlob.name = fileName;
	return theBlob;
}
