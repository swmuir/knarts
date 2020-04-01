/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Address;
import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.HumanName;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;

import org.eclipse.mdht.hl7.fhir.resources.Practitioner;
import org.eclipse.mdht.hl7.fhir.resources.PractitionerQualification;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getQualifications <em>Qualification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerImpl#getCommunications <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerImpl extends DomainResourceImpl implements Practitioner {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> names;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

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
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' containment reference list.
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
		return ResourcesPackage.eINSTANCE.getPractitioner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PRACTITIONER__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<HumanName>(HumanName.class, this, ResourcesPackage.PRACTITIONER__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PRACTITIONER__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, ResourcesPackage.PRACTITIONER__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(Code newGender, NotificationChain msgs) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Code newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthDate(Date newBirthDate, NotificationChain msgs) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, newBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectContainmentEList<Attachment>(Attachment.class, this, ResourcesPackage.PRACTITIONER__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PractitionerQualification> getQualifications() {
		if (qualifications == null) {
			qualifications = new EObjectContainmentEList<PractitionerQualification>(PractitionerQualification.class, this, ResourcesPackage.PRACTITIONER__QUALIFICATION);
		}
		return qualifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER__COMMUNICATION);
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.PRACTITIONER__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__GENDER:
				return basicSetGender(null, msgs);
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case ResourcesPackage.PRACTITIONER__PHOTO:
				return ((InternalEList<?>)getPhotos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				return getActive();
			case ResourcesPackage.PRACTITIONER__NAME:
				return getNames();
			case ResourcesPackage.PRACTITIONER__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PRACTITIONER__GENDER:
				return getGender();
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				return getBirthDate();
			case ResourcesPackage.PRACTITIONER__PHOTO:
				return getPhotos();
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return getQualifications();
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				getQualifications().addAll((Collection<? extends PractitionerQualification>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PRACTITIONER__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PRACTITIONER__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				return;
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				return;
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				return active != null;
			case ResourcesPackage.PRACTITIONER__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PRACTITIONER__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PRACTITIONER__GENDER:
				return gender != null;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				return photos != null && !photos.isEmpty();
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return qualifications != null && !qualifications.isEmpty();
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				return communications != null && !communications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerImpl
