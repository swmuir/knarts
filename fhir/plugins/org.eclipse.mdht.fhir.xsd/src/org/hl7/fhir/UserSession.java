/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a user's current session.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.UserSession#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getUser <em>User</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getWorkstation <em>Workstation</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.hl7.fhir.UserSession#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getUserSession()
 * @model extendedMetaData="name='UserSession' kind='elementOnly'"
 * @generated
 */
public interface UserSession extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows a service to provide a unique, business identifier for the session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A practitioner, patient, device, or related person engaged in the session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(Reference)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_User()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getUser();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(UserSessionStatus1)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	UserSessionStatus1 getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(UserSessionStatus1 value);

	/**
	 * Returns the value of the '<em><b>Workstation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location that identifies the physical place at which the user's session is occurring. For the purposes of context synchronization, this is intended to represent the user's workstation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workstation</em>' containment reference.
	 * @see #setWorkstation(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Workstation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workstation' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getWorkstation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getWorkstation <em>Workstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workstation</em>' containment reference.
	 * @see #getWorkstation()
	 * @generated
	 */
	void setWorkstation(Identifier value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current focus of the user's session. Common values are a reference to a Patient, Encounter, ImagingStudy, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getFocus();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the timestamp when the user session was first created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(Instant)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Instant value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the timestamp when the user session will expire (i.e. no longer be valid).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' containment reference.
	 * @see #setExpires(Instant)
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Expires()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getExpires();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.UserSession#getExpires <em>Expires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' containment reference.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(Instant value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UserSessionContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information associated with the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getUserSession_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserSessionContext> getContext();

} // UserSession
