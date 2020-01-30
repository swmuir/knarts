/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.Task;
import fhiRCore.resources.TaskOutput;
import fhiRCore.resources.TaskParameter;
import fhiRCore.resources.TaskRestriction;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getBusinessStatus <em>Business Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getFor <em>For</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getExecutionPeriod <em>Execution Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getPerformerTypes <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getRelevantHistories <em>Relevant History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TaskImpl#getOutputs <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends DomainResourceImpl implements Task {
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
	 * The cached value of the '{@link #getInstantiatesCanonical() <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonical()
	 * @generated
	 * @ordered
	 */
	protected ActivityDefinition instantiatesCanonical;

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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

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
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getBusinessStatus() <em>Business Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept businessStatus;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected Reference for_;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getExecutionPeriod() <em>Execution Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period executionPeriod;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastModified;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reasonReference;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> insurances;

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
	 * The cached value of the '{@link #getRelevantHistories() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistories;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected TaskRestriction restriction;

	/**
	 * The cached value of the '{@link #getInputs() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskParameter> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.TASK__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition getInstantiatesCanonical() {
		return instantiatesCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatesCanonical(ActivityDefinition newInstantiatesCanonical, NotificationChain msgs) {
		ActivityDefinition oldInstantiatesCanonical = instantiatesCanonical;
		instantiatesCanonical = newInstantiatesCanonical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INSTANTIATES_CANONICAL, oldInstantiatesCanonical, newInstantiatesCanonical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesCanonical(ActivityDefinition newInstantiatesCanonical) {
		if (newInstantiatesCanonical != instantiatesCanonical) {
			NotificationChain msgs = null;
			if (instantiatesCanonical != null)
				msgs = ((InternalEObject)instantiatesCanonical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INSTANTIATES_CANONICAL, null, msgs);
			if (newInstantiatesCanonical != null)
				msgs = ((InternalEObject)newInstantiatesCanonical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INSTANTIATES_CANONICAL, null, msgs);
			msgs = basicSetInstantiatesCanonical(newInstantiatesCanonical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INSTANTIATES_CANONICAL, newInstantiatesCanonical, newInstantiatesCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INSTANTIATES_URI, oldInstantiatesUri, newInstantiatesUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatesUri(Uri newInstantiatesUri) {
		if (newInstantiatesUri != instantiatesUri) {
			NotificationChain msgs = null;
			if (instantiatesUri != null)
				msgs = ((InternalEObject)instantiatesUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INSTANTIATES_URI, null, msgs);
			if (newInstantiatesUri != null)
				msgs = ((InternalEObject)newInstantiatesUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INSTANTIATES_URI, null, msgs);
			msgs = basicSetInstantiatesUri(newInstantiatesUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INSTANTIATES_URI, newInstantiatesUri, newInstantiatesUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TASK__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TASK__PART_OF);
		}
		return partOfs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(CodeableConcept newStatusReason, NotificationChain msgs) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS_REASON, oldStatusReason, newStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBusinessStatus() {
		return businessStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessStatus(CodeableConcept newBusinessStatus, NotificationChain msgs) {
		CodeableConcept oldBusinessStatus = businessStatus;
		businessStatus = newBusinessStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__BUSINESS_STATUS, oldBusinessStatus, newBusinessStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessStatus(CodeableConcept newBusinessStatus) {
		if (newBusinessStatus != businessStatus) {
			NotificationChain msgs = null;
			if (businessStatus != null)
				msgs = ((InternalEObject)businessStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__BUSINESS_STATUS, null, msgs);
			if (newBusinessStatus != null)
				msgs = ((InternalEObject)newBusinessStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__BUSINESS_STATUS, null, msgs);
			msgs = basicSetBusinessStatus(newBusinessStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__BUSINESS_STATUS, newBusinessStatus, newBusinessStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Code newIntent, NotificationChain msgs) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Reference newFocus, NotificationChain msgs) {
		Reference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(Reference newFor, NotificationChain msgs) {
		Reference oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(Reference newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getExecutionPeriod() {
		return executionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionPeriod(Period newExecutionPeriod, NotificationChain msgs) {
		Period oldExecutionPeriod = executionPeriod;
		executionPeriod = newExecutionPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__EXECUTION_PERIOD, oldExecutionPeriod, newExecutionPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionPeriod(Period newExecutionPeriod) {
		if (newExecutionPeriod != executionPeriod) {
			NotificationChain msgs = null;
			if (executionPeriod != null)
				msgs = ((InternalEObject)executionPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__EXECUTION_PERIOD, null, msgs);
			if (newExecutionPeriod != null)
				msgs = ((InternalEObject)newExecutionPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__EXECUTION_PERIOD, null, msgs);
			msgs = basicSetExecutionPeriod(newExecutionPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__EXECUTION_PERIOD, newExecutionPeriod, newExecutionPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastModified(DateTime newLastModified, NotificationChain msgs) {
		DateTime oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__LAST_MODIFIED, oldLastModified, newLastModified);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(DateTime newLastModified) {
		if (newLastModified != lastModified) {
			NotificationChain msgs = null;
			if (lastModified != null)
				msgs = ((InternalEObject)lastModified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__LAST_MODIFIED, null, msgs);
			if (newLastModified != null)
				msgs = ((InternalEObject)newLastModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__LAST_MODIFIED, null, msgs);
			msgs = basicSetLastModified(newLastModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__LAST_MODIFIED, newLastModified, newLastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPerformerTypes() {
		if (performerTypes == null) {
			performerTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.TASK__PERFORMER_TYPE);
		}
		return performerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonCode() {
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonCode(CodeableConcept newReasonCode, NotificationChain msgs) {
		CodeableConcept oldReasonCode = reasonCode;
		reasonCode = newReasonCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REASON_CODE, oldReasonCode, newReasonCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonCode(CodeableConcept newReasonCode) {
		if (newReasonCode != reasonCode) {
			NotificationChain msgs = null;
			if (reasonCode != null)
				msgs = ((InternalEObject)reasonCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REASON_CODE, null, msgs);
			if (newReasonCode != null)
				msgs = ((InternalEObject)newReasonCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REASON_CODE, null, msgs);
			msgs = basicSetReasonCode(newReasonCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REASON_CODE, newReasonCode, newReasonCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReasonReference() {
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonReference(Reference newReasonReference, NotificationChain msgs) {
		Reference oldReasonReference = reasonReference;
		reasonReference = newReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REASON_REFERENCE, oldReasonReference, newReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonReference(Reference newReasonReference) {
		if (newReasonReference != reasonReference) {
			NotificationChain msgs = null;
			if (reasonReference != null)
				msgs = ((InternalEObject)reasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REASON_REFERENCE, null, msgs);
			if (newReasonReference != null)
				msgs = ((InternalEObject)newReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REASON_REFERENCE, null, msgs);
			msgs = basicSetReasonReference(newReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REASON_REFERENCE, newReasonReference, newReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TASK__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.TASK__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRelevantHistories() {
		if (relevantHistories == null) {
			relevantHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.TASK__RELEVANT_HISTORY);
		}
		return relevantHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRestriction getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(TaskRestriction newRestriction, NotificationChain msgs) {
		TaskRestriction oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(TaskRestriction newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskParameter> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<TaskParameter>(TaskParameter.class, this, ResourcesPackage.TASK__INPUT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<TaskOutput>(TaskOutput.class, this, ResourcesPackage.TASK__OUTPUT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TASK__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__INSTANTIATES_CANONICAL:
				return basicSetInstantiatesCanonical(null, msgs);
			case ResourcesPackage.TASK__INSTANTIATES_URI:
				return basicSetInstantiatesUri(null, msgs);
			case ResourcesPackage.TASK__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case ResourcesPackage.TASK__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.TASK__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				return basicSetBusinessStatus(null, msgs);
			case ResourcesPackage.TASK__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.TASK__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.TASK__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.TASK__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TASK__FOCUS:
				return basicSetFocus(null, msgs);
			case ResourcesPackage.TASK__FOR:
				return basicSetFor(null, msgs);
			case ResourcesPackage.TASK__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				return basicSetExecutionPeriod(null, msgs);
			case ResourcesPackage.TASK__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case ResourcesPackage.TASK__LAST_MODIFIED:
				return basicSetLastModified(null, msgs);
			case ResourcesPackage.TASK__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				return ((InternalEList<?>)getPerformerTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__OWNER:
				return basicSetOwner(null, msgs);
			case ResourcesPackage.TASK__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.TASK__REASON_CODE:
				return basicSetReasonCode(null, msgs);
			case ResourcesPackage.TASK__REASON_REFERENCE:
				return basicSetReasonReference(null, msgs);
			case ResourcesPackage.TASK__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case ResourcesPackage.TASK__INPUT:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__OUTPUT:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TASK__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.TASK__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonical();
			case ResourcesPackage.TASK__INSTANTIATES_URI:
				return getInstantiatesUri();
			case ResourcesPackage.TASK__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case ResourcesPackage.TASK__PART_OF:
				return getPartOfs();
			case ResourcesPackage.TASK__STATUS:
				return getStatus();
			case ResourcesPackage.TASK__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				return getBusinessStatus();
			case ResourcesPackage.TASK__INTENT:
				return getIntent();
			case ResourcesPackage.TASK__PRIORITY:
				return getPriority();
			case ResourcesPackage.TASK__CODE:
				return getCode();
			case ResourcesPackage.TASK__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TASK__FOCUS:
				return getFocus();
			case ResourcesPackage.TASK__FOR:
				return getFor();
			case ResourcesPackage.TASK__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				return getExecutionPeriod();
			case ResourcesPackage.TASK__AUTHORED_ON:
				return getAuthoredOn();
			case ResourcesPackage.TASK__LAST_MODIFIED:
				return getLastModified();
			case ResourcesPackage.TASK__REQUESTER:
				return getRequester();
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				return getPerformerTypes();
			case ResourcesPackage.TASK__OWNER:
				return getOwner();
			case ResourcesPackage.TASK__LOCATION:
				return getLocation();
			case ResourcesPackage.TASK__REASON_CODE:
				return getReasonCode();
			case ResourcesPackage.TASK__REASON_REFERENCE:
				return getReasonReference();
			case ResourcesPackage.TASK__INSURANCE:
				return getInsurances();
			case ResourcesPackage.TASK__NOTE:
				return getNotes();
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				return getRelevantHistories();
			case ResourcesPackage.TASK__RESTRICTION:
				return getRestriction();
			case ResourcesPackage.TASK__INPUT:
				return getInputs();
			case ResourcesPackage.TASK__OUTPUT:
				return getOutputs();
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
			case ResourcesPackage.TASK__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.TASK__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((ActivityDefinition)newValue);
				return;
			case ResourcesPackage.TASK__INSTANTIATES_URI:
				setInstantiatesUri((Uri)newValue);
				return;
			case ResourcesPackage.TASK__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.TASK__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.TASK__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.TASK__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				setBusinessStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.TASK__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.TASK__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TASK__FOCUS:
				setFocus((Reference)newValue);
				return;
			case ResourcesPackage.TASK__FOR:
				setFor((Reference)newValue);
				return;
			case ResourcesPackage.TASK__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				setExecutionPeriod((Period)newValue);
				return;
			case ResourcesPackage.TASK__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)newValue);
				return;
			case ResourcesPackage.TASK__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				getPerformerTypes().clear();
				getPerformerTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.TASK__OWNER:
				setOwner((Reference)newValue);
				return;
			case ResourcesPackage.TASK__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.TASK__REASON_CODE:
				setReasonCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__REASON_REFERENCE:
				setReasonReference((Reference)newValue);
				return;
			case ResourcesPackage.TASK__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.TASK__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				getRelevantHistories().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.TASK__RESTRICTION:
				setRestriction((TaskRestriction)newValue);
				return;
			case ResourcesPackage.TASK__INPUT:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TaskParameter>)newValue);
				return;
			case ResourcesPackage.TASK__OUTPUT:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends TaskOutput>)newValue);
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
			case ResourcesPackage.TASK__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.TASK__INSTANTIATES_CANONICAL:
				setInstantiatesCanonical((ActivityDefinition)null);
				return;
			case ResourcesPackage.TASK__INSTANTIATES_URI:
				setInstantiatesUri((Uri)null);
				return;
			case ResourcesPackage.TASK__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case ResourcesPackage.TASK__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.TASK__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.TASK__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				setBusinessStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.TASK__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.TASK__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TASK__FOCUS:
				setFocus((Reference)null);
				return;
			case ResourcesPackage.TASK__FOR:
				setFor((Reference)null);
				return;
			case ResourcesPackage.TASK__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				setExecutionPeriod((Period)null);
				return;
			case ResourcesPackage.TASK__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)null);
				return;
			case ResourcesPackage.TASK__REQUESTER:
				setRequester((Reference)null);
				return;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				getPerformerTypes().clear();
				return;
			case ResourcesPackage.TASK__OWNER:
				setOwner((Reference)null);
				return;
			case ResourcesPackage.TASK__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.TASK__REASON_CODE:
				setReasonCode((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__REASON_REFERENCE:
				setReasonReference((Reference)null);
				return;
			case ResourcesPackage.TASK__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.TASK__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				return;
			case ResourcesPackage.TASK__RESTRICTION:
				setRestriction((TaskRestriction)null);
				return;
			case ResourcesPackage.TASK__INPUT:
				getInputs().clear();
				return;
			case ResourcesPackage.TASK__OUTPUT:
				getOutputs().clear();
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
			case ResourcesPackage.TASK__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.TASK__INSTANTIATES_CANONICAL:
				return instantiatesCanonical != null;
			case ResourcesPackage.TASK__INSTANTIATES_URI:
				return instantiatesUri != null;
			case ResourcesPackage.TASK__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case ResourcesPackage.TASK__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.TASK__STATUS:
				return status != null;
			case ResourcesPackage.TASK__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				return businessStatus != null;
			case ResourcesPackage.TASK__INTENT:
				return intent != null;
			case ResourcesPackage.TASK__PRIORITY:
				return priority != null;
			case ResourcesPackage.TASK__CODE:
				return code != null;
			case ResourcesPackage.TASK__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TASK__FOCUS:
				return focus != null;
			case ResourcesPackage.TASK__FOR:
				return for_ != null;
			case ResourcesPackage.TASK__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				return executionPeriod != null;
			case ResourcesPackage.TASK__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				return lastModified != null;
			case ResourcesPackage.TASK__REQUESTER:
				return requester != null;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				return performerTypes != null && !performerTypes.isEmpty();
			case ResourcesPackage.TASK__OWNER:
				return owner != null;
			case ResourcesPackage.TASK__LOCATION:
				return location != null;
			case ResourcesPackage.TASK__REASON_CODE:
				return reasonCode != null;
			case ResourcesPackage.TASK__REASON_REFERENCE:
				return reasonReference != null;
			case ResourcesPackage.TASK__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.TASK__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
			case ResourcesPackage.TASK__RESTRICTION:
				return restriction != null;
			case ResourcesPackage.TASK__INPUT:
				return inputs != null && !inputs.isEmpty();
			case ResourcesPackage.TASK__OUTPUT:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
