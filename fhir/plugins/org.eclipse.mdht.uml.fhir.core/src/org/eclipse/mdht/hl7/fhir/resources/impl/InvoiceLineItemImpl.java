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

import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.InvoiceLineItem;
import org.eclipse.mdht.hl7.fhir.resources.InvoiceLineItemPriceComponent;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceLineItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceLineItemImpl#getChargeItemx <em>Charge Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InvoiceLineItemImpl#getPriceComponents <em>Price Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceLineItemImpl extends BackboneElementImpl implements InvoiceLineItem {
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
	 * The cached value of the '{@link #getChargeItemx() <em>Charge Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeItemx()
	 * @generated
	 * @ordered
	 */
	protected DataType chargeItemx;

	/**
	 * The cached value of the '{@link #getPriceComponents() <em>Price Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceLineItemPriceComponent> priceComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInvoiceLineItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getChargeItemx() {
		return chargeItemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeItemx(DataType newChargeItemx, NotificationChain msgs) {
		DataType oldChargeItemx = chargeItemx;
		chargeItemx = newChargeItemx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX, oldChargeItemx, newChargeItemx);
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
	public void setChargeItemx(DataType newChargeItemx) {
		if (newChargeItemx != chargeItemx) {
			NotificationChain msgs = null;
			if (chargeItemx != null)
				msgs = ((InternalEObject)chargeItemx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX, null, msgs);
			if (newChargeItemx != null)
				msgs = ((InternalEObject)newChargeItemx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX, null, msgs);
			msgs = basicSetChargeItemx(newChargeItemx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX, newChargeItemx, newChargeItemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvoiceLineItemPriceComponent> getPriceComponents() {
		if (priceComponents == null) {
			priceComponents = new EObjectContainmentEList<InvoiceLineItemPriceComponent>(InvoiceLineItemPriceComponent.class, this, ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT);
		}
		return priceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX:
				return basicSetChargeItemx(null, msgs);
			case ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return ((InternalEList<?>)getPriceComponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return getSequence();
			case ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX:
				return getChargeItemx();
			case ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return getPriceComponents();
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
			case ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX:
				setChargeItemx((DataType)newValue);
				return;
			case ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				getPriceComponents().clear();
				getPriceComponents().addAll((Collection<? extends InvoiceLineItemPriceComponent>)newValue);
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
			case ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX:
				setChargeItemx((DataType)null);
				return;
			case ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				getPriceComponents().clear();
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
			case ResourcesPackage.INVOICE_LINE_ITEM__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.INVOICE_LINE_ITEM__CHARGE_ITEMX:
				return chargeItemx != null;
			case ResourcesPackage.INVOICE_LINE_ITEM__PRICE_COMPONENT:
				return priceComponents != null && !priceComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvoiceLineItemImpl
