/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Completion#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Completion#getActionGroup <em>Action Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCompletion()
 * @model extendedMetaData="name='Completion' kind='elementOnly'"
 * @generated
 */
public interface Completion extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition</em>' containment reference.
	 * @see #setEventDefinition(NamedEventDef)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCompletion_EventDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedEventDef getEventDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Completion#getEventDefinition <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Definition</em>' containment reference.
	 * @see #getEventDefinition()
	 * @generated
	 */
	void setEventDefinition(NamedEventDef value);

	/**
	 * Returns the value of the '<em><b>Action Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Group</em>' containment reference.
	 * @see #setActionGroup(ActionGroup)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCompletion_ActionGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionGroup getActionGroup();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Completion#getActionGroup <em>Action Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Group</em>' containment reference.
	 * @see #getActionGroup()
	 * @generated
	 */
	void setActionGroup(ActionGroup value);

} // Completion
