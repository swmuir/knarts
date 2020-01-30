/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getContextLinkIds <em>Context Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getRequesters <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getRequesterLinkIds <em>Requester Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getPerformerTypes <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getPerformerRole <em>Performer Role</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getPerformerLinkIds <em>Performer Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getReasonLinkIds <em>Reason Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermAction#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Term_Action'"
 * @generated
 */
public interface ContractTermAction extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_DoNotPerform()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getDoNotPerform();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getDoNotPerform <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #getDoNotPerform()
	 * @generated
	 */
	void setDoNotPerform(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermActionActionSubject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermActionActionSubject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Intent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getIntent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_LinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLinkIds();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Context()
	 * @model containment="true"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Context Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_ContextLinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getContextLinkIds();

	/**
	 * Returns the value of the '<em><b>Occurrencex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrencex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrencex</em>' containment reference.
	 * @see #setOccurrencex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Occurrencex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurrence[x]'"
	 * @generated
	 */
	DataType getOccurrencex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getOccurrencex <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrencex</em>' containment reference.
	 * @see #getOccurrencex()
	 * @generated
	 */
	void setOccurrencex(DataType value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Requester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRequesters();

	/**
	 * Returns the value of the '<em><b>Requester Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_RequesterLinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getRequesterLinkIds();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_PerformerType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPerformerTypes();

	/**
	 * Returns the value of the '<em><b>Performer Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer Role</em>' containment reference.
	 * @see #setPerformerRole(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_PerformerRole()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPerformerRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getPerformerRole <em>Performer Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer Role</em>' containment reference.
	 * @see #getPerformerRole()
	 * @generated
	 */
	void setPerformerRole(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Performer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermAction#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_PerformerLinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getPerformerLinkIds();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_ReasonCode()
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Reason()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getReasons();

	/**
	 * Returns the value of the '<em><b>Reason Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_ReasonLinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getReasonLinkIds();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermAction_SecurityLabelNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumbers();

} // ContractTermAction
