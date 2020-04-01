/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Timing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getNutrients <em>Nutrient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getTextures <em>Texture</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getFluidConsistencyTypes <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder_OralDiet'"
 * @generated
 */
public interface NutritionOrderOralDiet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Timing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timing> getSchedules();

	/**
	 * Returns the value of the '<em><b>Nutrient</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietNutrient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nutrient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrient</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_Nutrient()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderOralDietNutrient> getNutrients();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDietTexture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_Texture()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderOralDietTexture> getTextures();

	/**
	 * Returns the value of the '<em><b>Fluid Consistency Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid Consistency Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid Consistency Type</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_FluidConsistencyType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getFluidConsistencyTypes();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getNutritionOrderOralDiet_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getInstruction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // NutritionOrderOralDiet
