/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.OrganizationAffiliation;
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
 * An implementation of the model object '<em><b>Organization Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getParticipatingOrganization <em>Participating Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getHealthcareServices <em>Healthcare Service</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OrganizationAffiliationImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationAffiliationImpl extends DomainResourceImpl implements OrganizationAffiliation {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

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
	 * The cached value of the '{@link #getParticipatingOrganization() <em>Participating Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference participatingOrganization;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> networks;

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
	protected OrganizationAffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOrganizationAffiliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE, oldActive, newActive);
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
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE, newActive, newActive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParticipatingOrganization() {
		return participatingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipatingOrganization(Reference newParticipatingOrganization, NotificationChain msgs) {
		Reference oldParticipatingOrganization = participatingOrganization;
		participatingOrganization = newParticipatingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, oldParticipatingOrganization, newParticipatingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatingOrganization(Reference newParticipatingOrganization) {
		if (newParticipatingOrganization != participatingOrganization) {
			NotificationChain msgs = null;
			if (participatingOrganization != null)
				msgs = ((InternalEObject)participatingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, null, msgs);
			if (newParticipatingOrganization != null)
				msgs = ((InternalEObject)newParticipatingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, null, msgs);
			msgs = basicSetParticipatingOrganization(newParticipatingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION, newParticipatingOrganization, newParticipatingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getHealthcareServices() {
		if (healthcareServices == null) {
			healthcareServices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE);
		}
		return healthcareServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT);
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
			case ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return basicSetParticipatingOrganization(null, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return ((InternalEList<?>)getHealthcareServices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
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
			case ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return getActive();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return getPeriod();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return getOrganization();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return getParticipatingOrganization();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return getNetworks();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__CODE:
				return getCodes();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return getLocations();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return getHealthcareServices();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return getTelecoms();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
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
			case ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				getHealthcareServices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
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
			case ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				setParticipatingOrganization((Reference)null);
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK:
				getNetworks().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
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
			case ResourcesPackage.ORGANIZATION_AFFILIATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ACTIVE:
				return active != null;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PERIOD:
				return period != null;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__PARTICIPATING_ORGANIZATION:
				return participatingOrganization != null;
			case ResourcesPackage.ORGANIZATION_AFFILIATION__NETWORK:
				return networks != null && !networks.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__HEALTHCARE_SERVICE:
				return healthcareServices != null && !healthcareServices.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.ORGANIZATION_AFFILIATION__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationAffiliationImpl
