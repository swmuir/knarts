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
import org.eclipse.mdht.uml.fhir.core.datatype.Date;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsProsthesis;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Items Prosthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsProsthesisImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsProsthesisImpl#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsProsthesisImpl#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitItemsProsthesisImpl extends BackboneElementImpl implements ExplanationOfBenefitItemsProsthesis {
	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean initial;

	/**
	 * The cached value of the '{@link #getPriorDate() <em>Prior Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorDate()
	 * @generated
	 * @ordered
	 */
	protected Date priorDate;

	/**
	 * The cached value of the '{@link #getPriorMaterial() <em>Prior Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorMaterial()
	 * @generated
	 * @ordered
	 */
	protected Coding priorMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitItemsProsthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefitItemsProsthesis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newInitial) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPriorDate() {
		if (priorDate != null && priorDate.eIsProxy()) {
			InternalEObject oldPriorDate = (InternalEObject)priorDate;
			priorDate = (Date)eResolveProxy(oldPriorDate);
			if (priorDate != oldPriorDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE, oldPriorDate, priorDate));
			}
		}
		return priorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetPriorDate() {
		return priorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorDate(Date newPriorDate) {
		Date oldPriorDate = priorDate;
		priorDate = newPriorDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE, oldPriorDate, priorDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPriorMaterial() {
		if (priorMaterial != null && priorMaterial.eIsProxy()) {
			InternalEObject oldPriorMaterial = (InternalEObject)priorMaterial;
			priorMaterial = (Coding)eResolveProxy(oldPriorMaterial);
			if (priorMaterial != oldPriorMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL, oldPriorMaterial, priorMaterial));
			}
		}
		return priorMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPriorMaterial() {
		return priorMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorMaterial(Coding newPriorMaterial) {
		Coding oldPriorMaterial = priorMaterial;
		priorMaterial = newPriorMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL, oldPriorMaterial, priorMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE:
				if (resolve) return getPriorDate();
				return basicGetPriorDate();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL:
				if (resolve) return getPriorMaterial();
				return basicGetPriorMaterial();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL:
				setInitial((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((Coding)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL:
				setInitial((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((Coding)null);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__INITIAL:
				return initial != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_DATE:
				return priorDate != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS__PRIOR_MATERIAL:
				return priorMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitItemsProsthesisImpl
