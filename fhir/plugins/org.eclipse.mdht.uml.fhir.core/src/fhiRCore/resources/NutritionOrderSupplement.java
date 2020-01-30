/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Timing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrderSupplement#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderSupplement#getProductName <em>Product Name</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderSupplement#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderSupplement#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderSupplement#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder_Supplement'"
 * @generated
 */
public interface NutritionOrderSupplement extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderSupplement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement_ProductName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getProductName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderSupplement#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Timing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timing> getSchedules();

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
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderSupplement#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderSupplement_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderSupplement#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(fhiRCore.dataTypes.String value);

} // NutritionOrderSupplement
