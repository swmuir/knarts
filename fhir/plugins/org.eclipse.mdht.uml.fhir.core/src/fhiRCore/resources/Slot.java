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
 * A representation of the model object '<em><b>Slot</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Slot#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getEnd <em>End</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link fhiRCore.resources.Slot#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_ServiceCategory()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceCategories();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_ServiceType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Specialty()
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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_AppointmentType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAppointmentType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getAppointmentType <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Type</em>' containment reference.
	 * @see #getAppointmentType()
	 * @generated
	 */
	void setAppointmentType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Schedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSchedule();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instant getStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getStart <em>Start</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Overbooked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overbooked</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overbooked</em>' containment reference.
	 * @see #setOverbooked(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Overbooked()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getOverbooked();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getOverbooked <em>Overbooked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overbooked</em>' containment reference.
	 * @see #getOverbooked()
	 * @generated
	 */
	void setOverbooked(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSlot_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Slot#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // Slot
