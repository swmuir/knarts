/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getIdentityCertificate <em>Identity Certificate</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getAttestationSignature <em>Attestation Signature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultValidator()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VerificationResult_Validator'"
 * @generated
 */
public interface VerificationResultValidator extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultValidator_Organization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Identity Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Certificate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Certificate</em>' containment reference.
	 * @see #setIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultValidator_IdentityCertificate()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getIdentityCertificate <em>Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Certificate</em>' containment reference.
	 * @see #getIdentityCertificate()
	 * @generated
	 */
	void setIdentityCertificate(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Attestation Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attestation Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attestation Signature</em>' containment reference.
	 * @see #setAttestationSignature(Signature)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getVerificationResultValidator_AttestationSignature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getAttestationSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.VerificationResultValidator#getAttestationSignature <em>Attestation Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attestation Signature</em>' containment reference.
	 * @see #getAttestationSignature()
	 * @generated
	 */
	void setAttestationSignature(Signature value);

} // VerificationResultValidator
