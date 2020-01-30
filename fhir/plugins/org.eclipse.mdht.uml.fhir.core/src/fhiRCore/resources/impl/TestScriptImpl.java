/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestScript;
import fhiRCore.resources.TestScriptDestination;
import fhiRCore.resources.TestScriptFixture;
import fhiRCore.resources.TestScriptMetadata;
import fhiRCore.resources.TestScriptOrigin;
import fhiRCore.resources.TestScriptSetup;
import fhiRCore.resources.TestScriptTeardown;
import fhiRCore.resources.TestScriptTest;
import fhiRCore.resources.TestScriptVariable;

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
 * An implementation of the model object '<em><b>Test Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getOrigins <em>Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getDestinations <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getFixtures <em>Fixture</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getTests <em>Test</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptImpl#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptImpl extends DomainResourceImpl implements TestScript {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getOrigins() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigins()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptOrigin> origins;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptDestination> destinations;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected TestScriptMetadata metadata;

	/**
	 * The cached value of the '{@link #getFixtures() <em>Fixture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtures()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptFixture> fixtures;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> profiles;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptVariable> variables;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetup setup;

	/**
	 * The cached value of the '{@link #getTests() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptTest> tests;

	/**
	 * The cached value of the '{@link #getTeardown() <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeardown()
	 * @generated
	 * @ordered
	 */
	protected TestScriptTeardown teardown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScript();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.TEST_SCRIPT__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.TEST_SCRIPT__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.TEST_SCRIPT__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptOrigin> getOrigins() {
		if (origins == null) {
			origins = new EObjectContainmentEList<TestScriptOrigin>(TestScriptOrigin.class, this, ResourcesPackage.TEST_SCRIPT__ORIGIN);
		}
		return origins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptDestination> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectContainmentEList<TestScriptDestination>(TestScriptDestination.class, this, ResourcesPackage.TEST_SCRIPT__DESTINATION);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(TestScriptMetadata newMetadata, NotificationChain msgs) {
		TestScriptMetadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(TestScriptMetadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptFixture> getFixtures() {
		if (fixtures == null) {
			fixtures = new EObjectContainmentEList<TestScriptFixture>(TestScriptFixture.class, this, ResourcesPackage.TEST_SCRIPT__FIXTURE);
		}
		return fixtures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TEST_SCRIPT__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<TestScriptVariable>(TestScriptVariable.class, this, ResourcesPackage.TEST_SCRIPT__VARIABLE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(TestScriptSetup newSetup, NotificationChain msgs) {
		TestScriptSetup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__SETUP, oldSetup, newSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetup(TestScriptSetup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptTest> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<TestScriptTest>(TestScriptTest.class, this, ResourcesPackage.TEST_SCRIPT__TEST);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown getTeardown() {
		return teardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeardown(TestScriptTeardown newTeardown, NotificationChain msgs) {
		TestScriptTeardown oldTeardown = teardown;
		teardown = newTeardown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__TEARDOWN, oldTeardown, newTeardown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeardown(TestScriptTeardown newTeardown) {
		if (newTeardown != teardown) {
			NotificationChain msgs = null;
			if (teardown != null)
				msgs = ((InternalEObject)teardown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			if (newTeardown != null)
				msgs = ((InternalEObject)newTeardown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			msgs = basicSetTeardown(newTeardown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT__TEARDOWN, newTeardown, newTeardown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__ORIGIN:
				return ((InternalEList<?>)getOrigins()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__DESTINATION:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__METADATA:
				return basicSetMetadata(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__FIXTURE:
				return ((InternalEList<?>)getFixtures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__PROFILE:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__VARIABLE:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__SETUP:
				return basicSetSetup(null, msgs);
			case ResourcesPackage.TEST_SCRIPT__TEST:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT__TEARDOWN:
				return basicSetTeardown(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT__URL:
				return getUrl();
			case ResourcesPackage.TEST_SCRIPT__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.TEST_SCRIPT__VERSION:
				return getVersion();
			case ResourcesPackage.TEST_SCRIPT__NAME:
				return getName();
			case ResourcesPackage.TEST_SCRIPT__TITLE:
				return getTitle();
			case ResourcesPackage.TEST_SCRIPT__STATUS:
				return getStatus();
			case ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.TEST_SCRIPT__DATE:
				return getDate();
			case ResourcesPackage.TEST_SCRIPT__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.TEST_SCRIPT__CONTACT:
				return getContacts();
			case ResourcesPackage.TEST_SCRIPT__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TEST_SCRIPT__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.TEST_SCRIPT__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.TEST_SCRIPT__PURPOSE:
				return getPurpose();
			case ResourcesPackage.TEST_SCRIPT__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.TEST_SCRIPT__ORIGIN:
				return getOrigins();
			case ResourcesPackage.TEST_SCRIPT__DESTINATION:
				return getDestinations();
			case ResourcesPackage.TEST_SCRIPT__METADATA:
				return getMetadata();
			case ResourcesPackage.TEST_SCRIPT__FIXTURE:
				return getFixtures();
			case ResourcesPackage.TEST_SCRIPT__PROFILE:
				return getProfiles();
			case ResourcesPackage.TEST_SCRIPT__VARIABLE:
				return getVariables();
			case ResourcesPackage.TEST_SCRIPT__SETUP:
				return getSetup();
			case ResourcesPackage.TEST_SCRIPT__TEST:
				return getTests();
			case ResourcesPackage.TEST_SCRIPT__TEARDOWN:
				return getTeardown();
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
			case ResourcesPackage.TEST_SCRIPT__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__ORIGIN:
				getOrigins().clear();
				getOrigins().addAll((Collection<? extends TestScriptOrigin>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__DESTINATION:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends TestScriptDestination>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__FIXTURE:
				getFixtures().clear();
				getFixtures().addAll((Collection<? extends TestScriptFixture>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection<? extends TestScriptVariable>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__TEST:
				getTests().clear();
				getTests().addAll((Collection<? extends TestScriptTest>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT__TEARDOWN:
				setTeardown((TestScriptTeardown)newValue);
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
			case ResourcesPackage.TEST_SCRIPT__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__ORIGIN:
				getOrigins().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__DESTINATION:
				getDestinations().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__FIXTURE:
				getFixtures().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__PROFILE:
				getProfiles().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__VARIABLE:
				getVariables().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)null);
				return;
			case ResourcesPackage.TEST_SCRIPT__TEST:
				getTests().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT__TEARDOWN:
				setTeardown((TestScriptTeardown)null);
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
			case ResourcesPackage.TEST_SCRIPT__URL:
				return url != null;
			case ResourcesPackage.TEST_SCRIPT__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.TEST_SCRIPT__VERSION:
				return version != null;
			case ResourcesPackage.TEST_SCRIPT__NAME:
				return name != null;
			case ResourcesPackage.TEST_SCRIPT__TITLE:
				return title != null;
			case ResourcesPackage.TEST_SCRIPT__STATUS:
				return status != null;
			case ResourcesPackage.TEST_SCRIPT__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.TEST_SCRIPT__DATE:
				return date != null;
			case ResourcesPackage.TEST_SCRIPT__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.TEST_SCRIPT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__PURPOSE:
				return purpose != null;
			case ResourcesPackage.TEST_SCRIPT__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.TEST_SCRIPT__ORIGIN:
				return origins != null && !origins.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__DESTINATION:
				return destinations != null && !destinations.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__METADATA:
				return metadata != null;
			case ResourcesPackage.TEST_SCRIPT__FIXTURE:
				return fixtures != null && !fixtures.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__VARIABLE:
				return variables != null && !variables.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__SETUP:
				return setup != null;
			case ResourcesPackage.TEST_SCRIPT__TEST:
				return tests != null && !tests.isEmpty();
			case ResourcesPackage.TEST_SCRIPT__TEARDOWN:
				return teardown != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptImpl
