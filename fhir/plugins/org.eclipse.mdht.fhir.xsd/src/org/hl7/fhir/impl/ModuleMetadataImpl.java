/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.ModuleMetadataContact;
import org.hl7.fhir.ModuleMetadataContributor;
import org.hl7.fhir.ModuleMetadataCoverage;
import org.hl7.fhir.ModuleMetadataRelatedResource;
import org.hl7.fhir.ModuleMetadataStatus;
import org.hl7.fhir.ModuleMetadataType;
import org.hl7.fhir.Period;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataImpl#getRelatedResource <em>Related Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleMetadataImpl extends ElementImpl implements ModuleMetadata {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadataType type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadataStatus status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean experimental;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String usage;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected Date publicationDate;

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
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMetadataCoverage> coverage;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topic;

	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMetadataContributor> contributor;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMetadataContact> contact;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String copyright;

	/**
	 * The cached value of the '{@link #getRelatedResource() <em>Related Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleMetadataRelatedResource> relatedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getModuleMetadata();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MODULE_METADATA__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ModuleMetadataType newType, NotificationChain msgs) {
		ModuleMetadataType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModuleMetadataType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ModuleMetadataStatus newStatus, NotificationChain msgs) {
		ModuleMetadataStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ModuleMetadataStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.hl7.fhir.Boolean newExperimental, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.hl7.fhir.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(org.hl7.fhir.String newPurpose, NotificationChain msgs) {
		org.hl7.fhir.String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(org.hl7.fhir.String newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(org.hl7.fhir.String newUsage, NotificationChain msgs) {
		org.hl7.fhir.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(org.hl7.fhir.String newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(Date newPublicationDate, NotificationChain msgs) {
		Date oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(Date newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE, oldLastReviewDate, newLastReviewDate);
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
				msgs = ((InternalEObject)lastReviewDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE, null, msgs);
			if (newLastReviewDate != null)
				msgs = ((InternalEObject)newLastReviewDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE, null, msgs);
			msgs = basicSetLastReviewDate(newLastReviewDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE, newLastReviewDate, newLastReviewDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
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
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMetadataCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<ModuleMetadataCoverage>(ModuleMetadataCoverage.class, this, FhirPackage.MODULE_METADATA__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MODULE_METADATA__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMetadataContributor> getContributor() {
		if (contributor == null) {
			contributor = new EObjectContainmentEList<ModuleMetadataContributor>(ModuleMetadataContributor.class, this, FhirPackage.MODULE_METADATA__CONTRIBUTOR);
		}
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMetadataContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ModuleMetadataContact>(ModuleMetadataContact.class, this, FhirPackage.MODULE_METADATA__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(org.hl7.fhir.String newCopyright, NotificationChain msgs) {
		org.hl7.fhir.String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(org.hl7.fhir.String newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMetadataRelatedResource> getRelatedResource() {
		if (relatedResource == null) {
			relatedResource = new EObjectContainmentEList<ModuleMetadataRelatedResource>(ModuleMetadataRelatedResource.class, this, FhirPackage.MODULE_METADATA__RELATED_RESOURCE);
		}
		return relatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MODULE_METADATA__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.MODULE_METADATA__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_METADATA__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MODULE_METADATA__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MODULE_METADATA__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.MODULE_METADATA__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MODULE_METADATA__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MODULE_METADATA__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.MODULE_METADATA__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MODULE_METADATA__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.MODULE_METADATA__USAGE:
				return basicSetUsage(null, msgs);
			case FhirPackage.MODULE_METADATA__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE:
				return basicSetLastReviewDate(null, msgs);
			case FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MODULE_METADATA__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_METADATA__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_METADATA__CONTRIBUTOR:
				return ((InternalEList<?>)getContributor()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_METADATA__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.MODULE_METADATA__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.MODULE_METADATA__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.MODULE_METADATA__RELATED_RESOURCE:
				return ((InternalEList<?>)getRelatedResource()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MODULE_METADATA__URL:
				return getUrl();
			case FhirPackage.MODULE_METADATA__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MODULE_METADATA__VERSION:
				return getVersion();
			case FhirPackage.MODULE_METADATA__NAME:
				return getName();
			case FhirPackage.MODULE_METADATA__TITLE:
				return getTitle();
			case FhirPackage.MODULE_METADATA__TYPE:
				return getType();
			case FhirPackage.MODULE_METADATA__STATUS:
				return getStatus();
			case FhirPackage.MODULE_METADATA__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.MODULE_METADATA__DESCRIPTION:
				return getDescription();
			case FhirPackage.MODULE_METADATA__PURPOSE:
				return getPurpose();
			case FhirPackage.MODULE_METADATA__USAGE:
				return getUsage();
			case FhirPackage.MODULE_METADATA__PUBLICATION_DATE:
				return getPublicationDate();
			case FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE:
				return getLastReviewDate();
			case FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MODULE_METADATA__COVERAGE:
				return getCoverage();
			case FhirPackage.MODULE_METADATA__TOPIC:
				return getTopic();
			case FhirPackage.MODULE_METADATA__CONTRIBUTOR:
				return getContributor();
			case FhirPackage.MODULE_METADATA__PUBLISHER:
				return getPublisher();
			case FhirPackage.MODULE_METADATA__CONTACT:
				return getContact();
			case FhirPackage.MODULE_METADATA__COPYRIGHT:
				return getCopyright();
			case FhirPackage.MODULE_METADATA__RELATED_RESOURCE:
				return getRelatedResource();
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
			case FhirPackage.MODULE_METADATA__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.MODULE_METADATA__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MODULE_METADATA__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__TYPE:
				setType((ModuleMetadataType)newValue);
				return;
			case FhirPackage.MODULE_METADATA__STATUS:
				setStatus((ModuleMetadataStatus)newValue);
				return;
			case FhirPackage.MODULE_METADATA__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MODULE_METADATA__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__PURPOSE:
				setPurpose((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__USAGE:
				setUsage((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__PUBLICATION_DATE:
				setPublicationDate((Date)newValue);
				return;
			case FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MODULE_METADATA__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends ModuleMetadataCoverage>)newValue);
				return;
			case FhirPackage.MODULE_METADATA__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MODULE_METADATA__CONTRIBUTOR:
				getContributor().clear();
				getContributor().addAll((Collection<? extends ModuleMetadataContributor>)newValue);
				return;
			case FhirPackage.MODULE_METADATA__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ModuleMetadataContact>)newValue);
				return;
			case FhirPackage.MODULE_METADATA__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_METADATA__RELATED_RESOURCE:
				getRelatedResource().clear();
				getRelatedResource().addAll((Collection<? extends ModuleMetadataRelatedResource>)newValue);
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
			case FhirPackage.MODULE_METADATA__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.MODULE_METADATA__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MODULE_METADATA__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__TYPE:
				setType((ModuleMetadataType)null);
				return;
			case FhirPackage.MODULE_METADATA__STATUS:
				setStatus((ModuleMetadataStatus)null);
				return;
			case FhirPackage.MODULE_METADATA__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MODULE_METADATA__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__PURPOSE:
				setPurpose((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__USAGE:
				setUsage((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__PUBLICATION_DATE:
				setPublicationDate((Date)null);
				return;
			case FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MODULE_METADATA__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.MODULE_METADATA__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.MODULE_METADATA__CONTRIBUTOR:
				getContributor().clear();
				return;
			case FhirPackage.MODULE_METADATA__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.MODULE_METADATA__COPYRIGHT:
				setCopyright((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_METADATA__RELATED_RESOURCE:
				getRelatedResource().clear();
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
			case FhirPackage.MODULE_METADATA__URL:
				return url != null;
			case FhirPackage.MODULE_METADATA__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MODULE_METADATA__VERSION:
				return version != null;
			case FhirPackage.MODULE_METADATA__NAME:
				return name != null;
			case FhirPackage.MODULE_METADATA__TITLE:
				return title != null;
			case FhirPackage.MODULE_METADATA__TYPE:
				return type != null;
			case FhirPackage.MODULE_METADATA__STATUS:
				return status != null;
			case FhirPackage.MODULE_METADATA__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.MODULE_METADATA__DESCRIPTION:
				return description != null;
			case FhirPackage.MODULE_METADATA__PURPOSE:
				return purpose != null;
			case FhirPackage.MODULE_METADATA__USAGE:
				return usage != null;
			case FhirPackage.MODULE_METADATA__PUBLICATION_DATE:
				return publicationDate != null;
			case FhirPackage.MODULE_METADATA__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case FhirPackage.MODULE_METADATA__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MODULE_METADATA__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.MODULE_METADATA__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.MODULE_METADATA__CONTRIBUTOR:
				return contributor != null && !contributor.isEmpty();
			case FhirPackage.MODULE_METADATA__PUBLISHER:
				return publisher != null;
			case FhirPackage.MODULE_METADATA__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.MODULE_METADATA__COPYRIGHT:
				return copyright != null;
			case FhirPackage.MODULE_METADATA__RELATED_RESOURCE:
				return relatedResource != null && !relatedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleMetadataImpl
