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

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TerminologyCapabilities;
import fhiRCore.resources.TerminologyCapabilitiesClosure;
import fhiRCore.resources.TerminologyCapabilitiesCodeSystem;
import fhiRCore.resources.TerminologyCapabilitiesExpansion;
import fhiRCore.resources.TerminologyCapabilitiesImplementation;
import fhiRCore.resources.TerminologyCapabilitiesSoftware;
import fhiRCore.resources.TerminologyCapabilitiesTranslation;
import fhiRCore.resources.TerminologyCapabilitiesValidateCode;

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
 * An implementation of the model object '<em><b>Terminology Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getCodeSystems <em>Code System</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getExpansion <em>Expansion</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getCodeSearch <em>Code Search</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getValidateCode <em>Validate Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesImpl#getClosure <em>Closure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesImpl extends DomainResourceImpl implements TerminologyCapabilities {
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
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesSoftware software;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesImplementation implementation;

	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean lockedDate;

	/**
	 * The cached value of the '{@link #getCodeSystems() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesCodeSystem> codeSystems;

	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesExpansion expansion;

	/**
	 * The cached value of the '{@link #getCodeSearch() <em>Code Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSearch()
	 * @generated
	 * @ordered
	 */
	protected Code codeSearch;

	/**
	 * The cached value of the '{@link #getValidateCode() <em>Validate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateCode()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesValidateCode validateCode;

	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesTranslation translation;

	/**
	 * The cached value of the '{@link #getClosure() <em>Closure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure()
	 * @generated
	 * @ordered
	 */
	protected TerminologyCapabilitiesClosure closure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTerminologyCapabilities();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT, newCopyright, newCopyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND, oldKind, newKind);
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
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesSoftware getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(TerminologyCapabilitiesSoftware newSoftware, NotificationChain msgs) {
		TerminologyCapabilitiesSoftware oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(TerminologyCapabilitiesSoftware newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(TerminologyCapabilitiesImplementation newImplementation, NotificationChain msgs) {
		TerminologyCapabilitiesImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(TerminologyCapabilitiesImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedDate(fhiRCore.dataTypes.Boolean newLockedDate, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, oldLockedDate, newLockedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedDate(fhiRCore.dataTypes.Boolean newLockedDate) {
		if (newLockedDate != lockedDate) {
			NotificationChain msgs = null;
			if (lockedDate != null)
				msgs = ((InternalEObject)lockedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, null, msgs);
			if (newLockedDate != null)
				msgs = ((InternalEObject)newLockedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, null, msgs);
			msgs = basicSetLockedDate(newLockedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE, newLockedDate, newLockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyCapabilitiesCodeSystem> getCodeSystems() {
		if (codeSystems == null) {
			codeSystems = new EObjectContainmentEList<TerminologyCapabilitiesCodeSystem>(TerminologyCapabilitiesCodeSystem.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM);
		}
		return codeSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesExpansion getExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansion(TerminologyCapabilitiesExpansion newExpansion, NotificationChain msgs) {
		TerminologyCapabilitiesExpansion oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, oldExpansion, newExpansion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansion(TerminologyCapabilitiesExpansion newExpansion) {
		if (newExpansion != expansion) {
			NotificationChain msgs = null;
			if (expansion != null)
				msgs = ((InternalEObject)expansion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, null, msgs);
			if (newExpansion != null)
				msgs = ((InternalEObject)newExpansion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, null, msgs);
			msgs = basicSetExpansion(newExpansion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION, newExpansion, newExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCodeSearch() {
		return codeSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSearch(Code newCodeSearch, NotificationChain msgs) {
		Code oldCodeSearch = codeSearch;
		codeSearch = newCodeSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, oldCodeSearch, newCodeSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSearch(Code newCodeSearch) {
		if (newCodeSearch != codeSearch) {
			NotificationChain msgs = null;
			if (codeSearch != null)
				msgs = ((InternalEObject)codeSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, null, msgs);
			if (newCodeSearch != null)
				msgs = ((InternalEObject)newCodeSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, null, msgs);
			msgs = basicSetCodeSearch(newCodeSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH, newCodeSearch, newCodeSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesValidateCode getValidateCode() {
		return validateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateCode(TerminologyCapabilitiesValidateCode newValidateCode, NotificationChain msgs) {
		TerminologyCapabilitiesValidateCode oldValidateCode = validateCode;
		validateCode = newValidateCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, oldValidateCode, newValidateCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateCode(TerminologyCapabilitiesValidateCode newValidateCode) {
		if (newValidateCode != validateCode) {
			NotificationChain msgs = null;
			if (validateCode != null)
				msgs = ((InternalEObject)validateCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, null, msgs);
			if (newValidateCode != null)
				msgs = ((InternalEObject)newValidateCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, null, msgs);
			msgs = basicSetValidateCode(newValidateCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE, newValidateCode, newValidateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesTranslation getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(TerminologyCapabilitiesTranslation newTranslation, NotificationChain msgs) {
		TerminologyCapabilitiesTranslation oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(TerminologyCapabilitiesTranslation newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyCapabilitiesClosure getClosure() {
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosure(TerminologyCapabilitiesClosure newClosure, NotificationChain msgs) {
		TerminologyCapabilitiesClosure oldClosure = closure;
		closure = newClosure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, oldClosure, newClosure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosure(TerminologyCapabilitiesClosure newClosure) {
		if (newClosure != closure) {
			NotificationChain msgs = null;
			if (closure != null)
				msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, null, msgs);
			if (newClosure != null)
				msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, null, msgs);
			msgs = basicSetClosure(newClosure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE, newClosure, newClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return basicSetKind(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return basicSetLockedDate(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return basicSetExpansion(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return basicSetCodeSearch(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return basicSetValidateCode(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return basicSetClosure(null, msgs);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL:
				return getUrl();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return getVersion();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return getName();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return getTitle();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return getStatus();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return getDate();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return getContacts();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return getPurpose();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return getKind();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return getSoftware();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return getImplementation();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return getLockedDate();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return getCodeSystems();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return getExpansion();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return getCodeSearch();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return getValidateCode();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return getTranslation();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return getClosure();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				setSoftware((TerminologyCapabilitiesSoftware)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				setImplementation((TerminologyCapabilitiesImplementation)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				setLockedDate((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				getCodeSystems().clear();
				getCodeSystems().addAll((Collection<? extends TerminologyCapabilitiesCodeSystem>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				setExpansion((TerminologyCapabilitiesExpansion)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				setCodeSearch((Code)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				setValidateCode((TerminologyCapabilitiesValidateCode)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				setTranslation((TerminologyCapabilitiesTranslation)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				setClosure((TerminologyCapabilitiesClosure)newValue);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				setSoftware((TerminologyCapabilitiesSoftware)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				setImplementation((TerminologyCapabilitiesImplementation)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				setLockedDate((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				getCodeSystems().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				setExpansion((TerminologyCapabilitiesExpansion)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				setCodeSearch((Code)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				setValidateCode((TerminologyCapabilitiesValidateCode)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				setTranslation((TerminologyCapabilitiesTranslation)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				setClosure((TerminologyCapabilitiesClosure)null);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__URL:
				return url != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VERSION:
				return version != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__NAME:
				return name != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TITLE:
				return title != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__STATUS:
				return status != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DATE:
				return date != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__PURPOSE:
				return purpose != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__KIND:
				return kind != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__SOFTWARE:
				return software != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__IMPLEMENTATION:
				return implementation != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__LOCKED_DATE:
				return lockedDate != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SYSTEM:
				return codeSystems != null && !codeSystems.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__EXPANSION:
				return expansion != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CODE_SEARCH:
				return codeSearch != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__VALIDATE_CODE:
				return validateCode != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__TRANSLATION:
				return translation != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES__CLOSURE:
				return closure != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesImpl
