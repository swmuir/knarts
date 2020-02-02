/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Precheck Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines selection frequency behavior for an action
 * 				or group; i.e., for most frequently selected items, the end-user
 * 				system may provide convenience options in the UI (such as
 * 				pre-selection) in order to (1) communicate to the end user what the
 * 				most frequently selected item is, or should, be in a particular
 * 				context, and (2) save the end user time.  
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getPrecheckBehaviorType()
 * @model extendedMetaData="name='PrecheckBehaviorType'"
 * @generated
 */
public enum PrecheckBehaviorType implements Enumerator {
	/**
	 * The '<em><b>Yes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_VALUE
	 * @generated
	 * @ordered
	 */
	YES(0, "Yes", "Yes"),

	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(1, "No", "No");

	/**
	 * The '<em><b>Yes</b></em>' literal value.
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
	 * @see #YES
	 * @model name="Yes"
	 * @generated
	 * @ordered
	 */
	public static final int YES_VALUE = 0;

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior is one of the less
	 * 						frequent actions included by the end user, for the particular
	 * 						context in which the action occurs. The system displaying the
	 * 						actions to the end user would typically not "pre-check" such an
	 * 						action.
	 * <!-- end-model-doc -->
	 * @see #NO
	 * @model name="No"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Precheck Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrecheckBehaviorType[] VALUES_ARRAY =
		new PrecheckBehaviorType[] {
			YES,
			NO,
		};

	/**
	 * A public read-only list of all the '<em><b>Precheck Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrecheckBehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Precheck Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrecheckBehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrecheckBehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Precheck Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrecheckBehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrecheckBehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Precheck Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrecheckBehaviorType get(int value) {
		switch (value) {
			case YES_VALUE: return YES;
			case NO_VALUE: return NO;
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
	private PrecheckBehaviorType(int value, String name, String literal) {
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
	
} //PrecheckBehaviorType
