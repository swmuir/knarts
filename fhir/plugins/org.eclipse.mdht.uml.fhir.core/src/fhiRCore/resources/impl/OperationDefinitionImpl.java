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

import fhiRCore.resources.OperationDefinition;
import fhiRCore.resources.OperationDefinitionOverload;
import fhiRCore.resources.OperationDefinitionParameter;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureDefinition;

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
 * An implementation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getAffectsState <em>Affects State</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getInputProfile <em>Input Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getOutputProfile <em>Output Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionImpl#getOverloads <em>Overload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionImpl extends DomainResourceImpl implements OperationDefinition {
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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Code kind;

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
	 * The cached value of the '{@link #getAffectsState() <em>Affects State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectsState()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean affectsState;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Markdown comment;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition base;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> resources;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean system;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean type;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean instance;

	/**
	 * The cached value of the '{@link #getInputProfile() <em>Input Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition inputProfile;

	/**
	 * The cached value of the '{@link #getOutputProfile() <em>Output Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition outputProfile;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionParameter> parameters;

	/**
	 * The cached value of the '{@link #getOverloads() <em>Overload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverloads()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinitionOverload> overloads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__KIND, oldKind, newKind);
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
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__KIND, newKind, newKind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.OPERATION_DEFINITION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OPERATION_DEFINITION__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getAffectsState() {
		return affectsState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffectsState(fhiRCore.dataTypes.Boolean newAffectsState, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldAffectsState = affectsState;
		affectsState = newAffectsState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE, oldAffectsState, newAffectsState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectsState(fhiRCore.dataTypes.Boolean newAffectsState) {
		if (newAffectsState != affectsState) {
			NotificationChain msgs = null;
			if (affectsState != null)
				msgs = ((InternalEObject)affectsState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE, null, msgs);
			if (newAffectsState != null)
				msgs = ((InternalEObject)newAffectsState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE, null, msgs);
			msgs = basicSetAffectsState(newAffectsState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE, newAffectsState, newAffectsState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Markdown newComment, NotificationChain msgs) {
		Markdown oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Markdown newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(OperationDefinition newBase, NotificationChain msgs) {
		OperationDefinition oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(OperationDefinition newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.OPERATION_DEFINITION__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(fhiRCore.dataTypes.Boolean newSystem, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(fhiRCore.dataTypes.Boolean newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(fhiRCore.dataTypes.Boolean newType, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(fhiRCore.dataTypes.Boolean newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(fhiRCore.dataTypes.Boolean newInstance, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(fhiRCore.dataTypes.Boolean newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getInputProfile() {
		return inputProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputProfile(StructureDefinition newInputProfile, NotificationChain msgs) {
		StructureDefinition oldInputProfile = inputProfile;
		inputProfile = newInputProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE, oldInputProfile, newInputProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputProfile(StructureDefinition newInputProfile) {
		if (newInputProfile != inputProfile) {
			NotificationChain msgs = null;
			if (inputProfile != null)
				msgs = ((InternalEObject)inputProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE, null, msgs);
			if (newInputProfile != null)
				msgs = ((InternalEObject)newInputProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE, null, msgs);
			msgs = basicSetInputProfile(newInputProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE, newInputProfile, newInputProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getOutputProfile() {
		return outputProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputProfile(StructureDefinition newOutputProfile, NotificationChain msgs) {
		StructureDefinition oldOutputProfile = outputProfile;
		outputProfile = newOutputProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE, oldOutputProfile, newOutputProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputProfile(StructureDefinition newOutputProfile) {
		if (newOutputProfile != outputProfile) {
			NotificationChain msgs = null;
			if (outputProfile != null)
				msgs = ((InternalEObject)outputProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE, null, msgs);
			if (newOutputProfile != null)
				msgs = ((InternalEObject)newOutputProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE, null, msgs);
			msgs = basicSetOutputProfile(newOutputProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE, newOutputProfile, newOutputProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<OperationDefinitionParameter>(OperationDefinitionParameter.class, this, ResourcesPackage.OPERATION_DEFINITION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinitionOverload> getOverloads() {
		if (overloads == null) {
			overloads = new EObjectContainmentEList<OperationDefinitionOverload>(OperationDefinitionOverload.class, this, ResourcesPackage.OPERATION_DEFINITION__OVERLOAD);
		}
		return overloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__KIND:
				return basicSetKind(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE:
				return basicSetAffectsState(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__SYSTEM:
				return basicSetSystem(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__INSTANCE:
				return basicSetInstance(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE:
				return basicSetInputProfile(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE:
				return basicSetOutputProfile(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_DEFINITION__OVERLOAD:
				return ((InternalEList<?>)getOverloads()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OPERATION_DEFINITION__URL:
				return getUrl();
			case ResourcesPackage.OPERATION_DEFINITION__VERSION:
				return getVersion();
			case ResourcesPackage.OPERATION_DEFINITION__NAME:
				return getName();
			case ResourcesPackage.OPERATION_DEFINITION__TITLE:
				return getTitle();
			case ResourcesPackage.OPERATION_DEFINITION__STATUS:
				return getStatus();
			case ResourcesPackage.OPERATION_DEFINITION__KIND:
				return getKind();
			case ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.OPERATION_DEFINITION__DATE:
				return getDate();
			case ResourcesPackage.OPERATION_DEFINITION__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.OPERATION_DEFINITION__CONTACT:
				return getContacts();
			case ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.OPERATION_DEFINITION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.OPERATION_DEFINITION__PURPOSE:
				return getPurpose();
			case ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE:
				return getAffectsState();
			case ResourcesPackage.OPERATION_DEFINITION__CODE:
				return getCode();
			case ResourcesPackage.OPERATION_DEFINITION__COMMENT:
				return getComment();
			case ResourcesPackage.OPERATION_DEFINITION__BASE:
				return getBase();
			case ResourcesPackage.OPERATION_DEFINITION__RESOURCE:
				return getResources();
			case ResourcesPackage.OPERATION_DEFINITION__SYSTEM:
				return getSystem();
			case ResourcesPackage.OPERATION_DEFINITION__TYPE:
				return getType();
			case ResourcesPackage.OPERATION_DEFINITION__INSTANCE:
				return getInstance();
			case ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE:
				return getInputProfile();
			case ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE:
				return getOutputProfile();
			case ResourcesPackage.OPERATION_DEFINITION__PARAMETER:
				return getParameters();
			case ResourcesPackage.OPERATION_DEFINITION__OVERLOAD:
				return getOverloads();
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
			case ResourcesPackage.OPERATION_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE:
				setAffectsState((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__COMMENT:
				setComment((Markdown)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__BASE:
				setBase((OperationDefinition)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__SYSTEM:
				setSystem((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__TYPE:
				setType((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__INSTANCE:
				setInstance((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE:
				setInputProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE:
				setOutputProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends OperationDefinitionParameter>)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__OVERLOAD:
				getOverloads().clear();
				getOverloads().addAll((Collection<? extends OperationDefinitionOverload>)newValue);
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
			case ResourcesPackage.OPERATION_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE:
				setAffectsState((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__COMMENT:
				setComment((Markdown)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__BASE:
				setBase((OperationDefinition)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__RESOURCE:
				getResources().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION__SYSTEM:
				setSystem((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__TYPE:
				setType((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__INSTANCE:
				setInstance((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE:
				setInputProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE:
				setOutputProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.OPERATION_DEFINITION__OVERLOAD:
				getOverloads().clear();
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
			case ResourcesPackage.OPERATION_DEFINITION__URL:
				return url != null;
			case ResourcesPackage.OPERATION_DEFINITION__VERSION:
				return version != null;
			case ResourcesPackage.OPERATION_DEFINITION__NAME:
				return name != null;
			case ResourcesPackage.OPERATION_DEFINITION__TITLE:
				return title != null;
			case ResourcesPackage.OPERATION_DEFINITION__STATUS:
				return status != null;
			case ResourcesPackage.OPERATION_DEFINITION__KIND:
				return kind != null;
			case ResourcesPackage.OPERATION_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.OPERATION_DEFINITION__DATE:
				return date != null;
			case ResourcesPackage.OPERATION_DEFINITION__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.OPERATION_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.OPERATION_DEFINITION__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION__PURPOSE:
				return purpose != null;
			case ResourcesPackage.OPERATION_DEFINITION__AFFECTS_STATE:
				return affectsState != null;
			case ResourcesPackage.OPERATION_DEFINITION__CODE:
				return code != null;
			case ResourcesPackage.OPERATION_DEFINITION__COMMENT:
				return comment != null;
			case ResourcesPackage.OPERATION_DEFINITION__BASE:
				return base != null;
			case ResourcesPackage.OPERATION_DEFINITION__RESOURCE:
				return resources != null && !resources.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION__SYSTEM:
				return system != null;
			case ResourcesPackage.OPERATION_DEFINITION__TYPE:
				return type != null;
			case ResourcesPackage.OPERATION_DEFINITION__INSTANCE:
				return instance != null;
			case ResourcesPackage.OPERATION_DEFINITION__INPUT_PROFILE:
				return inputProfile != null;
			case ResourcesPackage.OPERATION_DEFINITION__OUTPUT_PROFILE:
				return outputProfile != null;
			case ResourcesPackage.OPERATION_DEFINITION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.OPERATION_DEFINITION__OVERLOAD:
				return overloads != null && !overloads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionImpl
