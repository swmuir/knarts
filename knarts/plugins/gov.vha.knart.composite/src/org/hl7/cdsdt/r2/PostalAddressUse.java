/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Postal Address Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A set of codes advising a system or user which address in a set of like addresses to select for a given purpose. 
 * 
 * CodeSystem "PostalAddressUse", OID: 2.16.840.1.113883.5.1012, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getPostalAddressUse()
 * @model extendedMetaData="name='PostalAddressUse'"
 * @generated
 */
public enum PostalAddressUse implements Enumerator {
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
	 * The '<em><b>PHYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYS_VALUE
	 * @generated
	 * @ordered
	 */
	PHYS(7, "PHYS", "PHYS"),

	/**
	 * The '<em><b>PST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PST_VALUE
	 * @generated
	 * @ordered
	 */
	PST(8, "PST", "PST"),

	/**
	 * The '<em><b>TMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMP_VALUE
	 * @generated
	 * @ordered
	 */
	TMP(9, "TMP", "TMP"),

	/**
	 * The '<em><b>ABC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABC_VALUE
	 * @generated
	 * @ordered
	 */
	ABC(10, "ABC", "ABC"),

	/**
	 * The '<em><b>IDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDE_VALUE
	 * @generated
	 * @ordered
	 */
	IDE(11, "IDE", "IDE"),

	/**
	 * The '<em><b>SYL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYL_VALUE
	 * @generated
	 * @ordered
	 */
	SYL(12, "SYL", "SYL"),

	/**
	 * The '<em><b>SRCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRCH_VALUE
	 * @generated
	 * @ordered
	 */
	SRCH(13, "SRCH", "SRCH"),

	/**
	 * The '<em><b>SNDX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNDX_VALUE
	 * @generated
	 * @ordered
	 */
	SNDX(14, "SNDX", "SNDX"),

	/**
	 * The '<em><b>PHON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHON_VALUE
	 * @generated
	 * @ordered
	 */
	PHON(15, "PHON", "PHON");

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Home address : A communication address at a home, attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
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
	 * Vacation Home: A vacation home, to reach a person while on vacation.
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
	 * The '<em><b>PHYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical Visit Address: Used primarily to visit an address.
	 * <!-- end-model-doc -->
	 * @see #PHYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHYS_VALUE = 7;

	/**
	 * The '<em><b>PST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postal Address: Used to send mail.
	 * <!-- end-model-doc -->
	 * @see #PST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PST_VALUE = 8;

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
	public static final int TMP_VALUE = 9;

	/**
	 * The '<em><b>ABC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alphabetic: Alphabetic transcription of name (Japanese: romaji)
	 * <!-- end-model-doc -->
	 * @see #ABC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABC_VALUE = 10;

	/**
	 * The '<em><b>IDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ideographic: Ideographic representation of name (e.g., Japanese kanji, Chinese characters)
	 * <!-- end-model-doc -->
	 * @see #IDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDE_VALUE = 11;

	/**
	 * The '<em><b>SYL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Syllabic: Syllabic transcription of name (e.g., Japanese kana, Korean hangul)
	 * <!-- end-model-doc -->
	 * @see #SYL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYL_VALUE = 12;

	/**
	 * The '<em><b>SRCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Type Uses: A name intended for use in searching or matching.
	 * <!-- end-model-doc -->
	 * @see #SRCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRCH_VALUE = 13;

	/**
	 * The '<em><b>SNDX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soundex: An address spelled according to the SoundEx algorithm.
	 * <!-- end-model-doc -->
	 * @see #SNDX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNDX_VALUE = 14;

	/**
	 * The '<em><b>PHON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Phonetic: The address as understood by the data enterer, i.e. a close approximation of a phonetic spelling of the address, not based on a phonetic algorithm. 
	 * <!-- end-model-doc -->
	 * @see #PHON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHON_VALUE = 15;

	/**
	 * An array of all the '<em><b>Postal Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PostalAddressUse[] VALUES_ARRAY =
		new PostalAddressUse[] {
			H,
			HP,
			HV,
			WP,
			DIR,
			PUB,
			BAD,
			PHYS,
			PST,
			TMP,
			ABC,
			IDE,
			SYL,
			SRCH,
			SNDX,
			PHON,
		};

	/**
	 * A public read-only list of all the '<em><b>Postal Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PostalAddressUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalAddressUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalAddressUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalAddressUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalAddressUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PostalAddressUse get(int value) {
		switch (value) {
			case H_VALUE: return H;
			case HP_VALUE: return HP;
			case HV_VALUE: return HV;
			case WP_VALUE: return WP;
			case DIR_VALUE: return DIR;
			case PUB_VALUE: return PUB;
			case BAD_VALUE: return BAD;
			case PHYS_VALUE: return PHYS;
			case PST_VALUE: return PST;
			case TMP_VALUE: return TMP;
			case ABC_VALUE: return ABC;
			case IDE_VALUE: return IDE;
			case SYL_VALUE: return SYL;
			case SRCH_VALUE: return SRCH;
			case SNDX_VALUE: return SNDX;
			case PHON_VALUE: return PHON;
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
	private PostalAddressUse(int value, String name, String literal) {
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
	
} //PostalAddressUse
