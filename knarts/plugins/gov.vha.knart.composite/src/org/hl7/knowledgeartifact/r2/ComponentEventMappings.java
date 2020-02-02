/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Event Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventMappings()
 * @model extendedMetaData="name='ComponentEventMappings' kind='elementOnly'"
 * @generated
 */
public interface ComponentEventMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' containment reference.
	 * @see #setComponentId(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventMappings_ComponentId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentId' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getComponentId();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getComponentId <em>Component Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' containment reference.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(EObject value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(BindingType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComponentEventMappings_Binding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingType getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingType value);

} // ComponentEventMappings
