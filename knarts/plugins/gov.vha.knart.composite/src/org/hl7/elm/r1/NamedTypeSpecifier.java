/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NamedTypeSpecifier defines a type identified by a name, such as Integer, String, Patient, or Encounter.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.NamedTypeSpecifier#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getNamedTypeSpecifier()
 * @model extendedMetaData="name='NamedTypeSpecifier' kind='elementOnly'"
 * @generated
 */
public interface NamedTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see org.hl7.elm.r1.R1Package#getNamedTypeSpecifier_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.NamedTypeSpecifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

} // NamedTypeSpecifier
