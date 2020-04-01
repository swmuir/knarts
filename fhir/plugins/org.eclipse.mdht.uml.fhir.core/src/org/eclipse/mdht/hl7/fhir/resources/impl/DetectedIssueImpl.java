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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.DetectedIssue;
import org.eclipse.mdht.hl7.fhir.resources.DetectedIssueEvidence;
import org.eclipse.mdht.hl7.fhir.resources.DetectedIssueMitigation;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detected Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getIdentifiedx <em>Identifiedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getImplicateds <em>Implicated</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getEvidences <em>Evidence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DetectedIssueImpl#getMitigations <em>Mitigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectedIssueImpl extends DomainResourceImpl implements DetectedIssue {
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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

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
	 * The cached value of the '{@link #getIdentifiedx() <em>Identifiedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedx()
	 * @generated
	 * @ordered
	 */
	protected DataType identifiedx;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getImplicateds() <em>Implicated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicateds()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> implicateds;

	/**
	 * The cached value of the '{@link #getEvidences() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectedIssueEvidence> evidences;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String detail;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Uri reference;

	/**
	 * The cached value of the '{@link #getMitigations() <em>Mitigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigations()
	 * @generated
	 * @ordered
	 */
	protected EList<DetectedIssueMitigation> mitigations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectedIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDetectedIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DETECTED_ISSUE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(Code newSeverity, NotificationChain msgs) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(Code newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__SEVERITY, newSeverity, newSeverity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getIdentifiedx() {
		return identifiedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedx(DataType newIdentifiedx, NotificationChain msgs) {
		DataType oldIdentifiedx = identifiedx;
		identifiedx = newIdentifiedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX, oldIdentifiedx, newIdentifiedx);
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
	public void setIdentifiedx(DataType newIdentifiedx) {
		if (newIdentifiedx != identifiedx) {
			NotificationChain msgs = null;
			if (identifiedx != null)
				msgs = ((InternalEObject)identifiedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX, null, msgs);
			if (newIdentifiedx != null)
				msgs = ((InternalEObject)newIdentifiedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX, null, msgs);
			msgs = basicSetIdentifiedx(newIdentifiedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX, newIdentifiedx, newIdentifiedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getImplicateds() {
		if (implicateds == null) {
			implicateds = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DETECTED_ISSUE__IMPLICATED);
		}
		return implicateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectedIssueEvidence> getEvidences() {
		if (evidences == null) {
			evidences = new EObjectContainmentEList<DetectedIssueEvidence>(DetectedIssueEvidence.class, this, ResourcesPackage.DETECTED_ISSUE__EVIDENCE);
		}
		return evidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(org.eclipse.mdht.hl7.fhir.dataTypes.String newDetail, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__DETAIL, oldDetail, newDetail);
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
	public void setDetail(org.eclipse.mdht.hl7.fhir.dataTypes.String newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Uri newReference, NotificationChain msgs) {
		Uri oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__REFERENCE, oldReference, newReference);
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
	public void setReference(Uri newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DETECTED_ISSUE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DETECTED_ISSUE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DetectedIssueMitigation> getMitigations() {
		if (mitigations == null) {
			mitigations = new EObjectContainmentEList<DetectedIssueMitigation>(DetectedIssueMitigation.class, this, ResourcesPackage.DETECTED_ISSUE__MITIGATION);
		}
		return mitigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DETECTED_ISSUE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__SEVERITY:
				return basicSetSeverity(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX:
				return basicSetIdentifiedx(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__IMPLICATED:
				return ((InternalEList<?>)getImplicateds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DETECTED_ISSUE__EVIDENCE:
				return ((InternalEList<?>)getEvidences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DETECTED_ISSUE__DETAIL:
				return basicSetDetail(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__REFERENCE:
				return basicSetReference(null, msgs);
			case ResourcesPackage.DETECTED_ISSUE__MITIGATION:
				return ((InternalEList<?>)getMitigations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DETECTED_ISSUE__STATUS:
				return getStatus();
			case ResourcesPackage.DETECTED_ISSUE__CODE:
				return getCode();
			case ResourcesPackage.DETECTED_ISSUE__SEVERITY:
				return getSeverity();
			case ResourcesPackage.DETECTED_ISSUE__PATIENT:
				return getPatient();
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX:
				return getIdentifiedx();
			case ResourcesPackage.DETECTED_ISSUE__AUTHOR:
				return getAuthor();
			case ResourcesPackage.DETECTED_ISSUE__IMPLICATED:
				return getImplicateds();
			case ResourcesPackage.DETECTED_ISSUE__EVIDENCE:
				return getEvidences();
			case ResourcesPackage.DETECTED_ISSUE__DETAIL:
				return getDetail();
			case ResourcesPackage.DETECTED_ISSUE__REFERENCE:
				return getReference();
			case ResourcesPackage.DETECTED_ISSUE__MITIGATION:
				return getMitigations();
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
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX:
				setIdentifiedx((DataType)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__IMPLICATED:
				getImplicateds().clear();
				getImplicateds().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__EVIDENCE:
				getEvidences().clear();
				getEvidences().addAll((Collection<? extends DetectedIssueEvidence>)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__DETAIL:
				setDetail((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__REFERENCE:
				setReference((Uri)newValue);
				return;
			case ResourcesPackage.DETECTED_ISSUE__MITIGATION:
				getMitigations().clear();
				getMitigations().addAll((Collection<? extends DetectedIssueMitigation>)newValue);
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
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DETECTED_ISSUE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__SEVERITY:
				setSeverity((Code)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX:
				setIdentifiedx((DataType)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__AUTHOR:
				setAuthor((Reference)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__IMPLICATED:
				getImplicateds().clear();
				return;
			case ResourcesPackage.DETECTED_ISSUE__EVIDENCE:
				getEvidences().clear();
				return;
			case ResourcesPackage.DETECTED_ISSUE__DETAIL:
				setDetail((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__REFERENCE:
				setReference((Uri)null);
				return;
			case ResourcesPackage.DETECTED_ISSUE__MITIGATION:
				getMitigations().clear();
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
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DETECTED_ISSUE__STATUS:
				return status != null;
			case ResourcesPackage.DETECTED_ISSUE__CODE:
				return code != null;
			case ResourcesPackage.DETECTED_ISSUE__SEVERITY:
				return severity != null;
			case ResourcesPackage.DETECTED_ISSUE__PATIENT:
				return patient != null;
			case ResourcesPackage.DETECTED_ISSUE__IDENTIFIEDX:
				return identifiedx != null;
			case ResourcesPackage.DETECTED_ISSUE__AUTHOR:
				return author != null;
			case ResourcesPackage.DETECTED_ISSUE__IMPLICATED:
				return implicateds != null && !implicateds.isEmpty();
			case ResourcesPackage.DETECTED_ISSUE__EVIDENCE:
				return evidences != null && !evidences.isEmpty();
			case ResourcesPackage.DETECTED_ISSUE__DETAIL:
				return detail != null;
			case ResourcesPackage.DETECTED_ISSUE__REFERENCE:
				return reference != null;
			case ResourcesPackage.DETECTED_ISSUE__MITIGATION:
				return mitigations != null && !mitigations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DetectedIssueImpl
