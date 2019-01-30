/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Verification Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConditionVerificationStatusList()
 * @model extendedMetaData="name='ConditionVerificationStatus-list'"
 * @generated
 */
public enum ConditionVerificationStatusList implements Enumerator {
	/**
	 * The '<em><b>Unconfirmed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCONFIRMED(0, "unconfirmed", "unconfirmed"),

	/**
	 * The '<em><b>Provisional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISIONAL(1, "provisional", "provisional"),

	/**
	 * The '<em><b>Differential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENTIAL(2, "differential", "differential"),

	/**
	 * The '<em><b>Confirmed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(3, "confirmed", "confirmed"),

	/**
	 * The '<em><b>Refuted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUTED_VALUE
	 * @generated
	 * @ordered
	 */
	REFUTED(4, "refuted", "refuted"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(5, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Unconfirmed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unconfirmed
	 * <!-- end-model-doc -->
	 * @see #UNCONFIRMED
	 * @model name="unconfirmed"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONFIRMED_VALUE = 0;

	/**
	 * The '<em><b>Provisional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provisional
	 * <!-- end-model-doc -->
	 * @see #PROVISIONAL
	 * @model name="provisional"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISIONAL_VALUE = 1;

	/**
	 * The '<em><b>Differential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Differential
	 * <!-- end-model-doc -->
	 * @see #DIFFERENTIAL
	 * @model name="differential"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENTIAL_VALUE = 2;

	/**
	 * The '<em><b>Confirmed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Confirmed
	 * <!-- end-model-doc -->
	 * @see #CONFIRMED
	 * @model name="confirmed"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 3;

	/**
	 * The '<em><b>Refuted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refuted
	 * <!-- end-model-doc -->
	 * @see #REFUTED
	 * @model name="refuted"
	 * @generated
	 * @ordered
	 */
	public static final int REFUTED_VALUE = 4;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entered In Error
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Condition Verification Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionVerificationStatusList[] VALUES_ARRAY =
		new ConditionVerificationStatusList[] {
			UNCONFIRMED,
			PROVISIONAL,
			DIFFERENTIAL,
			CONFIRMED,
			REFUTED,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Verification Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionVerificationStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Verification Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionVerificationStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionVerificationStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Verification Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionVerificationStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionVerificationStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Verification Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionVerificationStatusList get(int value) {
		switch (value) {
			case UNCONFIRMED_VALUE: return UNCONFIRMED;
			case PROVISIONAL_VALUE: return PROVISIONAL;
			case DIFFERENTIAL_VALUE: return DIFFERENTIAL;
			case CONFIRMED_VALUE: return CONFIRMED;
			case REFUTED_VALUE: return REFUTED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
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
	private ConditionVerificationStatusList(int value, String name, String literal) {
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
	
} //ConditionVerificationStatusList
