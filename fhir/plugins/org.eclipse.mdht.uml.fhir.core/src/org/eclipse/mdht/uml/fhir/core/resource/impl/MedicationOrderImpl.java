/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrder;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDosageInstruction;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderSubstitution;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getDateEnded <em>Date Ended</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getReasonEnded <em>Reason Ended</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getReasonx <em>Reasonx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationOrderImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationOrderImpl extends DomainResourceImpl implements MedicationOrder {
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
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

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
	 * The cached value of the '{@link #getDateEnded() <em>Date Ended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnded()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateEnded;

	/**
	 * The cached value of the '{@link #getReasonEnded() <em>Reason Ended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnded()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonEnded;

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
	 * The cached value of the '{@link #getPrescriber() <em>Prescriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriber()
	 * @generated
	 * @ordered
	 */
	protected Practitioner prescriber;

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
	 * The cached value of the '{@link #getReasonx() <em>Reasonx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonx()
	 * @generated
	 * @ordered
	 */
	protected Base reasonx;

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
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

	/**
	 * The cached value of the '{@link #getDosageInstructions() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationOrderDosageInstruction> dosageInstructions;

	/**
	 * The cached value of the '{@link #getDispenseRequest() <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrderDispenseRequest dispenseRequest;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrderSubstitution substitution;

	/**
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrder priorPrescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.MEDICATION_ORDER__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		if (dateWritten != null && dateWritten.eIsProxy()) {
			InternalEObject oldDateWritten = (InternalEObject)dateWritten;
			dateWritten = (DateTime)eResolveProxy(oldDateWritten);
			if (dateWritten != oldDateWritten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN, oldDateWritten, dateWritten));
			}
		}
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN, oldDateWritten, dateWritten));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateEnded() {
		if (dateEnded != null && dateEnded.eIsProxy()) {
			InternalEObject oldDateEnded = (InternalEObject)dateEnded;
			dateEnded = (DateTime)eResolveProxy(oldDateEnded);
			if (dateEnded != oldDateEnded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED, oldDateEnded, dateEnded));
			}
		}
		return dateEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateEnded() {
		return dateEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnded(DateTime newDateEnded) {
		DateTime oldDateEnded = dateEnded;
		dateEnded = newDateEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED, oldDateEnded, dateEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonEnded() {
		if (reasonEnded != null && reasonEnded.eIsProxy()) {
			InternalEObject oldReasonEnded = (InternalEObject)reasonEnded;
			reasonEnded = (CodeableConcept)eResolveProxy(oldReasonEnded);
			if (reasonEnded != oldReasonEnded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED, oldReasonEnded, reasonEnded));
			}
		}
		return reasonEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReasonEnded() {
		return reasonEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonEnded(CodeableConcept newReasonEnded) {
		CodeableConcept oldReasonEnded = reasonEnded;
		reasonEnded = newReasonEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED, oldReasonEnded, reasonEnded));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPrescriber() {
		if (prescriber != null && prescriber.eIsProxy()) {
			InternalEObject oldPrescriber = (InternalEObject)prescriber;
			prescriber = (Practitioner)eResolveProxy(oldPrescriber);
			if (prescriber != oldPrescriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER, oldPrescriber, prescriber));
			}
		}
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetPrescriber() {
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriber(Practitioner newPrescriber) {
		Practitioner oldPrescriber = prescriber;
		prescriber = newPrescriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER, oldPrescriber, prescriber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getReasonx() {
		if (reasonx != null && reasonx.eIsProxy()) {
			InternalEObject oldReasonx = (InternalEObject)reasonx;
			reasonx = (Base)eResolveProxy(oldReasonx);
			if (reasonx != oldReasonx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__REASONX, oldReasonx, reasonx));
			}
		}
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetReasonx() {
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonx(Base newReasonx) {
		Base oldReasonx = reasonx;
		reasonx = newReasonx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__REASONX, oldReasonx, reasonx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__NOTE, oldNote, note));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__NOTE, oldNote, note));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX, oldMedicationx, medicationx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrderDosageInstruction> getDosageInstructions() {
		if (dosageInstructions == null) {
			dosageInstructions = new EObjectContainmentEList<MedicationOrderDosageInstruction>(MedicationOrderDosageInstruction.class, this, FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDispenseRequest getDispenseRequest() {
		return dispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseRequest(MedicationOrderDispenseRequest newDispenseRequest, NotificationChain msgs) {
		MedicationOrderDispenseRequest oldDispenseRequest = dispenseRequest;
		dispenseRequest = newDispenseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenseRequest(MedicationOrderDispenseRequest newDispenseRequest) {
		if (newDispenseRequest != dispenseRequest) {
			NotificationChain msgs = null;
			if (dispenseRequest != null)
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationOrderSubstitution newSubstitution, NotificationChain msgs) {
		MedicationOrderSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationOrderSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder getPriorPrescription() {
		if (priorPrescription != null && priorPrescription.eIsProxy()) {
			InternalEObject oldPriorPrescription = (InternalEObject)priorPrescription;
			priorPrescription = (MedicationOrder)eResolveProxy(oldPriorPrescription);
			if (priorPrescription != oldPriorPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, oldPriorPrescription, priorPrescription));
			}
		}
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder basicGetPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorPrescription(MedicationOrder newPriorPrescription) {
		MedicationOrder oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION, oldPriorPrescription, priorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstructions()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
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
			case FhirResourcePackage.MEDICATION_ORDER__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN:
				if (resolve) return getDateWritten();
				return basicGetDateWritten();
			case FhirResourcePackage.MEDICATION_ORDER__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED:
				if (resolve) return getDateEnded();
				return basicGetDateEnded();
			case FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED:
				if (resolve) return getReasonEnded();
				return basicGetReasonEnded();
			case FhirResourcePackage.MEDICATION_ORDER__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER:
				if (resolve) return getPrescriber();
				return basicGetPrescriber();
			case FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.MEDICATION_ORDER__REASONX:
				if (resolve) return getReasonx();
				return basicGetReasonx();
			case FhirResourcePackage.MEDICATION_ORDER__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return getDispenseRequest();
			case FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION:
				return getSubstitution();
			case FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				if (resolve) return getPriorPrescription();
				return basicGetPriorPrescription();
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
			case FhirResourcePackage.MEDICATION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED:
				setDateEnded((DateTime)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED:
				setReasonEnded((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER:
				setPrescriber((Practitioner)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__REASONX:
				setReasonx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends MedicationOrderDosageInstruction>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				setDispenseRequest((MedicationOrderDispenseRequest)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION:
				setSubstitution((MedicationOrderSubstitution)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				setPriorPrescription((MedicationOrder)newValue);
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
			case FhirResourcePackage.MEDICATION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED:
				setDateEnded((DateTime)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED:
				setReasonEnded((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER:
				setPrescriber((Practitioner)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__REASONX:
				setReasonx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				setDispenseRequest((MedicationOrderDispenseRequest)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION:
				setSubstitution((MedicationOrderSubstitution)null);
				return;
			case FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				setPriorPrescription((MedicationOrder)null);
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
			case FhirResourcePackage.MEDICATION_ORDER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.MEDICATION_ORDER__DATE_WRITTEN:
				return dateWritten != null;
			case FhirResourcePackage.MEDICATION_ORDER__STATUS:
				return status != null;
			case FhirResourcePackage.MEDICATION_ORDER__DATE_ENDED:
				return dateEnded != null;
			case FhirResourcePackage.MEDICATION_ORDER__REASON_ENDED:
				return reasonEnded != null;
			case FhirResourcePackage.MEDICATION_ORDER__PATIENT:
				return patient != null;
			case FhirResourcePackage.MEDICATION_ORDER__PRESCRIBER:
				return prescriber != null;
			case FhirResourcePackage.MEDICATION_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.MEDICATION_ORDER__REASONX:
				return reasonx != null;
			case FhirResourcePackage.MEDICATION_ORDER__NOTE:
				return note != null;
			case FhirResourcePackage.MEDICATION_ORDER__MEDICATIONX:
				return medicationx != null;
			case FhirResourcePackage.MEDICATION_ORDER__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case FhirResourcePackage.MEDICATION_ORDER__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case FhirResourcePackage.MEDICATION_ORDER__SUBSTITUTION:
				return substitution != null;
			case FhirResourcePackage.MEDICATION_ORDER__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationOrderImpl
