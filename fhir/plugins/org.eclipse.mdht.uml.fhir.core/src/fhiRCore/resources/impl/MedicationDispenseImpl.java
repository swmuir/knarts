/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MedicationDispense;
import fhiRCore.resources.MedicationDispensePerformer;
import fhiRCore.resources.MedicationDispenseSubstitution;
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
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getStatusReasonx <em>Status Reasonx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getAuthorizingPrescriptions <em>Authorizing Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getReceivers <em>Receiver</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getDetectedIssues <em>Detected Issue</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationDispenseImpl#getEventHistories <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseImpl extends DomainResourceImpl implements MedicationDispense {
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
	 * The cached value of the '{@link #getStatusReasonx() <em>Status Reasonx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReasonx()
	 * @generated
	 * @ordered
	 */
	protected DataType statusReasonx;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationDispensePerformer> performers;

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
	 * The cached value of the '{@link #getAuthorizingPrescriptions() <em>Authorizing Prescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingPrescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authorizingPrescriptions;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected Quantity daysSupply;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> receivers;

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
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispenseSubstitution substitution;

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
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__PART_OF);
		}
		return partOfs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getStatusReasonx() {
		return statusReasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusReasonx(DataType newStatusReasonx, NotificationChain msgs) {
		DataType oldStatusReasonx = statusReasonx;
		statusReasonx = newStatusReasonx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX, oldStatusReasonx, newStatusReasonx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReasonx(DataType newStatusReasonx) {
		if (newStatusReasonx != statusReasonx) {
			NotificationChain msgs = null;
			if (statusReasonx != null)
				msgs = ((InternalEObject)statusReasonx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX, null, msgs);
			if (newStatusReasonx != null)
				msgs = ((InternalEObject)newStatusReasonx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX, null, msgs);
			msgs = basicSetStatusReasonx(newStatusReasonx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX, newStatusReasonx, newStatusReasonx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, oldMedicationx, newMedicationx);
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
				msgs = ((InternalEObject)medicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, null, msgs);
			if (newMedicationx != null)
				msgs = ((InternalEObject)newMedicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, null, msgs);
			msgs = basicSetMedicationx(newMedicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX, newMedicationx, newMedicationx));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationDispensePerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<MedicationDispensePerformer>(MedicationDispensePerformer.class, this, ResourcesPackage.MEDICATION_DISPENSE__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthorizingPrescriptions() {
		if (authorizingPrescriptions == null) {
			authorizingPrescriptions = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION);
		}
		return authorizingPrescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDaysSupply() {
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaysSupply(Quantity newDaysSupply, NotificationChain msgs) {
		Quantity oldDaysSupply = daysSupply;
		daysSupply = newDaysSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, newDaysSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysSupply(Quantity newDaysSupply) {
		if (newDaysSupply != daysSupply) {
			NotificationChain msgs = null;
			if (daysSupply != null)
				msgs = ((InternalEObject)daysSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			if (newDaysSupply != null)
				msgs = ((InternalEObject)newDaysSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			msgs = basicSetDaysSupply(newDaysSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, newDaysSupply, newDaysSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPrepared(DateTime newWhenPrepared, NotificationChain msgs) {
		DateTime oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, newWhenPrepared);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(DateTime newWhenPrepared) {
		if (newWhenPrepared != whenPrepared) {
			NotificationChain msgs = null;
			if (whenPrepared != null)
				msgs = ((InternalEObject)whenPrepared).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			if (newWhenPrepared != null)
				msgs = ((InternalEObject)newWhenPrepared).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			msgs = basicSetWhenPrepared(newWhenPrepared, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED, newWhenPrepared, newWhenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenHandedOver(DateTime newWhenHandedOver, NotificationChain msgs) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, newWhenHandedOver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		if (newWhenHandedOver != whenHandedOver) {
			NotificationChain msgs = null;
			if (whenHandedOver != null)
				msgs = ((InternalEObject)whenHandedOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			if (newWhenHandedOver != null)
				msgs = ((InternalEObject)newWhenHandedOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			msgs = basicSetWhenHandedOver(newWhenHandedOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, newWhenHandedOver, newWhenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__RECEIVER);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_DISPENSE__NOTE);
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
			dosageInstructions = new EObjectContainmentEList<Dosage>(Dosage.class, this, ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationDispenseSubstitution newSubstitution, NotificationChain msgs) {
		MedicationDispenseSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationDispenseSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDetectedIssues() {
		if (detectedIssues == null) {
			detectedIssues = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE);
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
			eventHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY);
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX:
				return basicSetStatusReasonx(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				return basicSetMedicationx(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return ((InternalEList<?>)getAuthorizingPrescriptions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return basicSetDaysSupply(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return basicSetWhenPrepared(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return basicSetWhenHandedOver(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstructions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return ((InternalEList<?>)getDetectedIssues()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_DISPENSE__PART_OF:
				return getPartOfs();
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX:
				return getStatusReasonx();
			case ResourcesPackage.MEDICATION_DISPENSE__CATEGORY:
				return getCategory();
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				return getMedicationx();
			case ResourcesPackage.MEDICATION_DISPENSE__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDICATION_DISPENSE__CONTEXT:
				return getContext();
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.MEDICATION_DISPENSE__PERFORMER:
				return getPerformers();
			case ResourcesPackage.MEDICATION_DISPENSE__LOCATION:
				return getLocation();
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return getAuthorizingPrescriptions();
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				return getType();
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				return getQuantity();
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return getDaysSupply();
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return getWhenPrepared();
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return getWhenHandedOver();
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				return getDestination();
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				return getReceivers();
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return getSubstitution();
			case ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return getDetectedIssues();
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX:
				setStatusReasonx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends MedicationDispensePerformer>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				getAuthorizingPrescriptions().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends Dosage>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				getDetectedIssues().clear();
				getDetectedIssues().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX:
				setStatusReasonx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__CONTEXT:
				setContext((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				getDetectedIssues().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
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
			case ResourcesPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_DISPENSE__STATUS_REASONX:
				return statusReasonx != null;
			case ResourcesPackage.MEDICATION_DISPENSE__CATEGORY:
				return category != null;
			case ResourcesPackage.MEDICATION_DISPENSE__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_DISPENSE__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICATION_DISPENSE__CONTEXT:
				return context != null;
			case ResourcesPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__LOCATION:
				return location != null;
			case ResourcesPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return authorizingPrescriptions != null && !authorizingPrescriptions.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_DISPENSE__QUANTITY:
				return quantity != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return daysSupply != null;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case ResourcesPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DESTINATION:
				return destination != null;
			case ResourcesPackage.MEDICATION_DISPENSE__RECEIVER:
				return receivers != null && !receivers.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return substitution != null;
			case ResourcesPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return detectedIssues != null && !detectedIssues.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return eventHistories != null && !eventHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseImpl
