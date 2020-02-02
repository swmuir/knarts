/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Triggers#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getTriggers()
 * @model extendedMetaData="name='Triggers' kind='elementOnly'"
 * @generated
 */
public interface Triggers extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger element represents an event that
	 * 						'triggers' the knowledge artifact. For instance, 'evaluate this
	 * 						artifact whenever a new Problem with a Diabetes Diagnosis code is
	 * 						added to the patient's record' or 'Evaluate this artifact every
	 * 						week day at 10:00 PM'. A trigger can model a data event, a named event, or
	 * 						a periodic event.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getTriggers_Trigger()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

} // Triggers
