/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DefineClause element allows any number of expression definitions to be introduced within a query context. Defined expressions can be referenced by name within the query context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.DefineClause#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.DefineClause#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getDefineClause()
 * @model extendedMetaData="name='DefineClause' kind='elementOnly'"
 * @generated
 */
public interface DefineClause extends Element {
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
	 * @see org.hl7.elm.r1.R1Package#getDefineClause_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.DefineClause#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.hl7.elm.r1.R1Package#getDefineClause_Identifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='identifier'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.DefineClause#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // DefineClause
