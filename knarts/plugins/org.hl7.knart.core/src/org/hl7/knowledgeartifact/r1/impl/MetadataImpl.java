/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.CD;
import org.hl7.cdsdt.r2.ST;

import org.hl7.knowledgeartifact.r1.ApplicabilityType;
import org.hl7.knowledgeartifact.r1.ArtifactTypeType;
import org.hl7.knowledgeartifact.r1.CategoriesType;
import org.hl7.knowledgeartifact.r1.ContributionsType;
import org.hl7.knowledgeartifact.r1.DataModelsType;
import org.hl7.knowledgeartifact.r1.EventHistoryType;
import org.hl7.knowledgeartifact.r1.IdentifiersType1;
import org.hl7.knowledgeartifact.r1.InlineResource;
import org.hl7.knowledgeartifact.r1.KeyTermsType;
import org.hl7.knowledgeartifact.r1.LibrariesType;
import org.hl7.knowledgeartifact.r1.Metadata;
import org.hl7.knowledgeartifact.r1.PublishersType;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RelatedResourcesType;
import org.hl7.knowledgeartifact.r1.StatusType;
import org.hl7.knowledgeartifact.r1.SupportingEvidence;
import org.hl7.knowledgeartifact.r1.TemplateIdsType1;
import org.hl7.knowledgeartifact.r1.UsageTermsType;
import org.hl7.knowledgeartifact.r1.VersionedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getSchemaIdentifier <em>Schema Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getTemplateIds <em>Template Ids</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getDataModels <em>Data Models</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getRelatedResources <em>Related Resources</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getKeyTerms <em>Key Terms</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getEventHistory <em>Event History</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl#getUsageTerms <em>Usage Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected IdentifiersType1 identifiers;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected ArtifactTypeType artifactType;

	/**
	 * The cached value of the '{@link #getSchemaIdentifier() <em>Schema Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VersionedIdentifier schemaIdentifier;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected TemplateIdsType1 templateIds;

	/**
	 * The cached value of the '{@link #getDataModels() <em>Data Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModels()
	 * @generated
	 * @ordered
	 */
	protected DataModelsType dataModels;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected LibrariesType libraries;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected ST title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected ST description;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected InlineResource documentation;

	/**
	 * The cached value of the '{@link #getRelatedResources() <em>Related Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedResources()
	 * @generated
	 * @ordered
	 */
	protected RelatedResourcesType relatedResources;

	/**
	 * The cached value of the '{@link #getSupportingEvidence() <em>Supporting Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingEvidence()
	 * @generated
	 * @ordered
	 */
	protected SupportingEvidence supportingEvidence;

	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected ApplicabilityType applicability;

	/**
	 * The cached value of the '{@link #getKeyTerms() <em>Key Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyTerms()
	 * @generated
	 * @ordered
	 */
	protected KeyTermsType keyTerms;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected CategoriesType categories;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CD language;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status;

	/**
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EventHistoryType eventHistory;

	/**
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
	protected ContributionsType contributions;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected PublishersType publishers;

	/**
	 * The cached value of the '{@link #getUsageTerms() <em>Usage Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageTerms()
	 * @generated
	 * @ordered
	 */
	protected UsageTermsType usageTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType1 getIdentifiers() {
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiers(IdentifiersType1 newIdentifiers, NotificationChain msgs) {
		IdentifiersType1 oldIdentifiers = identifiers;
		identifiers = newIdentifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__IDENTIFIERS, oldIdentifiers, newIdentifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiers(IdentifiersType1 newIdentifiers) {
		if (newIdentifiers != identifiers) {
			NotificationChain msgs = null;
			if (identifiers != null)
				msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__IDENTIFIERS, null, msgs);
			if (newIdentifiers != null)
				msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__IDENTIFIERS, null, msgs);
			msgs = basicSetIdentifiers(newIdentifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__IDENTIFIERS, newIdentifiers, newIdentifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTypeType getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactType(ArtifactTypeType newArtifactType, NotificationChain msgs) {
		ArtifactTypeType oldArtifactType = artifactType;
		artifactType = newArtifactType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__ARTIFACT_TYPE, oldArtifactType, newArtifactType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(ArtifactTypeType newArtifactType) {
		if (newArtifactType != artifactType) {
			NotificationChain msgs = null;
			if (artifactType != null)
				msgs = ((InternalEObject)artifactType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__ARTIFACT_TYPE, null, msgs);
			if (newArtifactType != null)
				msgs = ((InternalEObject)newArtifactType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__ARTIFACT_TYPE, null, msgs);
			msgs = basicSetArtifactType(newArtifactType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__ARTIFACT_TYPE, newArtifactType, newArtifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedIdentifier getSchemaIdentifier() {
		return schemaIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaIdentifier(VersionedIdentifier newSchemaIdentifier, NotificationChain msgs) {
		VersionedIdentifier oldSchemaIdentifier = schemaIdentifier;
		schemaIdentifier = newSchemaIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__SCHEMA_IDENTIFIER, oldSchemaIdentifier, newSchemaIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaIdentifier(VersionedIdentifier newSchemaIdentifier) {
		if (newSchemaIdentifier != schemaIdentifier) {
			NotificationChain msgs = null;
			if (schemaIdentifier != null)
				msgs = ((InternalEObject)schemaIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__SCHEMA_IDENTIFIER, null, msgs);
			if (newSchemaIdentifier != null)
				msgs = ((InternalEObject)newSchemaIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__SCHEMA_IDENTIFIER, null, msgs);
			msgs = basicSetSchemaIdentifier(newSchemaIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__SCHEMA_IDENTIFIER, newSchemaIdentifier, newSchemaIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateIdsType1 getTemplateIds() {
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateIds(TemplateIdsType1 newTemplateIds, NotificationChain msgs) {
		TemplateIdsType1 oldTemplateIds = templateIds;
		templateIds = newTemplateIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__TEMPLATE_IDS, oldTemplateIds, newTemplateIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateIds(TemplateIdsType1 newTemplateIds) {
		if (newTemplateIds != templateIds) {
			NotificationChain msgs = null;
			if (templateIds != null)
				msgs = ((InternalEObject)templateIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__TEMPLATE_IDS, null, msgs);
			if (newTemplateIds != null)
				msgs = ((InternalEObject)newTemplateIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__TEMPLATE_IDS, null, msgs);
			msgs = basicSetTemplateIds(newTemplateIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__TEMPLATE_IDS, newTemplateIds, newTemplateIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelsType getDataModels() {
		return dataModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataModels(DataModelsType newDataModels, NotificationChain msgs) {
		DataModelsType oldDataModels = dataModels;
		dataModels = newDataModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DATA_MODELS, oldDataModels, newDataModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataModels(DataModelsType newDataModels) {
		if (newDataModels != dataModels) {
			NotificationChain msgs = null;
			if (dataModels != null)
				msgs = ((InternalEObject)dataModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DATA_MODELS, null, msgs);
			if (newDataModels != null)
				msgs = ((InternalEObject)newDataModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DATA_MODELS, null, msgs);
			msgs = basicSetDataModels(newDataModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DATA_MODELS, newDataModels, newDataModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibrariesType getLibraries() {
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraries(LibrariesType newLibraries, NotificationChain msgs) {
		LibrariesType oldLibraries = libraries;
		libraries = newLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__LIBRARIES, oldLibraries, newLibraries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraries(LibrariesType newLibraries) {
		if (newLibraries != libraries) {
			NotificationChain msgs = null;
			if (libraries != null)
				msgs = ((InternalEObject)libraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__LIBRARIES, null, msgs);
			if (newLibraries != null)
				msgs = ((InternalEObject)newLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__LIBRARIES, null, msgs);
			msgs = basicSetLibraries(newLibraries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__LIBRARIES, newLibraries, newLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(ST newTitle, NotificationChain msgs) {
		ST oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(ST newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(ST newDescription, NotificationChain msgs) {
		ST oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(ST newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineResource getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(InlineResource newDocumentation, NotificationChain msgs) {
		InlineResource oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(InlineResource newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResourcesType getRelatedResources() {
		return relatedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedResources(RelatedResourcesType newRelatedResources, NotificationChain msgs) {
		RelatedResourcesType oldRelatedResources = relatedResources;
		relatedResources = newRelatedResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__RELATED_RESOURCES, oldRelatedResources, newRelatedResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedResources(RelatedResourcesType newRelatedResources) {
		if (newRelatedResources != relatedResources) {
			NotificationChain msgs = null;
			if (relatedResources != null)
				msgs = ((InternalEObject)relatedResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__RELATED_RESOURCES, null, msgs);
			if (newRelatedResources != null)
				msgs = ((InternalEObject)newRelatedResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__RELATED_RESOURCES, null, msgs);
			msgs = basicSetRelatedResources(newRelatedResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__RELATED_RESOURCES, newRelatedResources, newRelatedResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingEvidence getSupportingEvidence() {
		return supportingEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportingEvidence(SupportingEvidence newSupportingEvidence, NotificationChain msgs) {
		SupportingEvidence oldSupportingEvidence = supportingEvidence;
		supportingEvidence = newSupportingEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__SUPPORTING_EVIDENCE, oldSupportingEvidence, newSupportingEvidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingEvidence(SupportingEvidence newSupportingEvidence) {
		if (newSupportingEvidence != supportingEvidence) {
			NotificationChain msgs = null;
			if (supportingEvidence != null)
				msgs = ((InternalEObject)supportingEvidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__SUPPORTING_EVIDENCE, null, msgs);
			if (newSupportingEvidence != null)
				msgs = ((InternalEObject)newSupportingEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__SUPPORTING_EVIDENCE, null, msgs);
			msgs = basicSetSupportingEvidence(newSupportingEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__SUPPORTING_EVIDENCE, newSupportingEvidence, newSupportingEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityType getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicability(ApplicabilityType newApplicability, NotificationChain msgs) {
		ApplicabilityType oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__APPLICABILITY, oldApplicability, newApplicability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicability(ApplicabilityType newApplicability) {
		if (newApplicability != applicability) {
			NotificationChain msgs = null;
			if (applicability != null)
				msgs = ((InternalEObject)applicability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__APPLICABILITY, null, msgs);
			if (newApplicability != null)
				msgs = ((InternalEObject)newApplicability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__APPLICABILITY, null, msgs);
			msgs = basicSetApplicability(newApplicability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__APPLICABILITY, newApplicability, newApplicability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTermsType getKeyTerms() {
		return keyTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyTerms(KeyTermsType newKeyTerms, NotificationChain msgs) {
		KeyTermsType oldKeyTerms = keyTerms;
		keyTerms = newKeyTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__KEY_TERMS, oldKeyTerms, newKeyTerms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyTerms(KeyTermsType newKeyTerms) {
		if (newKeyTerms != keyTerms) {
			NotificationChain msgs = null;
			if (keyTerms != null)
				msgs = ((InternalEObject)keyTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__KEY_TERMS, null, msgs);
			if (newKeyTerms != null)
				msgs = ((InternalEObject)newKeyTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__KEY_TERMS, null, msgs);
			msgs = basicSetKeyTerms(newKeyTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__KEY_TERMS, newKeyTerms, newKeyTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesType getCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
		CategoriesType oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__CATEGORIES, oldCategories, newCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(CategoriesType newCategories) {
		if (newCategories != categories) {
			NotificationChain msgs = null;
			if (categories != null)
				msgs = ((InternalEObject)categories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__CATEGORIES, null, msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__CATEGORIES, null, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__CATEGORIES, newCategories, newCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CD newLanguage, NotificationChain msgs) {
		CD oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(CD newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusType newStatus, NotificationChain msgs) {
		StatusType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHistoryType getEventHistory() {
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHistory(EventHistoryType newEventHistory, NotificationChain msgs) {
		EventHistoryType oldEventHistory = eventHistory;
		eventHistory = newEventHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__EVENT_HISTORY, oldEventHistory, newEventHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHistory(EventHistoryType newEventHistory) {
		if (newEventHistory != eventHistory) {
			NotificationChain msgs = null;
			if (eventHistory != null)
				msgs = ((InternalEObject)eventHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__EVENT_HISTORY, null, msgs);
			if (newEventHistory != null)
				msgs = ((InternalEObject)newEventHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__EVENT_HISTORY, null, msgs);
			msgs = basicSetEventHistory(newEventHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__EVENT_HISTORY, newEventHistory, newEventHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionsType getContributions() {
		return contributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributions(ContributionsType newContributions, NotificationChain msgs) {
		ContributionsType oldContributions = contributions;
		contributions = newContributions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__CONTRIBUTIONS, oldContributions, newContributions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributions(ContributionsType newContributions) {
		if (newContributions != contributions) {
			NotificationChain msgs = null;
			if (contributions != null)
				msgs = ((InternalEObject)contributions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__CONTRIBUTIONS, null, msgs);
			if (newContributions != null)
				msgs = ((InternalEObject)newContributions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__CONTRIBUTIONS, null, msgs);
			msgs = basicSetContributions(newContributions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__CONTRIBUTIONS, newContributions, newContributions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishersType getPublishers() {
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishers(PublishersType newPublishers, NotificationChain msgs) {
		PublishersType oldPublishers = publishers;
		publishers = newPublishers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__PUBLISHERS, oldPublishers, newPublishers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishers(PublishersType newPublishers) {
		if (newPublishers != publishers) {
			NotificationChain msgs = null;
			if (publishers != null)
				msgs = ((InternalEObject)publishers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__PUBLISHERS, null, msgs);
			if (newPublishers != null)
				msgs = ((InternalEObject)newPublishers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__PUBLISHERS, null, msgs);
			msgs = basicSetPublishers(newPublishers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__PUBLISHERS, newPublishers, newPublishers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTermsType getUsageTerms() {
		return usageTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsageTerms(UsageTermsType newUsageTerms, NotificationChain msgs) {
		UsageTermsType oldUsageTerms = usageTerms;
		usageTerms = newUsageTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.METADATA__USAGE_TERMS, oldUsageTerms, newUsageTerms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageTerms(UsageTermsType newUsageTerms) {
		if (newUsageTerms != usageTerms) {
			NotificationChain msgs = null;
			if (usageTerms != null)
				msgs = ((InternalEObject)usageTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__USAGE_TERMS, null, msgs);
			if (newUsageTerms != null)
				msgs = ((InternalEObject)newUsageTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.METADATA__USAGE_TERMS, null, msgs);
			msgs = basicSetUsageTerms(newUsageTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.METADATA__USAGE_TERMS, newUsageTerms, newUsageTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.METADATA__IDENTIFIERS:
				return basicSetIdentifiers(null, msgs);
			case R1Package.METADATA__ARTIFACT_TYPE:
				return basicSetArtifactType(null, msgs);
			case R1Package.METADATA__SCHEMA_IDENTIFIER:
				return basicSetSchemaIdentifier(null, msgs);
			case R1Package.METADATA__TEMPLATE_IDS:
				return basicSetTemplateIds(null, msgs);
			case R1Package.METADATA__DATA_MODELS:
				return basicSetDataModels(null, msgs);
			case R1Package.METADATA__LIBRARIES:
				return basicSetLibraries(null, msgs);
			case R1Package.METADATA__TITLE:
				return basicSetTitle(null, msgs);
			case R1Package.METADATA__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case R1Package.METADATA__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case R1Package.METADATA__RELATED_RESOURCES:
				return basicSetRelatedResources(null, msgs);
			case R1Package.METADATA__SUPPORTING_EVIDENCE:
				return basicSetSupportingEvidence(null, msgs);
			case R1Package.METADATA__APPLICABILITY:
				return basicSetApplicability(null, msgs);
			case R1Package.METADATA__KEY_TERMS:
				return basicSetKeyTerms(null, msgs);
			case R1Package.METADATA__CATEGORIES:
				return basicSetCategories(null, msgs);
			case R1Package.METADATA__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case R1Package.METADATA__STATUS:
				return basicSetStatus(null, msgs);
			case R1Package.METADATA__EVENT_HISTORY:
				return basicSetEventHistory(null, msgs);
			case R1Package.METADATA__CONTRIBUTIONS:
				return basicSetContributions(null, msgs);
			case R1Package.METADATA__PUBLISHERS:
				return basicSetPublishers(null, msgs);
			case R1Package.METADATA__USAGE_TERMS:
				return basicSetUsageTerms(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R1Package.METADATA__IDENTIFIERS:
				return getIdentifiers();
			case R1Package.METADATA__ARTIFACT_TYPE:
				return getArtifactType();
			case R1Package.METADATA__SCHEMA_IDENTIFIER:
				return getSchemaIdentifier();
			case R1Package.METADATA__TEMPLATE_IDS:
				return getTemplateIds();
			case R1Package.METADATA__DATA_MODELS:
				return getDataModels();
			case R1Package.METADATA__LIBRARIES:
				return getLibraries();
			case R1Package.METADATA__TITLE:
				return getTitle();
			case R1Package.METADATA__DESCRIPTION:
				return getDescription();
			case R1Package.METADATA__DOCUMENTATION:
				return getDocumentation();
			case R1Package.METADATA__RELATED_RESOURCES:
				return getRelatedResources();
			case R1Package.METADATA__SUPPORTING_EVIDENCE:
				return getSupportingEvidence();
			case R1Package.METADATA__APPLICABILITY:
				return getApplicability();
			case R1Package.METADATA__KEY_TERMS:
				return getKeyTerms();
			case R1Package.METADATA__CATEGORIES:
				return getCategories();
			case R1Package.METADATA__LANGUAGE:
				return getLanguage();
			case R1Package.METADATA__STATUS:
				return getStatus();
			case R1Package.METADATA__EVENT_HISTORY:
				return getEventHistory();
			case R1Package.METADATA__CONTRIBUTIONS:
				return getContributions();
			case R1Package.METADATA__PUBLISHERS:
				return getPublishers();
			case R1Package.METADATA__USAGE_TERMS:
				return getUsageTerms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R1Package.METADATA__IDENTIFIERS:
				setIdentifiers((IdentifiersType1)newValue);
				return;
			case R1Package.METADATA__ARTIFACT_TYPE:
				setArtifactType((ArtifactTypeType)newValue);
				return;
			case R1Package.METADATA__SCHEMA_IDENTIFIER:
				setSchemaIdentifier((VersionedIdentifier)newValue);
				return;
			case R1Package.METADATA__TEMPLATE_IDS:
				setTemplateIds((TemplateIdsType1)newValue);
				return;
			case R1Package.METADATA__DATA_MODELS:
				setDataModels((DataModelsType)newValue);
				return;
			case R1Package.METADATA__LIBRARIES:
				setLibraries((LibrariesType)newValue);
				return;
			case R1Package.METADATA__TITLE:
				setTitle((ST)newValue);
				return;
			case R1Package.METADATA__DESCRIPTION:
				setDescription((ST)newValue);
				return;
			case R1Package.METADATA__DOCUMENTATION:
				setDocumentation((InlineResource)newValue);
				return;
			case R1Package.METADATA__RELATED_RESOURCES:
				setRelatedResources((RelatedResourcesType)newValue);
				return;
			case R1Package.METADATA__SUPPORTING_EVIDENCE:
				setSupportingEvidence((SupportingEvidence)newValue);
				return;
			case R1Package.METADATA__APPLICABILITY:
				setApplicability((ApplicabilityType)newValue);
				return;
			case R1Package.METADATA__KEY_TERMS:
				setKeyTerms((KeyTermsType)newValue);
				return;
			case R1Package.METADATA__CATEGORIES:
				setCategories((CategoriesType)newValue);
				return;
			case R1Package.METADATA__LANGUAGE:
				setLanguage((CD)newValue);
				return;
			case R1Package.METADATA__STATUS:
				setStatus((StatusType)newValue);
				return;
			case R1Package.METADATA__EVENT_HISTORY:
				setEventHistory((EventHistoryType)newValue);
				return;
			case R1Package.METADATA__CONTRIBUTIONS:
				setContributions((ContributionsType)newValue);
				return;
			case R1Package.METADATA__PUBLISHERS:
				setPublishers((PublishersType)newValue);
				return;
			case R1Package.METADATA__USAGE_TERMS:
				setUsageTerms((UsageTermsType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case R1Package.METADATA__IDENTIFIERS:
				setIdentifiers((IdentifiersType1)null);
				return;
			case R1Package.METADATA__ARTIFACT_TYPE:
				setArtifactType((ArtifactTypeType)null);
				return;
			case R1Package.METADATA__SCHEMA_IDENTIFIER:
				setSchemaIdentifier((VersionedIdentifier)null);
				return;
			case R1Package.METADATA__TEMPLATE_IDS:
				setTemplateIds((TemplateIdsType1)null);
				return;
			case R1Package.METADATA__DATA_MODELS:
				setDataModels((DataModelsType)null);
				return;
			case R1Package.METADATA__LIBRARIES:
				setLibraries((LibrariesType)null);
				return;
			case R1Package.METADATA__TITLE:
				setTitle((ST)null);
				return;
			case R1Package.METADATA__DESCRIPTION:
				setDescription((ST)null);
				return;
			case R1Package.METADATA__DOCUMENTATION:
				setDocumentation((InlineResource)null);
				return;
			case R1Package.METADATA__RELATED_RESOURCES:
				setRelatedResources((RelatedResourcesType)null);
				return;
			case R1Package.METADATA__SUPPORTING_EVIDENCE:
				setSupportingEvidence((SupportingEvidence)null);
				return;
			case R1Package.METADATA__APPLICABILITY:
				setApplicability((ApplicabilityType)null);
				return;
			case R1Package.METADATA__KEY_TERMS:
				setKeyTerms((KeyTermsType)null);
				return;
			case R1Package.METADATA__CATEGORIES:
				setCategories((CategoriesType)null);
				return;
			case R1Package.METADATA__LANGUAGE:
				setLanguage((CD)null);
				return;
			case R1Package.METADATA__STATUS:
				setStatus((StatusType)null);
				return;
			case R1Package.METADATA__EVENT_HISTORY:
				setEventHistory((EventHistoryType)null);
				return;
			case R1Package.METADATA__CONTRIBUTIONS:
				setContributions((ContributionsType)null);
				return;
			case R1Package.METADATA__PUBLISHERS:
				setPublishers((PublishersType)null);
				return;
			case R1Package.METADATA__USAGE_TERMS:
				setUsageTerms((UsageTermsType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case R1Package.METADATA__IDENTIFIERS:
				return identifiers != null;
			case R1Package.METADATA__ARTIFACT_TYPE:
				return artifactType != null;
			case R1Package.METADATA__SCHEMA_IDENTIFIER:
				return schemaIdentifier != null;
			case R1Package.METADATA__TEMPLATE_IDS:
				return templateIds != null;
			case R1Package.METADATA__DATA_MODELS:
				return dataModels != null;
			case R1Package.METADATA__LIBRARIES:
				return libraries != null;
			case R1Package.METADATA__TITLE:
				return title != null;
			case R1Package.METADATA__DESCRIPTION:
				return description != null;
			case R1Package.METADATA__DOCUMENTATION:
				return documentation != null;
			case R1Package.METADATA__RELATED_RESOURCES:
				return relatedResources != null;
			case R1Package.METADATA__SUPPORTING_EVIDENCE:
				return supportingEvidence != null;
			case R1Package.METADATA__APPLICABILITY:
				return applicability != null;
			case R1Package.METADATA__KEY_TERMS:
				return keyTerms != null;
			case R1Package.METADATA__CATEGORIES:
				return categories != null;
			case R1Package.METADATA__LANGUAGE:
				return language != null;
			case R1Package.METADATA__STATUS:
				return status != null;
			case R1Package.METADATA__EVENT_HISTORY:
				return eventHistory != null;
			case R1Package.METADATA__CONTRIBUTIONS:
				return contributions != null;
			case R1Package.METADATA__PUBLISHERS:
				return publishers != null;
			case R1Package.METADATA__USAGE_TERMS:
				return usageTerms != null;
		}
		return super.eIsSet(featureID);
	}

} //MetadataImpl
