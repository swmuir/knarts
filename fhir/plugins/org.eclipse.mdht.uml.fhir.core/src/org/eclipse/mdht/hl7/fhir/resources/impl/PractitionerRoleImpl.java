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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.PractitionerRole;
import org.eclipse.mdht.hl7.fhir.resources.PractitionerRoleAvailableTime;
import org.eclipse.mdht.hl7.fhir.resources.PractitionerRoleNotAvailable;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getHealthcareServices <em>Healthcare Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PractitionerRoleImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerRoleImpl extends DomainResourceImpl implements PractitionerRole {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Reference practitioner;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> locations;

	/**
	 * The cached value of the '{@link #getHealthcareServices() <em>Healthcare Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> healthcareServices;

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
	 * The cached value of the '{@link #getAvailableTimes() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerRoleAvailableTime> availableTimes;

	/**
	 * The cached value of the '{@link #getNotAvailables() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailables()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerRoleNotAvailable> notAvailables;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String availabilityExceptions;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPractitionerRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Reference newPractitioner, NotificationChain msgs) {
		Reference oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, oldPractitioner, newPractitioner);
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
	public void setPractitioner(Reference newPractitioner) {
		if (newPractitioner != practitioner) {
			NotificationChain msgs = null;
			if (practitioner != null)
				msgs = ((InternalEObject)practitioner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, null, msgs);
			if (newPractitioner != null)
				msgs = ((InternalEObject)newPractitioner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, null, msgs);
			msgs = basicSetPractitioner(newPractitioner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, newPractitioner, newPractitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER_ROLE__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PRACTITIONER_ROLE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getHealthcareServices() {
		if (healthcareServices == null) {
			healthcareServices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE);
		}
		return healthcareServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PRACTITIONER_ROLE__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PractitionerRoleAvailableTime> getAvailableTimes() {
		if (availableTimes == null) {
			availableTimes = new EObjectContainmentEList<PractitionerRoleAvailableTime>(PractitionerRoleAvailableTime.class, this, ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME);
		}
		return availableTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PractitionerRoleNotAvailable> getNotAvailables() {
		if (notAvailables == null) {
			notAvailables = new EObjectContainmentEList<PractitionerRoleNotAvailable>(PractitionerRoleNotAvailable.class, this, ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE);
		}
		return notAvailables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityExceptions(org.eclipse.mdht.hl7.fhir.dataTypes.String newAvailabilityExceptions, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, newAvailabilityExceptions);
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
	public void setAvailabilityExceptions(org.eclipse.mdht.hl7.fhir.dataTypes.String newAvailabilityExceptions) {
		if (newAvailabilityExceptions != availabilityExceptions) {
			NotificationChain msgs = null;
			if (availabilityExceptions != null)
				msgs = ((InternalEObject)availabilityExceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, null, msgs);
			if (newAvailabilityExceptions != null)
				msgs = ((InternalEObject)newAvailabilityExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, null, msgs);
			msgs = basicSetAvailabilityExceptions(newAvailabilityExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, newAvailabilityExceptions, newAvailabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareServices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTimes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				return ((InternalEList<?>)getNotAvailables()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				return basicSetAvailabilityExceptions(null, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				return getActive();
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				return getPeriod();
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return getPractitioner();
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return getOrganization();
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				return getCodes();
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				return getLocations();
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return getHealthcareServices();
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return getAvailableTimes();
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				return getNotAvailables();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				return getAvailabilityExceptions();
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				return getEndpoints();
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Reference)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				getHealthcareServices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				getAvailableTimes().addAll((Collection<? extends PractitionerRoleAvailableTime>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				getNotAvailables().clear();
				getNotAvailables().addAll((Collection<? extends PractitionerRoleNotAvailable>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Reference)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				getNotAvailables().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				getEndpoints().clear();
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				return active != null;
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				return period != null;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return practitioner != null;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return healthcareServices != null && !healthcareServices.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return availableTimes != null && !availableTimes.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				return notAvailables != null && !notAvailables.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerRoleImpl
