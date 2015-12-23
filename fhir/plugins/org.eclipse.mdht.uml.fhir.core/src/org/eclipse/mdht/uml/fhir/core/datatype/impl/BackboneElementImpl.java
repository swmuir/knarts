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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Extension;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backbone Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl#getModifierExtensions <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackboneElementImpl extends DataTypeImpl implements BackboneElement {
	/**
	 * The cached value of the '{@link #getModifierExtensions() <em>Modifier Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackboneElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.BACKBONE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getModifierExtensions() {
		if (modifierExtensions == null) {
			modifierExtensions = new EObjectResolvingEList<Extension>(Extension.class, this, FhirDatatypePackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION);
		}
		return modifierExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				return getModifierExtensions();
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
			case FhirDatatypePackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
				getModifierExtensions().addAll((Collection<? extends Extension>)newValue);
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
			case FhirDatatypePackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				getModifierExtensions().clear();
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
			case FhirDatatypePackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				return modifierExtensions != null && !modifierExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BackboneElementImpl
