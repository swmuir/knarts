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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationAdministration;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationAdministrationDosage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrder;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getWasNotGiven <em>Was Not Given</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getReasonNotGivens <em>Reason Not Given</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getReasonGivens <em>Reason Given</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getEffectiveTimex <em>Effective Timex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getDevices <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationImpl#getDosage <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationImpl extends DomainResourceImpl implements MedicationAdministration {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Resource practitioner;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrder prescription;

	/**
	 * The cached value of the '{@link #getWasNotGiven() <em>Was Not Given</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean wasNotGiven;

	/**
	 * The cached value of the '{@link #getReasonNotGivens() <em>Reason Not Given</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotGivens()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotGivens;

	/**
	 * The cached value of the '{@link #getReasonGivens() <em>Reason Given</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonGivens()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonGivens;

	/**
	 * The cached value of the '{@link #getEffectiveTimex() <em>Effective Timex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTimex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectiveTimex;

	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

	/**
	 * The cached value of the '{@link #getDevices() <em>Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String note;

	/**
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationDosage dosage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.MEDICATION_ADMINISTRATION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPractitioner() {
		if (practitioner != null && practitioner.eIsProxy()) {
			InternalEObject oldPractitioner = (InternalEObject)practitioner;
			practitioner = (Resource)eResolveProxy(oldPractitioner);
			if (practitioner != oldPractitioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER, oldPractitioner, practitioner));
			}
		}
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Resource newPractitioner) {
		Resource oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER, oldPractitioner, practitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		if (encounter != null && encounter.eIsProxy()) {
			InternalEObject oldEncounter = (InternalEObject)encounter;
			encounter = (Encounter)eResolveProxy(oldEncounter);
			if (encounter != oldEncounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER, oldEncounter, encounter));
			}
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder getPrescription() {
		if (prescription != null && prescription.eIsProxy()) {
			InternalEObject oldPrescription = (InternalEObject)prescription;
			prescription = (MedicationOrder)eResolveProxy(oldPrescription);
			if (prescription != oldPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, oldPrescription, prescription));
			}
		}
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder basicGetPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(MedicationOrder newPrescription) {
		MedicationOrder oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, oldPrescription, prescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getWasNotGiven() {
		if (wasNotGiven != null && wasNotGiven.eIsProxy()) {
			InternalEObject oldWasNotGiven = (InternalEObject)wasNotGiven;
			wasNotGiven = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldWasNotGiven);
			if (wasNotGiven != oldWasNotGiven) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, oldWasNotGiven, wasNotGiven));
			}
		}
		return wasNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetWasNotGiven() {
		return wasNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasNotGiven(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newWasNotGiven) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldWasNotGiven = wasNotGiven;
		wasNotGiven = newWasNotGiven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN, oldWasNotGiven, wasNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotGivens() {
		if (reasonNotGivens == null) {
			reasonNotGivens = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN);
		}
		return reasonNotGivens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonGivens() {
		if (reasonGivens == null) {
			reasonGivens = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_GIVEN);
		}
		return reasonGivens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectiveTimex() {
		if (effectiveTimex != null && effectiveTimex.eIsProxy()) {
			InternalEObject oldEffectiveTimex = (InternalEObject)effectiveTimex;
			effectiveTimex = (DataType)eResolveProxy(oldEffectiveTimex);
			if (effectiveTimex != oldEffectiveTimex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX, oldEffectiveTimex, effectiveTimex));
			}
		}
		return effectiveTimex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetEffectiveTimex() {
		return effectiveTimex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTimex(DataType newEffectiveTimex) {
		DataType oldEffectiveTimex = effectiveTimex;
		effectiveTimex = newEffectiveTimex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX, oldEffectiveTimex, effectiveTimex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getMedicationx() {
		if (medicationx != null && medicationx.eIsProxy()) {
			InternalEObject oldMedicationx = (InternalEObject)medicationx;
			medicationx = (Base)eResolveProxy(oldMedicationx);
			if (medicationx != oldMedicationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX, oldMedicationx, medicationx));
			}
		}
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(Base newMedicationx) {
		Base oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, FhirResourcePackage.MEDICATION_ADMINISTRATION__DEVICE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(org.eclipse.mdht.uml.fhir.core.datatype.String newNote) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage getDosage() {
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDosage(MedicationAdministrationDosage newDosage, NotificationChain msgs) {
		MedicationAdministrationDosage oldDosage = dosage;
		dosage = newDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE, oldDosage, newDosage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDosage(MedicationAdministrationDosage newDosage) {
		if (newDosage != dosage) {
			NotificationChain msgs = null;
			if (dosage != null)
				msgs = ((InternalEObject)dosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			if (newDosage != null)
				msgs = ((InternalEObject)newDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			msgs = basicSetDosage(newDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE, newDosage, newDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return basicSetDosage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				if (resolve) return getPractitioner();
				return basicGetPractitioner();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				if (resolve) return getPrescription();
				return basicGetPrescription();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				if (resolve) return getWasNotGiven();
				return basicGetWasNotGiven();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return getReasonNotGivens();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return getReasonGivens();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX:
				if (resolve) return getEffectiveTimex();
				return basicGetEffectiveTimex();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DEVICE:
				return getDevices();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return getDosage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				setPractitioner((Resource)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((MedicationOrder)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGivens().clear();
				getReasonNotGivens().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGivens().clear();
				getReasonGivens().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX:
				setEffectiveTimex((DataType)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				setPractitioner((Resource)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((MedicationOrder)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				setWasNotGiven((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGivens().clear();
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGivens().clear();
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX:
				setEffectiveTimex((DataType)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevices().clear();
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__STATUS:
				return status != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PATIENT:
				return patient != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRACTITIONER:
				return practitioner != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return prescription != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__WAS_NOT_GIVEN:
				return wasNotGiven != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return reasonNotGivens != null && !reasonNotGivens.isEmpty();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return reasonGivens != null && !reasonGivens.isEmpty();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__EFFECTIVE_TIMEX:
				return effectiveTimex != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				return medicationx != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DEVICE:
				return devices != null && !devices.isEmpty();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__NOTE:
				return note != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return dosage != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationImpl
