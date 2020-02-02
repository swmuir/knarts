/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Event Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.NamedEventDef#getEventName <em>Event Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getNamedEventDef()
 * @model extendedMetaData="name='NamedEventDef' kind='elementOnly'"
 * @generated
 */
public interface NamedEventDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' containment reference.
	 * @see #setEventName(EventNameType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getNamedEventDef_EventName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eventName' namespace='##targetNamespace'"
	 * @generated
	 */
	EventNameType getEventName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.NamedEventDef#getEventName <em>Event Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' containment reference.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(EventNameType value);

} // NamedEventDef
