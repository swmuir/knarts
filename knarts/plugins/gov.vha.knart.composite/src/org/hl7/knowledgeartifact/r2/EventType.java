/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventType()
 * @model extendedMetaData="name='EventType'"
 * @generated
 */
public enum EventType implements Enumerator {
	/**
	 * The '<em><b>Data Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_EVENT(0, "DataEvent", "DataEvent"),

	/**
	 * The '<em><b>Periodic Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC_EVENT(1, "PeriodicEvent", "PeriodicEvent"),

	/**
	 * The '<em><b>Named Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED_EVENT(2, "NamedEvent", "NamedEvent");

	/**
	 * The '<em><b>Data Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An event in which a data item is created, removed, updated, or accessed.
	 * 					Expression is expected to be an ExpressionRef
	 * 						that references an ExpressionDef in ExternalData that contains a
	 * 						Request with a triggerType attribute specified.
	 * 					
	 * <!-- end-model-doc -->
	 * @see #DATA_EVENT
	 * @model name="DataEvent"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_EVENT_VALUE = 0;

	/**
	 * The '<em><b>Periodic Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time-based event which occurs at the specified period. Expression is expected to be a Period literal
	 * 						expression specifying the period on which the
	 * 						event should be repeated
	 * 					
	 * <!-- end-model-doc -->
	 * @see #PERIODIC_EVENT
	 * @model name="PeriodicEvent"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_EVENT_VALUE = 1;

	/**
	 * The '<em><b>Named Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A named event.
	 * 					
	 * <!-- end-model-doc -->
	 * @see #NAMED_EVENT
	 * @model name="NamedEvent"
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_EVENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventType[] VALUES_ARRAY =
		new EventType[] {
			DATA_EVENT,
			PERIODIC_EVENT,
			NAMED_EVENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventType get(int value) {
		switch (value) {
			case DATA_EVENT_VALUE: return DATA_EVENT;
			case PERIODIC_EVENT_VALUE: return PERIODIC_EVENT;
			case NAMED_EVENT_VALUE: return NAMED_EVENT;
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
	private EventType(int value, String name, String literal) {
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
	
} //EventType
