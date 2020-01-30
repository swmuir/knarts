/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.profiles.MetadataResource;
import fhiRCore.profiles.ProfilesPackage;

import fhiRCore.resources.impl.DomainResourceImpl;

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
 * An implementation of the model object '<em><b>Metadata Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.MetadataResourceImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataResourceImpl extends DomainResourceImpl implements MetadataResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.METADATA_RESOURCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ProfilesPackage.METADATA_RESOURCE__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.METADATA_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.METADATA_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ProfilesPackage.METADATA_RESOURCE__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.METADATA_RESOURCE__URL:
				return basicSetUrl(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__VERSION:
				return basicSetVersion(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__NAME:
				return basicSetName(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__TITLE:
				return basicSetTitle(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__STATUS:
				return basicSetStatus(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__DATE:
				return basicSetDate(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.METADATA_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.METADATA_RESOURCE__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
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
			case ProfilesPackage.METADATA_RESOURCE__URL:
				return getUrl();
			case ProfilesPackage.METADATA_RESOURCE__VERSION:
				return getVersion();
			case ProfilesPackage.METADATA_RESOURCE__NAME:
				return getName();
			case ProfilesPackage.METADATA_RESOURCE__TITLE:
				return getTitle();
			case ProfilesPackage.METADATA_RESOURCE__STATUS:
				return getStatus();
			case ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL:
				return getExperimental();
			case ProfilesPackage.METADATA_RESOURCE__DATE:
				return getDate();
			case ProfilesPackage.METADATA_RESOURCE__PUBLISHER:
				return getPublisher();
			case ProfilesPackage.METADATA_RESOURCE__CONTACT:
				return getContacts();
			case ProfilesPackage.METADATA_RESOURCE__DESCRIPTION:
				return getDescription();
			case ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT:
				return getUseContexts();
			case ProfilesPackage.METADATA_RESOURCE__JURISDICTION:
				return getJurisdictions();
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
			case ProfilesPackage.METADATA_RESOURCE__URL:
				setUrl((Uri)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__STATUS:
				setStatus((Code)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__DATE:
				setDate((DateTime)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ProfilesPackage.METADATA_RESOURCE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ProfilesPackage.METADATA_RESOURCE__URL:
				setUrl((Uri)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__STATUS:
				setStatus((Code)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__DATE:
				setDate((DateTime)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__CONTACT:
				getContacts().clear();
				return;
			case ProfilesPackage.METADATA_RESOURCE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ProfilesPackage.METADATA_RESOURCE__JURISDICTION:
				getJurisdictions().clear();
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
			case ProfilesPackage.METADATA_RESOURCE__URL:
				return url != null;
			case ProfilesPackage.METADATA_RESOURCE__VERSION:
				return version != null;
			case ProfilesPackage.METADATA_RESOURCE__NAME:
				return name != null;
			case ProfilesPackage.METADATA_RESOURCE__TITLE:
				return title != null;
			case ProfilesPackage.METADATA_RESOURCE__STATUS:
				return status != null;
			case ProfilesPackage.METADATA_RESOURCE__EXPERIMENTAL:
				return experimental != null;
			case ProfilesPackage.METADATA_RESOURCE__DATE:
				return date != null;
			case ProfilesPackage.METADATA_RESOURCE__PUBLISHER:
				return publisher != null;
			case ProfilesPackage.METADATA_RESOURCE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ProfilesPackage.METADATA_RESOURCE__DESCRIPTION:
				return description != null;
			case ProfilesPackage.METADATA_RESOURCE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ProfilesPackage.METADATA_RESOURCE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetadataResourceImpl
