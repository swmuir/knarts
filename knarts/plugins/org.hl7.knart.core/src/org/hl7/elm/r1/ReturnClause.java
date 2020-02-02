/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ReturnClause element defines the shape of the result set of the query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ReturnClause#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ReturnClause#isDistinct <em>Distinct</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getReturnClause()
 * @model extendedMetaData="name='ReturnClause' kind='elementOnly'"
 * @generated
 */
public interface ReturnClause extends Element {
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
	 * @see org.hl7.elm.r1.R1Package#getReturnClause_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ReturnClause#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distinct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #isSetDistinct()
	 * @see #unsetDistinct()
	 * @see #setDistinct(boolean)
	 * @see org.hl7.elm.r1.R1Package#getReturnClause_Distinct()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='distinct'"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ReturnClause#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isSetDistinct()
	 * @see #unsetDistinct()
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.ReturnClause#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistinct()
	 * @see #isDistinct()
	 * @see #setDistinct(boolean)
	 * @generated
	 */
	void unsetDistinct();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ReturnClause#isDistinct <em>Distinct</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distinct</em>' attribute is set.
	 * @see #unsetDistinct()
	 * @see #isDistinct()
	 * @see #setDistinct(boolean)
	 * @generated
	 */
	boolean isSetDistinct();

} // ReturnClause
