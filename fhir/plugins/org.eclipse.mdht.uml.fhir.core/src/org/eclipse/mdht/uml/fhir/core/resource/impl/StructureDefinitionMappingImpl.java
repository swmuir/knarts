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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Id;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinitionMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionMappingImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionMappingImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionMappingImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDefinitionMappingImpl extends BackboneElementImpl implements StructureDefinitionMapping {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Id identity;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected Uri uri;

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
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getStructureDefinitionMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getIdentity() {
		if (identity != null && identity.eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (Id)eResolveProxy(oldIdentity);
			if (identity != oldIdentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, oldIdentity, identity));
			}
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Id newIdentity) {
		Id oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUri() {
		if (uri != null && uri.eIsProxy()) {
			InternalEObject oldUri = (InternalEObject)uri;
			uri = (Uri)eResolveProxy(oldUri);
			if (uri != oldUri) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI, oldUri, uri));
			}
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(Uri newUri) {
		Uri oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI, oldUri, uri));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getComments() {
		if (comments != null && comments.eIsProxy()) {
			InternalEObject oldComments = (InternalEObject)comments;
			comments = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldComments);
			if (comments != oldComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, oldComments, comments));
			}
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.eclipse.mdht.uml.fhir.core.datatype.String newComments) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI:
				if (resolve) return getUri();
				return basicGetUri();
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				if (resolve) return getComments();
				return basicGetComments();
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
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI:
				setUri((Uri)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI:
				setUri((Uri)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__IDENTITY:
				return identity != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__URI:
				return uri != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__NAME:
				return name != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING__COMMENTS:
				return comments != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDefinitionMappingImpl
