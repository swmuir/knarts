/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementDocument#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementDocument#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementDocument#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementDocument()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CapabilityStatement_Document'"
 * @generated
 */
public interface CapabilityStatementDocument extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementDocument_Mode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementDocument#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementDocument_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementDocument#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementDocument_Profile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementDocument#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

} // CapabilityStatementDocument
