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

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.PatientContact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientContactImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientContactImpl extends BackboneElementImpl implements PatientContact {
	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> relationships;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected HumanName name;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPatientContact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PATIENT_CONTACT__RELATIONSHIP);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (HumanName)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_CONTACT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(HumanName newName) {
		HumanName oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_CONTACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, FhirResourcePackage.PATIENT_CONTACT__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (Address)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_CONTACT__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_CONTACT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		if (gender != null && gender.eIsProxy()) {
			InternalEObject oldGender = (InternalEObject)gender;
			gender = (Code)eResolveProxy(oldGender);
			if (gender != oldGender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_CONTACT__GENDER, oldGender, gender));
			}
		}
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_CONTACT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION, oldOrganization, organization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_CONTACT__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_CONTACT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PATIENT_CONTACT__RELATIONSHIP:
				return getRelationships();
			case FhirResourcePackage.PATIENT_CONTACT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.PATIENT_CONTACT__TELECOM:
				return getTelecoms();
			case FhirResourcePackage.PATIENT_CONTACT__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case FhirResourcePackage.PATIENT_CONTACT__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.PATIENT_CONTACT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case FhirResourcePackage.PATIENT_CONTACT__RELATIONSHIP:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__NAME:
				setName((HumanName)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__ADDRESS:
				setAddress((Address)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__GENDER:
				setGender((Code)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirResourcePackage.PATIENT_CONTACT__RELATIONSHIP:
				getRelationships().clear();
				return;
			case FhirResourcePackage.PATIENT_CONTACT__NAME:
				setName((HumanName)null);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__TELECOM:
				getTelecoms().clear();
				return;
			case FhirResourcePackage.PATIENT_CONTACT__ADDRESS:
				setAddress((Address)null);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__GENDER:
				setGender((Code)null);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.PATIENT_CONTACT__PERIOD:
				setPeriod((Period)null);
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
			case FhirResourcePackage.PATIENT_CONTACT__RELATIONSHIP:
				return relationships != null && !relationships.isEmpty();
			case FhirResourcePackage.PATIENT_CONTACT__NAME:
				return name != null;
			case FhirResourcePackage.PATIENT_CONTACT__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case FhirResourcePackage.PATIENT_CONTACT__ADDRESS:
				return address != null;
			case FhirResourcePackage.PATIENT_CONTACT__GENDER:
				return gender != null;
			case FhirResourcePackage.PATIENT_CONTACT__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.PATIENT_CONTACT__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientContactImpl
