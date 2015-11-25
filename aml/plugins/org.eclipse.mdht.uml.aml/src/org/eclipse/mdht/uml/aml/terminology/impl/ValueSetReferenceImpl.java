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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;
import org.eclipse.mdht.uml.aml.terminology.ValueSetReference;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetReferenceImpl#getValueSetDefinitions <em>Value Set Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetReferenceImpl extends ResourceReferenceImpl implements ValueSetReference {
	/**
	 * The cached value of the '{@link #getValueSetDefinitions() <em>Value Set Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> valueSetDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.VALUE_SET_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getValueSetDefinitions() {
		if (valueSetDefinitions == null) {
			valueSetDefinitions = new EObjectResolvingEList<EnumerationLiteral>(EnumerationLiteral.class, this, TerminologyPackage.VALUE_SET_REFERENCE__VALUE_SET_DEFINITION);
		}
		return valueSetDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValueSetDefinition(String name) {
		return getValueSetDefinition(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValueSetDefinition(String name, boolean ignoreCase) {
		valueSetDefinitionLoop: for (EnumerationLiteral valueSetDefinition : getValueSetDefinitions()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(valueSetDefinition.getName()) : name.equals(valueSetDefinition.getName())))
				continue valueSetDefinitionLoop;
			return valueSetDefinition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinition(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TerminologyValidator.VALUE_SET_REFERENCE__DEFINITION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDefinition", EObjectValidator.getObjectLabel(this, context) }),
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
			case TerminologyPackage.VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				return getValueSetDefinitions();
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
			case TerminologyPackage.VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				getValueSetDefinitions().clear();
				getValueSetDefinitions().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case TerminologyPackage.VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				getValueSetDefinitions().clear();
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
			case TerminologyPackage.VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				return valueSetDefinitions != null && !valueSetDefinitions.isEmpty();
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
			case TerminologyPackage.VALUE_SET_REFERENCE___VALIDATE_DEFINITION__DIAGNOSTICCHAIN_MAP:
				return validateDefinition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValueSetReferenceImpl
