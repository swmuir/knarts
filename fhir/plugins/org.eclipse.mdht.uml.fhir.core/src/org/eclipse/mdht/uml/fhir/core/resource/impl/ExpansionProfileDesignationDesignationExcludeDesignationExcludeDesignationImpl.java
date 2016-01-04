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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Designation Designation Exclude Designation Exclude Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl extends BackboneElementImpl implements ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Coding use;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (Code)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Code newLanguage) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Coding)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Coding newUse) {
		Coding oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				if (resolve) return getUse();
				return basicGetUse();
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
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				setUse((Coding)newValue);
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
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				setLanguage((Code)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				setUse((Coding)null);
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
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				return language != null;
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				return use != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl
