/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Clinicals Interactions</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getInteractant <em>Interactant</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions()
 * @model extendedMetaData="name='MedicinalProductClinicals.Interactions' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductClinicalsInteractions extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Interactant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific medication, food or laboratory test that interacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions_Interactant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getInteractant();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effect of the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions_Effect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEffect();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Incidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The incidence of the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incidence</em>' containment reference.
	 * @see #setIncidence(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions_Incidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incidence' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getIncidence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getIncidence <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence</em>' containment reference.
	 * @see #getIncidence()
	 * @generated
	 */
	void setIncidence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions for managing the interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Management</em>' containment reference.
	 * @see #setManagement(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicalsInteractions_Management()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='management' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getManagement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductClinicalsInteractions#getManagement <em>Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management</em>' containment reference.
	 * @see #getManagement()
	 * @generated
	 */
	void setManagement(CodeableConcept value);

} // MedicinalProductClinicalsInteractions
