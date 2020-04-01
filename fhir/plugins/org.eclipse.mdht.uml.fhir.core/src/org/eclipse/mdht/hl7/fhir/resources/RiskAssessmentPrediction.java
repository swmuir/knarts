/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getProbabilityx <em>Probabilityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getQualitativeRisk <em>Qualitative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getWhenx <em>Whenx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RiskAssessment_Prediction'"
 * @generated
 */
public interface RiskAssessmentPrediction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Probabilityx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilityx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilityx</em>' containment reference.
	 * @see #setProbabilityx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_Probabilityx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='probability[x]'"
	 * @generated
	 */
	DataType getProbabilityx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getProbabilityx <em>Probabilityx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilityx</em>' containment reference.
	 * @see #getProbabilityx()
	 * @generated
	 */
	void setProbabilityx(DataType value);

	/**
	 * Returns the value of the '<em><b>Qualitative Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualitative Risk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitative Risk</em>' containment reference.
	 * @see #setQualitativeRisk(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_QualitativeRisk()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getQualitativeRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getQualitativeRisk <em>Qualitative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitative Risk</em>' containment reference.
	 * @see #getQualitativeRisk()
	 * @generated
	 */
	void setQualitativeRisk(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Relative Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Risk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Risk</em>' containment reference.
	 * @see #setRelativeRisk(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_RelativeRisk()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getRelativeRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Risk</em>' containment reference.
	 * @see #getRelativeRisk()
	 * @generated
	 */
	void setRelativeRisk(Decimal value);

	/**
	 * Returns the value of the '<em><b>Whenx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whenx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whenx</em>' containment reference.
	 * @see #setWhenx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_Whenx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='when[x]'"
	 * @generated
	 */
	DataType getWhenx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getWhenx <em>Whenx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whenx</em>' containment reference.
	 * @see #getWhenx()
	 * @generated
	 */
	void setWhenx(DataType value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getRiskAssessmentPrediction_Rationale()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // RiskAssessmentPrediction
