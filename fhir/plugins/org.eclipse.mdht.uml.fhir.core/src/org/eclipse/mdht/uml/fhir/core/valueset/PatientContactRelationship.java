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
 * A representation of the literals of the enumeration '<em><b>Patient Contact Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getPatientContactRelationship()
 * @model
 * @generated
 */
public enum PatientContactRelationship implements Enumerator {
	/**
	 * The '<em><b>Emergency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(0, "emergency", "emergency"),

	/**
	 * The '<em><b>Family</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY(1, "family", "family"),

	/**
	 * The '<em><b>Guardian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	GUARDIAN(2, "guardian", "guardian"),

	/**
	 * The '<em><b>Friend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEND_VALUE
	 * @generated
	 * @ordered
	 */
	FRIEND(3, "friend", "friend"),

	/**
	 * The '<em><b>Partner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER_VALUE
	 * @generated
	 * @ordered
	 */
	PARTNER(4, "partner", "partner"),

	/**
	 * The '<em><b>Work</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORK_VALUE
	 * @generated
	 * @ordered
	 */
	WORK(5, "work", "work"),

	/**
	 * The '<em><b>Caregiver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREGIVER_VALUE
	 * @generated
	 * @ordered
	 */
	CAREGIVER(6, "caregiver", "caregiver"),

	/**
	 * The '<em><b>Agent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT(7, "agent", "agent"),

	/**
	 * The '<em><b>Guarantor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARANTOR_VALUE
	 * @generated
	 * @ordered
	 */
	GUARANTOR(8, "guarantor", "guarantor"),

	/**
	 * The '<em><b>Owner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER(9, "owner", "owner"),

	/**
	 * The '<em><b>Parent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT(10, "parent", "parent");

	/**
	 * The '<em><b>Emergency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emergency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY
	 * @model name="emergency"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 0;

	/**
	 * The '<em><b>Family</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY
	 * @model name="family"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_VALUE = 1;

	/**
	 * The '<em><b>Guardian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guardian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARDIAN
	 * @model name="guardian"
	 * @generated
	 * @ordered
	 */
	public static final int GUARDIAN_VALUE = 2;

	/**
	 * The '<em><b>Friend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Friend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIEND
	 * @model name="friend"
	 * @generated
	 * @ordered
	 */
	public static final int FRIEND_VALUE = 3;

	/**
	 * The '<em><b>Partner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTNER
	 * @model name="partner"
	 * @generated
	 * @ordered
	 */
	public static final int PARTNER_VALUE = 4;

	/**
	 * The '<em><b>Work</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Work</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORK
	 * @model name="work"
	 * @generated
	 * @ordered
	 */
	public static final int WORK_VALUE = 5;

	/**
	 * The '<em><b>Caregiver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caregiver</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAREGIVER
	 * @model name="caregiver"
	 * @generated
	 * @ordered
	 */
	public static final int CAREGIVER_VALUE = 6;

	/**
	 * The '<em><b>Agent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT
	 * @model name="agent"
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_VALUE = 7;

	/**
	 * The '<em><b>Guarantor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guarantor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARANTOR
	 * @model name="guarantor"
	 * @generated
	 * @ordered
	 */
	public static final int GUARANTOR_VALUE = 8;

	/**
	 * The '<em><b>Owner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Owner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OWNER
	 * @model name="owner"
	 * @generated
	 * @ordered
	 */
	public static final int OWNER_VALUE = 9;

	/**
	 * The '<em><b>Parent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARENT
	 * @model name="parent"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Patient Contact Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatientContactRelationship[] VALUES_ARRAY =
		new PatientContactRelationship[] {
			EMERGENCY,
			FAMILY,
			GUARDIAN,
			FRIEND,
			PARTNER,
			WORK,
			CAREGIVER,
			AGENT,
			GUARANTOR,
			OWNER,
			PARENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Patient Contact Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatientContactRelationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Patient Contact Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientContactRelationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatientContactRelationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patient Contact Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientContactRelationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatientContactRelationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Patient Contact Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatientContactRelationship get(int value) {
		switch (value) {
			case EMERGENCY_VALUE: return EMERGENCY;
			case FAMILY_VALUE: return FAMILY;
			case GUARDIAN_VALUE: return GUARDIAN;
			case FRIEND_VALUE: return FRIEND;
			case PARTNER_VALUE: return PARTNER;
			case WORK_VALUE: return WORK;
			case CAREGIVER_VALUE: return CAREGIVER;
			case AGENT_VALUE: return AGENT;
			case GUARANTOR_VALUE: return GUARANTOR;
			case OWNER_VALUE: return OWNER;
			case PARENT_VALUE: return PARENT;
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
	private PatientContactRelationship(int value, String name, String literal) {
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
	
} //PatientContactRelationship
