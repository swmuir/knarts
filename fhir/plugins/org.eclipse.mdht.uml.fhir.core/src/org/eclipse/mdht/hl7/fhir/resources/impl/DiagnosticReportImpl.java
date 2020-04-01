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

import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.DiagnosticReport;
import org.eclipse.mdht.hl7.fhir.resources.DiagnosticReportMedia;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getResultsInterpreters <em>Results Interpreter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getImagingStudies <em>Imaging Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getMedias <em>Media</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getConclusionCodes <em>Conclusion Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportImpl#getPresentedForms <em>Presented Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticReportImpl extends DomainResourceImpl implements DiagnosticReport {
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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

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
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performers;

	/**
	 * The cached value of the '{@link #getResultsInterpreters() <em>Results Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsInterpreters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> resultsInterpreters;

	/**
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimens;

	/**
	 * The cached value of the '{@link #getResults() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> results;

	/**
	 * The cached value of the '{@link #getImagingStudies() <em>Imaging Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudies()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> imagingStudies;

	/**
	 * The cached value of the '{@link #getMedias() <em>Media</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticReportMedia> medias;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String conclusion;

	/**
	 * The cached value of the '{@link #getConclusionCodes() <em>Conclusion Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> conclusionCodes;

	/**
	 * The cached value of the '{@link #getPresentedForms() <em>Presented Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> presentedForms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDiagnosticReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON);
		}
		return basedOns;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY);
		}
		return categories;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, oldEffectivex, newEffectivex);
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
	public void setEffectivex(DataType newEffectivex) {
		if (newEffectivex != effectivex) {
			NotificationChain msgs = null;
			if (effectivex != null)
				msgs = ((InternalEObject)effectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, null, msgs);
			if (newEffectivex != null)
				msgs = ((InternalEObject)newEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, null, msgs);
			msgs = basicSetEffectivex(newEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX, newEffectivex, newEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, oldIssued, newIssued);
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
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getResultsInterpreters() {
		if (resultsInterpreters == null) {
			resultsInterpreters = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER);
		}
		return resultsInterpreters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__RESULT);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getImagingStudies() {
		if (imagingStudies == null) {
			imagingStudies = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY);
		}
		return imagingStudies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagnosticReportMedia> getMedias() {
		if (medias == null) {
			medias = new EObjectContainmentEList<DiagnosticReportMedia>(DiagnosticReportMedia.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA);
		}
		return medias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusion(org.eclipse.mdht.hl7.fhir.dataTypes.String newConclusion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, oldConclusion, newConclusion);
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
	public void setConclusion(org.eclipse.mdht.hl7.fhir.dataTypes.String newConclusion) {
		if (newConclusion != conclusion) {
			NotificationChain msgs = null;
			if (conclusion != null)
				msgs = ((InternalEObject)conclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			if (newConclusion != null)
				msgs = ((InternalEObject)newConclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, null, msgs);
			msgs = basicSetConclusion(newConclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION, newConclusion, newConclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getConclusionCodes() {
		if (conclusionCodes == null) {
			conclusionCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE);
		}
		return conclusionCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getPresentedForms() {
		if (presentedForms == null) {
			presentedForms = new EObjectContainmentEList<Attachment>(Attachment.class, this, ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM);
		}
		return presentedForms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				return basicSetEffectivex(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				return basicSetIssued(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return ((InternalEList<?>)getResultsInterpreters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return ((InternalEList<?>)getSpecimens()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return ((InternalEList<?>)getImagingStudies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA:
				return ((InternalEList<?>)getMedias()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return basicSetConclusion(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return ((InternalEList<?>)getConclusionCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return ((InternalEList<?>)getPresentedForms()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				return getStatus();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return getCategories();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				return getCode();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return getSubject();
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				return getEffectivex();
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				return getIssued();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return getPerformers();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return getResultsInterpreters();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return getSpecimens();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				return getResults();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return getImagingStudies();
			case ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA:
				return getMedias();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return getConclusion();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return getConclusionCodes();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return getPresentedForms();
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				getResultsInterpreters().clear();
				getResultsInterpreters().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				getResults().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				getImagingStudies().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA:
				getMedias().clear();
				getMedias().addAll((Collection<? extends DiagnosticReportMedia>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				getConclusionCodes().clear();
				getConclusionCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
				getPresentedForms().addAll((Collection<? extends Attachment>)newValue);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				setIssued((Instant)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				getResultsInterpreters().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				getSpecimens().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				getResults().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				getImagingStudies().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA:
				getMedias().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				setConclusion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				getConclusionCodes().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				getPresentedForms().clear();
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
			case ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__STATUS:
				return status != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CODE:
				return code != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT:
				return subject != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED:
				return issued != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER:
				return resultsInterpreters != null && !resultsInterpreters.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__RESULT:
				return results != null && !results.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY:
				return imagingStudies != null && !imagingStudies.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA:
				return medias != null && !medias.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION:
				return conclusion != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE:
				return conclusionCodes != null && !conclusionCodes.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM:
				return presentedForms != null && !presentedForms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportImpl
