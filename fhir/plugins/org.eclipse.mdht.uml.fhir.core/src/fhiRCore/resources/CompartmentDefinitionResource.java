/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Definition Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CompartmentDefinitionResource#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CompartmentDefinitionResource#getParams <em>Param</em>}</li>
 *   <li>{@link fhiRCore.resources.CompartmentDefinitionResource#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCompartmentDefinitionResource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CompartmentDefinition_Resource'"
 * @generated
 */
public interface CompartmentDefinitionResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCompartmentDefinitionResource_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompartmentDefinitionResource#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCompartmentDefinitionResource_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getParams();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCompartmentDefinitionResource_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompartmentDefinitionResource#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(fhiRCore.dataTypes.String value);

} // CompartmentDefinitionResource
