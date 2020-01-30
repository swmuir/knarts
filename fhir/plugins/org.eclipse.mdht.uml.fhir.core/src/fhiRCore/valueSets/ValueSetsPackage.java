/**
 */
package fhiRCore.valueSets;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueSets'"
 * @generated
 */
public interface ValueSetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "valueSets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fhiRCore/valueSets.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhiRCore.valueSets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValueSetsPackage eINSTANCE = fhiRCore.valueSets.impl.ValueSetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DataType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ResourceType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.IdentifierTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getIdentifierTypeCodes()
	 * @generated
	 */
	int IDENTIFIER_TYPE_CODES = 2;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.UsageContextType <em>Usage Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.UsageContextType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getUsageContextType()
	 * @generated
	 */
	int USAGE_CONTEXT_TYPE = 3;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContextOfUseValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContextOfUseValueSet()
	 * @generated
	 */
	int CONTEXT_OF_USE_VALUE_SET = 4;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.JurisdictionValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getJurisdictionValueSet()
	 * @generated
	 */
	int JURISDICTION_VALUE_SET = 5;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DefinitionUseCodes <em>Definition Use Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DefinitionUseCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDefinitionUseCodes()
	 * @generated
	 */
	int DEFINITION_USE_CODES = 6;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FhirDefinedType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFhirDefinedType()
	 * @generated
	 */
	int FHIR_DEFINED_TYPE = 7;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.LoincCodes <em>Loinc Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.LoincCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getLoincCodes()
	 * @generated
	 */
	int LOINC_CODES = 8;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CommonLanguages <em>Common Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CommonLanguages
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCommonLanguages()
	 * @generated
	 */
	int COMMON_LANGUAGES = 9;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SignatureTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSignatureTypeCodes()
	 * @generated
	 */
	int SIGNATURE_TYPE_CODES = 10;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V2036027 <em>V2036027</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V2036027
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV2036027()
	 * @generated
	 */
	int V2036027 = 11;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TimingAbbreviation
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTimingAbbreviation()
	 * @generated
	 */
	int TIMING_ABBREVIATION = 12;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SubjectType <em>Subject Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SubjectType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSubjectType()
	 * @generated
	 */
	int SUBJECT_TYPE = 13;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DesignationUse <em>Designation Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DesignationUse
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDesignationUse()
	 * @generated
	 */
	int DESIGNATION_USE = 14;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExpressionLanguage <em>Expression Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExpressionLanguage
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExpressionLanguage()
	 * @generated
	 */
	int EXPRESSION_LANGUAGE = 15;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctAdditionalDosageInstructions <em>Snomedct Additional Dosage Instructions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctAdditionalDosageInstructions
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctAdditionalDosageInstructions()
	 * @generated
	 */
	int SNOMEDCT_ADDITIONAL_DOSAGE_INSTRUCTIONS = 16;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctMedicationAsNeededReasonCodes <em>Snomedct Medication As Needed Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctMedicationAsNeededReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctMedicationAsNeededReasonCodes()
	 * @generated
	 */
	int SNOMEDCT_MEDICATION_AS_NEEDED_REASON_CODES = 17;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes <em>Snomedct Anatomical Structure For Administration Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctAnatomicalStructureForAdministrationSiteCodes()
	 * @generated
	 */
	int SNOMEDCT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES = 18;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctRouteCodes <em>Snomedct Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctRouteCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctRouteCodes()
	 * @generated
	 */
	int SNOMEDCT_ROUTE_CODES = 19;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctAdministrationMethodCodes <em>Snomedct Administration Method Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctAdministrationMethodCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctAdministrationMethodCodes()
	 * @generated
	 */
	int SNOMEDCT_ADMINISTRATION_METHOD_CODES = 20;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DoseAndRateType <em>Dose And Rate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DoseAndRateType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDoseAndRateType()
	 * @generated
	 */
	int DOSE_AND_RATE_TYPE = 21;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AllSecurityLabels <em>All Security Labels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AllSecurityLabels
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAllSecurityLabels()
	 * @generated
	 */
	int ALL_SECURITY_LABELS = 22;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CommonTags <em>Common Tags</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CommonTags
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCommonTags()
	 * @generated
	 */
	int COMMON_TAGS = 23;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.OrganizationType <em>Organization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.OrganizationType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 24;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContactEntityType <em>Contact Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContactEntityType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContactEntityType()
	 * @generated
	 */
	int CONTACT_ENTITY_TYPE = 25;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EndpointConnectionType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEndpointConnectionType()
	 * @generated
	 */
	int ENDPOINT_CONNECTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EndpointPayloadType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEndpointPayloadType()
	 * @generated
	 */
	int ENDPOINT_PAYLOAD_TYPE = 27;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.LibraryType <em>Library Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.LibraryType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 28;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DefinitionTopic <em>Definition Topic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DefinitionTopic
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDefinitionTopic()
	 * @generated
	 */
	int DEFINITION_TOPIC = 29;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MeasureScoring <em>Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MeasureScoring
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMeasureScoring()
	 * @generated
	 */
	int MEASURE_SCORING = 30;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CompositeMeasureScoring
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCompositeMeasureScoring()
	 * @generated
	 */
	int COMPOSITE_MEASURE_SCORING = 31;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MeasureType <em>Measure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MeasureType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 32;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MeasurePopulationType <em>Measure Population Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MeasurePopulationType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMeasurePopulationType()
	 * @generated
	 */
	int MEASURE_POPULATION_TYPE = 33;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MeasureDataUsage
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMeasureDataUsage()
	 * @generated
	 */
	int MEASURE_DATA_USAGE = 34;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MaritalStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMaritalStatusCodes()
	 * @generated
	 */
	int MARITAL_STATUS_CODES = 35;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PatientContactRelationship <em>Patient Contact Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PatientContactRelationship
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPatientContactRelationship()
	 * @generated
	 */
	int PATIENT_CONTACT_RELATIONSHIP = 36;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleUseCodesForList
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleUseCodesForList()
	 * @generated
	 */
	int EXAMPLE_USE_CODES_FOR_LIST = 37;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActEncounterCode <em>V3 Act Encounter Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActEncounterCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActEncounterCode()
	 * @generated
	 */
	int V3_ACT_ENCOUNTER_CODE = 38;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EncounterType <em>Encounter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EncounterType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEncounterType()
	 * @generated
	 */
	int ENCOUNTER_TYPE = 39;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ServiceType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 40;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActPriority <em>V3 Act Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActPriority
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActPriority()
	 * @generated
	 */
	int V3_ACT_PRIORITY = 41;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EpisodeOfCareType <em>Episode Of Care Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EpisodeOfCareType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEpisodeOfCareType()
	 * @generated
	 */
	int EPISODE_OF_CARE_TYPE = 42;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionCategoryCodes()
	 * @generated
	 */
	int CONDITION_CATEGORY_CODES = 43;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionDiagnosisSeverity
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionDiagnosisSeverity()
	 * @generated
	 */
	int CONDITION_DIAGNOSIS_SEVERITY = 44;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionProblemDiagnosisCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionProblemDiagnosisCodes()
	 * @generated
	 */
	int CONDITION_PROBLEM_DIAGNOSIS_CODES = 45;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctBodyStructures <em>Snomedct Body Structures</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctBodyStructures
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctBodyStructures()
	 * @generated
	 */
	int SNOMEDCT_BODY_STRUCTURES = 46;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionStage <em>Condition Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionStage
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionStage()
	 * @generated
	 */
	int CONDITION_STAGE = 47;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.InvestigationType <em>Investigation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.InvestigationType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getInvestigationType()
	 * @generated
	 */
	int INVESTIGATION_TYPE = 48;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PlanDefinitionType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPlanDefinitionType()
	 * @generated
	 */
	int PLAN_DEFINITION_TYPE = 49;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.GoalCategory <em>Goal Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.GoalCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getGoalCategory()
	 * @generated
	 */
	int GOAL_CATEGORY = 50;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctClinicalFindings <em>Snomedct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctClinicalFindings
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctClinicalFindings()
	 * @generated
	 */
	int SNOMEDCT_CLINICAL_FINDINGS = 51;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.GoalPriority <em>Goal Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.GoalPriority
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getGoalPriority()
	 * @generated
	 */
	int GOAL_PRIORITY = 52;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.GoalStartEvent <em>Goal Start Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.GoalStartEvent
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getGoalStartEvent()
	 * @generated
	 */
	int GOAL_START_EVENT = 53;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ActionParticipantRole <em>Action Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ActionParticipantRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getActionParticipantRole()
	 * @generated
	 */
	int ACTION_PARTICIPANT_ROLE = 54;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ActionType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 55;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CarePlanCategory <em>Care Plan Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CarePlanCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCarePlanCategory()
	 * @generated
	 */
	int CARE_PLAN_CATEGORY = 56;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CareTeamCategory <em>Care Team Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CareTeamCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCareTeamCategory()
	 * @generated
	 */
	int CARE_TEAM_CATEGORY = 57;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ParticipantRoles <em>Participant Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ParticipantRoles
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getParticipantRoles()
	 * @generated
	 */
	int PARTICIPANT_ROLES = 58;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.GoalAchievementStatus <em>Goal Achievement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.GoalAchievementStatus
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getGoalAchievementStatus()
	 * @generated
	 */
	int GOAL_ACHIEVEMENT_STATUS = 59;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CarePlanActivityOutcome <em>Care Plan Activity Outcome</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CarePlanActivityOutcome
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCarePlanActivityOutcome()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_OUTCOME = 60;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AppointmentCancellationReason <em>Appointment Cancellation Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AppointmentCancellationReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAppointmentCancellationReason()
	 * @generated
	 */
	int APPOINTMENT_CANCELLATION_REASON = 61;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ServiceCategory <em>Service Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ServiceCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 62;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PracticeSettingCodeValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPracticeSettingCodeValueSet()
	 * @generated
	 */
	int PRACTICE_SETTING_CODE_VALUE_SET = 63;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20276 <em>V20276</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20276
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20276()
	 * @generated
	 */
	int V20276 = 64;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EncounterReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEncounterReasonCodes()
	 * @generated
	 */
	int ENCOUNTER_REASON_CODES = 65;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureCodesSnomedcT <em>Procedure Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureCodesSnomedcT
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_CODES_SNOMEDC_T = 66;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20116 <em>V20116</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20116
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20116()
	 * @generated
	 */
	int V20116 = 67;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ServiceDeliveryLocationRoleType <em>V3 Service Delivery Location Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ServiceDeliveryLocationRoleType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ServiceDeliveryLocationRoleType()
	 * @generated
	 */
	int V3_SERVICE_DELIVERY_LOCATION_ROLE_TYPE = 68;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.LocationType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 69;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctMedicationCodes <em>Snomedct Medication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctMedicationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctMedicationCodes()
	 * @generated
	 */
	int SNOMEDCT_MEDICATION_CODES = 70;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20487 <em>V20487</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20487
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20487()
	 * @generated
	 */
	int V20487 = 71;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PreparePatient <em>Prepare Patient</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PreparePatient
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPreparePatient()
	 * @generated
	 */
	int PREPARE_PATIENT = 72;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SpecimenCollection <em>Specimen Collection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SpecimenCollection
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSpecimenCollection()
	 * @generated
	 */
	int SPECIMEN_COLLECTION = 73;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContainerMaterials <em>Container Materials</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContainerMaterials
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContainerMaterials()
	 * @generated
	 */
	int CONTAINER_MATERIALS = 74;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SpecimenContainerType <em>Specimen Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SpecimenContainerType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSpecimenContainerType()
	 * @generated
	 */
	int SPECIMEN_CONTAINER_TYPE = 75;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContainerCap <em>Container Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContainerCap
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContainerCap()
	 * @generated
	 */
	int CONTAINER_CAP = 76;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20371 <em>V20371</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20371
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20371()
	 * @generated
	 */
	int V20371 = 77;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.RejectionCriterion <em>Rejection Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.RejectionCriterion
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getRejectionCriterion()
	 * @generated
	 */
	int REJECTION_CRITERION = 78;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.HandlingConditionSet <em>Handling Condition Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.HandlingConditionSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getHandlingConditionSet()
	 * @generated
	 */
	int HANDLING_CONDITION_SET = 79;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObservationCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObservationCategoryCodes()
	 * @generated
	 */
	int OBSERVATION_CATEGORY_CODES = 80;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObservationMethods <em>Observation Methods</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObservationMethods
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObservationMethods()
	 * @generated
	 */
	int OBSERVATION_METHODS = 81;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.UcumCodes <em>Ucum Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.UcumCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getUcumCodes()
	 * @generated
	 */
	int UCUM_CODES = 82;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObservationReferenceRangeMeaningCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObservationReferenceRangeMeaningCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_MEANING_CODES = 83;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObservationReferenceRangeAppliesToCodes <em>Observation Reference Range Applies To Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObservationReferenceRangeAppliesToCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObservationReferenceRangeAppliesToCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_APPLIES_TO_CODES = 84;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ServiceRequestCategoryCodes <em>Service Request Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ServiceRequestCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getServiceRequestCategoryCodes()
	 * @generated
	 */
	int SERVICE_REQUEST_CATEGORY_CODES = 85;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ServiceRequestOrderDetailsCodes <em>Service Request Order Details Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ServiceRequestOrderDetailsCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getServiceRequestOrderDetailsCodes()
	 * @generated
	 */
	int SERVICE_REQUEST_ORDER_DETAILS_CODES = 86;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureReasonCodes()
	 * @generated
	 */
	int PROCEDURE_REASON_CODES = 87;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CoverageTypeAndSelfPayCodes <em>Coverage Type And Self Pay Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CoverageTypeAndSelfPayCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCoverageTypeAndSelfPayCodes()
	 * @generated
	 */
	int COVERAGE_TYPE_AND_SELF_PAY_CODES = 88;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SubscriberRelationshipCodes <em>Subscriber Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SubscriberRelationshipCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSubscriberRelationshipCodes()
	 * @generated
	 */
	int SUBSCRIBER_RELATIONSHIP_CODES = 89;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CoverageClassCodes <em>Coverage Class Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CoverageClassCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCoverageClassCodes()
	 * @generated
	 */
	int COVERAGE_CLASS_CODES = 90;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CoverageCopayTypeCodes <em>Coverage Copay Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CoverageCopayTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCoverageCopayTypeCodes()
	 * @generated
	 */
	int COVERAGE_COPAY_TYPE_CODES = 91;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleCoverageFinancialExceptionCodes <em>Example Coverage Financial Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleCoverageFinancialExceptionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleCoverageFinancialExceptionCodes()
	 * @generated
	 */
	int EXAMPLE_COVERAGE_FINANCIAL_EXCEPTION_CODES = 92;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceLegalStateCodes <em>Contract Resource Legal State Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceLegalStateCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceLegalStateCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_LEGAL_STATE_CODES = 93;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractContentDerivationCodes <em>Contract Content Derivation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractContentDerivationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractContentDerivationCodes()
	 * @generated
	 */
	int CONTRACT_CONTENT_DERIVATION_CODES = 94;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceExpirationTypeCodes <em>Contract Resource Expiration Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceExpirationTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceExpirationTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_EXPIRATION_TYPE_CODES = 95;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceScopeCodes <em>Contract Resource Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceScopeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES = 96;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractTypeCodes()
	 * @generated
	 */
	int CONTRACT_TYPE_CODES = 97;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractSubtypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_SUBTYPE_CODES = 98;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceDefinitionTypeCodes <em>Contract Resource Definition Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceDefinitionTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceDefinitionTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DEFINITION_TYPE_CODES = 99;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceDefinitionSubtypeCodes <em>Contract Resource Definition Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceDefinitionSubtypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceDefinitionSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DEFINITION_SUBTYPE_CODES = 100;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractTermTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 101;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractTermSubtypeCodes <em>Contract Term Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractTermSubtypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractTermSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_SUBTYPE_CODES = 102;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceScopeCodesA <em>Contract Resource Scope Codes A</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceScopeCodesA
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodesA()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES_A = 103;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceScopeCodesB <em>Contract Resource Scope Codes B</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceScopeCodesB
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodesB()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES_B = 104;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceSecurityControlCodes <em>Contract Resource Security Control Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceSecurityControlCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceSecurityControlCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SECURITY_CONTROL_CODES = 105;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourcePartyRoleCodes <em>Contract Resource Party Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourcePartyRoleCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourcePartyRoleCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_PARTY_ROLE_CODES = 106;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActConsentDirective <em>V3 Act Consent Directive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActConsentDirective
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActConsentDirective()
	 * @generated
	 */
	int V3_ACT_CONSENT_DIRECTIVE = 107;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceDecisionModeCodes <em>Contract Resource Decision Mode Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceDecisionModeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceDecisionModeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DECISION_MODE_CODES = 108;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceAssetScopeCodes <em>Contract Resource Asset Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceAssetScopeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetScopeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_SCOPE_CODES = 109;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceAssetTypeCodes <em>Contract Resource Asset Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceAssetTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_TYPE_CODES = 110;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceAssetSubTypeCodes <em>Contract Resource Asset Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceAssetSubTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetSubTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_SUB_TYPE_CODES = 111;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentContentClass <em>Consent Content Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentContentClass
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentContentClass()
	 * @generated
	 */
	int CONSENT_CONTENT_CLASS = 112;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceAssetContextCodes <em>Contract Resource Asset Context Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceAssetContextCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetContextCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_CONTEXT_CODES = 113;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceAssetAvailiabilityCodes <em>Contract Resource Asset Availiability Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceAssetAvailiabilityCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetAvailiabilityCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_AVAILIABILITY_CODES = 114;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractActionCodes <em>Contract Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractActionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractActionCodes()
	 * @generated
	 */
	int CONTRACT_ACTION_CODES = 115;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractActorRoleCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractActorRoleCodes()
	 * @generated
	 */
	int CONTRACT_ACTOR_ROLE_CODES = 116;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3PurposeOfUse <em>V3 Purpose Of Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3PurposeOfUse
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3PurposeOfUse()
	 * @generated
	 */
	int V3_PURPOSE_OF_USE = 117;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractResourceActionStatusCodes <em>Contract Resource Action Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractResourceActionStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractResourceActionStatusCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ACTION_STATUS_CODES = 118;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProvenanceParticipantType <em>Provenance Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProvenanceParticipantType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProvenanceParticipantType()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_TYPE = 119;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProvenanceParticipantRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProvenanceParticipantRole()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_ROLE = 120;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PatientRelationshipType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPatientRelationshipType()
	 * @generated
	 */
	int PATIENT_RELATIONSHIP_TYPE = 121;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProvenanceActivityType <em>Provenance Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProvenanceActivityType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProvenanceActivityType()
	 * @generated
	 */
	int PROVENANCE_ACTIVITY_TYPE = 122;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SecurityRoleType <em>Security Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SecurityRoleType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 123;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ContractSignerTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getContractSignerTypeCodes()
	 * @generated
	 */
	int CONTRACT_SIGNER_TYPE_CODES = 124;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FhirSpecimenCollectionMethod <em>Fhir Specimen Collection Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FhirSpecimenCollectionMethod
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFhirSpecimenCollectionMethod()
	 * @generated
	 */
	int FHIR_SPECIMEN_COLLECTION_METHOD = 125;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20916 <em>V20916</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20916
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20916()
	 * @generated
	 */
	int V20916 = 126;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SpecimenProcessingProcedure <em>Specimen Processing Procedure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SpecimenProcessingProcedure
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSpecimenProcessingProcedure()
	 * @generated
	 */
	int SPECIMEN_PROCESSING_PROCEDURE = 127;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SubstanceCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSubstanceCategoryCodes()
	 * @generated
	 */
	int SUBSTANCE_CATEGORY_CODES = 128;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SubstanceCode <em>Substance Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SubstanceCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSubstanceCode()
	 * @generated
	 */
	int SUBSTANCE_CODE = 129;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20493 <em>V20493</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20493
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20493()
	 * @generated
	 */
	int V20493 = 130;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ParticipantType <em>Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ParticipantType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 131;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctReasonMedicationNotGivenCodes <em>Snomedct Reason Medication Not Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctReasonMedicationNotGivenCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctReasonMedicationNotGivenCodes()
	 * @generated
	 */
	int SNOMEDCT_REASON_MEDICATION_NOT_GIVEN_CODES = 132;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationAdministrationCategoryCodes <em>Medication Administration Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationAdministrationCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationAdministrationCategoryCodes()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_CATEGORY_CODES = 133;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationAdministrationPerformerFunctionCodes <em>Medication Administration Performer Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationAdministrationPerformerFunctionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationAdministrationPerformerFunctionCodes()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_PERFORMER_FUNCTION_CODES = 134;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ReasonMedicationGivenCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getReasonMedicationGivenCodes()
	 * @generated
	 */
	int REASON_MEDICATION_GIVEN_CODES = 135;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationRequestStatusReasonCodes <em>Medication Request Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationRequestStatusReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestStatusReasonCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_STATUS_REASON_CODES = 136;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationRequestCategoryCodes <em>Medication Request Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationRequestCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestCategoryCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_CATEGORY_CODES = 137;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedurePerformerRoleCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedurePerformerRoleCodes()
	 * @generated
	 */
	int PROCEDURE_PERFORMER_ROLE_CODES = 138;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationRequestCourseOfTherapyCodes <em>Medication Request Course Of Therapy Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationRequestCourseOfTherapyCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestCourseOfTherapyCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_COURSE_OF_THERAPY_CODES = 139;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActSubstanceAdminSubstitutionCode <em>V3 Act Substance Admin Substitution Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActSubstanceAdminSubstitutionCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActSubstanceAdminSubstitutionCode()
	 * @generated
	 */
	int V3_ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE = 140;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3SubstanceAdminSubstitutionReason <em>V3 Substance Admin Substitution Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3SubstanceAdminSubstitutionReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3SubstanceAdminSubstitutionReason()
	 * @generated
	 */
	int V3_SUBSTANCE_ADMIN_SUBSTITUTION_REASON = 141;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DetectedIssueCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueCategory()
	 * @generated
	 */
	int DETECTED_ISSUE_CATEGORY = 142;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ManifestationAndSymptomCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getManifestationAndSymptomCodes()
	 * @generated
	 */
	int MANIFESTATION_AND_SYMPTOM_CODES = 143;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DetectedIssueMitigationAction
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueMitigationAction()
	 * @generated
	 */
	int DETECTED_ISSUE_MITIGATION_ACTION = 144;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FhirDeviceTypes <em>Fhir Device Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FhirDeviceTypes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFhirDeviceTypes()
	 * @generated
	 */
	int FHIR_DEVICE_TYPES = 145;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DeviceSafety <em>Device Safety</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DeviceSafety
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDeviceSafety()
	 * @generated
	 */
	int DEVICE_SAFETY = 146;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FhirDeviceStatusReason <em>Fhir Device Status Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FhirDeviceStatusReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFhirDeviceStatusReason()
	 * @generated
	 */
	int FHIR_DEVICE_STATUS_REASON = 147;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DeviceType <em>Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DeviceType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 148;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DataAbsentReason <em>Data Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DataAbsentReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDataAbsentReason()
	 * @generated
	 */
	int DATA_ABSENT_REASON = 149;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObservationInterpretationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObservationInterpretationCodes()
	 * @generated
	 */
	int OBSERVATION_INTERPRETATION_CODES = 150;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DocumentClassValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDocumentClassValueSet()
	 * @generated
	 */
	int DOCUMENT_CLASS_VALUE_SET = 151;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DocumentReferenceFormatCodeSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDocumentReferenceFormatCodeSet()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_FORMAT_CODE_SET = 152;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActCode <em>V3 Act Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActCode()
	 * @generated
	 */
	int V3_ACT_CODE = 153;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FacilityTypeCodeValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFacilityTypeCodeValueSet()
	 * @generated
	 */
	int FACILITY_TYPE_CODE_VALUE_SET = 154;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ClinicalImpressionPrognosis
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getClinicalImpressionPrognosis()
	 * @generated
	 */
	int CLINICAL_IMPRESSION_PROGNOSIS = 155;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.RiskProbability <em>Risk Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.RiskProbability
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getRiskProbability()
	 * @generated
	 */
	int RISK_PROBABILITY = 156;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionStageType <em>Condition Stage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionStageType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionStageType()
	 * @generated
	 */
	int CONDITION_STAGE_TYPE = 157;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DiagnosisRole <em>Diagnosis Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DiagnosisRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDiagnosisRole()
	 * @generated
	 */
	int DIAGNOSIS_ROLE = 158;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AccountTypes <em>Account Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AccountTypes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAccountTypes()
	 * @generated
	 */
	int ACCOUNT_TYPES = 159;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdmitSource <em>Admit Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdmitSource
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdmitSource()
	 * @generated
	 */
	int ADMIT_SOURCE = 160;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V20092 <em>V20092</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V20092
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV20092()
	 * @generated
	 */
	int V20092 = 161;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Diet <em>Diet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Diet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDiet()
	 * @generated
	 */
	int DIET = 162;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SpecialCourtesy <em>Special Courtesy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SpecialCourtesy
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSpecialCourtesy()
	 * @generated
	 */
	int SPECIAL_COURTESY = 163;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SpecialArrangements <em>Special Arrangements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SpecialArrangements
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSpecialArrangements()
	 * @generated
	 */
	int SPECIAL_ARRANGEMENTS = 164;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DischargeDisposition <em>Discharge Disposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DischargeDisposition
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDischargeDisposition()
	 * @generated
	 */
	int DISCHARGE_DISPOSITION = 165;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ListOrderCodes <em>List Order Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ListOrderCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getListOrderCodes()
	 * @generated
	 */
	int LIST_ORDER_CODES = 166;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PatientMedicineChangeTypes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPatientMedicineChangeTypes()
	 * @generated
	 */
	int PATIENT_MEDICINE_CHANGE_TYPES = 167;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ListEmptyReasons
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getListEmptyReasons()
	 * @generated
	 */
	int LIST_EMPTY_REASONS = 168;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ResearchStudyPrimaryPurposeType <em>Research Study Primary Purpose Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ResearchStudyPrimaryPurposeType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getResearchStudyPrimaryPurposeType()
	 * @generated
	 */
	int RESEARCH_STUDY_PRIMARY_PURPOSE_TYPE = 169;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ResearchStudyPhase <em>Research Study Phase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ResearchStudyPhase
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getResearchStudyPhase()
	 * @generated
	 */
	int RESEARCH_STUDY_PHASE = 170;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ResearchStudyReasonStopped <em>Research Study Reason Stopped</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ResearchStudyReasonStopped
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getResearchStudyReasonStopped()
	 * @generated
	 */
	int RESEARCH_STUDY_REASON_STOPPED = 171;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ResearchStudyObjectiveType <em>Research Study Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ResearchStudyObjectiveType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getResearchStudyObjectiveType()
	 * @generated
	 */
	int RESEARCH_STUDY_OBJECTIVE_TYPE = 172;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentScopeCodes <em>Consent Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentScopeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentScopeCodes()
	 * @generated
	 */
	int CONSENT_SCOPE_CODES = 173;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentCategoryCodes()
	 * @generated
	 */
	int CONSENT_CATEGORY_CODES = 174;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentPolicyRuleCodes <em>Consent Policy Rule Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentPolicyRuleCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentPolicyRuleCodes()
	 * @generated
	 */
	int CONSENT_POLICY_RULE_CODES = 175;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentActionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentActionCodes()
	 * @generated
	 */
	int CONSENT_ACTION_CODES = 176;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConsentContentCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConsentContentCodes()
	 * @generated
	 */
	int CONSENT_CONTENT_CODES = 177;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ChargeItemCode <em>Charge Item Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ChargeItemCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getChargeItemCode()
	 * @generated
	 */
	int CHARGE_ITEM_CODE = 178;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctFormCodes <em>Snomedct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctFormCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctFormCodes()
	 * @generated
	 */
	int SNOMEDCT_FORM_CODES = 179;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.IcD10Codes <em>Ic D10 Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.IcD10Codes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getIcD10Codes()
	 * @generated
	 */
	int IC_D10_CODES = 180;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DiagnosticServiceSectionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDiagnosticServiceSectionCodes()
	 * @generated
	 */
	int DIAGNOSTIC_SERVICE_SECTION_CODES = 181;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.LoincDiagnosticReportCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getLoincDiagnosticReportCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_REPORT_CODES = 182;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AcquisitionModality <em>Acquisition Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AcquisitionModality
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAcquisitionModality()
	 * @generated
	 */
	int ACQUISITION_MODALITY = 183;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureNotPerformedReasonSnomeDCT <em>Procedure Not Performed Reason Snome DCT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureNotPerformedReasonSnomeDCT
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureNotPerformedReasonSnomeDCT()
	 * @generated
	 */
	int PROCEDURE_NOT_PERFORMED_REASON_SNOME_DCT = 184;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureCategoryCodesSnomedcT <em>Procedure Category Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureCategoryCodesSnomedcT
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureCategoryCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_CATEGORY_CODES_SNOMEDC_T = 185;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureOutcomeCodesSnomedcT <em>Procedure Outcome Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureOutcomeCodesSnomedcT
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureOutcomeCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_OUTCOME_CODES_SNOMEDC_T = 186;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureFollowUpCodesSnomedcT <em>Procedure Follow Up Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureFollowUpCodesSnomedcT
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureFollowUpCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_FOLLOW_UP_CODES_SNOMEDC_T = 187;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcedureDeviceActionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcedureDeviceActionCodes()
	 * @generated
	 */
	int PROCEDURE_DEVICE_ACTION_CODES = 188;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Laterality <em>Laterality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Laterality
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getLaterality()
	 * @generated
	 */
	int LATERALITY = 189;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImagingStudySeriesPerformerFunction <em>Imaging Study Series Performer Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImagingStudySeriesPerformerFunction
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImagingStudySeriesPerformerFunction()
	 * @generated
	 */
	int IMAGING_STUDY_SERIES_PERFORMER_FUNCTION = 190;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MediaType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 191;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MediaModality <em>Media Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MediaModality
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMediaModality()
	 * @generated
	 */
	int MEDIA_MODALITY = 192;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MediaCollectionViewProjection
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMediaCollectionViewProjection()
	 * @generated
	 */
	int MEDIA_COLLECTION_VIEW_PROJECTION = 193;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CommunicationNotDoneReason <em>Communication Not Done Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CommunicationNotDoneReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCommunicationNotDoneReason()
	 * @generated
	 */
	int COMMUNICATION_NOT_DONE_REASON = 194;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CommunicationCategory <em>Communication Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CommunicationCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCommunicationCategory()
	 * @generated
	 */
	int COMMUNICATION_CATEGORY = 195;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ParticipationMode <em>V3 Participation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ParticipationMode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ParticipationMode()
	 * @generated
	 */
	int V3_PARTICIPATION_MODE = 196;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CommunicationTopic <em>Communication Topic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CommunicationTopic
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCommunicationTopic()
	 * @generated
	 */
	int COMMUNICATION_TOPIC = 197;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ClaimTypeCodes <em>Claim Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ClaimTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getClaimTypeCodes()
	 * @generated
	 */
	int CLAIM_TYPE_CODES = 198;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleClaimSubTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleClaimSubTypeCodes()
	 * @generated
	 */
	int EXAMPLE_CLAIM_SUB_TYPE_CODES = 199;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProcessPriorityCodes <em>Process Priority Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProcessPriorityCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProcessPriorityCodes()
	 * @generated
	 */
	int PROCESS_PRIORITY_CODES = 200;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FundsReservationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFundsReservationCodes()
	 * @generated
	 */
	int FUNDS_RESERVATION_CODES = 201;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleRelatedClaimRelationshipCodes()
	 * @generated
	 */
	int EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES = 202;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ClaimPayeeTypeCodes <em>Claim Payee Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ClaimPayeeTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getClaimPayeeTypeCodes()
	 * @generated
	 */
	int CLAIM_PAYEE_TYPE_CODES = 203;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ClaimCareTeamRoleCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getClaimCareTeamRoleCodes()
	 * @generated
	 */
	int CLAIM_CARE_TEAM_ROLE_CODES = 204;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleProviderQualificationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleProviderQualificationCodes()
	 * @generated
	 */
	int EXAMPLE_PROVIDER_QUALIFICATION_CODES = 205;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ClaimInformationCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getClaimInformationCategoryCodes()
	 * @generated
	 */
	int CLAIM_INFORMATION_CATEGORY_CODES = 206;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExceptionCodes <em>Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExceptionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExceptionCodes()
	 * @generated
	 */
	int EXCEPTION_CODES = 207;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MissingToothReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMissingToothReasonCodes()
	 * @generated
	 */
	int MISSING_TOOTH_REASON_CODES = 208;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleDiagnosisTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisTypeCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_TYPE_CODES = 209;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleDiagnosisOnAdmissionCodes <em>Example Diagnosis On Admission Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleDiagnosisOnAdmissionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisOnAdmissionCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_ON_ADMISSION_CODES = 210;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisRelatedGroupCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES = 211;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleProcedureTypeCodes <em>Example Procedure Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleProcedureTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleProcedureTypeCodes()
	 * @generated
	 */
	int EXAMPLE_PROCEDURE_TYPE_CODES = 212;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.IcD10ProcedureCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getIcD10ProcedureCodes()
	 * @generated
	 */
	int IC_D10_PROCEDURE_CODES = 213;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActIncidentCode <em>V3 Act Incident Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActIncidentCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActIncidentCode()
	 * @generated
	 */
	int V3_ACT_INCIDENT_CODE = 214;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleRevenueCenterCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleRevenueCenterCodes()
	 * @generated
	 */
	int EXAMPLE_REVENUE_CENTER_CODES = 215;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.BenefitCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getBenefitCategoryCodes()
	 * @generated
	 */
	int BENEFIT_CATEGORY_CODES = 216;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.UsclsCodes <em>Uscls Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.UsclsCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getUsclsCodes()
	 * @generated
	 */
	int USCLS_CODES = 217;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ModifierTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getModifierTypeCodes()
	 * @generated
	 */
	int MODIFIER_TYPE_CODES = 218;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleProgramReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleProgramReasonCodes()
	 * @generated
	 */
	int EXAMPLE_PROGRAM_REASON_CODES = 219;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleServicePlaceCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleServicePlaceCodes()
	 * @generated
	 */
	int EXAMPLE_SERVICE_PLACE_CODES = 220;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.OralSiteCodes <em>Oral Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.OralSiteCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getOralSiteCodes()
	 * @generated
	 */
	int ORAL_SITE_CODES = 221;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SurfaceCodes <em>Surface Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SurfaceCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSurfaceCodes()
	 * @generated
	 */
	int SURFACE_CODES = 222;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdjudicationValueCodes <em>Adjudication Value Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdjudicationValueCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdjudicationValueCodes()
	 * @generated
	 */
	int ADJUDICATION_VALUE_CODES = 223;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdjudicationReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdjudicationReasonCodes()
	 * @generated
	 */
	int ADJUDICATION_REASON_CODES = 224;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExamplePaymentTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExamplePaymentTypeCodes()
	 * @generated
	 */
	int EXAMPLE_PAYMENT_TYPE_CODES = 225;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PaymentAdjustmentReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPaymentAdjustmentReasonCodes()
	 * @generated
	 */
	int PAYMENT_ADJUSTMENT_REASON_CODES = 226;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FormCodes <em>Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FormCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFormCodes()
	 * @generated
	 */
	int FORM_CODES = 227;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActReason <em>V3 Act Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActReason()
	 * @generated
	 */
	int V3_ACT_REASON = 228;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdjudicationErrorCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdjudicationErrorCodes()
	 * @generated
	 */
	int ADJUDICATION_ERROR_CODES = 229;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ServiceProvisionConditions
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getServiceProvisionConditions()
	 * @generated
	 */
	int SERVICE_PROVISION_CONDITIONS = 230;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Program <em>Program</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Program
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 231;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ReferralMethod <em>Referral Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ReferralMethod
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getReferralMethod()
	 * @generated
	 */
	int REFERRAL_METHOD = 232;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctMorphologicAbnormalities <em>Snomedct Morphologic Abnormalities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctMorphologicAbnormalities
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctMorphologicAbnormalities()
	 * @generated
	 */
	int SNOMEDCT_MORPHOLOGIC_ABNORMALITIES = 233;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.BodystructureLocationQualifier <em>Bodystructure Location Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.BodystructureLocationQualifier
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getBodystructureLocationQualifier()
	 * @generated
	 */
	int BODYSTRUCTURE_LOCATION_QUALIFIER = 234;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TaskCode <em>Task Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TaskCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTaskCode()
	 * @generated
	 */
	int TASK_CODE = 235;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.QuestionnaireQuestionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireQuestionCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_QUESTION_CODES = 236;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.QuestionnaireAnswerCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireAnswerCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_ANSWER_CODES = 237;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.NetworkTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getNetworkTypeCodes()
	 * @generated
	 */
	int NETWORK_TYPE_CODES = 238;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.UnitTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getUnitTypeCodes()
	 * @generated
	 */
	int UNIT_TYPE_CODES = 239;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.BenefitTermCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getBenefitTermCodes()
	 * @generated
	 */
	int BENEFIT_TERM_CODES = 240;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.BenefitTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getBenefitTypeCodes()
	 * @generated
	 */
	int BENEFIT_TYPE_CODES = 241;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.VitalSigns <em>Vital Signs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.VitalSigns
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getVitalSigns()
	 * @generated
	 */
	int VITAL_SIGNS = 242;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DeviceMetricAndComponentTypes <em>Device Metric And Component Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DeviceMetricAndComponentTypes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricAndComponentTypes()
	 * @generated
	 */
	int DEVICE_METRIC_AND_COMPONENT_TYPES = 243;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FlagCategory <em>Flag Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FlagCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFlagCategory()
	 * @generated
	 */
	int FLAG_CATEGORY = 244;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FlagCode <em>Flag Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FlagCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFlagCode()
	 * @generated
	 */
	int FLAG_CODE = 245;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationEvaluationTargetDiseaseCodes <em>Immunization Evaluation Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationEvaluationTargetDiseaseCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_TARGET_DISEASE_CODES = 246;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationStatusReasonCodes <em>Immunization Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationStatusReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationStatusReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_STATUS_REASON_CODES = 247;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.VaccineAdministeredValueSet
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getVaccineAdministeredValueSet()
	 * @generated
	 */
	int VACCINE_ADMINISTERED_VALUE_SET = 248;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationOriginCodes <em>Immunization Origin Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationOriginCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationOriginCodes()
	 * @generated
	 */
	int IMMUNIZATION_ORIGIN_CODES = 249;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CodesForImmunizationSiteOfAdministration
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCodesForImmunizationSiteOfAdministration()
	 * @generated
	 */
	int CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION = 250;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationRouteCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationRouteCodes()
	 * @generated
	 */
	int IMMUNIZATION_ROUTE_CODES = 251;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationFunctionCodes <em>Immunization Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationFunctionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationFunctionCodes()
	 * @generated
	 */
	int IMMUNIZATION_FUNCTION_CODES = 252;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASON_CODES = 253;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationSubpotentReason <em>Immunization Subpotent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationSubpotentReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationSubpotentReason()
	 * @generated
	 */
	int IMMUNIZATION_SUBPOTENT_REASON = 254;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationProgramEligibility <em>Immunization Program Eligibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationProgramEligibility
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationProgramEligibility()
	 * @generated
	 */
	int IMMUNIZATION_PROGRAM_ELIGIBILITY = 255;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationFundingSource <em>Immunization Funding Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationFundingSource
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationFundingSource()
	 * @generated
	 */
	int IMMUNIZATION_FUNDING_SOURCE = 256;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationTargetDiseaseCodes <em>Immunization Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationTargetDiseaseCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_TARGET_DISEASE_CODES = 257;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationEvaluationDoseStatusCodes <em>Immunization Evaluation Dose Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationEvaluationDoseStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationDoseStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_DOSE_STATUS_CODES = 258;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationEvaluationDoseStatusReasonCodes <em>Immunization Evaluation Dose Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationEvaluationDoseStatusReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationDoseStatusReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_DOSE_STATUS_REASON_CODES = 259;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.OperationOutcomeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getOperationOutcomeCodes()
	 * @generated
	 */
	int OPERATION_OUTCOME_CODES = 260;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PaymentTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPaymentTypeCodes()
	 * @generated
	 */
	int PAYMENT_TYPE_CODES = 261;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PractitionerRole <em>Practitioner Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PractitionerRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPractitionerRole()
	 * @generated
	 */
	int PRACTITIONER_ROLE = 262;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FamilyHistoryAbsentReason <em>Family History Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FamilyHistoryAbsentReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFamilyHistoryAbsentReason()
	 * @generated
	 */
	int FAMILY_HISTORY_ABSENT_REASON = 263;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3FamilyMember <em>V3 Family Member</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3FamilyMember
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3FamilyMember()
	 * @generated
	 */
	int V3_FAMILY_MEMBER = 264;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ConditionOutcomeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getConditionOutcomeCodes()
	 * @generated
	 */
	int CONDITION_OUTCOME_CODES = 265;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.OrganizationAffiliationRole <em>Organization Affiliation Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.OrganizationAffiliationRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getOrganizationAffiliationRole()
	 * @generated
	 */
	int ORGANIZATION_AFFILIATION_ROLE = 266;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdverseEventCategory <em>Adverse Event Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdverseEventCategory
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCategory()
	 * @generated
	 */
	int ADVERSE_EVENT_CATEGORY = 267;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctClinicalFindingsA <em>Snomedct Clinical Findings A</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctClinicalFindingsA
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctClinicalFindingsA()
	 * @generated
	 */
	int SNOMEDCT_CLINICAL_FINDINGS_A = 268;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdverseEventSeriousness <em>Adverse Event Seriousness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdverseEventSeriousness
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdverseEventSeriousness()
	 * @generated
	 */
	int ADVERSE_EVENT_SERIOUSNESS = 269;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdverseEventCausalityAssessment <em>Adverse Event Causality Assessment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdverseEventCausalityAssessment
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCausalityAssessment()
	 * @generated
	 */
	int ADVERSE_EVENT_CAUSALITY_ASSESSMENT = 270;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AdverseEventCausalityMethod <em>Adverse Event Causality Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AdverseEventCausalityMethod
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCausalityMethod()
	 * @generated
	 */
	int ADVERSE_EVENT_CAUSALITY_METHOD = 271;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SynthesisType <em>Synthesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SynthesisType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSynthesisType()
	 * @generated
	 */
	int SYNTHESIS_TYPE = 272;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.StudyType <em>Study Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.StudyType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getStudyType()
	 * @generated
	 */
	int STUDY_TYPE = 273;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.RiskEstimateType <em>Risk Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.RiskEstimateType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getRiskEstimateType()
	 * @generated
	 */
	int RISK_ESTIMATE_TYPE = 274;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PrecisionEstimateType <em>Precision Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PrecisionEstimateType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPrecisionEstimateType()
	 * @generated
	 */
	int PRECISION_ESTIMATE_TYPE = 275;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.QualityOfEvidenceRating <em>Quality Of Evidence Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.QualityOfEvidenceRating
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getQualityOfEvidenceRating()
	 * @generated
	 */
	int QUALITY_OF_EVIDENCE_RATING = 276;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CertaintySubcomponentType <em>Certainty Subcomponent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CertaintySubcomponentType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCertaintySubcomponentType()
	 * @generated
	 */
	int CERTAINTY_SUBCOMPONENT_TYPE = 277;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CertaintySubcomponentRating <em>Certainty Subcomponent Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CertaintySubcomponentRating
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCertaintySubcomponentRating()
	 * @generated
	 */
	int CERTAINTY_SUBCOMPONENT_RATING = 278;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TestScriptProfileOriginType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileOriginType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_ORIGIN_TYPE = 279;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TestScriptProfileDestinationType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileDestinationType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_DESTINATION_TYPE = 280;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.RestfulSecurityService <em>Restful Security Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.RestfulSecurityService
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getRestfulSecurityService()
	 * @generated
	 */
	int RESTFUL_SECURITY_SERVICE = 281;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MessageTransport <em>Message Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MessageTransport
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMessageTransport()
	 * @generated
	 */
	int MESSAGE_TRANSPORT = 282;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MessageEvent <em>Message Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MessageEvent
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 283;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TestScriptOperationCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTestScriptOperationCode()
	 * @generated
	 */
	int TEST_SCRIPT_OPERATION_CODE = 284;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleMessageReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleMessageReasonCodes()
	 * @generated
	 */
	int EXAMPLE_MESSAGE_REASON_CODES = 285;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.PaymentStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPaymentStatusCodes()
	 * @generated
	 */
	int PAYMENT_STATUS_CODES = 286;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FhirDocumentTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFhirDocumentTypeCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_TYPE_CODES = 287;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DocumentSectionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDocumentSectionCodes()
	 * @generated
	 */
	int DOCUMENT_SECTION_CODES = 288;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SupplyType <em>Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SupplyType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSupplyType()
	 * @generated
	 */
	int SUPPLY_TYPE = 289;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctSupplyItem <em>Snomedct Supply Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctSupplyItem
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctSupplyItem()
	 * @generated
	 */
	int SNOMEDCT_SUPPLY_ITEM = 290;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SupplyRequestReason
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSupplyRequestReason()
	 * @generated
	 */
	int SUPPLY_REQUEST_REASON = 291;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EvidenceVariantState <em>Evidence Variant State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EvidenceVariantState
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEvidenceVariantState()
	 * @generated
	 */
	int EVIDENCE_VARIANT_STATE = 292;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EffectEstimateType <em>Effect Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EffectEstimateType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEffectEstimateType()
	 * @generated
	 */
	int EFFECT_ESTIMATE_TYPE = 293;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.InsurancePlanType <em>Insurance Plan Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.InsurancePlanType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getInsurancePlanType()
	 * @generated
	 */
	int INSURANCE_PLAN_TYPE = 294;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ProvenanceHistoryRecordActivityCodes <em>Provenance History Record Activity Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ProvenanceHistoryRecordActivityCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getProvenanceHistoryRecordActivityCodes()
	 * @generated
	 */
	int PROVENANCE_HISTORY_RECORD_ACTIVITY_CODES = 295;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Chromosomehuman <em>Chromosomehuman</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Chromosomehuman
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getChromosomehuman()
	 * @generated
	 */
	int CHROMOSOMEHUMAN = 296;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Ensembl <em>Ensembl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Ensembl
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEnsembl()
	 * @generated
	 */
	int ENSEMBL = 297;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FdAStandardSequence <em>Fd AStandard Sequence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FdAStandardSequence
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFdAStandardSequence()
	 * @generated
	 */
	int FD_ASTANDARD_SEQUENCE = 298;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FdAMethod <em>Fd AMethod</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FdAMethod
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFdAMethod()
	 * @generated
	 */
	int FD_AMETHOD = 299;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceSubstanceProductConditionAndNegationCodes()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES = 300;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CatalogType <em>Catalog Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CatalogType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCatalogType()
	 * @generated
	 */
	int CATALOG_TYPE = 301;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationRecommendationTargetDiseaseCodes <em>Immunization Recommendation Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationRecommendationTargetDiseaseCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_TARGET_DISEASE_CODES = 302;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationRecommendationStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_STATUS_CODES = 303;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationRecommendationReasonCodes <em>Immunization Recommendation Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationRecommendationReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_REASON_CODES = 304;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationDateCriterionCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES = 305;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Need <em>Need</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Need
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 306;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Validationtype <em>Validationtype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Validationtype
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getValidationtype()
	 * @generated
	 */
	int VALIDATIONTYPE = 307;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Validationprocess <em>Validationprocess</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Validationprocess
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getValidationprocess()
	 * @generated
	 */
	int VALIDATIONPROCESS = 308;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Failureaction <em>Failureaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Failureaction
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFailureaction()
	 * @generated
	 */
	int FAILUREACTION = 309;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Primarysourcetype <em>Primarysourcetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Primarysourcetype
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPrimarysourcetype()
	 * @generated
	 */
	int PRIMARYSOURCETYPE = 310;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Verificationresultcommunicationmethod <em>Verificationresultcommunicationmethod</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Verificationresultcommunicationmethod
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getVerificationresultcommunicationmethod()
	 * @generated
	 */
	int VERIFICATIONRESULTCOMMUNICATIONMETHOD = 311;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Validationstatus <em>Validationstatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Validationstatus
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getValidationstatus()
	 * @generated
	 */
	int VALIDATIONSTATUS = 312;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Canpushupdates <em>Canpushupdates</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Canpushupdates
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCanpushupdates()
	 * @generated
	 */
	int CANPUSHUPDATES = 313;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.Pushtypeavailable <em>Pushtypeavailable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.Pushtypeavailable
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getPushtypeavailable()
	 * @generated
	 */
	int PUSHTYPEAVAILABLE = 314;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FoodTypeCodes <em>Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FoodTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFoodTypeCodes()
	 * @generated
	 */
	int FOOD_TYPE_CODES = 315;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.DietCodes <em>Diet Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.DietCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getDietCodes()
	 * @generated
	 */
	int DIET_CODES = 316;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.NutrientModifierCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getNutrientModifierCodes()
	 * @generated
	 */
	int NUTRIENT_MODIFIER_CODES = 317;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TextureModifierCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTextureModifierCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIER_CODES = 318;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.TextureModifiedFoodTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getTextureModifiedFoodTypeCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIED_FOOD_TYPE_CODES = 319;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.FluidConsistencyTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getFluidConsistencyTypeCodes()
	 * @generated
	 */
	int FLUID_CONSISTENCY_TYPE_CODES = 320;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SupplementTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSupplementTypeCodes()
	 * @generated
	 */
	int SUPPLEMENT_TYPE_CODES = 321;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EnteralFormulaTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaTypeCodes()
	 * @generated
	 */
	int ENTERAL_FORMULA_TYPE_CODES = 322;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EnteralFormulaAdditiveTypeCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaAdditiveTypeCode()
	 * @generated
	 */
	int ENTERAL_FORMULA_ADDITIVE_TYPE_CODE = 323;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.EnteralRouteCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getEnteralRouteCodes()
	 * @generated
	 */
	int ENTERAL_ROUTE_CODES = 324;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.SnomedctDrugTherapyStatusCodes <em>Snomedct Drug Therapy Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.SnomedctDrugTherapyStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getSnomedctDrugTherapyStatusCodes()
	 * @generated
	 */
	int SNOMEDCT_DRUG_THERAPY_STATUS_CODES = 325;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationStatusCodes <em>Medication Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationStatusCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationStatusCodes()
	 * @generated
	 */
	int MEDICATION_STATUS_CODES = 326;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AuditEventId <em>Audit Event Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AuditEventId
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAuditEventId()
	 * @generated
	 */
	int AUDIT_EVENT_ID = 327;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AuditEventSubType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAuditEventSubType()
	 * @generated
	 */
	int AUDIT_EVENT_SUB_TYPE = 328;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ParticipationRoleType <em>Participation Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ParticipationRoleType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getParticipationRoleType()
	 * @generated
	 */
	int PARTICIPATION_ROLE_TYPE = 329;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MediaTypeCode <em>Media Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MediaTypeCode
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMediaTypeCode()
	 * @generated
	 */
	int MEDIA_TYPE_CODE = 330;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AuditEventSourceType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAuditEventSourceType()
	 * @generated
	 */
	int AUDIT_EVENT_SOURCE_TYPE = 331;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AuditEventEntityType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityType()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_TYPE = 332;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.AuditEventEntityRole
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityRole()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_ROLE = 333;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ObjectLifecycleEvents <em>Object Lifecycle Events</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ObjectLifecycleEvents
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getObjectLifecycleEvents()
	 * @generated
	 */
	int OBJECT_LIFECYCLE_EVENTS = 334;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.BasicResourceTypes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getBasicResourceTypes()
	 * @generated
	 */
	int BASIC_RESOURCE_TYPES = 335;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.ExampleVisionPrescriptionProductCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getExampleVisionPrescriptionProductCodes()
	 * @generated
	 */
	int EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES = 336;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationDispenseStatusReasonCodes <em>Medication Dispense Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationDispenseStatusReasonCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationDispenseStatusReasonCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_STATUS_REASON_CODES = 337;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationDispenseCategoryCodes <em>Medication Dispense Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationDispenseCategoryCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationDispenseCategoryCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_CATEGORY_CODES = 338;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationDispensePerformerFunctionCodes <em>Medication Dispense Performer Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationDispensePerformerFunctionCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationDispensePerformerFunctionCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_PERFORMER_FUNCTION_CODES = 339;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.V3ActPharmacySupplyType <em>V3 Act Pharmacy Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.V3ActPharmacySupplyType
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getV3ActPharmacySupplyType()
	 * @generated
	 */
	int V3_ACT_PHARMACY_SUPPLY_TYPE = 340;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationKnowledgePackageTypeCodes <em>Medication Knowledge Package Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationKnowledgePackageTypeCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationKnowledgePackageTypeCodes()
	 * @generated
	 */
	int MEDICATION_KNOWLEDGE_PACKAGE_TYPE_CODES = 341;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.MedicationKnowledgeCharacteristicCodes <em>Medication Knowledge Characteristic Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.MedicationKnowledgeCharacteristicCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getMedicationKnowledgeCharacteristicCodes()
	 * @generated
	 */
	int MEDICATION_KNOWLEDGE_CHARACTERISTIC_CODES = 342;

	/**
	 * The meta object id for the '{@link fhiRCore.valueSets.CoverageEligibilityResponseAuthSupportCodes <em>Coverage Eligibility Response Auth Support Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.valueSets.CoverageEligibilityResponseAuthSupportCodes
	 * @see fhiRCore.valueSets.impl.ValueSetsPackageImpl#getCoverageEligibilityResponseAuthSupportCodes()
	 * @generated
	 */
	int COVERAGE_ELIGIBILITY_RESPONSE_AUTH_SUPPORT_CODES = 343;


	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see fhiRCore.valueSets.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see fhiRCore.valueSets.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type Codes</em>'.
	 * @see fhiRCore.valueSets.IdentifierTypeCodes
	 * @generated
	 */
	EEnum getIdentifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.UsageContextType <em>Usage Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Context Type</em>'.
	 * @see fhiRCore.valueSets.UsageContextType
	 * @generated
	 */
	EEnum getUsageContextType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Of Use Value Set</em>'.
	 * @see fhiRCore.valueSets.ContextOfUseValueSet
	 * @generated
	 */
	EEnum getContextOfUseValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jurisdiction Value Set</em>'.
	 * @see fhiRCore.valueSets.JurisdictionValueSet
	 * @generated
	 */
	EEnum getJurisdictionValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DefinitionUseCodes <em>Definition Use Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Use Codes</em>'.
	 * @see fhiRCore.valueSets.DefinitionUseCodes
	 * @generated
	 */
	EEnum getDefinitionUseCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Defined Type</em>'.
	 * @see fhiRCore.valueSets.FhirDefinedType
	 * @generated
	 */
	EEnum getFhirDefinedType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.LoincCodes <em>Loinc Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Codes</em>'.
	 * @see fhiRCore.valueSets.LoincCodes
	 * @generated
	 */
	EEnum getLoincCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CommonLanguages <em>Common Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Languages</em>'.
	 * @see fhiRCore.valueSets.CommonLanguages
	 * @generated
	 */
	EEnum getCommonLanguages();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signature Type Codes</em>'.
	 * @see fhiRCore.valueSets.SignatureTypeCodes
	 * @generated
	 */
	EEnum getSignatureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V2036027 <em>V2036027</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2036027</em>'.
	 * @see fhiRCore.valueSets.V2036027
	 * @generated
	 */
	EEnum getV2036027();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Abbreviation</em>'.
	 * @see fhiRCore.valueSets.TimingAbbreviation
	 * @generated
	 */
	EEnum getTimingAbbreviation();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subject Type</em>'.
	 * @see fhiRCore.valueSets.SubjectType
	 * @generated
	 */
	EEnum getSubjectType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DesignationUse <em>Designation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Designation Use</em>'.
	 * @see fhiRCore.valueSets.DesignationUse
	 * @generated
	 */
	EEnum getDesignationUse();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Language</em>'.
	 * @see fhiRCore.valueSets.ExpressionLanguage
	 * @generated
	 */
	EEnum getExpressionLanguage();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctAdditionalDosageInstructions <em>Snomedct Additional Dosage Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Additional Dosage Instructions</em>'.
	 * @see fhiRCore.valueSets.SnomedctAdditionalDosageInstructions
	 * @generated
	 */
	EEnum getSnomedctAdditionalDosageInstructions();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctMedicationAsNeededReasonCodes <em>Snomedct Medication As Needed Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Medication As Needed Reason Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctMedicationAsNeededReasonCodes
	 * @generated
	 */
	EEnum getSnomedctMedicationAsNeededReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes <em>Snomedct Anatomical Structure For Administration Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Anatomical Structure For Administration Site Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes
	 * @generated
	 */
	EEnum getSnomedctAnatomicalStructureForAdministrationSiteCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctRouteCodes <em>Snomedct Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Route Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctRouteCodes
	 * @generated
	 */
	EEnum getSnomedctRouteCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctAdministrationMethodCodes <em>Snomedct Administration Method Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Administration Method Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctAdministrationMethodCodes
	 * @generated
	 */
	EEnum getSnomedctAdministrationMethodCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DoseAndRateType <em>Dose And Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dose And Rate Type</em>'.
	 * @see fhiRCore.valueSets.DoseAndRateType
	 * @generated
	 */
	EEnum getDoseAndRateType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AllSecurityLabels <em>All Security Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Security Labels</em>'.
	 * @see fhiRCore.valueSets.AllSecurityLabels
	 * @generated
	 */
	EEnum getAllSecurityLabels();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CommonTags <em>Common Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Tags</em>'.
	 * @see fhiRCore.valueSets.CommonTags
	 * @generated
	 */
	EEnum getCommonTags();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Type</em>'.
	 * @see fhiRCore.valueSets.OrganizationType
	 * @generated
	 */
	EEnum getOrganizationType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContactEntityType <em>Contact Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Entity Type</em>'.
	 * @see fhiRCore.valueSets.ContactEntityType
	 * @generated
	 */
	EEnum getContactEntityType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Connection Type</em>'.
	 * @see fhiRCore.valueSets.EndpointConnectionType
	 * @generated
	 */
	EEnum getEndpointConnectionType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Payload Type</em>'.
	 * @see fhiRCore.valueSets.EndpointPayloadType
	 * @generated
	 */
	EEnum getEndpointPayloadType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library Type</em>'.
	 * @see fhiRCore.valueSets.LibraryType
	 * @generated
	 */
	EEnum getLibraryType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DefinitionTopic <em>Definition Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Topic</em>'.
	 * @see fhiRCore.valueSets.DefinitionTopic
	 * @generated
	 */
	EEnum getDefinitionTopic();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MeasureScoring <em>Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Scoring</em>'.
	 * @see fhiRCore.valueSets.MeasureScoring
	 * @generated
	 */
	EEnum getMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Measure Scoring</em>'.
	 * @see fhiRCore.valueSets.CompositeMeasureScoring
	 * @generated
	 */
	EEnum getCompositeMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Type</em>'.
	 * @see fhiRCore.valueSets.MeasureType
	 * @generated
	 */
	EEnum getMeasureType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MeasurePopulationType <em>Measure Population Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Population Type</em>'.
	 * @see fhiRCore.valueSets.MeasurePopulationType
	 * @generated
	 */
	EEnum getMeasurePopulationType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Data Usage</em>'.
	 * @see fhiRCore.valueSets.MeasureDataUsage
	 * @generated
	 */
	EEnum getMeasureDataUsage();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marital Status Codes</em>'.
	 * @see fhiRCore.valueSets.MaritalStatusCodes
	 * @generated
	 */
	EEnum getMaritalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PatientContactRelationship <em>Patient Contact Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Contact Relationship</em>'.
	 * @see fhiRCore.valueSets.PatientContactRelationship
	 * @generated
	 */
	EEnum getPatientContactRelationship();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Use Codes For List</em>'.
	 * @see fhiRCore.valueSets.ExampleUseCodesForList
	 * @generated
	 */
	EEnum getExampleUseCodesForList();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActEncounterCode <em>V3 Act Encounter Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Encounter Code</em>'.
	 * @see fhiRCore.valueSets.V3ActEncounterCode
	 * @generated
	 */
	EEnum getV3ActEncounterCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EncounterType <em>Encounter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Type</em>'.
	 * @see fhiRCore.valueSets.EncounterType
	 * @generated
	 */
	EEnum getEncounterType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see fhiRCore.valueSets.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActPriority <em>V3 Act Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Priority</em>'.
	 * @see fhiRCore.valueSets.V3ActPriority
	 * @generated
	 */
	EEnum getV3ActPriority();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EpisodeOfCareType <em>Episode Of Care Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Episode Of Care Type</em>'.
	 * @see fhiRCore.valueSets.EpisodeOfCareType
	 * @generated
	 */
	EEnum getEpisodeOfCareType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Category Codes</em>'.
	 * @see fhiRCore.valueSets.ConditionCategoryCodes
	 * @generated
	 */
	EEnum getConditionCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Diagnosis Severity</em>'.
	 * @see fhiRCore.valueSets.ConditionDiagnosisSeverity
	 * @generated
	 */
	EEnum getConditionDiagnosisSeverity();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Problem Diagnosis Codes</em>'.
	 * @see fhiRCore.valueSets.ConditionProblemDiagnosisCodes
	 * @generated
	 */
	EEnum getConditionProblemDiagnosisCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctBodyStructures <em>Snomedct Body Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Body Structures</em>'.
	 * @see fhiRCore.valueSets.SnomedctBodyStructures
	 * @generated
	 */
	EEnum getSnomedctBodyStructures();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage</em>'.
	 * @see fhiRCore.valueSets.ConditionStage
	 * @generated
	 */
	EEnum getConditionStage();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.InvestigationType <em>Investigation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Investigation Type</em>'.
	 * @see fhiRCore.valueSets.InvestigationType
	 * @generated
	 */
	EEnum getInvestigationType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Definition Type</em>'.
	 * @see fhiRCore.valueSets.PlanDefinitionType
	 * @generated
	 */
	EEnum getPlanDefinitionType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.GoalCategory <em>Goal Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Category</em>'.
	 * @see fhiRCore.valueSets.GoalCategory
	 * @generated
	 */
	EEnum getGoalCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctClinicalFindings <em>Snomedct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Clinical Findings</em>'.
	 * @see fhiRCore.valueSets.SnomedctClinicalFindings
	 * @generated
	 */
	EEnum getSnomedctClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.GoalPriority <em>Goal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Priority</em>'.
	 * @see fhiRCore.valueSets.GoalPriority
	 * @generated
	 */
	EEnum getGoalPriority();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.GoalStartEvent <em>Goal Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Start Event</em>'.
	 * @see fhiRCore.valueSets.GoalStartEvent
	 * @generated
	 */
	EEnum getGoalStartEvent();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ActionParticipantRole <em>Action Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Participant Role</em>'.
	 * @see fhiRCore.valueSets.ActionParticipantRole
	 * @generated
	 */
	EEnum getActionParticipantRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see fhiRCore.valueSets.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CarePlanCategory <em>Care Plan Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Category</em>'.
	 * @see fhiRCore.valueSets.CarePlanCategory
	 * @generated
	 */
	EEnum getCarePlanCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CareTeamCategory <em>Care Team Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Team Category</em>'.
	 * @see fhiRCore.valueSets.CareTeamCategory
	 * @generated
	 */
	EEnum getCareTeamCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ParticipantRoles <em>Participant Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Roles</em>'.
	 * @see fhiRCore.valueSets.ParticipantRoles
	 * @generated
	 */
	EEnum getParticipantRoles();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.GoalAchievementStatus <em>Goal Achievement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Achievement Status</em>'.
	 * @see fhiRCore.valueSets.GoalAchievementStatus
	 * @generated
	 */
	EEnum getGoalAchievementStatus();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CarePlanActivityOutcome <em>Care Plan Activity Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Outcome</em>'.
	 * @see fhiRCore.valueSets.CarePlanActivityOutcome
	 * @generated
	 */
	EEnum getCarePlanActivityOutcome();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AppointmentCancellationReason <em>Appointment Cancellation Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Cancellation Reason</em>'.
	 * @see fhiRCore.valueSets.AppointmentCancellationReason
	 * @generated
	 */
	EEnum getAppointmentCancellationReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Category</em>'.
	 * @see fhiRCore.valueSets.ServiceCategory
	 * @generated
	 */
	EEnum getServiceCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practice Setting Code Value Set</em>'.
	 * @see fhiRCore.valueSets.PracticeSettingCodeValueSet
	 * @generated
	 */
	EEnum getPracticeSettingCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20276 <em>V20276</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20276</em>'.
	 * @see fhiRCore.valueSets.V20276
	 * @generated
	 */
	EEnum getV20276();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Reason Codes</em>'.
	 * @see fhiRCore.valueSets.EncounterReasonCodes
	 * @generated
	 */
	EEnum getEncounterReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureCodesSnomedcT <em>Procedure Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Codes Snomedc T</em>'.
	 * @see fhiRCore.valueSets.ProcedureCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20116 <em>V20116</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20116</em>'.
	 * @see fhiRCore.valueSets.V20116
	 * @generated
	 */
	EEnum getV20116();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ServiceDeliveryLocationRoleType <em>V3 Service Delivery Location Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Service Delivery Location Role Type</em>'.
	 * @see fhiRCore.valueSets.V3ServiceDeliveryLocationRoleType
	 * @generated
	 */
	EEnum getV3ServiceDeliveryLocationRoleType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see fhiRCore.valueSets.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctMedicationCodes <em>Snomedct Medication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Medication Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctMedicationCodes
	 * @generated
	 */
	EEnum getSnomedctMedicationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20487 <em>V20487</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20487</em>'.
	 * @see fhiRCore.valueSets.V20487
	 * @generated
	 */
	EEnum getV20487();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PreparePatient <em>Prepare Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prepare Patient</em>'.
	 * @see fhiRCore.valueSets.PreparePatient
	 * @generated
	 */
	EEnum getPreparePatient();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SpecimenCollection <em>Specimen Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Collection</em>'.
	 * @see fhiRCore.valueSets.SpecimenCollection
	 * @generated
	 */
	EEnum getSpecimenCollection();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContainerMaterials <em>Container Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Materials</em>'.
	 * @see fhiRCore.valueSets.ContainerMaterials
	 * @generated
	 */
	EEnum getContainerMaterials();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SpecimenContainerType <em>Specimen Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Container Type</em>'.
	 * @see fhiRCore.valueSets.SpecimenContainerType
	 * @generated
	 */
	EEnum getSpecimenContainerType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContainerCap <em>Container Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Cap</em>'.
	 * @see fhiRCore.valueSets.ContainerCap
	 * @generated
	 */
	EEnum getContainerCap();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20371 <em>V20371</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20371</em>'.
	 * @see fhiRCore.valueSets.V20371
	 * @generated
	 */
	EEnum getV20371();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.RejectionCriterion <em>Rejection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rejection Criterion</em>'.
	 * @see fhiRCore.valueSets.RejectionCriterion
	 * @generated
	 */
	EEnum getRejectionCriterion();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.HandlingConditionSet <em>Handling Condition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handling Condition Set</em>'.
	 * @see fhiRCore.valueSets.HandlingConditionSet
	 * @generated
	 */
	EEnum getHandlingConditionSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Category Codes</em>'.
	 * @see fhiRCore.valueSets.ObservationCategoryCodes
	 * @generated
	 */
	EEnum getObservationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObservationMethods <em>Observation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Methods</em>'.
	 * @see fhiRCore.valueSets.ObservationMethods
	 * @generated
	 */
	EEnum getObservationMethods();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.UcumCodes <em>Ucum Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ucum Codes</em>'.
	 * @see fhiRCore.valueSets.UcumCodes
	 * @generated
	 */
	EEnum getUcumCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Meaning Codes</em>'.
	 * @see fhiRCore.valueSets.ObservationReferenceRangeMeaningCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeMeaningCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObservationReferenceRangeAppliesToCodes <em>Observation Reference Range Applies To Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Applies To Codes</em>'.
	 * @see fhiRCore.valueSets.ObservationReferenceRangeAppliesToCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeAppliesToCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ServiceRequestCategoryCodes <em>Service Request Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Request Category Codes</em>'.
	 * @see fhiRCore.valueSets.ServiceRequestCategoryCodes
	 * @generated
	 */
	EEnum getServiceRequestCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ServiceRequestOrderDetailsCodes <em>Service Request Order Details Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Request Order Details Codes</em>'.
	 * @see fhiRCore.valueSets.ServiceRequestOrderDetailsCodes
	 * @generated
	 */
	EEnum getServiceRequestOrderDetailsCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ProcedureReasonCodes
	 * @generated
	 */
	EEnum getProcedureReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CoverageTypeAndSelfPayCodes <em>Coverage Type And Self Pay Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Type And Self Pay Codes</em>'.
	 * @see fhiRCore.valueSets.CoverageTypeAndSelfPayCodes
	 * @generated
	 */
	EEnum getCoverageTypeAndSelfPayCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SubscriberRelationshipCodes <em>Subscriber Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscriber Relationship Codes</em>'.
	 * @see fhiRCore.valueSets.SubscriberRelationshipCodes
	 * @generated
	 */
	EEnum getSubscriberRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CoverageClassCodes <em>Coverage Class Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Class Codes</em>'.
	 * @see fhiRCore.valueSets.CoverageClassCodes
	 * @generated
	 */
	EEnum getCoverageClassCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CoverageCopayTypeCodes <em>Coverage Copay Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Copay Type Codes</em>'.
	 * @see fhiRCore.valueSets.CoverageCopayTypeCodes
	 * @generated
	 */
	EEnum getCoverageCopayTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleCoverageFinancialExceptionCodes <em>Example Coverage Financial Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Coverage Financial Exception Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleCoverageFinancialExceptionCodes
	 * @generated
	 */
	EEnum getExampleCoverageFinancialExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceLegalStateCodes <em>Contract Resource Legal State Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Legal State Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceLegalStateCodes
	 * @generated
	 */
	EEnum getContractResourceLegalStateCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractContentDerivationCodes <em>Contract Content Derivation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Content Derivation Codes</em>'.
	 * @see fhiRCore.valueSets.ContractContentDerivationCodes
	 * @generated
	 */
	EEnum getContractContentDerivationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceExpirationTypeCodes <em>Contract Resource Expiration Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Expiration Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceExpirationTypeCodes
	 * @generated
	 */
	EEnum getContractResourceExpirationTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceScopeCodes <em>Contract Resource Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceScopeCodes
	 * @generated
	 */
	EEnum getContractResourceScopeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractTypeCodes
	 * @generated
	 */
	EEnum getContractTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Subtype Codes</em>'.
	 * @see fhiRCore.valueSets.ContractSubtypeCodes
	 * @generated
	 */
	EEnum getContractSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceDefinitionTypeCodes <em>Contract Resource Definition Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Definition Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceDefinitionTypeCodes
	 * @generated
	 */
	EEnum getContractResourceDefinitionTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceDefinitionSubtypeCodes <em>Contract Resource Definition Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Definition Subtype Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceDefinitionSubtypeCodes
	 * @generated
	 */
	EEnum getContractResourceDefinitionSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractTermSubtypeCodes <em>Contract Term Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Subtype Codes</em>'.
	 * @see fhiRCore.valueSets.ContractTermSubtypeCodes
	 * @generated
	 */
	EEnum getContractTermSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceScopeCodesA <em>Contract Resource Scope Codes A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes A</em>'.
	 * @see fhiRCore.valueSets.ContractResourceScopeCodesA
	 * @generated
	 */
	EEnum getContractResourceScopeCodesA();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceScopeCodesB <em>Contract Resource Scope Codes B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes B</em>'.
	 * @see fhiRCore.valueSets.ContractResourceScopeCodesB
	 * @generated
	 */
	EEnum getContractResourceScopeCodesB();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceSecurityControlCodes <em>Contract Resource Security Control Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Security Control Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceSecurityControlCodes
	 * @generated
	 */
	EEnum getContractResourceSecurityControlCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourcePartyRoleCodes <em>Contract Resource Party Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Party Role Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourcePartyRoleCodes
	 * @generated
	 */
	EEnum getContractResourcePartyRoleCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActConsentDirective <em>V3 Act Consent Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Consent Directive</em>'.
	 * @see fhiRCore.valueSets.V3ActConsentDirective
	 * @generated
	 */
	EEnum getV3ActConsentDirective();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceDecisionModeCodes <em>Contract Resource Decision Mode Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Decision Mode Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceDecisionModeCodes
	 * @generated
	 */
	EEnum getContractResourceDecisionModeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceAssetScopeCodes <em>Contract Resource Asset Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Scope Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceAssetScopeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetScopeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceAssetTypeCodes <em>Contract Resource Asset Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceAssetTypeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceAssetSubTypeCodes <em>Contract Resource Asset Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Sub Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceAssetSubTypeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentContentClass <em>Consent Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Class</em>'.
	 * @see fhiRCore.valueSets.ConsentContentClass
	 * @generated
	 */
	EEnum getConsentContentClass();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceAssetContextCodes <em>Contract Resource Asset Context Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Context Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceAssetContextCodes
	 * @generated
	 */
	EEnum getContractResourceAssetContextCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceAssetAvailiabilityCodes <em>Contract Resource Asset Availiability Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Availiability Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceAssetAvailiabilityCodes
	 * @generated
	 */
	EEnum getContractResourceAssetAvailiabilityCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractActionCodes <em>Contract Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Action Codes</em>'.
	 * @see fhiRCore.valueSets.ContractActionCodes
	 * @generated
	 */
	EEnum getContractActionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Actor Role Codes</em>'.
	 * @see fhiRCore.valueSets.ContractActorRoleCodes
	 * @generated
	 */
	EEnum getContractActorRoleCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3PurposeOfUse <em>V3 Purpose Of Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Purpose Of Use</em>'.
	 * @see fhiRCore.valueSets.V3PurposeOfUse
	 * @generated
	 */
	EEnum getV3PurposeOfUse();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractResourceActionStatusCodes <em>Contract Resource Action Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Action Status Codes</em>'.
	 * @see fhiRCore.valueSets.ContractResourceActionStatusCodes
	 * @generated
	 */
	EEnum getContractResourceActionStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProvenanceParticipantType <em>Provenance Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Type</em>'.
	 * @see fhiRCore.valueSets.ProvenanceParticipantType
	 * @generated
	 */
	EEnum getProvenanceParticipantType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Role</em>'.
	 * @see fhiRCore.valueSets.ProvenanceParticipantRole
	 * @generated
	 */
	EEnum getProvenanceParticipantRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Relationship Type</em>'.
	 * @see fhiRCore.valueSets.PatientRelationshipType
	 * @generated
	 */
	EEnum getPatientRelationshipType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProvenanceActivityType <em>Provenance Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Activity Type</em>'.
	 * @see fhiRCore.valueSets.ProvenanceActivityType
	 * @generated
	 */
	EEnum getProvenanceActivityType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Role Type</em>'.
	 * @see fhiRCore.valueSets.SecurityRoleType
	 * @generated
	 */
	EEnum getSecurityRoleType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Signer Type Codes</em>'.
	 * @see fhiRCore.valueSets.ContractSignerTypeCodes
	 * @generated
	 */
	EEnum getContractSignerTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FhirSpecimenCollectionMethod <em>Fhir Specimen Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Specimen Collection Method</em>'.
	 * @see fhiRCore.valueSets.FhirSpecimenCollectionMethod
	 * @generated
	 */
	EEnum getFhirSpecimenCollectionMethod();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20916 <em>V20916</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20916</em>'.
	 * @see fhiRCore.valueSets.V20916
	 * @generated
	 */
	EEnum getV20916();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SpecimenProcessingProcedure <em>Specimen Processing Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Processing Procedure</em>'.
	 * @see fhiRCore.valueSets.SpecimenProcessingProcedure
	 * @generated
	 */
	EEnum getSpecimenProcessingProcedure();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Category Codes</em>'.
	 * @see fhiRCore.valueSets.SubstanceCategoryCodes
	 * @generated
	 */
	EEnum getSubstanceCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SubstanceCode <em>Substance Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Code</em>'.
	 * @see fhiRCore.valueSets.SubstanceCode
	 * @generated
	 */
	EEnum getSubstanceCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20493 <em>V20493</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20493</em>'.
	 * @see fhiRCore.valueSets.V20493
	 * @generated
	 */
	EEnum getV20493();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Type</em>'.
	 * @see fhiRCore.valueSets.ParticipantType
	 * @generated
	 */
	EEnum getParticipantType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctReasonMedicationNotGivenCodes <em>Snomedct Reason Medication Not Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Reason Medication Not Given Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctReasonMedicationNotGivenCodes
	 * @generated
	 */
	EEnum getSnomedctReasonMedicationNotGivenCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationAdministrationCategoryCodes <em>Medication Administration Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Category Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationAdministrationCategoryCodes
	 * @generated
	 */
	EEnum getMedicationAdministrationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationAdministrationPerformerFunctionCodes <em>Medication Administration Performer Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Performer Function Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationAdministrationPerformerFunctionCodes
	 * @generated
	 */
	EEnum getMedicationAdministrationPerformerFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Medication Given Codes</em>'.
	 * @see fhiRCore.valueSets.ReasonMedicationGivenCodes
	 * @generated
	 */
	EEnum getReasonMedicationGivenCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationRequestStatusReasonCodes <em>Medication Request Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Status Reason Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationRequestStatusReasonCodes
	 * @generated
	 */
	EEnum getMedicationRequestStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationRequestCategoryCodes <em>Medication Request Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Category Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationRequestCategoryCodes
	 * @generated
	 */
	EEnum getMedicationRequestCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Performer Role Codes</em>'.
	 * @see fhiRCore.valueSets.ProcedurePerformerRoleCodes
	 * @generated
	 */
	EEnum getProcedurePerformerRoleCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationRequestCourseOfTherapyCodes <em>Medication Request Course Of Therapy Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Course Of Therapy Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationRequestCourseOfTherapyCodes
	 * @generated
	 */
	EEnum getMedicationRequestCourseOfTherapyCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActSubstanceAdminSubstitutionCode <em>V3 Act Substance Admin Substitution Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Substance Admin Substitution Code</em>'.
	 * @see fhiRCore.valueSets.V3ActSubstanceAdminSubstitutionCode
	 * @generated
	 */
	EEnum getV3ActSubstanceAdminSubstitutionCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3SubstanceAdminSubstitutionReason <em>V3 Substance Admin Substitution Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Substance Admin Substitution Reason</em>'.
	 * @see fhiRCore.valueSets.V3SubstanceAdminSubstitutionReason
	 * @generated
	 */
	EEnum getV3SubstanceAdminSubstitutionReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Category</em>'.
	 * @see fhiRCore.valueSets.DetectedIssueCategory
	 * @generated
	 */
	EEnum getDetectedIssueCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manifestation And Symptom Codes</em>'.
	 * @see fhiRCore.valueSets.ManifestationAndSymptomCodes
	 * @generated
	 */
	EEnum getManifestationAndSymptomCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Mitigation Action</em>'.
	 * @see fhiRCore.valueSets.DetectedIssueMitigationAction
	 * @generated
	 */
	EEnum getDetectedIssueMitigationAction();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FhirDeviceTypes <em>Fhir Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Device Types</em>'.
	 * @see fhiRCore.valueSets.FhirDeviceTypes
	 * @generated
	 */
	EEnum getFhirDeviceTypes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DeviceSafety <em>Device Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Safety</em>'.
	 * @see fhiRCore.valueSets.DeviceSafety
	 * @generated
	 */
	EEnum getDeviceSafety();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FhirDeviceStatusReason <em>Fhir Device Status Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Device Status Reason</em>'.
	 * @see fhiRCore.valueSets.FhirDeviceStatusReason
	 * @generated
	 */
	EEnum getFhirDeviceStatusReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type</em>'.
	 * @see fhiRCore.valueSets.DeviceType
	 * @generated
	 */
	EEnum getDeviceType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DataAbsentReason <em>Data Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Absent Reason</em>'.
	 * @see fhiRCore.valueSets.DataAbsentReason
	 * @generated
	 */
	EEnum getDataAbsentReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Interpretation Codes</em>'.
	 * @see fhiRCore.valueSets.ObservationInterpretationCodes
	 * @generated
	 */
	EEnum getObservationInterpretationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Class Value Set</em>'.
	 * @see fhiRCore.valueSets.DocumentClassValueSet
	 * @generated
	 */
	EEnum getDocumentClassValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Format Code Set</em>'.
	 * @see fhiRCore.valueSets.DocumentReferenceFormatCodeSet
	 * @generated
	 */
	EEnum getDocumentReferenceFormatCodeSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActCode <em>V3 Act Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Code</em>'.
	 * @see fhiRCore.valueSets.V3ActCode
	 * @generated
	 */
	EEnum getV3ActCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Type Code Value Set</em>'.
	 * @see fhiRCore.valueSets.FacilityTypeCodeValueSet
	 * @generated
	 */
	EEnum getFacilityTypeCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clinical Impression Prognosis</em>'.
	 * @see fhiRCore.valueSets.ClinicalImpressionPrognosis
	 * @generated
	 */
	EEnum getClinicalImpressionPrognosis();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.RiskProbability <em>Risk Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Probability</em>'.
	 * @see fhiRCore.valueSets.RiskProbability
	 * @generated
	 */
	EEnum getRiskProbability();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionStageType <em>Condition Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage Type</em>'.
	 * @see fhiRCore.valueSets.ConditionStageType
	 * @generated
	 */
	EEnum getConditionStageType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DiagnosisRole <em>Diagnosis Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnosis Role</em>'.
	 * @see fhiRCore.valueSets.DiagnosisRole
	 * @generated
	 */
	EEnum getDiagnosisRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AccountTypes <em>Account Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Types</em>'.
	 * @see fhiRCore.valueSets.AccountTypes
	 * @generated
	 */
	EEnum getAccountTypes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdmitSource <em>Admit Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Admit Source</em>'.
	 * @see fhiRCore.valueSets.AdmitSource
	 * @generated
	 */
	EEnum getAdmitSource();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V20092 <em>V20092</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20092</em>'.
	 * @see fhiRCore.valueSets.V20092
	 * @generated
	 */
	EEnum getV20092();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Diet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet</em>'.
	 * @see fhiRCore.valueSets.Diet
	 * @generated
	 */
	EEnum getDiet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SpecialCourtesy <em>Special Courtesy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Courtesy</em>'.
	 * @see fhiRCore.valueSets.SpecialCourtesy
	 * @generated
	 */
	EEnum getSpecialCourtesy();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SpecialArrangements <em>Special Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Arrangements</em>'.
	 * @see fhiRCore.valueSets.SpecialArrangements
	 * @generated
	 */
	EEnum getSpecialArrangements();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DischargeDisposition <em>Discharge Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discharge Disposition</em>'.
	 * @see fhiRCore.valueSets.DischargeDisposition
	 * @generated
	 */
	EEnum getDischargeDisposition();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ListOrderCodes <em>List Order Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Order Codes</em>'.
	 * @see fhiRCore.valueSets.ListOrderCodes
	 * @generated
	 */
	EEnum getListOrderCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Medicine Change Types</em>'.
	 * @see fhiRCore.valueSets.PatientMedicineChangeTypes
	 * @generated
	 */
	EEnum getPatientMedicineChangeTypes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Empty Reasons</em>'.
	 * @see fhiRCore.valueSets.ListEmptyReasons
	 * @generated
	 */
	EEnum getListEmptyReasons();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ResearchStudyPrimaryPurposeType <em>Research Study Primary Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Primary Purpose Type</em>'.
	 * @see fhiRCore.valueSets.ResearchStudyPrimaryPurposeType
	 * @generated
	 */
	EEnum getResearchStudyPrimaryPurposeType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ResearchStudyPhase <em>Research Study Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Phase</em>'.
	 * @see fhiRCore.valueSets.ResearchStudyPhase
	 * @generated
	 */
	EEnum getResearchStudyPhase();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ResearchStudyReasonStopped <em>Research Study Reason Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Reason Stopped</em>'.
	 * @see fhiRCore.valueSets.ResearchStudyReasonStopped
	 * @generated
	 */
	EEnum getResearchStudyReasonStopped();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ResearchStudyObjectiveType <em>Research Study Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Objective Type</em>'.
	 * @see fhiRCore.valueSets.ResearchStudyObjectiveType
	 * @generated
	 */
	EEnum getResearchStudyObjectiveType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentScopeCodes <em>Consent Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Scope Codes</em>'.
	 * @see fhiRCore.valueSets.ConsentScopeCodes
	 * @generated
	 */
	EEnum getConsentScopeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Category Codes</em>'.
	 * @see fhiRCore.valueSets.ConsentCategoryCodes
	 * @generated
	 */
	EEnum getConsentCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentPolicyRuleCodes <em>Consent Policy Rule Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Policy Rule Codes</em>'.
	 * @see fhiRCore.valueSets.ConsentPolicyRuleCodes
	 * @generated
	 */
	EEnum getConsentPolicyRuleCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Action Codes</em>'.
	 * @see fhiRCore.valueSets.ConsentActionCodes
	 * @generated
	 */
	EEnum getConsentActionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Codes</em>'.
	 * @see fhiRCore.valueSets.ConsentContentCodes
	 * @generated
	 */
	EEnum getConsentContentCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ChargeItemCode <em>Charge Item Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Item Code</em>'.
	 * @see fhiRCore.valueSets.ChargeItemCode
	 * @generated
	 */
	EEnum getChargeItemCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctFormCodes <em>Snomedct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Form Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctFormCodes
	 * @generated
	 */
	EEnum getSnomedctFormCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.IcD10Codes <em>Ic D10 Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Codes</em>'.
	 * @see fhiRCore.valueSets.IcD10Codes
	 * @generated
	 */
	EEnum getIcD10Codes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Service Section Codes</em>'.
	 * @see fhiRCore.valueSets.DiagnosticServiceSectionCodes
	 * @generated
	 */
	EEnum getDiagnosticServiceSectionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Report Codes</em>'.
	 * @see fhiRCore.valueSets.LoincDiagnosticReportCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticReportCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AcquisitionModality <em>Acquisition Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acquisition Modality</em>'.
	 * @see fhiRCore.valueSets.AcquisitionModality
	 * @generated
	 */
	EEnum getAcquisitionModality();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureNotPerformedReasonSnomeDCT <em>Procedure Not Performed Reason Snome DCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Not Performed Reason Snome DCT</em>'.
	 * @see fhiRCore.valueSets.ProcedureNotPerformedReasonSnomeDCT
	 * @generated
	 */
	EEnum getProcedureNotPerformedReasonSnomeDCT();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureCategoryCodesSnomedcT <em>Procedure Category Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Category Codes Snomedc T</em>'.
	 * @see fhiRCore.valueSets.ProcedureCategoryCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureCategoryCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureOutcomeCodesSnomedcT <em>Procedure Outcome Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Outcome Codes Snomedc T</em>'.
	 * @see fhiRCore.valueSets.ProcedureOutcomeCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureOutcomeCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureFollowUpCodesSnomedcT <em>Procedure Follow Up Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Follow Up Codes Snomedc T</em>'.
	 * @see fhiRCore.valueSets.ProcedureFollowUpCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureFollowUpCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Device Action Codes</em>'.
	 * @see fhiRCore.valueSets.ProcedureDeviceActionCodes
	 * @generated
	 */
	EEnum getProcedureDeviceActionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Laterality <em>Laterality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Laterality</em>'.
	 * @see fhiRCore.valueSets.Laterality
	 * @generated
	 */
	EEnum getLaterality();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImagingStudySeriesPerformerFunction <em>Imaging Study Series Performer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Imaging Study Series Performer Function</em>'.
	 * @see fhiRCore.valueSets.ImagingStudySeriesPerformerFunction
	 * @generated
	 */
	EEnum getImagingStudySeriesPerformerFunction();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see fhiRCore.valueSets.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MediaModality <em>Media Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Modality</em>'.
	 * @see fhiRCore.valueSets.MediaModality
	 * @generated
	 */
	EEnum getMediaModality();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Collection View Projection</em>'.
	 * @see fhiRCore.valueSets.MediaCollectionViewProjection
	 * @generated
	 */
	EEnum getMediaCollectionViewProjection();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CommunicationNotDoneReason <em>Communication Not Done Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Not Done Reason</em>'.
	 * @see fhiRCore.valueSets.CommunicationNotDoneReason
	 * @generated
	 */
	EEnum getCommunicationNotDoneReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CommunicationCategory <em>Communication Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Category</em>'.
	 * @see fhiRCore.valueSets.CommunicationCategory
	 * @generated
	 */
	EEnum getCommunicationCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ParticipationMode <em>V3 Participation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Participation Mode</em>'.
	 * @see fhiRCore.valueSets.V3ParticipationMode
	 * @generated
	 */
	EEnum getV3ParticipationMode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CommunicationTopic <em>Communication Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Topic</em>'.
	 * @see fhiRCore.valueSets.CommunicationTopic
	 * @generated
	 */
	EEnum getCommunicationTopic();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ClaimTypeCodes <em>Claim Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Type Codes</em>'.
	 * @see fhiRCore.valueSets.ClaimTypeCodes
	 * @generated
	 */
	EEnum getClaimTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Claim Sub Type Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleClaimSubTypeCodes
	 * @generated
	 */
	EEnum getExampleClaimSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProcessPriorityCodes <em>Process Priority Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Priority Codes</em>'.
	 * @see fhiRCore.valueSets.ProcessPriorityCodes
	 * @generated
	 */
	EEnum getProcessPriorityCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Funds Reservation Codes</em>'.
	 * @see fhiRCore.valueSets.FundsReservationCodes
	 * @generated
	 */
	EEnum getFundsReservationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Related Claim Relationship Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @generated
	 */
	EEnum getExampleRelatedClaimRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ClaimPayeeTypeCodes <em>Claim Payee Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Payee Type Codes</em>'.
	 * @see fhiRCore.valueSets.ClaimPayeeTypeCodes
	 * @generated
	 */
	EEnum getClaimPayeeTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Care Team Role Codes</em>'.
	 * @see fhiRCore.valueSets.ClaimCareTeamRoleCodes
	 * @generated
	 */
	EEnum getClaimCareTeamRoleCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Provider Qualification Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleProviderQualificationCodes
	 * @generated
	 */
	EEnum getExampleProviderQualificationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Information Category Codes</em>'.
	 * @see fhiRCore.valueSets.ClaimInformationCategoryCodes
	 * @generated
	 */
	EEnum getClaimInformationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExceptionCodes <em>Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exception Codes</em>'.
	 * @see fhiRCore.valueSets.ExceptionCodes
	 * @generated
	 */
	EEnum getExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Missing Tooth Reason Codes</em>'.
	 * @see fhiRCore.valueSets.MissingToothReasonCodes
	 * @generated
	 */
	EEnum getMissingToothReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Type Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleDiagnosisTypeCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleDiagnosisOnAdmissionCodes <em>Example Diagnosis On Admission Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis On Admission Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleDiagnosisOnAdmissionCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisOnAdmissionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Related Group Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisRelatedGroupCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleProcedureTypeCodes <em>Example Procedure Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Procedure Type Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleProcedureTypeCodes
	 * @generated
	 */
	EEnum getExampleProcedureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Procedure Codes</em>'.
	 * @see fhiRCore.valueSets.IcD10ProcedureCodes
	 * @generated
	 */
	EEnum getIcD10ProcedureCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActIncidentCode <em>V3 Act Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Incident Code</em>'.
	 * @see fhiRCore.valueSets.V3ActIncidentCode
	 * @generated
	 */
	EEnum getV3ActIncidentCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Revenue Center Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleRevenueCenterCodes
	 * @generated
	 */
	EEnum getExampleRevenueCenterCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Category Codes</em>'.
	 * @see fhiRCore.valueSets.BenefitCategoryCodes
	 * @generated
	 */
	EEnum getBenefitCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.UsclsCodes <em>Uscls Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uscls Codes</em>'.
	 * @see fhiRCore.valueSets.UsclsCodes
	 * @generated
	 */
	EEnum getUsclsCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier Type Codes</em>'.
	 * @see fhiRCore.valueSets.ModifierTypeCodes
	 * @generated
	 */
	EEnum getModifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Program Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleProgramReasonCodes
	 * @generated
	 */
	EEnum getExampleProgramReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Service Place Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleServicePlaceCodes
	 * @generated
	 */
	EEnum getExampleServicePlaceCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.OralSiteCodes <em>Oral Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oral Site Codes</em>'.
	 * @see fhiRCore.valueSets.OralSiteCodes
	 * @generated
	 */
	EEnum getOralSiteCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SurfaceCodes <em>Surface Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surface Codes</em>'.
	 * @see fhiRCore.valueSets.SurfaceCodes
	 * @generated
	 */
	EEnum getSurfaceCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdjudicationValueCodes <em>Adjudication Value Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Value Codes</em>'.
	 * @see fhiRCore.valueSets.AdjudicationValueCodes
	 * @generated
	 */
	EEnum getAdjudicationValueCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Reason Codes</em>'.
	 * @see fhiRCore.valueSets.AdjudicationReasonCodes
	 * @generated
	 */
	EEnum getAdjudicationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Payment Type Codes</em>'.
	 * @see fhiRCore.valueSets.ExamplePaymentTypeCodes
	 * @generated
	 */
	EEnum getExamplePaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Adjustment Reason Codes</em>'.
	 * @see fhiRCore.valueSets.PaymentAdjustmentReasonCodes
	 * @generated
	 */
	EEnum getPaymentAdjustmentReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FormCodes <em>Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Codes</em>'.
	 * @see fhiRCore.valueSets.FormCodes
	 * @generated
	 */
	EEnum getFormCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActReason <em>V3 Act Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Reason</em>'.
	 * @see fhiRCore.valueSets.V3ActReason
	 * @generated
	 */
	EEnum getV3ActReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Error Codes</em>'.
	 * @see fhiRCore.valueSets.AdjudicationErrorCodes
	 * @generated
	 */
	EEnum getAdjudicationErrorCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Provision Conditions</em>'.
	 * @see fhiRCore.valueSets.ServiceProvisionConditions
	 * @generated
	 */
	EEnum getServiceProvisionConditions();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program</em>'.
	 * @see fhiRCore.valueSets.Program
	 * @generated
	 */
	EEnum getProgram();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ReferralMethod <em>Referral Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Method</em>'.
	 * @see fhiRCore.valueSets.ReferralMethod
	 * @generated
	 */
	EEnum getReferralMethod();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctMorphologicAbnormalities <em>Snomedct Morphologic Abnormalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Morphologic Abnormalities</em>'.
	 * @see fhiRCore.valueSets.SnomedctMorphologicAbnormalities
	 * @generated
	 */
	EEnum getSnomedctMorphologicAbnormalities();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.BodystructureLocationQualifier <em>Bodystructure Location Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bodystructure Location Qualifier</em>'.
	 * @see fhiRCore.valueSets.BodystructureLocationQualifier
	 * @generated
	 */
	EEnum getBodystructureLocationQualifier();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TaskCode <em>Task Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Code</em>'.
	 * @see fhiRCore.valueSets.TaskCode
	 * @generated
	 */
	EEnum getTaskCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Question Codes</em>'.
	 * @see fhiRCore.valueSets.QuestionnaireQuestionCodes
	 * @generated
	 */
	EEnum getQuestionnaireQuestionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Answer Codes</em>'.
	 * @see fhiRCore.valueSets.QuestionnaireAnswerCodes
	 * @generated
	 */
	EEnum getQuestionnaireAnswerCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type Codes</em>'.
	 * @see fhiRCore.valueSets.NetworkTypeCodes
	 * @generated
	 */
	EEnum getNetworkTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type Codes</em>'.
	 * @see fhiRCore.valueSets.UnitTypeCodes
	 * @generated
	 */
	EEnum getUnitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Term Codes</em>'.
	 * @see fhiRCore.valueSets.BenefitTermCodes
	 * @generated
	 */
	EEnum getBenefitTermCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Type Codes</em>'.
	 * @see fhiRCore.valueSets.BenefitTypeCodes
	 * @generated
	 */
	EEnum getBenefitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.VitalSigns <em>Vital Signs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vital Signs</em>'.
	 * @see fhiRCore.valueSets.VitalSigns
	 * @generated
	 */
	EEnum getVitalSigns();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DeviceMetricAndComponentTypes <em>Device Metric And Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric And Component Types</em>'.
	 * @see fhiRCore.valueSets.DeviceMetricAndComponentTypes
	 * @generated
	 */
	EEnum getDeviceMetricAndComponentTypes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FlagCategory <em>Flag Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Category</em>'.
	 * @see fhiRCore.valueSets.FlagCategory
	 * @generated
	 */
	EEnum getFlagCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FlagCode <em>Flag Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Code</em>'.
	 * @see fhiRCore.valueSets.FlagCode
	 * @generated
	 */
	EEnum getFlagCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationEvaluationTargetDiseaseCodes <em>Immunization Evaluation Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Target Disease Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationEvaluationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationStatusReasonCodes <em>Immunization Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Status Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationStatusReasonCodes
	 * @generated
	 */
	EEnum getImmunizationStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccine Administered Value Set</em>'.
	 * @see fhiRCore.valueSets.VaccineAdministeredValueSet
	 * @generated
	 */
	EEnum getVaccineAdministeredValueSet();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationOriginCodes <em>Immunization Origin Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Origin Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationOriginCodes
	 * @generated
	 */
	EEnum getImmunizationOriginCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Codes For Immunization Site Of Administration</em>'.
	 * @see fhiRCore.valueSets.CodesForImmunizationSiteOfAdministration
	 * @generated
	 */
	EEnum getCodesForImmunizationSiteOfAdministration();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Route Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationRouteCodes
	 * @generated
	 */
	EEnum getImmunizationRouteCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationFunctionCodes <em>Immunization Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Function Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationFunctionCodes
	 * @generated
	 */
	EEnum getImmunizationFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationSubpotentReason <em>Immunization Subpotent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Subpotent Reason</em>'.
	 * @see fhiRCore.valueSets.ImmunizationSubpotentReason
	 * @generated
	 */
	EEnum getImmunizationSubpotentReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationProgramEligibility <em>Immunization Program Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Program Eligibility</em>'.
	 * @see fhiRCore.valueSets.ImmunizationProgramEligibility
	 * @generated
	 */
	EEnum getImmunizationProgramEligibility();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationFundingSource <em>Immunization Funding Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Funding Source</em>'.
	 * @see fhiRCore.valueSets.ImmunizationFundingSource
	 * @generated
	 */
	EEnum getImmunizationFundingSource();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationTargetDiseaseCodes <em>Immunization Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Target Disease Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationEvaluationDoseStatusCodes <em>Immunization Evaluation Dose Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Dose Status Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationEvaluationDoseStatusCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationDoseStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationEvaluationDoseStatusReasonCodes <em>Immunization Evaluation Dose Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Dose Status Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationEvaluationDoseStatusReasonCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationDoseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Outcome Codes</em>'.
	 * @see fhiRCore.valueSets.OperationOutcomeCodes
	 * @generated
	 */
	EEnum getOperationOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type Codes</em>'.
	 * @see fhiRCore.valueSets.PaymentTypeCodes
	 * @generated
	 */
	EEnum getPaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Role</em>'.
	 * @see fhiRCore.valueSets.PractitionerRole
	 * @generated
	 */
	EEnum getPractitionerRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FamilyHistoryAbsentReason <em>Family History Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family History Absent Reason</em>'.
	 * @see fhiRCore.valueSets.FamilyHistoryAbsentReason
	 * @generated
	 */
	EEnum getFamilyHistoryAbsentReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3FamilyMember <em>V3 Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Family Member</em>'.
	 * @see fhiRCore.valueSets.V3FamilyMember
	 * @generated
	 */
	EEnum getV3FamilyMember();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Outcome Codes</em>'.
	 * @see fhiRCore.valueSets.ConditionOutcomeCodes
	 * @generated
	 */
	EEnum getConditionOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.OrganizationAffiliationRole <em>Organization Affiliation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Affiliation Role</em>'.
	 * @see fhiRCore.valueSets.OrganizationAffiliationRole
	 * @generated
	 */
	EEnum getOrganizationAffiliationRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdverseEventCategory <em>Adverse Event Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Category</em>'.
	 * @see fhiRCore.valueSets.AdverseEventCategory
	 * @generated
	 */
	EEnum getAdverseEventCategory();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctClinicalFindingsA <em>Snomedct Clinical Findings A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Clinical Findings A</em>'.
	 * @see fhiRCore.valueSets.SnomedctClinicalFindingsA
	 * @generated
	 */
	EEnum getSnomedctClinicalFindingsA();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdverseEventSeriousness <em>Adverse Event Seriousness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Seriousness</em>'.
	 * @see fhiRCore.valueSets.AdverseEventSeriousness
	 * @generated
	 */
	EEnum getAdverseEventSeriousness();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdverseEventCausalityAssessment <em>Adverse Event Causality Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Causality Assessment</em>'.
	 * @see fhiRCore.valueSets.AdverseEventCausalityAssessment
	 * @generated
	 */
	EEnum getAdverseEventCausalityAssessment();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AdverseEventCausalityMethod <em>Adverse Event Causality Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Causality Method</em>'.
	 * @see fhiRCore.valueSets.AdverseEventCausalityMethod
	 * @generated
	 */
	EEnum getAdverseEventCausalityMethod();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SynthesisType <em>Synthesis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synthesis Type</em>'.
	 * @see fhiRCore.valueSets.SynthesisType
	 * @generated
	 */
	EEnum getSynthesisType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.StudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Study Type</em>'.
	 * @see fhiRCore.valueSets.StudyType
	 * @generated
	 */
	EEnum getStudyType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.RiskEstimateType <em>Risk Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Estimate Type</em>'.
	 * @see fhiRCore.valueSets.RiskEstimateType
	 * @generated
	 */
	EEnum getRiskEstimateType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PrecisionEstimateType <em>Precision Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precision Estimate Type</em>'.
	 * @see fhiRCore.valueSets.PrecisionEstimateType
	 * @generated
	 */
	EEnum getPrecisionEstimateType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.QualityOfEvidenceRating <em>Quality Of Evidence Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Of Evidence Rating</em>'.
	 * @see fhiRCore.valueSets.QualityOfEvidenceRating
	 * @generated
	 */
	EEnum getQualityOfEvidenceRating();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CertaintySubcomponentType <em>Certainty Subcomponent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certainty Subcomponent Type</em>'.
	 * @see fhiRCore.valueSets.CertaintySubcomponentType
	 * @generated
	 */
	EEnum getCertaintySubcomponentType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CertaintySubcomponentRating <em>Certainty Subcomponent Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certainty Subcomponent Rating</em>'.
	 * @see fhiRCore.valueSets.CertaintySubcomponentRating
	 * @generated
	 */
	EEnum getCertaintySubcomponentRating();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Origin Type</em>'.
	 * @see fhiRCore.valueSets.TestScriptProfileOriginType
	 * @generated
	 */
	EEnum getTestScriptProfileOriginType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Destination Type</em>'.
	 * @see fhiRCore.valueSets.TestScriptProfileDestinationType
	 * @generated
	 */
	EEnum getTestScriptProfileDestinationType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.RestfulSecurityService <em>Restful Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Security Service</em>'.
	 * @see fhiRCore.valueSets.RestfulSecurityService
	 * @generated
	 */
	EEnum getRestfulSecurityService();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MessageTransport <em>Message Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Transport</em>'.
	 * @see fhiRCore.valueSets.MessageTransport
	 * @generated
	 */
	EEnum getMessageTransport();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event</em>'.
	 * @see fhiRCore.valueSets.MessageEvent
	 * @generated
	 */
	EEnum getMessageEvent();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Operation Code</em>'.
	 * @see fhiRCore.valueSets.TestScriptOperationCode
	 * @generated
	 */
	EEnum getTestScriptOperationCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Message Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleMessageReasonCodes
	 * @generated
	 */
	EEnum getExampleMessageReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status Codes</em>'.
	 * @see fhiRCore.valueSets.PaymentStatusCodes
	 * @generated
	 */
	EEnum getPaymentStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Type Codes</em>'.
	 * @see fhiRCore.valueSets.FhirDocumentTypeCodes
	 * @generated
	 */
	EEnum getFhirDocumentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Section Codes</em>'.
	 * @see fhiRCore.valueSets.DocumentSectionCodes
	 * @generated
	 */
	EEnum getDocumentSectionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SupplyType <em>Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Type</em>'.
	 * @see fhiRCore.valueSets.SupplyType
	 * @generated
	 */
	EEnum getSupplyType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctSupplyItem <em>Snomedct Supply Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Supply Item</em>'.
	 * @see fhiRCore.valueSets.SnomedctSupplyItem
	 * @generated
	 */
	EEnum getSnomedctSupplyItem();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Reason</em>'.
	 * @see fhiRCore.valueSets.SupplyRequestReason
	 * @generated
	 */
	EEnum getSupplyRequestReason();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EvidenceVariantState <em>Evidence Variant State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evidence Variant State</em>'.
	 * @see fhiRCore.valueSets.EvidenceVariantState
	 * @generated
	 */
	EEnum getEvidenceVariantState();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EffectEstimateType <em>Effect Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect Estimate Type</em>'.
	 * @see fhiRCore.valueSets.EffectEstimateType
	 * @generated
	 */
	EEnum getEffectEstimateType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.InsurancePlanType <em>Insurance Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Insurance Plan Type</em>'.
	 * @see fhiRCore.valueSets.InsurancePlanType
	 * @generated
	 */
	EEnum getInsurancePlanType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ProvenanceHistoryRecordActivityCodes <em>Provenance History Record Activity Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance History Record Activity Codes</em>'.
	 * @see fhiRCore.valueSets.ProvenanceHistoryRecordActivityCodes
	 * @generated
	 */
	EEnum getProvenanceHistoryRecordActivityCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Chromosomehuman <em>Chromosomehuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chromosomehuman</em>'.
	 * @see fhiRCore.valueSets.Chromosomehuman
	 * @generated
	 */
	EEnum getChromosomehuman();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Ensembl <em>Ensembl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ensembl</em>'.
	 * @see fhiRCore.valueSets.Ensembl
	 * @generated
	 */
	EEnum getEnsembl();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FdAStandardSequence <em>Fd AStandard Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fd AStandard Sequence</em>'.
	 * @see fhiRCore.valueSets.FdAStandardSequence
	 * @generated
	 */
	EEnum getFdAStandardSequence();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FdAMethod <em>Fd AMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fd AMethod</em>'.
	 * @see fhiRCore.valueSets.FdAMethod
	 * @generated
	 */
	EEnum getFdAMethod();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Substance Product Condition And Negation Codes</em>'.
	 * @see fhiRCore.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @generated
	 */
	EEnum getAllergyIntoleranceSubstanceProductConditionAndNegationCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CatalogType <em>Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Catalog Type</em>'.
	 * @see fhiRCore.valueSets.CatalogType
	 * @generated
	 */
	EEnum getCatalogType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationRecommendationTargetDiseaseCodes <em>Immunization Recommendation Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Target Disease Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationRecommendationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Status Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationRecommendationStatusCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationRecommendationReasonCodes <em>Immunization Recommendation Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Reason Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationRecommendationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Date Criterion Codes</em>'.
	 * @see fhiRCore.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationDateCriterionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Need</em>'.
	 * @see fhiRCore.valueSets.Need
	 * @generated
	 */
	EEnum getNeed();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Validationtype <em>Validationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationtype</em>'.
	 * @see fhiRCore.valueSets.Validationtype
	 * @generated
	 */
	EEnum getValidationtype();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Validationprocess <em>Validationprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationprocess</em>'.
	 * @see fhiRCore.valueSets.Validationprocess
	 * @generated
	 */
	EEnum getValidationprocess();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Failureaction <em>Failureaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failureaction</em>'.
	 * @see fhiRCore.valueSets.Failureaction
	 * @generated
	 */
	EEnum getFailureaction();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Primarysourcetype <em>Primarysourcetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primarysourcetype</em>'.
	 * @see fhiRCore.valueSets.Primarysourcetype
	 * @generated
	 */
	EEnum getPrimarysourcetype();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Verificationresultcommunicationmethod <em>Verificationresultcommunicationmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verificationresultcommunicationmethod</em>'.
	 * @see fhiRCore.valueSets.Verificationresultcommunicationmethod
	 * @generated
	 */
	EEnum getVerificationresultcommunicationmethod();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Validationstatus <em>Validationstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationstatus</em>'.
	 * @see fhiRCore.valueSets.Validationstatus
	 * @generated
	 */
	EEnum getValidationstatus();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Canpushupdates <em>Canpushupdates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Canpushupdates</em>'.
	 * @see fhiRCore.valueSets.Canpushupdates
	 * @generated
	 */
	EEnum getCanpushupdates();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.Pushtypeavailable <em>Pushtypeavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pushtypeavailable</em>'.
	 * @see fhiRCore.valueSets.Pushtypeavailable
	 * @generated
	 */
	EEnum getPushtypeavailable();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FoodTypeCodes <em>Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Type Codes</em>'.
	 * @see fhiRCore.valueSets.FoodTypeCodes
	 * @generated
	 */
	EEnum getFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.DietCodes <em>Diet Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet Codes</em>'.
	 * @see fhiRCore.valueSets.DietCodes
	 * @generated
	 */
	EEnum getDietCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrient Modifier Codes</em>'.
	 * @see fhiRCore.valueSets.NutrientModifierCodes
	 * @generated
	 */
	EEnum getNutrientModifierCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modifier Codes</em>'.
	 * @see fhiRCore.valueSets.TextureModifierCodes
	 * @generated
	 */
	EEnum getTextureModifierCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modified Food Type Codes</em>'.
	 * @see fhiRCore.valueSets.TextureModifiedFoodTypeCodes
	 * @generated
	 */
	EEnum getTextureModifiedFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fluid Consistency Type Codes</em>'.
	 * @see fhiRCore.valueSets.FluidConsistencyTypeCodes
	 * @generated
	 */
	EEnum getFluidConsistencyTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplement Type Codes</em>'.
	 * @see fhiRCore.valueSets.SupplementTypeCodes
	 * @generated
	 */
	EEnum getSupplementTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Type Codes</em>'.
	 * @see fhiRCore.valueSets.EnteralFormulaTypeCodes
	 * @generated
	 */
	EEnum getEnteralFormulaTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Additive Type Code</em>'.
	 * @see fhiRCore.valueSets.EnteralFormulaAdditiveTypeCode
	 * @generated
	 */
	EEnum getEnteralFormulaAdditiveTypeCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Route Codes</em>'.
	 * @see fhiRCore.valueSets.EnteralRouteCodes
	 * @generated
	 */
	EEnum getEnteralRouteCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.SnomedctDrugTherapyStatusCodes <em>Snomedct Drug Therapy Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Drug Therapy Status Codes</em>'.
	 * @see fhiRCore.valueSets.SnomedctDrugTherapyStatusCodes
	 * @generated
	 */
	EEnum getSnomedctDrugTherapyStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationStatusCodes <em>Medication Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Status Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationStatusCodes
	 * @generated
	 */
	EEnum getMedicationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AuditEventId <em>Audit Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Id</em>'.
	 * @see fhiRCore.valueSets.AuditEventId
	 * @generated
	 */
	EEnum getAuditEventId();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Sub Type</em>'.
	 * @see fhiRCore.valueSets.AuditEventSubType
	 * @generated
	 */
	EEnum getAuditEventSubType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ParticipationRoleType <em>Participation Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Role Type</em>'.
	 * @see fhiRCore.valueSets.ParticipationRoleType
	 * @generated
	 */
	EEnum getParticipationRoleType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MediaTypeCode <em>Media Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Code</em>'.
	 * @see fhiRCore.valueSets.MediaTypeCode
	 * @generated
	 */
	EEnum getMediaTypeCode();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Source Type</em>'.
	 * @see fhiRCore.valueSets.AuditEventSourceType
	 * @generated
	 */
	EEnum getAuditEventSourceType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Type</em>'.
	 * @see fhiRCore.valueSets.AuditEventEntityType
	 * @generated
	 */
	EEnum getAuditEventEntityType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Role</em>'.
	 * @see fhiRCore.valueSets.AuditEventEntityRole
	 * @generated
	 */
	EEnum getAuditEventEntityRole();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ObjectLifecycleEvents <em>Object Lifecycle Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Lifecycle Events</em>'.
	 * @see fhiRCore.valueSets.ObjectLifecycleEvents
	 * @generated
	 */
	EEnum getObjectLifecycleEvents();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Resource Types</em>'.
	 * @see fhiRCore.valueSets.BasicResourceTypes
	 * @generated
	 */
	EEnum getBasicResourceTypes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Vision Prescription Product Codes</em>'.
	 * @see fhiRCore.valueSets.ExampleVisionPrescriptionProductCodes
	 * @generated
	 */
	EEnum getExampleVisionPrescriptionProductCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationDispenseStatusReasonCodes <em>Medication Dispense Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Status Reason Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationDispenseStatusReasonCodes
	 * @generated
	 */
	EEnum getMedicationDispenseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationDispenseCategoryCodes <em>Medication Dispense Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Category Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationDispenseCategoryCodes
	 * @generated
	 */
	EEnum getMedicationDispenseCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationDispensePerformerFunctionCodes <em>Medication Dispense Performer Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Performer Function Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationDispensePerformerFunctionCodes
	 * @generated
	 */
	EEnum getMedicationDispensePerformerFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.V3ActPharmacySupplyType <em>V3 Act Pharmacy Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Pharmacy Supply Type</em>'.
	 * @see fhiRCore.valueSets.V3ActPharmacySupplyType
	 * @generated
	 */
	EEnum getV3ActPharmacySupplyType();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationKnowledgePackageTypeCodes <em>Medication Knowledge Package Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Knowledge Package Type Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationKnowledgePackageTypeCodes
	 * @generated
	 */
	EEnum getMedicationKnowledgePackageTypeCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.MedicationKnowledgeCharacteristicCodes <em>Medication Knowledge Characteristic Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Knowledge Characteristic Codes</em>'.
	 * @see fhiRCore.valueSets.MedicationKnowledgeCharacteristicCodes
	 * @generated
	 */
	EEnum getMedicationKnowledgeCharacteristicCodes();

	/**
	 * Returns the meta object for enum '{@link fhiRCore.valueSets.CoverageEligibilityResponseAuthSupportCodes <em>Coverage Eligibility Response Auth Support Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Eligibility Response Auth Support Codes</em>'.
	 * @see fhiRCore.valueSets.CoverageEligibilityResponseAuthSupportCodes
	 * @generated
	 */
	EEnum getCoverageEligibilityResponseAuthSupportCodes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueSetsFactory getValueSetsFactory();

} //ValueSetsPackage
