/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getCancelationReason <em>Cancelation Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getMinutesDuration <em>Minutes Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getSlots <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getRequestedPeriods <em>Requested Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Cancelation Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelation Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelation Reason</em>' containment reference.
	 * @see #setCancelationReason(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_CancelationReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCancelationReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getCancelationReason <em>Cancelation Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelation Reason</em>' containment reference.
	 * @see #getCancelationReason()
	 * @generated
	 */
	void setCancelationReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_ServiceCategory()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceCategories();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_ServiceType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Specialty()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialties();

	/**
	 * Returns the value of the '<em><b>Appointment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointment Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Type</em>' containment reference.
	 * @see #setAppointmentType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_AppointmentType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAppointmentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getAppointmentType <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Type</em>' containment reference.
	 * @see #getAppointmentType()
	 * @generated
	 */
	void setAppointmentType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(UnsignedInt)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Priority()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Description()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_SupportingInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingInformations();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Start()
	 * @model containment="true"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getStart <em>Start</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_End()
	 * @model containment="true"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Minutes Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes Duration</em>' containment reference.
	 * @see #setMinutesDuration(PositiveInt)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_MinutesDuration()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getMinutesDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getMinutesDuration <em>Minutes Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes Duration</em>' containment reference.
	 * @see #getMinutesDuration()
	 * @generated
	 */
	void setMinutesDuration(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Slot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSlots();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Created()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Comment()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #setPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_PatientInstruction()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getPatientInstruction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Appointment#getPatientInstruction <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #getPatientInstruction()
	 * @generated
	 */
	void setPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.AppointmentParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_Participant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AppointmentParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Requested Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Period}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Period</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAppointment_RequestedPeriod()
	 * @model containment="true"
	 * @generated
	 */
	EList<Period> getRequestedPeriods();

} // Appointment
