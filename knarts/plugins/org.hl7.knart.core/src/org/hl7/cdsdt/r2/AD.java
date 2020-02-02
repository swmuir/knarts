/**
 */
package org.hl7.cdsdt.r2;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mailing and home or office addresses. 
 * 
 * AD is primarily used to communicate data that will allow printing mail labels, or that will allow a person to physically visit that address. The postal address datatype is not supposed to be a container for additional information that might be useful for finding geographic locations (e.g., GPS coordinates) or for performing epidemiological studies. Such additional information should be captured by other, more appropriate data structures.
 * 
 * Addresses are essentially sequences of address parts, but add a "use" code and a valid time range for information about if and when the address can be used for a given purpose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.AD#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.AD#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getAD()
 * @model extendedMetaData="name='AD' kind='elementOnly'"
 * @generated
 */
public interface AD extends ANY {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.ADXP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence of address parts, such as street or post office Box, city, postal code, country, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.hl7.cdsdt.r2.R2Package#getAD_Part()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ADXP> getPart();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of codes advising a system or user which address in a set of like addresses to select for a given purpose. 
	 * An address without specific use code might be a default address useful for any purpose, but an address with a specific use code would be preferred for that respective purpose.
	 * If populated, the values contained in this attribute SHALL be taken from the HL7 PostalAddressUse code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(List)
	 * @see org.hl7.cdsdt.r2.R2Package#getAD_Use()
	 * @model dataType="org.hl7.cdsdt.r2.SetPostalAddressUse" many="false"
	 *        extendedMetaData="kind='attribute' name='use'"
	 * @generated
	 */
	List<PostalAddressUse> getUse();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.AD#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(List<PostalAddressUse> value);

} // AD
