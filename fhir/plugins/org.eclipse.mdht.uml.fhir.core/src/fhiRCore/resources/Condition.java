/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Condition#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getAbatementx <em>Abatementx</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getStages <em>Stage</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getEvidences <em>Evidence</em>}</li>
 *   <li>{@link fhiRCore.resources.Condition#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Clinical Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Status</em>' containment reference.
	 * @see #setClinicalStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_ClinicalStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getClinicalStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getClinicalStatus <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Status</em>' containment reference.
	 * @see #getClinicalStatus()
	 * @generated
	 */
	void setClinicalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verification Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Status</em>' containment reference.
	 * @see #setVerificationStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_VerificationStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getVerificationStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getVerificationStatus <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Status</em>' containment reference.
	 * @see #getVerificationStatus()
	 * @generated
	 */
	void setVerificationStatus(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Severity()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSeverity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getBodySites();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getSubject <em>Subject</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Onsetx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onsetx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onsetx</em>' containment reference.
	 * @see #setOnsetx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Onsetx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='onset[x]'"
	 * @generated
	 */
	DataType getOnsetx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getOnsetx <em>Onsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onsetx</em>' containment reference.
	 * @see #getOnsetx()
	 * @generated
	 */
	void setOnsetx(DataType value);

	/**
	 * Returns the value of the '<em><b>Abatementx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abatementx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abatementx</em>' containment reference.
	 * @see #setAbatementx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Abatementx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='abatement[x]'"
	 * @generated
	 */
	DataType getAbatementx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getAbatementx <em>Abatementx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abatementx</em>' containment reference.
	 * @see #getAbatementx()
	 * @generated
	 */
	void setAbatementx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_RecordedDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getRecordedDate <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' containment reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Recorder()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserter</em>' containment reference.
	 * @see #setAsserter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Asserter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAsserter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Condition#getAsserter <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' containment reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Reference value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConditionStage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Stage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionStage> getStages();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConditionEvidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionEvidence> getEvidences();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCondition_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // Condition
