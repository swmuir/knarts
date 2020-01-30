/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression</b></em>'.
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
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getPrevious <em>Previous</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getProblems <em>Problem</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getInvestigations <em>Investigation</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getSummary <em>Summary</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getFindings <em>Finding</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getPrognosisCodeableConcepts <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getPrognosisReferences <em>Prognosis Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpression#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression()
 * @model
 * @generated
 */
public interface ClinicalImpression extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getSubject <em>Subject</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectivex</em>' containment reference.
	 * @see #setEffectivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Effectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='effective[x]'"
	 * @generated
	 */
	DataType getEffectivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getEffectivex <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectivex</em>' containment reference.
	 * @see #getEffectivex()
	 * @generated
	 */
	void setEffectivex(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Assessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessor</em>' containment reference.
	 * @see #setAssessor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Assessor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAssessor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getAssessor <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessor</em>' containment reference.
	 * @see #getAssessor()
	 * @generated
	 */
	void setAssessor(Reference value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Previous()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPrevious();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Reference value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Problem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getProblems();

	/**
	 * Returns the value of the '<em><b>Investigation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClinicalImpressionInvestigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Investigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Investigation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Investigation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClinicalImpressionInvestigation> getInvestigations();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getProtocols();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Summary()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSummary();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpression#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClinicalImpressionFinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Finding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClinicalImpressionFinding> getFindings();

	/**
	 * Returns the value of the '<em><b>Prognosis Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prognosis Codeable Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Codeable Concept</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_PrognosisCodeableConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPrognosisCodeableConcepts();

	/**
	 * Returns the value of the '<em><b>Prognosis Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prognosis Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_PrognosisReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPrognosisReferences();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_SupportingInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingInfos();

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
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpression_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // ClinicalImpression
