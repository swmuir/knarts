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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileCodeSystemCodeSystemInclude;
import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Code System Code System Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileCodeSystemCodeSystemIncludeImpl#getCodeSystems <em>Code System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileCodeSystemCodeSystemIncludeImpl extends BackboneElementImpl implements ExpansionProfileCodeSystemCodeSystemInclude {
	/**
	 * The cached value of the '{@link #getCodeSystems() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem> codeSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileCodeSystemCodeSystemIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExpansionProfileCodeSystemCodeSystemInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem> getCodeSystems() {
		if (codeSystems == null) {
			codeSystems = new EObjectContainmentEList<ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem>(ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem.class, this, FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM);
		}
		return codeSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystems()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM:
				return getCodeSystems();
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
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM:
				getCodeSystems().clear();
				getCodeSystems().addAll((Collection<? extends ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem>)newValue);
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
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM:
				getCodeSystems().clear();
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
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE__CODE_SYSTEM:
				return codeSystems != null && !codeSystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileCodeSystemCodeSystemIncludeImpl
