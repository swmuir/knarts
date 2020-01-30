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
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.EvidenceVariable;
import fhiRCore.resources.EvidenceVariableCharacteristic;
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
 * An implementation of the model object '<em><b>Evidence Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getShortTitle <em>Short Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getEditors <em>Editor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getReviewers <em>Reviewer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getEndorsers <em>Endorser</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EvidenceVariableImpl#getCharacteristics <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceVariableImpl extends DomainResourceImpl implements EvidenceVariable {
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
	 * The cached value of the '{@link #getShortTitle() <em>Short Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String shortTitle;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceVariableCharacteristic> characteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEvidenceVariable();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getShortTitle() {
		return shortTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortTitle(fhiRCore.dataTypes.String newShortTitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldShortTitle = shortTitle;
		shortTitle = newShortTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE, oldShortTitle, newShortTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortTitle(fhiRCore.dataTypes.String newShortTitle) {
		if (newShortTitle != shortTitle) {
			NotificationChain msgs = null;
			if (shortTitle != null)
				msgs = ((InternalEObject)shortTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE, null, msgs);
			if (newShortTitle != null)
				msgs = ((InternalEObject)newShortTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE, null, msgs);
			msgs = basicSetShortTitle(newShortTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE, newShortTitle, newShortTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE, oldSubtitle, newSubtitle);
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
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE, newSubtitle, newSubtitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EVIDENCE_VARIABLE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.EVIDENCE_VARIABLE__NOTE);
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
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EVIDENCE_VARIABLE__TOPIC);
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
			authors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR);
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
			editors = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EVIDENCE_VARIABLE__EDITOR);
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
			reviewers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER);
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
			endorsers = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER);
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
			relatedArtifacts = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EVIDENCE_VARIABLE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EVIDENCE_VARIABLE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceVariableCharacteristic> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<EvidenceVariableCharacteristic>(EvidenceVariableCharacteristic.class, this, ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EVIDENCE_VARIABLE__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return basicSetShortTitle(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__TOPIC:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__EDITOR:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER:
				return ((InternalEList<?>)getEndorsers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EVIDENCE_VARIABLE__URL:
				return getUrl();
			case ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.EVIDENCE_VARIABLE__VERSION:
				return getVersion();
			case ResourcesPackage.EVIDENCE_VARIABLE__NAME:
				return getName();
			case ResourcesPackage.EVIDENCE_VARIABLE__TITLE:
				return getTitle();
			case ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return getShortTitle();
			case ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE:
				return getSubtitle();
			case ResourcesPackage.EVIDENCE_VARIABLE__STATUS:
				return getStatus();
			case ResourcesPackage.EVIDENCE_VARIABLE__DATE:
				return getDate();
			case ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.EVIDENCE_VARIABLE__CONTACT:
				return getContacts();
			case ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.EVIDENCE_VARIABLE__NOTE:
				return getNotes();
			case ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return getApprovalDate();
			case ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case ResourcesPackage.EVIDENCE_VARIABLE__TOPIC:
				return getTopics();
			case ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR:
				return getAuthors();
			case ResourcesPackage.EVIDENCE_VARIABLE__EDITOR:
				return getEditors();
			case ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER:
				return getReviewers();
			case ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER:
				return getEndorsers();
			case ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.EVIDENCE_VARIABLE__TYPE:
				return getType();
			case ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return getCharacteristics();
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
			case ResourcesPackage.EVIDENCE_VARIABLE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				setShortTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE:
				setSubtitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__EDITOR:
				getEditors().clear();
				getEditors().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER:
				getEndorsers().clear();
				getEndorsers().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends EvidenceVariableCharacteristic>)newValue);
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
			case ResourcesPackage.EVIDENCE_VARIABLE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				setShortTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE:
				setSubtitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__EDITOR:
				getEditors().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER:
				getReviewers().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER:
				getEndorsers().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				getCharacteristics().clear();
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
			case ResourcesPackage.EVIDENCE_VARIABLE__URL:
				return url != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__VERSION:
				return version != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__NAME:
				return name != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__TITLE:
				return title != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE:
				return shortTitle != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE:
				return subtitle != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__STATUS:
				return status != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__DATE:
				return date != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__EDITOR:
				return editors != null && !editors.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER:
				return reviewers != null && !reviewers.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER:
				return endorsers != null && !endorsers.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.EVIDENCE_VARIABLE__TYPE:
				return type != null;
			case ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC:
				return characteristics != null && !characteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceVariableImpl
