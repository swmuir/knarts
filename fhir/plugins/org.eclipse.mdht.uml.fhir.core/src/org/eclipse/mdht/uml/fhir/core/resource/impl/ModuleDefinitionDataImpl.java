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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionData;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionDataCodeFilter;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleDefinitionDataDateFilter;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionDataImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionDataImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionDataImpl#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionDataImpl#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ModuleDefinitionDataImpl#getDateFilters <em>Date Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionDataImpl extends BackboneElementImpl implements ModuleDefinitionData {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition profile;

	/**
	 * The cached value of the '{@link #getMustSupports() <em>Must Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> mustSupports;

	/**
	 * The cached value of the '{@link #getCodeFilters() <em>Code Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionDataCodeFilter> codeFilters;

	/**
	 * The cached value of the '{@link #getDateFilters() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleDefinitionDataDateFilter> dateFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getModuleDefinitionData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (StructureDefinition)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(StructureDefinition newProfile) {
		StructureDefinition oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getMustSupports() {
		if (mustSupports == null) {
			mustSupports = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.MODULE_DEFINITION_DATA__MUST_SUPPORT);
		}
		return mustSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionDataCodeFilter> getCodeFilters() {
		if (codeFilters == null) {
			codeFilters = new EObjectContainmentEList<ModuleDefinitionDataCodeFilter>(ModuleDefinitionDataCodeFilter.class, this, FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER);
		}
		return codeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleDefinitionDataDateFilter> getDateFilters() {
		if (dateFilters == null) {
			dateFilters = new EObjectContainmentEList<ModuleDefinitionDataDateFilter>(ModuleDefinitionDataDateFilter.class, this, FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER);
		}
		return dateFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilters()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER:
				return ((InternalEList<?>)getDateFilters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__MUST_SUPPORT:
				return getMustSupports();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER:
				return getCodeFilters();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER:
				return getDateFilters();
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
			case FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__MUST_SUPPORT:
				getMustSupports().clear();
				getMustSupports().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER:
				getCodeFilters().clear();
				getCodeFilters().addAll((Collection<? extends ModuleDefinitionDataCodeFilter>)newValue);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER:
				getDateFilters().clear();
				getDateFilters().addAll((Collection<? extends ModuleDefinitionDataDateFilter>)newValue);
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
			case FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__MUST_SUPPORT:
				getMustSupports().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER:
				getCodeFilters().clear();
				return;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER:
				getDateFilters().clear();
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
			case FhirResourcePackage.MODULE_DEFINITION_DATA__TYPE:
				return type != null;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__PROFILE:
				return profile != null;
			case FhirResourcePackage.MODULE_DEFINITION_DATA__MUST_SUPPORT:
				return mustSupports != null && !mustSupports.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__CODE_FILTER:
				return codeFilters != null && !codeFilters.isEmpty();
			case FhirResourcePackage.MODULE_DEFINITION_DATA__DATE_FILTER:
				return dateFilters != null && !dateFilters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionDataImpl
