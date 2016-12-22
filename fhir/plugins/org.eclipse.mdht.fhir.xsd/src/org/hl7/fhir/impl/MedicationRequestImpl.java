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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DosageInstruction;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestStatus;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationRequestImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationRequestImpl extends DomainResourceImpl implements MedicationRequest {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> definition;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getRequisition() <em>Requisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisition()
	 * @generated
	 * @ordered
	 */
	protected Identifier requisition;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequestStatus status;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stage;

	/**
	 * The cached value of the '{@link #getMedicationCodeableConcept() <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept medicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getMedicationReference() <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference medicationReference;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

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
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getDosageInstruction() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageInstruction> dosageInstruction;

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
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> eventHistory;

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
		return FhirPackage.eINSTANCE.getMedicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequisition() {
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequisition(Identifier newRequisition, NotificationChain msgs) {
		Identifier oldRequisition = requisition;
		requisition = newRequisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUISITION, oldRequisition, newRequisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisition(Identifier newRequisition) {
		if (newRequisition != requisition) {
			NotificationChain msgs = null;
			if (requisition != null)
				msgs = ((InternalEObject)requisition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUISITION, null, msgs);
			if (newRequisition != null)
				msgs = ((InternalEObject)newRequisition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUISITION, null, msgs);
			msgs = basicSetRequisition(newRequisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUISITION, newRequisition, newRequisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationRequestStatus newStatus, NotificationChain msgs) {
		MedicationRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(CodeableConcept newStage, NotificationChain msgs) {
		CodeableConcept oldStage = stage;
		stage = newStage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STAGE, oldStage, newStage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(CodeableConcept newStage) {
		if (newStage != stage) {
			NotificationChain msgs = null;
			if (stage != null)
				msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STAGE, null, msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__STAGE, null, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMedicationCodeableConcept() {
		return medicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMedicationCodeableConcept = medicationCodeableConcept;
		medicationCodeableConcept = newMedicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept) {
		if (newMedicationCodeableConcept != medicationCodeableConcept) {
			NotificationChain msgs = null;
			if (medicationCodeableConcept != null)
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedicationReference() {
		return medicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationReference(Reference newMedicationReference, NotificationChain msgs) {
		Reference oldMedicationReference = medicationReference;
		medicationReference = newMedicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationReference(Reference newMedicationReference) {
		if (newMedicationReference != medicationReference) {
			NotificationChain msgs = null;
			if (medicationReference != null)
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateWritten(DateTime newDateWritten, NotificationChain msgs) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN, oldDateWritten, newDateWritten);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		if (newDateWritten != dateWritten) {
			NotificationChain msgs = null;
			if (dateWritten != null)
				msgs = ((InternalEObject)dateWritten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN, null, msgs);
			if (newDateWritten != null)
				msgs = ((InternalEObject)newDateWritten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN, null, msgs);
			msgs = basicSetDateWritten(newDateWritten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN, newDateWritten, newDateWritten));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUESTER, oldRequester, newRequester);
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
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_REQUEST__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_REQUEST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DosageInstruction> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<DosageInstruction>(DosageInstruction.class, this, FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, oldDispenseRequest, newDispenseRequest);
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
				msgs = ((InternalEObject)dispenseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			if (newDispenseRequest != null)
				msgs = ((InternalEObject)newDispenseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, null, msgs);
			msgs = basicSetDispenseRequest(newDispenseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST, newDispenseRequest, newDispenseRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, oldSubstitution, newSubstitution);
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
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__SUBSTITUTION, newSubstitution, newSubstitution));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, oldPriorPrescription, newPriorPrescription);
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
				msgs = ((InternalEObject)priorPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			if (newPriorPrescription != null)
				msgs = ((InternalEObject)newPriorPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, null, msgs);
			msgs = basicSetPriorPrescription(newPriorPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION, newPriorPrescription, newPriorPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY);
		}
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__REQUISITION:
				return basicSetRequisition(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__STAGE:
				return basicSetStage(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				return basicSetDateWritten(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return basicSetDispenseRequest(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return basicSetPriorPrescription(null, msgs);
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_REQUEST__DEFINITION:
				return getDefinition();
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.MEDICATION_REQUEST__REQUISITION:
				return getRequisition();
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_REQUEST__STAGE:
				return getStage();
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_REQUEST__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_REQUEST__CONTEXT:
				return getContext();
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				return getDateWritten();
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.MEDICATION_REQUEST__REASON_CODE:
				return getReasonCode();
			case FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return getDispenseRequest();
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return getPriorPrescription();
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return getEventHistory();
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUISITION:
				setRequisition((Identifier)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				setStatus((MedicationRequestStatus)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__STAGE:
				setStage((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends DosageInstruction>)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				getEventHistory().clear();
				getEventHistory().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUISITION:
				setRequisition((Identifier)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				setStatus((MedicationRequestStatus)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__STAGE:
				setStage((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				setDispenseRequest((MedicationRequestDispenseRequest)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				setSubstitution((MedicationRequestSubstitution)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				setPriorPrescription((Reference)null);
				return;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				getEventHistory().clear();
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
			case FhirPackage.MEDICATION_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__REQUISITION:
				return requisition != null;
			case FhirPackage.MEDICATION_REQUEST__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_REQUEST__STAGE:
				return stage != null;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_REQUEST__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_REQUEST__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_REQUEST__CONTEXT:
				return context != null;
			case FhirPackage.MEDICATION_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__DATE_WRITTEN:
				return dateWritten != null;
			case FhirPackage.MEDICATION_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.MEDICATION_REQUEST__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__CATEGORY:
				return category != null;
			case FhirPackage.MEDICATION_REQUEST__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_REQUEST__DISPENSE_REQUEST:
				return dispenseRequest != null;
			case FhirPackage.MEDICATION_REQUEST__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_REQUEST__PRIOR_PRESCRIPTION:
				return priorPrescription != null;
			case FhirPackage.MEDICATION_REQUEST__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestImpl
