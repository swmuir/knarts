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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Condition;
import org.eclipse.mdht.uml.fhir.core.resource.EpisodeOfCare;
import org.eclipse.mdht.uml.fhir.core.resource.EpisodeOfCareCareTeam;
import org.eclipse.mdht.uml.fhir.core.resource.EpisodeOfCareStatusHistory;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getReferralRequests <em>Referral Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EpisodeOfCareImpl#getCareTeams <em>Care Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodeOfCareImpl extends DomainResourceImpl implements EpisodeOfCare {
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
	protected EList<EpisodeOfCareStatusHistory> statusHistories;

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
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

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
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization managingOrganization;

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
	 * The cached value of the '{@link #getReferralRequests() <em>Referral Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferralRequest> referralRequests;

	/**
	 * The cached value of the '{@link #getCareManager() <em>Care Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareManager()
	 * @generated
	 * @ordered
	 */
	protected Practitioner careManager;

	/**
	 * The cached value of the '{@link #getCareTeams() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareCareTeam> careTeams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeOfCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getEpisodeOfCare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.EPISODE_OF_CARE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EPISODE_OF_CARE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EPISODE_OF_CARE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCareStatusHistory> getStatusHistories() {
		if (statusHistories == null) {
			statusHistories = new EObjectContainmentEList<EpisodeOfCareStatusHistory>(EpisodeOfCareStatusHistory.class, this, FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY);
		}
		return statusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.EPISODE_OF_CARE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectResolvingEList<Condition>(Condition.class, this, FhirResourcePackage.EPISODE_OF_CARE__CONDITION);
		}
		return conditions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EPISODE_OF_CARE__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EPISODE_OF_CARE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManagingOrganization() {
		if (managingOrganization != null && managingOrganization.eIsProxy()) {
			InternalEObject oldManagingOrganization = (InternalEObject)managingOrganization;
			managingOrganization = (Organization)eResolveProxy(oldManagingOrganization);
			if (managingOrganization != oldManagingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
			}
		}
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Organization newManagingOrganization) {
		Organization oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EPISODE_OF_CARE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EPISODE_OF_CARE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferralRequest> getReferralRequests() {
		if (referralRequests == null) {
			referralRequests = new EObjectResolvingEList<ReferralRequest>(ReferralRequest.class, this, FhirResourcePackage.EPISODE_OF_CARE__REFERRAL_REQUEST);
		}
		return referralRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getCareManager() {
		if (careManager != null && careManager.eIsProxy()) {
			InternalEObject oldCareManager = (InternalEObject)careManager;
			careManager = (Practitioner)eResolveProxy(oldCareManager);
			if (careManager != oldCareManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, careManager));
			}
		}
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetCareManager() {
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareManager(Practitioner newCareManager) {
		Practitioner oldCareManager = careManager;
		careManager = newCareManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, careManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCareCareTeam> getCareTeams() {
		if (careTeams == null) {
			careTeams = new EObjectContainmentEList<EpisodeOfCareCareTeam>(EpisodeOfCareCareTeam.class, this, FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM);
		}
		return careTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistories()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM:
				return ((InternalEList<?>)getCareTeams()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.EPISODE_OF_CARE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return getStatusHistories();
			case FhirResourcePackage.EPISODE_OF_CARE__TYPE:
				return getTypes();
			case FhirResourcePackage.EPISODE_OF_CARE__CONDITION:
				return getConditions();
			case FhirResourcePackage.EPISODE_OF_CARE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case FhirResourcePackage.EPISODE_OF_CARE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirResourcePackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return getReferralRequests();
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER:
				if (resolve) return getCareManager();
				return basicGetCareManager();
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM:
				return getCareTeams();
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
			case FhirResourcePackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				getStatusHistories().addAll((Collection<? extends EpisodeOfCareStatusHistory>)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				getReferralRequests().addAll((Collection<? extends ReferralRequest>)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Practitioner)newValue);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM:
				getCareTeams().clear();
				getCareTeams().addAll((Collection<? extends EpisodeOfCareCareTeam>)newValue);
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
			case FhirResourcePackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CONDITION:
				getConditions().clear();
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Practitioner)null);
				return;
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM:
				getCareTeams().clear();
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
			case FhirResourcePackage.EPISODE_OF_CARE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS:
				return status != null;
			case FhirResourcePackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return statusHistories != null && !statusHistories.isEmpty();
			case FhirResourcePackage.EPISODE_OF_CARE__TYPE:
				return types != null && !types.isEmpty();
			case FhirResourcePackage.EPISODE_OF_CARE__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case FhirResourcePackage.EPISODE_OF_CARE__PATIENT:
				return patient != null;
			case FhirResourcePackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirResourcePackage.EPISODE_OF_CARE__PERIOD:
				return period != null;
			case FhirResourcePackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return referralRequests != null && !referralRequests.isEmpty();
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_MANAGER:
				return careManager != null;
			case FhirResourcePackage.EPISODE_OF_CARE__CARE_TEAM:
				return careTeams != null && !careTeams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EpisodeOfCareImpl
