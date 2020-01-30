/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.AdverseEvent;
import fhiRCore.resources.AdverseEventSuspectEntity;
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
 * An implementation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getActuality <em>Actuality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getDetected <em>Detected</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getResultingConditions <em>Resulting Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getContributors <em>Contributor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getSuspectEntities <em>Suspect Entity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getSubjectMedicalHistories <em>Subject Medical History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getReferenceDocuments <em>Reference Document</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventImpl#getStudies <em>Study</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventImpl extends DomainResourceImpl implements AdverseEvent {
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
	 * The cached value of the '{@link #getActuality() <em>Actuality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuality()
	 * @generated
	 * @ordered
	 */
	protected Code actuality;

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
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept event;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

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
	 * The cached value of the '{@link #getDetected() <em>Detected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetected()
	 * @generated
	 * @ordered
	 */
	protected DateTime detected;

	/**
	 * The cached value of the '{@link #getRecordedDate() <em>Recorded Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedDate;

	/**
	 * The cached value of the '{@link #getResultingConditions() <em>Resulting Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> resultingConditions;

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
	 * The cached value of the '{@link #getSeriousness() <em>Seriousness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriousness()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept seriousness;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept severity;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Reference recorder;

	/**
	 * The cached value of the '{@link #getContributors() <em>Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contributors;

	/**
	 * The cached value of the '{@link #getSuspectEntities() <em>Suspect Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspectEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventSuspectEntity> suspectEntities;

	/**
	 * The cached value of the '{@link #getSubjectMedicalHistories() <em>Subject Medical History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectMedicalHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjectMedicalHistories;

	/**
	 * The cached value of the '{@link #getReferenceDocuments() <em>Reference Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referenceDocuments;

	/**
	 * The cached value of the '{@link #getStudies() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudies()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> studies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAdverseEvent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getActuality() {
		return actuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuality(Code newActuality, NotificationChain msgs) {
		Code oldActuality = actuality;
		actuality = newActuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__ACTUALITY, oldActuality, newActuality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuality(Code newActuality) {
		if (newActuality != actuality) {
			NotificationChain msgs = null;
			if (actuality != null)
				msgs = ((InternalEObject)actuality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			if (newActuality != null)
				msgs = ((InternalEObject)newActuality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			msgs = basicSetActuality(newActuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__ACTUALITY, newActuality, newActuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ADVERSE_EVENT__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(CodeableConcept newEvent, NotificationChain msgs) {
		CodeableConcept oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(CodeableConcept newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__EVENT, newEvent, newEvent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDetected() {
		return detected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetected(DateTime newDetected, NotificationChain msgs) {
		DateTime oldDetected = detected;
		detected = newDetected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__DETECTED, oldDetected, newDetected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetected(DateTime newDetected) {
		if (newDetected != detected) {
			NotificationChain msgs = null;
			if (detected != null)
				msgs = ((InternalEObject)detected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__DETECTED, null, msgs);
			if (newDetected != null)
				msgs = ((InternalEObject)newDetected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__DETECTED, null, msgs);
			msgs = basicSetDetected(newDetected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__DETECTED, newDetected, newDetected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecordedDate() {
		return recordedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedDate(DateTime newRecordedDate, NotificationChain msgs) {
		DateTime oldRecordedDate = recordedDate;
		recordedDate = newRecordedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE, oldRecordedDate, newRecordedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedDate(DateTime newRecordedDate) {
		if (newRecordedDate != recordedDate) {
			NotificationChain msgs = null;
			if (recordedDate != null)
				msgs = ((InternalEObject)recordedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE, null, msgs);
			if (newRecordedDate != null)
				msgs = ((InternalEObject)newRecordedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE, null, msgs);
			msgs = basicSetRecordedDate(newRecordedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE, newRecordedDate, newRecordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResultingConditions() {
		if (resultingConditions == null) {
			resultingConditions = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION);
		}
		return resultingConditions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSeriousness() {
		return seriousness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriousness(CodeableConcept newSeriousness, NotificationChain msgs) {
		CodeableConcept oldSeriousness = seriousness;
		seriousness = newSeriousness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS, oldSeriousness, newSeriousness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriousness(CodeableConcept newSeriousness) {
		if (newSeriousness != seriousness) {
			NotificationChain msgs = null;
			if (seriousness != null)
				msgs = ((InternalEObject)seriousness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			if (newSeriousness != null)
				msgs = ((InternalEObject)newSeriousness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			msgs = basicSetSeriousness(newSeriousness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS, newSeriousness, newSeriousness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(CodeableConcept newSeverity, NotificationChain msgs) {
		CodeableConcept oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(CodeableConcept newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRecorder() {
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorder(Reference newRecorder, NotificationChain msgs) {
		Reference oldRecorder = recorder;
		recorder = newRecorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__RECORDER, oldRecorder, newRecorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getContributors() {
		if (contributors == null) {
			contributors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR);
		}
		return contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdverseEventSuspectEntity> getSuspectEntities() {
		if (suspectEntities == null) {
			suspectEntities = new EObjectContainmentEList<AdverseEventSuspectEntity>(AdverseEventSuspectEntity.class, this, ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY);
		}
		return suspectEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubjectMedicalHistories() {
		if (subjectMedicalHistories == null) {
			subjectMedicalHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY);
		}
		return subjectMedicalHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferenceDocuments() {
		if (referenceDocuments == null) {
			referenceDocuments = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT);
		}
		return referenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getStudies() {
		if (studies == null) {
			studies = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.ADVERSE_EVENT__STUDY);
		}
		return studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ADVERSE_EVENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__ACTUALITY:
				return basicSetActuality(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__EVENT:
				return basicSetEvent(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__DETECTED:
				return basicSetDetected(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE:
				return basicSetRecordedDate(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return ((InternalEList<?>)getResultingConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS:
				return basicSetSeriousness(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__SEVERITY:
				return basicSetSeverity(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__RECORDER:
				return basicSetRecorder(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR:
				return ((InternalEList<?>)getContributors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return ((InternalEList<?>)getSuspectEntities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return ((InternalEList<?>)getSubjectMedicalHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return ((InternalEList<?>)getReferenceDocuments()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ADVERSE_EVENT__STUDY:
				return ((InternalEList<?>)getStudies()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ADVERSE_EVENT__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.ADVERSE_EVENT__ACTUALITY:
				return getActuality();
			case ResourcesPackage.ADVERSE_EVENT__CATEGORY:
				return getCategories();
			case ResourcesPackage.ADVERSE_EVENT__EVENT:
				return getEvent();
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT:
				return getSubject();
			case ResourcesPackage.ADVERSE_EVENT__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.ADVERSE_EVENT__DATE:
				return getDate();
			case ResourcesPackage.ADVERSE_EVENT__DETECTED:
				return getDetected();
			case ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE:
				return getRecordedDate();
			case ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return getResultingConditions();
			case ResourcesPackage.ADVERSE_EVENT__LOCATION:
				return getLocation();
			case ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS:
				return getSeriousness();
			case ResourcesPackage.ADVERSE_EVENT__SEVERITY:
				return getSeverity();
			case ResourcesPackage.ADVERSE_EVENT__OUTCOME:
				return getOutcome();
			case ResourcesPackage.ADVERSE_EVENT__RECORDER:
				return getRecorder();
			case ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR:
				return getContributors();
			case ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return getSuspectEntities();
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return getSubjectMedicalHistories();
			case ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return getReferenceDocuments();
			case ResourcesPackage.ADVERSE_EVENT__STUDY:
				return getStudies();
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
			case ResourcesPackage.ADVERSE_EVENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((Code)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__EVENT:
				setEvent((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__DETECTED:
				setDetected((DateTime)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				getResultingConditions().clear();
				getResultingConditions().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR:
				getContributors().clear();
				getContributors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntities().clear();
				getSuspectEntities().addAll((Collection<? extends AdverseEventSuspectEntity>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				getSubjectMedicalHistories().clear();
				getSubjectMedicalHistories().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT__STUDY:
				getStudies().clear();
				getStudies().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.ADVERSE_EVENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((Code)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__EVENT:
				setEvent((CodeableConcept)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__DETECTED:
				setDetected((DateTime)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				getResultingConditions().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR:
				getContributors().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntities().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				getSubjectMedicalHistories().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				getReferenceDocuments().clear();
				return;
			case ResourcesPackage.ADVERSE_EVENT__STUDY:
				getStudies().clear();
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
			case ResourcesPackage.ADVERSE_EVENT__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.ADVERSE_EVENT__ACTUALITY:
				return actuality != null;
			case ResourcesPackage.ADVERSE_EVENT__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__EVENT:
				return event != null;
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.ADVERSE_EVENT__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.ADVERSE_EVENT__DATE:
				return date != null;
			case ResourcesPackage.ADVERSE_EVENT__DETECTED:
				return detected != null;
			case ResourcesPackage.ADVERSE_EVENT__RECORDED_DATE:
				return recordedDate != null;
			case ResourcesPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return resultingConditions != null && !resultingConditions.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__LOCATION:
				return location != null;
			case ResourcesPackage.ADVERSE_EVENT__SERIOUSNESS:
				return seriousness != null;
			case ResourcesPackage.ADVERSE_EVENT__SEVERITY:
				return severity != null;
			case ResourcesPackage.ADVERSE_EVENT__OUTCOME:
				return outcome != null;
			case ResourcesPackage.ADVERSE_EVENT__RECORDER:
				return recorder != null;
			case ResourcesPackage.ADVERSE_EVENT__CONTRIBUTOR:
				return contributors != null && !contributors.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return suspectEntities != null && !suspectEntities.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return subjectMedicalHistories != null && !subjectMedicalHistories.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return referenceDocuments != null && !referenceDocuments.isEmpty();
			case ResourcesPackage.ADVERSE_EVENT__STUDY:
				return studies != null && !studies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventImpl
