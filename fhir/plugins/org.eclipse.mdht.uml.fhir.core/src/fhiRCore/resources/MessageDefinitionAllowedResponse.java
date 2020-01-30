/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition Allowed Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionAllowedResponse()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageDefinition_AllowedResponse'"
 * @generated
 */
public interface MessageDefinitionAllowedResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(MessageDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionAllowedResponse_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MessageDefinition getMessage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionAllowedResponse#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageDefinition value);

	/**
	 * Returns the value of the '<em><b>Situation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation</em>' containment reference.
	 * @see #setSituation(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionAllowedResponse_Situation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getSituation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionAllowedResponse#getSituation <em>Situation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation</em>' containment reference.
	 * @see #getSituation()
	 * @generated
	 */
	void setSituation(Markdown value);

} // MessageDefinitionAllowedResponse
