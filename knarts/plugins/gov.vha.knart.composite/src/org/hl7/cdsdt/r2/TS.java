/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A quantity specifying a point on the axis of natural time. A point in time is most often represented as a calendar expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.TS#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getTS()
 * @model extendedMetaData="name='TS' kind='empty'"
 * @generated
 */
public interface TS extends QTY {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the TS. value is a string with the format "YYYY[MM[DD[HH[MM[SS[.U[U[U[U]]]]]]]]][+|-ZZzz]" that conforms to the constrained ISO 8601 defined in ISO 8824 (ASN.1) under clause 32 (generalized time). The format should be used to the degree of precision that is appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getTS_Value()
	 * @model dataType="org.hl7.cdsdt.r2.TimeStamp" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.TS#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TS
