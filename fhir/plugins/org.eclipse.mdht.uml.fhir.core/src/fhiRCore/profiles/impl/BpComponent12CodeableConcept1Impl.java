/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.impl.CodeableConceptImpl;

import fhiRCore.profiles.BpComponent12CodeableConcept1;
import fhiRCore.profiles.BpComponent12CodeableConcept1Coding1;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bp Component12 Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.BpComponent12CodeableConcept1Impl#getDbpCode <em>Dbp Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BpComponent12CodeableConcept1Impl extends CodeableConceptImpl implements BpComponent12CodeableConcept1 {
	/**
	 * The cached value of the '{@link #getDbpCode() <em>Dbp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbpCode()
	 * @generated
	 * @ordered
	 */
	protected BpComponent12CodeableConcept1Coding1 dbpCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpComponent12CodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BP_COMPONENT12_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpComponent12CodeableConcept1Coding1 getDbpCode() {
		return dbpCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDbpCode(BpComponent12CodeableConcept1Coding1 newDbpCode, NotificationChain msgs) {
		BpComponent12CodeableConcept1Coding1 oldDbpCode = dbpCode;
		dbpCode = newDbpCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE, oldDbpCode, newDbpCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbpCode(BpComponent12CodeableConcept1Coding1 newDbpCode) {
		if (newDbpCode != dbpCode) {
			NotificationChain msgs = null;
			if (dbpCode != null)
				msgs = ((InternalEObject)dbpCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE, null, msgs);
			if (newDbpCode != null)
				msgs = ((InternalEObject)newDbpCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE, null, msgs);
			msgs = basicSetDbpCode(newDbpCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE, newDbpCode, newDbpCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE:
				return basicSetDbpCode(null, msgs);
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
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE:
				return getDbpCode();
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
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE:
				setDbpCode((BpComponent12CodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE:
				setDbpCode((BpComponent12CodeableConcept1Coding1)null);
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
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE:
				return dbpCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BpComponent12CodeableConcept1Impl
