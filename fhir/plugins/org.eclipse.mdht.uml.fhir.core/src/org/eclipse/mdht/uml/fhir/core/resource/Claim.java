/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getCoverages <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getExceptions <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getSchool <em>School</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getInterventionExceptions <em>Intervention Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getAdditionalMaterials <em>Additional Materials</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getMissingTeeths <em>Missing Teeth</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' reference.
	 * @see #setRuleset(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Ruleset()
	 * @model
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getRuleset <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_OriginalRuleset()
	 * @model
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOriginalRuleset <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' reference.
	 * @see #setCreated(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Created()
	 * @model
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getCreated <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Target()
	 * @model
	 * @generated
	 */
	Organization getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Organization value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Provider()
	 * @model
	 * @generated
	 */
	Practitioner getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Use()
	 * @model
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Priority()
	 * @model
	 * @generated
	 */
	Coding getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Coding value);

	/**
	 * Returns the value of the '<em><b>Funds Reserve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funds Reserve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funds Reserve</em>' reference.
	 * @see #setFundsReserve(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_FundsReserve()
	 * @model
	 * @generated
	 */
	Coding getFundsReserve();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getFundsReserve <em>Funds Reserve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funds Reserve</em>' reference.
	 * @see #getFundsReserve()
	 * @generated
	 */
	void setFundsReserve(Coding value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterer</em>' reference.
	 * @see #setEnterer(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Enterer()
	 * @model
	 * @generated
	 */
	Practitioner getEnterer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getEnterer <em>Enterer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Facility()
	 * @model
	 * @generated
	 */
	Location getFacility();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Location value);

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' reference.
	 * @see #setPrescription(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Prescription()
	 * @model
	 * @generated
	 */
	Resource getPrescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPrescription <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Resource value);

	/**
	 * Returns the value of the '<em><b>Original Prescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Prescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Prescription</em>' reference.
	 * @see #setOriginalPrescription(MedicationOrder)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_OriginalPrescription()
	 * @model
	 * @generated
	 */
	MedicationOrder getOriginalPrescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getOriginalPrescription <em>Original Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription</em>' reference.
	 * @see #getOriginalPrescription()
	 * @generated
	 */
	void setOriginalPrescription(MedicationOrder value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Payee()
	 * @model containment="true"
	 * @generated
	 */
	ClaimPayee getPayee();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ClaimPayee value);

	/**
	 * Returns the value of the '<em><b>Referral</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referral</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral</em>' reference.
	 * @see #setReferral(ReferralRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Referral()
	 * @model
	 * @generated
	 */
	ReferralRequest getReferral();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getReferral <em>Referral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' reference.
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(ReferralRequest value);

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Diagnosis()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Condition()
	 * @model
	 * @generated
	 */
	EList<Coding> getConditions();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimCoverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimCoverage> getCoverages();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Exception()
	 * @model
	 * @generated
	 */
	EList<Coding> getExceptions();

	/**
	 * Returns the value of the '<em><b>School</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' reference.
	 * @see #setSchool(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_School()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getSchool();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getSchool <em>School</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident</em>' reference.
	 * @see #setAccident(Date)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Accident()
	 * @model
	 * @generated
	 */
	Date getAccident();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getAccident <em>Accident</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(Date value);

	/**
	 * Returns the value of the '<em><b>Accident Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Type</em>' reference.
	 * @see #setAccidentType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_AccidentType()
	 * @model
	 * @generated
	 */
	Coding getAccidentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Claim#getAccidentType <em>Accident Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident Type</em>' reference.
	 * @see #getAccidentType()
	 * @generated
	 */
	void setAccidentType(Coding value);

	/**
	 * Returns the value of the '<em><b>Intervention Exception</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervention Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervention Exception</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_InterventionException()
	 * @model
	 * @generated
	 */
	EList<Coding> getInterventionExceptions();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimItems> getItems();

	/**
	 * Returns the value of the '<em><b>Additional Materials</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Materials</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Materials</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_AdditionalMaterials()
	 * @model
	 * @generated
	 */
	EList<Coding> getAdditionalMaterials();

	/**
	 * Returns the value of the '<em><b>Missing Teeth</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimMissingTeeth}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Teeth</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Teeth</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaim_MissingTeeth()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimMissingTeeth> getMissingTeeths();

} // Claim
