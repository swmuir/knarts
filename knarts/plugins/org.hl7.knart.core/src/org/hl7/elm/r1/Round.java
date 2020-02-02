/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Round operator returns the nearest integer to its argument. The semantics of round are defined as a traditional round, meaning that a decimal value of 0.5 or higher will round to 1.
 * 
 * If the argument is null, the result is null.
 * 
 * Precision determines the decimal place at which the rounding will occur. If precision is not specified or null, 0 is assumed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Round#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Round#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getRound()
 * @model extendedMetaData="name='Round' kind='elementOnly'"
 * @generated
 */
public interface Round extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Expression)
	 * @see org.hl7.elm.r1.R1Package#getRound_Operand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getOperand();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Round#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference.
	 * @see #setPrecision(Expression)
	 * @see org.hl7.elm.r1.R1Package#getRound_Precision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precision' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Round#getPrecision <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' containment reference.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Expression value);

} // Round
