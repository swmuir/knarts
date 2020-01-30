/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionTemplate()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Definition_Template'"
 * @generated
 */
public interface ImplementationGuideDefinitionTemplate extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionTemplate_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionTemplate_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionTemplate_Scope()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getScope();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(fhiRCore.dataTypes.String value);

} // ImplementationGuideDefinitionTemplate
