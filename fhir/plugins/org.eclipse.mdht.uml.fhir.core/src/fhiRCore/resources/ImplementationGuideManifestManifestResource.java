/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Manifest Manifest Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifestManifestResource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Manifest_ManifestResource'"
 * @generated
 */
public interface ImplementationGuideManifestManifestResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifestManifestResource_Reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Examplex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examplex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examplex</em>' containment reference.
	 * @see #setExamplex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifestManifestResource_Examplex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='example[x]'"
	 * @generated
	 */
	DataType getExamplex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getExamplex <em>Examplex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examplex</em>' containment reference.
	 * @see #getExamplex()
	 * @generated
	 */
	void setExamplex(DataType value);

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #setRelativePath(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideManifestManifestResource_RelativePath()
	 * @model containment="true"
	 * @generated
	 */
	Url getRelativePath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideManifestManifestResource#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(Url value);

} // ImplementationGuideManifestManifestResource
