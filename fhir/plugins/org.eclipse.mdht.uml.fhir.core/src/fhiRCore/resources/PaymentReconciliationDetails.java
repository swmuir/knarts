/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getSubmitter <em>Submitter</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getPayee <em>Payee</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliationDetails#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PaymentReconciliation_Details'"
 * @generated
 */
public interface PaymentReconciliationDetails extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' containment reference.
	 * @see #setPredecessor(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Predecessor()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPredecessor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getPredecessor <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' containment reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Identifier value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Request()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Submitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitter</em>' containment reference.
	 * @see #setSubmitter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Submitter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubmitter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getSubmitter <em>Submitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitter</em>' containment reference.
	 * @see #getSubmitter()
	 * @generated
	 */
	void setSubmitter(Reference value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Response()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Responsible()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Payee()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPayee();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Reference value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliationDetails_Amount()
	 * @model containment="true"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliationDetails#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

} // PaymentReconciliationDetails
