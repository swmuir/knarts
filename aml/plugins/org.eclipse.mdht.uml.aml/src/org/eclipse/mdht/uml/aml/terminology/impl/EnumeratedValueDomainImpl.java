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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Value Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl#getValueSetBinding <em>Value Set Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumeratedValueDomainImpl extends IdentifiedItemImpl implements EnumeratedValueDomain {
	/**
	 * The cached value of the '{@link #getBase_Enumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Enumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration base_Enumeration;

	/**
	 * The cached value of the '{@link #getValueSetBinding() <em>Value Set Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetBinding()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral valueSetBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedValueDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.ENUMERATED_VALUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getBase_Enumeration() {
		if (base_Enumeration != null && base_Enumeration.eIsProxy()) {
			InternalEObject oldBase_Enumeration = (InternalEObject)base_Enumeration;
			base_Enumeration = (Enumeration)eResolveProxy(oldBase_Enumeration);
			if (base_Enumeration != oldBase_Enumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
			}
		}
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetBase_Enumeration() {
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Enumeration(Enumeration newBase_Enumeration) {
		Enumeration oldBase_Enumeration = base_Enumeration;
		base_Enumeration = newBase_Enumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValueSetBinding() {
		if (valueSetBinding != null && valueSetBinding.eIsProxy()) {
			InternalEObject oldValueSetBinding = (InternalEObject)valueSetBinding;
			valueSetBinding = (EnumerationLiteral)eResolveProxy(oldValueSetBinding);
			if (valueSetBinding != oldValueSetBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING, oldValueSetBinding, valueSetBinding));
			}
		}
		return valueSetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetValueSetBinding() {
		return valueSetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetBinding(EnumerationLiteral newValueSetBinding) {
		EnumerationLiteral oldValueSetBinding = valueSetBinding;
		valueSetBinding = newValueSetBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING, oldValueSetBinding, valueSetBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissibleValues(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ENUMERATED_VALUE_DOMAIN__PERMISSIBLE_VALUES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePermissibleValues", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingIsValueSetOrDefinition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ENUMERATED_VALUE_DOMAIN__BINDING_IS_VALUE_SET_OR_DEFINITION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateBindingIsValueSetOrDefinition", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING:
				if (resolve) return getValueSetBinding();
				return basicGetValueSetBinding();
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
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
				return;
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING:
				setValueSetBinding((EnumerationLiteral)newValue);
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
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
				return;
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING:
				setValueSetBinding((EnumerationLiteral)null);
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
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION:
				return base_Enumeration != null;
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING:
				return valueSetBinding != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN___VALIDATE_PERMISSIBLE_VALUES__DIAGNOSTICCHAIN_MAP:
				return validatePermissibleValues((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN___VALIDATE_BINDING_IS_VALUE_SET_OR_DEFINITION__DIAGNOSTICCHAIN_MAP:
				return validateBindingIsValueSetOrDefinition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnumeratedValueDomainImpl
