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
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides payment details and claim references supporting a bulk payment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestIdentifier <em>Request Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestReference <em>Request Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponceIdentifier <em>Responce Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getResponceReference <em>Responce Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterIdentifier <em>Submitter Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterReference <em>Submitter Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeIdentifier <em>Payee Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeReference <em>Payee Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail()
 * @model extendedMetaData="name='PaymentReconciliation.Detail' kind='elementOnly'"
 * @generated
 */
public interface PaymentReconciliationDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code to indicate the nature of the payment, adjustment, funds advance, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Identifier</em>' containment reference.
	 * @see #setRequestIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_RequestIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getRequestIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestIdentifier <em>Request Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Identifier</em>' containment reference.
	 * @see #getRequestIdentifier()
	 * @generated
	 */
	void setRequestIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Request Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Reference</em>' containment reference.
	 * @see #setRequestReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_RequestReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getRequestReference <em>Request Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Reference</em>' containment reference.
	 * @see #getRequestReference()
	 * @generated
	 */
	void setRequestReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Responce Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responce Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responce Identifier</em>' containment reference.
	 * @see #setResponceIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_ResponceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getResponceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponceIdentifier <em>Responce Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responce Identifier</em>' containment reference.
	 * @see #getResponceIdentifier()
	 * @generated
	 */
	void setResponceIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Responce Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responce Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responce Reference</em>' containment reference.
	 * @see #setResponceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_ResponceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getResponceReference <em>Responce Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responce Reference</em>' containment reference.
	 * @see #getResponceReference()
	 * @generated
	 */
	void setResponceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Submitter Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitter Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter Identifier</em>' containment reference.
	 * @see #setSubmitterIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_SubmitterIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitterIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSubmitterIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterIdentifier <em>Submitter Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Identifier</em>' containment reference.
	 * @see #getSubmitterIdentifier()
	 * @generated
	 */
	void setSubmitterIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Submitter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitter Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter Reference</em>' containment reference.
	 * @see #setSubmitterReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_SubmitterReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submitterReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubmitterReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getSubmitterReference <em>Submitter Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter Reference</em>' containment reference.
	 * @see #getSubmitterReference()
	 * @generated
	 */
	void setSubmitterReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee Identifier</em>' containment reference.
	 * @see #setPayeeIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_PayeeIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPayeeIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeIdentifier <em>Payee Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Identifier</em>' containment reference.
	 * @see #getPayeeIdentifier()
	 * @generated
	 */
	void setPayeeIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Payee Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee Reference</em>' containment reference.
	 * @see #setPayeeReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_PayeeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payeeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPayeeReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getPayeeReference <em>Payee Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee Reference</em>' containment reference.
	 * @see #getPayeeReference()
	 * @generated
	 */
	void setPayeeReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the invoice or financial resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount paid for this detail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see org.hl7.fhir.FhirPackage#getPaymentReconciliationDetail_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PaymentReconciliationDetail#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetail
