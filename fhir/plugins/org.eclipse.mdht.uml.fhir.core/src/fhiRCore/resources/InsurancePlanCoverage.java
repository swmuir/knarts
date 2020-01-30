/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverage#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverage#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanCoverage#getBenefits <em>Benefit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InsurancePlan_Coverage'"
 * @generated
 */
public interface InsurancePlanCoverage extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverage_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanCoverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverage_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getNetworks();

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanCoverage_Benefit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InsurancePlanCoverageCoverageBenefit> getBenefits();

} // InsurancePlanCoverage
