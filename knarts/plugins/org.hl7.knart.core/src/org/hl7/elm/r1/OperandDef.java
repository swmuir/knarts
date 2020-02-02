/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OperandDef type defines an operand to a function that can be referenced by name anywhere within the body of a function definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.OperandDef#getOperandTypeSpecifier <em>Operand Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.OperandDef#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.OperandDef#getOperandType <em>Operand Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getOperandDef()
 * @model extendedMetaData="name='OperandDef' kind='elementOnly'"
 * @generated
 */
public interface OperandDef extends Element {
	/**
	 * Returns the value of the '<em><b>Operand Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Type Specifier</em>' containment reference.
	 * @see #setOperandTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getOperandDef_OperandTypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operandTypeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getOperandTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.OperandDef#getOperandTypeSpecifier <em>Operand Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Type Specifier</em>' containment reference.
	 * @see #getOperandTypeSpecifier()
	 * @generated
	 */
	void setOperandTypeSpecifier(TypeSpecifier value);

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
	 * @see org.hl7.elm.r1.R1Package#getOperandDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.OperandDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operand Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Type</em>' attribute.
	 * @see #setOperandType(QName)
	 * @see org.hl7.elm.r1.R1Package#getOperandDef_OperandType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='operandType'"
	 * @generated
	 */
	QName getOperandType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.OperandDef#getOperandType <em>Operand Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Type</em>' attribute.
	 * @see #getOperandType()
	 * @generated
	 */
	void setOperandType(QName value);

} // OperandDef
