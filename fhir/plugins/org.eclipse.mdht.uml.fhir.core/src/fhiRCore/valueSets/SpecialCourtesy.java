/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Special Courtesy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getSpecialCourtesy()
 * @model
 * @generated
 */
public enum SpecialCourtesy implements Enumerator {
	/**
	 * The '<em><b>Ext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXT_VALUE
	 * @generated
	 * @ordered
	 */
	EXT(0, "ext", "ext"),

	/**
	 * The '<em><b>Nrm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRM_VALUE
	 * @generated
	 * @ordered
	 */
	NRM(1, "nrm", "nrm"),

	/**
	 * The '<em><b>Prf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRF_VALUE
	 * @generated
	 * @ordered
	 */
	PRF(2, "prf", "prf"),

	/**
	 * The '<em><b>Stf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STF_VALUE
	 * @generated
	 * @ordered
	 */
	STF(3, "stf", "stf"),

	/**
	 * The '<em><b>Vip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIP_VALUE
	 * @generated
	 * @ordered
	 */
	VIP(4, "vip", "vip"),

	/**
	 * The '<em><b>Unk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNK_VALUE
	 * @generated
	 * @ordered
	 */
	UNK(5, "unk", "unk");

	/**
	 * The '<em><b>Ext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ext</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXT
	 * @model name="ext"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EXT'"
	 * @generated
	 * @ordered
	 */
	public static final int EXT_VALUE = 0;

	/**
	 * The '<em><b>Nrm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nrm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NRM
	 * @model name="nrm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NRM'"
	 * @generated
	 * @ordered
	 */
	public static final int NRM_VALUE = 1;

	/**
	 * The '<em><b>Prf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRF
	 * @model name="prf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PRF'"
	 * @generated
	 * @ordered
	 */
	public static final int PRF_VALUE = 2;

	/**
	 * The '<em><b>Stf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STF
	 * @model name="stf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='STF'"
	 * @generated
	 * @ordered
	 */
	public static final int STF_VALUE = 3;

	/**
	 * The '<em><b>Vip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIP
	 * @model name="vip"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VIP'"
	 * @generated
	 * @ordered
	 */
	public static final int VIP_VALUE = 4;

	/**
	 * The '<em><b>Unk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNK
	 * @model name="unk"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UNK'"
	 * @generated
	 * @ordered
	 */
	public static final int UNK_VALUE = 5;

	/**
	 * An array of all the '<em><b>Special Courtesy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecialCourtesy[] VALUES_ARRAY =
		new SpecialCourtesy[] {
			EXT,
			NRM,
			PRF,
			STF,
			VIP,
			UNK,
		};

	/**
	 * A public read-only list of all the '<em><b>Special Courtesy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecialCourtesy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Special Courtesy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialCourtesy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialCourtesy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Courtesy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialCourtesy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialCourtesy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Courtesy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialCourtesy get(int value) {
		switch (value) {
			case EXT_VALUE: return EXT;
			case NRM_VALUE: return NRM;
			case PRF_VALUE: return PRF;
			case STF_VALUE: return STF;
			case VIP_VALUE: return VIP;
			case UNK_VALUE: return UNK;
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
	private SpecialCourtesy(int value, String name, String literal) {
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
	
} //SpecialCourtesy
