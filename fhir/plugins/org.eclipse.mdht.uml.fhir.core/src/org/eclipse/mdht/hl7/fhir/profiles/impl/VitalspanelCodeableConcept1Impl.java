/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.CodeableConceptImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.VitalspanelCodeableConcept1;
import org.eclipse.mdht.hl7.fhir.profiles.VitalspanelCodeableConcept1Coding1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vitalspanel Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.VitalspanelCodeableConcept1Impl#getVitalsPanelCodes <em>Vitals Panel Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VitalspanelCodeableConcept1Impl extends CodeableConceptImpl implements VitalspanelCodeableConcept1 {
	/**
	 * The cached value of the '{@link #getVitalsPanelCodes() <em>Vitals Panel Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalsPanelCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<VitalspanelCodeableConcept1Coding1> vitalsPanelCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalspanelCodeableConcept1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.VITALSPANEL_CODEABLE_CONCEPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VitalspanelCodeableConcept1Coding1> getVitalsPanelCodes() {
		if (vitalsPanelCodes == null) {
			vitalsPanelCodes = new EObjectContainmentEList<VitalspanelCodeableConcept1Coding1>(VitalspanelCodeableConcept1Coding1.class, this, ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE);
		}
		return vitalsPanelCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE:
				return ((InternalEList<?>)getVitalsPanelCodes()).basicRemove(otherEnd, msgs);
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
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE:
				return getVitalsPanelCodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE:
				getVitalsPanelCodes().clear();
				getVitalsPanelCodes().addAll((Collection<? extends VitalspanelCodeableConcept1Coding1>)newValue);
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
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE:
				getVitalsPanelCodes().clear();
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
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE:
				return vitalsPanelCodes != null && !vitalsPanelCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VitalspanelCodeableConcept1Impl
