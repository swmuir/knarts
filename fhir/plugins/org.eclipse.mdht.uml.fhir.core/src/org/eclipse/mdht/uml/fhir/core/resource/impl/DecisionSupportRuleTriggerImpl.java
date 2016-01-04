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

import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportRuleTrigger;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleTriggerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleTriggerImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleTriggerImpl#getEventTimingx <em>Event Timingx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportRuleTriggerImpl extends BackboneElementImpl implements DecisionSupportRuleTrigger {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String eventName;

	/**
	 * The cached value of the '{@link #getEventTimingx() <em>Event Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingx()
	 * @generated
	 * @ordered
	 */
	protected Base eventTimingx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportRuleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDecisionSupportRuleTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getEventName() {
		if (eventName != null && eventName.eIsProxy()) {
			InternalEObject oldEventName = (InternalEObject)eventName;
			eventName = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldEventName);
			if (eventName != oldEventName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME, oldEventName, eventName));
			}
		}
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(org.eclipse.mdht.uml.fhir.core.datatype.String newEventName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getEventTimingx() {
		if (eventTimingx != null && eventTimingx.eIsProxy()) {
			InternalEObject oldEventTimingx = (InternalEObject)eventTimingx;
			eventTimingx = (Base)eResolveProxy(oldEventTimingx);
			if (eventTimingx != oldEventTimingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX, oldEventTimingx, eventTimingx));
			}
		}
		return eventTimingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetEventTimingx() {
		return eventTimingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingx(Base newEventTimingx) {
		Base oldEventTimingx = eventTimingx;
		eventTimingx = newEventTimingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX, oldEventTimingx, eventTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME:
				if (resolve) return getEventName();
				return basicGetEventName();
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX:
				if (resolve) return getEventTimingx();
				return basicGetEventTimingx();
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME:
				setEventName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX:
				setEventTimingx((Base)newValue);
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME:
				setEventName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX:
				setEventTimingx((Base)null);
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__TYPE:
				return type != null;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_NAME:
				return eventName != null;
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER__EVENT_TIMINGX:
				return eventTimingx != null;
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportRuleTriggerImpl
