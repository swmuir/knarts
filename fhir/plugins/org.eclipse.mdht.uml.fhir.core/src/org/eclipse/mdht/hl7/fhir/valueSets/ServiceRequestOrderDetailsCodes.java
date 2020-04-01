/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Request Order Details Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getServiceRequestOrderDetailsCodes()
 * @model
 * @generated
 */
public enum ServiceRequestOrderDetailsCodes implements Enumerator {
	/**
	 * The '<em><b>47545007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_47545007_VALUE
	 * @generated
	 * @ordered
	 */
	_47545007(0, "_47545007", "_47545007"),

	/**
	 * The '<em><b>286812008</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_286812008_VALUE
	 * @generated
	 * @ordered
	 */
	_286812008(1, "_286812008", "_286812008"),

	/**
	 * The '<em><b>243144002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_243144002_VALUE
	 * @generated
	 * @ordered
	 */
	_243144002(2, "_243144002", "_243144002"),

	/**
	 * The '<em><b>243150007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_243150007_VALUE
	 * @generated
	 * @ordered
	 */
	_243150007(3, "_243150007", "_243150007"),

	/**
	 * The '<em><b>59427005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_59427005_VALUE
	 * @generated
	 * @ordered
	 */
	_59427005(4, "_59427005", "_59427005");

	/**
	 * The '<em><b>47545007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_47545007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='47545007'"
	 * @generated
	 * @ordered
	 */
	public static final int _47545007_VALUE = 0;

	/**
	 * The '<em><b>286812008</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_286812008
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='286812008'"
	 * @generated
	 * @ordered
	 */
	public static final int _286812008_VALUE = 1;

	/**
	 * The '<em><b>243144002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_243144002
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='243144002'"
	 * @generated
	 * @ordered
	 */
	public static final int _243144002_VALUE = 2;

	/**
	 * The '<em><b>243150007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_243150007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='243150007'"
	 * @generated
	 * @ordered
	 */
	public static final int _243150007_VALUE = 3;

	/**
	 * The '<em><b>59427005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_59427005
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='59427005'"
	 * @generated
	 * @ordered
	 */
	public static final int _59427005_VALUE = 4;

	/**
	 * An array of all the '<em><b>Service Request Order Details Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceRequestOrderDetailsCodes[] VALUES_ARRAY =
		new ServiceRequestOrderDetailsCodes[] {
			_47545007,
			_286812008,
			_243144002,
			_243150007,
			_59427005,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Request Order Details Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceRequestOrderDetailsCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Request Order Details Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestOrderDetailsCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceRequestOrderDetailsCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Request Order Details Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestOrderDetailsCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceRequestOrderDetailsCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Request Order Details Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceRequestOrderDetailsCodes get(int value) {
		switch (value) {
			case _47545007_VALUE: return _47545007;
			case _286812008_VALUE: return _286812008;
			case _243144002_VALUE: return _243144002;
			case _243150007_VALUE: return _243150007;
			case _59427005_VALUE: return _59427005;
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
	private ServiceRequestOrderDetailsCodes(int value, String name, String literal) {
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
	
} //ServiceRequestOrderDetailsCodes
