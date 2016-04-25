/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationContent#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationContent#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationContent#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationContent()
 * @model extendedMetaData="name='Medication.Content' kind='elementOnly'"
 * @generated
 */
public interface MedicationContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationContent_ItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationContent#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationContent_ItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationContent#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the product that is in the package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicationContent_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationContent#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SimpleQuantity value);

} // MedicationContent
