/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Set Item Grouping Behavior List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getOrderSetItemGroupingBehaviorList()
 * @model extendedMetaData="name='OrderSetItemGroupingBehavior-list'"
 * @generated
 */
public enum OrderSetItemGroupingBehaviorList implements Enumerator {
	/**
	 * The '<em><b>Visual Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	VISUAL_GROUP(0, "visualGroup", "visual-group"),

	/**
	 * The '<em><b>Logical Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL_GROUP(1, "logicalGroup", "logical-group"),

	/**
	 * The '<em><b>Sentence Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	SENTENCE_GROUP(2, "sentenceGroup", "sentence-group");

	/**
	 * The '<em><b>Visual Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any group marked with this behavior should be displayed as a visual group to the end user
	 * <!-- end-model-doc -->
	 * @see #VISUAL_GROUP
	 * @model name="visualGroup" literal="visual-group"
	 * @generated
	 * @ordered
	 */
	public static final int VISUAL_GROUP_VALUE = 0;

	/**
	 * The '<em><b>Logical Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_GROUP
	 * @model name="logicalGroup" literal="logical-group"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_GROUP_VALUE = 1;

	/**
	 * The '<em><b>Sentence Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of related alternative items is a sentence group if the target referenced by the item is the same in all the items, and each item simply constitutes a different variation on how to specify the details for the target. For example, two items that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the item, and the two items represent two different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required item, in which case, it would be "ExactlyOne"
	 * <!-- end-model-doc -->
	 * @see #SENTENCE_GROUP
	 * @model name="sentenceGroup" literal="sentence-group"
	 * @generated
	 * @ordered
	 */
	public static final int SENTENCE_GROUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Order Set Item Grouping Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderSetItemGroupingBehaviorList[] VALUES_ARRAY =
		new OrderSetItemGroupingBehaviorList[] {
			VISUAL_GROUP,
			LOGICAL_GROUP,
			SENTENCE_GROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Set Item Grouping Behavior List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderSetItemGroupingBehaviorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehaviorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemGroupingBehaviorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehaviorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemGroupingBehaviorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Grouping Behavior List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemGroupingBehaviorList get(int value) {
		switch (value) {
			case VISUAL_GROUP_VALUE: return VISUAL_GROUP;
			case LOGICAL_GROUP_VALUE: return LOGICAL_GROUP;
			case SENTENCE_GROUP_VALUE: return SENTENCE_GROUP;
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
	private OrderSetItemGroupingBehaviorList(int value, String name, String literal) {
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
	
} //OrderSetItemGroupingBehaviorList
