/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Messaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getSupportedMessages <em>Supported Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessaging()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CapabilityStatement_Messaging'"
 * @generated
 */
public interface CapabilityStatementMessaging extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessaging_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementMessagingEndpoint> getEndpoints();

	/**
	 * Returns the value of the '<em><b>Reliable Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliable Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliable Cache</em>' containment reference.
	 * @see #setReliableCache(UnsignedInt)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessaging_ReliableCache()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getReliableCache();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getReliableCache <em>Reliable Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable Cache</em>' containment reference.
	 * @see #getReliableCache()
	 * @generated
	 */
	void setReliableCache(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessaging_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessaging#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Supported Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementMessagingSupportedMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Message</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementMessaging_SupportedMessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementMessagingSupportedMessage> getSupportedMessages();

} // CapabilityStatementMessaging
