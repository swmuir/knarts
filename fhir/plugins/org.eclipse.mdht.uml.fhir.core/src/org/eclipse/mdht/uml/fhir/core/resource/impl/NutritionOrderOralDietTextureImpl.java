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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Oral Diet Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietTextureImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietTextureImpl#getFoodType <em>Food Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderOralDietTextureImpl extends BackboneElementImpl implements NutritionOrderOralDietTexture {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept modifier;

	/**
	 * The cached value of the '{@link #getFoodType() <em>Food Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept foodType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderOralDietTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getNutritionOrderOralDietTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getModifier() {
		if (modifier != null && modifier.eIsProxy()) {
			InternalEObject oldModifier = (InternalEObject)modifier;
			modifier = (CodeableConcept)eResolveProxy(oldModifier);
			if (modifier != oldModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER, oldModifier, modifier));
			}
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(CodeableConcept newModifier) {
		CodeableConcept oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFoodType() {
		if (foodType != null && foodType.eIsProxy()) {
			InternalEObject oldFoodType = (InternalEObject)foodType;
			foodType = (CodeableConcept)eResolveProxy(oldFoodType);
			if (foodType != oldFoodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE, oldFoodType, foodType));
			}
		}
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetFoodType() {
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodType(CodeableConcept newFoodType) {
		CodeableConcept oldFoodType = foodType;
		foodType = newFoodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE, oldFoodType, foodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER:
				if (resolve) return getModifier();
				return basicGetModifier();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE:
				if (resolve) return getFoodType();
				return basicGetFoodType();
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)newValue);
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)null);
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__MODIFIER:
				return modifier != null;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE__FOOD_TYPE:
				return foodType != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderOralDietTextureImpl
