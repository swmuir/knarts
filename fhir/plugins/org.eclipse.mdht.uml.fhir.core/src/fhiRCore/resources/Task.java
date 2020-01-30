/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Task#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getBusinessStatus <em>Business Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getFocus <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getFor <em>For</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getExecutionPeriod <em>Execution Period</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getPerformerTypes <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getRelevantHistories <em>Relevant History</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getInputs <em>Input</em>}</li>
 *   <li>{@link fhiRCore.resources.Task#getOutputs <em>Output</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(ActivityDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	ActivityDefinition getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #getInstantiatesCanonical()
	 * @generated
	 */
	void setInstantiatesCanonical(ActivityDefinition value);

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_BasedOn()
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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_GroupIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTask_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Business Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Status</em>' containment reference.
	 * @see #setBusinessStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_BusinessStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBusinessStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getBusinessStatus <em>Business Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Status</em>' containment reference.
	 * @see #getBusinessStatus()
	 * @generated
	 */
	void setBusinessStatus(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Intent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getIntent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Focus()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_For()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Execution Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Period</em>' containment reference.
	 * @see #setExecutionPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_ExecutionPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getExecutionPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getExecutionPeriod <em>Execution Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Period</em>' containment reference.
	 * @see #getExecutionPeriod()
	 * @generated
	 */
	void setExecutionPeriod(Period value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_AuthoredOn()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_LastModified()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getLastModified();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Requester()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTask_PerformerType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPerformerTypes();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Owner()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference.
	 * @see #setReasonCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReasonCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getReasonCode <em>Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Code</em>' containment reference.
	 * @see #getReasonCode()
	 * @generated
	 */
	void setReasonCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference.
	 * @see #setReasonReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReasonReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getReasonReference <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Reference</em>' containment reference.
	 * @see #getReasonReference()
	 * @generated
	 */
	void setReasonReference(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Insurance()
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
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Relevant History</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTask_RelevantHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRelevantHistories();

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(TaskRestriction)
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	TaskRestriction getRestriction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Task#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(TaskRestriction value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TaskParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskParameter> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTask_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskOutput> getOutputs();

} // Task
