/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

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
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsFactory
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
	ValueSetsPackage eINSTANCE = org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DataType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResourceType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IdentifierTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getIdentifierTypeCodes()
	 * @generated
	 */
	int IDENTIFIER_TYPE_CODES = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.UsageContextType <em>Usage Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UsageContextType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getUsageContextType()
	 * @generated
	 */
	int USAGE_CONTEXT_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContextOfUseValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContextOfUseValueSet()
	 * @generated
	 */
	int CONTEXT_OF_USE_VALUE_SET = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.JurisdictionValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getJurisdictionValueSet()
	 * @generated
	 */
	int JURISDICTION_VALUE_SET = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DefinitionUseCodes <em>Definition Use Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DefinitionUseCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDefinitionUseCodes()
	 * @generated
	 */
	int DEFINITION_USE_CODES = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDefinedType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFhirDefinedType()
	 * @generated
	 */
	int FHIR_DEFINED_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.LoincCodes <em>Loinc Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LoincCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getLoincCodes()
	 * @generated
	 */
	int LOINC_CODES = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommonLanguages <em>Common Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommonLanguages
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCommonLanguages()
	 * @generated
	 */
	int COMMON_LANGUAGES = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SignatureTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSignatureTypeCodes()
	 * @generated
	 */
	int SIGNATURE_TYPE_CODES = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V2036027 <em>V2036027</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V2036027
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV2036027()
	 * @generated
	 */
	int V2036027 = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TimingAbbreviation
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTimingAbbreviation()
	 * @generated
	 */
	int TIMING_ABBREVIATION = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubjectType <em>Subject Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubjectType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSubjectType()
	 * @generated
	 */
	int SUBJECT_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DesignationUse <em>Designation Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DesignationUse
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDesignationUse()
	 * @generated
	 */
	int DESIGNATION_USE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExpressionLanguage <em>Expression Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExpressionLanguage
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExpressionLanguage()
	 * @generated
	 */
	int EXPRESSION_LANGUAGE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdditionalDosageInstructions <em>Snomedct Additional Dosage Instructions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdditionalDosageInstructions
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctAdditionalDosageInstructions()
	 * @generated
	 */
	int SNOMEDCT_ADDITIONAL_DOSAGE_INSTRUCTIONS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationAsNeededReasonCodes <em>Snomedct Medication As Needed Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationAsNeededReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctMedicationAsNeededReasonCodes()
	 * @generated
	 */
	int SNOMEDCT_MEDICATION_AS_NEEDED_REASON_CODES = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes <em>Snomedct Anatomical Structure For Administration Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctAnatomicalStructureForAdministrationSiteCodes()
	 * @generated
	 */
	int SNOMEDCT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctRouteCodes <em>Snomedct Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctRouteCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctRouteCodes()
	 * @generated
	 */
	int SNOMEDCT_ROUTE_CODES = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdministrationMethodCodes <em>Snomedct Administration Method Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdministrationMethodCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctAdministrationMethodCodes()
	 * @generated
	 */
	int SNOMEDCT_ADMINISTRATION_METHOD_CODES = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DoseAndRateType <em>Dose And Rate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DoseAndRateType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDoseAndRateType()
	 * @generated
	 */
	int DOSE_AND_RATE_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AllSecurityLabels <em>All Security Labels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AllSecurityLabels
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAllSecurityLabels()
	 * @generated
	 */
	int ALL_SECURITY_LABELS = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommonTags <em>Common Tags</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommonTags
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCommonTags()
	 * @generated
	 */
	int COMMON_TAGS = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.OrganizationType <em>Organization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OrganizationType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContactEntityType <em>Contact Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContactEntityType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContactEntityType()
	 * @generated
	 */
	int CONTACT_ENTITY_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EndpointConnectionType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEndpointConnectionType()
	 * @generated
	 */
	int ENDPOINT_CONNECTION_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EndpointPayloadType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEndpointPayloadType()
	 * @generated
	 */
	int ENDPOINT_PAYLOAD_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.LibraryType <em>Library Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LibraryType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DefinitionTopic <em>Definition Topic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DefinitionTopic
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDefinitionTopic()
	 * @generated
	 */
	int DEFINITION_TOPIC = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureScoring <em>Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureScoring
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMeasureScoring()
	 * @generated
	 */
	int MEASURE_SCORING = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CompositeMeasureScoring
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCompositeMeasureScoring()
	 * @generated
	 */
	int COMPOSITE_MEASURE_SCORING = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureType <em>Measure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasurePopulationType <em>Measure Population Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasurePopulationType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMeasurePopulationType()
	 * @generated
	 */
	int MEASURE_POPULATION_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureDataUsage
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMeasureDataUsage()
	 * @generated
	 */
	int MEASURE_DATA_USAGE = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MaritalStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMaritalStatusCodes()
	 * @generated
	 */
	int MARITAL_STATUS_CODES = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientContactRelationship <em>Patient Contact Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientContactRelationship
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPatientContactRelationship()
	 * @generated
	 */
	int PATIENT_CONTACT_RELATIONSHIP = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleUseCodesForList
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleUseCodesForList()
	 * @generated
	 */
	int EXAMPLE_USE_CODES_FOR_LIST = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActEncounterCode <em>V3 Act Encounter Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActEncounterCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActEncounterCode()
	 * @generated
	 */
	int V3_ACT_ENCOUNTER_CODE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EncounterType <em>Encounter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EncounterType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEncounterType()
	 * @generated
	 */
	int ENCOUNTER_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActPriority <em>V3 Act Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActPriority
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActPriority()
	 * @generated
	 */
	int V3_ACT_PRIORITY = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EpisodeOfCareType <em>Episode Of Care Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EpisodeOfCareType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEpisodeOfCareType()
	 * @generated
	 */
	int EPISODE_OF_CARE_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionCategoryCodes()
	 * @generated
	 */
	int CONDITION_CATEGORY_CODES = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionDiagnosisSeverity
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionDiagnosisSeverity()
	 * @generated
	 */
	int CONDITION_DIAGNOSIS_SEVERITY = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionProblemDiagnosisCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionProblemDiagnosisCodes()
	 * @generated
	 */
	int CONDITION_PROBLEM_DIAGNOSIS_CODES = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctBodyStructures <em>Snomedct Body Structures</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctBodyStructures
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctBodyStructures()
	 * @generated
	 */
	int SNOMEDCT_BODY_STRUCTURES = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionStage <em>Condition Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionStage
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionStage()
	 * @generated
	 */
	int CONDITION_STAGE = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.InvestigationType <em>Investigation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.InvestigationType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getInvestigationType()
	 * @generated
	 */
	int INVESTIGATION_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PlanDefinitionType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPlanDefinitionType()
	 * @generated
	 */
	int PLAN_DEFINITION_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalCategory <em>Goal Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getGoalCategory()
	 * @generated
	 */
	int GOAL_CATEGORY = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindings <em>Snomedct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindings
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctClinicalFindings()
	 * @generated
	 */
	int SNOMEDCT_CLINICAL_FINDINGS = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalPriority <em>Goal Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalPriority
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getGoalPriority()
	 * @generated
	 */
	int GOAL_PRIORITY = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalStartEvent <em>Goal Start Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalStartEvent
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getGoalStartEvent()
	 * @generated
	 */
	int GOAL_START_EVENT = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ActionParticipantRole <em>Action Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ActionParticipantRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getActionParticipantRole()
	 * @generated
	 */
	int ACTION_PARTICIPANT_ROLE = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ActionType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CarePlanCategory <em>Care Plan Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CarePlanCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCarePlanCategory()
	 * @generated
	 */
	int CARE_PLAN_CATEGORY = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CareTeamCategory <em>Care Team Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CareTeamCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCareTeamCategory()
	 * @generated
	 */
	int CARE_TEAM_CATEGORY = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipantRoles <em>Participant Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipantRoles
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getParticipantRoles()
	 * @generated
	 */
	int PARTICIPANT_ROLES = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalAchievementStatus <em>Goal Achievement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalAchievementStatus
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getGoalAchievementStatus()
	 * @generated
	 */
	int GOAL_ACHIEVEMENT_STATUS = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CarePlanActivityOutcome <em>Care Plan Activity Outcome</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CarePlanActivityOutcome
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCarePlanActivityOutcome()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_OUTCOME = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AppointmentCancellationReason <em>Appointment Cancellation Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AppointmentCancellationReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAppointmentCancellationReason()
	 * @generated
	 */
	int APPOINTMENT_CANCELLATION_REASON = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceCategory <em>Service Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PracticeSettingCodeValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPracticeSettingCodeValueSet()
	 * @generated
	 */
	int PRACTICE_SETTING_CODE_VALUE_SET = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20276 <em>V20276</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20276
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20276()
	 * @generated
	 */
	int V20276 = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EncounterReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEncounterReasonCodes()
	 * @generated
	 */
	int ENCOUNTER_REASON_CODES = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCodesSnomedcT <em>Procedure Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCodesSnomedcT
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_CODES_SNOMEDC_T = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20116 <em>V20116</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20116
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20116()
	 * @generated
	 */
	int V20116 = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ServiceDeliveryLocationRoleType <em>V3 Service Delivery Location Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ServiceDeliveryLocationRoleType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ServiceDeliveryLocationRoleType()
	 * @generated
	 */
	int V3_SERVICE_DELIVERY_LOCATION_ROLE_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LocationType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationCodes <em>Snomedct Medication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctMedicationCodes()
	 * @generated
	 */
	int SNOMEDCT_MEDICATION_CODES = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20487 <em>V20487</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20487
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20487()
	 * @generated
	 */
	int V20487 = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PreparePatient <em>Prepare Patient</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PreparePatient
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPreparePatient()
	 * @generated
	 */
	int PREPARE_PATIENT = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenCollection <em>Specimen Collection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenCollection
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSpecimenCollection()
	 * @generated
	 */
	int SPECIMEN_COLLECTION = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContainerMaterials <em>Container Materials</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContainerMaterials
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContainerMaterials()
	 * @generated
	 */
	int CONTAINER_MATERIALS = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenContainerType <em>Specimen Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenContainerType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSpecimenContainerType()
	 * @generated
	 */
	int SPECIMEN_CONTAINER_TYPE = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContainerCap <em>Container Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContainerCap
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContainerCap()
	 * @generated
	 */
	int CONTAINER_CAP = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20371 <em>V20371</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20371
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20371()
	 * @generated
	 */
	int V20371 = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.RejectionCriterion <em>Rejection Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RejectionCriterion
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getRejectionCriterion()
	 * @generated
	 */
	int REJECTION_CRITERION = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.HandlingConditionSet <em>Handling Condition Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.HandlingConditionSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getHandlingConditionSet()
	 * @generated
	 */
	int HANDLING_CONDITION_SET = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObservationCategoryCodes()
	 * @generated
	 */
	int OBSERVATION_CATEGORY_CODES = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationMethods <em>Observation Methods</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationMethods
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObservationMethods()
	 * @generated
	 */
	int OBSERVATION_METHODS = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.UcumCodes <em>Ucum Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UcumCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getUcumCodes()
	 * @generated
	 */
	int UCUM_CODES = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeMeaningCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObservationReferenceRangeMeaningCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_MEANING_CODES = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeAppliesToCodes <em>Observation Reference Range Applies To Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeAppliesToCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObservationReferenceRangeAppliesToCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_APPLIES_TO_CODES = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestCategoryCodes <em>Service Request Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getServiceRequestCategoryCodes()
	 * @generated
	 */
	int SERVICE_REQUEST_CATEGORY_CODES = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestOrderDetailsCodes <em>Service Request Order Details Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestOrderDetailsCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getServiceRequestOrderDetailsCodes()
	 * @generated
	 */
	int SERVICE_REQUEST_ORDER_DETAILS_CODES = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureReasonCodes()
	 * @generated
	 */
	int PROCEDURE_REASON_CODES = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageTypeAndSelfPayCodes <em>Coverage Type And Self Pay Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageTypeAndSelfPayCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCoverageTypeAndSelfPayCodes()
	 * @generated
	 */
	int COVERAGE_TYPE_AND_SELF_PAY_CODES = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubscriberRelationshipCodes <em>Subscriber Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubscriberRelationshipCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSubscriberRelationshipCodes()
	 * @generated
	 */
	int SUBSCRIBER_RELATIONSHIP_CODES = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageClassCodes <em>Coverage Class Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageClassCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCoverageClassCodes()
	 * @generated
	 */
	int COVERAGE_CLASS_CODES = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageCopayTypeCodes <em>Coverage Copay Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageCopayTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCoverageCopayTypeCodes()
	 * @generated
	 */
	int COVERAGE_COPAY_TYPE_CODES = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleCoverageFinancialExceptionCodes <em>Example Coverage Financial Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleCoverageFinancialExceptionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleCoverageFinancialExceptionCodes()
	 * @generated
	 */
	int EXAMPLE_COVERAGE_FINANCIAL_EXCEPTION_CODES = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceLegalStateCodes <em>Contract Resource Legal State Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceLegalStateCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceLegalStateCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_LEGAL_STATE_CODES = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractContentDerivationCodes <em>Contract Content Derivation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractContentDerivationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractContentDerivationCodes()
	 * @generated
	 */
	int CONTRACT_CONTENT_DERIVATION_CODES = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceExpirationTypeCodes <em>Contract Resource Expiration Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceExpirationTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceExpirationTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_EXPIRATION_TYPE_CODES = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodes <em>Contract Resource Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractTypeCodes()
	 * @generated
	 */
	int CONTRACT_TYPE_CODES = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractSubtypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_SUBTYPE_CODES = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionTypeCodes <em>Contract Resource Definition Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceDefinitionTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DEFINITION_TYPE_CODES = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionSubtypeCodes <em>Contract Resource Definition Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionSubtypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceDefinitionSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DEFINITION_SUBTYPE_CODES = 100;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTermTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 101;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTermSubtypeCodes <em>Contract Term Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTermSubtypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractTermSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_SUBTYPE_CODES = 102;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesA <em>Contract Resource Scope Codes A</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesA
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodesA()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES_A = 103;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesB <em>Contract Resource Scope Codes B</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesB
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceScopeCodesB()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SCOPE_CODES_B = 104;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceSecurityControlCodes <em>Contract Resource Security Control Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceSecurityControlCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceSecurityControlCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_SECURITY_CONTROL_CODES = 105;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourcePartyRoleCodes <em>Contract Resource Party Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourcePartyRoleCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourcePartyRoleCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_PARTY_ROLE_CODES = 106;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActConsentDirective <em>V3 Act Consent Directive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActConsentDirective
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActConsentDirective()
	 * @generated
	 */
	int V3_ACT_CONSENT_DIRECTIVE = 107;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDecisionModeCodes <em>Contract Resource Decision Mode Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDecisionModeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceDecisionModeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_DECISION_MODE_CODES = 108;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetScopeCodes <em>Contract Resource Asset Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetScopeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetScopeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_SCOPE_CODES = 109;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetTypeCodes <em>Contract Resource Asset Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_TYPE_CODES = 110;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetSubTypeCodes <em>Contract Resource Asset Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetSubTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetSubTypeCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_SUB_TYPE_CODES = 111;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentClass <em>Consent Content Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentClass
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentContentClass()
	 * @generated
	 */
	int CONSENT_CONTENT_CLASS = 112;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetContextCodes <em>Contract Resource Asset Context Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetContextCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetContextCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_CONTEXT_CODES = 113;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetAvailiabilityCodes <em>Contract Resource Asset Availiability Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetAvailiabilityCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceAssetAvailiabilityCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ASSET_AVAILIABILITY_CODES = 114;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractActionCodes <em>Contract Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractActionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractActionCodes()
	 * @generated
	 */
	int CONTRACT_ACTION_CODES = 115;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractActorRoleCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractActorRoleCodes()
	 * @generated
	 */
	int CONTRACT_ACTOR_ROLE_CODES = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3PurposeOfUse <em>V3 Purpose Of Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3PurposeOfUse
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3PurposeOfUse()
	 * @generated
	 */
	int V3_PURPOSE_OF_USE = 117;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceActionStatusCodes <em>Contract Resource Action Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceActionStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractResourceActionStatusCodes()
	 * @generated
	 */
	int CONTRACT_RESOURCE_ACTION_STATUS_CODES = 118;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantType <em>Provenance Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProvenanceParticipantType()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_TYPE = 119;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProvenanceParticipantRole()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_ROLE = 120;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientRelationshipType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPatientRelationshipType()
	 * @generated
	 */
	int PATIENT_RELATIONSHIP_TYPE = 121;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceActivityType <em>Provenance Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceActivityType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProvenanceActivityType()
	 * @generated
	 */
	int PROVENANCE_ACTIVITY_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SecurityRoleType <em>Security Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SecurityRoleType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSecurityRoleType()
	 * @generated
	 */
	int SECURITY_ROLE_TYPE = 123;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractSignerTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getContractSignerTypeCodes()
	 * @generated
	 */
	int CONTRACT_SIGNER_TYPE_CODES = 124;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirSpecimenCollectionMethod <em>Fhir Specimen Collection Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirSpecimenCollectionMethod
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFhirSpecimenCollectionMethod()
	 * @generated
	 */
	int FHIR_SPECIMEN_COLLECTION_METHOD = 125;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20916 <em>V20916</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20916
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20916()
	 * @generated
	 */
	int V20916 = 126;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenProcessingProcedure <em>Specimen Processing Procedure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenProcessingProcedure
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSpecimenProcessingProcedure()
	 * @generated
	 */
	int SPECIMEN_PROCESSING_PROCEDURE = 127;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSubstanceCategoryCodes()
	 * @generated
	 */
	int SUBSTANCE_CATEGORY_CODES = 128;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCode <em>Substance Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSubstanceCode()
	 * @generated
	 */
	int SUBSTANCE_CODE = 129;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20493 <em>V20493</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20493
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20493()
	 * @generated
	 */
	int V20493 = 130;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipantType <em>Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipantType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 131;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctReasonMedicationNotGivenCodes <em>Snomedct Reason Medication Not Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctReasonMedicationNotGivenCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctReasonMedicationNotGivenCodes()
	 * @generated
	 */
	int SNOMEDCT_REASON_MEDICATION_NOT_GIVEN_CODES = 132;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationCategoryCodes <em>Medication Administration Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationAdministrationCategoryCodes()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_CATEGORY_CODES = 133;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationPerformerFunctionCodes <em>Medication Administration Performer Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationPerformerFunctionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationAdministrationPerformerFunctionCodes()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_PERFORMER_FUNCTION_CODES = 134;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ReasonMedicationGivenCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getReasonMedicationGivenCodes()
	 * @generated
	 */
	int REASON_MEDICATION_GIVEN_CODES = 135;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestStatusReasonCodes <em>Medication Request Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestStatusReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestStatusReasonCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_STATUS_REASON_CODES = 136;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCategoryCodes <em>Medication Request Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestCategoryCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_CATEGORY_CODES = 137;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedurePerformerRoleCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedurePerformerRoleCodes()
	 * @generated
	 */
	int PROCEDURE_PERFORMER_ROLE_CODES = 138;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCourseOfTherapyCodes <em>Medication Request Course Of Therapy Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCourseOfTherapyCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationRequestCourseOfTherapyCodes()
	 * @generated
	 */
	int MEDICATION_REQUEST_COURSE_OF_THERAPY_CODES = 139;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActSubstanceAdminSubstitutionCode <em>V3 Act Substance Admin Substitution Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActSubstanceAdminSubstitutionCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActSubstanceAdminSubstitutionCode()
	 * @generated
	 */
	int V3_ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE = 140;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3SubstanceAdminSubstitutionReason <em>V3 Substance Admin Substitution Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3SubstanceAdminSubstitutionReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3SubstanceAdminSubstitutionReason()
	 * @generated
	 */
	int V3_SUBSTANCE_ADMIN_SUBSTITUTION_REASON = 141;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueCategory()
	 * @generated
	 */
	int DETECTED_ISSUE_CATEGORY = 142;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ManifestationAndSymptomCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getManifestationAndSymptomCodes()
	 * @generated
	 */
	int MANIFESTATION_AND_SYMPTOM_CODES = 143;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueMitigationAction
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDetectedIssueMitigationAction()
	 * @generated
	 */
	int DETECTED_ISSUE_MITIGATION_ACTION = 144;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceTypes <em>Fhir Device Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceTypes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFhirDeviceTypes()
	 * @generated
	 */
	int FHIR_DEVICE_TYPES = 145;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceSafety <em>Device Safety</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceSafety
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDeviceSafety()
	 * @generated
	 */
	int DEVICE_SAFETY = 146;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceStatusReason <em>Fhir Device Status Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceStatusReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFhirDeviceStatusReason()
	 * @generated
	 */
	int FHIR_DEVICE_STATUS_REASON = 147;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceType <em>Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 148;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DataAbsentReason <em>Data Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DataAbsentReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDataAbsentReason()
	 * @generated
	 */
	int DATA_ABSENT_REASON = 149;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationInterpretationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObservationInterpretationCodes()
	 * @generated
	 */
	int OBSERVATION_INTERPRETATION_CODES = 150;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentClassValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDocumentClassValueSet()
	 * @generated
	 */
	int DOCUMENT_CLASS_VALUE_SET = 151;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentReferenceFormatCodeSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDocumentReferenceFormatCodeSet()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_FORMAT_CODE_SET = 152;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActCode <em>V3 Act Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActCode()
	 * @generated
	 */
	int V3_ACT_CODE = 153;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FacilityTypeCodeValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFacilityTypeCodeValueSet()
	 * @generated
	 */
	int FACILITY_TYPE_CODE_VALUE_SET = 154;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClinicalImpressionPrognosis
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getClinicalImpressionPrognosis()
	 * @generated
	 */
	int CLINICAL_IMPRESSION_PROGNOSIS = 155;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.RiskProbability <em>Risk Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RiskProbability
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getRiskProbability()
	 * @generated
	 */
	int RISK_PROBABILITY = 156;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionStageType <em>Condition Stage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionStageType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionStageType()
	 * @generated
	 */
	int CONDITION_STAGE_TYPE = 157;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DiagnosisRole <em>Diagnosis Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DiagnosisRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDiagnosisRole()
	 * @generated
	 */
	int DIAGNOSIS_ROLE = 158;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AccountTypes <em>Account Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AccountTypes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAccountTypes()
	 * @generated
	 */
	int ACCOUNT_TYPES = 159;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdmitSource <em>Admit Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdmitSource
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdmitSource()
	 * @generated
	 */
	int ADMIT_SOURCE = 160;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20092 <em>V20092</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20092
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV20092()
	 * @generated
	 */
	int V20092 = 161;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Diet <em>Diet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Diet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDiet()
	 * @generated
	 */
	int DIET = 162;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecialCourtesy <em>Special Courtesy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecialCourtesy
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSpecialCourtesy()
	 * @generated
	 */
	int SPECIAL_COURTESY = 163;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecialArrangements <em>Special Arrangements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecialArrangements
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSpecialArrangements()
	 * @generated
	 */
	int SPECIAL_ARRANGEMENTS = 164;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DischargeDisposition <em>Discharge Disposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DischargeDisposition
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDischargeDisposition()
	 * @generated
	 */
	int DISCHARGE_DISPOSITION = 165;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ListOrderCodes <em>List Order Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ListOrderCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getListOrderCodes()
	 * @generated
	 */
	int LIST_ORDER_CODES = 166;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientMedicineChangeTypes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPatientMedicineChangeTypes()
	 * @generated
	 */
	int PATIENT_MEDICINE_CHANGE_TYPES = 167;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ListEmptyReasons
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getListEmptyReasons()
	 * @generated
	 */
	int LIST_EMPTY_REASONS = 168;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPrimaryPurposeType <em>Research Study Primary Purpose Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPrimaryPurposeType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getResearchStudyPrimaryPurposeType()
	 * @generated
	 */
	int RESEARCH_STUDY_PRIMARY_PURPOSE_TYPE = 169;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPhase <em>Research Study Phase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPhase
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getResearchStudyPhase()
	 * @generated
	 */
	int RESEARCH_STUDY_PHASE = 170;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyReasonStopped <em>Research Study Reason Stopped</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyReasonStopped
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getResearchStudyReasonStopped()
	 * @generated
	 */
	int RESEARCH_STUDY_REASON_STOPPED = 171;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyObjectiveType <em>Research Study Objective Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyObjectiveType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getResearchStudyObjectiveType()
	 * @generated
	 */
	int RESEARCH_STUDY_OBJECTIVE_TYPE = 172;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentScopeCodes <em>Consent Scope Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentScopeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentScopeCodes()
	 * @generated
	 */
	int CONSENT_SCOPE_CODES = 173;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentCategoryCodes()
	 * @generated
	 */
	int CONSENT_CATEGORY_CODES = 174;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentPolicyRuleCodes <em>Consent Policy Rule Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentPolicyRuleCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentPolicyRuleCodes()
	 * @generated
	 */
	int CONSENT_POLICY_RULE_CODES = 175;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentActionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentActionCodes()
	 * @generated
	 */
	int CONSENT_ACTION_CODES = 176;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConsentContentCodes()
	 * @generated
	 */
	int CONSENT_CONTENT_CODES = 177;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ChargeItemCode <em>Charge Item Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ChargeItemCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getChargeItemCode()
	 * @generated
	 */
	int CHARGE_ITEM_CODE = 178;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctFormCodes <em>Snomedct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctFormCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctFormCodes()
	 * @generated
	 */
	int SNOMEDCT_FORM_CODES = 179;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.IcD10Codes <em>Ic D10 Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IcD10Codes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getIcD10Codes()
	 * @generated
	 */
	int IC_D10_CODES = 180;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DiagnosticServiceSectionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDiagnosticServiceSectionCodes()
	 * @generated
	 */
	int DIAGNOSTIC_SERVICE_SECTION_CODES = 181;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LoincDiagnosticReportCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getLoincDiagnosticReportCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_REPORT_CODES = 182;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AcquisitionModality <em>Acquisition Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AcquisitionModality
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAcquisitionModality()
	 * @generated
	 */
	int ACQUISITION_MODALITY = 183;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureNotPerformedReasonSnomeDCT <em>Procedure Not Performed Reason Snome DCT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureNotPerformedReasonSnomeDCT
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureNotPerformedReasonSnomeDCT()
	 * @generated
	 */
	int PROCEDURE_NOT_PERFORMED_REASON_SNOME_DCT = 184;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCategoryCodesSnomedcT <em>Procedure Category Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCategoryCodesSnomedcT
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureCategoryCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_CATEGORY_CODES_SNOMEDC_T = 185;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureOutcomeCodesSnomedcT <em>Procedure Outcome Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureOutcomeCodesSnomedcT
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureOutcomeCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_OUTCOME_CODES_SNOMEDC_T = 186;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureFollowUpCodesSnomedcT <em>Procedure Follow Up Codes Snomedc T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureFollowUpCodesSnomedcT
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureFollowUpCodesSnomedcT()
	 * @generated
	 */
	int PROCEDURE_FOLLOW_UP_CODES_SNOMEDC_T = 187;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureDeviceActionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcedureDeviceActionCodes()
	 * @generated
	 */
	int PROCEDURE_DEVICE_ACTION_CODES = 188;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Laterality <em>Laterality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Laterality
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getLaterality()
	 * @generated
	 */
	int LATERALITY = 189;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImagingStudySeriesPerformerFunction <em>Imaging Study Series Performer Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImagingStudySeriesPerformerFunction
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImagingStudySeriesPerformerFunction()
	 * @generated
	 */
	int IMAGING_STUDY_SERIES_PERFORMER_FUNCTION = 190;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 191;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaModality <em>Media Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaModality
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMediaModality()
	 * @generated
	 */
	int MEDIA_MODALITY = 192;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaCollectionViewProjection
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMediaCollectionViewProjection()
	 * @generated
	 */
	int MEDIA_COLLECTION_VIEW_PROJECTION = 193;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationNotDoneReason <em>Communication Not Done Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationNotDoneReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCommunicationNotDoneReason()
	 * @generated
	 */
	int COMMUNICATION_NOT_DONE_REASON = 194;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationCategory <em>Communication Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCommunicationCategory()
	 * @generated
	 */
	int COMMUNICATION_CATEGORY = 195;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ParticipationMode <em>V3 Participation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ParticipationMode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ParticipationMode()
	 * @generated
	 */
	int V3_PARTICIPATION_MODE = 196;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationTopic <em>Communication Topic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationTopic
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCommunicationTopic()
	 * @generated
	 */
	int COMMUNICATION_TOPIC = 197;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimTypeCodes <em>Claim Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getClaimTypeCodes()
	 * @generated
	 */
	int CLAIM_TYPE_CODES = 198;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleClaimSubTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleClaimSubTypeCodes()
	 * @generated
	 */
	int EXAMPLE_CLAIM_SUB_TYPE_CODES = 199;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcessPriorityCodes <em>Process Priority Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcessPriorityCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProcessPriorityCodes()
	 * @generated
	 */
	int PROCESS_PRIORITY_CODES = 200;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FundsReservationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFundsReservationCodes()
	 * @generated
	 */
	int FUNDS_RESERVATION_CODES = 201;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleRelatedClaimRelationshipCodes()
	 * @generated
	 */
	int EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES = 202;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimPayeeTypeCodes <em>Claim Payee Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimPayeeTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getClaimPayeeTypeCodes()
	 * @generated
	 */
	int CLAIM_PAYEE_TYPE_CODES = 203;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimCareTeamRoleCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getClaimCareTeamRoleCodes()
	 * @generated
	 */
	int CLAIM_CARE_TEAM_ROLE_CODES = 204;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProviderQualificationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleProviderQualificationCodes()
	 * @generated
	 */
	int EXAMPLE_PROVIDER_QUALIFICATION_CODES = 205;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimInformationCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getClaimInformationCategoryCodes()
	 * @generated
	 */
	int CLAIM_INFORMATION_CATEGORY_CODES = 206;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExceptionCodes <em>Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExceptionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExceptionCodes()
	 * @generated
	 */
	int EXCEPTION_CODES = 207;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MissingToothReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMissingToothReasonCodes()
	 * @generated
	 */
	int MISSING_TOOTH_REASON_CODES = 208;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisTypeCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_TYPE_CODES = 209;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisOnAdmissionCodes <em>Example Diagnosis On Admission Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisOnAdmissionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisOnAdmissionCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_ON_ADMISSION_CODES = 210;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleDiagnosisRelatedGroupCodes()
	 * @generated
	 */
	int EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES = 211;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProcedureTypeCodes <em>Example Procedure Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProcedureTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleProcedureTypeCodes()
	 * @generated
	 */
	int EXAMPLE_PROCEDURE_TYPE_CODES = 212;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IcD10ProcedureCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getIcD10ProcedureCodes()
	 * @generated
	 */
	int IC_D10_PROCEDURE_CODES = 213;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActIncidentCode <em>V3 Act Incident Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActIncidentCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActIncidentCode()
	 * @generated
	 */
	int V3_ACT_INCIDENT_CODE = 214;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleRevenueCenterCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleRevenueCenterCodes()
	 * @generated
	 */
	int EXAMPLE_REVENUE_CENTER_CODES = 215;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getBenefitCategoryCodes()
	 * @generated
	 */
	int BENEFIT_CATEGORY_CODES = 216;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.UsclsCodes <em>Uscls Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UsclsCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getUsclsCodes()
	 * @generated
	 */
	int USCLS_CODES = 217;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ModifierTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getModifierTypeCodes()
	 * @generated
	 */
	int MODIFIER_TYPE_CODES = 218;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProgramReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleProgramReasonCodes()
	 * @generated
	 */
	int EXAMPLE_PROGRAM_REASON_CODES = 219;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleServicePlaceCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleServicePlaceCodes()
	 * @generated
	 */
	int EXAMPLE_SERVICE_PLACE_CODES = 220;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.OralSiteCodes <em>Oral Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OralSiteCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getOralSiteCodes()
	 * @generated
	 */
	int ORAL_SITE_CODES = 221;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SurfaceCodes <em>Surface Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SurfaceCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSurfaceCodes()
	 * @generated
	 */
	int SURFACE_CODES = 222;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationValueCodes <em>Adjudication Value Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationValueCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdjudicationValueCodes()
	 * @generated
	 */
	int ADJUDICATION_VALUE_CODES = 223;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdjudicationReasonCodes()
	 * @generated
	 */
	int ADJUDICATION_REASON_CODES = 224;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExamplePaymentTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExamplePaymentTypeCodes()
	 * @generated
	 */
	int EXAMPLE_PAYMENT_TYPE_CODES = 225;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentAdjustmentReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPaymentAdjustmentReasonCodes()
	 * @generated
	 */
	int PAYMENT_ADJUSTMENT_REASON_CODES = 226;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FormCodes <em>Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FormCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFormCodes()
	 * @generated
	 */
	int FORM_CODES = 227;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActReason <em>V3 Act Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActReason()
	 * @generated
	 */
	int V3_ACT_REASON = 228;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationErrorCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdjudicationErrorCodes()
	 * @generated
	 */
	int ADJUDICATION_ERROR_CODES = 229;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceProvisionConditions
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getServiceProvisionConditions()
	 * @generated
	 */
	int SERVICE_PROVISION_CONDITIONS = 230;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Program <em>Program</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Program
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 231;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ReferralMethod <em>Referral Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ReferralMethod
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getReferralMethod()
	 * @generated
	 */
	int REFERRAL_METHOD = 232;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMorphologicAbnormalities <em>Snomedct Morphologic Abnormalities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMorphologicAbnormalities
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctMorphologicAbnormalities()
	 * @generated
	 */
	int SNOMEDCT_MORPHOLOGIC_ABNORMALITIES = 233;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.BodystructureLocationQualifier <em>Bodystructure Location Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BodystructureLocationQualifier
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getBodystructureLocationQualifier()
	 * @generated
	 */
	int BODYSTRUCTURE_LOCATION_QUALIFIER = 234;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TaskCode <em>Task Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TaskCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTaskCode()
	 * @generated
	 */
	int TASK_CODE = 235;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireQuestionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireQuestionCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_QUESTION_CODES = 236;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireAnswerCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getQuestionnaireAnswerCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_ANSWER_CODES = 237;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.NetworkTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getNetworkTypeCodes()
	 * @generated
	 */
	int NETWORK_TYPE_CODES = 238;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UnitTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getUnitTypeCodes()
	 * @generated
	 */
	int UNIT_TYPE_CODES = 239;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitTermCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getBenefitTermCodes()
	 * @generated
	 */
	int BENEFIT_TERM_CODES = 240;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getBenefitTypeCodes()
	 * @generated
	 */
	int BENEFIT_TYPE_CODES = 241;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.VitalSigns <em>Vital Signs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.VitalSigns
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getVitalSigns()
	 * @generated
	 */
	int VITAL_SIGNS = 242;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceMetricAndComponentTypes <em>Device Metric And Component Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceMetricAndComponentTypes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDeviceMetricAndComponentTypes()
	 * @generated
	 */
	int DEVICE_METRIC_AND_COMPONENT_TYPES = 243;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FlagCategory <em>Flag Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FlagCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFlagCategory()
	 * @generated
	 */
	int FLAG_CATEGORY = 244;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FlagCode <em>Flag Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FlagCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFlagCode()
	 * @generated
	 */
	int FLAG_CODE = 245;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationTargetDiseaseCodes <em>Immunization Evaluation Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationTargetDiseaseCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_TARGET_DISEASE_CODES = 246;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationStatusReasonCodes <em>Immunization Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationStatusReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationStatusReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_STATUS_REASON_CODES = 247;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.VaccineAdministeredValueSet
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getVaccineAdministeredValueSet()
	 * @generated
	 */
	int VACCINE_ADMINISTERED_VALUE_SET = 248;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationOriginCodes <em>Immunization Origin Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationOriginCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationOriginCodes()
	 * @generated
	 */
	int IMMUNIZATION_ORIGIN_CODES = 249;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CodesForImmunizationSiteOfAdministration
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCodesForImmunizationSiteOfAdministration()
	 * @generated
	 */
	int CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION = 250;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRouteCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationRouteCodes()
	 * @generated
	 */
	int IMMUNIZATION_ROUTE_CODES = 251;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFunctionCodes <em>Immunization Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFunctionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationFunctionCodes()
	 * @generated
	 */
	int IMMUNIZATION_FUNCTION_CODES = 252;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASON_CODES = 253;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationSubpotentReason <em>Immunization Subpotent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationSubpotentReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationSubpotentReason()
	 * @generated
	 */
	int IMMUNIZATION_SUBPOTENT_REASON = 254;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationProgramEligibility <em>Immunization Program Eligibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationProgramEligibility
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationProgramEligibility()
	 * @generated
	 */
	int IMMUNIZATION_PROGRAM_ELIGIBILITY = 255;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFundingSource <em>Immunization Funding Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFundingSource
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationFundingSource()
	 * @generated
	 */
	int IMMUNIZATION_FUNDING_SOURCE = 256;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationTargetDiseaseCodes <em>Immunization Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationTargetDiseaseCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_TARGET_DISEASE_CODES = 257;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusCodes <em>Immunization Evaluation Dose Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationDoseStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_DOSE_STATUS_CODES = 258;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusReasonCodes <em>Immunization Evaluation Dose Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationEvaluationDoseStatusReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_EVALUATION_DOSE_STATUS_REASON_CODES = 259;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OperationOutcomeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getOperationOutcomeCodes()
	 * @generated
	 */
	int OPERATION_OUTCOME_CODES = 260;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPaymentTypeCodes()
	 * @generated
	 */
	int PAYMENT_TYPE_CODES = 261;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PractitionerRole <em>Practitioner Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PractitionerRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPractitionerRole()
	 * @generated
	 */
	int PRACTITIONER_ROLE = 262;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FamilyHistoryAbsentReason <em>Family History Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FamilyHistoryAbsentReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFamilyHistoryAbsentReason()
	 * @generated
	 */
	int FAMILY_HISTORY_ABSENT_REASON = 263;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3FamilyMember <em>V3 Family Member</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3FamilyMember
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3FamilyMember()
	 * @generated
	 */
	int V3_FAMILY_MEMBER = 264;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionOutcomeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getConditionOutcomeCodes()
	 * @generated
	 */
	int CONDITION_OUTCOME_CODES = 265;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.OrganizationAffiliationRole <em>Organization Affiliation Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OrganizationAffiliationRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getOrganizationAffiliationRole()
	 * @generated
	 */
	int ORGANIZATION_AFFILIATION_ROLE = 266;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCategory <em>Adverse Event Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCategory
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCategory()
	 * @generated
	 */
	int ADVERSE_EVENT_CATEGORY = 267;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindingsA <em>Snomedct Clinical Findings A</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindingsA
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctClinicalFindingsA()
	 * @generated
	 */
	int SNOMEDCT_CLINICAL_FINDINGS_A = 268;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventSeriousness <em>Adverse Event Seriousness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventSeriousness
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdverseEventSeriousness()
	 * @generated
	 */
	int ADVERSE_EVENT_SERIOUSNESS = 269;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityAssessment <em>Adverse Event Causality Assessment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityAssessment
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCausalityAssessment()
	 * @generated
	 */
	int ADVERSE_EVENT_CAUSALITY_ASSESSMENT = 270;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityMethod <em>Adverse Event Causality Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityMethod
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAdverseEventCausalityMethod()
	 * @generated
	 */
	int ADVERSE_EVENT_CAUSALITY_METHOD = 271;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SynthesisType <em>Synthesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SynthesisType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSynthesisType()
	 * @generated
	 */
	int SYNTHESIS_TYPE = 272;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.StudyType <em>Study Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.StudyType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getStudyType()
	 * @generated
	 */
	int STUDY_TYPE = 273;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.RiskEstimateType <em>Risk Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RiskEstimateType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getRiskEstimateType()
	 * @generated
	 */
	int RISK_ESTIMATE_TYPE = 274;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PrecisionEstimateType <em>Precision Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PrecisionEstimateType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPrecisionEstimateType()
	 * @generated
	 */
	int PRECISION_ESTIMATE_TYPE = 275;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.QualityOfEvidenceRating <em>Quality Of Evidence Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QualityOfEvidenceRating
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getQualityOfEvidenceRating()
	 * @generated
	 */
	int QUALITY_OF_EVIDENCE_RATING = 276;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentType <em>Certainty Subcomponent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCertaintySubcomponentType()
	 * @generated
	 */
	int CERTAINTY_SUBCOMPONENT_TYPE = 277;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentRating <em>Certainty Subcomponent Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentRating
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCertaintySubcomponentRating()
	 * @generated
	 */
	int CERTAINTY_SUBCOMPONENT_RATING = 278;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileOriginType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileOriginType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_ORIGIN_TYPE = 279;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileDestinationType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTestScriptProfileDestinationType()
	 * @generated
	 */
	int TEST_SCRIPT_PROFILE_DESTINATION_TYPE = 280;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.RestfulSecurityService <em>Restful Security Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RestfulSecurityService
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getRestfulSecurityService()
	 * @generated
	 */
	int RESTFUL_SECURITY_SERVICE = 281;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MessageTransport <em>Message Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MessageTransport
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMessageTransport()
	 * @generated
	 */
	int MESSAGE_TRANSPORT = 282;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MessageEvent <em>Message Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MessageEvent
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 283;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptOperationCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTestScriptOperationCode()
	 * @generated
	 */
	int TEST_SCRIPT_OPERATION_CODE = 284;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleMessageReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleMessageReasonCodes()
	 * @generated
	 */
	int EXAMPLE_MESSAGE_REASON_CODES = 285;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPaymentStatusCodes()
	 * @generated
	 */
	int PAYMENT_STATUS_CODES = 286;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDocumentTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFhirDocumentTypeCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_TYPE_CODES = 287;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentSectionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDocumentSectionCodes()
	 * @generated
	 */
	int DOCUMENT_SECTION_CODES = 288;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplyType <em>Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplyType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSupplyType()
	 * @generated
	 */
	int SUPPLY_TYPE = 289;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctSupplyItem <em>Snomedct Supply Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctSupplyItem
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctSupplyItem()
	 * @generated
	 */
	int SNOMEDCT_SUPPLY_ITEM = 290;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplyRequestReason
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSupplyRequestReason()
	 * @generated
	 */
	int SUPPLY_REQUEST_REASON = 291;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EvidenceVariantState <em>Evidence Variant State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EvidenceVariantState
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEvidenceVariantState()
	 * @generated
	 */
	int EVIDENCE_VARIANT_STATE = 292;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EffectEstimateType <em>Effect Estimate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EffectEstimateType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEffectEstimateType()
	 * @generated
	 */
	int EFFECT_ESTIMATE_TYPE = 293;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.InsurancePlanType <em>Insurance Plan Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.InsurancePlanType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getInsurancePlanType()
	 * @generated
	 */
	int INSURANCE_PLAN_TYPE = 294;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceHistoryRecordActivityCodes <em>Provenance History Record Activity Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceHistoryRecordActivityCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getProvenanceHistoryRecordActivityCodes()
	 * @generated
	 */
	int PROVENANCE_HISTORY_RECORD_ACTIVITY_CODES = 295;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Chromosomehuman <em>Chromosomehuman</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Chromosomehuman
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getChromosomehuman()
	 * @generated
	 */
	int CHROMOSOMEHUMAN = 296;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Ensembl <em>Ensembl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Ensembl
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEnsembl()
	 * @generated
	 */
	int ENSEMBL = 297;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FdAStandardSequence <em>Fd AStandard Sequence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FdAStandardSequence
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFdAStandardSequence()
	 * @generated
	 */
	int FD_ASTANDARD_SEQUENCE = 298;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FdAMethod <em>Fd AMethod</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FdAMethod
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFdAMethod()
	 * @generated
	 */
	int FD_AMETHOD = 299;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAllergyIntoleranceSubstanceProductConditionAndNegationCodes()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES = 300;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CatalogType <em>Catalog Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CatalogType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCatalogType()
	 * @generated
	 */
	int CATALOG_TYPE = 301;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationTargetDiseaseCodes <em>Immunization Recommendation Target Disease Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationTargetDiseaseCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationTargetDiseaseCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_TARGET_DISEASE_CODES = 302;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_STATUS_CODES = 303;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationReasonCodes <em>Immunization Recommendation Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_REASON_CODES = 304;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getImmunizationRecommendationDateCriterionCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES = 305;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Need <em>Need</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Need
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getNeed()
	 * @generated
	 */
	int NEED = 306;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationtype <em>Validationtype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationtype
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getValidationtype()
	 * @generated
	 */
	int VALIDATIONTYPE = 307;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationprocess <em>Validationprocess</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationprocess
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getValidationprocess()
	 * @generated
	 */
	int VALIDATIONPROCESS = 308;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Failureaction <em>Failureaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Failureaction
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFailureaction()
	 * @generated
	 */
	int FAILUREACTION = 309;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Primarysourcetype <em>Primarysourcetype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Primarysourcetype
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPrimarysourcetype()
	 * @generated
	 */
	int PRIMARYSOURCETYPE = 310;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Verificationresultcommunicationmethod <em>Verificationresultcommunicationmethod</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Verificationresultcommunicationmethod
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getVerificationresultcommunicationmethod()
	 * @generated
	 */
	int VERIFICATIONRESULTCOMMUNICATIONMETHOD = 311;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationstatus <em>Validationstatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationstatus
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getValidationstatus()
	 * @generated
	 */
	int VALIDATIONSTATUS = 312;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Canpushupdates <em>Canpushupdates</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Canpushupdates
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCanpushupdates()
	 * @generated
	 */
	int CANPUSHUPDATES = 313;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.Pushtypeavailable <em>Pushtypeavailable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Pushtypeavailable
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getPushtypeavailable()
	 * @generated
	 */
	int PUSHTYPEAVAILABLE = 314;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FoodTypeCodes <em>Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FoodTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFoodTypeCodes()
	 * @generated
	 */
	int FOOD_TYPE_CODES = 315;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.DietCodes <em>Diet Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DietCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getDietCodes()
	 * @generated
	 */
	int DIET_CODES = 316;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.NutrientModifierCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getNutrientModifierCodes()
	 * @generated
	 */
	int NUTRIENT_MODIFIER_CODES = 317;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TextureModifierCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTextureModifierCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIER_CODES = 318;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TextureModifiedFoodTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getTextureModifiedFoodTypeCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIED_FOOD_TYPE_CODES = 319;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FluidConsistencyTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getFluidConsistencyTypeCodes()
	 * @generated
	 */
	int FLUID_CONSISTENCY_TYPE_CODES = 320;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplementTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSupplementTypeCodes()
	 * @generated
	 */
	int SUPPLEMENT_TYPE_CODES = 321;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaTypeCodes()
	 * @generated
	 */
	int ENTERAL_FORMULA_TYPE_CODES = 322;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaAdditiveTypeCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEnteralFormulaAdditiveTypeCode()
	 * @generated
	 */
	int ENTERAL_FORMULA_ADDITIVE_TYPE_CODE = 323;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralRouteCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getEnteralRouteCodes()
	 * @generated
	 */
	int ENTERAL_ROUTE_CODES = 324;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctDrugTherapyStatusCodes <em>Snomedct Drug Therapy Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctDrugTherapyStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getSnomedctDrugTherapyStatusCodes()
	 * @generated
	 */
	int SNOMEDCT_DRUG_THERAPY_STATUS_CODES = 325;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationStatusCodes <em>Medication Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationStatusCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationStatusCodes()
	 * @generated
	 */
	int MEDICATION_STATUS_CODES = 326;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventId <em>Audit Event Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventId
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAuditEventId()
	 * @generated
	 */
	int AUDIT_EVENT_ID = 327;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSubType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAuditEventSubType()
	 * @generated
	 */
	int AUDIT_EVENT_SUB_TYPE = 328;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipationRoleType <em>Participation Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipationRoleType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getParticipationRoleType()
	 * @generated
	 */
	int PARTICIPATION_ROLE_TYPE = 329;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaTypeCode <em>Media Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaTypeCode
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMediaTypeCode()
	 * @generated
	 */
	int MEDIA_TYPE_CODE = 330;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSourceType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAuditEventSourceType()
	 * @generated
	 */
	int AUDIT_EVENT_SOURCE_TYPE = 331;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityType()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_TYPE = 332;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityRole
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getAuditEventEntityRole()
	 * @generated
	 */
	int AUDIT_EVENT_ENTITY_ROLE = 333;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObjectLifecycleEvents <em>Object Lifecycle Events</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObjectLifecycleEvents
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getObjectLifecycleEvents()
	 * @generated
	 */
	int OBJECT_LIFECYCLE_EVENTS = 334;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BasicResourceTypes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getBasicResourceTypes()
	 * @generated
	 */
	int BASIC_RESOURCE_TYPES = 335;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleVisionPrescriptionProductCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getExampleVisionPrescriptionProductCodes()
	 * @generated
	 */
	int EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES = 336;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseStatusReasonCodes <em>Medication Dispense Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseStatusReasonCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationDispenseStatusReasonCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_STATUS_REASON_CODES = 337;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseCategoryCodes <em>Medication Dispense Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseCategoryCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationDispenseCategoryCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_CATEGORY_CODES = 338;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispensePerformerFunctionCodes <em>Medication Dispense Performer Function Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispensePerformerFunctionCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationDispensePerformerFunctionCodes()
	 * @generated
	 */
	int MEDICATION_DISPENSE_PERFORMER_FUNCTION_CODES = 339;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActPharmacySupplyType <em>V3 Act Pharmacy Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActPharmacySupplyType
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getV3ActPharmacySupplyType()
	 * @generated
	 */
	int V3_ACT_PHARMACY_SUPPLY_TYPE = 340;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgePackageTypeCodes <em>Medication Knowledge Package Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgePackageTypeCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationKnowledgePackageTypeCodes()
	 * @generated
	 */
	int MEDICATION_KNOWLEDGE_PACKAGE_TYPE_CODES = 341;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgeCharacteristicCodes <em>Medication Knowledge Characteristic Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgeCharacteristicCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getMedicationKnowledgeCharacteristicCodes()
	 * @generated
	 */
	int MEDICATION_KNOWLEDGE_CHARACTERISTIC_CODES = 342;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageEligibilityResponseAuthSupportCodes <em>Coverage Eligibility Response Auth Support Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageEligibilityResponseAuthSupportCodes
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl#getCoverageEligibilityResponseAuthSupportCodes()
	 * @generated
	 */
	int COVERAGE_ELIGIBILITY_RESPONSE_AUTH_SUPPORT_CODES = 343;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.IdentifierTypeCodes <em>Identifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IdentifierTypeCodes
	 * @generated
	 */
	EEnum getIdentifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.UsageContextType <em>Usage Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Context Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UsageContextType
	 * @generated
	 */
	EEnum getUsageContextType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContextOfUseValueSet <em>Context Of Use Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Of Use Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContextOfUseValueSet
	 * @generated
	 */
	EEnum getContextOfUseValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.JurisdictionValueSet <em>Jurisdiction Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jurisdiction Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.JurisdictionValueSet
	 * @generated
	 */
	EEnum getJurisdictionValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DefinitionUseCodes <em>Definition Use Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Use Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DefinitionUseCodes
	 * @generated
	 */
	EEnum getDefinitionUseCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDefinedType <em>Fhir Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Defined Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDefinedType
	 * @generated
	 */
	EEnum getFhirDefinedType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.LoincCodes <em>Loinc Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LoincCodes
	 * @generated
	 */
	EEnum getLoincCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommonLanguages <em>Common Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Languages</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommonLanguages
	 * @generated
	 */
	EEnum getCommonLanguages();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SignatureTypeCodes <em>Signature Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signature Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SignatureTypeCodes
	 * @generated
	 */
	EEnum getSignatureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V2036027 <em>V2036027</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2036027</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V2036027
	 * @generated
	 */
	EEnum getV2036027();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TimingAbbreviation <em>Timing Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Abbreviation</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TimingAbbreviation
	 * @generated
	 */
	EEnum getTimingAbbreviation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subject Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubjectType
	 * @generated
	 */
	EEnum getSubjectType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DesignationUse <em>Designation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Designation Use</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DesignationUse
	 * @generated
	 */
	EEnum getDesignationUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Language</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExpressionLanguage
	 * @generated
	 */
	EEnum getExpressionLanguage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdditionalDosageInstructions <em>Snomedct Additional Dosage Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Additional Dosage Instructions</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdditionalDosageInstructions
	 * @generated
	 */
	EEnum getSnomedctAdditionalDosageInstructions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationAsNeededReasonCodes <em>Snomedct Medication As Needed Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Medication As Needed Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationAsNeededReasonCodes
	 * @generated
	 */
	EEnum getSnomedctMedicationAsNeededReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes <em>Snomedct Anatomical Structure For Administration Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Anatomical Structure For Administration Site Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAnatomicalStructureForAdministrationSiteCodes
	 * @generated
	 */
	EEnum getSnomedctAnatomicalStructureForAdministrationSiteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctRouteCodes <em>Snomedct Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Route Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctRouteCodes
	 * @generated
	 */
	EEnum getSnomedctRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdministrationMethodCodes <em>Snomedct Administration Method Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Administration Method Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctAdministrationMethodCodes
	 * @generated
	 */
	EEnum getSnomedctAdministrationMethodCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DoseAndRateType <em>Dose And Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dose And Rate Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DoseAndRateType
	 * @generated
	 */
	EEnum getDoseAndRateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AllSecurityLabels <em>All Security Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Security Labels</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AllSecurityLabels
	 * @generated
	 */
	EEnum getAllSecurityLabels();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommonTags <em>Common Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Tags</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommonTags
	 * @generated
	 */
	EEnum getCommonTags();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OrganizationType
	 * @generated
	 */
	EEnum getOrganizationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContactEntityType <em>Contact Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Entity Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContactEntityType
	 * @generated
	 */
	EEnum getContactEntityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EndpointConnectionType <em>Endpoint Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Connection Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EndpointConnectionType
	 * @generated
	 */
	EEnum getEndpointConnectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EndpointPayloadType <em>Endpoint Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Payload Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EndpointPayloadType
	 * @generated
	 */
	EEnum getEndpointPayloadType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LibraryType
	 * @generated
	 */
	EEnum getLibraryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DefinitionTopic <em>Definition Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Topic</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DefinitionTopic
	 * @generated
	 */
	EEnum getDefinitionTopic();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureScoring <em>Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Scoring</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureScoring
	 * @generated
	 */
	EEnum getMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CompositeMeasureScoring <em>Composite Measure Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Measure Scoring</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CompositeMeasureScoring
	 * @generated
	 */
	EEnum getCompositeMeasureScoring();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureType
	 * @generated
	 */
	EEnum getMeasureType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasurePopulationType <em>Measure Population Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Population Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasurePopulationType
	 * @generated
	 */
	EEnum getMeasurePopulationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MeasureDataUsage <em>Measure Data Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Data Usage</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MeasureDataUsage
	 * @generated
	 */
	EEnum getMeasureDataUsage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MaritalStatusCodes <em>Marital Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marital Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MaritalStatusCodes
	 * @generated
	 */
	EEnum getMaritalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientContactRelationship <em>Patient Contact Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Contact Relationship</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientContactRelationship
	 * @generated
	 */
	EEnum getPatientContactRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleUseCodesForList <em>Example Use Codes For List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Use Codes For List</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleUseCodesForList
	 * @generated
	 */
	EEnum getExampleUseCodesForList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActEncounterCode <em>V3 Act Encounter Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Encounter Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActEncounterCode
	 * @generated
	 */
	EEnum getV3ActEncounterCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EncounterType <em>Encounter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EncounterType
	 * @generated
	 */
	EEnum getEncounterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActPriority <em>V3 Act Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Priority</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActPriority
	 * @generated
	 */
	EEnum getV3ActPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EpisodeOfCareType <em>Episode Of Care Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Episode Of Care Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EpisodeOfCareType
	 * @generated
	 */
	EEnum getEpisodeOfCareType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionCategoryCodes <em>Condition Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionCategoryCodes
	 * @generated
	 */
	EEnum getConditionCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Diagnosis Severity</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionDiagnosisSeverity
	 * @generated
	 */
	EEnum getConditionDiagnosisSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Problem Diagnosis Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionProblemDiagnosisCodes
	 * @generated
	 */
	EEnum getConditionProblemDiagnosisCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctBodyStructures <em>Snomedct Body Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Body Structures</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctBodyStructures
	 * @generated
	 */
	EEnum getSnomedctBodyStructures();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionStage
	 * @generated
	 */
	EEnum getConditionStage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.InvestigationType <em>Investigation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Investigation Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.InvestigationType
	 * @generated
	 */
	EEnum getInvestigationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PlanDefinitionType <em>Plan Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Definition Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PlanDefinitionType
	 * @generated
	 */
	EEnum getPlanDefinitionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalCategory <em>Goal Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalCategory
	 * @generated
	 */
	EEnum getGoalCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindings <em>Snomedct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Clinical Findings</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindings
	 * @generated
	 */
	EEnum getSnomedctClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalPriority <em>Goal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Priority</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalPriority
	 * @generated
	 */
	EEnum getGoalPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalStartEvent <em>Goal Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Start Event</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalStartEvent
	 * @generated
	 */
	EEnum getGoalStartEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ActionParticipantRole <em>Action Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Participant Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ActionParticipantRole
	 * @generated
	 */
	EEnum getActionParticipantRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CarePlanCategory <em>Care Plan Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CarePlanCategory
	 * @generated
	 */
	EEnum getCarePlanCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CareTeamCategory <em>Care Team Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Team Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CareTeamCategory
	 * @generated
	 */
	EEnum getCareTeamCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipantRoles <em>Participant Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Roles</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipantRoles
	 * @generated
	 */
	EEnum getParticipantRoles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.GoalAchievementStatus <em>Goal Achievement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Achievement Status</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.GoalAchievementStatus
	 * @generated
	 */
	EEnum getGoalAchievementStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CarePlanActivityOutcome <em>Care Plan Activity Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Outcome</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CarePlanActivityOutcome
	 * @generated
	 */
	EEnum getCarePlanActivityOutcome();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AppointmentCancellationReason <em>Appointment Cancellation Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Cancellation Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AppointmentCancellationReason
	 * @generated
	 */
	EEnum getAppointmentCancellationReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceCategory
	 * @generated
	 */
	EEnum getServiceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practice Setting Code Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PracticeSettingCodeValueSet
	 * @generated
	 */
	EEnum getPracticeSettingCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20276 <em>V20276</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20276</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20276
	 * @generated
	 */
	EEnum getV20276();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EncounterReasonCodes <em>Encounter Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EncounterReasonCodes
	 * @generated
	 */
	EEnum getEncounterReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCodesSnomedcT <em>Procedure Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Codes Snomedc T</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20116 <em>V20116</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20116</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20116
	 * @generated
	 */
	EEnum getV20116();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ServiceDeliveryLocationRoleType <em>V3 Service Delivery Location Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Service Delivery Location Role Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ServiceDeliveryLocationRoleType
	 * @generated
	 */
	EEnum getV3ServiceDeliveryLocationRoleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationCodes <em>Snomedct Medication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Medication Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMedicationCodes
	 * @generated
	 */
	EEnum getSnomedctMedicationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20487 <em>V20487</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20487</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20487
	 * @generated
	 */
	EEnum getV20487();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PreparePatient <em>Prepare Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prepare Patient</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PreparePatient
	 * @generated
	 */
	EEnum getPreparePatient();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenCollection <em>Specimen Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Collection</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenCollection
	 * @generated
	 */
	EEnum getSpecimenCollection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContainerMaterials <em>Container Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Materials</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContainerMaterials
	 * @generated
	 */
	EEnum getContainerMaterials();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenContainerType <em>Specimen Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Container Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenContainerType
	 * @generated
	 */
	EEnum getSpecimenContainerType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContainerCap <em>Container Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Cap</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContainerCap
	 * @generated
	 */
	EEnum getContainerCap();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20371 <em>V20371</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20371</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20371
	 * @generated
	 */
	EEnum getV20371();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.RejectionCriterion <em>Rejection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rejection Criterion</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RejectionCriterion
	 * @generated
	 */
	EEnum getRejectionCriterion();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.HandlingConditionSet <em>Handling Condition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handling Condition Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.HandlingConditionSet
	 * @generated
	 */
	EEnum getHandlingConditionSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationCategoryCodes <em>Observation Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationCategoryCodes
	 * @generated
	 */
	EEnum getObservationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationMethods <em>Observation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Methods</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationMethods
	 * @generated
	 */
	EEnum getObservationMethods();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.UcumCodes <em>Ucum Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ucum Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UcumCodes
	 * @generated
	 */
	EEnum getUcumCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Meaning Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeMeaningCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeMeaningCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeAppliesToCodes <em>Observation Reference Range Applies To Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Applies To Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationReferenceRangeAppliesToCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeAppliesToCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestCategoryCodes <em>Service Request Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Request Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestCategoryCodes
	 * @generated
	 */
	EEnum getServiceRequestCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestOrderDetailsCodes <em>Service Request Order Details Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Request Order Details Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceRequestOrderDetailsCodes
	 * @generated
	 */
	EEnum getServiceRequestOrderDetailsCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureReasonCodes <em>Procedure Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureReasonCodes
	 * @generated
	 */
	EEnum getProcedureReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageTypeAndSelfPayCodes <em>Coverage Type And Self Pay Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Type And Self Pay Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageTypeAndSelfPayCodes
	 * @generated
	 */
	EEnum getCoverageTypeAndSelfPayCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubscriberRelationshipCodes <em>Subscriber Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscriber Relationship Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubscriberRelationshipCodes
	 * @generated
	 */
	EEnum getSubscriberRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageClassCodes <em>Coverage Class Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Class Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageClassCodes
	 * @generated
	 */
	EEnum getCoverageClassCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageCopayTypeCodes <em>Coverage Copay Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Copay Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageCopayTypeCodes
	 * @generated
	 */
	EEnum getCoverageCopayTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleCoverageFinancialExceptionCodes <em>Example Coverage Financial Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Coverage Financial Exception Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleCoverageFinancialExceptionCodes
	 * @generated
	 */
	EEnum getExampleCoverageFinancialExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceLegalStateCodes <em>Contract Resource Legal State Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Legal State Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceLegalStateCodes
	 * @generated
	 */
	EEnum getContractResourceLegalStateCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractContentDerivationCodes <em>Contract Content Derivation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Content Derivation Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractContentDerivationCodes
	 * @generated
	 */
	EEnum getContractContentDerivationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceExpirationTypeCodes <em>Contract Resource Expiration Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Expiration Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceExpirationTypeCodes
	 * @generated
	 */
	EEnum getContractResourceExpirationTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodes <em>Contract Resource Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodes
	 * @generated
	 */
	EEnum getContractResourceScopeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTypeCodes <em>Contract Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTypeCodes
	 * @generated
	 */
	EEnum getContractTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractSubtypeCodes <em>Contract Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Subtype Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractSubtypeCodes
	 * @generated
	 */
	EEnum getContractSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionTypeCodes <em>Contract Resource Definition Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Definition Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionTypeCodes
	 * @generated
	 */
	EEnum getContractResourceDefinitionTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionSubtypeCodes <em>Contract Resource Definition Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Definition Subtype Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDefinitionSubtypeCodes
	 * @generated
	 */
	EEnum getContractResourceDefinitionSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractTermSubtypeCodes <em>Contract Term Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Subtype Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractTermSubtypeCodes
	 * @generated
	 */
	EEnum getContractTermSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesA <em>Contract Resource Scope Codes A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes A</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesA
	 * @generated
	 */
	EEnum getContractResourceScopeCodesA();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesB <em>Contract Resource Scope Codes B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Scope Codes B</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceScopeCodesB
	 * @generated
	 */
	EEnum getContractResourceScopeCodesB();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceSecurityControlCodes <em>Contract Resource Security Control Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Security Control Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceSecurityControlCodes
	 * @generated
	 */
	EEnum getContractResourceSecurityControlCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourcePartyRoleCodes <em>Contract Resource Party Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Party Role Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourcePartyRoleCodes
	 * @generated
	 */
	EEnum getContractResourcePartyRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActConsentDirective <em>V3 Act Consent Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Consent Directive</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActConsentDirective
	 * @generated
	 */
	EEnum getV3ActConsentDirective();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDecisionModeCodes <em>Contract Resource Decision Mode Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Decision Mode Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceDecisionModeCodes
	 * @generated
	 */
	EEnum getContractResourceDecisionModeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetScopeCodes <em>Contract Resource Asset Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Scope Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetScopeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetScopeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetTypeCodes <em>Contract Resource Asset Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetTypeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetSubTypeCodes <em>Contract Resource Asset Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Sub Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetSubTypeCodes
	 * @generated
	 */
	EEnum getContractResourceAssetSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentClass <em>Consent Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Class</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentClass
	 * @generated
	 */
	EEnum getConsentContentClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetContextCodes <em>Contract Resource Asset Context Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Context Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetContextCodes
	 * @generated
	 */
	EEnum getContractResourceAssetContextCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetAvailiabilityCodes <em>Contract Resource Asset Availiability Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Asset Availiability Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceAssetAvailiabilityCodes
	 * @generated
	 */
	EEnum getContractResourceAssetAvailiabilityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractActionCodes <em>Contract Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Action Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractActionCodes
	 * @generated
	 */
	EEnum getContractActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Actor Role Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractActorRoleCodes
	 * @generated
	 */
	EEnum getContractActorRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3PurposeOfUse <em>V3 Purpose Of Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Purpose Of Use</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3PurposeOfUse
	 * @generated
	 */
	EEnum getV3PurposeOfUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceActionStatusCodes <em>Contract Resource Action Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Resource Action Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractResourceActionStatusCodes
	 * @generated
	 */
	EEnum getContractResourceActionStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantType <em>Provenance Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantType
	 * @generated
	 */
	EEnum getProvenanceParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantRole <em>Provenance Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceParticipantRole
	 * @generated
	 */
	EEnum getProvenanceParticipantRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientRelationshipType <em>Patient Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Relationship Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientRelationshipType
	 * @generated
	 */
	EEnum getPatientRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceActivityType <em>Provenance Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Activity Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceActivityType
	 * @generated
	 */
	EEnum getProvenanceActivityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SecurityRoleType <em>Security Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Role Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SecurityRoleType
	 * @generated
	 */
	EEnum getSecurityRoleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Signer Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ContractSignerTypeCodes
	 * @generated
	 */
	EEnum getContractSignerTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirSpecimenCollectionMethod <em>Fhir Specimen Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Specimen Collection Method</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirSpecimenCollectionMethod
	 * @generated
	 */
	EEnum getFhirSpecimenCollectionMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20916 <em>V20916</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20916</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20916
	 * @generated
	 */
	EEnum getV20916();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecimenProcessingProcedure <em>Specimen Processing Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Processing Procedure</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecimenProcessingProcedure
	 * @generated
	 */
	EEnum getSpecimenProcessingProcedure();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCategoryCodes <em>Substance Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCategoryCodes
	 * @generated
	 */
	EEnum getSubstanceCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCode <em>Substance Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SubstanceCode
	 * @generated
	 */
	EEnum getSubstanceCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20493 <em>V20493</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20493</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20493
	 * @generated
	 */
	EEnum getV20493();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipantType
	 * @generated
	 */
	EEnum getParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctReasonMedicationNotGivenCodes <em>Snomedct Reason Medication Not Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Reason Medication Not Given Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctReasonMedicationNotGivenCodes
	 * @generated
	 */
	EEnum getSnomedctReasonMedicationNotGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationCategoryCodes <em>Medication Administration Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationCategoryCodes
	 * @generated
	 */
	EEnum getMedicationAdministrationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationPerformerFunctionCodes <em>Medication Administration Performer Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Performer Function Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationAdministrationPerformerFunctionCodes
	 * @generated
	 */
	EEnum getMedicationAdministrationPerformerFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Medication Given Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ReasonMedicationGivenCodes
	 * @generated
	 */
	EEnum getReasonMedicationGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestStatusReasonCodes <em>Medication Request Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestStatusReasonCodes
	 * @generated
	 */
	EEnum getMedicationRequestStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCategoryCodes <em>Medication Request Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCategoryCodes
	 * @generated
	 */
	EEnum getMedicationRequestCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Performer Role Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedurePerformerRoleCodes
	 * @generated
	 */
	EEnum getProcedurePerformerRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCourseOfTherapyCodes <em>Medication Request Course Of Therapy Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Request Course Of Therapy Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationRequestCourseOfTherapyCodes
	 * @generated
	 */
	EEnum getMedicationRequestCourseOfTherapyCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActSubstanceAdminSubstitutionCode <em>V3 Act Substance Admin Substitution Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Substance Admin Substitution Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActSubstanceAdminSubstitutionCode
	 * @generated
	 */
	EEnum getV3ActSubstanceAdminSubstitutionCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3SubstanceAdminSubstitutionReason <em>V3 Substance Admin Substitution Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Substance Admin Substitution Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3SubstanceAdminSubstitutionReason
	 * @generated
	 */
	EEnum getV3SubstanceAdminSubstitutionReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueCategory <em>Detected Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueCategory
	 * @generated
	 */
	EEnum getDetectedIssueCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manifestation And Symptom Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ManifestationAndSymptomCodes
	 * @generated
	 */
	EEnum getManifestationAndSymptomCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Mitigation Action</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DetectedIssueMitigationAction
	 * @generated
	 */
	EEnum getDetectedIssueMitigationAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceTypes <em>Fhir Device Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Device Types</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceTypes
	 * @generated
	 */
	EEnum getFhirDeviceTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceSafety <em>Device Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Safety</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceSafety
	 * @generated
	 */
	EEnum getDeviceSafety();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceStatusReason <em>Fhir Device Status Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Device Status Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDeviceStatusReason
	 * @generated
	 */
	EEnum getFhirDeviceStatusReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceType
	 * @generated
	 */
	EEnum getDeviceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DataAbsentReason <em>Data Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Absent Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DataAbsentReason
	 * @generated
	 */
	EEnum getDataAbsentReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Interpretation Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObservationInterpretationCodes
	 * @generated
	 */
	EEnum getObservationInterpretationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentClassValueSet <em>Document Class Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Class Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentClassValueSet
	 * @generated
	 */
	EEnum getDocumentClassValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Format Code Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentReferenceFormatCodeSet
	 * @generated
	 */
	EEnum getDocumentReferenceFormatCodeSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActCode <em>V3 Act Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActCode
	 * @generated
	 */
	EEnum getV3ActCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Type Code Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FacilityTypeCodeValueSet
	 * @generated
	 */
	EEnum getFacilityTypeCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClinicalImpressionPrognosis <em>Clinical Impression Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clinical Impression Prognosis</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClinicalImpressionPrognosis
	 * @generated
	 */
	EEnum getClinicalImpressionPrognosis();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.RiskProbability <em>Risk Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Probability</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RiskProbability
	 * @generated
	 */
	EEnum getRiskProbability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionStageType <em>Condition Stage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionStageType
	 * @generated
	 */
	EEnum getConditionStageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DiagnosisRole <em>Diagnosis Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnosis Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DiagnosisRole
	 * @generated
	 */
	EEnum getDiagnosisRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AccountTypes <em>Account Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Types</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AccountTypes
	 * @generated
	 */
	EEnum getAccountTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdmitSource <em>Admit Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Admit Source</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdmitSource
	 * @generated
	 */
	EEnum getAdmitSource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V20092 <em>V20092</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V20092</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V20092
	 * @generated
	 */
	EEnum getV20092();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Diet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Diet
	 * @generated
	 */
	EEnum getDiet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecialCourtesy <em>Special Courtesy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Courtesy</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecialCourtesy
	 * @generated
	 */
	EEnum getSpecialCourtesy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SpecialArrangements <em>Special Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Arrangements</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SpecialArrangements
	 * @generated
	 */
	EEnum getSpecialArrangements();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DischargeDisposition <em>Discharge Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discharge Disposition</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DischargeDisposition
	 * @generated
	 */
	EEnum getDischargeDisposition();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ListOrderCodes <em>List Order Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Order Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ListOrderCodes
	 * @generated
	 */
	EEnum getListOrderCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Medicine Change Types</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PatientMedicineChangeTypes
	 * @generated
	 */
	EEnum getPatientMedicineChangeTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ListEmptyReasons <em>List Empty Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Empty Reasons</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ListEmptyReasons
	 * @generated
	 */
	EEnum getListEmptyReasons();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPrimaryPurposeType <em>Research Study Primary Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Primary Purpose Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPrimaryPurposeType
	 * @generated
	 */
	EEnum getResearchStudyPrimaryPurposeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPhase <em>Research Study Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Phase</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyPhase
	 * @generated
	 */
	EEnum getResearchStudyPhase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyReasonStopped <em>Research Study Reason Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Reason Stopped</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyReasonStopped
	 * @generated
	 */
	EEnum getResearchStudyReasonStopped();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyObjectiveType <em>Research Study Objective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Research Study Objective Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ResearchStudyObjectiveType
	 * @generated
	 */
	EEnum getResearchStudyObjectiveType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentScopeCodes <em>Consent Scope Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Scope Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentScopeCodes
	 * @generated
	 */
	EEnum getConsentScopeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentCategoryCodes <em>Consent Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentCategoryCodes
	 * @generated
	 */
	EEnum getConsentCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentPolicyRuleCodes <em>Consent Policy Rule Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Policy Rule Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentPolicyRuleCodes
	 * @generated
	 */
	EEnum getConsentPolicyRuleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentActionCodes <em>Consent Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Action Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentActionCodes
	 * @generated
	 */
	EEnum getConsentActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentCodes <em>Consent Content Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Content Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConsentContentCodes
	 * @generated
	 */
	EEnum getConsentContentCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ChargeItemCode <em>Charge Item Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Item Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ChargeItemCode
	 * @generated
	 */
	EEnum getChargeItemCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctFormCodes <em>Snomedct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Form Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctFormCodes
	 * @generated
	 */
	EEnum getSnomedctFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.IcD10Codes <em>Ic D10 Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IcD10Codes
	 * @generated
	 */
	EEnum getIcD10Codes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Service Section Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DiagnosticServiceSectionCodes
	 * @generated
	 */
	EEnum getDiagnosticServiceSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Report Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.LoincDiagnosticReportCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticReportCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AcquisitionModality <em>Acquisition Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acquisition Modality</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AcquisitionModality
	 * @generated
	 */
	EEnum getAcquisitionModality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureNotPerformedReasonSnomeDCT <em>Procedure Not Performed Reason Snome DCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Not Performed Reason Snome DCT</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureNotPerformedReasonSnomeDCT
	 * @generated
	 */
	EEnum getProcedureNotPerformedReasonSnomeDCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCategoryCodesSnomedcT <em>Procedure Category Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Category Codes Snomedc T</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureCategoryCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureCategoryCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureOutcomeCodesSnomedcT <em>Procedure Outcome Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Outcome Codes Snomedc T</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureOutcomeCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureOutcomeCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureFollowUpCodesSnomedcT <em>Procedure Follow Up Codes Snomedc T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Follow Up Codes Snomedc T</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureFollowUpCodesSnomedcT
	 * @generated
	 */
	EEnum getProcedureFollowUpCodesSnomedcT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Device Action Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcedureDeviceActionCodes
	 * @generated
	 */
	EEnum getProcedureDeviceActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Laterality <em>Laterality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Laterality</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Laterality
	 * @generated
	 */
	EEnum getLaterality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImagingStudySeriesPerformerFunction <em>Imaging Study Series Performer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Imaging Study Series Performer Function</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImagingStudySeriesPerformerFunction
	 * @generated
	 */
	EEnum getImagingStudySeriesPerformerFunction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaModality <em>Media Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Modality</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaModality
	 * @generated
	 */
	EEnum getMediaModality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaCollectionViewProjection <em>Media Collection View Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Collection View Projection</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaCollectionViewProjection
	 * @generated
	 */
	EEnum getMediaCollectionViewProjection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationNotDoneReason <em>Communication Not Done Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Not Done Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationNotDoneReason
	 * @generated
	 */
	EEnum getCommunicationNotDoneReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationCategory <em>Communication Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationCategory
	 * @generated
	 */
	EEnum getCommunicationCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ParticipationMode <em>V3 Participation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Participation Mode</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ParticipationMode
	 * @generated
	 */
	EEnum getV3ParticipationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CommunicationTopic <em>Communication Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Topic</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CommunicationTopic
	 * @generated
	 */
	EEnum getCommunicationTopic();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimTypeCodes <em>Claim Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimTypeCodes
	 * @generated
	 */
	EEnum getClaimTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleClaimSubTypeCodes <em>Example Claim Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Claim Sub Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleClaimSubTypeCodes
	 * @generated
	 */
	EEnum getExampleClaimSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProcessPriorityCodes <em>Process Priority Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Priority Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProcessPriorityCodes
	 * @generated
	 */
	EEnum getProcessPriorityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FundsReservationCodes <em>Funds Reservation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Funds Reservation Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FundsReservationCodes
	 * @generated
	 */
	EEnum getFundsReservationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleRelatedClaimRelationshipCodes <em>Example Related Claim Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Related Claim Relationship Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleRelatedClaimRelationshipCodes
	 * @generated
	 */
	EEnum getExampleRelatedClaimRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimPayeeTypeCodes <em>Claim Payee Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Payee Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimPayeeTypeCodes
	 * @generated
	 */
	EEnum getClaimPayeeTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimCareTeamRoleCodes <em>Claim Care Team Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Care Team Role Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimCareTeamRoleCodes
	 * @generated
	 */
	EEnum getClaimCareTeamRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProviderQualificationCodes <em>Example Provider Qualification Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Provider Qualification Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProviderQualificationCodes
	 * @generated
	 */
	EEnum getExampleProviderQualificationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ClaimInformationCategoryCodes <em>Claim Information Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Information Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ClaimInformationCategoryCodes
	 * @generated
	 */
	EEnum getClaimInformationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExceptionCodes <em>Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exception Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExceptionCodes
	 * @generated
	 */
	EEnum getExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Missing Tooth Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MissingToothReasonCodes
	 * @generated
	 */
	EEnum getMissingToothReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisTypeCodes <em>Example Diagnosis Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisTypeCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisOnAdmissionCodes <em>Example Diagnosis On Admission Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis On Admission Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisOnAdmissionCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisOnAdmissionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisRelatedGroupCodes <em>Example Diagnosis Related Group Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Diagnosis Related Group Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleDiagnosisRelatedGroupCodes
	 * @generated
	 */
	EEnum getExampleDiagnosisRelatedGroupCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProcedureTypeCodes <em>Example Procedure Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Procedure Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProcedureTypeCodes
	 * @generated
	 */
	EEnum getExampleProcedureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.IcD10ProcedureCodes <em>Ic D10 Procedure Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Procedure Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.IcD10ProcedureCodes
	 * @generated
	 */
	EEnum getIcD10ProcedureCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActIncidentCode <em>V3 Act Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Incident Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActIncidentCode
	 * @generated
	 */
	EEnum getV3ActIncidentCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleRevenueCenterCodes <em>Example Revenue Center Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Revenue Center Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleRevenueCenterCodes
	 * @generated
	 */
	EEnum getExampleRevenueCenterCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitCategoryCodes <em>Benefit Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitCategoryCodes
	 * @generated
	 */
	EEnum getBenefitCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.UsclsCodes <em>Uscls Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uscls Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UsclsCodes
	 * @generated
	 */
	EEnum getUsclsCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ModifierTypeCodes <em>Modifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ModifierTypeCodes
	 * @generated
	 */
	EEnum getModifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleProgramReasonCodes <em>Example Program Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Program Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleProgramReasonCodes
	 * @generated
	 */
	EEnum getExampleProgramReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Service Place Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleServicePlaceCodes
	 * @generated
	 */
	EEnum getExampleServicePlaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.OralSiteCodes <em>Oral Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oral Site Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OralSiteCodes
	 * @generated
	 */
	EEnum getOralSiteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SurfaceCodes <em>Surface Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surface Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SurfaceCodes
	 * @generated
	 */
	EEnum getSurfaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationValueCodes <em>Adjudication Value Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Value Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationValueCodes
	 * @generated
	 */
	EEnum getAdjudicationValueCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationReasonCodes
	 * @generated
	 */
	EEnum getAdjudicationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExamplePaymentTypeCodes <em>Example Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Payment Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExamplePaymentTypeCodes
	 * @generated
	 */
	EEnum getExamplePaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Adjustment Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentAdjustmentReasonCodes
	 * @generated
	 */
	EEnum getPaymentAdjustmentReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FormCodes <em>Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FormCodes
	 * @generated
	 */
	EEnum getFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActReason <em>V3 Act Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActReason
	 * @generated
	 */
	EEnum getV3ActReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Error Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdjudicationErrorCodes
	 * @generated
	 */
	EEnum getAdjudicationErrorCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ServiceProvisionConditions <em>Service Provision Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Provision Conditions</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ServiceProvisionConditions
	 * @generated
	 */
	EEnum getServiceProvisionConditions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Program
	 * @generated
	 */
	EEnum getProgram();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ReferralMethod <em>Referral Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Method</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ReferralMethod
	 * @generated
	 */
	EEnum getReferralMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMorphologicAbnormalities <em>Snomedct Morphologic Abnormalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Morphologic Abnormalities</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctMorphologicAbnormalities
	 * @generated
	 */
	EEnum getSnomedctMorphologicAbnormalities();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.BodystructureLocationQualifier <em>Bodystructure Location Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bodystructure Location Qualifier</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BodystructureLocationQualifier
	 * @generated
	 */
	EEnum getBodystructureLocationQualifier();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TaskCode <em>Task Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TaskCode
	 * @generated
	 */
	EEnum getTaskCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Question Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireQuestionCodes
	 * @generated
	 */
	EEnum getQuestionnaireQuestionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Answer Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QuestionnaireAnswerCodes
	 * @generated
	 */
	EEnum getQuestionnaireAnswerCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.NetworkTypeCodes <em>Network Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.NetworkTypeCodes
	 * @generated
	 */
	EEnum getNetworkTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.UnitTypeCodes <em>Unit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.UnitTypeCodes
	 * @generated
	 */
	EEnum getUnitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitTermCodes <em>Benefit Term Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Term Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitTermCodes
	 * @generated
	 */
	EEnum getBenefitTermCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.BenefitTypeCodes <em>Benefit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BenefitTypeCodes
	 * @generated
	 */
	EEnum getBenefitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.VitalSigns <em>Vital Signs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vital Signs</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.VitalSigns
	 * @generated
	 */
	EEnum getVitalSigns();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DeviceMetricAndComponentTypes <em>Device Metric And Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric And Component Types</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DeviceMetricAndComponentTypes
	 * @generated
	 */
	EEnum getDeviceMetricAndComponentTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FlagCategory <em>Flag Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FlagCategory
	 * @generated
	 */
	EEnum getFlagCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FlagCode <em>Flag Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FlagCode
	 * @generated
	 */
	EEnum getFlagCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationTargetDiseaseCodes <em>Immunization Evaluation Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Target Disease Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationStatusReasonCodes <em>Immunization Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationStatusReasonCodes
	 * @generated
	 */
	EEnum getImmunizationStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccine Administered Value Set</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.VaccineAdministeredValueSet
	 * @generated
	 */
	EEnum getVaccineAdministeredValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationOriginCodes <em>Immunization Origin Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Origin Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationOriginCodes
	 * @generated
	 */
	EEnum getImmunizationOriginCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Codes For Immunization Site Of Administration</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CodesForImmunizationSiteOfAdministration
	 * @generated
	 */
	EEnum getCodesForImmunizationSiteOfAdministration();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRouteCodes <em>Immunization Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Route Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRouteCodes
	 * @generated
	 */
	EEnum getImmunizationRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFunctionCodes <em>Immunization Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Function Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFunctionCodes
	 * @generated
	 */
	EEnum getImmunizationFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationSubpotentReason <em>Immunization Subpotent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Subpotent Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationSubpotentReason
	 * @generated
	 */
	EEnum getImmunizationSubpotentReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationProgramEligibility <em>Immunization Program Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Program Eligibility</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationProgramEligibility
	 * @generated
	 */
	EEnum getImmunizationProgramEligibility();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFundingSource <em>Immunization Funding Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Funding Source</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationFundingSource
	 * @generated
	 */
	EEnum getImmunizationFundingSource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationTargetDiseaseCodes <em>Immunization Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Target Disease Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusCodes <em>Immunization Evaluation Dose Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Dose Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationDoseStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusReasonCodes <em>Immunization Evaluation Dose Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Evaluation Dose Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationEvaluationDoseStatusReasonCodes
	 * @generated
	 */
	EEnum getImmunizationEvaluationDoseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.OperationOutcomeCodes <em>Operation Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Outcome Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OperationOutcomeCodes
	 * @generated
	 */
	EEnum getOperationOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentTypeCodes <em>Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentTypeCodes
	 * @generated
	 */
	EEnum getPaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PractitionerRole
	 * @generated
	 */
	EEnum getPractitionerRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FamilyHistoryAbsentReason <em>Family History Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family History Absent Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FamilyHistoryAbsentReason
	 * @generated
	 */
	EEnum getFamilyHistoryAbsentReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3FamilyMember <em>V3 Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Family Member</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3FamilyMember
	 * @generated
	 */
	EEnum getV3FamilyMember();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Outcome Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ConditionOutcomeCodes
	 * @generated
	 */
	EEnum getConditionOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.OrganizationAffiliationRole <em>Organization Affiliation Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Affiliation Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.OrganizationAffiliationRole
	 * @generated
	 */
	EEnum getOrganizationAffiliationRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCategory <em>Adverse Event Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Category</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCategory
	 * @generated
	 */
	EEnum getAdverseEventCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindingsA <em>Snomedct Clinical Findings A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Clinical Findings A</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctClinicalFindingsA
	 * @generated
	 */
	EEnum getSnomedctClinicalFindingsA();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventSeriousness <em>Adverse Event Seriousness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Seriousness</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventSeriousness
	 * @generated
	 */
	EEnum getAdverseEventSeriousness();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityAssessment <em>Adverse Event Causality Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Causality Assessment</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityAssessment
	 * @generated
	 */
	EEnum getAdverseEventCausalityAssessment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityMethod <em>Adverse Event Causality Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adverse Event Causality Method</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AdverseEventCausalityMethod
	 * @generated
	 */
	EEnum getAdverseEventCausalityMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SynthesisType <em>Synthesis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synthesis Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SynthesisType
	 * @generated
	 */
	EEnum getSynthesisType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.StudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Study Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.StudyType
	 * @generated
	 */
	EEnum getStudyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.RiskEstimateType <em>Risk Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Estimate Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RiskEstimateType
	 * @generated
	 */
	EEnum getRiskEstimateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PrecisionEstimateType <em>Precision Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precision Estimate Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PrecisionEstimateType
	 * @generated
	 */
	EEnum getPrecisionEstimateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.QualityOfEvidenceRating <em>Quality Of Evidence Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Of Evidence Rating</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.QualityOfEvidenceRating
	 * @generated
	 */
	EEnum getQualityOfEvidenceRating();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentType <em>Certainty Subcomponent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certainty Subcomponent Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentType
	 * @generated
	 */
	EEnum getCertaintySubcomponentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentRating <em>Certainty Subcomponent Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Certainty Subcomponent Rating</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CertaintySubcomponentRating
	 * @generated
	 */
	EEnum getCertaintySubcomponentRating();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileOriginType <em>Test Script Profile Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Origin Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileOriginType
	 * @generated
	 */
	EEnum getTestScriptProfileOriginType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileDestinationType <em>Test Script Profile Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Profile Destination Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptProfileDestinationType
	 * @generated
	 */
	EEnum getTestScriptProfileDestinationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.RestfulSecurityService <em>Restful Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Security Service</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.RestfulSecurityService
	 * @generated
	 */
	EEnum getRestfulSecurityService();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MessageTransport <em>Message Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Transport</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MessageTransport
	 * @generated
	 */
	EEnum getMessageTransport();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MessageEvent
	 * @generated
	 */
	EEnum getMessageEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TestScriptOperationCode <em>Test Script Operation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Operation Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TestScriptOperationCode
	 * @generated
	 */
	EEnum getTestScriptOperationCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Message Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleMessageReasonCodes
	 * @generated
	 */
	EEnum getExampleMessageReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.PaymentStatusCodes <em>Payment Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.PaymentStatusCodes
	 * @generated
	 */
	EEnum getPaymentStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FhirDocumentTypeCodes
	 * @generated
	 */
	EEnum getFhirDocumentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DocumentSectionCodes <em>Document Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Section Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DocumentSectionCodes
	 * @generated
	 */
	EEnum getDocumentSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplyType <em>Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplyType
	 * @generated
	 */
	EEnum getSupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctSupplyItem <em>Snomedct Supply Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Supply Item</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctSupplyItem
	 * @generated
	 */
	EEnum getSnomedctSupplyItem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplyRequestReason <em>Supply Request Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Reason</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplyRequestReason
	 * @generated
	 */
	EEnum getSupplyRequestReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EvidenceVariantState <em>Evidence Variant State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evidence Variant State</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EvidenceVariantState
	 * @generated
	 */
	EEnum getEvidenceVariantState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EffectEstimateType <em>Effect Estimate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Effect Estimate Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EffectEstimateType
	 * @generated
	 */
	EEnum getEffectEstimateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.InsurancePlanType <em>Insurance Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Insurance Plan Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.InsurancePlanType
	 * @generated
	 */
	EEnum getInsurancePlanType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceHistoryRecordActivityCodes <em>Provenance History Record Activity Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance History Record Activity Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ProvenanceHistoryRecordActivityCodes
	 * @generated
	 */
	EEnum getProvenanceHistoryRecordActivityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Chromosomehuman <em>Chromosomehuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chromosomehuman</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Chromosomehuman
	 * @generated
	 */
	EEnum getChromosomehuman();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Ensembl <em>Ensembl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ensembl</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Ensembl
	 * @generated
	 */
	EEnum getEnsembl();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FdAStandardSequence <em>Fd AStandard Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fd AStandard Sequence</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FdAStandardSequence
	 * @generated
	 */
	EEnum getFdAStandardSequence();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FdAMethod <em>Fd AMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fd AMethod</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FdAMethod
	 * @generated
	 */
	EEnum getFdAMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes <em>Allergy Intolerance Substance Product Condition And Negation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Substance Product Condition And Negation Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AllergyIntoleranceSubstanceProductConditionAndNegationCodes
	 * @generated
	 */
	EEnum getAllergyIntoleranceSubstanceProductConditionAndNegationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CatalogType <em>Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Catalog Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CatalogType
	 * @generated
	 */
	EEnum getCatalogType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationTargetDiseaseCodes <em>Immunization Recommendation Target Disease Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Target Disease Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationTargetDiseaseCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationTargetDiseaseCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationStatusCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationReasonCodes <em>Immunization Recommendation Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Date Criterion Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ImmunizationRecommendationDateCriterionCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationDateCriterionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Need <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Need</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Need
	 * @generated
	 */
	EEnum getNeed();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationtype <em>Validationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationtype</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationtype
	 * @generated
	 */
	EEnum getValidationtype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationprocess <em>Validationprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationprocess</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationprocess
	 * @generated
	 */
	EEnum getValidationprocess();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Failureaction <em>Failureaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failureaction</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Failureaction
	 * @generated
	 */
	EEnum getFailureaction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Primarysourcetype <em>Primarysourcetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primarysourcetype</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Primarysourcetype
	 * @generated
	 */
	EEnum getPrimarysourcetype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Verificationresultcommunicationmethod <em>Verificationresultcommunicationmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verificationresultcommunicationmethod</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Verificationresultcommunicationmethod
	 * @generated
	 */
	EEnum getVerificationresultcommunicationmethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Validationstatus <em>Validationstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validationstatus</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Validationstatus
	 * @generated
	 */
	EEnum getValidationstatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Canpushupdates <em>Canpushupdates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Canpushupdates</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Canpushupdates
	 * @generated
	 */
	EEnum getCanpushupdates();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.Pushtypeavailable <em>Pushtypeavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pushtypeavailable</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.Pushtypeavailable
	 * @generated
	 */
	EEnum getPushtypeavailable();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FoodTypeCodes <em>Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FoodTypeCodes
	 * @generated
	 */
	EEnum getFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.DietCodes <em>Diet Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.DietCodes
	 * @generated
	 */
	EEnum getDietCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrient Modifier Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.NutrientModifierCodes
	 * @generated
	 */
	EEnum getNutrientModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TextureModifierCodes <em>Texture Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modifier Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TextureModifierCodes
	 * @generated
	 */
	EEnum getTextureModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modified Food Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.TextureModifiedFoodTypeCodes
	 * @generated
	 */
	EEnum getTextureModifiedFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fluid Consistency Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.FluidConsistencyTypeCodes
	 * @generated
	 */
	EEnum getFluidConsistencyTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SupplementTypeCodes <em>Supplement Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplement Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SupplementTypeCodes
	 * @generated
	 */
	EEnum getSupplementTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaTypeCodes
	 * @generated
	 */
	EEnum getEnteralFormulaTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Additive Type Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralFormulaAdditiveTypeCode
	 * @generated
	 */
	EEnum getEnteralFormulaAdditiveTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.EnteralRouteCodes <em>Enteral Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Route Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.EnteralRouteCodes
	 * @generated
	 */
	EEnum getEnteralRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.SnomedctDrugTherapyStatusCodes <em>Snomedct Drug Therapy Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomedct Drug Therapy Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.SnomedctDrugTherapyStatusCodes
	 * @generated
	 */
	EEnum getSnomedctDrugTherapyStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationStatusCodes <em>Medication Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Status Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationStatusCodes
	 * @generated
	 */
	EEnum getMedicationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventId <em>Audit Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Id</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventId
	 * @generated
	 */
	EEnum getAuditEventId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSubType <em>Audit Event Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Sub Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSubType
	 * @generated
	 */
	EEnum getAuditEventSubType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ParticipationRoleType <em>Participation Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Role Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ParticipationRoleType
	 * @generated
	 */
	EEnum getParticipationRoleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MediaTypeCode <em>Media Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Code</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MediaTypeCode
	 * @generated
	 */
	EEnum getMediaTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSourceType <em>Audit Event Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Source Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventSourceType
	 * @generated
	 */
	EEnum getAuditEventSourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityType <em>Audit Event Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityType
	 * @generated
	 */
	EEnum getAuditEventEntityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityRole <em>Audit Event Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Entity Role</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.AuditEventEntityRole
	 * @generated
	 */
	EEnum getAuditEventEntityRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ObjectLifecycleEvents <em>Object Lifecycle Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Lifecycle Events</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ObjectLifecycleEvents
	 * @generated
	 */
	EEnum getObjectLifecycleEvents();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.BasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Resource Types</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.BasicResourceTypes
	 * @generated
	 */
	EEnum getBasicResourceTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Vision Prescription Product Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ExampleVisionPrescriptionProductCodes
	 * @generated
	 */
	EEnum getExampleVisionPrescriptionProductCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseStatusReasonCodes <em>Medication Dispense Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseStatusReasonCodes
	 * @generated
	 */
	EEnum getMedicationDispenseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseCategoryCodes <em>Medication Dispense Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Category Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispenseCategoryCodes
	 * @generated
	 */
	EEnum getMedicationDispenseCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispensePerformerFunctionCodes <em>Medication Dispense Performer Function Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Performer Function Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationDispensePerformerFunctionCodes
	 * @generated
	 */
	EEnum getMedicationDispensePerformerFunctionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.V3ActPharmacySupplyType <em>V3 Act Pharmacy Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Act Pharmacy Supply Type</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.V3ActPharmacySupplyType
	 * @generated
	 */
	EEnum getV3ActPharmacySupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgePackageTypeCodes <em>Medication Knowledge Package Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Knowledge Package Type Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgePackageTypeCodes
	 * @generated
	 */
	EEnum getMedicationKnowledgePackageTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgeCharacteristicCodes <em>Medication Knowledge Characteristic Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Knowledge Characteristic Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.MedicationKnowledgeCharacteristicCodes
	 * @generated
	 */
	EEnum getMedicationKnowledgeCharacteristicCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.hl7.fhir.valueSets.CoverageEligibilityResponseAuthSupportCodes <em>Coverage Eligibility Response Auth Support Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Eligibility Response Auth Support Codes</em>'.
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.CoverageEligibilityResponseAuthSupportCodes
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
