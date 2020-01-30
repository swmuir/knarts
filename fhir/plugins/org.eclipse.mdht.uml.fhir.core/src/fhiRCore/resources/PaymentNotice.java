/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Notice</b></em>'.
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
 *   <li>{@link fhiRCore.resources.PaymentNotice#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getPayment <em>Payment</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getPayee <em>Payee</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentNotice#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice()
 * @model
 * @generated
 */
public interface PaymentNotice extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Request()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Response()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Provider()
	 * @model containment="true"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Payment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPayment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Reference value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' containment reference.
	 * @see #setPaymentDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_PaymentDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Payee()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPayee();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference.
	 * @see #setRecipient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Recipient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getRecipient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_Amount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Money getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' containment reference.
	 * @see #setPaymentStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentNotice_PaymentStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPaymentStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentNotice#getPaymentStatus <em>Payment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' containment reference.
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(CodeableConcept value);

} // PaymentNotice
