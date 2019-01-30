/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Plan Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details of a Health Insurance product/plan provided by an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProductPlanCost#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanCost#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanCost#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanCost#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProductPlanCost()
 * @model extendedMetaData="name='ProductPlan.Cost' kind='elementOnly'"
 * @generated
 */
public interface ProductPlanCost extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of cost (copay; individual cap; family cap; coinsurance; deductible).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanCost_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlanCost_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getApplicability();

	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlanCost_Qualifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanCost_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanCost#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

} // ProductPlanCost
