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
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSet;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetCodeSystem;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetCompose;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetContact;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetImpl#getExpansion <em>Expansion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetImpl extends DomainResourceImpl implements ValueSet {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	protected EList<ValueSetContact> contacts;

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
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lockedDate;

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
	 * The cached value of the '{@link #getImmutable() <em>Immutable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmutable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean immutable;

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
	 * The cached value of the '{@link #getExtensible() <em>Extensible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensible()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean extensible;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected ValueSetCodeSystem codeSystem;

	/**
	 * The cached value of the '{@link #getCompose() <em>Compose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompose()
	 * @generated
	 * @ordered
	 */
	protected ValueSetCompose compose;

	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected ValueSetExpansion expansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getValueSet();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ValueSetContact>(ValueSetContact.class, this, FhirResourcePackage.VALUE_SET__CONTACT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLockedDate() {
		if (lockedDate != null && lockedDate.eIsProxy()) {
			InternalEObject oldLockedDate = (InternalEObject)lockedDate;
			lockedDate = (Date)eResolveProxy(oldLockedDate);
			if (lockedDate != oldLockedDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__LOCKED_DATE, oldLockedDate, lockedDate));
			}
		}
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedDate(Date newLockedDate) {
		Date oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__LOCKED_DATE, oldLockedDate, lockedDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.VALUE_SET__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getImmutable() {
		if (immutable != null && immutable.eIsProxy()) {
			InternalEObject oldImmutable = (InternalEObject)immutable;
			immutable = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldImmutable);
			if (immutable != oldImmutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__IMMUTABLE, oldImmutable, immutable));
			}
		}
		return immutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetImmutable() {
		return immutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmutable(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newImmutable) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldImmutable = immutable;
		immutable = newImmutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__IMMUTABLE, oldImmutable, immutable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__REQUIREMENTS, oldRequirements, requirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__REQUIREMENTS, oldRequirements, requirements));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExtensible() {
		if (extensible != null && extensible.eIsProxy()) {
			InternalEObject oldExtensible = (InternalEObject)extensible;
			extensible = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExtensible);
			if (extensible != oldExtensible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET__EXTENSIBLE, oldExtensible, extensible));
			}
		}
		return extensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExtensible() {
		return extensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensible(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExtensible) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExtensible = extensible;
		extensible = newExtensible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__EXTENSIBLE, oldExtensible, extensible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(ValueSetCodeSystem newCodeSystem, NotificationChain msgs) {
		ValueSetCodeSystem oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(ValueSetCodeSystem newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose getCompose() {
		return compose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompose(ValueSetCompose newCompose, NotificationChain msgs) {
		ValueSetCompose oldCompose = compose;
		compose = newCompose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__COMPOSE, oldCompose, newCompose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompose(ValueSetCompose newCompose) {
		if (newCompose != compose) {
			NotificationChain msgs = null;
			if (compose != null)
				msgs = ((InternalEObject)compose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__COMPOSE, null, msgs);
			if (newCompose != null)
				msgs = ((InternalEObject)newCompose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__COMPOSE, null, msgs);
			msgs = basicSetCompose(newCompose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__COMPOSE, newCompose, newCompose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion getExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpansion(ValueSetExpansion newExpansion, NotificationChain msgs) {
		ValueSetExpansion oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__EXPANSION, oldExpansion, newExpansion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansion(ValueSetExpansion newExpansion) {
		if (newExpansion != expansion) {
			NotificationChain msgs = null;
			if (expansion != null)
				msgs = ((InternalEObject)expansion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__EXPANSION, null, msgs);
			if (newExpansion != null)
				msgs = ((InternalEObject)newExpansion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.VALUE_SET__EXPANSION, null, msgs);
			msgs = basicSetExpansion(newExpansion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET__EXPANSION, newExpansion, newExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.VALUE_SET__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.VALUE_SET__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirResourcePackage.VALUE_SET__COMPOSE:
				return basicSetCompose(null, msgs);
			case FhirResourcePackage.VALUE_SET__EXPANSION:
				return basicSetExpansion(null, msgs);
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
			case FhirResourcePackage.VALUE_SET__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.VALUE_SET__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.VALUE_SET__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.VALUE_SET__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.VALUE_SET__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.VALUE_SET__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case FhirResourcePackage.VALUE_SET__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.VALUE_SET__CONTACT:
				return getContacts();
			case FhirResourcePackage.VALUE_SET__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.VALUE_SET__LOCKED_DATE:
				if (resolve) return getLockedDate();
				return basicGetLockedDate();
			case FhirResourcePackage.VALUE_SET__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.VALUE_SET__USE_CONTEXT:
				return getUseContexts();
			case FhirResourcePackage.VALUE_SET__IMMUTABLE:
				if (resolve) return getImmutable();
				return basicGetImmutable();
			case FhirResourcePackage.VALUE_SET__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirResourcePackage.VALUE_SET__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case FhirResourcePackage.VALUE_SET__EXTENSIBLE:
				if (resolve) return getExtensible();
				return basicGetExtensible();
			case FhirResourcePackage.VALUE_SET__CODE_SYSTEM:
				return getCodeSystem();
			case FhirResourcePackage.VALUE_SET__COMPOSE:
				return getCompose();
			case FhirResourcePackage.VALUE_SET__EXPANSION:
				return getExpansion();
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
			case FhirResourcePackage.VALUE_SET__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ValueSetContact>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__LOCKED_DATE:
				setLockedDate((Date)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__IMMUTABLE:
				setImmutable((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__EXTENSIBLE:
				setExtensible((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__CODE_SYSTEM:
				setCodeSystem((ValueSetCodeSystem)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__COMPOSE:
				setCompose((ValueSetCompose)newValue);
				return;
			case FhirResourcePackage.VALUE_SET__EXPANSION:
				setExpansion((ValueSetExpansion)newValue);
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
			case FhirResourcePackage.VALUE_SET__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.VALUE_SET__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.VALUE_SET__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.VALUE_SET__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.VALUE_SET__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.VALUE_SET__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.VALUE_SET__LOCKED_DATE:
				setLockedDate((Date)null);
				return;
			case FhirResourcePackage.VALUE_SET__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case FhirResourcePackage.VALUE_SET__IMMUTABLE:
				setImmutable((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.VALUE_SET__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET__EXTENSIBLE:
				setExtensible((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.VALUE_SET__CODE_SYSTEM:
				setCodeSystem((ValueSetCodeSystem)null);
				return;
			case FhirResourcePackage.VALUE_SET__COMPOSE:
				setCompose((ValueSetCompose)null);
				return;
			case FhirResourcePackage.VALUE_SET__EXPANSION:
				setExpansion((ValueSetExpansion)null);
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
			case FhirResourcePackage.VALUE_SET__URL:
				return url != null;
			case FhirResourcePackage.VALUE_SET__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.VALUE_SET__VERSION:
				return version != null;
			case FhirResourcePackage.VALUE_SET__NAME:
				return name != null;
			case FhirResourcePackage.VALUE_SET__STATUS:
				return status != null;
			case FhirResourcePackage.VALUE_SET__EXPERIMENTAL:
				return experimental != null;
			case FhirResourcePackage.VALUE_SET__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.VALUE_SET__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.VALUE_SET__DATE:
				return date != null;
			case FhirResourcePackage.VALUE_SET__LOCKED_DATE:
				return lockedDate != null;
			case FhirResourcePackage.VALUE_SET__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.VALUE_SET__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case FhirResourcePackage.VALUE_SET__IMMUTABLE:
				return immutable != null;
			case FhirResourcePackage.VALUE_SET__REQUIREMENTS:
				return requirements != null;
			case FhirResourcePackage.VALUE_SET__COPYRIGHT:
				return copyright != null;
			case FhirResourcePackage.VALUE_SET__EXTENSIBLE:
				return extensible != null;
			case FhirResourcePackage.VALUE_SET__CODE_SYSTEM:
				return codeSystem != null;
			case FhirResourcePackage.VALUE_SET__COMPOSE:
				return compose != null;
			case FhirResourcePackage.VALUE_SET__EXPANSION:
				return expansion != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSetImpl
