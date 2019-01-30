/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Manifest Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentManifestAgent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifestAgent#getWho <em>Who</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentManifestAgent()
 * @model extendedMetaData="name='DocumentManifest.Agent' kind='elementOnly'"
 * @generated
 */
public interface DocumentManifestAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the participation type the agent played.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifestAgent_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifestAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is the agent. Such as the author of the manifest, and adding  documents to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifestAgent_Who()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='who' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifestAgent#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

} // DocumentManifestAgent
