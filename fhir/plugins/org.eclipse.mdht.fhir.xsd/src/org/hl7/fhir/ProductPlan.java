/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details of a Health Insurance product/plan provided by an organization.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProductPlan#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getAdministeredBy <em>Administered By</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductPlan#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProductPlan()
 * @model extendedMetaData="name='ProductPlan' kind='elementOnly'"
 * @generated
 */
public interface ProductPlan extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the product/plan that is used to identify it across multiple disparate systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the organization's record is still in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of product/plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official name of the product/plan (as designated by the owner).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of alternate names that the product/plan is known as, or was known as in the past.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time that the product is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owner of the product/plan (typically a payer).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned By</em>' containment reference.
	 * @see #setOwnedBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_OwnedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ownedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwnedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getOwnedBy <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' containment reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Administered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrator of the product/plan (e.g. self-insured employer plan administered by a TPA).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administered By</em>' containment reference.
	 * @see #setAdministeredBy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_AdministeredBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administeredBy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdministeredBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getAdministeredBy <em>Administered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administered By</em>' containment reference.
	 * @see #getAdministeredBy()
	 * @generated
	 */
	void setAdministeredBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An address for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The geographic region in which this product/plan is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference.
	 * @see #setCoverageArea(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_CoverageArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverageArea();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductPlan#getCoverageArea <em>Coverage Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Area</em>' containment reference.
	 * @see #getCoverageArea()
	 * @generated
	 */
	void setCoverageArea(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductPlanContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact for the product/plan for a certain purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPlanContact> getContact();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductPlanCoverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the coverage offered by the insurance product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPlanCoverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductPlanPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about an insurance plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPlanPlan> getPlan();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical endpoints providing access to services operated for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProductPlan_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEndpoint();

} // ProductPlan
