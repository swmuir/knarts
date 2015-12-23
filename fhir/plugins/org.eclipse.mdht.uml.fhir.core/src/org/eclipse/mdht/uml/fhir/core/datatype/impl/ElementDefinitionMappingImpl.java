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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionMappingImpl extends BackboneElementImpl implements ElementDefinitionMapping {
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
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String map;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION_MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY, oldIdentity, identity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY, oldIdentity, identity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject)map;
			map = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(org.eclipse.mdht.uml.fhir.core.datatype.String newMap) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP:
				if (resolve) return getMap();
				return basicGetMap();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP:
				setMap((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY:
				setIdentity((Id)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE:
				setLanguage((Code)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP:
				setMap((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__IDENTITY:
				return identity != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__LANGUAGE:
				return language != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING__MAP:
				return map != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionMappingImpl
