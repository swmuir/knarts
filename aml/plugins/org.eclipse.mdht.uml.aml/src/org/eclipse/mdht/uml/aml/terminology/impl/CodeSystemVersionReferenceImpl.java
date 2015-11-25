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

import org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemVersionReferenceImpl#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSystemVersionReferenceImpl extends ResourceReferenceImpl implements CodeSystemVersionReference {
	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral codeSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemVersionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.CODE_SYSTEM_VERSION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getCodeSystem() {
		if (codeSystem != null && codeSystem.eIsProxy()) {
			InternalEObject oldCodeSystem = (InternalEObject)codeSystem;
			codeSystem = (EnumerationLiteral)eResolveProxy(oldCodeSystem);
			if (codeSystem != oldCodeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, oldCodeSystem, codeSystem));
			}
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(EnumerationLiteral newCodeSystem) {
		EnumerationLiteral oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, oldCodeSystem, codeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				if (resolve) return getCodeSystem();
				return basicGetCodeSystem();
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
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				setCodeSystem((EnumerationLiteral)newValue);
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
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				setCodeSystem((EnumerationLiteral)null);
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
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				return codeSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemVersionReferenceImpl
