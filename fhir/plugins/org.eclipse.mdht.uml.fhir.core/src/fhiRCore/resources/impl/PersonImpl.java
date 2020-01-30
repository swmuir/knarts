/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Person;
import fhiRCore.resources.PersonLink;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.PersonImpl#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends DomainResourceImpl implements Person {
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
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PERSON__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<HumanName>(HumanName.class, this, ResourcesPackage.PERSON__NAME);
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
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PERSON__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__BIRTH_DATE, oldBirthDate, newBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, ResourcesPackage.PERSON__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Attachment newPhoto, NotificationChain msgs) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__PHOTO, oldPhoto, newPhoto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Attachment newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject)photo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject)newPhoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(fhiRCore.dataTypes.Boolean newActive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(fhiRCore.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PERSON__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PERSON__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<PersonLink>(PersonLink.class, this, ResourcesPackage.PERSON__LINK);
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERSON__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERSON__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERSON__GENDER:
				return basicSetGender(null, msgs);
			case ResourcesPackage.PERSON__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case ResourcesPackage.PERSON__ADDRESS:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERSON__PHOTO:
				return basicSetPhoto(null, msgs);
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case ResourcesPackage.PERSON__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.PERSON__LINK:
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PERSON__NAME:
				return getNames();
			case ResourcesPackage.PERSON__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PERSON__GENDER:
				return getGender();
			case ResourcesPackage.PERSON__BIRTH_DATE:
				return getBirthDate();
			case ResourcesPackage.PERSON__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PERSON__PHOTO:
				return getPhoto();
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case ResourcesPackage.PERSON__ACTIVE:
				return getActive();
			case ResourcesPackage.PERSON__LINK:
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PERSON__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PERSON__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PERSON__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PERSON__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PERSON__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.PERSON__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PERSON__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends PersonLink>)newValue);
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PERSON__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PERSON__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PERSON__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PERSON__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PERSON__PHOTO:
				setPhoto((Attachment)null);
				return;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case ResourcesPackage.PERSON__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PERSON__LINK:
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
			case ResourcesPackage.PERSON__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PERSON__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PERSON__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PERSON__GENDER:
				return gender != null;
			case ResourcesPackage.PERSON__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PERSON__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PERSON__PHOTO:
				return photo != null;
			case ResourcesPackage.PERSON__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.PERSON__ACTIVE:
				return active != null;
			case ResourcesPackage.PERSON__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
