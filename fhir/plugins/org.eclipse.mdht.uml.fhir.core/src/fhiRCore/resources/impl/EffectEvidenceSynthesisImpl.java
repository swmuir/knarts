/**
 */
package fhiRCore.resources.impl;

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

import fhiRCore.resources.EffectEvidenceSynthesis;
import fhiRCore.resources.EffectEvidenceSynthesisCertainty;
import fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate;
import fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure;
import fhiRCore.resources.EffectEvidenceSynthesisSampleSize;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Effect Evidence Synthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getEditors <em>Editor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getSynthesisType <em>Synthesis Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getExposureAlternative <em>Exposure Alternative</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getSampleSize <em>Sample Size</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getResultsByExposures <em>Results By Exposure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getEffectEstimates <em>Effect Estimate</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisImpl#getCertainties <em>Certainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisImpl extends DomainResourceImpl implements EffectEvidenceSynthesis {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

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
	 * The cached value of the '{@link #getSynthesisType() <em>Synthesis Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthesisType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept synthesisType;

	/**
	 * The cached value of the '{@link #getStudyType() <em>Study Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept studyType;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Reference population;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected Reference exposure;

	/**
	 * The cached value of the '{@link #getExposureAlternative() <em>Exposure Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureAlternative()
	 * @generated
	 * @ordered
	 */
	protected Reference exposureAlternative;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Reference outcome;

	/**
	 * The cached value of the '{@link #getSampleSize() <em>Sample Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleSize()
	 * @generated
	 * @ordered
	 */
	protected EffectEvidenceSynthesisSampleSize sampleSize;

	/**
	 * The cached value of the '{@link #getResultsByExposures() <em>Results By Exposure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsByExposures()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisResultsByExposure> resultsByExposures;

	/**
	 * The cached value of the '{@link #getEffectEstimates() <em>Effect Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectEstimates()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisEffectEstimate> effectEstimates;

	/**
	 * The cached value of the '{@link #getCertainties() <em>Certainty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainties()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisCertainty> certainties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEffectEvidenceSynthesis();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION);
		}
		return jurisdictions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC);
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
			authors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR);
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
			editors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR);
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
			reviewers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER);
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
			endorsers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER);
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
			relatedArtifacts = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSynthesisType() {
		return synthesisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynthesisType(CodeableConcept newSynthesisType, NotificationChain msgs) {
		CodeableConcept oldSynthesisType = synthesisType;
		synthesisType = newSynthesisType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, oldSynthesisType, newSynthesisType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynthesisType(CodeableConcept newSynthesisType) {
		if (newSynthesisType != synthesisType) {
			NotificationChain msgs = null;
			if (synthesisType != null)
				msgs = ((InternalEObject)synthesisType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, null, msgs);
			if (newSynthesisType != null)
				msgs = ((InternalEObject)newSynthesisType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, null, msgs);
			msgs = basicSetSynthesisType(newSynthesisType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE, newSynthesisType, newSynthesisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStudyType() {
		return studyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyType(CodeableConcept newStudyType, NotificationChain msgs) {
		CodeableConcept oldStudyType = studyType;
		studyType = newStudyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, oldStudyType, newStudyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyType(CodeableConcept newStudyType) {
		if (newStudyType != studyType) {
			NotificationChain msgs = null;
			if (studyType != null)
				msgs = ((InternalEObject)studyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, null, msgs);
			if (newStudyType != null)
				msgs = ((InternalEObject)newStudyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, null, msgs);
			msgs = basicSetStudyType(newStudyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE, newStudyType, newStudyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(Reference newPopulation, NotificationChain msgs) {
		Reference oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, oldPopulation, newPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(Reference newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposure(Reference newExposure, NotificationChain msgs) {
		Reference oldExposure = exposure;
		exposure = newExposure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, oldExposure, newExposure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposure(Reference newExposure) {
		if (newExposure != exposure) {
			NotificationChain msgs = null;
			if (exposure != null)
				msgs = ((InternalEObject)exposure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, null, msgs);
			if (newExposure != null)
				msgs = ((InternalEObject)newExposure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, null, msgs);
			msgs = basicSetExposure(newExposure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE, newExposure, newExposure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getExposureAlternative() {
		return exposureAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureAlternative(Reference newExposureAlternative, NotificationChain msgs) {
		Reference oldExposureAlternative = exposureAlternative;
		exposureAlternative = newExposureAlternative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, oldExposureAlternative, newExposureAlternative);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureAlternative(Reference newExposureAlternative) {
		if (newExposureAlternative != exposureAlternative) {
			NotificationChain msgs = null;
			if (exposureAlternative != null)
				msgs = ((InternalEObject)exposureAlternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, null, msgs);
			if (newExposureAlternative != null)
				msgs = ((InternalEObject)newExposureAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, null, msgs);
			msgs = basicSetExposureAlternative(newExposureAlternative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE, newExposureAlternative, newExposureAlternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Reference newOutcome, NotificationChain msgs) {
		Reference oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Reference newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectEvidenceSynthesisSampleSize getSampleSize() {
		return sampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSampleSize(EffectEvidenceSynthesisSampleSize newSampleSize, NotificationChain msgs) {
		EffectEvidenceSynthesisSampleSize oldSampleSize = sampleSize;
		sampleSize = newSampleSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, oldSampleSize, newSampleSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleSize(EffectEvidenceSynthesisSampleSize newSampleSize) {
		if (newSampleSize != sampleSize) {
			NotificationChain msgs = null;
			if (sampleSize != null)
				msgs = ((InternalEObject)sampleSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, null, msgs);
			if (newSampleSize != null)
				msgs = ((InternalEObject)newSampleSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, null, msgs);
			msgs = basicSetSampleSize(newSampleSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE, newSampleSize, newSampleSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EffectEvidenceSynthesisResultsByExposure> getResultsByExposures() {
		if (resultsByExposures == null) {
			resultsByExposures = new EObjectContainmentEList<EffectEvidenceSynthesisResultsByExposure>(EffectEvidenceSynthesisResultsByExposure.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE);
		}
		return resultsByExposures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EffectEvidenceSynthesisEffectEstimate> getEffectEstimates() {
		if (effectEstimates == null) {
			effectEstimates = new EObjectContainmentEList<EffectEvidenceSynthesisEffectEstimate>(EffectEvidenceSynthesisEffectEstimate.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE);
		}
		return effectEstimates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EffectEvidenceSynthesisCertainty> getCertainties() {
		if (certainties == null) {
			certainties = new EObjectContainmentEList<EffectEvidenceSynthesisCertainty>(EffectEvidenceSynthesisCertainty.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY);
		}
		return certainties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return ((InternalEList<?>)getEndorsers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return basicSetSynthesisType(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return basicSetStudyType(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return basicSetPopulation(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return basicSetExposure(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return basicSetExposureAlternative(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return basicSetSampleSize(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return ((InternalEList<?>)getResultsByExposures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return ((InternalEList<?>)getEffectEstimates()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return ((InternalEList<?>)getCertainties()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return getUrl();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return getVersion();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return getName();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return getTitle();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return getStatus();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return getDate();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return getContacts();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return getNotes();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return getApprovalDate();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return getTopics();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return getAuthors();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return getEditors();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return getReviewers();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return getEndorsers();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return getSynthesisType();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return getStudyType();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return getPopulation();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return getExposure();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return getExposureAlternative();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return getOutcome();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return getSampleSize();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return getResultsByExposures();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return getEffectEstimates();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return getCertainties();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				getEditors().clear();
				getEditors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				getEndorsers().clear();
				getEndorsers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				setStudyType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				setPopulation((Reference)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				setExposure((Reference)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				setExposureAlternative((Reference)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				setOutcome((Reference)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				setSampleSize((EffectEvidenceSynthesisSampleSize)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				getResultsByExposures().clear();
				getResultsByExposures().addAll((Collection<? extends EffectEvidenceSynthesisResultsByExposure>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				getEffectEstimates().clear();
				getEffectEstimates().addAll((Collection<? extends EffectEvidenceSynthesisEffectEstimate>)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				getCertainties().clear();
				getCertainties().addAll((Collection<? extends EffectEvidenceSynthesisCertainty>)newValue);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				getEditors().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				getReviewers().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				getEndorsers().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				setSynthesisType((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				setStudyType((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				setPopulation((Reference)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				setExposure((Reference)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				setExposureAlternative((Reference)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				setOutcome((Reference)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				setSampleSize((EffectEvidenceSynthesisSampleSize)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				getResultsByExposures().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				getEffectEstimates().clear();
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				getCertainties().clear();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__URL:
				return url != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__VERSION:
				return version != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NAME:
				return name != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TITLE:
				return title != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STATUS:
				return status != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DATE:
				return date != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EDITOR:
				return editors != null && !editors.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__REVIEWER:
				return reviewers != null && !reviewers.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__ENDORSER:
				return endorsers != null && !endorsers.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SYNTHESIS_TYPE:
				return synthesisType != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__STUDY_TYPE:
				return studyType != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__POPULATION:
				return population != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE:
				return exposure != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EXPOSURE_ALTERNATIVE:
				return exposureAlternative != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__OUTCOME:
				return outcome != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__SAMPLE_SIZE:
				return sampleSize != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__RESULTS_BY_EXPOSURE:
				return resultsByExposures != null && !resultsByExposures.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__EFFECT_ESTIMATE:
				return effectEstimates != null && !effectEstimates.isEmpty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS__CERTAINTY:
				return certainties != null && !certainties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisImpl
