/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit;
import fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Plan Specific Cost Plan Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanSpecificCostPlanBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanSpecificCostPlanBenefitImpl#getCosts <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanPlanSpecificCostPlanBenefitImpl extends BackboneElementImpl implements InsurancePlanPlanSpecificCostPlanBenefit {
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
	 * The cached value of the '{@link #getCosts() <em>Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlanSpecificCostPlanBenefitCost> costs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanPlanSpecificCostPlanBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlanPlanSpecificCostPlanBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanPlanSpecificCostPlanBenefitCost> getCosts() {
		if (costs == null) {
			costs = new EObjectContainmentEList<InsurancePlanPlanSpecificCostPlanBenefitCost>(InsurancePlanPlanSpecificCostPlanBenefitCost.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST);
		}
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST:
				return ((InternalEList<?>)getCosts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE:
				return getType();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST:
				return getCosts();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST:
				getCosts().clear();
				getCosts().addAll((Collection<? extends InsurancePlanPlanSpecificCostPlanBenefitCost>)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST:
				getCosts().clear();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__TYPE:
				return type != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT__COST:
				return costs != null && !costs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanPlanSpecificCostPlanBenefitImpl
