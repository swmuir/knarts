/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Address Part Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specifies whether an address part names the street, city, country, postal code, post box, etc. If the type is NULL the address part is unclassified. 
 * 
 * CodeSystem "AddressPartType", OID: 2.16.840.1.113883.5.16, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getAddressPartType()
 * @model extendedMetaData="name='AddressPartType'"
 * @generated
 */
public enum AddressPartType implements Enumerator {
	/**
	 * The '<em><b>AL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AL_VALUE
	 * @generated
	 * @ordered
	 */
	AL(0, "AL", "AL"),

	/**
	 * The '<em><b>ADL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADL_VALUE
	 * @generated
	 * @ordered
	 */
	ADL(1, "ADL", "ADL"),

	/**
	 * The '<em><b>UNID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNID_VALUE
	 * @generated
	 * @ordered
	 */
	UNID(2, "UNID", "UNID"),

	/**
	 * The '<em><b>UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(3, "UNIT", "UNIT"),

	/**
	 * The '<em><b>DAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_VALUE
	 * @generated
	 * @ordered
	 */
	DAL(4, "DAL", "DAL"),

	/**
	 * The '<em><b>DINST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINST_VALUE
	 * @generated
	 * @ordered
	 */
	DINST(5, "DINST", "DINST"),

	/**
	 * The '<em><b>DINSTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINSTA_VALUE
	 * @generated
	 * @ordered
	 */
	DINSTA(6, "DINSTA", "DINSTA"),

	/**
	 * The '<em><b>DINSTQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINSTQ_VALUE
	 * @generated
	 * @ordered
	 */
	DINSTQ(7, "DINSTQ", "DINSTQ"),

	/**
	 * The '<em><b>DMOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMOD_VALUE
	 * @generated
	 * @ordered
	 */
	DMOD(8, "DMOD", "DMOD"),

	/**
	 * The '<em><b>DMODID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMODID_VALUE
	 * @generated
	 * @ordered
	 */
	DMODID(9, "DMODID", "DMODID"),

	/**
	 * The '<em><b>SAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAL_VALUE
	 * @generated
	 * @ordered
	 */
	SAL(10, "SAL", "SAL"),

	/**
	 * The '<em><b>BNR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNR_VALUE
	 * @generated
	 * @ordered
	 */
	BNR(11, "BNR", "BNR"),

	/**
	 * The '<em><b>BNN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNN_VALUE
	 * @generated
	 * @ordered
	 */
	BNN(12, "BNN", "BNN"),

	/**
	 * The '<em><b>BNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNS_VALUE
	 * @generated
	 * @ordered
	 */
	BNS(13, "BNS", "BNS"),

	/**
	 * The '<em><b>STR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STR_VALUE
	 * @generated
	 * @ordered
	 */
	STR(14, "STR", "STR"),

	/**
	 * The '<em><b>STB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STB_VALUE
	 * @generated
	 * @ordered
	 */
	STB(15, "STB", "STB"),

	/**
	 * The '<em><b>STTYP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STTYP_VALUE
	 * @generated
	 * @ordered
	 */
	STTYP(16, "STTYP", "STTYP"),

