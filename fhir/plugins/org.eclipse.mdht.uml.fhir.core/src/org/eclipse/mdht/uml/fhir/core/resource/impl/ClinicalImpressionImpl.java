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
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.ClinicalImpression;
import org.eclipse.mdht.uml.fhir.core.resource.ClinicalImpressionFinding;
import org.eclipse.mdht.uml.fhir.core.resource.ClinicalImpressionInvestigations;
import org.eclipse.mdht.uml.fhir.core.resource.ClinicalImpressionRuledOut;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getProblems <em>Problem</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getTriggerx <em>Triggerx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getInvestigations <em>Investigations</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getFindings <em>Finding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getResolveds <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getRuledOuts <em>Ruled Out</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getPrognosis <em>Prognosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getPlans <em>Plan</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClinicalImpressionImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionImpl extends DomainResourceImpl implements ClinicalImpression {
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
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected Practitioner assessor;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ClinicalImpression previous;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> problems;

	/**
	 * The cached value of the '{@link #getTriggerx() <em>Triggerx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerx()
	 * @generated
	 * @ordered
	 */
	protected Base triggerx;

	/**
	 * The cached value of the '{@link #getInvestigations() <em>Investigations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvestigations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionInvestigations> investigations;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Uri protocol;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String summary;

	/**
	 * The cached value of the '{@link #getFindings() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionFinding> findings;

	/**
	 * The cached value of the '{@link #getResolveds() <em>Resolved</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveds()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> resolveds;

	/**
	 * The cached value of the '{@link #getRuledOuts() <em>Ruled Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuledOuts()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionRuledOut> ruledOuts;

	/**
	 * The cached value of the '{@link #getPrognosis() <em>Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosis()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String prognosis;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plan</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> plans;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClinicalImpression();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getAssessor() {
		if (assessor != null && assessor.eIsProxy()) {
			InternalEObject oldAssessor = (InternalEObject)assessor;
			assessor = (Practitioner)eResolveProxy(oldAssessor);
			if (assessor != oldAssessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, assessor));
			}
		}
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessor(Practitioner newAssessor) {
		Practitioner oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, assessor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ClinicalImpression)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ClinicalImpression newPrevious) {
		ClinicalImpression oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProblems() {
		if (problems == null) {
			problems = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__PROBLEM);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getTriggerx() {
		if (triggerx != null && triggerx.eIsProxy()) {
			InternalEObject oldTriggerx = (InternalEObject)triggerx;
			triggerx = (Base)eResolveProxy(oldTriggerx);
			if (triggerx != oldTriggerx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX, oldTriggerx, triggerx));
			}
		}
		return triggerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetTriggerx() {
		return triggerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerx(Base newTriggerx) {
		Base oldTriggerx = triggerx;
		triggerx = newTriggerx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX, oldTriggerx, triggerx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionInvestigations> getInvestigations() {
		if (investigations == null) {
			investigations = new EObjectContainmentEList<ClinicalImpressionInvestigations>(ClinicalImpressionInvestigations.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS);
		}
		return investigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (Uri)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Uri newProtocol) {
		Uri oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getSummary() {
		if (summary != null && summary.eIsProxy()) {
			InternalEObject oldSummary = (InternalEObject)summary;
			summary = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldSummary);
			if (summary != oldSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, summary));
			}
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(org.eclipse.mdht.uml.fhir.core.datatype.String newSummary) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionFinding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<ClinicalImpressionFinding>(ClinicalImpressionFinding.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__FINDING);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getResolveds() {
		if (resolveds == null) {
			resolveds = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__RESOLVED);
		}
		return resolveds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionRuledOut> getRuledOuts() {
		if (ruledOuts == null) {
			ruledOuts = new EObjectContainmentEList<ClinicalImpressionRuledOut>(ClinicalImpressionRuledOut.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT);
		}
		return ruledOuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPrognosis() {
		if (prognosis != null && prognosis.eIsProxy()) {
			InternalEObject oldPrognosis = (InternalEObject)prognosis;
			prognosis = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPrognosis);
			if (prognosis != oldPrognosis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS, oldPrognosis, prognosis));
			}
		}
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPrognosis() {
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosis(org.eclipse.mdht.uml.fhir.core.datatype.String newPrognosis) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPrognosis = prognosis;
		prognosis = newPrognosis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS, oldPrognosis, prognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPlans() {
		if (plans == null) {
			plans = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__PLAN);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.CLINICAL_IMPRESSION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return ((InternalEList<?>)getInvestigations()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLINICAL_IMPRESSION__FINDING:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT:
				return ((InternalEList<?>)getRuledOuts()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR:
				if (resolve) return getAssessor();
				return basicGetAssessor();
			case FhirResourcePackage.CLINICAL_IMPRESSION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.CLINICAL_IMPRESSION__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROBLEM:
				return getProblems();
			case FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX:
				if (resolve) return getTriggerx();
				return basicGetTriggerx();
			case FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return getInvestigations();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY:
				if (resolve) return getSummary();
				return basicGetSummary();
			case FhirResourcePackage.CLINICAL_IMPRESSION__FINDING:
				return getFindings();
			case FhirResourcePackage.CLINICAL_IMPRESSION__RESOLVED:
				return getResolveds();
			case FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT:
				return getRuledOuts();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS:
				if (resolve) return getPrognosis();
				return basicGetPrognosis();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PLAN:
				return getPlans();
			case FhirResourcePackage.CLINICAL_IMPRESSION__ACTION:
				return getActions();
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
			case FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Practitioner)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((ClinicalImpression)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX:
				setTriggerx((Base)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				getInvestigations().clear();
				getInvestigations().addAll((Collection<? extends ClinicalImpressionInvestigations>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL:
				setProtocol((Uri)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				getFindings().addAll((Collection<? extends ClinicalImpressionFinding>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__RESOLVED:
				getResolveds().clear();
				getResolveds().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT:
				getRuledOuts().clear();
				getRuledOuts().addAll((Collection<? extends ClinicalImpressionRuledOut>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS:
				setPrognosis((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PLAN:
				getPlans().clear();
				getPlans().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends Resource>)newValue);
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
			case FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Practitioner)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((ClinicalImpression)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX:
				setTriggerx((Base)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				getInvestigations().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL:
				setProtocol((Uri)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__RESOLVED:
				getResolveds().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT:
				getRuledOuts().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS:
				setPrognosis((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PLAN:
				getPlans().clear();
				return;
			case FhirResourcePackage.CLINICAL_IMPRESSION__ACTION:
				getActions().clear();
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
			case FhirResourcePackage.CLINICAL_IMPRESSION__PATIENT:
				return patient != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__ASSESSOR:
				return assessor != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__STATUS:
				return status != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DATE:
				return date != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PREVIOUS:
				return previous != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROBLEM:
				return problems != null && !problems.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__TRIGGERX:
				return triggerx != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__INVESTIGATIONS:
				return investigations != null && !investigations.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROTOCOL:
				return protocol != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__SUMMARY:
				return summary != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__FINDING:
				return findings != null && !findings.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__RESOLVED:
				return resolveds != null && !resolveds.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__RULED_OUT:
				return ruledOuts != null && !ruledOuts.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__PROGNOSIS:
				return prognosis != null;
			case FhirResourcePackage.CLINICAL_IMPRESSION__PLAN:
				return plans != null && !plans.isEmpty();
			case FhirResourcePackage.CLINICAL_IMPRESSION__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionImpl
