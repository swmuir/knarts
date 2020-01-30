/**
 */
package fhiRCore.valueSets.impl;

import fhiRCore.valueSets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueSetsFactoryImpl extends EFactoryImpl implements ValueSetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueSetsFactory init() {
		try {
			ValueSetsFactory theValueSetsFactory = (ValueSetsFactory)EPackage.Registry.INSTANCE.getEFactory(ValueSetsPackage.eNS_URI);
			if (theValueSetsFactory != null) {
				return theValueSetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueSetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetsPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESOURCE_TYPE:
				return createResourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.IDENTIFIER_TYPE_CODES:
				return createIdentifierTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.USAGE_CONTEXT_TYPE:
				return createUsageContextTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTEXT_OF_USE_VALUE_SET:
				return createContextOfUseValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.JURISDICTION_VALUE_SET:
				return createJurisdictionValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.DEFINITION_USE_CODES:
				return createDefinitionUseCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DEFINED_TYPE:
				return createFhirDefinedTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LOINC_CODES:
				return createLoincCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMON_LANGUAGES:
				return createCommonLanguagesFromString(eDataType, initialValue);
			case ValueSetsPackage.SIGNATURE_TYPE_CODES:
				return createSignatureTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V2036027:
				return createV2036027FromString(eDataType, initialValue);
			case ValueSetsPackage.TIMING_ABBREVIATION:
				return createTimingAbbreviationFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBJECT_TYPE:
				return createSubjectTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DESIGNATION_USE:
				return createDesignationUseFromString(eDataType, initialValue);
			case ValueSetsPackage.EXPRESSION_LANGUAGE:
				return createExpressionLanguageFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_ADDITIONAL_DOSAGE_INSTRUCTIONS:
				return createSnomedctAdditionalDosageInstructionsFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_MEDICATION_AS_NEEDED_REASON_CODES:
				return createSnomedctMedicationAsNeededReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return createSnomedctAnatomicalStructureForAdministrationSiteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_ROUTE_CODES:
				return createSnomedctRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_ADMINISTRATION_METHOD_CODES:
				return createSnomedctAdministrationMethodCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DOSE_AND_RATE_TYPE:
				return createDoseAndRateTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ALL_SECURITY_LABELS:
				return createAllSecurityLabelsFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMON_TAGS:
				return createCommonTagsFromString(eDataType, initialValue);
			case ValueSetsPackage.ORGANIZATION_TYPE:
				return createOrganizationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTACT_ENTITY_TYPE:
				return createContactEntityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENDPOINT_CONNECTION_TYPE:
				return createEndpointConnectionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENDPOINT_PAYLOAD_TYPE:
				return createEndpointPayloadTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LIBRARY_TYPE:
				return createLibraryTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DEFINITION_TOPIC:
				return createDefinitionTopicFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_SCORING:
				return createMeasureScoringFromString(eDataType, initialValue);
			case ValueSetsPackage.COMPOSITE_MEASURE_SCORING:
				return createCompositeMeasureScoringFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_TYPE:
				return createMeasureTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_POPULATION_TYPE:
				return createMeasurePopulationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEASURE_DATA_USAGE:
				return createMeasureDataUsageFromString(eDataType, initialValue);
			case ValueSetsPackage.MARITAL_STATUS_CODES:
				return createMaritalStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PATIENT_CONTACT_RELATIONSHIP:
				return createPatientContactRelationshipFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return createExampleUseCodesForListFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_ENCOUNTER_CODE:
				return createV3ActEncounterCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_TYPE:
				return createEncounterTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_PRIORITY:
				return createV3ActPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.EPISODE_OF_CARE_TYPE:
				return createEpisodeOfCareTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_CATEGORY_CODES:
				return createConditionCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return createConditionDiagnosisSeverityFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return createConditionProblemDiagnosisCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_BODY_STRUCTURES:
				return createSnomedctBodyStructuresFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_STAGE:
				return createConditionStageFromString(eDataType, initialValue);
			case ValueSetsPackage.INVESTIGATION_TYPE:
				return createInvestigationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PLAN_DEFINITION_TYPE:
				return createPlanDefinitionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_CATEGORY:
				return createGoalCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_CLINICAL_FINDINGS:
				return createSnomedctClinicalFindingsFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_PRIORITY:
				return createGoalPriorityFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_START_EVENT:
				return createGoalStartEventFromString(eDataType, initialValue);
			case ValueSetsPackage.ACTION_PARTICIPANT_ROLE:
				return createActionParticipantRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_CATEGORY:
				return createCarePlanCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_TEAM_CATEGORY:
				return createCareTeamCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPANT_ROLES:
				return createParticipantRolesFromString(eDataType, initialValue);
			case ValueSetsPackage.GOAL_ACHIEVEMENT_STATUS:
				return createGoalAchievementStatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_OUTCOME:
				return createCarePlanActivityOutcomeFromString(eDataType, initialValue);
			case ValueSetsPackage.APPOINTMENT_CANCELLATION_REASON:
				return createAppointmentCancellationReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_CATEGORY:
				return createServiceCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return createPracticeSettingCodeValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.V20276:
				return createV20276FromString(eDataType, initialValue);
			case ValueSetsPackage.ENCOUNTER_REASON_CODES:
				return createEncounterReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_CODES_SNOMEDC_T:
				return createProcedureCodesSnomedcTFromString(eDataType, initialValue);
			case ValueSetsPackage.V20116:
				return createV20116FromString(eDataType, initialValue);
			case ValueSetsPackage.V3_SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return createV3ServiceDeliveryLocationRoleTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.LOCATION_TYPE:
				return createLocationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_MEDICATION_CODES:
				return createSnomedctMedicationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V20487:
				return createV20487FromString(eDataType, initialValue);
			case ValueSetsPackage.PREPARE_PATIENT:
				return createPreparePatientFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_COLLECTION:
				return createSpecimenCollectionFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTAINER_MATERIALS:
				return createContainerMaterialsFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_CONTAINER_TYPE:
				return createSpecimenContainerTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTAINER_CAP:
				return createContainerCapFromString(eDataType, initialValue);
			case ValueSetsPackage.V20371:
				return createV20371FromString(eDataType, initialValue);
			case ValueSetsPackage.REJECTION_CRITERION:
				return createRejectionCriterionFromString(eDataType, initialValue);
			case ValueSetsPackage.HANDLING_CONDITION_SET:
				return createHandlingConditionSetFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_CATEGORY_CODES:
				return createObservationCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_METHODS:
				return createObservationMethodsFromString(eDataType, initialValue);
			case ValueSetsPackage.UCUM_CODES:
				return createUcumCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return createObservationReferenceRangeMeaningCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_APPLIES_TO_CODES:
				return createObservationReferenceRangeAppliesToCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_REQUEST_CATEGORY_CODES:
				return createServiceRequestCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_REQUEST_ORDER_DETAILS_CODES:
				return createServiceRequestOrderDetailsCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_REASON_CODES:
				return createProcedureReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.COVERAGE_TYPE_AND_SELF_PAY_CODES:
				return createCoverageTypeAndSelfPayCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSCRIBER_RELATIONSHIP_CODES:
				return createSubscriberRelationshipCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.COVERAGE_CLASS_CODES:
				return createCoverageClassCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.COVERAGE_COPAY_TYPE_CODES:
				return createCoverageCopayTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_COVERAGE_FINANCIAL_EXCEPTION_CODES:
				return createExampleCoverageFinancialExceptionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_LEGAL_STATE_CODES:
				return createContractResourceLegalStateCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_CONTENT_DERIVATION_CODES:
				return createContractContentDerivationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_EXPIRATION_TYPE_CODES:
				return createContractResourceExpirationTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES:
				return createContractResourceScopeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TYPE_CODES:
				return createContractTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_SUBTYPE_CODES:
				return createContractSubtypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DEFINITION_TYPE_CODES:
				return createContractResourceDefinitionTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DEFINITION_SUBTYPE_CODES:
				return createContractResourceDefinitionSubtypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return createContractTermTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_TERM_SUBTYPE_CODES:
				return createContractTermSubtypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES_A:
				return createContractResourceScopeCodesAFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES_B:
				return createContractResourceScopeCodesBFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SECURITY_CONTROL_CODES:
				return createContractResourceSecurityControlCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_PARTY_ROLE_CODES:
				return createContractResourcePartyRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_CONSENT_DIRECTIVE:
				return createV3ActConsentDirectiveFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DECISION_MODE_CODES:
				return createContractResourceDecisionModeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_SCOPE_CODES:
				return createContractResourceAssetScopeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_TYPE_CODES:
				return createContractResourceAssetTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_SUB_TYPE_CODES:
				return createContractResourceAssetSubTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CONTENT_CLASS:
				return createConsentContentClassFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_CONTEXT_CODES:
				return createContractResourceAssetContextCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_AVAILIABILITY_CODES:
				return createContractResourceAssetAvailiabilityCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_ACTION_CODES:
				return createContractActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_ACTOR_ROLE_CODES:
				return createContractActorRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_PURPOSE_OF_USE:
				return createV3PurposeOfUseFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ACTION_STATUS_CODES:
				return createContractResourceActionStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_TYPE:
				return createProvenanceParticipantTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_ROLE:
				return createProvenanceParticipantRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.PATIENT_RELATIONSHIP_TYPE:
				return createPatientRelationshipTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_ACTIVITY_TYPE:
				return createProvenanceActivityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SECURITY_ROLE_TYPE:
				return createSecurityRoleTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONTRACT_SIGNER_TYPE_CODES:
				return createContractSignerTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_SPECIMEN_COLLECTION_METHOD:
				return createFhirSpecimenCollectionMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.V20916:
				return createV20916FromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIMEN_PROCESSING_PROCEDURE:
				return createSpecimenProcessingProcedureFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSTANCE_CATEGORY_CODES:
				return createSubstanceCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUBSTANCE_CODE:
				return createSubstanceCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.V20493:
				return createV20493FromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPANT_TYPE:
				return createParticipantTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_REASON_MEDICATION_NOT_GIVEN_CODES:
				return createSnomedctReasonMedicationNotGivenCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_CATEGORY_CODES:
				return createMedicationAdministrationCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_PERFORMER_FUNCTION_CODES:
				return createMedicationAdministrationPerformerFunctionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.REASON_MEDICATION_GIVEN_CODES:
				return createReasonMedicationGivenCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STATUS_REASON_CODES:
				return createMedicationRequestStatusReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_CATEGORY_CODES:
				return createMedicationRequestCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return createProcedurePerformerRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_REQUEST_COURSE_OF_THERAPY_CODES:
				return createMedicationRequestCourseOfTherapyCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return createV3ActSubstanceAdminSubstitutionCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return createV3SubstanceAdminSubstitutionReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.DETECTED_ISSUE_CATEGORY:
				return createDetectedIssueCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return createManifestationAndSymptomCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return createDetectedIssueMitigationActionFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DEVICE_TYPES:
				return createFhirDeviceTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_SAFETY:
				return createDeviceSafetyFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DEVICE_STATUS_REASON:
				return createFhirDeviceStatusReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_TYPE:
				return createDeviceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DATA_ABSENT_REASON:
				return createDataAbsentReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.OBSERVATION_INTERPRETATION_CODES:
				return createObservationInterpretationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_CLASS_VALUE_SET:
				return createDocumentClassValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return createDocumentReferenceFormatCodeSetFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_CODE:
				return createV3ActCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return createFacilityTypeCodeValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_PROGNOSIS:
				return createClinicalImpressionPrognosisFromString(eDataType, initialValue);
			case ValueSetsPackage.RISK_PROBABILITY:
				return createRiskProbabilityFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_STAGE_TYPE:
				return createConditionStageTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.DIAGNOSIS_ROLE:
				return createDiagnosisRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.ACCOUNT_TYPES:
				return createAccountTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADMIT_SOURCE:
				return createAdmitSourceFromString(eDataType, initialValue);
			case ValueSetsPackage.V20092:
				return createV20092FromString(eDataType, initialValue);
			case ValueSetsPackage.DIET:
				return createDietFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIAL_COURTESY:
				return createSpecialCourtesyFromString(eDataType, initialValue);
			case ValueSetsPackage.SPECIAL_ARRANGEMENTS:
				return createSpecialArrangementsFromString(eDataType, initialValue);
			case ValueSetsPackage.DISCHARGE_DISPOSITION:
				return createDischargeDispositionFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_ORDER_CODES:
				return createListOrderCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return createPatientMedicineChangeTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.LIST_EMPTY_REASONS:
				return createListEmptyReasonsFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_STUDY_PRIMARY_PURPOSE_TYPE:
				return createResearchStudyPrimaryPurposeTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_STUDY_PHASE:
				return createResearchStudyPhaseFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_STUDY_REASON_STOPPED:
				return createResearchStudyReasonStoppedFromString(eDataType, initialValue);
			case ValueSetsPackage.RESEARCH_STUDY_OBJECTIVE_TYPE:
				return createResearchStudyObjectiveTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_SCOPE_CODES:
				return createConsentScopeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CATEGORY_CODES:
				return createConsentCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_POLICY_RULE_CODES:
				return createConsentPolicyRuleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_ACTION_CODES:
				return createConsentActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CONSENT_CONTENT_CODES:
				return createConsentContentCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CHARGE_ITEM_CODE:
				return createChargeItemCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_FORM_CODES:
				return createSnomedctFormCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IC_D10_CODES:
				return createIcD10CodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return createDiagnosticServiceSectionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return createLoincDiagnosticReportCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ACQUISITION_MODALITY:
				return createAcquisitionModalityFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_NOT_PERFORMED_REASON_SNOME_DCT:
				return createProcedureNotPerformedReasonSnomeDCTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_CATEGORY_CODES_SNOMEDC_T:
				return createProcedureCategoryCodesSnomedcTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_OUTCOME_CODES_SNOMEDC_T:
				return createProcedureOutcomeCodesSnomedcTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_FOLLOW_UP_CODES_SNOMEDC_T:
				return createProcedureFollowUpCodesSnomedcTFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return createProcedureDeviceActionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.LATERALITY:
				return createLateralityFromString(eDataType, initialValue);
			case ValueSetsPackage.IMAGING_STUDY_SERIES_PERFORMER_FUNCTION:
				return createImagingStudySeriesPerformerFunctionFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_MODALITY:
				return createMediaModalityFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return createMediaCollectionViewProjectionFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMUNICATION_NOT_DONE_REASON:
				return createCommunicationNotDoneReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMUNICATION_CATEGORY:
				return createCommunicationCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_PARTICIPATION_MODE:
				return createV3ParticipationModeFromString(eDataType, initialValue);
			case ValueSetsPackage.COMMUNICATION_TOPIC:
				return createCommunicationTopicFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_TYPE_CODES:
				return createClaimTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_SUB_TYPE_CODES:
				return createExampleClaimSubTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PROCESS_PRIORITY_CODES:
				return createProcessPriorityCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FUNDS_RESERVATION_CODES:
				return createFundsReservationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES:
				return createExampleRelatedClaimRelationshipCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_PAYEE_TYPE_CODES:
				return createClaimPayeeTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_CARE_TEAM_ROLE_CODES:
				return createClaimCareTeamRoleCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PROVIDER_QUALIFICATION_CODES:
				return createExampleProviderQualificationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CLAIM_INFORMATION_CATEGORY_CODES:
				return createClaimInformationCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXCEPTION_CODES:
				return createExceptionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MISSING_TOOTH_REASON_CODES:
				return createMissingToothReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_TYPE_CODES:
				return createExampleDiagnosisTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_ON_ADMISSION_CODES:
				return createExampleDiagnosisOnAdmissionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES:
				return createExampleDiagnosisRelatedGroupCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PROCEDURE_TYPE_CODES:
				return createExampleProcedureTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IC_D10_PROCEDURE_CODES:
				return createIcD10ProcedureCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_INCIDENT_CODE:
				return createV3ActIncidentCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_REVENUE_CENTER_CODES:
				return createExampleRevenueCenterCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_CATEGORY_CODES:
				return createBenefitCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.USCLS_CODES:
				return createUsclsCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MODIFIER_TYPE_CODES:
				return createModifierTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PROGRAM_REASON_CODES:
				return createExampleProgramReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return createExampleServicePlaceCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ORAL_SITE_CODES:
				return createOralSiteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SURFACE_CODES:
				return createSurfaceCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_VALUE_CODES:
				return createAdjudicationValueCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_REASON_CODES:
				return createAdjudicationReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_PAYMENT_TYPE_CODES:
				return createExamplePaymentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return createPaymentAdjustmentReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FORM_CODES:
				return createFormCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_REASON:
				return createV3ActReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.ADJUDICATION_ERROR_CODES:
				return createAdjudicationErrorCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SERVICE_PROVISION_CONDITIONS:
				return createServiceProvisionConditionsFromString(eDataType, initialValue);
			case ValueSetsPackage.PROGRAM:
				return createProgramFromString(eDataType, initialValue);
			case ValueSetsPackage.REFERRAL_METHOD:
				return createReferralMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_MORPHOLOGIC_ABNORMALITIES:
				return createSnomedctMorphologicAbnormalitiesFromString(eDataType, initialValue);
			case ValueSetsPackage.BODYSTRUCTURE_LOCATION_QUALIFIER:
				return createBodystructureLocationQualifierFromString(eDataType, initialValue);
			case ValueSetsPackage.TASK_CODE:
				return createTaskCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_QUESTION_CODES:
				return createQuestionnaireQuestionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.QUESTIONNAIRE_ANSWER_CODES:
				return createQuestionnaireAnswerCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NETWORK_TYPE_CODES:
				return createNetworkTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.UNIT_TYPE_CODES:
				return createUnitTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_TERM_CODES:
				return createBenefitTermCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.BENEFIT_TYPE_CODES:
				return createBenefitTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VITAL_SIGNS:
				return createVitalSignsFromString(eDataType, initialValue);
			case ValueSetsPackage.DEVICE_METRIC_AND_COMPONENT_TYPES:
				return createDeviceMetricAndComponentTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.FLAG_CATEGORY:
				return createFlagCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.FLAG_CODE:
				return createFlagCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_TARGET_DISEASE_CODES:
				return createImmunizationEvaluationTargetDiseaseCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_STATUS_REASON_CODES:
				return createImmunizationStatusReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return createVaccineAdministeredValueSetFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_ORIGIN_CODES:
				return createImmunizationOriginCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return createCodesForImmunizationSiteOfAdministrationFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_ROUTE_CODES:
				return createImmunizationRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_FUNCTION_CODES:
				return createImmunizationFunctionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_REASON_CODES:
				return createImmunizationReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_SUBPOTENT_REASON:
				return createImmunizationSubpotentReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY:
				return createImmunizationProgramEligibilityFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_FUNDING_SOURCE:
				return createImmunizationFundingSourceFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_TARGET_DISEASE_CODES:
				return createImmunizationTargetDiseaseCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_DOSE_STATUS_CODES:
				return createImmunizationEvaluationDoseStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_DOSE_STATUS_REASON_CODES:
				return createImmunizationEvaluationDoseStatusReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.OPERATION_OUTCOME_CODES:
				return createOperationOutcomeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_TYPE_CODES:
				return createPaymentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PRACTITIONER_ROLE:
				return createPractitionerRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.FAMILY_HISTORY_ABSENT_REASON:
				return createFamilyHistoryAbsentReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_FAMILY_MEMBER:
				return createV3FamilyMemberFromString(eDataType, initialValue);
			case ValueSetsPackage.CONDITION_OUTCOME_CODES:
				return createConditionOutcomeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ORGANIZATION_AFFILIATION_ROLE:
				return createOrganizationAffiliationRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.ADVERSE_EVENT_CATEGORY:
				return createAdverseEventCategoryFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_CLINICAL_FINDINGS_A:
				return createSnomedctClinicalFindingsAFromString(eDataType, initialValue);
			case ValueSetsPackage.ADVERSE_EVENT_SERIOUSNESS:
				return createAdverseEventSeriousnessFromString(eDataType, initialValue);
			case ValueSetsPackage.ADVERSE_EVENT_CAUSALITY_ASSESSMENT:
				return createAdverseEventCausalityAssessmentFromString(eDataType, initialValue);
			case ValueSetsPackage.ADVERSE_EVENT_CAUSALITY_METHOD:
				return createAdverseEventCausalityMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.SYNTHESIS_TYPE:
				return createSynthesisTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.STUDY_TYPE:
				return createStudyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RISK_ESTIMATE_TYPE:
				return createRiskEstimateTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PRECISION_ESTIMATE_TYPE:
				return createPrecisionEstimateTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.QUALITY_OF_EVIDENCE_RATING:
				return createQualityOfEvidenceRatingFromString(eDataType, initialValue);
			case ValueSetsPackage.CERTAINTY_SUBCOMPONENT_TYPE:
				return createCertaintySubcomponentTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.CERTAINTY_SUBCOMPONENT_RATING:
				return createCertaintySubcomponentRatingFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_ORIGIN_TYPE:
				return createTestScriptProfileOriginTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_DESTINATION_TYPE:
				return createTestScriptProfileDestinationTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.RESTFUL_SECURITY_SERVICE:
				return createRestfulSecurityServiceFromString(eDataType, initialValue);
			case ValueSetsPackage.MESSAGE_TRANSPORT:
				return createMessageTransportFromString(eDataType, initialValue);
			case ValueSetsPackage.MESSAGE_EVENT:
				return createMessageEventFromString(eDataType, initialValue);
			case ValueSetsPackage.TEST_SCRIPT_OPERATION_CODE:
				return createTestScriptOperationCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return createExampleMessageReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.PAYMENT_STATUS_CODES:
				return createPaymentStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FHIR_DOCUMENT_TYPE_CODES:
				return createFhirDocumentTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DOCUMENT_SECTION_CODES:
				return createDocumentSectionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_TYPE:
				return createSupplyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_SUPPLY_ITEM:
				return createSnomedctSupplyItemFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLY_REQUEST_REASON:
				return createSupplyRequestReasonFromString(eDataType, initialValue);
			case ValueSetsPackage.EVIDENCE_VARIANT_STATE:
				return createEvidenceVariantStateFromString(eDataType, initialValue);
			case ValueSetsPackage.EFFECT_ESTIMATE_TYPE:
				return createEffectEstimateTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.INSURANCE_PLAN_TYPE:
				return createInsurancePlanTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PROVENANCE_HISTORY_RECORD_ACTIVITY_CODES:
				return createProvenanceHistoryRecordActivityCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CHROMOSOMEHUMAN:
				return createChromosomehumanFromString(eDataType, initialValue);
			case ValueSetsPackage.ENSEMBL:
				return createEnsemblFromString(eDataType, initialValue);
			case ValueSetsPackage.FD_ASTANDARD_SEQUENCE:
				return createFdAStandardSequenceFromString(eDataType, initialValue);
			case ValueSetsPackage.FD_AMETHOD:
				return createFdAMethodFromString(eDataType, initialValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES:
				return createAllergyIntoleranceSubstanceProductConditionAndNegationCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.CATALOG_TYPE:
				return createCatalogTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_TARGET_DISEASE_CODES:
				return createImmunizationRecommendationTargetDiseaseCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return createImmunizationRecommendationStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_REASON_CODES:
				return createImmunizationRecommendationReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return createImmunizationRecommendationDateCriterionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NEED:
				return createNeedFromString(eDataType, initialValue);
			case ValueSetsPackage.VALIDATIONTYPE:
				return createValidationtypeFromString(eDataType, initialValue);
			case ValueSetsPackage.VALIDATIONPROCESS:
				return createValidationprocessFromString(eDataType, initialValue);
			case ValueSetsPackage.FAILUREACTION:
				return createFailureactionFromString(eDataType, initialValue);
			case ValueSetsPackage.PRIMARYSOURCETYPE:
				return createPrimarysourcetypeFromString(eDataType, initialValue);
			case ValueSetsPackage.VERIFICATIONRESULTCOMMUNICATIONMETHOD:
				return createVerificationresultcommunicationmethodFromString(eDataType, initialValue);
			case ValueSetsPackage.VALIDATIONSTATUS:
				return createValidationstatusFromString(eDataType, initialValue);
			case ValueSetsPackage.CANPUSHUPDATES:
				return createCanpushupdatesFromString(eDataType, initialValue);
			case ValueSetsPackage.PUSHTYPEAVAILABLE:
				return createPushtypeavailableFromString(eDataType, initialValue);
			case ValueSetsPackage.FOOD_TYPE_CODES:
				return createFoodTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.DIET_CODES:
				return createDietCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.NUTRIENT_MODIFIER_CODES:
				return createNutrientModifierCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.TEXTURE_MODIFIER_CODES:
				return createTextureModifierCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return createTextureModifiedFoodTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return createFluidConsistencyTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SUPPLEMENT_TYPE_CODES:
				return createSupplementTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_FORMULA_TYPE_CODES:
				return createEnteralFormulaTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return createEnteralFormulaAdditiveTypeCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.ENTERAL_ROUTE_CODES:
				return createEnteralRouteCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.SNOMEDCT_DRUG_THERAPY_STATUS_CODES:
				return createSnomedctDrugTherapyStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_STATUS_CODES:
				return createMedicationStatusCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ID:
				return createAuditEventIdFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_SUB_TYPE:
				return createAuditEventSubTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.PARTICIPATION_ROLE_TYPE:
				return createParticipationRoleTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDIA_TYPE_CODE:
				return createMediaTypeCodeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_SOURCE_TYPE:
				return createAuditEventSourceTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_TYPE:
				return createAuditEventEntityTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_ROLE:
				return createAuditEventEntityRoleFromString(eDataType, initialValue);
			case ValueSetsPackage.OBJECT_LIFECYCLE_EVENTS:
				return createObjectLifecycleEventsFromString(eDataType, initialValue);
			case ValueSetsPackage.BASIC_RESOURCE_TYPES:
				return createBasicResourceTypesFromString(eDataType, initialValue);
			case ValueSetsPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return createExampleVisionPrescriptionProductCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_STATUS_REASON_CODES:
				return createMedicationDispenseStatusReasonCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_CATEGORY_CODES:
				return createMedicationDispenseCategoryCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_PERFORMER_FUNCTION_CODES:
				return createMedicationDispensePerformerFunctionCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.V3_ACT_PHARMACY_SUPPLY_TYPE:
				return createV3ActPharmacySupplyTypeFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_KNOWLEDGE_PACKAGE_TYPE_CODES:
				return createMedicationKnowledgePackageTypeCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.MEDICATION_KNOWLEDGE_CHARACTERISTIC_CODES:
				return createMedicationKnowledgeCharacteristicCodesFromString(eDataType, initialValue);
			case ValueSetsPackage.COVERAGE_ELIGIBILITY_RESPONSE_AUTH_SUPPORT_CODES:
				return createCoverageEligibilityResponseAuthSupportCodesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetsPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESOURCE_TYPE:
				return convertResourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.IDENTIFIER_TYPE_CODES:
				return convertIdentifierTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.USAGE_CONTEXT_TYPE:
				return convertUsageContextTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTEXT_OF_USE_VALUE_SET:
				return convertContextOfUseValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.JURISDICTION_VALUE_SET:
				return convertJurisdictionValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.DEFINITION_USE_CODES:
				return convertDefinitionUseCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DEFINED_TYPE:
				return convertFhirDefinedTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LOINC_CODES:
				return convertLoincCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMON_LANGUAGES:
				return convertCommonLanguagesToString(eDataType, instanceValue);
			case ValueSetsPackage.SIGNATURE_TYPE_CODES:
				return convertSignatureTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V2036027:
				return convertV2036027ToString(eDataType, instanceValue);
			case ValueSetsPackage.TIMING_ABBREVIATION:
				return convertTimingAbbreviationToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBJECT_TYPE:
				return convertSubjectTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DESIGNATION_USE:
				return convertDesignationUseToString(eDataType, instanceValue);
			case ValueSetsPackage.EXPRESSION_LANGUAGE:
				return convertExpressionLanguageToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_ADDITIONAL_DOSAGE_INSTRUCTIONS:
				return convertSnomedctAdditionalDosageInstructionsToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_MEDICATION_AS_NEEDED_REASON_CODES:
				return convertSnomedctMedicationAsNeededReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return convertSnomedctAnatomicalStructureForAdministrationSiteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_ROUTE_CODES:
				return convertSnomedctRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_ADMINISTRATION_METHOD_CODES:
				return convertSnomedctAdministrationMethodCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DOSE_AND_RATE_TYPE:
				return convertDoseAndRateTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ALL_SECURITY_LABELS:
				return convertAllSecurityLabelsToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMON_TAGS:
				return convertCommonTagsToString(eDataType, instanceValue);
			case ValueSetsPackage.ORGANIZATION_TYPE:
				return convertOrganizationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTACT_ENTITY_TYPE:
				return convertContactEntityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENDPOINT_CONNECTION_TYPE:
				return convertEndpointConnectionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENDPOINT_PAYLOAD_TYPE:
				return convertEndpointPayloadTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LIBRARY_TYPE:
				return convertLibraryTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DEFINITION_TOPIC:
				return convertDefinitionTopicToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_SCORING:
				return convertMeasureScoringToString(eDataType, instanceValue);
			case ValueSetsPackage.COMPOSITE_MEASURE_SCORING:
				return convertCompositeMeasureScoringToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_TYPE:
				return convertMeasureTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_POPULATION_TYPE:
				return convertMeasurePopulationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEASURE_DATA_USAGE:
				return convertMeasureDataUsageToString(eDataType, instanceValue);
			case ValueSetsPackage.MARITAL_STATUS_CODES:
				return convertMaritalStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PATIENT_CONTACT_RELATIONSHIP:
				return convertPatientContactRelationshipToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return convertExampleUseCodesForListToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_ENCOUNTER_CODE:
				return convertV3ActEncounterCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_TYPE:
				return convertEncounterTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_PRIORITY:
				return convertV3ActPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.EPISODE_OF_CARE_TYPE:
				return convertEpisodeOfCareTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_CATEGORY_CODES:
				return convertConditionCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return convertConditionDiagnosisSeverityToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return convertConditionProblemDiagnosisCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_BODY_STRUCTURES:
				return convertSnomedctBodyStructuresToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_STAGE:
				return convertConditionStageToString(eDataType, instanceValue);
			case ValueSetsPackage.INVESTIGATION_TYPE:
				return convertInvestigationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PLAN_DEFINITION_TYPE:
				return convertPlanDefinitionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_CATEGORY:
				return convertGoalCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_CLINICAL_FINDINGS:
				return convertSnomedctClinicalFindingsToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_PRIORITY:
				return convertGoalPriorityToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_START_EVENT:
				return convertGoalStartEventToString(eDataType, instanceValue);
			case ValueSetsPackage.ACTION_PARTICIPANT_ROLE:
				return convertActionParticipantRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_CATEGORY:
				return convertCarePlanCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_TEAM_CATEGORY:
				return convertCareTeamCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPANT_ROLES:
				return convertParticipantRolesToString(eDataType, instanceValue);
			case ValueSetsPackage.GOAL_ACHIEVEMENT_STATUS:
				return convertGoalAchievementStatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CARE_PLAN_ACTIVITY_OUTCOME:
				return convertCarePlanActivityOutcomeToString(eDataType, instanceValue);
			case ValueSetsPackage.APPOINTMENT_CANCELLATION_REASON:
				return convertAppointmentCancellationReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_CATEGORY:
				return convertServiceCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return convertPracticeSettingCodeValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.V20276:
				return convertV20276ToString(eDataType, instanceValue);
			case ValueSetsPackage.ENCOUNTER_REASON_CODES:
				return convertEncounterReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_CODES_SNOMEDC_T:
				return convertProcedureCodesSnomedcTToString(eDataType, instanceValue);
			case ValueSetsPackage.V20116:
				return convertV20116ToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return convertV3ServiceDeliveryLocationRoleTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.LOCATION_TYPE:
				return convertLocationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_MEDICATION_CODES:
				return convertSnomedctMedicationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V20487:
				return convertV20487ToString(eDataType, instanceValue);
			case ValueSetsPackage.PREPARE_PATIENT:
				return convertPreparePatientToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_COLLECTION:
				return convertSpecimenCollectionToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTAINER_MATERIALS:
				return convertContainerMaterialsToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_CONTAINER_TYPE:
				return convertSpecimenContainerTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTAINER_CAP:
				return convertContainerCapToString(eDataType, instanceValue);
			case ValueSetsPackage.V20371:
				return convertV20371ToString(eDataType, instanceValue);
			case ValueSetsPackage.REJECTION_CRITERION:
				return convertRejectionCriterionToString(eDataType, instanceValue);
			case ValueSetsPackage.HANDLING_CONDITION_SET:
				return convertHandlingConditionSetToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_CATEGORY_CODES:
				return convertObservationCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_METHODS:
				return convertObservationMethodsToString(eDataType, instanceValue);
			case ValueSetsPackage.UCUM_CODES:
				return convertUcumCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return convertObservationReferenceRangeMeaningCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_REFERENCE_RANGE_APPLIES_TO_CODES:
				return convertObservationReferenceRangeAppliesToCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_REQUEST_CATEGORY_CODES:
				return convertServiceRequestCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_REQUEST_ORDER_DETAILS_CODES:
				return convertServiceRequestOrderDetailsCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_REASON_CODES:
				return convertProcedureReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.COVERAGE_TYPE_AND_SELF_PAY_CODES:
				return convertCoverageTypeAndSelfPayCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSCRIBER_RELATIONSHIP_CODES:
				return convertSubscriberRelationshipCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.COVERAGE_CLASS_CODES:
				return convertCoverageClassCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.COVERAGE_COPAY_TYPE_CODES:
				return convertCoverageCopayTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_COVERAGE_FINANCIAL_EXCEPTION_CODES:
				return convertExampleCoverageFinancialExceptionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_LEGAL_STATE_CODES:
				return convertContractResourceLegalStateCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_CONTENT_DERIVATION_CODES:
				return convertContractContentDerivationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_EXPIRATION_TYPE_CODES:
				return convertContractResourceExpirationTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES:
				return convertContractResourceScopeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TYPE_CODES:
				return convertContractTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_SUBTYPE_CODES:
				return convertContractSubtypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DEFINITION_TYPE_CODES:
				return convertContractResourceDefinitionTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DEFINITION_SUBTYPE_CODES:
				return convertContractResourceDefinitionSubtypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TERM_TYPE_CODES:
				return convertContractTermTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_TERM_SUBTYPE_CODES:
				return convertContractTermSubtypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES_A:
				return convertContractResourceScopeCodesAToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SCOPE_CODES_B:
				return convertContractResourceScopeCodesBToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_SECURITY_CONTROL_CODES:
				return convertContractResourceSecurityControlCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_PARTY_ROLE_CODES:
				return convertContractResourcePartyRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_CONSENT_DIRECTIVE:
				return convertV3ActConsentDirectiveToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_DECISION_MODE_CODES:
				return convertContractResourceDecisionModeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_SCOPE_CODES:
				return convertContractResourceAssetScopeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_TYPE_CODES:
				return convertContractResourceAssetTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_SUB_TYPE_CODES:
				return convertContractResourceAssetSubTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CONTENT_CLASS:
				return convertConsentContentClassToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_CONTEXT_CODES:
				return convertContractResourceAssetContextCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ASSET_AVAILIABILITY_CODES:
				return convertContractResourceAssetAvailiabilityCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_ACTION_CODES:
				return convertContractActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_ACTOR_ROLE_CODES:
				return convertContractActorRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_PURPOSE_OF_USE:
				return convertV3PurposeOfUseToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_RESOURCE_ACTION_STATUS_CODES:
				return convertContractResourceActionStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_TYPE:
				return convertProvenanceParticipantTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_PARTICIPANT_ROLE:
				return convertProvenanceParticipantRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.PATIENT_RELATIONSHIP_TYPE:
				return convertPatientRelationshipTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_ACTIVITY_TYPE:
				return convertProvenanceActivityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SECURITY_ROLE_TYPE:
				return convertSecurityRoleTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONTRACT_SIGNER_TYPE_CODES:
				return convertContractSignerTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_SPECIMEN_COLLECTION_METHOD:
				return convertFhirSpecimenCollectionMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.V20916:
				return convertV20916ToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIMEN_PROCESSING_PROCEDURE:
				return convertSpecimenProcessingProcedureToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSTANCE_CATEGORY_CODES:
				return convertSubstanceCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUBSTANCE_CODE:
				return convertSubstanceCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.V20493:
				return convertV20493ToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPANT_TYPE:
				return convertParticipantTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_REASON_MEDICATION_NOT_GIVEN_CODES:
				return convertSnomedctReasonMedicationNotGivenCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_CATEGORY_CODES:
				return convertMedicationAdministrationCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_ADMINISTRATION_PERFORMER_FUNCTION_CODES:
				return convertMedicationAdministrationPerformerFunctionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.REASON_MEDICATION_GIVEN_CODES:
				return convertReasonMedicationGivenCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_STATUS_REASON_CODES:
				return convertMedicationRequestStatusReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_CATEGORY_CODES:
				return convertMedicationRequestCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return convertProcedurePerformerRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_REQUEST_COURSE_OF_THERAPY_CODES:
				return convertMedicationRequestCourseOfTherapyCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return convertV3ActSubstanceAdminSubstitutionCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return convertV3SubstanceAdminSubstitutionReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.DETECTED_ISSUE_CATEGORY:
				return convertDetectedIssueCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return convertManifestationAndSymptomCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return convertDetectedIssueMitigationActionToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DEVICE_TYPES:
				return convertFhirDeviceTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_SAFETY:
				return convertDeviceSafetyToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DEVICE_STATUS_REASON:
				return convertFhirDeviceStatusReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_TYPE:
				return convertDeviceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DATA_ABSENT_REASON:
				return convertDataAbsentReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.OBSERVATION_INTERPRETATION_CODES:
				return convertObservationInterpretationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_CLASS_VALUE_SET:
				return convertDocumentClassValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return convertDocumentReferenceFormatCodeSetToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_CODE:
				return convertV3ActCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return convertFacilityTypeCodeValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.CLINICAL_IMPRESSION_PROGNOSIS:
				return convertClinicalImpressionPrognosisToString(eDataType, instanceValue);
			case ValueSetsPackage.RISK_PROBABILITY:
				return convertRiskProbabilityToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_STAGE_TYPE:
				return convertConditionStageTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.DIAGNOSIS_ROLE:
				return convertDiagnosisRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.ACCOUNT_TYPES:
				return convertAccountTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADMIT_SOURCE:
				return convertAdmitSourceToString(eDataType, instanceValue);
			case ValueSetsPackage.V20092:
				return convertV20092ToString(eDataType, instanceValue);
			case ValueSetsPackage.DIET:
				return convertDietToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIAL_COURTESY:
				return convertSpecialCourtesyToString(eDataType, instanceValue);
			case ValueSetsPackage.SPECIAL_ARRANGEMENTS:
				return convertSpecialArrangementsToString(eDataType, instanceValue);
			case ValueSetsPackage.DISCHARGE_DISPOSITION:
				return convertDischargeDispositionToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_ORDER_CODES:
				return convertListOrderCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return convertPatientMedicineChangeTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.LIST_EMPTY_REASONS:
				return convertListEmptyReasonsToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_STUDY_PRIMARY_PURPOSE_TYPE:
				return convertResearchStudyPrimaryPurposeTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_STUDY_PHASE:
				return convertResearchStudyPhaseToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_STUDY_REASON_STOPPED:
				return convertResearchStudyReasonStoppedToString(eDataType, instanceValue);
			case ValueSetsPackage.RESEARCH_STUDY_OBJECTIVE_TYPE:
				return convertResearchStudyObjectiveTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_SCOPE_CODES:
				return convertConsentScopeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CATEGORY_CODES:
				return convertConsentCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_POLICY_RULE_CODES:
				return convertConsentPolicyRuleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_ACTION_CODES:
				return convertConsentActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CONSENT_CONTENT_CODES:
				return convertConsentContentCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CHARGE_ITEM_CODE:
				return convertChargeItemCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_FORM_CODES:
				return convertSnomedctFormCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IC_D10_CODES:
				return convertIcD10CodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return convertDiagnosticServiceSectionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return convertLoincDiagnosticReportCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ACQUISITION_MODALITY:
				return convertAcquisitionModalityToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_NOT_PERFORMED_REASON_SNOME_DCT:
				return convertProcedureNotPerformedReasonSnomeDCTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_CATEGORY_CODES_SNOMEDC_T:
				return convertProcedureCategoryCodesSnomedcTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_OUTCOME_CODES_SNOMEDC_T:
				return convertProcedureOutcomeCodesSnomedcTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_FOLLOW_UP_CODES_SNOMEDC_T:
				return convertProcedureFollowUpCodesSnomedcTToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return convertProcedureDeviceActionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.LATERALITY:
				return convertLateralityToString(eDataType, instanceValue);
			case ValueSetsPackage.IMAGING_STUDY_SERIES_PERFORMER_FUNCTION:
				return convertImagingStudySeriesPerformerFunctionToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_MODALITY:
				return convertMediaModalityToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return convertMediaCollectionViewProjectionToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMUNICATION_NOT_DONE_REASON:
				return convertCommunicationNotDoneReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMUNICATION_CATEGORY:
				return convertCommunicationCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_PARTICIPATION_MODE:
				return convertV3ParticipationModeToString(eDataType, instanceValue);
			case ValueSetsPackage.COMMUNICATION_TOPIC:
				return convertCommunicationTopicToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_TYPE_CODES:
				return convertClaimTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_CLAIM_SUB_TYPE_CODES:
				return convertExampleClaimSubTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PROCESS_PRIORITY_CODES:
				return convertProcessPriorityCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FUNDS_RESERVATION_CODES:
				return convertFundsReservationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_RELATED_CLAIM_RELATIONSHIP_CODES:
				return convertExampleRelatedClaimRelationshipCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_PAYEE_TYPE_CODES:
				return convertClaimPayeeTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_CARE_TEAM_ROLE_CODES:
				return convertClaimCareTeamRoleCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PROVIDER_QUALIFICATION_CODES:
				return convertExampleProviderQualificationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CLAIM_INFORMATION_CATEGORY_CODES:
				return convertClaimInformationCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXCEPTION_CODES:
				return convertExceptionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MISSING_TOOTH_REASON_CODES:
				return convertMissingToothReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_TYPE_CODES:
				return convertExampleDiagnosisTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_ON_ADMISSION_CODES:
				return convertExampleDiagnosisOnAdmissionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_DIAGNOSIS_RELATED_GROUP_CODES:
				return convertExampleDiagnosisRelatedGroupCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PROCEDURE_TYPE_CODES:
				return convertExampleProcedureTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IC_D10_PROCEDURE_CODES:
				return convertIcD10ProcedureCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_INCIDENT_CODE:
				return convertV3ActIncidentCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_REVENUE_CENTER_CODES:
				return convertExampleRevenueCenterCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_CATEGORY_CODES:
				return convertBenefitCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.USCLS_CODES:
				return convertUsclsCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MODIFIER_TYPE_CODES:
				return convertModifierTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PROGRAM_REASON_CODES:
				return convertExampleProgramReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return convertExampleServicePlaceCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ORAL_SITE_CODES:
				return convertOralSiteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SURFACE_CODES:
				return convertSurfaceCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_VALUE_CODES:
				return convertAdjudicationValueCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_REASON_CODES:
				return convertAdjudicationReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_PAYMENT_TYPE_CODES:
				return convertExamplePaymentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return convertPaymentAdjustmentReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FORM_CODES:
				return convertFormCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_REASON:
				return convertV3ActReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.ADJUDICATION_ERROR_CODES:
				return convertAdjudicationErrorCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SERVICE_PROVISION_CONDITIONS:
				return convertServiceProvisionConditionsToString(eDataType, instanceValue);
			case ValueSetsPackage.PROGRAM:
				return convertProgramToString(eDataType, instanceValue);
			case ValueSetsPackage.REFERRAL_METHOD:
				return convertReferralMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_MORPHOLOGIC_ABNORMALITIES:
				return convertSnomedctMorphologicAbnormalitiesToString(eDataType, instanceValue);
			case ValueSetsPackage.BODYSTRUCTURE_LOCATION_QUALIFIER:
				return convertBodystructureLocationQualifierToString(eDataType, instanceValue);
			case ValueSetsPackage.TASK_CODE:
				return convertTaskCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_QUESTION_CODES:
				return convertQuestionnaireQuestionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.QUESTIONNAIRE_ANSWER_CODES:
				return convertQuestionnaireAnswerCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NETWORK_TYPE_CODES:
				return convertNetworkTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.UNIT_TYPE_CODES:
				return convertUnitTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_TERM_CODES:
				return convertBenefitTermCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.BENEFIT_TYPE_CODES:
				return convertBenefitTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VITAL_SIGNS:
				return convertVitalSignsToString(eDataType, instanceValue);
			case ValueSetsPackage.DEVICE_METRIC_AND_COMPONENT_TYPES:
				return convertDeviceMetricAndComponentTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.FLAG_CATEGORY:
				return convertFlagCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.FLAG_CODE:
				return convertFlagCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_TARGET_DISEASE_CODES:
				return convertImmunizationEvaluationTargetDiseaseCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_STATUS_REASON_CODES:
				return convertImmunizationStatusReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return convertVaccineAdministeredValueSetToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_ORIGIN_CODES:
				return convertImmunizationOriginCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return convertCodesForImmunizationSiteOfAdministrationToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_ROUTE_CODES:
				return convertImmunizationRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_FUNCTION_CODES:
				return convertImmunizationFunctionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_REASON_CODES:
				return convertImmunizationReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_SUBPOTENT_REASON:
				return convertImmunizationSubpotentReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_PROGRAM_ELIGIBILITY:
				return convertImmunizationProgramEligibilityToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_FUNDING_SOURCE:
				return convertImmunizationFundingSourceToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_TARGET_DISEASE_CODES:
				return convertImmunizationTargetDiseaseCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_DOSE_STATUS_CODES:
				return convertImmunizationEvaluationDoseStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_EVALUATION_DOSE_STATUS_REASON_CODES:
				return convertImmunizationEvaluationDoseStatusReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.OPERATION_OUTCOME_CODES:
				return convertOperationOutcomeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_TYPE_CODES:
				return convertPaymentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PRACTITIONER_ROLE:
				return convertPractitionerRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.FAMILY_HISTORY_ABSENT_REASON:
				return convertFamilyHistoryAbsentReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_FAMILY_MEMBER:
				return convertV3FamilyMemberToString(eDataType, instanceValue);
			case ValueSetsPackage.CONDITION_OUTCOME_CODES:
				return convertConditionOutcomeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ORGANIZATION_AFFILIATION_ROLE:
				return convertOrganizationAffiliationRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.ADVERSE_EVENT_CATEGORY:
				return convertAdverseEventCategoryToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_CLINICAL_FINDINGS_A:
				return convertSnomedctClinicalFindingsAToString(eDataType, instanceValue);
			case ValueSetsPackage.ADVERSE_EVENT_SERIOUSNESS:
				return convertAdverseEventSeriousnessToString(eDataType, instanceValue);
			case ValueSetsPackage.ADVERSE_EVENT_CAUSALITY_ASSESSMENT:
				return convertAdverseEventCausalityAssessmentToString(eDataType, instanceValue);
			case ValueSetsPackage.ADVERSE_EVENT_CAUSALITY_METHOD:
				return convertAdverseEventCausalityMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.SYNTHESIS_TYPE:
				return convertSynthesisTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.STUDY_TYPE:
				return convertStudyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RISK_ESTIMATE_TYPE:
				return convertRiskEstimateTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PRECISION_ESTIMATE_TYPE:
				return convertPrecisionEstimateTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.QUALITY_OF_EVIDENCE_RATING:
				return convertQualityOfEvidenceRatingToString(eDataType, instanceValue);
			case ValueSetsPackage.CERTAINTY_SUBCOMPONENT_TYPE:
				return convertCertaintySubcomponentTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.CERTAINTY_SUBCOMPONENT_RATING:
				return convertCertaintySubcomponentRatingToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_ORIGIN_TYPE:
				return convertTestScriptProfileOriginTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_PROFILE_DESTINATION_TYPE:
				return convertTestScriptProfileDestinationTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.RESTFUL_SECURITY_SERVICE:
				return convertRestfulSecurityServiceToString(eDataType, instanceValue);
			case ValueSetsPackage.MESSAGE_TRANSPORT:
				return convertMessageTransportToString(eDataType, instanceValue);
			case ValueSetsPackage.MESSAGE_EVENT:
				return convertMessageEventToString(eDataType, instanceValue);
			case ValueSetsPackage.TEST_SCRIPT_OPERATION_CODE:
				return convertTestScriptOperationCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return convertExampleMessageReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.PAYMENT_STATUS_CODES:
				return convertPaymentStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FHIR_DOCUMENT_TYPE_CODES:
				return convertFhirDocumentTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DOCUMENT_SECTION_CODES:
				return convertDocumentSectionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_TYPE:
				return convertSupplyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_SUPPLY_ITEM:
				return convertSnomedctSupplyItemToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLY_REQUEST_REASON:
				return convertSupplyRequestReasonToString(eDataType, instanceValue);
			case ValueSetsPackage.EVIDENCE_VARIANT_STATE:
				return convertEvidenceVariantStateToString(eDataType, instanceValue);
			case ValueSetsPackage.EFFECT_ESTIMATE_TYPE:
				return convertEffectEstimateTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.INSURANCE_PLAN_TYPE:
				return convertInsurancePlanTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PROVENANCE_HISTORY_RECORD_ACTIVITY_CODES:
				return convertProvenanceHistoryRecordActivityCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CHROMOSOMEHUMAN:
				return convertChromosomehumanToString(eDataType, instanceValue);
			case ValueSetsPackage.ENSEMBL:
				return convertEnsemblToString(eDataType, instanceValue);
			case ValueSetsPackage.FD_ASTANDARD_SEQUENCE:
				return convertFdAStandardSequenceToString(eDataType, instanceValue);
			case ValueSetsPackage.FD_AMETHOD:
				return convertFdAMethodToString(eDataType, instanceValue);
			case ValueSetsPackage.ALLERGY_INTOLERANCE_SUBSTANCE_PRODUCT_CONDITION_AND_NEGATION_CODES:
				return convertAllergyIntoleranceSubstanceProductConditionAndNegationCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.CATALOG_TYPE:
				return convertCatalogTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_TARGET_DISEASE_CODES:
				return convertImmunizationRecommendationTargetDiseaseCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return convertImmunizationRecommendationStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_REASON_CODES:
				return convertImmunizationRecommendationReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return convertImmunizationRecommendationDateCriterionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NEED:
				return convertNeedToString(eDataType, instanceValue);
			case ValueSetsPackage.VALIDATIONTYPE:
				return convertValidationtypeToString(eDataType, instanceValue);
			case ValueSetsPackage.VALIDATIONPROCESS:
				return convertValidationprocessToString(eDataType, instanceValue);
			case ValueSetsPackage.FAILUREACTION:
				return convertFailureactionToString(eDataType, instanceValue);
			case ValueSetsPackage.PRIMARYSOURCETYPE:
				return convertPrimarysourcetypeToString(eDataType, instanceValue);
			case ValueSetsPackage.VERIFICATIONRESULTCOMMUNICATIONMETHOD:
				return convertVerificationresultcommunicationmethodToString(eDataType, instanceValue);
			case ValueSetsPackage.VALIDATIONSTATUS:
				return convertValidationstatusToString(eDataType, instanceValue);
			case ValueSetsPackage.CANPUSHUPDATES:
				return convertCanpushupdatesToString(eDataType, instanceValue);
			case ValueSetsPackage.PUSHTYPEAVAILABLE:
				return convertPushtypeavailableToString(eDataType, instanceValue);
			case ValueSetsPackage.FOOD_TYPE_CODES:
				return convertFoodTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.DIET_CODES:
				return convertDietCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.NUTRIENT_MODIFIER_CODES:
				return convertNutrientModifierCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.TEXTURE_MODIFIER_CODES:
				return convertTextureModifierCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return convertTextureModifiedFoodTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return convertFluidConsistencyTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SUPPLEMENT_TYPE_CODES:
				return convertSupplementTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_FORMULA_TYPE_CODES:
				return convertEnteralFormulaTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return convertEnteralFormulaAdditiveTypeCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.ENTERAL_ROUTE_CODES:
				return convertEnteralRouteCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.SNOMEDCT_DRUG_THERAPY_STATUS_CODES:
				return convertSnomedctDrugTherapyStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_STATUS_CODES:
				return convertMedicationStatusCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ID:
				return convertAuditEventIdToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_SUB_TYPE:
				return convertAuditEventSubTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.PARTICIPATION_ROLE_TYPE:
				return convertParticipationRoleTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDIA_TYPE_CODE:
				return convertMediaTypeCodeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_SOURCE_TYPE:
				return convertAuditEventSourceTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_TYPE:
				return convertAuditEventEntityTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.AUDIT_EVENT_ENTITY_ROLE:
				return convertAuditEventEntityRoleToString(eDataType, instanceValue);
			case ValueSetsPackage.OBJECT_LIFECYCLE_EVENTS:
				return convertObjectLifecycleEventsToString(eDataType, instanceValue);
			case ValueSetsPackage.BASIC_RESOURCE_TYPES:
				return convertBasicResourceTypesToString(eDataType, instanceValue);
			case ValueSetsPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return convertExampleVisionPrescriptionProductCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_STATUS_REASON_CODES:
				return convertMedicationDispenseStatusReasonCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_CATEGORY_CODES:
				return convertMedicationDispenseCategoryCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_DISPENSE_PERFORMER_FUNCTION_CODES:
				return convertMedicationDispensePerformerFunctionCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.V3_ACT_PHARMACY_SUPPLY_TYPE:
				return convertV3ActPharmacySupplyTypeToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_KNOWLEDGE_PACKAGE_TYPE_CODES:
				return convertMedicationKnowledgePackageTypeCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.MEDICATION_KNOWLEDGE_CHARACTERISTIC_CODES:
				return convertMedicationKnowledgeCharacteristicCodesToString(eDataType, instanceValue);
			case ValueSetsPackage.COVERAGE_ELIGIBILITY_RESPONSE_AUTH_SUPPORT_CODES:
				return convertCoverageEligibilityResponseAuthSupportCodesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue) {
		ResourceType result = ResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierTypeCodes createIdentifierTypeCodesFromString(EDataType eDataType, String initialValue) {
		IdentifierTypeCodes result = IdentifierTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContextType createUsageContextTypeFromString(EDataType eDataType, String initialValue) {
		UsageContextType result = UsageContextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageContextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextOfUseValueSet createContextOfUseValueSetFromString(EDataType eDataType, String initialValue) {
		ContextOfUseValueSet result = ContextOfUseValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextOfUseValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionValueSet createJurisdictionValueSetFromString(EDataType eDataType, String initialValue) {
		JurisdictionValueSet result = JurisdictionValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJurisdictionValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionUseCodes createDefinitionUseCodesFromString(EDataType eDataType, String initialValue) {
		DefinitionUseCodes result = DefinitionUseCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionUseCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDefinedType createFhirDefinedTypeFromString(EDataType eDataType, String initialValue) {
		FhirDefinedType result = FhirDefinedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDefinedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincCodes createLoincCodesFromString(EDataType eDataType, String initialValue) {
		LoincCodes result = LoincCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonLanguages createCommonLanguagesFromString(EDataType eDataType, String initialValue) {
		CommonLanguages result = CommonLanguages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonLanguagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureTypeCodes createSignatureTypeCodesFromString(EDataType eDataType, String initialValue) {
		SignatureTypeCodes result = SignatureTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignatureTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2036027 createV2036027FromString(EDataType eDataType, String initialValue) {
		V2036027 result = V2036027.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2036027ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingAbbreviation createTimingAbbreviationFromString(EDataType eDataType, String initialValue) {
		TimingAbbreviation result = TimingAbbreviation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingAbbreviationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectType createSubjectTypeFromString(EDataType eDataType, String initialValue) {
		SubjectType result = SubjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignationUse createDesignationUseFromString(EDataType eDataType, String initialValue) {
		DesignationUse result = DesignationUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignationUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguage createExpressionLanguageFromString(EDataType eDataType, String initialValue) {
		ExpressionLanguage result = ExpressionLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctAdditionalDosageInstructions createSnomedctAdditionalDosageInstructionsFromString(EDataType eDataType, String initialValue) {
		SnomedctAdditionalDosageInstructions result = SnomedctAdditionalDosageInstructions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctAdditionalDosageInstructionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctMedicationAsNeededReasonCodes createSnomedctMedicationAsNeededReasonCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctMedicationAsNeededReasonCodes result = SnomedctMedicationAsNeededReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctMedicationAsNeededReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctAnatomicalStructureForAdministrationSiteCodes createSnomedctAnatomicalStructureForAdministrationSiteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctAnatomicalStructureForAdministrationSiteCodes result = SnomedctAnatomicalStructureForAdministrationSiteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctAnatomicalStructureForAdministrationSiteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctRouteCodes createSnomedctRouteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctRouteCodes result = SnomedctRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctAdministrationMethodCodes createSnomedctAdministrationMethodCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctAdministrationMethodCodes result = SnomedctAdministrationMethodCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctAdministrationMethodCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseAndRateType createDoseAndRateTypeFromString(EDataType eDataType, String initialValue) {
		DoseAndRateType result = DoseAndRateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseAndRateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllSecurityLabels createAllSecurityLabelsFromString(EDataType eDataType, String initialValue) {
		AllSecurityLabels result = AllSecurityLabels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllSecurityLabelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonTags createCommonTagsFromString(EDataType eDataType, String initialValue) {
		CommonTags result = CommonTags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonTagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationType createOrganizationTypeFromString(EDataType eDataType, String initialValue) {
		OrganizationType result = OrganizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrganizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactEntityType createContactEntityTypeFromString(EDataType eDataType, String initialValue) {
		ContactEntityType result = ContactEntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointConnectionType createEndpointConnectionTypeFromString(EDataType eDataType, String initialValue) {
		EndpointConnectionType result = EndpointConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointPayloadType createEndpointPayloadTypeFromString(EDataType eDataType, String initialValue) {
		EndpointPayloadType result = EndpointPayloadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointPayloadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryType createLibraryTypeFromString(EDataType eDataType, String initialValue) {
		LibraryType result = LibraryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionTopic createDefinitionTopicFromString(EDataType eDataType, String initialValue) {
		DefinitionTopic result = DefinitionTopic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionTopicToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureScoring createMeasureScoringFromString(EDataType eDataType, String initialValue) {
		MeasureScoring result = MeasureScoring.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureScoringToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasureScoring createCompositeMeasureScoringFromString(EDataType eDataType, String initialValue) {
		CompositeMeasureScoring result = CompositeMeasureScoring.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeMeasureScoringToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureTypeFromString(EDataType eDataType, String initialValue) {
		MeasureType result = MeasureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulationType createMeasurePopulationTypeFromString(EDataType eDataType, String initialValue) {
		MeasurePopulationType result = MeasurePopulationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurePopulationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDataUsage createMeasureDataUsageFromString(EDataType eDataType, String initialValue) {
		MeasureDataUsage result = MeasureDataUsage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureDataUsageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaritalStatusCodes createMaritalStatusCodesFromString(EDataType eDataType, String initialValue) {
		MaritalStatusCodes result = MaritalStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaritalStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContactRelationship createPatientContactRelationshipFromString(EDataType eDataType, String initialValue) {
		PatientContactRelationship result = PatientContactRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientContactRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleUseCodesForList createExampleUseCodesForListFromString(EDataType eDataType, String initialValue) {
		ExampleUseCodesForList result = ExampleUseCodesForList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleUseCodesForListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActEncounterCode createV3ActEncounterCodeFromString(EDataType eDataType, String initialValue) {
		V3ActEncounterCode result = V3ActEncounterCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActEncounterCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterType createEncounterTypeFromString(EDataType eDataType, String initialValue) {
		EncounterType result = EncounterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue) {
		ServiceType result = ServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActPriority createV3ActPriorityFromString(EDataType eDataType, String initialValue) {
		V3ActPriority result = V3ActPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareType createEpisodeOfCareTypeFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareType result = EpisodeOfCareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCategoryCodes createConditionCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ConditionCategoryCodes result = ConditionCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDiagnosisSeverity createConditionDiagnosisSeverityFromString(EDataType eDataType, String initialValue) {
		ConditionDiagnosisSeverity result = ConditionDiagnosisSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionDiagnosisSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionProblemDiagnosisCodes createConditionProblemDiagnosisCodesFromString(EDataType eDataType, String initialValue) {
		ConditionProblemDiagnosisCodes result = ConditionProblemDiagnosisCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionProblemDiagnosisCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctBodyStructures createSnomedctBodyStructuresFromString(EDataType eDataType, String initialValue) {
		SnomedctBodyStructures result = SnomedctBodyStructures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctBodyStructuresToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStageFromString(EDataType eDataType, String initialValue) {
		ConditionStage result = ConditionStage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionStageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvestigationType createInvestigationTypeFromString(EDataType eDataType, String initialValue) {
		InvestigationType result = InvestigationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvestigationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionType createPlanDefinitionTypeFromString(EDataType eDataType, String initialValue) {
		PlanDefinitionType result = PlanDefinitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanDefinitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalCategory createGoalCategoryFromString(EDataType eDataType, String initialValue) {
		GoalCategory result = GoalCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctClinicalFindings createSnomedctClinicalFindingsFromString(EDataType eDataType, String initialValue) {
		SnomedctClinicalFindings result = SnomedctClinicalFindings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctClinicalFindingsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalPriority createGoalPriorityFromString(EDataType eDataType, String initialValue) {
		GoalPriority result = GoalPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStartEvent createGoalStartEventFromString(EDataType eDataType, String initialValue) {
		GoalStartEvent result = GoalStartEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStartEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantRole createActionParticipantRoleFromString(EDataType eDataType, String initialValue) {
		ActionParticipantRole result = ActionParticipantRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanCategory createCarePlanCategoryFromString(EDataType eDataType, String initialValue) {
		CarePlanCategory result = CarePlanCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamCategory createCareTeamCategoryFromString(EDataType eDataType, String initialValue) {
		CareTeamCategory result = CareTeamCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRoles createParticipantRolesFromString(EDataType eDataType, String initialValue) {
		ParticipantRoles result = ParticipantRoles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRolesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalAchievementStatus createGoalAchievementStatusFromString(EDataType eDataType, String initialValue) {
		GoalAchievementStatus result = GoalAchievementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalAchievementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityOutcome createCarePlanActivityOutcomeFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityOutcome result = CarePlanActivityOutcome.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityOutcomeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentCancellationReason createAppointmentCancellationReasonFromString(EDataType eDataType, String initialValue) {
		AppointmentCancellationReason result = AppointmentCancellationReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentCancellationReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory createServiceCategoryFromString(EDataType eDataType, String initialValue) {
		ServiceCategory result = ServiceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PracticeSettingCodeValueSet createPracticeSettingCodeValueSetFromString(EDataType eDataType, String initialValue) {
		PracticeSettingCodeValueSet result = PracticeSettingCodeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPracticeSettingCodeValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20276 createV20276FromString(EDataType eDataType, String initialValue) {
		V20276 result = V20276.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20276ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterReasonCodes createEncounterReasonCodesFromString(EDataType eDataType, String initialValue) {
		EncounterReasonCodes result = EncounterReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCodesSnomedcT createProcedureCodesSnomedcTFromString(EDataType eDataType, String initialValue) {
		ProcedureCodesSnomedcT result = ProcedureCodesSnomedcT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCodesSnomedcTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20116 createV20116FromString(EDataType eDataType, String initialValue) {
		V20116 result = V20116.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20116ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ServiceDeliveryLocationRoleType createV3ServiceDeliveryLocationRoleTypeFromString(EDataType eDataType, String initialValue) {
		V3ServiceDeliveryLocationRoleType result = V3ServiceDeliveryLocationRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ServiceDeliveryLocationRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeFromString(EDataType eDataType, String initialValue) {
		LocationType result = LocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctMedicationCodes createSnomedctMedicationCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctMedicationCodes result = SnomedctMedicationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctMedicationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20487 createV20487FromString(EDataType eDataType, String initialValue) {
		V20487 result = V20487.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20487ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreparePatient createPreparePatientFromString(EDataType eDataType, String initialValue) {
		PreparePatient result = PreparePatient.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreparePatientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollectionFromString(EDataType eDataType, String initialValue) {
		SpecimenCollection result = SpecimenCollection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenCollectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerMaterials createContainerMaterialsFromString(EDataType eDataType, String initialValue) {
		ContainerMaterials result = ContainerMaterials.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerMaterialsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainerType createSpecimenContainerTypeFromString(EDataType eDataType, String initialValue) {
		SpecimenContainerType result = SpecimenContainerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerCap createContainerCapFromString(EDataType eDataType, String initialValue) {
		ContainerCap result = ContainerCap.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerCapToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20371 createV20371FromString(EDataType eDataType, String initialValue) {
		V20371 result = V20371.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20371ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RejectionCriterion createRejectionCriterionFromString(EDataType eDataType, String initialValue) {
		RejectionCriterion result = RejectionCriterion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRejectionCriterionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlingConditionSet createHandlingConditionSetFromString(EDataType eDataType, String initialValue) {
		HandlingConditionSet result = HandlingConditionSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandlingConditionSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationCategoryCodes createObservationCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ObservationCategoryCodes result = ObservationCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMethods createObservationMethodsFromString(EDataType eDataType, String initialValue) {
		ObservationMethods result = ObservationMethods.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UcumCodes createUcumCodesFromString(EDataType eDataType, String initialValue) {
		UcumCodes result = UcumCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUcumCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRangeMeaningCodes createObservationReferenceRangeMeaningCodesFromString(EDataType eDataType, String initialValue) {
		ObservationReferenceRangeMeaningCodes result = ObservationReferenceRangeMeaningCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationReferenceRangeMeaningCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRangeAppliesToCodes createObservationReferenceRangeAppliesToCodesFromString(EDataType eDataType, String initialValue) {
		ObservationReferenceRangeAppliesToCodes result = ObservationReferenceRangeAppliesToCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationReferenceRangeAppliesToCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequestCategoryCodes createServiceRequestCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ServiceRequestCategoryCodes result = ServiceRequestCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRequestCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequestOrderDetailsCodes createServiceRequestOrderDetailsCodesFromString(EDataType eDataType, String initialValue) {
		ServiceRequestOrderDetailsCodes result = ServiceRequestOrderDetailsCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRequestOrderDetailsCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureReasonCodes createProcedureReasonCodesFromString(EDataType eDataType, String initialValue) {
		ProcedureReasonCodes result = ProcedureReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageTypeAndSelfPayCodes createCoverageTypeAndSelfPayCodesFromString(EDataType eDataType, String initialValue) {
		CoverageTypeAndSelfPayCodes result = CoverageTypeAndSelfPayCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageTypeAndSelfPayCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriberRelationshipCodes createSubscriberRelationshipCodesFromString(EDataType eDataType, String initialValue) {
		SubscriberRelationshipCodes result = SubscriberRelationshipCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriberRelationshipCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageClassCodes createCoverageClassCodesFromString(EDataType eDataType, String initialValue) {
		CoverageClassCodes result = CoverageClassCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageClassCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageCopayTypeCodes createCoverageCopayTypeCodesFromString(EDataType eDataType, String initialValue) {
		CoverageCopayTypeCodes result = CoverageCopayTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageCopayTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleCoverageFinancialExceptionCodes createExampleCoverageFinancialExceptionCodesFromString(EDataType eDataType, String initialValue) {
		ExampleCoverageFinancialExceptionCodes result = ExampleCoverageFinancialExceptionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleCoverageFinancialExceptionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceLegalStateCodes createContractResourceLegalStateCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceLegalStateCodes result = ContractResourceLegalStateCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceLegalStateCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractContentDerivationCodes createContractContentDerivationCodesFromString(EDataType eDataType, String initialValue) {
		ContractContentDerivationCodes result = ContractContentDerivationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractContentDerivationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceExpirationTypeCodes createContractResourceExpirationTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceExpirationTypeCodes result = ContractResourceExpirationTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceExpirationTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceScopeCodes createContractResourceScopeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceScopeCodes result = ContractResourceScopeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceScopeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTypeCodes createContractTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTypeCodes result = ContractTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSubtypeCodes createContractSubtypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractSubtypeCodes result = ContractSubtypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractSubtypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceDefinitionTypeCodes createContractResourceDefinitionTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceDefinitionTypeCodes result = ContractResourceDefinitionTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceDefinitionTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceDefinitionSubtypeCodes createContractResourceDefinitionSubtypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceDefinitionSubtypeCodes result = ContractResourceDefinitionSubtypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceDefinitionSubtypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTypeCodes createContractTermTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermTypeCodes result = ContractTermTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermSubtypeCodes createContractTermSubtypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermSubtypeCodes result = ContractTermSubtypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermSubtypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceScopeCodesA createContractResourceScopeCodesAFromString(EDataType eDataType, String initialValue) {
		ContractResourceScopeCodesA result = ContractResourceScopeCodesA.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceScopeCodesAToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceScopeCodesB createContractResourceScopeCodesBFromString(EDataType eDataType, String initialValue) {
		ContractResourceScopeCodesB result = ContractResourceScopeCodesB.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceScopeCodesBToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceSecurityControlCodes createContractResourceSecurityControlCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceSecurityControlCodes result = ContractResourceSecurityControlCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceSecurityControlCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePartyRoleCodes createContractResourcePartyRoleCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourcePartyRoleCodes result = ContractResourcePartyRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourcePartyRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActConsentDirective createV3ActConsentDirectiveFromString(EDataType eDataType, String initialValue) {
		V3ActConsentDirective result = V3ActConsentDirective.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActConsentDirectiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceDecisionModeCodes createContractResourceDecisionModeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceDecisionModeCodes result = ContractResourceDecisionModeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceDecisionModeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceAssetScopeCodes createContractResourceAssetScopeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceAssetScopeCodes result = ContractResourceAssetScopeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceAssetScopeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceAssetTypeCodes createContractResourceAssetTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceAssetTypeCodes result = ContractResourceAssetTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceAssetTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceAssetSubTypeCodes createContractResourceAssetSubTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceAssetSubTypeCodes result = ContractResourceAssetSubTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceAssetSubTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentContentClass createConsentContentClassFromString(EDataType eDataType, String initialValue) {
		ConsentContentClass result = ConsentContentClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentContentClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceAssetContextCodes createContractResourceAssetContextCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceAssetContextCodes result = ContractResourceAssetContextCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceAssetContextCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceAssetAvailiabilityCodes createContractResourceAssetAvailiabilityCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceAssetAvailiabilityCodes result = ContractResourceAssetAvailiabilityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceAssetAvailiabilityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActionCodes createContractActionCodesFromString(EDataType eDataType, String initialValue) {
		ContractActionCodes result = ContractActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActorRoleCodes createContractActorRoleCodesFromString(EDataType eDataType, String initialValue) {
		ContractActorRoleCodes result = ContractActorRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractActorRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3PurposeOfUse createV3PurposeOfUseFromString(EDataType eDataType, String initialValue) {
		V3PurposeOfUse result = V3PurposeOfUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3PurposeOfUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceActionStatusCodes createContractResourceActionStatusCodesFromString(EDataType eDataType, String initialValue) {
		ContractResourceActionStatusCodes result = ContractResourceActionStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceActionStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceParticipantType createProvenanceParticipantTypeFromString(EDataType eDataType, String initialValue) {
		ProvenanceParticipantType result = ProvenanceParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceParticipantRole createProvenanceParticipantRoleFromString(EDataType eDataType, String initialValue) {
		ProvenanceParticipantRole result = ProvenanceParticipantRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceParticipantRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRelationshipType createPatientRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		PatientRelationshipType result = PatientRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceActivityType createProvenanceActivityTypeFromString(EDataType eDataType, String initialValue) {
		ProvenanceActivityType result = ProvenanceActivityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType createSecurityRoleTypeFromString(EDataType eDataType, String initialValue) {
		SecurityRoleType result = SecurityRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSignerTypeCodes createContractSignerTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractSignerTypeCodes result = ContractSignerTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractSignerTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirSpecimenCollectionMethod createFhirSpecimenCollectionMethodFromString(EDataType eDataType, String initialValue) {
		FhirSpecimenCollectionMethod result = FhirSpecimenCollectionMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirSpecimenCollectionMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20916 createV20916FromString(EDataType eDataType, String initialValue) {
		V20916 result = V20916.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20916ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenProcessingProcedure createSpecimenProcessingProcedureFromString(EDataType eDataType, String initialValue) {
		SpecimenProcessingProcedure result = SpecimenProcessingProcedure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenProcessingProcedureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceCategoryCodes createSubstanceCategoryCodesFromString(EDataType eDataType, String initialValue) {
		SubstanceCategoryCodes result = SubstanceCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceCode createSubstanceCodeFromString(EDataType eDataType, String initialValue) {
		SubstanceCode result = SubstanceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20493 createV20493FromString(EDataType eDataType, String initialValue) {
		V20493 result = V20493.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20493ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantType createParticipantTypeFromString(EDataType eDataType, String initialValue) {
		ParticipantType result = ParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctReasonMedicationNotGivenCodes createSnomedctReasonMedicationNotGivenCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctReasonMedicationNotGivenCodes result = SnomedctReasonMedicationNotGivenCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctReasonMedicationNotGivenCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationCategoryCodes createMedicationAdministrationCategoryCodesFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationCategoryCodes result = MedicationAdministrationCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationPerformerFunctionCodes createMedicationAdministrationPerformerFunctionCodesFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationPerformerFunctionCodes result = MedicationAdministrationPerformerFunctionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationPerformerFunctionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonMedicationGivenCodes createReasonMedicationGivenCodesFromString(EDataType eDataType, String initialValue) {
		ReasonMedicationGivenCodes result = ReasonMedicationGivenCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonMedicationGivenCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatusReasonCodes createMedicationRequestStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		MedicationRequestStatusReasonCodes result = MedicationRequestStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestCategoryCodes createMedicationRequestCategoryCodesFromString(EDataType eDataType, String initialValue) {
		MedicationRequestCategoryCodes result = MedicationRequestCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformerRoleCodes createProcedurePerformerRoleCodesFromString(EDataType eDataType, String initialValue) {
		ProcedurePerformerRoleCodes result = ProcedurePerformerRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedurePerformerRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestCourseOfTherapyCodes createMedicationRequestCourseOfTherapyCodesFromString(EDataType eDataType, String initialValue) {
		MedicationRequestCourseOfTherapyCodes result = MedicationRequestCourseOfTherapyCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestCourseOfTherapyCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActSubstanceAdminSubstitutionCode createV3ActSubstanceAdminSubstitutionCodeFromString(EDataType eDataType, String initialValue) {
		V3ActSubstanceAdminSubstitutionCode result = V3ActSubstanceAdminSubstitutionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActSubstanceAdminSubstitutionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3SubstanceAdminSubstitutionReason createV3SubstanceAdminSubstitutionReasonFromString(EDataType eDataType, String initialValue) {
		V3SubstanceAdminSubstitutionReason result = V3SubstanceAdminSubstitutionReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3SubstanceAdminSubstitutionReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueCategory createDetectedIssueCategoryFromString(EDataType eDataType, String initialValue) {
		DetectedIssueCategory result = DetectedIssueCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationAndSymptomCodes createManifestationAndSymptomCodesFromString(EDataType eDataType, String initialValue) {
		ManifestationAndSymptomCodes result = ManifestationAndSymptomCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManifestationAndSymptomCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigationAction createDetectedIssueMitigationActionFromString(EDataType eDataType, String initialValue) {
		DetectedIssueMitigationAction result = DetectedIssueMitigationAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueMitigationActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDeviceTypes createFhirDeviceTypesFromString(EDataType eDataType, String initialValue) {
		FhirDeviceTypes result = FhirDeviceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDeviceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSafety createDeviceSafetyFromString(EDataType eDataType, String initialValue) {
		DeviceSafety result = DeviceSafety.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceSafetyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDeviceStatusReason createFhirDeviceStatusReasonFromString(EDataType eDataType, String initialValue) {
		FhirDeviceStatusReason result = FhirDeviceStatusReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDeviceStatusReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceTypeFromString(EDataType eDataType, String initialValue) {
		DeviceType result = DeviceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAbsentReason createDataAbsentReasonFromString(EDataType eDataType, String initialValue) {
		DataAbsentReason result = DataAbsentReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataAbsentReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationInterpretationCodes createObservationInterpretationCodesFromString(EDataType eDataType, String initialValue) {
		ObservationInterpretationCodes result = ObservationInterpretationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationInterpretationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentClassValueSet createDocumentClassValueSetFromString(EDataType eDataType, String initialValue) {
		DocumentClassValueSet result = DocumentClassValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentClassValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceFormatCodeSet createDocumentReferenceFormatCodeSetFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceFormatCodeSet result = DocumentReferenceFormatCodeSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceFormatCodeSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActCode createV3ActCodeFromString(EDataType eDataType, String initialValue) {
		V3ActCode result = V3ActCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityTypeCodeValueSet createFacilityTypeCodeValueSetFromString(EDataType eDataType, String initialValue) {
		FacilityTypeCodeValueSet result = FacilityTypeCodeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityTypeCodeValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionPrognosis createClinicalImpressionPrognosisFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionPrognosis result = ClinicalImpressionPrognosis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionPrognosisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskProbability createRiskProbabilityFromString(EDataType eDataType, String initialValue) {
		RiskProbability result = RiskProbability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskProbabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStageType createConditionStageTypeFromString(EDataType eDataType, String initialValue) {
		ConditionStageType result = ConditionStageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionStageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosisRole createDiagnosisRoleFromString(EDataType eDataType, String initialValue) {
		DiagnosisRole result = DiagnosisRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosisRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountTypes createAccountTypesFromString(EDataType eDataType, String initialValue) {
		AccountTypes result = AccountTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmitSource createAdmitSourceFromString(EDataType eDataType, String initialValue) {
		AdmitSource result = AdmitSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdmitSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V20092 createV20092FromString(EDataType eDataType, String initialValue) {
		V20092 result = V20092.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV20092ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet createDietFromString(EDataType eDataType, String initialValue) {
		Diet result = Diet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialCourtesy createSpecialCourtesyFromString(EDataType eDataType, String initialValue) {
		SpecialCourtesy result = SpecialCourtesy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialCourtesyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialArrangements createSpecialArrangementsFromString(EDataType eDataType, String initialValue) {
		SpecialArrangements result = SpecialArrangements.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialArrangementsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDisposition createDischargeDispositionFromString(EDataType eDataType, String initialValue) {
		DischargeDisposition result = DischargeDisposition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDischargeDispositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrderCodes createListOrderCodesFromString(EDataType eDataType, String initialValue) {
		ListOrderCodes result = ListOrderCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOrderCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMedicineChangeTypes createPatientMedicineChangeTypesFromString(EDataType eDataType, String initialValue) {
		PatientMedicineChangeTypes result = PatientMedicineChangeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientMedicineChangeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEmptyReasons createListEmptyReasonsFromString(EDataType eDataType, String initialValue) {
		ListEmptyReasons result = ListEmptyReasons.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListEmptyReasonsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyPrimaryPurposeType createResearchStudyPrimaryPurposeTypeFromString(EDataType eDataType, String initialValue) {
		ResearchStudyPrimaryPurposeType result = ResearchStudyPrimaryPurposeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyPrimaryPurposeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyPhase createResearchStudyPhaseFromString(EDataType eDataType, String initialValue) {
		ResearchStudyPhase result = ResearchStudyPhase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyPhaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyReasonStopped createResearchStudyReasonStoppedFromString(EDataType eDataType, String initialValue) {
		ResearchStudyReasonStopped result = ResearchStudyReasonStopped.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyReasonStoppedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyObjectiveType createResearchStudyObjectiveTypeFromString(EDataType eDataType, String initialValue) {
		ResearchStudyObjectiveType result = ResearchStudyObjectiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyObjectiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentScopeCodes createConsentScopeCodesFromString(EDataType eDataType, String initialValue) {
		ConsentScopeCodes result = ConsentScopeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentScopeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentCategoryCodes createConsentCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ConsentCategoryCodes result = ConsentCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentPolicyRuleCodes createConsentPolicyRuleCodesFromString(EDataType eDataType, String initialValue) {
		ConsentPolicyRuleCodes result = ConsentPolicyRuleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentPolicyRuleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActionCodes createConsentActionCodesFromString(EDataType eDataType, String initialValue) {
		ConsentActionCodes result = ConsentActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentContentCodes createConsentContentCodesFromString(EDataType eDataType, String initialValue) {
		ConsentContentCodes result = ConsentContentCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentContentCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemCode createChargeItemCodeFromString(EDataType eDataType, String initialValue) {
		ChargeItemCode result = ChargeItemCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctFormCodes createSnomedctFormCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctFormCodes result = SnomedctFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcD10Codes createIcD10CodesFromString(EDataType eDataType, String initialValue) {
		IcD10Codes result = IcD10Codes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIcD10CodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticServiceSectionCodes createDiagnosticServiceSectionCodesFromString(EDataType eDataType, String initialValue) {
		DiagnosticServiceSectionCodes result = DiagnosticServiceSectionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticServiceSectionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincDiagnosticReportCodes createLoincDiagnosticReportCodesFromString(EDataType eDataType, String initialValue) {
		LoincDiagnosticReportCodes result = LoincDiagnosticReportCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincDiagnosticReportCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionModality createAcquisitionModalityFromString(EDataType eDataType, String initialValue) {
		AcquisitionModality result = AcquisitionModality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcquisitionModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNotPerformedReasonSnomeDCT createProcedureNotPerformedReasonSnomeDCTFromString(EDataType eDataType, String initialValue) {
		ProcedureNotPerformedReasonSnomeDCT result = ProcedureNotPerformedReasonSnomeDCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureNotPerformedReasonSnomeDCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCategoryCodesSnomedcT createProcedureCategoryCodesSnomedcTFromString(EDataType eDataType, String initialValue) {
		ProcedureCategoryCodesSnomedcT result = ProcedureCategoryCodesSnomedcT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCategoryCodesSnomedcTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureOutcomeCodesSnomedcT createProcedureOutcomeCodesSnomedcTFromString(EDataType eDataType, String initialValue) {
		ProcedureOutcomeCodesSnomedcT result = ProcedureOutcomeCodesSnomedcT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureOutcomeCodesSnomedcTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFollowUpCodesSnomedcT createProcedureFollowUpCodesSnomedcTFromString(EDataType eDataType, String initialValue) {
		ProcedureFollowUpCodesSnomedcT result = ProcedureFollowUpCodesSnomedcT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureFollowUpCodesSnomedcTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDeviceActionCodes createProcedureDeviceActionCodesFromString(EDataType eDataType, String initialValue) {
		ProcedureDeviceActionCodes result = ProcedureDeviceActionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureDeviceActionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laterality createLateralityFromString(EDataType eDataType, String initialValue) {
		Laterality result = Laterality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLateralityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeriesPerformerFunction createImagingStudySeriesPerformerFunctionFromString(EDataType eDataType, String initialValue) {
		ImagingStudySeriesPerformerFunction result = ImagingStudySeriesPerformerFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingStudySeriesPerformerFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaModality createMediaModalityFromString(EDataType eDataType, String initialValue) {
		MediaModality result = MediaModality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaCollectionViewProjection createMediaCollectionViewProjectionFromString(EDataType eDataType, String initialValue) {
		MediaCollectionViewProjection result = MediaCollectionViewProjection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaCollectionViewProjectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationNotDoneReason createCommunicationNotDoneReasonFromString(EDataType eDataType, String initialValue) {
		CommunicationNotDoneReason result = CommunicationNotDoneReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationNotDoneReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationCategory createCommunicationCategoryFromString(EDataType eDataType, String initialValue) {
		CommunicationCategory result = CommunicationCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ParticipationMode createV3ParticipationModeFromString(EDataType eDataType, String initialValue) {
		V3ParticipationMode result = V3ParticipationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ParticipationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationTopic createCommunicationTopicFromString(EDataType eDataType, String initialValue) {
		CommunicationTopic result = CommunicationTopic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTopicToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimTypeCodes createClaimTypeCodesFromString(EDataType eDataType, String initialValue) {
		ClaimTypeCodes result = ClaimTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleClaimSubTypeCodes createExampleClaimSubTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleClaimSubTypeCodes result = ExampleClaimSubTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleClaimSubTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPriorityCodes createProcessPriorityCodesFromString(EDataType eDataType, String initialValue) {
		ProcessPriorityCodes result = ProcessPriorityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessPriorityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FundsReservationCodes createFundsReservationCodesFromString(EDataType eDataType, String initialValue) {
		FundsReservationCodes result = FundsReservationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFundsReservationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRelatedClaimRelationshipCodes createExampleRelatedClaimRelationshipCodesFromString(EDataType eDataType, String initialValue) {
		ExampleRelatedClaimRelationshipCodes result = ExampleRelatedClaimRelationshipCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleRelatedClaimRelationshipCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayeeTypeCodes createClaimPayeeTypeCodesFromString(EDataType eDataType, String initialValue) {
		ClaimPayeeTypeCodes result = ClaimPayeeTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimPayeeTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeamRoleCodes createClaimCareTeamRoleCodesFromString(EDataType eDataType, String initialValue) {
		ClaimCareTeamRoleCodes result = ClaimCareTeamRoleCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimCareTeamRoleCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleProviderQualificationCodes createExampleProviderQualificationCodesFromString(EDataType eDataType, String initialValue) {
		ExampleProviderQualificationCodes result = ExampleProviderQualificationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleProviderQualificationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInformationCategoryCodes createClaimInformationCategoryCodesFromString(EDataType eDataType, String initialValue) {
		ClaimInformationCategoryCodes result = ClaimInformationCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimInformationCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionCodes createExceptionCodesFromString(EDataType eDataType, String initialValue) {
		ExceptionCodes result = ExceptionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingToothReasonCodes createMissingToothReasonCodesFromString(EDataType eDataType, String initialValue) {
		MissingToothReasonCodes result = MissingToothReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMissingToothReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleDiagnosisTypeCodes createExampleDiagnosisTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleDiagnosisTypeCodes result = ExampleDiagnosisTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleDiagnosisTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleDiagnosisOnAdmissionCodes createExampleDiagnosisOnAdmissionCodesFromString(EDataType eDataType, String initialValue) {
		ExampleDiagnosisOnAdmissionCodes result = ExampleDiagnosisOnAdmissionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleDiagnosisOnAdmissionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleDiagnosisRelatedGroupCodes createExampleDiagnosisRelatedGroupCodesFromString(EDataType eDataType, String initialValue) {
		ExampleDiagnosisRelatedGroupCodes result = ExampleDiagnosisRelatedGroupCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleDiagnosisRelatedGroupCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleProcedureTypeCodes createExampleProcedureTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExampleProcedureTypeCodes result = ExampleProcedureTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleProcedureTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IcD10ProcedureCodes createIcD10ProcedureCodesFromString(EDataType eDataType, String initialValue) {
		IcD10ProcedureCodes result = IcD10ProcedureCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIcD10ProcedureCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActIncidentCode createV3ActIncidentCodeFromString(EDataType eDataType, String initialValue) {
		V3ActIncidentCode result = V3ActIncidentCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActIncidentCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleRevenueCenterCodes createExampleRevenueCenterCodesFromString(EDataType eDataType, String initialValue) {
		ExampleRevenueCenterCodes result = ExampleRevenueCenterCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleRevenueCenterCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitCategoryCodes createBenefitCategoryCodesFromString(EDataType eDataType, String initialValue) {
		BenefitCategoryCodes result = BenefitCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsclsCodes createUsclsCodesFromString(EDataType eDataType, String initialValue) {
		UsclsCodes result = UsclsCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsclsCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierTypeCodes createModifierTypeCodesFromString(EDataType eDataType, String initialValue) {
		ModifierTypeCodes result = ModifierTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleProgramReasonCodes createExampleProgramReasonCodesFromString(EDataType eDataType, String initialValue) {
		ExampleProgramReasonCodes result = ExampleProgramReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleProgramReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleServicePlaceCodes createExampleServicePlaceCodesFromString(EDataType eDataType, String initialValue) {
		ExampleServicePlaceCodes result = ExampleServicePlaceCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleServicePlaceCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OralSiteCodes createOralSiteCodesFromString(EDataType eDataType, String initialValue) {
		OralSiteCodes result = OralSiteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOralSiteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceCodes createSurfaceCodesFromString(EDataType eDataType, String initialValue) {
		SurfaceCodes result = SurfaceCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurfaceCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationValueCodes createAdjudicationValueCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationValueCodes result = AdjudicationValueCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationValueCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationReasonCodes createAdjudicationReasonCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationReasonCodes result = AdjudicationReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamplePaymentTypeCodes createExamplePaymentTypeCodesFromString(EDataType eDataType, String initialValue) {
		ExamplePaymentTypeCodes result = ExamplePaymentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExamplePaymentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentAdjustmentReasonCodes createPaymentAdjustmentReasonCodesFromString(EDataType eDataType, String initialValue) {
		PaymentAdjustmentReasonCodes result = PaymentAdjustmentReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentAdjustmentReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormCodes createFormCodesFromString(EDataType eDataType, String initialValue) {
		FormCodes result = FormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActReason createV3ActReasonFromString(EDataType eDataType, String initialValue) {
		V3ActReason result = V3ActReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicationErrorCodes createAdjudicationErrorCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationErrorCodes result = AdjudicationErrorCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationErrorCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvisionConditions createServiceProvisionConditionsFromString(EDataType eDataType, String initialValue) {
		ServiceProvisionConditions result = ServiceProvisionConditions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceProvisionConditionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgramFromString(EDataType eDataType, String initialValue) {
		Program result = Program.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgramToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralMethod createReferralMethodFromString(EDataType eDataType, String initialValue) {
		ReferralMethod result = ReferralMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctMorphologicAbnormalities createSnomedctMorphologicAbnormalitiesFromString(EDataType eDataType, String initialValue) {
		SnomedctMorphologicAbnormalities result = SnomedctMorphologicAbnormalities.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctMorphologicAbnormalitiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodystructureLocationQualifier createBodystructureLocationQualifierFromString(EDataType eDataType, String initialValue) {
		BodystructureLocationQualifier result = BodystructureLocationQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBodystructureLocationQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCode createTaskCodeFromString(EDataType eDataType, String initialValue) {
		TaskCode result = TaskCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireQuestionCodes createQuestionnaireQuestionCodesFromString(EDataType eDataType, String initialValue) {
		QuestionnaireQuestionCodes result = QuestionnaireQuestionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireQuestionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswerCodes createQuestionnaireAnswerCodesFromString(EDataType eDataType, String initialValue) {
		QuestionnaireAnswerCodes result = QuestionnaireAnswerCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswerCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTypeCodes createNetworkTypeCodesFromString(EDataType eDataType, String initialValue) {
		NetworkTypeCodes result = NetworkTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTypeCodes createUnitTypeCodesFromString(EDataType eDataType, String initialValue) {
		UnitTypeCodes result = UnitTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitTermCodes createBenefitTermCodesFromString(EDataType eDataType, String initialValue) {
		BenefitTermCodes result = BenefitTermCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitTermCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitTypeCodes createBenefitTypeCodesFromString(EDataType eDataType, String initialValue) {
		BenefitTypeCodes result = BenefitTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSigns createVitalSignsFromString(EDataType eDataType, String initialValue) {
		VitalSigns result = VitalSigns.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVitalSignsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricAndComponentTypes createDeviceMetricAndComponentTypesFromString(EDataType eDataType, String initialValue) {
		DeviceMetricAndComponentTypes result = DeviceMetricAndComponentTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricAndComponentTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagCategory createFlagCategoryFromString(EDataType eDataType, String initialValue) {
		FlagCategory result = FlagCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagCode createFlagCodeFromString(EDataType eDataType, String initialValue) {
		FlagCode result = FlagCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationTargetDiseaseCodes createImmunizationEvaluationTargetDiseaseCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationEvaluationTargetDiseaseCodes result = ImmunizationEvaluationTargetDiseaseCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationTargetDiseaseCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusReasonCodes createImmunizationStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationStatusReasonCodes result = ImmunizationStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccineAdministeredValueSet createVaccineAdministeredValueSetFromString(EDataType eDataType, String initialValue) {
		VaccineAdministeredValueSet result = VaccineAdministeredValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccineAdministeredValueSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationOriginCodes createImmunizationOriginCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationOriginCodes result = ImmunizationOriginCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationOriginCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesForImmunizationSiteOfAdministration createCodesForImmunizationSiteOfAdministrationFromString(EDataType eDataType, String initialValue) {
		CodesForImmunizationSiteOfAdministration result = CodesForImmunizationSiteOfAdministration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodesForImmunizationSiteOfAdministrationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRouteCodes createImmunizationRouteCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRouteCodes result = ImmunizationRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationFunctionCodes createImmunizationFunctionCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationFunctionCodes result = ImmunizationFunctionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationFunctionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReasonCodes createImmunizationReasonCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationReasonCodes result = ImmunizationReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationSubpotentReason createImmunizationSubpotentReasonFromString(EDataType eDataType, String initialValue) {
		ImmunizationSubpotentReason result = ImmunizationSubpotentReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationSubpotentReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationProgramEligibility createImmunizationProgramEligibilityFromString(EDataType eDataType, String initialValue) {
		ImmunizationProgramEligibility result = ImmunizationProgramEligibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationProgramEligibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationFundingSource createImmunizationFundingSourceFromString(EDataType eDataType, String initialValue) {
		ImmunizationFundingSource result = ImmunizationFundingSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationFundingSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationTargetDiseaseCodes createImmunizationTargetDiseaseCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationTargetDiseaseCodes result = ImmunizationTargetDiseaseCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationTargetDiseaseCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationDoseStatusCodes createImmunizationEvaluationDoseStatusCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationEvaluationDoseStatusCodes result = ImmunizationEvaluationDoseStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationDoseStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationDoseStatusReasonCodes createImmunizationEvaluationDoseStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationEvaluationDoseStatusReasonCodes result = ImmunizationEvaluationDoseStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationDoseStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeCodes createOperationOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		OperationOutcomeCodes result = OperationOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentTypeCodes createPaymentTypeCodesFromString(EDataType eDataType, String initialValue) {
		PaymentTypeCodes result = PaymentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRoleFromString(EDataType eDataType, String initialValue) {
		PractitionerRole result = PractitionerRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPractitionerRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryAbsentReason createFamilyHistoryAbsentReasonFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryAbsentReason result = FamilyHistoryAbsentReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryAbsentReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3FamilyMember createV3FamilyMemberFromString(EDataType eDataType, String initialValue) {
		V3FamilyMember result = V3FamilyMember.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3FamilyMemberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOutcomeCodes createConditionOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		ConditionOutcomeCodes result = ConditionOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationAffiliationRole createOrganizationAffiliationRoleFromString(EDataType eDataType, String initialValue) {
		OrganizationAffiliationRole result = OrganizationAffiliationRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrganizationAffiliationRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCategory createAdverseEventCategoryFromString(EDataType eDataType, String initialValue) {
		AdverseEventCategory result = AdverseEventCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctClinicalFindingsA createSnomedctClinicalFindingsAFromString(EDataType eDataType, String initialValue) {
		SnomedctClinicalFindingsA result = SnomedctClinicalFindingsA.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctClinicalFindingsAToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventSeriousness createAdverseEventSeriousnessFromString(EDataType eDataType, String initialValue) {
		AdverseEventSeriousness result = AdverseEventSeriousness.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventSeriousnessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausalityAssessment createAdverseEventCausalityAssessmentFromString(EDataType eDataType, String initialValue) {
		AdverseEventCausalityAssessment result = AdverseEventCausalityAssessment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCausalityAssessmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausalityMethod createAdverseEventCausalityMethodFromString(EDataType eDataType, String initialValue) {
		AdverseEventCausalityMethod result = AdverseEventCausalityMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCausalityMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynthesisType createSynthesisTypeFromString(EDataType eDataType, String initialValue) {
		SynthesisType result = SynthesisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynthesisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyType createStudyTypeFromString(EDataType eDataType, String initialValue) {
		StudyType result = StudyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStudyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskEstimateType createRiskEstimateTypeFromString(EDataType eDataType, String initialValue) {
		RiskEstimateType result = RiskEstimateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskEstimateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecisionEstimateType createPrecisionEstimateTypeFromString(EDataType eDataType, String initialValue) {
		PrecisionEstimateType result = PrecisionEstimateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrecisionEstimateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityOfEvidenceRating createQualityOfEvidenceRatingFromString(EDataType eDataType, String initialValue) {
		QualityOfEvidenceRating result = QualityOfEvidenceRating.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityOfEvidenceRatingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertaintySubcomponentType createCertaintySubcomponentTypeFromString(EDataType eDataType, String initialValue) {
		CertaintySubcomponentType result = CertaintySubcomponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertaintySubcomponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertaintySubcomponentRating createCertaintySubcomponentRatingFromString(EDataType eDataType, String initialValue) {
		CertaintySubcomponentRating result = CertaintySubcomponentRating.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertaintySubcomponentRatingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptProfileOriginType createTestScriptProfileOriginTypeFromString(EDataType eDataType, String initialValue) {
		TestScriptProfileOriginType result = TestScriptProfileOriginType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptProfileOriginTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptProfileDestinationType createTestScriptProfileDestinationTypeFromString(EDataType eDataType, String initialValue) {
		TestScriptProfileDestinationType result = TestScriptProfileDestinationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptProfileDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulSecurityService createRestfulSecurityServiceFromString(EDataType eDataType, String initialValue) {
		RestfulSecurityService result = RestfulSecurityService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulSecurityServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransport createMessageTransportFromString(EDataType eDataType, String initialValue) {
		MessageTransport result = MessageTransport.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTransportToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEventFromString(EDataType eDataType, String initialValue) {
		MessageEvent result = MessageEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperationCode createTestScriptOperationCodeFromString(EDataType eDataType, String initialValue) {
		TestScriptOperationCode result = TestScriptOperationCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptOperationCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleMessageReasonCodes createExampleMessageReasonCodesFromString(EDataType eDataType, String initialValue) {
		ExampleMessageReasonCodes result = ExampleMessageReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleMessageReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusCodes createPaymentStatusCodesFromString(EDataType eDataType, String initialValue) {
		PaymentStatusCodes result = PaymentStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDocumentTypeCodes createFhirDocumentTypeCodesFromString(EDataType eDataType, String initialValue) {
		FhirDocumentTypeCodes result = FhirDocumentTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDocumentTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSectionCodes createDocumentSectionCodesFromString(EDataType eDataType, String initialValue) {
		DocumentSectionCodes result = DocumentSectionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentSectionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyType createSupplyTypeFromString(EDataType eDataType, String initialValue) {
		SupplyType result = SupplyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctSupplyItem createSnomedctSupplyItemFromString(EDataType eDataType, String initialValue) {
		SnomedctSupplyItem result = SnomedctSupplyItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctSupplyItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestReason createSupplyRequestReasonFromString(EDataType eDataType, String initialValue) {
		SupplyRequestReason result = SupplyRequestReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariantState createEvidenceVariantStateFromString(EDataType eDataType, String initialValue) {
		EvidenceVariantState result = EvidenceVariantState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceVariantStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectEstimateType createEffectEstimateTypeFromString(EDataType eDataType, String initialValue) {
		EffectEstimateType result = EffectEstimateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffectEstimateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsurancePlanType createInsurancePlanTypeFromString(EDataType eDataType, String initialValue) {
		InsurancePlanType result = InsurancePlanType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInsurancePlanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceHistoryRecordActivityCodes createProvenanceHistoryRecordActivityCodesFromString(EDataType eDataType, String initialValue) {
		ProvenanceHistoryRecordActivityCodes result = ProvenanceHistoryRecordActivityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceHistoryRecordActivityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromosomehuman createChromosomehumanFromString(EDataType eDataType, String initialValue) {
		Chromosomehuman result = Chromosomehuman.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChromosomehumanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ensembl createEnsemblFromString(EDataType eDataType, String initialValue) {
		Ensembl result = Ensembl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnsemblToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FdAStandardSequence createFdAStandardSequenceFromString(EDataType eDataType, String initialValue) {
		FdAStandardSequence result = FdAStandardSequence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFdAStandardSequenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FdAMethod createFdAMethodFromString(EDataType eDataType, String initialValue) {
		FdAMethod result = FdAMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFdAMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSubstanceProductConditionAndNegationCodes createAllergyIntoleranceSubstanceProductConditionAndNegationCodesFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSubstanceProductConditionAndNegationCodes result = AllergyIntoleranceSubstanceProductConditionAndNegationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSubstanceProductConditionAndNegationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType createCatalogTypeFromString(EDataType eDataType, String initialValue) {
		CatalogType result = CatalogType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationTargetDiseaseCodes createImmunizationRecommendationTargetDiseaseCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationTargetDiseaseCodes result = ImmunizationRecommendationTargetDiseaseCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationTargetDiseaseCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationStatusCodes createImmunizationRecommendationStatusCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationStatusCodes result = ImmunizationRecommendationStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationReasonCodes createImmunizationRecommendationReasonCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationReasonCodes result = ImmunizationRecommendationReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterionCodes createImmunizationRecommendationDateCriterionCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationRecommendationDateCriterionCodes result = ImmunizationRecommendationDateCriterionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationRecommendationDateCriterionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Need createNeedFromString(EDataType eDataType, String initialValue) {
		Need result = Need.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validationtype createValidationtypeFromString(EDataType eDataType, String initialValue) {
		Validationtype result = Validationtype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationtypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validationprocess createValidationprocessFromString(EDataType eDataType, String initialValue) {
		Validationprocess result = Validationprocess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationprocessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failureaction createFailureactionFromString(EDataType eDataType, String initialValue) {
		Failureaction result = Failureaction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primarysourcetype createPrimarysourcetypeFromString(EDataType eDataType, String initialValue) {
		Primarysourcetype result = Primarysourcetype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimarysourcetypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verificationresultcommunicationmethod createVerificationresultcommunicationmethodFromString(EDataType eDataType, String initialValue) {
		Verificationresultcommunicationmethod result = Verificationresultcommunicationmethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationresultcommunicationmethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validationstatus createValidationstatusFromString(EDataType eDataType, String initialValue) {
		Validationstatus result = Validationstatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canpushupdates createCanpushupdatesFromString(EDataType eDataType, String initialValue) {
		Canpushupdates result = Canpushupdates.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCanpushupdatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pushtypeavailable createPushtypeavailableFromString(EDataType eDataType, String initialValue) {
		Pushtypeavailable result = Pushtypeavailable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPushtypeavailableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodTypeCodes createFoodTypeCodesFromString(EDataType eDataType, String initialValue) {
		FoodTypeCodes result = FoodTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoodTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DietCodes createDietCodesFromString(EDataType eDataType, String initialValue) {
		DietCodes result = DietCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutrientModifierCodes createNutrientModifierCodesFromString(EDataType eDataType, String initialValue) {
		NutrientModifierCodes result = NutrientModifierCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutrientModifierCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModifierCodes createTextureModifierCodesFromString(EDataType eDataType, String initialValue) {
		TextureModifierCodes result = TextureModifierCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModifierCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureModifiedFoodTypeCodes createTextureModifiedFoodTypeCodesFromString(EDataType eDataType, String initialValue) {
		TextureModifiedFoodTypeCodes result = TextureModifiedFoodTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureModifiedFoodTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidConsistencyTypeCodes createFluidConsistencyTypeCodesFromString(EDataType eDataType, String initialValue) {
		FluidConsistencyTypeCodes result = FluidConsistencyTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFluidConsistencyTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplementTypeCodes createSupplementTypeCodesFromString(EDataType eDataType, String initialValue) {
		SupplementTypeCodes result = SupplementTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplementTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralFormulaTypeCodes createEnteralFormulaTypeCodesFromString(EDataType eDataType, String initialValue) {
		EnteralFormulaTypeCodes result = EnteralFormulaTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralFormulaTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralFormulaAdditiveTypeCode createEnteralFormulaAdditiveTypeCodeFromString(EDataType eDataType, String initialValue) {
		EnteralFormulaAdditiveTypeCode result = EnteralFormulaAdditiveTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralFormulaAdditiveTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteralRouteCodes createEnteralRouteCodesFromString(EDataType eDataType, String initialValue) {
		EnteralRouteCodes result = EnteralRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnteralRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedctDrugTherapyStatusCodes createSnomedctDrugTherapyStatusCodesFromString(EDataType eDataType, String initialValue) {
		SnomedctDrugTherapyStatusCodes result = SnomedctDrugTherapyStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedctDrugTherapyStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodes createMedicationStatusCodesFromString(EDataType eDataType, String initialValue) {
		MedicationStatusCodes result = MedicationStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventId createAuditEventIdFromString(EDataType eDataType, String initialValue) {
		AuditEventId result = AuditEventId.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventIdToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSubType createAuditEventSubTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventSubType result = AuditEventSubType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSubTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationRoleType createParticipationRoleTypeFromString(EDataType eDataType, String initialValue) {
		ParticipationRoleType result = ParticipationRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaTypeCode createMediaTypeCodeFromString(EDataType eDataType, String initialValue) {
		MediaTypeCode result = MediaTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSourceType createAuditEventSourceTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventSourceType result = AuditEventSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityType createAuditEventEntityTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventEntityType result = AuditEventEntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntityRole createAuditEventEntityRoleFromString(EDataType eDataType, String initialValue) {
		AuditEventEntityRole result = AuditEventEntityRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventEntityRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectLifecycleEvents createObjectLifecycleEventsFromString(EDataType eDataType, String initialValue) {
		ObjectLifecycleEvents result = ObjectLifecycleEvents.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectLifecycleEventsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicResourceTypes createBasicResourceTypesFromString(EDataType eDataType, String initialValue) {
		BasicResourceTypes result = BasicResourceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicResourceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleVisionPrescriptionProductCodes createExampleVisionPrescriptionProductCodesFromString(EDataType eDataType, String initialValue) {
		ExampleVisionPrescriptionProductCodes result = ExampleVisionPrescriptionProductCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleVisionPrescriptionProductCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusReasonCodes createMedicationDispenseStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatusReasonCodes result = MedicationDispenseStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseCategoryCodes createMedicationDispenseCategoryCodesFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseCategoryCodes result = MedicationDispenseCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseCategoryCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispensePerformerFunctionCodes createMedicationDispensePerformerFunctionCodesFromString(EDataType eDataType, String initialValue) {
		MedicationDispensePerformerFunctionCodes result = MedicationDispensePerformerFunctionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispensePerformerFunctionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3ActPharmacySupplyType createV3ActPharmacySupplyTypeFromString(EDataType eDataType, String initialValue) {
		V3ActPharmacySupplyType result = V3ActPharmacySupplyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3ActPharmacySupplyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgePackageTypeCodes createMedicationKnowledgePackageTypeCodesFromString(EDataType eDataType, String initialValue) {
		MedicationKnowledgePackageTypeCodes result = MedicationKnowledgePackageTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKnowledgePackageTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeCharacteristicCodes createMedicationKnowledgeCharacteristicCodesFromString(EDataType eDataType, String initialValue) {
		MedicationKnowledgeCharacteristicCodes result = MedicationKnowledgeCharacteristicCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKnowledgeCharacteristicCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageEligibilityResponseAuthSupportCodes createCoverageEligibilityResponseAuthSupportCodesFromString(EDataType eDataType, String initialValue) {
		CoverageEligibilityResponseAuthSupportCodes result = CoverageEligibilityResponseAuthSupportCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageEligibilityResponseAuthSupportCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetsPackage getValueSetsPackage() {
		return (ValueSetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValueSetsPackage getPackage() {
		return ValueSetsPackage.eINSTANCE;
	}

} //ValueSetsFactoryImpl
