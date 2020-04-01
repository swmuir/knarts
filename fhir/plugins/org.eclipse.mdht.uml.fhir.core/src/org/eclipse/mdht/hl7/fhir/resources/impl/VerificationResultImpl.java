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
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Timing;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.VerificationResult;
import org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation;
import org.eclipse.mdht.hl7.fhir.resources.VerificationResultPrimarySource;
import org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getTargetLocations <em>Target Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getValidationProcesses <em>Validation Process</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getLastPerformed <em>Last Performed</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getNextScheduled <em>Next Scheduled</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getFailureAction <em>Failure Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getPrimarySources <em>Primary Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getAttestation <em>Attestation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultImpl#getValidators <em>Validator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultImpl extends DomainResourceImpl implements VerificationResult {
	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> targets;

	/**
	 * The cached value of the '{@link #getTargetLocations() <em>Target Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> targetLocations;

	/**
	 * The cached value of the '{@link #getNeed() <em>Need</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept need;

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
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusDate;

	/**
	 * The cached value of the '{@link #getValidationType() <em>Validation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept validationType;

	/**
	 * The cached value of the '{@link #getValidationProcesses() <em>Validation Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> validationProcesses;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected Timing frequency;

	/**
	 * The cached value of the '{@link #getLastPerformed() <em>Last Performed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPerformed()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastPerformed;

	/**
	 * The cached value of the '{@link #getNextScheduled() <em>Next Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextScheduled()
	 * @generated
	 * @ordered
	 */
	protected Date nextScheduled;

	/**
	 * The cached value of the '{@link #getFailureAction() <em>Failure Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureAction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept failureAction;

	/**
	 * The cached value of the '{@link #getPrimarySources() <em>Primary Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySources()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationResultPrimarySource> primarySources;

	/**
	 * The cached value of the '{@link #getAttestation() <em>Attestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttestation()
	 * @generated
	 * @ordered
	 */
	protected VerificationResultAttestation attestation;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationResultValidator> validators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getVerificationResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.VERIFICATION_RESULT__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getTargetLocations() {
		if (targetLocations == null) {
			targetLocations = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION);
		}
		return targetLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getNeed() {
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeed(CodeableConcept newNeed, NotificationChain msgs) {
		CodeableConcept oldNeed = need;
		need = newNeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__NEED, oldNeed, newNeed);
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
	public void setNeed(CodeableConcept newNeed) {
		if (newNeed != need) {
			NotificationChain msgs = null;
			if (need != null)
				msgs = ((InternalEObject)need).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__NEED, null, msgs);
			if (newNeed != null)
				msgs = ((InternalEObject)newNeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__NEED, null, msgs);
			msgs = basicSetNeed(newNeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__NEED, newNeed, newNeed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(DateTime newStatusDate, NotificationChain msgs) {
		DateTime oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE, oldStatusDate, newStatusDate);
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
	public void setStatusDate(DateTime newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValidationType() {
		return validationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationType(CodeableConcept newValidationType, NotificationChain msgs) {
		CodeableConcept oldValidationType = validationType;
		validationType = newValidationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE, oldValidationType, newValidationType);
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
	public void setValidationType(CodeableConcept newValidationType) {
		if (newValidationType != validationType) {
			NotificationChain msgs = null;
			if (validationType != null)
				msgs = ((InternalEObject)validationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE, null, msgs);
			if (newValidationType != null)
				msgs = ((InternalEObject)newValidationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE, null, msgs);
			msgs = basicSetValidationType(newValidationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE, newValidationType, newValidationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getValidationProcesses() {
		if (validationProcesses == null) {
			validationProcesses = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS);
		}
		return validationProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(Timing newFrequency, NotificationChain msgs) {
		Timing oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__FREQUENCY, oldFrequency, newFrequency);
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
	public void setFrequency(Timing newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastPerformed() {
		return lastPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastPerformed(DateTime newLastPerformed, NotificationChain msgs) {
		DateTime oldLastPerformed = lastPerformed;
		lastPerformed = newLastPerformed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED, oldLastPerformed, newLastPerformed);
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
	public void setLastPerformed(DateTime newLastPerformed) {
		if (newLastPerformed != lastPerformed) {
			NotificationChain msgs = null;
			if (lastPerformed != null)
				msgs = ((InternalEObject)lastPerformed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED, null, msgs);
			if (newLastPerformed != null)
				msgs = ((InternalEObject)newLastPerformed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED, null, msgs);
			msgs = basicSetLastPerformed(newLastPerformed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED, newLastPerformed, newLastPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNextScheduled() {
		return nextScheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextScheduled(Date newNextScheduled, NotificationChain msgs) {
		Date oldNextScheduled = nextScheduled;
		nextScheduled = newNextScheduled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED, oldNextScheduled, newNextScheduled);
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
	public void setNextScheduled(Date newNextScheduled) {
		if (newNextScheduled != nextScheduled) {
			NotificationChain msgs = null;
			if (nextScheduled != null)
				msgs = ((InternalEObject)nextScheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED, null, msgs);
			if (newNextScheduled != null)
				msgs = ((InternalEObject)newNextScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED, null, msgs);
			msgs = basicSetNextScheduled(newNextScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED, newNextScheduled, newNextScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFailureAction() {
		return failureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureAction(CodeableConcept newFailureAction, NotificationChain msgs) {
		CodeableConcept oldFailureAction = failureAction;
		failureAction = newFailureAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION, oldFailureAction, newFailureAction);
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
	public void setFailureAction(CodeableConcept newFailureAction) {
		if (newFailureAction != failureAction) {
			NotificationChain msgs = null;
			if (failureAction != null)
				msgs = ((InternalEObject)failureAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION, null, msgs);
			if (newFailureAction != null)
				msgs = ((InternalEObject)newFailureAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION, null, msgs);
			msgs = basicSetFailureAction(newFailureAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION, newFailureAction, newFailureAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerificationResultPrimarySource> getPrimarySources() {
		if (primarySources == null) {
			primarySources = new EObjectContainmentEList<VerificationResultPrimarySource>(VerificationResultPrimarySource.class, this, ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE);
		}
		return primarySources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultAttestation getAttestation() {
		return attestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttestation(VerificationResultAttestation newAttestation, NotificationChain msgs) {
		VerificationResultAttestation oldAttestation = attestation;
		attestation = newAttestation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__ATTESTATION, oldAttestation, newAttestation);
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
	public void setAttestation(VerificationResultAttestation newAttestation) {
		if (newAttestation != attestation) {
			NotificationChain msgs = null;
			if (attestation != null)
				msgs = ((InternalEObject)attestation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__ATTESTATION, null, msgs);
			if (newAttestation != null)
				msgs = ((InternalEObject)newAttestation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT__ATTESTATION, null, msgs);
			msgs = basicSetAttestation(newAttestation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT__ATTESTATION, newAttestation, newAttestation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerificationResultValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList<VerificationResultValidator>(VerificationResultValidator.class, this, ResourcesPackage.VERIFICATION_RESULT__VALIDATOR);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VERIFICATION_RESULT__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION:
				return ((InternalEList<?>)getTargetLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__NEED:
				return basicSetNeed(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE:
				return basicSetValidationType(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS:
				return ((InternalEList<?>)getValidationProcesses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED:
				return basicSetLastPerformed(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED:
				return basicSetNextScheduled(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION:
				return basicSetFailureAction(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE:
				return ((InternalEList<?>)getPrimarySources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__ATTESTATION:
				return basicSetAttestation(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATOR:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VERIFICATION_RESULT__TARGET:
				return getTargets();
			case ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION:
				return getTargetLocations();
			case ResourcesPackage.VERIFICATION_RESULT__NEED:
				return getNeed();
			case ResourcesPackage.VERIFICATION_RESULT__STATUS:
				return getStatus();
			case ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE:
				return getStatusDate();
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE:
				return getValidationType();
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS:
				return getValidationProcesses();
			case ResourcesPackage.VERIFICATION_RESULT__FREQUENCY:
				return getFrequency();
			case ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED:
				return getLastPerformed();
			case ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED:
				return getNextScheduled();
			case ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION:
				return getFailureAction();
			case ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE:
				return getPrimarySources();
			case ResourcesPackage.VERIFICATION_RESULT__ATTESTATION:
				return getAttestation();
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATOR:
				return getValidators();
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
			case ResourcesPackage.VERIFICATION_RESULT__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION:
				getTargetLocations().clear();
				getTargetLocations().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__NEED:
				setNeed((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE:
				setValidationType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS:
				getValidationProcesses().clear();
				getValidationProcesses().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__FREQUENCY:
				setFrequency((Timing)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED:
				setLastPerformed((DateTime)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED:
				setNextScheduled((Date)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION:
				setFailureAction((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE:
				getPrimarySources().clear();
				getPrimarySources().addAll((Collection<? extends VerificationResultPrimarySource>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__ATTESTATION:
				setAttestation((VerificationResultAttestation)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATOR:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VerificationResultValidator>)newValue);
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
			case ResourcesPackage.VERIFICATION_RESULT__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION:
				getTargetLocations().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT__NEED:
				setNeed((CodeableConcept)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE:
				setValidationType((CodeableConcept)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS:
				getValidationProcesses().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT__FREQUENCY:
				setFrequency((Timing)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED:
				setLastPerformed((DateTime)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED:
				setNextScheduled((Date)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION:
				setFailureAction((CodeableConcept)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE:
				getPrimarySources().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT__ATTESTATION:
				setAttestation((VerificationResultAttestation)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATOR:
				getValidators().clear();
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
			case ResourcesPackage.VERIFICATION_RESULT__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT__TARGET_LOCATION:
				return targetLocations != null && !targetLocations.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT__NEED:
				return need != null;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS:
				return status != null;
			case ResourcesPackage.VERIFICATION_RESULT__STATUS_DATE:
				return statusDate != null;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_TYPE:
				return validationType != null;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATION_PROCESS:
				return validationProcesses != null && !validationProcesses.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT__FREQUENCY:
				return frequency != null;
			case ResourcesPackage.VERIFICATION_RESULT__LAST_PERFORMED:
				return lastPerformed != null;
			case ResourcesPackage.VERIFICATION_RESULT__NEXT_SCHEDULED:
				return nextScheduled != null;
			case ResourcesPackage.VERIFICATION_RESULT__FAILURE_ACTION:
				return failureAction != null;
			case ResourcesPackage.VERIFICATION_RESULT__PRIMARY_SOURCE:
				return primarySources != null && !primarySources.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT__ATTESTATION:
				return attestation != null;
			case ResourcesPackage.VERIFICATION_RESULT__VALIDATOR:
				return validators != null && !validators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultImpl
