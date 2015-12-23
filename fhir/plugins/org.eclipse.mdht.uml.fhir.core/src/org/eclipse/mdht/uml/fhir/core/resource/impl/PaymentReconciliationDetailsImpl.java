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
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getResponce <em>Responce</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentReconciliationDetailsImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationDetailsImpl extends BackboneElementImpl implements PaymentReconciliationDetails {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getResponce() <em>Responce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponce()
	 * @generated
	 * @ordered
	 */
	protected Resource responce;

	/**
	 * The cached value of the '{@link #getSubmitter() <em>Submitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitter()
	 * @generated
	 * @ordered
	 */
	protected Organization submitter;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected Organization payee;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPaymentReconciliationDetails();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResponce() {
		if (responce != null && responce.eIsProxy()) {
			InternalEObject oldResponce = (InternalEObject)responce;
			responce = (Resource)eResolveProxy(oldResponce);
			if (responce != oldResponce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE, oldResponce, responce));
			}
		}
		return responce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResponce() {
		return responce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponce(Resource newResponce) {
		Resource oldResponce = responce;
		responce = newResponce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE, oldResponce, responce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getSubmitter() {
		if (submitter != null && submitter.eIsProxy()) {
			InternalEObject oldSubmitter = (InternalEObject)submitter;
			submitter = (Organization)eResolveProxy(oldSubmitter);
			if (submitter != oldSubmitter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, oldSubmitter, submitter));
			}
		}
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetSubmitter() {
		return submitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitter(Organization newSubmitter) {
		Organization oldSubmitter = submitter;
		submitter = newSubmitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER, oldSubmitter, submitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getPayee() {
		if (payee != null && payee.eIsProxy()) {
			InternalEObject oldPayee = (InternalEObject)payee;
			payee = (Organization)eResolveProxy(oldPayee);
			if (payee != oldPayee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, oldPayee, payee));
			}
		}
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(Organization newPayee) {
		Organization oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE, oldPayee, payee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (Date)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE:
				if (resolve) return getResponce();
				return basicGetResponce();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				if (resolve) return getSubmitter();
				return basicGetSubmitter();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				if (resolve) return getPayee();
				return basicGetPayee();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				if (resolve) return getAmount();
				return basicGetAmount();
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
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				setRequest((Resource)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE:
				setResponce((Resource)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				setSubmitter((Organization)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				setPayee((Organization)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				setDate((Date)newValue);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				setAmount((Money)newValue);
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
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				setRequest((Resource)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE:
				setResponce((Resource)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				setSubmitter((Organization)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				setPayee((Organization)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				setDate((Date)null);
				return;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				setAmount((Money)null);
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
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__TYPE:
				return type != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__REQUEST:
				return request != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__RESPONCE:
				return responce != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__SUBMITTER:
				return submitter != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__PAYEE:
				return payee != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__DATE:
				return date != null;
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationDetailsImpl
