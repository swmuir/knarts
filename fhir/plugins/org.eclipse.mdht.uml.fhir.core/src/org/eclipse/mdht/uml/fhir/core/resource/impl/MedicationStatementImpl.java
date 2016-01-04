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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getWasNotTaken <em>Was Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getReasonNotTakens <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getReasonForUsex <em>Reason For Usex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementImpl#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Resource informationSource;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

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
	 * The cached value of the '{@link #getWasNotTaken() <em>Was Not Taken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWasNotTaken()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean wasNotTaken;

	/**
	 * The cached value of the '{@link #getReasonNotTakens() <em>Reason Not Taken</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotTakens()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotTakens;

	/**
	 * The cached value of the '{@link #getReasonForUsex() <em>Reason For Usex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUsex()
	 * @generated
	 * @ordered
	 */
	protected Base reasonForUsex;

	/**
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

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
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supportingInformations;

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
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationStatementDosage> dosages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.MEDICATION_STATEMENT__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getInformationSource() {
		if (informationSource != null && informationSource.eIsProxy()) {
			InternalEObject oldInformationSource = (InternalEObject)informationSource;
			informationSource = (Resource)eResolveProxy(oldInformationSource);
			if (informationSource != oldInformationSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, informationSource));
			}
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(Resource newInformationSource) {
		Resource oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, informationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateAsserted() {
		if (dateAsserted != null && dateAsserted.eIsProxy()) {
			InternalEObject oldDateAsserted = (InternalEObject)dateAsserted;
			dateAsserted = (DateTime)eResolveProxy(oldDateAsserted);
			if (dateAsserted != oldDateAsserted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, dateAsserted));
			}
		}
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, dateAsserted));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getWasNotTaken() {
		if (wasNotTaken != null && wasNotTaken.eIsProxy()) {
			InternalEObject oldWasNotTaken = (InternalEObject)wasNotTaken;
			wasNotTaken = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldWasNotTaken);
			if (wasNotTaken != oldWasNotTaken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN, oldWasNotTaken, wasNotTaken));
			}
		}
		return wasNotTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetWasNotTaken() {
		return wasNotTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasNotTaken(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newWasNotTaken) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldWasNotTaken = wasNotTaken;
		wasNotTaken = newWasNotTaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN, oldWasNotTaken, wasNotTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotTakens() {
		if (reasonNotTakens == null) {
			reasonNotTakens = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN);
		}
		return reasonNotTakens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getReasonForUsex() {
		if (reasonForUsex != null && reasonForUsex.eIsProxy()) {
			InternalEObject oldReasonForUsex = (InternalEObject)reasonForUsex;
			reasonForUsex = (Base)eResolveProxy(oldReasonForUsex);
			if (reasonForUsex != oldReasonForUsex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX, oldReasonForUsex, reasonForUsex));
			}
		}
		return reasonForUsex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetReasonForUsex() {
		return reasonForUsex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonForUsex(Base newReasonForUsex) {
		Base oldReasonForUsex = reasonForUsex;
		reasonForUsex = newReasonForUsex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX, oldReasonForUsex, reasonForUsex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectivex() {
		if (effectivex != null && effectivex.eIsProxy()) {
			InternalEObject oldEffectivex = (InternalEObject)effectivex;
			effectivex = (DataType)eResolveProxy(oldEffectivex);
			if (effectivex != oldEffectivex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX, oldEffectivex, effectivex));
			}
		}
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetEffectivex() {
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivex(DataType newEffectivex) {
		DataType oldEffectivex = effectivex;
		effectivex = newEffectivex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX, oldEffectivex, effectivex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__NOTE, oldNote, note));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.MEDICATION_STATEMENT__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX, oldMedicationx, medicationx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationStatementDosage> getDosages() {
		if (dosages == null) {
			dosages = new EObjectContainmentEList<MedicationStatementDosage>(MedicationStatementDosage.class, this, FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE:
				return ((InternalEList<?>)getDosages()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.MEDICATION_STATEMENT__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				if (resolve) return getInformationSource();
				return basicGetInformationSource();
			case FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				if (resolve) return getDateAsserted();
				return basicGetDateAsserted();
			case FhirResourcePackage.MEDICATION_STATEMENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN:
				if (resolve) return getWasNotTaken();
				return basicGetWasNotTaken();
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return getReasonNotTakens();
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX:
				if (resolve) return getReasonForUsex();
				return basicGetReasonForUsex();
			case FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case FhirResourcePackage.MEDICATION_STATEMENT__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.MEDICATION_STATEMENT__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE:
				return getDosages();
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
			case FhirResourcePackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Resource)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN:
				setWasNotTaken((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTakens().clear();
				getReasonNotTakens().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX:
				setReasonForUsex((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends MedicationStatementDosage>)newValue);
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
			case FhirResourcePackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Resource)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN:
				setWasNotTaken((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTakens().clear();
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX:
				setReasonForUsex((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
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
			case FhirResourcePackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.MEDICATION_STATEMENT__PATIENT:
				return patient != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__WAS_NOT_TAKEN:
				return wasNotTaken != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return reasonNotTakens != null && !reasonNotTakens.isEmpty();
			case FhirResourcePackage.MEDICATION_STATEMENT__REASON_FOR_USEX:
				return reasonForUsex != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__EFFECTIVEX:
				return effectivex != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__NOTE:
				return note != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case FhirResourcePackage.MEDICATION_STATEMENT__MEDICATIONX:
				return medicationx != null;
			case FhirResourcePackage.MEDICATION_STATEMENT__DOSAGE:
				return dosages != null && !dosages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
