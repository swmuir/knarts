/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Reconciliation</b></em>'.
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
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getDetails <em>Detail</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getFormCode <em>Form Code</em>}</li>
 *   <li>{@link fhiRCore.resources.PaymentReconciliation#getProcessNotes <em>Process Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation()
 * @model
 * @generated
 */
public interface PaymentReconciliation extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Created()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Payment Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Issuer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #setPaymentIssuer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_PaymentIssuer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPaymentIssuer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getPaymentIssuer <em>Payment Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Issuer</em>' containment reference.
	 * @see #getPaymentIssuer()
	 * @generated
	 */
	void setPaymentIssuer(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Request()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requestor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Requestor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequestor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getOutcome <em>Outcome</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Disposition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisposition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_PaymentDate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Amount</em>' containment reference.
	 * @see #setPaymentAmount(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_PaymentAmount()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Money getPaymentAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getPaymentAmount <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' containment reference.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #setPaymentIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_PaymentIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPaymentIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getPaymentIdentifier <em>Payment Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Identifier</em>' containment reference.
	 * @see #getPaymentIdentifier()
	 * @generated
	 */
	void setPaymentIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PaymentReconciliationDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaymentReconciliationDetails> getDetails();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_FormCode()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFormCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PaymentReconciliation#getFormCode <em>Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Code</em>' containment reference.
	 * @see #getFormCode()
	 * @generated
	 */
	void setFormCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PaymentReconciliationNotes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPaymentReconciliation_ProcessNote()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaymentReconciliationNotes> getProcessNotes();

} // PaymentReconciliation
