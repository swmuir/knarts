/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Telecommunication Address Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * One or more codes advising a system or user which telecommunication address in a set of like addresses to select for a given telecommunication need. 
 * 
 * CodeSystem "TelecommunicationAddressUse", OID: 2.16.840.1.113883.5.1011, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getTelecommunicationAddressUse()
 * @model extendedMetaData="name='TelecommunicationAddressUse'"
 * @generated
 */
public enum TelecommunicationAddressUse implements Enumerator {
	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(0, "H", "H"),

	/**
	 * The '<em><b>HP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_VALUE
	 * @generated
	 * @ordered
	 */
	HP(1, "HP", "HP"),

	/**
	 * The '<em><b>HV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HV_VALUE
	 * @generated
	 * @ordered
	 */
	HV(2, "HV", "HV"),

	/**
	 * The '<em><b>WP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WP_VALUE
	 * @generated
	 * @ordered
	 */
	WP(3, "WP", "WP"),

	/**
	 * The '<em><b>DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIR_VALUE
	 * @generated
	 * @ordered
	 */
	DIR(4, "DIR", "DIR"),

	/**
	 * The '<em><b>PUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUB_VALUE
	 * @generated
	 * @ordered
	 */
	PUB(5, "PUB", "PUB"),

	/**
	 * The '<em><b>BAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_VALUE
	 * @generated
	 * @ordered
	 */
	BAD(6, "BAD", "BAD"),

	/**
	 * The '<em><b>TMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMP_VALUE
	 * @generated
	 * @ordered
	 */
	TMP(7, "TMP", "TMP"),

	/**
	 * The '<em><b>AS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_VALUE
	 * @generated
	 * @ordered
	 */
	AS(8, "AS", "AS"),

	/**
	 * The '<em><b>EC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EC_VALUE
	 * @generated
	 * @ordered
	 */
	EC(9, "EC", "EC"),

	/**
	 * The '<em><b>MC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MC_VALUE
	 * @generated
	 * @ordered
	 */
	MC(10, "MC", "MC"),

	/**
	 * The '<em><b>PG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PG_VALUE
	 * @generated
	 * @ordered
	 */
	PG(11, "PG", "PG");

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Home address : A communication address at a home, attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available
	 * <!-- end-model-doc -->
	 * @see #H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 0;

	/**
	 * The '<em><b>HP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary Home: The primary home, to reach a person after business hours.
	 * <!-- end-model-doc -->
	 * @see #HP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HP_VALUE = 1;

	/**
	 * The '<em><b>HV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vacation Home: vacation home, to reach a person while on vacation.
	 * <!-- end-model-doc -->
	 * @see #HV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HV_VALUE = 2;

	/**
	 * The '<em><b>WP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Work Place: An office address. First choice for business related contacts during business hours.
	 * <!-- end-model-doc -->
	 * @see #WP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WP_VALUE = 3;

	/**
	 * The '<em><b>DIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct: Indicates a work place address or telecommunication address that reaches the individual or organization directly without intermediaries. For phones, often referred to as a 'private line'. 
	 * <!-- end-model-doc -->
	 * @see #DIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIR_VALUE = 4;

	/**
	 * The '<em><b>PUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public: Indicates a work place address or telecommunication address that is a 'standard' address which may reach a reception service, mail-room, or other intermediary prior to the target entity. 
	 * <!-- end-model-doc -->
	 * @see #PUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUB_VALUE = 5;

	/**
	 * The '<em><b>BAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bad Address: A flag indicating that the address is bad, in fact, useless.
	 * <!-- end-model-doc -->
	 * @see #BAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_VALUE = 6;

	/**
	 * The '<em><b>TMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary Address: A temporary address, may be good for visit or mailing. Note that an address history can provide more detailed information.
	 * <!-- end-model-doc -->
	 * @see #TMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TMP_VALUE = 7;

	/**
	 * The '<em><b>AS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Answering Service: An automated answering machine used for less urgent cases and if the main purpose of contact is to leave a message or access an automated announcement. 
	 * <!-- end-model-doc -->
	 * @see #AS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AS_VALUE = 8;

	/**
	 * The '<em><b>EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emergency Contact: A contact specifically designated to be used for emergencies. This is the first choice in emergencies, independent of any other use codes. 
	 * <!-- end-model-doc -->
	 * @see #EC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EC_VALUE = 9;

	/**
	 * The '<em><b>MC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mobile Contact: A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business. 
	 * <!-- end-model-doc -->
	 * @see #MC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MC_VALUE = 10;

	/**
	 * The '<em><b>PG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pager: A paging device suitable to solicit a callback or to leave a very short message.
	 * <!-- end-model-doc -->
	 * @see #PG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PG_VALUE = 11;

	/**
	 * An array of all the '<em><b>Telecommunication Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TelecommunicationAddressUse[] VALUES_ARRAY =
		new TelecommunicationAddressUse[] {
			H,
			HP,
			HV,
			WP,
			DIR,
			PUB,
			BAD,
			TMP,
			AS,
			EC,
			MC,
			PG,
		};

	/**
	 * A public read-only list of all the '<em><b>Telecommunication Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TelecommunicationAddressUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Telecommunication Address Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationAddressUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecommunicationAddressUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecommunication Address Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationAddressUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TelecommunicationAddressUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Telecommunication Address Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TelecommunicationAddressUse get(int value) {
		switch (value) {
			case H_VALUE: return H;
			case HP_VALUE: return HP;
			case HV_VALUE: return HV;
			case WP_VALUE: return WP;
			case DIR_VALUE: return DIR;
			case PUB_VALUE: return PUB;
			case BAD_VALUE: return BAD;
			case TMP_VALUE: return TMP;
			case AS_VALUE: return AS;
			case EC_VALUE: return EC;
			case MC_VALUE: return MC;
			case PG_VALUE: return PG;
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
	private TelecommunicationAddressUse(int value, String name, String literal) {
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
	
} //TelecommunicationAddressUse
