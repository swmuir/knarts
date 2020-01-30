/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Goal;
import fhiRCore.resources.GoalTarget;
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
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getAchievementStatus <em>Achievement Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getStartx <em>Startx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getExpressedBy <em>Expressed By</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getOutcomeCodes <em>Outcome Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GoalImpl#getOutcomeReferences <em>Outcome Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends DomainResourceImpl implements Goal {
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
	 * The cached value of the '{@link #getLifecycleStatus() <em>Lifecycle Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleStatus()
	 * @generated
	 * @ordered
	 */
	protected Code lifecycleStatus;

	/**
	 * The cached value of the '{@link #getAchievementStatus() <em>Achievement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievementStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept achievementStatus;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept description;

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
	 * The cached value of the '{@link #getStartx() <em>Startx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected DataType startx;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTarget> targets;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

	/**
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String statusReason;

	/**
	 * The cached value of the '{@link #getExpressedBy() <em>Expressed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference expressedBy;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> addresses;

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
	 * The cached value of the '{@link #getOutcomeCodes() <em>Outcome Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> outcomeCodes;

	/**
	 * The cached value of the '{@link #getOutcomeReferences() <em>Outcome Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> outcomeReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGoal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.GOAL__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLifecycleStatus() {
		return lifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycleStatus(Code newLifecycleStatus, NotificationChain msgs) {
		Code oldLifecycleStatus = lifecycleStatus;
		lifecycleStatus = newLifecycleStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__LIFECYCLE_STATUS, oldLifecycleStatus, newLifecycleStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleStatus(Code newLifecycleStatus) {
		if (newLifecycleStatus != lifecycleStatus) {
			NotificationChain msgs = null;
			if (lifecycleStatus != null)
				msgs = ((InternalEObject)lifecycleStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__LIFECYCLE_STATUS, null, msgs);
			if (newLifecycleStatus != null)
				msgs = ((InternalEObject)newLifecycleStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__LIFECYCLE_STATUS, null, msgs);
			msgs = basicSetLifecycleStatus(newLifecycleStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__LIFECYCLE_STATUS, newLifecycleStatus, newLifecycleStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAchievementStatus() {
		return achievementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAchievementStatus(CodeableConcept newAchievementStatus, NotificationChain msgs) {
		CodeableConcept oldAchievementStatus = achievementStatus;
		achievementStatus = newAchievementStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__ACHIEVEMENT_STATUS, oldAchievementStatus, newAchievementStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAchievementStatus(CodeableConcept newAchievementStatus) {
		if (newAchievementStatus != achievementStatus) {
			NotificationChain msgs = null;
			if (achievementStatus != null)
				msgs = ((InternalEObject)achievementStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__ACHIEVEMENT_STATUS, null, msgs);
			if (newAchievementStatus != null)
				msgs = ((InternalEObject)newAchievementStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__ACHIEVEMENT_STATUS, null, msgs);
			msgs = basicSetAchievementStatus(newAchievementStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__ACHIEVEMENT_STATUS, newAchievementStatus, newAchievementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.GOAL__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CodeableConcept newDescription, NotificationChain msgs) {
		CodeableConcept oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(CodeableConcept newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getStartx() {
		return startx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartx(DataType newStartx, NotificationChain msgs) {
		DataType oldStartx = startx;
		startx = newStartx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STARTX, oldStartx, newStartx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartx(DataType newStartx) {
		if (newStartx != startx) {
			NotificationChain msgs = null;
			if (startx != null)
				msgs = ((InternalEObject)startx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STARTX, null, msgs);
			if (newStartx != null)
				msgs = ((InternalEObject)newStartx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STARTX, null, msgs);
			msgs = basicSetStartx(newStartx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STARTX, newStartx, newStartx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<GoalTarget>(GoalTarget.class, this, ResourcesPackage.GOAL__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(Date newStatusDate, NotificationChain msgs) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReason(fhiRCore.dataTypes.String newStatusReason, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS_REASON, oldStatusReason, newStatusReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(fhiRCore.dataTypes.String newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getExpressedBy() {
		return expressedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressedBy(Reference newExpressedBy, NotificationChain msgs) {
		Reference oldExpressedBy = expressedBy;
		expressedBy = newExpressedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__EXPRESSED_BY, oldExpressedBy, newExpressedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressedBy(Reference newExpressedBy) {
		if (newExpressedBy != expressedBy) {
			NotificationChain msgs = null;
			if (expressedBy != null)
				msgs = ((InternalEObject)expressedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__EXPRESSED_BY, null, msgs);
			if (newExpressedBy != null)
				msgs = ((InternalEObject)newExpressedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GOAL__EXPRESSED_BY, null, msgs);
			msgs = basicSetExpressedBy(newExpressedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__EXPRESSED_BY, newExpressedBy, newExpressedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.GOAL__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.GOAL__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getOutcomeCodes() {
		if (outcomeCodes == null) {
			outcomeCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.GOAL__OUTCOME_CODE);
		}
		return outcomeCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getOutcomeReferences() {
		if (outcomeReferences == null) {
			outcomeReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.GOAL__OUTCOME_REFERENCE);
		}
		return outcomeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GOAL__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__LIFECYCLE_STATUS:
				return basicSetLifecycleStatus(null, msgs);
			case ResourcesPackage.GOAL__ACHIEVEMENT_STATUS:
				return basicSetAchievementStatus(null, msgs);
			case ResourcesPackage.GOAL__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.GOAL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.GOAL__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.GOAL__STARTX:
				return basicSetStartx(null, msgs);
			case ResourcesPackage.GOAL__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case ResourcesPackage.GOAL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				return basicSetExpressedBy(null, msgs);
			case ResourcesPackage.GOAL__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__OUTCOME_CODE:
				return ((InternalEList<?>)getOutcomeCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.GOAL__OUTCOME_REFERENCE:
				return ((InternalEList<?>)getOutcomeReferences()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.GOAL__LIFECYCLE_STATUS:
				return getLifecycleStatus();
			case ResourcesPackage.GOAL__ACHIEVEMENT_STATUS:
				return getAchievementStatus();
			case ResourcesPackage.GOAL__CATEGORY:
				return getCategories();
			case ResourcesPackage.GOAL__PRIORITY:
				return getPriority();
			case ResourcesPackage.GOAL__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.GOAL__SUBJECT:
				return getSubject();
			case ResourcesPackage.GOAL__STARTX:
				return getStartx();
			case ResourcesPackage.GOAL__TARGET:
				return getTargets();
			case ResourcesPackage.GOAL__STATUS_DATE:
				return getStatusDate();
			case ResourcesPackage.GOAL__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				return getExpressedBy();
			case ResourcesPackage.GOAL__ADDRESSES:
				return getAddresses();
			case ResourcesPackage.GOAL__NOTE:
				return getNotes();
			case ResourcesPackage.GOAL__OUTCOME_CODE:
				return getOutcomeCodes();
			case ResourcesPackage.GOAL__OUTCOME_REFERENCE:
				return getOutcomeReferences();
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.GOAL__LIFECYCLE_STATUS:
				setLifecycleStatus((Code)newValue);
				return;
			case ResourcesPackage.GOAL__ACHIEVEMENT_STATUS:
				setAchievementStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.GOAL__STARTX:
				setStartx((DataType)newValue);
				return;
			case ResourcesPackage.GOAL__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends GoalTarget>)newValue);
				return;
			case ResourcesPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case ResourcesPackage.GOAL__STATUS_REASON:
				setStatusReason((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				setExpressedBy((Reference)newValue);
				return;
			case ResourcesPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.GOAL__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.GOAL__OUTCOME_CODE:
				getOutcomeCodes().clear();
				getOutcomeCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.GOAL__OUTCOME_REFERENCE:
				getOutcomeReferences().clear();
				getOutcomeReferences().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.GOAL__LIFECYCLE_STATUS:
				setLifecycleStatus((Code)null);
				return;
			case ResourcesPackage.GOAL__ACHIEVEMENT_STATUS:
				setAchievementStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.GOAL__STARTX:
				setStartx((DataType)null);
				return;
			case ResourcesPackage.GOAL__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)null);
				return;
			case ResourcesPackage.GOAL__STATUS_REASON:
				setStatusReason((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				setExpressedBy((Reference)null);
				return;
			case ResourcesPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				return;
			case ResourcesPackage.GOAL__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.GOAL__OUTCOME_CODE:
				getOutcomeCodes().clear();
				return;
			case ResourcesPackage.GOAL__OUTCOME_REFERENCE:
				getOutcomeReferences().clear();
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.GOAL__LIFECYCLE_STATUS:
				return lifecycleStatus != null;
			case ResourcesPackage.GOAL__ACHIEVEMENT_STATUS:
				return achievementStatus != null;
			case ResourcesPackage.GOAL__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.GOAL__PRIORITY:
				return priority != null;
			case ResourcesPackage.GOAL__DESCRIPTION:
				return description != null;
			case ResourcesPackage.GOAL__SUBJECT:
				return subject != null;
			case ResourcesPackage.GOAL__STARTX:
				return startx != null;
			case ResourcesPackage.GOAL__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.GOAL__STATUS_DATE:
				return statusDate != null;
			case ResourcesPackage.GOAL__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				return expressedBy != null;
			case ResourcesPackage.GOAL__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.GOAL__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.GOAL__OUTCOME_CODE:
				return outcomeCodes != null && !outcomeCodes.isEmpty();
			case ResourcesPackage.GOAL__OUTCOME_REFERENCE:
				return outcomeReferences != null && !outcomeReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
