/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Communication#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getInResponseTos <em>In Response To</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getMediums <em>Medium</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getTopic <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getAbouts <em>About</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getSent <em>Sent</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getReceived <em>Received</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getSender <em>Sender</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getPayloads <em>Payload</em>}</li>
 *   <li>{@link fhiRCore.resources.Communication#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinition> getInstantiatesCanonicals();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_InstantiatesUri()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

	/**
	 * Returns the value of the '<em><b>In Response To</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Response To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Response To</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_InResponseTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getInResponseTos();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Category()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Medium()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getMediums();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Topic()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTopic();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>About</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_About()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAbouts();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Sent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent</em>' containment reference.
	 * @see #setSent(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Sent()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getSent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getSent <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent</em>' containment reference.
	 * @see #getSent()
	 * @generated
	 */
	void setSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received</em>' containment reference.
	 * @see #setReceived(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Received()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getReceived();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getReceived <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received</em>' containment reference.
	 * @see #getReceived()
	 * @generated
	 */
	void setReceived(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Recipient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRecipients();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Sender()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Communication#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_ReasonCode()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CommunicationPayload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Payload()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationPayload> getPayloads();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCommunication_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // Communication
