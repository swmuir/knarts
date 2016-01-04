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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureFocalDeviceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcedureFocalDeviceImpl#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureFocalDeviceImpl extends BackboneElementImpl implements ProcedureFocalDevice {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept action;

	/**
	 * The cached value of the '{@link #getManipulated() <em>Manipulated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulated()
	 * @generated
	 * @ordered
	 */
	protected Device manipulated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureFocalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getProcedureFocalDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (CodeableConcept)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(CodeableConcept newAction) {
		CodeableConcept oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getManipulated() {
		if (manipulated != null && manipulated.eIsProxy()) {
			InternalEObject oldManipulated = (InternalEObject)manipulated;
			manipulated = (Device)eResolveProxy(oldManipulated);
			if (manipulated != oldManipulated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, oldManipulated, manipulated));
			}
		}
		return manipulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetManipulated() {
		return manipulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManipulated(Device newManipulated) {
		Device oldManipulated = manipulated;
		manipulated = newManipulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED, oldManipulated, manipulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				if (resolve) return getManipulated();
				return basicGetManipulated();
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
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				setAction((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				setManipulated((Device)newValue);
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
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				setAction((CodeableConcept)null);
				return;
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				setManipulated((Device)null);
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
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__ACTION:
				return action != null;
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE__MANIPULATED:
				return manipulated != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureFocalDeviceImpl
