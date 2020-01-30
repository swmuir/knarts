/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Expansion Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansionParameter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Expansion_Parameter'"
 * @generated
 */
public interface TerminologyCapabilitiesExpansionParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansionParameter_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansionParameter_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(fhiRCore.dataTypes.String value);

} // TerminologyCapabilitiesExpansionParameter
