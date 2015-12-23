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
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getErrors <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getCoverages <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse()
 * @model
 * @generated
 */
public interface ClaimResponse extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Claim)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Request()
	 * @model
	 * @generated
	 */
	Claim getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Claim value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Ruleset()
	 * @model
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRuleset <em>Ruleset</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_OriginalRuleset()
	 * @model
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOriginalRuleset <em>Original Ruleset</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Created()
	 * @model
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getCreated <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Request Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Provider</em>' reference.
	 * @see #setRequestProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_RequestProvider()
	 * @model
	 * @generated
	 */
	Practitioner getRequestProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequestProvider <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider</em>' reference.
	 * @see #getRequestProvider()
	 * @generated
	 */
	void setRequestProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Request Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Organization</em>' reference.
	 * @see #setRequestOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_RequestOrganization()
	 * @model
	 * @generated
	 */
	Organization getRequestOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getRequestOrganization <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization</em>' reference.
	 * @see #getRequestOrganization()
	 * @generated
	 */
	void setRequestOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' reference.
	 * @see #setOutcome(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Outcome()
	 * @model
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getOutcome <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' reference.
	 * @see #setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Disposition()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getDisposition <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Payee Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee Type</em>' reference.
	 * @see #setPayeeType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PayeeType()
	 * @model
	 * @generated
	 */
	Coding getPayeeType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPayeeType <em>Payee Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Type</em>' reference.
	 * @see #getPayeeType()
	 * @generated
	 */
	void setPayeeType(Coding value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItems> getItems();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseAddedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_AddItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseAddedItem> getAddItems();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseErrors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Error()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseErrors> getErrors();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' reference.
	 * @see #setTotalCost(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_TotalCost()
	 * @model
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getTotalCost <em>Total Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unalloc Deductable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_UnallocDeductable()
	 * @model
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getUnallocDeductable <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Benefit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Benefit</em>' reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_TotalBenefit()
	 * @model
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getTotalBenefit <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Adjustment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Adjustment</em>' reference.
	 * @see #setPaymentAdjustment(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PaymentAdjustment()
	 * @model
	 * @generated
	 */
	Money getPaymentAdjustment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAdjustment <em>Payment Adjustment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment</em>' reference.
	 * @see #getPaymentAdjustment()
	 * @generated
	 */
	void setPaymentAdjustment(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Adjustment Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Adjustment Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Adjustment Reason</em>' reference.
	 * @see #setPaymentAdjustmentReason(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PaymentAdjustmentReason()
	 * @model
	 * @generated
	 */
	Coding getPaymentAdjustmentReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Adjustment Reason</em>' reference.
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 */
	void setPaymentAdjustmentReason(Coding value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' reference.
	 * @see #setPaymentDate(Date)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PaymentDate()
	 * @model
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentDate <em>Payment Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Amount</em>' reference.
	 * @see #setPaymentAmount(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PaymentAmount()
	 * @model
	 * @generated
	 */
	Money getPaymentAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentAmount <em>Payment Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' reference.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Ref</em>' reference.
	 * @see #setPaymentRef(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_PaymentRef()
	 * @model
	 * @generated
	 */
	Identifier getPaymentRef();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getPaymentRef <em>Payment Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref</em>' reference.
	 * @see #getPaymentRef()
	 * @generated
	 */
	void setPaymentRef(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' reference.
	 * @see #setReserved(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Reserved()
	 * @model
	 * @generated
	 */
	Coding getReserved();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getReserved <em>Reserved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' reference.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Coding value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' reference.
	 * @see #setForm(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Form()
	 * @model
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseNotes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseNotes> getNotes();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponse_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseCoverage> getCoverages();

} // ClaimResponse
