/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MessageHeader#getEventx <em>Eventx</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getDestinations <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getSender <em>Sender</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getReason <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeader#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader()
 * @model
 * @generated
 */
public interface MessageHeader extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Eventx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventx</em>' containment reference.
	 * @see #setEventx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Eventx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='event[x]'"
	 * @generated
	 */
	DataType getEventx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getEventx <em>Eventx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventx</em>' containment reference.
	 * @see #getEventx()
	 * @generated
	 */
	void setEventx(DataType value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MessageHeaderMessageDestination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Destination()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageHeaderMessageDestination> getDestinations();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Sender()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Reference value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Enterer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Author()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MessageHeaderMessageSource)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MessageHeaderMessageSource getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MessageHeaderMessageSource value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Responsible()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Reason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(MessageHeaderResponse)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Response()
	 * @model containment="true"
	 * @generated
	 */
	MessageHeaderResponse getResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(MessageHeaderResponse value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Focus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getFoci();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(MessageDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeader_Definition()
	 * @model containment="true"
	 * @generated
	 */
	MessageDefinition getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeader#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(MessageDefinition value);

} // MessageHeader
