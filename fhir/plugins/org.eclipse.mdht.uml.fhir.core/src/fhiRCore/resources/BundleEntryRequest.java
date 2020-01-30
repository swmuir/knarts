/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntryRequest#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Entry_Request'"
 * @generated
 */
public interface BundleEntryRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Code value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_Url()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>If None Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If None Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If None Match</em>' containment reference.
	 * @see #setIfNoneMatch(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_IfNoneMatch()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getIfNoneMatch();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getIfNoneMatch <em>If None Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Match</em>' containment reference.
	 * @see #getIfNoneMatch()
	 * @generated
	 */
	void setIfNoneMatch(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>If Modified Since</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Modified Since</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Modified Since</em>' containment reference.
	 * @see #setIfModifiedSince(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_IfModifiedSince()
	 * @model containment="true"
	 * @generated
	 */
	Instant getIfModifiedSince();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getIfModifiedSince <em>If Modified Since</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Modified Since</em>' containment reference.
	 * @see #getIfModifiedSince()
	 * @generated
	 */
	void setIfModifiedSince(Instant value);

	/**
	 * Returns the value of the '<em><b>If Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Match</em>' containment reference.
	 * @see #setIfMatch(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_IfMatch()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getIfMatch();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getIfMatch <em>If Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Match</em>' containment reference.
	 * @see #getIfMatch()
	 * @generated
	 */
	void setIfMatch(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>If None Exist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If None Exist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If None Exist</em>' containment reference.
	 * @see #setIfNoneExist(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntryRequest_IfNoneExist()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getIfNoneExist();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntryRequest#getIfNoneExist <em>If None Exist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Exist</em>' containment reference.
	 * @see #getIfNoneExist()
	 * @generated
	 */
	void setIfNoneExist(fhiRCore.dataTypes.String value);

} // BundleEntryRequest
