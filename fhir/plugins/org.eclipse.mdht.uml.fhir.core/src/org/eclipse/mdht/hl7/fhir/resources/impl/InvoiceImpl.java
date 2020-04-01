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

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.Invoice;
import org.eclipse.mdht.hl7.fhir.resources.InvoiceLineItem;
import org.eclipse.mdht.hl7.fhir.resources.InvoiceLineItemPriceComponent;
import org.eclipse.mdht.hl7.fhir.resources.InvoiceParticipant;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getCancelledReason <em>Cancelled Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getLineItems <em>Line Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getTotalPriceComponents <em>Total Price Component</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getTotalNet <em>Total Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getTotalGross <em>Total Gross</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends DomainResourceImpl implements Invoice {
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
	 * The cached value of the '{@link #getCancelledReason() <em>Cancelled Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelledReason()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String cancelledReason;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Reference recipient;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceParticipant> participants;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected Reference issuer;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Reference account;

	/**
	 * The cached value of the '{@link #getLineItems() <em>Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceLineItem> lineItems;

	/**
	 * The cached value of the '{@link #getTotalPriceComponents() <em>Total Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPriceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceLineItemPriceComponent> totalPriceComponents;

	/**
	 * The cached value of the '{@link #getTotalNet() <em>Total Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalNet()
	 * @generated
	 * @ordered
	 */
	protected Money totalNet;

	/**
	 * The cached value of the '{@link #getTotalGross() <em>Total Gross</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGross()
	 * @generated
	 * @ordered
	 */
	protected Money totalGross;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected Markdown paymentTerms;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInvoice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.INVOICE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCancelledReason() {
		return cancelledReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelledReason(org.eclipse.mdht.hl7.fhir.dataTypes.String newCancelledReason, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCancelledReason = cancelledReason;
		cancelledReason = newCancelledReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__CANCELLED_REASON, oldCancelledReason, newCancelledReason);
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
	public void setCancelledReason(org.eclipse.mdht.hl7.fhir.dataTypes.String newCancelledReason) {
		if (newCancelledReason != cancelledReason) {
			NotificationChain msgs = null;
			if (cancelledReason != null)
				msgs = ((InternalEObject)cancelledReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__CANCELLED_REASON, null, msgs);
			if (newCancelledReason != null)
				msgs = ((InternalEObject)newCancelledReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__CANCELLED_REASON, null, msgs);
			msgs = basicSetCancelledReason(newCancelledReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__CANCELLED_REASON, newCancelledReason, newCancelledReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(Reference newRecipient, NotificationChain msgs) {
		Reference oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__RECIPIENT, oldRecipient, newRecipient);
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
	public void setRecipient(Reference newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__RECIPIENT, newRecipient, newRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<InvoiceParticipant>(InvoiceParticipant.class, this, ResourcesPackage.INVOICE__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(Reference newIssuer, NotificationChain msgs) {
		Reference oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__ISSUER, oldIssuer, newIssuer);
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
	public void setIssuer(Reference newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Reference newAccount, NotificationChain msgs) {
		Reference oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__ACCOUNT, oldAccount, newAccount);
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
	public void setAccount(Reference newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject)account).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__ACCOUNT, null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__ACCOUNT, null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceLineItem> getLineItems() {
		if (lineItems == null) {
			lineItems = new EObjectContainmentEList<InvoiceLineItem>(InvoiceLineItem.class, this, ResourcesPackage.INVOICE__LINE_ITEM);
		}
		return lineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceLineItemPriceComponent> getTotalPriceComponents() {
		if (totalPriceComponents == null) {
			totalPriceComponents = new EObjectContainmentEList<InvoiceLineItemPriceComponent>(InvoiceLineItemPriceComponent.class, this, ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT);
		}
		return totalPriceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTotalNet() {
		return totalNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalNet(Money newTotalNet, NotificationChain msgs) {
		Money oldTotalNet = totalNet;
		totalNet = newTotalNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TOTAL_NET, oldTotalNet, newTotalNet);
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
	public void setTotalNet(Money newTotalNet) {
		if (newTotalNet != totalNet) {
			NotificationChain msgs = null;
			if (totalNet != null)
				msgs = ((InternalEObject)totalNet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TOTAL_NET, null, msgs);
			if (newTotalNet != null)
				msgs = ((InternalEObject)newTotalNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TOTAL_NET, null, msgs);
			msgs = basicSetTotalNet(newTotalNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TOTAL_NET, newTotalNet, newTotalNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getTotalGross() {
		return totalGross;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalGross(Money newTotalGross, NotificationChain msgs) {
		Money oldTotalGross = totalGross;
		totalGross = newTotalGross;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TOTAL_GROSS, oldTotalGross, newTotalGross);
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
	public void setTotalGross(Money newTotalGross) {
		if (newTotalGross != totalGross) {
			NotificationChain msgs = null;
			if (totalGross != null)
				msgs = ((InternalEObject)totalGross).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TOTAL_GROSS, null, msgs);
			if (newTotalGross != null)
				msgs = ((InternalEObject)newTotalGross).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__TOTAL_GROSS, null, msgs);
			msgs = basicSetTotalGross(newTotalGross, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__TOTAL_GROSS, newTotalGross, newTotalGross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentTerms(Markdown newPaymentTerms, NotificationChain msgs) {
		Markdown oldPaymentTerms = paymentTerms;
		paymentTerms = newPaymentTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__PAYMENT_TERMS, oldPaymentTerms, newPaymentTerms);
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
	public void setPaymentTerms(Markdown newPaymentTerms) {
		if (newPaymentTerms != paymentTerms) {
			NotificationChain msgs = null;
			if (paymentTerms != null)
				msgs = ((InternalEObject)paymentTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__PAYMENT_TERMS, null, msgs);
			if (newPaymentTerms != null)
				msgs = ((InternalEObject)newPaymentTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE__PAYMENT_TERMS, null, msgs);
			msgs = basicSetPaymentTerms(newPaymentTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE__PAYMENT_TERMS, newPaymentTerms, newPaymentTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.INVOICE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INVOICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INVOICE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.INVOICE__CANCELLED_REASON:
				return basicSetCancelledReason(null, msgs);
			case ResourcesPackage.INVOICE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.INVOICE__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.INVOICE__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case ResourcesPackage.INVOICE__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.INVOICE__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INVOICE__ISSUER:
				return basicSetIssuer(null, msgs);
			case ResourcesPackage.INVOICE__ACCOUNT:
				return basicSetAccount(null, msgs);
			case ResourcesPackage.INVOICE__LINE_ITEM:
				return ((InternalEList<?>)getLineItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return ((InternalEList<?>)getTotalPriceComponents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INVOICE__TOTAL_NET:
				return basicSetTotalNet(null, msgs);
			case ResourcesPackage.INVOICE__TOTAL_GROSS:
				return basicSetTotalGross(null, msgs);
			case ResourcesPackage.INVOICE__PAYMENT_TERMS:
				return basicSetPaymentTerms(null, msgs);
			case ResourcesPackage.INVOICE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INVOICE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.INVOICE__STATUS:
				return getStatus();
			case ResourcesPackage.INVOICE__CANCELLED_REASON:
				return getCancelledReason();
			case ResourcesPackage.INVOICE__TYPE:
				return getType();
			case ResourcesPackage.INVOICE__SUBJECT:
				return getSubject();
			case ResourcesPackage.INVOICE__RECIPIENT:
				return getRecipient();
			case ResourcesPackage.INVOICE__DATE:
				return getDate();
			case ResourcesPackage.INVOICE__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.INVOICE__ISSUER:
				return getIssuer();
			case ResourcesPackage.INVOICE__ACCOUNT:
				return getAccount();
			case ResourcesPackage.INVOICE__LINE_ITEM:
				return getLineItems();
			case ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return getTotalPriceComponents();
			case ResourcesPackage.INVOICE__TOTAL_NET:
				return getTotalNet();
			case ResourcesPackage.INVOICE__TOTAL_GROSS:
				return getTotalGross();
			case ResourcesPackage.INVOICE__PAYMENT_TERMS:
				return getPaymentTerms();
			case ResourcesPackage.INVOICE__NOTE:
				return getNotes();
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
			case ResourcesPackage.INVOICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.INVOICE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.INVOICE__CANCELLED_REASON:
				setCancelledReason((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.INVOICE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INVOICE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.INVOICE__RECIPIENT:
				setRecipient((Reference)newValue);
				return;
			case ResourcesPackage.INVOICE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.INVOICE__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends InvoiceParticipant>)newValue);
				return;
			case ResourcesPackage.INVOICE__ISSUER:
				setIssuer((Reference)newValue);
				return;
			case ResourcesPackage.INVOICE__ACCOUNT:
				setAccount((Reference)newValue);
				return;
			case ResourcesPackage.INVOICE__LINE_ITEM:
				getLineItems().clear();
				getLineItems().addAll((Collection<? extends InvoiceLineItem>)newValue);
				return;
			case ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				getTotalPriceComponents().clear();
				getTotalPriceComponents().addAll((Collection<? extends InvoiceLineItemPriceComponent>)newValue);
				return;
			case ResourcesPackage.INVOICE__TOTAL_NET:
				setTotalNet((Money)newValue);
				return;
			case ResourcesPackage.INVOICE__TOTAL_GROSS:
				setTotalGross((Money)newValue);
				return;
			case ResourcesPackage.INVOICE__PAYMENT_TERMS:
				setPaymentTerms((Markdown)newValue);
				return;
			case ResourcesPackage.INVOICE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.INVOICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.INVOICE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.INVOICE__CANCELLED_REASON:
				setCancelledReason((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.INVOICE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.INVOICE__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.INVOICE__RECIPIENT:
				setRecipient((Reference)null);
				return;
			case ResourcesPackage.INVOICE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.INVOICE__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.INVOICE__ISSUER:
				setIssuer((Reference)null);
				return;
			case ResourcesPackage.INVOICE__ACCOUNT:
				setAccount((Reference)null);
				return;
			case ResourcesPackage.INVOICE__LINE_ITEM:
				getLineItems().clear();
				return;
			case ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				getTotalPriceComponents().clear();
				return;
			case ResourcesPackage.INVOICE__TOTAL_NET:
				setTotalNet((Money)null);
				return;
			case ResourcesPackage.INVOICE__TOTAL_GROSS:
				setTotalGross((Money)null);
				return;
			case ResourcesPackage.INVOICE__PAYMENT_TERMS:
				setPaymentTerms((Markdown)null);
				return;
			case ResourcesPackage.INVOICE__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.INVOICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.INVOICE__STATUS:
				return status != null;
			case ResourcesPackage.INVOICE__CANCELLED_REASON:
				return cancelledReason != null;
			case ResourcesPackage.INVOICE__TYPE:
				return type != null;
			case ResourcesPackage.INVOICE__SUBJECT:
				return subject != null;
			case ResourcesPackage.INVOICE__RECIPIENT:
				return recipient != null;
			case ResourcesPackage.INVOICE__DATE:
				return date != null;
			case ResourcesPackage.INVOICE__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.INVOICE__ISSUER:
				return issuer != null;
			case ResourcesPackage.INVOICE__ACCOUNT:
				return account != null;
			case ResourcesPackage.INVOICE__LINE_ITEM:
				return lineItems != null && !lineItems.isEmpty();
			case ResourcesPackage.INVOICE__TOTAL_PRICE_COMPONENT:
				return totalPriceComponents != null && !totalPriceComponents.isEmpty();
			case ResourcesPackage.INVOICE__TOTAL_NET:
				return totalNet != null;
			case ResourcesPackage.INVOICE__TOTAL_GROSS:
				return totalGross != null;
			case ResourcesPackage.INVOICE__PAYMENT_TERMS:
				return paymentTerms != null;
			case ResourcesPackage.INVOICE__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvoiceImpl
