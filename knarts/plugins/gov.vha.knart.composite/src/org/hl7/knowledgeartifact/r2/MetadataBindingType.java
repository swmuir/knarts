/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metadata Binding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines how metadata is bound between composite entities
 * 			
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadataBindingType()
 * @model extendedMetaData="name='MetadataBindingType'"
 * @generated
 */
public enum MetadataBindingType implements Enumerator {
	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(0, "Replaces", "Replaces"),

	/**
	 * The '<em><b>Supplements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLEMENTS(1, "Supplements", "Supplements"),

	/**
	 * The '<em><b>Restates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTATES_VALUE
	 * @generated
	 * @ordered
	 */
	RESTATES(2, "Restates", "Restates");

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata is a full replacement, prior metadata is discarded
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="Replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 0;

	/**
	 * The '<em><b>Supplements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata is a supplement and is intended to extend the existing metadata
	 * <!-- end-model-doc -->
	 * @see #SUPPLEMENTS
	 * @model name="Supplements"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLEMENTS_VALUE = 1;

	/**
	 * The '<em><b>Restates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata is a restatement of the base metadata and may be a subset. A mismatch between the prior metadata and the restatement can be considered an error by validators
	 * <!-- end-model-doc -->
	 * @see #RESTATES
	 * @model name="Restates"
	 * @generated
	 * @ordered
	 */
	public static final int RESTATES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Metadata Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MetadataBindingType[] VALUES_ARRAY =
		new MetadataBindingType[] {
			REPLACES,
			SUPPLEMENTS,
			RESTATES,
		};

	/**
	 * A public read-only list of all the '<em><b>Metadata Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MetadataBindingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metadata Binding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetadataBindingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetadataBindingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metadata Binding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetadataBindingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetadataBindingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metadata Binding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetadataBindingType get(int value) {
		switch (value) {
			case REPLACES_VALUE: return REPLACES;
			case SUPPLEMENTS_VALUE: return SUPPLEMENTS;
			case RESTATES_VALUE: return RESTATES;
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
	private MetadataBindingType(int value, String name, String literal) {
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
	
} //MetadataBindingType
