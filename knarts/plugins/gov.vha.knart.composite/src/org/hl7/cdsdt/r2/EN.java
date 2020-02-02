/**
 */
package org.hl7.cdsdt.r2;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A name for a person, organization, place or thing. 
 * 
 * Examples:   Jim Bob Walton, Jr., Health Level Seven, Inc., Lake Tahoe, etc. An entity name may be as simple as a character string or may consist of several entity name parts, such as, Jim, Bob, Walton, and Jr., Health Level Seven, and Inc.
 * 
 * Entity names are essentially sequences of entity name parts, but add a "use" code.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.EN#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.EN#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getEN()
 * @model extendedMetaData="name='EN' kind='elementOnly'"
 * @generated
 */
public interface EN extends ANY {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.ENXP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence of name parts, such as given name or family name, prefix, suffix, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.hl7.cdsdt.r2.R2Package#getEN_Part()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ENXP> getPart();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of codes advising a system or user which name in a set of names to select for a given purpose. 
	 * A name without specific use code might be a default name useful for any purpose, but a name with a specific use code would be preferred for that respective purpose. Names SHOULD not be collected without at least one use code, but names MAY exist without use code, particularly for legacy data.
	 * If populated, the values contained in this attribute SHALL be taken from the HL7 EntityNameUse2 code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(List)
	 * @see org.hl7.cdsdt.r2.R2Package#getEN_Use()
	 * @model dataType="org.hl7.cdsdt.r2.SetEntityNameUse" many="false"
	 *        extendedMetaData="kind='attribute' name='use'"
	 * @generated
	 */
	List<EntityNameUse> getUse();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.EN#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(List<EntityNameUse> value);

} // EN
