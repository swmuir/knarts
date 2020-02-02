/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventBinding#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventBinding#getIncomingBindings <em>Incoming Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventBinding#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBinding()
 * @model extendedMetaData="name='EventBinding' kind='elementOnly'"
 * @generated
 */
public interface EventBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Model</em>' containment reference.
	 * @see #setBindingModel(BindingModelType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBinding_BindingModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bindingModel' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingModelType getBindingModel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventBinding#getBindingModel <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Model</em>' containment reference.
	 * @see #getBindingModel()
	 * @generated
	 */
	void setBindingModel(BindingModelType value);

	/**
	 * Returns the value of the '<em><b>Incoming Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Bindings</em>' containment reference.
	 * @see #setIncomingBindings(SpecificEventBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBinding_IncomingBindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incomingBindings' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificEventBinding getIncomingBindings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventBinding#getIncomingBindings <em>Incoming Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Bindings</em>' containment reference.
	 * @see #getIncomingBindings()
	 * @generated
	 */
	void setIncomingBindings(SpecificEventBinding value);

	/**
	 * Returns the value of the '<em><b>Outgoing Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Bindings</em>' containment reference.
	 * @see #setOutgoingBindings(SpecificEventBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBinding_OutgoingBindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outgoingBindings' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificEventBinding getOutgoingBindings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Bindings</em>' containment reference.
	 * @see #getOutgoingBindings()
	 * @generated
	 */
	void setOutgoingBindings(SpecificEventBinding value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference.
	 * @see #setTriggers(TriggerBindings)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBinding_Triggers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggers' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerBindings getTriggers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventBinding#getTriggers <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' containment reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(TriggerBindings value);

} // EventBinding
