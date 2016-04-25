/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measure resource provides the definition of a quality measure.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Measure#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRiskAdjustment <em>Risk Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getSet <em>Set</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.Measure#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMeasure()
 * @model extendedMetaData="name='Measure' kind='elementOnly'"
 * @generated
 */
public interface Measure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Module Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata for the measure, including publishing, life-cycle, version, documentation, and supporting evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Metadata</em>' containment reference.
	 * @see #setModuleMetadata(ModuleMetadata)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_ModuleMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadata getModuleMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getModuleMetadata <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Metadata</em>' containment reference.
	 * @see #getModuleMetadata()
	 * @generated
	 */
	void setModuleMetadata(ModuleMetadata value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Library resource containing the formal logic used by the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLibrary();

	/**
	 * Returns the value of the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A disclaimer for the use of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disclaimer</em>' containment reference.
	 * @see #setDisclaimer(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Disclaimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disclaimer' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDisclaimer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getDisclaimer <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclaimer</em>' containment reference.
	 * @see #getDisclaimer()
	 * @generated
	 */
	void setDisclaimer(Markdown value);

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure scoring type, e.g. proportion, CV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoring</em>' containment reference.
	 * @see #setScoring(MeasureScoring)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Scoring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scoring' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureScoring getScoring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getScoring <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' containment reference.
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(MeasureScoring value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure type, e.g. process, outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getType();

	/**
	 * Returns the value of the '<em><b>Risk Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Adjustment</em>' containment reference.
	 * @see #setRiskAdjustment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_RiskAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='riskAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRiskAdjustment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRiskAdjustment <em>Risk Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Adjustment</em>' containment reference.
	 * @see #getRiskAdjustment()
	 * @generated
	 */
	void setRiskAdjustment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Rate Aggregation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the rate aggregation for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Aggregation</em>' containment reference.
	 * @see #setRateAggregation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_RateAggregation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateAggregation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRateAggregation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRateAggregation <em>Rate Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Aggregation</em>' containment reference.
	 * @see #getRateAggregation()
	 * @generated
	 */
	void setRateAggregation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rationale for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRationale();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(Markdown value);

	/**
	 * Returns the value of the '<em><b>Clinical Recommendation Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical recommendation statement for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Recommendation Statement</em>' containment reference.
	 * @see #setClinicalRecommendationStatement(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_ClinicalRecommendationStatement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalRecommendationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getClinicalRecommendationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Recommendation Statement</em>' containment reference.
	 * @see #getClinicalRecommendationStatement()
	 * @generated
	 */
	void setClinicalRecommendationStatement(Markdown value);

	/**
	 * Returns the value of the '<em><b>Improvement Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Improvement notation for the measure, e.g. higher score indicates better quality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #setImprovementNotation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_ImprovementNotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='improvementNotation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getImprovementNotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getImprovementNotation <em>Improvement Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvement Notation</em>' containment reference.
	 * @see #getImprovementNotation()
	 * @generated
	 */
	void setImprovementNotation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A narrative description of the complete measure calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Markdown value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guidance</em>' containment reference.
	 * @see #setGuidance(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Guidance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guidance' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getGuidance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getGuidance <em>Guidance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' containment reference.
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(Markdown value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The measure set, e.g. Preventive Care and Screening.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Set()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Measure#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group of population criteria for the measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureSupplementalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMeasure_SupplementalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureSupplementalData> getSupplementalData();

} // Measure
