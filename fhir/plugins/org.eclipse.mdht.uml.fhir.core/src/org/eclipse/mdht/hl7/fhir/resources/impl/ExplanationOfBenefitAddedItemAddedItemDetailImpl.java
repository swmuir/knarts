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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetail;
import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail;
import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitItemAdjudication;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Added Item Added Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitAddedItemAddedItemDetailImpl#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitAddedItemAddedItemDetailImpl extends BackboneElementImpl implements ExplanationOfBenefitAddedItemAddedItemDetail {
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
	protected EList<ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail> subDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitAddedItemAddedItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitAddedItemAddedItemDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER);
		}
		return modifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR, oldFactor, newFactor);
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
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET, oldNet, newNet);
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
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ExplanationOfBenefitItemAdjudication>(ExplanationOfBenefitItemAdjudication.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail> getSubDetails() {
		if (subDetails == null) {
			subDetails = new EObjectContainmentEList<ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail>(ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR:
				return basicSetFactor(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET:
				return basicSetNet(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL:
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER:
				return getModifiers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY:
				return getQuantity();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE:
				return getUnitPrice();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR:
				return getFactor();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET:
				return getNet();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL:
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ExplanationOfBenefitItemAdjudication>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
				getSubDetails().addAll((Collection<? extends ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET:
				setNet((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL:
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__QUANTITY:
				return quantity != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__FACTOR:
				return factor != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NET:
				return net != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL__SUB_DETAIL:
				return subDetails != null && !subDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitAddedItemAddedItemDetailImpl
