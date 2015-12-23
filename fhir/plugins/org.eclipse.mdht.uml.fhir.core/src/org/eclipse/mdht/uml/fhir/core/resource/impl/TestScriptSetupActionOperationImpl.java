/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperationRequestHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getRequestHeaders <em>Request Header</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupActionOperationImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptSetupActionOperationImpl extends BackboneElementImpl implements TestScriptSetupActionOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Code resource;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String label;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected Code accept;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer destination;

	/**
	 * The cached value of the '{@link #getEncodeRequestUrl() <em>Encode Request Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean encodeRequestUrl;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String params;

	/**
	 * The cached value of the '{@link #getRequestHeaders() <em>Request Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptSetupActionOperationRequestHeader> requestHeaders;

	/**
	 * The cached value of the '{@link #getResponseId() <em>Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected Id responseId;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupActionOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getTestScriptSetupActionOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Code)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Code newResource) {
		Code oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String newLabel) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAccept() {
		if (accept != null && accept.eIsProxy()) {
			InternalEObject oldAccept = (InternalEObject)accept;
			accept = (Code)eResolveProxy(oldAccept);
			if (accept != oldAccept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT, oldAccept, accept));
			}
		}
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccept(Code newAccept) {
		Code oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT, oldAccept, accept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer newDestination) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getEncodeRequestUrl() {
		if (encodeRequestUrl != null && encodeRequestUrl.eIsProxy()) {
			InternalEObject oldEncodeRequestUrl = (InternalEObject)encodeRequestUrl;
			encodeRequestUrl = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldEncodeRequestUrl);
			if (encodeRequestUrl != oldEncodeRequestUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, encodeRequestUrl));
			}
		}
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetEncodeRequestUrl() {
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeRequestUrl(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newEncodeRequestUrl) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldEncodeRequestUrl = encodeRequestUrl;
		encodeRequestUrl = newEncodeRequestUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, encodeRequestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getParams() {
		if (params != null && params.eIsProxy()) {
			InternalEObject oldParams = (InternalEObject)params;
			params = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldParams);
			if (params != oldParams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS, oldParams, params));
			}
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(org.eclipse.mdht.uml.fhir.core.datatype.String newParams) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldParams = params;
		params = newParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS, oldParams, params));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptSetupActionOperationRequestHeader> getRequestHeaders() {
		if (requestHeaders == null) {
			requestHeaders = new EObjectContainmentEList<TestScriptSetupActionOperationRequestHeader>(TestScriptSetupActionOperationRequestHeader.class, this, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER);
		}
		return requestHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getResponseId() {
		if (responseId != null && responseId.eIsProxy()) {
			InternalEObject oldResponseId = (InternalEObject)responseId;
			responseId = (Id)eResolveProxy(oldResponseId);
			if (responseId != oldResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID, oldResponseId, responseId));
			}
		}
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetResponseId() {
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseId(Id newResponseId) {
		Id oldResponseId = responseId;
		responseId = newResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID, oldResponseId, responseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSourceId() {
		if (sourceId != null && sourceId.eIsProxy()) {
			InternalEObject oldSourceId = (InternalEObject)sourceId;
			sourceId = (Id)eResolveProxy(oldSourceId);
			if (sourceId != oldSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID, oldSourceId, sourceId));
			}
		}
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(Id newSourceId) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getTargetId() {
		if (targetId != null && targetId.eIsProxy()) {
			InternalEObject oldTargetId = (InternalEObject)targetId;
			targetId = (Id)eResolveProxy(oldTargetId);
			if (targetId != oldTargetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID, oldTargetId, targetId));
			}
		}
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(Id newTargetId) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(org.eclipse.mdht.uml.fhir.core.datatype.String newUrl) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return ((InternalEList<?>)getRequestHeaders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT:
				if (resolve) return getAccept();
				return basicGetAccept();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				if (resolve) return getEncodeRequestUrl();
				return basicGetEncodeRequestUrl();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS:
				if (resolve) return getParams();
				return basicGetParams();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return getRequestHeaders();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID:
				if (resolve) return getResponseId();
				return basicGetResponseId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID:
				if (resolve) return getSourceId();
				return basicGetSourceId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID:
				if (resolve) return getTargetId();
				return basicGetTargetId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS:
				setParams((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				getRequestHeaders().addAll((Collection<? extends TestScriptSetupActionOperationRequestHeader>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL:
				setUrl((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS:
				setParams((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL:
				setUrl((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TYPE:
				return type != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESOURCE:
				return resource != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__LABEL:
				return label != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ACCEPT:
				return accept != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				return contentType != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__DESTINATION:
				return destination != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				return encodeRequestUrl != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__PARAMS:
				return params != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return requestHeaders != null && !requestHeaders.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__RESPONSE_ID:
				return responseId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__SOURCE_ID:
				return sourceId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__TARGET_ID:
				return targetId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_ACTION_OPERATION__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupActionOperationImpl
