/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The If operator evaluates a condition, and returns the then argument if the condition evaluates to true; otherwise the result of the else argument is returned. The static type of the then argument determines the result type of the conditional, and the else argument must be of that same type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.elm.r1.If#getThen <em>Then</em>}</li>
 *   <li>{@link org.hl7.elm.r1.If#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getIf()
 * @model extendedMetaData="name='If' kind='elementOnly'"
 * @generated
 */
public interface If extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.hl7.elm.r1.R1Package#getIf_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expression)
	 * @see org.hl7.elm.r1.R1Package#getIf_Then()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='then' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getThen();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.If#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expression value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Expression)
	 * @see org.hl7.elm.r1.R1Package#getIf_Else()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='else' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getElse();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Expression value);

} // If
