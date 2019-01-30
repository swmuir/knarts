/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.VerificationResultValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultValidatorImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultValidatorImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultValidatorImpl#getIdentityCertificate <em>Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultValidatorImpl#getDateValidated <em>Date Validated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultValidatorImpl extends BackboneElementImpl implements VerificationResultValidator {
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
	 * The cached value of the '{@link #getIdentityCertificate() <em>Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityCertificate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String identityCertificate;

	/**
	 * The cached value of the '{@link #getDateValidated() <em>Date Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValidated()
	 * @generated
	 * @ordered
	 */
	protected Date dateValidated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVerificationResultValidator();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIdentityCertificate() {
		return identityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentityCertificate(org.hl7.fhir.String newIdentityCertificate, NotificationChain msgs) {
		org.hl7.fhir.String oldIdentityCertificate = identityCertificate;
		identityCertificate = newIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, oldIdentityCertificate, newIdentityCertificate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityCertificate(org.hl7.fhir.String newIdentityCertificate) {
		if (newIdentityCertificate != identityCertificate) {
			NotificationChain msgs = null;
			if (identityCertificate != null)
				msgs = ((InternalEObject)identityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, null, msgs);
			if (newIdentityCertificate != null)
				msgs = ((InternalEObject)newIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetIdentityCertificate(newIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, newIdentityCertificate, newIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateValidated() {
		return dateValidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateValidated(Date newDateValidated, NotificationChain msgs) {
		Date oldDateValidated = dateValidated;
		dateValidated = newDateValidated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED, oldDateValidated, newDateValidated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValidated(Date newDateValidated) {
		if (newDateValidated != dateValidated) {
			NotificationChain msgs = null;
			if (dateValidated != null)
				msgs = ((InternalEObject)dateValidated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED, null, msgs);
			if (newDateValidated != null)
				msgs = ((InternalEObject)newDateValidated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED, null, msgs);
			msgs = basicSetDateValidated(newDateValidated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED, newDateValidated, newDateValidated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return basicSetIdentityCertificate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED:
				return basicSetDateValidated(null, msgs);
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
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return getOrganization();
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return getIdentityCertificate();
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED:
				return getDateValidated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				setIdentityCertificate((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED:
				setDateValidated((Date)newValue);
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
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				setIdentityCertificate((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED:
				setDateValidated((Date)null);
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
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTIFIER:
				return identifier != null;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return organization != null;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return identityCertificate != null;
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR__DATE_VALIDATED:
				return dateValidated != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultValidatorImpl
