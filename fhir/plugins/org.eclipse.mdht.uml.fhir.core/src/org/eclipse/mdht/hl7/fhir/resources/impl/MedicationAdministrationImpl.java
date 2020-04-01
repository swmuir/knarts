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

import org.eclipse.mdht.hl7.fhir.resources.MedicationAdministration;
import org.eclipse.mdht.hl7.fhir.resources.MedicationAdministrationDosage;
import org.eclipse.mdht.hl7.fhir.resources.MedicationAdministrationPerformer;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getDevices <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getDosage <em>Dosage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationAdministrationImpl#getEventHistories <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationImpl extends DomainResourceImpl implements MedicationAdministration {
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
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiates;

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
	 * The cached value of the '{@link #getStatusReasons() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReasons;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

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
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationAdministrationPerformer> performers;

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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getDevices() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> devices;

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
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministrationDosage dosage;

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
		return ResourcesPackage.eINSTANCE.getMedicationAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getStatusReasons() {
		if (statusReasons == null) {
			statusReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON);
		}
		return statusReasons;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX, oldMedicationx, newMedicationx);
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
	public void setMedicationx(DataType newMedicationx) {
		if (newMedicationx != medicationx) {
			NotificationChain msgs = null;
			if (medicationx != null)
				msgs = ((InternalEObject)medicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX, null, msgs);
			if (newMedicationx != null)
				msgs = ((InternalEObject)newMedicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX, null, msgs);
			msgs = basicSetMedicationx(newMedicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX, newMedicationx, newMedicationx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT, oldContext, newContext);
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
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX, oldEffectivex, newEffectivex);
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
				msgs = ((InternalEObject)effectivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX, null, msgs);
			if (newEffectivex != null)
				msgs = ((InternalEObject)newEffectivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX, null, msgs);
			msgs = basicSetEffectivex(newEffectivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX, newEffectivex, newEffectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationAdministrationPerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<MedicationAdministrationPerformer>(MedicationAdministrationPerformer.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE);
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
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST, oldRequest, newRequest);
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
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE, oldDosage, newDosage);
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
	public void setDosage(MedicationAdministrationDosage newDosage) {
		if (newDosage != dosage) {
			NotificationChain msgs = null;
			if (dosage != null)
				msgs = ((InternalEObject)dosage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			if (newDosage != null)
				msgs = ((InternalEObject)newDosage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE, null, msgs);
			msgs = basicSetDosage(newDosage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE, newDosage, newDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEventHistories() {
		if (eventHistories == null) {
			eventHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY);
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
			case ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES:
				return ((InternalEList<?>)getInstantiates()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return ((InternalEList<?>)getStatusReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				return basicSetMedicationx(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX:
				return basicSetEffectivex(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return basicSetRequest(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return basicSetDosage(null, msgs);
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES:
				return getInstantiates();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return getPartOfs();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return getStatusReasons();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return getCategory();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				return getMedicationx();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT:
				return getContext();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX:
				return getEffectivex();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return getPerformers();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return getRequest();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return getDevices();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return getDosage();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES:
				getInstantiates().clear();
				getInstantiates().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				getStatusReasons().clear();
				getStatusReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				setMedicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT:
				setContext((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends MedicationAdministrationPerformer>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST:
				setRequest((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)newValue);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES:
				getInstantiates().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				getStatusReasons().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				setMedicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT:
				setContext((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST:
				setRequest((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE:
				getDevices().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				setDosage((MedicationAdministrationDosage)null);
				return;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_ADMINISTRATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__INSTANTIATES:
				return instantiates != null && !instantiates.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__STATUS_REASON:
				return statusReasons != null && !statusReasons.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CATEGORY:
				return category != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__CONTEXT:
				return context != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__REQUEST:
				return request != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DEVICE:
				return devices != null && !devices.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_ADMINISTRATION__DOSAGE:
				return dosage != null;
			case ResourcesPackage.MEDICATION_ADMINISTRATION__EVENT_HISTORY:
				return eventHistories != null && !eventHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationImpl
