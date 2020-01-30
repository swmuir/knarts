/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Imaging Study Series Performer Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getImagingStudySeriesPerformerFunction()
 * @model
 * @generated
 */
public enum ImagingStudySeriesPerformerFunction implements Enumerator {
	/**
	 * The '<em><b>Con</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CON_VALUE
	 * @generated
	 * @ordered
	 */
	CON(0, "con", "con"),

	/**
	 * The '<em><b>Vrf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VRF_VALUE
	 * @generated
	 * @ordered
	 */
	VRF(1, "vrf", "vrf"),

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
	 * The '<em><b>Sprf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRF_VALUE
	 * @generated
	 * @ordered
	 */
	SPRF(3, "sprf", "sprf"),

	/**
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(4, "ref", "ref");

	/**
	 * The '<em><b>Con</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Con</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CON
	 * @model name="con"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CON'"
	 * @generated
	 * @ordered
	 */
	public static final int CON_VALUE = 0;

	/**
	 * The '<em><b>Vrf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vrf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VRF
	 * @model name="vrf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VRF'"
	 * @generated
	 * @ordered
	 */
	public static final int VRF_VALUE = 1;

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
	 * The '<em><b>Sprf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sprf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRF
	 * @model name="sprf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPRF'"
	 * @generated
	 * @ordered
	 */
	public static final int SPRF_VALUE = 3;

	/**
	 * The '<em><b>Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model name="ref"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='REF'"
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Imaging Study Series Performer Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImagingStudySeriesPerformerFunction[] VALUES_ARRAY =
		new ImagingStudySeriesPerformerFunction[] {
			CON,
			VRF,
			PRF,
			SPRF,
			REF,
		};

	/**
	 * A public read-only list of all the '<em><b>Imaging Study Series Performer Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImagingStudySeriesPerformerFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Imaging Study Series Performer Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingStudySeriesPerformerFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingStudySeriesPerformerFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Study Series Performer Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingStudySeriesPerformerFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingStudySeriesPerformerFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Study Series Performer Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingStudySeriesPerformerFunction get(int value) {
		switch (value) {
			case CON_VALUE: return CON;
			case VRF_VALUE: return VRF;
			case PRF_VALUE: return PRF;
			case SPRF_VALUE: return SPRF;
			case REF_VALUE: return REF;
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
	private ImagingStudySeriesPerformerFunction(int value, String name, String literal) {
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
	
} //ImagingStudySeriesPerformerFunction
