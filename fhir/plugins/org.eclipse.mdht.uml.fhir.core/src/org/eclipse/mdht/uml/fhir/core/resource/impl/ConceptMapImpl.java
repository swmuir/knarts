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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.ConceptMap;
import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapContact;
import org.eclipse.mdht.uml.fhir.core.resource.ConceptMapSourceElement;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getTargetx <em>Targetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ConceptMapImpl#getElements <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapImpl extends DomainResourceImpl implements ConceptMap {
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
	protected EList<ConceptMapContact> contacts;

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
	 * The cached value of the '{@link #getSourcex() <em>Sourcex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcex()
	 * @generated
	 * @ordered
	 */
	protected Base sourcex;

	/**
	 * The cached value of the '{@link #getTargetx() <em>Targetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetx()
	 * @generated
	 * @ordered
	 */
	protected Base targetx;

	/**
	 * The cached value of the '{@link #getElements() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapSourceElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getConceptMap();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ConceptMapContact>(ConceptMapContact.class, this, FhirResourcePackage.CONCEPT_MAP__CONTACT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.CONCEPT_MAP__USE_CONTEXT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS, oldRequirements, requirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS, oldRequirements, requirements));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getSourcex() {
		if (sourcex != null && sourcex.eIsProxy()) {
			InternalEObject oldSourcex = (InternalEObject)sourcex;
			sourcex = (Base)eResolveProxy(oldSourcex);
			if (sourcex != oldSourcex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__SOURCEX, oldSourcex, sourcex));
			}
		}
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetSourcex() {
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcex(Base newSourcex) {
		Base oldSourcex = sourcex;
		sourcex = newSourcex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__SOURCEX, oldSourcex, sourcex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getTargetx() {
		if (targetx != null && targetx.eIsProxy()) {
			InternalEObject oldTargetx = (InternalEObject)targetx;
			targetx = (Base)eResolveProxy(oldTargetx);
			if (targetx != oldTargetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CONCEPT_MAP__TARGETX, oldTargetx, targetx));
			}
		}
		return targetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetTargetx() {
		return targetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetx(Base newTargetx) {
		Base oldTargetx = targetx;
		targetx = newTargetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CONCEPT_MAP__TARGETX, oldTargetx, targetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapSourceElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ConceptMapSourceElement>(ConceptMapSourceElement.class, this, FhirResourcePackage.CONCEPT_MAP__ELEMENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CONCEPT_MAP__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CONCEPT_MAP__ELEMENT:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CONCEPT_MAP__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.CONCEPT_MAP__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.CONCEPT_MAP__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.CONCEPT_MAP__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.CONCEPT_MAP__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case FhirResourcePackage.CONCEPT_MAP__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.CONCEPT_MAP__CONTACT:
				return getContacts();
			case FhirResourcePackage.CONCEPT_MAP__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.CONCEPT_MAP__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.CONCEPT_MAP__USE_CONTEXT:
				return getUseContexts();
			case FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirResourcePackage.CONCEPT_MAP__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case FhirResourcePackage.CONCEPT_MAP__SOURCEX:
				if (resolve) return getSourcex();
				return basicGetSourcex();
			case FhirResourcePackage.CONCEPT_MAP__TARGETX:
				if (resolve) return getTargetx();
				return basicGetTargetx();
			case FhirResourcePackage.CONCEPT_MAP__ELEMENT:
				return getElements();
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
			case FhirResourcePackage.CONCEPT_MAP__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ConceptMapContact>)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__SOURCEX:
				setSourcex((Base)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__TARGETX:
				setTargetx((Base)newValue);
				return;
			case FhirResourcePackage.CONCEPT_MAP__ELEMENT:
				getElements().clear();
				getElements().addAll((Collection<? extends ConceptMapSourceElement>)newValue);
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
			case FhirResourcePackage.CONCEPT_MAP__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.CONCEPT_MAP__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__SOURCEX:
				setSourcex((Base)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__TARGETX:
				setTargetx((Base)null);
				return;
			case FhirResourcePackage.CONCEPT_MAP__ELEMENT:
				getElements().clear();
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
			case FhirResourcePackage.CONCEPT_MAP__URL:
				return url != null;
			case FhirResourcePackage.CONCEPT_MAP__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.CONCEPT_MAP__VERSION:
				return version != null;
			case FhirResourcePackage.CONCEPT_MAP__NAME:
				return name != null;
			case FhirResourcePackage.CONCEPT_MAP__STATUS:
				return status != null;
			case FhirResourcePackage.CONCEPT_MAP__EXPERIMENTAL:
				return experimental != null;
			case FhirResourcePackage.CONCEPT_MAP__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.CONCEPT_MAP__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.CONCEPT_MAP__DATE:
				return date != null;
			case FhirResourcePackage.CONCEPT_MAP__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.CONCEPT_MAP__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case FhirResourcePackage.CONCEPT_MAP__REQUIREMENTS:
				return requirements != null;
			case FhirResourcePackage.CONCEPT_MAP__COPYRIGHT:
				return copyright != null;
			case FhirResourcePackage.CONCEPT_MAP__SOURCEX:
				return sourcex != null;
			case FhirResourcePackage.CONCEPT_MAP__TARGETX:
				return targetx != null;
			case FhirResourcePackage.CONCEPT_MAP__ELEMENT:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapImpl
