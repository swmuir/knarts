/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResourcesType#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getResourcesType()
 * @model extendedMetaData="name='resources_._type' kind='elementOnly'"
 * @generated
 */
public interface ResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.KnowledgeResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An associated resource instance.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResourcesType_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KnowledgeResource> getResource();

} // ResourcesType
