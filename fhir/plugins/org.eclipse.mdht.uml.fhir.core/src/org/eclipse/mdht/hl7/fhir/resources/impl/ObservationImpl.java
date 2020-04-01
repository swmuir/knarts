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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Range;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.Observation;
import org.eclipse.mdht.hl7.fhir.resources.ObservationComponent;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getFoci <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getInterpretations <em>Interpretation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getHasMembers <em>Has Member</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getComponents <em>Component</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationImpl#getReferenceRanges <em>Reference Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends DomainResourceImpl implements Observation {
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
	 * The cached value of the '{@link #getFoci() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> foci;

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
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretations() <em>Interpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> interpretations;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Reference specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getHasMembers() <em>Has Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> hasMembers;

	/**
	 * The cached value of the '{@link #getDerivedFroms() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFroms;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationComponent> components;

	/**
	 * The cached value of the '{@link #getReferenceRanges() <em>Reference Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> referenceRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.OBSERVATION__IDENTIFIER);
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
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__BASED_ON);
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
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__PART_OF);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION__CATEGORY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getFoci() {
		if (foci == null) {
			foci = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__FOCUS);
		}
		return foci;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__ENCOUNTER, newEncounter, newEncounter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__EFFECTIVEX, oldEffectivex, newEffectivex);
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
				msgs = ((InternalEObject)effectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__EFFECTIVEX, null, msgs);
			if (newEffectivex != null)
				msgs = ((InternalEObject)newEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__EFFECTIVEX, null, msgs);
			msgs = basicSetEffectivex(newEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__EFFECTIVEX, newEffectivex, newEffectivex));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__VALUEX, oldValuex, newValuex);
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
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
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
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getInterpretations() {
		if (interpretations == null) {
			interpretations = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION__INTERPRETATION);
		}
		return interpretations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.OBSERVATION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Reference newSpecimen, NotificationChain msgs) {
		Reference oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__SPECIMEN, oldSpecimen, newSpecimen);
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
	public void setSpecimen(Reference newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getHasMembers() {
		if (hasMembers == null) {
			hasMembers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__HAS_MEMBER);
		}
		return hasMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDerivedFroms() {
		if (derivedFroms == null) {
			derivedFroms = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.OBSERVATION__DERIVED_FROM);
		}
		return derivedFroms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ObservationComponent>(ObservationComponent.class, this, ResourcesPackage.OBSERVATION__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Range> getReferenceRanges() {
		if (referenceRanges == null) {
			referenceRanges = new EObjectResolvingEList<Range>(Range.class, this, ResourcesPackage.OBSERVATION__REFERENCE_RANGE);
		}
		return referenceRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.OBSERVATION__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.OBSERVATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.OBSERVATION__FOCUS:
				return ((InternalEList<?>)getFoci()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.OBSERVATION__EFFECTIVEX:
				return basicSetEffectivex(null, msgs);
			case ResourcesPackage.OBSERVATION__ISSUED:
				return basicSetIssued(null, msgs);
			case ResourcesPackage.OBSERVATION__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__VALUEX:
				return basicSetValuex(null, msgs);
			case ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case ResourcesPackage.OBSERVATION__INTERPRETATION:
				return ((InternalEList<?>)getInterpretations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.OBSERVATION__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.OBSERVATION__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case ResourcesPackage.OBSERVATION__DEVICE:
				return basicSetDevice(null, msgs);
			case ResourcesPackage.OBSERVATION__HAS_MEMBER:
				return ((InternalEList<?>)getHasMembers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFroms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OBSERVATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.OBSERVATION__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.OBSERVATION__PART_OF:
				return getPartOfs();
			case ResourcesPackage.OBSERVATION__STATUS:
				return getStatus();
			case ResourcesPackage.OBSERVATION__CATEGORY:
				return getCategories();
			case ResourcesPackage.OBSERVATION__CODE:
				return getCode();
			case ResourcesPackage.OBSERVATION__SUBJECT:
				return getSubject();
			case ResourcesPackage.OBSERVATION__FOCUS:
				return getFoci();
			case ResourcesPackage.OBSERVATION__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.OBSERVATION__EFFECTIVEX:
				return getEffectivex();
			case ResourcesPackage.OBSERVATION__ISSUED:
				return getIssued();
			case ResourcesPackage.OBSERVATION__PERFORMER:
				return getPerformers();
			case ResourcesPackage.OBSERVATION__VALUEX:
				return getValuex();
			case ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case ResourcesPackage.OBSERVATION__INTERPRETATION:
				return getInterpretations();
			case ResourcesPackage.OBSERVATION__NOTE:
				return getNotes();
			case ResourcesPackage.OBSERVATION__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.OBSERVATION__METHOD:
				return getMethod();
			case ResourcesPackage.OBSERVATION__SPECIMEN:
				return getSpecimen();
			case ResourcesPackage.OBSERVATION__DEVICE:
				return getDevice();
			case ResourcesPackage.OBSERVATION__HAS_MEMBER:
				return getHasMembers();
			case ResourcesPackage.OBSERVATION__DERIVED_FROM:
				return getDerivedFroms();
			case ResourcesPackage.OBSERVATION__COMPONENT:
				return getComponents();
			case ResourcesPackage.OBSERVATION__REFERENCE_RANGE:
				return getReferenceRanges();
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
			case ResourcesPackage.OBSERVATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.OBSERVATION__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION__FOCUS:
				getFoci().clear();
				getFoci().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.OBSERVATION__ISSUED:
				setIssued((Instant)newValue);
				return;
			case ResourcesPackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION__INTERPRETATION:
				getInterpretations().clear();
				getInterpretations().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION__DEVICE:
				setDevice((Reference)newValue);
				return;
			case ResourcesPackage.OBSERVATION__HAS_MEMBER:
				getHasMembers().clear();
				getHasMembers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__DERIVED_FROM:
				getDerivedFroms().clear();
				getDerivedFroms().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ObservationComponent>)newValue);
				return;
			case ResourcesPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
				getReferenceRanges().addAll((Collection<? extends Range>)newValue);
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
			case ResourcesPackage.OBSERVATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.OBSERVATION__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.OBSERVATION__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.OBSERVATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.OBSERVATION__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.OBSERVATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION__FOCUS:
				getFoci().clear();
				return;
			case ResourcesPackage.OBSERVATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.OBSERVATION__ISSUED:
				setIssued((Instant)null);
				return;
			case ResourcesPackage.OBSERVATION__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.OBSERVATION__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION__INTERPRETATION:
				getInterpretations().clear();
				return;
			case ResourcesPackage.OBSERVATION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.OBSERVATION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION__DEVICE:
				setDevice((Reference)null);
				return;
			case ResourcesPackage.OBSERVATION__HAS_MEMBER:
				getHasMembers().clear();
				return;
			case ResourcesPackage.OBSERVATION__DERIVED_FROM:
				getDerivedFroms().clear();
				return;
			case ResourcesPackage.OBSERVATION__COMPONENT:
				getComponents().clear();
				return;
			case ResourcesPackage.OBSERVATION__REFERENCE_RANGE:
				getReferenceRanges().clear();
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
			case ResourcesPackage.OBSERVATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.OBSERVATION__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.OBSERVATION__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.OBSERVATION__STATUS:
				return status != null;
			case ResourcesPackage.OBSERVATION__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.OBSERVATION__CODE:
				return code != null;
			case ResourcesPackage.OBSERVATION__SUBJECT:
				return subject != null;
			case ResourcesPackage.OBSERVATION__FOCUS:
				return foci != null && !foci.isEmpty();
			case ResourcesPackage.OBSERVATION__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.OBSERVATION__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.OBSERVATION__ISSUED:
				return issued != null;
			case ResourcesPackage.OBSERVATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.OBSERVATION__VALUEX:
				return valuex != null;
			case ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case ResourcesPackage.OBSERVATION__INTERPRETATION:
				return interpretations != null && !interpretations.isEmpty();
			case ResourcesPackage.OBSERVATION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.OBSERVATION__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.OBSERVATION__METHOD:
				return method != null;
			case ResourcesPackage.OBSERVATION__SPECIMEN:
				return specimen != null;
			case ResourcesPackage.OBSERVATION__DEVICE:
				return device != null;
			case ResourcesPackage.OBSERVATION__HAS_MEMBER:
				return hasMembers != null && !hasMembers.isEmpty();
			case ResourcesPackage.OBSERVATION__DERIVED_FROM:
				return derivedFroms != null && !derivedFroms.isEmpty();
			case ResourcesPackage.OBSERVATION__COMPONENT:
				return components != null && !components.isEmpty();
			case ResourcesPackage.OBSERVATION__REFERENCE_RANGE:
				return referenceRanges != null && !referenceRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationImpl
