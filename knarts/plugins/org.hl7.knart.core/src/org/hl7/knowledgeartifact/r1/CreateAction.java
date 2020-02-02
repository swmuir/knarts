/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A new action to be executed by a user or a computer system. The
 * 				sentence provides the details of the action to be executed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.CreateAction#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getCreateAction()
 * @model extendedMetaData="name='CreateAction' kind='elementOnly'"
 * @generated
 */
public interface CreateAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters of the action that is to be executed.
	 * 								For example, an action may be to order a medication.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Sentence</em>' containment reference.
	 * @see #setActionSentence(Expression)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getCreateAction_ActionSentence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionSentence' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getActionSentence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.CreateAction#getActionSentence <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sentence</em>' containment reference.
	 * @see #getActionSentence()
	 * @generated
	 */
	void setActionSentence(Expression value);

} // CreateAction
