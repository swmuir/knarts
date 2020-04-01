/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consent Category Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getConsentCategoryCodes()
 * @model
 * @generated
 */
public enum ConsentCategoryCodes implements Enumerator {
	/**
	 * The '<em><b>592840</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_592840_VALUE
	 * @generated
	 * @ordered
	 */
	_592840(0, "_592840", "_592840"),

	/**
	 * The '<em><b>570168</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_570168_VALUE
	 * @generated
	 * @ordered
	 */
	_570168(1, "_570168", "_570168"),

	/**
	 * The '<em><b>570176</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_570176_VALUE
	 * @generated
	 * @ordered
	 */
	_570176(2, "_570176", "_570176"),

	/**
	 * The '<em><b>642926</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_642926_VALUE
	 * @generated
	 * @ordered
	 */
	_642926(3, "_642926", "_642926");

	/**
	 * The '<em><b>592840</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_592840
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='59284-0'"
	 * @generated
	 * @ordered
	 */
	public static final int _592840_VALUE = 0;

	/**
	 * The '<em><b>570168</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_570168
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='57016-8'"
	 * @generated
	 * @ordered
	 */
	public static final int _570168_VALUE = 1;

	/**
	 * The '<em><b>570176</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_570176
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='57017-6'"
	 * @generated
	 * @ordered
	 */
	public static final int _570176_VALUE = 2;

	/**
	 * The '<em><b>642926</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_642926
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='64292-6'"
	 * @generated
	 * @ordered
	 */
	public static final int _642926_VALUE = 3;

	/**
	 * An array of all the '<em><b>Consent Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentCategoryCodes[] VALUES_ARRAY =
		new ConsentCategoryCodes[] {
			_592840,
			_570168,
			_570176,
			_642926,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentCategoryCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Category Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentCategoryCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentCategoryCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Category Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentCategoryCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentCategoryCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Category Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentCategoryCodes get(int value) {
		switch (value) {
			case _592840_VALUE: return _592840;
			case _570168_VALUE: return _570168;
			case _570176_VALUE: return _570176;
			case _642926_VALUE: return _642926;
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
	private ConsentCategoryCodes(int value, String name, String literal) {
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
	
} //ConsentCategoryCodes
