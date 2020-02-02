/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A part with a type-tag signifying its role in the address. Typical parts that exist in about every address are street, house number, or post box, postal code, city, country but other roles may be defined regionally, nationally, or on an enterprise level (e.g. in military addresses). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.ADXP#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getADXP()
 * @model extendedMetaData="name='ADXP' kind='empty'"
 * @generated
 */
public interface ADXP extends XP {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.cdsdt.r2.AddressPartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether an address part names the street, city, country, postal code, post box, address line 1, etc.
	 * The value of this attribute SHALL be taken from the HL7 AddressPartType code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AddressPartType)
	 * @see org.hl7.cdsdt.r2.R2Package#getADXP_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	AddressPartType getType();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ADXP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(AddressPartType value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.ADXP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AddressPartType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.ADXP#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AddressPartType)
	 * @generated
	 */
	boolean isSetType();

} // ADXP
