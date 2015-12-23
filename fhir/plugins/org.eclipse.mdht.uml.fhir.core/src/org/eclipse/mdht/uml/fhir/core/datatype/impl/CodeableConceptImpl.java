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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Codeable Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl#getCodings <em>Coding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeableConceptImpl extends DataTypeImpl implements CodeableConcept {
	/**
	 * The cached value of the '{@link #getCodings() <em>Coding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodings()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codings;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeableConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.CODEABLE_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodings() {
		if (codings == null) {
			codings = new EObjectResolvingEList<Coding>(Coding.class, this, FhirDatatypePackage.CODEABLE_CONCEPT__CODING);
		}
		return codings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.CODEABLE_CONCEPT__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.CODEABLE_CONCEPT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.CODEABLE_CONCEPT__CODING:
				return getCodings();
			case FhirDatatypePackage.CODEABLE_CONCEPT__TEXT:
				if (resolve) return getText();
				return basicGetText();
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
			case FhirDatatypePackage.CODEABLE_CONCEPT__CODING:
				getCodings().clear();
				getCodings().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirDatatypePackage.CODEABLE_CONCEPT__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirDatatypePackage.CODEABLE_CONCEPT__CODING:
				getCodings().clear();
				return;
			case FhirDatatypePackage.CODEABLE_CONCEPT__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirDatatypePackage.CODEABLE_CONCEPT__CODING:
				return codings != null && !codings.isEmpty();
			case FhirDatatypePackage.CODEABLE_CONCEPT__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeableConceptImpl
