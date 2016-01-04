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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitBenefitBalanceBenefit;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Benefit Balance Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitBenefitBalanceBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitBenefitBalanceBenefitImpl#getBenefitx <em>Benefitx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitBenefitBalanceBenefitImpl#getBenefitUsedx <em>Benefit Usedx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitBenefitBalanceBenefitImpl extends BackboneElementImpl implements ExplanationOfBenefitBenefitBalanceBenefit {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getBenefitx() <em>Benefitx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitx()
	 * @generated
	 * @ordered
	 */
	protected DataType benefitx;

	/**
	 * The cached value of the '{@link #getBenefitUsedx() <em>Benefit Usedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitUsedx()
	 * @generated
	 * @ordered
	 */
	protected DataType benefitUsedx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitBenefitBalanceBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefitBenefitBalanceBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBenefitx() {
		if (benefitx != null && benefitx.eIsProxy()) {
			InternalEObject oldBenefitx = (InternalEObject)benefitx;
			benefitx = (DataType)eResolveProxy(oldBenefitx);
			if (benefitx != oldBenefitx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX, oldBenefitx, benefitx));
			}
		}
		return benefitx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBenefitx() {
		return benefitx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitx(DataType newBenefitx) {
		DataType oldBenefitx = benefitx;
		benefitx = newBenefitx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX, oldBenefitx, benefitx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBenefitUsedx() {
		if (benefitUsedx != null && benefitUsedx.eIsProxy()) {
			InternalEObject oldBenefitUsedx = (InternalEObject)benefitUsedx;
			benefitUsedx = (DataType)eResolveProxy(oldBenefitUsedx);
			if (benefitUsedx != oldBenefitUsedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX, oldBenefitUsedx, benefitUsedx));
			}
		}
		return benefitUsedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBenefitUsedx() {
		return benefitUsedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitUsedx(DataType newBenefitUsedx) {
		DataType oldBenefitUsedx = benefitUsedx;
		benefitUsedx = newBenefitUsedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX, oldBenefitUsedx, benefitUsedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX:
				if (resolve) return getBenefitx();
				return basicGetBenefitx();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX:
				if (resolve) return getBenefitUsedx();
				return basicGetBenefitUsedx();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX:
				setBenefitx((DataType)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX:
				setBenefitUsedx((DataType)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX:
				setBenefitx((DataType)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX:
				setBenefitUsedx((DataType)null);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__TYPE:
				return type != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFITX:
				return benefitx != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT__BENEFIT_USEDX:
				return benefitUsedx != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitBenefitBalanceBenefitImpl
