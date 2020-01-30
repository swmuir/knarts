/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.ImmunizationEvaluation;
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
 * An implementation of the model object '<em><b>Immunization Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getImmunizationEvent <em>Immunization Event</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getDoseStatusReasons <em>Dose Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEvaluationImpl#getSeriesDosesx <em>Series Dosesx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationEvaluationImpl extends DomainResourceImpl implements ImmunizationEvaluation {
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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept targetDisease;

	/**
	 * The cached value of the '{@link #getImmunizationEvent() <em>Immunization Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationEvent()
	 * @generated
	 * @ordered
	 */
	protected Reference immunizationEvent;

	/**
	 * The cached value of the '{@link #getDoseStatus() <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatus;

	/**
	 * The cached value of the '{@link #getDoseStatusReasons() <em>Dose Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatusReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> doseStatusReasons;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String series;

	/**
	 * The cached value of the '{@link #getDoseNumberx() <em>Dose Numberx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberx()
	 * @generated
	 * @ordered
	 */
	protected DataType doseNumberx;

	/**
	 * The cached value of the '{@link #getSeriesDosesx() <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesx()
	 * @generated
	 * @ordered
	 */
	protected DataType seriesDosesx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationEvaluation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY, oldAuthority, newAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTargetDisease() {
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDisease(CodeableConcept newTargetDisease, NotificationChain msgs) {
		CodeableConcept oldTargetDisease = targetDisease;
		targetDisease = newTargetDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, oldTargetDisease, newTargetDisease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisease(CodeableConcept newTargetDisease) {
		if (newTargetDisease != targetDisease) {
			NotificationChain msgs = null;
			if (targetDisease != null)
				msgs = ((InternalEObject)targetDisease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, null, msgs);
			if (newTargetDisease != null)
				msgs = ((InternalEObject)newTargetDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, null, msgs);
			msgs = basicSetTargetDisease(newTargetDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE, newTargetDisease, newTargetDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getImmunizationEvent() {
		return immunizationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationEvent(Reference newImmunizationEvent, NotificationChain msgs) {
		Reference oldImmunizationEvent = immunizationEvent;
		immunizationEvent = newImmunizationEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, oldImmunizationEvent, newImmunizationEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationEvent(Reference newImmunizationEvent) {
		if (newImmunizationEvent != immunizationEvent) {
			NotificationChain msgs = null;
			if (immunizationEvent != null)
				msgs = ((InternalEObject)immunizationEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			if (newImmunizationEvent != null)
				msgs = ((InternalEObject)newImmunizationEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, null, msgs);
			msgs = basicSetImmunizationEvent(newImmunizationEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT, newImmunizationEvent, newImmunizationEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatus() {
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseStatus(CodeableConcept newDoseStatus, NotificationChain msgs) {
		CodeableConcept oldDoseStatus = doseStatus;
		doseStatus = newDoseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, oldDoseStatus, newDoseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatus(CodeableConcept newDoseStatus) {
		if (newDoseStatus != doseStatus) {
			NotificationChain msgs = null;
			if (doseStatus != null)
				msgs = ((InternalEObject)doseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			if (newDoseStatus != null)
				msgs = ((InternalEObject)newDoseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, null, msgs);
			msgs = basicSetDoseStatus(newDoseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS, newDoseStatus, newDoseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDoseStatusReasons() {
		if (doseStatusReasons == null) {
			doseStatusReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON);
		}
		return doseStatusReasons;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(fhiRCore.dataTypes.String newSeries, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(fhiRCore.dataTypes.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDoseNumberx() {
		return doseNumberx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberx(DataType newDoseNumberx, NotificationChain msgs) {
		DataType oldDoseNumberx = doseNumberx;
		doseNumberx = newDoseNumberx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX, oldDoseNumberx, newDoseNumberx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumberx(DataType newDoseNumberx) {
		if (newDoseNumberx != doseNumberx) {
			NotificationChain msgs = null;
			if (doseNumberx != null)
				msgs = ((InternalEObject)doseNumberx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX, null, msgs);
			if (newDoseNumberx != null)
				msgs = ((InternalEObject)newDoseNumberx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX, null, msgs);
			msgs = basicSetDoseNumberx(newDoseNumberx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX, newDoseNumberx, newDoseNumberx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSeriesDosesx() {
		return seriesDosesx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesx(DataType newSeriesDosesx, NotificationChain msgs) {
		DataType oldSeriesDosesx = seriesDosesx;
		seriesDosesx = newSeriesDosesx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX, oldSeriesDosesx, newSeriesDosesx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDosesx(DataType newSeriesDosesx) {
		if (newSeriesDosesx != seriesDosesx) {
			NotificationChain msgs = null;
			if (seriesDosesx != null)
				msgs = ((InternalEObject)seriesDosesx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX, null, msgs);
			if (newSeriesDosesx != null)
				msgs = ((InternalEObject)newSeriesDosesx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX, null, msgs);
			msgs = basicSetSeriesDosesx(newSeriesDosesx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX, newSeriesDosesx, newSeriesDosesx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return basicSetTargetDisease(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return basicSetImmunizationEvent(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return basicSetDoseStatus(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return ((InternalEList<?>)getDoseStatusReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES:
				return basicSetSeries(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX:
				return basicSetDoseNumberx(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX:
				return basicSetSeriesDosesx(null, msgs);
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
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS:
				return getStatus();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return getPatient();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DATE:
				return getDate();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return getAuthority();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return getTargetDisease();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return getImmunizationEvent();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return getDoseStatus();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return getDoseStatusReasons();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES:
				return getSeries();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX:
				return getDoseNumberx();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX:
				return getSeriesDosesx();
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
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReasons().clear();
				getDoseStatusReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX:
				setDoseNumberx((DataType)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX:
				setSeriesDosesx((DataType)newValue);
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
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				setImmunizationEvent((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				setDoseStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				getDoseStatusReasons().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES:
				setSeries((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX:
				setDoseNumberx((DataType)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX:
				setSeriesDosesx((DataType)null);
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
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__STATUS:
				return status != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__PATIENT:
				return patient != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DATE:
				return date != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__AUTHORITY:
				return authority != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__TARGET_DISEASE:
				return targetDisease != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__IMMUNIZATION_EVENT:
				return immunizationEvent != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS:
				return doseStatus != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_STATUS_REASON:
				return doseStatusReasons != null && !doseStatusReasons.isEmpty();
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES:
				return series != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__DOSE_NUMBERX:
				return doseNumberx != null;
			case ResourcesPackage.IMMUNIZATION_EVALUATION__SERIES_DOSESX:
				return seriesDosesx != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationEvaluationImpl
