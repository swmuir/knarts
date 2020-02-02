/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ActorsType#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getActorsType()
 * @model extendedMetaData="name='actors_._type' kind='elementOnly'"
 * @generated
 */
public interface ActorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actor that is responsible for executing the
	 * 									action. This element is used when an artifact can have multiple
	 * 									actors responsible for the execution of various CDS actions,
	 * 									forexample, an interdisciplinary plan of care. It is important
	 * 									to note the distinction between a CDS action and an ensuing
	 * 									clinical action. A CDS action might be to order patient
	 * 									ambulation, the actor for which is a physician responsible for
	 * 									writing the order. A nurse might be responsible for ensuring
	 * 									that the patient ambulates. In this case, the artifact will
	 * 									specify the physician as the actor. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getActorsType_Actor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Actor> getActor();

} // ActorsType
