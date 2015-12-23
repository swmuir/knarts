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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getParticipantTypes <em>Participant Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse()
 * @model
 * @generated
 */
public interface AppointmentResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' reference.
	 * @see #setAppointment(Appointment)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_Appointment()
	 * @model required="true"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getAppointment <em>Appointment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_Start()
	 * @model
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_End()
	 * @model
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Type</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_ParticipantType()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getParticipantTypes();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_Actor()
	 * @model
	 * @generated
	 */
	Resource getActor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Resource value);

	/**
	 * Returns the value of the '<em><b>Participant Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Status</em>' reference.
	 * @see #setParticipantStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_ParticipantStatus()
	 * @model required="true"
	 * @generated
	 */
	Code getParticipantStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Status</em>' reference.
	 * @see #getParticipantStatus()
	 * @generated
	 */
	void setParticipantStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference.
	 * @see #setComment(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAppointmentResponse_Comment()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AppointmentResponse#getComment <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // AppointmentResponse
