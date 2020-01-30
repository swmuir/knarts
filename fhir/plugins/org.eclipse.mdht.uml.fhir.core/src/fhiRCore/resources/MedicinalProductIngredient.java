/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getAllergenicIndicator <em>Allergenic Indicator</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getManufacturers <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getSpecifiedSubstances <em>Specified Substance</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredient#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient()
 * @model
 * @generated
 */
public interface MedicinalProductIngredient extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredient#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredient#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allergenic Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergenic Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #setAllergenicIndicator(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_AllergenicIndicator()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAllergenicIndicator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredient#getAllergenicIndicator <em>Allergenic Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergenic Indicator</em>' containment reference.
	 * @see #getAllergenicIndicator()
	 * @generated
	 */
	void setAllergenicIndicator(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturers();

	/**
	 * Returns the value of the '<em><b>Specified Substance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Substance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Substance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_SpecifiedSubstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductIngredientSpecifiedSubstance> getSpecifiedSubstances();

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(MedicinalProductIngredientSubstance)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredient_Substance()
	 * @model containment="true"
	 * @generated
	 */
	MedicinalProductIngredientSubstance getSubstance();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredient#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(MedicinalProductIngredientSubstance value);

} // MedicinalProductIngredient
