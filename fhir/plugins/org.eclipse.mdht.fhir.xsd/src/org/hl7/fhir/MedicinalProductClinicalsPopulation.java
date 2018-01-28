/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Clinicals Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The clinical particulars - indications, contraindications etc of a medicinal product, including for regulatory purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getAgeRange <em>Age Range</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getAgeCodeableConcept <em>Age Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getGender <em>Gender</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getRace <em>Race</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getPhysiologicalCondition <em>Physiological Condition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation()
 * @model extendedMetaData="name='MedicinalProductClinicals.Population' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductClinicalsPopulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Age Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Range</em>' containment reference.
	 * @see #setAgeRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation_AgeRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAgeRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getAgeRange <em>Age Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Range</em>' containment reference.
	 * @see #getAgeRange()
	 * @generated
	 */
	void setAgeRange(Range value);

	/**
	 * Returns the value of the '<em><b>Age Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Codeable Concept</em>' containment reference.
	 * @see #setAgeCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation_AgeCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ageCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAgeCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getAgeCodeableConcept <em>Age Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Codeable Concept</em>' containment reference.
	 * @see #getAgeCodeableConcept()
	 * @generated
	 */
	void setAgeCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gender of the specific population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation_Gender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Race</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Race of the specific population.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Race</em>' containment reference.
	 * @see #setRace(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation_Race()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='race' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRace();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getRace <em>Race</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race</em>' containment reference.
	 * @see #getRace()
	 * @generated
	 */
	void setRace(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Physiological Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The existing physiological conditions of the specific population to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #setPhysiologicalCondition(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsPopulation_PhysiologicalCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physiologicalCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPhysiologicalCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsPopulation#getPhysiologicalCondition <em>Physiological Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physiological Condition</em>' containment reference.
	 * @see #getPhysiologicalCondition()
	 * @generated
	 */
	void setPhysiologicalCondition(CodeableConcept value);

} // MedicinalProductClinicalsPopulation
