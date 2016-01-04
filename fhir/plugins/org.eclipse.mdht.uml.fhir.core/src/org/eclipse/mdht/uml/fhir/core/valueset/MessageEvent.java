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
 * A representation of the literals of the enumeration '<em><b>Message Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getMessageEvent()
 * @model
 * @generated
 */
public enum MessageEvent implements Enumerator {
	/**
	 * The '<em><b>Medication Administration Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_COMPLETE(0, "medicationAdministrationComplete", "medicationAdministrationComplete"),

	/**
	 * The '<em><b>Medication Administration Nullification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_NULLIFICATION(1, "medicationAdministrationNullification", "medicationAdministrationNullification"),

	/**
	 * The '<em><b>Medication Administration Recording</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_RECORDING(2, "medicationAdministrationRecording", "medicationAdministrationRecording"),

	/**
	 * The '<em><b>Medication Administration Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_UPDATE(3, "medicationAdministrationUpdate", "medicationAdministrationUpdate"),

	/**
	 * The '<em><b>Adminnotify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINNOTIFY_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINNOTIFY(4, "adminnotify", "adminnotify"),

	/**
	 * The '<em><b>Diagnosticreportprovide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTICREPORTPROVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTICREPORTPROVIDE(5, "diagnosticreportprovide", "diagnosticreportprovide"),

	/**
	 * The '<em><b>Observationprovide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATIONPROVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATIONPROVIDE(6, "observationprovide", "observationprovide"),

	/**
	 * The '<em><b>Patientlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTLINK_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTLINK(7, "patientlink", "patientlink"),

	/**
	 * The '<em><b>Patientunlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTUNLINK_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTUNLINK(8, "patientunlink", "patientunlink"),

	/**
	 * The '<em><b>Valuesetexpand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUESETEXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	VALUESETEXPAND(9, "valuesetexpand", "valuesetexpand");

	/**
	 * The '<em><b>Medication Administration Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Administration Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_COMPLETE
	 * @model name="medicationAdministrationComplete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration-Complete'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_COMPLETE_VALUE = 0;

	/**
	 * The '<em><b>Medication Administration Nullification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Administration Nullification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_NULLIFICATION
	 * @model name="medicationAdministrationNullification"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration-Nullification'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Medication Administration Recording</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Administration Recording</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_RECORDING
	 * @model name="medicationAdministrationRecording"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration-Recording'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_RECORDING_VALUE = 2;

	/**
	 * The '<em><b>Medication Administration Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Administration Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_UPDATE
	 * @model name="medicationAdministrationUpdate"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration-Update'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_UPDATE_VALUE = 3;

	/**
	 * The '<em><b>Adminnotify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adminnotify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINNOTIFY
	 * @model name="adminnotify"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='admin-notify'"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINNOTIFY_VALUE = 4;

	/**
	 * The '<em><b>Diagnosticreportprovide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagnosticreportprovide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTICREPORTPROVIDE
	 * @model name="diagnosticreportprovide"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='diagnosticreport-provide'"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTICREPORTPROVIDE_VALUE = 5;

	/**
	 * The '<em><b>Observationprovide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Observationprovide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVATIONPROVIDE
	 * @model name="observationprovide"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='observation-provide'"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATIONPROVIDE_VALUE = 6;

	/**
	 * The '<em><b>Patientlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patientlink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENTLINK
	 * @model name="patientlink"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='patient-link'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTLINK_VALUE = 7;

	/**
	 * The '<em><b>Patientunlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patientunlink</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENTUNLINK
	 * @model name="patientunlink"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='patient-unlink'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTUNLINK_VALUE = 8;

	/**
	 * The '<em><b>Valuesetexpand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Valuesetexpand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUESETEXPAND
	 * @model name="valuesetexpand"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='valueset-expand'"
	 * @generated
	 * @ordered
	 */
	public static final int VALUESETEXPAND_VALUE = 9;

	/**
	 * An array of all the '<em><b>Message Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageEvent[] VALUES_ARRAY =
		new MessageEvent[] {
			MEDICATION_ADMINISTRATION_COMPLETE,
			MEDICATION_ADMINISTRATION_NULLIFICATION,
			MEDICATION_ADMINISTRATION_RECORDING,
			MEDICATION_ADMINISTRATION_UPDATE,
			ADMINNOTIFY,
			DIAGNOSTICREPORTPROVIDE,
			OBSERVATIONPROVIDE,
			PATIENTLINK,
			PATIENTUNLINK,
			VALUESETEXPAND,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Event</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEvent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageEvent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Event</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEvent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageEvent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Event</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEvent get(int value) {
		switch (value) {
			case MEDICATION_ADMINISTRATION_COMPLETE_VALUE: return MEDICATION_ADMINISTRATION_COMPLETE;
			case MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE: return MEDICATION_ADMINISTRATION_NULLIFICATION;
			case MEDICATION_ADMINISTRATION_RECORDING_VALUE: return MEDICATION_ADMINISTRATION_RECORDING;
			case MEDICATION_ADMINISTRATION_UPDATE_VALUE: return MEDICATION_ADMINISTRATION_UPDATE;
			case ADMINNOTIFY_VALUE: return ADMINNOTIFY;
			case DIAGNOSTICREPORTPROVIDE_VALUE: return DIAGNOSTICREPORTPROVIDE;
			case OBSERVATIONPROVIDE_VALUE: return OBSERVATIONPROVIDE;
			case PATIENTLINK_VALUE: return PATIENTLINK;
			case PATIENTUNLINK_VALUE: return PATIENTUNLINK;
			case VALUESETEXPAND_VALUE: return VALUESETEXPAND;
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
	private MessageEvent(int value, String name, String literal) {
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
	
} //MessageEvent
