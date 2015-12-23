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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getResponce <em>Responce</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PaymentReconciliation_Details'"
 * @generated
 */
public interface PaymentReconciliationDetails extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Type()
	 * @model required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Request()
	 * @model
	 * @generated
	 */
	Resource getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Resource value);

	/**
	 * Returns the value of the '<em><b>Responce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responce</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responce</em>' reference.
	 * @see #setResponce(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Responce()
	 * @model
	 * @generated
	 */
	Resource getResponce();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getResponce <em>Responce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responce</em>' reference.
	 * @see #getResponce()
	 * @generated
	 */
	void setResponce(Resource value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter</em>' reference.
	 * @see #setSubmitter(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Submitter()
	 * @model
	 * @generated
	 */
	Organization getSubmitter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getSubmitter <em>Submitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' reference.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(Organization value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee</em>' reference.
	 * @see #setPayee(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Payee()
	 * @model
	 * @generated
	 */
	Organization getPayee();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getPayee <em>Payee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Organization value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(Date)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference.
	 * @see #setAmount(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPaymentReconciliationDetails_Amount()
	 * @model
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PaymentReconciliationDetails#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetails
