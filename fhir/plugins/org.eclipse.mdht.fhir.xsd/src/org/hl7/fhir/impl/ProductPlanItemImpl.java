/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProductPlanItem;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Plan Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProductPlanItemImpl#getBenefitValue <em>Benefit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPlanItemImpl extends BackboneElementImpl implements ProductPlanItem {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getBenefitValue() <em>Benefit Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitValue()
	 * @generated
	 * @ordered
	 */
	protected Quantity benefitValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPlanItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProductPlanItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_ITEM__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_ITEM__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_ITEM__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_ITEM__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getBenefitValue() {
		return benefitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitValue(Quantity newBenefitValue, NotificationChain msgs) {
		Quantity oldBenefitValue = benefitValue;
		benefitValue = newBenefitValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE, oldBenefitValue, newBenefitValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitValue(Quantity newBenefitValue) {
		if (newBenefitValue != benefitValue) {
			NotificationChain msgs = null;
			if (benefitValue != null)
				msgs = ((InternalEObject)benefitValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE, null, msgs);
			if (newBenefitValue != null)
				msgs = ((InternalEObject)newBenefitValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE, null, msgs);
			msgs = basicSetBenefitValue(newBenefitValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE, newBenefitValue, newBenefitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PRODUCT_PLAN_ITEM__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE:
				return basicSetBenefitValue(null, msgs);
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
			case FhirPackage.PRODUCT_PLAN_ITEM__CODE:
				return getCode();
			case FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE:
				return getBenefitValue();
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
			case FhirPackage.PRODUCT_PLAN_ITEM__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE:
				setBenefitValue((Quantity)newValue);
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
			case FhirPackage.PRODUCT_PLAN_ITEM__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE:
				setBenefitValue((Quantity)null);
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
			case FhirPackage.PRODUCT_PLAN_ITEM__CODE:
				return code != null;
			case FhirPackage.PRODUCT_PLAN_ITEM__BENEFIT_VALUE:
				return benefitValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductPlanItemImpl
