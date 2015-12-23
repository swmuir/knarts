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
import org.eclipse.mdht.uml.fhir.core.datatype.Duration;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Appointment;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization;
import org.eclipse.mdht.uml.fhir.core.resource.EncounterLocation;
import org.eclipse.mdht.uml.fhir.core.resource.EncounterParticipant;
import org.eclipse.mdht.uml.fhir.core.resource.EncounterStatusHistory;
import org.eclipse.mdht.uml.fhir.core.resource.EpisodeOfCare;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getEpisodeOfCares <em>Episode Of Care</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getIncomingReferrals <em>Incoming Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterImpl extends DomainResourceImpl implements Encounter {
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
	 * The cached value of the '{@link #getStatusHistories() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterStatusHistory> statusHistories;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Code class_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

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
	 * The cached value of the '{@link #getEpisodeOfCares() <em>Episode Of Care</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCares()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCare> episodeOfCares;

	/**
	 * The cached value of the '{@link #getIncomingReferrals() <em>Incoming Referral</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingReferrals()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferralRequest> incomingReferrals;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterParticipant> participants;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Appointment appointment;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Duration length;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getIndications() <em>Indication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> indications;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected EncounterHospitalization hospitalization;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterLocation> locations;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected Organization serviceProvider;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Encounter partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getEncounter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.ENCOUNTER__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterStatusHistory> getStatusHistories() {
		if (statusHistories == null) {
			statusHistories = new EObjectContainmentEList<EncounterStatusHistory>(EncounterStatusHistory.class, this, FhirResourcePackage.ENCOUNTER__STATUS_HISTORY);
		}
		return statusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (Code)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(Code newClass) {
		Code oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ENCOUNTER__TYPE);
		}
		return types;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCare> getEpisodeOfCares() {
		if (episodeOfCares == null) {
			episodeOfCares = new EObjectResolvingEList<EpisodeOfCare>(EpisodeOfCare.class, this, FhirResourcePackage.ENCOUNTER__EPISODE_OF_CARE);
		}
		return episodeOfCares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferralRequest> getIncomingReferrals() {
		if (incomingReferrals == null) {
			incomingReferrals = new EObjectResolvingEList<ReferralRequest>(ReferralRequest.class, this, FhirResourcePackage.ENCOUNTER__INCOMING_REFERRAL);
		}
		return incomingReferrals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<EncounterParticipant>(EncounterParticipant.class, this, FhirResourcePackage.ENCOUNTER__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment getAppointment() {
		if (appointment != null && appointment.eIsProxy()) {
			InternalEObject oldAppointment = (InternalEObject)appointment;
			appointment = (Appointment)eResolveProxy(oldAppointment);
			if (appointment != oldAppointment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__APPOINTMENT, oldAppointment, appointment));
			}
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment basicGetAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Appointment newAppointment) {
		Appointment oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__APPOINTMENT, oldAppointment, appointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLength() {
		if (length != null && length.eIsProxy()) {
			InternalEObject oldLength = (InternalEObject)length;
			length = (Duration)eResolveProxy(oldLength);
			if (length != oldLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__LENGTH, oldLength, length));
			}
		}
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Duration newLength) {
		Duration oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ENCOUNTER__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getIndications() {
		if (indications == null) {
			indications = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.ENCOUNTER__INDICATION);
		}
		return indications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(EncounterHospitalization newHospitalization, NotificationChain msgs) {
		EncounterHospitalization oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__HOSPITALIZATION, oldHospitalization, newHospitalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(EncounterHospitalization newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<EncounterLocation>(EncounterLocation.class, this, FhirResourcePackage.ENCOUNTER__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getServiceProvider() {
		if (serviceProvider != null && serviceProvider.eIsProxy()) {
			InternalEObject oldServiceProvider = (InternalEObject)serviceProvider;
			serviceProvider = (Organization)eResolveProxy(oldServiceProvider);
			if (serviceProvider != oldServiceProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER, oldServiceProvider, serviceProvider));
			}
		}
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProvider(Organization newServiceProvider) {
		Organization oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER, oldServiceProvider, serviceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getPartOf() {
		if (partOf != null && partOf.eIsProxy()) {
			InternalEObject oldPartOf = (InternalEObject)partOf;
			partOf = (Encounter)eResolveProxy(oldPartOf);
			if (partOf != oldPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER__PART_OF, oldPartOf, partOf));
			}
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Encounter newPartOf) {
		Encounter oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER__PART_OF, oldPartOf, partOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.ENCOUNTER__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistories()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.ENCOUNTER__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.ENCOUNTER__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case FhirResourcePackage.ENCOUNTER__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.ENCOUNTER__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.ENCOUNTER__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.ENCOUNTER__STATUS_HISTORY:
				return getStatusHistories();
			case FhirResourcePackage.ENCOUNTER__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case FhirResourcePackage.ENCOUNTER__TYPE:
				return getTypes();
			case FhirResourcePackage.ENCOUNTER__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case FhirResourcePackage.ENCOUNTER__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.ENCOUNTER__EPISODE_OF_CARE:
				return getEpisodeOfCares();
			case FhirResourcePackage.ENCOUNTER__INCOMING_REFERRAL:
				return getIncomingReferrals();
			case FhirResourcePackage.ENCOUNTER__PARTICIPANT:
				return getParticipants();
			case FhirResourcePackage.ENCOUNTER__APPOINTMENT:
				if (resolve) return getAppointment();
				return basicGetAppointment();
			case FhirResourcePackage.ENCOUNTER__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirResourcePackage.ENCOUNTER__LENGTH:
				if (resolve) return getLength();
				return basicGetLength();
			case FhirResourcePackage.ENCOUNTER__REASON:
				return getReasons();
			case FhirResourcePackage.ENCOUNTER__INDICATION:
				return getIndications();
			case FhirResourcePackage.ENCOUNTER__HOSPITALIZATION:
				return getHospitalization();
			case FhirResourcePackage.ENCOUNTER__LOCATION:
				return getLocations();
			case FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER:
				if (resolve) return getServiceProvider();
				return basicGetServiceProvider();
			case FhirResourcePackage.ENCOUNTER__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
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
			case FhirResourcePackage.ENCOUNTER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistories().clear();
				getStatusHistories().addAll((Collection<? extends EncounterStatusHistory>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__CLASS:
				setClass_((Code)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCares().clear();
				getEpisodeOfCares().addAll((Collection<? extends EpisodeOfCare>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__INCOMING_REFERRAL:
				getIncomingReferrals().clear();
				getIncomingReferrals().addAll((Collection<? extends ReferralRequest>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends EncounterParticipant>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__LENGTH:
				setLength((Duration)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__INDICATION:
				getIndications().clear();
				getIndications().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends EncounterLocation>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Organization)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER__PART_OF:
				setPartOf((Encounter)newValue);
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
			case FhirResourcePackage.ENCOUNTER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistories().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__CLASS:
				setClass_((Code)null);
				return;
			case FhirResourcePackage.ENCOUNTER__TYPE:
				getTypes().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirResourcePackage.ENCOUNTER__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCares().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__INCOMING_REFERRAL:
				getIncomingReferrals().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__PARTICIPANT:
				getParticipants().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirResourcePackage.ENCOUNTER__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirResourcePackage.ENCOUNTER__LENGTH:
				setLength((Duration)null);
				return;
			case FhirResourcePackage.ENCOUNTER__REASON:
				getReasons().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__INDICATION:
				getIndications().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)null);
				return;
			case FhirResourcePackage.ENCOUNTER__LOCATION:
				getLocations().clear();
				return;
			case FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Organization)null);
				return;
			case FhirResourcePackage.ENCOUNTER__PART_OF:
				setPartOf((Encounter)null);
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
			case FhirResourcePackage.ENCOUNTER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.ENCOUNTER__STATUS:
				return status != null;
			case FhirResourcePackage.ENCOUNTER__STATUS_HISTORY:
				return statusHistories != null && !statusHistories.isEmpty();
			case FhirResourcePackage.ENCOUNTER__CLASS:
				return class_ != null;
			case FhirResourcePackage.ENCOUNTER__TYPE:
				return types != null && !types.isEmpty();
			case FhirResourcePackage.ENCOUNTER__PRIORITY:
				return priority != null;
			case FhirResourcePackage.ENCOUNTER__PATIENT:
				return patient != null;
			case FhirResourcePackage.ENCOUNTER__EPISODE_OF_CARE:
				return episodeOfCares != null && !episodeOfCares.isEmpty();
			case FhirResourcePackage.ENCOUNTER__INCOMING_REFERRAL:
				return incomingReferrals != null && !incomingReferrals.isEmpty();
			case FhirResourcePackage.ENCOUNTER__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case FhirResourcePackage.ENCOUNTER__APPOINTMENT:
				return appointment != null;
			case FhirResourcePackage.ENCOUNTER__PERIOD:
				return period != null;
			case FhirResourcePackage.ENCOUNTER__LENGTH:
				return length != null;
			case FhirResourcePackage.ENCOUNTER__REASON:
				return reasons != null && !reasons.isEmpty();
			case FhirResourcePackage.ENCOUNTER__INDICATION:
				return indications != null && !indications.isEmpty();
			case FhirResourcePackage.ENCOUNTER__HOSPITALIZATION:
				return hospitalization != null;
			case FhirResourcePackage.ENCOUNTER__LOCATION:
				return locations != null && !locations.isEmpty();
			case FhirResourcePackage.ENCOUNTER__SERVICE_PROVIDER:
				return serviceProvider != null;
			case FhirResourcePackage.ENCOUNTER__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterImpl
