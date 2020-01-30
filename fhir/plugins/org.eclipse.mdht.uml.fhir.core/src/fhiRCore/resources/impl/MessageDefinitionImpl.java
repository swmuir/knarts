/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.GraphDefinition;
import fhiRCore.resources.MessageDefinition;
import fhiRCore.resources.MessageDefinitionAllowedResponse;
import fhiRCore.resources.MessageDefinitionFocus;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getEventx <em>Eventx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getResponseRequired <em>Response Required</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getAllowedResponses <em>Allowed Response</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageDefinitionImpl#getGraphs <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionImpl extends DomainResourceImpl implements MessageDefinition {
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
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinition> replaces;

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
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition base;

	/**
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinition> parents;

	/**
	 * The cached value of the '{@link #getEventx() <em>Eventx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventx()
	 * @generated
	 * @ordered
	 */
	protected DataType eventx;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Code category;

	/**
	 * The cached value of the '{@link #getFoci() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinitionFocus> foci;

	/**
	 * The cached value of the '{@link #getResponseRequired() <em>Response Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRequired()
	 * @generated
	 * @ordered
	 */
	protected Code responseRequired;

	/**
	 * The cached value of the '{@link #getAllowedResponses() <em>Allowed Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinitionAllowedResponse> allowedResponses;

	/**
	 * The cached value of the '{@link #getGraphs() <em>Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinition> graphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMessageDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinition> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<MessageDefinition>(MessageDefinition.class, this, ResourcesPackage.MESSAGE_DEFINITION__REPLACES);
		}
		return replaces;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL, oldExperimental, newExperimental);
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
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL, newExperimental, newExperimental));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__DATE, newDate, newDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER, oldPublisher, newPublisher);
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
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.MESSAGE_DEFINITION__CONTACT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT);
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
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__PURPOSE, oldPurpose, newPurpose);
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
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__PURPOSE, newPurpose, newPurpose));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT, oldCopyright, newCopyright);
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
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(MessageDefinition newBase, NotificationChain msgs) {
		MessageDefinition oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(MessageDefinition newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefinition> getParents() {
		if (parents == null) {
			parents = new EObjectContainmentEList<ActivityDefinition>(ActivityDefinition.class, this, ResourcesPackage.MESSAGE_DEFINITION__PARENT);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEventx() {
		return eventx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventx(DataType newEventx, NotificationChain msgs) {
		DataType oldEventx = eventx;
		eventx = newEventx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__EVENTX, oldEventx, newEventx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventx(DataType newEventx) {
		if (newEventx != eventx) {
			NotificationChain msgs = null;
			if (eventx != null)
				msgs = ((InternalEObject)eventx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__EVENTX, null, msgs);
			if (newEventx != null)
				msgs = ((InternalEObject)newEventx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__EVENTX, null, msgs);
			msgs = basicSetEventx(newEventx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__EVENTX, newEventx, newEventx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Code newCategory, NotificationChain msgs) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinitionFocus> getFoci() {
		if (foci == null) {
			foci = new EObjectContainmentEList<MessageDefinitionFocus>(MessageDefinitionFocus.class, this, ResourcesPackage.MESSAGE_DEFINITION__FOCUS);
		}
		return foci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResponseRequired() {
		return responseRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseRequired(Code newResponseRequired, NotificationChain msgs) {
		Code oldResponseRequired = responseRequired;
		responseRequired = newResponseRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED, oldResponseRequired, newResponseRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseRequired(Code newResponseRequired) {
		if (newResponseRequired != responseRequired) {
			NotificationChain msgs = null;
			if (responseRequired != null)
				msgs = ((InternalEObject)responseRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED, null, msgs);
			if (newResponseRequired != null)
				msgs = ((InternalEObject)newResponseRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED, null, msgs);
			msgs = basicSetResponseRequired(newResponseRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED, newResponseRequired, newResponseRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinitionAllowedResponse> getAllowedResponses() {
		if (allowedResponses == null) {
			allowedResponses = new EObjectContainmentEList<MessageDefinitionAllowedResponse>(MessageDefinitionAllowedResponse.class, this, ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE);
		}
		return allowedResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphDefinition> getGraphs() {
		if (graphs == null) {
			graphs = new EObjectContainmentEList<GraphDefinition>(GraphDefinition.class, this, ResourcesPackage.MESSAGE_DEFINITION__GRAPH);
		}
		return graphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MESSAGE_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__PARENT:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__EVENTX:
				return basicSetEventx(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__FOCUS:
				return ((InternalEList<?>)getFoci()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED:
				return basicSetResponseRequired(null, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE:
				return ((InternalEList<?>)getAllowedResponses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_DEFINITION__GRAPH:
				return ((InternalEList<?>)getGraphs()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MESSAGE_DEFINITION__URL:
				return getUrl();
			case ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MESSAGE_DEFINITION__VERSION:
				return getVersion();
			case ResourcesPackage.MESSAGE_DEFINITION__NAME:
				return getName();
			case ResourcesPackage.MESSAGE_DEFINITION__TITLE:
				return getTitle();
			case ResourcesPackage.MESSAGE_DEFINITION__REPLACES:
				return getReplaces();
			case ResourcesPackage.MESSAGE_DEFINITION__STATUS:
				return getStatus();
			case ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.MESSAGE_DEFINITION__DATE:
				return getDate();
			case ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.MESSAGE_DEFINITION__CONTACT:
				return getContacts();
			case ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.MESSAGE_DEFINITION__PURPOSE:
				return getPurpose();
			case ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT:
				return getCopyright();
			case ResourcesPackage.MESSAGE_DEFINITION__BASE:
				return getBase();
			case ResourcesPackage.MESSAGE_DEFINITION__PARENT:
				return getParents();
			case ResourcesPackage.MESSAGE_DEFINITION__EVENTX:
				return getEventx();
			case ResourcesPackage.MESSAGE_DEFINITION__CATEGORY:
				return getCategory();
			case ResourcesPackage.MESSAGE_DEFINITION__FOCUS:
				return getFoci();
			case ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED:
				return getResponseRequired();
			case ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE:
				return getAllowedResponses();
			case ResourcesPackage.MESSAGE_DEFINITION__GRAPH:
				return getGraphs();
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
			case ResourcesPackage.MESSAGE_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends MessageDefinition>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__BASE:
				setBase((MessageDefinition)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends ActivityDefinition>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__EVENTX:
				setEventx((DataType)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__CATEGORY:
				setCategory((Code)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__FOCUS:
				getFoci().clear();
				getFoci().addAll((Collection<? extends MessageDefinitionFocus>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED:
				setResponseRequired((Code)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE:
				getAllowedResponses().clear();
				getAllowedResponses().addAll((Collection<? extends MessageDefinitionAllowedResponse>)newValue);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__GRAPH:
				getGraphs().clear();
				getGraphs().addAll((Collection<? extends GraphDefinition>)newValue);
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
			case ResourcesPackage.MESSAGE_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__REPLACES:
				getReplaces().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL:
				setExperimental((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER:
				setPublisher((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__BASE:
				setBase((MessageDefinition)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__PARENT:
				getParents().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__EVENTX:
				setEventx((DataType)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__CATEGORY:
				setCategory((Code)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__FOCUS:
				getFoci().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED:
				setResponseRequired((Code)null);
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE:
				getAllowedResponses().clear();
				return;
			case ResourcesPackage.MESSAGE_DEFINITION__GRAPH:
				getGraphs().clear();
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
			case ResourcesPackage.MESSAGE_DEFINITION__URL:
				return url != null;
			case ResourcesPackage.MESSAGE_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__VERSION:
				return version != null;
			case ResourcesPackage.MESSAGE_DEFINITION__NAME:
				return name != null;
			case ResourcesPackage.MESSAGE_DEFINITION__TITLE:
				return title != null;
			case ResourcesPackage.MESSAGE_DEFINITION__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__STATUS:
				return status != null;
			case ResourcesPackage.MESSAGE_DEFINITION__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.MESSAGE_DEFINITION__DATE:
				return date != null;
			case ResourcesPackage.MESSAGE_DEFINITION__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.MESSAGE_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.MESSAGE_DEFINITION__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__PURPOSE:
				return purpose != null;
			case ResourcesPackage.MESSAGE_DEFINITION__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.MESSAGE_DEFINITION__BASE:
				return base != null;
			case ResourcesPackage.MESSAGE_DEFINITION__PARENT:
				return parents != null && !parents.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__EVENTX:
				return eventx != null;
			case ResourcesPackage.MESSAGE_DEFINITION__CATEGORY:
				return category != null;
			case ResourcesPackage.MESSAGE_DEFINITION__FOCUS:
				return foci != null && !foci.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__RESPONSE_REQUIRED:
				return responseRequired != null;
			case ResourcesPackage.MESSAGE_DEFINITION__ALLOWED_RESPONSE:
				return allowedResponses != null && !allowedResponses.isEmpty();
			case ResourcesPackage.MESSAGE_DEFINITION__GRAPH:
				return graphs != null && !graphs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageDefinitionImpl
