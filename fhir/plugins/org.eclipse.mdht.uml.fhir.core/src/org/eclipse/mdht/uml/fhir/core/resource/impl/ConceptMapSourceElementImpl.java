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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement;
import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElementTargetElement;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementImpl#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapSourceElementImpl extends BackboneElementImpl implements ConceptMapSourceElement {
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
	protected Code code;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapSourceElementTargetElement> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapSourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConceptMapSourceElement();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapSourceElementTargetElement> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<ConceptMapSourceElementTargetElement>(ConceptMapSourceElementTargetElement.class, this, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM:
				if (resolve) return getCodeSystem();
				return basicGetCodeSystem();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET:
				return getTargets();
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE:
				setCode((Code)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends ConceptMapSourceElementTargetElement>)newValue);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE:
				setCode((Code)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET:
				getTargets().clear();
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE_SYSTEM:
				return codeSystem != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__CODE:
				return code != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT__TARGET:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapSourceElementImpl
