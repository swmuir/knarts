/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis Risk Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getDenominatorCount <em>Denominator Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getNumeratorCount <em>Numerator Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getPrecisionEstimates <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RiskEvidenceSynthesis_RiskEstimate'"
 * @generated
 */
public interface RiskEvidenceSynthesisRiskEstimate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_Description()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_Value()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #setUnitOfMeasure(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_UnitOfMeasure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getUnitOfMeasure <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' containment reference.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Denominator Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator Count</em>' containment reference.
	 * @see #setDenominatorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_DenominatorCount()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getDenominatorCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getDenominatorCount <em>Denominator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator Count</em>' containment reference.
	 * @see #getDenominatorCount()
	 * @generated
	 */
	void setDenominatorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Numerator Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator Count</em>' containment reference.
	 * @see #setNumeratorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_NumeratorCount()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getNumeratorCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate#getNumeratorCount <em>Numerator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator Count</em>' containment reference.
	 * @see #getNumeratorCount()
	 * @generated
	 */
	void setNumeratorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Precision Estimate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimatePrecisionEstimate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Estimate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Estimate</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskEvidenceSynthesisRiskEstimate_PrecisionEstimate()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate> getPrecisionEstimates();

} // RiskEvidenceSynthesisRiskEstimate
