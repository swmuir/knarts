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

import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getActuality <em>Actuality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getResultingCondition <em>Resulting Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getSeriousness <em>Seriousness</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getEventParticipant <em>Event Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getSuspectEntity <em>Suspect Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getSubjectMedicalHistory <em>Subject Medical History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getReferenceDocument <em>Reference Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventImpl#getStudy <em>Study</em>}</li>
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
	protected AdverseEventActuality actuality;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getResultingCondition() <em>Resulting Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> resultingCondition;

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
	 * The cached value of the '{@link #getEventParticipant() <em>Event Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventParticipant()
	 * @generated
	 * @ordered
	 */
	protected Reference eventParticipant;

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
	 * The cached value of the '{@link #getSuspectEntity() <em>Suspect Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspectEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventSuspectEntity> suspectEntity;

	/**
	 * The cached value of the '{@link #getSubjectMedicalHistory() <em>Subject Medical History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectMedicalHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjectMedicalHistory;

	/**
	 * The cached value of the '{@link #getReferenceDocument() <em>Reference Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referenceDocument;

	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> study;

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
		return FhirPackage.eINSTANCE.getAdverseEvent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActuality getActuality() {
		return actuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuality(AdverseEventActuality newActuality, NotificationChain msgs) {
		AdverseEventActuality oldActuality = actuality;
		actuality = newActuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ACTUALITY, oldActuality, newActuality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuality(AdverseEventActuality newActuality) {
		if (newActuality != actuality) {
			NotificationChain msgs = null;
			if (actuality != null)
				msgs = ((InternalEObject)actuality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			if (newActuality != null)
				msgs = ((InternalEObject)newActuality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__ACTUALITY, null, msgs);
			msgs = basicSetActuality(newActuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__ACTUALITY, newActuality, newActuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ADVERSE_EVENT__CATEGORY);
		}
		return category;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EVENT, oldEvent, newEvent);
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
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EVENT, newEvent, newEvent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getResultingCondition() {
		if (resultingCondition == null) {
			resultingCondition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION);
		}
		return resultingCondition;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__LOCATION, newLocation, newLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SERIOUSNESS, oldSeriousness, newSeriousness);
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
				msgs = ((InternalEObject)seriousness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			if (newSeriousness != null)
				msgs = ((InternalEObject)newSeriousness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SERIOUSNESS, null, msgs);
			msgs = basicSetSeriousness(newSeriousness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SERIOUSNESS, newSeriousness, newSeriousness));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SEVERITY, oldSeverity, newSeverity);
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
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__SEVERITY, newSeverity, newSeverity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDER, oldRecorder, newRecorder);
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
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEventParticipant() {
		return eventParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventParticipant(Reference newEventParticipant, NotificationChain msgs) {
		Reference oldEventParticipant = eventParticipant;
		eventParticipant = newEventParticipant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT, oldEventParticipant, newEventParticipant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventParticipant(Reference newEventParticipant) {
		if (newEventParticipant != eventParticipant) {
			NotificationChain msgs = null;
			if (eventParticipant != null)
				msgs = ((InternalEObject)eventParticipant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT, null, msgs);
			if (newEventParticipant != null)
				msgs = ((InternalEObject)newEventParticipant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT, null, msgs);
			msgs = basicSetEventParticipant(newEventParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT, newEventParticipant, newEventParticipant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdverseEventSuspectEntity> getSuspectEntity() {
		if (suspectEntity == null) {
			suspectEntity = new EObjectContainmentEList<AdverseEventSuspectEntity>(AdverseEventSuspectEntity.class, this, FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY);
		}
		return suspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubjectMedicalHistory() {
		if (subjectMedicalHistory == null) {
			subjectMedicalHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY);
		}
		return subjectMedicalHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferenceDocument() {
		if (referenceDocument == null) {
			referenceDocument = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT);
		}
		return referenceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getStudy() {
		if (study == null) {
			study = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ADVERSE_EVENT__STUDY);
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return basicSetActuality(null, msgs);
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__EVENT:
				return basicSetEvent(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ADVERSE_EVENT__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return ((InternalEList<?>)getResultingCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return basicSetSeriousness(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return basicSetRecorder(null, msgs);
			case FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT:
				return basicSetEventParticipant(null, msgs);
			case FhirPackage.ADVERSE_EVENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return ((InternalEList<?>)getSuspectEntity()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return ((InternalEList<?>)getSubjectMedicalHistory()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return ((InternalEList<?>)getReferenceDocument()).basicRemove(otherEnd, msgs);
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return ((InternalEList<?>)getStudy()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return getActuality();
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return getCategory();
			case FhirPackage.ADVERSE_EVENT__EVENT:
				return getEvent();
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return getSubject();
			case FhirPackage.ADVERSE_EVENT__DATE:
				return getDate();
			case FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return getResultingCondition();
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return getLocation();
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return getSeriousness();
			case FhirPackage.ADVERSE_EVENT__SEVERITY:
				return getSeverity();
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return getOutcome();
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return getRecorder();
			case FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT:
				return getEventParticipant();
			case FhirPackage.ADVERSE_EVENT__DESCRIPTION:
				return getDescription();
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return getSuspectEntity();
			case FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return getSubjectMedicalHistory();
			case FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return getReferenceDocument();
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return getStudy();
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((AdverseEventActuality)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__EVENT:
				setEvent((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				getResultingCondition().clear();
				getResultingCondition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SEVERITY:
				setSeverity((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT:
				setEventParticipant((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntity().clear();
				getSuspectEntity().addAll((Collection<? extends AdverseEventSuspectEntity>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				getSubjectMedicalHistory().clear();
				getSubjectMedicalHistory().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				getReferenceDocument().clear();
				getReferenceDocument().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT__STUDY:
				getStudy().clear();
				getStudy().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				setActuality((AdverseEventActuality)null);
				return;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__EVENT:
				setEvent((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				getResultingCondition().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				setSeriousness((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SEVERITY:
				setSeverity((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				setRecorder((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT:
				setEventParticipant((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				getSuspectEntity().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				getSubjectMedicalHistory().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				getReferenceDocument().clear();
				return;
			case FhirPackage.ADVERSE_EVENT__STUDY:
				getStudy().clear();
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
			case FhirPackage.ADVERSE_EVENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.ADVERSE_EVENT__ACTUALITY:
				return actuality != null;
			case FhirPackage.ADVERSE_EVENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.ADVERSE_EVENT__EVENT:
				return event != null;
			case FhirPackage.ADVERSE_EVENT__SUBJECT:
				return subject != null;
			case FhirPackage.ADVERSE_EVENT__DATE:
				return date != null;
			case FhirPackage.ADVERSE_EVENT__RESULTING_CONDITION:
				return resultingCondition != null && !resultingCondition.isEmpty();
			case FhirPackage.ADVERSE_EVENT__LOCATION:
				return location != null;
			case FhirPackage.ADVERSE_EVENT__SERIOUSNESS:
				return seriousness != null;
			case FhirPackage.ADVERSE_EVENT__SEVERITY:
				return severity != null;
			case FhirPackage.ADVERSE_EVENT__OUTCOME:
				return outcome != null;
			case FhirPackage.ADVERSE_EVENT__RECORDER:
				return recorder != null;
			case FhirPackage.ADVERSE_EVENT__EVENT_PARTICIPANT:
				return eventParticipant != null;
			case FhirPackage.ADVERSE_EVENT__DESCRIPTION:
				return description != null;
			case FhirPackage.ADVERSE_EVENT__SUSPECT_ENTITY:
				return suspectEntity != null && !suspectEntity.isEmpty();
			case FhirPackage.ADVERSE_EVENT__SUBJECT_MEDICAL_HISTORY:
				return subjectMedicalHistory != null && !subjectMedicalHistory.isEmpty();
			case FhirPackage.ADVERSE_EVENT__REFERENCE_DOCUMENT:
				return referenceDocument != null && !referenceDocument.isEmpty();
			case FhirPackage.ADVERSE_EVENT__STUDY:
				return study != null && !study.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventImpl
