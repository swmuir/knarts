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
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Timing;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.NutritionOrderSupplement;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.NutritionOrderSupplementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.NutritionOrderSupplementImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.NutritionOrderSupplementImpl#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.NutritionOrderSupplementImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.NutritionOrderSupplementImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderSupplementImpl extends BackboneElementImpl implements NutritionOrderSupplement {
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
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String productName;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Timing> schedules;

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
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionOrderSupplement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductName(org.eclipse.mdht.hl7.fhir.dataTypes.String newProductName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, oldProductName, newProductName);
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
	public void setProductName(org.eclipse.mdht.hl7.fhir.dataTypes.String newProductName) {
		if (newProductName != productName) {
			NotificationChain msgs = null;
			if (productName != null)
				msgs = ((InternalEObject)productName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, null, msgs);
			if (newProductName != null)
				msgs = ((InternalEObject)newProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, null, msgs);
			msgs = basicSetProductName(newProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, newProductName, newProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Timing> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Timing>(Timing.class, this, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE);
		}
		return schedules;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newInstruction, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, oldInstruction, newInstruction);
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
	public void setInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return basicSetProductName(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return basicSetInstruction(null, msgs);
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
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return getType();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return getProductName();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return getSchedules();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return getQuantity();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return getInstruction();
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
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Timing>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				setInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				getSchedules().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				setInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return type != null;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return productName != null;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return schedules != null && !schedules.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return quantity != null;
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderSupplementImpl
