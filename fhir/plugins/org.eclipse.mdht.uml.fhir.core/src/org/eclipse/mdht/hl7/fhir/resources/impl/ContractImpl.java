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
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.Contract;
import org.eclipse.mdht.hl7.fhir.resources.ContractComputableLanguage;
import org.eclipse.mdht.hl7.fhir.resources.ContractContentDefinition;
import org.eclipse.mdht.hl7.fhir.resources.ContractFriendlyLanguage;
import org.eclipse.mdht.hl7.fhir.resources.ContractLegalLanguage;
import org.eclipse.mdht.hl7.fhir.resources.ContractSignatory;
import org.eclipse.mdht.hl7.fhir.resources.ContractTerm;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getLegalState <em>Legal State</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getExpirationType <em>Expiration Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getAuthorities <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getDomains <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSites <em>Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getTopicx <em>Topicx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getContentDefinition <em>Content Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getTerms <em>Term</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getRelevantHistories <em>Relevant History</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getSigners <em>Signer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getFriendlies <em>Friendly</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getLegals <em>Legal</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getRules <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ContractImpl#getLegallyBindingx <em>Legally Bindingx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends DomainResourceImpl implements Contract {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getLegalState() <em>Legal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalState;

	/**
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected Reference instantiatesCanonical;

	/**
	 * The cached value of the '{@link #getInstantiatesUri() <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUri()
	 * @generated
	 * @ordered
	 */
	protected Uri instantiatesUri;

	/**
	 * The cached value of the '{@link #getContentDerivative() <em>Content Derivative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDerivative()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept contentDerivative;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getExpirationType() <em>Expiration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept expirationType;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getAuthorities() <em>Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authorities;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> domains;

	/**
	 * The cached value of the '{@link #getSites() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sites;

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String subtitle;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> alias;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scope;

	/**
	 * The cached value of the '{@link #getTopicx() <em>Topicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicx()
	 * @generated
	 * @ordered
	 */
	protected DataType topicx;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subTypes;

	/**
	 * The cached value of the '{@link #getContentDefinition() <em>Content Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ContractContentDefinition contentDefinition;

	/**
	 * The cached value of the '{@link #getTerms() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> terms;

	/**
	 * The cached value of the '{@link #getSupportingInfos() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfos;

	/**
	 * The cached value of the '{@link #getRelevantHistories() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistories;

	/**
	 * The cached value of the '{@link #getSigners() <em>Signer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigners()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSignatory> signers;

	/**
	 * The cached value of the '{@link #getFriendlies() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendlies()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFriendlyLanguage> friendlies;

	/**
	 * The cached value of the '{@link #getLegals() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegals()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractLegalLanguage> legals;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractComputableLanguage> rules;

	/**
	 * The cached value of the '{@link #getLegallyBindingx() <em>Legally Bindingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegallyBindingx()
	 * @generated
	 * @ordered
	 */
	protected DataType legallyBindingx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContract();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CONTRACT__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__URL, oldUrl, newUrl);
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
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLegalState() {
		return legalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalState(CodeableConcept newLegalState, NotificationChain msgs) {
		CodeableConcept oldLegalState = legalState;
		legalState = newLegalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__LEGAL_STATE, oldLegalState, newLegalState);
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
	public void setLegalState(CodeableConcept newLegalState) {
		if (newLegalState != legalState) {
			NotificationChain msgs = null;
			if (legalState != null)
				msgs = ((InternalEObject)legalState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__LEGAL_STATE, null, msgs);
			if (newLegalState != null)
				msgs = ((InternalEObject)newLegalState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__LEGAL_STATE, null, msgs);
			msgs = basicSetLegalState(newLegalState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__LEGAL_STATE, newLegalState, newLegalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(Reference newInstantiatesCanonical, NotificationChain msgs) {
		Reference oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
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
	public void setInstantiatesCanonical(Reference newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getInstantiatesUri() {
		return instantiatesUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesUri(Uri newInstantiatesUri, NotificationChain msgs) {
		Uri oldInstantiatesUri = instantiatesUri;
		instantiatesUri = newInstantiatesUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
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
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getContentDerivative() {
		return contentDerivative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDerivative(CodeableConcept newContentDerivative, NotificationChain msgs) {
		CodeableConcept oldContentDerivative = contentDerivative;
		contentDerivative = newContentDerivative;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE, oldContentDerivative, newContentDerivative);
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
	public void setContentDerivative(CodeableConcept newContentDerivative) {
		if (newContentDerivative != contentDerivative) {
			NotificationChain msgs = null;
			if (contentDerivative != null)
				msgs = ((InternalEObject)contentDerivative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			if (newContentDerivative != null)
				msgs = ((InternalEObject)newContentDerivative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE, null, msgs);
			msgs = basicSetContentDerivative(newContentDerivative, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE, newContentDerivative, newContentDerivative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__ISSUED, oldIssued, newIssued);
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
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Period newApplies, NotificationChain msgs) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__APPLIES, oldApplies, newApplies);
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
	public void setApplies(Period newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getExpirationType() {
		return expirationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationType(CodeableConcept newExpirationType, NotificationChain msgs) {
		CodeableConcept oldExpirationType = expirationType;
		expirationType = newExpirationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__EXPIRATION_TYPE, oldExpirationType, newExpirationType);
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
	public void setExpirationType(CodeableConcept newExpirationType) {
		if (newExpirationType != expirationType) {
			NotificationChain msgs = null;
			if (expirationType != null)
				msgs = ((InternalEObject)expirationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__EXPIRATION_TYPE, null, msgs);
			if (newExpirationType != null)
				msgs = ((InternalEObject)newExpirationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__EXPIRATION_TYPE, null, msgs);
			msgs = basicSetExpirationType(newExpirationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__EXPIRATION_TYPE, newExpirationType, newExpirationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthorities() {
		if (authorities == null) {
			authorities = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__AUTHORITY);
		}
		return authorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__DOMAIN);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSites() {
		if (sites == null) {
			sites = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__SITE);
		}
		return sites;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubtitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__SUBTITLE, oldSubtitle, newSubtitle);
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
	public void setSubtitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.CONTRACT__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CodeableConcept newScope, NotificationChain msgs) {
		CodeableConcept oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__SCOPE, oldScope, newScope);
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
	public void setScope(CodeableConcept newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getTopicx() {
		return topicx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopicx(DataType newTopicx, NotificationChain msgs) {
		DataType oldTopicx = topicx;
		topicx = newTopicx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TOPICX, oldTopicx, newTopicx);
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
	public void setTopicx(DataType newTopicx) {
		if (newTopicx != topicx) {
			NotificationChain msgs = null;
			if (topicx != null)
				msgs = ((InternalEObject)topicx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TOPICX, null, msgs);
			if (newTopicx != null)
				msgs = ((InternalEObject)newTopicx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TOPICX, null, msgs);
			msgs = basicSetTopicx(newTopicx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TOPICX, newTopicx, newTopicx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT__SUB_TYPE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractContentDefinition getContentDefinition() {
		return contentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentDefinition(ContractContentDefinition newContentDefinition, NotificationChain msgs) {
		ContractContentDefinition oldContentDefinition = contentDefinition;
		contentDefinition = newContentDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__CONTENT_DEFINITION, oldContentDefinition, newContentDefinition);
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
	public void setContentDefinition(ContractContentDefinition newContentDefinition) {
		if (newContentDefinition != contentDefinition) {
			NotificationChain msgs = null;
			if (contentDefinition != null)
				msgs = ((InternalEObject)contentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__CONTENT_DEFINITION, null, msgs);
			if (newContentDefinition != null)
				msgs = ((InternalEObject)newContentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__CONTENT_DEFINITION, null, msgs);
			msgs = basicSetContentDefinition(newContentDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__CONTENT_DEFINITION, newContentDefinition, newContentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, ResourcesPackage.CONTRACT__TERM);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRelevantHistories() {
		if (relevantHistories == null) {
			relevantHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT__RELEVANT_HISTORY);
		}
		return relevantHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractSignatory> getSigners() {
		if (signers == null) {
			signers = new EObjectContainmentEList<ContractSignatory>(ContractSignatory.class, this, ResourcesPackage.CONTRACT__SIGNER);
		}
		return signers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractFriendlyLanguage> getFriendlies() {
		if (friendlies == null) {
			friendlies = new EObjectContainmentEList<ContractFriendlyLanguage>(ContractFriendlyLanguage.class, this, ResourcesPackage.CONTRACT__FRIENDLY);
		}
		return friendlies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractLegalLanguage> getLegals() {
		if (legals == null) {
			legals = new EObjectContainmentEList<ContractLegalLanguage>(ContractLegalLanguage.class, this, ResourcesPackage.CONTRACT__LEGAL);
		}
		return legals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContractComputableLanguage> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<ContractComputableLanguage>(ContractComputableLanguage.class, this, ResourcesPackage.CONTRACT__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getLegallyBindingx() {
		return legallyBindingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegallyBindingx(DataType newLegallyBindingx, NotificationChain msgs) {
		DataType oldLegallyBindingx = legallyBindingx;
		legallyBindingx = newLegallyBindingx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__LEGALLY_BINDINGX, oldLegallyBindingx, newLegallyBindingx);
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
	public void setLegallyBindingx(DataType newLegallyBindingx) {
		if (newLegallyBindingx != legallyBindingx) {
			NotificationChain msgs = null;
			if (legallyBindingx != null)
				msgs = ((InternalEObject)legallyBindingx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__LEGALLY_BINDINGX, null, msgs);
			if (newLegallyBindingx != null)
				msgs = ((InternalEObject)newLegallyBindingx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT__LEGALLY_BINDINGX, null, msgs);
			msgs = basicSetLegallyBindingx(newLegallyBindingx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__LEGALLY_BINDINGX, newLegallyBindingx, newLegallyBindingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.CONTRACT__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.CONTRACT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CONTRACT__LEGAL_STATE:
				return basicSetLegalState(null, msgs);
			case ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case ResourcesPackage.CONTRACT__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE:
				return basicSetContentDerivative(null, msgs);
			case ResourcesPackage.CONTRACT__ISSUED:
				return basicSetIssued(null, msgs);
			case ResourcesPackage.CONTRACT__APPLIES:
				return basicSetApplies(null, msgs);
			case ResourcesPackage.CONTRACT__EXPIRATION_TYPE:
				return basicSetExpirationType(null, msgs);
			case ResourcesPackage.CONTRACT__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__AUTHORITY:
				return ((InternalEList<?>)getAuthorities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__DOMAIN:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__SITE:
				return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.CONTRACT__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.CONTRACT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ResourcesPackage.CONTRACT__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case ResourcesPackage.CONTRACT__SCOPE:
				return basicSetScope(null, msgs);
			case ResourcesPackage.CONTRACT__TOPICX:
				return basicSetTopicx(null, msgs);
			case ResourcesPackage.CONTRACT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__CONTENT_DEFINITION:
				return basicSetContentDefinition(null, msgs);
			case ResourcesPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__SIGNER:
				return ((InternalEList<?>)getSigners()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return ((InternalEList<?>)getFriendlies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__LEGAL:
				return ((InternalEList<?>)getLegals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__LEGALLY_BINDINGX:
				return basicSetLegallyBindingx(null, msgs);
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CONTRACT__URL:
				return getUrl();
			case ResourcesPackage.CONTRACT__VERSION:
				return getVersion();
			case ResourcesPackage.CONTRACT__STATUS:
				return getStatus();
			case ResourcesPackage.CONTRACT__LEGAL_STATE:
				return getLegalState();
			case ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case ResourcesPackage.CONTRACT__INSTANTIATES_URI:
				return getInstantiatesUri();
			case ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE:
				return getContentDerivative();
			case ResourcesPackage.CONTRACT__ISSUED:
				return getIssued();
			case ResourcesPackage.CONTRACT__APPLIES:
				return getApplies();
			case ResourcesPackage.CONTRACT__EXPIRATION_TYPE:
				return getExpirationType();
			case ResourcesPackage.CONTRACT__SUBJECT:
				return getSubjects();
			case ResourcesPackage.CONTRACT__AUTHORITY:
				return getAuthorities();
			case ResourcesPackage.CONTRACT__DOMAIN:
				return getDomains();
			case ResourcesPackage.CONTRACT__SITE:
				return getSites();
			case ResourcesPackage.CONTRACT__NAME:
				return getName();
			case ResourcesPackage.CONTRACT__TITLE:
				return getTitle();
			case ResourcesPackage.CONTRACT__SUBTITLE:
				return getSubtitle();
			case ResourcesPackage.CONTRACT__ALIAS:
				return getAlias();
			case ResourcesPackage.CONTRACT__AUTHOR:
				return getAuthor();
			case ResourcesPackage.CONTRACT__SCOPE:
				return getScope();
			case ResourcesPackage.CONTRACT__TOPICX:
				return getTopicx();
			case ResourcesPackage.CONTRACT__TYPE:
				return getType();
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				return getSubTypes();
			case ResourcesPackage.CONTRACT__CONTENT_DEFINITION:
				return getContentDefinition();
			case ResourcesPackage.CONTRACT__TERM:
				return getTerms();
			case ResourcesPackage.CONTRACT__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.CONTRACT__RELEVANT_HISTORY:
				return getRelevantHistories();
			case ResourcesPackage.CONTRACT__SIGNER:
				return getSigners();
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return getFriendlies();
			case ResourcesPackage.CONTRACT__LEGAL:
				return getLegals();
			case ResourcesPackage.CONTRACT__RULE:
				return getRules();
			case ResourcesPackage.CONTRACT__LEGALLY_BINDINGX:
				return getLegallyBindingx();
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CONTRACT__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.CONTRACT__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CONTRACT__LEGAL_STATE:
				setLegalState((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT__APPLIES:
				setApplies((Period)newValue);
				return;
			case ResourcesPackage.CONTRACT__EXPIRATION_TYPE:
				setExpirationType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__AUTHORITY:
				getAuthorities().clear();
				getAuthorities().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__DOMAIN:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__SITE:
				getSites().clear();
				getSites().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUBTITLE:
				setSubtitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONTRACT__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__TOPICX:
				setTopicx((DataType)newValue);
				return;
			case ResourcesPackage.CONTRACT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT__CONTENT_DEFINITION:
				setContentDefinition((ContractContentDefinition)newValue);
				return;
			case ResourcesPackage.CONTRACT__TERM:
				getTerms().clear();
				getTerms().addAll((Collection<? extends ContractTerm>)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				getRelevantHistories().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT__SIGNER:
				getSigners().clear();
				getSigners().addAll((Collection<? extends ContractSignatory>)newValue);
				return;
			case ResourcesPackage.CONTRACT__FRIENDLY:
				getFriendlies().clear();
				getFriendlies().addAll((Collection<? extends ContractFriendlyLanguage>)newValue);
				return;
			case ResourcesPackage.CONTRACT__LEGAL:
				getLegals().clear();
				getLegals().addAll((Collection<? extends ContractLegalLanguage>)newValue);
				return;
			case ResourcesPackage.CONTRACT__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends ContractComputableLanguage>)newValue);
				return;
			case ResourcesPackage.CONTRACT__LEGALLY_BINDINGX:
				setLegallyBindingx((DataType)newValue);
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CONTRACT__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.CONTRACT__VERSION:
				setVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CONTRACT__LEGAL_STATE:
				setLegalState((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((Reference)null);
				return;
			case ResourcesPackage.CONTRACT__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE:
				setContentDerivative((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__ISSUED:
				setIssued((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT__APPLIES:
				setApplies((Period)null);
				return;
			case ResourcesPackage.CONTRACT__EXPIRATION_TYPE:
				setExpirationType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.CONTRACT__AUTHORITY:
				getAuthorities().clear();
				return;
			case ResourcesPackage.CONTRACT__DOMAIN:
				getDomains().clear();
				return;
			case ResourcesPackage.CONTRACT__SITE:
				getSites().clear();
				return;
			case ResourcesPackage.CONTRACT__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT__SUBTITLE:
				setSubtitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONTRACT__ALIAS:
				getAlias().clear();
				return;
			case ResourcesPackage.CONTRACT__AUTHOR:
				setAuthor((Reference)null);
				return;
			case ResourcesPackage.CONTRACT__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__TOPICX:
				setTopicx((DataType)null);
				return;
			case ResourcesPackage.CONTRACT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				getSubTypes().clear();
				return;
			case ResourcesPackage.CONTRACT__CONTENT_DEFINITION:
				setContentDefinition((ContractContentDefinition)null);
				return;
			case ResourcesPackage.CONTRACT__TERM:
				getTerms().clear();
				return;
			case ResourcesPackage.CONTRACT__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.CONTRACT__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				return;
			case ResourcesPackage.CONTRACT__SIGNER:
				getSigners().clear();
				return;
			case ResourcesPackage.CONTRACT__FRIENDLY:
				getFriendlies().clear();
				return;
			case ResourcesPackage.CONTRACT__LEGAL:
				getLegals().clear();
				return;
			case ResourcesPackage.CONTRACT__RULE:
				getRules().clear();
				return;
			case ResourcesPackage.CONTRACT__LEGALLY_BINDINGX:
				setLegallyBindingx((DataType)null);
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CONTRACT__URL:
				return url != null;
			case ResourcesPackage.CONTRACT__VERSION:
				return version != null;
			case ResourcesPackage.CONTRACT__STATUS:
				return status != null;
			case ResourcesPackage.CONTRACT__LEGAL_STATE:
				return legalState != null;
			case ResourcesPackage.CONTRACT__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case ResourcesPackage.CONTRACT__INSTANTIATES_URI:
				return instantiatesUri != null;
			case ResourcesPackage.CONTRACT__CONTENT_DERIVATIVE:
				return contentDerivative != null;
			case ResourcesPackage.CONTRACT__ISSUED:
				return issued != null;
			case ResourcesPackage.CONTRACT__APPLIES:
				return applies != null;
			case ResourcesPackage.CONTRACT__EXPIRATION_TYPE:
				return expirationType != null;
			case ResourcesPackage.CONTRACT__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.CONTRACT__AUTHORITY:
				return authorities != null && !authorities.isEmpty();
			case ResourcesPackage.CONTRACT__DOMAIN:
				return domains != null && !domains.isEmpty();
			case ResourcesPackage.CONTRACT__SITE:
				return sites != null && !sites.isEmpty();
			case ResourcesPackage.CONTRACT__NAME:
				return name != null;
			case ResourcesPackage.CONTRACT__TITLE:
				return title != null;
			case ResourcesPackage.CONTRACT__SUBTITLE:
				return subtitle != null;
			case ResourcesPackage.CONTRACT__ALIAS:
				return alias != null && !alias.isEmpty();
			case ResourcesPackage.CONTRACT__AUTHOR:
				return author != null;
			case ResourcesPackage.CONTRACT__SCOPE:
				return scope != null;
			case ResourcesPackage.CONTRACT__TOPICX:
				return topicx != null;
			case ResourcesPackage.CONTRACT__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				return subTypes != null && !subTypes.isEmpty();
			case ResourcesPackage.CONTRACT__CONTENT_DEFINITION:
				return contentDefinition != null;
			case ResourcesPackage.CONTRACT__TERM:
				return terms != null && !terms.isEmpty();
			case ResourcesPackage.CONTRACT__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.CONTRACT__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
			case ResourcesPackage.CONTRACT__SIGNER:
				return signers != null && !signers.isEmpty();
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return friendlies != null && !friendlies.isEmpty();
			case ResourcesPackage.CONTRACT__LEGAL:
				return legals != null && !legals.isEmpty();
			case ResourcesPackage.CONTRACT__RULE:
				return rules != null && !rules.isEmpty();
			case ResourcesPackage.CONTRACT__LEGALLY_BINDINGX:
				return legallyBindingx != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
