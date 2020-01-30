/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CarePlanActivityDetail;
import fhiRCore.resources.PlanDefinition;
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
 * An implementation of the model object '<em><b>Care Plan Activity Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getGoals <em>Goal</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getScheduledx <em>Scheduledx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getProductx <em>Productx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityDetailImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityDetailImpl extends BackboneElementImpl implements CarePlanActivityDetail {
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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinition> instantiatesCanonicals;

	/**
	 * The cached value of the '{@link #getInstantiatesUris() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUris()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUris;

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
	 * The cached value of the '{@link #getGoals() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> goals;

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
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean doNotPerform;

	/**
	 * The cached value of the '{@link #getScheduledx() <em>Scheduledx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledx()
	 * @generated
	 * @ordered
	 */
	protected DataType scheduledx;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performers;

	/**
	 * The cached value of the '{@link #getProductx() <em>Productx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductx()
	 * @generated
	 * @ordered
	 */
	protected DataType productx;

	/**
	 * The cached value of the '{@link #getDailyAmount() <em>Daily Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity dailyAmount;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCarePlanActivityDetail();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND, oldKind, newKind);
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
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<PlanDefinition>(PlanDefinition.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI);
		}
		return instantiatesUris;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL);
		}
		return goals;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, oldStatusReason, newStatusReason);
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
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, newStatusReason, newStatusReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getScheduledx() {
		return scheduledx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledx(DataType newScheduledx, NotificationChain msgs) {
		DataType oldScheduledx = scheduledx;
		scheduledx = newScheduledx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, oldScheduledx, newScheduledx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledx(DataType newScheduledx) {
		if (newScheduledx != scheduledx) {
			NotificationChain msgs = null;
			if (scheduledx != null)
				msgs = ((InternalEObject)scheduledx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, null, msgs);
			if (newScheduledx != null)
				msgs = ((InternalEObject)newScheduledx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, null, msgs);
			msgs = basicSetScheduledx(newScheduledx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, newScheduledx, newScheduledx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProductx() {
		return productx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductx(DataType newProductx, NotificationChain msgs) {
		DataType oldProductx = productx;
		productx = newProductx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, oldProductx, newProductx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductx(DataType newProductx) {
		if (newProductx != productx) {
			NotificationChain msgs = null;
			if (productx != null)
				msgs = ((InternalEObject)productx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, null, msgs);
			if (newProductx != null)
				msgs = ((InternalEObject)newProductx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, null, msgs);
			msgs = basicSetProductx(newProductx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, newProductx, newProductx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDailyAmount() {
		return dailyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDailyAmount(Quantity newDailyAmount, NotificationChain msgs) {
		Quantity oldDailyAmount = dailyAmount;
		dailyAmount = newDailyAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, oldDailyAmount, newDailyAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyAmount(Quantity newDailyAmount) {
		if (newDailyAmount != dailyAmount) {
			NotificationChain msgs = null;
			if (dailyAmount != null)
				msgs = ((InternalEObject)dailyAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, null, msgs);
			if (newDailyAmount != null)
				msgs = ((InternalEObject)newDailyAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, null, msgs);
			msgs = basicSetDailyAmount(newDailyAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, newDailyAmount, newDailyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND:
				return basicSetKind(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				return basicSetScheduledx(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				return basicSetProductx(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				return basicSetDailyAmount(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND:
				return getKind();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				return getCode();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				return getGoals();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				return getStatus();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM:
				return getDoNotPerform();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				return getScheduledx();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				return getLocation();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				return getPerformers();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				return getProductx();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				return getDailyAmount();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				return getQuantity();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				return getDescription();
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND:
				setKind((Code)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends PlanDefinition>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				setScheduledx((DataType)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				setProductx((DataType)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				setDailyAmount((Quantity)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND:
				setKind((Code)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				getGoals().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				setScheduledx((DataType)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				setProductx((DataType)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				setDailyAmount((Quantity)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__KIND:
				return kind != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				return code != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				return goals != null && !goals.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				return status != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DO_NOT_PERFORM:
				return doNotPerform != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				return scheduledx != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				return location != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				return productx != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				return dailyAmount != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityDetailImpl
