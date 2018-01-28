/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getWhoIdentifier <em>Who Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfIdentifier <em>On Behalf Of Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfReference <em>On Behalf Of Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent()
 * @model extendedMetaData="name='Provenance.Agent' kind='elementOnly'"
 * @generated
 */
public interface ProvenanceAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participation the agent had with respect to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRole();

	/**
	 * Returns the value of the '<em><b>Who Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Identifier</em>' containment reference.
	 * @see #setWhoIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_WhoIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getWhoIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getWhoIdentifier <em>Who Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Identifier</em>' containment reference.
	 * @see #getWhoIdentifier()
	 * @generated
	 */
	void setWhoIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Who Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Reference</em>' containment reference.
	 * @see #setWhoReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_WhoReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhoReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getWhoReference <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Reference</em>' containment reference.
	 * @see #getWhoReference()
	 * @generated
	 */
	void setWhoReference(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of Identifier</em>' containment reference.
	 * @see #setOnBehalfOfIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_OnBehalfOfIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOfIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getOnBehalfOfIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfIdentifier <em>On Behalf Of Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of Identifier</em>' containment reference.
	 * @see #getOnBehalfOfIdentifier()
	 * @generated
	 */
	void setOnBehalfOfIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of Reference</em>' containment reference.
	 * @see #setOnBehalfOfReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_OnBehalfOfReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOfReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOfReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfReference <em>On Behalf Of Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of Reference</em>' containment reference.
	 * @see #getOnBehalfOfReference()
	 * @generated
	 */
	void setOnBehalfOfReference(Reference value);

} // ProvenanceAgent
