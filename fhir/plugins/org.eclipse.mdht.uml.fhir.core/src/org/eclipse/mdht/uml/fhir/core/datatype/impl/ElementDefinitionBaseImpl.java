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

import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionBaseImpl extends BackboneElementImpl implements ElementDefinitionBase {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String path;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.eclipse.mdht.uml.fhir.core.datatype.String newPath) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer newMin) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.eclipse.mdht.uml.fhir.core.datatype.String newMax) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX:
				if (resolve) return getMax();
				return basicGetMax();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__PATH:
				return path != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MIN:
				return min != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionBaseImpl
