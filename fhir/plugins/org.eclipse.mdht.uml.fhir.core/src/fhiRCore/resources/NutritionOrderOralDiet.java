/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Timing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getNutrients <em>Nutrient</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getTextures <em>Texture</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getFluidConsistencyTypes <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link fhiRCore.resources.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder_OralDiet'"
 * @generated
 */
public interface NutritionOrderOralDiet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

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
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timing> getSchedules();

	/**
	 * Returns the value of the '<em><b>Nutrient</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.NutritionOrderOralDietNutrient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nutrient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutrient</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_Nutrient()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderOralDietNutrient> getNutrients();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.NutritionOrderOralDietTexture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_Texture()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderOralDietTexture> getTextures();

	/**
	 * Returns the value of the '<em><b>Fluid Consistency Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid Consistency Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid Consistency Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_FluidConsistencyType()
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
	 * @see #setInstruction(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getNutritionOrderOralDiet_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.NutritionOrderOralDiet#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(fhiRCore.dataTypes.String value);

} // NutritionOrderOralDiet
