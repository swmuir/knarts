/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactDetail;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SearchParameter;
import org.eclipse.mdht.hl7.fhir.resources.SearchParameterComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getBases <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getMultipleOr <em>Multiple Or</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getMultipleAnd <em>Multiple And</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getComparators <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getChains <em>Chain</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SearchParameterImpl#getComponents <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchParameterImpl extends DomainResourceImpl implements SearchParameter {
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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected SearchParameter derivedFrom;

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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean experimental;

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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String publisher;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getBases() <em>Base</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> bases;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String expression;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String xpath;

	/**
	 * The cached value of the '{@link #getXpathUsage() <em>Xpath Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathUsage()
	 * @generated
	 * @ordered
	 */
	protected Code xpathUsage;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> targets;

	/**
	 * The cached value of the '{@link #getMultipleOr() <em>Multiple Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOr()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean multipleOr;

	/**
	 * The cached value of the '{@link #getMultipleAnd() <em>Multiple And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleAnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean multipleAnd;

	/**
	 * The cached value of the '{@link #getComparators() <em>Comparator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparators()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> comparators;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> modifiers;

	/**
	 * The cached value of the '{@link #getChains() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> chains;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchParameterComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSearchParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newVersion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameter getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(SearchParameter newDerivedFrom, NotificationChain msgs) {
		SearchParameter oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedFrom(SearchParameter newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimental(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExperimental, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, oldExperimental, newExperimental);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimental(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExperimental) {
		if (newExperimental != experimental) {
			NotificationChain msgs = null;
			if (experimental != null)
				msgs = ((InternalEObject)experimental).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			if (newExperimental != null)
				msgs = ((InternalEObject)newExperimental).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, null, msgs);
			msgs = basicSetExperimental(newExperimental, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, newExperimental, newExperimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.eclipse.mdht.hl7.fhir.dataTypes.String newPublisher, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(org.eclipse.mdht.hl7.fhir.dataTypes.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.SEARCH_PARAMETER__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<UsageContext>(UsageContext.class, this, ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SEARCH_PARAMETER__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(Markdown newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getBases() {
		if (bases == null) {
			bases = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__BASE);
		}
		return bases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String newExpression, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(org.eclipse.mdht.hl7.fhir.dataTypes.String newXpath, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH, oldXpath, newXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXpath(org.eclipse.mdht.hl7.fhir.dataTypes.String newXpath) {
		if (newXpath != xpath) {
			NotificationChain msgs = null;
			if (xpath != null)
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH, newXpath, newXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getXpathUsage() {
		return xpathUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpathUsage(Code newXpathUsage, NotificationChain msgs) {
		Code oldXpathUsage = xpathUsage;
		xpathUsage = newXpathUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, oldXpathUsage, newXpathUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXpathUsage(Code newXpathUsage) {
		if (newXpathUsage != xpathUsage) {
			NotificationChain msgs = null;
			if (xpathUsage != null)
				msgs = ((InternalEObject)xpathUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, null, msgs);
			if (newXpathUsage != null)
				msgs = ((InternalEObject)newXpathUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, null, msgs);
			msgs = basicSetXpathUsage(newXpathUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, newXpathUsage, newXpathUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getMultipleOr() {
		return multipleOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleOr(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleOr, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldMultipleOr = multipleOr;
		multipleOr = newMultipleOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR, oldMultipleOr, newMultipleOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOr(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleOr) {
		if (newMultipleOr != multipleOr) {
			NotificationChain msgs = null;
			if (multipleOr != null)
				msgs = ((InternalEObject)multipleOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			if (newMultipleOr != null)
				msgs = ((InternalEObject)newMultipleOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR, null, msgs);
			msgs = basicSetMultipleOr(newMultipleOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR, newMultipleOr, newMultipleOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getMultipleAnd() {
		return multipleAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleAnd(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleAnd, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldMultipleAnd = multipleAnd;
		multipleAnd = newMultipleAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND, oldMultipleAnd, newMultipleAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleAnd(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMultipleAnd) {
		if (newMultipleAnd != multipleAnd) {
			NotificationChain msgs = null;
			if (multipleAnd != null)
				msgs = ((InternalEObject)multipleAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			if (newMultipleAnd != null)
				msgs = ((InternalEObject)newMultipleAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND, null, msgs);
			msgs = basicSetMultipleAnd(newMultipleAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND, newMultipleAnd, newMultipleAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getComparators() {
		if (comparators == null) {
			comparators = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__COMPARATOR);
		}
		return comparators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getChains() {
		if (chains == null) {
			chains = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.SEARCH_PARAMETER__CHAIN);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SearchParameterComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<SearchParameterComponent>(SearchParameterComponent.class, this, ResourcesPackage.SEARCH_PARAMETER__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return basicSetExperimental(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				return basicSetPurpose(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				return ((InternalEList<?>)getBases()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				return basicSetXpath(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return basicSetXpathUsage(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return basicSetMultipleOr(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return basicSetMultipleAnd(null, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				return ((InternalEList<?>)getComparators()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				return getUrl();
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				return getVersion();
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				return getName();
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return getDerivedFrom();
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				return getStatus();
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return getExperimental();
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				return getDate();
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				return getPublisher();
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				return getContacts();
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				return getPurpose();
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				return getCode();
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				return getBases();
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				return getType();
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				return getExpression();
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				return getXpath();
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return getXpathUsage();
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				return getTargets();
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return getMultipleOr();
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return getMultipleAnd();
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				return getComparators();
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				return getModifiers();
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				return getChains();
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return getComponents();
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((SearchParameter)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				getBases().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				getComparators().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				getChains().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends SearchParameterComponent>)newValue);
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((SearchParameter)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				setMultipleOr((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				setMultipleAnd((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				return url != null;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				return version != null;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				return name != null;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return derivedFrom != null;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				return status != null;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				return date != null;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				return purpose != null;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				return code != null;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				return bases != null && !bases.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				return type != null;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				return expression != null;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				return xpath != null;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return xpathUsage != null;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_OR:
				return multipleOr != null;
			case ResourcesPackage.SEARCH_PARAMETER__MULTIPLE_AND:
				return multipleAnd != null;
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				return comparators != null && !comparators.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				return chains != null && !chains.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchParameterImpl
