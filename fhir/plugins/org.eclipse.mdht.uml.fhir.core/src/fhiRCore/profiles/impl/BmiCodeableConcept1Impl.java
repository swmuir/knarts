/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.impl.CodeableConceptImpl;

import fhiRCore.profiles.BmiCodeableConcept1;
import fhiRCore.profiles.BmiCodeableConcept1Coding1;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bmi Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.BmiCodeableConcept1Impl#getBmiCode <em>Bmi Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BmiCodeableConcept1Impl extends CodeableConceptImpl implements BmiCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getBmiCode() <em>Bmi Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmiCode()
	 * @generated
	 * @ordered
	 */
	protected BmiCodeableConcept1Coding1 bmiCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BmiCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BMI_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BmiCodeableConcept1Coding1 getBmiCode() {
		return bmiCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBmiCode(BmiCodeableConcept1Coding1 newBmiCode, NotificationChain msgs) {
		BmiCodeableConcept1Coding1 oldBmiCode = bmiCode;
		bmiCode = newBmiCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE, oldBmiCode, newBmiCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBmiCode(BmiCodeableConcept1Coding1 newBmiCode) {
		if (newBmiCode != bmiCode) {
			NotificationChain msgs = null;
			if (bmiCode != null)
				msgs = ((InternalEObject)bmiCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE, null, msgs);
			if (newBmiCode != null)
				msgs = ((InternalEObject)newBmiCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE, null, msgs);
			msgs = basicSetBmiCode(newBmiCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE, newBmiCode, newBmiCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE:
				return basicSetBmiCode(null, msgs);
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
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE:
				return getBmiCode();
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
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE:
				setBmiCode((BmiCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE:
				setBmiCode((BmiCodeableConcept1Coding1)null);
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
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1__BMI_CODE:
				return bmiCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BmiCodeableConcept1Impl
