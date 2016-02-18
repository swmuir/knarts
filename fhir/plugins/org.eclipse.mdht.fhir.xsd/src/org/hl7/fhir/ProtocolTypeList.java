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
 * A representation of the literals of the enumeration '<em><b>Protocol Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProtocolTypeList()
 * @model extendedMetaData="name='ProtocolType-list'"
 * @generated
 */
public enum ProtocolTypeList implements Enumerator {
	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(0, "condition", "condition"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(1, "device", "device"),

	/**
	 * The '<em><b>Drug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG(2, "drug", "drug"),

	/**
	 * The '<em><b>Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDY(3, "study", "study");

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol describes the steps to manage a particular health condition including monitoring, treatment, mitigation and/or follow-up
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 0;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol describes the appropriate use of a particular device (medical device, software, etc.)
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 1;

	/**
	 * The '<em><b>Drug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol describes the appropriate use of a particular medication including indications for use, dosages, treatment cycles, etc.
	 * <!-- end-model-doc -->
	 * @see #DRUG
	 * @model name="drug"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_VALUE = 2;

	/**
	 * The '<em><b>Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The protocol describes the set of steps to occur for study subjects enrolled in an interventional study
	 * <!-- end-model-doc -->
	 * @see #STUDY
	 * @model name="study"
	 * @generated
	 * @ordered
	 */
	public static final int STUDY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Protocol Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolTypeList[] VALUES_ARRAY =
		new ProtocolTypeList[] {
			CONDITION,
			DEVICE,
			DRUG,
			STUDY,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypeList get(int value) {
		switch (value) {
			case CONDITION_VALUE: return CONDITION;
			case DEVICE_VALUE: return DEVICE;
			case DRUG_VALUE: return DRUG;
			case STUDY_VALUE: return STUDY;
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
	private ProtocolTypeList(int value, String name, String literal) {
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
	
} //ProtocolTypeList
