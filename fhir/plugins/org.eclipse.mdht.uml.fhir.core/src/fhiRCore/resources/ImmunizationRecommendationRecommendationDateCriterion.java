/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation Date Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendationDateCriterion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Recommendation_DateCriterion'"
 * @generated
 */
public interface ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendationDateCriterion_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendationDateCriterion_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DateTime value);

} // ImmunizationRecommendationRecommendationDateCriterion
