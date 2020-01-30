/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getFundsReserveRequested <em>Funds Reserve Requested</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getRelateds <em>Related</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPayee <em>Payee</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getReferral <em>Referral</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getFacility <em>Facility</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getClaim <em>Claim</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPreAuthRefPeriods <em>Pre Auth Ref Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getAccident <em>Accident</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getItems <em>Item</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getTotals <em>Total</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getPayment <em>Payment</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getForm <em>Form</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getProcessNotes <em>Process Note</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getBenefitPeriod <em>Benefit Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefit#getBenefitBalances <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit()
 * @model
 * @generated
 */
public interface ExplanationOfBenefit extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_SubType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Use()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Billable Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billable Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billable Period</em>' containment reference.
	 * @see #setBillablePeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_BillablePeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' containment reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Enterer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Insurer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Provider()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Priority()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Funds Reserve Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funds Reserve Requested</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funds Reserve Requested</em>' containment reference.
	 * @see #setFundsReserveRequested(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_FundsReserveRequested()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFundsReserveRequested();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getFundsReserveRequested <em>Funds Reserve Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve Requested</em>' containment reference.
	 * @see #getFundsReserveRequested()
	 * @generated
	 */
	void setFundsReserveRequested(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Funds Reserve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funds Reserve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #setFundsReserve(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_FundsReserve()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFundsReserve();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getFundsReserve <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #getFundsReserve()
	 * @generated
	 */
	void setFundsReserve(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Related()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitRelatedClaim> getRelateds();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Prescription()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPrescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPrescription <em>Prescription</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Original Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Prescription</em>' containment reference.
	 * @see #setOriginalPrescription(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_OriginalPrescription()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOriginalPrescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Payee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(ExplanationOfBenefitPayee)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Payee()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitPayee getPayee();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPayee <em>Payee</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Referral</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral</em>' containment reference.
	 * @see #setReferral(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Referral()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReferral();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getReferral <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' containment reference.
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(Reference value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference.
	 * @see #setFacility(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Facility()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFacility();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getFacility <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' containment reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Claim()
	 * @model containment="true"
	 * @generated
	 */
	Reference getClaim();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getClaim <em>Claim</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Claim Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_ClaimResponse()
	 * @model containment="true"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Outcome()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Disposition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisposition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_PreAuthRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getPreAuthRefs();

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref Period</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Period}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth Ref Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth Ref Period</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_PreAuthRefPeriod()
	 * @model containment="true"
	 * @generated
	 */
	EList<Period> getPreAuthRefPeriods();

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitCareTeam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Team</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_CareTeam()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitCareTeam> getCareTeams();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitSupportingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_SupportingInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitSupportingInformation> getSupportingInfos();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Diagnosis()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitProcedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference.
	 * @see #setPrecedence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Precedence()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getPrecedence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' containment reference.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitInsurance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Insurance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitInsurance> getInsurances();

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ExplanationOfBenefitAccident)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Accident()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitAccident getAccident();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ExplanationOfBenefitAccident value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItem> getItems();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitAddedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_AddItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddedItem> getAddItems();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitTotal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Total()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitTotal> getTotals();

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ExplanationOfBenefitPayment)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Payment()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitPayment getPayment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ExplanationOfBenefitPayment value);

	/**
	 * Returns the value of the '<em><b>Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Code</em>' containment reference.
	 * @see #setFormCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_FormCode()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFormCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getFormCode <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Code</em>' containment reference.
	 * @see #getFormCode()
	 * @generated
	 */
	void setFormCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Attachment)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_Form()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getForm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Attachment value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_ProcessNote()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitNote> getProcessNotes();

	/**
	 * Returns the value of the '<em><b>Benefit Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Period</em>' containment reference.
	 * @see #setBenefitPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_BenefitPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getBenefitPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefit#getBenefitPeriod <em>Benefit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Period</em>' containment reference.
	 * @see #getBenefitPeriod()
	 * @generated
	 */
	void setBenefitPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Balance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefit_BenefitBalance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitBenefitBalance> getBenefitBalances();

} // ExplanationOfBenefit
