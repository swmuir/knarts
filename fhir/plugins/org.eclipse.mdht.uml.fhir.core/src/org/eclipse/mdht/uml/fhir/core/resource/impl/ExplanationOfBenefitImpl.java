/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.resource.Claim;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefit;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitAddedItem;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitBenefitBalance;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitCoverage;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitDiagnosis;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitMissingTeeth;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitNotes;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitPayee;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrder;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getRelatedClaims <em>Related Claim</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getSpecialConditions <em>Special Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getExceptions <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getSchool <em>School</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getAccidentDate <em>Accident Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getAccidentLocationx <em>Accident Locationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getInterventionExceptions <em>Intervention Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getClaimTotal <em>Claim Total</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getMissingTeeths <em>Missing Teeth</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitImpl#getBenefitBalances <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitImpl extends DomainResourceImpl implements ExplanationOfBenefit {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String disposition;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Location facility;

	/**
	 * The cached value of the '{@link #getRelatedClaims() <em>Related Claim</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> relatedClaims;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Resource prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrder originalPrescription;

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
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected ReferralRequest referral;

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
	 * The cached value of the '{@link #getSpecialConditions() <em>Special Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> specialConditions;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' reference.
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
	 * The cached value of the '{@link #getExceptions() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> exceptions;

	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String school;

	/**
	 * The cached value of the '{@link #getAccidentDate() <em>Accident Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentDate()
	 * @generated
	 * @ordered
	 */
	protected Date accidentDate;

	/**
	 * The cached value of the '{@link #getAccidentType() <em>Accident Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentType()
	 * @generated
	 * @ordered
	 */
	protected Coding accidentType;

	/**
	 * The cached value of the '{@link #getAccidentLocationx() <em>Accident Locationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentLocationx()
	 * @generated
	 * @ordered
	 */
	protected Base accidentLocationx;

	/**
	 * The cached value of the '{@link #getInterventionExceptions() <em>Intervention Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> interventionExceptions;

	/**
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItems> items;

	/**
	 * The cached value of the '{@link #getAddItems() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddedItem> addItems;

	/**
	 * The cached value of the '{@link #getClaimTotal() <em>Claim Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimTotal()
	 * @generated
	 * @ordered
	 */
	protected Money claimTotal;

	/**
	 * The cached value of the '{@link #getMissingTeeths() <em>Missing Teeth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingTeeths()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitMissingTeeth> missingTeeths;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPaymentAdjustment() <em>Payment Adjustment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAdjustment;

	/**
	 * The cached value of the '{@link #getPaymentAdjustmentReason() <em>Payment Adjustment Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentAdjustmentReason;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAmount;

	/**
	 * The cached value of the '{@link #getPaymentRef() <em>Payment Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRef()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentRef;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Coding form;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitNotes> notes;

	/**
	 * The cached value of the '{@link #getBenefitBalances() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalances()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitBenefitBalance> benefitBalances;

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
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		if (claim != null && claim.eIsProxy()) {
			InternalEObject oldClaim = (InternalEObject)claim;
			claim = (Claim)eResolveProxy(oldClaim);
			if (claim != oldClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, claim));
			}
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, claim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		if (claimResponse != null && claimResponse.eIsProxy()) {
			InternalEObject oldClaimResponse = (InternalEObject)claimResponse;
			claimResponse = (ClaimResponse)eResolveProxy(oldClaimResponse);
			if (claimResponse != oldClaimResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
			}
		}
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse basicGetClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Coding)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		if (originalRuleset != null && originalRuleset.eIsProxy()) {
			InternalEObject oldOriginalRuleset = (InternalEObject)originalRuleset;
			originalRuleset = (Coding)eResolveProxy(oldOriginalRuleset);
			if (originalRuleset != oldOriginalRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
			}
		}
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		if (billablePeriod != null && billablePeriod.eIsProxy()) {
			InternalEObject oldBillablePeriod = (InternalEObject)billablePeriod;
			billablePeriod = (Period)eResolveProxy(oldBillablePeriod);
			if (billablePeriod != oldBillablePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
			}
		}
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Practitioner)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Practitioner newProvider) {
		Practitioner oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFacility() {
		if (facility != null && facility.eIsProxy()) {
			InternalEObject oldFacility = (InternalEObject)facility;
			facility = (Location)eResolveProxy(oldFacility);
			if (facility != oldFacility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, facility));
			}
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacility(Location newFacility) {
		Location oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, facility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getRelatedClaims() {
		if (relatedClaims == null) {
			relatedClaims = new EObjectResolvingEList<Claim>(Claim.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__RELATED_CLAIM);
		}
		return relatedClaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPrescription() {
		if (prescription != null && prescription.eIsProxy()) {
			InternalEObject oldPrescription = (InternalEObject)prescription;
			prescription = (Resource)eResolveProxy(oldPrescription);
			if (prescription != oldPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, prescription));
			}
		}
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Resource newPrescription) {
		Resource oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, prescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder getOriginalPrescription() {
		if (originalPrescription != null && originalPrescription.eIsProxy()) {
			InternalEObject oldOriginalPrescription = (InternalEObject)originalPrescription;
			originalPrescription = (MedicationOrder)eResolveProxy(oldOriginalPrescription);
			if (originalPrescription != oldOriginalPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
			}
		}
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder basicGetOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescription(MedicationOrder newOriginalPrescription) {
		MedicationOrder oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE, oldPayee, newPayee);
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
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest getReferral() {
		if (referral != null && referral.eIsProxy()) {
			InternalEObject oldReferral = (InternalEObject)referral;
			referral = (ReferralRequest)eResolveProxy(oldReferral);
			if (referral != oldReferral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, referral));
			}
		}
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest basicGetReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferral(ReferralRequest newReferral) {
		ReferralRequest oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, referral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ExplanationOfBenefitDiagnosis>(ExplanationOfBenefitDiagnosis.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSpecialConditions() {
		if (specialConditions == null) {
			specialConditions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION);
		}
		return specialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getPrecedence() {
		if (precedence != null && precedence.eIsProxy()) {
			InternalEObject oldPrecedence = (InternalEObject)precedence;
			precedence = (PositiveInt)eResolveProxy(oldPrecedence);
			if (precedence != oldPrecedence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, precedence));
			}
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(PositiveInt newPrecedence) {
		PositiveInt oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, precedence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE, oldCoverage, newCoverage);
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
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__EXCEPTION);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getSchool() {
		if (school != null && school.eIsProxy()) {
			InternalEObject oldSchool = (InternalEObject)school;
			school = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldSchool);
			if (school != oldSchool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL, oldSchool, school));
			}
		}
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(org.eclipse.mdht.uml.fhir.core.datatype.String newSchool) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldSchool = school;
		school = newSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL, oldSchool, school));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccidentDate() {
		if (accidentDate != null && accidentDate.eIsProxy()) {
			InternalEObject oldAccidentDate = (InternalEObject)accidentDate;
			accidentDate = (Date)eResolveProxy(oldAccidentDate);
			if (accidentDate != oldAccidentDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, oldAccidentDate, accidentDate));
			}
		}
		return accidentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetAccidentDate() {
		return accidentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentDate(Date newAccidentDate) {
		Date oldAccidentDate = accidentDate;
		accidentDate = newAccidentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE, oldAccidentDate, accidentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAccidentType() {
		if (accidentType != null && accidentType.eIsProxy()) {
			InternalEObject oldAccidentType = (InternalEObject)accidentType;
			accidentType = (Coding)eResolveProxy(oldAccidentType);
			if (accidentType != oldAccidentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, oldAccidentType, accidentType));
			}
		}
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetAccidentType() {
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentType(Coding newAccidentType) {
		Coding oldAccidentType = accidentType;
		accidentType = newAccidentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE, oldAccidentType, accidentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getAccidentLocationx() {
		if (accidentLocationx != null && accidentLocationx.eIsProxy()) {
			InternalEObject oldAccidentLocationx = (InternalEObject)accidentLocationx;
			accidentLocationx = (Base)eResolveProxy(oldAccidentLocationx);
			if (accidentLocationx != oldAccidentLocationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX, oldAccidentLocationx, accidentLocationx));
			}
		}
		return accidentLocationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetAccidentLocationx() {
		return accidentLocationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentLocationx(Base newAccidentLocationx) {
		Base oldAccidentLocationx = accidentLocationx;
		accidentLocationx = newAccidentLocationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX, oldAccidentLocationx, accidentLocationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getInterventionExceptions() {
		if (interventionExceptions == null) {
			interventionExceptions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION);
		}
		return interventionExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOnsetx() {
		if (onsetx != null && onsetx.eIsProxy()) {
			InternalEObject oldOnsetx = (InternalEObject)onsetx;
			onsetx = (DataType)eResolveProxy(oldOnsetx);
			if (onsetx != oldOnsetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX, oldOnsetx, onsetx));
			}
		}
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetx(DataType newOnsetx) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX, oldOnsetx, onsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		if (employmentImpacted != null && employmentImpacted.eIsProxy()) {
			InternalEObject oldEmploymentImpacted = (InternalEObject)employmentImpacted;
			employmentImpacted = (Period)eResolveProxy(oldEmploymentImpacted);
			if (employmentImpacted != oldEmploymentImpacted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
			}
		}
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		if (hospitalization != null && hospitalization.eIsProxy()) {
			InternalEObject oldHospitalization = (InternalEObject)hospitalization;
			hospitalization = (Period)eResolveProxy(oldHospitalization);
			if (hospitalization != oldHospitalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, hospitalization));
			}
		}
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, hospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItems> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ExplanationOfBenefitItems>(ExplanationOfBenefitItems.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAddedItem> getAddItems() {
		if (addItems == null) {
			addItems = new EObjectContainmentEList<ExplanationOfBenefitAddedItem>(ExplanationOfBenefitAddedItem.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM);
		}
		return addItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getClaimTotal() {
		if (claimTotal != null && claimTotal.eIsProxy()) {
			InternalEObject oldClaimTotal = (InternalEObject)claimTotal;
			claimTotal = (Money)eResolveProxy(oldClaimTotal);
			if (claimTotal != oldClaimTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL, oldClaimTotal, claimTotal));
			}
		}
		return claimTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetClaimTotal() {
		return claimTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimTotal(Money newClaimTotal) {
		Money oldClaimTotal = claimTotal;
		claimTotal = newClaimTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL, oldClaimTotal, claimTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitMissingTeeth> getMissingTeeths() {
		if (missingTeeths == null) {
			missingTeeths = new EObjectContainmentEList<ExplanationOfBenefitMissingTeeth>(ExplanationOfBenefitMissingTeeth.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH);
		}
		return missingTeeths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		if (unallocDeductable != null && unallocDeductable.eIsProxy()) {
			InternalEObject oldUnallocDeductable = (InternalEObject)unallocDeductable;
			unallocDeductable = (Money)eResolveProxy(oldUnallocDeductable);
			if (unallocDeductable != oldUnallocDeductable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
			}
		}
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		if (totalBenefit != null && totalBenefit.eIsProxy()) {
			InternalEObject oldTotalBenefit = (InternalEObject)totalBenefit;
			totalBenefit = (Money)eResolveProxy(oldTotalBenefit);
			if (totalBenefit != oldTotalBenefit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
			}
		}
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAdjustment() {
		if (paymentAdjustment != null && paymentAdjustment.eIsProxy()) {
			InternalEObject oldPaymentAdjustment = (InternalEObject)paymentAdjustment;
			paymentAdjustment = (Money)eResolveProxy(oldPaymentAdjustment);
			if (paymentAdjustment != oldPaymentAdjustment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, paymentAdjustment));
			}
		}
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetPaymentAdjustment() {
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustment(Money newPaymentAdjustment) {
		Money oldPaymentAdjustment = paymentAdjustment;
		paymentAdjustment = newPaymentAdjustment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, paymentAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentAdjustmentReason() {
		if (paymentAdjustmentReason != null && paymentAdjustmentReason.eIsProxy()) {
			InternalEObject oldPaymentAdjustmentReason = (InternalEObject)paymentAdjustmentReason;
			paymentAdjustmentReason = (Coding)eResolveProxy(oldPaymentAdjustmentReason);
			if (paymentAdjustmentReason != oldPaymentAdjustmentReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, paymentAdjustmentReason));
			}
		}
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPaymentAdjustmentReason() {
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustmentReason(Coding newPaymentAdjustmentReason) {
		Coding oldPaymentAdjustmentReason = paymentAdjustmentReason;
		paymentAdjustmentReason = newPaymentAdjustmentReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, paymentAdjustmentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaymentDate() {
		if (paymentDate != null && paymentDate.eIsProxy()) {
			InternalEObject oldPaymentDate = (InternalEObject)paymentDate;
			paymentDate = (Date)eResolveProxy(oldPaymentDate);
			if (paymentDate != oldPaymentDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, oldPaymentDate, paymentDate));
			}
		}
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(Date newPaymentDate) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE, oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAmount() {
		if (paymentAmount != null && paymentAmount.eIsProxy()) {
			InternalEObject oldPaymentAmount = (InternalEObject)paymentAmount;
			paymentAmount = (Money)eResolveProxy(oldPaymentAmount);
			if (paymentAmount != oldPaymentAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, oldPaymentAmount, paymentAmount));
			}
		}
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAmount(Money newPaymentAmount) {
		Money oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT, oldPaymentAmount, paymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPaymentRef() {
		if (paymentRef != null && paymentRef.eIsProxy()) {
			InternalEObject oldPaymentRef = (InternalEObject)paymentRef;
			paymentRef = (Identifier)eResolveProxy(oldPaymentRef);
			if (paymentRef != oldPaymentRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, oldPaymentRef, paymentRef));
			}
		}
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetPaymentRef() {
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRef(Identifier newPaymentRef) {
		Identifier oldPaymentRef = paymentRef;
		paymentRef = newPaymentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF, oldPaymentRef, paymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		if (reserved != null && reserved.eIsProxy()) {
			InternalEObject oldReserved = (InternalEObject)reserved;
			reserved = (Coding)eResolveProxy(oldReserved);
			if (reserved != oldReserved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED, oldReserved, reserved));
			}
		}
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (Coding)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Coding newForm) {
		Coding oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitNotes> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<ExplanationOfBenefitNotes>(ExplanationOfBenefitNotes.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitBenefitBalance> getBenefitBalances() {
		if (benefitBalances == null) {
			benefitBalances = new EObjectContainmentEList<ExplanationOfBenefitBenefitBalance>(ExplanationOfBenefitBenefitBalance.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE);
		}
		return benefitBalances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return ((InternalEList<?>)getAddItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return ((InternalEList<?>)getMissingTeeths()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalances()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM:
				if (resolve) return getClaim();
				return basicGetClaim();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				if (resolve) return getClaimResponse();
				return basicGetClaimResponse();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				if (resolve) return getBillablePeriod();
				return basicGetBillablePeriod();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY:
				if (resolve) return getFacility();
				return basicGetFacility();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RELATED_CLAIM:
				return getRelatedClaims();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				if (resolve) return getPrescription();
				return basicGetPrescription();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				if (resolve) return getOriginalPrescription();
				return basicGetOriginalPrescription();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return getPayee();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				if (resolve) return getReferral();
				return basicGetReferral();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return getDiagnosis();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				return getSpecialConditions();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				if (resolve) return getPrecedence();
				return basicGetPrecedence();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return getCoverage();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EXCEPTION:
				return getExceptions();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL:
				if (resolve) return getSchool();
				return basicGetSchool();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				if (resolve) return getAccidentDate();
				return basicGetAccidentDate();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				if (resolve) return getAccidentType();
				return basicGetAccidentType();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX:
				if (resolve) return getAccidentLocationx();
				return basicGetAccidentLocationx();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				return getInterventionExceptions();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX:
				if (resolve) return getOnsetx();
				return basicGetOnsetx();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				if (resolve) return getEmploymentImpacted();
				return basicGetEmploymentImpacted();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				if (resolve) return getHospitalization();
				return basicGetHospitalization();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM:
				return getItems();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return getAddItems();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL:
				if (resolve) return getClaimTotal();
				return basicGetClaimTotal();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return getMissingTeeths();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				if (resolve) return getUnallocDeductable();
				return basicGetUnallocDeductable();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				if (resolve) return getTotalBenefit();
				return basicGetTotalBenefit();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				if (resolve) return getPaymentAdjustment();
				return basicGetPaymentAdjustment();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				if (resolve) return getPaymentAdjustmentReason();
				return basicGetPaymentAdjustmentReason();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				if (resolve) return getPaymentDate();
				return basicGetPaymentDate();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				if (resolve) return getPaymentAmount();
				return basicGetPaymentAmount();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				if (resolve) return getPaymentRef();
				return basicGetPaymentRef();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED:
				if (resolve) return getReserved();
				return basicGetReserved();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE:
				return getNotes();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return getBenefitBalances();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Claim)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Location)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RELATED_CLAIM:
				getRelatedClaims().clear();
				getRelatedClaims().addAll((Collection<? extends Claim>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Resource)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationOrder)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((ReferralRequest)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ExplanationOfBenefitDiagnosis>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				getSpecialConditions().clear();
				getSpecialConditions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				setCoverage((ExplanationOfBenefitCoverage)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EXCEPTION:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL:
				setSchool((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				setAccidentDate((Date)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				setAccidentType((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX:
				setAccidentLocationx((Base)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				getInterventionExceptions().clear();
				getInterventionExceptions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ExplanationOfBenefitItems>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItems().clear();
				getAddItems().addAll((Collection<? extends ExplanationOfBenefitAddedItem>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL:
				setClaimTotal((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				getMissingTeeths().clear();
				getMissingTeeths().addAll((Collection<? extends ExplanationOfBenefitMissingTeeth>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				setPaymentAmount((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				setPaymentRef((Identifier)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED:
				setReserved((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends ExplanationOfBenefitNotes>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalances().clear();
				getBenefitBalances().addAll((Collection<? extends ExplanationOfBenefitBenefitBalance>)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Claim)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Location)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RELATED_CLAIM:
				getRelatedClaims().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Resource)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationOrder)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((ReferralRequest)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				getSpecialConditions().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				setCoverage((ExplanationOfBenefitCoverage)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EXCEPTION:
				getExceptions().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL:
				setSchool((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				setAccidentDate((Date)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				setAccidentType((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX:
				setAccidentLocationx((Base)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				getInterventionExceptions().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX:
				setOnsetx((DataType)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItems().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItems().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL:
				setClaimTotal((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				getMissingTeeths().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				setPaymentDate((Date)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				setPaymentAmount((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				setPaymentRef((Identifier)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED:
				setReserved((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNotes().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalances().clear();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return claim != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RULESET:
				return ruleset != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CREATED:
				return created != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return disposition != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return provider != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return facility != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RELATED_CLAIM:
				return relatedClaims != null && !relatedClaims.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return prescription != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return payee != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return referral != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SPECIAL_CONDITION:
				return specialConditions != null && !specialConditions.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return patient != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return precedence != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__COVERAGE:
				return coverage != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EXCEPTION:
				return exceptions != null && !exceptions.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__SCHOOL:
				return school != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_DATE:
				return accidentDate != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_TYPE:
				return accidentType != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ACCIDENT_LOCATIONX:
				return accidentLocationx != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__INTERVENTION_EXCEPTION:
				return interventionExceptions != null && !interventionExceptions.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ONSETX:
				return onsetx != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return hospitalization != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ITEM:
				return items != null && !items.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return addItems != null && !addItems.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__CLAIM_TOTAL:
				return claimTotal != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__MISSING_TEETH:
				return missingTeeths != null && !missingTeeths.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT:
				return paymentAdjustment != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_ADJUSTMENT_REASON:
				return paymentAdjustmentReason != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_DATE:
				return paymentDate != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_AMOUNT:
				return paymentAmount != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__PAYMENT_REF:
				return paymentRef != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__RESERVED:
				return reserved != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__FORM:
				return form != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__NOTE:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return benefitBalances != null && !benefitBalances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitImpl
