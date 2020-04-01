/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getUsageContext()
 * @model
 * @generated
 */
public interface UsageContext extends DataType {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getUsageContext_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getUsageContext_ValueCodeableConcept()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getUsageContext_ValueQuantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getUsageContext_ValueRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

} // UsageContext
