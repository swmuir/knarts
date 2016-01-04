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
 * A representation of the literals of the enumeration '<em><b>Encounter Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getEncounterPriority()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounter Priority'"
 * @generated
 */
public enum EncounterPriority implements Enumerator {
	/**
	 * The '<em><b>Imm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMM_VALUE
	 * @generated
	 * @ordered
	 */
	IMM(0, "imm", "imm"),

	/**
	 * The '<em><b>Emg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMG_VALUE
	 * @generated
	 * @ordered
	 */
	EMG(1, "emg", "emg"),

	/**
	 * The '<em><b>Urg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URG_VALUE
	 * @generated
	 * @ordered
	 */
	URG(2, "urg", "urg"),

	/**
	 * The '<em><b>Surg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURG_VALUE
	 * @generated
	 * @ordered
	 */
	SURG(3, "surg", "surg"),

	/**
	 * The '<em><b>Nourg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOURG_VALUE
	 * @generated
	 * @ordered
	 */
	NOURG(4, "nourg", "nourg");

	/**
	 * The '<em><b>Imm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMM
	 * @model name="imm"
	 * @generated
	 * @ordered
	 */
	public static final int IMM_VALUE = 0;

	/**
	 * The '<em><b>Emg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMG
	 * @model name="emg"
	 * @generated
	 * @ordered
	 */
	public static final int EMG_VALUE = 1;

	/**
	 * The '<em><b>Urg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URG
	 * @model name="urg"
	 * @generated
	 * @ordered
	 */
	public static final int URG_VALUE = 2;

	/**
	 * The '<em><b>Surg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURG
	 * @model name="surg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='s-urg'"
	 * @generated
	 * @ordered
	 */
	public static final int SURG_VALUE = 3;

	/**
	 * The '<em><b>Nourg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nourg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOURG
	 * @model name="nourg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='no-urg'"
	 * @generated
	 * @ordered
	 */
	public static final int NOURG_VALUE = 4;

	/**
	 * An array of all the '<em><b>Encounter Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncounterPriority[] VALUES_ARRAY =
		new EncounterPriority[] {
			IMM,
			EMG,
			URG,
			SURG,
			NOURG,
		};

	/**
	 * A public read-only list of all the '<em><b>Encounter Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncounterPriority> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encounter Priority</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterPriority get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterPriority result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Priority</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterPriority getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterPriority result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Priority</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterPriority get(int value) {
		switch (value) {
			case IMM_VALUE: return IMM;
			case EMG_VALUE: return EMG;
			case URG_VALUE: return URG;
			case SURG_VALUE: return SURG;
			case NOURG_VALUE: return NOURG;
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
	private EncounterPriority(int value, String name, String literal) {
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
	
} //EncounterPriority
