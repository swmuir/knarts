/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Plan Plan</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ProductPlanPlan#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanPlan#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlanPlan#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProductPlanPlan()
 * @model extendedMetaData="name='ProductPlan.Plan' kind='elementOnly'"
 * @generated
 */
public interface ProductPlanPlan extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of plan (Platinum; Gold; Silver; Bronze; High Deductable; Low Deductable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanPlan_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanPlan#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional descriptive content about the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanPlan_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanPlan#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Premium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan premium.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premium</em>' containment reference.
	 * @see #setPremium(Money)
	 * @see org.hl7.fhir.FhirPackage#getProductPlanPlan_Premium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='premium' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPremium();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlanPlan#getPremium <em>Premium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premium</em>' containment reference.
	 * @see #getPremium()
	 * @generated
	 */
	void setPremium(Money value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductPlanCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the costs associated with plan benefits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlanPlan_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPlanCategory> getCategory();

} // ProductPlanPlan
