/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinality Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines behavior for an action or a group for how
 * 				many times that item may be repeated, i.e., cardinality. For example, if a
 * 				user is documenting lesions, the lesion element may be repeated
 * 				several times, once for each occurrence of a lesion on the patient or tissue sample or image
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCardinalityBehaviorType()
 * @model extendedMetaData="name='CardinalityBehaviorType'"
 * @generated
 */
public enum CardinalityBehaviorType implements Enumerator {
	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(0, "Single", "Single"),

	/**
	 * The '<em><b>Multiple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE(1, "Multiple", "Multiple");

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior is one of the most
	 * 						frequent actions that is, or should be, included by an end user,
	 * 						for the particular context in which the action occurs. The system
	 * 						displaying the action to the end user should consider
	 * 						"pre-checking" such an action as a convenience for the user.
	 * 					
	 * <!-- end-model-doc -->
	 * @see #SINGLE
	 * @model name="Single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 0;

	/**
	 * The '<em><b>Multiple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior is one of the less
	 * 						frequent actions included by the end user, for the particular
	 * 						context in which the action occurs. The system displaying the
	 * 						actions to the end user would typically not "pre-check" such an
	 * 						action.
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE
	 * @model name="Multiple"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cardinality Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardinalityBehaviorType[] VALUES_ARRAY =
		new CardinalityBehaviorType[] {
			SINGLE,
			MULTIPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinality Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CardinalityBehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinality Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardinalityBehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardinalityBehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardinalityBehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardinalityBehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardinalityBehaviorType get(int value) {
		switch (value) {
			case SINGLE_VALUE: return SINGLE;
			case MULTIPLE_VALUE: return MULTIPLE;
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
	private CardinalityBehaviorType(int value, String name, String literal) {
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
	
} //CardinalityBehaviorType
