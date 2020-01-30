/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConsentPolicy#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.ConsentPolicy#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConsentPolicy()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consent_Policy'"
 * @generated
 */
public interface ConsentPolicy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentPolicy_Authority()
	 * @model containment="true"
	 * @generated
	 */
	Uri getAuthority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentPolicy#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Uri value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentPolicy_Uri()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUri();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentPolicy#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Uri value);

} // ConsentPolicy
