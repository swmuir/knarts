/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTermAction;
import fhiRCore.resources.ContractTermActionActionSubject;
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
 * An implementation of the model object '<em><b>Contract Term Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getContextLinkIds <em>Context Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getRequesters <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getRequesterLinkIds <em>Requester Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getPerformerTypes <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getPerformerRole <em>Performer Role</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getPerformerLinkIds <em>Performer Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getReasonLinkIds <em>Reason Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermActionImpl#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermActionImpl extends BackboneElementImpl implements ContractTermAction {
	/**
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean doNotPerform;

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
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTermActionActionSubject> subjects;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intent;

	/**
	 * The cached value of the '{@link #getLinkIds() <em>Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> linkIds;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getContextLinkIds() <em>Context Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> contextLinkIds;

	/**
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getRequesters() <em>Requester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> requesters;

	/**
	 * The cached value of the '{@link #getRequesterLinkIds() <em>Requester Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> requesterLinkIds;

	/**
	 * The cached value of the '{@link #getPerformerTypes() <em>Performer Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> performerTypes;

	/**
	 * The cached value of the '{@link #getPerformerRole() <em>Performer Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerRole;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getPerformerLinkIds() <em>Performer Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> performerLinkIds;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> reasons;

	/**
	 * The cached value of the '{@link #getReasonLinkIds() <em>Reason Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> reasonLinkIds;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getSecurityLabelNumbers() <em>Security Label Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> securityLabelNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(fhiRCore.dataTypes.Boolean newDoNotPerform, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoNotPerform(fhiRCore.dataTypes.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTermActionActionSubject> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<ContractTermActionActionSubject>(ContractTermActionActionSubject.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(CodeableConcept newIntent, NotificationChain msgs) {
		CodeableConcept oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(CodeableConcept newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getLinkIds() {
		if (linkIds == null) {
			linkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID);
		}
		return linkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getContextLinkIds() {
		if (contextLinkIds == null) {
			contextLinkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID);
		}
		return contextLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRequesters() {
		if (requesters == null) {
			requesters = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER);
		}
		return requesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getRequesterLinkIds() {
		if (requesterLinkIds == null) {
			requesterLinkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID);
		}
		return requesterLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPerformerTypes() {
		if (performerTypes == null) {
			performerTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE);
		}
		return performerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerRole() {
		return performerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerRole(CodeableConcept newPerformerRole, NotificationChain msgs) {
		CodeableConcept oldPerformerRole = performerRole;
		performerRole = newPerformerRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE, oldPerformerRole, newPerformerRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerRole(CodeableConcept newPerformerRole) {
		if (newPerformerRole != performerRole) {
			NotificationChain msgs = null;
			if (performerRole != null)
				msgs = ((InternalEObject)performerRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE, null, msgs);
			if (newPerformerRole != null)
				msgs = ((InternalEObject)newPerformerRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE, null, msgs);
			msgs = basicSetPerformerRole(newPerformerRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE, newPerformerRole, newPerformerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getPerformerLinkIds() {
		if (performerLinkIds == null) {
			performerLinkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID);
		}
		return performerLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getReasons() {
		if (reasons == null) {
			reasons = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getReasonLinkIds() {
		if (reasonLinkIds == null) {
			reasonLinkIds = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID);
		}
		return reasonLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getSecurityLabelNumbers() {
		if (securityLabelNumbers == null) {
			securityLabelNumbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER);
		}
		return securityLabelNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID:
				return ((InternalEList<?>)getLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID:
				return ((InternalEList<?>)getContextLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER:
				return ((InternalEList<?>)getRequesters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID:
				return ((InternalEList<?>)getRequesterLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE:
				return ((InternalEList<?>)getPerformerTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE:
				return basicSetPerformerRole(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID:
				return ((InternalEList<?>)getPerformerLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON:
				return ((InternalEList<?>)getReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID:
				return ((InternalEList<?>)getReasonLinkIds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER:
				return ((InternalEList<?>)getSecurityLabelNumbers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM:
				return getDoNotPerform();
			case ResourcesPackage.CONTRACT_TERM_ACTION__TYPE:
				return getType();
			case ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT:
				return getSubjects();
			case ResourcesPackage.CONTRACT_TERM_ACTION__INTENT:
				return getIntent();
			case ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID:
				return getLinkIds();
			case ResourcesPackage.CONTRACT_TERM_ACTION__STATUS:
				return getStatus();
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT:
				return getContext();
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID:
				return getContextLinkIds();
			case ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER:
				return getRequesters();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID:
				return getRequesterLinkIds();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE:
				return getPerformerTypes();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE:
				return getPerformerRole();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER:
				return getPerformer();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID:
				return getPerformerLinkIds();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON:
				return getReasons();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID:
				return getReasonLinkIds();
			case ResourcesPackage.CONTRACT_TERM_ACTION__NOTE:
				return getNotes();
			case ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER:
				return getSecurityLabelNumbers();
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
			case ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends ContractTermActionActionSubject>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__INTENT:
				setIntent((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID:
				getLinkIds().clear();
				getLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT:
				setContext((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID:
				getContextLinkIds().clear();
				getContextLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER:
				getRequesters().clear();
				getRequesters().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID:
				getRequesterLinkIds().clear();
				getRequesterLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE:
				getPerformerTypes().clear();
				getPerformerTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE:
				setPerformerRole((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID:
				getPerformerLinkIds().clear();
				getPerformerLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID:
				getReasonLinkIds().clear();
				getReasonLinkIds().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
				getSecurityLabelNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__INTENT:
				setIntent((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID:
				getLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT:
				setContext((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID:
				getContextLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER:
				getRequesters().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID:
				getRequesterLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE:
				getPerformerTypes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE:
				setPerformerRole((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID:
				getPerformerLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID:
				getReasonLinkIds().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER:
				getSecurityLabelNumbers().clear();
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
			case ResourcesPackage.CONTRACT_TERM_ACTION__DO_NOT_PERFORM:
				return doNotPerform != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__INTENT:
				return intent != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__LINK_ID:
				return linkIds != null && !linkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__STATUS:
				return status != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT:
				return context != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__CONTEXT_LINK_ID:
				return contextLinkIds != null && !contextLinkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER:
				return requesters != null && !requesters.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REQUESTER_LINK_ID:
				return requesterLinkIds != null && !requesterLinkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_TYPE:
				return performerTypes != null && !performerTypes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_ROLE:
				return performerRole != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER:
				return performer != null;
			case ResourcesPackage.CONTRACT_TERM_ACTION__PERFORMER_LINK_ID:
				return performerLinkIds != null && !performerLinkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__REASON_LINK_ID:
				return reasonLinkIds != null && !reasonLinkIds.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_ACTION__SECURITY_LABEL_NUMBER:
				return securityLabelNumbers != null && !securityLabelNumbers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermActionImpl
