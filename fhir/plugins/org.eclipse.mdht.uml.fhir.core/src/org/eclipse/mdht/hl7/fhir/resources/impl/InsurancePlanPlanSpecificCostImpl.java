/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.InsurancePlanPlanSpecificCost;
import org.eclipse.mdht.hl7.fhir.resources.InsurancePlanPlanSpecificCostPlanBenefit;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Plan Specific Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanSpecificCostImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanPlanSpecificCostImpl#getBenefits <em>Benefit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanPlanSpecificCostImpl extends BackboneElementImpl implements InsurancePlanPlanSpecificCost {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlanSpecificCostPlanBenefit> benefits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanPlanSpecificCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlanPlanSpecificCost();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanPlanSpecificCostPlanBenefit> getBenefits() {
		if (benefits == null) {
			benefits = new EObjectContainmentEList<InsurancePlanPlanSpecificCostPlanBenefit>(InsurancePlanPlanSpecificCostPlanBenefit.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT);
		}
		return benefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT:
				return ((InternalEList<?>)getBenefits()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY:
				return getCategory();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT:
				return getBenefits();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT:
				getBenefits().clear();
				getBenefits().addAll((Collection<? extends InsurancePlanPlanSpecificCostPlanBenefit>)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT:
				getBenefits().clear();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__CATEGORY:
				return category != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST__BENEFIT:
				return benefits != null && !benefits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanPlanSpecificCostImpl
