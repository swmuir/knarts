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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.resource.AuditEvent;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventObject;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventParticipant;
import org.eclipse.mdht.uml.fhir.core.resource.AuditEventSource;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AuditEventImpl#getObjects <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventImpl extends DomainResourceImpl implements AuditEvent {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected AuditEventEvent event;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventParticipant> participants;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSource source;

	/**
	 * The cached value of the '{@link #getObjects() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventObject> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAuditEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEvent getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(AuditEventEvent newEvent, NotificationChain msgs) {
		AuditEventEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(AuditEventEvent newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<AuditEventParticipant>(AuditEventParticipant.class, this, FhirResourcePackage.AUDIT_EVENT__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AuditEventSource newSource, NotificationChain msgs) {
		AuditEventSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AuditEventSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.AUDIT_EVENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.AUDIT_EVENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<AuditEventObject>(AuditEventObject.class, this, FhirResourcePackage.AUDIT_EVENT__OBJECT);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.AUDIT_EVENT__EVENT:
				return basicSetEvent(null, msgs);
			case FhirResourcePackage.AUDIT_EVENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.AUDIT_EVENT__SOURCE:
				return basicSetSource(null, msgs);
			case FhirResourcePackage.AUDIT_EVENT__OBJECT:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.AUDIT_EVENT__EVENT:
				return getEvent();
			case FhirResourcePackage.AUDIT_EVENT__PARTICIPANT:
				return getParticipants();
			case FhirResourcePackage.AUDIT_EVENT__SOURCE:
				return getSource();
			case FhirResourcePackage.AUDIT_EVENT__OBJECT:
				return getObjects();
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
			case FhirResourcePackage.AUDIT_EVENT__EVENT:
				setEvent((AuditEventEvent)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends AuditEventParticipant>)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)newValue);
				return;
			case FhirResourcePackage.AUDIT_EVENT__OBJECT:
				getObjects().clear();
				getObjects().addAll((Collection<? extends AuditEventObject>)newValue);
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
			case FhirResourcePackage.AUDIT_EVENT__EVENT:
				setEvent((AuditEventEvent)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT__PARTICIPANT:
				getParticipants().clear();
				return;
			case FhirResourcePackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)null);
				return;
			case FhirResourcePackage.AUDIT_EVENT__OBJECT:
				getObjects().clear();
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
			case FhirResourcePackage.AUDIT_EVENT__EVENT:
				return event != null;
			case FhirResourcePackage.AUDIT_EVENT__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case FhirResourcePackage.AUDIT_EVENT__SOURCE:
				return source != null;
			case FhirResourcePackage.AUDIT_EVENT__OBJECT:
				return objects != null && !objects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventImpl
