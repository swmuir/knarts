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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetCompose;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetComposeImpl#getImports <em>Import</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetComposeImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetComposeImpl#getExcludes <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeImpl extends BackboneElementImpl implements ValueSetCompose {
	/**
	 * The cached value of the '{@link #getImports() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> imports;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getValueSetCompose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Uri>(Uri.class, this, FhirResourcePackage.VALUE_SET_COMPOSE__IMPORT);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE:
				return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.VALUE_SET_COMPOSE__IMPORT:
				return getImports();
			case FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE:
				return getIncludes();
			case FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE:
				return getExcludes();
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
			case FhirResourcePackage.VALUE_SET_COMPOSE__IMPORT:
				getImports().clear();
				getImports().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
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
			case FhirResourcePackage.VALUE_SET_COMPOSE__IMPORT:
				getImports().clear();
				return;
			case FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				return;
			case FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
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
			case FhirResourcePackage.VALUE_SET_COMPOSE__IMPORT:
				return imports != null && !imports.isEmpty();
			case FhirResourcePackage.VALUE_SET_COMPOSE__INCLUDE:
				return includes != null && !includes.isEmpty();
			case FhirResourcePackage.VALUE_SET_COMPOSE__EXCLUDE:
				return excludes != null && !excludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeImpl
