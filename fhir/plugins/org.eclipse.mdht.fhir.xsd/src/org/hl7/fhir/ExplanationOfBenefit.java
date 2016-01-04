/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getRelatedClaim <em>Related Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getSpecialCondition <em>Special Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getException <em>Exception</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getSchool <em>School</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentDate <em>Accident Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationString <em>Accident Location String</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationAddress <em>Accident Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationReference <em>Accident Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getInterventionException <em>Intervention Exception</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOnsetDate <em>Onset Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOnsetPeriod <em>Onset Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimTotal <em>Claim Total</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getMissingTeeth <em>Missing Teeth</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit()
 * @model extendedMetaData="name='ExplanationOfBenefit' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefit extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the specification on which this instance relies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the specification from which the original instance was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the EOB was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Billable Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The billable period for which charges are being submitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billable Period</em>' containment reference.
	 * @see #setBillablePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BillablePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='billablePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' containment reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facility where the services were provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference.
	 * @see #setFacility(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facility' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFacility();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getFacility <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' containment reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Reference value);

	/**
	 * Returns the value of the '<em><b>Related Claim</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Claim</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_RelatedClaim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedClaim' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRelatedClaim();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prescription to support the dispensing of Pharmacy or Vision products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Prescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Original Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Prescription</em>' containment reference.
	 * @see #setOriginalPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOriginalPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription</em>' containment reference.
	 * @see #getOriginalPrescription()
	 * @generated
	 */
	void setOriginalPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party to be reimbursed for the services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(ExplanationOfBenefitPayee)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitPayee getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ExplanationOfBenefitPayee value);

	/**
	 * Returns the value of the '<em><b>Referral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral resource which lists the date, practitioner, reason and other supporting information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral</em>' containment reference.
	 * @see #setReferral(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Referral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referral' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferral();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getReferral <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' containment reference.
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(Reference value);

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient diagnosis for which care is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Special Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_SpecialCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSpecialCondition();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precedence (primary, secondary, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference.
	 * @see #setPrecedence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Precedence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precedence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPrecedence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' containment reference.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(ExplanationOfBenefitCoverage)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitCoverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(ExplanationOfBenefitCoverage value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factors which may influence the applicability of coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Exception()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getException();

	/**
	 * Returns the value of the '<em><b>School</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of school for over-aged dependants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>School</em>' containment reference.
	 * @see #setSchool(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_School()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='school' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSchool();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getSchool <em>School</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' containment reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Accident Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of an accident which these services are addressing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accident Date</em>' containment reference.
	 * @see #setAccidentDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AccidentDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accidentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getAccidentDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentDate <em>Accident Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Date</em>' containment reference.
	 * @see #getAccidentDate()
	 * @generated
	 */
	void setAccidentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Accident Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of accident: work, auto, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accident Type</em>' containment reference.
	 * @see #setAccidentType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AccidentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accidentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getAccidentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentType <em>Accident Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Type</em>' containment reference.
	 * @see #getAccidentType()
	 * @generated
	 */
	void setAccidentType(Coding value);

	/**
	 * Returns the value of the '<em><b>Accident Location String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident Location String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Location String</em>' containment reference.
	 * @see #setAccidentLocationString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AccidentLocationString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accidentLocationString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAccidentLocationString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationString <em>Accident Location String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Location String</em>' containment reference.
	 * @see #getAccidentLocationString()
	 * @generated
	 */
	void setAccidentLocationString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Accident Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident Location Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Location Address</em>' containment reference.
	 * @see #setAccidentLocationAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AccidentLocationAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accidentLocationAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getAccidentLocationAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationAddress <em>Accident Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Location Address</em>' containment reference.
	 * @see #getAccidentLocationAddress()
	 * @generated
	 */
	void setAccidentLocationAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Accident Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident Location Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Location Reference</em>' containment reference.
	 * @see #setAccidentLocationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AccidentLocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accidentLocationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAccidentLocationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccidentLocationReference <em>Accident Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Location Reference</em>' containment reference.
	 * @see #getAccidentLocationReference()
	 * @generated
	 */
	void setAccidentLocationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Intervention Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of intervention and exception codes which may influence the adjudication of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intervention Exception</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_InterventionException()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interventionException' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getInterventionException();

	/**
	 * Returns the value of the '<em><b>Onset Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Date</em>' containment reference.
	 * @see #setOnsetDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OnsetDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getOnsetDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOnsetDate <em>Onset Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Date</em>' containment reference.
	 * @see #getOnsetDate()
	 * @generated
	 */
	void setOnsetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Onset Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset Period</em>' containment reference.
	 * @see #setOnsetPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OnsetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onsetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOnsetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOnsetPeriod <em>Onset Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset Period</em>' containment reference.
	 * @see #getOnsetPeriod()
	 * @generated
	 */
	void setOnsetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Employment Impacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #setEmploymentImpacted(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_EmploymentImpacted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='employmentImpacted' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEmploymentImpacted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #getEmploymentImpacted()
	 * @generated
	 */
	void setEmploymentImpacted(Period value);

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was confined to a treatment center.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hospitalization</em>' containment reference.
	 * @see #setHospitalization(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Hospitalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hospitalization' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getHospitalization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Claim Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total value of the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Total</em>' containment reference.
	 * @see #setClaimTotal(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimTotal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getClaimTotal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimTotal <em>Claim Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Total</em>' containment reference.
	 * @see #getClaimTotal()
	 * @generated
	 */
	void setClaimTotal(Money value);

	/**
	 * Returns the value of the '<em><b>Missing Teeth</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitMissingTeeth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missing Teeth</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_MissingTeeth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missingTeeth' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitMissingTeeth> getMissingTeeth();

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of deductable applied which was not allocated to any particular service line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_UnallocDeductable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unallocDeductable' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Benefit</em>' containment reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_TotalBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' containment reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Adjustment</em>' containment reference.
	 * @see #setPaymentAdjustment(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PaymentAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPaymentAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAdjustment <em>Payment Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment</em>' containment reference.
	 * @see #getPaymentAdjustment()
	 * @generated
	 */
	void setPaymentAdjustment(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason for the payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Adjustment Reason</em>' containment reference.
	 * @see #setPaymentAdjustmentReason(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PaymentAdjustmentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAdjustmentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPaymentAdjustmentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment Reason</em>' containment reference.
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 */
	void setPaymentAdjustmentReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated payment data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Date</em>' containment reference.
	 * @see #setPaymentDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PaymentDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payable less any payment adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Amount</em>' containment reference.
	 * @see #setPaymentAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PaymentAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPaymentAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentAmount <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' containment reference.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment identifer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Ref</em>' containment reference.
	 * @see #setPaymentRef(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_PaymentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paymentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPaymentRef();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPaymentRef <em>Payment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref</em>' containment reference.
	 * @see #getPaymentRef()
	 * @generated
	 */
	void setPaymentRef(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of funds reservation (For provider, for Patient, None).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' containment reference.
	 * @see #setReserved(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Reserved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getReserved();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getReserved <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' containment reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Coding value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitNote> getNote();

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Balance by Benefit Category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BenefitBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitBenefitBalance> getBenefitBalance();

} // ExplanationOfBenefit
