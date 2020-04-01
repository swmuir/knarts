/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Designation Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getDesignationUse()
 * @model
 * @generated
 */
public enum DesignationUse implements Enumerator {
	/**
	 * The '<em><b>900000000000003001</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900000000000003001_VALUE
	 * @generated
	 * @ordered
	 */
	_900000000000003001(0, "_900000000000003001", "_900000000000003001"),

	/**
	 * The '<em><b>900000000000013009</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900000000000013009_VALUE
	 * @generated
	 * @ordered
	 */
	_900000000000013009(1, "_900000000000013009", "_900000000000013009");

	/**
	 * The '<em><b>900000000000003001</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900000000000003001
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='900000000000003001'"
	 * @generated
	 * @ordered
	 */
	public static final int _900000000000003001_VALUE = 0;

	/**
	 * The '<em><b>900000000000013009</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900000000000013009
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='900000000000013009'"
	 * @generated
	 * @ordered
	 */
	public static final int _900000000000013009_VALUE = 1;

	/**
	 * An array of all the '<em><b>Designation Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DesignationUse[] VALUES_ARRAY =
		new DesignationUse[] {
			_900000000000003001,
			_900000000000013009,
		};

	/**
	 * A public read-only list of all the '<em><b>Designation Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DesignationUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Designation Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DesignationUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignationUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Designation Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DesignationUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignationUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Designation Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DesignationUse get(int value) {
		switch (value) {
			case _900000000000003001_VALUE: return _900000000000003001;
			case _900000000000013009_VALUE: return _900000000000013009;
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
	private DesignationUse(int value, String name, String literal) {
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
	
} //DesignationUse