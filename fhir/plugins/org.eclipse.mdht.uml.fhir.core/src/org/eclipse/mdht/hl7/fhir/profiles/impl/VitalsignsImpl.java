/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.Vitalsigns;
import org.eclipse.mdht.hl7.fhir.profiles.VitalsignsCodeableConcept1;

import org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vitalsigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.VitalsignsImpl#getVsCat <em>Vs Cat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VitalsignsImpl extends ObservationImpl implements Vitalsigns {
	/**
	 * The cached value of the '{@link #getVsCat() <em>Vs Cat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsCat()
	 * @generated
	 * @ordered
	 */
	protected VitalsignsCodeableConcept1 vsCat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalsignsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.VITALSIGNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalsignsCodeableConcept1 getVsCat() {
		return vsCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVsCat(VitalsignsCodeableConcept1 newVsCat, NotificationChain msgs) {
		VitalsignsCodeableConcept1 oldVsCat = vsCat;
		vsCat = newVsCat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.VITALSIGNS__VS_CAT, oldVsCat, newVsCat);
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
	public void setVsCat(VitalsignsCodeableConcept1 newVsCat) {
		if (newVsCat != vsCat) {
			NotificationChain msgs = null;
			if (vsCat != null)
				msgs = ((InternalEObject)vsCat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.VITALSIGNS__VS_CAT, null, msgs);
			if (newVsCat != null)
				msgs = ((InternalEObject)newVsCat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.VITALSIGNS__VS_CAT, null, msgs);
			msgs = basicSetVsCat(newVsCat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.VITALSIGNS__VS_CAT, newVsCat, newVsCat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.VITALSIGNS__VS_CAT:
				return basicSetVsCat(null, msgs);
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
			case ProfilesPackage.VITALSIGNS__VS_CAT:
				return getVsCat();
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
			case ProfilesPackage.VITALSIGNS__VS_CAT:
				setVsCat((VitalsignsCodeableConcept1)newValue);
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
			case ProfilesPackage.VITALSIGNS__VS_CAT:
				setVsCat((VitalsignsCodeableConcept1)null);
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
			case ProfilesPackage.VITALSIGNS__VS_CAT:
				return vsCat != null;
		}
		return super.eIsSet(featureID);
	}

} //VitalsignsImpl
