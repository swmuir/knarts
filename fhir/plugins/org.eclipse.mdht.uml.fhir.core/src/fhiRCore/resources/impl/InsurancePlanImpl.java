/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.InsurancePlan;
import fhiRCore.resources.InsurancePlanContact;
import fhiRCore.resources.InsurancePlanCoverage;
import fhiRCore.resources.InsurancePlanPlan;
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
 * An implementation of the model object '<em><b>Insurance Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getAdministeredBy <em>Administered By</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getCoverages <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanImpl#getPlans <em>Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanImpl extends DomainResourceImpl implements InsurancePlan {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> alias;

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
	 * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference ownedBy;

	/**
	 * The cached value of the '{@link #getAdministeredBy() <em>Administered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministeredBy()
	 * @generated
	 * @ordered
	 */
	protected Reference administeredBy;

	/**
	 * The cached value of the '{@link #getCoverageAreas() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageAreas;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanContact> contacts;

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
	 * The cached value of the '{@link #getNetworks() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> networks;

	/**
	 * The cached value of the '{@link #getCoverages() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverages()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanCoverage> coverages;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlan> plans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.INSURANCE_PLAN__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.INSURANCE_PLAN__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.INSURANCE_PLAN__ALIAS);
		}
		return alias;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOwnedBy() {
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(Reference newOwnedBy, NotificationChain msgs) {
		Reference oldOwnedBy = ownedBy;
		ownedBy = newOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__OWNED_BY, oldOwnedBy, newOwnedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBy(Reference newOwnedBy) {
		if (newOwnedBy != ownedBy) {
			NotificationChain msgs = null;
			if (ownedBy != null)
				msgs = ((InternalEObject)ownedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__OWNED_BY, null, msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__OWNED_BY, null, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAdministeredBy() {
		return administeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministeredBy(Reference newAdministeredBy, NotificationChain msgs) {
		Reference oldAdministeredBy = administeredBy;
		administeredBy = newAdministeredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY, oldAdministeredBy, newAdministeredBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministeredBy(Reference newAdministeredBy) {
		if (newAdministeredBy != administeredBy) {
			NotificationChain msgs = null;
			if (administeredBy != null)
				msgs = ((InternalEObject)administeredBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY, null, msgs);
			if (newAdministeredBy != null)
				msgs = ((InternalEObject)newAdministeredBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY, null, msgs);
			msgs = basicSetAdministeredBy(newAdministeredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY, newAdministeredBy, newAdministeredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCoverageAreas() {
		if (coverageAreas == null) {
			coverageAreas = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA);
		}
		return coverageAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<InsurancePlanContact>(InsurancePlanContact.class, this, ResourcesPackage.INSURANCE_PLAN__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN__NETWORK);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanCoverage> getCoverages() {
		if (coverages == null) {
			coverages = new EObjectContainmentEList<InsurancePlanCoverage>(InsurancePlanCoverage.class, this, ResourcesPackage.INSURANCE_PLAN__COVERAGE);
		}
		return coverages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanPlan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentEList<InsurancePlanPlan>(InsurancePlanPlan.class, this, ResourcesPackage.INSURANCE_PLAN__PLAN);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INSURANCE_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return basicSetAdministeredBy(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageAreas()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__NETWORK:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE:
				return ((InternalEList<?>)getCoverages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN__PLAN:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INSURANCE_PLAN__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.INSURANCE_PLAN__STATUS:
				return getStatus();
			case ResourcesPackage.INSURANCE_PLAN__TYPE:
				return getTypes();
			case ResourcesPackage.INSURANCE_PLAN__NAME:
				return getName();
			case ResourcesPackage.INSURANCE_PLAN__ALIAS:
				return getAlias();
			case ResourcesPackage.INSURANCE_PLAN__PERIOD:
				return getPeriod();
			case ResourcesPackage.INSURANCE_PLAN__OWNED_BY:
				return getOwnedBy();
			case ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return getAdministeredBy();
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return getCoverageAreas();
			case ResourcesPackage.INSURANCE_PLAN__CONTACT:
				return getContacts();
			case ResourcesPackage.INSURANCE_PLAN__ENDPOINT:
				return getEndpoints();
			case ResourcesPackage.INSURANCE_PLAN__NETWORK:
				return getNetworks();
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE:
				return getCoverages();
			case ResourcesPackage.INSURANCE_PLAN__PLAN:
				return getPlans();
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
			case ResourcesPackage.INSURANCE_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__OWNED_BY:
				setOwnedBy((Reference)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				setAdministeredBy((Reference)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA:
				getCoverageAreas().clear();
				getCoverageAreas().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends InsurancePlanContact>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__NETWORK:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE:
				getCoverages().clear();
				getCoverages().addAll((Collection<? extends InsurancePlanCoverage>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN__PLAN:
				getPlans().clear();
				getPlans().addAll((Collection<? extends InsurancePlanPlan>)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN__ALIAS:
				getAlias().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN__OWNED_BY:
				setOwnedBy((Reference)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				setAdministeredBy((Reference)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA:
				getCoverageAreas().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__ENDPOINT:
				getEndpoints().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__NETWORK:
				getNetworks().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE:
				getCoverages().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN__PLAN:
				getPlans().clear();
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
			case ResourcesPackage.INSURANCE_PLAN__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__STATUS:
				return status != null;
			case ResourcesPackage.INSURANCE_PLAN__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__NAME:
				return name != null;
			case ResourcesPackage.INSURANCE_PLAN__ALIAS:
				return alias != null && !alias.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__PERIOD:
				return period != null;
			case ResourcesPackage.INSURANCE_PLAN__OWNED_BY:
				return ownedBy != null;
			case ResourcesPackage.INSURANCE_PLAN__ADMINISTERED_BY:
				return administeredBy != null;
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE_AREA:
				return coverageAreas != null && !coverageAreas.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__NETWORK:
				return networks != null && !networks.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__COVERAGE:
				return coverages != null && !coverages.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN__PLAN:
				return plans != null && !plans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanImpl
