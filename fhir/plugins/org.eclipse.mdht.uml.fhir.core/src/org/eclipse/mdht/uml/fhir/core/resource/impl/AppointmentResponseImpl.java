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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.Appointment;
import org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getParticipantTypes <em>Participant Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AppointmentResponseImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentResponseImpl extends DomainResourceImpl implements AppointmentResponse {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Appointment appointment;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getParticipantTypes() <em>Participant Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> participantTypes;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Resource actor;

	/**
	 * The cached value of the '{@link #getParticipantStatus() <em>Participant Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantStatus()
	 * @generated
	 * @ordered
	 */
	protected Code participantStatus;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAppointmentResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.APPOINTMENT_RESPONSE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment getAppointment() {
		if (appointment != null && appointment.eIsProxy()) {
			InternalEObject oldAppointment = (InternalEObject)appointment;
			appointment = (Appointment)eResolveProxy(oldAppointment);
			if (appointment != oldAppointment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT, oldAppointment, appointment));
			}
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment basicGetAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Appointment newAppointment) {
		Appointment oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT, oldAppointment, appointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Instant)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Instant)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getParticipantTypes() {
		if (participantTypes == null) {
			participantTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE);
		}
		return participantTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Resource)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Resource newActor) {
		Resource oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getParticipantStatus() {
		if (participantStatus != null && participantStatus.eIsProxy()) {
			InternalEObject oldParticipantStatus = (InternalEObject)participantStatus;
			participantStatus = (Code)eResolveProxy(oldParticipantStatus);
			if (participantStatus != oldParticipantStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, oldParticipantStatus, participantStatus));
			}
		}
		return participantStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetParticipantStatus() {
		return participantStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantStatus(Code newParticipantStatus) {
		Code oldParticipantStatus = participantStatus;
		participantStatus = newParticipantStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS, oldParticipantStatus, participantStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject)comment;
			comment = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.eclipse.mdht.uml.fhir.core.datatype.String newComment) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				if (resolve) return getAppointment();
				return basicGetAppointment();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return getParticipantTypes();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				if (resolve) return getParticipantStatus();
				return basicGetParticipantStatus();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT:
				if (resolve) return getComment();
				return basicGetComment();
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
			case FhirResourcePackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				getParticipantTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Resource)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((Code)newValue);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__START:
				setStart((Instant)null);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__END:
				setEnd((Instant)null);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				getParticipantTypes().clear();
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR:
				setActor((Resource)null);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				setParticipantStatus((Code)null);
				return;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.APPOINTMENT_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__APPOINTMENT:
				return appointment != null;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__START:
				return start != null;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__END:
				return end != null;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_TYPE:
				return participantTypes != null && !participantTypes.isEmpty();
			case FhirResourcePackage.APPOINTMENT_RESPONSE__ACTOR:
				return actor != null;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__PARTICIPANT_STATUS:
				return participantStatus != null;
			case FhirResourcePackage.APPOINTMENT_RESPONSE__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentResponseImpl
