/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BundleEntryResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryResponse#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryResponse#getEtag <em>Etag</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryResponse#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryResponse#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Entry_Response'"
 * @generated
 */
public interface BundleEntryResponse extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse_Location()
	 * @model containment="true"
	 * @generated
	 */
	Uri getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryResponse#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Uri value);

	/**
	 * Returns the value of the '<em><b>Etag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etag</em>' containment reference.
	 * @see #setEtag(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse_Etag()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getEtag();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryResponse#getEtag <em>Etag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etag</em>' containment reference.
	 * @see #getEtag()
	 * @generated
	 */
	void setEtag(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse_LastModified()
	 * @model containment="true"
	 * @generated
	 */
	Instant getLastModified();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryResponse#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Resource)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryResponse_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	Resource getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Resource value);

} // BundleEntryResponse
