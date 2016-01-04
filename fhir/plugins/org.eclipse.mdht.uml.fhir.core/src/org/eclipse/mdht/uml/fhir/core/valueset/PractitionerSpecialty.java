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
 * A representation of the literals of the enumeration '<em><b>Practitioner Specialty</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getPractitionerSpecialty()
 * @model
 * @generated
 */
public enum PractitionerSpecialty implements Enumerator {
	/**
	 * The '<em><b>Cardio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIO_VALUE
	 * @generated
	 * @ordered
	 */
	CARDIO(0, "cardio", "cardio"),

	/**
	 * The '<em><b>Dent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENT_VALUE
	 * @generated
	 * @ordered
	 */
	DENT(1, "dent", "dent"),

	/**
	 * The '<em><b>Dietary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIETARY_VALUE
	 * @generated
	 * @ordered
	 */
	DIETARY(2, "dietary", "dietary"),

	/**
	 * The '<em><b>Midw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDW_VALUE
	 * @generated
	 * @ordered
	 */
	MIDW(3, "midw", "midw"),

	/**
	 * The '<em><b>Sysarch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SYSARCH(4, "sysarch", "sysarch");

	/**
	 * The '<em><b>Cardio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cardio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDIO
	 * @model name="cardio"
	 * @generated
	 * @ordered
	 */
	public static final int CARDIO_VALUE = 0;

	/**
	 * The '<em><b>Dent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENT
	 * @model name="dent"
	 * @generated
	 * @ordered
	 */
	public static final int DENT_VALUE = 1;

	/**
	 * The '<em><b>Dietary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dietary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIETARY
	 * @model name="dietary"
	 * @generated
	 * @ordered
	 */
	public static final int DIETARY_VALUE = 2;

	/**
	 * The '<em><b>Midw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Midw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDW
	 * @model name="midw"
	 * @generated
	 * @ordered
	 */
	public static final int MIDW_VALUE = 3;

	/**
	 * The '<em><b>Sysarch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sysarch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSARCH
	 * @model name="sysarch"
	 * @generated
	 * @ordered
	 */
	public static final int SYSARCH_VALUE = 4;

	/**
	 * An array of all the '<em><b>Practitioner Specialty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PractitionerSpecialty[] VALUES_ARRAY =
		new PractitionerSpecialty[] {
			CARDIO,
			DENT,
			DIETARY,
			MIDW,
			SYSARCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Practitioner Specialty</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PractitionerSpecialty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Practitioner Specialty</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerSpecialty get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PractitionerSpecialty result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Practitioner Specialty</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerSpecialty getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PractitionerSpecialty result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Practitioner Specialty</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerSpecialty get(int value) {
		switch (value) {
			case CARDIO_VALUE: return CARDIO;
			case DENT_VALUE: return DENT;
			case DIETARY_VALUE: return DIETARY;
			case MIDW_VALUE: return MIDW;
			case SYSARCH_VALUE: return SYSARCH;
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
	private PractitionerSpecialty(int value, String name, String literal) {
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
	
} //PractitionerSpecialty
