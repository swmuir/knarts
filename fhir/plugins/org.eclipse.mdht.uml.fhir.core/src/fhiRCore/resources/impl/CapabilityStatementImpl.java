/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.CapabilityStatement;
import fhiRCore.resources.CapabilityStatementDocument;
import fhiRCore.resources.CapabilityStatementImplementation;
import fhiRCore.resources.CapabilityStatementMessaging;
import fhiRCore.resources.CapabilityStatementRest;
import fhiRCore.resources.CapabilityStatementSoftware;
import fhiRCore.resources.ImplementationGuide;
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
 * An implementation of the model object '<em><b>Capability Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getFormats <em>Format</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getPatchFormats <em>Patch Format</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getImplementationGuides <em>Implementation Guide</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getRests <em>Rest</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getMessagings <em>Messaging</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementImpl#getDocuments <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementImpl extends DomainResourceImpl implements CapabilityStatement {
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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean experimental;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Code kind;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatement> instantiates;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatement> imports;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementSoftware software;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementImplementation implementation;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Code fhirVersion;

	/**
	 * The cached value of the '{@link #getFormats() <em>Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> formats;

	/**
	 * The cached value of the '{@link #getPatchFormats() <em>Patch Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatchFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> patchFormats;

	/**
	 * The cached value of the '{@link #getImplementationGuides() <em>Implementation Guide</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGuides()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuide> implementationGuides;

	/**
	 * The cached value of the '{@link #getRests() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRests()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRest> rests;

	/**
	 * The cached value of the '{@link #getMessagings() <em>Messaging</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagings()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessaging> messagings;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementDocument> documents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatement();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.CAPABILITY_STATEMENT__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__KIND, oldKind, newKind);
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
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatement> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectContainmentEList<CapabilityStatement>(CapabilityStatement.class, this, ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatement> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<CapabilityStatement>(CapabilityStatement.class, this, ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(CapabilityStatementSoftware newSoftware, NotificationChain msgs) {
		CapabilityStatementSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(CapabilityStatementSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(CapabilityStatementImplementation newImplementation, NotificationChain msgs) {
		CapabilityStatementImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(CapabilityStatementImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirVersion(Code newFhirVersion, NotificationChain msgs) {
		Code oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION, oldFhirVersion, newFhirVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Code newFhirVersion) {
		if (newFhirVersion != fhirVersion) {
			NotificationChain msgs = null;
			if (fhirVersion != null)
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getFormats() {
		if (formats == null) {
			formats = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.CAPABILITY_STATEMENT__FORMAT);
		}
		return formats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getPatchFormats() {
		if (patchFormats == null) {
			patchFormats = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT);
		}
		return patchFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuide> getImplementationGuides() {
		if (implementationGuides == null) {
			implementationGuides = new EObjectContainmentEList<ImplementationGuide>(ImplementationGuide.class, this, ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE);
		}
		return implementationGuides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRest> getRests() {
		if (rests == null) {
			rests = new EObjectContainmentEList<CapabilityStatementRest>(CapabilityStatementRest.class, this, ResourcesPackage.CAPABILITY_STATEMENT__REST);
		}
		return rests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementMessaging> getMessagings() {
		if (messagings == null) {
			messagings = new EObjectContainmentEList<CapabilityStatementMessaging>(CapabilityStatementMessaging.class, this, ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING);
		}
		return messagings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementDocument> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentEList<CapabilityStatementDocument>(CapabilityStatementDocument.class, this, ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__KIND:
				return basicSetKind(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__FORMAT:
				return ((InternalEList<?>)getFormats()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return ((InternalEList<?>)getPatchFormats()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return ((InternalEList<?>)getImplementationGuides()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__REST:
				return ((InternalEList<?>)getRests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING:
				return ((InternalEList<?>)getMessagings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT__URL:
				return getUrl();
			case ResourcesPackage.CAPABILITY_STATEMENT__VERSION:
				return getVersion();
			case ResourcesPackage.CAPABILITY_STATEMENT__NAME:
				return getName();
			case ResourcesPackage.CAPABILITY_STATEMENT__TITLE:
				return getTitle();
			case ResourcesPackage.CAPABILITY_STATEMENT__STATUS:
				return getStatus();
			case ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.CAPABILITY_STATEMENT__DATE:
				return getDate();
			case ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.CAPABILITY_STATEMENT__CONTACT:
				return getContacts();
			case ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE:
				return getPurpose();
			case ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.CAPABILITY_STATEMENT__KIND:
				return getKind();
			case ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return getInstantiates();
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS:
				return getImports();
			case ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return getSoftware();
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return getImplementation();
			case ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return getFhirVersion();
			case ResourcesPackage.CAPABILITY_STATEMENT__FORMAT:
				return getFormats();
			case ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return getPatchFormats();
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return getImplementationGuides();
			case ResourcesPackage.CAPABILITY_STATEMENT__REST:
				return getRests();
			case ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING:
				return getMessagings();
			case ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return getDocuments();
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
			case ResourcesPackage.CAPABILITY_STATEMENT__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends CapabilityStatement>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends CapabilityStatement>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE:
				setSoftware((CapabilityStatementSoftware)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				setImplementation((CapabilityStatementImplementation)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				setFhirVersion((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__FORMAT:
				getFormats().clear();
				getFormats().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				getPatchFormats().clear();
				getPatchFormats().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				getImplementationGuides().clear();
				getImplementationGuides().addAll((Collection<? extends ImplementationGuide>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__REST:
				getRests().clear();
				getRests().addAll((Collection<? extends CapabilityStatementRest>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING:
				getMessagings().clear();
				getMessagings().addAll((Collection<? extends CapabilityStatementMessaging>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends CapabilityStatementDocument>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				getInstantiates().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS:
				getImports().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE:
				setSoftware((CapabilityStatementSoftware)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				setImplementation((CapabilityStatementImplementation)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				setFhirVersion((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__FORMAT:
				getFormats().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				getPatchFormats().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				getImplementationGuides().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__REST:
				getRests().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING:
				getMessagings().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT:
				getDocuments().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT__URL:
				return url != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__VERSION:
				return version != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__NAME:
				return name != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__TITLE:
				return title != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__STATUS:
				return status != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__DATE:
				return date != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__PURPOSE:
				return purpose != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__KIND:
				return kind != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__SOFTWARE:
				return software != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION:
				return implementation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__FHIR_VERSION:
				return fhirVersion != null;
			case ResourcesPackage.CAPABILITY_STATEMENT__FORMAT:
				return formats != null && !formats.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__PATCH_FORMAT:
				return patchFormats != null && !patchFormats.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__IMPLEMENTATION_GUIDE:
				return implementationGuides != null && !implementationGuides.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__REST:
				return rests != null && !rests.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__MESSAGING:
				return messagings != null && !messagings.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT__DOCUMENT:
				return documents != null && !documents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementImpl
