/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Action Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PlanDefinitionActionCondition#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionActionCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionActionCondition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Action_Condition'"
 * @generated
 */
public interface PlanDefinitionActionCondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionActionCondition_Kind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getKind();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionActionCondition#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Code value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionActionCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionActionCondition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PlanDefinitionActionCondition
