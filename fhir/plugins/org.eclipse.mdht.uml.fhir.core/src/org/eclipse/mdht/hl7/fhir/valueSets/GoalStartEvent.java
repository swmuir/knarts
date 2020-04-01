/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Goal Start Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getGoalStartEvent()
 * @model
 * @generated
 */
public enum GoalStartEvent implements Enumerator {
	/**
	 * The '<em><b>32485007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32485007_VALUE
	 * @generated
	 * @ordered
	 */
	_32485007(0, "_32485007", "_32485007"),

	/**
	 * The '<em><b>308283009</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_308283009_VALUE
	 * @generated
	 * @ordered
	 */
	_308283009(1, "_308283009", "_308283009"),

	/**
	 * The '<em><b>442137000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_442137000_VALUE
	 * @generated
	 * @ordered
	 */
	_442137000(2, "_442137000", "_442137000"),

	/**
	 * The '<em><b>386216000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_386216000_VALUE
	 * @generated
	 * @ordered
	 */
	_386216000(3, "_386216000", "_386216000");

	/**
	 * The '<em><b>32485007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32485007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='32485007'"
	 * @generated
	 * @ordered
	 */
	public static final int _32485007_VALUE = 0;

	/**
	 * The '<em><b>308283009</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_308283009
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='308283009'"
	 * @generated
	 * @ordered
	 */
	public static final int _308283009_VALUE = 1;

	/**
	 * The '<em><b>442137000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_442137000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='442137000'"
	 * @generated
	 * @ordered
	 */
	public static final int _442137000_VALUE = 2;

	/**
	 * The '<em><b>386216000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_386216000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='386216000'"
	 * @generated
	 * @ordered
	 */
	public static final int _386216000_VALUE = 3;

	/**
	 * An array of all the '<em><b>Goal Start Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalStartEvent[] VALUES_ARRAY =
		new GoalStartEvent[] {
			_32485007,
			_308283009,
			_442137000,
			_386216000,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Start Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalStartEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Start Event</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStartEvent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStartEvent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Start Event</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStartEvent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStartEvent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Start Event</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStartEvent get(int value) {
		switch (value) {
			case _32485007_VALUE: return _32485007;
			case _308283009_VALUE: return _308283009;
			case _442137000_VALUE: return _442137000;
			case _386216000_VALUE: return _386216000;
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
	private GoalStartEvent(int value, String name, String literal) {
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
	
} //GoalStartEvent
