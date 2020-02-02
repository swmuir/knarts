/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Group Selection Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines selection behavior of a group: specifies
 * 				the number of selectable items in the group that may be selected by
 * 				the end user when the items of the group are displayed.
 * 			
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getGroupSelectionBehaviorType()
 * @model extendedMetaData="name='GroupSelectionBehaviorType'"
 * @generated
 */
public enum GroupSelectionBehaviorType implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "Any", "Any"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(1, "All", "All"),

	/**
	 * The '<em><b>All Or None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OR_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OR_NONE(2, "AllOrNone", "AllOrNone"),

	/**
	 * The '<em><b>Exactly One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONE(3, "ExactlyOne", "ExactlyOne"),

	/**
	 * The '<em><b>At Most One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_ONE(4, "AtMostOne", "AtMostOne"),

	/**
	 * The '<em><b>One Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MORE(5, "OneOrMore", "OneOrMore");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any number of the items in the group may be
	 * 						chosen, from zero to all.
	 * <!-- end-model-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the items in the group must be selected as a
	 * 						single unit.
	 * <!-- end-model-doc -->
	 * @see #ALL
	 * @model name="All"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 1;

	/**
	 * The '<em><b>All Or None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the items in the group are meant to be chosen
	 * 						as a single unit: either all must be selected by the end user, or
	 * 						none may be selected.
	 * <!-- end-model-doc -->
	 * @see #ALL_OR_NONE
	 * @model name="AllOrNone"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OR_NONE_VALUE = 2;

	/**
	 * The '<em><b>Exactly One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end user must choose one and only one of the
	 * 						selectable items in the group. The user may not choose none of the
	 * 						items in the group.
	 * <!-- end-model-doc -->
	 * @see #EXACTLY_ONE
	 * @model name="ExactlyOne"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONE_VALUE = 3;

	/**
	 * The '<em><b>At Most One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end user may choose zero or at most one of
	 * 						the items in the group.
	 * <!-- end-model-doc -->
	 * @see #AT_MOST_ONE
	 * @model name="AtMostOne"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_ONE_VALUE = 4;

	/**
	 * The '<em><b>One Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end user must choose a minimum of one, and as
	 * 						many additional as desired.
	 * <!-- end-model-doc -->
	 * @see #ONE_OR_MORE
	 * @model name="OneOrMore"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MORE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Group Selection Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupSelectionBehaviorType[] VALUES_ARRAY =
		new GroupSelectionBehaviorType[] {
			ANY,
			ALL,
			ALL_OR_NONE,
			EXACTLY_ONE,
			AT_MOST_ONE,
			ONE_OR_MORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Selection Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupSelectionBehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Selection Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupSelectionBehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupSelectionBehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Selection Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupSelectionBehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupSelectionBehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Selection Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupSelectionBehaviorType get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case ALL_VALUE: return ALL;
			case ALL_OR_NONE_VALUE: return ALL_OR_NONE;
			case EXACTLY_ONE_VALUE: return EXACTLY_ONE;
			case AT_MOST_ONE_VALUE: return AT_MOST_ONE;
			case ONE_OR_MORE_VALUE: return ONE_OR_MORE;
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
	private GroupSelectionBehaviorType(int value, String name, String literal) {
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
	
} //GroupSelectionBehaviorType
