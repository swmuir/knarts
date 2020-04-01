/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Messaging Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingEndpoint#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint()
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingEndpoint#getProtocol <em>Protocol</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessagingEndpoint_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Url getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingEndpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Url value);

} // CapabilityStatementMessagingEndpoint
