/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Problem Diagnosis Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getConditionProblemDiagnosisCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Condition/Problem/DiagnosisCodes'"
 * @generated
 */
public enum ConditionProblemDiagnosisCodes implements Enumerator {
	/**
	 * The '<em><b>160245001</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_160245001_VALUE
	 * @generated
	 * @ordered
	 */
	_160245001(0, "_160245001", "_160245001");

	/**
	 * The '<em><b>160245001</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_160245001
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='160245001'"
	 * @generated
	 * @ordered
	 */
	public static final int _160245001_VALUE = 0;

	/**
	 * An array of all the '<em><b>Condition Problem Diagnosis Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionProblemDiagnosisCodes[] VALUES_ARRAY =
		new ConditionProblemDiagnosisCodes[] {
			_160245001,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Problem Diagnosis Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionProblemDiagnosisCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Problem Diagnosis Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionProblemDiagnosisCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionProblemDiagnosisCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Problem Diagnosis Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionProblemDiagnosisCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionProblemDiagnosisCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Problem Diagnosis Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionProblemDiagnosisCodes get(int value) {
		switch (value) {
			case _160245001_VALUE: return _160245001;
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
	private ConditionProblemDiagnosisCodes(int value, String name, String literal) {
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
	
} //ConditionProblemDiagnosisCodes
