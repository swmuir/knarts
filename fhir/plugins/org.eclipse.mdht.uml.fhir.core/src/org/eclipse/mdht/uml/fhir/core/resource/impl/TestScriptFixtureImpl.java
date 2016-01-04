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

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptFixture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptFixtureImpl#getAutocreate <em>Autocreate</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptFixtureImpl#getAutodelete <em>Autodelete</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptFixtureImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptFixtureImpl extends BackboneElementImpl implements TestScriptFixture {
	/**
	 * The cached value of the '{@link #getAutocreate() <em>Autocreate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutocreate()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean autocreate;

	/**
	 * The cached value of the '{@link #getAutodelete() <em>Autodelete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutodelete()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean autodelete;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptFixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getTestScriptFixture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getAutocreate() {
		if (autocreate != null && autocreate.eIsProxy()) {
			InternalEObject oldAutocreate = (InternalEObject)autocreate;
			autocreate = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldAutocreate);
			if (autocreate != oldAutocreate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, oldAutocreate, autocreate));
			}
		}
		return autocreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetAutocreate() {
		return autocreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutocreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newAutocreate) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldAutocreate = autocreate;
		autocreate = newAutocreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, oldAutocreate, autocreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getAutodelete() {
		if (autodelete != null && autodelete.eIsProxy()) {
			InternalEObject oldAutodelete = (InternalEObject)autodelete;
			autodelete = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldAutodelete);
			if (autodelete != oldAutodelete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE, oldAutodelete, autodelete));
			}
		}
		return autodelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetAutodelete() {
		return autodelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutodelete(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newAutodelete) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldAutodelete = autodelete;
		autodelete = newAutodelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE, oldAutodelete, autodelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				if (resolve) return getAutocreate();
				return basicGetAutocreate();
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				if (resolve) return getAutodelete();
				return basicGetAutodelete();
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				setAutocreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				setAutodelete((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				setResource((Resource)newValue);
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
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				setAutocreate((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				setAutodelete((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				setResource((Resource)null);
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
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				return autocreate != null;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				return autodelete != null;
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptFixtureImpl
