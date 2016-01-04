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

import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance;
import org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getLastOccurence <em>Last Occurence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AllergyIntoleranceImpl#getReactions <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends DomainResourceImpl implements AllergyIntolerance {
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
	 * The cached value of the '{@link #getOnset() <em>Onset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnset()
	 * @generated
	 * @ordered
	 */
	protected DateTime onset;

	/**
	 * The cached value of the '{@link #getRecordedDate() <em>Recorded Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedDate;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Resource recorder;

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
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected Resource reporter;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

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
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Code criticality;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Code category;

	/**
	 * The cached value of the '{@link #getLastOccurence() <em>Last Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurence()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastOccurence;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Annotation note;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceReaction> reactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAllergyIntolerance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.ALLERGY_INTOLERANCE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOnset() {
		if (onset != null && onset.eIsProxy()) {
			InternalEObject oldOnset = (InternalEObject)onset;
			onset = (DateTime)eResolveProxy(oldOnset);
			if (onset != oldOnset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET, oldOnset, onset));
			}
		}
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetOnset() {
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnset(DateTime newOnset) {
		DateTime oldOnset = onset;
		onset = newOnset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET, oldOnset, onset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecordedDate() {
		if (recordedDate != null && recordedDate.eIsProxy()) {
			InternalEObject oldRecordedDate = (InternalEObject)recordedDate;
			recordedDate = (DateTime)eResolveProxy(oldRecordedDate);
			if (recordedDate != oldRecordedDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE, oldRecordedDate, recordedDate));
			}
		}
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetRecordedDate() {
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedDate(DateTime newRecordedDate) {
		DateTime oldRecordedDate = recordedDate;
		recordedDate = newRecordedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE, oldRecordedDate, recordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRecorder() {
		if (recorder != null && recorder.eIsProxy()) {
			InternalEObject oldRecorder = (InternalEObject)recorder;
			recorder = (Resource)eResolveProxy(oldRecorder);
			if (recorder != oldRecorder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, recorder));
			}
		}
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(Resource newRecorder) {
		Resource oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, recorder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReporter() {
		if (reporter != null && reporter.eIsProxy()) {
			InternalEObject oldReporter = (InternalEObject)reporter;
			reporter = (Resource)eResolveProxy(oldReporter);
			if (reporter != oldReporter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER, oldReporter, reporter));
			}
		}
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(Resource newReporter) {
		Resource oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER, oldReporter, reporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstance() {
		if (substance != null && substance.eIsProxy()) {
			InternalEObject oldSubstance = (InternalEObject)substance;
			substance = (CodeableConcept)eResolveProxy(oldSubstance);
			if (substance != oldSubstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE, oldSubstance, substance));
			}
		}
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(CodeableConcept newSubstance) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE, oldSubstance, substance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCriticality() {
		if (criticality != null && criticality.eIsProxy()) {
			InternalEObject oldCriticality = (InternalEObject)criticality;
			criticality = (Code)eResolveProxy(oldCriticality);
			if (criticality != oldCriticality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, criticality));
			}
		}
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(Code newCriticality) {
		Code oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Code)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastOccurence() {
		if (lastOccurence != null && lastOccurence.eIsProxy()) {
			InternalEObject oldLastOccurence = (InternalEObject)lastOccurence;
			lastOccurence = (DateTime)eResolveProxy(oldLastOccurence);
			if (lastOccurence != oldLastOccurence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE, oldLastOccurence, lastOccurence));
			}
		}
		return lastOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetLastOccurence() {
		return lastOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOccurence(DateTime newLastOccurence) {
		DateTime oldLastOccurence = lastOccurence;
		lastOccurence = newLastOccurence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE, oldLastOccurence, lastOccurence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (Annotation)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Annotation newNote) {
		Annotation oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntoleranceReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<AllergyIntoleranceReaction>(AllergyIntoleranceReaction.class, this, FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET:
				if (resolve) return getOnset();
				return basicGetOnset();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				if (resolve) return getRecordedDate();
				return basicGetRecordedDate();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER:
				if (resolve) return getRecorder();
				return basicGetRecorder();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER:
				if (resolve) return getReporter();
				return basicGetReporter();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE:
				if (resolve) return getSubstance();
				return basicGetSubstance();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY:
				if (resolve) return getCriticality();
				return basicGetCriticality();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE:
				if (resolve) return getLastOccurence();
				return basicGetLastOccurence();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION:
				return getReactions();
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
			case FhirResourcePackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET:
				setOnset((DateTime)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Resource)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER:
				setReporter((Resource)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY:
				setCategory((Code)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE:
				setLastOccurence((DateTime)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE:
				setNote((Annotation)newValue);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
				getReactions().addAll((Collection<? extends AllergyIntoleranceReaction>)newValue);
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
			case FhirResourcePackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET:
				setOnset((DateTime)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Resource)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER:
				setReporter((Resource)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY:
				setCategory((Code)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE:
				setLastOccurence((DateTime)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE:
				setNote((Annotation)null);
				return;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
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
			case FhirResourcePackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.ALLERGY_INTOLERANCE__ONSET:
				return onset != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return recordedDate != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__RECORDER:
				return recorder != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__PATIENT:
				return patient != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REPORTER:
				return reporter != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__SUBSTANCE:
				return substance != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__STATUS:
				return status != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return criticality != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__TYPE:
				return type != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__CATEGORY:
				return category != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__LAST_OCCURENCE:
				return lastOccurence != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__NOTE:
				return note != null;
			case FhirResourcePackage.ALLERGY_INTOLERANCE__REACTION:
				return reactions != null && !reactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceImpl
