/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Procedure Outcome Codes Snomedc T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getProcedureOutcomeCodesSnomedcT()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ProcedureOutcomeCodes(SNOMEDCT)'"
 * @generated
 */
public enum ProcedureOutcomeCodesSnomedcT implements Enumerator {
	/**
	 * The '<em><b>385669000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385669000_VALUE
	 * @generated
	 * @ordered
	 */
	_385669000(0, "_385669000", "_385669000"),

	/**
	 * The '<em><b>385671000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385671000_VALUE
	 * @generated
	 * @ordered
	 */
	_385671000(1, "_385671000", "_385671000"),

	/**
	 * The '<em><b>385670004</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385670004_VALUE
	 * @generated
	 * @ordered
	 */
	_385670004(2, "_385670004", "_385670004");

	/**
	 * The '<em><b>385669000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385669000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='385669000'"
	 * @generated
	 * @ordered
	 */
	public static final int _385669000_VALUE = 0;

	/**
	 * The '<em><b>385671000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385671000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='385671000'"
	 * @generated
	 * @ordered
	 */
	public static final int _385671000_VALUE = 1;

	/**
	 * The '<em><b>385670004</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_385670004
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='385670004'"
	 * @generated
	 * @ordered
	 */
	public static final int _385670004_VALUE = 2;

	/**
	 * An array of all the '<em><b>Procedure Outcome Codes Snomedc T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcedureOutcomeCodesSnomedcT[] VALUES_ARRAY =
		new ProcedureOutcomeCodesSnomedcT[] {
			_385669000,
			_385671000,
			_385670004,
		};

	/**
	 * A public read-only list of all the '<em><b>Procedure Outcome Codes Snomedc T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcedureOutcomeCodesSnomedcT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Procedure Outcome Codes Snomedc T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureOutcomeCodesSnomedcT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureOutcomeCodesSnomedcT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Outcome Codes Snomedc T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureOutcomeCodesSnomedcT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureOutcomeCodesSnomedcT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Outcome Codes Snomedc T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureOutcomeCodesSnomedcT get(int value) {
		switch (value) {
			case _385669000_VALUE: return _385669000;
			case _385671000_VALUE: return _385671000;
			case _385670004_VALUE: return _385670004;
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
	private ProcedureOutcomeCodesSnomedcT(int value, String name, String literal) {
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
	
} //ProcedureOutcomeCodesSnomedcT
