/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BL stands for the values of two-valued logic. A BL value can be either true or false.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.BL#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getBL()
 * @model extendedMetaData="name='BL' kind='empty'"
 * @generated
 */
public interface BL extends ANY {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the BL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(boolean)
	 * @see org.hl7.cdsdt.r2.R2Package#getBL_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.BL#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.BL#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.BL#isValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	boolean isSetValue();

} // BL
