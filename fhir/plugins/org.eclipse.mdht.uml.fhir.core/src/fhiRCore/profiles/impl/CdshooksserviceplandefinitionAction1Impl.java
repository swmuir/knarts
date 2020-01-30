/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.DataType;

import fhiRCore.profiles.CdshooksserviceplandefinitionAction1;
import fhiRCore.profiles.ProfilesPackage;

import fhiRCore.resources.impl.PlanDefinitionActionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cdshooksserviceplandefinition Action1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.CdshooksserviceplandefinitionAction1Impl#getDefinitionx <em>Definitionx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdshooksserviceplandefinitionAction1Impl extends PlanDefinitionActionImpl implements CdshooksserviceplandefinitionAction1 {
	/**
	 * The cached value of the '{@link #getDefinitionx() <em>Definitionx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionx()
	 * @generated
	 * @ordered
	 */
	protected DataType definitionx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdshooksserviceplandefinitionAction1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.CDSHOOKSSERVICEPLANDEFINITION_ACTION1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDefinitionx() {
		return definitionx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionx(DataType newDefinitionx, NotificationChain msgs) {
		DataType oldDefinitionx = definitionx;
		definitionx = newDefinitionx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX, oldDefinitionx, newDefinitionx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionx(DataType newDefinitionx) {
		if (newDefinitionx != definitionx) {
			NotificationChain msgs = null;
			if (definitionx != null)
				msgs = ((InternalEObject)definitionx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX, null, msgs);
			if (newDefinitionx != null)
				msgs = ((InternalEObject)newDefinitionx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX, null, msgs);
			msgs = basicSetDefinitionx(newDefinitionx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX, newDefinitionx, newDefinitionx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX:
				return basicSetDefinitionx(null, msgs);
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
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX:
				return getDefinitionx();
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
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX:
				setDefinitionx((DataType)newValue);
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
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX:
				setDefinitionx((DataType)null);
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
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX:
				return definitionx != null;
		}
		return super.eIsSet(featureID);
	}

} //CdshooksserviceplandefinitionAction1Impl
