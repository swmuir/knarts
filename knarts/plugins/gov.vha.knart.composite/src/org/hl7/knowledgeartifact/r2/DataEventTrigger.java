/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event in which a data item is created, removed,
 * 				updated, or accessed. For instance, a data event may be triggered by
 * 				a new serum potassium result below 3.5, a new appointment event to a
 * 				Primary Care Clinic, or a new susbstance administration proposal for
 * 				dabigatran. Expression is expected to be an ExpressionRef that
 * 				references an ExpressionDef in ExternalData, or a Retrieve
 * 				expression in CQL.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType <em>Trigger Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getDataEventTrigger()
 * @model extendedMetaData="name='DataEventTrigger' kind='elementOnly'"
 * @generated
 */
public interface DataEventTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r2.DataEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @see #isSetTriggerType()
	 * @see #unsetTriggerType()
	 * @see #setTriggerType(DataEventType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDataEventTrigger_TriggerType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='triggerType'"
	 * @generated
	 */
	DataEventType getTriggerType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @see #isSetTriggerType()
	 * @see #unsetTriggerType()
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(DataEventType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriggerType()
	 * @see #getTriggerType()
	 * @see #setTriggerType(DataEventType)
	 * @generated
	 */
	void unsetTriggerType();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType <em>Trigger Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigger Type</em>' attribute is set.
	 * @see #unsetTriggerType()
	 * @see #getTriggerType()
	 * @see #setTriggerType(DataEventType)
	 * @generated
	 */
	boolean isSetTriggerType();

} // DataEventTrigger
