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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventEventImpl#getPurposeOfEvents <em>Purpose Of Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventEventImpl extends BackboneElementImpl implements AuditEventEvent {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subtypes;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Code action;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Instant dateTime;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getOutcomeDesc() <em>Outcome Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeDesc()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String outcomeDesc;

	/**
	 * The cached value of the '{@link #getPurposeOfEvents() <em>Purpose Of Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposeOfEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAuditEventEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.AUDIT_EVENT_EVENT__SUBTYPE);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Code)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Code newAction) {
		Code oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getDateTime() {
		if (dateTime != null && dateTime.eIsProxy()) {
			InternalEObject oldDateTime = (InternalEObject)dateTime;
			dateTime = (Instant)eResolveProxy(oldDateTime);
			if (dateTime != oldDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME, oldDateTime, dateTime));
			}
		}
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Instant newDateTime) {
		Instant oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (Code)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getOutcomeDesc() {
		if (outcomeDesc != null && outcomeDesc.eIsProxy()) {
			InternalEObject oldOutcomeDesc = (InternalEObject)outcomeDesc;
			outcomeDesc = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldOutcomeDesc);
			if (outcomeDesc != oldOutcomeDesc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, oldOutcomeDesc, outcomeDesc));
			}
		}
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetOutcomeDesc() {
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcomeDesc(org.eclipse.mdht.uml.fhir.core.datatype.String newOutcomeDesc) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldOutcomeDesc = outcomeDesc;
		outcomeDesc = newOutcomeDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC, oldOutcomeDesc, outcomeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposeOfEvents() {
		if (purposeOfEvents == null) {
			purposeOfEvents = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT);
		}
		return purposeOfEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__SUBTYPE:
				return getSubtypes();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME:
				if (resolve) return getDateTime();
				return basicGetDateTime();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				if (resolve) return getOutcomeDesc();
				return basicGetOutcomeDesc();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				return getPurposeOfEvents();
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
			case FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__SUBTYPE:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION:
				setAction((Code)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME:
				setDateTime((Instant)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
				getPurposeOfEvents().addAll((Collection<? extends Coding>)newValue);
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
			case FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__SUBTYPE:
				getSubtypes().clear();
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION:
				setAction((Code)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME:
				setDateTime((Instant)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME:
				setOutcome((Code)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
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
			case FhirResourcePackage.AUDIT_EVENT_EVENT__TYPE:
				return type != null;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__SUBTYPE:
				return subtypes != null && !subtypes.isEmpty();
			case FhirResourcePackage.AUDIT_EVENT_EVENT__ACTION:
				return action != null;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__DATE_TIME:
				return dateTime != null;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME:
				return outcome != null;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__OUTCOME_DESC:
				return outcomeDesc != null;
			case FhirResourcePackage.AUDIT_EVENT_EVENT__PURPOSE_OF_EVENT:
				return purposeOfEvents != null && !purposeOfEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventEventImpl
