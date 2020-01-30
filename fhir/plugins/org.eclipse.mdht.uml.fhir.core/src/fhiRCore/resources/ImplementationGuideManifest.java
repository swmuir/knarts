/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Url;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifest#getRendering <em>Rendering</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifest#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifest#getPages <em>Page</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifest#getImages <em>Image</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifest#getOthers <em>Other</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImplementationGuide_Manifest'"
 * @generated
 */
public interface ImplementationGuideManifest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference.
	 * @see #setRendering(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest_Rendering()
	 * @model containment="true"
	 * @generated
	 */
	Url getRendering();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideManifest#getRendering <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' containment reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(Url value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideManifestManifestResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImplementationGuideManifestManifestResource> getResources();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideManifestManifestPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideManifestManifestPage> getPages();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getImages();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifest_Other()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getOthers();

} // ImplementationGuideManifest
