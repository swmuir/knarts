/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Delivery Supplied Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SupplyDeliverySuppliedItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDeliverySuppliedItem#getItemx <em>Itemx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSupplyDeliverySuppliedItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SupplyDelivery_SuppliedItem'"
 * @generated
 */
public interface SupplyDeliverySuppliedItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDeliverySuppliedItem_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDeliverySuppliedItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Itemx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemx</em>' containment reference.
	 * @see #setItemx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDeliverySuppliedItem_Itemx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='item[x]'"
	 * @generated
	 */
	DataType getItemx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDeliverySuppliedItem#getItemx <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' containment reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(DataType value);

} // SupplyDeliverySuppliedItem
