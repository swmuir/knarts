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
 * A representation of the literals of the enumeration '<em><b>Goal Status Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getGoalStatusReason()
 * @model
 * @generated
 */
public enum GoalStatusReason implements Enumerator {
	/**
	 * The '<em><b>Surgery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURGERY_VALUE
	 * @generated
	 * @ordered
	 */
	SURGERY(0, "surgery", "surgery"),

	/**
	 * The '<em><b>Lifeevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFEEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFEEVENT(1, "lifeevent", "lifeevent"),

	/**
	 * The '<em><b>Replaced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACED_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACED(2, "replaced", "replaced"),

	/**
	 * The '<em><b>Patientrequest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTREQUEST(3, "patientrequest", "patientrequest");

	/**
	 * The '<em><b>Surgery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surgery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURGERY
	 * @model name="surgery"
	 * @generated
	 * @ordered
	 */
	public static final int SURGERY_VALUE = 0;

	/**
	 * The '<em><b>Lifeevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lifeevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFEEVENT
	 * @model name="lifeevent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='life-event'"
	 * @generated
	 * @ordered
	 */
	public static final int LIFEEVENT_VALUE = 1;

	/**
	 * The '<em><b>Replaced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replaced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACED
	 * @model name="replaced"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACED_VALUE = 2;

	/**
	 * The '<em><b>Patientrequest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patientrequest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENTREQUEST
	 * @model name="patientrequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='patient-request'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTREQUEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Goal Status Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalStatusReason[] VALUES_ARRAY =
		new GoalStatusReason[] {
			SURGERY,
			LIFEEVENT,
			REPLACED,
			PATIENTREQUEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Status Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalStatusReason> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Status Reason</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusReason get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStatusReason result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Status Reason</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusReason getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStatusReason result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Status Reason</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusReason get(int value) {
		switch (value) {
			case SURGERY_VALUE: return SURGERY;
			case LIFEEVENT_VALUE: return LIFEEVENT;
			case REPLACED_VALUE: return REPLACED;
			case PATIENTREQUEST_VALUE: return PATIENTREQUEST;
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
	private GoalStatusReason(int value, String name, String literal) {
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
	
} //GoalStatusReason
