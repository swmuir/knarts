/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Observation Reference Range Applies To Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getObservationReferenceRangeAppliesToCodes()
 * @model
 * @generated
 */
public enum ObservationReferenceRangeAppliesToCodes implements Enumerator {
	/**
	 * The '<em><b>248153007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_248153007_VALUE
	 * @generated
	 * @ordered
	 */
	_248153007(0, "_248153007", "_248153007"),

	/**
	 * The '<em><b>248152002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_248152002_VALUE
	 * @generated
	 * @ordered
	 */
	_248152002(1, "_248152002", "_248152002"),

	/**
	 * The '<em><b>77386006</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_77386006_VALUE
	 * @generated
	 * @ordered
	 */
	_77386006(2, "_77386006", "_77386006");

	/**
	 * The '<em><b>248153007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>248153007</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_248153007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='248153007'"
	 * @generated
	 * @ordered
	 */
	public static final int _248153007_VALUE = 0;

	/**
	 * The '<em><b>248152002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>248152002</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_248152002
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='248152002'"
	 * @generated
	 * @ordered
	 */
	public static final int _248152002_VALUE = 1;

	/**
	 * The '<em><b>77386006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>77386006</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_77386006
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='77386006'"
	 * @generated
	 * @ordered
	 */
	public static final int _77386006_VALUE = 2;

	/**
	 * An array of all the '<em><b>Observation Reference Range Applies To Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationReferenceRangeAppliesToCodes[] VALUES_ARRAY =
		new ObservationReferenceRangeAppliesToCodes[] {
			_248153007,
			_248152002,
			_77386006,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Reference Range Applies To Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationReferenceRangeAppliesToCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Reference Range Applies To Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReferenceRangeAppliesToCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationReferenceRangeAppliesToCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Reference Range Applies To Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReferenceRangeAppliesToCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationReferenceRangeAppliesToCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Reference Range Applies To Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReferenceRangeAppliesToCodes get(int value) {
		switch (value) {
			case _248153007_VALUE: return _248153007;
			case _248152002_VALUE: return _248152002;
			case _77386006_VALUE: return _77386006;
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
	private ObservationReferenceRangeAppliesToCodes(int value, String name, String literal) {
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
	
} //ObservationReferenceRangeAppliesToCodes
