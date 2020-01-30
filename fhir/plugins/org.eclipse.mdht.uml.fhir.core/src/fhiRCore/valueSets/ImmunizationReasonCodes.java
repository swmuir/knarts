/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Immunization Reason Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getImmunizationReasonCodes()
 * @model
 * @generated
 */
public enum ImmunizationReasonCodes implements Enumerator {
	/**
	 * The '<em><b>429060002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_429060002_VALUE
	 * @generated
	 * @ordered
	 */
	_429060002(0, "_429060002", "_429060002"),

	/**
	 * The '<em><b>281657000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_281657000_VALUE
	 * @generated
	 * @ordered
	 */
	_281657000(1, "_281657000", "_281657000");

	/**
	 * The '<em><b>429060002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>429060002</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_429060002
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='429060002'"
	 * @generated
	 * @ordered
	 */
	public static final int _429060002_VALUE = 0;

	/**
	 * The '<em><b>281657000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>281657000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_281657000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='281657000'"
	 * @generated
	 * @ordered
	 */
	public static final int _281657000_VALUE = 1;

	/**
	 * An array of all the '<em><b>Immunization Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmunizationReasonCodes[] VALUES_ARRAY =
		new ImmunizationReasonCodes[] {
			_429060002,
			_281657000,
		};

	/**
	 * A public read-only list of all the '<em><b>Immunization Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImmunizationReasonCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Immunization Reason Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationReasonCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationReasonCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Reason Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationReasonCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationReasonCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Reason Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationReasonCodes get(int value) {
		switch (value) {
			case _429060002_VALUE: return _429060002;
			case _281657000_VALUE: return _281657000;
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
	private ImmunizationReasonCodes(int value, String name, String literal) {
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
	
} //ImmunizationReasonCodes
