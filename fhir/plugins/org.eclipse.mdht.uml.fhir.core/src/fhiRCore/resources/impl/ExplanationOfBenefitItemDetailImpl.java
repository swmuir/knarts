/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ExplanationOfBenefitItemAdjudication;
import fhiRCore.resources.ExplanationOfBenefitItemDetail;
import fhiRCore.resources.ExplanationOfBenefitItemDetailSubDetail;
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
 * An implementation of the model object '<em><b>Explanation Of Benefit Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getProgramCodes <em>Program Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getUdis <em>Udi</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitItemDetailImpl#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitItemDetailImpl extends BackboneElementImpl implements ExplanationOfBenefitItemDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

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
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifiers;

	/**
	 * The cached value of the '{@link #getProgramCodes() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCodes;

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
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdis() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udis;

	/**
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumbers;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getSubDetails() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemDetailSubDetail> subDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitItemDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CodeableConcept newRevenue, NotificationChain msgs) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE, oldRevenue, newRevenue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(CodeableConcept newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProgramCodes() {
		if (programCodes == null) {
			programCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE);
		}
		return programCodes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE, newUnitPrice, newUnitPrice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR, oldFactor, newFactor);
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
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR, newFactor, newFactor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET, oldNet, newNet);
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
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUdis() {
		if (udis == null) {
			udis = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI);
		}
		return udis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ExplanationOfBenefitItemAdjudication>(ExplanationOfBenefitItemAdjudication.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItemDetailSubDetail> getSubDetails() {
		if (subDetails == null) {
			subDetails = new EObjectContainmentEList<ExplanationOfBenefitItemDetailSubDetail>(ExplanationOfBenefitItemDetailSubDetail.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL);
		}
		return subDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE:
				return basicSetRevenue(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR:
				return basicSetFactor(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET:
				return basicSetNet(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI:
				return ((InternalEList<?>)getUdis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE:
				return getSequence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE:
				return getRevenue();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY:
				return getCategory();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER:
				return getModifiers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE:
				return getProgramCodes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY:
				return getQuantity();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE:
				return getUnitPrice();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR:
				return getFactor();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET:
				return getNet();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI:
				return getUdis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL:
				return getSubDetails();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE:
				getProgramCodes().clear();
				getProgramCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI:
				getUdis().clear();
				getUdis().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ExplanationOfBenefitItemAdjudication>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
				getSubDetails().addAll((Collection<? extends ExplanationOfBenefitItemDetailSubDetail>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE:
				getProgramCodes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET:
				setNet((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI:
				getUdis().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__REVENUE:
				return revenue != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__CATEGORY:
				return category != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__PROGRAM_CODE:
				return programCodes != null && !programCodes.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__QUANTITY:
				return quantity != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__FACTOR:
				return factor != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NET:
				return net != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__UDI:
				return udis != null && !udis.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL__SUB_DETAIL:
				return subDetails != null && !subDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitItemDetailImpl
