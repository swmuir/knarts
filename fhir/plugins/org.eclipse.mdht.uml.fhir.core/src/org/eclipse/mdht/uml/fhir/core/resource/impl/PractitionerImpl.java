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

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.PractitionerPractitionerRole;
import org.eclipse.mdht.uml.fhir.core.resource.PractitionerQualification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getPractitionerRoles <em>Practitioner Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getQualifications <em>Qualification</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PractitionerImpl#getCommunications <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerImpl extends DomainResourceImpl implements Practitioner {
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
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

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
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

	/**
	 * The cached value of the '{@link #getPractitionerRoles() <em>Practitioner Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitionerRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerPractitionerRole> practitionerRoles;

	/**
	 * The cached value of the '{@link #getQualifications() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifications()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerQualification> qualifications;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPractitioner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.PRACTITIONER__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER__ACTIVE, oldActive, active));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER__ACTIVE, oldActive, active));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, FhirResourcePackage.PRACTITIONER__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, FhirResourcePackage.PRACTITIONER__ADDRESS);
		}
		return addresses;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER__GENDER, oldGender, gender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER__GENDER, oldGender, gender));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, birthDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.PRACTITIONER__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerPractitionerRole> getPractitionerRoles() {
		if (practitionerRoles == null) {
			practitionerRoles = new EObjectContainmentEList<PractitionerPractitionerRole>(PractitionerPractitionerRole.class, this, FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE);
		}
		return practitionerRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerQualification> getQualifications() {
		if (qualifications == null) {
			qualifications = new EObjectContainmentEList<PractitionerQualification>(PractitionerQualification.class, this, FhirResourcePackage.PRACTITIONER__QUALIFICATION);
		}
		return qualifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunications() {
		if (communications == null) {
			communications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.PRACTITIONER__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE:
				return ((InternalEList<?>)getPractitionerRoles()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.PRACTITIONER__QUALIFICATION:
				return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.PRACTITIONER__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.PRACTITIONER__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case FhirResourcePackage.PRACTITIONER__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.PRACTITIONER__TELECOM:
				return getTelecoms();
			case FhirResourcePackage.PRACTITIONER__ADDRESS:
				return getAddresses();
			case FhirResourcePackage.PRACTITIONER__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case FhirResourcePackage.PRACTITIONER__BIRTH_DATE:
				if (resolve) return getBirthDate();
				return basicGetBirthDate();
			case FhirResourcePackage.PRACTITIONER__PHOTO:
				return getPhotos();
			case FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE:
				return getPractitionerRoles();
			case FhirResourcePackage.PRACTITIONER__QUALIFICATION:
				return getQualifications();
			case FhirResourcePackage.PRACTITIONER__COMMUNICATION:
				return getCommunications();
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
			case FhirResourcePackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__NAME:
				setName((HumanName)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__GENDER:
				setGender((Code)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE:
				getPractitionerRoles().clear();
				getPractitionerRoles().addAll((Collection<? extends PractitionerPractitionerRole>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				getQualifications().addAll((Collection<? extends PractitionerQualification>)newValue);
				return;
			case FhirResourcePackage.PRACTITIONER__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirResourcePackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.PRACTITIONER__NAME:
				setName((HumanName)null);
				return;
			case FhirResourcePackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__GENDER:
				setGender((Code)null);
				return;
			case FhirResourcePackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case FhirResourcePackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE:
				getPractitionerRoles().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				return;
			case FhirResourcePackage.PRACTITIONER__COMMUNICATION:
				getCommunications().clear();
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
			case FhirResourcePackage.PRACTITIONER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.PRACTITIONER__ACTIVE:
				return active != null;
			case FhirResourcePackage.PRACTITIONER__NAME:
				return name != null;
			case FhirResourcePackage.PRACTITIONER__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case FhirResourcePackage.PRACTITIONER__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case FhirResourcePackage.PRACTITIONER__GENDER:
				return gender != null;
			case FhirResourcePackage.PRACTITIONER__BIRTH_DATE:
				return birthDate != null;
			case FhirResourcePackage.PRACTITIONER__PHOTO:
				return photos != null && !photos.isEmpty();
			case FhirResourcePackage.PRACTITIONER__PRACTITIONER_ROLE:
				return practitionerRoles != null && !practitionerRoles.isEmpty();
			case FhirResourcePackage.PRACTITIONER__QUALIFICATION:
				return qualifications != null && !qualifications.isEmpty();
			case FhirResourcePackage.PRACTITIONER__COMMUNICATION:
				return communications != null && !communications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerImpl
