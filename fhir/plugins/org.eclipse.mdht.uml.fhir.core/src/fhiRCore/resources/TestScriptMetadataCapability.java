/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Metadata Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getRequired <em>Required</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getValidated <em>Validated</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getOrigins <em>Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getLinks <em>Link</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptMetadataCapability#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Metadata_Capability'"
 * @generated
 */
public interface TestScriptMetadataCapability extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Required()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getRequired();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptMetadataCapability#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated</em>' containment reference.
	 * @see #setValidated(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Validated()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getValidated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptMetadataCapability#getValidated <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' containment reference.
	 * @see #getValidated()
	 * @generated
	 */
	void setValidated(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptMetadataCapability#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Origin()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.Integer> getOrigins();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Destination()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getDestination();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptMetadataCapability#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getLinks();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilityStatement)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptMetadataCapability_Capabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapabilityStatement getCapabilities();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptMetadataCapability#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilityStatement value);

} // TestScriptMetadataCapability
