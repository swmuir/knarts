/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.BodyweightCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.BodyweightCodeableConcept1Coding1;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bodyweight Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.BodyweightCodeableConcept1Impl#getBodyWeightCode <em>Body Weight Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyweightCodeableConcept1Impl extends CodeableConceptImpl implements BodyweightCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getBodyWeightCode() <em>Body Weight Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeightCode()
	 * @generated
	 * @ordered
	 */
	protected BodyweightCodeableConcept1Coding1 bodyWeightCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyweightCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BODYWEIGHT_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyweightCodeableConcept1Coding1 getBodyWeightCode() {
		return bodyWeightCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyWeightCode(BodyweightCodeableConcept1Coding1 newBodyWeightCode, NotificationChain msgs) {
		BodyweightCodeableConcept1Coding1 oldBodyWeightCode = bodyWeightCode;
		bodyWeightCode = newBodyWeightCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE, oldBodyWeightCode, newBodyWeightCode);
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
	public void setBodyWeightCode(BodyweightCodeableConcept1Coding1 newBodyWeightCode) {
		if (newBodyWeightCode != bodyWeightCode) {
			NotificationChain msgs = null;
			if (bodyWeightCode != null)
				msgs = ((InternalEObject)bodyWeightCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE, null, msgs);
			if (newBodyWeightCode != null)
				msgs = ((InternalEObject)newBodyWeightCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE, null, msgs);
			msgs = basicSetBodyWeightCode(newBodyWeightCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE, newBodyWeightCode, newBodyWeightCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE:
				return basicSetBodyWeightCode(null, msgs);
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
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE:
				return getBodyWeightCode();
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
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE:
				setBodyWeightCode((BodyweightCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE:
				setBodyWeightCode((BodyweightCodeableConcept1Coding1)null);
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
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE:
				return bodyWeightCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyweightCodeableConcept1Impl
