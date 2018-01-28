/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Plan Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ProductPlanItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanItem#getBenefitValue <em>Benefit Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProductPlanItem()
 * @model extendedMetaData="name='ProductPlan.Item' kind='elementOnly'"
 * @generated
 */
public interface ProductPlanItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded Details of the specific benefit (days; visits).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanItem_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanItem#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefit Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the specific benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Value</em>' containment reference.
	 * @see #setBenefitValue(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanItem_BenefitValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getBenefitValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanItem#getBenefitValue <em>Benefit Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Value</em>' containment reference.
	 * @see #getBenefitValue()
	 * @generated
	 */
	void setBenefitValue(Quantity value);

} // ProductPlanItem
