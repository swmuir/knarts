/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Canonical;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.MedicationRequest;
import fhiRCore.resources.MedicationRequestDispenseRequest;
import fhiRCore.resources.MedicationRequestSubstitution;
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
 * An implementation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getReportedx <em>Reportedx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getCourseOfTherapyType <em>Course Of Therapy Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getDetectedIssues <em>Detected Issue</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationRequestImpl#getEventHistories <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationRequestImpl extends DomainResourceImpl implements MedicationRequest {
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
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

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
	protected Code priority;

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
	 * The cached value of the '{@link #getReportedx() <em>Reportedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedx()
	 * @generated
	 * @ordered
	 */
	protected DataType reportedx;

	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected DataType medicationx;

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
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformations;

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
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

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
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> instantiatesCanonicals;

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
	 * The cached value of the '{@link #getCourseOfTherapyType() <em>Course Of Therapy Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfTherapyType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept courseOfTherapyType;

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
	 * The cached value of the '{@link #getDosageInstructions() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosageInstructions;

	/**
	 * The cached value of the '{@link #getDispenseRequest() <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseRequest()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestDispenseRequest dispenseRequest;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestSubstitution substitution;

	/**
	 * The cached value of the '{@link #getPriorPrescription() <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference priorPrescription;

	/**
	 * The cached value of the '{@link #getDetectedIssues() <em>Detected Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> detectedIssues;

	/**
	 * The cached value of the '{@link #getEventHistories() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> eventHistories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON, oldStatusReason, newStatusReason);
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
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON, newStatusReason, newStatusReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__INTENT, oldIntent, newIntent);
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
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_REQUEST__CATEGORY);
		}
		return categories;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
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
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReportedx() {
		return reportedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportedx(DataType newReportedx, NotificationChain msgs) {
		DataType oldReportedx = reportedx;
		reportedx = newReportedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REPORTEDX, oldReportedx, newReportedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedx(DataType newReportedx) {
		if (newReportedx != reportedx) {
			NotificationChain msgs = null;
			if (reportedx != null)
				msgs = ((InternalEObject)reportedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__REPORTEDX, null, msgs);
			if (newReportedx != null)
				msgs = ((InternalEObject)newReportedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__REPORTEDX, null, msgs);
			msgs = basicSetReportedx(newReportedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REPORTEDX, newReportedx, newReportedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationx(DataType newMedicationx, NotificationChain msgs) {
		DataType oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, oldMedicationx, newMedicationx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(DataType newMedicationx) {
		if (newMedicationx != medicationx) {
			NotificationChain msgs = null;
			if (medicationx != null)
				msgs = ((InternalEObject)medicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, null, msgs);
			if (newMedicationx != null)
				msgs = ((InternalEObject)newMedicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, null, msgs);
			msgs = basicSetMedicationx(newMedicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX, newMedicationx, newMedicationx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
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
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REQUESTER, oldRequester, newRequester);
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
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__REQUESTER, newRequester, newRequester));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PERFORMER, oldPerformer, newPerformer);
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
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerType(CodeableConcept newPerformerType, NotificationChain msgs) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE, oldPerformerType, newPerformerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE, newPerformerType, newPerformerType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__RECORDER, oldRecorder, newRecorder);
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
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_REQUEST__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Canonical> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<Canonical>(Canonical.class, this, ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL);
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
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI);
		}
		return instantiatesUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__BASED_ON);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
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
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCourseOfTherapyType() {
		return courseOfTherapyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseOfTherapyType(CodeableConcept newCourseOfTherapyType, NotificationChain msgs) {
		CodeableConcept oldCourseOfTherapyType = courseOfTherapyType;
		courseOfTherapyType = newCourseOfTherapyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, oldCourseOfTherapyType, newCourseOfTherapyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseOfTherapyType(CodeableConcept newCourseOfTherapyType) {
		if (newCourseOfTherapyType != courseOfTherapyType) {
			NotificationChain msgs = null;
			if (courseOfTherapyType != null)
				msgs = ((InternalEObject)courseOfTherapyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, null, msgs);
			if (newCourseOfTherapyType != null)
				msgs = ((InternalEObject)newCourseOfTherapyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, null, msgs);
			msgs = basicSetCourseOfTherapyType(newCourseOfTherapyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE, newCourseOfTherapyType, newCourseOfTherapyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__INSURANCE);
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
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_REQUEST__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dosage> getDosageInstructions() {
		if (dosageInstructions == null) {
			dosageInstructions = new EObjectContainmentEList<Dosage>(Dosage.class, this, ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestDispenseRequest getDispenseRequest() {
		return dispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest, NotificationChain msgs) {
		MedicationRequestDispenseRequest oldDispenseRequest = dispenseRequest;
		dispenseRequest = newDispenseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenseRequest(MedicationRequestDispenseRequest newDispenseRequest) {
		if (newDispenseRequest != dispenseRequest) {
			NotificationChain msgs = null;
			if (dispenseRequest != null)
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationRequestSubstitution newSubstitution, NotificationChain msgs) {
		MedicationRequestSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationRequestSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPriorPrescription() {
		return priorPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorPrescription(Reference newPriorPrescription, NotificationChain msgs) {
		Reference oldPriorPrescription = priorPrescription;
		priorPrescription = newPriorPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, oldPriorPrescription, newPriorPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorPrescription(Reference newPriorPrescription) {
		if (newPriorPrescription != priorPrescription) {
			NotificationChain msgs = null;
			if (priorPrescription != null)
				msgs = ((InternalEObject)priorPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			if (newPriorPrescription != null)
				msgs = ((InternalEObject)newPriorPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			msgs = basicSetPriorPrescription(newPriorPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, newPriorPrescription, newPriorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDetectedIssues() {
		if (detectedIssues == null) {
			detectedIssues = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE);
		}
		return detectedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEventHistories() {
		if (eventHistories == null) {
			eventHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY);
		}
		return eventHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__REPORTEDX:
				return basicSetReportedx(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				return basicSetMedicationx(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__RECORDER:
				return basicSetRecorder(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return basicSetCourseOfTherapyType(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstructions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return basicSetPriorPrescription(null, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE:
				return ((InternalEList<?>)getDetectedIssues()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistories()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.MEDICATION_REQUEST__INTENT:
				return getIntent();
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				return getCategories();
			case ResourcesPackage.MEDICATION_REQUEST__PRIORITY:
				return getPriority();
			case ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return getDoNotPerform();
			case ResourcesPackage.MEDICATION_REQUEST__REPORTEDX:
				return getReportedx();
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				return getMedicationx();
			case ResourcesPackage.MEDICATION_REQUEST__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				return getRequester();
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER:
				return getPerformer();
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return getPerformerType();
			case ResourcesPackage.MEDICATION_REQUEST__RECORDER:
				return getRecorder();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return getCourseOfTherapyType();
			case ResourcesPackage.MEDICATION_REQUEST__INSURANCE:
				return getInsurances();
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return getDispenseRequest();
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return getSubstitution();
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return getPriorPrescription();
			case ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE:
				return getDetectedIssues();
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return getEventHistories();
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REPORTEDX:
				setReportedx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				setMedicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends Canonical>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				setCourseOfTherapyType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends Dosage>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE:
				getDetectedIssues().clear();
				getDetectedIssues().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				getEventHistories().clear();
				getEventHistories().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REPORTEDX:
				setReportedx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				setMedicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__RECORDER:
				setRecorder((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				setCourseOfTherapyType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE:
				getDetectedIssues().clear();
				return;
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				getEventHistories().clear();
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
			case ResourcesPackage.MEDICATION_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_REQUEST__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.MEDICATION_REQUEST__INTENT:
				return intent != null;
			case ResourcesPackage.MEDICATION_REQUEST__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.MEDICATION_REQUEST__DO_NOT_PERFORM:
				return doNotPerform != null;
			case ResourcesPackage.MEDICATION_REQUEST__REPORTEDX:
				return reportedx != null;
			case ResourcesPackage.MEDICATION_REQUEST__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICATION_REQUEST__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.MEDICATION_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER:
				return performer != null;
			case ResourcesPackage.MEDICATION_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case ResourcesPackage.MEDICATION_REQUEST__RECORDER:
				return recorder != null;
			case ResourcesPackage.MEDICATION_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case ResourcesPackage.MEDICATION_REQUEST__COURSE_OF_THERAPY_TYPE:
				return courseOfTherapyType != null;
			case ResourcesPackage.MEDICATION_REQUEST__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case ResourcesPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return substitution != null;
			case ResourcesPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
			case ResourcesPackage.MEDICATION_REQUEST__DETECTED_ISSUE:
				return detectedIssues != null && !detectedIssues.isEmpty();
			case ResourcesPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return eventHistories != null && !eventHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestImpl
