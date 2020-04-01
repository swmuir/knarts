/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fluid Consistency Type Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getFluidConsistencyTypeCodes()
 * @model
 * @generated
 */
public enum FluidConsistencyTypeCodes implements Enumerator {
	/**
	 * The '<em><b>439031000124108</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439031000124108_VALUE
	 * @generated
	 * @ordered
	 */
	_439031000124108(0, "_439031000124108", "_439031000124108"),

	/**
	 * The '<em><b>439021000124105</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439021000124105_VALUE
	 * @generated
	 * @ordered
	 */
	_439021000124105(1, "_439021000124105", "_439021000124105"),

	/**
	 * The '<em><b>439041000124103</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439041000124103_VALUE
	 * @generated
	 * @ordered
	 */
	_439041000124103(2, "_439041000124103", "_439041000124103"),

	/**
	 * The '<em><b>439081000124109</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439081000124109_VALUE
	 * @generated
	 * @ordered
	 */
	_439081000124109(3, "_439081000124109", "_439081000124109");

	/**
	 * The '<em><b>439031000124108</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439031000124108
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='439031000124108'"
	 * @generated
	 * @ordered
	 */
	public static final int _439031000124108_VALUE = 0;

	/**
	 * The '<em><b>439021000124105</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439021000124105
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='439021000124105'"
	 * @generated
	 * @ordered
	 */
	public static final int _439021000124105_VALUE = 1;

	/**
	 * The '<em><b>439041000124103</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439041000124103
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='439041000124103'"
	 * @generated
	 * @ordered
	 */
	public static final int _439041000124103_VALUE = 2;

	/**
	 * The '<em><b>439081000124109</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_439081000124109
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='439081000124109'"
	 * @generated
	 * @ordered
	 */
	public static final int _439081000124109_VALUE = 3;

	/**
	 * An array of all the '<em><b>Fluid Consistency Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FluidConsistencyTypeCodes[] VALUES_ARRAY =
		new FluidConsistencyTypeCodes[] {
			_439031000124108,
			_439021000124105,
			_439041000124103,
			_439081000124109,
		};

	/**
	 * A public read-only list of all the '<em><b>Fluid Consistency Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FluidConsistencyTypeCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fluid Consistency Type Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FluidConsistencyTypeCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FluidConsistencyTypeCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fluid Consistency Type Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FluidConsistencyTypeCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FluidConsistencyTypeCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fluid Consistency Type Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FluidConsistencyTypeCodes get(int value) {
		switch (value) {
			case _439031000124108_VALUE: return _439031000124108;
			case _439021000124105_VALUE: return _439021000124105;
			case _439041000124103_VALUE: return _439041000124103;
			case _439081000124109_VALUE: return _439081000124109;
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
	private FluidConsistencyTypeCodes(int value, String name, String literal) {
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
	
} //FluidConsistencyTypeCodes
