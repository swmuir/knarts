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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationProduct;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationProductBatch;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationProductIngredient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationProductImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationProductImpl#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationProductImpl#getBatchs <em>Batch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationProductImpl extends BackboneElementImpl implements MedicationProduct {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationProductIngredient> ingredients;

	/**
	 * The cached value of the '{@link #getBatchs() <em>Batch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationProductBatch> batchs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (CodeableConcept)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_PRODUCT__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_PRODUCT__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationProductIngredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<MedicationProductIngredient>(MedicationProductIngredient.class, this, FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationProductBatch> getBatchs() {
		if (batchs == null) {
			batchs = new EObjectContainmentEList<MedicationProductBatch>(MedicationProductBatch.class, this, FhirResourcePackage.MEDICATION_PRODUCT__BATCH);
		}
		return batchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MEDICATION_PRODUCT__BATCH:
				return ((InternalEList<?>)getBatchs()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.MEDICATION_PRODUCT__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT:
				return getIngredients();
			case FhirResourcePackage.MEDICATION_PRODUCT__BATCH:
				return getBatchs();
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
			case FhirResourcePackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends MedicationProductIngredient>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_PRODUCT__BATCH:
				getBatchs().clear();
				getBatchs().addAll((Collection<? extends MedicationProductBatch>)newValue);
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
			case FhirResourcePackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredients().clear();
				return;
			case FhirResourcePackage.MEDICATION_PRODUCT__BATCH:
				getBatchs().clear();
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
			case FhirResourcePackage.MEDICATION_PRODUCT__FORM:
				return form != null;
			case FhirResourcePackage.MEDICATION_PRODUCT__INGREDIENT:
				return ingredients != null && !ingredients.isEmpty();
			case FhirResourcePackage.MEDICATION_PRODUCT__BATCH:
				return batchs != null && !batchs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationProductImpl
