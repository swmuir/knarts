/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition Qualified Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval()
 * @model extendedMetaData="name='ObservationDefinition.QualifiedInterval' kind='elementOnly'"
 * @generated
 */
public interface ObservationDefinitionQualifiedInterval extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category or type of interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value and associated unit of the low bound (inclusive) of the reference range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes to indicate what part of the targeted reference population it applies to. For example, the normal or therapeutic range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes to indicate the target population this reference range applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_AppliesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_Age()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='age' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Gestational Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gestational age at which this reference range is applicable, in the context of pregnancy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gestational Age</em>' containment reference.
	 * @see #setGestationalAge(Range)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_GestationalAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gestationalAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getGestationalAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getGestationalAge <em>Gestational Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestational Age</em>' containment reference.
	 * @see #getGestationalAge()
	 * @generated
	 */
	void setGestationalAge(Range value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text based condition for which the reference range is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservationDefinitionQualifiedInterval_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ObservationDefinitionQualifiedInterval#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

} // ObservationDefinitionQualifiedInterval
