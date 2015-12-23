/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.TestScript;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptContact;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptFixture;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadata;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetup;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptTeardown;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptTest;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getMultiserver <em>Multiserver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getFixtures <em>Fixture</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getVariables <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getTests <em>Test</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptImpl#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptImpl extends DomainResourceImpl implements TestScript {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String publisher;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptContact> contacts;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getUseContexts() <em>Use Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContexts;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String requirements;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String copyright;

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
	 * The cached value of the '{@link #getMultiserver() <em>Multiserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiserver()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean multiserver;

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
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> profiles;

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
		return FhirResourcePackage.eINSTANCE.getTestScript();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExperimental() {
		if (experimental != null && experimental.eIsProxy()) {
			InternalEObject oldExperimental = (InternalEObject)experimental;
			experimental = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExperimental);
			if (experimental != oldExperimental) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL, oldExperimental, experimental));
			}
		}
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExperimental) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL, oldExperimental, experimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.eclipse.mdht.uml.fhir.core.datatype.String newPublisher) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<TestScriptContact>(TestScriptContact.class, this, FhirResourcePackage.TEST_SCRIPT__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.TEST_SCRIPT__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getRequirements() {
		if (requirements != null && requirements.eIsProxy()) {
			InternalEObject oldRequirements = (InternalEObject)requirements;
			requirements = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldRequirements);
			if (requirements != oldRequirements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS, oldRequirements, requirements));
			}
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String newRequirements) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS, oldRequirements, requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCopyright() {
		if (copyright != null && copyright.eIsProxy()) {
			InternalEObject oldCopyright = (InternalEObject)copyright;
			copyright = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCopyright);
			if (copyright != oldCopyright) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__COPYRIGHT, oldCopyright, copyright));
			}
		}
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.eclipse.mdht.uml.fhir.core.datatype.String newCopyright) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__COPYRIGHT, oldCopyright, copyright));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__METADATA, oldMetadata, newMetadata);
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
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getMultiserver() {
		if (multiserver != null && multiserver.eIsProxy()) {
			InternalEObject oldMultiserver = (InternalEObject)multiserver;
			multiserver = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldMultiserver);
			if (multiserver != oldMultiserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT__MULTISERVER, oldMultiserver, multiserver));
			}
		}
		return multiserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetMultiserver() {
		return multiserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiserver(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newMultiserver) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldMultiserver = multiserver;
		multiserver = newMultiserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__MULTISERVER, oldMultiserver, multiserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptFixture> getFixtures() {
		if (fixtures == null) {
			fixtures = new EObjectContainmentEList<TestScriptFixture>(TestScriptFixture.class, this, FhirResourcePackage.TEST_SCRIPT__FIXTURE);
		}
		return fixtures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.TEST_SCRIPT__PROFILE);
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
			variables = new EObjectContainmentEList<TestScriptVariable>(TestScriptVariable.class, this, FhirResourcePackage.TEST_SCRIPT__VARIABLE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__SETUP, oldSetup, newSetup);
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
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptTest> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<TestScriptTest>(TestScriptTest.class, this, FhirResourcePackage.TEST_SCRIPT__TEST);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__TEARDOWN, oldTeardown, newTeardown);
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
				msgs = ((InternalEObject)teardown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			if (newTeardown != null)
				msgs = ((InternalEObject)newTeardown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.TEST_SCRIPT__TEARDOWN, null, msgs);
			msgs = basicSetTeardown(newTeardown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT__TEARDOWN, newTeardown, newTeardown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.TEST_SCRIPT__METADATA:
				return basicSetMetadata(null, msgs);
			case FhirResourcePackage.TEST_SCRIPT__FIXTURE:
				return ((InternalEList<?>)getFixtures()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.TEST_SCRIPT__VARIABLE:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.TEST_SCRIPT__SETUP:
				return basicSetSetup(null, msgs);
			case FhirResourcePackage.TEST_SCRIPT__TEST:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.TEST_SCRIPT__TEARDOWN:
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
			case FhirResourcePackage.TEST_SCRIPT__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.TEST_SCRIPT__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.TEST_SCRIPT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.TEST_SCRIPT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.TEST_SCRIPT__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case FhirResourcePackage.TEST_SCRIPT__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.TEST_SCRIPT__CONTACT:
				return getContacts();
			case FhirResourcePackage.TEST_SCRIPT__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.TEST_SCRIPT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.TEST_SCRIPT__USE_CONTEXT:
				return getUseContexts();
			case FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirResourcePackage.TEST_SCRIPT__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case FhirResourcePackage.TEST_SCRIPT__METADATA:
				return getMetadata();
			case FhirResourcePackage.TEST_SCRIPT__MULTISERVER:
				if (resolve) return getMultiserver();
				return basicGetMultiserver();
			case FhirResourcePackage.TEST_SCRIPT__FIXTURE:
				return getFixtures();
			case FhirResourcePackage.TEST_SCRIPT__PROFILE:
				return getProfiles();
			case FhirResourcePackage.TEST_SCRIPT__VARIABLE:
				return getVariables();
			case FhirResourcePackage.TEST_SCRIPT__SETUP:
				return getSetup();
			case FhirResourcePackage.TEST_SCRIPT__TEST:
				return getTests();
			case FhirResourcePackage.TEST_SCRIPT__TEARDOWN:
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
			case FhirResourcePackage.TEST_SCRIPT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends TestScriptContact>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__MULTISERVER:
				setMultiserver((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__FIXTURE:
				getFixtures().clear();
				getFixtures().addAll((Collection<? extends TestScriptFixture>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__VARIABLE:
				getVariables().clear();
				getVariables().addAll((Collection<? extends TestScriptVariable>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__TEST:
				getTests().clear();
				getTests().addAll((Collection<? extends TestScriptTest>)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT__TEARDOWN:
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
			case FhirResourcePackage.TEST_SCRIPT__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__METADATA:
				setMetadata((TestScriptMetadata)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__MULTISERVER:
				setMultiserver((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__FIXTURE:
				getFixtures().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__PROFILE:
				getProfiles().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__VARIABLE:
				getVariables().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__SETUP:
				setSetup((TestScriptSetup)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT__TEST:
				getTests().clear();
				return;
			case FhirResourcePackage.TEST_SCRIPT__TEARDOWN:
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
			case FhirResourcePackage.TEST_SCRIPT__URL:
				return url != null;
			case FhirResourcePackage.TEST_SCRIPT__VERSION:
				return version != null;
			case FhirResourcePackage.TEST_SCRIPT__NAME:
				return name != null;
			case FhirResourcePackage.TEST_SCRIPT__STATUS:
				return status != null;
			case FhirResourcePackage.TEST_SCRIPT__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.TEST_SCRIPT__EXPERIMENTAL:
				return experimental != null;
			case FhirResourcePackage.TEST_SCRIPT__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.TEST_SCRIPT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__DATE:
				return date != null;
			case FhirResourcePackage.TEST_SCRIPT__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.TEST_SCRIPT__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__REQUIREMENTS:
				return requirements != null;
			case FhirResourcePackage.TEST_SCRIPT__COPYRIGHT:
				return copyright != null;
			case FhirResourcePackage.TEST_SCRIPT__METADATA:
				return metadata != null;
			case FhirResourcePackage.TEST_SCRIPT__MULTISERVER:
				return multiserver != null;
			case FhirResourcePackage.TEST_SCRIPT__FIXTURE:
				return fixtures != null && !fixtures.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__VARIABLE:
				return variables != null && !variables.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__SETUP:
				return setup != null;
			case FhirResourcePackage.TEST_SCRIPT__TEST:
				return tests != null && !tests.isEmpty();
			case FhirResourcePackage.TEST_SCRIPT__TEARDOWN:
				return teardown != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptImpl
