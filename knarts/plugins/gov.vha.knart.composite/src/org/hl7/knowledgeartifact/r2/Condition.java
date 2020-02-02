/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A condition specifies when a knowledge component is
 * 				to be executed. For example, an ECA rule uses an ApplicableScenario
 * 				condition to determine whether or not the action described by
 * 				the artifact should be executed.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Condition#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Condition#getConditionRole <em>Condition Role</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCondition()
 * @model extendedMetaData="name='Condition' kind='elementOnly'"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logic specification of the condition. Often,
	 * 						though not necessarily, the logic is an expression about patient
	 * 						data. The expression must evaluate to a Boolean value.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(Expression)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCondition_Logic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='logic' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getLogic();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Condition#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role determines when to evaluate the
	 * 						expression and how to proceed based on the expression results.
	 * 						Different artifact types use different types of conditions to
	 * 						control various aspects of the artifact. See the condition role
	 * 						type enumeration documentation for more discussion.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Role</em>' containment reference.
	 * @see #setConditionRole(ConditionRoleType1)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCondition_ConditionRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conditionRole' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionRoleType1 getConditionRole();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Condition#getConditionRole <em>Condition Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Role</em>' containment reference.
	 * @see #getConditionRole()
	 * @generated
	 */
	void setConditionRole(ConditionRoleType1 value);

} // Condition
