/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Clinicals Therapeutic Indication</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getComorbidity <em>Comorbidity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getUndesirableEffects <em>Undesirable Effects</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getOtherTherapy <em>Other Therapy</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication()
 * @model extendedMetaData="name='MedicinalProductClinicals.TherapeuticIndication' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductClinicalsTherapeuticIndication extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Disease Symptom Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The disease, symptom or procedure that is the indication for treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #setDiseaseSymptomProcedure(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_DiseaseSymptomProcedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseSymptomProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseSymptomProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Symptom Procedure</em>' containment reference.
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 */
	void setDiseaseSymptomProcedure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the disease or symptom for which the indication applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_DiseaseStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diseaseStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiseaseStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Status</em>' containment reference.
	 * @see #getDiseaseStatus()
	 * @generated
	 */
	void setDiseaseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comorbidity (concurrent condition) or co-infection as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_Comorbidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comorbidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getComorbidity();

	/**
	 * Returns the value of the '<em><b>Intended Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended effect, aim or strategy to be achieved by the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Effect</em>' containment reference.
	 * @see #setIntendedEffect(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_IntendedEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIntendedEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getIntendedEffect <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Effect</em>' containment reference.
	 * @see #getIntendedEffect()
	 * @generated
	 */
	void setIntendedEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing or duration information as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Undesirable Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsUndesirableEffects}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesirable Effects</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_UndesirableEffects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undesirableEffects' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsUndesirableEffects> getUndesirableEffects();

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the use of the medicinal product in relation to other therapies described as part of the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_OtherTherapy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherTherapy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsOtherTherapy> getOtherTherapy();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsPopulation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The population group to which this applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsTherapeuticIndication_Population()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='population' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsPopulation> getPopulation();

} // MedicinalProductClinicalsTherapeuticIndication
