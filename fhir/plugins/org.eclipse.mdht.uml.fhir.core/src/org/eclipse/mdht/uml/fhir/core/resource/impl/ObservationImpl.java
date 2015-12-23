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
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Observation;
import org.eclipse.mdht.uml.fhir.core.resource.ObservationComponent;
import org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange;
import org.eclipse.mdht.uml.fhir.core.resource.ObservationRelated;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.Specimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getReferenceRanges <em>Reference Range</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getRelateds <em>Related</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationImpl#getComponents <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends DomainResourceImpl implements Observation {
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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> performers;

	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept interpretation;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String comments;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Specimen specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Resource device;

	/**
	 * The cached value of the '{@link #getReferenceRanges() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationReferenceRange> referenceRanges;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationRelated> relateds;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.OBSERVATION__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__ENCOUNTER, oldEncounter, encounter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__EFFECTIVEX, oldEffectivex, effectivex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__EFFECTIVEX, oldEffectivex, effectivex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__ISSUED, oldIssued, issued));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPerformers() {
		if (performers == null) {
			performers = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.OBSERVATION__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		if (valuex != null && valuex.eIsProxy()) {
			InternalEObject oldValuex = (InternalEObject)valuex;
			valuex = (DataType)eResolveProxy(oldValuex);
			if (valuex != oldValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__VALUEX, oldValuex, valuex));
			}
		}
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__VALUEX, oldValuex, valuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDataAbsentReason() {
		if (dataAbsentReason != null && dataAbsentReason.eIsProxy()) {
			InternalEObject oldDataAbsentReason = (InternalEObject)dataAbsentReason;
			dataAbsentReason = (CodeableConcept)eResolveProxy(oldDataAbsentReason);
			if (dataAbsentReason != oldDataAbsentReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON, oldDataAbsentReason, dataAbsentReason));
			}
		}
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON, oldDataAbsentReason, dataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getInterpretation() {
		if (interpretation != null && interpretation.eIsProxy()) {
			InternalEObject oldInterpretation = (InternalEObject)interpretation;
			interpretation = (CodeableConcept)eResolveProxy(oldInterpretation);
			if (interpretation != oldInterpretation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__INTERPRETATION, oldInterpretation, interpretation));
			}
		}
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(CodeableConcept newInterpretation) {
		CodeableConcept oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__INTERPRETATION, oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getComments() {
		if (comments != null && comments.eIsProxy()) {
			InternalEObject oldComments = (InternalEObject)comments;
			comments = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldComments);
			if (comments != oldComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__COMMENTS, oldComments, comments));
			}
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.eclipse.mdht.uml.fhir.core.datatype.String newComments) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (CodeableConcept)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CodeableConcept)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen getSpecimen() {
		if (specimen != null && specimen.eIsProxy()) {
			InternalEObject oldSpecimen = (InternalEObject)specimen;
			specimen = (Specimen)eResolveProxy(oldSpecimen);
			if (specimen != oldSpecimen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__SPECIMEN, oldSpecimen, specimen));
			}
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen basicGetSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Specimen newSpecimen) {
		Specimen oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__SPECIMEN, oldSpecimen, specimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Resource)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Resource newDevice) {
		Resource oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationReferenceRange> getReferenceRanges() {
		if (referenceRanges == null) {
			referenceRanges = new EObjectContainmentEList<ObservationReferenceRange>(ObservationReferenceRange.class, this, FhirResourcePackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationRelated> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<ObservationRelated>(ObservationRelated.class, this, FhirResourcePackage.OBSERVATION__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObservationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ObservationComponent>(ObservationComponent.class, this, FhirResourcePackage.OBSERVATION__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.OBSERVATION__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRanges()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.OBSERVATION__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.OBSERVATION__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.OBSERVATION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.OBSERVATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.OBSERVATION__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.OBSERVATION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.OBSERVATION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.OBSERVATION__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.OBSERVATION__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case FhirResourcePackage.OBSERVATION__ISSUED:
				if (resolve) return getIssued();
				return basicGetIssued();
			case FhirResourcePackage.OBSERVATION__PERFORMER:
				return getPerformers();
			case FhirResourcePackage.OBSERVATION__VALUEX:
				if (resolve) return getValuex();
				return basicGetValuex();
			case FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON:
				if (resolve) return getDataAbsentReason();
				return basicGetDataAbsentReason();
			case FhirResourcePackage.OBSERVATION__INTERPRETATION:
				if (resolve) return getInterpretation();
				return basicGetInterpretation();
			case FhirResourcePackage.OBSERVATION__COMMENTS:
				if (resolve) return getComments();
				return basicGetComments();
			case FhirResourcePackage.OBSERVATION__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
			case FhirResourcePackage.OBSERVATION__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FhirResourcePackage.OBSERVATION__SPECIMEN:
				if (resolve) return getSpecimen();
				return basicGetSpecimen();
			case FhirResourcePackage.OBSERVATION__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case FhirResourcePackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRanges();
			case FhirResourcePackage.OBSERVATION__RELATED:
				return getRelateds();
			case FhirResourcePackage.OBSERVATION__COMPONENT:
				return getComponents();
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
			case FhirResourcePackage.OBSERVATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__ISSUED:
				setIssued((Instant)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__VALUEX:
				setValuex((DataType)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__INTERPRETATION:
				setInterpretation((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__DEVICE:
				setDevice((Resource)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
				getReferenceRanges().addAll((Collection<? extends ObservationReferenceRange>)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends ObservationRelated>)newValue);
				return;
			case FhirResourcePackage.OBSERVATION__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ObservationComponent>)newValue);
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
			case FhirResourcePackage.OBSERVATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.OBSERVATION__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.OBSERVATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.OBSERVATION__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.OBSERVATION__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case FhirResourcePackage.OBSERVATION__ISSUED:
				setIssued((Instant)null);
				return;
			case FhirResourcePackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				return;
			case FhirResourcePackage.OBSERVATION__VALUEX:
				setValuex((DataType)null);
				return;
			case FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__INTERPRETATION:
				setInterpretation((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case FhirResourcePackage.OBSERVATION__DEVICE:
				setDevice((Resource)null);
				return;
			case FhirResourcePackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
				return;
			case FhirResourcePackage.OBSERVATION__RELATED:
				getRelateds().clear();
				return;
			case FhirResourcePackage.OBSERVATION__COMPONENT:
				getComponents().clear();
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
			case FhirResourcePackage.OBSERVATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.OBSERVATION__STATUS:
				return status != null;
			case FhirResourcePackage.OBSERVATION__CATEGORY:
				return category != null;
			case FhirResourcePackage.OBSERVATION__CODE:
				return code != null;
			case FhirResourcePackage.OBSERVATION__SUBJECT:
				return subject != null;
			case FhirResourcePackage.OBSERVATION__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.OBSERVATION__EFFECTIVEX:
				return effectivex != null;
			case FhirResourcePackage.OBSERVATION__ISSUED:
				return issued != null;
			case FhirResourcePackage.OBSERVATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case FhirResourcePackage.OBSERVATION__VALUEX:
				return valuex != null;
			case FhirResourcePackage.OBSERVATION__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case FhirResourcePackage.OBSERVATION__INTERPRETATION:
				return interpretation != null;
			case FhirResourcePackage.OBSERVATION__COMMENTS:
				return comments != null;
			case FhirResourcePackage.OBSERVATION__BODY_SITE:
				return bodySite != null;
			case FhirResourcePackage.OBSERVATION__METHOD:
				return method != null;
			case FhirResourcePackage.OBSERVATION__SPECIMEN:
				return specimen != null;
			case FhirResourcePackage.OBSERVATION__DEVICE:
				return device != null;
			case FhirResourcePackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRanges != null && !referenceRanges.isEmpty();
			case FhirResourcePackage.OBSERVATION__RELATED:
				return relateds != null && !relateds.isEmpty();
			case FhirResourcePackage.OBSERVATION__COMPONENT:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationImpl
