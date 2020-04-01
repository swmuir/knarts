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
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.Coverage;
import org.eclipse.mdht.hl7.fhir.resources.CoverageClass;
import org.eclipse.mdht.hl7.fhir.resources.CoverageCostToBeneficiary;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getPayors <em>Payor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getClasses <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getCostToBeneficiaries <em>Cost To Beneficiary</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getSubrogation <em>Subrogation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getPolicyHolder() <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference policyHolder;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Reference subscriber;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String subscriberId;

	/**
	 * The cached value of the '{@link #getBeneficiary() <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected Reference beneficiary;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String dependent;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

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
	 * The cached value of the '{@link #getPayors() <em>Payor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> payors;

	/**
	 * The cached value of the '{@link #getClasses() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageClass> classes;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt order;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String network;

	/**
	 * The cached value of the '{@link #getCostToBeneficiaries() <em>Cost To Beneficiary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostToBeneficiaries()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageCostToBeneficiary> costToBeneficiaries;

	/**
	 * The cached value of the '{@link #getSubrogation() <em>Subrogation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrogation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean subrogation;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.COVERAGE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPolicyHolder() {
		return policyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyHolder(Reference newPolicyHolder, NotificationChain msgs) {
		Reference oldPolicyHolder = policyHolder;
		policyHolder = newPolicyHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__POLICY_HOLDER, oldPolicyHolder, newPolicyHolder);
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
	public void setPolicyHolder(Reference newPolicyHolder) {
		if (newPolicyHolder != policyHolder) {
			NotificationChain msgs = null;
			if (policyHolder != null)
				msgs = ((InternalEObject)policyHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			if (newPolicyHolder != null)
				msgs = ((InternalEObject)newPolicyHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__POLICY_HOLDER, null, msgs);
			msgs = basicSetPolicyHolder(newPolicyHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__POLICY_HOLDER, newPolicyHolder, newPolicyHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriber(Reference newSubscriber, NotificationChain msgs) {
		Reference oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER, oldSubscriber, newSubscriber);
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
	public void setSubscriber(Reference newSubscriber) {
		if (newSubscriber != subscriber) {
			NotificationChain msgs = null;
			if (subscriber != null)
				msgs = ((InternalEObject)subscriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBSCRIBER, null, msgs);
			if (newSubscriber != null)
				msgs = ((InternalEObject)newSubscriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBSCRIBER, null, msgs);
			msgs = basicSetSubscriber(newSubscriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER, newSubscriber, newSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriberId(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubscriberId, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER_ID, oldSubscriberId, newSubscriberId);
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
	public void setSubscriberId(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubscriberId) {
		if (newSubscriberId != subscriberId) {
			NotificationChain msgs = null;
			if (subscriberId != null)
				msgs = ((InternalEObject)subscriberId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			if (newSubscriberId != null)
				msgs = ((InternalEObject)newSubscriberId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			msgs = basicSetSubscriberId(newSubscriberId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER_ID, newSubscriberId, newSubscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getBeneficiary() {
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiary(Reference newBeneficiary, NotificationChain msgs) {
		Reference oldBeneficiary = beneficiary;
		beneficiary = newBeneficiary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__BENEFICIARY, oldBeneficiary, newBeneficiary);
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
	public void setBeneficiary(Reference newBeneficiary) {
		if (newBeneficiary != beneficiary) {
			NotificationChain msgs = null;
			if (beneficiary != null)
				msgs = ((InternalEObject)beneficiary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__BENEFICIARY, null, msgs);
			if (newBeneficiary != null)
				msgs = ((InternalEObject)newBeneficiary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__BENEFICIARY, null, msgs);
			msgs = basicSetBeneficiary(newBeneficiary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__BENEFICIARY, newBeneficiary, newBeneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(org.eclipse.mdht.hl7.fhir.dataTypes.String newDependent, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__DEPENDENT, oldDependent, newDependent);
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
	public void setDependent(org.eclipse.mdht.hl7.fhir.dataTypes.String newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__DEPENDENT, null, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__DEPENDENT, null, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__RELATIONSHIP, newRelationship, newRelationship));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPayors() {
		if (payors == null) {
			payors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COVERAGE__PAYOR);
		}
		return payors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<CoverageClass>(CoverageClass.class, this, ResourcesPackage.COVERAGE__CLASS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(PositiveInt newOrder, NotificationChain msgs) {
		PositiveInt oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__ORDER, oldOrder, newOrder);
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
	public void setOrder(PositiveInt newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(org.eclipse.mdht.hl7.fhir.dataTypes.String newNetwork, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(org.eclipse.mdht.hl7.fhir.dataTypes.String newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageCostToBeneficiary> getCostToBeneficiaries() {
		if (costToBeneficiaries == null) {
			costToBeneficiaries = new EObjectContainmentEList<CoverageCostToBeneficiary>(CoverageCostToBeneficiary.class, this, ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY);
		}
		return costToBeneficiaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getSubrogation() {
		return subrogation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubrogation(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newSubrogation, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldSubrogation = subrogation;
		subrogation = newSubrogation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBROGATION, oldSubrogation, newSubrogation);
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
	public void setSubrogation(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newSubrogation) {
		if (newSubrogation != subrogation) {
			NotificationChain msgs = null;
			if (subrogation != null)
				msgs = ((InternalEObject)subrogation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBROGATION, null, msgs);
			if (newSubrogation != null)
				msgs = ((InternalEObject)newSubrogation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__SUBROGATION, null, msgs);
			msgs = basicSetSubrogation(newSubrogation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBROGATION, newSubrogation, newSubrogation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContracts() {
		if (contracts == null) {
			contracts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COVERAGE__CONTRACT);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				return basicSetPolicyHolder(null, msgs);
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				return basicSetSubscriber(null, msgs);
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				return basicSetSubscriberId(null, msgs);
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				return basicSetBeneficiary(null, msgs);
			case ResourcesPackage.COVERAGE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case ResourcesPackage.COVERAGE__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.COVERAGE__PAYOR:
				return ((InternalEList<?>)getPayors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE__CLASS:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE__ORDER:
				return basicSetOrder(null, msgs);
			case ResourcesPackage.COVERAGE__NETWORK:
				return basicSetNetwork(null, msgs);
			case ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY:
				return ((InternalEList<?>)getCostToBeneficiaries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE__SUBROGATION:
				return basicSetSubrogation(null, msgs);
			case ResourcesPackage.COVERAGE__CONTRACT:
				return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COVERAGE__STATUS:
				return getStatus();
			case ResourcesPackage.COVERAGE__TYPE:
				return getType();
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				return getPolicyHolder();
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				return getSubscriber();
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				return getSubscriberId();
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				return getBeneficiary();
			case ResourcesPackage.COVERAGE__DEPENDENT:
				return getDependent();
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				return getRelationship();
			case ResourcesPackage.COVERAGE__PERIOD:
				return getPeriod();
			case ResourcesPackage.COVERAGE__PAYOR:
				return getPayors();
			case ResourcesPackage.COVERAGE__CLASS:
				return getClasses();
			case ResourcesPackage.COVERAGE__ORDER:
				return getOrder();
			case ResourcesPackage.COVERAGE__NETWORK:
				return getNetwork();
			case ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY:
				return getCostToBeneficiaries();
			case ResourcesPackage.COVERAGE__SUBROGATION:
				return getSubrogation();
			case ResourcesPackage.COVERAGE__CONTRACT:
				return getContracts();
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COVERAGE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				setDependent((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.COVERAGE__PAYOR:
				getPayors().clear();
				getPayors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.COVERAGE__CLASS:
				getClasses().clear();
				getClasses().addAll((Collection<? extends CoverageClass>)newValue);
				return;
			case ResourcesPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)newValue);
				return;
			case ResourcesPackage.COVERAGE__NETWORK:
				setNetwork((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiaries().clear();
				getCostToBeneficiaries().addAll((Collection<? extends CoverageCostToBeneficiary>)newValue);
				return;
			case ResourcesPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.COVERAGE__CONTRACT:
				getContracts().clear();
				getContracts().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COVERAGE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Reference)null);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)null);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Reference)null);
				return;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				setDependent((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.COVERAGE__PAYOR:
				getPayors().clear();
				return;
			case ResourcesPackage.COVERAGE__CLASS:
				getClasses().clear();
				return;
			case ResourcesPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)null);
				return;
			case ResourcesPackage.COVERAGE__NETWORK:
				setNetwork((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY:
				getCostToBeneficiaries().clear();
				return;
			case ResourcesPackage.COVERAGE__SUBROGATION:
				setSubrogation((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.COVERAGE__CONTRACT:
				getContracts().clear();
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COVERAGE__STATUS:
				return status != null;
			case ResourcesPackage.COVERAGE__TYPE:
				return type != null;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				return policyHolder != null;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				return subscriber != null;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				return subscriberId != null;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				return beneficiary != null;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.COVERAGE__PERIOD:
				return period != null;
			case ResourcesPackage.COVERAGE__PAYOR:
				return payors != null && !payors.isEmpty();
			case ResourcesPackage.COVERAGE__CLASS:
				return classes != null && !classes.isEmpty();
			case ResourcesPackage.COVERAGE__ORDER:
				return order != null;
			case ResourcesPackage.COVERAGE__NETWORK:
				return network != null;
			case ResourcesPackage.COVERAGE__COST_TO_BENEFICIARY:
				return costToBeneficiaries != null && !costToBeneficiaries.isEmpty();
			case ResourcesPackage.COVERAGE__SUBROGATION:
				return subrogation != null;
			case ResourcesPackage.COVERAGE__CONTRACT:
				return contracts != null && !contracts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
