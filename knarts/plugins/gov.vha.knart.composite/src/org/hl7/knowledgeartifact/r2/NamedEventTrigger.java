/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named event. 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.NamedEventTrigger#getOnEventName <em>On Event Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getNamedEventTrigger()
 * @model extendedMetaData="name='NamedEventTrigger' kind='elementOnly'"
 * @generated
 */
public interface NamedEventTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>On Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Event Name</em>' attribute.
	 * @see #setOnEventName(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getNamedEventTrigger_OnEventName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onEventName'"
	 * @generated
	 */
	String getOnEventName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.NamedEventTrigger#getOnEventName <em>On Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Event Name</em>' attribute.
	 * @see #getOnEventName()
	 * @generated
	 */
	void setOnEventName(String value);

} // NamedEventTrigger
