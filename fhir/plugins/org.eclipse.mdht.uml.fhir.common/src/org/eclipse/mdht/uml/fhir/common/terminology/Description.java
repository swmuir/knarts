package org.eclipse.mdht.uml.fhir.common.terminology;

public class Description {

	String descriptionId;
	String conceptId;
	ConceptDescriptor type;
	String language;
	String term;

	public Description() {
	}

	public String getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(String descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getConceptId() {
		return conceptId;
	}

	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}

	public ConceptDescriptor getType() {
		return type;
	}

	public void setType(ConceptDescriptor type) {
		this.type = type;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String lang) {
		this.language = lang;
	}
}
