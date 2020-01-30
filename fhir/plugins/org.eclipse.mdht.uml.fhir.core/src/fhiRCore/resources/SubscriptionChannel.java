/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Url;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubscriptionChannel#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubscriptionChannel#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.SubscriptionChannel#getPayload <em>Payload</em>}</li>
 *   <li>{@link fhiRCore.resources.SubscriptionChannel#getHeaders <em>Header</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubscriptionChannel()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subscription_Channel'"
 * @generated
 */
public interface SubscriptionChannel extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubscriptionChannel_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubscriptionChannel#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSubscriptionChannel_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	Url getEndpoint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubscriptionChannel#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Url value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscriptionChannel_Payload()
	 * @model containment="true"
	 * @generated
	 */
	Code getPayload();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubscriptionChannel#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(Code value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubscriptionChannel_Header()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getHeaders();

} // SubscriptionChannel
