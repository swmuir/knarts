/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.PositiveInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InvoiceLineItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.InvoiceLineItem#getChargeItemx <em>Charge Itemx</em>}</li>
 *   <li>{@link fhiRCore.resources.InvoiceLineItem#getPriceComponents <em>Price Component</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInvoiceLineItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Invoice_LineItem'"
 * @generated
 */
public interface InvoiceLineItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoiceLineItem_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InvoiceLineItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Charge Itemx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Itemx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Itemx</em>' containment reference.
	 * @see #setChargeItemx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getInvoiceLineItem_ChargeItemx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='chargeItem[x]'"
	 * @generated
	 */
	DataType getChargeItemx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InvoiceLineItem#getChargeItemx <em>Charge Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Itemx</em>' containment reference.
	 * @see #getChargeItemx()
	 * @generated
	 */
	void setChargeItemx(DataType value);

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InvoiceLineItemPriceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInvoiceLineItem_PriceComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvoiceLineItemPriceComponent> getPriceComponents();

} // InvoiceLineItem
