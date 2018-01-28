/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation()
 * @model extendedMetaData="name='VerificationResult.Attestation' kind='elementOnly'"
 * @generated
 */
public interface VerificationResultAttestation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual attesting to information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization attesting to information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Organization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who is providing the attested information (owner; authorized representative; authorized intermediary; non-authorized source).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Method()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date the information was attested to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Source Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital identity certificate associated with the attestation source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #setSourceIdentityCertificate(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_SourceIdentityCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceIdentityCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 */
	void setSourceIdentityCertificate(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital identity certificate associated with the proxy entity submitting attested information on behalf of the attestation source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #setProxyIdentityCertificate(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultAttestation_ProxyIdentityCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='proxyIdentityCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getProxyIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 */
	void setProxyIdentityCertificate(org.hl7.fhir.String value);

} // VerificationResultAttestation
