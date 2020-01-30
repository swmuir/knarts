/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getEnd <em>End</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getParticipantTypes <em>Participant Type</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getActor <em>Actor</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}</li>
 *   <li>{@link fhiRCore.resources.AppointmentResponse#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse()
 * @model
 * @generated
 */
public interface AppointmentResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_Appointment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getAppointment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_Start()
	 * @model containment="true"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_End()
	 * @model containment="true"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Participant Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_ParticipantType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getParticipantTypes();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_Actor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>Participant Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Status</em>' containment reference.
	 * @see #setParticipantStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_ParticipantStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getParticipantStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getParticipantStatus <em>Participant Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Status</em>' containment reference.
	 * @see #getParticipantStatus()
	 * @generated
	 */
	void setParticipantStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAppointmentResponse_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AppointmentResponse#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // AppointmentResponse
