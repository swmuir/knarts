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
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitAddedItemAddedItemsDetail;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Added Item Added Items Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitAddedItemAddedItemsDetailImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitAddedItemAddedItemsDetailImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitAddedItemAddedItemsDetailImpl#getAdjudications <em>Adjudication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitAddedItemAddedItemsDetailImpl extends BackboneElementImpl implements ExplanationOfBenefitAddedItemAddedItemsDetail {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Money fee;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication> adjudications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitAddedItemAddedItemsDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefitAddedItemAddedItemsDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Coding)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getFee() {
		if (fee != null && fee.eIsProxy()) {
			InternalEObject oldFee = (InternalEObject)fee;
			fee = (Money)eResolveProxy(oldFee);
			if (fee != oldFee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE, oldFee, fee));
			}
		}
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Money newFee) {
		Money oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication>(ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE:
				if (resolve) return getFee();
				return basicGetFee();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION:
				return getAdjudications();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE:
				setFee((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication>)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE:
				setService((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE:
				setFee((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION:
				getAdjudications().clear();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__SERVICE:
				return service != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__FEE:
				return fee != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitAddedItemAddedItemsDetailImpl
