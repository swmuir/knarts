/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getChargeItem <em>Charge Item</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem()
 * @model extendedMetaData="name='Invoice.LineItem' kind='elementOnly'"
 * @generated
 */
public interface InvoiceLineItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence in which the items appear on the invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Charge Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ChargeItem contains information such as the billing code, date, amount etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charge Item</em>' containment reference.
	 * @see #setChargeItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_ChargeItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='chargeItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getChargeItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getChargeItem <em>Charge Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item</em>' containment reference.
	 * @see #getChargeItem()
	 * @generated
	 */
	void setChargeItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InvoicePriceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under developement. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the prices have been calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getInvoiceLineItem_PriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoicePriceComponent> getPriceComponent();

} // InvoiceLineItem
