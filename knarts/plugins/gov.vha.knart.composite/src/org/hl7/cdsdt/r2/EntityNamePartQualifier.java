/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Name Part Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The qualifier is a set of codes each of which specifies a certain subcategory of the name part in addition to the main name part type. For example, a given name may be flagged as a nickname, a family name may be a pseudonym or a name of public records. 
 * 
 * CodeSystem "EntityNamePartTypeQualifierR2", OID: 2.16.840.1.113883.5.1122, Owner: HL7 
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getEntityNamePartQualifier()
 * @model extendedMetaData="name='EntityNamePartQualifier'"
 * @generated
 */
public enum EntityNamePartQualifier implements Enumerator {
	/**
	 * The '<em><b>LS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LS_VALUE
	 * @generated
	 * @ordered
	 */
	LS(0, "LS", "LS"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(1, "AC", "AC"),

	/**
	 * The '<em><b>NB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NB_VALUE
	 * @generated
	 * @ordered
	 */
	NB(2, "NB", "NB"),

	/**
	 * The '<em><b>PR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PR_VALUE
	 * @generated
	 * @ordered
	 */
	PR(3, "PR", "PR"),

	/**
	 * The '<em><b>HON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HON_VALUE
	 * @generated
	 * @ordered
	 */
	HON(4, "HON", "HON"),

	/**
	 * The '<em><b>BR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BR_VALUE
	 * @generated
	 * @ordered
	 */
	BR(5, "BR", "BR"),

	/**
	 * The '<em><b>AD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD_VALUE
	 * @generated
	 * @ordered
	 */
	AD(6, "AD", "AD"),

	/**
	 * The '<em><b>SP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_VALUE
	 * @generated
	 * @ordered
	 */
	SP(7, "SP", "SP"),

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_VALUE
	 * @generated
	 * @ordered
	 */
	MID(8, "MID", "MID"),

	/**
	 * The '<em><b>CL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CL_VALUE
	 * @generated
	 * @ordered
	 */
	CL(9, "CL", "CL"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(10, "IN", "IN"),

	/**
	 * The '<em><b>PFX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PFX_VALUE
	 * @generated
	 * @ordered
	 */
	PFX(11, "PFX", "PFX"),

	/**
	 * The '<em><b>SFX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SFX_VALUE
	 * @generated
	 * @ordered
	 */
	SFX(12, "SFX", "SFX");

	/**
	 * The '<em><b>LS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Legal Status : For organizations a suffix indicating the legal status, e.g., "Inc.", "Co.", "AG", "GmbH", "B.V." "S.A.", "Ltd." Etc.
	 * <!-- end-model-doc -->
	 * @see #LS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LS_VALUE = 0;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic : Indicates that a prefix like "Dr." or a suffix like "M.D." or "Ph.D." is an academic title 
	 * <!-- end-model-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 1;

	/**
	 * The '<em><b>NB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nobility : In Europe and Asia, there are still people with nobility titles (aristocrats). German "von" is generally a nobility title, not a mere voorvoegsel. Others are "Earl of" or "His Majesty King of..." etc. Rarely used nowadays, but some systems do keep track of this 
	 * <!-- end-model-doc -->
	 * @see #NB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NB_VALUE = 2;

	/**
	 * The '<em><b>PR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Professional : Primarily in the British Imperial culture people tend to have an abbreviation of their professional organization as part of their credential suffices 
	 * <!-- end-model-doc -->
	 * @see #PR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PR_VALUE = 3;

	/**
	 * The '<em><b>HON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Honorific : A honorific such as "The Right Honourable" or "Weledelgeleerde Heer".  
	 * <!-- end-model-doc -->
	 * @see #HON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HON_VALUE = 4;

	/**
	 * The '<em><b>BR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Birth : A name that a person was given at birth or established as a consequence of adoption.  
	 * 
	 * Note: this is not used for temporary names assigned at birth such as "Baby of Smith" - which is just a name with a use code of "TEMP".
	 * <!-- end-model-doc -->
	 * @see #BR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BR_VALUE = 5;

	/**
	 * The '<em><b>AD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acquired : A name part a person acquired.  
	 * 
	 * The name part may be acquired by adoption, or the person may have chosen to use the name part for some other reason.
	 * 
	 * Note: this differs from an Other/Psuedonym/Alias in that an acquired name part is acquired on a formal basis rather than an informal one (e.g. registered as part of the official name)
	 * <!-- end-model-doc -->
	 * @see #AD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AD_VALUE = 6;

	/**
	 * The '<em><b>SP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spouse : The name assumed from the partner in a marital relationship. Usually the spouse's family name. Note that no inference about gender can be made from the existence of spouse names
	 * <!-- end-model-doc -->
	 * @see #SP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SP_VALUE = 7;

	/**
	 * The '<em><b>MID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Middle Name : Indicates that the name part is a middle name.
	 * Usage Notes:
	 * In general, the english 'middle name' concept is all of the given names after the first. This qualifier may be used to explicitly indicate which given names are considered to be middle names. 
	 * The middle name qualifier may also be used with family names. This is a Scandinavian use case, matching the concept of "mellomnavn" / "mellannamn". Note that there are specific rules that indicate what names may be taken as a mellannamn in different Scandinavian countries
	 * <!-- end-model-doc -->
	 * @see #MID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MID_VALUE = 8;

	/**
	 * The '<em><b>CL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Callme : Callme is used to indicate which of the various name parts is used when interacting with the person
	 * <!-- end-model-doc -->
	 * @see #CL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CL_VALUE = 9;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial : Indicates that a name part is just an initial. Initials do not imply a trailing period since this would not work with non-Latin scripts. Initials may consist of more than one letter, e.g., "Ph." could stand for "Philippe" or "Th." for "Thomas"
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 10;

	/**
	 * The '<em><b>PFX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix : A prefix has a strong association to the immediately following name part. A prefix has no implicit trailing white space (it has implicit leading white space though).
	 * <!-- end-model-doc -->
	 * @see #PFX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PFX_VALUE = 11;

	/**
	 * The '<em><b>SFX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suffix : A suffix has a strong association to the immediately preceding name part. A suffix has no implicit leading white space (it has implicit trailing white space though).
	 * <!-- end-model-doc -->
	 * @see #SFX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SFX_VALUE = 12;

	/**
	 * An array of all the '<em><b>Entity Name Part Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityNamePartQualifier[] VALUES_ARRAY =
		new EntityNamePartQualifier[] {
			LS,
			AC,
			NB,
			PR,
			HON,
			BR,
			AD,
			SP,
			MID,
			CL,
			IN,
			PFX,
			SFX,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Name Part Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityNamePartQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNamePartQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Part Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNamePartQualifier get(int value) {
		switch (value) {
			case LS_VALUE: return LS;
			case AC_VALUE: return AC;
			case NB_VALUE: return NB;
			case PR_VALUE: return PR;
			case HON_VALUE: return HON;
			case BR_VALUE: return BR;
			case AD_VALUE: return AD;
			case SP_VALUE: return SP;
			case MID_VALUE: return MID;
			case CL_VALUE: return CL;
			case IN_VALUE: return IN;
			case PFX_VALUE: return PFX;
			case SFX_VALUE: return SFX;
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
	private EntityNamePartQualifier(int value, String name, String literal) {
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
	
} //EntityNamePartQualifier
