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
 * A representation of the literals of the enumeration '<em><b>Condition Category Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getConditionCategoryCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Condition Category Codes'"
 * @generated
 */
public enum ConditionCategoryCodes implements Enumerator {
	/**
	 * The '<em><b>Complaint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLAINT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLAINT(0, "complaint", "complaint"),

	/**
	 * The '<em><b>Symptom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMPTOM_VALUE
	 * @generated
	 * @ordered
	 */
	SYMPTOM(1, "symptom", "symptom"),

	/**
	 * The '<em><b>Finding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINDING_VALUE
	 * @generated
	 * @ordered
	 */
	FINDING(2, "finding", "finding"),

	/**
	 * The '<em><b>Diagnosis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSIS(3, "diagnosis", "diagnosis");

	/**
	 * The '<em><b>Complaint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complaint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLAINT
	 * @model name="complaint"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLAINT_VALUE = 0;

	/**
	 * The '<em><b>Symptom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symptom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMPTOM
	 * @model name="symptom"
	 * @generated
	 * @ordered
	 */
	public static final int SYMPTOM_VALUE = 1;

	/**
	 * The '<em><b>Finding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINDING
	 * @model name="finding"
	 * @generated
	 * @ordered
	 */
	public static final int FINDING_VALUE = 2;

	/**
	 * The '<em><b>Diagnosis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagnosis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSIS
	 * @model name="diagnosis"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Condition Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionCategoryCodes[] VALUES_ARRAY =
		new ConditionCategoryCodes[] {
			COMPLAINT,
			SYMPTOM,
			FINDING,
			DIAGNOSIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionCategoryCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Category Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionCategoryCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionCategoryCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Category Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionCategoryCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionCategoryCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Category Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionCategoryCodes get(int value) {
		switch (value) {
			case COMPLAINT_VALUE: return COMPLAINT;
			case SYMPTOM_VALUE: return SYMPTOM;
			case FINDING_VALUE: return FINDING;
			case DIAGNOSIS_VALUE: return DIAGNOSIS;
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
	private ConditionCategoryCodes(int value, String name, String literal) {
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
	
} //ConditionCategoryCodes
