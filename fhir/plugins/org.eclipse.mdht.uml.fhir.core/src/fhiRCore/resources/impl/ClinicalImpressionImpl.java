/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.ClinicalImpression;
import fhiRCore.resources.ClinicalImpressionFinding;
import fhiRCore.resources.ClinicalImpressionInvestigation;
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
 * An implementation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getProblems <em>Problem</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getInvestigations <em>Investigation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getFindings <em>Finding</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getPrognosisCodeableConcepts <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getPrognosisReferences <em>Prognosis Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClinicalImpressionImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionImpl extends DomainResourceImpl implements ClinicalImpression {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

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
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected Reference assessor;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Reference previous;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> problems;

	/**
	 * The cached value of the '{@link #getInvestigations() <em>Investigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvestigations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionInvestigation> investigations;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> protocols;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String summary;

	/**
	 * The cached value of the '{@link #getFindings() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClinicalImpressionFinding> findings;

	/**
	 * The cached value of the '{@link #getPrognosisCodeableConcepts() <em>Prognosis Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisCodeableConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> prognosisCodeableConcepts;

	/**
	 * The cached value of the '{@link #getPrognosisReferences() <em>Prognosis Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> prognosisReferences;

	/**
	 * The cached value of the '{@link #getSupportingInfos() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfos;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClinicalImpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON, oldStatusReason, newStatusReason);
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
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON, newStatusReason, newStatusReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectivex() {
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivex(DataType newEffectivex, NotificationChain msgs) {
		DataType oldEffectivex = effectivex;
		effectivex = newEffectivex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, oldEffectivex, newEffectivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivex(DataType newEffectivex) {
		if (newEffectivex != effectivex) {
			NotificationChain msgs = null;
			if (effectivex != null)
				msgs = ((InternalEObject)effectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, null, msgs);
			if (newEffectivex != null)
				msgs = ((InternalEObject)newEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, null, msgs);
			msgs = basicSetEffectivex(newEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX, newEffectivex, newEffectivex));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessor(Reference newAssessor, NotificationChain msgs) {
		Reference oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, oldAssessor, newAssessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessor(Reference newAssessor) {
		if (newAssessor != assessor) {
			NotificationChain msgs = null;
			if (assessor != null)
				msgs = ((InternalEObject)assessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			if (newAssessor != null)
				msgs = ((InternalEObject)newAssessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, null, msgs);
			msgs = basicSetAssessor(newAssessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR, newAssessor, newAssessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Reference newPrevious, NotificationChain msgs) {
		Reference oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Reference newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionInvestigation> getInvestigations() {
		if (investigations == null) {
			investigations = new EObjectContainmentEList<ClinicalImpressionInvestigation>(ClinicalImpressionInvestigation.class, this, ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION);
		}
		return investigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(fhiRCore.dataTypes.String newSummary, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, oldSummary, newSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(fhiRCore.dataTypes.String newSummary) {
		if (newSummary != summary) {
			NotificationChain msgs = null;
			if (summary != null)
				msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			if (newSummary != null)
				msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, null, msgs);
			msgs = basicSetSummary(newSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY, newSummary, newSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClinicalImpressionFinding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<ClinicalImpressionFinding>(ClinicalImpressionFinding.class, this, ResourcesPackage.CLINICAL_IMPRESSION__FINDING);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPrognosisCodeableConcepts() {
		if (prognosisCodeableConcepts == null) {
			prognosisCodeableConcepts = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT);
		}
		return prognosisCodeableConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPrognosisReferences() {
		if (prognosisReferences == null) {
			prognosisReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE);
		}
		return prognosisReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.CLINICAL_IMPRESSION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				return basicSetEffectivex(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return basicSetAssessor(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				return ((InternalEList<?>)getProblems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return ((InternalEList<?>)getInvestigations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				return basicSetSummary(null, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getPrognosisCodeableConcepts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return ((InternalEList<?>)getPrognosisReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				return getStatus();
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				return getCode();
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				return getSubject();
			case ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				return getEffectivex();
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				return getDate();
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return getAssessor();
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return getPrevious();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				return getProblems();
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return getInvestigations();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return getProtocols();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				return getSummary();
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return getFindings();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return getPrognosisCodeableConcepts();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return getPrognosisReferences();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				return getNotes();
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigations().clear();
				getInvestigations().addAll((Collection<? extends ClinicalImpressionInvestigation>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				getFindings().addAll((Collection<? extends ClinicalImpressionFinding>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcepts().clear();
				getPrognosisCodeableConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReferences().clear();
				getPrognosisReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				setAssessor((Reference)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				setPrevious((Reference)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				getProblems().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				getInvestigations().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				getProtocols().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				setSummary((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				getFindings().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				getPrognosisCodeableConcepts().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				getPrognosisReferences().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.CLINICAL_IMPRESSION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS:
				return status != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__CODE:
				return code != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__SUBJECT:
				return subject != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__DATE:
				return date != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__ASSESSOR:
				return assessor != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__PREVIOUS:
				return previous != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__PROBLEM:
				return problems != null && !problems.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__INVESTIGATION:
				return investigations != null && !investigations.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROTOCOL:
				return protocols != null && !protocols.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUMMARY:
				return summary != null;
			case ResourcesPackage.CLINICAL_IMPRESSION__FINDING:
				return findings != null && !findings.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_CODEABLE_CONCEPT:
				return prognosisCodeableConcepts != null && !prognosisCodeableConcepts.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__PROGNOSIS_REFERENCE:
				return prognosisReferences != null && !prognosisReferences.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.CLINICAL_IMPRESSION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionImpl
