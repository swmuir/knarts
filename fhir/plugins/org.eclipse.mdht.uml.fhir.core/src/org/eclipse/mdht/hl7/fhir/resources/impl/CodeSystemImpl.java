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
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;

import org.eclipse.mdht.hl7.fhir.resources.CodeSystem;
import org.eclipse.mdht.hl7.fhir.resources.CodeSystemConceptDefinition;
import org.eclipse.mdht.hl7.fhir.resources.CodeSystemFilter;
import org.eclipse.mdht.hl7.fhir.resources.CodeSystemProperty;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getSupplements <em>Supplements</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getFilters <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CodeSystemImpl#getConcepts <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSystemImpl extends DomainResourceImpl implements CodeSystem {
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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean caseSensitive;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet valueSet;

	/**
	 * The cached value of the '{@link #getHierarchyMeaning() <em>Hierarchy Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyMeaning()
	 * @generated
	 * @ordered
	 */
	protected Code hierarchyMeaning;

	/**
	 * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositional()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean compositional;

	/**
	 * The cached value of the '{@link #getVersionNeeded() <em>Version Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean versionNeeded;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Code content;

	/**
	 * The cached value of the '{@link #getSupplements() <em>Supplements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplements()
	 * @generated
	 * @ordered
	 */
	protected CodeSystem supplements;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt count;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemFilter> filters;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemProperty> properties;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinition> concepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCodeSystem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CODE_SYSTEM__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.CODE_SYSTEM__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.CODE_SYSTEM__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CODE_SYSTEM__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseSensitive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newCaseSensitive, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, newCaseSensitive);
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
	public void setCaseSensitive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newCaseSensitive) {
		if (newCaseSensitive != caseSensitive) {
			NotificationChain msgs = null;
			if (caseSensitive != null)
				msgs = ((InternalEObject)caseSensitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			if (newCaseSensitive != null)
				msgs = ((InternalEObject)newCaseSensitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			msgs = basicSetCaseSensitive(newCaseSensitive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, newCaseSensitive, newCaseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		ValueSet oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(ValueSet newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getHierarchyMeaning() {
		return hierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchyMeaning(Code newHierarchyMeaning, NotificationChain msgs) {
		Code oldHierarchyMeaning = hierarchyMeaning;
		hierarchyMeaning = newHierarchyMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, oldHierarchyMeaning, newHierarchyMeaning);
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
	public void setHierarchyMeaning(Code newHierarchyMeaning) {
		if (newHierarchyMeaning != hierarchyMeaning) {
			NotificationChain msgs = null;
			if (hierarchyMeaning != null)
				msgs = ((InternalEObject)hierarchyMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, null, msgs);
			if (newHierarchyMeaning != null)
				msgs = ((InternalEObject)newHierarchyMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, null, msgs);
			msgs = basicSetHierarchyMeaning(newHierarchyMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, newHierarchyMeaning, newHierarchyMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getCompositional() {
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositional(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newCompositional, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldCompositional = compositional;
		compositional = newCompositional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, oldCompositional, newCompositional);
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
	public void setCompositional(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newCompositional) {
		if (newCompositional != compositional) {
			NotificationChain msgs = null;
			if (compositional != null)
				msgs = ((InternalEObject)compositional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, null, msgs);
			if (newCompositional != null)
				msgs = ((InternalEObject)newCompositional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, null, msgs);
			msgs = basicSetCompositional(newCompositional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, newCompositional, newCompositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getVersionNeeded() {
		return versionNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionNeeded(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newVersionNeeded, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldVersionNeeded = versionNeeded;
		versionNeeded = newVersionNeeded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, oldVersionNeeded, newVersionNeeded);
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
	public void setVersionNeeded(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newVersionNeeded) {
		if (newVersionNeeded != versionNeeded) {
			NotificationChain msgs = null;
			if (versionNeeded != null)
				msgs = ((InternalEObject)versionNeeded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, null, msgs);
			if (newVersionNeeded != null)
				msgs = ((InternalEObject)newVersionNeeded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, null, msgs);
			msgs = basicSetVersionNeeded(newVersionNeeded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, newVersionNeeded, newVersionNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Code newContent, NotificationChain msgs) {
		Code oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CONTENT, oldContent, newContent);
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
	public void setContent(Code newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystem getSupplements() {
		return supplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplements(CodeSystem newSupplements, NotificationChain msgs) {
		CodeSystem oldSupplements = supplements;
		supplements = newSupplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS, oldSupplements, newSupplements);
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
	public void setSupplements(CodeSystem newSupplements) {
		if (newSupplements != supplements) {
			NotificationChain msgs = null;
			if (supplements != null)
				msgs = ((InternalEObject)supplements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS, null, msgs);
			if (newSupplements != null)
				msgs = ((InternalEObject)newSupplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS, null, msgs);
			msgs = basicSetSupplements(newSupplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS, newSupplements, newSupplements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(UnsignedInt newCount, NotificationChain msgs) {
		UnsignedInt oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COUNT, oldCount, newCount);
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
	public void setCount(UnsignedInt newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeSystemFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<CodeSystemFilter>(CodeSystemFilter.class, this, ResourcesPackage.CODE_SYSTEM__FILTER);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeSystemProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CodeSystemProperty>(CodeSystemProperty.class, this, ResourcesPackage.CODE_SYSTEM__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeSystemConceptDefinition> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<CodeSystemConceptDefinition>(CodeSystemConceptDefinition.class, this, ResourcesPackage.CODE_SYSTEM__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CODE_SYSTEM__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return basicSetCaseSensitive(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return basicSetHierarchyMeaning(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				return basicSetCompositional(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				return basicSetVersionNeeded(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				return basicSetContent(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS:
				return basicSetSupplements(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				return basicSetCount(null, msgs);
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				return getUrl();
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				return getVersion();
			case ResourcesPackage.CODE_SYSTEM__NAME:
				return getName();
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				return getTitle();
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				return getStatus();
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.CODE_SYSTEM__DATE:
				return getDate();
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				return getContacts();
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				return getPurpose();
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return getCaseSensitive();
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				return getValueSet();
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return getHierarchyMeaning();
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				return getCompositional();
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				return getVersionNeeded();
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				return getContent();
			case ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS:
				return getSupplements();
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				return getCount();
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return getFilters();
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return getProperties();
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				return getConcepts();
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				setContent((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS:
				setSupplements((CodeSystem)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				getFilters().clear();
				getFilters().addAll((Collection<? extends CodeSystemFilter>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CodeSystemProperty>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends CodeSystemConceptDefinition>)newValue);
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				setContent((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS:
				setSupplements((CodeSystem)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				getFilters().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				getConcepts().clear();
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				return url != null;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				return version != null;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				return name != null;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				return title != null;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				return status != null;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.CODE_SYSTEM__DATE:
				return date != null;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				return purpose != null;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return caseSensitive != null;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				return valueSet != null;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return hierarchyMeaning != null;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				return compositional != null;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				return versionNeeded != null;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				return content != null;
			case ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS:
				return supplements != null;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				return count != null;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return filters != null && !filters.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemImpl
