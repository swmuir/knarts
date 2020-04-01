/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietTexture#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietTexture#getFoodType <em>Food Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDietTexture()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OralDiet_Texture'"
 * @generated
 */
public interface NutritionOrderOralDietTexture extends BackboneElement {
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDietTexture_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietTexture#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Food Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Type</em>' containment reference.
	 * @see #setFoodType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDietTexture_FoodType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFoodType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietTexture#getFoodType <em>Food Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Type</em>' containment reference.
	 * @see #getFoodType()
	 * @generated
	 */
	void setFoodType(CodeableConcept value);

} // NutritionOrderOralDietTexture
