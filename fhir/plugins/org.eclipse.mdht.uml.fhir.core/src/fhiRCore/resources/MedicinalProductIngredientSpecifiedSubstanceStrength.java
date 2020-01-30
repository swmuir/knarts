/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Ratio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Ingredient Specified Substance Strength</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getPresentationLowLimit <em>Presentation Low Limit</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getConcentrationLowLimit <em>Concentration Low Limit</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getCountries <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getReferenceStrengths <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SpecifiedSubstance_Strength'"
 * @generated
 */
public interface MedicinalProductIngredientSpecifiedSubstanceStrength extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_Presentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ratio getPresentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Ratio value);

	/**
	 * Returns the value of the '<em><b>Presentation Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Low Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Low Limit</em>' containment reference.
	 * @see #setPresentationLowLimit(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_PresentationLowLimit()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getPresentationLowLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getPresentationLowLimit <em>Presentation Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Low Limit</em>' containment reference.
	 * @see #getPresentationLowLimit()
	 * @generated
	 */
	void setPresentationLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Concentration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration</em>' containment reference.
	 * @see #setConcentration(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_Concentration()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getConcentration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getConcentration <em>Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration</em>' containment reference.
	 * @see #getConcentration()
	 * @generated
	 */
	void setConcentration(Ratio value);

	/**
	 * Returns the value of the '<em><b>Concentration Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration Low Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration Low Limit</em>' containment reference.
	 * @see #setConcentrationLowLimit(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_ConcentrationLowLimit()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getConcentrationLowLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getConcentrationLowLimit <em>Concentration Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Low Limit</em>' containment reference.
	 * @see #getConcentrationLowLimit()
	 * @generated
	 */
	void setConcentrationLowLimit(Ratio value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_MeasurementPoint()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMeasurementPoint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength#getMeasurementPoint <em>Measurement Point</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_Country()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCountries();

	/**
	 * Returns the value of the '<em><b>Reference Strength</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Strength</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Strength</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductIngredientSpecifiedSubstanceStrength_ReferenceStrength()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength> getReferenceStrengths();

} // MedicinalProductIngredientSpecifiedSubstanceStrength
