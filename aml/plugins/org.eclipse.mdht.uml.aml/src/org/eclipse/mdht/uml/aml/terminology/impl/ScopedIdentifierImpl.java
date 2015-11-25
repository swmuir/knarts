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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl#getIdentifierURIPattern <em>Identifier URI Pattern</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopedIdentifierImpl extends MinimalEObjectImpl.Container implements ScopedIdentifier {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifierURIPattern() <em>Identifier URI Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierURIPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_URI_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifierURIPattern() <em>Identifier URI Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierURIPattern()
	 * @generated
	 * @ordered
	 */
	protected String identifierURIPattern = IDENTIFIER_URI_PATTERN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.SCOPED_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.SCOPED_IDENTIFIER__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifierURIPattern() {
		return identifierURIPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierURIPattern(String newIdentifierURIPattern) {
		String oldIdentifierURIPattern = identifierURIPattern;
		identifierURIPattern = newIdentifierURIPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN, oldIdentifierURIPattern, identifierURIPattern));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.SCOPED_IDENTIFIER__URI:
				return getUri();
			case TerminologyPackage.SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN:
				return getIdentifierURIPattern();
			case TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
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
			case TerminologyPackage.SCOPED_IDENTIFIER__URI:
				setUri((String)newValue);
				return;
			case TerminologyPackage.SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN:
				setIdentifierURIPattern((String)newValue);
				return;
			case TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
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
			case TerminologyPackage.SCOPED_IDENTIFIER__URI:
				setUri(URI_EDEFAULT);
				return;
			case TerminologyPackage.SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN:
				setIdentifierURIPattern(IDENTIFIER_URI_PATTERN_EDEFAULT);
				return;
			case TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
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
			case TerminologyPackage.SCOPED_IDENTIFIER__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case TerminologyPackage.SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN:
				return IDENTIFIER_URI_PATTERN_EDEFAULT == null ? identifierURIPattern != null : !IDENTIFIER_URI_PATTERN_EDEFAULT.equals(identifierURIPattern);
			case TerminologyPackage.SCOPED_IDENTIFIER__BASE_ENUMERATION:
				return base_Enumeration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", identifierURIPattern: ");
		result.append(identifierURIPattern);
		result.append(')');
		return result.toString();
	}

} //ScopedIdentifierImpl
