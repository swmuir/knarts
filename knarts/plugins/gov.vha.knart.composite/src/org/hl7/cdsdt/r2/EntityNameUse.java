/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Name Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A set of codes advising a system or user which name in a set of names to select for a given purpose. 
 * 
 * CodeSystem "EntityNameUseR2", OID: 2.16.840.1.113883.5.1120, Owner: HL7
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getEntityNameUse()
 * @model extendedMetaData="name='EntityNameUse'"
 * @generated
 */
public enum EntityNameUse implements Enumerator {
	/**
	 * The '<em><b>ABC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABC_VALUE
	 * @generated
	 * @ordered
	 */
	ABC(0, "ABC", "ABC"),

	/**
	 * The '<em><b>IDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDE_VALUE
	 * @generated
	 * @ordered
	 */
	IDE(1, "IDE", "IDE"),

	/**
	 * The '<em><b>SYL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYL_VALUE
	 * @generated
	 * @ordered
	 */
	SYL(2, "SYL", "SYL"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(3, "C", "C"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(4, "OR", "OR"),

	/**
	 * The '<em><b>T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T_VALUE
	 * @generated
	 * @ordered
	 */
	T(5, "T", "T"),

	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(6, "I", "I"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(7, "P", "P"),

	/**
	 * The '<em><b>ANON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANON_VALUE
	 * @generated
	 * @ordered
	 */
	ANON(8, "ANON", "ANON"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(9, "A", "A"),

	/**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(10, "R", "R"),

	/**
	 * The '<em><b>OLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_VALUE
	 * @generated
	 * @ordered
	 */
	OLD(11, "OLD", "OLD"),

	/**
	 * The '<em><b>DN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DN_VALUE
	 * @generated
	 * @ordered
	 */
	DN(12, "DN", "DN"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(13, "M", "M"),

	/**
	 * The '<em><b>PHON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHON_VALUE
	 * @generated
	 * @ordered
	 */
	PHON(14, "PHON", "PHON"),

	/**
	 * The '<em><b>SRCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRCH_VALUE
	 * @generated
	 * @ordered
	 */
	SRCH(15, "SRCH", "SRCH");

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
	public static final int ABC_VALUE = 0;

	/**
	 * The '<em><b>IDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ideographic : Ideographic representation of name (e.g., Japanese kanji, Chinese characters) 
	 * <!-- end-model-doc -->
	 * @see #IDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDE_VALUE = 1;

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
	public static final int SYL_VALUE = 2;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customary : Known as/conventional/the one you normally use
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 3;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official Registry Name : the formal name as registered in an official (government) registry, but which name might not be commonly used. May correspond to the concept of legal name
	 * <!-- end-model-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 4;

	/**
	 * The '<em><b>T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary : A temporary name.  Note that a name valid time can provide more detailed information.  This may also be used for temporary names assigned at birth or in emergency situations.
	 * <!-- end-model-doc -->
	 * @see #T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T_VALUE = 5;

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indigenous/Tribal: e.g. Chief Red Cloud
	 * <!-- end-model-doc -->
	 * @see #I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 6;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other/Pseudonym/Alias: A non-official name by which the person is sometimes known.  (This may also be used to record informal names such as a nickname)
	 * <!-- end-model-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 7;

	/**
	 * The '<em><b>ANON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anonymous : Anonymous assigned name (used to protect a person's identity for privacy reasons)
	 * <!-- end-model-doc -->
	 * @see #ANON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANON_VALUE = 8;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Name : A name used in a Professional or Business context .
	 *   
	 * Examples: Continuing to use a maiden name in a professional context, or using a stage performing name (some of these names are also pseudonyms)
	 * <!-- end-model-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 9;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Religious : A name assumed as part of a religious vocation. e.g. Sister Mary Francis, Brother John
	 * <!-- end-model-doc -->
	 * @see #R
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 10;

	/**
	 * The '<em><b>OLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Longer in Use : This name is no longer in use (note: Names may also carry valid time ranges .  This code is used to cover the situations where it is known that the name is no longer valid, but no particular time range for its use is known)
	 * <!-- end-model-doc -->
	 * @see #OLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OLD_VALUE = 11;

	/**
	 * The '<em><b>DN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do Not Use : This name should no longer be used when interacting with the person (i.e .  in addition to no longer being used, the name should not be even mentioned when interacting with the person)
	 * 
	 * Note: applications are not required to compare names labeled "Do Not Use" and other names in order to eliminate name parts that are common between the other name and a name labeled "Do Not Use".
	 * <!-- end-model-doc -->
	 * @see #DN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DN_VALUE = 12;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maiden Name : A name used prior to marriage.
	 * 
	 * Note that marriage naming customs vary greatly around the world.  This name use is for use by applications that collect and store "maiden" names. Though the concept of maiden name is often gender specific, the use of this term is not gender specific.  The use of this term does not imply any particular history for a person's name, nor should the maiden name be determined algorithmically
	 * <!-- end-model-doc -->
	 * @see #M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 13;

	/**
	 * The '<em><b>PHON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Phonetic : The name as understood by the data enterer, i.e. a close approximation of a phonetic spelling of the name, not based on a phonetic algorithm.
	 * <!-- end-model-doc -->
	 * @see #PHON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHON_VALUE = 14;

	/**
	 * The '<em><b>SRCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search Type Uses: A name intended for use in searching or matching
	 * <!-- end-model-doc -->
	 * @see #SRCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRCH_VALUE = 15;

	/**
	 * An array of all the '<em><b>Entity Name Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityNameUse[] VALUES_ARRAY =
		new EntityNameUse[] {
			ABC,
			IDE,
			SYL,
			C,
			OR,
			T,
			I,
			P,
			ANON,
			A,
			R,
			OLD,
			DN,
			M,
			PHON,
			SRCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Name Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityNameUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNameUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNameUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNameUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNameUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityNameUse get(int value) {
		switch (value) {
			case ABC_VALUE: return ABC;
			case IDE_VALUE: return IDE;
			case SYL_VALUE: return SYL;
			case C_VALUE: return C;
			case OR_VALUE: return OR;
			case T_VALUE: return T;
			case I_VALUE: return I;
			case P_VALUE: return P;
			case ANON_VALUE: return ANON;
			case A_VALUE: return A;
			case R_VALUE: return R;
			case OLD_VALUE: return OLD;
			case DN_VALUE: return DN;
			case M_VALUE: return M;
			case PHON_VALUE: return PHON;
			case SRCH_VALUE: return SRCH;
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
	private EntityNameUse(int value, String name, String literal) {
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
	
} //EntityNameUse
