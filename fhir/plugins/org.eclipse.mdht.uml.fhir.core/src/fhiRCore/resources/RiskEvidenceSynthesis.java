/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis</b></em>'.
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
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getTopics <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getEditors <em>Editor</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getPopulation <em>Population</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getExposure <em>Exposure</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getSampleSize <em>Sample Size</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getRiskEstimate <em>Risk Estimate</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesis#getCertainties <em>Certainty</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis()
 * @model
 * @generated
 */
public interface RiskEvidenceSynthesis extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getContacts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_UseContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageContext> getUseContexts();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Date</em>' containment reference.
	 * @see #setApprovalDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_ApprovalDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getApprovalDate <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date</em>' containment reference.
	 * @see #getApprovalDate()
	 * @generated
	 */
	void setApprovalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Review Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Review Date</em>' containment reference.
	 * @see #setLastReviewDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_LastReviewDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getLastReviewDate <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Review Date</em>' containment reference.
	 * @see #getLastReviewDate()
	 * @generated
	 */
	void setLastReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_EffectivePeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTopics();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Author()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getAuthors();

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Editor()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getEditors();

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Reviewer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getReviewers();

	/**
	 * Returns the value of the '<em><b>Endorser</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endorser</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endorser</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Endorser()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getEndorsers();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_RelatedArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifacts();

	/**
	 * Returns the value of the '<em><b>Synthesis Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthesis Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #setSynthesisType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_SynthesisType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSynthesisType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getSynthesisType <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthesis Type</em>' containment reference.
	 * @see #getSynthesisType()
	 * @generated
	 */
	void setSynthesisType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Study Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Type</em>' containment reference.
	 * @see #setStudyType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_StudyType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStudyType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getStudyType <em>Study Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Type</em>' containment reference.
	 * @see #getStudyType()
	 * @generated
	 */
	void setStudyType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPopulation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(Reference value);

	/**
	 * Returns the value of the '<em><b>Exposure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' containment reference.
	 * @see #setExposure(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Exposure()
	 * @model containment="true"
	 * @generated
	 */
	Reference getExposure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getExposure <em>Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' containment reference.
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Outcome()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Reference value);

	/**
	 * Returns the value of the '<em><b>Sample Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Size</em>' containment reference.
	 * @see #setSampleSize(RiskEvidenceSynthesisSampleSize)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_SampleSize()
	 * @model containment="true"
	 * @generated
	 */
	RiskEvidenceSynthesisSampleSize getSampleSize();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getSampleSize <em>Sample Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Size</em>' containment reference.
	 * @see #getSampleSize()
	 * @generated
	 */
	void setSampleSize(RiskEvidenceSynthesisSampleSize value);

	/**
	 * Returns the value of the '<em><b>Risk Estimate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Estimate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Estimate</em>' containment reference.
	 * @see #setRiskEstimate(RiskEvidenceSynthesisRiskEstimate)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_RiskEstimate()
	 * @model containment="true"
	 * @generated
	 */
	RiskEvidenceSynthesisRiskEstimate getRiskEstimate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesis#getRiskEstimate <em>Risk Estimate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Estimate</em>' containment reference.
	 * @see #getRiskEstimate()
	 * @generated
	 */
	void setRiskEstimate(RiskEvidenceSynthesisRiskEstimate value);

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.RiskEvidenceSynthesisCertainty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesis_Certainty()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskEvidenceSynthesisCertainty> getCertainties();

} // RiskEvidenceSynthesis
