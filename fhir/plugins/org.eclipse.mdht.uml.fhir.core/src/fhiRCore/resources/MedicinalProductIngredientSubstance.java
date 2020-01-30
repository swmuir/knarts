/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Substance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSubstance#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSubstance#getStrengths <em>Strength</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSubstance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductIngredient_Substance'"
 * @generated
 */
public interface MedicinalProductIngredientSubstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSubstance_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSubstance#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSubstance_Strength()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductIngredientSpecifiedSubstanceStrength> getStrengths();

} // MedicinalProductIngredientSubstance
