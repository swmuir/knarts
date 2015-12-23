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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Condition;
import org.eclipse.mdht.uml.fhir.core.resource.ConditionEvidence;
import org.eclipse.mdht.uml.fhir.core.resource.ConditionStage;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getDateRecorded <em>Date Recorded</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getAbatementx <em>Abatementx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getEvidences <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConditionImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends DomainResourceImpl implements Condition {
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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Resource asserter;

	/**
	 * The cached value of the '{@link #getDateRecorded() <em>Date Recorded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRecorded()
	 * @generated
	 * @ordered
	 */
	protected Date dateRecorded;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getClinicalStatus() <em>Clinical Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalStatus()
	 * @generated
	 * @ordered
	 */
	protected Code clinicalStatus;

	/**
	 * The cached value of the '{@link #getVerificationStatus() <em>Verification Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationStatus()
	 * @generated
	 * @ordered
	 */
	protected Code verificationStatus;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept severity;

	/**
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

	/**
	 * The cached value of the '{@link #getAbatementx() <em>Abatementx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbatementx()
	 * @generated
	 * @ordered
	 */
	protected DataType abatementx;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected ConditionStage stage;

	/**
	 * The cached value of the '{@link #getEvidences() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionEvidence> evidences;

	/**
	 * The cached value of the '{@link #getBodySites() <em>Body Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySites;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.CONDITION__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__PATIENT, oldPatient, patient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAsserter() {
		if (asserter != null && asserter.eIsProxy()) {
			InternalEObject oldAsserter = (InternalEObject)asserter;
			asserter = (Resource)eResolveProxy(oldAsserter);
			if (asserter != oldAsserter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__ASSERTER, oldAsserter, asserter));
			}
		}
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsserter(Resource newAsserter) {
		Resource oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__ASSERTER, oldAsserter, asserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateRecorded() {
		if (dateRecorded != null && dateRecorded.eIsProxy()) {
			InternalEObject oldDateRecorded = (InternalEObject)dateRecorded;
			dateRecorded = (Date)eResolveProxy(oldDateRecorded);
			if (dateRecorded != oldDateRecorded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__DATE_RECORDED, oldDateRecorded, dateRecorded));
			}
		}
		return dateRecorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetDateRecorded() {
		return dateRecorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRecorded(Date newDateRecorded) {
		Date oldDateRecorded = dateRecorded;
		dateRecorded = newDateRecorded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__DATE_RECORDED, oldDateRecorded, dateRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CodeableConcept)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getClinicalStatus() {
		if (clinicalStatus != null && clinicalStatus.eIsProxy()) {
			InternalEObject oldClinicalStatus = (InternalEObject)clinicalStatus;
			clinicalStatus = (Code)eResolveProxy(oldClinicalStatus);
			if (clinicalStatus != oldClinicalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
			}
		}
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetClinicalStatus() {
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalStatus(Code newClinicalStatus) {
		Code oldClinicalStatus = clinicalStatus;
		clinicalStatus = newClinicalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__CLINICAL_STATUS, oldClinicalStatus, clinicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVerificationStatus() {
		if (verificationStatus != null && verificationStatus.eIsProxy()) {
			InternalEObject oldVerificationStatus = (InternalEObject)verificationStatus;
			verificationStatus = (Code)eResolveProxy(oldVerificationStatus);
			if (verificationStatus != oldVerificationStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
			}
		}
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationStatus(Code newVerificationStatus) {
		Code oldVerificationStatus = verificationStatus;
		verificationStatus = newVerificationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__VERIFICATION_STATUS, oldVerificationStatus, verificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (CodeableConcept)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(CodeableConcept newSeverity) {
		CodeableConcept oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOnsetx() {
		if (onsetx != null && onsetx.eIsProxy()) {
			InternalEObject oldOnsetx = (InternalEObject)onsetx;
			onsetx = (DataType)eResolveProxy(oldOnsetx);
			if (onsetx != oldOnsetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__ONSETX, oldOnsetx, onsetx));
			}
		}
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetx(DataType newOnsetx) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__ONSETX, oldOnsetx, onsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAbatementx() {
		if (abatementx != null && abatementx.eIsProxy()) {
			InternalEObject oldAbatementx = (InternalEObject)abatementx;
			abatementx = (DataType)eResolveProxy(oldAbatementx);
			if (abatementx != oldAbatementx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__ABATEMENTX, oldAbatementx, abatementx));
			}
		}
		return abatementx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAbatementx() {
		return abatementx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbatementx(DataType newAbatementx) {
		DataType oldAbatementx = abatementx;
		abatementx = newAbatementx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__ABATEMENTX, oldAbatementx, abatementx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(ConditionStage newStage, NotificationChain msgs) {
		ConditionStage oldStage = stage;
		stage = newStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__STAGE, oldStage, newStage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(ConditionStage newStage) {
		if (newStage != stage) {
			NotificationChain msgs = null;
			if (stage != null)
				msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CONDITION__STAGE, null, msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CONDITION__STAGE, null, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionEvidence> getEvidences() {
		if (evidences == null) {
			evidences = new EObjectContainmentEList<ConditionEvidence>(ConditionEvidence.class, this, FhirResourcePackage.CONDITION__EVIDENCE);
		}
		return evidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CONDITION__BODY_SITE);
		}
		return bodySites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNotes() {
		if (notes != null && notes.eIsProxy()) {
			InternalEObject oldNotes = (InternalEObject)notes;
			notes = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNotes);
			if (notes != oldNotes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONDITION__NOTES, oldNotes, notes));
			}
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(org.eclipse.mdht.uml.fhir.core.datatype.String newNotes) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONDITION__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONDITION__STAGE:
				return basicSetStage(null, msgs);
			case FhirResourcePackage.CONDITION__EVIDENCE:
				return ((InternalEList<?>)getEvidences()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONDITION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.CONDITION__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.CONDITION__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.CONDITION__ASSERTER:
				if (resolve) return getAsserter();
				return basicGetAsserter();
			case FhirResourcePackage.CONDITION__DATE_RECORDED:
				if (resolve) return getDateRecorded();
				return basicGetDateRecorded();
			case FhirResourcePackage.CONDITION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.CONDITION__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.CONDITION__CLINICAL_STATUS:
				if (resolve) return getClinicalStatus();
				return basicGetClinicalStatus();
			case FhirResourcePackage.CONDITION__VERIFICATION_STATUS:
				if (resolve) return getVerificationStatus();
				return basicGetVerificationStatus();
			case FhirResourcePackage.CONDITION__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case FhirResourcePackage.CONDITION__ONSETX:
				if (resolve) return getOnsetx();
				return basicGetOnsetx();
			case FhirResourcePackage.CONDITION__ABATEMENTX:
				if (resolve) return getAbatementx();
				return basicGetAbatementx();
			case FhirResourcePackage.CONDITION__STAGE:
				return getStage();
			case FhirResourcePackage.CONDITION__EVIDENCE:
				return getEvidences();
			case FhirResourcePackage.CONDITION__BODY_SITE:
				return getBodySites();
			case FhirResourcePackage.CONDITION__NOTES:
				if (resolve) return getNotes();
				return basicGetNotes();
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
			case FhirResourcePackage.CONDITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.CONDITION__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.CONDITION__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.CONDITION__ASSERTER:
				setAsserter((Resource)newValue);
				return;
			case FhirResourcePackage.CONDITION__DATE_RECORDED:
				setDateRecorded((Date)newValue);
				return;
			case FhirResourcePackage.CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.CONDITION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((Code)newValue);
				return;
			case FhirResourcePackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((Code)newValue);
				return;
			case FhirResourcePackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.CONDITION__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case FhirResourcePackage.CONDITION__ABATEMENTX:
				setAbatementx((DataType)newValue);
				return;
			case FhirResourcePackage.CONDITION__STAGE:
				setStage((ConditionStage)newValue);
				return;
			case FhirResourcePackage.CONDITION__EVIDENCE:
				getEvidences().clear();
				getEvidences().addAll((Collection<? extends ConditionEvidence>)newValue);
				return;
			case FhirResourcePackage.CONDITION__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CONDITION__NOTES:
				setNotes((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.CONDITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.CONDITION__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.CONDITION__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.CONDITION__ASSERTER:
				setAsserter((Resource)null);
				return;
			case FhirResourcePackage.CONDITION__DATE_RECORDED:
				setDateRecorded((Date)null);
				return;
			case FhirResourcePackage.CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.CONDITION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirResourcePackage.CONDITION__CLINICAL_STATUS:
				setClinicalStatus((Code)null);
				return;
			case FhirResourcePackage.CONDITION__VERIFICATION_STATUS:
				setVerificationStatus((Code)null);
				return;
			case FhirResourcePackage.CONDITION__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case FhirResourcePackage.CONDITION__ONSETX:
				setOnsetx((DataType)null);
				return;
			case FhirResourcePackage.CONDITION__ABATEMENTX:
				setAbatementx((DataType)null);
				return;
			case FhirResourcePackage.CONDITION__STAGE:
				setStage((ConditionStage)null);
				return;
			case FhirResourcePackage.CONDITION__EVIDENCE:
				getEvidences().clear();
				return;
			case FhirResourcePackage.CONDITION__BODY_SITE:
				getBodySites().clear();
				return;
			case FhirResourcePackage.CONDITION__NOTES:
				setNotes((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.CONDITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.CONDITION__PATIENT:
				return patient != null;
			case FhirResourcePackage.CONDITION__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.CONDITION__ASSERTER:
				return asserter != null;
			case FhirResourcePackage.CONDITION__DATE_RECORDED:
				return dateRecorded != null;
			case FhirResourcePackage.CONDITION__CODE:
				return code != null;
			case FhirResourcePackage.CONDITION__CATEGORY:
				return category != null;
			case FhirResourcePackage.CONDITION__CLINICAL_STATUS:
				return clinicalStatus != null;
			case FhirResourcePackage.CONDITION__VERIFICATION_STATUS:
				return verificationStatus != null;
			case FhirResourcePackage.CONDITION__SEVERITY:
				return severity != null;
			case FhirResourcePackage.CONDITION__ONSETX:
				return onsetx != null;
			case FhirResourcePackage.CONDITION__ABATEMENTX:
				return abatementx != null;
			case FhirResourcePackage.CONDITION__STAGE:
				return stage != null;
			case FhirResourcePackage.CONDITION__EVIDENCE:
				return evidences != null && !evidences.isEmpty();
			case FhirResourcePackage.CONDITION__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case FhirResourcePackage.CONDITION__NOTES:
				return notes != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
