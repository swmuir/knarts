/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.impl.CodeableConceptImpl;

import fhiRCore.profiles.OxygensatCodeableConcept1;
import fhiRCore.profiles.OxygensatCodeableConcept1Coding1;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oxygensat Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.OxygensatCodeableConcept1Impl#getOxygenSatCode <em>Oxygen Sat Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OxygensatCodeableConcept1Impl extends CodeableConceptImpl implements OxygensatCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getOxygenSatCode() <em>Oxygen Sat Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOxygenSatCode()
	 * @generated
	 * @ordered
	 */
	protected OxygensatCodeableConcept1Coding1 oxygenSatCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OxygensatCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.OXYGENSAT_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OxygensatCodeableConcept1Coding1 getOxygenSatCode() {
		return oxygenSatCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOxygenSatCode(OxygensatCodeableConcept1Coding1 newOxygenSatCode, NotificationChain msgs) {
		OxygensatCodeableConcept1Coding1 oldOxygenSatCode = oxygenSatCode;
		oxygenSatCode = newOxygenSatCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE, oldOxygenSatCode, newOxygenSatCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOxygenSatCode(OxygensatCodeableConcept1Coding1 newOxygenSatCode) {
		if (newOxygenSatCode != oxygenSatCode) {
			NotificationChain msgs = null;
			if (oxygenSatCode != null)
				msgs = ((InternalEObject)oxygenSatCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE, null, msgs);
			if (newOxygenSatCode != null)
				msgs = ((InternalEObject)newOxygenSatCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE, null, msgs);
			msgs = basicSetOxygenSatCode(newOxygenSatCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE, newOxygenSatCode, newOxygenSatCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE:
				return basicSetOxygenSatCode(null, msgs);
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
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE:
				return getOxygenSatCode();
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
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE:
				setOxygenSatCode((OxygensatCodeableConcept1Coding1)newValue);
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
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE:
				setOxygenSatCode((OxygensatCodeableConcept1Coding1)null);
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
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE:
				return oxygenSatCode != null;
		}
		return super.eIsSet(featureID);
	}

} //OxygensatCodeableConcept1Impl
