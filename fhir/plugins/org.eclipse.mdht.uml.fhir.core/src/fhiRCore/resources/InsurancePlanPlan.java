/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getGeneralCosts <em>General Cost</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlanPlan#getSpecificCosts <em>Specific Cost</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InsurancePlan_Plan'"
 * @generated
 */
public interface InsurancePlanPlan extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlanPlan#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_CoverageArea()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getCoverageAreas();

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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getNetworks();

	/**
	 * Returns the value of the '<em><b>General Cost</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanPlanGeneralCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Cost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Cost</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_GeneralCost()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanPlanGeneralCost> getGeneralCosts();

	/**
	 * Returns the value of the '<em><b>Specific Cost</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanPlanSpecificCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Cost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Cost</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlanPlan_SpecificCost()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanPlanSpecificCost> getSpecificCosts();

} // InsurancePlanPlan
