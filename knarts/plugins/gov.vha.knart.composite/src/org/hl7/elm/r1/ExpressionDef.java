/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ExpressionDef type defines an expression and an associated name that can be referenced by any expression in the artifact. The name must be unique within the artifact.
 * 			The context attribute specifies the scope of the execution and is used by the environment to determine when and how to evaluate the expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ExpressionDef#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ExpressionDef#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ExpressionDef#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ExpressionDef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getExpressionDef()
 * @model extendedMetaData="name='ExpressionDef' kind='elementOnly'"
 * @generated
 */
public interface ExpressionDef extends Element {
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
	 * @see org.hl7.elm.r1.R1Package#getExpressionDef_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ExpressionDef#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * The literals are from the enumeration {@link org.hl7.elm.r1.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @see org.hl7.elm.r1.R1Package#getExpressionDef_AccessLevel()
	 * @model default="Public" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accessLevel'"
	 * @generated
	 */
	AccessModifier getAccessLevel();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ExpressionDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessModifier value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.ExpressionDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ExpressionDef#getAccessLevel <em>Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Level</em>' attribute is set.
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	boolean isSetAccessLevel();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.hl7.elm.r1.R1Package#getExpressionDef_Context()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ExpressionDef#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.elm.r1.R1Package#getExpressionDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ExpressionDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ExpressionDef
