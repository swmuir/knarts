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
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormulaAdministration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getAdministrations <em>Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderEnteralFormulaImpl#getAdministrationInstruction <em>Administration Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderEnteralFormulaImpl extends BackboneElementImpl implements NutritionOrderEnteralFormula {
	/**
	 * The cached value of the '{@link #getBaseFormulaType() <em>Base Formula Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept baseFormulaType;

	/**
	 * The cached value of the '{@link #getBaseFormulaProductName() <em>Base Formula Product Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaProductName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String baseFormulaProductName;

	/**
	 * The cached value of the '{@link #getAdditiveType() <em>Additive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additiveType;

	/**
	 * The cached value of the '{@link #getAdditiveProductName() <em>Additive Product Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveProductName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String additiveProductName;

	/**
	 * The cached value of the '{@link #getCaloricDensity() <em>Caloric Density</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaloricDensity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity caloricDensity;

	/**
	 * The cached value of the '{@link #getRouteofAdministration() <em>Routeof Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteofAdministration()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept routeofAdministration;

	/**
	 * The cached value of the '{@link #getAdministrations() <em>Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrations()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderEnteralFormulaAdministration> administrations;

	/**
	 * The cached value of the '{@link #getMaxVolumeToDeliver() <em>Max Volume To Deliver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity maxVolumeToDeliver;

	/**
	 * The cached value of the '{@link #getAdministrationInstruction() <em>Administration Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String administrationInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderEnteralFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getNutritionOrderEnteralFormula();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBaseFormulaType() {
		if (baseFormulaType != null && baseFormulaType.eIsProxy()) {
			InternalEObject oldBaseFormulaType = (InternalEObject)baseFormulaType;
			baseFormulaType = (CodeableConcept)eResolveProxy(oldBaseFormulaType);
			if (baseFormulaType != oldBaseFormulaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, oldBaseFormulaType, baseFormulaType));
			}
		}
		return baseFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBaseFormulaType() {
		return baseFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFormulaType(CodeableConcept newBaseFormulaType) {
		CodeableConcept oldBaseFormulaType = baseFormulaType;
		baseFormulaType = newBaseFormulaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, oldBaseFormulaType, baseFormulaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getBaseFormulaProductName() {
		if (baseFormulaProductName != null && baseFormulaProductName.eIsProxy()) {
			InternalEObject oldBaseFormulaProductName = (InternalEObject)baseFormulaProductName;
			baseFormulaProductName = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldBaseFormulaProductName);
			if (baseFormulaProductName != oldBaseFormulaProductName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, oldBaseFormulaProductName, baseFormulaProductName));
			}
		}
		return baseFormulaProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetBaseFormulaProductName() {
		return baseFormulaProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFormulaProductName(org.eclipse.mdht.uml.fhir.core.datatype.String newBaseFormulaProductName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldBaseFormulaProductName = baseFormulaProductName;
		baseFormulaProductName = newBaseFormulaProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, oldBaseFormulaProductName, baseFormulaProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdditiveType() {
		if (additiveType != null && additiveType.eIsProxy()) {
			InternalEObject oldAdditiveType = (InternalEObject)additiveType;
			additiveType = (CodeableConcept)eResolveProxy(oldAdditiveType);
			if (additiveType != oldAdditiveType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, oldAdditiveType, additiveType));
			}
		}
		return additiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetAdditiveType() {
		return additiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveType(CodeableConcept newAdditiveType) {
		CodeableConcept oldAdditiveType = additiveType;
		additiveType = newAdditiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, oldAdditiveType, additiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getAdditiveProductName() {
		if (additiveProductName != null && additiveProductName.eIsProxy()) {
			InternalEObject oldAdditiveProductName = (InternalEObject)additiveProductName;
			additiveProductName = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldAdditiveProductName);
			if (additiveProductName != oldAdditiveProductName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, oldAdditiveProductName, additiveProductName));
			}
		}
		return additiveProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetAdditiveProductName() {
		return additiveProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveProductName(org.eclipse.mdht.uml.fhir.core.datatype.String newAdditiveProductName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldAdditiveProductName = additiveProductName;
		additiveProductName = newAdditiveProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, oldAdditiveProductName, additiveProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getCaloricDensity() {
		if (caloricDensity != null && caloricDensity.eIsProxy()) {
			InternalEObject oldCaloricDensity = (InternalEObject)caloricDensity;
			caloricDensity = (SimpleQuantity)eResolveProxy(oldCaloricDensity);
			if (caloricDensity != oldCaloricDensity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, oldCaloricDensity, caloricDensity));
			}
		}
		return caloricDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetCaloricDensity() {
		return caloricDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaloricDensity(SimpleQuantity newCaloricDensity) {
		SimpleQuantity oldCaloricDensity = caloricDensity;
		caloricDensity = newCaloricDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, oldCaloricDensity, caloricDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRouteofAdministration() {
		if (routeofAdministration != null && routeofAdministration.eIsProxy()) {
			InternalEObject oldRouteofAdministration = (InternalEObject)routeofAdministration;
			routeofAdministration = (CodeableConcept)eResolveProxy(oldRouteofAdministration);
			if (routeofAdministration != oldRouteofAdministration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, oldRouteofAdministration, routeofAdministration));
			}
		}
		return routeofAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRouteofAdministration() {
		return routeofAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteofAdministration(CodeableConcept newRouteofAdministration) {
		CodeableConcept oldRouteofAdministration = routeofAdministration;
		routeofAdministration = newRouteofAdministration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, oldRouteofAdministration, routeofAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderEnteralFormulaAdministration> getAdministrations() {
		if (administrations == null) {
			administrations = new EObjectContainmentEList<NutritionOrderEnteralFormulaAdministration>(NutritionOrderEnteralFormulaAdministration.class, this, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION);
		}
		return administrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getMaxVolumeToDeliver() {
		if (maxVolumeToDeliver != null && maxVolumeToDeliver.eIsProxy()) {
			InternalEObject oldMaxVolumeToDeliver = (InternalEObject)maxVolumeToDeliver;
			maxVolumeToDeliver = (SimpleQuantity)eResolveProxy(oldMaxVolumeToDeliver);
			if (maxVolumeToDeliver != oldMaxVolumeToDeliver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, oldMaxVolumeToDeliver, maxVolumeToDeliver));
			}
		}
		return maxVolumeToDeliver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetMaxVolumeToDeliver() {
		return maxVolumeToDeliver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVolumeToDeliver(SimpleQuantity newMaxVolumeToDeliver) {
		SimpleQuantity oldMaxVolumeToDeliver = maxVolumeToDeliver;
		maxVolumeToDeliver = newMaxVolumeToDeliver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, oldMaxVolumeToDeliver, maxVolumeToDeliver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getAdministrationInstruction() {
		if (administrationInstruction != null && administrationInstruction.eIsProxy()) {
			InternalEObject oldAdministrationInstruction = (InternalEObject)administrationInstruction;
			administrationInstruction = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldAdministrationInstruction);
			if (administrationInstruction != oldAdministrationInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, oldAdministrationInstruction, administrationInstruction));
			}
		}
		return administrationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetAdministrationInstruction() {
		return administrationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrationInstruction(org.eclipse.mdht.uml.fhir.core.datatype.String newAdministrationInstruction) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldAdministrationInstruction = administrationInstruction;
		administrationInstruction = newAdministrationInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION, oldAdministrationInstruction, administrationInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return ((InternalEList<?>)getAdministrations()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				if (resolve) return getBaseFormulaType();
				return basicGetBaseFormulaType();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				if (resolve) return getBaseFormulaProductName();
				return basicGetBaseFormulaProductName();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				if (resolve) return getAdditiveType();
				return basicGetAdditiveType();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				if (resolve) return getAdditiveProductName();
				return basicGetAdditiveProductName();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				if (resolve) return getCaloricDensity();
				return basicGetCaloricDensity();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				if (resolve) return getRouteofAdministration();
				return basicGetRouteofAdministration();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return getAdministrations();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				if (resolve) return getMaxVolumeToDeliver();
				return basicGetMaxVolumeToDeliver();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				if (resolve) return getAdministrationInstruction();
				return basicGetAdministrationInstruction();
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
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				setAdditiveType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				setAdditiveProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				setRouteofAdministration((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				getAdministrations().clear();
				getAdministrations().addAll((Collection<? extends NutritionOrderEnteralFormulaAdministration>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				setAdministrationInstruction((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableConcept)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				setAdditiveType((CodeableConcept)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				setAdditiveProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				setRouteofAdministration((CodeableConcept)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				getAdministrations().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((SimpleQuantity)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				setAdministrationInstruction((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return baseFormulaType != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return baseFormulaProductName != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				return additiveType != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				return additiveProductName != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return caloricDensity != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				return routeofAdministration != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION:
				return administrations != null && !administrations.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return maxVolumeToDeliver != null;
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTION:
				return administrationInstruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderEnteralFormulaImpl
