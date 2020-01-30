/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.impl.CodeableConceptImpl;

import fhiRCore.profiles.BpComponent11CodeableConcept1;
import fhiRCore.profiles.BpComponent11CodeableConcept1Coding1;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bp Component11 Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.BpComponent11CodeableConcept1Impl#getSbpCode <em>Sbp Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BpComponent11CodeableConcept1Impl extends CodeableConceptImpl implements BpComponent11CodeableConcept1 {
	/**
	 * The cached value of the '{@link #getSbpCode() <em>Sbp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSbpCode()
	 * @generated
	 * @ordered
	 */
	protected BpComponent11CodeableConcept1Coding1 sbpCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpComponent11CodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BP_COMPONENT11_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpComponent11CodeableConcept1Coding1 getSbpCode() {
		return sbpCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSbpCode(BpComponent11CodeableConcept1Coding1 newSbpCode, NotificationChain msgs) {
		BpComponent11CodeableConcept1Coding1 oldSbpCode = sbpCode;
		sbpCode = newSbpCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE, oldSbpCode, newSbpCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSbpCode(BpComponent11CodeableConcept1Coding1 newSbpCode) {
		if (newSbpCode != sbpCode) {
			NotificationChain msgs = null;
			if (sbpCode != null)
				msgs = ((InternalEObject)sbpCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE, null, msgs);
			if (newSbpCode != null)
				msgs = ((InternalEObject)newSbpCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE, null, msgs);
			msgs = basicSetSbpCode(newSbpCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE, newSbpCode, newSbpCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE:
				return basicSetSbpCode(null, msgs);
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
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE:
				return getSbpCode();
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
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE:
				setSbpCode((BpComponent11CodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE:
				setSbpCode((BpComponent11CodeableConcept1Coding1)null);
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
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE:
				return sbpCode != null;
		}
		return super.eIsSet(featureID);
	}

} //BpComponent11CodeableConcept1Impl
