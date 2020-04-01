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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.Consent;
import org.eclipse.mdht.hl7.fhir.resources.ConsentPolicy;
import org.eclipse.mdht.hl7.fhir.resources.ConsentVerification;
import org.eclipse.mdht.hl7.fhir.resources.Consentprovision;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getOrganizations <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getVerifications <em>Verification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConsentImpl#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends DomainResourceImpl implements Consent {
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
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scope;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

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
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performers;

	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> organizations;

	/**
	 * The cached value of the '{@link #getSourcex() <em>Sourcex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcex()
	 * @generated
	 * @ordered
	 */
	protected DataType sourcex;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentPolicy> policies;

	/**
	 * The cached value of the '{@link #getPolicyRule() <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRule()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept policyRule;

	/**
	 * The cached value of the '{@link #getVerifications() <em>Verification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentVerification> verifications;

	/**
	 * The cached value of the '{@link #getProvision() <em>Provision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvision()
	 * @generated
	 * @ordered
	 */
	protected Consentprovision provision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CONSENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__STATUS, oldStatus, newStatus);
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
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CodeableConcept newScope, NotificationChain msgs) {
		CodeableConcept oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__SCOPE, oldScope, newScope);
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
	public void setScope(CodeableConcept newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONSENT__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__DATE_TIME, oldDateTime, newDateTime);
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
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONSENT__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getOrganizations() {
		if (organizations == null) {
			organizations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONSENT__ORGANIZATION);
		}
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getSourcex() {
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcex(DataType newSourcex, NotificationChain msgs) {
		DataType oldSourcex = sourcex;
		sourcex = newSourcex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__SOURCEX, oldSourcex, newSourcex);
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
	public void setSourcex(DataType newSourcex) {
		if (newSourcex != sourcex) {
			NotificationChain msgs = null;
			if (sourcex != null)
				msgs = ((InternalEObject)sourcex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__SOURCEX, null, msgs);
			if (newSourcex != null)
				msgs = ((InternalEObject)newSourcex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__SOURCEX, null, msgs);
			msgs = basicSetSourcex(newSourcex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__SOURCEX, newSourcex, newSourcex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentPolicy> getPolicies() {
		if (policies == null) {
			policies = new EObjectContainmentEList<ConsentPolicy>(ConsentPolicy.class, this, ResourcesPackage.CONSENT__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPolicyRule() {
		return policyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyRule(CodeableConcept newPolicyRule, NotificationChain msgs) {
		CodeableConcept oldPolicyRule = policyRule;
		policyRule = newPolicyRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__POLICY_RULE, oldPolicyRule, newPolicyRule);
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
	public void setPolicyRule(CodeableConcept newPolicyRule) {
		if (newPolicyRule != policyRule) {
			NotificationChain msgs = null;
			if (policyRule != null)
				msgs = ((InternalEObject)policyRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__POLICY_RULE, null, msgs);
			if (newPolicyRule != null)
				msgs = ((InternalEObject)newPolicyRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__POLICY_RULE, null, msgs);
			msgs = basicSetPolicyRule(newPolicyRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__POLICY_RULE, newPolicyRule, newPolicyRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentVerification> getVerifications() {
		if (verifications == null) {
			verifications = new EObjectContainmentEList<ConsentVerification>(ConsentVerification.class, this, ResourcesPackage.CONSENT__VERIFICATION);
		}
		return verifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consentprovision getProvision() {
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvision(Consentprovision newProvision, NotificationChain msgs) {
		Consentprovision oldProvision = provision;
		provision = newProvision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__PROVISION, oldProvision, newProvision);
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
	public void setProvision(Consentprovision newProvision) {
		if (newProvision != provision) {
			NotificationChain msgs = null;
			if (provision != null)
				msgs = ((InternalEObject)provision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__PROVISION, null, msgs);
			if (newProvision != null)
				msgs = ((InternalEObject)newProvision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENT__PROVISION, null, msgs);
			msgs = basicSetProvision(newProvision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENT__PROVISION, newProvision, newProvision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONSENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CONSENT__SCOPE:
				return basicSetScope(null, msgs);
			case ResourcesPackage.CONSENT__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.CONSENT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case ResourcesPackage.CONSENT__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__ORGANIZATION:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__SOURCEX:
				return basicSetSourcex(null, msgs);
			case ResourcesPackage.CONSENT__POLICY:
				return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__POLICY_RULE:
				return basicSetPolicyRule(null, msgs);
			case ResourcesPackage.CONSENT__VERIFICATION:
				return ((InternalEList<?>)getVerifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENT__PROVISION:
				return basicSetProvision(null, msgs);
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
			case ResourcesPackage.CONSENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CONSENT__STATUS:
				return getStatus();
			case ResourcesPackage.CONSENT__SCOPE:
				return getScope();
			case ResourcesPackage.CONSENT__CATEGORY:
				return getCategories();
			case ResourcesPackage.CONSENT__PATIENT:
				return getPatient();
			case ResourcesPackage.CONSENT__DATE_TIME:
				return getDateTime();
			case ResourcesPackage.CONSENT__PERFORMER:
				return getPerformers();
			case ResourcesPackage.CONSENT__ORGANIZATION:
				return getOrganizations();
			case ResourcesPackage.CONSENT__SOURCEX:
				return getSourcex();
			case ResourcesPackage.CONSENT__POLICY:
				return getPolicies();
			case ResourcesPackage.CONSENT__POLICY_RULE:
				return getPolicyRule();
			case ResourcesPackage.CONSENT__VERIFICATION:
				return getVerifications();
			case ResourcesPackage.CONSENT__PROVISION:
				return getProvision();
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
			case ResourcesPackage.CONSENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CONSENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CONSENT__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONSENT__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONSENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case ResourcesPackage.CONSENT__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONSENT__ORGANIZATION:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONSENT__SOURCEX:
				setSourcex((DataType)newValue);
				return;
			case ResourcesPackage.CONSENT__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends ConsentPolicy>)newValue);
				return;
			case ResourcesPackage.CONSENT__POLICY_RULE:
				setPolicyRule((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONSENT__VERIFICATION:
				getVerifications().clear();
				getVerifications().addAll((Collection<? extends ConsentVerification>)newValue);
				return;
			case ResourcesPackage.CONSENT__PROVISION:
				setProvision((Consentprovision)newValue);
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
			case ResourcesPackage.CONSENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CONSENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CONSENT__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case ResourcesPackage.CONSENT__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.CONSENT__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case ResourcesPackage.CONSENT__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.CONSENT__ORGANIZATION:
				getOrganizations().clear();
				return;
			case ResourcesPackage.CONSENT__SOURCEX:
				setSourcex((DataType)null);
				return;
			case ResourcesPackage.CONSENT__POLICY:
				getPolicies().clear();
				return;
			case ResourcesPackage.CONSENT__POLICY_RULE:
				setPolicyRule((CodeableConcept)null);
				return;
			case ResourcesPackage.CONSENT__VERIFICATION:
				getVerifications().clear();
				return;
			case ResourcesPackage.CONSENT__PROVISION:
				setProvision((Consentprovision)null);
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
			case ResourcesPackage.CONSENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CONSENT__STATUS:
				return status != null;
			case ResourcesPackage.CONSENT__SCOPE:
				return scope != null;
			case ResourcesPackage.CONSENT__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.CONSENT__PATIENT:
				return patient != null;
			case ResourcesPackage.CONSENT__DATE_TIME:
				return dateTime != null;
			case ResourcesPackage.CONSENT__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.CONSENT__ORGANIZATION:
				return organizations != null && !organizations.isEmpty();
			case ResourcesPackage.CONSENT__SOURCEX:
				return sourcex != null;
			case ResourcesPackage.CONSENT__POLICY:
				return policies != null && !policies.isEmpty();
			case ResourcesPackage.CONSENT__POLICY_RULE:
				return policyRule != null;
			case ResourcesPackage.CONSENT__VERIFICATION:
				return verifications != null && !verifications.isEmpty();
			case ResourcesPackage.CONSENT__PROVISION:
				return provision != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
