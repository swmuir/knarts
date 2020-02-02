/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>By Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ByExpression element specifies that the sort should be performed using the given expression and direction. This approach is used to specify the sort order as a calculated expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ByExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getByExpression()
 * @model extendedMetaData="name='ByExpression' kind='elementOnly'"
 * @generated
 */
public interface ByExpression extends SortByItem {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.hl7.elm.r1.R1Package#getByExpression_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ByExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ByExpression
