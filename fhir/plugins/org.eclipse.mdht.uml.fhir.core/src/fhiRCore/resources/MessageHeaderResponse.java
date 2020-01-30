/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Header Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MessageHeaderResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderResponse#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageHeaderResponse#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderResponse()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageHeader_Response'"
 * @generated
 */
public interface MessageHeaderResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderResponse_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderResponse#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Id value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderResponse_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderResponse#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageHeaderResponse_Details()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDetails();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageHeaderResponse#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(Reference value);

} // MessageHeaderResponse
