/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getPreferredReportName <em>Preferred Report Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getQuantitativeDetails <em>Quantitative Details</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getQualifiedInterval <em>Qualified Interval</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinition#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationDefinition()
 * @model extendedMetaData="name='ObservationDefinition' kind='elementOnly'"
 * @generated
 */
public interface ObservationDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the general type of observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Coding)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Coding value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes what will be observed. Sometimes this is called the observation "name".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Permitted Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data type allowed for the result of the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permitted Data Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_PermittedDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permittedDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getPermittedDataType();

	/**
	 * Returns the value of the '<em><b>Multiple Results Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple results allowed for this kind of observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Results Allowed</em>' containment reference.
	 * @see #setMultipleResultsAllowed(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_MultipleResultsAllowed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multipleResultsAllowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMultipleResultsAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Results Allowed</em>' containment reference.
	 * @see #getMultipleResultsAllowed()
	 * @generated
	 */
	void setMultipleResultsAllowed(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method or technique used to perform the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred Report Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred name to be used when reporting the results of this observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Report Name</em>' containment reference.
	 * @see #setPreferredReportName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_PreferredReportName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preferredReportName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPreferredReportName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getPreferredReportName <em>Preferred Report Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Report Name</em>' containment reference.
	 * @see #getPreferredReportName()
	 * @generated
	 */
	void setPreferredReportName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quantitative Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics for quantitative results of this observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantitative Details</em>' containment reference.
	 * @see #setQuantitativeDetails(ObservationDefinitionQuantitativeDetails)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_QuantitativeDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantitativeDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationDefinitionQuantitativeDetails getQuantitativeDetails();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getQuantitativeDetails <em>Quantitative Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantitative Details</em>' containment reference.
	 * @see #getQuantitativeDetails()
	 * @generated
	 */
	void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails value);

	/**
	 * Returns the value of the '<em><b>Qualified Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ObservationDefinitionQualifiedInterval}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference range for ordinal and continuous observations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Interval</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_QualifiedInterval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifiedInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObservationDefinitionQualifiedInterval> getQualifiedInterval();

	/**
	 * Returns the value of the '<em><b>Valid Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of valid coded results for the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #setValidCodedValueSet(Uri)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_ValidCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValidCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getValidCodedValueSet <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #getValidCodedValueSet()
	 * @generated
	 */
	void setValidCodedValueSet(Uri value);

	/**
	 * Returns the value of the '<em><b>Normal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of normal coded results for the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #setNormalCodedValueSet(Uri)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_NormalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='normalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getNormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getNormalCodedValueSet <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #getNormalCodedValueSet()
	 * @generated
	 */
	void setNormalCodedValueSet(Uri value);

	/**
	 * Returns the value of the '<em><b>Abnormal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of abnormal coded results for the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #setAbnormalCodedValueSet(Uri)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_AbnormalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abnormalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAbnormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 */
	void setAbnormalCodedValueSet(Uri value);

	/**
	 * Returns the value of the '<em><b>Critical Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of critical coded results for the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #setCriticalCodedValueSet(Uri)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinition_CriticalCodedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criticalCodedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getCriticalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinition#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 */
	void setCriticalCodedValueSet(Uri value);

} // ObservationDefinition
