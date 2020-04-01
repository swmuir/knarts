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
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;

import org.eclipse.mdht.hl7.fhir.resources.ImagingStudy;
import org.eclipse.mdht.hl7.fhir.resources.ImagingStudySeries;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getModalities <em>Modality</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getInterpreters <em>Interpreter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getProcedureCodes <em>Procedure Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImagingStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudyImpl extends DomainResourceImpl implements ImagingStudy {
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
	 * The cached value of the '{@link #getModalities() <em>Modality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalities()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modalities;

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
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

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
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Reference referrer;

	/**
	 * The cached value of the '{@link #getInterpreters() <em>Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> interpreters;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoints;

	/**
	 * The cached value of the '{@link #getNumberOfSeries() <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeries()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfSeries;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getProcedureReference() <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureReference()
	 * @generated
	 * @ordered
	 */
	protected Reference procedureReference;

	/**
	 * The cached value of the '{@link #getProcedureCodes() <em>Procedure Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> procedureCodes;

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
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImagingStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.IMAGING_STUDY__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getModalities() {
		if (modalities == null) {
			modalities = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.IMAGING_STUDY__MODALITY);
		}
		return modalities;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__STARTED, oldStarted, newStarted);
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
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__STARTED, newStarted, newStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferrer(Reference newReferrer, NotificationChain msgs) {
		Reference oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__REFERRER, oldReferrer, newReferrer);
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
	public void setReferrer(Reference newReferrer) {
		if (newReferrer != referrer) {
			NotificationChain msgs = null;
			if (referrer != null)
				msgs = ((InternalEObject)referrer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__REFERRER, null, msgs);
			if (newReferrer != null)
				msgs = ((InternalEObject)newReferrer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__REFERRER, null, msgs);
			msgs = basicSetReferrer(newReferrer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__REFERRER, newReferrer, newReferrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInterpreters() {
		if (interpreters == null) {
			interpreters = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY__INTERPRETER);
		}
		return interpreters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumberOfSeries() {
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeries(UnsignedInt newNumberOfSeries, NotificationChain msgs) {
		UnsignedInt oldNumberOfSeries = numberOfSeries;
		numberOfSeries = newNumberOfSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, newNumberOfSeries);
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
	public void setNumberOfSeries(UnsignedInt newNumberOfSeries) {
		if (newNumberOfSeries != numberOfSeries) {
			NotificationChain msgs = null;
			if (numberOfSeries != null)
				msgs = ((InternalEObject)numberOfSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			if (newNumberOfSeries != null)
				msgs = ((InternalEObject)newNumberOfSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			msgs = basicSetNumberOfSeries(newNumberOfSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES, newNumberOfSeries, newNumberOfSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
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
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProcedureReference() {
		return procedureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureReference(Reference newProcedureReference, NotificationChain msgs) {
		Reference oldProcedureReference = procedureReference;
		procedureReference = newProcedureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, oldProcedureReference, newProcedureReference);
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
	public void setProcedureReference(Reference newProcedureReference) {
		if (newProcedureReference != procedureReference) {
			NotificationChain msgs = null;
			if (procedureReference != null)
				msgs = ((InternalEObject)procedureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, null, msgs);
			if (newProcedureReference != null)
				msgs = ((InternalEObject)newProcedureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, null, msgs);
			msgs = basicSetProcedureReference(newProcedureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE, newProcedureReference, newProcedureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProcedureCodes() {
		if (procedureCodes == null) {
			procedureCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE);
		}
		return procedureCodes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMAGING_STUDY__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.IMAGING_STUDY__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImagingStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingStudySeries>(ImagingStudySeries.class, this, ResourcesPackage.IMAGING_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__MODALITY:
				return ((InternalEList<?>)getModalities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				return basicSetStarted(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				return basicSetReferrer(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				return ((InternalEList<?>)getInterpreters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return basicSetNumberOfSeries(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return basicSetProcedureReference(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return ((InternalEList<?>)getProcedureCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.IMAGING_STUDY__STATUS:
				return getStatus();
			case ResourcesPackage.IMAGING_STUDY__MODALITY:
				return getModalities();
			case ResourcesPackage.IMAGING_STUDY__SUBJECT:
				return getSubject();
			case ResourcesPackage.IMAGING_STUDY__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				return getStarted();
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				return getReferrer();
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				return getInterpreters();
			case ResourcesPackage.IMAGING_STUDY__ENDPOINT:
				return getEndpoints();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return getNumberOfSeries();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return getProcedureReference();
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return getProcedureCodes();
			case ResourcesPackage.IMAGING_STUDY__LOCATION:
				return getLocation();
			case ResourcesPackage.IMAGING_STUDY__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.IMAGING_STUDY__NOTE:
				return getNotes();
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return getSeries();
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
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__MODALITY:
				getModalities().clear();
				getModalities().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreters().clear();
				getInterpreters().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCodes().clear();
				getProcedureCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingStudySeries>)newValue);
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
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__MODALITY:
				getModalities().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreters().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoints().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCodes().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
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
			case ResourcesPackage.IMAGING_STUDY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__STATUS:
				return status != null;
			case ResourcesPackage.IMAGING_STUDY__MODALITY:
				return modalities != null && !modalities.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__SUBJECT:
				return subject != null;
			case ResourcesPackage.IMAGING_STUDY__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.IMAGING_STUDY__STARTED:
				return started != null;
			case ResourcesPackage.IMAGING_STUDY__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__REFERRER:
				return referrer != null;
			case ResourcesPackage.IMAGING_STUDY__INTERPRETER:
				return interpreters != null && !interpreters.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return numberOfSeries != null;
			case ResourcesPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return procedureReference != null;
			case ResourcesPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return procedureCodes != null && !procedureCodes.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__LOCATION:
				return location != null;
			case ResourcesPackage.IMAGING_STUDY__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.IMAGING_STUDY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMAGING_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyImpl
