/**
 */
package org.hl7.knowledgeartifact.r1;

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
 *   <li>{@link org.hl7.knowledgeartifact.r1.FireEventAction#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.FireEventAction#getActionSentence <em>Action Sentence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getFireEventAction()
 * @model extendedMetaData="name='FireEventAction' kind='elementOnly'"
 * @generated
 */
public interface FireEventAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r1.EventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the event that is fired.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #setEventType(EventType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getFireEventAction_EventType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='eventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventType)
	 * @generated
	 */
	void unsetEventType();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getEventType <em>Event Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Type</em>' attribute is set.
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventType)
	 * @generated
	 */
	boolean isSetEventType();

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
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getFireEventAction_ActionSentence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionSentence' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getActionSentence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getActionSentence <em>Action Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sentence</em>' containment reference.
	 * @see #getActionSentence()
	 * @generated
	 */
	void setActionSentence(Expression value);

} // FireEventAction
