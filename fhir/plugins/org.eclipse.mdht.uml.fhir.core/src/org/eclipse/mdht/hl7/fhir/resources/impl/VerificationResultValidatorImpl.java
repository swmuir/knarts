/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Signature;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultValidatorImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultValidatorImpl#getIdentityCertificate <em>Identity Certificate</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.VerificationResultValidatorImpl#getAttestationSignature <em>Attestation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultValidatorImpl extends BackboneElementImpl implements VerificationResultValidator {
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
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String identityCertificate;

	/**
	 * The cached value of the '{@link #getAttestationSignature() <em>Attestation Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttestationSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature attestationSignature;

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
		return ResourcesPackage.eINSTANCE.getVerificationResultValidator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIdentityCertificate() {
		return identityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String newIdentityCertificate, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIdentityCertificate = identityCertificate;
		identityCertificate = newIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, oldIdentityCertificate, newIdentityCertificate);
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
	public void setIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String newIdentityCertificate) {
		if (newIdentityCertificate != identityCertificate) {
			NotificationChain msgs = null;
			if (identityCertificate != null)
				msgs = ((InternalEObject)identityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, null, msgs);
			if (newIdentityCertificate != null)
				msgs = ((InternalEObject)newIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetIdentityCertificate(newIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE, newIdentityCertificate, newIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getAttestationSignature() {
		return attestationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttestationSignature(Signature newAttestationSignature, NotificationChain msgs) {
		Signature oldAttestationSignature = attestationSignature;
		attestationSignature = newAttestationSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE, oldAttestationSignature, newAttestationSignature);
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
	public void setAttestationSignature(Signature newAttestationSignature) {
		if (newAttestationSignature != attestationSignature) {
			NotificationChain msgs = null;
			if (attestationSignature != null)
				msgs = ((InternalEObject)attestationSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE, null, msgs);
			if (newAttestationSignature != null)
				msgs = ((InternalEObject)newAttestationSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE, null, msgs);
			msgs = basicSetAttestationSignature(newAttestationSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE, newAttestationSignature, newAttestationSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return basicSetIdentityCertificate(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE:
				return basicSetAttestationSignature(null, msgs);
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
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return getOrganization();
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return getIdentityCertificate();
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE:
				return getAttestationSignature();
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
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				setIdentityCertificate((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE:
				setAttestationSignature((Signature)newValue);
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
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				setIdentityCertificate((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE:
				setAttestationSignature((Signature)null);
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
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__IDENTITY_CERTIFICATE:
				return identityCertificate != null;
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR__ATTESTATION_SIGNATURE:
				return attestationSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultValidatorImpl
