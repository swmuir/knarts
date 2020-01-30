/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Definition Link Target Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getRule <em>Rule</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Target_Compartment'"
 * @generated
 */
public interface GraphDefinitionLinkTargetCompartment extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment_Use()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRule();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment_Expression()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTargetCompartment_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

} // GraphDefinitionLinkTargetCompartment
