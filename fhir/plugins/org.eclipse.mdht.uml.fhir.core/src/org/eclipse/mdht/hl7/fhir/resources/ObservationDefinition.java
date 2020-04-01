/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getPermittedDataTypes <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getPreferredReportName <em>Preferred Report Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getQuantitativeDetails <em>Quantitative Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getQualifiedIntervals <em>Qualified Interval</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getValidCodedValueSet <em>Valid Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getNormalCodedValueSet <em>Normal Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition()
 * @model
 * @generated
 */
public interface ObservationDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Permitted Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permitted Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permitted Data Type</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_PermittedDataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getPermittedDataTypes();

	/**
	 * Returns the value of the '<em><b>Multiple Results Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Results Allowed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Results Allowed</em>' containment reference.
	 * @see #setMultipleResultsAllowed(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_MultipleResultsAllowed()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getMultipleResultsAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getMultipleResultsAllowed <em>Multiple Results Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Results Allowed</em>' containment reference.
	 * @see #getMultipleResultsAllowed()
	 * @generated
	 */
	void setMultipleResultsAllowed(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getMethod <em>Method</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Preferred Report Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Report Name</em>' containment reference.
	 * @see #setPreferredReportName(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_PreferredReportName()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getPreferredReportName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getPreferredReportName <em>Preferred Report Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Report Name</em>' containment reference.
	 * @see #getPreferredReportName()
	 * @generated
	 */
	void setPreferredReportName(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Quantitative Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantitative Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantitative Details</em>' containment reference.
	 * @see #setQuantitativeDetails(ObservationDefinitionQuantitativeDetails)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_QuantitativeDetails()
	 * @model containment="true"
	 * @generated
	 */
	ObservationDefinitionQuantitativeDetails getQuantitativeDetails();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getQuantitativeDetails <em>Quantitative Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantitative Details</em>' containment reference.
	 * @see #getQuantitativeDetails()
	 * @generated
	 */
	void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails value);

	/**
	 * Returns the value of the '<em><b>Qualified Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinitionQualifiedInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Interval</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Interval</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_QualifiedInterval()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservationDefinitionQualifiedInterval> getQualifiedIntervals();

	/**
	 * Returns the value of the '<em><b>Valid Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Coded Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #setValidCodedValueSet(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_ValidCodedValueSet()
	 * @model containment="true"
	 * @generated
	 */
	Reference getValidCodedValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getValidCodedValueSet <em>Valid Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Coded Value Set</em>' containment reference.
	 * @see #getValidCodedValueSet()
	 * @generated
	 */
	void setValidCodedValueSet(Reference value);

	/**
	 * Returns the value of the '<em><b>Normal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Coded Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #setNormalCodedValueSet(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_NormalCodedValueSet()
	 * @model containment="true"
	 * @generated
	 */
	Reference getNormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getNormalCodedValueSet <em>Normal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Coded Value Set</em>' containment reference.
	 * @see #getNormalCodedValueSet()
	 * @generated
	 */
	void setNormalCodedValueSet(Reference value);

	/**
	 * Returns the value of the '<em><b>Abnormal Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abnormal Coded Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #setAbnormalCodedValueSet(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_AbnormalCodedValueSet()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAbnormalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getAbnormalCodedValueSet <em>Abnormal Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abnormal Coded Value Set</em>' containment reference.
	 * @see #getAbnormalCodedValueSet()
	 * @generated
	 */
	void setAbnormalCodedValueSet(Reference value);

	/**
	 * Returns the value of the '<em><b>Critical Coded Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Coded Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #setCriticalCodedValueSet(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getObservationDefinition_CriticalCodedValueSet()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCriticalCodedValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ObservationDefinition#getCriticalCodedValueSet <em>Critical Coded Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Coded Value Set</em>' containment reference.
	 * @see #getCriticalCodedValueSet()
	 * @generated
	 */
	void setCriticalCodedValueSet(Reference value);

} // ObservationDefinition
