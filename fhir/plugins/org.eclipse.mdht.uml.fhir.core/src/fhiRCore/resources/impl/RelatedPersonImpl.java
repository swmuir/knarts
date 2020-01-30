/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.RelatedPerson;
import fhiRCore.resources.RelatedPersonCommunication;
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
 * An implementation of the model object '<em><b>Related Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RelatedPersonImpl#getCommunications <em>Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedPersonImpl extends DomainResourceImpl implements RelatedPerson {
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
	protected fhiRCore.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> relationships;

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
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedPersonCommunication> communications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRelatedPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.RELATED_PERSON__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RELATED_PERSON__RELATIONSHIP);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<HumanName>(HumanName.class, this, ResourcesPackage.RELATED_PERSON__NAME);
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
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.RELATED_PERSON__TELECOM);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__GENDER, oldGender, newGender);
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
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__GENDER, newGender, newGender));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__BIRTH_DATE, oldBirthDate, newBirthDate);
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
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, ResourcesPackage.RELATED_PERSON__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectContainmentEList<Attachment>(Attachment.class, this, ResourcesPackage.RELATED_PERSON__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RELATED_PERSON__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RELATED_PERSON__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedPersonCommunication> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<RelatedPersonCommunication>(RelatedPersonCommunication.class, this, ResourcesPackage.RELATED_PERSON__COMMUNICATION);
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
			case ResourcesPackage.RELATED_PERSON__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.RELATED_PERSON__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.RELATED_PERSON__RELATIONSHIP:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__GENDER:
				return basicSetGender(null, msgs);
			case ResourcesPackage.RELATED_PERSON__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case ResourcesPackage.RELATED_PERSON__ADDRESS:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__PHOTO:
				return ((InternalEList<?>)getPhotos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELATED_PERSON__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.RELATED_PERSON__COMMUNICATION:
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
			case ResourcesPackage.RELATED_PERSON__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.RELATED_PERSON__ACTIVE:
				return getActive();
			case ResourcesPackage.RELATED_PERSON__PATIENT:
				return getPatient();
			case ResourcesPackage.RELATED_PERSON__RELATIONSHIP:
				return getRelationships();
			case ResourcesPackage.RELATED_PERSON__NAME:
				return getNames();
			case ResourcesPackage.RELATED_PERSON__TELECOM:
				return getTelecoms();
			case ResourcesPackage.RELATED_PERSON__GENDER:
				return getGender();
			case ResourcesPackage.RELATED_PERSON__BIRTH_DATE:
				return getBirthDate();
			case ResourcesPackage.RELATED_PERSON__ADDRESS:
				return getAddresses();
			case ResourcesPackage.RELATED_PERSON__PHOTO:
				return getPhotos();
			case ResourcesPackage.RELATED_PERSON__PERIOD:
				return getPeriod();
			case ResourcesPackage.RELATED_PERSON__COMMUNICATION:
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
			case ResourcesPackage.RELATED_PERSON__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__RELATIONSHIP:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.RELATED_PERSON__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends RelatedPersonCommunication>)newValue);
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
			case ResourcesPackage.RELATED_PERSON__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.RELATED_PERSON__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.RELATED_PERSON__RELATIONSHIP:
				getRelationships().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.RELATED_PERSON__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.RELATED_PERSON__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__PHOTO:
				getPhotos().clear();
				return;
			case ResourcesPackage.RELATED_PERSON__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.RELATED_PERSON__COMMUNICATION:
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
			case ResourcesPackage.RELATED_PERSON__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.RELATED_PERSON__ACTIVE:
				return active != null;
			case ResourcesPackage.RELATED_PERSON__PATIENT:
				return patient != null;
			case ResourcesPackage.RELATED_PERSON__RELATIONSHIP:
				return relationships != null && !relationships.isEmpty();
			case ResourcesPackage.RELATED_PERSON__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.RELATED_PERSON__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.RELATED_PERSON__GENDER:
				return gender != null;
			case ResourcesPackage.RELATED_PERSON__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.RELATED_PERSON__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.RELATED_PERSON__PHOTO:
				return photos != null && !photos.isEmpty();
			case ResourcesPackage.RELATED_PERSON__PERIOD:
				return period != null;
			case ResourcesPackage.RELATED_PERSON__COMMUNICATION:
				return communications != null && !communications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelatedPersonImpl
