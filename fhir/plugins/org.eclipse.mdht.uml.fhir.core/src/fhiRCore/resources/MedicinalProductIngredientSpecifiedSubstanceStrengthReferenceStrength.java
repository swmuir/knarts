/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Ratio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Specified Substance Strength Reference Strength</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getSubstance <em>Substance</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getStrength <em>Strength</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getStrengthLowLimit <em>Strength Low Limit</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getCountries <em>Country</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Strength_ReferenceStrength'"
 * @generated
 */
public interface MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength_Substance()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength_Strength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ratio getStrength();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Ratio value);

	/**
	 * Returns the value of the '<em><b>Strength Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength Low Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength Low Limit</em>' containment reference.
	 * @see #setStrengthLowLimit(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength_StrengthLowLimit()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getStrengthLowLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getStrengthLowLimit <em>Strength Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Low Limit</em>' containment reference.
	 * @see #getStrengthLowLimit()
	 * @generated
	 */
	void setStrengthLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Measurement Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Point</em>' containment reference.
	 * @see #setMeasurementPoint(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength_MeasurementPoint()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Point</em>' containment reference.
	 * @see #getMeasurementPoint()
	 * @generated
	 */
	void setMeasurementPoint(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength_Country()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCountries();

} // MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength
