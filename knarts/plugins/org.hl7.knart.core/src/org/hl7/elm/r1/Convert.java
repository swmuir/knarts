/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Convert operator converts a value to a specific type. The result of the operator is the value of the argument converted to the target type, if possible. Note that use of this operator may result in a run-time exception being thrown if there is no valid conversion from the actual value to the target type.
 * 
 * This operator supports conversion between String and each of Boolean, Integer, Decimal, Quantity, DateTime, and Time, as well as conversion from Integer to Decimal and from Code to Concept.
 * 
 * Conversion between String and DateTime/Time is performed using the ISO-8601 standard format: YYYY-MM-DDThh:mm:ss(+|-)hh:mm.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Convert#getToTypeSpecifier <em>To Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Convert#getToType <em>To Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getConvert()
 * @model extendedMetaData="name='Convert' kind='elementOnly'"
 * @generated
 */
public interface Convert extends UnaryExpression {
	/**
	 * Returns the value of the '<em><b>To Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Type Specifier</em>' containment reference.
	 * @see #setToTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getConvert_ToTypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='toTypeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getToTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Convert#getToTypeSpecifier <em>To Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Type Specifier</em>' containment reference.
	 * @see #getToTypeSpecifier()
	 * @generated
	 */
	void setToTypeSpecifier(TypeSpecifier value);

	/**
	 * Returns the value of the '<em><b>To Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Type</em>' attribute.
	 * @see #setToType(QName)
	 * @see org.hl7.elm.r1.R1Package#getConvert_ToType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='toType'"
	 * @generated
	 */
	QName getToType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Convert#getToType <em>To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Type</em>' attribute.
	 * @see #getToType()
	 * @generated
	 */
	void setToType(QName value);

} // Convert
