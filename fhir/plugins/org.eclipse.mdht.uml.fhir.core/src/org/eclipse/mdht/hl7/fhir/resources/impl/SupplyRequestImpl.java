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
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SupplyRequest;
import org.eclipse.mdht.hl7.fhir.resources.SupplyRequestParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getItemx <em>Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getDeliverFrom <em>Deliver From</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyRequestImpl#getDeliverTo <em>Deliver To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyRequestImpl extends DomainResourceImpl implements SupplyRequest {
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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getItemx() <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemx()
	 * @generated
	 * @ordered
	 */
	protected DataType itemx;

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
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplyRequestParameter> parameters;

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
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getSuppliers() <em>Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> suppliers;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getDeliverFrom() <em>Deliver From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverFrom()
	 * @generated
	 * @ordered
	 */
	protected Reference deliverFrom;

	/**
	 * The cached value of the '{@link #getDeliverTo() <em>Deliver To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverTo()
	 * @generated
	 * @ordered
	 */
	protected Reference deliverTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSupplyRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getItemx() {
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemx(DataType newItemx, NotificationChain msgs) {
		DataType oldItemx = itemx;
		itemx = newItemx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__ITEMX, oldItemx, newItemx);
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
	public void setItemx(DataType newItemx) {
		if (newItemx != itemx) {
			NotificationChain msgs = null;
			if (itemx != null)
				msgs = ((InternalEObject)itemx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__ITEMX, null, msgs);
			if (newItemx != null)
				msgs = ((InternalEObject)newItemx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__ITEMX, null, msgs);
			msgs = basicSetItemx(newItemx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__ITEMX, newItemx, newItemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplyRequestParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<SupplyRequestParameter>(SupplyRequestParameter.class, this, ResourcesPackage.SUPPLY_REQUEST__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX, oldOccurrencex, newOccurrencex);
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
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
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
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__REQUESTER, oldRequester, newRequester);
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
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUPPLY_REQUEST__SUPPLIER);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SUPPLY_REQUEST__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDeliverFrom() {
		return deliverFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverFrom(Reference newDeliverFrom, NotificationChain msgs) {
		Reference oldDeliverFrom = deliverFrom;
		deliverFrom = newDeliverFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM, oldDeliverFrom, newDeliverFrom);
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
	public void setDeliverFrom(Reference newDeliverFrom) {
		if (newDeliverFrom != deliverFrom) {
			NotificationChain msgs = null;
			if (deliverFrom != null)
				msgs = ((InternalEObject)deliverFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM, null, msgs);
			if (newDeliverFrom != null)
				msgs = ((InternalEObject)newDeliverFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM, null, msgs);
			msgs = basicSetDeliverFrom(newDeliverFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM, newDeliverFrom, newDeliverFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDeliverTo() {
		return deliverTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverTo(Reference newDeliverTo, NotificationChain msgs) {
		Reference oldDeliverTo = deliverTo;
		deliverTo = newDeliverTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO, oldDeliverTo, newDeliverTo);
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
	public void setDeliverTo(Reference newDeliverTo) {
		if (newDeliverTo != deliverTo) {
			NotificationChain msgs = null;
			if (deliverTo != null)
				msgs = ((InternalEObject)deliverTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO, null, msgs);
			if (newDeliverTo != null)
				msgs = ((InternalEObject)newDeliverTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO, null, msgs);
			msgs = basicSetDeliverTo(newDeliverTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO, newDeliverTo, newDeliverTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__ITEMX:
				return basicSetItemx(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__SUPPLIER:
				return ((InternalEList<?>)getSuppliers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return basicSetDeliverFrom(null, msgs);
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO:
				return basicSetDeliverTo(null, msgs);
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
			case ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SUPPLY_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.SUPPLY_REQUEST__CATEGORY:
				return getCategory();
			case ResourcesPackage.SUPPLY_REQUEST__PRIORITY:
				return getPriority();
			case ResourcesPackage.SUPPLY_REQUEST__ITEMX:
				return getItemx();
			case ResourcesPackage.SUPPLY_REQUEST__QUANTITY:
				return getQuantity();
			case ResourcesPackage.SUPPLY_REQUEST__PARAMETER:
				return getParameters();
			case ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case ResourcesPackage.SUPPLY_REQUEST__REQUESTER:
				return getRequester();
			case ResourcesPackage.SUPPLY_REQUEST__SUPPLIER:
				return getSuppliers();
			case ResourcesPackage.SUPPLY_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return getDeliverFrom();
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO:
				return getDeliverTo();
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
			case ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__ITEMX:
				setItemx((DataType)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SupplyRequestParameter>)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM:
				setDeliverFrom((Reference)newValue);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO:
				setDeliverTo((Reference)newValue);
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
			case ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SUPPLY_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__ITEMX:
				setItemx((DataType)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__SUPPLIER:
				getSuppliers().clear();
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM:
				setDeliverFrom((Reference)null);
				return;
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO:
				setDeliverTo((Reference)null);
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
			case ResourcesPackage.SUPPLY_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SUPPLY_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.SUPPLY_REQUEST__CATEGORY:
				return category != null;
			case ResourcesPackage.SUPPLY_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.SUPPLY_REQUEST__ITEMX:
				return itemx != null;
			case ResourcesPackage.SUPPLY_REQUEST__QUANTITY:
				return quantity != null;
			case ResourcesPackage.SUPPLY_REQUEST__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.SUPPLY_REQUEST__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.SUPPLY_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.SUPPLY_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.SUPPLY_REQUEST__SUPPLIER:
				return suppliers != null && !suppliers.isEmpty();
			case ResourcesPackage.SUPPLY_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.SUPPLY_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_FROM:
				return deliverFrom != null;
			case ResourcesPackage.SUPPLY_REQUEST__DELIVER_TO:
				return deliverTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyRequestImpl
