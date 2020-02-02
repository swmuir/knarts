/**
 */
package org.hl7.cdsdt.r2;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A part with a type code signifying the role of the part in the whole entity name, and qualifier codes for more detail about the name part type. (Typical name parts for person names are given names, and family names, titles, etc.). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.ENXP#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ENXP#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getENXP()
 * @model extendedMetaData="name='ENXP' kind='empty'"
 * @generated
 */
public interface ENXP extends XP {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier is a set of codes each of which specifies a certain subcategory of the name part in addition to the main name part type.
	 * For example, a given name may be flagged as a nickname (CL), a family name may be a name acquired by marriage (SP) or a name from birth (BR).
	 * If populated, the values contained in this attribute SHALL be taken from the HL7 EntityNamePartQualifier2 code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(List)
	 * @see org.hl7.cdsdt.r2.R2Package#getENXP_Qualifier()
	 * @model dataType="org.hl7.cdsdt.r2.SetEntityNamePartQualifier" many="false"
	 *        extendedMetaData="kind='attribute' name='qualifier'"
	 * @generated
	 */
	List<EntityNamePartQualifier> getQualifier();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ENXP#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(List<EntityNamePartQualifier> value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.cdsdt.r2.EntityNamePartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the name part is a given name, family name, prefix, suffix, etc. 
	 * The value of this attribute SHALL be taken from the HL7 EntityNamePartType2 code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(EntityNamePartType)
	 * @see org.hl7.cdsdt.r2.R2Package#getENXP_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	EntityNamePartType getType();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ENXP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(EntityNamePartType value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.ENXP#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(EntityNamePartType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.ENXP#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(EntityNamePartType)
	 * @generated
	 */
	boolean isSetType();

} // ENXP
