/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.RelatedArtifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study</b></em>'.
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
 *   <li>{@link fhiRCore.resources.ResearchStudy#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getPrimaryPurposeType <em>Primary Purpose Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getPhase <em>Phase</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getConditions <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getKeywords <em>Keyword</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getEnrollments <em>Enrollment</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getSites <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getReasonStopped <em>Reason Stopped</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getArms <em>Arm</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchStudy#getObjectives <em>Objective</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy()
 * @model
 * @generated
 */
public interface ResearchStudy extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getProtocols();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Primary Purpose Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Purpose Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Purpose Type</em>' containment reference.
	 * @see #setPrimaryPurposeType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_PrimaryPurposeType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPrimaryPurposeType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getPrimaryPurposeType <em>Primary Purpose Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Purpose Type</em>' containment reference.
	 * @see #getPrimaryPurposeType()
	 * @generated
	 */
	void setPrimaryPurposeType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Phase()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPhase();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Focus()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getFoci();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getConditions();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getContacts();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_RelatedArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedArtifact> getRelatedArtifacts();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Keyword()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getKeywords();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getLocations();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Enrollment</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Enrollment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEnrollments();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Sponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sponsor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sponsor</em>' containment reference.
	 * @see #setSponsor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Sponsor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSponsor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getSponsor <em>Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsor</em>' containment reference.
	 * @see #getSponsor()
	 * @generated
	 */
	void setSponsor(Reference value);

	/**
	 * Returns the value of the '<em><b>Principal Investigator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal Investigator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #setPrincipalInvestigator(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_PrincipalInvestigator()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPrincipalInvestigator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getPrincipalInvestigator <em>Principal Investigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #getPrincipalInvestigator()
	 * @generated
	 */
	void setPrincipalInvestigator(Reference value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Site()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSites();

	/**
	 * Returns the value of the '<em><b>Reason Stopped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Stopped</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Stopped</em>' containment reference.
	 * @see #setReasonStopped(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_ReasonStopped()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReasonStopped();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchStudy#getReasonStopped <em>Reason Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Stopped</em>' containment reference.
	 * @see #getReasonStopped()
	 * @generated
	 */
	void setReasonStopped(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Arm</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ResearchStudyArm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Arm()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResearchStudyArm> getArms();

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ResearchStudyObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getResearchStudy_Objective()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResearchStudyObjective> getObjectives();

} // ResearchStudy
