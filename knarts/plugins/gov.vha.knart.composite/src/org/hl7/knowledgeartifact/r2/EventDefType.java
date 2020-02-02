/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventDefType#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventDefType()
 * @model extendedMetaData="name='EventDefType' kind='empty'"
 * @generated
 */
public interface EventDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r2.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #setEventType(EventType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventDefType_EventType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='eventType'"
	 * @generated
	 */
	EventType getEventType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventDefType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @see #isSetEventType()
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.EventDefType#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventType)
	 * @generated
	 */
	void unsetEventType();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.EventDefType#getEventType <em>Event Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Type</em>' attribute is set.
	 * @see #unsetEventType()
	 * @see #getEventType()
	 * @see #setEventType(EventType)
	 * @generated
	 */
	boolean isSetEventType();

} // EventDefType
