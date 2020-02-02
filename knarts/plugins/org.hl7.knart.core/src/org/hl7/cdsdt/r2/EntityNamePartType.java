/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Name Part Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates whether the name part is a given name, family name, prefix, suffix, etc. 
 * 
 * CodeSystem "EntityNamePartTypeR2", OID: 2.16.840.1.113883.5.1122, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getEntityNamePartType()
 * @model extendedMetaData="name='EntityNamePartType'"
 * @generated
 */
public enum EntityNamePartType implements Enumerator {
	/**
	 * The '<em><b>FAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAM_VALUE
	 * @generated
	 * @ordered
	 */
	FAM(0, "FAM", "FAM"),

	/**
	 * The '<em><b>GIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIV_VALUE
	 * @generated
	 * @ordered
	 */
	GIV(1, "GIV", "GIV"),

	/**
	 * The '<em><b>TITLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(2, "TITLE", "TITLE"),

	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(3, "DEL", "DEL");

	/**
	 * The '<em><b>FAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Family : Family name, this is the name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father
	 * <!-- end-model-doc -->
	 * @see #FAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAM_VALUE = 0;

	/**
	 * The '<em><b>GIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given: Given name.
	 * Note: don't call it "first name" since this given names do not always come first
	 * <!-- end-model-doc -->
	 * @see #GIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIV_VALUE = 1;

	/**
	 * The '<em><b>TITLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title : Part of the name that is acquired as a title due to academic, legal, employment or nobility status etc.
	 * Note: Title name parts include name parts that come after the name such as qualifications
	 * <!-- end-model-doc -->
	 * @see #TITLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 2;

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delimiter : A delimiter has no meaning other than being literally printed in this name representation. A delimiter has no implicit leading and trailing white space
	 * <!-- end-model-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Entity Name Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityNamePartType[] VALUES_ARRAY =
		new EntityNamePartType[] {
			FAM,
			GIV,
			TITLE,
			DEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Name Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityNamePartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Name Part Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartType get(int value) {
		switch (value) {
			case FAM_VALUE: return FAM;
			case GIV_VALUE: return GIV;
			case TITLE_VALUE: return TITLE;
			case DEL_VALUE: return DEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EntityNamePartType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EntityNamePartType
