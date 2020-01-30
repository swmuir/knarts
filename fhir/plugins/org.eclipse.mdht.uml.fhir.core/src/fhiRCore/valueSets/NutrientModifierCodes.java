/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nutrient Modifier Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getNutrientModifierCodes()
 * @model
 * @generated
 */
public enum NutrientModifierCodes implements Enumerator {
	/**
	 * The '<em><b>33463005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_33463005_VALUE
	 * @generated
	 * @ordered
	 */
	_33463005(0, "_33463005", "_33463005"),

	/**
	 * The '<em><b>39972003</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_39972003_VALUE
	 * @generated
	 * @ordered
	 */
	_39972003(1, "_39972003", "_39972003"),

	/**
	 * The '<em><b>88480006</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_88480006_VALUE
	 * @generated
	 * @ordered
	 */
	_88480006(2, "_88480006", "_88480006");

	/**
	 * The '<em><b>33463005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>33463005</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_33463005
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='33463005'"
	 * @generated
	 * @ordered
	 */
	public static final int _33463005_VALUE = 0;

	/**
	 * The '<em><b>39972003</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>39972003</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_39972003
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='39972003'"
	 * @generated
	 * @ordered
	 */
	public static final int _39972003_VALUE = 1;

	/**
	 * The '<em><b>88480006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>88480006</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_88480006
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='88480006'"
	 * @generated
	 * @ordered
	 */
	public static final int _88480006_VALUE = 2;

	/**
	 * An array of all the '<em><b>Nutrient Modifier Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NutrientModifierCodes[] VALUES_ARRAY =
		new NutrientModifierCodes[] {
			_33463005,
			_39972003,
			_88480006,
		};

	/**
	 * A public read-only list of all the '<em><b>Nutrient Modifier Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NutrientModifierCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nutrient Modifier Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NutrientModifierCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NutrientModifierCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nutrient Modifier Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NutrientModifierCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NutrientModifierCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nutrient Modifier Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NutrientModifierCodes get(int value) {
		switch (value) {
			case _33463005_VALUE: return _33463005;
			case _39972003_VALUE: return _39972003;
			case _88480006_VALUE: return _88480006;
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
	private NutrientModifierCodes(int value, String name, String literal) {
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
	
} //NutrientModifierCodes
