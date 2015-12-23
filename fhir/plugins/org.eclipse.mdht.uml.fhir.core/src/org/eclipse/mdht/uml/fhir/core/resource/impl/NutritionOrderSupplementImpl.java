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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderSupplement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderSupplementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderSupplementImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderSupplementImpl#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderSupplementImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderSupplementImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderSupplementImpl extends BackboneElementImpl implements NutritionOrderSupplement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String productName;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

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
	protected NutritionOrderSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getNutritionOrderSupplement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getProductName() {
		if (productName != null && productName.eIsProxy()) {
			InternalEObject oldProductName = (InternalEObject)productName;
			productName = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldProductName);
			if (productName != oldProductName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, oldProductName, productName));
			}
		}
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(org.eclipse.mdht.uml.fhir.core.datatype.String newProductName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timing> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectResolvingEList<Timing>(Timing.class, this, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY, oldQuantity, quantity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, oldInstruction, instruction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				if (resolve) return getProductName();
				return basicGetProductName();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return getSchedules();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
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
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Timing>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
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
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				getSchedules().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
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
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__TYPE:
				return type != null;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__PRODUCT_NAME:
				return productName != null;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__SCHEDULE:
				return schedules != null && !schedules.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderSupplementImpl
