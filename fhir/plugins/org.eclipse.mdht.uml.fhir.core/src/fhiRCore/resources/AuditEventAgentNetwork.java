/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Agent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AuditEventAgentNetwork#getAddress <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgentNetwork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgentNetwork()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Agent_Network'"
 * @generated
 */
public interface AuditEventAgentNetwork extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgentNetwork_Address()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAddress();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgentNetwork#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgentNetwork_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgentNetwork#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

} // AuditEventAgentNetwork
