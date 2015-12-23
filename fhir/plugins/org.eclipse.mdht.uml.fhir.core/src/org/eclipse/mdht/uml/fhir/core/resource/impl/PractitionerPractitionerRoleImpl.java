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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.HealthcareService;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.PractitionerPractitionerRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerPractitionerRoleImpl#getHealthcareServices <em>Healthcare Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerPractitionerRoleImpl extends BackboneElementImpl implements PractitionerPractitionerRole {
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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

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
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getHealthcareServices() <em>Healthcare Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareServices()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareService> healthcareServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerPractitionerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPractitionerPractitionerRole();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (CodeableConcept)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CodeableConcept newRole) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY);
		}
		return specialties;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareService> getHealthcareServices() {
		if (healthcareServices == null) {
			healthcareServices = new EObjectResolvingEList<HealthcareService>(HealthcareService.class, this, FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE);
		}
		return healthcareServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				return getSpecialties();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				return getLocations();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return getHealthcareServices();
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
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				getHealthcareServices().addAll((Collection<? extends HealthcareService>)newValue);
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
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				setRole((CodeableConcept)null);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				return;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
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
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__ROLE:
				return role != null;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__PERIOD:
				return period != null;
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__LOCATION:
				return locations != null && !locations.isEmpty();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return healthcareServices != null && !healthcareServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerPractitionerRoleImpl
