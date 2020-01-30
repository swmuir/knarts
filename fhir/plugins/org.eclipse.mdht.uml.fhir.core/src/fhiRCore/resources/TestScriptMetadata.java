/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptMetadata#getLinks <em>Link</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadata#getCapabilities <em>Capability</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadata()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript_Metadata'"
 * @generated
 */
public interface TestScriptMetadata extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestScriptMetadataLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadata_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestScriptMetadataLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestScriptMetadataCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadata_Capability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TestScriptMetadataCapability> getCapabilities();

} // TestScriptMetadata
