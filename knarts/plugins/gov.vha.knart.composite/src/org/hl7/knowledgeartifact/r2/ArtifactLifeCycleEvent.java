/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Life Cycle Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event in the life cycle of an artifact. Both the
 * 				type of event are specified, as well as the point in time in which
 * 				that event took place.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventDateTime <em>Event Date Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactLifeCycleEvent()
 * @model extendedMetaData="name='ArtifactLifeCycleEvent' kind='elementOnly'"
 * @generated
 */
public interface ArtifactLifeCycleEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' containment reference.
	 * @see #setEventType(EventTypeType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactLifeCycleEvent_EventType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTypeType getEventType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventType <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' containment reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypeType value);

	/**
	 * Returns the value of the '<em><b>Event Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Date Time</em>' containment reference.
	 * @see #setEventDateTime(TS)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactLifeCycleEvent_EventDateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eventDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TS getEventDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventDateTime <em>Event Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date Time</em>' containment reference.
	 * @see #getEventDateTime()
	 * @generated
	 */
	void setEventDateTime(TS value);

} // ArtifactLifeCycleEvent
