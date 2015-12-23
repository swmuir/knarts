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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.DiagnosticOrderEvent;
import org.eclipse.mdht.uml.fhir.core.resource.DiagnosticOrderItem;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Specimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticOrderItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticOrderItemImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticOrderItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticOrderItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DiagnosticOrderItemImpl#getEvents <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticOrderItemImpl extends BackboneElementImpl implements DiagnosticOrderItem {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> specimens;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticOrderEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticOrderItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDiagnosticOrderItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectResolvingEList<Specimen>(Specimen.class, this, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (CodeableConcept)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticOrderEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<DiagnosticOrderEvent>(DiagnosticOrderEvent.class, this, FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				return getSpecimens();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return getEvents();
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
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Specimen>)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DiagnosticOrderEvent>)newValue);
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
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				getSpecimens().clear();
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				getEvents().clear();
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
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__CODE:
				return code != null;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__BODY_SITE:
				return bodySite != null;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__STATUS:
				return status != null;
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM__EVENT:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticOrderItemImpl
