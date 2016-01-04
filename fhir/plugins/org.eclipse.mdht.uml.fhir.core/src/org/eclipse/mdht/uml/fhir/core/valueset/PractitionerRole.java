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
 * A representation of the literals of the enumeration '<em><b>Practitioner Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getPractitionerRole()
 * @model
 * @generated
 */
public enum PractitionerRole implements Enumerator {
	/**
	 * The '<em><b>Doctor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTOR(0, "doctor", "doctor"),

	/**
	 * The '<em><b>Nurse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSE_VALUE
	 * @generated
	 * @ordered
	 */
	NURSE(1, "nurse", "nurse"),

	/**
	 * The '<em><b>Pharmacist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACIST_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACIST(2, "pharmacist", "pharmacist"),

	/**
	 * The '<em><b>Researcher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCHER_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCHER(3, "researcher", "researcher"),

	/**
	 * The '<em><b>Teacher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEACHER_VALUE
	 * @generated
	 * @ordered
	 */
	TEACHER(4, "teacher", "teacher"),

	/**
	 * The '<em><b>Ict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICT_VALUE
	 * @generated
	 * @ordered
	 */
	ICT(5, "ict", "ict");

	/**
	 * The '<em><b>Doctor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doctor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCTOR
	 * @model name="doctor"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTOR_VALUE = 0;

	/**
	 * The '<em><b>Nurse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nurse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NURSE
	 * @model name="nurse"
	 * @generated
	 * @ordered
	 */
	public static final int NURSE_VALUE = 1;

	/**
	 * The '<em><b>Pharmacist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACIST
	 * @model name="pharmacist"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACIST_VALUE = 2;

	/**
	 * The '<em><b>Researcher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Researcher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCHER
	 * @model name="researcher"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCHER_VALUE = 3;

	/**
	 * The '<em><b>Teacher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Teacher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEACHER
	 * @model name="teacher"
	 * @generated
	 * @ordered
	 */
	public static final int TEACHER_VALUE = 4;

	/**
	 * The '<em><b>Ict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICT
	 * @model name="ict"
	 * @generated
	 * @ordered
	 */
	public static final int ICT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Practitioner Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PractitionerRole[] VALUES_ARRAY =
		new PractitionerRole[] {
			DOCTOR,
			NURSE,
			PHARMACIST,
			RESEARCHER,
			TEACHER,
			ICT,
		};

	/**
	 * A public read-only list of all the '<em><b>Practitioner Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PractitionerRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Practitioner Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PractitionerRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Practitioner Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PractitionerRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Practitioner Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PractitionerRole get(int value) {
		switch (value) {
			case DOCTOR_VALUE: return DOCTOR;
			case NURSE_VALUE: return NURSE;
			case PHARMACIST_VALUE: return PHARMACIST;
			case RESEARCHER_VALUE: return RESEARCHER;
			case TEACHER_VALUE: return TEACHER;
			case ICT_VALUE: return ICT;
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
	private PractitionerRole(int value, String name, String literal) {
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
	
} //PractitionerRole
