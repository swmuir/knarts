/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fractional numbers. Typically used whenever quantities are measured, estimated, or computed from other real numbers. The typical representation is decimal, where the number of significant decimal digits is known as the precision.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.REAL#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getREAL()
 * @model extendedMetaData="name='REAL' kind='empty'"
 * @generated
 */
public interface REAL extends QTY {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the REAL. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see org.hl7.cdsdt.r2.R2Package#getREAL_Value()
	 * @model unsettable="true" dataType="org.hl7.cdsdt.r2.Decimal" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.REAL#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.REAL#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.REAL#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // REAL
