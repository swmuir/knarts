/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.ClaimResponse;
import fhiRCore.resources.ClaimResponseAddedItem;
import fhiRCore.resources.ClaimResponseError;
import fhiRCore.resources.ClaimResponseInsurance;
import fhiRCore.resources.ClaimResponseItem;
import fhiRCore.resources.ClaimResponseItemAdjudication;
import fhiRCore.resources.ClaimResponseNote;
import fhiRCore.resources.ClaimResponsePayment;
import fhiRCore.resources.ClaimResponseTotal;
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
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getPreAuthPeriod <em>Pre Auth Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getItems <em>Item</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getTotals <em>Total</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getProcessNotes <em>Process Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getCommunicationRequests <em>Communication Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimResponseImpl#getErrors <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

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
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected Reference requestor;

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
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String disposition;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String preAuthRef;

	/**
	 * The cached value of the '{@link #getPreAuthPeriod() <em>Pre Auth Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period preAuthPeriod;

	/**
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept payeeType;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItem> items;

	/**
	 * The cached value of the '{@link #getAddItems() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItem> addItems;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getTotals() <em>Total</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotals()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseTotal> totals;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponsePayment payment;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundsReserve;

	/**
	 * The cached value of the '{@link #getFormCode() <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept formCode;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Attachment form;

	/**
	 * The cached value of the '{@link #getProcessNotes() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseNote> processNotes;

	/**
	 * The cached value of the '{@link #getCommunicationRequests() <em>Communication Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> communicationRequests;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseInsurance> insurances;

	/**
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseError> errors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE, oldSubType, newSubType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE, newSubType, newSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Code newUse, NotificationChain msgs) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__USE, newUse, newUse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__INSURER, oldInsurer, newInsurer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(Reference newRequestor, NotificationChain msgs) {
		Reference oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUESTOR, oldRequestor, newRequestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(Reference newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Code newOutcome, NotificationChain msgs) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(fhiRCore.dataTypes.String newDisposition, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(fhiRCore.dataTypes.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPreAuthRef() {
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthRef(fhiRCore.dataTypes.String newPreAuthRef, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPreAuthRef = preAuthRef;
		preAuthRef = newPreAuthRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF, oldPreAuthRef, newPreAuthRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAuthRef(fhiRCore.dataTypes.String newPreAuthRef) {
		if (newPreAuthRef != preAuthRef) {
			NotificationChain msgs = null;
			if (preAuthRef != null)
				msgs = ((InternalEObject)preAuthRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF, null, msgs);
			if (newPreAuthRef != null)
				msgs = ((InternalEObject)newPreAuthRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF, null, msgs);
			msgs = basicSetPreAuthRef(newPreAuthRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF, newPreAuthRef, newPreAuthRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPreAuthPeriod() {
		return preAuthPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthPeriod(Period newPreAuthPeriod, NotificationChain msgs) {
		Period oldPreAuthPeriod = preAuthPeriod;
		preAuthPeriod = newPreAuthPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, oldPreAuthPeriod, newPreAuthPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAuthPeriod(Period newPreAuthPeriod) {
		if (newPreAuthPeriod != preAuthPeriod) {
			NotificationChain msgs = null;
			if (preAuthPeriod != null)
				msgs = ((InternalEObject)preAuthPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, null, msgs);
			if (newPreAuthPeriod != null)
				msgs = ((InternalEObject)newPreAuthPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, null, msgs);
			msgs = basicSetPreAuthPeriod(newPreAuthPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD, newPreAuthPeriod, newPreAuthPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeType(CodeableConcept newPayeeType, NotificationChain msgs) {
		CodeableConcept oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, newPayeeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeType(CodeableConcept newPayeeType) {
		if (newPayeeType != payeeType) {
			NotificationChain msgs = null;
			if (payeeType != null)
				msgs = ((InternalEObject)payeeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			if (newPayeeType != null)
				msgs = ((InternalEObject)newPayeeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			msgs = basicSetPayeeType(newPayeeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE, newPayeeType, newPayeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ClaimResponseItem>(ClaimResponseItem.class, this, ResourcesPackage.CLAIM_RESPONSE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItem> getAddItems() {
		if (addItems == null) {
			addItems = new EObjectContainmentEList<ClaimResponseAddedItem>(ClaimResponseAddedItem.class, this, ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ClaimResponseItemAdjudication>(ClaimResponseItemAdjudication.class, this, ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseTotal> getTotals() {
		if (totals == null) {
			totals = new EObjectContainmentEList<ClaimResponseTotal>(ClaimResponseTotal.class, this, ResourcesPackage.CLAIM_RESPONSE__TOTAL);
		}
		return totals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ClaimResponsePayment newPayment, NotificationChain msgs) {
		ClaimResponsePayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(ClaimResponsePayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserve(CodeableConcept newFundsReserve, NotificationChain msgs) {
		CodeableConcept oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundsReserve(CodeableConcept newFundsReserve) {
		if (newFundsReserve != fundsReserve) {
			NotificationChain msgs = null;
			if (fundsReserve != null)
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFormCode() {
		return formCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormCode(CodeableConcept newFormCode, NotificationChain msgs) {
		CodeableConcept oldFormCode = formCode;
		formCode = newFormCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FORM_CODE, oldFormCode, newFormCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormCode(CodeableConcept newFormCode) {
		if (newFormCode != formCode) {
			NotificationChain msgs = null;
			if (formCode != null)
				msgs = ((InternalEObject)formCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FORM_CODE, null, msgs);
			if (newFormCode != null)
				msgs = ((InternalEObject)newFormCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FORM_CODE, null, msgs);
			msgs = basicSetFormCode(newFormCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FORM_CODE, newFormCode, newFormCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Attachment newForm, NotificationChain msgs) {
		Attachment oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Attachment newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseNote> getProcessNotes() {
		if (processNotes == null) {
			processNotes = new EObjectContainmentEList<ClaimResponseNote>(ClaimResponseNote.class, this, ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE);
		}
		return processNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCommunicationRequests() {
		if (communicationRequests == null) {
			communicationRequests = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<ClaimResponseInsurance>(ClaimResponseInsurance.class, this, ResourcesPackage.CLAIM_RESPONSE__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseError> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<ClaimResponseError>(ClaimResponseError.class, this, ResourcesPackage.CLAIM_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__USE:
				return basicSetUse(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				return basicSetInsurer(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return basicSetPreAuthRef(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return basicSetPreAuthPeriod(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return basicSetPayeeType(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL:
				return ((InternalEList<?>)getTotals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return basicSetPayment(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__FORM_CODE:
				return basicSetFormCode(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return ((InternalEList<?>)getCommunicationRequests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				return getStatus();
			case ResourcesPackage.CLAIM_RESPONSE__TYPE:
				return getType();
			case ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE:
				return getSubType();
			case ResourcesPackage.CLAIM_RESPONSE__USE:
				return getUse();
			case ResourcesPackage.CLAIM_RESPONSE__PATIENT:
				return getPatient();
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				return getCreated();
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				return getInsurer();
			case ResourcesPackage.CLAIM_RESPONSE__REQUESTOR:
				return getRequestor();
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				return getRequest();
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				return getOutcome();
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				return getDisposition();
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return getPreAuthRef();
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return getPreAuthPeriod();
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return getPayeeType();
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return getItems();
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItems();
			case ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL:
				return getTotals();
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return getPayment();
			case ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return getFundsReserve();
			case ResourcesPackage.CLAIM_RESPONSE__FORM_CODE:
				return getFormCode();
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				return getForm();
			case ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return getProcessNotes();
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequests();
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return getInsurances();
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return getErrors();
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__USE:
				setUse((Code)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ClaimResponseItem>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				getAddItems().addAll((Collection<? extends ClaimResponseAddedItem>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseItemAdjudication>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL:
				getTotals().clear();
				getTotals().addAll((Collection<? extends ClaimResponseTotal>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM_CODE:
				setFormCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				setForm((Attachment)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNotes().clear();
				getProcessNotes().addAll((Collection<? extends ClaimResponseNote>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
				getCommunicationRequests().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends ClaimResponseInsurance>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends ClaimResponseError>)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__USE:
				setUse((Code)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				setPreAuthPeriod((Period)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL:
				getTotals().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM_CODE:
				setFormCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				setForm((Attachment)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNotes().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
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
			case ResourcesPackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.CLAIM_RESPONSE__TYPE:
				return type != null;
			case ResourcesPackage.CLAIM_RESPONSE__SUB_TYPE:
				return subType != null;
			case ResourcesPackage.CLAIM_RESPONSE__USE:
				return use != null;
			case ResourcesPackage.CLAIM_RESPONSE__PATIENT:
				return patient != null;
			case ResourcesPackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case ResourcesPackage.CLAIM_RESPONSE__INSURER:
				return insurer != null;
			case ResourcesPackage.CLAIM_RESPONSE__REQUESTOR:
				return requestor != null;
			case ResourcesPackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case ResourcesPackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_REF:
				return preAuthRef != null;
			case ResourcesPackage.CLAIM_RESPONSE__PRE_AUTH_PERIOD:
				return preAuthPeriod != null;
			case ResourcesPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case ResourcesPackage.CLAIM_RESPONSE__ITEM:
				return items != null && !items.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItems != null && !addItems.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__TOTAL:
				return totals != null && !totals.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__PAYMENT:
				return payment != null;
			case ResourcesPackage.CLAIM_RESPONSE__FUNDS_RESERVE:
				return fundsReserve != null;
			case ResourcesPackage.CLAIM_RESPONSE__FORM_CODE:
				return formCode != null;
			case ResourcesPackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case ResourcesPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return processNotes != null && !processNotes.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequests != null && !communicationRequests.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl
