/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Encounter;
import fhiRCore.resources.EncounterClassHistory;
import fhiRCore.resources.EncounterDiagnosis;
import fhiRCore.resources.EncounterHospitalization;
import fhiRCore.resources.EncounterLocation;
import fhiRCore.resources.EncounterParticipant;
import fhiRCore.resources.EncounterStatusHistory;
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
 * An implementation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getClassHistories <em>Class History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getEpisodeOfCares <em>Episode Of Care</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getParticipants <em>Participant</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getAppointments <em>Appointment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getAccounts <em>Account</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EncounterImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterImpl extends DomainResourceImpl implements Encounter {
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
	 * The cached value of the '{@link #getStatusHistories() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterStatusHistory> statusHistories;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Coding class_;

	/**
	 * The cached value of the '{@link #getClassHistories() <em>Class History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterClassHistory> classHistories;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceType;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEpisodeOfCares() <em>Episode Of Care</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCares()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> episodeOfCares;

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
	protected EList<EncounterParticipant> participants;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> appointments;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Duration length;

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
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> accounts;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected EncounterHospitalization hospitalization;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterLocation> locations;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference serviceProvider;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEncounter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ENCOUNTER__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterStatusHistory> getStatusHistories() {
		if (statusHistories == null) {
			statusHistories = new EObjectContainmentEList<EncounterStatusHistory>(EncounterStatusHistory.class, this, ResourcesPackage.ENCOUNTER__STATUS_HISTORY);
		}
		return statusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_(Coding newClass, NotificationChain msgs) {
		Coding oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(Coding newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__CLASS, null, msgs);
			msgs = basicSetClass_(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterClassHistory> getClassHistories() {
		if (classHistories == null) {
			classHistories = new EObjectContainmentEList<EncounterClassHistory>(EncounterClassHistory.class, this, ResourcesPackage.ENCOUNTER__CLASS_HISTORY);
		}
		return classHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ENCOUNTER__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceType(CodeableConcept newServiceType, NotificationChain msgs) {
		CodeableConcept oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SERVICE_TYPE, oldServiceType, newServiceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(CodeableConcept newServiceType) {
		if (newServiceType != serviceType) {
			NotificationChain msgs = null;
			if (serviceType != null)
				msgs = ((InternalEObject)serviceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SERVICE_TYPE, null, msgs);
			if (newServiceType != null)
				msgs = ((InternalEObject)newServiceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SERVICE_TYPE, null, msgs);
			msgs = basicSetServiceType(newServiceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SERVICE_TYPE, newServiceType, newServiceType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEpisodeOfCares() {
		if (episodeOfCares == null) {
			episodeOfCares = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE);
		}
		return episodeOfCares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ENCOUNTER__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterParticipant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<EncounterParticipant>(EncounterParticipant.class, this, ResourcesPackage.ENCOUNTER__PARTICIPANT);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ENCOUNTER__APPOINTMENT);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(Duration newLength, NotificationChain msgs) {
		Duration oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Duration newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ENCOUNTER__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ENCOUNTER__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<EncounterDiagnosis>(EncounterDiagnosis.class, this, ResourcesPackage.ENCOUNTER__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ENCOUNTER__ACCOUNT);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(EncounterHospitalization newHospitalization, NotificationChain msgs) {
		EncounterHospitalization oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__HOSPITALIZATION, oldHospitalization, newHospitalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(EncounterHospitalization newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<EncounterLocation>(EncounterLocation.class, this, ResourcesPackage.ENCOUNTER__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProvider(Reference newServiceProvider, NotificationChain msgs) {
		Reference oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER, oldServiceProvider, newServiceProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProvider(Reference newServiceProvider) {
		if (newServiceProvider != serviceProvider) {
			NotificationChain msgs = null;
			if (serviceProvider != null)
				msgs = ((InternalEObject)serviceProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			if (newServiceProvider != null)
				msgs = ((InternalEObject)newServiceProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER, null, msgs);
			msgs = basicSetServiceProvider(newServiceProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER, newServiceProvider, newServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PART_OF, oldPartOf, newPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ENCOUNTER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.ENCOUNTER__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__CLASS:
				return basicSetClass_(null, msgs);
			case ResourcesPackage.ENCOUNTER__CLASS_HISTORY:
				return ((InternalEList<?>)getClassHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__SERVICE_TYPE:
				return basicSetServiceType(null, msgs);
			case ResourcesPackage.ENCOUNTER__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.ENCOUNTER__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE:
				return ((InternalEList<?>)getEpisodeOfCares()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__PARTICIPANT:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__APPOINTMENT:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.ENCOUNTER__LENGTH:
				return basicSetLength(null, msgs);
			case ResourcesPackage.ENCOUNTER__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__ACCOUNT:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case ResourcesPackage.ENCOUNTER__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER:
				return basicSetServiceProvider(null, msgs);
			case ResourcesPackage.ENCOUNTER__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case ResourcesPackage.ENCOUNTER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ENCOUNTER__STATUS:
				return getStatus();
			case ResourcesPackage.ENCOUNTER__STATUS_HISTORY:
				return getStatusHistories();
			case ResourcesPackage.ENCOUNTER__CLASS:
				return getClass_();
			case ResourcesPackage.ENCOUNTER__CLASS_HISTORY:
				return getClassHistories();
			case ResourcesPackage.ENCOUNTER__TYPE:
				return getTypes();
			case ResourcesPackage.ENCOUNTER__SERVICE_TYPE:
				return getServiceType();
			case ResourcesPackage.ENCOUNTER__PRIORITY:
				return getPriority();
			case ResourcesPackage.ENCOUNTER__SUBJECT:
				return getSubject();
			case ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE:
				return getEpisodeOfCares();
			case ResourcesPackage.ENCOUNTER__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.ENCOUNTER__PARTICIPANT:
				return getParticipants();
			case ResourcesPackage.ENCOUNTER__APPOINTMENT:
				return getAppointments();
			case ResourcesPackage.ENCOUNTER__PERIOD:
				return getPeriod();
			case ResourcesPackage.ENCOUNTER__LENGTH:
				return getLength();
			case ResourcesPackage.ENCOUNTER__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.ENCOUNTER__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.ENCOUNTER__DIAGNOSIS:
				return getDiagnosis();
			case ResourcesPackage.ENCOUNTER__ACCOUNT:
				return getAccounts();
			case ResourcesPackage.ENCOUNTER__HOSPITALIZATION:
				return getHospitalization();
			case ResourcesPackage.ENCOUNTER__LOCATION:
				return getLocations();
			case ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER:
				return getServiceProvider();
			case ResourcesPackage.ENCOUNTER__PART_OF:
				return getPartOf();
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
			case ResourcesPackage.ENCOUNTER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistories().clear();
				getStatusHistories().addAll((Collection<? extends EncounterStatusHistory>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__CLASS:
				setClass_((Coding)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__CLASS_HISTORY:
				getClassHistories().clear();
				getClassHistories().addAll((Collection<? extends EncounterClassHistory>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__SERVICE_TYPE:
				setServiceType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCares().clear();
				getEpisodeOfCares().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__PARTICIPANT:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends EncounterParticipant>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__APPOINTMENT:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__LENGTH:
				setLength((Duration)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends EncounterDiagnosis>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__ACCOUNT:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends EncounterLocation>)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)newValue);
				return;
			case ResourcesPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)newValue);
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
			case ResourcesPackage.ENCOUNTER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ENCOUNTER__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ENCOUNTER__STATUS_HISTORY:
				getStatusHistories().clear();
				return;
			case ResourcesPackage.ENCOUNTER__CLASS:
				setClass_((Coding)null);
				return;
			case ResourcesPackage.ENCOUNTER__CLASS_HISTORY:
				getClassHistories().clear();
				return;
			case ResourcesPackage.ENCOUNTER__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.ENCOUNTER__SERVICE_TYPE:
				setServiceType((CodeableConcept)null);
				return;
			case ResourcesPackage.ENCOUNTER__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.ENCOUNTER__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE:
				getEpisodeOfCares().clear();
				return;
			case ResourcesPackage.ENCOUNTER__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.ENCOUNTER__PARTICIPANT:
				getParticipants().clear();
				return;
			case ResourcesPackage.ENCOUNTER__APPOINTMENT:
				getAppointments().clear();
				return;
			case ResourcesPackage.ENCOUNTER__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.ENCOUNTER__LENGTH:
				setLength((Duration)null);
				return;
			case ResourcesPackage.ENCOUNTER__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.ENCOUNTER__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.ENCOUNTER__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case ResourcesPackage.ENCOUNTER__ACCOUNT:
				getAccounts().clear();
				return;
			case ResourcesPackage.ENCOUNTER__HOSPITALIZATION:
				setHospitalization((EncounterHospitalization)null);
				return;
			case ResourcesPackage.ENCOUNTER__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER:
				setServiceProvider((Reference)null);
				return;
			case ResourcesPackage.ENCOUNTER__PART_OF:
				setPartOf((Reference)null);
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
			case ResourcesPackage.ENCOUNTER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ENCOUNTER__STATUS:
				return status != null;
			case ResourcesPackage.ENCOUNTER__STATUS_HISTORY:
				return statusHistories != null && !statusHistories.isEmpty();
			case ResourcesPackage.ENCOUNTER__CLASS:
				return class_ != null;
			case ResourcesPackage.ENCOUNTER__CLASS_HISTORY:
				return classHistories != null && !classHistories.isEmpty();
			case ResourcesPackage.ENCOUNTER__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.ENCOUNTER__SERVICE_TYPE:
				return serviceType != null;
			case ResourcesPackage.ENCOUNTER__PRIORITY:
				return priority != null;
			case ResourcesPackage.ENCOUNTER__SUBJECT:
				return subject != null;
			case ResourcesPackage.ENCOUNTER__EPISODE_OF_CARE:
				return episodeOfCares != null && !episodeOfCares.isEmpty();
			case ResourcesPackage.ENCOUNTER__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.ENCOUNTER__PARTICIPANT:
				return participants != null && !participants.isEmpty();
			case ResourcesPackage.ENCOUNTER__APPOINTMENT:
				return appointments != null && !appointments.isEmpty();
			case ResourcesPackage.ENCOUNTER__PERIOD:
				return period != null;
			case ResourcesPackage.ENCOUNTER__LENGTH:
				return length != null;
			case ResourcesPackage.ENCOUNTER__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.ENCOUNTER__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.ENCOUNTER__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case ResourcesPackage.ENCOUNTER__ACCOUNT:
				return accounts != null && !accounts.isEmpty();
			case ResourcesPackage.ENCOUNTER__HOSPITALIZATION:
				return hospitalization != null;
			case ResourcesPackage.ENCOUNTER__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.ENCOUNTER__SERVICE_PROVIDER:
				return serviceProvider != null;
			case ResourcesPackage.ENCOUNTER__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterImpl
