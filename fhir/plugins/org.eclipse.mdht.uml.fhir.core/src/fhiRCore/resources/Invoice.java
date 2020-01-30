/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Invoice#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getCancelledReason <em>Cancelled Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getParticipants <em>Participant</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getAccount <em>Account</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getLineItems <em>Line Item</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getTotalPriceComponents <em>Total Price Component</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getTotalNet <em>Total Net</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getTotalGross <em>Total Gross</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getPaymentTerms <em>Payment Terms</em>}</li>
 *   <li>{@link fhiRCore.resources.Invoice#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Cancelled Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelled Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelled Reason</em>' containment reference.
	 * @see #setCancelledReason(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_CancelledReason()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCancelledReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getCancelledReason <em>Cancelled Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelled Reason</em>' containment reference.
	 * @see #getCancelledReason()
	 * @generated
	 */
	void setCancelledReason(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Recipient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRecipient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InvoiceParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvoiceParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Issuer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getIssuer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Reference value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference.
	 * @see #setAccount(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Account()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAccount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getAccount <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' containment reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Reference value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InvoiceLineItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_LineItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvoiceLineItem> getLineItems();

	/**
	 * Returns the value of the '<em><b>Total Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InvoiceLineItemPriceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Price Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price Component</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_TotalPriceComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvoiceLineItemPriceComponent> getTotalPriceComponents();

	/**
	 * Returns the value of the '<em><b>Total Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Net</em>' containment reference.
	 * @see #setTotalNet(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_TotalNet()
	 * @model containment="true"
	 * @generated
	 */
	Money getTotalNet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getTotalNet <em>Total Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Net</em>' containment reference.
	 * @see #getTotalNet()
	 * @generated
	 */
	void setTotalNet(Money value);

	/**
	 * Returns the value of the '<em><b>Total Gross</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Gross</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Gross</em>' containment reference.
	 * @see #setTotalGross(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_TotalGross()
	 * @model containment="true"
	 * @generated
	 */
	Money getTotalGross();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getTotalGross <em>Total Gross</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Gross</em>' containment reference.
	 * @see #getTotalGross()
	 * @generated
	 */
	void setTotalGross(Money value);

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Terms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Terms</em>' containment reference.
	 * @see #setPaymentTerms(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_PaymentTerms()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPaymentTerms();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Invoice#getPaymentTerms <em>Payment Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Terms</em>' containment reference.
	 * @see #getPaymentTerms()
	 * @generated
	 */
	void setPaymentTerms(Markdown value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInvoice_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // Invoice
