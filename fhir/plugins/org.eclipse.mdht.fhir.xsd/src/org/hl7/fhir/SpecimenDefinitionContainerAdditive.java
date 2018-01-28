/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Container Additive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of specimen with associated set of requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainerAdditive#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionContainerAdditive#getAdditiveReference <em>Additive Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainerAdditive()
 * @model extendedMetaData="name='SpecimenDefinition.ContainerAdditive' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinitionContainerAdditive extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Additive Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #setAdditiveCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainerAdditive_AdditiveCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditiveCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainerAdditive#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #getAdditiveCodeableConcept()
	 * @generated
	 */
	void setAdditiveCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Reference</em>' containment reference.
	 * @see #setAdditiveReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionContainerAdditive_AdditiveReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdditiveReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionContainerAdditive#getAdditiveReference <em>Additive Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Reference</em>' containment reference.
	 * @see #getAdditiveReference()
	 * @generated
	 */
	void setAdditiveReference(Reference value);

} // SpecimenDefinitionContainerAdditive
