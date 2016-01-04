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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement5;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionElement5Impl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionElement5Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionElement5Impl#getValueSetx <em>Value Setx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionElement5Impl extends ElementImpl implements ElementDefinitionElement5 {
	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Code strength;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getValueSetx() <em>Value Setx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetx()
	 * @generated
	 * @ordered
	 */
	protected Base valueSetx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION_ELEMENT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStrength() {
		if (strength != null && strength.eIsProxy()) {
			InternalEObject oldStrength = (InternalEObject)strength;
			strength = (Code)eResolveProxy(oldStrength);
			if (strength != oldStrength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH, oldStrength, strength));
			}
		}
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Code newStrength) {
		Code oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getValueSetx() {
		if (valueSetx != null && valueSetx.eIsProxy()) {
			InternalEObject oldValueSetx = (InternalEObject)valueSetx;
			valueSetx = (Base)eResolveProxy(oldValueSetx);
			if (valueSetx != oldValueSetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX, oldValueSetx, valueSetx));
			}
		}
		return valueSetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetValueSetx() {
		return valueSetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetx(Base newValueSetx) {
		Base oldValueSetx = valueSetx;
		valueSetx = newValueSetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX, oldValueSetx, valueSetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH:
				if (resolve) return getStrength();
				return basicGetStrength();
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX:
				if (resolve) return getValueSetx();
				return basicGetValueSetx();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH:
				setStrength((Code)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX:
				setValueSetx((Base)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH:
				setStrength((Code)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX:
				setValueSetx((Base)null);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__STRENGTH:
				return strength != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__DESCRIPTION:
				return description != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_ELEMENT5__VALUE_SETX:
				return valueSetx != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement5Impl
