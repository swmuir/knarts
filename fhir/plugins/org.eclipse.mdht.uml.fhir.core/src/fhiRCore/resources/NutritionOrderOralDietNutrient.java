/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet Nutrient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDietNutrient#getModifier <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDietNutrient#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDietNutrient()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OralDiet_Nutrient'"
 * @generated
 */
public interface NutritionOrderOralDietNutrient extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDietNutrient_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getModifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderOralDietNutrient#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDietNutrient_Amount()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderOralDietNutrient#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

} // NutritionOrderOralDietNutrient
