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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getNotGiven <em>Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReasonNotGiven <em>Reason Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getReasonGiven <em>Reason Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationImpl extends DomainResourceImpl implements MedicationAdministration {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationStatus status;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

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
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getNotGiven() <em>Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean notGiven;

	/**
	 * The cached value of the '{@link #getReasonNotGiven() <em>Reason Not Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotGiven;

	/**
	 * The cached value of the '{@link #getReasonGiven() <em>Reason Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonGiven;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> device;

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
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationDosage dosage;

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
	protected MedicationAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationAdministrationStatus newStatus, NotificationChain msgs) {
		MedicationAdministrationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationAdministrationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
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
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
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
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER, oldPerformer, newPerformer);
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
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, oldPrescription, newPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNotGiven() {
		return notGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotGiven(org.hl7.fhir.Boolean newNotGiven, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNotGiven = notGiven;
		notGiven = newNotGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN, oldNotGiven, newNotGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotGiven(org.hl7.fhir.Boolean newNotGiven) {
		if (newNotGiven != notGiven) {
			NotificationChain msgs = null;
			if (notGiven != null)
				msgs = ((InternalEObject)notGiven).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN, null, msgs);
			if (newNotGiven != null)
				msgs = ((InternalEObject)newNotGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN, null, msgs);
			msgs = basicSetNotGiven(newNotGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN, newNotGiven, newNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotGiven() {
		if (reasonNotGiven == null) {
			reasonNotGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN);
		}
		return reasonNotGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonGiven() {
		if (reasonGiven == null) {
			reasonGiven = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN);
		}
		return reasonGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ADMINISTRATION__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_ADMINISTRATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage getDosage() {
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDosage(MedicationAdministrationDosage newDosage, NotificationChain msgs) {
		MedicationAdministrationDosage oldDosage = dosage;
		dosage = newDosage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, oldDosage, newDosage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDosage(MedicationAdministrationDosage newDosage) {
		if (newDosage != dosage) {
			NotificationChain msgs = null;
			if (dosage != null)
				msgs = ((InternalEObject)dosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			if (newDosage != null)
				msgs = ((InternalEObject)newDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			msgs = basicSetDosage(newDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE, newDosage, newDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY);
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN:
				return basicSetNotGiven(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return ((InternalEList<?>)getReasonNotGiven()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return ((InternalEList<?>)getReasonGiven()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return basicSetDosage(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return getPatient();
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return getPerformer();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return getPrescription();
			case FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN:
				return getNotGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return getReasonNotGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return getReasonGiven();
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return getDevice();
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return getDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatus)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN:
				setNotGiven((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				getReasonNotGiven().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGiven().clear();
				getReasonGiven().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((MedicationAdministrationStatus)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN:
				setNotGiven((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				getReasonNotGiven().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				getReasonGiven().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevice().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case FhirPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__PATIENT:
				return patient != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return performer != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__PRESCRIPTION:
				return prescription != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__NOT_GIVEN:
				return notGiven != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_NOT_GIVEN:
				return reasonNotGiven != null && !reasonNotGiven.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__REASON_GIVEN:
				return reasonGiven != null && !reasonGiven.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return device != null && !device.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return dosage != null;
			case FhirPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationImpl
