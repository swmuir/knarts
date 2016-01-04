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
 * A representation of the literals of the enumeration '<em><b>Module Metadata Focus Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getModuleMetadataFocusType()
 * @model
 * @generated
 */
public enum ModuleMetadataFocusType implements Enumerator {
	/**
	 * The '<em><b>Patientgender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTGENDER_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTGENDER(0, "patientgender", "patientgender"),

	/**
	 * The '<em><b>Patientagegroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTAGEGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTAGEGROUP(1, "patientagegroup", "patientagegroup"),

	/**
	 * The '<em><b>Clinicalfocus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALFOCUS_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICALFOCUS(2, "clinicalfocus", "clinicalfocus"),

	/**
	 * The '<em><b>Targetuser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGETUSER_VALUE
	 * @generated
	 * @ordered
	 */
	TARGETUSER(3, "targetuser", "targetuser"),

	/**
	 * The '<em><b>Workflowsetting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWSETTING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOWSETTING(4, "workflowsetting", "workflowsetting"),

	/**
	 * The '<em><b>Workflowtask</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWTASK_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOWTASK(5, "workflowtask", "workflowtask"),

	/**
	 * The '<em><b>Clinicalvenue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALVENUE_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICALVENUE(6, "clinicalvenue", "clinicalvenue");

	/**
	 * The '<em><b>Patientgender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patientgender</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENTGENDER
	 * @model name="patientgender"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='patient-gender'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTGENDER_VALUE = 0;

	/**
	 * The '<em><b>Patientagegroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patientagegroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENTAGEGROUP
	 * @model name="patientagegroup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='patient-age-group'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTAGEGROUP_VALUE = 1;

	/**
	 * The '<em><b>Clinicalfocus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clinicalfocus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLINICALFOCUS
	 * @model name="clinicalfocus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='clinical-focus'"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICALFOCUS_VALUE = 2;

	/**
	 * The '<em><b>Targetuser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Targetuser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TARGETUSER
	 * @model name="targetuser"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='target-user'"
	 * @generated
	 * @ordered
	 */
	public static final int TARGETUSER_VALUE = 3;

	/**
	 * The '<em><b>Workflowsetting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workflowsetting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWSETTING
	 * @model name="workflowsetting"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='workflow-setting'"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOWSETTING_VALUE = 4;

	/**
	 * The '<em><b>Workflowtask</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workflowtask</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOWTASK
	 * @model name="workflowtask"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='workflow-task'"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOWTASK_VALUE = 5;

	/**
	 * The '<em><b>Clinicalvenue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clinicalvenue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLINICALVENUE
	 * @model name="clinicalvenue"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='clinical-venue'"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICALVENUE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Module Metadata Focus Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleMetadataFocusType[] VALUES_ARRAY =
		new ModuleMetadataFocusType[] {
			PATIENTGENDER,
			PATIENTAGEGROUP,
			CLINICALFOCUS,
			TARGETUSER,
			WORKFLOWSETTING,
			WORKFLOWTASK,
			CLINICALVENUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Metadata Focus Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleMetadataFocusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Metadata Focus Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataFocusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataFocusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Focus Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataFocusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataFocusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Focus Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataFocusType get(int value) {
		switch (value) {
			case PATIENTGENDER_VALUE: return PATIENTGENDER;
			case PATIENTAGEGROUP_VALUE: return PATIENTAGEGROUP;
			case CLINICALFOCUS_VALUE: return CLINICALFOCUS;
			case TARGETUSER_VALUE: return TARGETUSER;
			case WORKFLOWSETTING_VALUE: return WORKFLOWSETTING;
			case WORKFLOWTASK_VALUE: return WORKFLOWTASK;
			case CLINICALVENUE_VALUE: return CLINICALVENUE;
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
	private ModuleMetadataFocusType(int value, String name, String literal) {
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
	
} //ModuleMetadataFocusType
