/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.SubstanceAmountElement1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Amount Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountElement1Impl#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountElement1Impl#getHighLimit <em>High Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceAmountElement1Impl extends ElementImpl implements SubstanceAmountElement1 {
	/**
	 * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Quantity lowLimit;

	/**
	 * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLimit()
	 * @generated
	 * @ordered
	 */
	protected Quantity highLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAmountElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.SUBSTANCE_AMOUNT_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getLowLimit() {
		return lowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowLimit(Quantity newLowLimit, NotificationChain msgs) {
		Quantity oldLowLimit = lowLimit;
		lowLimit = newLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT, oldLowLimit, newLowLimit);
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
	public void setLowLimit(Quantity newLowLimit) {
		if (newLowLimit != lowLimit) {
			NotificationChain msgs = null;
			if (lowLimit != null)
				msgs = ((InternalEObject)lowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT, null, msgs);
			if (newLowLimit != null)
				msgs = ((InternalEObject)newLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT, null, msgs);
			msgs = basicSetLowLimit(newLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT, newLowLimit, newLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getHighLimit() {
		return highLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighLimit(Quantity newHighLimit, NotificationChain msgs) {
		Quantity oldHighLimit = highLimit;
		highLimit = newHighLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT, oldHighLimit, newHighLimit);
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
	public void setHighLimit(Quantity newHighLimit) {
		if (newHighLimit != highLimit) {
			NotificationChain msgs = null;
			if (highLimit != null)
				msgs = ((InternalEObject)highLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT, null, msgs);
			if (newHighLimit != null)
				msgs = ((InternalEObject)newHighLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT, null, msgs);
			msgs = basicSetHighLimit(newHighLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT, newHighLimit, newHighLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT:
				return basicSetLowLimit(null, msgs);
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT:
				return basicSetHighLimit(null, msgs);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT:
				return getLowLimit();
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT:
				return getHighLimit();
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
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT:
				setLowLimit((Quantity)newValue);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT:
				setHighLimit((Quantity)newValue);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT:
				setLowLimit((Quantity)null);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT:
				setHighLimit((Quantity)null);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT:
				return lowLimit != null;
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT:
				return highLimit != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceAmountElement1Impl
