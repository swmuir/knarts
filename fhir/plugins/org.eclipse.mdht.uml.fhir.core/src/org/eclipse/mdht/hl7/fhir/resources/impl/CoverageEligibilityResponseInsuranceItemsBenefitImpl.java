/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityResponseInsuranceItemsBenefit;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response Insurance Items Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsBenefitImpl#getAllowedx <em>Allowedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsBenefitImpl#getUsedx <em>Usedx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseInsuranceItemsBenefitImpl extends BackboneElementImpl implements CoverageEligibilityResponseInsuranceItemsBenefit {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAllowedx() <em>Allowedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedx()
	 * @generated
	 * @ordered
	 */
	protected DataType allowedx;

	/**
	 * The cached value of the '{@link #getUsedx() <em>Usedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedx()
	 * @generated
	 * @ordered
	 */
	protected DataType usedx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseInsuranceItemsBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityResponseInsuranceItemsBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getAllowedx() {
		return allowedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedx(DataType newAllowedx, NotificationChain msgs) {
		DataType oldAllowedx = allowedx;
		allowedx = newAllowedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX, oldAllowedx, newAllowedx);
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
	public void setAllowedx(DataType newAllowedx) {
		if (newAllowedx != allowedx) {
			NotificationChain msgs = null;
			if (allowedx != null)
				msgs = ((InternalEObject)allowedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX, null, msgs);
			if (newAllowedx != null)
				msgs = ((InternalEObject)newAllowedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX, null, msgs);
			msgs = basicSetAllowedx(newAllowedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX, newAllowedx, newAllowedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getUsedx() {
		return usedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedx(DataType newUsedx, NotificationChain msgs) {
		DataType oldUsedx = usedx;
		usedx = newUsedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX, oldUsedx, newUsedx);
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
	public void setUsedx(DataType newUsedx) {
		if (newUsedx != usedx) {
			NotificationChain msgs = null;
			if (usedx != null)
				msgs = ((InternalEObject)usedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX, null, msgs);
			if (newUsedx != null)
				msgs = ((InternalEObject)newUsedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX, null, msgs);
			msgs = basicSetUsedx(newUsedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX, newUsedx, newUsedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX:
				return basicSetAllowedx(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX:
				return basicSetUsedx(null, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE:
				return getType();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX:
				return getAllowedx();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX:
				return getUsedx();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX:
				setAllowedx((DataType)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX:
				setUsedx((DataType)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX:
				setAllowedx((DataType)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX:
				setUsedx((DataType)null);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__TYPE:
				return type != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__ALLOWEDX:
				return allowedx != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT__USEDX:
				return usedx != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseInsuranceItemsBenefitImpl
