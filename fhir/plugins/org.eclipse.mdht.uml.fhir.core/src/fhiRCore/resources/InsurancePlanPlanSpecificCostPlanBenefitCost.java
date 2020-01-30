/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Plan Specific Cost Plan Benefit Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefitCost()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PlanBenefit_Cost'"
 * @generated
 */
public interface InsurancePlanPlanSpecificCostPlanBenefitCost extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefitCost_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference.
	 * @see #setApplicability(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefitCost_Applicability()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getApplicability();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getApplicability <em>Applicability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' containment reference.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefitCost_Qualifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlanSpecificCostPlanBenefitCost_Value()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

} // InsurancePlanPlanSpecificCostPlanBenefitCost
