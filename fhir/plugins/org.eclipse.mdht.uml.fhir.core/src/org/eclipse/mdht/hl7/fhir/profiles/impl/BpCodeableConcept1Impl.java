/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.BpCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.BpCodeableConcept1Coding1;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bp Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.BpCodeableConcept1Impl#getBpCode <em>Bp Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BpCodeableConcept1Impl extends CodeableConceptImpl implements BpCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getBpCode() <em>Bp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpCode()
	 * @generated
	 * @ordered
	 */
	protected BpCodeableConcept1Coding1 bpCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BP_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpCodeableConcept1Coding1 getBpCode() {
		return bpCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBpCode(BpCodeableConcept1Coding1 newBpCode, NotificationChain msgs) {
		BpCodeableConcept1Coding1 oldBpCode = bpCode;
		bpCode = newBpCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE, oldBpCode, newBpCode);
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
	public void setBpCode(BpCodeableConcept1Coding1 newBpCode) {
		if (newBpCode != bpCode) {
			NotificationChain msgs = null;
			if (bpCode != null)
				msgs = ((InternalEObject)bpCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE, null, msgs);
			if (newBpCode != null)
				msgs = ((InternalEObject)newBpCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE, null, msgs);
			msgs = basicSetBpCode(newBpCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE, newBpCode, newBpCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE:
				return basicSetBpCode(null, msgs);
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
			case ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE:
				return getBpCode();
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
			case ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE:
				setBpCode((BpCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE:
				setBpCode((BpCodeableConcept1Coding1)null);
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
			case ProfilesPackage.BP_CODEABLE_CONCEPT1__BP_CODE:
				return bpCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BpCodeableConcept1Impl
