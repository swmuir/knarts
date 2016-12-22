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
 * A representation of the literals of the enumeration '<em><b>Medication Statement Not Taken List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMedicationStatementNotTakenList()
 * @model extendedMetaData="name='MedicationStatementNotTaken-list'"
 * @generated
 */
public enum MedicationStatementNotTakenList implements Enumerator {
	/**
	 * The '<em><b>Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Y_VALUE
	 * @generated
	 * @ordered
	 */
	Y(0, "y", "y"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(1, "n", "n"),

	/**
	 * The '<em><b>Unk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNK_VALUE
	 * @generated
	 * @ordered
	 */
	UNK(2, "unk", "unk");

	/**
	 * The '<em><b>Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yes
	 * <!-- end-model-doc -->
	 * @see #Y
	 * @model name="y"
	 * @generated
	 * @ordered
	 */
	public static final int Y_VALUE = 0;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No
	 * <!-- end-model-doc -->
	 * @see #N
	 * @model name="n"
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 1;

	/**
	 * The '<em><b>Unk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UNK
	 * @model name="unk"
	 * @generated
	 * @ordered
	 */
	public static final int UNK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Medication Statement Not Taken List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicationStatementNotTakenList[] VALUES_ARRAY =
		new MedicationStatementNotTakenList[] {
			Y,
			N,
			UNK,
		};

	/**
	 * A public read-only list of all the '<em><b>Medication Statement Not Taken List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicationStatementNotTakenList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medication Statement Not Taken List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationStatementNotTakenList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationStatementNotTakenList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Statement Not Taken List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationStatementNotTakenList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationStatementNotTakenList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Statement Not Taken List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationStatementNotTakenList get(int value) {
		switch (value) {
			case Y_VALUE: return Y;
			case N_VALUE: return N;
			case UNK_VALUE: return UNK;
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
	private MedicationStatementNotTakenList(int value, String name, String literal) {
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
	
} //MedicationStatementNotTakenList
