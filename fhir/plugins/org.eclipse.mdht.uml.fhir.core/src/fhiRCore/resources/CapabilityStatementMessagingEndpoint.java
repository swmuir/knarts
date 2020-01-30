/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Messaging Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementMessagingEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementMessagingEndpoint#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Messaging_Endpoint'"
 * @generated
 */
public interface CapabilityStatementMessagingEndpoint extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getProtocol();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementMessagingEndpoint#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Coding value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Url getAddress();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementMessagingEndpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Url value);

} // CapabilityStatementMessagingEndpoint
