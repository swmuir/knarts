/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Immunization Origin Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getImmunizationOriginCodes()
 * @model
 * @generated
 */
public enum ImmunizationOriginCodes implements Enumerator {
	/**
	 * The '<em><b>Provider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDER(0, "provider", "provider"),

	/**
	 * The '<em><b>Record</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(1, "record", "record"),

	/**
	 * The '<em><b>Recall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECALL_VALUE
	 * @generated
	 * @ordered
	 */
	RECALL(2, "recall", "recall"),

	/**
	 * The '<em><b>School</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL(3, "school", "school");

	/**
	 * The '<em><b>Provider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provider</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDER
	 * @model name="provider"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDER_VALUE = 0;

	/**
	 * The '<em><b>Record</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD
	 * @model name="record"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_VALUE = 1;

	/**
	 * The '<em><b>Recall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECALL
	 * @model name="recall"
	 * @generated
	 * @ordered
	 */
	public static final int RECALL_VALUE = 2;

	/**
	 * The '<em><b>School</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>School</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHOOL
	 * @model name="school"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Immunization Origin Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmunizationOriginCodes[] VALUES_ARRAY =
		new ImmunizationOriginCodes[] {
			PROVIDER,
			RECORD,
			RECALL,
			SCHOOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Immunization Origin Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImmunizationOriginCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Immunization Origin Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationOriginCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationOriginCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Origin Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationOriginCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationOriginCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Origin Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationOriginCodes get(int value) {
		switch (value) {
			case PROVIDER_VALUE: return PROVIDER;
			case RECORD_VALUE: return RECORD;
			case RECALL_VALUE: return RECALL;
			case SCHOOL_VALUE: return SCHOOL;
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
	private ImmunizationOriginCodes(int value, String name, String literal) {
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
	
} //ImmunizationOriginCodes
