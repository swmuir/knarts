/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.PaymentReconciliationDetails;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PaymentReconciliationDetailsImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationDetailsImpl extends BackboneElementImpl implements PaymentReconciliationDetails {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Identifier predecessor;

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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getSubmitter() <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected Reference submitter;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference response;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Reference responsible;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected Reference payee;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPaymentReconciliationDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Identifier newPredecessor, NotificationChain msgs) {
		Identifier oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR, oldPredecessor, newPredecessor);
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
	public void setPredecessor(Identifier newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject)predecessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR, null, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR, null, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR, newPredecessor, newPredecessor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, oldRequest, newRequest);
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
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubmitter() {
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmitter(Reference newSubmitter, NotificationChain msgs) {
		Reference oldSubmitter = submitter;
		submitter = newSubmitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, oldSubmitter, newSubmitter);
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
	public void setSubmitter(Reference newSubmitter) {
		if (newSubmitter != submitter) {
			NotificationChain msgs = null;
			if (submitter != null)
				msgs = ((InternalEObject)submitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, null, msgs);
			if (newSubmitter != null)
				msgs = ((InternalEObject)newSubmitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, null, msgs);
			msgs = basicSetSubmitter(newSubmitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, newSubmitter, newSubmitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Reference newResponse, NotificationChain msgs) {
		Reference oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE, oldResponse, newResponse);
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
	public void setResponse(Reference newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Reference newResponsible, NotificationChain msgs) {
		Reference oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(Reference newPayee, NotificationChain msgs) {
		Reference oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, oldPayee, newPayee);
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
	public void setPayee(Reference newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Money newAmount, NotificationChain msgs) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(Money newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				return basicSetRequest(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				return basicSetSubmitter(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE:
				return basicSetResponse(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				return basicSetPayee(null, msgs);
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR:
				return getPredecessor();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				return getType();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				return getRequest();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				return getSubmitter();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE:
				return getResponse();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				return getDate();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE:
				return getResponsible();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				return getPayee();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR:
				setPredecessor((Identifier)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				setRequest((Reference)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				setSubmitter((Reference)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE:
				setResponse((Reference)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				setDate((Date)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				setPayee((Reference)newValue);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				setAmount((Money)newValue);
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
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR:
				setPredecessor((Identifier)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				setRequest((Reference)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				setSubmitter((Reference)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE:
				setResponse((Reference)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				setDate((Date)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				setPayee((Reference)null);
				return;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				setAmount((Money)null);
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
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PREDECESSOR:
				return predecessor != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				return type != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				return request != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				return submitter != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSE:
				return response != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				return date != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__RESPONSIBLE:
				return responsible != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				return payee != null;
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationDetailsImpl
