/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Coverage Coverage Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit#getLimits <em>Limit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Coverage_CoverageBenefit'"
 * @generated
 */
public interface InsurancePlanCoverageCoverageBenefit extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefit_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefit_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRequirement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverageCoverageBenefit_Limit()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanCoverageCoverageBenefitLimit> getLimits();

} // InsurancePlanCoverageCoverageBenefit
