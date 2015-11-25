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
package org.eclipse.mdht.uml.aml.terminology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;
import org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetDefinitionReferenceImpl#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetDefinitionReferenceImpl extends ResourceReferenceImpl implements ValueSetDefinitionReference {
	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral valueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.VALUE_SET_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValueSet() {
		if (valueSet != null && valueSet.eIsProxy()) {
			InternalEObject oldValueSet = (InternalEObject)valueSet;
			valueSet = (EnumerationLiteral)eResolveProxy(oldValueSet);
			if (valueSet != oldValueSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, oldValueSet, valueSet));
			}
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(EnumerationLiteral newValueSet) {
		EnumerationLiteral oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, oldValueSet, valueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				if (resolve) return getValueSet();
				return basicGetValueSet();
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
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				setValueSet((EnumerationLiteral)newValue);
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
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				setValueSet((EnumerationLiteral)null);
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
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				return valueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetDefinitionReferenceImpl
