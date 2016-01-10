package org.eclipse.mdht.uml.fhir.common.terminology;

public class CodeSystem {

	private String name;
	private String uri;
	private String version;
	private Boolean caseSensitive;
	
	private String rootConceptCode;
	private String allConceptsValueSetURI;
	
	public CodeSystem(String name, String uri, String rootSystemCode, String allConceptsValueSetURI) {
		this.name = name;
		this.uri = uri;
		this.rootConceptCode = rootSystemCode;
		this.allConceptsValueSetURI = allConceptsValueSetURI;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Boolean getCaseSensitive() {
		return caseSensitive;
	}
	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	public String getRootConceptCode() {
		return rootConceptCode;
	}
	public void setRootConceptCode(String rootConceptCode) {
		this.rootConceptCode = rootConceptCode;
	}
	public String getAllConceptsValueSetURI() {
		return allConceptsValueSetURI;
	}
	public void setAllConceptsValueSetURI(String allConceptsValueSetURI) {
		this.allConceptsValueSetURI = allConceptsValueSetURI;
	}
	
}
