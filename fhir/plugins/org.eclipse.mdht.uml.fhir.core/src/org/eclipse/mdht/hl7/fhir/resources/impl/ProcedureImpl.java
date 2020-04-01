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
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.PlanDefinition;
import org.eclipse.mdht.hl7.fhir.resources.Procedure;
import org.eclipse.mdht.hl7.fhir.resources.ProcedureFocalDevice;
import org.eclipse.mdht.hl7.fhir.resources.ProcedurePerformer;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getPerformedx <em>Performedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getReports <em>Report</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getComplications <em>Complication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getComplicationDetails <em>Complication Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getFollowUps <em>Follow Up</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getFocalDevices <em>Focal Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getUsedReferences <em>Used Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ProcedureImpl#getUsedCodes <em>Used Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinition> instantiatesCanonicals;

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
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getPerformedx() <em>Performedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedx()
	 * @generated
	 * @ordered
	 */
	protected DataType performedx;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performers;

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
	 * The cached value of the '{@link #getBodySites() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySites;

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
	 * The cached value of the '{@link #getReports() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reports;

	/**
	 * The cached value of the '{@link #getComplications() <em>Complication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complications;

	/**
	 * The cached value of the '{@link #getComplicationDetails() <em>Complication Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> complicationDetails;

	/**
	 * The cached value of the '{@link #getFollowUps() <em>Follow Up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUps()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUps;

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
	 * The cached value of the '{@link #getFocalDevices() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevices;

	/**
	 * The cached value of the '{@link #getUsedReferences() <em>Used Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> usedReferences;

	/**
	 * The cached value of the '{@link #getUsedCodes() <em>Used Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> usedCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.PROCEDURE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<PlanDefinition>(PlanDefinition.class, this, ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.PROCEDURE__INSTANTIATES_URI);
		}
		return instantiatesUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__PART_OF);
		}
		return partOfs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__STATUS_REASON, oldStatusReason, newStatusReason);
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
	public void setStatusReason(CodeableConcept newStatusReason) {
		if (newStatusReason != statusReason) {
			NotificationChain msgs = null;
			if (statusReason != null)
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getPerformedx() {
		return performedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedx(DataType newPerformedx, NotificationChain msgs) {
		DataType oldPerformedx = performedx;
		performedx = newPerformedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__PERFORMEDX, oldPerformedx, newPerformedx);
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
	public void setPerformedx(DataType newPerformedx) {
		if (newPerformedx != performedx) {
			NotificationChain msgs = null;
			if (performedx != null)
				msgs = ((InternalEObject)performedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__PERFORMEDX, null, msgs);
			if (newPerformedx != null)
				msgs = ((InternalEObject)newPerformedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__PERFORMEDX, null, msgs);
			msgs = basicSetPerformedx(newPerformedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__PERFORMEDX, newPerformedx, newPerformedx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__RECORDER, oldRecorder, newRecorder);
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
				msgs = ((InternalEObject)recorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__RECORDER, null, msgs);
			if (newRecorder != null)
				msgs = ((InternalEObject)newRecorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__RECORDER, null, msgs);
			msgs = basicSetRecorder(newRecorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__RECORDER, newRecorder, newRecorder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__ASSERTER, oldAsserter, newAsserter);
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
				msgs = ((InternalEObject)asserter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__ASSERTER, null, msgs);
			if (newAsserter != null)
				msgs = ((InternalEObject)newAsserter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__ASSERTER, null, msgs);
			msgs = basicSetAsserter(newAsserter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__ASSERTER, newAsserter, newAsserter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedurePerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, ResourcesPackage.PROCEDURE__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__BODY_SITE);
		}
		return bodySites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReports() {
		if (reports == null) {
			reports = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__REPORT);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getComplications() {
		if (complications == null) {
			complications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__COMPLICATION);
		}
		return complications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getComplicationDetails() {
		if (complicationDetails == null) {
			complicationDetails = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL);
		}
		return complicationDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFollowUps() {
		if (followUps == null) {
			followUps = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.PROCEDURE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureFocalDevice> getFocalDevices() {
		if (focalDevices == null) {
			focalDevices = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, ResourcesPackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUsedReferences() {
		if (usedReferences == null) {
			usedReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.PROCEDURE__USED_REFERENCE);
		}
		return usedReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getUsedCodes() {
		if (usedCodes == null) {
			usedCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCEDURE__USED_CODE);
		}
		return usedCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.PROCEDURE__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.PROCEDURE__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.PROCEDURE__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				return basicSetPerformedx(null, msgs);
			case ResourcesPackage.PROCEDURE__RECORDER:
				return basicSetRecorder(null, msgs);
			case ResourcesPackage.PROCEDURE__ASSERTER:
				return basicSetAsserter(null, msgs);
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				return ((InternalEList<?>)getBodySites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.PROCEDURE__REPORT:
				return ((InternalEList<?>)getReports()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				return ((InternalEList<?>)getComplications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL:
				return ((InternalEList<?>)getComplicationDetails()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				return ((InternalEList<?>)getFollowUps()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				return ((InternalEList<?>)getUsedReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROCEDURE__USED_CODE:
				return ((InternalEList<?>)getUsedCodes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.PROCEDURE__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.PROCEDURE__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.PROCEDURE__PART_OF:
				return getPartOfs();
			case ResourcesPackage.PROCEDURE__STATUS:
				return getStatus();
			case ResourcesPackage.PROCEDURE__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.PROCEDURE__CATEGORY:
				return getCategory();
			case ResourcesPackage.PROCEDURE__CODE:
				return getCode();
			case ResourcesPackage.PROCEDURE__SUBJECT:
				return getSubject();
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				return getPerformedx();
			case ResourcesPackage.PROCEDURE__RECORDER:
				return getRecorder();
			case ResourcesPackage.PROCEDURE__ASSERTER:
				return getAsserter();
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return getPerformers();
			case ResourcesPackage.PROCEDURE__LOCATION:
				return getLocation();
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				return getBodySites();
			case ResourcesPackage.PROCEDURE__OUTCOME:
				return getOutcome();
			case ResourcesPackage.PROCEDURE__REPORT:
				return getReports();
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				return getComplications();
			case ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL:
				return getComplicationDetails();
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUps();
			case ResourcesPackage.PROCEDURE__NOTE:
				return getNotes();
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevices();
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				return getUsedReferences();
			case ResourcesPackage.PROCEDURE__USED_CODE:
				return getUsedCodes();
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends PlanDefinition>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.PROCEDURE__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)newValue);
				return;
			case ResourcesPackage.PROCEDURE__RECORDER:
				setRecorder((Reference)newValue);
				return;
			case ResourcesPackage.PROCEDURE__ASSERTER:
				setAsserter((Reference)newValue);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCEDURE__REPORT:
				getReports().clear();
				getReports().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				getComplications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL:
				getComplicationDetails().clear();
				getComplicationDetails().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				getFollowUps().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				getFocalDevices().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				getUsedReferences().clear();
				getUsedReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.PROCEDURE__USED_CODE:
				getUsedCodes().clear();
				getUsedCodes().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.PROCEDURE__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.PROCEDURE__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.PROCEDURE__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.PROCEDURE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.PROCEDURE__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				setPerformedx((DataType)null);
				return;
			case ResourcesPackage.PROCEDURE__RECORDER:
				setRecorder((Reference)null);
				return;
			case ResourcesPackage.PROCEDURE__ASSERTER:
				setAsserter((Reference)null);
				return;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.PROCEDURE__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				getBodySites().clear();
				return;
			case ResourcesPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCEDURE__REPORT:
				getReports().clear();
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				getComplications().clear();
				return;
			case ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL:
				getComplicationDetails().clear();
				return;
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				getFollowUps().clear();
				return;
			case ResourcesPackage.PROCEDURE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevices().clear();
				return;
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				getUsedReferences().clear();
				return;
			case ResourcesPackage.PROCEDURE__USED_CODE:
				getUsedCodes().clear();
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
			case ResourcesPackage.PROCEDURE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PROCEDURE__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.PROCEDURE__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.PROCEDURE__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.PROCEDURE__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.PROCEDURE__STATUS:
				return status != null;
			case ResourcesPackage.PROCEDURE__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.PROCEDURE__CATEGORY:
				return category != null;
			case ResourcesPackage.PROCEDURE__CODE:
				return code != null;
			case ResourcesPackage.PROCEDURE__SUBJECT:
				return subject != null;
			case ResourcesPackage.PROCEDURE__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.PROCEDURE__PERFORMEDX:
				return performedx != null;
			case ResourcesPackage.PROCEDURE__RECORDER:
				return recorder != null;
			case ResourcesPackage.PROCEDURE__ASSERTER:
				return asserter != null;
			case ResourcesPackage.PROCEDURE__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.PROCEDURE__LOCATION:
				return location != null;
			case ResourcesPackage.PROCEDURE__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.PROCEDURE__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.PROCEDURE__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case ResourcesPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.PROCEDURE__REPORT:
				return reports != null && !reports.isEmpty();
			case ResourcesPackage.PROCEDURE__COMPLICATION:
				return complications != null && !complications.isEmpty();
			case ResourcesPackage.PROCEDURE__COMPLICATION_DETAIL:
				return complicationDetails != null && !complicationDetails.isEmpty();
			case ResourcesPackage.PROCEDURE__FOLLOW_UP:
				return followUps != null && !followUps.isEmpty();
			case ResourcesPackage.PROCEDURE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevices != null && !focalDevices.isEmpty();
			case ResourcesPackage.PROCEDURE__USED_REFERENCE:
				return usedReferences != null && !usedReferences.isEmpty();
			case ResourcesPackage.PROCEDURE__USED_CODE:
				return usedCodes != null && !usedCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
