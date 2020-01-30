/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.impl.CodeableConceptImpl;

import fhiRCore.profiles.HeartrateCodeableConcept1;
import fhiRCore.profiles.HeartrateCodeableConcept1Coding1;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heartrate Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.HeartrateCodeableConcept1Impl#getHeartRateCode <em>Heart Rate Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeartrateCodeableConcept1Impl extends CodeableConceptImpl implements HeartrateCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getHeartRateCode() <em>Heart Rate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartRateCode()
	 * @generated
	 * @ordered
	 */
	protected HeartrateCodeableConcept1Coding1 heartRateCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeartrateCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.HEARTRATE_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartrateCodeableConcept1Coding1 getHeartRateCode() {
		return heartRateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeartRateCode(HeartrateCodeableConcept1Coding1 newHeartRateCode, NotificationChain msgs) {
		HeartrateCodeableConcept1Coding1 oldHeartRateCode = heartRateCode;
		heartRateCode = newHeartRateCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE, oldHeartRateCode, newHeartRateCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeartRateCode(HeartrateCodeableConcept1Coding1 newHeartRateCode) {
		if (newHeartRateCode != heartRateCode) {
			NotificationChain msgs = null;
			if (heartRateCode != null)
				msgs = ((InternalEObject)heartRateCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE, null, msgs);
			if (newHeartRateCode != null)
				msgs = ((InternalEObject)newHeartRateCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE, null, msgs);
			msgs = basicSetHeartRateCode(newHeartRateCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE, newHeartRateCode, newHeartRateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE:
				return basicSetHeartRateCode(null, msgs);
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
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE:
				return getHeartRateCode();
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
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE:
				setHeartRateCode((HeartrateCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE:
				setHeartRateCode((HeartrateCodeableConcept1Coding1)null);
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
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE:
				return heartRateCode != null;
		}
		return super.eIsSet(featureID);
	}

} //HeartrateCodeableConcept1Impl
