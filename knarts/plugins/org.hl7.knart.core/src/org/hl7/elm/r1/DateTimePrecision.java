/**
 */
package org.hl7.elm.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Date Time Precision</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The DateTimePrecision type specifies the units of precision available for temporal operations such as DurationBetween, SameAs, SameOrBefore, SameOrAfter, and DateTimeComponentFrom.
 * <!-- end-model-doc -->
 * @see org.hl7.elm.r1.R1Package#getDateTimePrecision()
 * @model extendedMetaData="name='DateTimePrecision'"
 * @generated
 */
public enum DateTimePrecision implements Enumerator {
	/**
	 * The '<em><b>Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(0, "Year", "Year"),

	/**
	 * The '<em><b>Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(1, "Month", "Month"),

	/**
	 * The '<em><b>Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	WEEK(2, "Week", "Week"),

	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(3, "Day", "Day"),

	/**
	 * The '<em><b>Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(4, "Hour", "Hour"),

	/**
	 * The '<em><b>Minute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTE(5, "Minute", "Minute"),

	/**
	 * The '<em><b>Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND(6, "Second", "Second"),

	/**
	 * The '<em><b>Millisecond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLISECOND_VALUE
	 * @generated
	 * @ordered
	 */
	MILLISECOND(7, "Millisecond", "Millisecond");

	/**
	 * The '<em><b>Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model name="Year"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 0;

	/**
	 * The '<em><b>Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model name="Month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 1;

	/**
	 * The '<em><b>Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Week</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEEK
	 * @model name="Week"
	 * @generated
	 * @ordered
	 */
	public static final int WEEK_VALUE = 2;

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model name="Day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 3;

	/**
	 * The '<em><b>Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model name="Hour"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 4;

	/**
	 * The '<em><b>Minute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTE
	 * @model name="Minute"
	 * @generated
	 * @ordered
	 */
	public static final int MINUTE_VALUE = 5;

	/**
	 * The '<em><b>Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Second</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOND
	 * @model name="Second"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_VALUE = 6;

	/**
	 * The '<em><b>Millisecond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Millisecond</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILLISECOND
	 * @model name="Millisecond"
	 * @generated
	 * @ordered
	 */
	public static final int MILLISECOND_VALUE = 7;

	/**
	 * An array of all the '<em><b>Date Time Precision</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DateTimePrecision[] VALUES_ARRAY =
		new DateTimePrecision[] {
			YEAR,
			MONTH,
			WEEK,
			DAY,
			HOUR,
			MINUTE,
			SECOND,
			MILLISECOND,
		};

	/**
	 * A public read-only list of all the '<em><b>Date Time Precision</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DateTimePrecision> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Time Precision</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimePrecision get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateTimePrecision result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Time Precision</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimePrecision getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DateTimePrecision result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Date Time Precision</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DateTimePrecision get(int value) {
		switch (value) {
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case WEEK_VALUE: return WEEK;
			case DAY_VALUE: return DAY;
			case HOUR_VALUE: return HOUR;
			case MINUTE_VALUE: return MINUTE;
			case SECOND_VALUE: return SECOND;
			case MILLISECOND_VALUE: return MILLISECOND;
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
	private DateTimePrecision(int value, String name, String literal) {
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
	
} //DateTimePrecision
