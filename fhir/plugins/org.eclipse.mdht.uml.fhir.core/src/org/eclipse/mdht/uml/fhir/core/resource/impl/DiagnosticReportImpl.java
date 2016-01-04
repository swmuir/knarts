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

import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReport;
import org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReportImage;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Observation;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.Specimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getRequests <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getImagingStudies <em>Imaging Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getImages <em>Image</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getCodedDiagnosis <em>Coded Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticReportImpl#getPresentedForms <em>Presented Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticReportImpl extends DomainResourceImpl implements DiagnosticReport {
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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

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
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Resource performer;

	/**
	 * The cached value of the '{@link #getRequests() <em>Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requests;

	/**
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> specimens;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> results;

	/**
	 * The cached value of the '{@link #getImagingStudies() <em>Imaging Study</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudies()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> imagingStudies;

	/**
	 * The cached value of the '{@link #getImages() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportImage> images;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String conclusion;

	/**
	 * The cached value of the '{@link #getCodedDiagnosis() <em>Coded Diagnosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codedDiagnosis;

	/**
	 * The cached value of the '{@link #getPresentedForms() <em>Presented Form</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> presentedForms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDiagnosticReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, encounter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX, oldEffectivex, effectivex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX, oldEffectivex, effectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		if (issued != null && issued.eIsProxy()) {
			InternalEObject oldIssued = (InternalEObject)issued;
			issued = (Instant)eResolveProxy(oldIssued);
			if (issued != oldIssued) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, issued));
			}
		}
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Resource)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Resource newPerformer) {
		Resource oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequests() {
		if (requests == null) {
			requests = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__REQUEST);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectResolvingEList<Specimen>(Specimen.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getResults() {
		if (results == null) {
			results = new EObjectResolvingEList<Observation>(Observation.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getImagingStudies() {
		if (imagingStudies == null) {
			imagingStudies = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGING_STUDY);
		}
		return imagingStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReportImage> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<DiagnosticReportImage>(DiagnosticReportImage.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getConclusion() {
		if (conclusion != null && conclusion.eIsProxy()) {
			InternalEObject oldConclusion = (InternalEObject)conclusion;
			conclusion = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldConclusion);
			if (conclusion != oldConclusion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, conclusion));
			}
		}
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(org.eclipse.mdht.uml.fhir.core.datatype.String newConclusion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodedDiagnosis() {
		if (codedDiagnosis == null) {
			codedDiagnosis = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS);
		}
		return codedDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPresentedForms() {
		if (presentedForms == null) {
			presentedForms = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.DIAGNOSTIC_REPORT__PRESENTED_FORM);
		}
		return presentedForms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED:
				if (resolve) return getIssued();
				return basicGetIssued();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__REQUEST:
				return getRequests();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return getSpecimens();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__RESULT:
				return getResults();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return getImagingStudies();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE:
				return getImages();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION:
				if (resolve) return getConclusion();
				return basicGetConclusion();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return getCodedDiagnosis();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return getPresentedForms();
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
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER:
				setPerformer((Resource)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				getResults().addAll((Collection<? extends Observation>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				getImagingStudies().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE:
				getImages().clear();
				getImages().addAll((Collection<? extends DiagnosticReportImage>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				getCodedDiagnosis().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
				getPresentedForms().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER:
				setPerformer((Resource)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__REQUEST:
				getRequests().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE:
				getImages().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				getCodedDiagnosis().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
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
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__STATUS:
				return status != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CATEGORY:
				return category != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODE:
				return code != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SUBJECT:
				return subject != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				return effectivex != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__ISSUED:
				return issued != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PERFORMER:
				return performer != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__REQUEST:
				return requests != null && !requests.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__RESULT:
				return results != null && !results.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return imagingStudies != null && !imagingStudies.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__IMAGE:
				return images != null && !images.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return conclusion != null;
			case FhirResourcePackage.DIAGNOSTIC_REPORT__CODED_DIAGNOSIS:
				return codedDiagnosis != null && !codedDiagnosis.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return presentedForms != null && !presentedForms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportImpl
