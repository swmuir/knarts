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
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

import org.eclipse.mdht.hl7.fhir.resources.Appointment;
import org.eclipse.mdht.hl7.fhir.resources.AppointmentParticipant;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getCancelationReason <em>Cancelation Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getMinutesDuration <em>Minutes Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getSlots <em>Slot</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AppointmentImpl#getRequestedPeriods <em>Requested Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends DomainResourceImpl implements Appointment {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getCancelationReason() <em>Cancelation Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelationReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept cancelationReason;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt priority;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformations;

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
	 * The cached value of the '{@link #getMinutesDuration() <em>Minutes Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesDuration()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt minutesDuration;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> slots;

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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getPatientInstruction() <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String patientInstruction;

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
	 * The cached value of the '{@link #getParticipants() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<AppointmentParticipant> participants;

	/**
	 * The cached value of the '{@link #getRequestedPeriods() <em>Requested Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> requestedPeriods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAppointment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.APPOINTMENT__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCancelationReason() {
		return cancelationReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelationReason(CodeableConcept newCancelationReason, NotificationChain msgs) {
		CodeableConcept oldCancelationReason = cancelationReason;
		cancelationReason = newCancelationReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__CANCELATION_REASON, oldCancelationReason, newCancelationReason);
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
	public void setCancelationReason(CodeableConcept newCancelationReason) {
		if (newCancelationReason != cancelationReason) {
			NotificationChain msgs = null;
			if (cancelationReason != null)
				msgs = ((InternalEObject)cancelationReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__CANCELATION_REASON, null, msgs);
			if (newCancelationReason != null)
				msgs = ((InternalEObject)newCancelationReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__CANCELATION_REASON, null, msgs);
			msgs = basicSetCancelationReason(newCancelationReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__CANCELATION_REASON, newCancelationReason, newCancelationReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceCategories() {
		if (serviceCategories == null) {
			serviceCategories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY);
		}
		return serviceCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.APPOINTMENT__SERVICE_TYPE);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.APPOINTMENT__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE, oldAppointmentType, newAppointmentType);
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
	public void setAppointmentType(CodeableConcept newAppointmentType) {
		if (newAppointmentType != appointmentType) {
			NotificationChain msgs = null;
			if (appointmentType != null)
				msgs = ((InternalEObject)appointmentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			if (newAppointmentType != null)
				msgs = ((InternalEObject)newAppointmentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE, null, msgs);
			msgs = basicSetAppointmentType(newAppointmentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE, newAppointmentType, newAppointmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.APPOINTMENT__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.APPOINTMENT__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(UnsignedInt newPriority, NotificationChain msgs) {
		UnsignedInt oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(UnsignedInt newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__START, oldStart, newStart);
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
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__END, oldEnd, newEnd);
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
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getMinutesDuration() {
		return minutesDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinutesDuration(PositiveInt newMinutesDuration, NotificationChain msgs) {
		PositiveInt oldMinutesDuration = minutesDuration;
		minutesDuration = newMinutesDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__MINUTES_DURATION, oldMinutesDuration, newMinutesDuration);
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
	public void setMinutesDuration(PositiveInt newMinutesDuration) {
		if (newMinutesDuration != minutesDuration) {
			NotificationChain msgs = null;
			if (minutesDuration != null)
				msgs = ((InternalEObject)minutesDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			if (newMinutesDuration != null)
				msgs = ((InternalEObject)newMinutesDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__MINUTES_DURATION, null, msgs);
			msgs = basicSetMinutesDuration(newMinutesDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__MINUTES_DURATION, newMinutesDuration, newMinutesDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.APPOINTMENT__SLOT);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__CREATED, oldCreated, newCreated);
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
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__COMMENT, oldComment, newComment);
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
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPatientInstruction() {
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newPatientInstruction, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPatientInstruction = patientInstruction;
		patientInstruction = newPatientInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION, oldPatientInstruction, newPatientInstruction);
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
	public void setPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newPatientInstruction) {
		if (newPatientInstruction != patientInstruction) {
			NotificationChain msgs = null;
			if (patientInstruction != null)
				msgs = ((InternalEObject)patientInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION, null, msgs);
			if (newPatientInstruction != null)
				msgs = ((InternalEObject)newPatientInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION, null, msgs);
			msgs = basicSetPatientInstruction(newPatientInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION, newPatientInstruction, newPatientInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.APPOINTMENT__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AppointmentParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<AppointmentParticipant>(AppointmentParticipant.class, this, ResourcesPackage.APPOINTMENT__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Period> getRequestedPeriods() {
		if (requestedPeriods == null) {
			requestedPeriods = new EObjectContainmentEList<Period>(Period.class, this, ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD);
		}
		return requestedPeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.APPOINTMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.APPOINTMENT__CANCELATION_REASON:
				return basicSetCancelationReason(null, msgs);
			case ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY:
				return ((InternalEList<?>)getServiceCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return basicSetAppointmentType(null, msgs);
			case ResourcesPackage.APPOINTMENT__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.APPOINTMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.APPOINTMENT__END:
				return basicSetEnd(null, msgs);
			case ResourcesPackage.APPOINTMENT__MINUTES_DURATION:
				return basicSetMinutesDuration(null, msgs);
			case ResourcesPackage.APPOINTMENT__SLOT:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.APPOINTMENT__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return basicSetPatientInstruction(null, msgs);
			case ResourcesPackage.APPOINTMENT__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD:
				return ((InternalEList<?>)getRequestedPeriods()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.APPOINTMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.APPOINTMENT__STATUS:
				return getStatus();
			case ResourcesPackage.APPOINTMENT__CANCELATION_REASON:
				return getCancelationReason();
			case ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY:
				return getServiceCategories();
			case ResourcesPackage.APPOINTMENT__SERVICE_TYPE:
				return getServiceTypes();
			case ResourcesPackage.APPOINTMENT__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return getAppointmentType();
			case ResourcesPackage.APPOINTMENT__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.APPOINTMENT__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.APPOINTMENT__PRIORITY:
				return getPriority();
			case ResourcesPackage.APPOINTMENT__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.APPOINTMENT__START:
				return getStart();
			case ResourcesPackage.APPOINTMENT__END:
				return getEnd();
			case ResourcesPackage.APPOINTMENT__MINUTES_DURATION:
				return getMinutesDuration();
			case ResourcesPackage.APPOINTMENT__SLOT:
				return getSlots();
			case ResourcesPackage.APPOINTMENT__CREATED:
				return getCreated();
			case ResourcesPackage.APPOINTMENT__COMMENT:
				return getComment();
			case ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return getPatientInstruction();
			case ResourcesPackage.APPOINTMENT__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.APPOINTMENT__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD:
				return getRequestedPeriods();
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
			case ResourcesPackage.APPOINTMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__CANCELATION_REASON:
				setCancelationReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY:
				getServiceCategories().clear();
				getServiceCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__START:
				setStart((Instant)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__END:
				setEnd((Instant)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__SLOT:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				setPatientInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends AppointmentParticipant>)newValue);
				return;
			case ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD:
				getRequestedPeriods().clear();
				getRequestedPeriods().addAll((Collection<? extends Period>)newValue);
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
			case ResourcesPackage.APPOINTMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.APPOINTMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.APPOINTMENT__CANCELATION_REASON:
				setCancelationReason((CodeableConcept)null);
				return;
			case ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY:
				getServiceCategories().clear();
				return;
			case ResourcesPackage.APPOINTMENT__SERVICE_TYPE:
				getServiceTypes().clear();
				return;
			case ResourcesPackage.APPOINTMENT__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE:
				setAppointmentType((CodeableConcept)null);
				return;
			case ResourcesPackage.APPOINTMENT__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.APPOINTMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.APPOINTMENT__PRIORITY:
				setPriority((UnsignedInt)null);
				return;
			case ResourcesPackage.APPOINTMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.APPOINTMENT__START:
				setStart((Instant)null);
				return;
			case ResourcesPackage.APPOINTMENT__END:
				setEnd((Instant)null);
				return;
			case ResourcesPackage.APPOINTMENT__MINUTES_DURATION:
				setMinutesDuration((PositiveInt)null);
				return;
			case ResourcesPackage.APPOINTMENT__SLOT:
				getSlots().clear();
				return;
			case ResourcesPackage.APPOINTMENT__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.APPOINTMENT__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				setPatientInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.APPOINTMENT__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.APPOINTMENT__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD:
				getRequestedPeriods().clear();
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
			case ResourcesPackage.APPOINTMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.APPOINTMENT__STATUS:
				return status != null;
			case ResourcesPackage.APPOINTMENT__CANCELATION_REASON:
				return cancelationReason != null;
			case ResourcesPackage.APPOINTMENT__SERVICE_CATEGORY:
				return serviceCategories != null && !serviceCategories.isEmpty();
			case ResourcesPackage.APPOINTMENT__SERVICE_TYPE:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ResourcesPackage.APPOINTMENT__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.APPOINTMENT__APPOINTMENT_TYPE:
				return appointmentType != null;
			case ResourcesPackage.APPOINTMENT__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.APPOINTMENT__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.APPOINTMENT__PRIORITY:
				return priority != null;
			case ResourcesPackage.APPOINTMENT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.APPOINTMENT__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.APPOINTMENT__START:
				return start != null;
			case ResourcesPackage.APPOINTMENT__END:
				return end != null;
			case ResourcesPackage.APPOINTMENT__MINUTES_DURATION:
				return minutesDuration != null;
			case ResourcesPackage.APPOINTMENT__SLOT:
				return slots != null && !slots.isEmpty();
			case ResourcesPackage.APPOINTMENT__CREATED:
				return created != null;
			case ResourcesPackage.APPOINTMENT__COMMENT:
				return comment != null;
			case ResourcesPackage.APPOINTMENT__PATIENT_INSTRUCTION:
				return patientInstruction != null;
			case ResourcesPackage.APPOINTMENT__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.APPOINTMENT__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.APPOINTMENT__REQUESTED_PERIOD:
				return requestedPeriods != null && !requestedPeriods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppointmentImpl
