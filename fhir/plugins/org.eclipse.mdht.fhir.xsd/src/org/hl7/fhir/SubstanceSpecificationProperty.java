/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getSubstanceId <em>Substance Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getSubstanceName <em>Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty()
 * @model extendedMetaData="name='SubstanceSpecification.Property' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A field that should be used to capture parameters that were used in the measurement of a property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Substance Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for a substance upon which a defining property depends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Id</em>' containment reference.
	 * @see #setSubstanceId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_SubstanceId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSubstanceId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getSubstanceId <em>Substance Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Id</em>' containment reference.
	 * @see #getSubstanceId()
	 * @generated
	 */
	void setSubstanceId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Substance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Name</em>' containment reference.
	 * @see #setSubstanceName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_SubstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubstanceName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getSubstanceName <em>Substance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance Name</em>' containment reference.
	 * @see #getSubstanceName()
	 * @generated
	 */
	void setSubstanceName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantitative value for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationProperty_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationProperty#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(org.hl7.fhir.String value);

} // SubstanceSpecificationProperty
