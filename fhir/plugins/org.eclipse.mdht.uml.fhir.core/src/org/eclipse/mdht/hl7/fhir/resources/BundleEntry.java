/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getFullUrl <em>Full Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getSearch <em>Search</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Bundle_Entry'"
 * @generated
 */
public interface BundleEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.BundleLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Full Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Url</em>' containment reference.
	 * @see #setFullUrl(Uri)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_FullUrl()
	 * @model containment="true"
	 * @generated
	 */
	Uri getFullUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getFullUrl <em>Full Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Url</em>' containment reference.
	 * @see #getFullUrl()
	 * @generated
	 */
	void setFullUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Entry_Resource)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Entry_Resource getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Entry_Resource value);

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference.
	 * @see #setSearch(BundleEntrySearch)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_Search()
	 * @model containment="true"
	 * @generated
	 */
	BundleEntrySearch getSearch();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(BundleEntrySearch value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(BundleEntryRequest)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_Request()
	 * @model containment="true"
	 * @generated
	 */
	BundleEntryRequest getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(BundleEntryRequest value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(BundleEntryResponse)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBundleEntry_Response()
	 * @model containment="true"
	 * @generated
	 */
	BundleEntryResponse getResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.BundleEntry#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(BundleEntryResponse value);

} // BundleEntry
