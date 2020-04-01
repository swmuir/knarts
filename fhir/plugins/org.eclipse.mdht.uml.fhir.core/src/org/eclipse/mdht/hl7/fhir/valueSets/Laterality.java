/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Laterality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getLaterality()
 * @model
 * @generated
 */
public enum Laterality implements Enumerator {
	/**
	 * The '<em><b>419161000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_419161000_VALUE
	 * @generated
	 * @ordered
	 */
	_419161000(0, "_419161000", "_419161000"),

	/**
	 * The '<em><b>419465000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_419465000_VALUE
	 * @generated
	 * @ordered
	 */
	_419465000(1, "_419465000", "_419465000"),

	/**
	 * The '<em><b>51440002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_51440002_VALUE
	 * @generated
	 * @ordered
	 */
	_51440002(2, "_51440002", "_51440002");

	/**
	 * The '<em><b>419161000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_419161000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='419161000'"
	 * @generated
	 * @ordered
	 */
	public static final int _419161000_VALUE = 0;

	/**
	 * The '<em><b>419465000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_419465000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='419465000'"
	 * @generated
	 * @ordered
	 */
	public static final int _419465000_VALUE = 1;

	/**
	 * The '<em><b>51440002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_51440002
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='51440002'"
	 * @generated
	 * @ordered
	 */
	public static final int _51440002_VALUE = 2;

	/**
	 * An array of all the '<em><b>Laterality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Laterality[] VALUES_ARRAY =
		new Laterality[] {
			_419161000,
			_419465000,
			_51440002,
		};

	/**
	 * A public read-only list of all the '<em><b>Laterality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Laterality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Laterality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Laterality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Laterality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laterality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Laterality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Laterality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laterality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Laterality get(int value) {
		switch (value) {
			case _419161000_VALUE: return _419161000;
			case _419465000_VALUE: return _419465000;
			case _51440002_VALUE: return _51440002;
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
	private Laterality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Laterality
