/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getActuality <em>Actuality</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getDetected <em>Detected</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getResultingConditions <em>Resulting Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getContributors <em>Contributor</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getSuspectEntities <em>Suspect Entity</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getSubjectMedicalHistories <em>Subject Medical History</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getReferenceDocuments <em>Reference Document</em>}</li>
 *   <li>{@link fhiRCore.resources.AdverseEvent#getStudies <em>Study</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent()
 * @model
 * @generated
 */
public interface AdverseEvent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Actuality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuality</em>' containment reference.
	 * @see #setActuality(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Actuality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getActuality();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getActuality <em>Actuality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuality</em>' containment reference.
	 * @see #getActuality()
	 * @generated
	 */
	void setActuality(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Event()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getEvent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getEvent <em>Event</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Detected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detected</em>' containment reference.
	 * @see #setDetected(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Detected()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDetected();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getDetected <em>Detected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected</em>' containment reference.
	 * @see #getDetected()
	 * @generated
	 */
	void setDetected(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Date</em>' containment reference.
	 * @see #setRecordedDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_RecordedDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Resulting Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Condition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_ResultingCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getResultingConditions();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getLocation <em>Location</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Seriousness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seriousness</em>' containment reference.
	 * @see #setSeriousness(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Seriousness()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSeriousness();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getSeriousness <em>Seriousness</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Severity()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getSeverity <em>Severity</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getOutcome <em>Outcome</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Recorder()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AdverseEvent#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Contributor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getContributors();

	/**
	 * Returns the value of the '<em><b>Suspect Entity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.AdverseEventSuspectEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspect Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspect Entity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_SuspectEntity()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdverseEventSuspectEntity> getSuspectEntities();

	/**
	 * Returns the value of the '<em><b>Subject Medical History</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Medical History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Medical History</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_SubjectMedicalHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjectMedicalHistories();

	/**
	 * Returns the value of the '<em><b>Reference Document</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Document</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_ReferenceDocument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferenceDocuments();

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAdverseEvent_Study()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getStudies();

} // AdverseEvent
