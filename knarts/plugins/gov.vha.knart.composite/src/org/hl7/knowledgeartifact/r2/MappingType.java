/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.MappingType#getComponentEventMappings <em>Component Event Mappings</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getMappingType()
 * @model extendedMetaData="name='MappingType' kind='elementOnly'"
 * @generated
 */
public interface MappingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Event Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Event Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Event Mappings</em>' containment reference.
	 * @see #setComponentEventMappings(ComponentEventBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMappingType_ComponentEventMappings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentEventMappings' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentEventBinding getComponentEventMappings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.MappingType#getComponentEventMappings <em>Component Event Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Event Mappings</em>' containment reference.
	 * @see #getComponentEventMappings()
	 * @generated
	 */
	void setComponentEventMappings(ComponentEventBinding value);

} // MappingType
