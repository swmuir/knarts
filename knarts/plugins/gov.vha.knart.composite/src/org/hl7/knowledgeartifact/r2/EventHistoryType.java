/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event History Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventHistoryType#getArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventHistoryType()
 * @model extendedMetaData="name='eventHistory_._type' kind='elementOnly'"
 * @generated
 */
public interface EventHistoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Life Cycle Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Life Cycle Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Life Cycle Event</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventHistoryType_ArtifactLifeCycleEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifactLifeCycleEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactLifeCycleEvent> getArtifactLifeCycleEvent();

} // EventHistoryType
