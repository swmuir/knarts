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
import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReport;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.Procedure;
import org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice;
import org.eclipse.mdht.uml.fhir.core.resource.ProcedurePerformer;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getNotPerformed <em>Not Performed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getReasonNotPerformeds <em>Reason Not Performed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getReasonx <em>Reasonx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getPerformedx <em>Performedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getReports <em>Report</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getComplications <em>Complication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getFollowUps <em>Follow Up</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getFocalDevices <em>Focal Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureImpl#getUseds <em>Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

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
	 * The cached value of the '{@link #getNotPerformed() <em>Not Performed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotPerformed()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean notPerformed;

	/**
	 * The cached value of the '{@link #getReasonNotPerformeds() <em>Reason Not Performed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotPerformeds()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotPerformeds;

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
	 * The cached value of the '{@link #getReasonx() <em>Reasonx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonx()
	 * @generated
	 * @ordered
	 */
	protected Base reasonx;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performers;

	/**
	 * The cached value of the '{@link #getPerformedx() <em>Performedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedx()
	 * @generated
	 * @ordered
	 */
	protected DataType performedx;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getReports() <em>Report</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReport> reports;

	/**
	 * The cached value of the '{@link #getComplications() <em>Complication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complications;

	/**
	 * The cached value of the '{@link #getFollowUps() <em>Follow Up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUps()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUps;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getFocalDevices() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevices;

	/**
	 * The cached value of the '{@link #getUseds() <em>Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseds()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> useds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.PROCEDURE__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getNotPerformed() {
		if (notPerformed != null && notPerformed.eIsProxy()) {
			InternalEObject oldNotPerformed = (InternalEObject)notPerformed;
			notPerformed = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldNotPerformed);
			if (notPerformed != oldNotPerformed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__NOT_PERFORMED, oldNotPerformed, notPerformed));
			}
		}
		return notPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetNotPerformed() {
		return notPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotPerformed(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newNotPerformed) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldNotPerformed = notPerformed;
		notPerformed = newNotPerformed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__NOT_PERFORMED, oldNotPerformed, notPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotPerformeds() {
		if (reasonNotPerformeds == null) {
			reasonNotPerformeds = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PROCEDURE__REASON_NOT_PERFORMED);
		}
		return reasonNotPerformeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PROCEDURE__BODY_SITE);
		}
		return bodySites;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__REASONX, oldReasonx, reasonx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__REASONX, oldReasonx, reasonx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedurePerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, FhirResourcePackage.PROCEDURE__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getPerformedx() {
		if (performedx != null && performedx.eIsProxy()) {
			InternalEObject oldPerformedx = (InternalEObject)performedx;
			performedx = (DataType)eResolveProxy(oldPerformedx);
			if (performedx != oldPerformedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__PERFORMEDX, oldPerformedx, performedx));
			}
		}
		return performedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetPerformedx() {
		return performedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedx(DataType newPerformedx) {
		DataType oldPerformedx = performedx;
		performedx = newPerformedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__PERFORMEDX, oldPerformedx, performedx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticReport> getReports() {
		if (reports == null) {
			reports = new EObjectResolvingEList<DiagnosticReport>(DiagnosticReport.class, this, FhirResourcePackage.PROCEDURE__REPORT);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComplications() {
		if (complications == null) {
			complications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PROCEDURE__COMPLICATION);
		}
		return complications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFollowUps() {
		if (followUps == null) {
			followUps = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PROCEDURE__FOLLOW_UP);
		}
		return followUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, FhirResourcePackage.PROCEDURE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureFocalDevice> getFocalDevices() {
		if (focalDevices == null) {
			focalDevices = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, FhirResourcePackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getUseds() {
		if (useds == null) {
			useds = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.PROCEDURE__USED);
		}
		return useds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevices()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.PROCEDURE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.PROCEDURE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.PROCEDURE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.PROCEDURE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.PROCEDURE__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.PROCEDURE__NOT_PERFORMED:
				if (resolve) return getNotPerformed();
				return basicGetNotPerformed();
			case FhirResourcePackage.PROCEDURE__REASON_NOT_PERFORMED:
				return getReasonNotPerformeds();
			case FhirResourcePackage.PROCEDURE__BODY_SITE:
				return getBodySites();
			case FhirResourcePackage.PROCEDURE__REASONX:
				if (resolve) return getReasonx();
				return basicGetReasonx();
			case FhirResourcePackage.PROCEDURE__PERFORMER:
				return getPerformers();
			case FhirResourcePackage.PROCEDURE__PERFORMEDX:
				if (resolve) return getPerformedx();
				return basicGetPerformedx();
			case FhirResourcePackage.PROCEDURE__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.PROCEDURE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case FhirResourcePackage.PROCEDURE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case FhirResourcePackage.PROCEDURE__REPORT:
				return getReports();
			case FhirResourcePackage.PROCEDURE__COMPLICATION:
				return getComplications();
			case FhirResourcePackage.PROCEDURE__FOLLOW_UP:
				return getFollowUps();
			case FhirResourcePackage.PROCEDURE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.PROCEDURE__NOTES:
				return getNotes();
			case FhirResourcePackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevices();
			case FhirResourcePackage.PROCEDURE__USED:
				return getUseds();
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
			case FhirResourcePackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformeds().clear();
				getReasonNotPerformeds().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__REASONX:
				setReasonx((Base)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__REPORT:
				getReports().clear();
				getReports().addAll((Collection<? extends DiagnosticReport>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				getComplications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				getFollowUps().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__REQUEST:
				setRequest((Resource)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				getFocalDevices().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case FhirResourcePackage.PROCEDURE__USED:
				getUseds().clear();
				getUseds().addAll((Collection<? extends Resource>)newValue);
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
			case FhirResourcePackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.PROCEDURE__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.PROCEDURE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirResourcePackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.PROCEDURE__NOT_PERFORMED:
				setNotPerformed((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.PROCEDURE__REASON_NOT_PERFORMED:
				getReasonNotPerformeds().clear();
				return;
			case FhirResourcePackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				return;
			case FhirResourcePackage.PROCEDURE__REASONX:
				setReasonx((Base)null);
				return;
			case FhirResourcePackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				return;
			case FhirResourcePackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)null);
				return;
			case FhirResourcePackage.PROCEDURE__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.PROCEDURE__LOCATION:
				setLocation((Location)null);
				return;
			case FhirResourcePackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirResourcePackage.PROCEDURE__REPORT:
				getReports().clear();
				return;
			case FhirResourcePackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				return;
			case FhirResourcePackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				return;
			case FhirResourcePackage.PROCEDURE__REQUEST:
				setRequest((Resource)null);
				return;
			case FhirResourcePackage.PROCEDURE__NOTES:
				getNotes().clear();
				return;
			case FhirResourcePackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				return;
			case FhirResourcePackage.PROCEDURE__USED:
				getUseds().clear();
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
			case FhirResourcePackage.PROCEDURE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.PROCEDURE__SUBJECT:
				return subject != null;
			case FhirResourcePackage.PROCEDURE__STATUS:
				return status != null;
			case FhirResourcePackage.PROCEDURE__CATEGORY:
				return category != null;
			case FhirResourcePackage.PROCEDURE__CODE:
				return code != null;
			case FhirResourcePackage.PROCEDURE__NOT_PERFORMED:
				return notPerformed != null;
			case FhirResourcePackage.PROCEDURE__REASON_NOT_PERFORMED:
				return reasonNotPerformeds != null && !reasonNotPerformeds.isEmpty();
			case FhirResourcePackage.PROCEDURE__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case FhirResourcePackage.PROCEDURE__REASONX:
				return reasonx != null;
			case FhirResourcePackage.PROCEDURE__PERFORMER:
				return performers != null && !performers.isEmpty();
			case FhirResourcePackage.PROCEDURE__PERFORMEDX:
				return performedx != null;
			case FhirResourcePackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.PROCEDURE__LOCATION:
				return location != null;
			case FhirResourcePackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirResourcePackage.PROCEDURE__REPORT:
				return reports != null && !reports.isEmpty();
			case FhirResourcePackage.PROCEDURE__COMPLICATION:
				return complications != null && !complications.isEmpty();
			case FhirResourcePackage.PROCEDURE__FOLLOW_UP:
				return followUps != null && !followUps.isEmpty();
			case FhirResourcePackage.PROCEDURE__REQUEST:
				return request != null;
			case FhirResourcePackage.PROCEDURE__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevices != null && !focalDevices.isEmpty();
			case FhirResourcePackage.PROCEDURE__USED:
				return useds != null && !useds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