	/**
	 * The '<em><b>DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIR_VALUE
	 * @generated
	 * @ordered
	 */
	DIR(17, "DIR", "DIR"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(18, "INT", "INT"),

	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(19, "CAR", "CAR"),

	/**
	 * The '<em><b>CEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEN_VALUE
	 * @generated
	 * @ordered
	 */
	CEN(20, "CEN", "CEN"),

	/**
	 * The '<em><b>CNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNT_VALUE
	 * @generated
	 * @ordered
	 */
	CNT(21, "CNT", "CNT"),

	/**
	 * The '<em><b>CPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPA_VALUE
	 * @generated
	 * @ordered
	 */
	CPA(22, "CPA", "CPA"),

	/**
	 * The '<em><b>CTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTY_VALUE
	 * @generated
	 * @ordered
	 */
	CTY(23, "CTY", "CTY"),

	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(24, "DEL", "DEL"),

	/**
	 * The '<em><b>POB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POB_VALUE
	 * @generated
	 * @ordered
	 */
	POB(25, "POB", "POB"),

	/**
	 * The '<em><b>PRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE(26, "PRE", "PRE"),

	/**
	 * The '<em><b>STA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STA_VALUE
	 * @generated
	 * @ordered
	 */
	STA(27, "STA", "STA"),

	/**
	 * The '<em><b>ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	ZIP(28, "ZIP", "ZIP"),

	/**
	 * The '<em><b>DPID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPID_VALUE
	 * @generated
	 * @ordered
	 */
	DPID(29, "DPID", "DPID");

	/**
	 * The '<em><b>AL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address Line: An address line is for either an additional locator, a delivery address or a street address. An address generally has only a delivery address line or a street address line, but not both. 
	 * <!-- end-model-doc -->
	 * @see #AL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AL_VALUE = 0;

	/**
	 * The '<em><b>ADL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Locator : This can be a unit designator, such as apartment number, suite number, or floor. There may be several unit designators in an address (e.g., "3rd floor, Appt. 342"). This can also be a designator pointing away from the location, rather than specifying a smaller location within some larger one (e.g., Dutch "t.o." means "opposite to" for house boats located across the street facing houses)
	 * <!-- end-model-doc -->
	 * @see #ADL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADL_VALUE = 1;

	/**
	 * The '<em><b>UNID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit Identifier : The number or name of a specific unit contained within a building or complex, as assigned by that building or complex
	 * <!-- end-model-doc -->
	 * @see #UNID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNID_VALUE = 2;

	/**
	 * The '<em><b>UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit Designator: Indicates the type of specific unit contained within a building or complex. E.g. Apartment, Floor
	 * <!-- end-model-doc -->
	 * @see #UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 3;

	/**
	 * The '<em><b>DAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Address Line: A delivery address line is frequently used instead of breaking out delivery mode, delivery installation, etc. An address generally has only a delivery address line or a street address line, but not both. 
	 * <!-- end-model-doc -->
	 * @see #DAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_VALUE = 4;

	/**
	 * The '<em><b>DINST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Installation Type: Indicates the type of delivery installation (the facility to which the mail will be delivered prior to final shipping via the delivery mode.) Example: post office, letter carrier depot, community mail center, station, etc. 
	 * <!-- end-model-doc -->
	 * @see #DINST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINST_VALUE = 5;

	/**
	 * The '<em><b>DINSTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Installation Area: The location of the delivery installation, usually a town or city, and is only required if the area is different from the municipality. Area to which mail delivery service is provided from any postal facility or service such as an individual letter carrier, rural route, or postal route. 
	 * <!-- end-model-doc -->
	 * @see #DINSTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINSTA_VALUE = 6;

	/**
	 * The '<em><b>DINSTQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Installation Qualifier: A number, letter or name identifying a delivery installation. E.g., for Station A, the delivery installation qualifier would be 'A'. 
	 * <!-- end-model-doc -->
	 * @see #DINSTQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINSTQ_VALUE = 7;

	/**
	 * The '<em><b>DMOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Mode: Indicates the type of service offered, method of delivery. For example: post office box, rural route, general delivery, etc.
	 * <!-- end-model-doc -->
	 * @see #DMOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMOD_VALUE = 8;

	/**
	 * The '<em><b>DMODID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Mode Identifier: Represents the routing information such as a letter carrier route number. It is the identifying number of the designator (the box number or rural route number). 
	 * <!-- end-model-doc -->
	 * @see #DMODID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMODID_VALUE = 9;

	/**
	 * The '<em><b>SAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Street Address Line: A street address line is frequently used instead of breaking out build number, street name, street type, etc. An address generally has only a delivery address line or a street address line, but not both. 
	 * <!-- end-model-doc -->
	 * @see #SAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAL_VALUE = 10;

	/**
	 * The '<em><b>BNR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Building Number: The number of a building, house or lot alongside the street. Also known as "primary street number". This does not number the street but rather the building. 
	 * <!-- end-model-doc -->
	 * @see #BNR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNR_VALUE = 11;

	/**
	 * The '<em><b>BNN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Building Number Numeric: The numeric portion of a building number
	 * <!-- end-model-doc -->
	 * @see #BNN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNN_VALUE = 12;

	/**
	 * The '<em><b>BNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Building Number Suffix: Any alphabetic character, fraction or other text that may appear after the numeric portion of a building number
	 * <!-- end-model-doc -->
	 * @see #BNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNS_VALUE = 13;

	/**
	 * The '<em><b>STR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Street Name: The name of the street, including the type
	 * <!-- end-model-doc -->
	 * @see #STR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STR_VALUE = 14;

	/**
	 * The '<em><b>STB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Street Name Base: The base name of a roadway or artery recognized by a municipality (excluding street type and direction)
	 * <!-- end-model-doc -->
	 * @see #STB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STB_VALUE = 15;

	/**
	 * The '<em><b>STTYP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Street Type: The designation given to the street. (e.g. Street, Avenue, Crescent, etc.)
	 * <!-- end-model-doc -->
	 * @see #STTYP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STTYP_VALUE = 16;

	/**
	 * The '<em><b>DIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direction (e.g., N, S, W, E)
	 * <!-- end-model-doc -->
	 * @see #DIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIR_VALUE = 17;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intersection: An intersection denotes that the actual address is located at or close to the intersection of two or more streets
	 * <!-- end-model-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 18;

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Care Of: The name of the party who will take receipt at the specified address, and will take on responsibility for ensuring delivery to the target recipient 
	 * <!-- end-model-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 19;

	/**
	 * The '<em><b>CEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Census Tract: A geographic sub-unit delineated for demographic purposes.
	 * <!-- end-model-doc -->
	 * @see #CEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEN_VALUE = 20;

	/**
	 * The '<em><b>CNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country
	 * <!-- end-model-doc -->
	 * @see #CNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNT_VALUE = 21;

	/**
	 * The '<em><b>CPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * County or Parish: A sub-unit of a state or province. (49 of the United States of America use the term "county;" Louisiana uses the term "parish".)
	 * <!-- end-model-doc -->
	 * @see #CPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPA_VALUE = 22;

	/**
	 * The '<em><b>CTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Municipality: The name of the city, town, village, or other community or delivery center
	 * <!-- end-model-doc -->
	 * @see #CTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTY_VALUE = 23;

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delimiter: Delimiters are printed without framing white space. If no value component is provided, the delimiter appears as a line break.
	 * <!-- end-model-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 24;

	/**
	 * The '<em><b>POB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Post Box: A numbered box located in a post station.
	 * <!-- end-model-doc -->
	 * @see #POB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POB_VALUE = 25;

	/**
	 * The '<em><b>PRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precinct: A subsection of a municipality
	 * <!-- end-model-doc -->
	 * @see #PRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_VALUE = 26;

	/**
	 * The '<em><b>STA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State or Province: A sub-unit of a country with limited sovereignty in a federally organized country.
	 * <!-- end-model-doc -->
	 * @see #STA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STA_VALUE = 27;

	/**
	 * The '<em><b>ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postal Code: A postal code designating a region defined by the postal service.
	 * <!-- end-model-doc -->
	 * @see #ZIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_VALUE = 28;

	/**
	 * The '<em><b>DPID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delivery Point Identifier : A value that uniquely identifies the postal address.
	 * <!-- end-model-doc -->
	 * @see #DPID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPID_VALUE = 29;

	/**
	 * An array of all the '<em><b>Address Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddressPartType[] VALUES_ARRAY =
		new AddressPartType[] {
			AL,
			ADL,
			UNID,
			UNIT,
			DAL,
			DINST,
			DINSTA,
			DINSTQ,
			DMOD,
			DMODID,
			SAL,
			BNR,
			BNN,
			BNS,
			STR,
			STB,
			STTYP,
			DIR,
			INT,
			CAR,
			CEN,
			CNT,
			CPA,
			CTY,
			DEL,
			POB,
			PRE,
			STA,
			ZIP,
			DPID,
		};

	/**
	 * A public read-only list of all the '<em><b>Address Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddressPartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressPartType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressPartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressPartType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressPartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressPartType get(int value) {
		switch (value) {
			case AL_VALUE: return AL;
			case ADL_VALUE: return ADL;
			case UNID_VALUE: return UNID;
			case UNIT_VALUE: return UNIT;
			case DAL_VALUE: return DAL;
			case DINST_VALUE: return DINST;
			case DINSTA_VALUE: return DINSTA;
			case DINSTQ_VALUE: return DINSTQ;
			case DMOD_VALUE: return DMOD;
			case DMODID_VALUE: return DMODID;
			case SAL_VALUE: return SAL;
			case BNR_VALUE: return BNR;
			case BNN_VALUE: return BNN;
			case BNS_VALUE: return BNS;
			case STR_VALUE: return STR;
			case STB_VALUE: return STB;
			case STTYP_VALUE: return STTYP;
			case DIR_VALUE: return DIR;
			case INT_VALUE: return INT;
			case CAR_VALUE: return CAR;
			case CEN_VALUE: return CEN;
			case CNT_VALUE: return CNT;
			case CPA_VALUE: return CPA;
			case CTY_VALUE: return CTY;
			case DEL_VALUE: return DEL;
			case POB_VALUE: return POB;
			case PRE_VALUE: return PRE;
			case STA_VALUE: return STA;
			case ZIP_VALUE: return ZIP;
			case DPID_VALUE: return DPID;
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
	private AddressPartType(int value, String name, String literal) {
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
	
} //AddressPartType
