/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.ResprateCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.ResprateCodeableConcept1Coding1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resprate Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.ResprateCodeableConcept1Impl#getRespRateCode <em>Resp Rate Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResprateCodeableConcept1Impl extends CodeableConceptImpl implements ResprateCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getRespRateCode() <em>Resp Rate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespRateCode()
	 * @generated
	 * @ordered
	 */
	protected ResprateCodeableConcept1Coding1 respRateCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResprateCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.RESPRATE_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResprateCodeableConcept1Coding1 getRespRateCode() {
		return respRateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespRateCode(ResprateCodeableConcept1Coding1 newRespRateCode, NotificationChain msgs) {
		ResprateCodeableConcept1Coding1 oldRespRateCode = respRateCode;
		respRateCode = newRespRateCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE, oldRespRateCode, newRespRateCode);
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
	public void setRespRateCode(ResprateCodeableConcept1Coding1 newRespRateCode) {
		if (newRespRateCode != respRateCode) {
			NotificationChain msgs = null;
			if (respRateCode != null)
				msgs = ((InternalEObject)respRateCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE, null, msgs);
			if (newRespRateCode != null)
				msgs = ((InternalEObject)newRespRateCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE, null, msgs);
			msgs = basicSetRespRateCode(newRespRateCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE, newRespRateCode, newRespRateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE:
				return basicSetRespRateCode(null, msgs);
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
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE:
				return getRespRateCode();
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
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE:
				setRespRateCode((ResprateCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE:
				setRespRateCode((ResprateCodeableConcept1Coding1)null);
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
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE:
				return respRateCode != null;
		}
		return super.eIsSet(featureID);
	}

} //ResprateCodeableConcept1Impl
