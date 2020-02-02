/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action removes another proposed action or an ongoing action.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.RemoveAction#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getRemoveAction()
 * @model extendedMetaData="name='RemoveAction' kind='elementOnly'"
 * @generated
 */
public interface RemoveAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression must resolve to the action that is
	 * 								being removed. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Sentence</em>' containment reference.
	 * @see #setActionSentence(Expression)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getRemoveAction_ActionSentence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionSentence' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getActionSentence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.RemoveAction#getActionSentence <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sentence</em>' containment reference.
	 * @see #getActionSentence()
	 * @generated
	 */
	void setActionSentence(Expression value);

} // RemoveAction
