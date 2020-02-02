/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of conditions that are used to
 * 				define whether various aspects of the artifact, such as
 * 				whether or not a particular action should be executed, or
 * 				whether a particular order set item is applicable to a 
 * 				given patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Conditions#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getConditions()
 * @model extendedMetaData="name='Conditions' kind='elementOnly'"
 * @generated
 */
public interface Conditions extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getConditions_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Conditions
