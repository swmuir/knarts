/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Amount</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmount#getAmountx <em>Amountx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmount#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmount#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmount#getReferenceRange <em>Reference Range</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmount()
 * @model
 * @generated
 */
public interface SubstanceAmount extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amountx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amountx</em>' containment reference.
	 * @see #setAmountx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmount_Amountx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='amount[x]'"
	 * @generated
	 */
	DataType getAmountx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountx <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountx</em>' containment reference.
	 * @see #getAmountx()
	 * @generated
	 */
	void setAmountx(DataType value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmount_AmountType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Text</em>' containment reference.
	 * @see #setAmountText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmount_AmountText()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAmountText();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountText <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Text</em>' containment reference.
	 * @see #getAmountText()
	 * @generated
	 */
	void setAmountText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Range</em>' containment reference.
	 * @see #setReferenceRange(SubstanceAmountElement1)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmount_ReferenceRange()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceAmountElement1 getReferenceRange();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmount#getReferenceRange <em>Reference Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Range</em>' containment reference.
	 * @see #getReferenceRange()
	 * @generated
	 */
	void setReferenceRange(SubstanceAmountElement1 value);

} // SubstanceAmount
