/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The As operator allows the result of an expression to be cast as a given target type. This allows expressions to be written that are statically typed against the expected run-time type of the argument. If the argument is not of the specified type, and the strict attribute is false (the default), the result is null. If the argument is not of the specified type and the strict attribute is true, an exception is thrown.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.As#getAsTypeSpecifier <em>As Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.As#getAsType <em>As Type</em>}</li>
 *   <li>{@link org.hl7.elm.r1.As#isStrict <em>Strict</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getAs()
 * @model extendedMetaData="name='As' kind='elementOnly'"
 * @generated
 */
public interface As extends UnaryExpression {
	/**
	 * Returns the value of the '<em><b>As Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Type Specifier</em>' containment reference.
	 * @see #setAsTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getAs_AsTypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asTypeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getAsTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.As#getAsTypeSpecifier <em>As Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Type Specifier</em>' containment reference.
	 * @see #getAsTypeSpecifier()
	 * @generated
	 */
	void setAsTypeSpecifier(TypeSpecifier value);

	/**
	 * Returns the value of the '<em><b>As Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Type</em>' attribute.
	 * @see #setAsType(QName)
	 * @see org.hl7.elm.r1.R1Package#getAs_AsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='asType'"
	 * @generated
	 */
	QName getAsType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.As#getAsType <em>As Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Type</em>' attribute.
	 * @see #getAsType()
	 * @generated
	 */
	void setAsType(QName value);

	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #isSetStrict()
	 * @see #unsetStrict()
	 * @see #setStrict(boolean)
	 * @see org.hl7.elm.r1.R1Package#getAs_Strict()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='strict'"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.As#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isSetStrict()
	 * @see #unsetStrict()
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.As#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrict()
	 * @see #isStrict()
	 * @see #setStrict(boolean)
	 * @generated
	 */
	void unsetStrict();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.As#isStrict <em>Strict</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strict</em>' attribute is set.
	 * @see #unsetStrict()
	 * @see #isStrict()
	 * @see #setStrict(boolean)
	 * @generated
	 */
	boolean isSetStrict();

} // As
