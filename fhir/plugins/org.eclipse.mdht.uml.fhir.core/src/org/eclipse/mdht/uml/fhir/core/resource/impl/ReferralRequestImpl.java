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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getServiceRequesteds <em>Service Requested</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ReferralRequestImpl#getFulfillmentTime <em>Fulfillment Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferralRequestImpl extends DomainResourceImpl implements ReferralRequest {
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
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specialty;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Resource requester;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> recipients;

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
	 * The cached value of the '{@link #getDateSent() <em>Date Sent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateSent;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

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
	 * The cached value of the '{@link #getServiceRequesteds() <em>Service Requested</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequesteds()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceRequesteds;

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
	 * The cached value of the '{@link #getFulfillmentTime() <em>Fulfillment Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentTime()
	 * @generated
	 * @ordered
	 */
	protected Period fulfillmentTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getReferralRequest();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.REFERRAL_REQUEST__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecialty() {
		if (specialty != null && specialty.eIsProxy()) {
			InternalEObject oldSpecialty = (InternalEObject)specialty;
			specialty = (CodeableConcept)eResolveProxy(oldSpecialty);
			if (specialty != oldSpecialty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY, oldSpecialty, specialty));
			}
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSpecialty() {
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialty(CodeableConcept newSpecialty) {
		CodeableConcept oldSpecialty = specialty;
		specialty = newSpecialty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY, oldSpecialty, specialty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (CodeableConcept)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequester() {
		if (requester != null && requester.eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (Resource)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Resource newRequester) {
		Resource oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__REQUESTER, oldRequester, requester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.REFERRAL_REQUEST__RECIPIENT);
		}
		return recipients;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateSent() {
		if (dateSent != null && dateSent.eIsProxy()) {
			InternalEObject oldDateSent = (InternalEObject)dateSent;
			dateSent = (DateTime)eResolveProxy(oldDateSent);
			if (dateSent != oldDateSent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT, oldDateSent, dateSent));
			}
		}
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateSent() {
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSent(DateTime newDateSent) {
		DateTime oldDateSent = dateSent;
		dateSent = newDateSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT, oldDateSent, dateSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (CodeableConcept)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__REASON, oldReason, reason));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceRequesteds() {
		if (serviceRequesteds == null) {
			serviceRequesteds = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.REFERRAL_REQUEST__SERVICE_REQUESTED);
		}
		return serviceRequesteds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getFulfillmentTime() {
		if (fulfillmentTime != null && fulfillmentTime.eIsProxy()) {
			InternalEObject oldFulfillmentTime = (InternalEObject)fulfillmentTime;
			fulfillmentTime = (Period)eResolveProxy(oldFulfillmentTime);
			if (fulfillmentTime != oldFulfillmentTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME, oldFulfillmentTime, fulfillmentTime));
			}
		}
		return fulfillmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetFulfillmentTime() {
		return fulfillmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentTime(Period newFulfillmentTime) {
		Period oldFulfillmentTime = fulfillmentTime;
		fulfillmentTime = newFulfillmentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME, oldFulfillmentTime, fulfillmentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.REFERRAL_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.REFERRAL_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.REFERRAL_REQUEST__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.REFERRAL_REQUEST__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY:
				if (resolve) return getSpecialty();
				return basicGetSpecialty();
			case FhirResourcePackage.REFERRAL_REQUEST__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case FhirResourcePackage.REFERRAL_REQUEST__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.REFERRAL_REQUEST__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case FhirResourcePackage.REFERRAL_REQUEST__RECIPIENT:
				return getRecipients();
			case FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT:
				if (resolve) return getDateSent();
				return basicGetDateSent();
			case FhirResourcePackage.REFERRAL_REQUEST__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return getServiceRequesteds();
			case FhirResourcePackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				if (resolve) return getFulfillmentTime();
				return basicGetFulfillmentTime();
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
			case FhirResourcePackage.REFERRAL_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Resource)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT:
				setDateSent((DateTime)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequesteds().clear();
				getServiceRequesteds().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)newValue);
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
			case FhirResourcePackage.REFERRAL_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Resource)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipients().clear();
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT:
				setDateSent((DateTime)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequesteds().clear();
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)null);
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
			case FhirResourcePackage.REFERRAL_REQUEST__STATUS:
				return status != null;
			case FhirResourcePackage.REFERRAL_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.REFERRAL_REQUEST__DATE:
				return date != null;
			case FhirResourcePackage.REFERRAL_REQUEST__TYPE:
				return type != null;
			case FhirResourcePackage.REFERRAL_REQUEST__SPECIALTY:
				return specialty != null;
			case FhirResourcePackage.REFERRAL_REQUEST__PRIORITY:
				return priority != null;
			case FhirResourcePackage.REFERRAL_REQUEST__PATIENT:
				return patient != null;
			case FhirResourcePackage.REFERRAL_REQUEST__REQUESTER:
				return requester != null;
			case FhirResourcePackage.REFERRAL_REQUEST__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
			case FhirResourcePackage.REFERRAL_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.REFERRAL_REQUEST__DATE_SENT:
				return dateSent != null;
			case FhirResourcePackage.REFERRAL_REQUEST__REASON:
				return reason != null;
			case FhirResourcePackage.REFERRAL_REQUEST__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return serviceRequesteds != null && !serviceRequesteds.isEmpty();
			case FhirResourcePackage.REFERRAL_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case FhirResourcePackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return fulfillmentTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferralRequestImpl
