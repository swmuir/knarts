/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of types of events related to access, creation, removal, or update of data.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getDataEventType()
 * @model extendedMetaData="name='DataEventType'"
 * @generated
 */
public enum DataEventType implements Enumerator {
	/**
	 * The '<em><b>Data Element Added</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT_ADDED(0, "DataElementAdded", "DataElementAdded"),

	/**
	 * The '<em><b>Data Element Modified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT_MODIFIED(1, "DataElementModified", "DataElementModified"),

	/**
	 * The '<em><b>Data Element Removed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT_REMOVED(2, "DataElementRemoved", "DataElementRemoved"),

	/**
	 * The '<em><b>Data Element Accessed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ACCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT_ACCESSED(3, "DataElementAccessed", "DataElementAccessed"),

	/**
	 * The '<em><b>Data Element Access Ended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ACCESS_ENDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT_ACCESS_ENDED(4, "DataElementAccessEnded", "DataElementAccessEnded");

	/**
	 * The '<em><b>Data Element Added</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Element Added</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ADDED
	 * @model name="DataElementAdded"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_ADDED_VALUE = 0;

	/**
	 * The '<em><b>Data Element Modified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Element Modified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_MODIFIED
	 * @model name="DataElementModified"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_MODIFIED_VALUE = 1;

	/**
	 * The '<em><b>Data Element Removed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Element Removed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_REMOVED
	 * @model name="DataElementRemoved"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_REMOVED_VALUE = 2;

	/**
	 * The '<em><b>Data Element Accessed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Element Accessed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ACCESSED
	 * @model name="DataElementAccessed"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_ACCESSED_VALUE = 3;

	/**
	 * The '<em><b>Data Element Access Ended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Element Access Ended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_ACCESS_ENDED
	 * @model name="DataElementAccessEnded"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_ACCESS_ENDED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Data Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataEventType[] VALUES_ARRAY =
		new DataEventType[] {
			DATA_ELEMENT_ADDED,
			DATA_ELEMENT_MODIFIED,
			DATA_ELEMENT_REMOVED,
			DATA_ELEMENT_ACCESSED,
			DATA_ELEMENT_ACCESS_ENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataEventType get(int value) {
		switch (value) {
			case DATA_ELEMENT_ADDED_VALUE: return DATA_ELEMENT_ADDED;
			case DATA_ELEMENT_MODIFIED_VALUE: return DATA_ELEMENT_MODIFIED;
			case DATA_ELEMENT_REMOVED_VALUE: return DATA_ELEMENT_REMOVED;
			case DATA_ELEMENT_ACCESSED_VALUE: return DATA_ELEMENT_ACCESSED;
			case DATA_ELEMENT_ACCESS_ENDED_VALUE: return DATA_ELEMENT_ACCESS_ENDED;
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
	private DataEventType(int value, String name, String literal) {
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
	
} //DataEventType
