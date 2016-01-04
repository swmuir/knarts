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

import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportServiceModuleParameter;
import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportServiceModuleParameterCodeFilter;
import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportServiceModuleParameterDateFilter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Service Module Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportServiceModuleParameterImpl#getDateFilters <em>Date Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportServiceModuleParameterImpl extends BackboneElementImpl implements DecisionSupportServiceModuleParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Code name;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String documentation;

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
	protected EList<DecisionSupportServiceModuleParameterCodeFilter> codeFilters;

	/**
	 * The cached value of the '{@link #getDateFilters() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportServiceModuleParameterDateFilter> dateFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportServiceModuleParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDecisionSupportServiceModuleParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Code)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Code newName) {
		Code oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Code)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.datatype.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION, oldDocumentation, documentation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, oldProfile, profile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getMustSupports() {
		if (mustSupports == null) {
			mustSupports = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT);
		}
		return mustSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportServiceModuleParameterCodeFilter> getCodeFilters() {
		if (codeFilters == null) {
			codeFilters = new EObjectContainmentEList<DecisionSupportServiceModuleParameterCodeFilter>(DecisionSupportServiceModuleParameterCodeFilter.class, this, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER);
		}
		return codeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportServiceModuleParameterDateFilter> getDateFilters() {
		if (dateFilters == null) {
			dateFilters = new EObjectContainmentEList<DecisionSupportServiceModuleParameterDateFilter>(DecisionSupportServiceModuleParameterDateFilter.class, this, FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER);
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
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilters()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
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
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				return getMustSupports();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return getCodeFilters();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
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
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				setName((Code)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				setUse((Code)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				getMustSupports().clear();
				getMustSupports().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				getCodeFilters().clear();
				getCodeFilters().addAll((Collection<? extends DecisionSupportServiceModuleParameterCodeFilter>)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				getDateFilters().clear();
				getDateFilters().addAll((Collection<? extends DecisionSupportServiceModuleParameterDateFilter>)newValue);
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
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				setName((Code)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				setUse((Code)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				getMustSupports().clear();
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				getCodeFilters().clear();
				return;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
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
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__NAME:
				return name != null;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__USE:
				return use != null;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DOCUMENTATION:
				return documentation != null;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__TYPE:
				return type != null;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__PROFILE:
				return profile != null;
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__MUST_SUPPORT:
				return mustSupports != null && !mustSupports.isEmpty();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__CODE_FILTER:
				return codeFilters != null && !codeFilters.isEmpty();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER__DATE_FILTER:
				return dateFilters != null && !dateFilters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportServiceModuleParameterImpl
