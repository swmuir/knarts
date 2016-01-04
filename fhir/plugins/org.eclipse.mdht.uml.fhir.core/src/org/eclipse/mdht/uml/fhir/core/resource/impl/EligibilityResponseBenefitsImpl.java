/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefits;
import org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Benefits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EligibilityResponseBenefitsImpl#getFinancials <em>Financial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityResponseBenefitsImpl extends BackboneElementImpl implements EligibilityResponseBenefits {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding category;

	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected Coding subCategory;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Coding network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Coding unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Coding term;

	/**
	 * The cached value of the '{@link #getFinancials() <em>Financial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancials()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseBenefitsBenefit> financials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseBenefitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getEligibilityResponseBenefits();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Coding)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Coding newCategory) {
		Coding oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getSubCategory() {
		if (subCategory != null && subCategory.eIsProxy()) {
			InternalEObject oldSubCategory = (InternalEObject)subCategory;
			subCategory = (Coding)eResolveProxy(oldSubCategory);
			if (subCategory != oldSubCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY, oldSubCategory, subCategory));
			}
		}
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetSubCategory() {
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCategory(Coding newSubCategory) {
		Coding oldSubCategory = subCategory;
		subCategory = newSubCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY, oldSubCategory, subCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Coding)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Coding newNetwork) {
		Coding oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Coding)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Coding newUnit) {
		Coding oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getTerm() {
		if (term != null && term.eIsProxy()) {
			InternalEObject oldTerm = (InternalEObject)term;
			term = (Coding)eResolveProxy(oldTerm);
			if (term != oldTerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM, oldTerm, term));
			}
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Coding newTerm) {
		Coding oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseBenefitsBenefit> getFinancials() {
		if (financials == null) {
			financials = new EObjectContainmentEList<EligibilityResponseBenefitsBenefit>(EligibilityResponseBenefitsBenefit.class, this, FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL);
		}
		return financials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL:
				return ((InternalEList<?>)getFinancials()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY:
				if (resolve) return getSubCategory();
				return basicGetSubCategory();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM:
				if (resolve) return getTerm();
				return basicGetTerm();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL:
				return getFinancials();
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
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY:
				setCategory((Coding)newValue);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY:
				setSubCategory((Coding)newValue);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK:
				setNetwork((Coding)newValue);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT:
				setUnit((Coding)newValue);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM:
				setTerm((Coding)newValue);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL:
				getFinancials().clear();
				getFinancials().addAll((Collection<? extends EligibilityResponseBenefitsBenefit>)newValue);
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
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY:
				setCategory((Coding)null);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY:
				setSubCategory((Coding)null);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK:
				setNetwork((Coding)null);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT:
				setUnit((Coding)null);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM:
				setTerm((Coding)null);
				return;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL:
				getFinancials().clear();
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
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__CATEGORY:
				return category != null;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__SUB_CATEGORY:
				return subCategory != null;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__NETWORK:
				return network != null;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__UNIT:
				return unit != null;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__TERM:
				return term != null;
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS__FINANCIAL:
				return financials != null && !financials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseBenefitsImpl
