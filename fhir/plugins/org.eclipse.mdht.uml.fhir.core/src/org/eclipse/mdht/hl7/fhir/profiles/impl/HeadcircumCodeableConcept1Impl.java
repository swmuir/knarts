/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.HeadcircumCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.HeadcircumCodeableConcept1Coding1;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Headcircum Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.HeadcircumCodeableConcept1Impl#getHeadCircumCode <em>Head Circum Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadcircumCodeableConcept1Impl extends CodeableConceptImpl implements HeadcircumCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getHeadCircumCode() <em>Head Circum Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadCircumCode()
	 * @generated
	 * @ordered
	 */
	protected HeadcircumCodeableConcept1Coding1 headCircumCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadcircumCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.HEADCIRCUM_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadcircumCodeableConcept1Coding1 getHeadCircumCode() {
		return headCircumCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeadCircumCode(HeadcircumCodeableConcept1Coding1 newHeadCircumCode, NotificationChain msgs) {
		HeadcircumCodeableConcept1Coding1 oldHeadCircumCode = headCircumCode;
		headCircumCode = newHeadCircumCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE, oldHeadCircumCode, newHeadCircumCode);
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
	public void setHeadCircumCode(HeadcircumCodeableConcept1Coding1 newHeadCircumCode) {
		if (newHeadCircumCode != headCircumCode) {
			NotificationChain msgs = null;
			if (headCircumCode != null)
				msgs = ((InternalEObject)headCircumCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE, null, msgs);
			if (newHeadCircumCode != null)
				msgs = ((InternalEObject)newHeadCircumCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE, null, msgs);
			msgs = basicSetHeadCircumCode(newHeadCircumCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE, newHeadCircumCode, newHeadCircumCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE:
				return basicSetHeadCircumCode(null, msgs);
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
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE:
				return getHeadCircumCode();
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
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE:
				setHeadCircumCode((HeadcircumCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE:
				setHeadCircumCode((HeadcircumCodeableConcept1Coding1)null);
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
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE:
				return headCircumCode != null;
		}
		return super.eIsSet(featureID);
	}

} //HeadcircumCodeableConcept1Impl
