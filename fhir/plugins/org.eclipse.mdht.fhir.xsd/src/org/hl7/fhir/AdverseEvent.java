/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getActuality <em>Actuality</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getResultingCondition <em>Resulting Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getEventParticipant <em>Event Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getSuspectEntity <em>Suspect Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getSubjectMedicalHistory <em>Subject Medical History</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getReferenceDocument <em>Reference Document</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEvent#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEvent()
 * @model extendedMetaData="name='AdverseEvent' kind='elementOnly'"
 * @generated
 */
public interface AdverseEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Actuality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuality</em>' containment reference.
	 * @see #setActuality(AdverseEventActuality)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Actuality()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuality' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEventActuality getActuality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getActuality <em>Actuality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuality</em>' containment reference.
	 * @see #getActuality()
	 * @generated
	 */
	void setActuality(AdverseEventActuality value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall type of event, intended for search and filtering purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element defines the specific type of event that occurred or that was prevented from occurring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the adverse event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Resulting Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resulting Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_ResultingCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultingCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResultingCondition();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information about where the adverse event occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Seriousness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessment whether this event was of real importance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seriousness</em>' containment reference.
	 * @see #setSeriousness(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Seriousness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seriousness' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeriousness();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getSeriousness <em>Seriousness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seriousness</em>' containment reference.
	 * @see #getSeriousness()
	 * @generated
	 */
	void setSeriousness(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the severity of the adverse event, in relation to the subject. Contrast to AdverseEvent.serious - a severe rash might not be serious, but a mild heart problem is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the type of outcome from the adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on who recorded the adverse event.  May be the patient or a practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Event Participant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Participant</em>' containment reference.
	 * @see #setEventParticipant(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_EventParticipant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventParticipant' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEventParticipant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getEventParticipant <em>Event Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Participant</em>' containment reference.
	 * @see #getEventParticipant()
	 * @generated
	 */
	void setEventParticipant(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the adverse event in text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEvent#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Suspect Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AdverseEventSuspectEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the entity that is suspected to have caused the adverse event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspect Entity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_SuspectEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suspectEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdverseEventSuspectEntity> getSuspectEntity();

	/**
	 * Returns the value of the '<em><b>Subject Medical History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.subjectMedicalHistory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Medical History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_SubjectMedicalHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectMedicalHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubjectMedicalHistory();

	/**
	 * Returns the value of the '<em><b>Reference Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.referenceDocument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_ReferenceDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReferenceDocument();

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getAdverseEvent_Study()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getStudy();

} // AdverseEvent
