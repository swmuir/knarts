/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Event Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getIncomingBindings <em>Incoming Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding()
 * @model extendedMetaData="name='ComponentEventBinding' kind='elementOnly'"
 * @generated
 */
public interface ComponentEventBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shared, Encapsulated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Model</em>' containment reference.
	 * @see #setBindingModel(BindingModelType1)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding_BindingModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bindingModel' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingModelType1 getBindingModel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getBindingModel <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Model</em>' containment reference.
	 * @see #getBindingModel()
	 * @generated
	 */
	void setBindingModel(BindingModelType1 value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding_ComponentId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='componentId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

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
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding_IncomingBindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incomingBindings' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificEventBinding getIncomingBindings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getIncomingBindings <em>Incoming Bindings</em>}' containment reference.
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
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding_OutgoingBindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outgoingBindings' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificEventBinding getOutgoingBindings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Bindings</em>' containment reference.
	 * @see #getOutgoingBindings()
	 * @generated
	 */
	void setOutgoingBindings(SpecificEventBinding value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.TriggerBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventBinding_Triggers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriggerBindings> getTriggers();

} // ComponentEventBinding
