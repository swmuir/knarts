/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.ActivityDefinitionDynamicValue;
import fhiRCore.resources.ActivityDefinitionParticipant;
import fhiRCore.resources.Library;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureDefinition;
import fhiRCore.resources.StructureMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getEditors <em>Editor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getLibraries <em>Library</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getProductx <em>Productx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getDosages <em>Dosage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getSpecimenRequirements <em>Specimen Requirement</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getObservationRequirements <em>Observation Requirement</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getObservationResultRequirements <em>Observation Result Requirement</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ActivityDefinitionImpl#getDynamicValues <em>Dynamic Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDefinitionImpl extends DomainResourceImpl implements ActivityDefinition {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String subtitle;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean experimental;

	/**
	 * The cached value of the '{@link #getSubjectx() <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectx()
	 * @generated
	 * @ordered
	 */
	protected DataType subjectx;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String publisher;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contacts;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getUseContexts() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContexts;

	/**
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String usage;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topics;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> authors;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> editors;

	/**
	 * The cached value of the '{@link #getReviewers() <em>Reviewer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> reviewers;

	/**
	 * The cached value of the '{@link #getEndorsers() <em>Endorser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> endorsers;

	/**
	 * The cached value of the '{@link #getRelatedArtifacts() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifacts;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Code kind;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition profile;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean doNotPerform;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinitionParticipant> participants;

	/**
	 * The cached value of the '{@link #getProductx() <em>Productx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductx()
	 * @generated
	 * @ordered
	 */
	protected DataType productx;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosages;

	/**
	 * The cached value of the '{@link #getBodySites() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySites;

	/**
	 * The cached value of the '{@link #getSpecimenRequirements() <em>Specimen Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimenRequirements;

	/**
	 * The cached value of the '{@link #getObservationRequirements() <em>Observation Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> observationRequirements;

	/**
	 * The cached value of the '{@link #getObservationResultRequirements() <em>Observation Result Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationResultRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> observationResultRequirements;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected StructureMap transform;

	/**
	 * The cached value of the '{@link #getDynamicValues() <em>Dynamic Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinitionDynamicValue> dynamicValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getActivityDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(fhiRCore.dataTypes.String newTitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(fhiRCore.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(fhiRCore.dataTypes.String newSubtitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE, oldSubtitle, newSubtitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(fhiRCore.dataTypes.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(fhiRCore.dataTypes.Boolean newExperimental, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(fhiRCore.dataTypes.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSubjectx() {
		return subjectx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectx(DataType newSubjectx, NotificationChain msgs) {
		DataType oldSubjectx = subjectx;
		subjectx = newSubjectx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX, oldSubjectx, newSubjectx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectx(DataType newSubjectx) {
		if (newSubjectx != subjectx) {
			NotificationChain msgs = null;
			if (subjectx != null)
				msgs = ((InternalEObject)subjectx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX, null, msgs);
			if (newSubjectx != null)
				msgs = ((InternalEObject)newSubjectx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX, null, msgs);
			msgs = basicSetSubjectx(newSubjectx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX, newSubjectx, newSubjectx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(fhiRCore.dataTypes.String newPublisher, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(fhiRCore.dataTypes.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.ACTIVITY_DEFINITION__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(Markdown newPurpose, NotificationChain msgs) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(fhiRCore.dataTypes.String newUsage, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(fhiRCore.dataTypes.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(Markdown newCopyright, NotificationChain msgs) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDate(Date newApprovalDate, NotificationChain msgs) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastReviewDate(Date newLastReviewDate, NotificationChain msgs) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ACTIVITY_DEFINITION__TOPIC);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.ACTIVITY_DEFINITION__EDITOR);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getReviewers() {
		if (reviewers == null) {
			reviewers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER);
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getEndorsers() {
		if (endorsers == null) {
			endorsers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER);
		}
		return endorsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getRelatedArtifacts() {
		if (relatedArtifacts == null) {
			relatedArtifacts = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this, ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(Code newKind, NotificationChain msgs) {
		Code oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Code newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(StructureDefinition newProfile, NotificationChain msgs) {
		StructureDefinition oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(StructureDefinition newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Code newIntent, NotificationChain msgs) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(fhiRCore.dataTypes.Boolean newDoNotPerform, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoNotPerform(fhiRCore.dataTypes.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingx(DataType newTimingx, NotificationChain msgs) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX, oldTimingx, newTimingx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingx(DataType newTimingx) {
		if (newTimingx != timingx) {
			NotificationChain msgs = null;
			if (timingx != null)
				msgs = ((InternalEObject)timingx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX, null, msgs);
			if (newTimingx != null)
				msgs = ((InternalEObject)newTimingx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX, null, msgs);
			msgs = basicSetTimingx(newTimingx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX, newTimingx, newTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefinitionParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<ActivityDefinitionParticipant>(ActivityDefinitionParticipant.class, this, ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProductx() {
		return productx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductx(DataType newProductx, NotificationChain msgs) {
		DataType oldProductx = productx;
		productx = newProductx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX, oldProductx, newProductx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductx(DataType newProductx) {
		if (newProductx != productx) {
			NotificationChain msgs = null;
			if (productx != null)
				msgs = ((InternalEObject)productx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX, null, msgs);
			if (newProductx != null)
				msgs = ((InternalEObject)newProductx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX, null, msgs);
			msgs = basicSetProductx(newProductx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX, newProductx, newProductx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dosage> getDosages() {
		if (dosages == null) {
			dosages = new EObjectContainmentEList<Dosage>(Dosage.class, this, ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE);
		}
		return bodySites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimenRequirements() {
		if (specimenRequirements == null) {
			specimenRequirements = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT);
		}
		return specimenRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getObservationRequirements() {
		if (observationRequirements == null) {
			observationRequirements = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT);
		}
		return observationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getObservationResultRequirements() {
		if (observationResultRequirements == null) {
			observationResultRequirements = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT);
		}
		return observationResultRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(StructureMap newTransform, NotificationChain msgs) {
		StructureMap oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(StructureMap newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefinitionDynamicValue> getDynamicValues() {
		if (dynamicValues == null) {
			dynamicValues = new EObjectContainmentEList<ActivityDefinitionDynamicValue>(ActivityDefinitionDynamicValue.class, this, ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE);
		}
		return dynamicValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ACTIVITY_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX:
				return basicSetSubjectx(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__USAGE:
				return basicSetUsage(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__TOPIC:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__EDITOR:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER:
				return ((InternalEList<?>)getEndorsers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__KIND:
				return basicSetKind(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PROFILE:
				return basicSetProfile(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX:
				return basicSetTimingx(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX:
				return basicSetProductx(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE:
				return ((InternalEList<?>)getDosages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return ((InternalEList<?>)getBodySites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return ((InternalEList<?>)getSpecimenRequirements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return ((InternalEList<?>)getObservationRequirements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return ((InternalEList<?>)getObservationResultRequirements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return basicSetTransform(null, msgs);
			case ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return ((InternalEList<?>)getDynamicValues()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ACTIVITY_DEFINITION__URL:
				return getUrl();
			case ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ACTIVITY_DEFINITION__VERSION:
				return getVersion();
			case ResourcesPackage.ACTIVITY_DEFINITION__NAME:
				return getName();
			case ResourcesPackage.ACTIVITY_DEFINITION__TITLE:
				return getTitle();
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return getSubtitle();
			case ResourcesPackage.ACTIVITY_DEFINITION__STATUS:
				return getStatus();
			case ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX:
				return getSubjectx();
			case ResourcesPackage.ACTIVITY_DEFINITION__DATE:
				return getDate();
			case ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.ACTIVITY_DEFINITION__CONTACT:
				return getContacts();
			case ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE:
				return getPurpose();
			case ResourcesPackage.ACTIVITY_DEFINITION__USAGE:
				return getUsage();
			case ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return getApprovalDate();
			case ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case ResourcesPackage.ACTIVITY_DEFINITION__TOPIC:
				return getTopics();
			case ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR:
				return getAuthors();
			case ResourcesPackage.ACTIVITY_DEFINITION__EDITOR:
				return getEditors();
			case ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER:
				return getReviewers();
			case ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER:
				return getEndorsers();
			case ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY:
				return getLibraries();
			case ResourcesPackage.ACTIVITY_DEFINITION__KIND:
				return getKind();
			case ResourcesPackage.ACTIVITY_DEFINITION__PROFILE:
				return getProfile();
			case ResourcesPackage.ACTIVITY_DEFINITION__CODE:
				return getCode();
			case ResourcesPackage.ACTIVITY_DEFINITION__INTENT:
				return getIntent();
			case ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY:
				return getPriority();
			case ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return getDoNotPerform();
			case ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX:
				return getTimingx();
			case ResourcesPackage.ACTIVITY_DEFINITION__LOCATION:
				return getLocation();
			case ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX:
				return getProductx();
			case ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY:
				return getQuantity();
			case ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE:
				return getDosages();
			case ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return getBodySites();
			case ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return getSpecimenRequirements();
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return getObservationRequirements();
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return getObservationResultRequirements();
			case ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return getTransform();
			case ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return getDynamicValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.ACTIVITY_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE:
				setSubtitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX:
				setSubjectx((DataType)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__USAGE:
				setUsage((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EDITOR:
				getEditors().clear();
				getEditors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER:
				getEndorsers().clear();
				getEndorsers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends ActivityDefinitionParticipant>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX:
				setProductx((DataType)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends Dosage>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				getSpecimenRequirements().clear();
				getSpecimenRequirements().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				getObservationRequirements().clear();
				getObservationRequirements().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				getObservationResultRequirements().clear();
				getObservationResultRequirements().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM:
				setTransform((StructureMap)newValue);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				getDynamicValues().clear();
				getDynamicValues().addAll((Collection<? extends ActivityDefinitionDynamicValue>)newValue);
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
			case ResourcesPackage.ACTIVITY_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE:
				setSubtitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX:
				setSubjectx((DataType)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__USAGE:
				setUsage((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__EDITOR:
				getEditors().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER:
				getReviewers().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER:
				getEndorsers().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY:
				getLibraries().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX:
				setTimingx((DataType)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX:
				setProductx((DataType)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE:
				getDosages().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE:
				getBodySites().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				getSpecimenRequirements().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				getObservationRequirements().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				getObservationResultRequirements().clear();
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM:
				setTransform((StructureMap)null);
				return;
			case ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				getDynamicValues().clear();
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
			case ResourcesPackage.ACTIVITY_DEFINITION__URL:
				return url != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__VERSION:
				return version != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__NAME:
				return name != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__TITLE:
				return title != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE:
				return subtitle != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__STATUS:
				return status != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX:
				return subjectx != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__DATE:
				return date != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE:
				return purpose != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__USAGE:
				return usage != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__EDITOR:
				return editors != null && !editors.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER:
				return reviewers != null && !reviewers.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER:
				return endorsers != null && !endorsers.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY:
				return libraries != null && !libraries.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__KIND:
				return kind != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__PROFILE:
				return profile != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__CODE:
				return code != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__INTENT:
				return intent != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY:
				return priority != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM:
				return doNotPerform != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX:
				return timingx != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__LOCATION:
				return location != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX:
				return productx != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY:
				return quantity != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE:
				return dosages != null && !dosages.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT:
				return specimenRequirements != null && !specimenRequirements.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT:
				return observationRequirements != null && !observationRequirements.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT:
				return observationResultRequirements != null && !observationResultRequirements.isEmpty();
			case ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM:
				return transform != null;
			case ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE:
				return dynamicValues != null && !dynamicValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityDefinitionImpl
