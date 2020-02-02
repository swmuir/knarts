/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The roles that a condition plays in the execution
 * 				of a component. Currently, only one role type is defined. Additional
 * 				role types may be defined in the future (e.g., inclusion criteria,
 * 				exclusion criteria)
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getConditionRoleType()
 * @model extendedMetaData="name='ConditionRoleType'"
 * @generated
 */
public enum ConditionRoleType implements Enumerator {
	/**
	 * The '<em><b>Applicable Scenario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICABLE_SCENARIO_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICABLE_SCENARIO(0, "ApplicableScenario", "ApplicableScenario");

	/**
	 * The '<em><b>Applicable Scenario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This role type specifies that a condition is used to determine whether or not a particular knowledge component should be executed. If the expression evaluates to true, then the component is executed.
	 * <!-- end-model-doc -->
	 * @see #APPLICABLE_SCENARIO
	 * @model name="ApplicableScenario"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICABLE_SCENARIO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Condition Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionRoleType[] VALUES_ARRAY =
		new ConditionRoleType[] {
			APPLICABLE_SCENARIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionRoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionRoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionRoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionRoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionRoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionRoleType get(int value) {
		switch (value) {
			case APPLICABLE_SCENARIO_VALUE: return APPLICABLE_SCENARIO;
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
	private ConditionRoleType(int value, String name, String literal) {
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
	
} //ConditionRoleType
