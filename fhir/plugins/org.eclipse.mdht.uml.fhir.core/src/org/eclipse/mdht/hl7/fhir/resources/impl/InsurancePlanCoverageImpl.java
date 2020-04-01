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
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.InsurancePlanCoverage;
import org.eclipse.mdht.hl7.fhir.resources.InsurancePlanCoverageCoverageBenefit;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Plan Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanCoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanCoverageImpl#getNetworks <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.InsurancePlanCoverageImpl#getBenefits <em>Benefit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanCoverageImpl extends BackboneElementImpl implements InsurancePlanCoverage {
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
	 * The cached value of the '{@link #getNetworks() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> networks;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanCoverageCoverageBenefit> benefits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlanCoverage();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InsurancePlanCoverageCoverageBenefit> getBenefits() {
		if (benefits == null) {
			benefits = new EObjectContainmentEList<InsurancePlanCoverageCoverageBenefit>(InsurancePlanCoverageCoverageBenefit.class, this, ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT);
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
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
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
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return getType();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return getNetworks();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
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
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				getBenefits().clear();
				getBenefits().addAll((Collection<? extends InsurancePlanCoverageCoverageBenefit>)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				getNetworks().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
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
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__TYPE:
				return type != null;
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__NETWORK:
				return networks != null && !networks.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE__BENEFIT:
				return benefits != null && !benefits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanCoverageImpl
