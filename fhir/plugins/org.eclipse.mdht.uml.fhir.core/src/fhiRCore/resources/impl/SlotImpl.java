/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.Slot;

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
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SlotImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends DomainResourceImpl implements Slot {
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
	 * The cached value of the '{@link #getServiceCategories() <em>Service Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceCategories;

	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceTypes;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept appointmentType;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Reference schedule;

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
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getOverbooked() <em>Overbooked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverbooked()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean overbooked;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SLOT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceCategories() {
		if (serviceCategories == null) {
			serviceCategories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SLOT__SERVICE_CATEGORY);
		}
		return serviceCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SLOT__SERVICE_TYPE);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SLOT__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAppointmentType() {
		return appointmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentType(CodeableConcept newAppointmentType, NotificationChain msgs) {
		CodeableConcept oldAppointmentType = appointmentType;
		appointmentType = newAppointmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__APPOINTMENT_TYPE, oldAppointmentType, newAppointmentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentType(CodeableConcept newAppointmentType) {
		if (newAppointmentType != appointmentType) {
			NotificationChain msgs = null;
			if (appointmentType != null)
				msgs = ((InternalEObject)appointmentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__APPOINTMENT_TYPE, null, msgs);
			if (newAppointmentType != null)
				msgs = ((InternalEObject)newAppointmentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__APPOINTMENT_TYPE, null, msgs);
			msgs = basicSetAppointmentType(newAppointmentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__APPOINTMENT_TYPE, newAppointmentType, newAppointmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Reference newSchedule, NotificationChain msgs) {
		Reference oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Reference newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__SCHEDULE, newSchedule, newSchedule));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getOverbooked() {
		return overbooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverbooked(fhiRCore.dataTypes.Boolean newOverbooked, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldOverbooked = overbooked;
		overbooked = newOverbooked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__OVERBOOKED, oldOverbooked, newOverbooked);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverbooked(fhiRCore.dataTypes.Boolean newOverbooked) {
		if (newOverbooked != overbooked) {
			NotificationChain msgs = null;
			if (overbooked != null)
				msgs = ((InternalEObject)overbooked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__OVERBOOKED, null, msgs);
			if (newOverbooked != null)
				msgs = ((InternalEObject)newOverbooked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__OVERBOOKED, null, msgs);
			msgs = basicSetOverbooked(newOverbooked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__OVERBOOKED, newOverbooked, newOverbooked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(fhiRCore.dataTypes.String newComment, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(fhiRCore.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SLOT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SLOT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SLOT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SLOT__SERVICE_CATEGORY:
				return ((InternalEList<?>)getServiceCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SLOT__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SLOT__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SLOT__APPOINTMENT_TYPE:
				return basicSetAppointmentType(null, msgs);
			case ResourcesPackage.SLOT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case ResourcesPackage.SLOT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SLOT__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.SLOT__END:
				return basicSetEnd(null, msgs);
			case ResourcesPackage.SLOT__OVERBOOKED:
				return basicSetOverbooked(null, msgs);
			case ResourcesPackage.SLOT__COMMENT:
				return basicSetComment(null, msgs);
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
			case ResourcesPackage.SLOT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SLOT__SERVICE_CATEGORY:
				return getServiceCategories();
			case ResourcesPackage.SLOT__SERVICE_TYPE:
				return getServiceTypes();
			case ResourcesPackage.SLOT__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.SLOT__APPOINTMENT_TYPE:
				return getAppointmentType();
			case ResourcesPackage.SLOT__SCHEDULE:
				return getSchedule();
			case ResourcesPackage.SLOT__STATUS:
				return getStatus();
			case ResourcesPackage.SLOT__START:
				return getStart();
			case ResourcesPackage.SLOT__END:
				return getEnd();
			case ResourcesPackage.SLOT__OVERBOOKED:
				return getOverbooked();
			case ResourcesPackage.SLOT__COMMENT:
				return getComment();
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
			case ResourcesPackage.SLOT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SLOT__SERVICE_CATEGORY:
				getServiceCategories().clear();
				getServiceCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SLOT__SERVICE_TYPE:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SLOT__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SLOT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SLOT__SCHEDULE:
				setSchedule((Reference)newValue);
				return;
			case ResourcesPackage.SLOT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SLOT__START:
				setStart((Instant)newValue);
				return;
			case ResourcesPackage.SLOT__END:
				setEnd((Instant)newValue);
				return;
			case ResourcesPackage.SLOT__OVERBOOKED:
				setOverbooked((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SLOT__COMMENT:
				setComment((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.SLOT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SLOT__SERVICE_CATEGORY:
				getServiceCategories().clear();
				return;
			case ResourcesPackage.SLOT__SERVICE_TYPE:
				getServiceTypes().clear();
				return;
			case ResourcesPackage.SLOT__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.SLOT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)null);
				return;
			case ResourcesPackage.SLOT__SCHEDULE:
				setSchedule((Reference)null);
				return;
			case ResourcesPackage.SLOT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SLOT__START:
				setStart((Instant)null);
				return;
			case ResourcesPackage.SLOT__END:
				setEnd((Instant)null);
				return;
			case ResourcesPackage.SLOT__OVERBOOKED:
				setOverbooked((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SLOT__COMMENT:
				setComment((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.SLOT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SLOT__SERVICE_CATEGORY:
				return serviceCategories != null && !serviceCategories.isEmpty();
			case ResourcesPackage.SLOT__SERVICE_TYPE:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ResourcesPackage.SLOT__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.SLOT__APPOINTMENT_TYPE:
				return appointmentType != null;
			case ResourcesPackage.SLOT__SCHEDULE:
				return schedule != null;
			case ResourcesPackage.SLOT__STATUS:
				return status != null;
			case ResourcesPackage.SLOT__START:
				return start != null;
			case ResourcesPackage.SLOT__END:
				return end != null;
			case ResourcesPackage.SLOT__OVERBOOKED:
				return overbooked != null;
			case ResourcesPackage.SLOT__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
