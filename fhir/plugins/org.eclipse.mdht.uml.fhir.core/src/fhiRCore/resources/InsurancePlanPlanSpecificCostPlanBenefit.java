/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Plan Specific Cost Plan Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit#getCosts <em>Cost</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SpecificCost_PlanBenefit'"
 * @generated
 */
public interface InsurancePlanPlanSpecificCostPlanBenefit extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefit_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefit_Cost()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanPlanSpecificCostPlanBenefitCost> getCosts();

} // InsurancePlanPlanSpecificCostPlanBenefit
