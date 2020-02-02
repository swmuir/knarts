/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A specification of a constraint on the range of values for an item.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getValueType()
 * @model extendedMetaData="name='ValueType'"
 * @generated
 */
public enum ValueType implements Enumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(0, "Boolean", "Boolean"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(1, "Code", "Code"),

	/**
	 * The '<em><b>Coded Ordinal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODED_ORDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	CODED_ORDINAL(2, "CodedOrdinal", "CodedOrdinal"),

	/**
	 * The '<em><b>Entity Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY_NAME(3, "EntityName", "EntityName"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(4, "Identifier", "Identifier"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(5, "Integer", "Integer"),

	/**
	 * The '<em><b>Integer Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_INTERVAL(6, "IntegerInterval", "IntegerInterval"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(7, "Period", "Period"),

	/**
	 * The '<em><b>Physical Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_QUANTITY(8, "PhysicalQuantity", "PhysicalQuantity"),

	/**
	 * The '<em><b>Physical Quantity Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_QUANTITY_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_QUANTITY_INTERVAL(9, "PhysicalQuantityInterval", "PhysicalQuantityInterval"),

	/**
	 * The '<em><b>Quantity Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY_INTERVAL(10, "QuantityInterval", "QuantityInterval"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(11, "Ratio", "Ratio"),

	/**
	 * The '<em><b>Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(12, "Real", "Real"),

	/**
	 * The '<em><b>Real Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_INTERVAL(13, "RealInterval", "RealInterval"),

	/**
	 * The '<em><b>Simple Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_CODE(14, "SimpleCode", "SimpleCode"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(15, "String", "String"),

	/**
	 * The '<em><b>Timestamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(16, "Timestamp", "Timestamp"),

	/**
	 * The '<em><b>Timestamp Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP_INTERVAL(17, "TimestampInterval", "TimestampInterval"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(18, "URL", "URL"), /**
	 * The '<em><b>Tuple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUPLE_VALUE
	 * @generated
	 * @ordered
	 */
	TUPLE(19, "Tuple", "Tuple");

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE
	 * @model name="Code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 1;

	/**
	 * The '<em><b>Coded Ordinal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coded Ordinal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODED_ORDINAL
	 * @model name="CodedOrdinal"
	 * @generated
	 * @ordered
	 */
	public static final int CODED_ORDINAL_VALUE = 2;

	/**
	 * The '<em><b>Entity Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entity Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTITY_NAME
	 * @model name="EntityName"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_NAME_VALUE = 3;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER
	 * @model name="Identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 4;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 5;

	/**
	 * The '<em><b>Integer Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERVAL
	 * @model name="IntegerInterval"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_INTERVAL_VALUE = 6;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Period</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIOD
	 * @model name="Period"
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 7;

	/**
	 * The '<em><b>Physical Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Physical Quantity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_QUANTITY
	 * @model name="PhysicalQuantity"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_QUANTITY_VALUE = 8;

	/**
	 * The '<em><b>Physical Quantity Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Physical Quantity Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_QUANTITY_INTERVAL
	 * @model name="PhysicalQuantityInterval"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_QUANTITY_INTERVAL_VALUE = 9;

	/**
	 * The '<em><b>Quantity Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantity Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_INTERVAL
	 * @model name="QuantityInterval"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_INTERVAL_VALUE = 10;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ratio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATIO
	 * @model name="Ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 11;

	/**
	 * The '<em><b>Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model name="Real"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 12;

	/**
	 * The '<em><b>Real Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL_INTERVAL
	 * @model name="RealInterval"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_INTERVAL_VALUE = 13;

	/**
	 * The '<em><b>Simple Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_CODE
	 * @model name="SimpleCode"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_CODE_VALUE = 14;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 15;

	/**
	 * The '<em><b>Timestamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model name="Timestamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 16;

	/**
	 * The '<em><b>Timestamp Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_INTERVAL
	 * @model name="TimestampInterval"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_INTERVAL_VALUE = 17;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 18;

	/**
	 * The '<em><b>Tuple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tuple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUPLE
	 * @model name="Tuple"
	 * @generated
	 * @ordered
	 */
	public static final int TUPLE_VALUE = 19;

	/**
	 * An array of all the '<em><b>Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValueType[] VALUES_ARRAY =
		new ValueType[] {
			BOOLEAN,
			CODE,
			CODED_ORDINAL,
			ENTITY_NAME,
			IDENTIFIER,
			INTEGER,
			INTEGER_INTERVAL,
			PERIOD,
			PHYSICAL_QUANTITY,
			PHYSICAL_QUANTITY_INTERVAL,
			QUANTITY_INTERVAL,
			RATIO,
			REAL,
			REAL_INTERVAL,
			SIMPLE_CODE,
			STRING,
			TIMESTAMP,
			TIMESTAMP_INTERVAL,
			URL,
			TUPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValueType get(int value) {
		switch (value) {
			case BOOLEAN_VALUE: return BOOLEAN;
			case CODE_VALUE: return CODE;
			case CODED_ORDINAL_VALUE: return CODED_ORDINAL;
			case ENTITY_NAME_VALUE: return ENTITY_NAME;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case INTEGER_VALUE: return INTEGER;
			case INTEGER_INTERVAL_VALUE: return INTEGER_INTERVAL;
			case PERIOD_VALUE: return PERIOD;
			case PHYSICAL_QUANTITY_VALUE: return PHYSICAL_QUANTITY;
			case PHYSICAL_QUANTITY_INTERVAL_VALUE: return PHYSICAL_QUANTITY_INTERVAL;
			case QUANTITY_INTERVAL_VALUE: return QUANTITY_INTERVAL;
			case RATIO_VALUE: return RATIO;
			case REAL_VALUE: return REAL;
			case REAL_INTERVAL_VALUE: return REAL_INTERVAL;
			case SIMPLE_CODE_VALUE: return SIMPLE_CODE;
			case STRING_VALUE: return STRING;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case TIMESTAMP_INTERVAL_VALUE: return TIMESTAMP_INTERVAL;
			case URL_VALUE: return URL;
			case TUPLE_VALUE: return TUPLE;
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
	private ValueType(int value, String name, String literal) {
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
	
} //ValueType
