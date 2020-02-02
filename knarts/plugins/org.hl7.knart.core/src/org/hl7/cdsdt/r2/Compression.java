/**
 */
package org.hl7.cdsdt.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compression</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The compression algorithm, specified in the HL7 CompressionAlgorithm code system.
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Package#getCompression()
 * @model extendedMetaData="name='Compression'"
 * @generated
 */
public enum Compression implements Enumerator {
	/**
	 * The '<em><b>DF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DF_VALUE
	 * @generated
	 * @ordered
	 */
	DF(0, "DF", "DF"),

	/**
	 * The '<em><b>GZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GZ_VALUE
	 * @generated
	 * @ordered
	 */
	GZ(1, "GZ", "GZ"),

	/**
	 * The '<em><b>ZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZL_VALUE
	 * @generated
	 * @ordered
	 */
	ZL(2, "ZL", "ZL"),

	/**
	 * The '<em><b>Z</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Z_VALUE
	 * @generated
	 * @ordered
	 */
	Z(3, "Z", "Z"),

	/**
	 * The '<em><b>BZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BZ_VALUE
	 * @generated
	 * @ordered
	 */
	BZ(4, "BZ", "BZ"),

	/**
	 * The '<em><b>Z7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Z7_VALUE
	 * @generated
	 * @ordered
	 */
	Z7(5, "Z7", "Z7");

	/**
	 * The '<em><b>DF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deflate : The deflate compressed data format as specified in IETF RFC 1951.
	 * <!-- end-model-doc -->
	 * @see #DF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DF_VALUE = 0;

	/**
	 * The '<em><b>GZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GZIP : A compressed data format that is compatible with the widely used GZIP utility as specified in IETF RFC 1952(uses the deflate algorithm).
	 * <!-- end-model-doc -->
	 * @see #GZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GZ_VALUE = 1;

	/**
	 * The '<em><b>ZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ZLIB : A compressed data format that also uses the deflate algorithm. Specified as IETF RFC 1950.
	 * <!-- end-model-doc -->
	 * @see #ZL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZL_VALUE = 2;

	/**
	 * The '<em><b>Z</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compress : Original UNIX compress algorithm and file format using the LZC algorithm (a variant of LZW). Patent encumbered and less efficient than deflate.
	 * <!-- end-model-doc -->
	 * @see #Z
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Z_VALUE = 3;

	/**
	 * The '<em><b>BZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BZIP : bzip-2 compression format. See [http://www.bzip.org/] for more information.
	 * <!-- end-model-doc -->
	 * @see #BZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BZ_VALUE = 4;

	/**
	 * The '<em><b>Z7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Z7 : 7z compression file format. See [http://www.7-zip.org/7z.html] for more information. 
	 * <!-- end-model-doc -->
	 * @see #Z7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Z7_VALUE = 5;

	/**
	 * An array of all the '<em><b>Compression</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Compression[] VALUES_ARRAY =
		new Compression[] {
			DF,
			GZ,
			ZL,
			Z,
			BZ,
			Z7,
		};

	/**
	 * A public read-only list of all the '<em><b>Compression</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Compression> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compression</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Compression get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Compression result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compression</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Compression getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Compression result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compression</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Compression get(int value) {
		switch (value) {
			case DF_VALUE: return DF;
			case GZ_VALUE: return GZ;
			case ZL_VALUE: return ZL;
			case Z_VALUE: return Z;
			case BZ_VALUE: return BZ;
			case Z7_VALUE: return Z7;
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
	private Compression(int value, String name, String literal) {
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
	
} //Compression
