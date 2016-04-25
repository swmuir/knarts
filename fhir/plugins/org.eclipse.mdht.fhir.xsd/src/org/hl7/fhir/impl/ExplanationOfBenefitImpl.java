/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Address;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCoverage;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitMissingTeeth;
import org.hl7.fhir.ExplanationOfBenefitNote;
import org.hl7.fhir.ExplanationOfBenefitOnset;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimIdentifier <em>Claim Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimReference <em>Claim Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimResponseIdentifier <em>Claim Response Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimResponseReference <em>Claim Response Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOrganizationIdentifier <em>Organization Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOrganizationReference <em>Organization Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFacilityIdentifier <em>Facility Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFacilityReference <em>Facility Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrescriptionIdentifier <em>Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrescriptionReference <em>Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOriginalPrescriptionIdentifier <em>Original Prescription Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOriginalPrescriptionReference <em>Original Prescription Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getReferralIdentifier <em>Referral Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getReferralReference <em>Referral Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOccurrenceCode <em>Occurrence Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOccurenceSpanCode <em>Occurence Span Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getSpecialCondition <em>Special Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPatientIdentifier <em>Patient Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPatientReference <em>Patient Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccidentDate <em>Accident Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccidentLocationAddress <em>Accident Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccidentLocationReference <em>Accident Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInterventionException <em>Intervention Exception</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getMissingTeeth <em>Missing Teeth</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitImpl extends DomainResourceImpl implements ExplanationOfBenefit {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getClaimIdentifier() <em>Claim Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier claimIdentifier;

	/**
	 * The cached value of the '{@link #getClaimReference() <em>Claim Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimReference()
	 * @generated
	 * @ordered
	 */
	protected Reference claimReference;

	/**
	 * The cached value of the '{@link #getClaimResponseIdentifier() <em>Claim Response Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponseIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier claimResponseIdentifier;

	/**
	 * The cached value of the '{@link #getClaimResponseReference() <em>Claim Response Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponseReference()
	 * @generated
	 * @ordered
	 */
	protected Reference claimResponseReference;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subType;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getProviderIdentifier() <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier providerIdentifier;

	/**
	 * The cached value of the '{@link #getProviderReference() <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference providerReference;

	/**
	 * The cached value of the '{@link #getOrganizationIdentifier() <em>Organization Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier organizationIdentifier;

	/**
	 * The cached value of the '{@link #getOrganizationReference() <em>Organization Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference organizationReference;

	/**
	 * The cached value of the '{@link #getFacilityIdentifier() <em>Facility Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier facilityIdentifier;

	/**
	 * The cached value of the '{@link #getFacilityReference() <em>Facility Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityReference()
	 * @generated
	 * @ordered
	 */
	protected Reference facilityReference;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitRelated> related;

	/**
	 * The cached value of the '{@link #getPrescriptionIdentifier() <em>Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier prescriptionIdentifier;

	/**
	 * The cached value of the '{@link #getPrescriptionReference() <em>Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference prescriptionReference;

	/**
	 * The cached value of the '{@link #getOriginalPrescriptionIdentifier() <em>Original Prescription Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescriptionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier originalPrescriptionIdentifier;

	/**
	 * The cached value of the '{@link #getOriginalPrescriptionReference() <em>Original Prescription Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescriptionReference()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescriptionReference;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayee payee;

	/**
	 * The cached value of the '{@link #getReferralIdentifier() <em>Referral Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier referralIdentifier;

	/**
	 * The cached value of the '{@link #getReferralReference() <em>Referral Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralReference()
	 * @generated
	 * @ordered
	 */
	protected Reference referralReference;

	/**
	 * The cached value of the '{@link #getOccurrenceCode() <em>Occurrence Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> occurrenceCode;

	/**
	 * The cached value of the '{@link #getOccurenceSpanCode() <em>Occurence Span Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceSpanCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> occurenceSpanCode;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> valueCode;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitProcedure> procedure;

	/**
	 * The cached value of the '{@link #getSpecialCondition() <em>Special Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> specialCondition;

	/**
	 * The cached value of the '{@link #getPatientIdentifier() <em>Patient Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier patientIdentifier;

	/**
	 * The cached value of the '{@link #getPatientReference() <em>Patient Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientReference()
	 * @generated
	 * @ordered
	 */
	protected Reference patientReference;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt precedence;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitCoverage coverage;

	/**
	 * The cached value of the '{@link #getAccidentDate() <em>Accident Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentDate()
	 * @generated
	 * @ordered
	 */
	protected Date accidentDate;

	/**
	 * The cached value of the '{@link #getAccidentType() <em>Accident Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentType()
	 * @generated
	 * @ordered
	 */
	protected Coding accidentType;

	/**
	 * The cached value of the '{@link #getAccidentLocationAddress() <em>Accident Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentLocationAddress()
	 * @generated
	 * @ordered
	 */
	protected Address accidentLocationAddress;

	/**
	 * The cached value of the '{@link #getAccidentLocationReference() <em>Accident Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentLocationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference accidentLocationReference;

	/**
	 * The cached value of the '{@link #getInterventionException() <em>Intervention Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionException()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> interventionException;

	/**
	 * The cached value of the '{@link #getOnset() <em>Onset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnset()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitOnset> onset;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddItem> addItem;

	/**
	 * The cached value of the '{@link #getMissingTeeth() <em>Missing Teeth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingTeeth()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitMissingTeeth> missingTeeth;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPaymentAdjustment() <em>Payment Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAdjustment;

	/**
	 * The cached value of the '{@link #getPaymentAdjustmentReason() <em>Payment Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentAdjustmentReason;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAmount;

	/**
	 * The cached value of the '{@link #getPaymentRef() <em>Payment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRef()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentRef;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Coding form;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitNote> note;

	/**
	 * The cached value of the '{@link #getBenefitBalance() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitBenefitBalance> benefitBalance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getClaimIdentifier() {
		return claimIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimIdentifier(Identifier newClaimIdentifier, NotificationChain msgs) {
		Identifier oldClaimIdentifier = claimIdentifier;
		claimIdentifier = newClaimIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER, oldClaimIdentifier, newClaimIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimIdentifier(Identifier newClaimIdentifier) {
		if (newClaimIdentifier != claimIdentifier) {
			NotificationChain msgs = null;
			if (claimIdentifier != null)
				msgs = ((InternalEObject)claimIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER, null, msgs);
			if (newClaimIdentifier != null)
				msgs = ((InternalEObject)newClaimIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER, null, msgs);
			msgs = basicSetClaimIdentifier(newClaimIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER, newClaimIdentifier, newClaimIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimReference() {
		return claimReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimReference(Reference newClaimReference, NotificationChain msgs) {
		Reference oldClaimReference = claimReference;
		claimReference = newClaimReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE, oldClaimReference, newClaimReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimReference(Reference newClaimReference) {
		if (newClaimReference != claimReference) {
			NotificationChain msgs = null;
			if (claimReference != null)
				msgs = ((InternalEObject)claimReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE, null, msgs);
			if (newClaimReference != null)
				msgs = ((InternalEObject)newClaimReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE, null, msgs);
			msgs = basicSetClaimReference(newClaimReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE, newClaimReference, newClaimReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getClaimResponseIdentifier() {
		return claimResponseIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponseIdentifier(Identifier newClaimResponseIdentifier, NotificationChain msgs) {
		Identifier oldClaimResponseIdentifier = claimResponseIdentifier;
		claimResponseIdentifier = newClaimResponseIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER, oldClaimResponseIdentifier, newClaimResponseIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponseIdentifier(Identifier newClaimResponseIdentifier) {
		if (newClaimResponseIdentifier != claimResponseIdentifier) {
			NotificationChain msgs = null;
			if (claimResponseIdentifier != null)
				msgs = ((InternalEObject)claimResponseIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER, null, msgs);
			if (newClaimResponseIdentifier != null)
				msgs = ((InternalEObject)newClaimResponseIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER, null, msgs);
			msgs = basicSetClaimResponseIdentifier(newClaimResponseIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER, newClaimResponseIdentifier, newClaimResponseIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimResponseReference() {
		return claimResponseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponseReference(Reference newClaimResponseReference, NotificationChain msgs) {
		Reference oldClaimResponseReference = claimResponseReference;
		claimResponseReference = newClaimResponseReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE, oldClaimResponseReference, newClaimResponseReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponseReference(Reference newClaimResponseReference) {
		if (newClaimResponseReference != claimResponseReference) {
			NotificationChain msgs = null;
			if (claimResponseReference != null)
				msgs = ((InternalEObject)claimResponseReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE, null, msgs);
			if (newClaimResponseReference != null)
				msgs = ((InternalEObject)newClaimResponseReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE, null, msgs);
			msgs = basicSetClaimResponseReference(newClaimResponseReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE, newClaimResponseReference, newClaimResponseReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillablePeriod(Period newBillablePeriod, NotificationChain msgs) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, newBillablePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		if (newBillablePeriod != billablePeriod) {
			NotificationChain msgs = null;
			if (billablePeriod != null)
				msgs = ((InternalEObject)billablePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			if (newBillablePeriod != null)
				msgs = ((InternalEObject)newBillablePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			msgs = basicSetBillablePeriod(newBillablePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, newBillablePeriod, newBillablePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getProviderIdentifier() {
		return providerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIdentifier(Identifier newProviderIdentifier, NotificationChain msgs) {
		Identifier oldProviderIdentifier = providerIdentifier;
		providerIdentifier = newProviderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIdentifier(Identifier newProviderIdentifier) {
		if (newProviderIdentifier != providerIdentifier) {
			NotificationChain msgs = null;
			if (providerIdentifier != null)
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProviderReference() {
		return providerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderReference(Reference newProviderReference, NotificationChain msgs) {
		Reference oldProviderReference = providerReference;
		providerReference = newProviderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderReference(Reference newProviderReference) {
		if (newProviderReference != providerReference) {
			NotificationChain msgs = null;
			if (providerReference != null)
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOrganizationIdentifier() {
		return organizationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationIdentifier(Identifier newOrganizationIdentifier, NotificationChain msgs) {
		Identifier oldOrganizationIdentifier = organizationIdentifier;
		organizationIdentifier = newOrganizationIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER, oldOrganizationIdentifier, newOrganizationIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationIdentifier(Identifier newOrganizationIdentifier) {
		if (newOrganizationIdentifier != organizationIdentifier) {
			NotificationChain msgs = null;
			if (organizationIdentifier != null)
				msgs = ((InternalEObject)organizationIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER, null, msgs);
			if (newOrganizationIdentifier != null)
				msgs = ((InternalEObject)newOrganizationIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER, null, msgs);
			msgs = basicSetOrganizationIdentifier(newOrganizationIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER, newOrganizationIdentifier, newOrganizationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganizationReference() {
		return organizationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationReference(Reference newOrganizationReference, NotificationChain msgs) {
		Reference oldOrganizationReference = organizationReference;
		organizationReference = newOrganizationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE, oldOrganizationReference, newOrganizationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationReference(Reference newOrganizationReference) {
		if (newOrganizationReference != organizationReference) {
			NotificationChain msgs = null;
			if (organizationReference != null)
				msgs = ((InternalEObject)organizationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE, null, msgs);
			if (newOrganizationReference != null)
				msgs = ((InternalEObject)newOrganizationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE, null, msgs);
			msgs = basicSetOrganizationReference(newOrganizationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE, newOrganizationReference, newOrganizationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getFacilityIdentifier() {
		return facilityIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityIdentifier(Identifier newFacilityIdentifier, NotificationChain msgs) {
		Identifier oldFacilityIdentifier = facilityIdentifier;
		facilityIdentifier = newFacilityIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER, oldFacilityIdentifier, newFacilityIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityIdentifier(Identifier newFacilityIdentifier) {
		if (newFacilityIdentifier != facilityIdentifier) {
			NotificationChain msgs = null;
			if (facilityIdentifier != null)
				msgs = ((InternalEObject)facilityIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER, null, msgs);
			if (newFacilityIdentifier != null)
				msgs = ((InternalEObject)newFacilityIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER, null, msgs);
			msgs = basicSetFacilityIdentifier(newFacilityIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER, newFacilityIdentifier, newFacilityIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFacilityReference() {
		return facilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityReference(Reference newFacilityReference, NotificationChain msgs) {
		Reference oldFacilityReference = facilityReference;
		facilityReference = newFacilityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE, oldFacilityReference, newFacilityReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityReference(Reference newFacilityReference) {
		if (newFacilityReference != facilityReference) {
			NotificationChain msgs = null;
			if (facilityReference != null)
				msgs = ((InternalEObject)facilityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE, null, msgs);
			if (newFacilityReference != null)
				msgs = ((InternalEObject)newFacilityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE, null, msgs);
			msgs = basicSetFacilityReference(newFacilityReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE, newFacilityReference, newFacilityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ExplanationOfBenefitRelated>(ExplanationOfBenefitRelated.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPrescriptionIdentifier() {
		return prescriptionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptionIdentifier(Identifier newPrescriptionIdentifier, NotificationChain msgs) {
		Identifier oldPrescriptionIdentifier = prescriptionIdentifier;
		prescriptionIdentifier = newPrescriptionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER, oldPrescriptionIdentifier, newPrescriptionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionIdentifier(Identifier newPrescriptionIdentifier) {
		if (newPrescriptionIdentifier != prescriptionIdentifier) {
			NotificationChain msgs = null;
			if (prescriptionIdentifier != null)
				msgs = ((InternalEObject)prescriptionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER, null, msgs);
			if (newPrescriptionIdentifier != null)
				msgs = ((InternalEObject)newPrescriptionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER, null, msgs);
			msgs = basicSetPrescriptionIdentifier(newPrescriptionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER, newPrescriptionIdentifier, newPrescriptionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescriptionReference() {
		return prescriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptionReference(Reference newPrescriptionReference, NotificationChain msgs) {
		Reference oldPrescriptionReference = prescriptionReference;
		prescriptionReference = newPrescriptionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE, oldPrescriptionReference, newPrescriptionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionReference(Reference newPrescriptionReference) {
		if (newPrescriptionReference != prescriptionReference) {
			NotificationChain msgs = null;
			if (prescriptionReference != null)
				msgs = ((InternalEObject)prescriptionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE, null, msgs);
			if (newPrescriptionReference != null)
				msgs = ((InternalEObject)newPrescriptionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE, null, msgs);
			msgs = basicSetPrescriptionReference(newPrescriptionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE, newPrescriptionReference, newPrescriptionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOriginalPrescriptionIdentifier() {
		return originalPrescriptionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescriptionIdentifier(Identifier newOriginalPrescriptionIdentifier, NotificationChain msgs) {
		Identifier oldOriginalPrescriptionIdentifier = originalPrescriptionIdentifier;
		originalPrescriptionIdentifier = newOriginalPrescriptionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER, oldOriginalPrescriptionIdentifier, newOriginalPrescriptionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescriptionIdentifier(Identifier newOriginalPrescriptionIdentifier) {
		if (newOriginalPrescriptionIdentifier != originalPrescriptionIdentifier) {
			NotificationChain msgs = null;
			if (originalPrescriptionIdentifier != null)
				msgs = ((InternalEObject)originalPrescriptionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER, null, msgs);
			if (newOriginalPrescriptionIdentifier != null)
				msgs = ((InternalEObject)newOriginalPrescriptionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER, null, msgs);
			msgs = basicSetOriginalPrescriptionIdentifier(newOriginalPrescriptionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER, newOriginalPrescriptionIdentifier, newOriginalPrescriptionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOriginalPrescriptionReference() {
		return originalPrescriptionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescriptionReference(Reference newOriginalPrescriptionReference, NotificationChain msgs) {
		Reference oldOriginalPrescriptionReference = originalPrescriptionReference;
		originalPrescriptionReference = newOriginalPrescriptionReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE, oldOriginalPrescriptionReference, newOriginalPrescriptionReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescriptionReference(Reference newOriginalPrescriptionReference) {
		if (newOriginalPrescriptionReference != originalPrescriptionReference) {
			NotificationChain msgs = null;
			if (originalPrescriptionReference != null)
				msgs = ((InternalEObject)originalPrescriptionReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE, null, msgs);
			if (newOriginalPrescriptionReference != null)
				msgs = ((InternalEObject)newOriginalPrescriptionReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE, null, msgs);
			msgs = basicSetOriginalPrescriptionReference(newOriginalPrescriptionReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE, newOriginalPrescriptionReference, newOriginalPrescriptionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ExplanationOfBenefitPayee newPayee, NotificationChain msgs) {
		ExplanationOfBenefitPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ExplanationOfBenefitPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getReferralIdentifier() {
		return referralIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralIdentifier(Identifier newReferralIdentifier, NotificationChain msgs) {
		Identifier oldReferralIdentifier = referralIdentifier;
		referralIdentifier = newReferralIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER, oldReferralIdentifier, newReferralIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralIdentifier(Identifier newReferralIdentifier) {
		if (newReferralIdentifier != referralIdentifier) {
			NotificationChain msgs = null;
			if (referralIdentifier != null)
				msgs = ((InternalEObject)referralIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER, null, msgs);
			if (newReferralIdentifier != null)
				msgs = ((InternalEObject)newReferralIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER, null, msgs);
			msgs = basicSetReferralIdentifier(newReferralIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER, newReferralIdentifier, newReferralIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferralReference() {
		return referralReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralReference(Reference newReferralReference, NotificationChain msgs) {
		Reference oldReferralReference = referralReference;
		referralReference = newReferralReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE, oldReferralReference, newReferralReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralReference(Reference newReferralReference) {
		if (newReferralReference != referralReference) {
			NotificationChain msgs = null;
			if (referralReference != null)
				msgs = ((InternalEObject)referralReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE, null, msgs);
			if (newReferralReference != null)
				msgs = ((InternalEObject)newReferralReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE, null, msgs);
			msgs = basicSetReferralReference(newReferralReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE, newReferralReference, newReferralReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getOccurrenceCode() {
		if (occurrenceCode == null) {
			occurrenceCode = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE);
		}
		return occurrenceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getOccurenceSpanCode() {
		if (occurenceSpanCode == null) {
			occurenceSpanCode = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE);
		}
		return occurenceSpanCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getValueCode() {
		if (valueCode == null) {
			valueCode = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE);
		}
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ExplanationOfBenefitDiagnosis>(ExplanationOfBenefitDiagnosis.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<ExplanationOfBenefitProcedure>(ExplanationOfBenefitProcedure.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSpecialCondition() {
		if (specialCondition == null) {
			specialCondition = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION);
		}
		return specialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPatientIdentifier() {
		return patientIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientIdentifier(Identifier newPatientIdentifier, NotificationChain msgs) {
		Identifier oldPatientIdentifier = patientIdentifier;
		patientIdentifier = newPatientIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER, oldPatientIdentifier, newPatientIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientIdentifier(Identifier newPatientIdentifier) {
		if (newPatientIdentifier != patientIdentifier) {
			NotificationChain msgs = null;
			if (patientIdentifier != null)
				msgs = ((InternalEObject)patientIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER, null, msgs);
			if (newPatientIdentifier != null)
				msgs = ((InternalEObject)newPatientIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER, null, msgs);
			msgs = basicSetPatientIdentifier(newPatientIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER, newPatientIdentifier, newPatientIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatientReference() {
		return patientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientReference(Reference newPatientReference, NotificationChain msgs) {
		Reference oldPatientReference = patientReference;
		patientReference = newPatientReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE, oldPatientReference, newPatientReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientReference(Reference newPatientReference) {
		if (newPatientReference != patientReference) {
			NotificationChain msgs = null;
			if (patientReference != null)
				msgs = ((InternalEObject)patientReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE, null, msgs);
			if (newPatientReference != null)
				msgs = ((InternalEObject)newPatientReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE, null, msgs);
			msgs = basicSetPatientReference(newPatientReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE, newPatientReference, newPatientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence(PositiveInt newPrecedence, NotificationChain msgs) {
		PositiveInt oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, newPrecedence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(PositiveInt newPrecedence) {
		if (newPrecedence != precedence) {
			NotificationChain msgs = null;
			if (precedence != null)
				msgs = ((InternalEObject)precedence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			if (newPrecedence != null)
				msgs = ((InternalEObject)newPrecedence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			msgs = basicSetPrecedence(newPrecedence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, newPrecedence, newPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCoverage getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(ExplanationOfBenefitCoverage newCoverage, NotificationChain msgs) {
		ExplanationOfBenefitCoverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE, oldCoverage, newCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(ExplanationOfBenefitCoverage newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccidentDate() {
		return accidentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidentDate(Date newAccidentDate, NotificationChain msgs) {
		Date oldAccidentDate = accidentDate;
		accidentDate = newAccidentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, oldAccidentDate, newAccidentDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentDate(Date newAccidentDate) {
		if (newAccidentDate != accidentDate) {
			NotificationChain msgs = null;
			if (accidentDate != null)
				msgs = ((InternalEObject)accidentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, null, msgs);
			if (newAccidentDate != null)
				msgs = ((InternalEObject)newAccidentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, null, msgs);
			msgs = basicSetAccidentDate(newAccidentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, newAccidentDate, newAccidentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAccidentType() {
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidentType(Coding newAccidentType, NotificationChain msgs) {
		Coding oldAccidentType = accidentType;
		accidentType = newAccidentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, oldAccidentType, newAccidentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentType(Coding newAccidentType) {
		if (newAccidentType != accidentType) {
			NotificationChain msgs = null;
			if (accidentType != null)
				msgs = ((InternalEObject)accidentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, null, msgs);
			if (newAccidentType != null)
				msgs = ((InternalEObject)newAccidentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, null, msgs);
			msgs = basicSetAccidentType(newAccidentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, newAccidentType, newAccidentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAccidentLocationAddress() {
		return accidentLocationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidentLocationAddress(Address newAccidentLocationAddress, NotificationChain msgs) {
		Address oldAccidentLocationAddress = accidentLocationAddress;
		accidentLocationAddress = newAccidentLocationAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS, oldAccidentLocationAddress, newAccidentLocationAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentLocationAddress(Address newAccidentLocationAddress) {
		if (newAccidentLocationAddress != accidentLocationAddress) {
			NotificationChain msgs = null;
			if (accidentLocationAddress != null)
				msgs = ((InternalEObject)accidentLocationAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS, null, msgs);
			if (newAccidentLocationAddress != null)
				msgs = ((InternalEObject)newAccidentLocationAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS, null, msgs);
			msgs = basicSetAccidentLocationAddress(newAccidentLocationAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS, newAccidentLocationAddress, newAccidentLocationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAccidentLocationReference() {
		return accidentLocationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidentLocationReference(Reference newAccidentLocationReference, NotificationChain msgs) {
		Reference oldAccidentLocationReference = accidentLocationReference;
		accidentLocationReference = newAccidentLocationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE, oldAccidentLocationReference, newAccidentLocationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentLocationReference(Reference newAccidentLocationReference) {
		if (newAccidentLocationReference != accidentLocationReference) {
			NotificationChain msgs = null;
			if (accidentLocationReference != null)
				msgs = ((InternalEObject)accidentLocationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE, null, msgs);
			if (newAccidentLocationReference != null)
				msgs = ((InternalEObject)newAccidentLocationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE, null, msgs);
			msgs = basicSetAccidentLocationReference(newAccidentLocationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE, newAccidentLocationReference, newAccidentLocationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getInterventionException() {
		if (interventionException == null) {
			interventionException = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION);
		}
		return interventionException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitOnset> getOnset() {
		if (onset == null) {
			onset = new EObjectContainmentEList<ExplanationOfBenefitOnset>(ExplanationOfBenefitOnset.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ONSET);
		}
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmploymentImpacted(Period newEmploymentImpacted, NotificationChain msgs) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, newEmploymentImpacted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		if (newEmploymentImpacted != employmentImpacted) {
			NotificationChain msgs = null;
			if (employmentImpacted != null)
				msgs = ((InternalEObject)employmentImpacted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, null, msgs);
			if (newEmploymentImpacted != null)
				msgs = ((InternalEObject)newEmploymentImpacted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, null, msgs);
			msgs = basicSetEmploymentImpacted(newEmploymentImpacted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, newEmploymentImpacted, newEmploymentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(Period newHospitalization, NotificationChain msgs) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, newHospitalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ExplanationOfBenefitItem>(ExplanationOfBenefitItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ExplanationOfBenefitAddItem>(ExplanationOfBenefitAddItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitMissingTeeth> getMissingTeeth() {
		if (missingTeeth == null) {
			missingTeeth = new EObjectContainmentEList<ExplanationOfBenefitMissingTeeth>(ExplanationOfBenefitMissingTeeth.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH);
		}
		return missingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalCost(Money newTotalCost, NotificationChain msgs) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, oldTotalCost, newTotalCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		if (newTotalCost != totalCost) {
			NotificationChain msgs = null;
			if (totalCost != null)
				msgs = ((InternalEObject)totalCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, null, msgs);
			if (newTotalCost != null)
				msgs = ((InternalEObject)newTotalCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, null, msgs);
			msgs = basicSetTotalCost(newTotalCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, newTotalCost, newTotalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnallocDeductable(Money newUnallocDeductable, NotificationChain msgs) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, newUnallocDeductable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		if (newUnallocDeductable != unallocDeductable) {
			NotificationChain msgs = null;
			if (unallocDeductable != null)
				msgs = ((InternalEObject)unallocDeductable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, null, msgs);
			if (newUnallocDeductable != null)
				msgs = ((InternalEObject)newUnallocDeductable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, null, msgs);
			msgs = basicSetUnallocDeductable(newUnallocDeductable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, newUnallocDeductable, newUnallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalBenefit(Money newTotalBenefit, NotificationChain msgs) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, newTotalBenefit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		if (newTotalBenefit != totalBenefit) {
			NotificationChain msgs = null;
			if (totalBenefit != null)
				msgs = ((InternalEObject)totalBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, null, msgs);
			if (newTotalBenefit != null)
				msgs = ((InternalEObject)newTotalBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, null, msgs);
			msgs = basicSetTotalBenefit(newTotalBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, newTotalBenefit, newTotalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAdjustment() {
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAdjustment(Money newPaymentAdjustment, NotificationChain msgs) {
		Money oldPaymentAdjustment = paymentAdjustment;
		paymentAdjustment = newPaymentAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, newPaymentAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustment(Money newPaymentAdjustment) {
		if (newPaymentAdjustment != paymentAdjustment) {
			NotificationChain msgs = null;
			if (paymentAdjustment != null)
				msgs = ((InternalEObject)paymentAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, null, msgs);
			if (newPaymentAdjustment != null)
				msgs = ((InternalEObject)newPaymentAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, null, msgs);
			msgs = basicSetPaymentAdjustment(newPaymentAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, newPaymentAdjustment, newPaymentAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentAdjustmentReason() {
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAdjustmentReason(Coding newPaymentAdjustmentReason, NotificationChain msgs) {
		Coding oldPaymentAdjustmentReason = paymentAdjustmentReason;
		paymentAdjustmentReason = newPaymentAdjustmentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, newPaymentAdjustmentReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustmentReason(Coding newPaymentAdjustmentReason) {
		if (newPaymentAdjustmentReason != paymentAdjustmentReason) {
			NotificationChain msgs = null;
			if (paymentAdjustmentReason != null)
				msgs = ((InternalEObject)paymentAdjustmentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, null, msgs);
			if (newPaymentAdjustmentReason != null)
				msgs = ((InternalEObject)newPaymentAdjustmentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, null, msgs);
			msgs = basicSetPaymentAdjustmentReason(newPaymentAdjustmentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, newPaymentAdjustmentReason, newPaymentAdjustmentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDate(Date newPaymentDate, NotificationChain msgs) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, oldPaymentDate, newPaymentDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(Date newPaymentDate) {
		if (newPaymentDate != paymentDate) {
			NotificationChain msgs = null;
			if (paymentDate != null)
				msgs = ((InternalEObject)paymentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, null, msgs);
			if (newPaymentDate != null)
				msgs = ((InternalEObject)newPaymentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, null, msgs);
			msgs = basicSetPaymentDate(newPaymentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, newPaymentDate, newPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAmount(Money newPaymentAmount, NotificationChain msgs) {
		Money oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, oldPaymentAmount, newPaymentAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAmount(Money newPaymentAmount) {
		if (newPaymentAmount != paymentAmount) {
			NotificationChain msgs = null;
			if (paymentAmount != null)
				msgs = ((InternalEObject)paymentAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, null, msgs);
			if (newPaymentAmount != null)
				msgs = ((InternalEObject)newPaymentAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, null, msgs);
			msgs = basicSetPaymentAmount(newPaymentAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, newPaymentAmount, newPaymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPaymentRef() {
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentRef(Identifier newPaymentRef, NotificationChain msgs) {
		Identifier oldPaymentRef = paymentRef;
		paymentRef = newPaymentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, oldPaymentRef, newPaymentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRef(Identifier newPaymentRef) {
		if (newPaymentRef != paymentRef) {
			NotificationChain msgs = null;
			if (paymentRef != null)
				msgs = ((InternalEObject)paymentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, null, msgs);
			if (newPaymentRef != null)
				msgs = ((InternalEObject)newPaymentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, null, msgs);
			msgs = basicSetPaymentRef(newPaymentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, newPaymentRef, newPaymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserved(Coding newReserved, NotificationChain msgs) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED, oldReserved, newReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		if (newReserved != reserved) {
			NotificationChain msgs = null;
			if (reserved != null)
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED, newReserved, newReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Coding newForm, NotificationChain msgs) {
		Coding oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Coding newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitNote> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<ExplanationOfBenefitNote>(ExplanationOfBenefitNote.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitBenefitBalance> getBenefitBalance() {
		if (benefitBalance == null) {
			benefitBalance = new EObjectContainmentEList<ExplanationOfBenefitBenefitBalance>(ExplanationOfBenefitBenefitBalance.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE);
		}
		return benefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER:
				return basicSetClaimIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE:
				return basicSetClaimReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER:
				return basicSetClaimResponseIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE:
				return basicSetClaimResponseReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return basicSetBillablePeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER:
				return basicSetOrganizationIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE:
				return basicSetOrganizationReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER:
				return basicSetFacilityIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE:
				return basicSetFacilityReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER:
				return basicSetPrescriptionIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE:
				return basicSetPrescriptionReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return basicSetOriginalPrescriptionIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE:
				return basicSetOriginalPrescriptionReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER:
				return basicSetReferralIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE:
				return basicSetReferralReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE:
				return ((InternalEList<?>)getOccurrenceCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE:
				return ((InternalEList<?>)getOccurenceSpanCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE:
				return ((InternalEList<?>)getValueCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				return ((InternalEList<?>)getSpecialCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER:
				return basicSetPatientIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE:
				return basicSetPatientReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return basicSetPrecedence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				return basicSetAccidentDate(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				return basicSetAccidentType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS:
				return basicSetAccidentLocationAddress(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE:
				return basicSetAccidentLocationReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				return ((InternalEList<?>)getInterventionException()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ONSET:
				return ((InternalEList<?>)getOnset()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return basicSetEmploymentImpacted(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return ((InternalEList<?>)getMissingTeeth()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return basicSetTotalCost(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return basicSetUnallocDeductable(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return basicSetTotalBenefit(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				return basicSetPaymentAdjustment(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				return basicSetPaymentAdjustmentReason(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				return basicSetPaymentDate(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				return basicSetPaymentAmount(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				return basicSetPaymentRef(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED:
				return basicSetReserved(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER:
				return getClaimIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE:
				return getClaimReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER:
				return getClaimResponseIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE:
				return getClaimResponseReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return getSubType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RULESET:
				return getRuleset();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return getCreated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return getBillablePeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return getDisposition();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER:
				return getOrganizationIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE:
				return getOrganizationReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER:
				return getFacilityIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE:
				return getFacilityReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return getRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER:
				return getPrescriptionIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE:
				return getPrescriptionReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return getOriginalPrescriptionIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE:
				return getOriginalPrescriptionReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return getPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER:
				return getReferralIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE:
				return getReferralReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE:
				return getOccurrenceCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE:
				return getOccurenceSpanCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE:
				return getValueCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return getProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				return getSpecialCondition();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER:
				return getPatientIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE:
				return getPatientReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return getPrecedence();
			case FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return getCoverage();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				return getAccidentDate();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				return getAccidentType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS:
				return getAccidentLocationAddress();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE:
				return getAccidentLocationReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				return getInterventionException();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ONSET:
				return getOnset();
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return getEmploymentImpacted();
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return getHospitalization();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return getItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return getAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return getMissingTeeth();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return getTotalCost();
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return getUnallocDeductable();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return getTotalBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				return getPaymentAdjustment();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				return getPaymentAdjustmentReason();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				return getPaymentDate();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				return getPaymentAmount();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				return getPaymentRef();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED:
				return getReserved();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return getForm();
			case FhirPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return getNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return getBenefitBalance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER:
				setClaimIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE:
				setClaimReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER:
				setClaimResponseIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE:
				setClaimResponseReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE:
				setFacilityReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ExplanationOfBenefitRelated>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER:
				setPrescriptionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE:
				setPrescriptionReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				setOriginalPrescriptionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE:
				setOriginalPrescriptionReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER:
				setReferralIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE:
				setReferralReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE:
				getOccurrenceCode().clear();
				getOccurrenceCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE:
				getOccurenceSpanCode().clear();
				getOccurenceSpanCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE:
				getValueCode().clear();
				getValueCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ExplanationOfBenefitDiagnosis>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ExplanationOfBenefitProcedure>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				getSpecialCondition().clear();
				getSpecialCondition().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE:
				setPatientReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				setCoverage((ExplanationOfBenefitCoverage)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				setAccidentDate((Date)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				setAccidentType((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS:
				setAccidentLocationAddress((Address)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE:
				setAccidentLocationReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				getInterventionException().clear();
				getInterventionException().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ONSET:
				getOnset().clear();
				getOnset().addAll((Collection<? extends ExplanationOfBenefitOnset>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ExplanationOfBenefitItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ExplanationOfBenefitAddItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				getMissingTeeth().clear();
				getMissingTeeth().addAll((Collection<? extends ExplanationOfBenefitMissingTeeth>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				setPaymentAmount((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				setPaymentRef((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED:
				setReserved((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends ExplanationOfBenefitNote>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				getBenefitBalance().addAll((Collection<? extends ExplanationOfBenefitBenefitBalance>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER:
				setClaimIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE:
				setClaimReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER:
				setClaimResponseIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE:
				setClaimResponseReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER:
				setOrganizationIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE:
				setOrganizationReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER:
				setFacilityIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE:
				setFacilityReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER:
				setPrescriptionIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE:
				setPrescriptionReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				setOriginalPrescriptionIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE:
				setOriginalPrescriptionReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER:
				setReferralIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE:
				setReferralReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE:
				getOccurrenceCode().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE:
				getOccurenceSpanCode().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE:
				getValueCode().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				getSpecialCondition().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER:
				setPatientIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE:
				setPatientReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				setCoverage((ExplanationOfBenefitCoverage)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				setAccidentDate((Date)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				setAccidentType((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS:
				setAccidentLocationAddress((Address)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE:
				setAccidentLocationReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				getInterventionException().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ONSET:
				getOnset().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				getMissingTeeth().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				setPaymentDate((Date)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				setPaymentAmount((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				setPaymentRef((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED:
				setReserved((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_IDENTIFIER:
				return claimIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_REFERENCE:
				return claimReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_IDENTIFIER:
				return claimResponseIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE_REFERENCE:
				return claimResponseReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RULESET:
				return ruleset != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return created != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return disposition != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_IDENTIFIER:
				return organizationIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION_REFERENCE:
				return organizationReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_IDENTIFIER:
				return facilityIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY_REFERENCE:
				return facilityReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return related != null && !related.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_IDENTIFIER:
				return prescriptionIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION_REFERENCE:
				return prescriptionReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_IDENTIFIER:
				return originalPrescriptionIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION_REFERENCE:
				return originalPrescriptionReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return payee != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_IDENTIFIER:
				return referralIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL_REFERENCE:
				return referralReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURRENCE_CODE:
				return occurrenceCode != null && !occurrenceCode.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__OCCURENCE_SPAN_CODE:
				return occurenceSpanCode != null && !occurenceSpanCode.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__VALUE_CODE:
				return valueCode != null && !valueCode.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				return specialCondition != null && !specialCondition.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_IDENTIFIER:
				return patientIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT_REFERENCE:
				return patientReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return precedence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return coverage != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				return accidentDate != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				return accidentType != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_ADDRESS:
				return accidentLocationAddress != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATION_REFERENCE:
				return accidentLocationReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				return interventionException != null && !interventionException.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ONSET:
				return onset != null && !onset.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return hospitalization != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return missingTeeth != null && !missingTeeth.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return totalCost != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				return paymentAdjustment != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				return paymentAdjustmentReason != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				return paymentDate != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				return paymentAmount != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				return paymentRef != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RESERVED:
				return reserved != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return form != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return benefitBalance != null && !benefitBalance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitImpl
