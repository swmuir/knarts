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
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinition;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinitionContact;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinitionDifferential;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinitionMapping;
import org.eclipse.mdht.uml.fhir.core.resource.StructureDefinitionSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getMappings <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getConstrainedType <em>Constrained Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getContexts <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getSnapshot <em>Snapshot</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.StructureDefinitionImpl#getDifferential <em>Differential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDefinitionImpl extends DomainResourceImpl implements StructureDefinition {
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
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String display;

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
	protected EList<StructureDefinitionContact> contacts;

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
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Id fhirVersion;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinitionMapping> mappings;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Code kind;

	/**
	 * The cached value of the '{@link #getConstrainedType() <em>Constrained Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedType()
	 * @generated
	 * @ordered
	 */
	protected Code constrainedType;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected Code contextType;

	/**
	 * The cached value of the '{@link #getContexts() <em>Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> contexts;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Uri base;

	/**
	 * The cached value of the '{@link #getSnapshot() <em>Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinitionSnapshot snapshot;

	/**
	 * The cached value of the '{@link #getDifferential() <em>Differential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferential()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinitionDifferential differential;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getStructureDefinition();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDisplay() {
		if (display != null && display.eIsProxy()) {
			InternalEObject oldDisplay = (InternalEObject)display;
			display = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDisplay);
			if (display != oldDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY, oldDisplay, display));
			}
		}
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.eclipse.mdht.uml.fhir.core.datatype.String newDisplay) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY, oldDisplay, display));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinitionContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<StructureDefinitionContact>(StructureDefinitionContact.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__USE_CONTEXT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS, oldRequirements, requirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS, oldRequirements, requirements));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFhirVersion() {
		if (fhirVersion != null && fhirVersion.eIsProxy()) {
			InternalEObject oldFhirVersion = (InternalEObject)fhirVersion;
			fhirVersion = (Id)eResolveProxy(oldFhirVersion);
			if (fhirVersion != oldFhirVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION, oldFhirVersion, fhirVersion));
			}
		}
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Id newFhirVersion) {
		Id oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION, oldFhirVersion, fhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinitionMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<StructureDefinitionMapping>(StructureDefinitionMapping.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Code)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Code newKind) {
		Code oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConstrainedType() {
		if (constrainedType != null && constrainedType.eIsProxy()) {
			InternalEObject oldConstrainedType = (InternalEObject)constrainedType;
			constrainedType = (Code)eResolveProxy(oldConstrainedType);
			if (constrainedType != oldConstrainedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE, oldConstrainedType, constrainedType));
			}
		}
		return constrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetConstrainedType() {
		return constrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedType(Code newConstrainedType) {
		Code oldConstrainedType = constrainedType;
		constrainedType = newConstrainedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE, oldConstrainedType, constrainedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getAbstract() {
		if (abstract_ != null && abstract_.eIsProxy()) {
			InternalEObject oldAbstract = (InternalEObject)abstract_;
			abstract_ = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldAbstract);
			if (abstract_ != oldAbstract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
			}
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newAbstract) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContextType() {
		if (contextType != null && contextType.eIsProxy()) {
			InternalEObject oldContextType = (InternalEObject)contextType;
			contextType = (Code)eResolveProxy(oldContextType);
			if (contextType != oldContextType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, oldContextType, contextType));
			}
		}
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(Code newContextType) {
		Code oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE, oldContextType, contextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Uri)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.STRUCTURE_DEFINITION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Uri newBase) {
		Uri oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot getSnapshot() {
		return snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnapshot(StructureDefinitionSnapshot newSnapshot, NotificationChain msgs) {
		StructureDefinitionSnapshot oldSnapshot = snapshot;
		snapshot = newSnapshot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT, oldSnapshot, newSnapshot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshot(StructureDefinitionSnapshot newSnapshot) {
		if (newSnapshot != snapshot) {
			NotificationChain msgs = null;
			if (snapshot != null)
				msgs = ((InternalEObject)snapshot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT, null, msgs);
			if (newSnapshot != null)
				msgs = ((InternalEObject)newSnapshot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT, null, msgs);
			msgs = basicSetSnapshot(newSnapshot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT, newSnapshot, newSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential getDifferential() {
		return differential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifferential(StructureDefinitionDifferential newDifferential, NotificationChain msgs) {
		StructureDefinitionDifferential oldDifferential = differential;
		differential = newDifferential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL, oldDifferential, newDifferential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifferential(StructureDefinitionDifferential newDifferential) {
		if (newDifferential != differential) {
			NotificationChain msgs = null;
			if (differential != null)
				msgs = ((InternalEObject)differential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL, null, msgs);
			if (newDifferential != null)
				msgs = ((InternalEObject)newDifferential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL, null, msgs);
			msgs = basicSetDifferential(newDifferential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL, newDifferential, newDifferential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return basicSetSnapshot(null, msgs);
			case FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return basicSetDifferential(null, msgs);
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
			case FhirResourcePackage.STRUCTURE_DEFINITION__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.STRUCTURE_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.STRUCTURE_DEFINITION__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.STRUCTURE_DEFINITION__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY:
				if (resolve) return getDisplay();
				return basicGetDisplay();
			case FhirResourcePackage.STRUCTURE_DEFINITION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT:
				return getContacts();
			case FhirResourcePackage.STRUCTURE_DEFINITION__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				return getUseContexts();
			case FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case FhirResourcePackage.STRUCTURE_DEFINITION__CODE:
				return getCodes();
			case FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				if (resolve) return getFhirVersion();
				return basicGetFhirVersion();
			case FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING:
				return getMappings();
			case FhirResourcePackage.STRUCTURE_DEFINITION__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE:
				if (resolve) return getConstrainedType();
				return basicGetConstrainedType();
			case FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT:
				if (resolve) return getAbstract();
				return basicGetAbstract();
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				if (resolve) return getContextType();
				return basicGetContextType();
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT:
				return getContexts();
			case FhirResourcePackage.STRUCTURE_DEFINITION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return getSnapshot();
			case FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return getDifferential();
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
			case FhirResourcePackage.STRUCTURE_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends StructureDefinitionContact>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING:
				getMappings().clear();
				getMappings().addAll((Collection<? extends StructureDefinitionMapping>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__KIND:
				setKind((Code)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE:
				setConstrainedType((Code)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType((Code)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT:
				getContexts().clear();
				getContexts().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__BASE:
				setBase((Uri)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT:
				setSnapshot((StructureDefinitionSnapshot)newValue);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				setDifferential((StructureDefinitionDifferential)newValue);
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
			case FhirResourcePackage.STRUCTURE_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT:
				setCopyright((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CODE:
				getCodes().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING:
				getMappings().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__KIND:
				setKind((Code)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE:
				setConstrainedType((Code)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				setContextType((Code)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT:
				getContexts().clear();
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__BASE:
				setBase((Uri)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT:
				setSnapshot((StructureDefinitionSnapshot)null);
				return;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				setDifferential((StructureDefinitionDifferential)null);
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
			case FhirResourcePackage.STRUCTURE_DEFINITION__URL:
				return url != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__VERSION:
				return version != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__NAME:
				return name != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DISPLAY:
				return display != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__STATUS:
				return status != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__DATE:
				return date != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__COPYRIGHT:
				return copyright != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CODE:
				return codes != null && !codes.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__FHIR_VERSION:
				return fhirVersion != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__MAPPING:
				return mappings != null && !mappings.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__KIND:
				return kind != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONSTRAINED_TYPE:
				return constrainedType != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__ABSTRACT:
				return abstract_ != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT_TYPE:
				return contextType != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__CONTEXT:
				return contexts != null && !contexts.isEmpty();
			case FhirResourcePackage.STRUCTURE_DEFINITION__BASE:
				return base != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__SNAPSHOT:
				return snapshot != null;
			case FhirResourcePackage.STRUCTURE_DEFINITION__DIFFERENTIAL:
				return differential != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDefinitionImpl
