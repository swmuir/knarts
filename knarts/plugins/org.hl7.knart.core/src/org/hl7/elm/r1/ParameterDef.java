/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ParameterDef type defines a parameter that can be referenced by name anywhere within an expression. Parameters are defined at the artifact level, and may be provided as part of the payload for an evaluation request. If no parameter value is provided, the default element is used to provide the value for the parameter. If no parameter or default is provided, the parameter is defined to be null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ParameterDef#getDefault <em>Default</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ParameterDef#getParameterTypeSpecifier <em>Parameter Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ParameterDef#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ParameterDef#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ParameterDef#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getParameterDef()
 * @model extendedMetaData="name='ParameterDef' kind='elementOnly'"
 * @generated
 */
public interface ParameterDef extends Element {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Expression)
	 * @see org.hl7.elm.r1.R1Package#getParameterDef_Default()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefault();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterDef#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameter Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type Specifier</em>' containment reference.
	 * @see #setParameterTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getParameterDef_ParameterTypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterTypeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getParameterTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterDef#getParameterTypeSpecifier <em>Parameter Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type Specifier</em>' containment reference.
	 * @see #getParameterTypeSpecifier()
	 * @generated
	 */
	void setParameterTypeSpecifier(TypeSpecifier value);

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
	 * @see org.hl7.elm.r1.R1Package#getParameterDef_AccessLevel()
	 * @model default="Public" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accessLevel'"
	 * @generated
	 */
	AccessModifier getAccessLevel();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterDef#getAccessLevel <em>Access Level</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.elm.r1.ParameterDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ParameterDef#getAccessLevel <em>Access Level</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.elm.r1.R1Package#getParameterDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(QName)
	 * @see org.hl7.elm.r1.R1Package#getParameterDef_ParameterType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='parameterType'"
	 * @generated
	 */
	QName getParameterType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterDef#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(QName value);

} // ParameterDef
