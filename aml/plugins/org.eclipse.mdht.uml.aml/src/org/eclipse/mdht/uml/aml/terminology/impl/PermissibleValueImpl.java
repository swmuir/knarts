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

import org.eclipse.mdht.uml.aml.terminology.PermissibleValue;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissible Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl#getMeaning <em>Meaning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissibleValueImpl extends IdentifiedItemImpl implements PermissibleValue {
	/**
	 * The cached value of the '{@link #getBase_EnumerationLiteral() <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral base_EnumerationLiteral;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral meaning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissibleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.PERMISSIBLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getBase_EnumerationLiteral() {
		if (base_EnumerationLiteral != null && base_EnumerationLiteral.eIsProxy()) {
			InternalEObject oldBase_EnumerationLiteral = (InternalEObject)base_EnumerationLiteral;
			base_EnumerationLiteral = (EnumerationLiteral)eResolveProxy(oldBase_EnumerationLiteral);
			if (base_EnumerationLiteral != oldBase_EnumerationLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
			}
		}
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetBase_EnumerationLiteral() {
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_EnumerationLiteral(EnumerationLiteral newBase_EnumerationLiteral) {
		EnumerationLiteral oldBase_EnumerationLiteral = base_EnumerationLiteral;
		base_EnumerationLiteral = newBase_EnumerationLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getMeaning() {
		if (meaning != null && meaning.eIsProxy()) {
			InternalEObject oldMeaning = (InternalEObject)meaning;
			meaning = (EnumerationLiteral)eResolveProxy(oldMeaning);
			if (meaning != oldMeaning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.PERMISSIBLE_VALUE__MEANING, oldMeaning, meaning));
			}
		}
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(EnumerationLiteral newMeaning) {
		EnumerationLiteral oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.PERMISSIBLE_VALUE__MEANING, oldMeaning, meaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeConceptReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 TerminologyValidator.PERMISSIBLE_VALUE__MUST_BE_CONCEPT_REFERENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateMustBeConceptReference", EObjectValidator.getObjectLabel(this, context) }),
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
			case TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL:
				if (resolve) return getBase_EnumerationLiteral();
				return basicGetBase_EnumerationLiteral();
			case TerminologyPackage.PERMISSIBLE_VALUE__MEANING:
				if (resolve) return getMeaning();
				return basicGetMeaning();
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
			case TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)newValue);
				return;
			case TerminologyPackage.PERMISSIBLE_VALUE__MEANING:
				setMeaning((EnumerationLiteral)newValue);
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
			case TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)null);
				return;
			case TerminologyPackage.PERMISSIBLE_VALUE__MEANING:
				setMeaning((EnumerationLiteral)null);
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
			case TerminologyPackage.PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL:
				return base_EnumerationLiteral != null;
			case TerminologyPackage.PERMISSIBLE_VALUE__MEANING:
				return meaning != null;
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
			case TerminologyPackage.PERMISSIBLE_VALUE___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP:
				return validateMustBeConceptReference((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PermissibleValueImpl
