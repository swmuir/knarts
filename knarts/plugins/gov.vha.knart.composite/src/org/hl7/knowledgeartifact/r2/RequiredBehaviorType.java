/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Required Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines requiredness behavior for selecting an
 * 				action or an action group; i.e., whether the action or action group
 * 				is required or optional.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getRequiredBehaviorType()
 * @model extendedMetaData="name='RequiredBehaviorType'"
 * @generated
 */
public enum RequiredBehaviorType implements Enumerator {
	/**
	 * The '<em><b>Must</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_VALUE
	 * @generated
	 * @ordered
	 */
	MUST(0, "Must", "Must"),

	/**
	 * The '<em><b>Could</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_VALUE
	 * @generated
	 * @ordered
	 */
	COULD(1, "Could", "Could"),

	/**
	 * The '<em><b>Must Unless Documented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_UNLESS_DOCUMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	MUST_UNLESS_DOCUMENTED(2, "MustUnlessDocumented", "MustUnlessDocumented");

	/**
	 * The '<em><b>Must</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior must be included in
	 * 						the actions processed by the end user; the end user may not choose
	 * 						not to include this action.
	 * <!-- end-model-doc -->
	 * @see #MUST
	 * @model name="Must"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_VALUE = 0;

	/**
	 * The '<em><b>Could</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior may be included in
	 * 						the set of actions processed by the end user.
	 * <!-- end-model-doc -->
	 * @see #COULD
	 * @model name="Could"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_VALUE = 1;

	/**
	 * The '<em><b>Must Unless Documented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action with this behavior must be included in
	 * 						the set of actions processed by the end user, unless the end user
	 * 						provides documentation as to why the action was not included.
	 * 					
	 * <!-- end-model-doc -->
	 * @see #MUST_UNLESS_DOCUMENTED
	 * @model name="MustUnlessDocumented"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_UNLESS_DOCUMENTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Required Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequiredBehaviorType[] VALUES_ARRAY =
		new RequiredBehaviorType[] {
			MUST,
			COULD,
			MUST_UNLESS_DOCUMENTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Required Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequiredBehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Required Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequiredBehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequiredBehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Required Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequiredBehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequiredBehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Required Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequiredBehaviorType get(int value) {
		switch (value) {
			case MUST_VALUE: return MUST;
			case COULD_VALUE: return COULD;
			case MUST_UNLESS_DOCUMENTED_VALUE: return MUST_UNLESS_DOCUMENTED;
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
	private RequiredBehaviorType(int value, String name, String literal) {
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
	
} //RequiredBehaviorType
