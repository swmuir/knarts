/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The MaxValue operator returns the maximum representable value for the given type.
 * 			
 * The MaxValue operator is defined for the Integer, Decimal, DateTime, and Time types.
 * 
 * For Integer, MaxValue returns the maximum signed 32-bit integer, 2^31 - 1.
 * 
 * For Decimal, MaxValue returns the maximum representable Decimal value, (10^37 - 1) / 10^8 (9999999999999999999999999999.99999999).
 * 
 * For DateTime, MaxValue returns the maximum representable DateTime value, DateTime(9999, 12, 31, 23, 59, 59, 999).
 * 
 * For Time, MaxValue returns the maximum representable Time value, Time(23, 59, 59, 999).
 * 
 * For any other type, attempting to invoke MaxValue results in an error.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.MaxValue#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getMaxValue()
 * @model extendedMetaData="name='MaxValue' kind='elementOnly'"
 * @generated
 */
public interface MaxValue extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getMaxValue_ValueType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='valueType'"
	 * @generated
	 */
	QName getValueType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.MaxValue#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(QName value);

} // MaxValue
