/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action changing the value of another existing action. The action
 * 				being modified may be a proposed action (e.g., an medication being prescribed by a
 * 				clinician) or be an ongoing action (e.g., an existing prescription). In these cases,
 * 				a modification can be used to change the dose of the medication. It may also be used
 * 				to discontinue a medication by changing the stop date. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.UpdateAction#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getUpdateAction()
 * @model extendedMetaData="name='UpdateAction' kind='elementOnly'"
 * @generated
 */
public interface UpdateAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modification to the action. This is specified by
	 * 								modifying the properties of an existing action using an
	 * 								ObjectRedefine expression. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Sentence</em>' containment reference.
	 * @see #setActionSentence(Expression)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getUpdateAction_ActionSentence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionSentence' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getActionSentence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.UpdateAction#getActionSentence <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sentence</em>' containment reference.
	 * @see #getActionSentence()
	 * @generated
	 */
	void setActionSentence(Expression value);

} // UpdateAction
