/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.ChargeItem;
import fhiRCore.resources.ChargeItemDefinition;
import fhiRCore.resources.ChargeItemPerformer;
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
 * An implementation of the model object '<em><b>Charge Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getDefinitionUris <em>Definition Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getDefinitionCanonicals <em>Definition Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getPerformingOrganization <em>Performing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getRequestingOrganization <em>Requesting Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getCostCenter <em>Cost Center</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getBodysites <em>Bodysite</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getFactorOverride <em>Factor Override</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getPriceOverride <em>Price Override</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getOverrideReason <em>Override Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getEnteredDate <em>Entered Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getServices <em>Service</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getProductx <em>Productx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getAccounts <em>Account</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ChargeItemImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeItemImpl extends DomainResourceImpl implements ChargeItem {
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
	 * The cached value of the '{@link #getDefinitionUris() <em>Definition Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionUris()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> definitionUris;

	/**
	 * The cached value of the '{@link #getDefinitionCanonicals() <em>Definition Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemDefinition> definitionCanonicals;

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
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeItemPerformer> performers;

	/**
	 * The cached value of the '{@link #getPerformingOrganization() <em>Performing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference performingOrganization;

	/**
	 * The cached value of the '{@link #getRequestingOrganization() <em>Requesting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference requestingOrganization;

	/**
	 * The cached value of the '{@link #getCostCenter() <em>Cost Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCenter()
	 * @generated
	 * @ordered
	 */
	protected Reference costCenter;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getBodysites() <em>Bodysite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodysites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodysites;

	/**
	 * The cached value of the '{@link #getFactorOverride() <em>Factor Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOverride()
	 * @generated
	 * @ordered
	 */
	protected Decimal factorOverride;

	/**
	 * The cached value of the '{@link #getPriceOverride() <em>Price Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceOverride()
	 * @generated
	 * @ordered
	 */
	protected Money priceOverride;

	/**
	 * The cached value of the '{@link #getOverrideReason() <em>Override Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideReason()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String overrideReason;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getEnteredDate() <em>Entered Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteredDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime enteredDate;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getServices() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> services;

	/**
	 * The cached value of the '{@link #getProductx() <em>Productx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductx()
	 * @generated
	 * @ordered
	 */
	protected DataType productx;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> accounts;

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
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getChargeItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CHARGE_ITEM__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getDefinitionUris() {
		if (definitionUris == null) {
			definitionUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.CHARGE_ITEM__DEFINITION_URI);
		}
		return definitionUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeItemDefinition> getDefinitionCanonicals() {
		if (definitionCanonicals == null) {
			definitionCanonicals = new EObjectContainmentEList<ChargeItemDefinition>(ChargeItemDefinition.class, this, ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL);
		}
		return definitionCanonicals;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CHARGE_ITEM__PART_OF);
		}
		return partOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeItemPerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ChargeItemPerformer>(ChargeItemPerformer.class, this, ResourcesPackage.CHARGE_ITEM__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformingOrganization() {
		return performingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformingOrganization(Reference newPerformingOrganization, NotificationChain msgs) {
		Reference oldPerformingOrganization = performingOrganization;
		performingOrganization = newPerformingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, oldPerformingOrganization, newPerformingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformingOrganization(Reference newPerformingOrganization) {
		if (newPerformingOrganization != performingOrganization) {
			NotificationChain msgs = null;
			if (performingOrganization != null)
				msgs = ((InternalEObject)performingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, null, msgs);
			if (newPerformingOrganization != null)
				msgs = ((InternalEObject)newPerformingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, null, msgs);
			msgs = basicSetPerformingOrganization(newPerformingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION, newPerformingOrganization, newPerformingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestingOrganization() {
		return requestingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestingOrganization(Reference newRequestingOrganization, NotificationChain msgs) {
		Reference oldRequestingOrganization = requestingOrganization;
		requestingOrganization = newRequestingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, oldRequestingOrganization, newRequestingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestingOrganization(Reference newRequestingOrganization) {
		if (newRequestingOrganization != requestingOrganization) {
			NotificationChain msgs = null;
			if (requestingOrganization != null)
				msgs = ((InternalEObject)requestingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, null, msgs);
			if (newRequestingOrganization != null)
				msgs = ((InternalEObject)newRequestingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, null, msgs);
			msgs = basicSetRequestingOrganization(newRequestingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION, newRequestingOrganization, newRequestingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCostCenter() {
		return costCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostCenter(Reference newCostCenter, NotificationChain msgs) {
		Reference oldCostCenter = costCenter;
		costCenter = newCostCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__COST_CENTER, oldCostCenter, newCostCenter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostCenter(Reference newCostCenter) {
		if (newCostCenter != costCenter) {
			NotificationChain msgs = null;
			if (costCenter != null)
				msgs = ((InternalEObject)costCenter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__COST_CENTER, null, msgs);
			if (newCostCenter != null)
				msgs = ((InternalEObject)newCostCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__COST_CENTER, null, msgs);
			msgs = basicSetCostCenter(newCostCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__COST_CENTER, newCostCenter, newCostCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodysites() {
		if (bodysites == null) {
			bodysites = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CHARGE_ITEM__BODYSITE);
		}
		return bodysites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactorOverride() {
		return factorOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactorOverride(Decimal newFactorOverride, NotificationChain msgs) {
		Decimal oldFactorOverride = factorOverride;
		factorOverride = newFactorOverride;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE, oldFactorOverride, newFactorOverride);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactorOverride(Decimal newFactorOverride) {
		if (newFactorOverride != factorOverride) {
			NotificationChain msgs = null;
			if (factorOverride != null)
				msgs = ((InternalEObject)factorOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE, null, msgs);
			if (newFactorOverride != null)
				msgs = ((InternalEObject)newFactorOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE, null, msgs);
			msgs = basicSetFactorOverride(newFactorOverride, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE, newFactorOverride, newFactorOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPriceOverride() {
		return priceOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriceOverride(Money newPriceOverride, NotificationChain msgs) {
		Money oldPriceOverride = priceOverride;
		priceOverride = newPriceOverride;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE, oldPriceOverride, newPriceOverride);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceOverride(Money newPriceOverride) {
		if (newPriceOverride != priceOverride) {
			NotificationChain msgs = null;
			if (priceOverride != null)
				msgs = ((InternalEObject)priceOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE, null, msgs);
			if (newPriceOverride != null)
				msgs = ((InternalEObject)newPriceOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE, null, msgs);
			msgs = basicSetPriceOverride(newPriceOverride, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE, newPriceOverride, newPriceOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getOverrideReason() {
		return overrideReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrideReason(fhiRCore.dataTypes.String newOverrideReason, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldOverrideReason = overrideReason;
		overrideReason = newOverrideReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON, oldOverrideReason, newOverrideReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideReason(fhiRCore.dataTypes.String newOverrideReason) {
		if (newOverrideReason != overrideReason) {
			NotificationChain msgs = null;
			if (overrideReason != null)
				msgs = ((InternalEObject)overrideReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON, null, msgs);
			if (newOverrideReason != null)
				msgs = ((InternalEObject)newOverrideReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON, null, msgs);
			msgs = basicSetOverrideReason(newOverrideReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON, newOverrideReason, newOverrideReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__ENTERER, oldEnterer, newEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEnteredDate() {
		return enteredDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteredDate(DateTime newEnteredDate, NotificationChain msgs) {
		DateTime oldEnteredDate = enteredDate;
		enteredDate = newEnteredDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__ENTERED_DATE, oldEnteredDate, newEnteredDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteredDate(DateTime newEnteredDate) {
		if (newEnteredDate != enteredDate) {
			NotificationChain msgs = null;
			if (enteredDate != null)
				msgs = ((InternalEObject)enteredDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__ENTERED_DATE, null, msgs);
			if (newEnteredDate != null)
				msgs = ((InternalEObject)newEnteredDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__ENTERED_DATE, null, msgs);
			msgs = basicSetEnteredDate(newEnteredDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__ENTERED_DATE, newEnteredDate, newEnteredDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CHARGE_ITEM__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CHARGE_ITEM__SERVICE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProductx() {
		return productx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductx(DataType newProductx, NotificationChain msgs) {
		DataType oldProductx = productx;
		productx = newProductx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PRODUCTX, oldProductx, newProductx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductx(DataType newProductx) {
		if (newProductx != productx) {
			NotificationChain msgs = null;
			if (productx != null)
				msgs = ((InternalEObject)productx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PRODUCTX, null, msgs);
			if (newProductx != null)
				msgs = ((InternalEObject)newProductx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CHARGE_ITEM__PRODUCTX, null, msgs);
			msgs = basicSetProductx(newProductx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CHARGE_ITEM__PRODUCTX, newProductx, newProductx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CHARGE_ITEM__ACCOUNT);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.CHARGE_ITEM__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CHARGE_ITEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_URI:
				return ((InternalEList<?>)getDefinitionUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return ((InternalEList<?>)getDefinitionCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return basicSetPerformingOrganization(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return basicSetRequestingOrganization(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__COST_CENTER:
				return basicSetCostCenter(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__BODYSITE:
				return ((InternalEList<?>)getBodysites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return basicSetFactorOverride(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return basicSetPriceOverride(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return basicSetOverrideReason(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__ENTERER:
				return basicSetEnterer(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__ENTERED_DATE:
				return basicSetEnteredDate(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__REASON:
				return ((InternalEList<?>)getReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__SERVICE:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__PRODUCTX:
				return basicSetProductx(null, msgs);
			case ResourcesPackage.CHARGE_ITEM__ACCOUNT:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CHARGE_ITEM__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_URI:
				return getDefinitionUris();
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return getDefinitionCanonicals();
			case ResourcesPackage.CHARGE_ITEM__STATUS:
				return getStatus();
			case ResourcesPackage.CHARGE_ITEM__PART_OF:
				return getPartOfs();
			case ResourcesPackage.CHARGE_ITEM__CODE:
				return getCode();
			case ResourcesPackage.CHARGE_ITEM__SUBJECT:
				return getSubject();
			case ResourcesPackage.CHARGE_ITEM__CONTEXT:
				return getContext();
			case ResourcesPackage.CHARGE_ITEM__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.CHARGE_ITEM__PERFORMER:
				return getPerformers();
			case ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return getPerformingOrganization();
			case ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return getRequestingOrganization();
			case ResourcesPackage.CHARGE_ITEM__COST_CENTER:
				return getCostCenter();
			case ResourcesPackage.CHARGE_ITEM__QUANTITY:
				return getQuantity();
			case ResourcesPackage.CHARGE_ITEM__BODYSITE:
				return getBodysites();
			case ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return getFactorOverride();
			case ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return getPriceOverride();
			case ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return getOverrideReason();
			case ResourcesPackage.CHARGE_ITEM__ENTERER:
				return getEnterer();
			case ResourcesPackage.CHARGE_ITEM__ENTERED_DATE:
				return getEnteredDate();
			case ResourcesPackage.CHARGE_ITEM__REASON:
				return getReasons();
			case ResourcesPackage.CHARGE_ITEM__SERVICE:
				return getServices();
			case ResourcesPackage.CHARGE_ITEM__PRODUCTX:
				return getProductx();
			case ResourcesPackage.CHARGE_ITEM__ACCOUNT:
				return getAccounts();
			case ResourcesPackage.CHARGE_ITEM__NOTE:
				return getNotes();
			case ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return getSupportingInformations();
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
			case ResourcesPackage.CHARGE_ITEM__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_URI:
				getDefinitionUris().clear();
				getDefinitionUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				getDefinitionCanonicals().clear();
				getDefinitionCanonicals().addAll((Collection<? extends ChargeItemDefinition>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__CONTEXT:
				setContext((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ChargeItemPerformer>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				setPerformingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				setRequestingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__COST_CENTER:
				setCostCenter((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__BODYSITE:
				getBodysites().clear();
				getBodysites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				setFactorOverride((Decimal)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				setPriceOverride((Money)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON:
				setOverrideReason((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__ENTERED_DATE:
				setEnteredDate((DateTime)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__SERVICE:
				getServices().clear();
				getServices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__PRODUCTX:
				setProductx((DataType)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__ACCOUNT:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.CHARGE_ITEM__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_URI:
				getDefinitionUris().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				getDefinitionCanonicals().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__CONTEXT:
				setContext((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				setPerformingOrganization((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				setRequestingOrganization((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__COST_CENTER:
				setCostCenter((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__BODYSITE:
				getBodysites().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				setFactorOverride((Decimal)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				setPriceOverride((Money)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON:
				setOverrideReason((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__ENTERER:
				setEnterer((Reference)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__ENTERED_DATE:
				setEnteredDate((DateTime)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__SERVICE:
				getServices().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__PRODUCTX:
				setProductx((DataType)null);
				return;
			case ResourcesPackage.CHARGE_ITEM__ACCOUNT:
				getAccounts().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
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
			case ResourcesPackage.CHARGE_ITEM__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_URI:
				return definitionUris != null && !definitionUris.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__DEFINITION_CANONICAL:
				return definitionCanonicals != null && !definitionCanonicals.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__STATUS:
				return status != null;
			case ResourcesPackage.CHARGE_ITEM__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__CODE:
				return code != null;
			case ResourcesPackage.CHARGE_ITEM__SUBJECT:
				return subject != null;
			case ResourcesPackage.CHARGE_ITEM__CONTEXT:
				return context != null;
			case ResourcesPackage.CHARGE_ITEM__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.CHARGE_ITEM__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__PERFORMING_ORGANIZATION:
				return performingOrganization != null;
			case ResourcesPackage.CHARGE_ITEM__REQUESTING_ORGANIZATION:
				return requestingOrganization != null;
			case ResourcesPackage.CHARGE_ITEM__COST_CENTER:
				return costCenter != null;
			case ResourcesPackage.CHARGE_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CHARGE_ITEM__BODYSITE:
				return bodysites != null && !bodysites.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__FACTOR_OVERRIDE:
				return factorOverride != null;
			case ResourcesPackage.CHARGE_ITEM__PRICE_OVERRIDE:
				return priceOverride != null;
			case ResourcesPackage.CHARGE_ITEM__OVERRIDE_REASON:
				return overrideReason != null;
			case ResourcesPackage.CHARGE_ITEM__ENTERER:
				return enterer != null;
			case ResourcesPackage.CHARGE_ITEM__ENTERED_DATE:
				return enteredDate != null;
			case ResourcesPackage.CHARGE_ITEM__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__SERVICE:
				return services != null && !services.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__PRODUCTX:
				return productx != null;
			case ResourcesPackage.CHARGE_ITEM__ACCOUNT:
				return accounts != null && !accounts.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.CHARGE_ITEM__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChargeItemImpl
