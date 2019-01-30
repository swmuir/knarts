/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Validator</b></em>'.
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
 *   <li>{@link org.hl7.fhir.VerificationResultValidator#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultValidator#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultValidator#getIdentityCertificate <em>Identity Certificate</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultValidator#getDateValidated <em>Date Validated</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVerificationResultValidator()
 * @model extendedMetaData="name='VerificationResult.Validator' kind='elementOnly'"
 * @generated
 */
public interface VerificationResultValidator extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultValidator_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultValidator#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the organization validating information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultValidator_Organization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultValidator#getOrganization <em>Organization</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital identity certificate associated with the validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Certificate</em>' containment reference.
	 * @see #setIdentityCertificate(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultValidator_IdentityCertificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identityCertificate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIdentityCertificate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultValidator#getIdentityCertificate <em>Identity Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Certificate</em>' containment reference.
	 * @see #getIdentityCertificate()
	 * @generated
	 */
	void setIdentityCertificate(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Date Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date on which the validator last validated the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Validated</em>' containment reference.
	 * @see #setDateValidated(Date)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultValidator_DateValidated()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateValidated' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDateValidated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultValidator#getDateValidated <em>Date Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Validated</em>' containment reference.
	 * @see #getDateValidated()
	 * @generated
	 */
	void setDateValidated(Date value);

} // VerificationResultValidator
