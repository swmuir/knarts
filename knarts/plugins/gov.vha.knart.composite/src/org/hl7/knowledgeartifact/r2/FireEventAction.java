/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fire Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action fires an event. The event can serve as
 * 				a trigger to another artifact.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.FireEventAction#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.FireEventAction#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getFireEventAction()
 * @model extendedMetaData="name='FireEventAction' kind='elementOnly'"
 * @generated
 */
public interface FireEventAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Event that is fired
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Type</em>' containment reference.
	 * @see #setEventType(EventDefType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getFireEventAction_EventType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventDefType getEventType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.FireEventAction#getEventType <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' containment reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventDefType value);

	/**
	 * Returns the value of the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action sentence is the payload of the
	 * 								event. Another artifact receives this payload as an input.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Sentence</em>' containment reference.
	 * @see #setActionSentence(Expression)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getFireEventAction_ActionSentence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionSentence' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getActionSentence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.FireEventAction#getActionSentence <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sentence</em>' containment reference.
	 * @see #getActionSentence()
	 * @generated
	 */
	void setActionSentence(Expression value);

} // FireEventAction
