/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SupplyDeliverySuppliedItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Delivery Supplied Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SupplyDeliverySuppliedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SupplyDeliverySuppliedItemImpl#getItemx <em>Itemx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyDeliverySuppliedItemImpl extends BackboneElementImpl implements SupplyDeliverySuppliedItem {
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
	 * The cached value of the '{@link #getItemx() <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemx()
	 * @generated
	 * @ordered
	 */
	protected DataType itemx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyDeliverySuppliedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSupplyDeliverySuppliedItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX, oldItemx, newItemx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemx(DataType newItemx) {
		if (newItemx != itemx) {
			NotificationChain msgs = null;
			if (itemx != null)
				msgs = ((InternalEObject)itemx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX, null, msgs);
			if (newItemx != null)
				msgs = ((InternalEObject)newItemx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX, null, msgs);
			msgs = basicSetItemx(newItemx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX, newItemx, newItemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX:
				return basicSetItemx(null, msgs);
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
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY:
				return getQuantity();
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX:
				return getItemx();
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
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX:
				setItemx((DataType)newValue);
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
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX:
				setItemx((DataType)null);
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
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM__ITEMX:
				return itemx != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyDeliverySuppliedItemImpl
