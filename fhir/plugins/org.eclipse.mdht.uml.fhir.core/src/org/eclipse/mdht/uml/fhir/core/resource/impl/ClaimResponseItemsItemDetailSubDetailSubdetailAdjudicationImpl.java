/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Items Item Detail Sub Detail Subdetail Adjudication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl extends BackboneElementImpl implements ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Coding code;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Money amount;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Decimal value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Coding)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Coding newCode) {
		Coding oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getAmount() {
		if (amount != null && amount.eIsProxy()) {
			InternalEObject oldAmount = (InternalEObject)amount;
			amount = (Money)eResolveProxy(oldAmount);
			if (amount != oldAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT, oldAmount, amount));
			}
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Money newAmount) {
		Money oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Decimal)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Decimal newValue) {
		Decimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT:
				if (resolve) return getAmount();
				return basicGetAmount();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE:
				setCode((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT:
				setAmount((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE:
				setValue((Decimal)newValue);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE:
				setCode((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT:
				setAmount((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE:
				setValue((Decimal)null);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__CODE:
				return code != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__AMOUNT:
				return amount != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl
