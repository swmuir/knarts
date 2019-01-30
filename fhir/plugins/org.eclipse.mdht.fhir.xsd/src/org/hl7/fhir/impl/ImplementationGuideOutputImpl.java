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
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.ImplementationGuideOutput;
import org.hl7.fhir.ImplementationGuideOutputDependency;
import org.hl7.fhir.ImplementationGuideOutputGlobal;
import org.hl7.fhir.ImplementationGuideOutputPage;
import org.hl7.fhir.ImplementationGuideOutputResource;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideOutputImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideOutputImpl extends DomainResourceImpl implements ImplementationGuideOutput {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

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
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contact;

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
	 * The cached value of the '{@link #getUseContext() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContext;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdiction;

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
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Id fhirVersion;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideOutputDependency> dependency;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideOutputResource> resource;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideOutputGlobal> global;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected Uri rendering;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideOutputPage> page;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> image;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> other;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideOutput();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT);
		}
		return contact;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContext() {
		if (useContext == null) {
			useContext = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT);
		}
		return useContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdiction() {
		if (jurisdiction == null) {
			jurisdiction = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION);
		}
		return jurisdiction;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFhirVersion(Id newFhirVersion, NotificationChain msgs) {
		Id oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION, oldFhirVersion, newFhirVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Id newFhirVersion) {
		if (newFhirVersion != fhirVersion) {
			NotificationChain msgs = null;
			if (fhirVersion != null)
				msgs = ((InternalEObject)fhirVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION, null, msgs);
			if (newFhirVersion != null)
				msgs = ((InternalEObject)newFhirVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION, null, msgs);
			msgs = basicSetFhirVersion(newFhirVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION, newFhirVersion, newFhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideOutputDependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<ImplementationGuideOutputDependency>(ImplementationGuideOutputDependency.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideOutputResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ImplementationGuideOutputResource>(ImplementationGuideOutputResource.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideOutputGlobal> getGlobal() {
		if (global == null) {
			global = new EObjectContainmentEList<ImplementationGuideOutputGlobal>(ImplementationGuideOutputGlobal.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL);
		}
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(Uri newRendering, NotificationChain msgs) {
		Uri oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING, oldRendering, newRendering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendering(Uri newRendering) {
		if (newRendering != rendering) {
			NotificationChain msgs = null;
			if (rendering != null)
				msgs = ((InternalEObject)rendering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING, null, msgs);
			if (newRendering != null)
				msgs = ((InternalEObject)newRendering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING, null, msgs);
			msgs = basicSetRendering(newRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING, newRendering, newRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideOutputPage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuideOutputPage>(ImplementationGuideOutputPage.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getOther() {
		if (other == null) {
			other = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER);
		}
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT:
				return ((InternalEList<?>)getUseContext()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION:
				return ((InternalEList<?>)getJurisdiction()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION:
				return basicSetFhirVersion(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL:
				return ((InternalEList<?>)getGlobal()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING:
				return basicSetRendering(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER:
				return ((InternalEList<?>)getOther()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL:
				return getUrl();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION:
				return getVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS:
				return getStatus();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL:
				return getExperimental();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE:
				return getDate();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER:
				return getPublisher();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT:
				return getContact();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT:
				return getUseContext();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT:
				return getCopyright();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION:
				return getFhirVersion();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY:
				return getDependency();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE:
				return getResource();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL:
				return getGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING:
				return getRendering();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE:
				return getPage();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE:
				return getImage();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER:
				return getOther();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT:
				getUseContext().clear();
				getUseContext().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION:
				getJurisdiction().clear();
				getJurisdiction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends ImplementationGuideOutputDependency>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ImplementationGuideOutputResource>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL:
				getGlobal().clear();
				getGlobal().addAll((Collection<? extends ImplementationGuideOutputGlobal>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING:
				setRendering((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuideOutputPage>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER:
				getOther().clear();
				getOther().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL:
				setExperimental((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT:
				getUseContext().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION:
				getJurisdiction().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY:
				getDependency().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL:
				getGlobal().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING:
				setRendering((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE:
				getPage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE:
				getImage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER:
				getOther().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__URL:
				return url != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__VERSION:
				return version != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__STATUS:
				return status != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__EXPERIMENTAL:
				return experimental != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DATE:
				return date != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PUBLISHER:
				return publisher != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DESCRIPTION:
				return description != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__USE_CONTEXT:
				return useContext != null && !useContext.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__JURISDICTION:
				return jurisdiction != null && !jurisdiction.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__COPYRIGHT:
				return copyright != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__FHIR_VERSION:
				return fhirVersion != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__GLOBAL:
				return global != null && !global.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__RENDERING:
				return rendering != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__PAGE:
				return page != null && !page.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__IMAGE:
				return image != null && !image.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_OUTPUT__OTHER:
				return other != null && !other.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideOutputImpl
