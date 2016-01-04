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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElementTargetElement;
import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElementTargetElementOtherElement;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Source Element Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getDependsOns <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapSourceElementTargetElementImpl#getProducts <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapSourceElementTargetElementImpl extends BackboneElementImpl implements ConceptMapSourceElementTargetElement {
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
	 * The cached value of the '{@link #getEquivalence() <em>Equivalence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalence()
	 * @generated
	 * @ordered
	 */
	protected Code equivalence;

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
	 * The cached value of the '{@link #getDependsOns() <em>Depends On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOns()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapSourceElementTargetElementOtherElement> dependsOns;

	/**
	 * The cached value of the '{@link #getProducts() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapSourceElementTargetElementOtherElement> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapSourceElementTargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConceptMapSourceElementTargetElement();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM, oldCodeSystem, codeSystem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getEquivalence() {
		if (equivalence != null && equivalence.eIsProxy()) {
			InternalEObject oldEquivalence = (InternalEObject)equivalence;
			equivalence = (Code)eResolveProxy(oldEquivalence);
			if (equivalence != oldEquivalence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, oldEquivalence, equivalence));
			}
		}
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetEquivalence() {
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalence(Code newEquivalence) {
		Code oldEquivalence = equivalence;
		equivalence = newEquivalence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, oldEquivalence, equivalence));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapSourceElementTargetElementOtherElement> getDependsOns() {
		if (dependsOns == null) {
			dependsOns = new EObjectContainmentEList<ConceptMapSourceElementTargetElementOtherElement>(ConceptMapSourceElementTargetElementOtherElement.class, this, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON);
		}
		return dependsOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapSourceElementTargetElementOtherElement> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<ConceptMapSourceElementTargetElementOtherElement>(ConceptMapSourceElementTargetElementOtherElement.class, this, FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOns()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM:
				if (resolve) return getCodeSystem();
				return basicGetCodeSystem();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				if (resolve) return getEquivalence();
				return basicGetEquivalence();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS:
				if (resolve) return getComments();
				return basicGetComments();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return getDependsOns();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return getProducts();
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				setCode((Code)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				setEquivalence((Code)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				getDependsOns().clear();
				getDependsOns().addAll((Collection<? extends ConceptMapSourceElementTargetElementOtherElement>)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				getProducts().clear();
				getProducts().addAll((Collection<? extends ConceptMapSourceElementTargetElementOtherElement>)newValue);
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM:
				setCodeSystem((Uri)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				setCode((Code)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				setEquivalence((Code)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS:
				setComments((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				getDependsOns().clear();
				return;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				getProducts().clear();
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
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE_SYSTEM:
				return codeSystem != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				return code != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				return equivalence != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENTS:
				return comments != null;
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return dependsOns != null && !dependsOns.isEmpty();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapSourceElementTargetElementImpl
