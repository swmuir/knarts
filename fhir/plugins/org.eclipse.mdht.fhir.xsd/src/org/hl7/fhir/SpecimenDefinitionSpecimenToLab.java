/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Specimen To Lab</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getPreference <em>Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerMaterial <em>Container Material</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerCap <em>Container Cap</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerDescription <em>Container Description</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerCapacity <em>Container Capacity</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerMinimumVolume <em>Container Minimum Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerAdditive <em>Container Additive</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerPreparation <em>Container Preparation</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getRejectionCriterion <em>Rejection Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getHandling <em>Handling</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab()
 * @model extendedMetaData="name='SpecimenDefinition.SpecimenToLab' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinitionSpecimenToLab extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary of secondary specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' containment reference.
	 * @see #setIsDerived(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_IsDerived()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='isDerived' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getIsDerived <em>Is Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' containment reference.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of specimen conditioned for testing expected by lab.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preference for this type of conditioned specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preference</em>' containment reference.
	 * @see #setPreference(SpecimenContainedPreference)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_Preference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preference' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenContainedPreference getPreference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getPreference <em>Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference</em>' containment reference.
	 * @see #getPreference()
	 * @generated
	 */
	void setPreference(SpecimenContainedPreference value);

	/**
	 * Returns the value of the '<em><b>Container Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of material of the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Material</em>' containment reference.
	 * @see #setContainerMaterial(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContainerMaterial();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerMaterial <em>Container Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Material</em>' containment reference.
	 * @see #getContainerMaterial()
	 * @generated
	 */
	void setContainerMaterial(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of container used to contain this kind of specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Type</em>' containment reference.
	 * @see #setContainerType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContainerType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerType <em>Container Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' containment reference.
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Container Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color of container cap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Cap</em>' containment reference.
	 * @see #setContainerCap(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContainerCap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerCap <em>Container Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Cap</em>' containment reference.
	 * @see #getContainerCap()
	 * @generated
	 */
	void setContainerCap(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Container Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The textual description of the kind of container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Description</em>' containment reference.
	 * @see #setContainerDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getContainerDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerDescription <em>Container Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Description</em>' containment reference.
	 * @see #getContainerDescription()
	 * @generated
	 */
	void setContainerDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Container Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capacity (volume or other measure) of this kind of container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Capacity</em>' containment reference.
	 * @see #setContainerCapacity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerCapacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getContainerCapacity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerCapacity <em>Container Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Capacity</em>' containment reference.
	 * @see #getContainerCapacity()
	 * @generated
	 */
	void setContainerCapacity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Container Minimum Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum volume to be conditioned in the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Minimum Volume</em>' containment reference.
	 * @see #setContainerMinimumVolume(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerMinimumVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerMinimumVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getContainerMinimumVolume();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerMinimumVolume <em>Container Minimum Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Minimum Volume</em>' containment reference.
	 * @see #getContainerMinimumVolume()
	 * @generated
	 */
	void setContainerMinimumVolume(Quantity value);

	/**
	 * Returns the value of the '<em><b>Container Additive</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenDefinitionContainerAdditive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Additive</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerAdditive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerAdditive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenDefinitionContainerAdditive> getContainerAdditive();

	/**
	 * Returns the value of the '<em><b>Container Preparation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special processing that should be applied to the container for this kind of specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Preparation</em>' containment reference.
	 * @see #setContainerPreparation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_ContainerPreparation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerPreparation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getContainerPreparation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getContainerPreparation <em>Container Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Preparation</em>' containment reference.
	 * @see #getContainerPreparation()
	 * @generated
	 */
	void setContainerPreparation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements for delivery and special handling of this kind of conditioned specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Retention Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The usual time that a specimen of this kind is retained after the ordered tests are completed, for the purpose of additional testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retention Time</em>' containment reference.
	 * @see #setRetentionTime(Duration)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_RetentionTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retentionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRetentionTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionSpecimenToLab#getRetentionTime <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Time</em>' containment reference.
	 * @see #getRetentionTime()
	 * @generated
	 */
	void setRetentionTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Rejection Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criterion for rejection of the specimen in its container by the laboratory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rejection Criterion</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_RejectionCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rejectionCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRejectionCriterion();

	/**
	 * Returns the value of the '<em><b>Handling</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenDefinitionHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of instructions for conservation/transport of the specimen at a defined temperature interval, prior the testing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionSpecimenToLab_Handling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenDefinitionHandling> getHandling();

} // SpecimenDefinitionSpecimenToLab
