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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImplementationGuidePackageResource;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Package Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImplementationGuidePackageResourceImpl#getExampleFor <em>Example For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuidePackageResourceImpl extends BackboneElementImpl implements ImplementationGuidePackageResource {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Code purpose;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String acronym;

	/**
	 * The cached value of the '{@link #getSourcex() <em>Sourcex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcex()
	 * @generated
	 * @ordered
	 */
	protected Base sourcex;

	/**
	 * The cached value of the '{@link #getExampleFor() <em>Example For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFor()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition exampleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuidePackageResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImplementationGuidePackageResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPurpose() {
		if (purpose != null && purpose.eIsProxy()) {
			InternalEObject oldPurpose = (InternalEObject)purpose;
			purpose = (Code)eResolveProxy(oldPurpose);
			if (purpose != oldPurpose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE, oldPurpose, purpose));
			}
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(Code newPurpose) {
		Code oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE, oldPurpose, purpose));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getAcronym() {
		if (acronym != null && acronym.eIsProxy()) {
			InternalEObject oldAcronym = (InternalEObject)acronym;
			acronym = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldAcronym);
			if (acronym != oldAcronym) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM, oldAcronym, acronym));
			}
		}
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(org.eclipse.mdht.uml.fhir.core.datatype.String newAcronym) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getSourcex() {
		if (sourcex != null && sourcex.eIsProxy()) {
			InternalEObject oldSourcex = (InternalEObject)sourcex;
			sourcex = (Base)eResolveProxy(oldSourcex);
			if (sourcex != oldSourcex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX, oldSourcex, sourcex));
			}
		}
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetSourcex() {
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcex(Base newSourcex) {
		Base oldSourcex = sourcex;
		sourcex = newSourcex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX, oldSourcex, sourcex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getExampleFor() {
		if (exampleFor != null && exampleFor.eIsProxy()) {
			InternalEObject oldExampleFor = (InternalEObject)exampleFor;
			exampleFor = (StructureDefinition)eResolveProxy(oldExampleFor);
			if (exampleFor != oldExampleFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR, oldExampleFor, exampleFor));
			}
		}
		return exampleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetExampleFor() {
		return exampleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleFor(StructureDefinition newExampleFor) {
		StructureDefinition oldExampleFor = exampleFor;
		exampleFor = newExampleFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR, oldExampleFor, exampleFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE:
				if (resolve) return getPurpose();
				return basicGetPurpose();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				if (resolve) return getAcronym();
				return basicGetAcronym();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				if (resolve) return getSourcex();
				return basicGetSourcex();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				if (resolve) return getExampleFor();
				return basicGetExampleFor();
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
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE:
				setPurpose((Code)newValue);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				setAcronym((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				setSourcex((Base)newValue);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((StructureDefinition)newValue);
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
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE:
				setPurpose((Code)null);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				setAcronym((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				setSourcex((Base)null);
				return;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((StructureDefinition)null);
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
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__PURPOSE:
				return purpose != null;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				return name != null;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				return acronym != null;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				return sourcex != null;
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				return exampleFor != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuidePackageResourceImpl
