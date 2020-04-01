/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl#getTissue <em>Tissue</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl extends BackboneElementImpl implements MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod {
	/**
	 * The cached value of the '{@link #getTissue() <em>Tissue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTissue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept tissue;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity value;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String supportingInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTissue() {
		return tissue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTissue(CodeableConcept newTissue, NotificationChain msgs) {
		CodeableConcept oldTissue = tissue;
		tissue = newTissue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE, oldTissue, newTissue);
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
	public void setTissue(CodeableConcept newTissue) {
		if (newTissue != tissue) {
			NotificationChain msgs = null;
			if (tissue != null)
				msgs = ((InternalEObject)tissue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE, null, msgs);
			if (newTissue != null)
				msgs = ((InternalEObject)newTissue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE, null, msgs);
			msgs = basicSetTissue(newTissue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE, newTissue, newTissue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Quantity newValue, NotificationChain msgs) {
		Quantity oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE, oldValue, newValue);
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
	public void setValue(Quantity newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSupportingInformation() {
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingInformation(org.eclipse.mdht.hl7.fhir.dataTypes.String newSupportingInformation, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSupportingInformation = supportingInformation;
		supportingInformation = newSupportingInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, oldSupportingInformation, newSupportingInformation);
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
	public void setSupportingInformation(org.eclipse.mdht.hl7.fhir.dataTypes.String newSupportingInformation) {
		if (newSupportingInformation != supportingInformation) {
			NotificationChain msgs = null;
			if (supportingInformation != null)
				msgs = ((InternalEObject)supportingInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, null, msgs);
			if (newSupportingInformation != null)
				msgs = ((InternalEObject)newSupportingInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, null, msgs);
			msgs = basicSetSupportingInformation(newSupportingInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION, newSupportingInformation, newSupportingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE:
				return basicSetTissue(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return basicSetSupportingInformation(null, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE:
				return getTissue();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE:
				return getValue();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return getSupportingInformation();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE:
				setTissue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE:
				setValue((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				setSupportingInformation((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE:
				setTissue((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE:
				setValue((Quantity)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				setSupportingInformation((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__TISSUE:
				return tissue != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__VALUE:
				return value != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD__SUPPORTING_INFORMATION:
				return supportingInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl
