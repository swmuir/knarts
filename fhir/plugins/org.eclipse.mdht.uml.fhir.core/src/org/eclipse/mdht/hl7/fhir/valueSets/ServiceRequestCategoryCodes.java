/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Request Category Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getServiceRequestCategoryCodes()
 * @model
 * @generated
 */
public enum ServiceRequestCategoryCodes implements Enumerator {
	/**
	 * The '<em><b>108252007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_108252007_VALUE
	 * @generated
	 * @ordered
	 */
	_108252007(0, "_108252007", "_108252007"),

	/**
	 * The '<em><b>363679005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_363679005_VALUE
	 * @generated
	 * @ordered
	 */
	_363679005(1, "_363679005", "_363679005"),

	/**
	 * The '<em><b>409063005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_409063005_VALUE
	 * @generated
	 * @ordered
	 */
	_409063005(2, "_409063005", "_409063005"),

	/**
	 * The '<em><b>409073007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_409073007_VALUE
	 * @generated
	 * @ordered
	 */
	_409073007(3, "_409073007", "_409073007"),

	/**
	 * The '<em><b>387713003</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_387713003_VALUE
	 * @generated
	 * @ordered
	 */
	_387713003(4, "_387713003", "_387713003");

	/**
	 * The '<em><b>108252007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_108252007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='108252007'"
	 * @generated
	 * @ordered
	 */
	public static final int _108252007_VALUE = 0;

	/**
	 * The '<em><b>363679005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_363679005
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='363679005'"
	 * @generated
	 * @ordered
	 */
	public static final int _363679005_VALUE = 1;

	/**
	 * The '<em><b>409063005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_409063005
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='409063005'"
	 * @generated
	 * @ordered
	 */
	public static final int _409063005_VALUE = 2;

	/**
	 * The '<em><b>409073007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_409073007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='409073007'"
	 * @generated
	 * @ordered
	 */
	public static final int _409073007_VALUE = 3;

	/**
	 * The '<em><b>387713003</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_387713003
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='387713003'"
	 * @generated
	 * @ordered
	 */
	public static final int _387713003_VALUE = 4;

	/**
	 * An array of all the '<em><b>Service Request Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceRequestCategoryCodes[] VALUES_ARRAY =
		new ServiceRequestCategoryCodes[] {
			_108252007,
			_363679005,
			_409063005,
			_409073007,
			_387713003,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Request Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceRequestCategoryCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Request Category Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestCategoryCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceRequestCategoryCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Request Category Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestCategoryCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceRequestCategoryCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Request Category Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestCategoryCodes get(int value) {
		switch (value) {
			case _108252007_VALUE: return _108252007;
			case _363679005_VALUE: return _363679005;
			case _409063005_VALUE: return _409063005;
			case _409073007_VALUE: return _409073007;
			case _387713003_VALUE: return _387713003;
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
	private ServiceRequestCategoryCodes(int value, String name, String literal) {
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
	
} //ServiceRequestCategoryCodes
