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

import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityResponseInsurance;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityResponseInsuranceItems;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceImpl#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceImpl#getBenefitPeriod <em>Benefit Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseInsuranceImpl extends BackboneElementImpl implements CoverageEligibilityResponseInsurance {
	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Reference coverage;

	/**
	 * The cached value of the '{@link #getInforce() <em>Inforce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInforce()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean inforce;

	/**
	 * The cached value of the '{@link #getBenefitPeriod() <em>Benefit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period benefitPeriod;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseInsuranceItems> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityResponseInsurance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Reference newCoverage, NotificationChain msgs) {
		Reference oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, oldCoverage, newCoverage);
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
	public void setCoverage(Reference newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getInforce() {
		return inforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInforce(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newInforce, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldInforce = inforce;
		inforce = newInforce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE, oldInforce, newInforce);
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
	public void setInforce(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newInforce) {
		if (newInforce != inforce) {
			NotificationChain msgs = null;
			if (inforce != null)
				msgs = ((InternalEObject)inforce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE, null, msgs);
			if (newInforce != null)
				msgs = ((InternalEObject)newInforce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE, null, msgs);
			msgs = basicSetInforce(newInforce, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE, newInforce, newInforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getBenefitPeriod() {
		return benefitPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitPeriod(Period newBenefitPeriod, NotificationChain msgs) {
		Period oldBenefitPeriod = benefitPeriod;
		benefitPeriod = newBenefitPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD, oldBenefitPeriod, newBenefitPeriod);
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
	public void setBenefitPeriod(Period newBenefitPeriod) {
		if (newBenefitPeriod != benefitPeriod) {
			NotificationChain msgs = null;
			if (benefitPeriod != null)
				msgs = ((InternalEObject)benefitPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD, null, msgs);
			if (newBenefitPeriod != null)
				msgs = ((InternalEObject)newBenefitPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD, null, msgs);
			msgs = basicSetBenefitPeriod(newBenefitPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD, newBenefitPeriod, newBenefitPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityResponseInsuranceItems> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<CoverageEligibilityResponseInsuranceItems>(CoverageEligibilityResponseInsuranceItems.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return basicSetCoverage(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE:
				return basicSetInforce(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD:
				return basicSetBenefitPeriod(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return getCoverage();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE:
				return getInforce();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD:
				return getBenefitPeriod();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM:
				return getItems();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE:
				setInforce((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD:
				setBenefitPeriod((Period)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends CoverageEligibilityResponseInsuranceItems>)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE:
				setInforce((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD:
				setBenefitPeriod((Period)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM:
				getItems().clear();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return coverage != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__INFORCE:
				return inforce != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_PERIOD:
				return benefitPeriod != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseInsuranceImpl
