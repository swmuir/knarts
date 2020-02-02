/**
 */
package org.hl7.knowledgeartifact.r1;


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
 *   <li>{@link org.hl7.knowledgeartifact.r1.NamedEventTrigger#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getNamedEventTrigger()
 * @model extendedMetaData="name='NamedEventTrigger' kind='elementOnly'"
 * @generated
 */
public interface NamedEventTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getNamedEventTrigger_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.NamedEventTrigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedEventTrigger
