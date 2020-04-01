/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactDetail;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;

import org.eclipse.mdht.hl7.fhir.resources.Library;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinition;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionAction;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionGoal;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getEditors <em>Editor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getLibraries <em>Library</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getGoals <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionImpl extends DomainResourceImpl implements PlanDefinition {
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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String subtitle;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean experimental;

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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String publisher;

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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String usage;

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
	 * The cached value of the '{@link #getGoals() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionGoal> goals;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPlanDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PLAN_DEFINITION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newVersion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubtitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__SUBTITLE, oldSubtitle, newSubtitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExperimental, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimental(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__SUBJECTX, oldSubjectx, newSubjectx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectx(DataType newSubjectx) {
		if (newSubjectx != subjectx) {
			NotificationChain msgs = null;
			if (subjectx != null)
				msgs = ((InternalEObject)subjectx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__SUBJECTX, null, msgs);
			if (newSubjectx != null)
				msgs = ((InternalEObject)newSubjectx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__SUBJECTX, null, msgs);
			msgs = basicSetSubjectx(newSubjectx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__SUBJECTX, newSubjectx, newSubjectx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.eclipse.mdht.hl7.fhir.dataTypes.String newPublisher, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(org.eclipse.mdht.hl7.fhir.dataTypes.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.PLAN_DEFINITION__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(org.eclipse.mdht.hl7.fhir.dataTypes.String newUsage, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(org.eclipse.mdht.hl7.fhir.dataTypes.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyright(Markdown newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalDate(Date newApprovalDate) {
		if (newApprovalDate != approvalDate) {
			NotificationChain msgs = null;
			if (approvalDate != null)
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE, newApprovalDate, newApprovalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastReviewDate(Date newLastReviewDate) {
		if (newLastReviewDate != lastReviewDate) {
			NotificationChain msgs = null;
			if (lastReviewDate != null)
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION__TOPIC);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.PLAN_DEFINITION__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.PLAN_DEFINITION__EDITOR);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getReviewers() {
		if (reviewers == null) {
			reviewers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.PLAN_DEFINITION__REVIEWER);
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getEndorsers() {
		if (endorsers == null) {
			endorsers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.PLAN_DEFINITION__ENDORSER);
		}
		return endorsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getRelatedArtifacts() {
		if (relatedArtifacts == null) {
			relatedArtifacts = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this, ResourcesPackage.PLAN_DEFINITION__LIBRARY);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionGoal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<PlanDefinitionGoal>(PlanDefinitionGoal.class, this, ResourcesPackage.PLAN_DEFINITION__GOAL);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<PlanDefinitionAction>(PlanDefinitionAction.class, this, ResourcesPackage.PLAN_DEFINITION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__SUBJECTX:
				return basicSetSubjectx(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__USAGE:
				return basicSetUsage(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION__TOPIC:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__EDITOR:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__REVIEWER:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__ENDORSER:
				return ((InternalEList<?>)getEndorsers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__LIBRARY:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__GOAL:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PLAN_DEFINITION__URL:
				return getUrl();
			case ResourcesPackage.PLAN_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PLAN_DEFINITION__VERSION:
				return getVersion();
			case ResourcesPackage.PLAN_DEFINITION__NAME:
				return getName();
			case ResourcesPackage.PLAN_DEFINITION__TITLE:
				return getTitle();
			case ResourcesPackage.PLAN_DEFINITION__SUBTITLE:
				return getSubtitle();
			case ResourcesPackage.PLAN_DEFINITION__TYPE:
				return getType();
			case ResourcesPackage.PLAN_DEFINITION__STATUS:
				return getStatus();
			case ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.PLAN_DEFINITION__SUBJECTX:
				return getSubjectx();
			case ResourcesPackage.PLAN_DEFINITION__DATE:
				return getDate();
			case ResourcesPackage.PLAN_DEFINITION__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.PLAN_DEFINITION__CONTACT:
				return getContacts();
			case ResourcesPackage.PLAN_DEFINITION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.PLAN_DEFINITION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.PLAN_DEFINITION__PURPOSE:
				return getPurpose();
			case ResourcesPackage.PLAN_DEFINITION__USAGE:
				return getUsage();
			case ResourcesPackage.PLAN_DEFINITION__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE:
				return getApprovalDate();
			case ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case ResourcesPackage.PLAN_DEFINITION__TOPIC:
				return getTopics();
			case ResourcesPackage.PLAN_DEFINITION__AUTHOR:
				return getAuthors();
			case ResourcesPackage.PLAN_DEFINITION__EDITOR:
				return getEditors();
			case ResourcesPackage.PLAN_DEFINITION__REVIEWER:
				return getReviewers();
			case ResourcesPackage.PLAN_DEFINITION__ENDORSER:
				return getEndorsers();
			case ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.PLAN_DEFINITION__LIBRARY:
				return getLibraries();
			case ResourcesPackage.PLAN_DEFINITION__GOAL:
				return getGoals();
			case ResourcesPackage.PLAN_DEFINITION__ACTION:
				return getActions();
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
			case ResourcesPackage.PLAN_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__SUBTITLE:
				setSubtitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__SUBJECTX:
				setSubjectx((DataType)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__USAGE:
				setUsage((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__EDITOR:
				getEditors().clear();
				getEditors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__REVIEWER:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__ENDORSER:
				getEndorsers().clear();
				getEndorsers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__LIBRARY:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__GOAL:
				getGoals().clear();
				getGoals().addAll((Collection<? extends PlanDefinitionGoal>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends PlanDefinitionAction>)newValue);
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
			case ResourcesPackage.PLAN_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__SUBTITLE:
				setSubtitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__SUBJECTX:
				setSubjectx((DataType)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__USAGE:
				setUsage((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__EDITOR:
				getEditors().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__REVIEWER:
				getReviewers().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__ENDORSER:
				getEndorsers().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__LIBRARY:
				getLibraries().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__GOAL:
				getGoals().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION__ACTION:
				getActions().clear();
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
			case ResourcesPackage.PLAN_DEFINITION__URL:
				return url != null;
			case ResourcesPackage.PLAN_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__VERSION:
				return version != null;
			case ResourcesPackage.PLAN_DEFINITION__NAME:
				return name != null;
			case ResourcesPackage.PLAN_DEFINITION__TITLE:
				return title != null;
			case ResourcesPackage.PLAN_DEFINITION__SUBTITLE:
				return subtitle != null;
			case ResourcesPackage.PLAN_DEFINITION__TYPE:
				return type != null;
			case ResourcesPackage.PLAN_DEFINITION__STATUS:
				return status != null;
			case ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.PLAN_DEFINITION__SUBJECTX:
				return subjectx != null;
			case ResourcesPackage.PLAN_DEFINITION__DATE:
				return date != null;
			case ResourcesPackage.PLAN_DEFINITION__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.PLAN_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__PURPOSE:
				return purpose != null;
			case ResourcesPackage.PLAN_DEFINITION__USAGE:
				return usage != null;
			case ResourcesPackage.PLAN_DEFINITION__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.PLAN_DEFINITION__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__EDITOR:
				return editors != null && !editors.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__REVIEWER:
				return reviewers != null && !reviewers.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__ENDORSER:
				return endorsers != null && !endorsers.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__LIBRARY:
				return libraries != null && !libraries.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__GOAL:
				return goals != null && !goals.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionImpl