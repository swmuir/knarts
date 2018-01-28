/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result Primary Source</b></em>'.
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
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getValidationDate <em>Validation Date</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getCanPushUpdates <em>Can Push Updates</em>}</li>
 *   <li>{@link org.hl7.fhir.VerificationResultPrimarySource#getPushTypeAvailable <em>Push Type Available</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource()
 * @model extendedMetaData="name='VerificationResult.PrimarySource' kind='elementOnly'"
 * @generated
 */
public interface VerificationResultPrimarySource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the primary source for validation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultPrimarySource#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * Reference to the primary source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultPrimarySource#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Validation Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method for communicating with the primary source (manual; API; Push).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Process</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_ValidationProcess()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='validationProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValidationProcess();

	/**
	 * Returns the value of the '<em><b>Validation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the validation of the target against the primary source (successful; failed; unknown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Status</em>' containment reference.
	 * @see #setValidationStatus(ValidationStatus)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_ValidationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidationStatus getValidationStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultPrimarySource#getValidationStatus <em>Validation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Status</em>' containment reference.
	 * @see #getValidationStatus()
	 * @generated
	 */
	void setValidationStatus(ValidationStatus value);

	/**
	 * Returns the value of the '<em><b>Validation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the target was validated against the primary source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Date</em>' containment reference.
	 * @see #setValidationDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_ValidationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValidationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultPrimarySource#getValidationDate <em>Validation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Date</em>' containment reference.
	 * @see #getValidationDate()
	 * @generated
	 */
	void setValidationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Can Push Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ability of the primary source to push updates/alerts (yes; no; undetermined).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Push Updates</em>' containment reference.
	 * @see #setCanPushUpdates(CanPushUpdates)
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_CanPushUpdates()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='canPushUpdates' namespace='##targetNamespace'"
	 * @generated
	 */
	CanPushUpdates getCanPushUpdates();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VerificationResultPrimarySource#getCanPushUpdates <em>Can Push Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Push Updates</em>' containment reference.
	 * @see #getCanPushUpdates()
	 * @generated
	 */
	void setCanPushUpdates(CanPushUpdates value);

	/**
	 * Returns the value of the '<em><b>Push Type Available</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PushTypeAvailable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Type Available</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getVerificationResultPrimarySource_PushTypeAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pushTypeAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PushTypeAvailable> getPushTypeAvailable();

} // VerificationResultPrimarySource
