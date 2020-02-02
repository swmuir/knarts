/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Null operator returns a null, or missing information marker. To avoid the need to cast this result, the operator is allowed to return a typed null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Null#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getNull()
 * @model extendedMetaData="name='Null' kind='elementOnly'"
 * @generated
 */
public interface Null extends Expression {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(QName)
	 * @see org.hl7.elm.r1.R1Package#getNull_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='valueType'"
	 * @generated
	 */
	QName getValueType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Null#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(QName value);

} // Null
