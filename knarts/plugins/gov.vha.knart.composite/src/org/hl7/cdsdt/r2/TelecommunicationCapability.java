/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Telecommunication Capability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * One or more codes advising a system or user what telecommunication capabilities are known to be associated with the telecommunication address. 
 * 
 * CodeSystem "TelecommunicationCapabilities", OID: 2.16.840.1.113883.5.1118, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getTelecommunicationCapability()
 * @model extendedMetaData="name='TelecommunicationCapability'"
 * @generated
 */
public enum TelecommunicationCapability implements Enumerator {
	/**
	 * The '<em><b>Voice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOICE_VALUE
	 * @generated
	 * @ordered
	 */
	VOICE(0, "voice", "voice"),

	/**
	 * The '<em><b>Fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(1, "fax", "fax"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(2, "data", "data"),

	/**
	 * The '<em><b>Tty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTY_VALUE
	 * @generated
	 * @ordered
	 */
	TTY(3, "tty", "tty"),

	/**
	 * The '<em><b>Sms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(4, "sms", "sms");

	/**
	 * The '<em><b>Voice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voice : This device can receive voice calls (i.e. talking to another person, or a recording device, or a voice activated computer)
	 * <!-- end-model-doc -->
	 * @see #VOICE
	 * @model name="voice"
	 * @generated
	 * @ordered
	 */
	public static final int VOICE_VALUE = 0;

	/**
	 * The '<em><b>Fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fax : This device can receive faxes.
	 * <!-- end-model-doc -->
	 * @see #FAX
	 * @model name="fax"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 1;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data : This device can receive data calls (i.e. modem)
	 * <!-- end-model-doc -->
	 * @see #DATA
	 * @model name="data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 2;

	/**
	 * The '<em><b>Tty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text : This device is a text telephone.
	 * <!-- end-model-doc -->
	 * @see #TTY
	 * @model name="tty"
	 * @generated
	 * @ordered
	 */
	public static final int TTY_VALUE = 3;

	/**
	 * The '<em><b>Sms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SMS : This device can receive SMS messages
	 * <!-- end-model-doc -->
	 * @see #SMS
	 * @model name="sms"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Telecommunication Capability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TelecommunicationCapability[] VALUES_ARRAY =
		new TelecommunicationCapability[] {
			VOICE,
			FAX,
			DATA,
			TTY,
			SMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Telecommunication Capability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TelecommunicationCapability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Telecommunication Capability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationCapability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecommunicationCapability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecommunication Capability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationCapability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecommunicationCapability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecommunication Capability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationCapability get(int value) {
		switch (value) {
			case VOICE_VALUE: return VOICE;
			case FAX_VALUE: return FAX;
			case DATA_VALUE: return DATA;
			case TTY_VALUE: return TTY;
			case SMS_VALUE: return SMS;
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
	private TelecommunicationCapability(int value, String name, String literal) {
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
	
} //TelecommunicationCapability
