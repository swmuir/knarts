/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Range Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The enumeration of different types of range constraints on values. 
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getRangeConstraintType()
 * @model extendedMetaData="name='RangeConstraintType'"
 * @generated
 */
public enum RangeConstraintType implements Enumerator {
	/**
	 * The '<em><b>Minimum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM(0, "Minimum", "Minimum"),

	/**
	 * The '<em><b>Maximum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM(1, "Maximum", "Maximum"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(2, "List", "List"),

	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(3, "Component", "Component");

	/**
	 * The '<em><b>Minimum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint specifies the lower bound or minimum value of a documentation item value. This constraint type applies to quantitative value types only.
	 * <!-- end-model-doc -->
	 * @see #MINIMUM
	 * @model name="Minimum"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_VALUE = 0;

	/**
	 * The '<em><b>Maximum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint specifies the upper bound or minimum value of a documentation item value. This constraint type applies to quantitative value types only.
	 * <!-- end-model-doc -->
	 * @see #MAXIMUM
	 * @model name="Maximum"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_VALUE = 1;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint restricts the value to items from a list.
	 * <!-- end-model-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 2;

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Range Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RangeConstraintType[] VALUES_ARRAY =
		new RangeConstraintType[] {
			MINIMUM,
			MAXIMUM,
			LIST,
			COMPONENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Range Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RangeConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Range Constraint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeConstraintType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeConstraintType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Constraint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeConstraintType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeConstraintType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Constraint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RangeConstraintType get(int value) {
		switch (value) {
			case MINIMUM_VALUE: return MINIMUM;
			case MAXIMUM_VALUE: return MAXIMUM;
			case LIST_VALUE: return LIST;
			case COMPONENT_VALUE: return COMPONENT;
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
	private RangeConstraintType(int value, String name, String literal) {
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
	
} //RangeConstraintType
