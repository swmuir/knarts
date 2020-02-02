/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Integrity Check Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The algorithm used to compute the integrityCheck value.
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getIntegrityCheckAlgorithm()
 * @model extendedMetaData="name='IntegrityCheckAlgorithm'"
 * @generated
 */
public enum IntegrityCheckAlgorithm implements Enumerator {
	/**
	 * The '<em><b>SHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA1_VALUE
	 * @generated
	 * @ordered
	 */
	SHA1(0, "SHA1", "SHA1"),

	/**
	 * The '<em><b>SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA256_VALUE
	 * @generated
	 * @ordered
	 */
	SHA256(1, "SHA256", "SHA256");

	/**
	 * The '<em><b>SHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Hash Algorithm - 1 : This algorithm is defined in FIPS PUB 180-1: Secure Hash Standard. As of April 17, 1995 
	 * <!-- end-model-doc -->
	 * @see #SHA1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHA1_VALUE = 0;

	/**
	 * The '<em><b>SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Hash Algorithm - 256 : This algorithm is defined in FIPS PUB 180-2: Secure Hash Standard 
	 * <!-- end-model-doc -->
	 * @see #SHA256
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHA256_VALUE = 1;

	/**
	 * An array of all the '<em><b>Integrity Check Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntegrityCheckAlgorithm[] VALUES_ARRAY =
		new IntegrityCheckAlgorithm[] {
			SHA1,
			SHA256,
		};

	/**
	 * A public read-only list of all the '<em><b>Integrity Check Algorithm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntegrityCheckAlgorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Integrity Check Algorithm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityCheckAlgorithm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrityCheckAlgorithm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integrity Check Algorithm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityCheckAlgorithm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntegrityCheckAlgorithm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Integrity Check Algorithm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntegrityCheckAlgorithm get(int value) {
		switch (value) {
			case SHA1_VALUE: return SHA1;
			case SHA256_VALUE: return SHA256;
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
	private IntegrityCheckAlgorithm(int value, String name, String literal) {
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
	
} //IntegrityCheckAlgorithm
