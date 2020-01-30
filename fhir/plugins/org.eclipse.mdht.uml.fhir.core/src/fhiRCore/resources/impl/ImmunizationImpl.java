/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Immunization;
import fhiRCore.resources.ImmunizationEducation;
import fhiRCore.resources.ImmunizationPerformer;
import fhiRCore.resources.ImmunizationProtocolApplied;
import fhiRCore.resources.ImmunizationReaction;
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
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getIsSubpotent <em>Is Subpotent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getSubpotentReasons <em>Subpotent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getEducations <em>Education</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getProgramEligibilities <em>Program Eligibility</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getFundingSource <em>Funding Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getReactions <em>Reaction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationImpl#getProtocolApplieds <em>Protocol Applied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationImpl extends DomainResourceImpl implements Immunization {
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
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineCode;

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
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected DateTime recorded;

	/**
	 * The cached value of the '{@link #getPrimarySource() <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySource()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean primarySource;

	/**
	 * The cached value of the '{@link #getReportOrigin() <em>Report Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportOrigin()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reportOrigin;

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
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationPerformer> performers;

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
	 * The cached value of the '{@link #getIsSubpotent() <em>Is Subpotent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubpotent()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean isSubpotent;

	/**
	 * The cached value of the '{@link #getSubpotentReasons() <em>Subpotent Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpotentReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subpotentReasons;

	/**
	 * The cached value of the '{@link #getEducations() <em>Education</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationEducation> educations;

	/**
	 * The cached value of the '{@link #getProgramEligibilities() <em>Program Eligibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramEligibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programEligibilities;

	/**
	 * The cached value of the '{@link #getFundingSource() <em>Funding Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundingSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundingSource;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationReaction> reactions;

	/**
	 * The cached value of the '{@link #getProtocolApplieds() <em>Protocol Applied</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolApplieds()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationProtocolApplied> protocolApplieds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.IMMUNIZATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__STATUS_REASON, oldStatusReason, newStatusReason);
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
				msgs = ((InternalEObject)statusReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__STATUS_REASON, null, msgs);
			if (newStatusReason != null)
				msgs = ((InternalEObject)newStatusReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__STATUS_REASON, null, msgs);
			msgs = basicSetStatusReason(newStatusReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__STATUS_REASON, newStatusReason, newStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVaccineCode() {
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaccineCode(CodeableConcept newVaccineCode, NotificationChain msgs) {
		CodeableConcept oldVaccineCode = vaccineCode;
		vaccineCode = newVaccineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__VACCINE_CODE, oldVaccineCode, newVaccineCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineCode(CodeableConcept newVaccineCode) {
		if (newVaccineCode != vaccineCode) {
			NotificationChain msgs = null;
			if (vaccineCode != null)
				msgs = ((InternalEObject)vaccineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			if (newVaccineCode != null)
				msgs = ((InternalEObject)newVaccineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			msgs = basicSetVaccineCode(newVaccineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__VACCINE_CODE, newVaccineCode, newVaccineCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecorded(DateTime newRecorded, NotificationChain msgs) {
		DateTime oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__RECORDED, oldRecorded, newRecorded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(DateTime newRecorded) {
		if (newRecorded != recorded) {
			NotificationChain msgs = null;
			if (recorded != null)
				msgs = ((InternalEObject)recorded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__RECORDED, null, msgs);
			if (newRecorded != null)
				msgs = ((InternalEObject)newRecorded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__RECORDED, null, msgs);
			msgs = basicSetRecorded(newRecorded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__RECORDED, newRecorded, newRecorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getPrimarySource() {
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimarySource(fhiRCore.dataTypes.Boolean newPrimarySource, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldPrimarySource = primarySource;
		primarySource = newPrimarySource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, oldPrimarySource, newPrimarySource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimarySource(fhiRCore.dataTypes.Boolean newPrimarySource) {
		if (newPrimarySource != primarySource) {
			NotificationChain msgs = null;
			if (primarySource != null)
				msgs = ((InternalEObject)primarySource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			if (newPrimarySource != null)
				msgs = ((InternalEObject)newPrimarySource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			msgs = basicSetPrimarySource(newPrimarySource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE, newPrimarySource, newPrimarySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReportOrigin() {
		return reportOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportOrigin(CodeableConcept newReportOrigin, NotificationChain msgs) {
		CodeableConcept oldReportOrigin = reportOrigin;
		reportOrigin = newReportOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, oldReportOrigin, newReportOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportOrigin(CodeableConcept newReportOrigin) {
		if (newReportOrigin != reportOrigin) {
			NotificationChain msgs = null;
			if (reportOrigin != null)
				msgs = ((InternalEObject)reportOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, null, msgs);
			if (newReportOrigin != null)
				msgs = ((InternalEObject)newReportOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, null, msgs);
			msgs = basicSetReportOrigin(newReportOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN, newReportOrigin, newReportOrigin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(fhiRCore.dataTypes.String newLotNumber, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, newLotNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(fhiRCore.dataTypes.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(Date newExpirationDate, NotificationChain msgs) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationPerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ImmunizationPerformer>(ImmunizationPerformer.class, this, ResourcesPackage.IMMUNIZATION__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.IMMUNIZATION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMMUNIZATION__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getIsSubpotent() {
		return isSubpotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSubpotent(fhiRCore.dataTypes.Boolean newIsSubpotent, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldIsSubpotent = isSubpotent;
		isSubpotent = newIsSubpotent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT, oldIsSubpotent, newIsSubpotent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubpotent(fhiRCore.dataTypes.Boolean newIsSubpotent) {
		if (newIsSubpotent != isSubpotent) {
			NotificationChain msgs = null;
			if (isSubpotent != null)
				msgs = ((InternalEObject)isSubpotent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT, null, msgs);
			if (newIsSubpotent != null)
				msgs = ((InternalEObject)newIsSubpotent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT, null, msgs);
			msgs = basicSetIsSubpotent(newIsSubpotent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT, newIsSubpotent, newIsSubpotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubpotentReasons() {
		if (subpotentReasons == null) {
			subpotentReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON);
		}
		return subpotentReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationEducation> getEducations() {
		if (educations == null) {
			educations = new EObjectContainmentEList<ImmunizationEducation>(ImmunizationEducation.class, this, ResourcesPackage.IMMUNIZATION__EDUCATION);
		}
		return educations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProgramEligibilities() {
		if (programEligibilities == null) {
			programEligibilities = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY);
		}
		return programEligibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFundingSource() {
		return fundingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundingSource(CodeableConcept newFundingSource, NotificationChain msgs) {
		CodeableConcept oldFundingSource = fundingSource;
		fundingSource = newFundingSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE, oldFundingSource, newFundingSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundingSource(CodeableConcept newFundingSource) {
		if (newFundingSource != fundingSource) {
			NotificationChain msgs = null;
			if (fundingSource != null)
				msgs = ((InternalEObject)fundingSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE, null, msgs);
			if (newFundingSource != null)
				msgs = ((InternalEObject)newFundingSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE, null, msgs);
			msgs = basicSetFundingSource(newFundingSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE, newFundingSource, newFundingSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationReaction> getReactions() {
		if (reactions == null) {
			reactions = new EObjectContainmentEList<ImmunizationReaction>(ImmunizationReaction.class, this, ResourcesPackage.IMMUNIZATION__REACTION);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationProtocolApplied> getProtocolApplieds() {
		if (protocolApplieds == null) {
			protocolApplieds = new EObjectContainmentEList<ImmunizationProtocolApplied>(ImmunizationProtocolApplied.class, this, ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED);
		}
		return protocolApplieds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.IMMUNIZATION__STATUS_REASON:
				return basicSetStatusReason(null, msgs);
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				return basicSetVaccineCode(null, msgs);
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.IMMUNIZATION__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.IMMUNIZATION__RECORDED:
				return basicSetRecorded(null, msgs);
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return basicSetPrimarySource(null, msgs);
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				return basicSetReportOrigin(null, msgs);
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case ResourcesPackage.IMMUNIZATION__SITE:
				return basicSetSite(null, msgs);
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				return basicSetRoute(null, msgs);
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT:
				return basicSetIsSubpotent(null, msgs);
			case ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return ((InternalEList<?>)getSubpotentReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__EDUCATION:
				return ((InternalEList<?>)getEducations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return ((InternalEList<?>)getProgramEligibilities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE:
				return basicSetFundingSource(null, msgs);
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return ((InternalEList<?>)getReactions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return ((InternalEList<?>)getProtocolApplieds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.IMMUNIZATION__STATUS:
				return getStatus();
			case ResourcesPackage.IMMUNIZATION__STATUS_REASON:
				return getStatusReason();
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				return getVaccineCode();
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				return getPatient();
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.IMMUNIZATION__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.IMMUNIZATION__RECORDED:
				return getRecorded();
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return getPrimarySource();
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				return getReportOrigin();
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				return getLocation();
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				return getManufacturer();
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				return getLotNumber();
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				return getExpirationDate();
			case ResourcesPackage.IMMUNIZATION__SITE:
				return getSite();
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				return getRoute();
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				return getPerformers();
			case ResourcesPackage.IMMUNIZATION__NOTE:
				return getNotes();
			case ResourcesPackage.IMMUNIZATION__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.IMMUNIZATION__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT:
				return getIsSubpotent();
			case ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return getSubpotentReasons();
			case ResourcesPackage.IMMUNIZATION__EDUCATION:
				return getEducations();
			case ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return getProgramEligibilities();
			case ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE:
				return getFundingSource();
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return getReactions();
			case ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return getProtocolApplieds();
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__RECORDED:
				setRecorded((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ImmunizationPerformer>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT:
				setIsSubpotent((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON:
				getSubpotentReasons().clear();
				getSubpotentReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__EDUCATION:
				getEducations().clear();
				getEducations().addAll((Collection<? extends ImmunizationEducation>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				getProgramEligibilities().clear();
				getProgramEligibilities().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE:
				setFundingSource((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				getReactions().clear();
				getReactions().addAll((Collection<? extends ImmunizationReaction>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				getProtocolApplieds().clear();
				getProtocolApplieds().addAll((Collection<? extends ImmunizationProtocolApplied>)newValue);
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.IMMUNIZATION__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.IMMUNIZATION__RECORDED:
				setRecorded((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case ResourcesPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT:
				setIsSubpotent((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON:
				getSubpotentReasons().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__EDUCATION:
				getEducations().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				getProgramEligibilities().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE:
				setFundingSource((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				getReactions().clear();
				return;
			case ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				getProtocolApplieds().clear();
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
			case ResourcesPackage.IMMUNIZATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.IMMUNIZATION__STATUS:
				return status != null;
			case ResourcesPackage.IMMUNIZATION__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.IMMUNIZATION__VACCINE_CODE:
				return vaccineCode != null;
			case ResourcesPackage.IMMUNIZATION__PATIENT:
				return patient != null;
			case ResourcesPackage.IMMUNIZATION__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.IMMUNIZATION__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.IMMUNIZATION__RECORDED:
				return recorded != null;
			case ResourcesPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return primarySource != null;
			case ResourcesPackage.IMMUNIZATION__REPORT_ORIGIN:
				return reportOrigin != null;
			case ResourcesPackage.IMMUNIZATION__LOCATION:
				return location != null;
			case ResourcesPackage.IMMUNIZATION__MANUFACTURER:
				return manufacturer != null;
			case ResourcesPackage.IMMUNIZATION__LOT_NUMBER:
				return lotNumber != null;
			case ResourcesPackage.IMMUNIZATION__EXPIRATION_DATE:
				return expirationDate != null;
			case ResourcesPackage.IMMUNIZATION__SITE:
				return site != null;
			case ResourcesPackage.IMMUNIZATION__ROUTE:
				return route != null;
			case ResourcesPackage.IMMUNIZATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case ResourcesPackage.IMMUNIZATION__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.IMMUNIZATION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.IMMUNIZATION__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.IMMUNIZATION__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.IMMUNIZATION__IS_SUBPOTENT:
				return isSubpotent != null;
			case ResourcesPackage.IMMUNIZATION__SUBPOTENT_REASON:
				return subpotentReasons != null && !subpotentReasons.isEmpty();
			case ResourcesPackage.IMMUNIZATION__EDUCATION:
				return educations != null && !educations.isEmpty();
			case ResourcesPackage.IMMUNIZATION__PROGRAM_ELIGIBILITY:
				return programEligibilities != null && !programEligibilities.isEmpty();
			case ResourcesPackage.IMMUNIZATION__FUNDING_SOURCE:
				return fundingSource != null;
			case ResourcesPackage.IMMUNIZATION__REACTION:
				return reactions != null && !reactions.isEmpty();
			case ResourcesPackage.IMMUNIZATION__PROTOCOL_APPLIED:
				return protocolApplieds != null && !protocolApplieds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationImpl
