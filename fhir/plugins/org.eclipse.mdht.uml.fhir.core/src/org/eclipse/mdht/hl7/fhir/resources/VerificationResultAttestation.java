/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getWho <em>Who</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VerificationResult_Attestation'"
 * @generated
 */
public interface VerificationResultAttestation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_Who()
	 * @model containment="true"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_OnBehalfOf()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Communication Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Method</em>' containment reference.
	 * @see #setCommunicationMethod(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_CommunicationMethod()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCommunicationMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Method</em>' containment reference.
	 * @see #getCommunicationMethod()
	 * @generated
	 */
	void setCommunicationMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getDate <em>Date</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Source Identity Certificate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #setSourceIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_SourceIdentityCertificate()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getSourceIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 */
	void setSourceIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Identity Certificate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #setProxyIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_ProxyIdentityCertificate()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getProxyIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 */
	void setProxyIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Signature</em>' containment reference.
	 * @see #setProxySignature(Signature)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_ProxySignature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getProxySignature();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Signature</em>' containment reference.
	 * @see #getProxySignature()
	 * @generated
	 */
	void setProxySignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Source Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Signature</em>' containment reference.
	 * @see #setSourceSignature(Signature)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultAttestation_SourceSignature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getSourceSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Signature</em>' containment reference.
	 * @see #getSourceSignature()
	 * @generated
	 */
	void setSourceSignature(Signature value);

} // VerificationResultAttestation
