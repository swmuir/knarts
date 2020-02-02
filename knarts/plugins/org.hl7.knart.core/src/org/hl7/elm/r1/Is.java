/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Is operator allows the type of a result to be tested. The language must support the ability to test against any type. If the run-time type of the argument is of the type being tested, the result of the operator is true; otherwise, the result is false.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Is#getIsTypeSpecifier <em>Is Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Is#getIsType <em>Is Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getIs()
 * @model extendedMetaData="name='Is' kind='elementOnly'"
 * @generated
 */
public interface Is extends UnaryExpression {
	/**
	 * Returns the value of the '<em><b>Is Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Type Specifier</em>' containment reference.
	 * @see #setIsTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getIs_IsTypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isTypeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getIsTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Is#getIsTypeSpecifier <em>Is Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type Specifier</em>' containment reference.
	 * @see #getIsTypeSpecifier()
	 * @generated
	 */
	void setIsTypeSpecifier(TypeSpecifier value);

	/**
	 * Returns the value of the '<em><b>Is Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Type</em>' attribute.
	 * @see #setIsType(QName)
	 * @see org.hl7.elm.r1.R1Package#getIs_IsType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='isType'"
	 * @generated
	 */
	QName getIsType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Is#getIsType <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type</em>' attribute.
	 * @see #getIsType()
	 * @generated
	 */
	void setIsType(QName value);

} // Is
