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

import org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Described Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.DescribedIdentifierImpl#getDefiningCodeSystem <em>Defining Code System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescribedIdentifierImpl extends ScopedIdentifierImpl implements DescribedIdentifier {
	/**
	 * The cached value of the '{@link #getDefiningCodeSystem() <em>Defining Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral definingCodeSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribedIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.DESCRIBED_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getDefiningCodeSystem() {
		if (definingCodeSystem != null && definingCodeSystem.eIsProxy()) {
			InternalEObject oldDefiningCodeSystem = (InternalEObject)definingCodeSystem;
			definingCodeSystem = (EnumerationLiteral)eResolveProxy(oldDefiningCodeSystem);
			if (definingCodeSystem != oldDefiningCodeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM, oldDefiningCodeSystem, definingCodeSystem));
			}
		}
		return definingCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetDefiningCodeSystem() {
		return definingCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningCodeSystem(EnumerationLiteral newDefiningCodeSystem) {
		EnumerationLiteral oldDefiningCodeSystem = definingCodeSystem;
		definingCodeSystem = newDefiningCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM, oldDefiningCodeSystem, definingCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersMustBeConceptReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TerminologyValidator.DESCRIBED_IDENTIFIER__MEMBERS_MUST_BE_CONCEPT_REFERENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateMembersMustBeConceptReference", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateDefiningCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TerminologyValidator.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDefiningCodeSystem", EObjectValidator.getObjectLabel(this, context) }),
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
			case TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM:
				if (resolve) return getDefiningCodeSystem();
				return basicGetDefiningCodeSystem();
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
			case TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM:
				setDefiningCodeSystem((EnumerationLiteral)newValue);
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
			case TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM:
				setDefiningCodeSystem((EnumerationLiteral)null);
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
			case TerminologyPackage.DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM:
				return definingCodeSystem != null;
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
			case TerminologyPackage.DESCRIBED_IDENTIFIER___VALIDATE_MEMBERS_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP:
				return validateMembersMustBeConceptReference((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.DESCRIBED_IDENTIFIER___VALIDATE_DEFINING_CODE_SYSTEM__DIAGNOSTICCHAIN_MAP:
				return validateDefiningCodeSystem((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DescribedIdentifierImpl
