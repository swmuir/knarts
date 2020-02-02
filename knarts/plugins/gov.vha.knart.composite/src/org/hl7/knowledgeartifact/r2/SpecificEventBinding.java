/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Event Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getContainerEvent <em>Container Event</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getEventBindingType <em>Event Binding Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getComponentEvent <em>Component Event</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getMutability <em>Mutability</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding()
 * @model extendedMetaData="name='SpecificEventBinding' kind='elementOnly'"
 * @generated
 */
public interface SpecificEventBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Container Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Event</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding_ContainerEvent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContainerEvent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getContainerEvent();

	/**
	 * Returns the value of the '<em><b>Event Binding Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.EventBindingTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recast, Passthru, Suppress, Filter, Restates
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Binding Type</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding_EventBindingType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventBindingType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EventBindingTypeType> getEventBindingType();

	/**
	 * Returns the value of the '<em><b>Component Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Event</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding_ComponentEvent()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComponentEvent' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getComponentEvent();

	/**
	 * Returns the value of the '<em><b>Mutability</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutability</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificEventBinding_Mutability()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mutability' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EObject> getMutability();

} // SpecificEventBinding
