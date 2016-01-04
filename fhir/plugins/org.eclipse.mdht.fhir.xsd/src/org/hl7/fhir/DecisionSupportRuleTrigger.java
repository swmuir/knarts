/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource defines a decision support rule of the form [on Event] if Condition then Action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingTiming <em>Event Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingReference <em>Event Timing Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingDate <em>Event Timing Date</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingDateTime <em>Event Timing Date Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger()
 * @model extendedMetaData="name='DecisionSupportRule.Trigger' kind='elementOnly'"
 * @generated
 */
public interface DecisionSupportRuleTrigger extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of triggering event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DecisionSupportRuleTriggerType)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DecisionSupportRuleTriggerType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DecisionSupportRuleTriggerType value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the event (if this is a named-event trigger).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Name</em>' containment reference.
	 * @see #setEventName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_EventName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getEventName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventName <em>Event Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' containment reference.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Event Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Timing Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timing Timing</em>' containment reference.
	 * @see #setEventTimingTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_EventTimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getEventTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingTiming <em>Event Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Timing</em>' containment reference.
	 * @see #getEventTimingTiming()
	 * @generated
	 */
	void setEventTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Event Timing Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Timing Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timing Reference</em>' containment reference.
	 * @see #setEventTimingReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_EventTimingReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEventTimingReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingReference <em>Event Timing Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Reference</em>' containment reference.
	 * @see #getEventTimingReference()
	 * @generated
	 */
	void setEventTimingReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Event Timing Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Timing Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timing Date</em>' containment reference.
	 * @see #setEventTimingDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_EventTimingDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getEventTimingDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingDate <em>Event Timing Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Date</em>' containment reference.
	 * @see #getEventTimingDate()
	 * @generated
	 */
	void setEventTimingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Event Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Timing Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timing Date Time</em>' containment reference.
	 * @see #setEventTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRuleTrigger_EventTimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventTimingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEventTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRuleTrigger#getEventTimingDateTime <em>Event Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timing Date Time</em>' containment reference.
	 * @see #getEventTimingDateTime()
	 * @generated
	 */
	void setEventTimingDateTime(DateTime value);

} // DecisionSupportRuleTrigger
