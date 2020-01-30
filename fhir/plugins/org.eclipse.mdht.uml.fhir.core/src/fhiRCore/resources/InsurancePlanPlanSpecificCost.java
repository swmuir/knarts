/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Plan Specific Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCost#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCost#getBenefits <em>Benefit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCost()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Plan_SpecificCost'"
 * @generated
 */
public interface InsurancePlanPlanSpecificCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCost_Category()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanSpecificCost#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCost_Benefit()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanPlanSpecificCostPlanBenefit> getBenefits();

} // InsurancePlanPlanSpecificCost
