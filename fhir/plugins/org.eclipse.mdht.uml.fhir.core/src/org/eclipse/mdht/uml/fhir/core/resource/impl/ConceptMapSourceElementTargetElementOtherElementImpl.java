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

import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElementTargetElementOtherElement;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Source Element Target Element Other Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementOtherElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementOtherElementImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementOtherElementImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapSourceElementTargetElementOtherElementImpl extends BackboneElementImpl implements ConceptMapSourceElementTargetElementOtherElement {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Uri element;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri codeSystem;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapSourceElementTargetElementOtherElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConceptMapSourceElementTargetElementOtherElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Uri)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Uri newElement) {
		Uri oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getCodeSystem() {
		if (codeSystem != null && codeSystem.eIsProxy()) {
			InternalEObject oldCodeSystem = (InternalEObject)codeSystem;
			codeSystem = (Uri)eResolveProxy(oldCodeSystem);
			if (codeSystem != oldCodeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
			}
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(Uri newCodeSystem) {
		Uri oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(org.eclipse.mdht.uml.fhir.core.datatype.String newCode) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM:
				if (resolve) return getCodeSystem();
				return basicGetCodeSystem();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT:
				setElement((Uri)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				setCode((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT:
				setElement((Uri)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				setCode((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__ELEMENT:
				return element != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE_SYSTEM:
				return codeSystem != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapSourceElementTargetElementOtherElementImpl
