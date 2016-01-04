/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getLocationType()
 * @model
 * @generated
 */
public enum LocationType implements Enumerator {
	/**
	 * The '<em><b>Bu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BU_VALUE
	 * @generated
	 * @ordered
	 */
	BU(0, "bu", "bu"),

	/**
	 * The '<em><b>Wi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WI_VALUE
	 * @generated
	 * @ordered
	 */
	WI(1, "wi", "wi"),

	/**
	 * The '<em><b>Lvl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVL_VALUE
	 * @generated
	 * @ordered
	 */
	LVL(2, "lvl", "lvl"),

	/**
	 * The '<em><b>Co</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_VALUE
	 * @generated
	 * @ordered
	 */
	CO(3, "co", "co"),

	/**
	 * The '<em><b>Ro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RO_VALUE
	 * @generated
	 * @ordered
	 */
	RO(4, "ro", "ro"),

	/**
	 * The '<em><b>Bd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BD_VALUE
	 * @generated
	 * @ordered
	 */
	BD(5, "bd", "bd"),

	/**
	 * The '<em><b>Ve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VE_VALUE
	 * @generated
	 * @ordered
	 */
	VE(6, "ve", "ve"),

	/**
	 * The '<em><b>Ho</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HO_VALUE
	 * @generated
	 * @ordered
	 */
	HO(7, "ho", "ho"),

	/**
	 * The '<em><b>Ca</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CA_VALUE
	 * @generated
	 * @ordered
	 */
	CA(8, "ca", "ca"),

	/**
	 * The '<em><b>Rd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RD_VALUE
	 * @generated
	 * @ordered
	 */
	RD(9, "rd", "rd"),

	/**
	 * The '<em><b>Jdn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDN_VALUE
	 * @generated
	 * @ordered
	 */
	JDN(10, "jdn", "jdn"),

	/**
	 * The '<em><b>Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(11, "area", "area");

	/**
	 * The '<em><b>Bu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BU
	 * @model name="bu"
	 * @generated
	 * @ordered
	 */
	public static final int BU_VALUE = 0;

	/**
	 * The '<em><b>Wi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WI
	 * @model name="wi"
	 * @generated
	 * @ordered
	 */
	public static final int WI_VALUE = 1;

	/**
	 * The '<em><b>Lvl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lvl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LVL
	 * @model name="lvl"
	 * @generated
	 * @ordered
	 */
	public static final int LVL_VALUE = 2;

	/**
	 * The '<em><b>Co</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Co</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO
	 * @model name="co"
	 * @generated
	 * @ordered
	 */
	public static final int CO_VALUE = 3;

	/**
	 * The '<em><b>Ro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RO
	 * @model name="ro"
	 * @generated
	 * @ordered
	 */
	public static final int RO_VALUE = 4;

	/**
	 * The '<em><b>Bd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BD
	 * @model name="bd"
	 * @generated
	 * @ordered
	 */
	public static final int BD_VALUE = 5;

	/**
	 * The '<em><b>Ve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VE
	 * @model name="ve"
	 * @generated
	 * @ordered
	 */
	public static final int VE_VALUE = 6;

	/**
	 * The '<em><b>Ho</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ho</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HO
	 * @model name="ho"
	 * @generated
	 * @ordered
	 */
	public static final int HO_VALUE = 7;

	/**
	 * The '<em><b>Ca</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ca</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CA
	 * @model name="ca"
	 * @generated
	 * @ordered
	 */
	public static final int CA_VALUE = 8;

	/**
	 * The '<em><b>Rd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RD
	 * @model name="rd"
	 * @generated
	 * @ordered
	 */
	public static final int RD_VALUE = 9;

	/**
	 * The '<em><b>Jdn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jdn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JDN
	 * @model name="jdn"
	 * @generated
	 * @ordered
	 */
	public static final int JDN_VALUE = 10;

	/**
	 * The '<em><b>Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model name="area"
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 11;

	/**
	 * An array of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocationType[] VALUES_ARRAY =
		new LocationType[] {
			BU,
			WI,
			LVL,
			CO,
			RO,
			BD,
			VE,
			HO,
			CA,
			RD,
			JDN,
			AREA,
		};

	/**
	 * A public read-only list of all the '<em><b>Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LocationType get(int value) {
		switch (value) {
			case BU_VALUE: return BU;
			case WI_VALUE: return WI;
			case LVL_VALUE: return LVL;
			case CO_VALUE: return CO;
			case RO_VALUE: return RO;
			case BD_VALUE: return BD;
			case VE_VALUE: return VE;
			case HO_VALUE: return HO;
			case CA_VALUE: return CA;
			case RD_VALUE: return RD;
			case JDN_VALUE: return JDN;
			case AREA_VALUE: return AREA;
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
	private LocationType(int value, String name, String literal) {
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
	
} //LocationType
