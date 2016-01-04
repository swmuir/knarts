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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDiet;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietNutrient;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getNutrients <em>Nutrient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getTextures <em>Texture</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getFluidConsistencyTypes <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderOralDietImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderOralDietImpl extends BackboneElementImpl implements NutritionOrderOralDiet {
	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Timing> schedules;

	/**
	 * The cached value of the '{@link #getNutrients() <em>Nutrient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrients()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderOralDietNutrient> nutrients;

	/**
	 * The cached value of the '{@link #getTextures() <em>Texture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextures()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderOralDietTexture> textures;

	/**
	 * The cached value of the '{@link #getFluidConsistencyTypes() <em>Fluid Consistency Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluidConsistencyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> fluidConsistencyTypes;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderOralDietImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getNutritionOrderOralDiet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timing> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectResolvingEList<Timing>(Timing.class, this, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderOralDietNutrient> getNutrients() {
		if (nutrients == null) {
			nutrients = new EObjectContainmentEList<NutritionOrderOralDietNutrient>(NutritionOrderOralDietNutrient.class, this, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT);
		}
		return nutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderOralDietTexture> getTextures() {
		if (textures == null) {
			textures = new EObjectContainmentEList<NutritionOrderOralDietTexture>(NutritionOrderOralDietTexture.class, this, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE);
		}
		return textures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFluidConsistencyTypes() {
		if (fluidConsistencyTypes == null) {
			fluidConsistencyTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE);
		}
		return fluidConsistencyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getInstruction() {
		if (instruction != null && instruction.eIsProxy()) {
			InternalEObject oldInstruction = (InternalEObject)instruction;
			instruction = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldInstruction);
			if (instruction != oldInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, oldInstruction, instruction));
			}
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(org.eclipse.mdht.uml.fhir.core.datatype.String newInstruction) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return ((InternalEList<?>)getNutrients()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return ((InternalEList<?>)getTextures()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return getTypes();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return getSchedules();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return getNutrients();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return getTextures();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return getFluidConsistencyTypes();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				if (resolve) return getInstruction();
				return basicGetInstruction();
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Timing>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrients().clear();
				getNutrients().addAll((Collection<? extends NutritionOrderOralDietNutrient>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTextures().clear();
				getTextures().addAll((Collection<? extends NutritionOrderOralDietTexture>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyTypes().clear();
				getFluidConsistencyTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getTypes().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				getSchedules().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrients().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTextures().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyTypes().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return types != null && !types.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return schedules != null && !schedules.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return nutrients != null && !nutrients.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return textures != null && !textures.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return fluidConsistencyTypes != null && !fluidConsistencyTypes.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderOralDietImpl
