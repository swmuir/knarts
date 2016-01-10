package org.eclipse.mdht.uml.fhir.common.terminology;

public class ConceptDescriptor {

	String codeSystem;
	String conceptId;
	String defaultTerm;

	public String getCodeSystem() {
		return codeSystem;
	}

	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}

	public String getConceptId() {
		return conceptId;
	}

	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}

	public String getDefaultTerm() {
		return defaultTerm;
	}

	public void setDefaultTerm(String defaultTerm) {
		this.defaultTerm = defaultTerm;
	}

}
