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

import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceRepositoryImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceRepositoryImpl#getVariantId <em>Variant Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceRepositoryImpl#getReadGroupSetId <em>Read Group Set Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceRepositoryImpl extends BackboneElementImpl implements SequenceRepository {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Uri structure;

	/**
	 * The cached value of the '{@link #getVariantId() <em>Variant Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String variantId;

	/**
	 * The cached value of the '{@link #getReadGroupSetId() <em>Read Group Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadGroupSetId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String readGroupSetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSequenceRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_REPOSITORY__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_REPOSITORY__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_REPOSITORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getStructure() {
		if (structure != null && structure.eIsProxy()) {
			InternalEObject oldStructure = (InternalEObject)structure;
			structure = (Uri)eResolveProxy(oldStructure);
			if (structure != oldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE, oldStructure, structure));
			}
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Uri newStructure) {
		Uri oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVariantId() {
		if (variantId != null && variantId.eIsProxy()) {
			InternalEObject oldVariantId = (InternalEObject)variantId;
			variantId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVariantId);
			if (variantId != oldVariantId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID, oldVariantId, variantId));
			}
		}
		return variantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVariantId() {
		return variantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantId(org.eclipse.mdht.uml.fhir.core.datatype.String newVariantId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVariantId = variantId;
		variantId = newVariantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID, oldVariantId, variantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getReadGroupSetId() {
		if (readGroupSetId != null && readGroupSetId.eIsProxy()) {
			InternalEObject oldReadGroupSetId = (InternalEObject)readGroupSetId;
			readGroupSetId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldReadGroupSetId);
			if (readGroupSetId != oldReadGroupSetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, oldReadGroupSetId, readGroupSetId));
			}
		}
		return readGroupSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetReadGroupSetId() {
		return readGroupSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadGroupSetId(org.eclipse.mdht.uml.fhir.core.datatype.String newReadGroupSetId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldReadGroupSetId = readGroupSetId;
		readGroupSetId = newReadGroupSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, oldReadGroupSetId, readGroupSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.SEQUENCE_REPOSITORY__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.SEQUENCE_REPOSITORY__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE:
				if (resolve) return getStructure();
				return basicGetStructure();
			case FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				if (resolve) return getVariantId();
				return basicGetVariantId();
			case FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				if (resolve) return getReadGroupSetId();
				return basicGetReadGroupSetId();
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
			case FhirResourcePackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE:
				setStructure((Uri)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				setReadGroupSetId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE:
				setStructure((Uri)null);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				setReadGroupSetId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.SEQUENCE_REPOSITORY__URL:
				return url != null;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__NAME:
				return name != null;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__STRUCTURE:
				return structure != null;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return variantId != null;
			case FhirResourcePackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				return readGroupSetId != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceRepositoryImpl
