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
 * A representation of the literals of the enumeration '<em><b>Profile Destination Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProfileDestinationTypeList()
 * @model extendedMetaData="name='ProfileDestinationType-list'"
 * @generated
 */
public enum ProfileDestinationTypeList implements Enumerator {
	/**
	 * The '<em><b>FHIRDSTU2 Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2_SERVER(0, "FHIRDSTU2Server", "FHIR-DSTU2-Server"),

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2SDC_FORM_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2SDC_FORM_MANAGER(1, "FHIRDSTU2SDCFormManager", "FHIR-DSTU2-SDC-FormManager"),

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Receiver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2SDC_FORM_RECEIVER_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2SDC_FORM_RECEIVER(2, "FHIRDSTU2SDCFormReceiver", "FHIR-DSTU2-SDC-FormReceiver"),

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Processor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2SDC_FORM_PROCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2SDC_FORM_PROCESSOR(3, "FHIRDSTU2SDCFormProcessor", "FHIR-DSTU2-SDC-FormProcessor");

	/**
	 * The '<em><b>FHIRDSTU2 Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General DSTU2 server.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2_SERVER
	 * @model name="FHIRDSTU2Server" literal="FHIR-DSTU2-Server"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2_SERVER_VALUE = 0;

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSTU2 server that serves as an SDC-FormManager.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2SDC_FORM_MANAGER
	 * @model name="FHIRDSTU2SDCFormManager" literal="FHIR-DSTU2-SDC-FormManager"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2SDC_FORM_MANAGER_VALUE = 1;

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Receiver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSTU2 server that serves as an SDC-FormReceiver.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2SDC_FORM_RECEIVER
	 * @model name="FHIRDSTU2SDCFormReceiver" literal="FHIR-DSTU2-SDC-FormReceiver"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2SDC_FORM_RECEIVER_VALUE = 2;

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Processor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSTU2 server that serves as an SDC-FormProcessor.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2SDC_FORM_PROCESSOR
	 * @model name="FHIRDSTU2SDCFormProcessor" literal="FHIR-DSTU2-SDC-FormProcessor"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2SDC_FORM_PROCESSOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Profile Destination Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProfileDestinationTypeList[] VALUES_ARRAY =
		new ProfileDestinationTypeList[] {
			FHIRDSTU2_SERVER,
			FHIRDSTU2SDC_FORM_MANAGER,
			FHIRDSTU2SDC_FORM_RECEIVER,
			FHIRDSTU2SDC_FORM_PROCESSOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Profile Destination Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProfileDestinationTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Profile Destination Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileDestinationTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Destination Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileDestinationTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Destination Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationTypeList get(int value) {
		switch (value) {
			case FHIRDSTU2_SERVER_VALUE: return FHIRDSTU2_SERVER;
			case FHIRDSTU2SDC_FORM_MANAGER_VALUE: return FHIRDSTU2SDC_FORM_MANAGER;
			case FHIRDSTU2SDC_FORM_RECEIVER_VALUE: return FHIRDSTU2SDC_FORM_RECEIVER;
			case FHIRDSTU2SDC_FORM_PROCESSOR_VALUE: return FHIRDSTU2SDC_FORM_PROCESSOR;
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
	private ProfileDestinationTypeList(int value, String name, String literal) {
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
	
} //ProfileDestinationTypeList
