/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.Questionnaire;
import fhiRCore.resources.QuestionnaireItem;
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
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getSubjectTypes <em>Subject Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends DomainResourceImpl implements Questionnaire {
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
	 * The cached value of the '{@link #getDerivedFroms() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<Questionnaire> derivedFroms;

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
	 * The cached value of the '{@link #getSubjectTypes() <em>Subject Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> subjectTypes;

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
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaire();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.QUESTIONNAIRE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getDerivedFroms() {
		if (derivedFroms == null) {
			derivedFroms = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM);
		}
		return derivedFroms;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getSubjectTypes() {
		if (subjectTypes == null) {
			subjectTypes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE);
		}
		return subjectTypes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.QUESTIONNAIRE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.QUESTIONNAIRE__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE, oldApprovalDate, newApprovalDate);
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
				msgs = ((InternalEObject)approvalDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE, null, msgs);
			if (newApprovalDate != null)
				msgs = ((InternalEObject)newApprovalDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE, null, msgs);
			msgs = basicSetApprovalDate(newApprovalDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE, newApprovalDate, newApprovalDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.QUESTIONNAIRE__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, ResourcesPackage.QUESTIONNAIRE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFroms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return ((InternalEList<?>)getSubjectTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE:
				return basicSetApprovalDate(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.QUESTIONNAIRE__URL:
				return getUrl();
			case ResourcesPackage.QUESTIONNAIRE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.QUESTIONNAIRE__VERSION:
				return getVersion();
			case ResourcesPackage.QUESTIONNAIRE__NAME:
				return getName();
			case ResourcesPackage.QUESTIONNAIRE__TITLE:
				return getTitle();
			case ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM:
				return getDerivedFroms();
			case ResourcesPackage.QUESTIONNAIRE__STATUS:
				return getStatus();
			case ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return getSubjectTypes();
			case ResourcesPackage.QUESTIONNAIRE__DATE:
				return getDate();
			case ResourcesPackage.QUESTIONNAIRE__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.QUESTIONNAIRE__CONTACT:
				return getContacts();
			case ResourcesPackage.QUESTIONNAIRE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.QUESTIONNAIRE__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.QUESTIONNAIRE__PURPOSE:
				return getPurpose();
			case ResourcesPackage.QUESTIONNAIRE__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE:
				return getApprovalDate();
			case ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case ResourcesPackage.QUESTIONNAIRE__CODE:
				return getCodes();
			case ResourcesPackage.QUESTIONNAIRE__ITEM:
				return getItems();
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
			case ResourcesPackage.QUESTIONNAIRE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM:
				getDerivedFroms().clear();
				getDerivedFroms().addAll((Collection<? extends Questionnaire>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectTypes().clear();
				getSubjectTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireItem>)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM:
				getDerivedFroms().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectTypes().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE__ITEM:
				getItems().clear();
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
			case ResourcesPackage.QUESTIONNAIRE__URL:
				return url != null;
			case ResourcesPackage.QUESTIONNAIRE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__VERSION:
				return version != null;
			case ResourcesPackage.QUESTIONNAIRE__NAME:
				return name != null;
			case ResourcesPackage.QUESTIONNAIRE__TITLE:
				return title != null;
			case ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM:
				return derivedFroms != null && !derivedFroms.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__STATUS:
				return status != null;
			case ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return subjectTypes != null && !subjectTypes.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__DATE:
				return date != null;
			case ResourcesPackage.QUESTIONNAIRE__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.QUESTIONNAIRE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__PURPOSE:
				return purpose != null;
			case ResourcesPackage.QUESTIONNAIRE__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.QUESTIONNAIRE__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl
