/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Attestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}</li>
 *   <li>{@link fhiRCore.resources.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation()
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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_Who()
	 * @model containment="true"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getWho <em>Who</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_OnBehalfOf()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_CommunicationMethod()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCommunicationMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getCommunicationMethod <em>Communication Method</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getDate <em>Date</em>}' containment reference.
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
	 * @see #setSourceIdentityCertificate(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_SourceIdentityCertificate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSourceIdentityCertificate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getSourceIdentityCertificate <em>Source Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identity Certificate</em>' containment reference.
	 * @see #getSourceIdentityCertificate()
	 * @generated
	 */
	void setSourceIdentityCertificate(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Proxy Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Identity Certificate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #setProxyIdentityCertificate(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_ProxyIdentityCertificate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getProxyIdentityCertificate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getProxyIdentityCertificate <em>Proxy Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Identity Certificate</em>' containment reference.
	 * @see #getProxyIdentityCertificate()
	 * @generated
	 */
	void setProxyIdentityCertificate(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_ProxySignature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getProxySignature();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getProxySignature <em>Proxy Signature</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getVerificationResultAttestation_SourceSignature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getSourceSignature();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VerificationResultAttestation#getSourceSignature <em>Source Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Signature</em>' containment reference.
	 * @see #getSourceSignature()
	 * @generated
	 */
	void setSourceSignature(Signature value);

} // VerificationResultAttestation
