/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.BodyheightCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.BodyheightCodeableConcept1Coding1;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bodyheight Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.BodyheightCodeableConcept1Impl#getBodyHeightCode <em>Body Height Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyheightCodeableConcept1Impl extends CodeableConceptImpl implements BodyheightCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getBodyHeightCode() <em>Body Height Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyHeightCode()
	 * @generated
	 * @ordered
	 */
	protected BodyheightCodeableConcept1Coding1 bodyHeightCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyheightCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BODYHEIGHT_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyheightCodeableConcept1Coding1 getBodyHeightCode() {
		return bodyHeightCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyHeightCode(BodyheightCodeableConcept1Coding1 newBodyHeightCode, NotificationChain msgs) {
		BodyheightCodeableConcept1Coding1 oldBodyHeightCode = bodyHeightCode;
		bodyHeightCode = newBodyHeightCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE, oldBodyHeightCode, newBodyHeightCode);
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
	public void setBodyHeightCode(BodyheightCodeableConcept1Coding1 newBodyHeightCode) {
		if (newBodyHeightCode != bodyHeightCode) {
			NotificationChain msgs = null;
			if (bodyHeightCode != null)
				msgs = ((InternalEObject)bodyHeightCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE, null, msgs);
			if (newBodyHeightCode != null)
				msgs = ((InternalEObject)newBodyHeightCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE, null, msgs);
			msgs = basicSetBodyHeightCode(newBodyHeightCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE, newBodyHeightCode, newBodyHeightCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE:
				return basicSetBodyHeightCode(null, msgs);
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
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE:
				return getBodyHeightCode();
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
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE:
				setBodyHeightCode((BodyheightCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE:
				setBodyHeightCode((BodyheightCodeableConcept1Coding1)null);
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
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE:
				return bodyHeightCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyheightCodeableConcept1Impl
