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

import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceResourceInteraction;
import org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceSearchParam;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Rest Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getSearchIncludes <em>Search Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getSearchRevIncludes <em>Search Rev Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConformanceRestResourceImpl#getSearchParams <em>Search Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceRestResourceImpl extends BackboneElementImpl implements ConformanceRestResource {
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
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestResourceResourceInteraction> interactions;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected Code versioning;

	/**
	 * The cached value of the '{@link #getReadHistory() <em>Read History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHistory()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean readHistory;

	/**
	 * The cached value of the '{@link #getUpdateCreate() <em>Update Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCreate()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean updateCreate;

	/**
	 * The cached value of the '{@link #getConditionalCreate() <em>Conditional Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalCreate()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean conditionalCreate;

	/**
	 * The cached value of the '{@link #getConditionalUpdate() <em>Conditional Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean conditionalUpdate;

	/**
	 * The cached value of the '{@link #getConditionalDelete() <em>Conditional Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalDelete()
	 * @generated
	 * @ordered
	 */
	protected Code conditionalDelete;

	/**
	 * The cached value of the '{@link #getSearchIncludes() <em>Search Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> searchIncludes;

	/**
	 * The cached value of the '{@link #getSearchRevIncludes() <em>Search Rev Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchRevIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> searchRevIncludes;

	/**
	 * The cached value of the '{@link #getSearchParams() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceRestResourceSearchParam> searchParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceRestResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConformanceRestResource();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE, oldProfile, profile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestResourceResourceInteraction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<ConformanceRestResourceResourceInteraction>(ConformanceRestResourceResourceInteraction.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVersioning() {
		if (versioning != null && versioning.eIsProxy()) {
			InternalEObject oldVersioning = (InternalEObject)versioning;
			versioning = (Code)eResolveProxy(oldVersioning);
			if (versioning != oldVersioning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING, oldVersioning, versioning));
			}
		}
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(Code newVersioning) {
		Code oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING, oldVersioning, versioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getReadHistory() {
		if (readHistory != null && readHistory.eIsProxy()) {
			InternalEObject oldReadHistory = (InternalEObject)readHistory;
			readHistory = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldReadHistory);
			if (readHistory != oldReadHistory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY, oldReadHistory, readHistory));
			}
		}
		return readHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetReadHistory() {
		return readHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadHistory(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newReadHistory) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldReadHistory = readHistory;
		readHistory = newReadHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY, oldReadHistory, readHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getUpdateCreate() {
		if (updateCreate != null && updateCreate.eIsProxy()) {
			InternalEObject oldUpdateCreate = (InternalEObject)updateCreate;
			updateCreate = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldUpdateCreate);
			if (updateCreate != oldUpdateCreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE, oldUpdateCreate, updateCreate));
			}
		}
		return updateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetUpdateCreate() {
		return updateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newUpdateCreate) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldUpdateCreate = updateCreate;
		updateCreate = newUpdateCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE, oldUpdateCreate, updateCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getConditionalCreate() {
		if (conditionalCreate != null && conditionalCreate.eIsProxy()) {
			InternalEObject oldConditionalCreate = (InternalEObject)conditionalCreate;
			conditionalCreate = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldConditionalCreate);
			if (conditionalCreate != oldConditionalCreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE, oldConditionalCreate, conditionalCreate));
			}
		}
		return conditionalCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetConditionalCreate() {
		return conditionalCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newConditionalCreate) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldConditionalCreate = conditionalCreate;
		conditionalCreate = newConditionalCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE, oldConditionalCreate, conditionalCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getConditionalUpdate() {
		if (conditionalUpdate != null && conditionalUpdate.eIsProxy()) {
			InternalEObject oldConditionalUpdate = (InternalEObject)conditionalUpdate;
			conditionalUpdate = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldConditionalUpdate);
			if (conditionalUpdate != oldConditionalUpdate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE, oldConditionalUpdate, conditionalUpdate));
			}
		}
		return conditionalUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetConditionalUpdate() {
		return conditionalUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalUpdate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newConditionalUpdate) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldConditionalUpdate = conditionalUpdate;
		conditionalUpdate = newConditionalUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE, oldConditionalUpdate, conditionalUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConditionalDelete() {
		if (conditionalDelete != null && conditionalDelete.eIsProxy()) {
			InternalEObject oldConditionalDelete = (InternalEObject)conditionalDelete;
			conditionalDelete = (Code)eResolveProxy(oldConditionalDelete);
			if (conditionalDelete != oldConditionalDelete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE, oldConditionalDelete, conditionalDelete));
			}
		}
		return conditionalDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetConditionalDelete() {
		return conditionalDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalDelete(Code newConditionalDelete) {
		Code oldConditionalDelete = conditionalDelete;
		conditionalDelete = newConditionalDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE, oldConditionalDelete, conditionalDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getSearchIncludes() {
		if (searchIncludes == null) {
			searchIncludes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_INCLUDE);
		}
		return searchIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getSearchRevIncludes() {
		if (searchRevIncludes == null) {
			searchRevIncludes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_REV_INCLUDE);
		}
		return searchRevIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceRestResourceSearchParam> getSearchParams() {
		if (searchParams == null) {
			searchParams = new EObjectContainmentEList<ConformanceRestResourceSearchParam>(ConformanceRestResourceSearchParam.class, this, FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM);
		}
		return searchParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParams()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION:
				return getInteractions();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING:
				if (resolve) return getVersioning();
				return basicGetVersioning();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY:
				if (resolve) return getReadHistory();
				return basicGetReadHistory();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE:
				if (resolve) return getUpdateCreate();
				return basicGetUpdateCreate();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE:
				if (resolve) return getConditionalCreate();
				return basicGetConditionalCreate();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE:
				if (resolve) return getConditionalUpdate();
				return basicGetConditionalUpdate();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE:
				if (resolve) return getConditionalDelete();
				return basicGetConditionalDelete();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_INCLUDE:
				return getSearchIncludes();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_REV_INCLUDE:
				return getSearchRevIncludes();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM:
				return getSearchParams();
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends ConformanceRestResourceResourceInteraction>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING:
				setVersioning((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY:
				setReadHistory((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((Code)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_INCLUDE:
				getSearchIncludes().clear();
				getSearchIncludes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevIncludes().clear();
				getSearchRevIncludes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM:
				getSearchParams().clear();
				getSearchParams().addAll((Collection<? extends ConformanceRestResourceSearchParam>)newValue);
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION:
				getInteractions().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING:
				setVersioning((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY:
				setReadHistory((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((Code)null);
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_INCLUDE:
				getSearchIncludes().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevIncludes().clear();
				return;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM:
				getSearchParams().clear();
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
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__TYPE:
				return type != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__PROFILE:
				return profile != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__VERSIONING:
				return versioning != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__READ_HISTORY:
				return readHistory != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__UPDATE_CREATE:
				return updateCreate != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_CREATE:
				return conditionalCreate != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_UPDATE:
				return conditionalUpdate != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__CONDITIONAL_DELETE:
				return conditionalDelete != null;
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_INCLUDE:
				return searchIncludes != null && !searchIncludes.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_REV_INCLUDE:
				return searchRevIncludes != null && !searchRevIncludes.isEmpty();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE__SEARCH_PARAM:
				return searchParams != null && !searchParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceRestResourceImpl
