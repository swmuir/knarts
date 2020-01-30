/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTermContractAssetValuedItem;
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
 * An implementation of the model object '<em><b>Contract Term Contract Asset Valued Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getEntityx <em>Entityx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractAssetValuedItemImpl#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermContractAssetValuedItemImpl extends BackboneElementImpl implements ContractTermContractAssetValuedItem {
	/**
	 * The cached value of the '{@link #getEntityx() <em>Entityx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityx()
	 * @generated
	 * @ordered
	 */
	protected DataType entityx;

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
	 * The cached value of the '{@link #getEffectiveTime() <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveTime;

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
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String payment;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime paymentDate;

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
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected Reference recipient;

	/**
	 * The cached value of the '{@link #getLinkIds() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> linkIds;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumbers() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermContractAssetValuedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermContractAssetValuedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEntityx() {
		return entityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityx(DataType newEntityx, NotificationChain msgs) {
		DataType oldEntityx = entityx;
		entityx = newEntityx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX, oldEntityx, newEntityx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityx(DataType newEntityx) {
		if (newEntityx != entityx) {
			NotificationChain msgs = null;
			if (entityx != null)
				msgs = ((InternalEObject)entityx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX, null, msgs);
			if (newEntityx != null)
				msgs = ((InternalEObject)newEntityx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX, null, msgs);
			msgs = basicSetEntityx(newEntityx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX, newEntityx, newEntityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveTime(DateTime newEffectiveTime, NotificationChain msgs) {
		DateTime oldEffectiveTime = effectiveTime;
		effectiveTime = newEffectiveTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME, oldEffectiveTime, newEffectiveTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveTime(DateTime newEffectiveTime) {
		if (newEffectiveTime != effectiveTime) {
			NotificationChain msgs = null;
			if (effectiveTime != null)
				msgs = ((InternalEObject)effectiveTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME, null, msgs);
			if (newEffectiveTime != null)
				msgs = ((InternalEObject)newEffectiveTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME, null, msgs);
			msgs = basicSetEffectiveTime(newEffectiveTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME, newEffectiveTime, newEffectiveTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(Decimal newPoints, NotificationChain msgs) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(fhiRCore.dataTypes.String newPayment, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(fhiRCore.dataTypes.String newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDate(DateTime newPaymentDate, NotificationChain msgs) {
		DateTime oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE, oldPaymentDate, newPaymentDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(DateTime newPaymentDate) {
		if (newPaymentDate != paymentDate) {
			NotificationChain msgs = null;
			if (paymentDate != null)
				msgs = ((InternalEObject)paymentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE, null, msgs);
			if (newPaymentDate != null)
				msgs = ((InternalEObject)newPaymentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE, null, msgs);
			msgs = basicSetPaymentDate(newPaymentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE, newPaymentDate, newPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE, oldResponsible, newResponsible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(Reference newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT, newRecipient, newRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getLinkIds() {
		if (linkIds == null) {
			linkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID);
		}
		return linkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getSecurityLabelNumbers() {
		if (securityLabelNumbers == null) {
			securityLabelNumbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX:
				return basicSetEntityx(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME:
				return basicSetEffectiveTime(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS:
				return basicSetPoints(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET:
				return basicSetNet(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT:
				return basicSetPayment(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE:
				return basicSetPaymentDate(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID:
				return ((InternalEList<?>)getLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumbers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX:
				return getEntityx();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME:
				return getEffectiveTime();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY:
				return getQuantity();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR:
				return getFactor();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS:
				return getPoints();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET:
				return getNet();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT:
				return getPayment();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE:
				return getPaymentDate();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE:
				return getResponsible();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT:
				return getRecipient();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID:
				return getLinkIds();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumbers();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX:
				setEntityx((DataType)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS:
				setPoints((Decimal)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET:
				setNet((Money)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT:
				setPayment((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE:
				setPaymentDate((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT:
				setRecipient((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID:
				getLinkIds().clear();
				getLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
				getSecurityLabelNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX:
				setEntityx((DataType)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME:
				setEffectiveTime((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS:
				setPoints((Decimal)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET:
				setNet((Money)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT:
				setPayment((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE:
				setPaymentDate((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT:
				setRecipient((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID:
				getLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__ENTITYX:
				return entityx != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__EFFECTIVE_TIME:
				return effectiveTime != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__FACTOR:
				return factor != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__POINTS:
				return points != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__NET:
				return net != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT:
				return payment != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__PAYMENT_DATE:
				return paymentDate != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RESPONSIBLE:
				return responsible != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__RECIPIENT:
				return recipient != null;
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__LINK_ID:
				return linkIds != null && !linkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM__SECURITY_LABEL_NUMBER:
				return securityLabelNumbers != null && !securityLabelNumbers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermContractAssetValuedItemImpl
