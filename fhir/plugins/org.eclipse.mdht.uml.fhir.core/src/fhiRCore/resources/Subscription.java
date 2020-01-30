/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Instant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Subscription#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getEnd <em>End</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getReason <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getError <em>Error</em>}</li>
 *   <li>{@link fhiRCore.resources.Subscription#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getContacts();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_End()
	 * @model containment="true"
	 * @generated
	 */
	Instant getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Instant value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Reason()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Criteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCriteria();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Error()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getError();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference.
	 * @see #setChannel(SubscriptionChannel)
	 * @see fhiRCore.resources.ResourcesPackage#getSubscription_Channel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubscriptionChannel getChannel();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Subscription#getChannel <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' containment reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(SubscriptionChannel value);

} // Subscription
