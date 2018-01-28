/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CanPushUpdates;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.PushTypeAvailable;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ValidationStatus;
import org.hl7.fhir.VerificationResultPrimarySource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result Primary Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getValidationDate <em>Validation Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getCanPushUpdates <em>Can Push Updates</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultPrimarySourceImpl#getPushTypeAvailable <em>Push Type Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultPrimarySourceImpl extends BackboneElementImpl implements VerificationResultPrimarySource {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getValidationProcess() <em>Validation Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> validationProcess;

	/**
	 * The cached value of the '{@link #getValidationStatus() <em>Validation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected ValidationStatus validationStatus;

	/**
	 * The cached value of the '{@link #getValidationDate() <em>Validation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime validationDate;

	/**
	 * The cached value of the '{@link #getCanPushUpdates() <em>Can Push Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanPushUpdates()
	 * @generated
	 * @ordered
	 */
	protected CanPushUpdates canPushUpdates;

	/**
	 * The cached value of the '{@link #getPushTypeAvailable() <em>Push Type Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushTypeAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<PushTypeAvailable> pushTypeAvailable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultPrimarySourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVerificationResultPrimarySource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getValidationProcess() {
		if (validationProcess == null) {
			validationProcess = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS);
		}
		return validationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatus getValidationStatus() {
		return validationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationStatus(ValidationStatus newValidationStatus, NotificationChain msgs) {
		ValidationStatus oldValidationStatus = validationStatus;
		validationStatus = newValidationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, oldValidationStatus, newValidationStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationStatus(ValidationStatus newValidationStatus) {
		if (newValidationStatus != validationStatus) {
			NotificationChain msgs = null;
			if (validationStatus != null)
				msgs = ((InternalEObject)validationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, null, msgs);
			if (newValidationStatus != null)
				msgs = ((InternalEObject)newValidationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, null, msgs);
			msgs = basicSetValidationStatus(newValidationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, newValidationStatus, newValidationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValidationDate() {
		return validationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationDate(DateTime newValidationDate, NotificationChain msgs) {
		DateTime oldValidationDate = validationDate;
		validationDate = newValidationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, oldValidationDate, newValidationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationDate(DateTime newValidationDate) {
		if (newValidationDate != validationDate) {
			NotificationChain msgs = null;
			if (validationDate != null)
				msgs = ((InternalEObject)validationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, null, msgs);
			if (newValidationDate != null)
				msgs = ((InternalEObject)newValidationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, null, msgs);
			msgs = basicSetValidationDate(newValidationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, newValidationDate, newValidationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanPushUpdates getCanPushUpdates() {
		return canPushUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanPushUpdates(CanPushUpdates newCanPushUpdates, NotificationChain msgs) {
		CanPushUpdates oldCanPushUpdates = canPushUpdates;
		canPushUpdates = newCanPushUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, oldCanPushUpdates, newCanPushUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanPushUpdates(CanPushUpdates newCanPushUpdates) {
		if (newCanPushUpdates != canPushUpdates) {
			NotificationChain msgs = null;
			if (canPushUpdates != null)
				msgs = ((InternalEObject)canPushUpdates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, null, msgs);
			if (newCanPushUpdates != null)
				msgs = ((InternalEObject)newCanPushUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, null, msgs);
			msgs = basicSetCanPushUpdates(newCanPushUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, newCanPushUpdates, newCanPushUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PushTypeAvailable> getPushTypeAvailable() {
		if (pushTypeAvailable == null) {
			pushTypeAvailable = new EObjectContainmentEList<PushTypeAvailable>(PushTypeAvailable.class, this, FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE);
		}
		return pushTypeAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS:
				return ((InternalEList<?>)getValidationProcess()).basicRemove(otherEnd, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return basicSetValidationStatus(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return basicSetValidationDate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return basicSetCanPushUpdates(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return ((InternalEList<?>)getPushTypeAvailable()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION:
				return getOrganization();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return getType();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS:
				return getValidationProcess();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return getValidationStatus();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return getValidationDate();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return getCanPushUpdates();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return getPushTypeAvailable();
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
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS:
				getValidationProcess().clear();
				getValidationProcess().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				setValidationStatus((ValidationStatus)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				setValidationDate((DateTime)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				setCanPushUpdates((CanPushUpdates)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				getPushTypeAvailable().clear();
				getPushTypeAvailable().addAll((Collection<? extends PushTypeAvailable>)newValue);
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
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				getType().clear();
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS:
				getValidationProcess().clear();
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				setValidationStatus((ValidationStatus)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				setValidationDate((DateTime)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				setCanPushUpdates((CanPushUpdates)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				getPushTypeAvailable().clear();
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
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__ORGANIZATION:
				return organization != null;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_PROCESS:
				return validationProcess != null && !validationProcess.isEmpty();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return validationStatus != null;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return validationDate != null;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return canPushUpdates != null;
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return pushTypeAvailable != null && !pushTypeAvailable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultPrimarySourceImpl
