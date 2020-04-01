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

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.AllergyIntolerance;
import org.eclipse.mdht.hl7.fhir.resources.AllergyIntoleranceReaction;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AllergyIntoleranceImpl#getReactions <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllergyIntoleranceImpl extends DomainResourceImpl implements AllergyIntolerance {
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
	 * The cached value of the '{@link #getClinicalStatus() <em>Clinical Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept clinicalStatus;

	/**
	 * The cached value of the '{@link #getVerificationStatus() <em>Verification Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept verificationStatus;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> categories;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Code criticality;

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
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

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
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected Reference recorder;

	/**
	 * The cached value of the '{@link #getAsserter() <em>Asserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsserter()
	 * @generated
	 * @ordered
	 */
	protected Reference asserter;

	/**
	 * The cached value of the '{@link #getLastOccurrence() <em>Last Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOccurrence()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastOccurrence;

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
	 * The cached value of the '{@link #getReactions() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntoleranceReaction> reactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAllergyIntolerance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClinicalStatus() {
		return clinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalStatus(CodeableConcept newClinicalStatus, NotificationChain msgs) {
		CodeableConcept oldClinicalStatus = clinicalStatus;
		clinicalStatus = newClinicalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, oldClinicalStatus, newClinicalStatus);
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
	public void setClinicalStatus(CodeableConcept newClinicalStatus) {
		if (newClinicalStatus != clinicalStatus) {
			NotificationChain msgs = null;
			if (clinicalStatus != null)
				msgs = ((InternalEObject)clinicalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, null, msgs);
			if (newClinicalStatus != null)
				msgs = ((InternalEObject)newClinicalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, null, msgs);
			msgs = basicSetClinicalStatus(newClinicalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS, newClinicalStatus, newClinicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationStatus(CodeableConcept newVerificationStatus, NotificationChain msgs) {
		CodeableConcept oldVerificationStatus = verificationStatus;
		verificationStatus = newVerificationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, oldVerificationStatus, newVerificationStatus);
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
	public void setVerificationStatus(CodeableConcept newVerificationStatus) {
		if (newVerificationStatus != verificationStatus) {
			NotificationChain msgs = null;
			if (verificationStatus != null)
				msgs = ((InternalEObject)verificationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, null, msgs);
			if (newVerificationStatus != null)
				msgs = ((InternalEObject)newVerificationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, null, msgs);
			msgs = basicSetVerificationStatus(newVerificationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS, newVerificationStatus, newVerificationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, oldType, newType);
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
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticality(Code newCriticality, NotificationChain msgs) {
		Code oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, oldCriticality, newCriticality);
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
	public void setCriticality(Code newCriticality) {
		if (newCriticality != criticality) {
			NotificationChain msgs = null;
			if (criticality != null)
				msgs = ((InternalEObject)criticality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			if (newCriticality != null)
				msgs = ((InternalEObject)newCriticality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, null, msgs);
			msgs = basicSetCriticality(newCriticality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY, newCriticality, newCriticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER, oldEncounter, newEncounter);
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
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetx(DataType newOnsetx, NotificationChain msgs) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, oldOnsetx, newOnsetx);
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
	public void setOnsetx(DataType newOnsetx) {
		if (newOnsetx != onsetx) {
			NotificationChain msgs = null;
			if (onsetx != null)
				msgs = ((InternalEObject)onsetx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, null, msgs);
			if (newOnsetx != null)
				msgs = ((InternalEObject)newOnsetx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, null, msgs);
			msgs = basicSetOnsetx(newOnsetx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX, newOnsetx, newOnsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, oldRecordedDate, newRecordedDate);
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
	public void setRecordedDate(DateTime newRecordedDate) {
		if (newRecordedDate != recordedDate) {
			NotificationChain msgs = null;
			if (recordedDate != null)
				msgs = ((InternalEObject)recordedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, null, msgs);
			if (newRecordedDate != null)
				msgs = ((InternalEObject)newRecordedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, null, msgs);
			msgs = basicSetRecordedDate(newRecordedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE, newRecordedDate, newRecordedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, oldRecorder, newRecorder);
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
	public void setRecorder(Reference newRecorder) {
		if (newRecorder != recorder) {
			NotificationChain msgs = null;
			if (recorder != null)
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER, newRecorder, newRecorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAsserter() {
		return asserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsserter(Reference newAsserter, NotificationChain msgs) {
		Reference oldAsserter = asserter;
		asserter = newAsserter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, oldAsserter, newAsserter);
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
	public void setAsserter(Reference newAsserter) {
		if (newAsserter != asserter) {
			NotificationChain msgs = null;
			if (asserter != null)
				msgs = ((InternalEObject)asserter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, null, msgs);
			if (newAsserter != null)
				msgs = ((InternalEObject)newAsserter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, null, msgs);
			msgs = basicSetAsserter(newAsserter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER, newAsserter, newAsserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastOccurrence() {
		return lastOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastOccurrence(DateTime newLastOccurrence, NotificationChain msgs) {
		DateTime oldLastOccurrence = lastOccurrence;
		lastOccurrence = newLastOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, oldLastOccurrence, newLastOccurrence);
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
	public void setLastOccurrence(DateTime newLastOccurrence) {
		if (newLastOccurrence != lastOccurrence) {
			NotificationChain msgs = null;
			if (lastOccurrence != null)
				msgs = ((InternalEObject)lastOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			if (newLastOccurrence != null)
				msgs = ((InternalEObject)newLastOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, null, msgs);
			msgs = basicSetLastOccurrence(newLastOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE, newLastOccurrence, newLastOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllergyIntoleranceReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<AllergyIntoleranceReaction>(AllergyIntoleranceReaction.class, this, ResourcesPackage.ALLERGY_INTOLERANCE__REACTION);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return basicSetClinicalStatus(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return basicSetVerificationStatus(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return basicSetCriticality(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				return basicSetOnsetx(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return basicSetRecordedDate(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				return basicSetRecorder(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return basicSetAsserter(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return basicSetLastOccurrence(null, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return getClinicalStatus();
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return getVerificationStatus();
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				return getType();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return getCategories();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return getCriticality();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				return getCode();
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				return getPatient();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				return getOnsetx();
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return getRecordedDate();
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				return getRecorder();
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return getAsserter();
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return getLastOccurrence();
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				return getNotes();
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return getReactions();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Reference)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
				getReactions().addAll((Collection<? extends AllergyIntoleranceReaction>)newValue);
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				setClinicalStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				setVerificationStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				setCriticality((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				setOnsetx((DataType)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				setRecordedDate((DateTime)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				setRecorder((Reference)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				setAsserter((Reference)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				setLastOccurrence((DateTime)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				getReactions().clear();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CLINICAL_STATUS:
				return clinicalStatus != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__VERIFICATION_STATUS:
				return verificationStatus != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__TYPE:
				return type != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__CRITICALITY:
				return criticality != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__CODE:
				return code != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__PATIENT:
				return patient != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ONSETX:
				return onsetx != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDED_DATE:
				return recordedDate != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__RECORDER:
				return recorder != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__ASSERTER:
				return asserter != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__LAST_OCCURRENCE:
				return lastOccurrence != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE__REACTION:
				return reactions != null && !reactions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceImpl
