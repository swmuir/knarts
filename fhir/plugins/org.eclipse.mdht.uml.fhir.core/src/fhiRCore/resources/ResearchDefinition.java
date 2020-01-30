/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DataType;
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
 * A representation of the model object '<em><b>Research Definition</b></em>'.
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
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getShortTitle <em>Short Title</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getComments <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getUsage <em>Usage</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getTopics <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getEditors <em>Editor</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getLibraries <em>Library</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getPopulation <em>Population</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getExposure <em>Exposure</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getExposureAlternative <em>Exposure Alternative</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchDefinition#getOutcome <em>Outcome</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition()
 * @model
 * @generated
 */
public interface ResearchDefinition extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getUrl <em>Url</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getVersion <em>Version</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getName <em>Name</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Short Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Title</em>' containment reference.
	 * @see #setShortTitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_ShortTitle()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getShortTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getShortTitle <em>Short Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Title</em>' containment reference.
	 * @see #getShortTitle()
	 * @generated
	 */
	void setShortTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Subtitle()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSubtitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experimental</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Experimental()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subjectx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectx</em>' containment reference.
	 * @see #setSubjectx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Subjectx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='subject[x]'"
	 * @generated
	 */
	DataType getSubjectx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getSubjectx <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectx</em>' containment reference.
	 * @see #getSubjectx()
	 * @generated
	 */
	void setSubjectx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getDate <em>Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Contact()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getComments();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_UseContext()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference.
	 * @see #setUsage(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Usage()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getUsage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getUsage <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' containment reference.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getCopyright <em>Copyright</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_ApprovalDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getApprovalDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getApprovalDate <em>Approval Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_LastReviewDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getLastReviewDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getLastReviewDate <em>Last Review Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_EffectivePeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getEffectivePeriod <em>Effective Period</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Topic()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Author()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Editor()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Reviewer()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Endorser()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_RelatedArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifacts();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Library()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibraries();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPopulation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getPopulation <em>Population</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Exposure()
	 * @model containment="true"
	 * @generated
	 */
	Reference getExposure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getExposure <em>Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' containment reference.
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(Reference value);

	/**
	 * Returns the value of the '<em><b>Exposure Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Alternative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Alternative</em>' containment reference.
	 * @see #setExposureAlternative(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_ExposureAlternative()
	 * @model containment="true"
	 * @generated
	 */
	Reference getExposureAlternative();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getExposureAlternative <em>Exposure Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Alternative</em>' containment reference.
	 * @see #getExposureAlternative()
	 * @generated
	 */
	void setExposureAlternative(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchDefinition_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchDefinition#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Reference value);

} // ResearchDefinition
