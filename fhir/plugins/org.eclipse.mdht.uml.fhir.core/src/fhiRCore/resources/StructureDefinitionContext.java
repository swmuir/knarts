/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureDefinitionContext#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureDefinitionContext#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureDefinitionContext()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureDefinition_Context'"
 * @generated
 */
public interface StructureDefinitionContext extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureDefinitionContext_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureDefinitionContext#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureDefinitionContext_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureDefinitionContext#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(fhiRCore.dataTypes.String value);

} // StructureDefinitionContext
