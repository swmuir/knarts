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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl#getAggregations <em>Aggregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionTypeRefImpl extends BackboneElementImpl implements ElementDefinitionTypeRef {
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
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> profiles;

	/**
	 * The cached value of the '{@link #getAggregations() <em>Aggregation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> aggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionTypeRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION_TYPE_REF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectResolvingEList<Uri>(Uri.class, this, FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getAggregations() {
		if (aggregations == null) {
			aggregations = new EObjectResolvingEList<Code>(Code.class, this, FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__AGGREGATION);
		}
		return aggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__PROFILE:
				return getProfiles();
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__AGGREGATION:
				return getAggregations();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE:
				setCode((Code)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__AGGREGATION:
				getAggregations().clear();
				getAggregations().addAll((Collection<? extends Code>)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE:
				setCode((Code)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__PROFILE:
				getProfiles().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__AGGREGATION:
				getAggregations().clear();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__CODE:
				return code != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF__AGGREGATION:
				return aggregations != null && !aggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionTypeRefImpl
