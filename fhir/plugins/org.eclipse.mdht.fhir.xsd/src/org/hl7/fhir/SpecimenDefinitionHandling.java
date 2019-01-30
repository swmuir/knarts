/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Handling</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getConditionSet <em>Condition Set</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getTempRange <em>Temp Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getLightExposure <em>Light Exposure</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionHandling#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling()
 * @model extendedMetaData="name='SpecimenDefinition.Handling' kind='elementOnly'"
 * @generated
 */
public interface SpecimenDefinitionHandling extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Condition Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code representing the set of handling instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Set</em>' containment reference.
	 * @see #setConditionSet(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_ConditionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConditionSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getConditionSet <em>Condition Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Set</em>' containment reference.
	 * @see #getConditionSet()
	 * @generated
	 */
	void setConditionSet(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Temp Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The temperature interval for this set of handling instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Range</em>' containment reference.
	 * @see #setTempRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_TempRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tempRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getTempRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getTempRange <em>Temp Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Range</em>' containment reference.
	 * @see #getTempRange()
	 * @generated
	 */
	void setTempRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum time interval of conservation of the specimen with these conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Duration</em>' containment reference.
	 * @see #setMaxDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_MaxDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getMaxDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getMaxDuration <em>Max Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' containment reference.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Light Exposure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual instructions regarding the light exposure of the specimen prior testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light Exposure</em>' containment reference.
	 * @see #setLightExposure(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_LightExposure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lightExposure' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLightExposure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getLightExposure <em>Light Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Exposure</em>' containment reference.
	 * @see #getLightExposure()
	 * @generated
	 */
	void setLightExposure(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional textual instructions for the conservation or transport of the specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenDefinitionHandling_Instruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInstruction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionHandling#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(org.hl7.fhir.String value);

} // SpecimenDefinitionHandling
