/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.BodytempCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.BodytempCodeableConcept1Coding1;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bodytemp Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.BodytempCodeableConcept1Impl#getBodyTempCode <em>Body Temp Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodytempCodeableConcept1Impl extends CodeableConceptImpl implements BodytempCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getBodyTempCode() <em>Body Temp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyTempCode()
	 * @generated
	 * @ordered
	 */
	protected BodytempCodeableConcept1Coding1 bodyTempCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodytempCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BODYTEMP_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodytempCodeableConcept1Coding1 getBodyTempCode() {
		return bodyTempCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyTempCode(BodytempCodeableConcept1Coding1 newBodyTempCode, NotificationChain msgs) {
		BodytempCodeableConcept1Coding1 oldBodyTempCode = bodyTempCode;
		bodyTempCode = newBodyTempCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE, oldBodyTempCode, newBodyTempCode);
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
	public void setBodyTempCode(BodytempCodeableConcept1Coding1 newBodyTempCode) {
		if (newBodyTempCode != bodyTempCode) {
			NotificationChain msgs = null;
			if (bodyTempCode != null)
				msgs = ((InternalEObject)bodyTempCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE, null, msgs);
			if (newBodyTempCode != null)
				msgs = ((InternalEObject)newBodyTempCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE, null, msgs);
			msgs = basicSetBodyTempCode(newBodyTempCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE, newBodyTempCode, newBodyTempCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE:
				return basicSetBodyTempCode(null, msgs);
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
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE:
				return getBodyTempCode();
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
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE:
				setBodyTempCode((BodytempCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE:
				setBodyTempCode((BodytempCodeableConcept1Coding1)null);
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
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE:
				return bodyTempCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BodytempCodeableConcept1Impl
