/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PositionOf operator returns the 1-based index of the given pattern in the given string.
 * 			
 * If the pattern is not found, the result is 0.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.PositionOf#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.hl7.elm.r1.PositionOf#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getPositionOf()
 * @model extendedMetaData="name='PositionOf' kind='elementOnly'"
 * @generated
 */
public interface PositionOf extends Expression {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Expression)
	 * @see org.hl7.elm.r1.R1Package#getPositionOf_Pattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getPattern();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.PositionOf#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Expression value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(Expression)
	 * @see org.hl7.elm.r1.R1Package#getPositionOf_String()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getString();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.PositionOf#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(Expression value);

} // PositionOf
