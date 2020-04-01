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
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.HumanName;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.Patient;
import org.eclipse.mdht.hl7.fhir.resources.PatientCommunication;
import org.eclipse.mdht.hl7.fhir.resources.PatientContact;
import org.eclipse.mdht.hl7.fhir.resources.PatientLink;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getMultipleBirthx <em>Multiple Birthx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getCommunications <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getGeneralPractitioners <em>General Practitioner</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PatientImpl#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends DomainResourceImpl implements Patient {
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
	 * The cached value of the '{@link #getDeceasedx() <em>Deceasedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedx()
	 * @generated
	 * @ordered
	 */
	protected DataType deceasedx;

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
	 * The cached value of the '{@link #getMaritalStatus() <em>Marital Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept maritalStatus;

	/**
	 * The cached value of the '{@link #getMultipleBirthx() <em>Multiple Birthx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleBirthx()
	 * @generated
	 * @ordered
	 */
	protected DataType multipleBirthx;

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
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientContact> contacts;

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
	 * The cached value of the '{@link #getGeneralPractitioners() <em>General Practitioner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralPractitioners()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> generalPractitioners;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

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
		return ResourcesPackage.eINSTANCE.getPatient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PATIENT__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<HumanName>(HumanName.class, this, ResourcesPackage.PATIENT__NAME);
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
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PATIENT__TELECOM);
		}
		return telecoms;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__GENDER, oldGender, newGender);
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
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__GENDER, newGender, newGender));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__BIRTH_DATE, oldBirthDate, newBirthDate);
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
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDeceasedx() {
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedx(DataType newDeceasedx, NotificationChain msgs) {
		DataType oldDeceasedx = deceasedx;
		deceasedx = newDeceasedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__DECEASEDX, oldDeceasedx, newDeceasedx);
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
	public void setDeceasedx(DataType newDeceasedx) {
		if (newDeceasedx != deceasedx) {
			NotificationChain msgs = null;
			if (deceasedx != null)
				msgs = ((InternalEObject)deceasedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__DECEASEDX, null, msgs);
			if (newDeceasedx != null)
				msgs = ((InternalEObject)newDeceasedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__DECEASEDX, null, msgs);
			msgs = basicSetDeceasedx(newDeceasedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__DECEASEDX, newDeceasedx, newDeceasedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, ResourcesPackage.PATIENT__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaritalStatus(CodeableConcept newMaritalStatus, NotificationChain msgs) {
		CodeableConcept oldMaritalStatus = maritalStatus;
		maritalStatus = newMaritalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, newMaritalStatus);
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
	public void setMaritalStatus(CodeableConcept newMaritalStatus) {
		if (newMaritalStatus != maritalStatus) {
			NotificationChain msgs = null;
			if (maritalStatus != null)
				msgs = ((InternalEObject)maritalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MARITAL_STATUS, null, msgs);
			if (newMaritalStatus != null)
				msgs = ((InternalEObject)newMaritalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MARITAL_STATUS, null, msgs);
			msgs = basicSetMaritalStatus(newMaritalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MARITAL_STATUS, newMaritalStatus, newMaritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getMultipleBirthx() {
		return multipleBirthx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleBirthx(DataType newMultipleBirthx, NotificationChain msgs) {
		DataType oldMultipleBirthx = multipleBirthx;
		multipleBirthx = newMultipleBirthx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, oldMultipleBirthx, newMultipleBirthx);
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
	public void setMultipleBirthx(DataType newMultipleBirthx) {
		if (newMultipleBirthx != multipleBirthx) {
			NotificationChain msgs = null;
			if (multipleBirthx != null)
				msgs = ((InternalEObject)multipleBirthx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, null, msgs);
			if (newMultipleBirthx != null)
				msgs = ((InternalEObject)newMultipleBirthx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, null, msgs);
			msgs = basicSetMultipleBirthx(newMultipleBirthx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, newMultipleBirthx, newMultipleBirthx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectContainmentEList<Attachment>(Attachment.class, this, ResourcesPackage.PATIENT__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatientContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<PatientContact>(PatientContact.class, this, ResourcesPackage.PATIENT__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatientCommunication> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<PatientCommunication>(PatientCommunication.class, this, ResourcesPackage.PATIENT__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getGeneralPractitioners() {
		if (generalPractitioners == null) {
			generalPractitioners = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PATIENT__GENERAL_PRACTITIONER);
		}
		return generalPractitioners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatientLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<PatientLink>(PatientLink.class, this, ResourcesPackage.PATIENT__LINK);
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.PATIENT__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__GENDER:
				return basicSetGender(null, msgs);
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case ResourcesPackage.PATIENT__DECEASEDX:
				return basicSetDeceasedx(null, msgs);
			case ResourcesPackage.PATIENT__ADDRESS:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				return basicSetMaritalStatus(null, msgs);
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				return basicSetMultipleBirthx(null, msgs);
			case ResourcesPackage.PATIENT__PHOTO:
				return ((InternalEList<?>)getPhotos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				return ((InternalEList<?>)getGeneralPractitioners()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case ResourcesPackage.PATIENT__LINK:
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PATIENT__ACTIVE:
				return getActive();
			case ResourcesPackage.PATIENT__NAME:
				return getNames();
			case ResourcesPackage.PATIENT__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PATIENT__GENDER:
				return getGender();
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				return getBirthDate();
			case ResourcesPackage.PATIENT__DECEASEDX:
				return getDeceasedx();
			case ResourcesPackage.PATIENT__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				return getMaritalStatus();
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				return getMultipleBirthx();
			case ResourcesPackage.PATIENT__PHOTO:
				return getPhotos();
			case ResourcesPackage.PATIENT__CONTACT:
				return getContacts();
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return getCommunications();
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				return getGeneralPractitioners();
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case ResourcesPackage.PATIENT__LINK:
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PATIENT__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PATIENT__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PATIENT__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)newValue);
				return;
			case ResourcesPackage.PATIENT__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)newValue);
				return;
			case ResourcesPackage.PATIENT__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.PATIENT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends PatientContact>)newValue);
				return;
			case ResourcesPackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends PatientCommunication>)newValue);
				return;
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				getGeneralPractitioners().clear();
				getGeneralPractitioners().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.PATIENT__LINK:
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PATIENT__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PATIENT__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PATIENT__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)null);
				return;
			case ResourcesPackage.PATIENT__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)null);
				return;
			case ResourcesPackage.PATIENT__PHOTO:
				getPhotos().clear();
				return;
			case ResourcesPackage.PATIENT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				return;
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				getGeneralPractitioners().clear();
				return;
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case ResourcesPackage.PATIENT__LINK:
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PATIENT__ACTIVE:
				return active != null;
			case ResourcesPackage.PATIENT__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PATIENT__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PATIENT__GENDER:
				return gender != null;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PATIENT__DECEASEDX:
				return deceasedx != null;
			case ResourcesPackage.PATIENT__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				return maritalStatus != null;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				return multipleBirthx != null;
			case ResourcesPackage.PATIENT__PHOTO:
				return photos != null && !photos.isEmpty();
			case ResourcesPackage.PATIENT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return communications != null && !communications.isEmpty();
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				return generalPractitioners != null && !generalPractitioners.isEmpty();
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.PATIENT__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatientImpl
