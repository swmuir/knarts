/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTermContractOfferAnswer;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term Contract Offer Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermContractOfferAnswerImpl#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermContractOfferAnswerImpl extends BackboneElementImpl implements ContractTermContractOfferAnswer {
	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermContractOfferAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermContractOfferAnswer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX, oldValuex, newValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX:
				return basicSetValuex(null, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX:
				return getValuex();
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX:
				setValuex((DataType)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX:
				setValuex((DataType)null);
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
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER__VALUEX:
				return valuex != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractTermContractOfferAnswerImpl
