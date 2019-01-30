/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.VerificationResultAttestation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VerificationResultAttestationImpl#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultAttestationImpl extends BackboneElementImpl implements VerificationResultAttestation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getSourceIdentityCertificate() <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sourceIdentityCertificate;

	/**
	 * The cached value of the '{@link #getProxyIdentityCertificate() <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String proxyIdentityCertificate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultAttestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVerificationResultAttestation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE, newSource, newSource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSourceIdentityCertificate() {
		return sourceIdentityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIdentityCertificate(org.hl7.fhir.String newSourceIdentityCertificate, NotificationChain msgs) {
		org.hl7.fhir.String oldSourceIdentityCertificate = sourceIdentityCertificate;
		sourceIdentityCertificate = newSourceIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, oldSourceIdentityCertificate, newSourceIdentityCertificate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIdentityCertificate(org.hl7.fhir.String newSourceIdentityCertificate) {
		if (newSourceIdentityCertificate != sourceIdentityCertificate) {
			NotificationChain msgs = null;
			if (sourceIdentityCertificate != null)
				msgs = ((InternalEObject)sourceIdentityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, null, msgs);
			if (newSourceIdentityCertificate != null)
				msgs = ((InternalEObject)newSourceIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetSourceIdentityCertificate(newSourceIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE, newSourceIdentityCertificate, newSourceIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getProxyIdentityCertificate() {
		return proxyIdentityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxyIdentityCertificate(org.hl7.fhir.String newProxyIdentityCertificate, NotificationChain msgs) {
		org.hl7.fhir.String oldProxyIdentityCertificate = proxyIdentityCertificate;
		proxyIdentityCertificate = newProxyIdentityCertificate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, oldProxyIdentityCertificate, newProxyIdentityCertificate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyIdentityCertificate(org.hl7.fhir.String newProxyIdentityCertificate) {
		if (newProxyIdentityCertificate != proxyIdentityCertificate) {
			NotificationChain msgs = null;
			if (proxyIdentityCertificate != null)
				msgs = ((InternalEObject)proxyIdentityCertificate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, null, msgs);
			if (newProxyIdentityCertificate != null)
				msgs = ((InternalEObject)newProxyIdentityCertificate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, null, msgs);
			msgs = basicSetProxyIdentityCertificate(newProxyIdentityCertificate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE, newProxyIdentityCertificate, newProxyIdentityCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return basicSetSourceIdentityCertificate(null, msgs);
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return basicSetProxyIdentityCertificate(null, msgs);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE:
				return getSource();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION:
				return getOrganization();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD:
				return getMethod();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return getDate();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return getSourceIdentityCertificate();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return getProxyIdentityCertificate();
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE:
				setSource((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				setDate((Date)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				setSourceIdentityCertificate((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				setProxyIdentityCertificate((org.hl7.fhir.String)newValue);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE:
				setSource((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				setDate((Date)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				setSourceIdentityCertificate((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				setProxyIdentityCertificate((org.hl7.fhir.String)null);
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
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE:
				return source != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__ORGANIZATION:
				return organization != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__METHOD:
				return method != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__DATE:
				return date != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__SOURCE_IDENTITY_CERTIFICATE:
				return sourceIdentityCertificate != null;
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION__PROXY_IDENTITY_CERTIFICATE:
				return proxyIdentityCertificate != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultAttestationImpl
