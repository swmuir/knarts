/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Immunization Status Reason Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getImmunizationStatusReasonCodes()
 * @model
 * @generated
 */
public enum ImmunizationStatusReasonCodes implements Enumerator {
	/**
	 * The '<em><b>Immune</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNE(0, "immune", "immune"),

	/**
	 * The '<em><b>Medprec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDPREC_VALUE
	 * @generated
	 * @ordered
	 */
	MEDPREC(1, "medprec", "medprec"),

	/**
	 * The '<em><b>Ostock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSTOCK_VALUE
	 * @generated
	 * @ordered
	 */
	OSTOCK(2, "ostock", "ostock"),

	/**
	 * The '<em><b>Patobj</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATOBJ_VALUE
	 * @generated
	 * @ordered
	 */
	PATOBJ(3, "patobj", "patobj");

	/**
	 * The '<em><b>Immune</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNE
	 * @model name="immune"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IMMUNE'"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNE_VALUE = 0;

	/**
	 * The '<em><b>Medprec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDPREC
	 * @model name="medprec"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MEDPREC'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDPREC_VALUE = 1;

	/**
	 * The '<em><b>Ostock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSTOCK
	 * @model name="ostock"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OSTOCK'"
	 * @generated
	 * @ordered
	 */
	public static final int OSTOCK_VALUE = 2;

	/**
	 * The '<em><b>Patobj</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATOBJ
	 * @model name="patobj"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PATOBJ'"
	 * @generated
	 * @ordered
	 */
	public static final int PATOBJ_VALUE = 3;

	/**
	 * An array of all the '<em><b>Immunization Status Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmunizationStatusReasonCodes[] VALUES_ARRAY =
		new ImmunizationStatusReasonCodes[] {
			IMMUNE,
			MEDPREC,
			OSTOCK,
			PATOBJ,
		};

	/**
	 * A public read-only list of all the '<em><b>Immunization Status Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImmunizationStatusReasonCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Immunization Status Reason Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationStatusReasonCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationStatusReasonCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Status Reason Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationStatusReasonCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationStatusReasonCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Status Reason Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationStatusReasonCodes get(int value) {
		switch (value) {
			case IMMUNE_VALUE: return IMMUNE;
			case MEDPREC_VALUE: return MEDPREC;
			case OSTOCK_VALUE: return OSTOCK;
			case PATOBJ_VALUE: return PATOBJ;
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
	private ImmunizationStatusReasonCodes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ImmunizationStatusReasonCodes
