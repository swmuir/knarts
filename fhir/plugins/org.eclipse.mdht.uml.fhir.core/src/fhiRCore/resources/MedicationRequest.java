/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Canonical;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicationRequest#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getReportedx <em>Reportedx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getCourseOfTherapyType <em>Course Of Therapy Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getDetectedIssues <em>Detected Issue</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequest#getEventHistories <em>Event History</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest()
 * @model
 * @generated
 */
public interface MedicationRequest extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Intent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getIntent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Not Perform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #setDoNotPerform(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_DoNotPerform()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getDoNotPerform();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getDoNotPerform <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #getDoNotPerform()
	 * @generated
	 */
	void setDoNotPerform(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reportedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reportedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reportedx</em>' containment reference.
	 * @see #setReportedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Reportedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='reported[x]'"
	 * @generated
	 */
	DataType getReportedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getReportedx <em>Reportedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reportedx</em>' containment reference.
	 * @see #getReportedx()
	 * @generated
	 */
	void setReportedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' containment reference.
	 * @see #setMedicationx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Medicationx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	DataType getMedicationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getMedicationx <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' containment reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(DataType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_SupportingInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingInformations();

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authored On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_AuthoredOn()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Requester()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Performer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer Type</em>' containment reference.
	 * @see #setPerformerType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_PerformerType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPerformerType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getPerformerType <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer Type</em>' containment reference.
	 * @see #getPerformerType()
	 * @generated
	 */
	void setPerformerType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Recorder()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Canonical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<Canonical> getInstantiatesCanonicals();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getInstantiatesUris();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_GroupIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Course Of Therapy Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Of Therapy Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Of Therapy Type</em>' containment reference.
	 * @see #setCourseOfTherapyType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_CourseOfTherapyType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCourseOfTherapyType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getCourseOfTherapyType <em>Course Of Therapy Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Of Therapy Type</em>' containment reference.
	 * @see #getCourseOfTherapyType()
	 * @generated
	 */
	void setCourseOfTherapyType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Insurance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getInsurances();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Dosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_DosageInstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dosage> getDosageInstructions();

	/**
	 * Returns the value of the '<em><b>Dispense Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispense Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispense Request</em>' containment reference.
	 * @see #setDispenseRequest(MedicationRequestDispenseRequest)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_DispenseRequest()
	 * @model containment="true"
	 * @generated
	 */
	MedicationRequestDispenseRequest getDispenseRequest();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense Request</em>' containment reference.
	 * @see #getDispenseRequest()
	 * @generated
	 */
	void setDispenseRequest(MedicationRequestDispenseRequest value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationRequestSubstitution)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_Substitution()
	 * @model containment="true"
	 * @generated
	 */
	MedicationRequestSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationRequestSubstitution value);

	/**
	 * Returns the value of the '<em><b>Prior Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #setPriorPrescription(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_PriorPrescription()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPriorPrescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #getPriorPrescription()
	 * @generated
	 */
	void setPriorPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Detected Issue</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detected Issue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detected Issue</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_DetectedIssue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDetectedIssues();

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequest_EventHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEventHistories();

} // MedicationRequest
