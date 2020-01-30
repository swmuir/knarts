/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header Message Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageDestination#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageDestination#getTarget <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageDestination#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderMessageDestination#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageDestination()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageHeader_MessageDestination'"
 * @generated
 */
public interface MessageHeaderMessageDestination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageDestination_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageDestination#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageDestination_Target()
	 * @model containment="true"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageDestination#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageDestination_Endpoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Url getEndpoint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageDestination#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Url value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderMessageDestination_Receiver()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReceiver();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderMessageDestination#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Reference value);

} // MessageHeaderMessageDestination
