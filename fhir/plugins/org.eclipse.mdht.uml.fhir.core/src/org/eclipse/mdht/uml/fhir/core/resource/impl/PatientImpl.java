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

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.PatientAnimal;
import org.eclipse.mdht.uml.fhir.core.resource.PatientCommunication;
import org.eclipse.mdht.uml.fhir.core.resource.PatientContact;
import org.eclipse.mdht.uml.fhir.core.resource.PatientLink;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getMultipleBirthx <em>Multiple Birthx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getCommunications <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getCareProviders <em>Care Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientImpl#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends DomainResourceImpl implements Patient {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean active;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> names;

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
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getDeceasedx() <em>Deceasedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedx()
	 * @generated
	 * @ordered
	 */
	protected DataType deceasedx;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getMaritalStatus() <em>Marital Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept maritalStatus;

	/**
	 * The cached value of the '{@link #getMultipleBirthx() <em>Multiple Birthx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleBirthx()
	 * @generated
	 * @ordered
	 */
	protected DataType multipleBirthx;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientContact> contacts;

	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected PatientAnimal animal;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientCommunication> communications;

	/**
	 * The cached value of the '{@link #getCareProviders() <em>Care Provider</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> careProviders;

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
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPatient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.PATIENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newActive) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectResolvingEList<HumanName>(HumanName.class, this, FhirResourcePackage.PATIENT__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, FhirResourcePackage.PATIENT__TELECOM);
		}
		return telecoms;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__GENDER, oldGender, gender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		if (birthDate != null && birthDate.eIsProxy()) {
			InternalEObject oldBirthDate = (InternalEObject)birthDate;
			birthDate = (Date)eResolveProxy(oldBirthDate);
			if (birthDate != oldBirthDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__BIRTH_DATE, oldBirthDate, birthDate));
			}
		}
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDeceasedx() {
		if (deceasedx != null && deceasedx.eIsProxy()) {
			InternalEObject oldDeceasedx = (InternalEObject)deceasedx;
			deceasedx = (DataType)eResolveProxy(oldDeceasedx);
			if (deceasedx != oldDeceasedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__DECEASEDX, oldDeceasedx, deceasedx));
			}
		}
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDeceasedx() {
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedx(DataType newDeceasedx) {
		DataType oldDeceasedx = deceasedx;
		deceasedx = newDeceasedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__DECEASEDX, oldDeceasedx, deceasedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, FhirResourcePackage.PATIENT__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaritalStatus() {
		if (maritalStatus != null && maritalStatus.eIsProxy()) {
			InternalEObject oldMaritalStatus = (InternalEObject)maritalStatus;
			maritalStatus = (CodeableConcept)eResolveProxy(oldMaritalStatus);
			if (maritalStatus != oldMaritalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, maritalStatus));
			}
		}
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaritalStatus(CodeableConcept newMaritalStatus) {
		CodeableConcept oldMaritalStatus = maritalStatus;
		maritalStatus = newMaritalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, maritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMultipleBirthx() {
		if (multipleBirthx != null && multipleBirthx.eIsProxy()) {
			InternalEObject oldMultipleBirthx = (InternalEObject)multipleBirthx;
			multipleBirthx = (DataType)eResolveProxy(oldMultipleBirthx);
			if (multipleBirthx != oldMultipleBirthx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX, oldMultipleBirthx, multipleBirthx));
			}
		}
		return multipleBirthx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMultipleBirthx() {
		return multipleBirthx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleBirthx(DataType newMultipleBirthx) {
		DataType oldMultipleBirthx = multipleBirthx;
		multipleBirthx = newMultipleBirthx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX, oldMultipleBirthx, multipleBirthx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.PATIENT__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<PatientContact>(PatientContact.class, this, FhirResourcePackage.PATIENT__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal getAnimal() {
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimal(PatientAnimal newAnimal, NotificationChain msgs) {
		PatientAnimal oldAnimal = animal;
		animal = newAnimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__ANIMAL, oldAnimal, newAnimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimal(PatientAnimal newAnimal) {
		if (newAnimal != animal) {
			NotificationChain msgs = null;
			if (animal != null)
				msgs = ((InternalEObject)animal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.PATIENT__ANIMAL, null, msgs);
			if (newAnimal != null)
				msgs = ((InternalEObject)newAnimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.PATIENT__ANIMAL, null, msgs);
			msgs = basicSetAnimal(newAnimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__ANIMAL, newAnimal, newAnimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientCommunication> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<PatientCommunication>(PatientCommunication.class, this, FhirResourcePackage.PATIENT__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getCareProviders() {
		if (careProviders == null) {
			careProviders = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.PATIENT__CARE_PROVIDER);
		}
		return careProviders;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<PatientLink>(PatientLink.class, this, FhirResourcePackage.PATIENT__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.PATIENT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.PATIENT__ANIMAL:
				return basicSetAnimal(null, msgs);
			case FhirResourcePackage.PATIENT__COMMUNICATION:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.PATIENT__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.PATIENT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.PATIENT__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case FhirResourcePackage.PATIENT__NAME:
				return getNames();
			case FhirResourcePackage.PATIENT__TELECOM:
				return getTelecoms();
			case FhirResourcePackage.PATIENT__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case FhirResourcePackage.PATIENT__BIRTH_DATE:
				if (resolve) return getBirthDate();
				return basicGetBirthDate();
			case FhirResourcePackage.PATIENT__DECEASEDX:
				if (resolve) return getDeceasedx();
				return basicGetDeceasedx();
			case FhirResourcePackage.PATIENT__ADDRESS:
				return getAddresses();
			case FhirResourcePackage.PATIENT__MARITAL_STATUS:
				if (resolve) return getMaritalStatus();
				return basicGetMaritalStatus();
			case FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX:
				if (resolve) return getMultipleBirthx();
				return basicGetMultipleBirthx();
			case FhirResourcePackage.PATIENT__PHOTO:
				return getPhotos();
			case FhirResourcePackage.PATIENT__CONTACT:
				return getContacts();
			case FhirResourcePackage.PATIENT__ANIMAL:
				return getAnimal();
			case FhirResourcePackage.PATIENT__COMMUNICATION:
				return getCommunications();
			case FhirResourcePackage.PATIENT__CARE_PROVIDER:
				return getCareProviders();
			case FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case FhirResourcePackage.PATIENT__LINK:
				return getLinks();
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
			case FhirResourcePackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.PATIENT__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case FhirResourcePackage.PATIENT__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirResourcePackage.PATIENT__GENDER:
				setGender((Code)newValue);
				return;
			case FhirResourcePackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FhirResourcePackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)newValue);
				return;
			case FhirResourcePackage.PATIENT__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirResourcePackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)newValue);
				return;
			case FhirResourcePackage.PATIENT__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.PATIENT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends PatientContact>)newValue);
				return;
			case FhirResourcePackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)newValue);
				return;
			case FhirResourcePackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends PatientCommunication>)newValue);
				return;
			case FhirResourcePackage.PATIENT__CARE_PROVIDER:
				getCareProviders().clear();
				getCareProviders().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.PATIENT__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends PatientLink>)newValue);
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
			case FhirResourcePackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.PATIENT__NAME:
				getNames().clear();
				return;
			case FhirResourcePackage.PATIENT__TELECOM:
				getTelecoms().clear();
				return;
			case FhirResourcePackage.PATIENT__GENDER:
				setGender((Code)null);
				return;
			case FhirResourcePackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FhirResourcePackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)null);
				return;
			case FhirResourcePackage.PATIENT__ADDRESS:
				getAddresses().clear();
				return;
			case FhirResourcePackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)null);
				return;
			case FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)null);
				return;
			case FhirResourcePackage.PATIENT__PHOTO:
				getPhotos().clear();
				return;
			case FhirResourcePackage.PATIENT__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)null);
				return;
			case FhirResourcePackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				return;
			case FhirResourcePackage.PATIENT__CARE_PROVIDER:
				getCareProviders().clear();
				return;
			case FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case FhirResourcePackage.PATIENT__LINK:
				getLinks().clear();
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
			case FhirResourcePackage.PATIENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.PATIENT__ACTIVE:
				return active != null;
			case FhirResourcePackage.PATIENT__NAME:
				return names != null && !names.isEmpty();
			case FhirResourcePackage.PATIENT__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case FhirResourcePackage.PATIENT__GENDER:
				return gender != null;
			case FhirResourcePackage.PATIENT__BIRTH_DATE:
				return birthDate != null;
			case FhirResourcePackage.PATIENT__DECEASEDX:
				return deceasedx != null;
			case FhirResourcePackage.PATIENT__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case FhirResourcePackage.PATIENT__MARITAL_STATUS:
				return maritalStatus != null;
			case FhirResourcePackage.PATIENT__MULTIPLE_BIRTHX:
				return multipleBirthx != null;
			case FhirResourcePackage.PATIENT__PHOTO:
				return photos != null && !photos.isEmpty();
			case FhirResourcePackage.PATIENT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.PATIENT__ANIMAL:
				return animal != null;
			case FhirResourcePackage.PATIENT__COMMUNICATION:
				return communications != null && !communications.isEmpty();
			case FhirResourcePackage.PATIENT__CARE_PROVIDER:
				return careProviders != null && !careProviders.isEmpty();
			case FhirResourcePackage.PATIENT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirResourcePackage.PATIENT__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatientImpl
