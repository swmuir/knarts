/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;
import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The container for all of the metadata associated
 * 				with a CDS knowledge artifact. Ideally, the metadata for artifacts
 * 				is provided independently by the publisher for determining which
 * 				artifact to retrieve.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getSchemaIdentifier <em>Schema Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getTemplateIds <em>Template Ids</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getDataModels <em>Data Models</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getRelatedResources <em>Related Resources</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getKeyTerms <em>Key Terms</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getEventHistory <em>Event History</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Metadata#getUsageTerms <em>Usage Terms</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata()
 * @model extendedMetaData="name='Metadata' kind='elementOnly'"
 * @generated
 */
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each version of a CDS knowledge artifact may have more than one identifier associated with it.  Note that each identifier must be globally unique in the universe of CDS knowledge artifacts in which a particular artifact resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference.
	 * @see #setIdentifiers(IdentifiersType2)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Identifiers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiersType2 getIdentifiers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getIdentifiers <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiers</em>' containment reference.
	 * @see #getIdentifiers()
	 * @generated
	 */
	void setIdentifiers(IdentifiersType2 value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Currently three types of artifacts are in scope for Health eDecisions Use Case #1:  order sets, event-condition-action rules, and documentation templates.  Additional types will be added in future revisions of the standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Type</em>' containment reference.
	 * @see #setArtifactType(ArtifactTypeType1)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_ArtifactType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifactType' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactTypeType1 getArtifactType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getArtifactType <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' containment reference.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(ArtifactTypeType1 value);

	/**
	 * Returns the value of the '<em><b>Schema Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the identifier of the XML schema (and its version) which governs the structure of this CDS Knowledge Artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Identifier</em>' containment reference.
	 * @see #setSchemaIdentifier(VersionedIdentifier)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_SchemaIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schemaIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionedIdentifier getSchemaIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getSchemaIdentifier <em>Schema Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Identifier</em>' containment reference.
	 * @see #getSchemaIdentifier()
	 * @generated
	 */
	void setSchemaIdentifier(VersionedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Template Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the identifiers of templates which
	 * 						further constrain the structure of this knowledge artifact.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Ids</em>' containment reference.
	 * @see #setTemplateIds(TemplateIdsType1)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_TemplateIds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateIds' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplateIdsType1 getTemplateIds();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getTemplateIds <em>Template Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Ids</em>' containment reference.
	 * @see #getTemplateIds()
	 * @generated
	 */
	void setTemplateIds(TemplateIdsType1 value);

	/**
	 * Returns the value of the '<em><b>Data Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of data models referenced in the Expression
	 * 						objects in this knowledge artifact.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Models</em>' containment reference.
	 * @see #setDataModels(DataModelsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_DataModels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataModels' namespace='##targetNamespace'"
	 * @generated
	 */
	DataModelsType getDataModels();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getDataModels <em>Data Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Models</em>' containment reference.
	 * @see #getDataModels()
	 * @generated
	 */
	void setDataModels(DataModelsType value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of libraries referenced by this artifact. Components of referenced libraries may be referenced by this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference.
	 * @see #setLibraries(LibrariesType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Libraries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='libraries' namespace='##targetNamespace'"
	 * @generated
	 */
	LibrariesType getLibraries();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getLibraries <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries</em>' containment reference.
	 * @see #getLibraries()
	 * @generated
	 */
	void setLibraries(LibrariesType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(ST)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(ST value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(ST)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(ST value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation for this knowledge reference may
	 * 						consist of a reference to an external resource; the documentation
	 * 						may also be included in-line if desired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(InlineResource)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineResource getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(InlineResource value);

	/**
	 * Returns the value of the '<em><b>Related Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of resources related to this artifact,
	 * 						along with an indication of the type of relationship. An artifact
	 * 						may be derived from or depend on other artifacts, along with other
	 * 						types of relationships. See the Artifact Lifecycle diagram in the
	 * 						Implementation Guide for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Resources</em>' containment reference.
	 * @see #setRelatedResources(RelatedResourcesType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_RelatedResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedResources' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedResourcesType getRelatedResources();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getRelatedResources <em>Related Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Resources</em>' containment reference.
	 * @see #getRelatedResources()
	 * @generated
	 */
	void setRelatedResources(RelatedResourcesType value);

	/**
	 * Returns the value of the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Evidence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Evidence</em>' containment reference.
	 * @see #setSupportingEvidence(SupportingEvidence)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_SupportingEvidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingEvidence' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportingEvidence getSupportingEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getSupportingEvidence <em>Supporting Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Evidence</em>' containment reference.
	 * @see #getSupportingEvidence()
	 * @generated
	 */
	void setSupportingEvidence(SupportingEvidence value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the conditions under which this
	 * 						artifact is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference.
	 * @see #setApplicability(ApplicabilityType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicabilityType getApplicability();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getApplicability <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' containment reference.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(ApplicabilityType value);

	/**
	 * Returns the value of the '<em><b>Key Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a list of coded key terms that pertain to this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Terms</em>' containment reference.
	 * @see #setKeyTerms(KeyTermsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_KeyTerms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyTerms' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyTermsType getKeyTerms();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getKeyTerms <em>Key Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Terms</em>' containment reference.
	 * @see #getKeyTerms()
	 * @generated
	 */
	void setKeyTerms(KeyTermsType value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a list of coded categories to which this
	 * 						artifact belongs.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(CategoriesType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Categories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categories' namespace='##targetNamespace'"
	 * @generated
	 */
	CategoriesType getCategories();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(CategoriesType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CD)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CD getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CD value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the history of events which have occurred
	 * 						for this particular version of the artifact.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference.
	 * @see #setEventHistory(EventHistoryType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_EventHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EventHistoryType getEventHistory();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getEventHistory <em>Event History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event History</em>' containment reference.
	 * @see #getEventHistory()
	 * @generated
	 */
	void setEventHistory(EventHistoryType value);

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes a list of people and/or organizations
	 * 						who have contributed to the development of this artifact.
	 * 						Contributions are not necessarily tied to specific versions of the
	 * 						artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference.
	 * @see #setContributions(ContributionsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Contributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributions' namespace='##targetNamespace'"
	 * @generated
	 */
	ContributionsType getContributions();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getContributions <em>Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributions</em>' containment reference.
	 * @see #getContributions()
	 * @generated
	 */
	void setContributions(ContributionsType value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of people and/or organizations who
	 * 						publish the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference.
	 * @see #setPublishers(PublishersType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_Publishers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publishers' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishersType getPublishers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getPublishers <em>Publishers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishers</em>' containment reference.
	 * @see #getPublishers()
	 * @generated
	 */
	void setPublishers(PublishersType value);

	/**
	 * Returns the value of the '<em><b>Usage Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the set of rights reserved by the person
	 * 						or organization holding the rights to this artifact, along with
	 * 						the set of permissions granted to consumers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Terms</em>' containment reference.
	 * @see #setUsageTerms(UsageTermsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadata_UsageTerms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageTerms' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageTermsType getUsageTerms();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Metadata#getUsageTerms <em>Usage Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Terms</em>' containment reference.
	 * @see #getUsageTerms()
	 * @generated
	 */
	void setUsageTerms(UsageTermsType value);

} // Metadata
