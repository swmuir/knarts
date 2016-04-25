/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskPriority;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getFailureReason <em>Failure Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TaskImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends DomainResourceImpl implements Task {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> performerType;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected TaskPriority priority;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TaskStatus status;

	/**
	 * The cached value of the '{@link #getFailureReason() <em>Failure Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept failureReason;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

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
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Reference creator;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> output;

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
		return FhirPackage.eINSTANCE.getTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPerformerType() {
		if (performerType == null) {
			performerType = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.TASK__PERFORMER_TYPE);
		}
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(TaskPriority newPriority, NotificationChain msgs) {
		TaskPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(TaskPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(TaskStatus newStatus, NotificationChain msgs) {
		TaskStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(TaskStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFailureReason() {
		return failureReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureReason(CodeableConcept newFailureReason, NotificationChain msgs) {
		CodeableConcept oldFailureReason = failureReason;
		failureReason = newFailureReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__FAILURE_REASON, oldFailureReason, newFailureReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureReason(CodeableConcept newFailureReason) {
		if (newFailureReason != failureReason) {
			NotificationChain msgs = null;
			if (failureReason != null)
				msgs = ((InternalEObject)failureReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__FAILURE_REASON, null, msgs);
			if (newFailureReason != null)
				msgs = ((InternalEObject)newFailureReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__FAILURE_REASON, null, msgs);
			msgs = basicSetFailureReason(newFailureReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__FAILURE_REASON, newFailureReason, newFailureReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__FOR, oldFor, newFor);
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
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__LAST_MODIFIED, oldLastModified, newLastModified);
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
				msgs = ((InternalEObject)lastModified).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__LAST_MODIFIED, null, msgs);
			if (newLastModified != null)
				msgs = ((InternalEObject)newLastModified).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__LAST_MODIFIED, null, msgs);
			msgs = basicSetLastModified(newLastModified, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__LAST_MODIFIED, newLastModified, newLastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Reference newCreator, NotificationChain msgs) {
		Reference oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Reference newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__CREATOR, newCreator, newCreator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__OWNER, oldOwner, newOwner);
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
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TASK__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TASK__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<TaskInput>(TaskInput.class, this, FhirPackage.TASK__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<TaskOutput>(TaskOutput.class, this, FhirPackage.TASK__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TASK__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.TASK__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.TASK__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TASK__PERFORMER_TYPE:
				return ((InternalEList<?>)getPerformerType()).basicRemove(otherEnd, msgs);
			case FhirPackage.TASK__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.TASK__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.TASK__FAILURE_REASON:
				return basicSetFailureReason(null, msgs);
			case FhirPackage.TASK__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.TASK__FOR:
				return basicSetFor(null, msgs);
			case FhirPackage.TASK__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.TASK__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.TASK__LAST_MODIFIED:
				return basicSetLastModified(null, msgs);
			case FhirPackage.TASK__CREATOR:
				return basicSetCreator(null, msgs);
			case FhirPackage.TASK__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.TASK__PARENT:
				return basicSetParent(null, msgs);
			case FhirPackage.TASK__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FhirPackage.TASK__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.TASK__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.TASK__TYPE:
				return getType();
			case FhirPackage.TASK__DESCRIPTION:
				return getDescription();
			case FhirPackage.TASK__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.TASK__PRIORITY:
				return getPriority();
			case FhirPackage.TASK__STATUS:
				return getStatus();
			case FhirPackage.TASK__FAILURE_REASON:
				return getFailureReason();
			case FhirPackage.TASK__SUBJECT:
				return getSubject();
			case FhirPackage.TASK__FOR:
				return getFor();
			case FhirPackage.TASK__DEFINITION:
				return getDefinition();
			case FhirPackage.TASK__CREATED:
				return getCreated();
			case FhirPackage.TASK__LAST_MODIFIED:
				return getLastModified();
			case FhirPackage.TASK__CREATOR:
				return getCreator();
			case FhirPackage.TASK__OWNER:
				return getOwner();
			case FhirPackage.TASK__PARENT:
				return getParent();
			case FhirPackage.TASK__INPUT:
				return getInput();
			case FhirPackage.TASK__OUTPUT:
				return getOutput();
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
			case FhirPackage.TASK__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.TASK__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.TASK__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TASK__PERFORMER_TYPE:
				getPerformerType().clear();
				getPerformerType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.TASK__PRIORITY:
				setPriority((TaskPriority)newValue);
				return;
			case FhirPackage.TASK__STATUS:
				setStatus((TaskStatus)newValue);
				return;
			case FhirPackage.TASK__FAILURE_REASON:
				setFailureReason((CodeableConcept)newValue);
				return;
			case FhirPackage.TASK__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.TASK__FOR:
				setFor((Reference)newValue);
				return;
			case FhirPackage.TASK__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case FhirPackage.TASK__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)newValue);
				return;
			case FhirPackage.TASK__CREATOR:
				setCreator((Reference)newValue);
				return;
			case FhirPackage.TASK__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.TASK__PARENT:
				setParent((Reference)newValue);
				return;
			case FhirPackage.TASK__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TaskInput>)newValue);
				return;
			case FhirPackage.TASK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TaskOutput>)newValue);
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
			case FhirPackage.TASK__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.TASK__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.TASK__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TASK__PERFORMER_TYPE:
				getPerformerType().clear();
				return;
			case FhirPackage.TASK__PRIORITY:
				setPriority((TaskPriority)null);
				return;
			case FhirPackage.TASK__STATUS:
				setStatus((TaskStatus)null);
				return;
			case FhirPackage.TASK__FAILURE_REASON:
				setFailureReason((CodeableConcept)null);
				return;
			case FhirPackage.TASK__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.TASK__FOR:
				setFor((Reference)null);
				return;
			case FhirPackage.TASK__DEFINITION:
				setDefinition((Uri)null);
				return;
			case FhirPackage.TASK__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)null);
				return;
			case FhirPackage.TASK__CREATOR:
				setCreator((Reference)null);
				return;
			case FhirPackage.TASK__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.TASK__PARENT:
				setParent((Reference)null);
				return;
			case FhirPackage.TASK__INPUT:
				getInput().clear();
				return;
			case FhirPackage.TASK__OUTPUT:
				getOutput().clear();
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
			case FhirPackage.TASK__IDENTIFIER:
				return identifier != null;
			case FhirPackage.TASK__TYPE:
				return type != null;
			case FhirPackage.TASK__DESCRIPTION:
				return description != null;
			case FhirPackage.TASK__PERFORMER_TYPE:
				return performerType != null && !performerType.isEmpty();
			case FhirPackage.TASK__PRIORITY:
				return priority != null;
			case FhirPackage.TASK__STATUS:
				return status != null;
			case FhirPackage.TASK__FAILURE_REASON:
				return failureReason != null;
			case FhirPackage.TASK__SUBJECT:
				return subject != null;
			case FhirPackage.TASK__FOR:
				return for_ != null;
			case FhirPackage.TASK__DEFINITION:
				return definition != null;
			case FhirPackage.TASK__CREATED:
				return created != null;
			case FhirPackage.TASK__LAST_MODIFIED:
				return lastModified != null;
			case FhirPackage.TASK__CREATOR:
				return creator != null;
			case FhirPackage.TASK__OWNER:
				return owner != null;
			case FhirPackage.TASK__PARENT:
				return parent != null;
			case FhirPackage.TASK__INPUT:
				return input != null && !input.isEmpty();
			case FhirPackage.TASK__OUTPUT:
				return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
