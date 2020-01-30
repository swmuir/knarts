/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BundleLink#getRelation <em>Relation</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleLink#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBundleLink()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Bundle_Link'"
 * @generated
 */
public interface BundleLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleLink_Relation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRelation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleLink#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getBundleLink_Url()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleLink#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

} // BundleLink
