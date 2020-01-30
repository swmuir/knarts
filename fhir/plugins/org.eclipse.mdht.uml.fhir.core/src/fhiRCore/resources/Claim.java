/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Claim#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getRelateds <em>Related</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getPayee <em>Payee</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getReferral <em>Referral</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getFacility <em>Facility</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getAccident <em>Accident</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getItems <em>Item</em>}</li>
 *   <li>{@link fhiRCore.resources.Claim#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getType <em>Type</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_SubType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getSubType <em>Sub Type</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Use()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getUse <em>Use</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getPatient <em>Patient</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_BillablePeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getBillablePeriod <em>Billable Period</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getCreated <em>Created</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Enterer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getEnterer <em>Enterer</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Insurer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getInsurer <em>Insurer</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Provider()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getProvider <em>Provider</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Priority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_FundsReserve()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFundsReserve();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getFundsReserve <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve</em>' containment reference.
	 * @see #getFundsReserve()
	 * @generated
	 */
	void setFundsReserve(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimRelatedClaim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Related()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimRelatedClaim> getRelateds();

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Prescription()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPrescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getPrescription <em>Prescription</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_OriginalPrescription()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOriginalPrescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getOriginalPrescription <em>Original Prescription</em>}' containment reference.
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
	 * @see #setPayee(ClaimPayee)
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Payee()
	 * @model containment="true"
	 * @generated
	 */
	ClaimPayee getPayee();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ClaimPayee value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Referral()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReferral();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getReferral <em>Referral</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Facility()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFacility();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getFacility <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' containment reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Reference value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimCareTeam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Team</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_CareTeam()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimCareTeam> getCareTeams();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimSupportingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_SupportingInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimSupportingInformation> getSupportingInfos();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Diagnosis()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimProcedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimInsurance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Insurance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClaimInsurance> getInsurances();

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ClaimAccident)
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Accident()
	 * @model containment="true"
	 * @generated
	 */
	ClaimAccident getAccident();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ClaimAccident value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimItem> getItems();

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getClaim_Total()
	 * @model containment="true"
	 * @generated
	 */
	Money getTotal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Claim#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(Money value);

} // Claim
