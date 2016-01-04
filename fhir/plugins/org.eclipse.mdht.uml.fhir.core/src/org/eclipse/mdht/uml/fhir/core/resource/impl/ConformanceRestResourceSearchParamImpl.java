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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceSearchParam;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Rest Resource Search Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceSearchParamImpl#getChains <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceRestResourceSearchParamImpl extends BackboneElementImpl implements ConformanceRestResourceSearchParam {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

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
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String documentation;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> targets;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> modifiers;

	/**
	 * The cached value of the '{@link #getChains() <em>Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> chains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceRestResourceSearchParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConformanceRestResourceSearchParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Uri)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION, oldDefinition, definition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Code>(Code.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<Code>(Code.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getChains() {
		if (chains == null) {
			chains = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__CHAIN);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TARGET:
				return getTargets();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__MODIFIER:
				return getModifiers();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__CHAIN:
				return getChains();
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__CHAIN:
				getChains().clear();
				getChains().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TARGET:
				getTargets().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__MODIFIER:
				getModifiers().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__CHAIN:
				getChains().clear();
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__NAME:
				return name != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DEFINITION:
				return definition != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TYPE:
				return type != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__DOCUMENTATION:
				return documentation != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__TARGET:
				return targets != null && !targets.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM__CHAIN:
				return chains != null && !chains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceRestResourceSearchParamImpl
