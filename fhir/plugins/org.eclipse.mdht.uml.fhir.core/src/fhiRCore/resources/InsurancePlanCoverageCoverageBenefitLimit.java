/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Coverage Coverage Benefit Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefitLimit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageBenefit_Limit'"
 * @generated
 */
public interface InsurancePlanCoverageCoverageBenefitLimit extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefitLimit_Value()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefitLimit_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

} // InsurancePlanCoverageCoverageBenefitLimit
