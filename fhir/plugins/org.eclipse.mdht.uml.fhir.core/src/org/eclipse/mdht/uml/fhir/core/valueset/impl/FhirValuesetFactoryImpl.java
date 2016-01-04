/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.fhir.core.valueset.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirValuesetFactoryImpl extends EFactoryImpl implements FhirValuesetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirValuesetFactory init() {
		try {
			FhirValuesetFactory theFhirValuesetFactory = (FhirValuesetFactory)EPackage.Registry.INSTANCE.getEFactory(FhirValuesetPackage.eNS_URI);
			if (theFhirValuesetFactory != null) {
				return theFhirValuesetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirValuesetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValuesetFactoryImpl() {
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
			case FhirValuesetPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.RESOURCE_TYPE:
				return createResourceTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALL_SECURITY_LABELS:
				return createAllSecurityLabelsFromString(eDataType, initialValue);
			case FhirValuesetPackage.NARRATIVE_STATUS:
				return createNarrativeStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.IDENTIFIER_USE:
				return createIdentifierUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.IDENTIFIER_TYPE_CODES:
				return createIdentifierTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORGANIZATION_TYPE:
				return createOrganizationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTACT_POINT_SYSTEM:
				return createContactPointSystemFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTACT_POINT_USE:
				return createContactPointUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADDRESS_USE:
				return createAddressUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADDRESS_TYPE:
				return createAddressTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTACT_ENTITY_TYPE:
				return createContactEntityTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.NAME_USE:
				return createNameUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADMINISTRATIVE_GENDER:
				return createAdministrativeGenderFromString(eDataType, initialValue);
			case FhirValuesetPackage.PRACTITIONER_ROLE:
				return createPractitionerRoleFromString(eDataType, initialValue);
			case FhirValuesetPackage.PRACTITIONER_SPECIALTY:
				return createPractitionerSpecialtyFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOCATION_STATUS:
				return createLocationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOCATION_MODE:
				return createLocationModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return createServiceDeliveryLocationRoleTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOCATION_TYPE:
				return createLocationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return createPracticeSettingCodeValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.SERVICE_PROVISION_CONDITIONS:
				return createServiceProvisionConditionsFromString(eDataType, initialValue);
			case FhirValuesetPackage.REFERRAL_METHOD:
				return createReferralMethodFromString(eDataType, initialValue);
			case FhirValuesetPackage.DAYS_OF_WEEK:
				return createDaysOfWeekFromString(eDataType, initialValue);
			case FhirValuesetPackage.ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12:
				return createAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12FromString(eDataType, initialValue);
			case FhirValuesetPackage.MARITAL_STATUS_CODES:
				return createMaritalStatusCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PATIENT_CONTACT_RELATIONSHIP:
				return createPatientContactRelationshipFromString(eDataType, initialValue);
			case FhirValuesetPackage.ANIMAL_SPECIES:
				return createAnimalSpeciesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ANIMAL_BREEDS:
				return createAnimalBreedsFromString(eDataType, initialValue);
			case FhirValuesetPackage.GENDER_STATUS:
				return createGenderStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PATIENT_RELATIONSHIP_TYPE:
				return createPatientRelationshipTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUANTITY_COMPARATOR:
				return createQuantityComparatorFromString(eDataType, initialValue);
			case FhirValuesetPackage.SIGNATURE_TYPE_CODES:
				return createSignatureTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_STATUS:
				return createDeviceStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.UNITS_OF_TIME:
				return createUnitsOfTimeFromString(eDataType, initialValue);
			case FhirValuesetPackage.EVENT_TIMING:
				return createEventTimingFromString(eDataType, initialValue);
			case FhirValuesetPackage.TIMING_ABBREVIATION:
				return createTimingAbbreviationFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODULE_METADATA_TYPE:
				return createModuleMetadataTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODULE_METADATA_STATUS:
				return createModuleMetadataStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODULE_METADATA_FOCUS_TYPE:
				return createModuleMetadataFocusTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODULE_METADATA_CONTRIBUTOR_TYPE:
				return createModuleMetadataContributorTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.IDENTITY_ASSURANCE_LEVEL:
				return createIdentityAssuranceLevelFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODULE_METADATA_RESOURCE_TYPE:
				return createModuleMetadataResourceTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.OPERATION_PARAMETER_USE:
				return createOperationParameterUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARAMETER_TYPES_USED_IN_OPERATION_DEFINITIONS:
				return createParameterTypesUsedInOperationDefinitionsFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONFORMANCE_RESOURCE_STATUS:
				return createConformanceResourceStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTEXT_OF_USE_VALUE_SET:
				return createContextOfUseValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.STRUCTURE_DEFINITION_CODES:
				return createStructureDefinitionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.STRUCTURE_DEFINITION_KIND:
				return createStructureDefinitionKindFromString(eDataType, initialValue);
			case FhirValuesetPackage.FHIR_DEFINED_TYPE:
				return createFhirDefinedTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXTENSION_CONTEXT:
				return createExtensionContextFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROPERTY_REPRESENTATION:
				return createPropertyRepresentationFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOINC_CODES:
				return createLoincCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SLICING_RULES:
				return createSlicingRulesFromString(eDataType, initialValue);
			case FhirValuesetPackage.AGGREGATION_MODE:
				return createAggregationModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONSTRAINT_SEVERITY:
				return createConstraintSeverityFromString(eDataType, initialValue);
			case FhirValuesetPackage.BINDING_STRENGTH:
				return createBindingStrengthFromString(eDataType, initialValue);
			case FhirValuesetPackage.DESIGNATION_USE:
				return createDesignationUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.FILTER_OPERATOR:
				return createFilterOperatorFromString(eDataType, initialValue);
			case FhirValuesetPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_MEDICATION_CODES:
				return createSnomedCtMedicationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDICATION_FORM_CODES:
				return createMedicationFormCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSTANCE_CATEGORY_CODES:
				return createSubstanceCategoryCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSTANCE_CODE:
				return createSubstanceCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_FORM_CODES:
				return createSnomedCtFormCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_PARTICIPATION_MODE:
				return createV3CodeSystemParticipationModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.COMMUNICATION_STATUS:
				return createCommunicationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_STATE:
				return createEncounterStateFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_CLASS:
				return createEncounterClassFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_TYPE:
				return createEncounterTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_PRIORITY:
				return createEncounterPriorityFromString(eDataType, initialValue);
			case FhirValuesetPackage.EPISODE_OF_CARE_STATUS:
				return createEpisodeOfCareStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return createConditionProblemDiagnosisCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_CATEGORY_CODES:
				return createConditionCategoryCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_CLINICAL_STATUS_CODES:
				return createConditionClinicalStatusCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_VERIFICATION_STATUS:
				return createConditionVerificationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return createConditionDiagnosisSeverityFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_STAGE:
				return createConditionStageFromString(eDataType, initialValue);
			case FhirValuesetPackage.CLINICAL_IMPRESSION_STATUS:
				return createClinicalImpressionStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_SUBSTANCE_AND_NEGATION_CODES:
				return createAllergyIntoleranceSubstanceAndNegationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_STATUS:
				return createAllergyIntoleranceStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return createAllergyIntoleranceCriticalityFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_TYPE:
				return createAllergyIntoleranceTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return createAllergyIntoleranceCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return createAllergyIntoleranceCertaintyFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_MANIFESTATION_CODES:
				return createSnomedCtManifestationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return createAllergyIntoleranceSeverityFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_ROUTE_CODES:
				return createSnomedCtRouteCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return createSnomedCtClinicalFindingsFromString(eDataType, initialValue);
			case FhirValuesetPackage.INVESTIGATION_TYPE:
				return createInvestigationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_STATUS:
				return createObservationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_CATEGORY_CODES:
				return createObservationCategoryCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_VALUE_ABSENT_REASON:
				return createObservationValueAbsentReasonFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_INTERPRETATION_CODES:
				return createObservationInterpretationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_BODY_STRUCTURES:
				return createSnomedCtBodyStructuresFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_METHODS:
				return createObservationMethodsFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIMEN_STATUS:
				return createSpecimenStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.V2_SPECIMEN_TYPE:
				return createV2SpecimenTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIMEN_COLLECTION_METHOD:
				return createSpecimenCollectionMethodFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIMEN_TREATMENT_PROCEDURE:
				return createSpecimenTreatmentProcedureFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIMEN_CONTAINER:
				return createSpecimenContainerFromString(eDataType, initialValue);
			case FhirValuesetPackage.V2_ADDITIVE_PRESERVATIVE:
				return createV2AdditivePreservativeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEASMNT_PRINCIPLE:
				return createMeasmntPrincipleFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return createDeviceMetricOperationalStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_METRIC_COLOR:
				return createDeviceMetricColorFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_METRIC_CATEGORY:
				return createDeviceMetricCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return createDeviceMetricCalibrationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return createDeviceMetricCalibrationStateFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return createObservationReferenceRangeMeaningCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return createObservationRelationshipTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUESTIONNAIRE_STATUS:
				return createQuestionnaireStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUESTIONNAIRE_QUESTION_CODES:
				return createQuestionnaireQuestionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUESTIONNAIRE_ITEM_TYPE:
				return createQuestionnaireItemTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUESTIONNAIRE_ANSWER_CODES:
				return createQuestionnaireAnswerCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return createQuestionnaireResponseStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.FAMILY_HISTORY_STATUS:
				return createFamilyHistoryStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.FAMILY_MEMBER:
				return createFamilyMemberFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITION_OUTCOME_CODES:
				return createConditionOutcomeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIAGNOSTIC_REPORT_STATUS:
				return createDiagnosticReportStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return createDiagnosticServiceSectionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return createLoincDiagnosticReportCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_TYPE_VALUE_SET:
				return createDocumentTypeValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_CLASS_VALUE_SET:
				return createDocumentClassValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_REFERENCE_STATUS:
				return createDocumentReferenceStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.COMPOSITION_STATUS:
				return createCompositionStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return createDocumentRelationshipTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return createDocumentReferenceFormatCodeSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_ACT_CODE:
				return createV3CodeSystemActCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return createFacilityTypeCodeValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_STATUS:
				return createDiagnosticOrderStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_PRIORITY:
				return createDiagnosticOrderPriorityFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_EVENT_CODES:
				return createDiagnosticOrderEventCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOINC_DIAGNOSTIC_ORDER_CODES:
				return createLoincDiagnosticOrderCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_CODESSNOMED_CT:
				return createProcedureCodessnomedCTFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_REASON_CODES:
				return createProcedureReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_REQUEST_STATUS:
				return createProcedureRequestStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_REQUEST_PRIORITY:
				return createProcedureRequestPriorityFromString(eDataType, initialValue);
			case FhirValuesetPackage.REFERRAL_STATUS:
				return createReferralStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACQUISITION_MODALITY_CODES:
				return createAcquisitionModalityCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.INSTANCE_AVAILABILITY:
				return createInstanceAvailabilityFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_STATUS:
				return createProcedureStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_CATEGORY_CODESSNOMED_CT:
				return createProcedureCategoryCodessnomedCTFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT:
				return createProcedureNotPerformedReasonsnomeDCTFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return createProcedurePerformerRoleCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_OUTCOME_CODESSNOMED_CT:
				return createProcedureOutcomeCodessnomedCTFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_FOLLOW_UP_CODESSNOMED_CT:
				return createProcedureFollowUpCodessnomedCTFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_STATUS:
				return createCarePlanStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_CATEGORY:
				return createCarePlanCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_RELATIONSHIP:
				return createCarePlanRelationshipFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARTICIPANT_ROLES:
				return createParticipantRolesFromString(eDataType, initialValue);
			case FhirValuesetPackage.GOAL_START_EVENT:
				return createGoalStartEventFromString(eDataType, initialValue);
			case FhirValuesetPackage.GOAL_CATEGORY:
				return createGoalCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.GOAL_STATUS:
				return createGoalStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.GOAL_STATUS_REASON:
				return createGoalStatusReasonFromString(eDataType, initialValue);
			case FhirValuesetPackage.GOAL_PRIORITY:
				return createGoalPriorityFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDICATION_STATEMENT_STATUS:
				return createMedicationStatementStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.REASON_MEDICATION_NOT_GIVEN_CODES:
				return createReasonMedicationNotGivenCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BODYSITE_LOCATION_MODIFIER:
				return createBodysiteLocationModifierFromString(eDataType, initialValue);
			case FhirValuesetPackage.SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return createSnomedCtAnatomicalStructureForAdministrationSiteCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.NUTRITION_ORDER_STATUS:
				return createNutritionOrderStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIET:
				return createDietFromString(eDataType, initialValue);
			case FhirValuesetPackage.FOOD_TYPE_CODES:
				return createFoodTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIET_CODES:
				return createDietCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.NUTRIENT_MODIFIER_CODES:
				return createNutrientModifierCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.TEXTURE_MODIFIER_CODES:
				return createTextureModifierCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return createTextureModifiedFoodTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return createFluidConsistencyTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLEMENT_TYPE_CODES:
				return createSupplementTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENTERAL_FORMULA_TYPE_CODES:
				return createEnteralFormulaTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return createEnteralFormulaAdditiveTypeCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENTERAL_ROUTE_CODES:
				return createEnteralRouteCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.RISK_PROBABILITY:
				return createRiskProbabilityFromString(eDataType, initialValue);
			case FhirValuesetPackage.APPOINTMENT_STATUS:
				return createAppointmentStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_REASON_CODES:
				return createEncounterReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SLOT_STATUS:
				return createSlotStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARTICIPANT_TYPE:
				return createParticipantTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARTICIPANT_REQUIRED:
				return createParticipantRequiredFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARTICIPATION_STATUS:
				return createParticipationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.COMMUNICATION_REQUEST_STATUS:
				return createCommunicationRequestStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_USE_REQUEST_STATUS:
				return createDeviceUseRequestStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.DEVICE_USE_REQUEST_PRIORITY:
				return createDeviceUseRequestPriorityFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDICATION_ORDER_STATUS:
				return createMedicationOrderStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return createActSubstanceAdminSubstitutionCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return createSubstanceAdminSubstitutionReasonFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACTION_LIST:
				return createActionListFromString(eDataType, initialValue);
			case FhirValuesetPackage.RULESET_CODES:
				return createRulesetCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_STATUS:
				return createSupplyRequestStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_TYPE:
				return createSupplyTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_REASON:
				return createSupplyRequestReasonFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_WHEN:
				return createSupplyRequestWhenFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return createExampleVisionPrescriptionProductCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VISION_EYES:
				return createVisionEyesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VISION_BASE:
				return createVisionBaseFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY_CATEGORY:
				return createCarePlanActivityCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY:
				return createCarePlanActivityFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACTIVITY_REASON:
				return createActivityReasonFromString(eDataType, initialValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY_STATUS:
				return createCarePlanActivityStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return createProcedureDeviceActionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.LATERALITY:
				return createLateralityFromString(eDataType, initialValue);
			case FhirValuesetPackage.KO_STITLE:
				return createKoStitleFromString(eDataType, initialValue);
			case FhirValuesetPackage.DIGITAL_MEDIA_TYPE:
				return createDigitalMediaTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDIA_SUB_TYPE:
				return createMediaSubTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return createMediaCollectionViewProjectionFromString(eDataType, initialValue);
			case FhirValuesetPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return createManifestationAndSymptomCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADMIT_SOURCE:
				return createAdmitSourceFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIAL_COURTESY:
				return createSpecialCourtesyFromString(eDataType, initialValue);
			case FhirValuesetPackage.SPECIAL_ARRANGEMENTS:
				return createSpecialArrangementsFromString(eDataType, initialValue);
			case FhirValuesetPackage.DISCHARGE_DISPOSITION:
				return createDischargeDispositionFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENCOUNTER_LOCATION_STATUS:
				return createEncounterLocationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.NAMING_SYSTEM_TYPE:
				return createNamingSystemTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return createNamingSystemIdentifierTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONCEPT_MAP_EQUIVALENCE:
				return createConceptMapEquivalenceFromString(eDataType, initialValue);
			case FhirValuesetPackage.FLAG_CATEGORY:
				return createFlagCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.FLAG_STATUS:
				return createFlagStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.FLAG_CODE:
				return createFlagCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SEQUENCE_TYPE:
				return createSequenceTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DB_SNP:
				return createDbSnpFromString(eDataType, initialValue);
			case FhirValuesetPackage.ENSEMBL:
				return createEnsemblFromString(eDataType, initialValue);
			case FhirValuesetPackage.LOINC530345_ANSWERLIST:
				return createLoinc530345AnswerlistFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_TYPE_CODES:
				return createContractTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_SUBTYPE_CODES:
				return createContractSubtypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_ACTION_CODES:
				return createContractActionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PURPOSE_OF_USE:
				return createPurposeOfUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_ACTOR_ROLE_CODES:
				return createContractActorRoleCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_SIGNER_TYPE_CODES:
				return createContractSignerTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_TERM_TYPE_CODES:
				return createContractTermTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTRACT_TERM_SUB_TYPE_CODES:
				return createContractTermSubTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.FHIR_DOCUMENT_TYPE_CODES:
				return createFhirDocumentTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.FHIR_DOCUMENT_CLASS_CODES:
				return createFhirDocumentClassCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_CONFIDENTIALITY:
				return createV3CodeSystemConfidentialityFromString(eDataType, initialValue);
			case FhirValuesetPackage.COMPOSITION_ATTESTATION_MODE:
				return createCompositionAttestationModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_SECTION_CODES:
				return createDocumentSectionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.LIST_MODE:
				return createListModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.LIST_ORDER_CODES:
				return createListOrderCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.LIST_EMPTY_REASONS:
				return createListEmptyReasonsFromString(eDataType, initialValue);
			case FhirValuesetPackage.REMITTANCE_OUTCOME:
				return createRemittanceOutcomeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PAYMENT_TYPE_CODES:
				return createPaymentTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.FORM_CODES:
				return createFormCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.NOTE_TYPE:
				return createNoteTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONFORMANCE_STATEMENT_KIND:
				return createConformanceStatementKindFromString(eDataType, initialValue);
			case FhirValuesetPackage.UNKNOWN_CONTENT_CODE:
				return createUnknownContentCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.RESTFUL_CONFORMANCE_MODE:
				return createRestfulConformanceModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.RESTFUL_SECURITY_SERVICE:
				return createRestfulSecurityServiceFromString(eDataType, initialValue);
			case FhirValuesetPackage.TYPE_RESTFUL_INTERACTION:
				return createTypeRestfulInteractionFromString(eDataType, initialValue);
			case FhirValuesetPackage.RESOURCE_VERSION_POLICY:
				return createResourceVersionPolicyFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITIONAL_DELETE_STATUS:
				return createConditionalDeleteStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.SEARCH_PARAM_TYPE:
				return createSearchParamTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SEARCH_MODIFIER_CODE:
				return createSearchModifierCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SYSTEM_RESTFUL_INTERACTION:
				return createSystemRestfulInteractionFromString(eDataType, initialValue);
			case FhirValuesetPackage.TRANSACTION_MODE:
				return createTransactionModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.OPERATION_KIND:
				return createOperationKindFromString(eDataType, initialValue);
			case FhirValuesetPackage.MESSAGE_TRANSPORT:
				return createMessageTransportFromString(eDataType, initialValue);
			case FhirValuesetPackage.MESSAGE_EVENT:
				return createMessageEventFromString(eDataType, initialValue);
			case FhirValuesetPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return createMessageSignificanceCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONFORMANCE_EVENT_MODE:
				return createConformanceEventModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DOCUMENT_MODE:
				return createDocumentModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROFILE_ORIGIN_TYPE:
				return createProfileOriginTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROFILE_DESTINATION_TYPE:
				return createProfileDestinationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.TEST_SCRIPT_OPERATION_CODES:
				return createTestScriptOperationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ASSERTION_DIRECTION_TYPE:
				return createAssertionDirectionTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ASSERTION_OPERATOR_TYPE:
				return createAssertionOperatorTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ASSERTION_RESPONSE_TYPES:
				return createAssertionResponseTypesFromString(eDataType, initialValue);
			case FhirValuesetPackage.DATA_ELEMENT_STRINGENCY:
				return createDataElementStringencyFromString(eDataType, initialValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_TRIGGER_TYPE:
				return createDecisionSupportRuleTriggerTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_PARTICIPANT_TYPE:
				return createDecisionSupportRuleParticipantTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_ACTION_TYPE:
				return createDecisionSupportRuleActionTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.RESPONSE_TYPE:
				return createResponseTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ISSUE_SEVERITY:
				return createIssueSeverityFromString(eDataType, initialValue);
			case FhirValuesetPackage.ISSUE_TYPE:
				return createIssueTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.OPERATION_OUTCOME_CODES:
				return createOperationOutcomeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return createExampleMessageReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSCRIPTION_STATUS:
				return createSubscriptionStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return createSubscriptionChannelTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUBSCRIPTION_TAG:
				return createSubscriptionTagFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACT_COVERAGE_TYPE_CODE:
				return createActCoverageTypeCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.RELATIONSHIP_CODES:
				return createRelationshipCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return createVaccineAdministeredValueSetFromString(eDataType, initialValue);
			case FhirValuesetPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return createImmunizationRecommendationStatusCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return createImmunizationRecommendationDateCriterionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDICATION_ADMINISTRATION_STATUS:
				return createMedicationAdministrationStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return createCodesForImmunizationSiteOfAdministrationFromString(eDataType, initialValue);
			case FhirValuesetPackage.IMMUNIZATION_ROUTE_CODES:
				return createImmunizationRouteCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.IMMUNIZATION_REASON_CODES:
				return createImmunizationReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES:
				return createImmunizationReasonsForNotImmunizingCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_TARGET_CODES:
				return createVaccinationProtocolDoseTargetCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_STATUS_CODES:
				return createVaccinationProtocolDoseStatusCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES:
				return createVaccinationProtocolDoseStatusReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BUNDLE_TYPE:
				return createBundleTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.SEARCH_ENTRY_MODE:
				return createSearchEntryModeFromString(eDataType, initialValue);
			case FhirValuesetPackage.HTTP_VERB:
				return createHttpVerbFromString(eDataType, initialValue);
			case FhirValuesetPackage.PRIORITY_CODES:
				return createPriorityCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BENEFIT_CATEGORY_CODES:
				return createBenefitCategoryCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BENEFIT_SUB_CATEGORY_CODES:
				return createBenefitSubCategoryCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.NETWORK_TYPE_CODES:
				return createNetworkTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.UNIT_TYPE_CODES:
				return createUnitTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BENEFIT_TERM_CODES:
				return createBenefitTermCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.BENEFIT_TYPE_CODES:
				return createBenefitTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADJUDICATION_ERROR_CODES:
				return createAdjudicationErrorCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDICATION_DISPENSE_STATUS:
				return createMedicationDispenseStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACT_PHARMACY_SUPPLY_TYPE:
				return createActPharmacySupplyTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.CLAIM_TYPE:
				return createClaimTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.USE:
				return createUseFromString(eDataType, initialValue);
			case FhirValuesetPackage.FUNDS_RESERVATION_CODES:
				return createFundsReservationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PAYEE_TYPE_CODES:
				return createPayeeTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.IC_D10_CODES:
				return createIcD10CodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.CONDITIONS_CODES:
				return createConditionsCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXCEPTION_CODES:
				return createExceptionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACT_INCIDENT_CODE:
				return createActIncidentCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.INTERVENTION_CODES:
				return createInterventionCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACT_INVOICE_GROUP_CODE:
				return createActInvoiceGroupCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.USCLS_CODES:
				return createUsclsCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return createExampleServicePlaceCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.UDI_CODES:
				return createUdiCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.TOOTH_CODES:
				return createToothCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.SURFACE_CODES:
				return createSurfaceCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MODIFIER_TYPE_CODES:
				return createModifierTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORAL_PROSTHO_MATERIAL_TYPE_CODES:
				return createOralProsthoMaterialTypeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADDITIONAL_MATERIAL_CODES:
				return createAdditionalMaterialCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.TEETH_CODES:
				return createTeethCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MISSING_TOOTH_REASON_CODES:
				return createMissingToothReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADJUDICATION_CODES:
				return createAdjudicationCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return createPaymentAdjustmentReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ADJUDICATION_REASON_CODES:
				return createAdjudicationReasonCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.GUIDE_DEPENDENCY_TYPE:
				return createGuideDependencyTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.GUIDE_RESOURCE_PURPOSE:
				return createGuideResourcePurposeFromString(eDataType, initialValue);
			case FhirValuesetPackage.GUIDE_PAGE_KIND:
				return createGuidePageKindFromString(eDataType, initialValue);
			case FhirValuesetPackage.XPATH_USAGE_TYPE:
				return createXPathUsageTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_PARTICIPANT_TYPE:
				return createOrderSetParticipantTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_TYPE:
				return createOrderSetItemTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_GROUPING_BEHAVIOR:
				return createOrderSetItemGroupingBehaviorFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_SELECTION_BEHAVIOR:
				return createOrderSetItemSelectionBehaviorFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_REQUIRED_BEHAVIOR:
				return createOrderSetItemRequiredBehaviorFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_PRECHECK_BEHAVIOR:
				return createOrderSetItemPrecheckBehaviorFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_CARDINALITY_BEHAVIOR:
				return createOrderSetItemCardinalityBehaviorFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROVENANCE_EVENT_CURRENT_STATE:
				return createProvenanceEventCurrentStateFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROVENANCE_PARTICIPANT_ROLE:
				return createProvenanceParticipantRoleFromString(eDataType, initialValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_ROLE_LINK_TYPE:
				return createV3CodeSystemRoleLinkTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROVENANCE_ENTITY_ROLE:
				return createProvenanceEntityRoleFromString(eDataType, initialValue);
			case FhirValuesetPackage.PROCESS_OUTCOME_CODES:
				return createProcessOutcomeCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEASURE_POPULATION_TYPE:
				return createMeasurePopulationTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.PAYMENT_STATUS_CODES:
				return createPaymentStatusCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return createExampleUseCodesForListFromString(eDataType, initialValue);
			case FhirValuesetPackage.LIST_STATUS:
				return createListStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return createPatientMedicineChangeTypesFromString(eDataType, initialValue);
			case FhirValuesetPackage.GUIDANCE_RESPONSE_STATUS:
				return createGuidanceResponseStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.GUIDANCE_RESPONSE_ACTION_TYPE:
				return createGuidanceResponseActionTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.DETECTED_ISSUE_CATEGORY:
				return createDetectedIssueCategoryFromString(eDataType, initialValue);
			case FhirValuesetPackage.DETECTED_ISSUE_SEVERITY:
				return createDetectedIssueSeverityFromString(eDataType, initialValue);
			case FhirValuesetPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return createDetectedIssueMitigationActionFromString(eDataType, initialValue);
			case FhirValuesetPackage.ACCOUNT_STATUS:
				return createAccountStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.REASON_MEDICATION_GIVEN_CODES:
				return createReasonMedicationGivenCodesFromString(eDataType, initialValue);
			case FhirValuesetPackage.PARTICIPANT_STATUS:
				return createParticipantStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_ID:
				return createAuditEventIdFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_SUB_TYPE:
				return createAuditEventSubTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_ACTION:
				return createAuditEventActionFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_OUTCOME:
				return createAuditEventOutcomeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_ACTIVE_PARTICIPANT_ROLE_ID_CODE:
				return createAuditActiveParticipantRoleIdCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.MEDIA_TYPE_CODE:
				return createMediaTypeCodeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE:
				return createAuditEventParticipantNetworkTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_SOURCE_TYPE:
				return createAuditEventSourceTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_TYPE:
				return createAuditEventObjectTypeFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_ROLE:
				return createAuditEventObjectRoleFromString(eDataType, initialValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_LIFECYCLE:
				return createAuditEventObjectLifecycleFromString(eDataType, initialValue);
			case FhirValuesetPackage.BASIC_RESOURCE_TYPES:
				return createBasicResourceTypesFromString(eDataType, initialValue);
			case FhirValuesetPackage.ORDER_STATUS:
				return createOrderStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_DELIVERY_STATUS:
				return createSupplyDeliveryStatusFromString(eDataType, initialValue);
			case FhirValuesetPackage.SUPPLY_ITEM_TYPE:
				return createSupplyItemTypeFromString(eDataType, initialValue);
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
			case FhirValuesetPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.RESOURCE_TYPE:
				return convertResourceTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALL_SECURITY_LABELS:
				return convertAllSecurityLabelsToString(eDataType, instanceValue);
			case FhirValuesetPackage.NARRATIVE_STATUS:
				return convertNarrativeStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.IDENTIFIER_USE:
				return convertIdentifierUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.IDENTIFIER_TYPE_CODES:
				return convertIdentifierTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORGANIZATION_TYPE:
				return convertOrganizationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTACT_POINT_SYSTEM:
				return convertContactPointSystemToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTACT_POINT_USE:
				return convertContactPointUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADDRESS_USE:
				return convertAddressUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADDRESS_TYPE:
				return convertAddressTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTACT_ENTITY_TYPE:
				return convertContactEntityTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.NAME_USE:
				return convertNameUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADMINISTRATIVE_GENDER:
				return convertAdministrativeGenderToString(eDataType, instanceValue);
			case FhirValuesetPackage.PRACTITIONER_ROLE:
				return convertPractitionerRoleToString(eDataType, instanceValue);
			case FhirValuesetPackage.PRACTITIONER_SPECIALTY:
				return convertPractitionerSpecialtyToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOCATION_STATUS:
				return convertLocationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOCATION_MODE:
				return convertLocationModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SERVICE_DELIVERY_LOCATION_ROLE_TYPE:
				return convertServiceDeliveryLocationRoleTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOCATION_TYPE:
				return convertLocationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PRACTICE_SETTING_CODE_VALUE_SET:
				return convertPracticeSettingCodeValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.SERVICE_PROVISION_CONDITIONS:
				return convertServiceProvisionConditionsToString(eDataType, instanceValue);
			case FhirValuesetPackage.REFERRAL_METHOD:
				return convertReferralMethodToString(eDataType, instanceValue);
			case FhirValuesetPackage.DAYS_OF_WEEK:
				return convertDaysOfWeekToString(eDataType, instanceValue);
			case FhirValuesetPackage.ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12:
				return convertAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12ToString(eDataType, instanceValue);
			case FhirValuesetPackage.MARITAL_STATUS_CODES:
				return convertMaritalStatusCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PATIENT_CONTACT_RELATIONSHIP:
				return convertPatientContactRelationshipToString(eDataType, instanceValue);
			case FhirValuesetPackage.ANIMAL_SPECIES:
				return convertAnimalSpeciesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ANIMAL_BREEDS:
				return convertAnimalBreedsToString(eDataType, instanceValue);
			case FhirValuesetPackage.GENDER_STATUS:
				return convertGenderStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PATIENT_RELATIONSHIP_TYPE:
				return convertPatientRelationshipTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUANTITY_COMPARATOR:
				return convertQuantityComparatorToString(eDataType, instanceValue);
			case FhirValuesetPackage.SIGNATURE_TYPE_CODES:
				return convertSignatureTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_STATUS:
				return convertDeviceStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.UNITS_OF_TIME:
				return convertUnitsOfTimeToString(eDataType, instanceValue);
			case FhirValuesetPackage.EVENT_TIMING:
				return convertEventTimingToString(eDataType, instanceValue);
			case FhirValuesetPackage.TIMING_ABBREVIATION:
				return convertTimingAbbreviationToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODULE_METADATA_TYPE:
				return convertModuleMetadataTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODULE_METADATA_STATUS:
				return convertModuleMetadataStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODULE_METADATA_FOCUS_TYPE:
				return convertModuleMetadataFocusTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODULE_METADATA_CONTRIBUTOR_TYPE:
				return convertModuleMetadataContributorTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.IDENTITY_ASSURANCE_LEVEL:
				return convertIdentityAssuranceLevelToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODULE_METADATA_RESOURCE_TYPE:
				return convertModuleMetadataResourceTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.OPERATION_PARAMETER_USE:
				return convertOperationParameterUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARAMETER_TYPES_USED_IN_OPERATION_DEFINITIONS:
				return convertParameterTypesUsedInOperationDefinitionsToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONFORMANCE_RESOURCE_STATUS:
				return convertConformanceResourceStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTEXT_OF_USE_VALUE_SET:
				return convertContextOfUseValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.STRUCTURE_DEFINITION_CODES:
				return convertStructureDefinitionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.STRUCTURE_DEFINITION_KIND:
				return convertStructureDefinitionKindToString(eDataType, instanceValue);
			case FhirValuesetPackage.FHIR_DEFINED_TYPE:
				return convertFhirDefinedTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXTENSION_CONTEXT:
				return convertExtensionContextToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROPERTY_REPRESENTATION:
				return convertPropertyRepresentationToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOINC_CODES:
				return convertLoincCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SLICING_RULES:
				return convertSlicingRulesToString(eDataType, instanceValue);
			case FhirValuesetPackage.AGGREGATION_MODE:
				return convertAggregationModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONSTRAINT_SEVERITY:
				return convertConstraintSeverityToString(eDataType, instanceValue);
			case FhirValuesetPackage.BINDING_STRENGTH:
				return convertBindingStrengthToString(eDataType, instanceValue);
			case FhirValuesetPackage.DESIGNATION_USE:
				return convertDesignationUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.FILTER_OPERATOR:
				return convertFilterOperatorToString(eDataType, instanceValue);
			case FhirValuesetPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_MEDICATION_CODES:
				return convertSnomedCtMedicationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDICATION_FORM_CODES:
				return convertMedicationFormCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSTANCE_CATEGORY_CODES:
				return convertSubstanceCategoryCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSTANCE_CODE:
				return convertSubstanceCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_FORM_CODES:
				return convertSnomedCtFormCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_PARTICIPATION_MODE:
				return convertV3CodeSystemParticipationModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.COMMUNICATION_STATUS:
				return convertCommunicationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_STATE:
				return convertEncounterStateToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_CLASS:
				return convertEncounterClassToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_TYPE:
				return convertEncounterTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_PRIORITY:
				return convertEncounterPriorityToString(eDataType, instanceValue);
			case FhirValuesetPackage.EPISODE_OF_CARE_STATUS:
				return convertEpisodeOfCareStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_PROBLEM_DIAGNOSIS_CODES:
				return convertConditionProblemDiagnosisCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_CATEGORY_CODES:
				return convertConditionCategoryCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_CLINICAL_STATUS_CODES:
				return convertConditionClinicalStatusCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_VERIFICATION_STATUS:
				return convertConditionVerificationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_DIAGNOSIS_SEVERITY:
				return convertConditionDiagnosisSeverityToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_STAGE:
				return convertConditionStageToString(eDataType, instanceValue);
			case FhirValuesetPackage.CLINICAL_IMPRESSION_STATUS:
				return convertClinicalImpressionStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_SUBSTANCE_AND_NEGATION_CODES:
				return convertAllergyIntoleranceSubstanceAndNegationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_STATUS:
				return convertAllergyIntoleranceStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return convertAllergyIntoleranceCriticalityToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_TYPE:
				return convertAllergyIntoleranceTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return convertAllergyIntoleranceCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return convertAllergyIntoleranceCertaintyToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_MANIFESTATION_CODES:
				return convertSnomedCtManifestationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return convertAllergyIntoleranceSeverityToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_ROUTE_CODES:
				return convertSnomedCtRouteCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_CLINICAL_FINDINGS:
				return convertSnomedCtClinicalFindingsToString(eDataType, instanceValue);
			case FhirValuesetPackage.INVESTIGATION_TYPE:
				return convertInvestigationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_STATUS:
				return convertObservationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_CATEGORY_CODES:
				return convertObservationCategoryCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_VALUE_ABSENT_REASON:
				return convertObservationValueAbsentReasonToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_INTERPRETATION_CODES:
				return convertObservationInterpretationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_BODY_STRUCTURES:
				return convertSnomedCtBodyStructuresToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_METHODS:
				return convertObservationMethodsToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIMEN_STATUS:
				return convertSpecimenStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.V2_SPECIMEN_TYPE:
				return convertV2SpecimenTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIMEN_COLLECTION_METHOD:
				return convertSpecimenCollectionMethodToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIMEN_TREATMENT_PROCEDURE:
				return convertSpecimenTreatmentProcedureToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIMEN_CONTAINER:
				return convertSpecimenContainerToString(eDataType, instanceValue);
			case FhirValuesetPackage.V2_ADDITIVE_PRESERVATIVE:
				return convertV2AdditivePreservativeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEASMNT_PRINCIPLE:
				return convertMeasmntPrincipleToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return convertDeviceMetricOperationalStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_METRIC_COLOR:
				return convertDeviceMetricColorToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_METRIC_CATEGORY:
				return convertDeviceMetricCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return convertDeviceMetricCalibrationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return convertDeviceMetricCalibrationStateToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_REFERENCE_RANGE_MEANING_CODES:
				return convertObservationReferenceRangeMeaningCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return convertObservationRelationshipTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUESTIONNAIRE_STATUS:
				return convertQuestionnaireStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUESTIONNAIRE_QUESTION_CODES:
				return convertQuestionnaireQuestionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUESTIONNAIRE_ITEM_TYPE:
				return convertQuestionnaireItemTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUESTIONNAIRE_ANSWER_CODES:
				return convertQuestionnaireAnswerCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return convertQuestionnaireResponseStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.FAMILY_HISTORY_STATUS:
				return convertFamilyHistoryStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.FAMILY_MEMBER:
				return convertFamilyMemberToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITION_OUTCOME_CODES:
				return convertConditionOutcomeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIAGNOSTIC_REPORT_STATUS:
				return convertDiagnosticReportStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIAGNOSTIC_SERVICE_SECTION_CODES:
				return convertDiagnosticServiceSectionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOINC_DIAGNOSTIC_REPORT_CODES:
				return convertLoincDiagnosticReportCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_TYPE_VALUE_SET:
				return convertDocumentTypeValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_CLASS_VALUE_SET:
				return convertDocumentClassValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_REFERENCE_STATUS:
				return convertDocumentReferenceStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.COMPOSITION_STATUS:
				return convertCompositionStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return convertDocumentRelationshipTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_REFERENCE_FORMAT_CODE_SET:
				return convertDocumentReferenceFormatCodeSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_ACT_CODE:
				return convertV3CodeSystemActCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.FACILITY_TYPE_CODE_VALUE_SET:
				return convertFacilityTypeCodeValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_STATUS:
				return convertDiagnosticOrderStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_PRIORITY:
				return convertDiagnosticOrderPriorityToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIAGNOSTIC_ORDER_EVENT_CODES:
				return convertDiagnosticOrderEventCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOINC_DIAGNOSTIC_ORDER_CODES:
				return convertLoincDiagnosticOrderCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_CODESSNOMED_CT:
				return convertProcedureCodessnomedCTToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_REASON_CODES:
				return convertProcedureReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_REQUEST_STATUS:
				return convertProcedureRequestStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_REQUEST_PRIORITY:
				return convertProcedureRequestPriorityToString(eDataType, instanceValue);
			case FhirValuesetPackage.REFERRAL_STATUS:
				return convertReferralStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACQUISITION_MODALITY_CODES:
				return convertAcquisitionModalityCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.INSTANCE_AVAILABILITY:
				return convertInstanceAvailabilityToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_STATUS:
				return convertProcedureStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_CATEGORY_CODESSNOMED_CT:
				return convertProcedureCategoryCodessnomedCTToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT:
				return convertProcedureNotPerformedReasonsnomeDCTToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_PERFORMER_ROLE_CODES:
				return convertProcedurePerformerRoleCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_OUTCOME_CODESSNOMED_CT:
				return convertProcedureOutcomeCodessnomedCTToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_FOLLOW_UP_CODESSNOMED_CT:
				return convertProcedureFollowUpCodessnomedCTToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_STATUS:
				return convertCarePlanStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_CATEGORY:
				return convertCarePlanCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_RELATIONSHIP:
				return convertCarePlanRelationshipToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARTICIPANT_ROLES:
				return convertParticipantRolesToString(eDataType, instanceValue);
			case FhirValuesetPackage.GOAL_START_EVENT:
				return convertGoalStartEventToString(eDataType, instanceValue);
			case FhirValuesetPackage.GOAL_CATEGORY:
				return convertGoalCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.GOAL_STATUS:
				return convertGoalStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.GOAL_STATUS_REASON:
				return convertGoalStatusReasonToString(eDataType, instanceValue);
			case FhirValuesetPackage.GOAL_PRIORITY:
				return convertGoalPriorityToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDICATION_STATEMENT_STATUS:
				return convertMedicationStatementStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.REASON_MEDICATION_NOT_GIVEN_CODES:
				return convertReasonMedicationNotGivenCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BODYSITE_LOCATION_MODIFIER:
				return convertBodysiteLocationModifierToString(eDataType, instanceValue);
			case FhirValuesetPackage.SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES:
				return convertSnomedCtAnatomicalStructureForAdministrationSiteCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.NUTRITION_ORDER_STATUS:
				return convertNutritionOrderStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIET:
				return convertDietToString(eDataType, instanceValue);
			case FhirValuesetPackage.FOOD_TYPE_CODES:
				return convertFoodTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIET_CODES:
				return convertDietCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.NUTRIENT_MODIFIER_CODES:
				return convertNutrientModifierCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.TEXTURE_MODIFIER_CODES:
				return convertTextureModifierCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.TEXTURE_MODIFIED_FOOD_TYPE_CODES:
				return convertTextureModifiedFoodTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.FLUID_CONSISTENCY_TYPE_CODES:
				return convertFluidConsistencyTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLEMENT_TYPE_CODES:
				return convertSupplementTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENTERAL_FORMULA_TYPE_CODES:
				return convertEnteralFormulaTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENTERAL_FORMULA_ADDITIVE_TYPE_CODE:
				return convertEnteralFormulaAdditiveTypeCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENTERAL_ROUTE_CODES:
				return convertEnteralRouteCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.RISK_PROBABILITY:
				return convertRiskProbabilityToString(eDataType, instanceValue);
			case FhirValuesetPackage.APPOINTMENT_STATUS:
				return convertAppointmentStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_REASON_CODES:
				return convertEncounterReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SLOT_STATUS:
				return convertSlotStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARTICIPANT_TYPE:
				return convertParticipantTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARTICIPANT_REQUIRED:
				return convertParticipantRequiredToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARTICIPATION_STATUS:
				return convertParticipationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.COMMUNICATION_REQUEST_STATUS:
				return convertCommunicationRequestStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_USE_REQUEST_STATUS:
				return convertDeviceUseRequestStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.DEVICE_USE_REQUEST_PRIORITY:
				return convertDeviceUseRequestPriorityToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDICATION_ORDER_STATUS:
				return convertMedicationOrderStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE:
				return convertActSubstanceAdminSubstitutionCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSTANCE_ADMIN_SUBSTITUTION_REASON:
				return convertSubstanceAdminSubstitutionReasonToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACTION_LIST:
				return convertActionListToString(eDataType, instanceValue);
			case FhirValuesetPackage.RULESET_CODES:
				return convertRulesetCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_STATUS:
				return convertSupplyRequestStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_TYPE:
				return convertSupplyTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_REASON:
				return convertSupplyRequestReasonToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_REQUEST_WHEN:
				return convertSupplyRequestWhenToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES:
				return convertExampleVisionPrescriptionProductCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VISION_EYES:
				return convertVisionEyesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VISION_BASE:
				return convertVisionBaseToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY_CATEGORY:
				return convertCarePlanActivityCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY:
				return convertCarePlanActivityToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACTIVITY_REASON:
				return convertActivityReasonToString(eDataType, instanceValue);
			case FhirValuesetPackage.CARE_PLAN_ACTIVITY_STATUS:
				return convertCarePlanActivityStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCEDURE_DEVICE_ACTION_CODES:
				return convertProcedureDeviceActionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.LATERALITY:
				return convertLateralityToString(eDataType, instanceValue);
			case FhirValuesetPackage.KO_STITLE:
				return convertKoStitleToString(eDataType, instanceValue);
			case FhirValuesetPackage.DIGITAL_MEDIA_TYPE:
				return convertDigitalMediaTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDIA_SUB_TYPE:
				return convertMediaSubTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDIA_COLLECTION_VIEW_PROJECTION:
				return convertMediaCollectionViewProjectionToString(eDataType, instanceValue);
			case FhirValuesetPackage.MANIFESTATION_AND_SYMPTOM_CODES:
				return convertManifestationAndSymptomCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADMIT_SOURCE:
				return convertAdmitSourceToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIAL_COURTESY:
				return convertSpecialCourtesyToString(eDataType, instanceValue);
			case FhirValuesetPackage.SPECIAL_ARRANGEMENTS:
				return convertSpecialArrangementsToString(eDataType, instanceValue);
			case FhirValuesetPackage.DISCHARGE_DISPOSITION:
				return convertDischargeDispositionToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENCOUNTER_LOCATION_STATUS:
				return convertEncounterLocationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.NAMING_SYSTEM_TYPE:
				return convertNamingSystemTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return convertNamingSystemIdentifierTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONCEPT_MAP_EQUIVALENCE:
				return convertConceptMapEquivalenceToString(eDataType, instanceValue);
			case FhirValuesetPackage.FLAG_CATEGORY:
				return convertFlagCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.FLAG_STATUS:
				return convertFlagStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.FLAG_CODE:
				return convertFlagCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SEQUENCE_TYPE:
				return convertSequenceTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DB_SNP:
				return convertDbSnpToString(eDataType, instanceValue);
			case FhirValuesetPackage.ENSEMBL:
				return convertEnsemblToString(eDataType, instanceValue);
			case FhirValuesetPackage.LOINC530345_ANSWERLIST:
				return convertLoinc530345AnswerlistToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_TYPE_CODES:
				return convertContractTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_SUBTYPE_CODES:
				return convertContractSubtypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_ACTION_CODES:
				return convertContractActionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PURPOSE_OF_USE:
				return convertPurposeOfUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_ACTOR_ROLE_CODES:
				return convertContractActorRoleCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_SIGNER_TYPE_CODES:
				return convertContractSignerTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_TERM_TYPE_CODES:
				return convertContractTermTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTRACT_TERM_SUB_TYPE_CODES:
				return convertContractTermSubTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.FHIR_DOCUMENT_TYPE_CODES:
				return convertFhirDocumentTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.FHIR_DOCUMENT_CLASS_CODES:
				return convertFhirDocumentClassCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_CONFIDENTIALITY:
				return convertV3CodeSystemConfidentialityToString(eDataType, instanceValue);
			case FhirValuesetPackage.COMPOSITION_ATTESTATION_MODE:
				return convertCompositionAttestationModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_SECTION_CODES:
				return convertDocumentSectionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.LIST_MODE:
				return convertListModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.LIST_ORDER_CODES:
				return convertListOrderCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.LIST_EMPTY_REASONS:
				return convertListEmptyReasonsToString(eDataType, instanceValue);
			case FhirValuesetPackage.REMITTANCE_OUTCOME:
				return convertRemittanceOutcomeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PAYMENT_TYPE_CODES:
				return convertPaymentTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.FORM_CODES:
				return convertFormCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.NOTE_TYPE:
				return convertNoteTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONFORMANCE_STATEMENT_KIND:
				return convertConformanceStatementKindToString(eDataType, instanceValue);
			case FhirValuesetPackage.UNKNOWN_CONTENT_CODE:
				return convertUnknownContentCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.RESTFUL_CONFORMANCE_MODE:
				return convertRestfulConformanceModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.RESTFUL_SECURITY_SERVICE:
				return convertRestfulSecurityServiceToString(eDataType, instanceValue);
			case FhirValuesetPackage.TYPE_RESTFUL_INTERACTION:
				return convertTypeRestfulInteractionToString(eDataType, instanceValue);
			case FhirValuesetPackage.RESOURCE_VERSION_POLICY:
				return convertResourceVersionPolicyToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITIONAL_DELETE_STATUS:
				return convertConditionalDeleteStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.SEARCH_PARAM_TYPE:
				return convertSearchParamTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SEARCH_MODIFIER_CODE:
				return convertSearchModifierCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SYSTEM_RESTFUL_INTERACTION:
				return convertSystemRestfulInteractionToString(eDataType, instanceValue);
			case FhirValuesetPackage.TRANSACTION_MODE:
				return convertTransactionModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.OPERATION_KIND:
				return convertOperationKindToString(eDataType, instanceValue);
			case FhirValuesetPackage.MESSAGE_TRANSPORT:
				return convertMessageTransportToString(eDataType, instanceValue);
			case FhirValuesetPackage.MESSAGE_EVENT:
				return convertMessageEventToString(eDataType, instanceValue);
			case FhirValuesetPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return convertMessageSignificanceCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONFORMANCE_EVENT_MODE:
				return convertConformanceEventModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DOCUMENT_MODE:
				return convertDocumentModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROFILE_ORIGIN_TYPE:
				return convertProfileOriginTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROFILE_DESTINATION_TYPE:
				return convertProfileDestinationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.TEST_SCRIPT_OPERATION_CODES:
				return convertTestScriptOperationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ASSERTION_DIRECTION_TYPE:
				return convertAssertionDirectionTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ASSERTION_OPERATOR_TYPE:
				return convertAssertionOperatorTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ASSERTION_RESPONSE_TYPES:
				return convertAssertionResponseTypesToString(eDataType, instanceValue);
			case FhirValuesetPackage.DATA_ELEMENT_STRINGENCY:
				return convertDataElementStringencyToString(eDataType, instanceValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_TRIGGER_TYPE:
				return convertDecisionSupportRuleTriggerTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_PARTICIPANT_TYPE:
				return convertDecisionSupportRuleParticipantTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DECISION_SUPPORT_RULE_ACTION_TYPE:
				return convertDecisionSupportRuleActionTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.RESPONSE_TYPE:
				return convertResponseTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ISSUE_SEVERITY:
				return convertIssueSeverityToString(eDataType, instanceValue);
			case FhirValuesetPackage.ISSUE_TYPE:
				return convertIssueTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.OPERATION_OUTCOME_CODES:
				return convertOperationOutcomeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXAMPLE_MESSAGE_REASON_CODES:
				return convertExampleMessageReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSCRIPTION_STATUS:
				return convertSubscriptionStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return convertSubscriptionChannelTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUBSCRIPTION_TAG:
				return convertSubscriptionTagToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACT_COVERAGE_TYPE_CODE:
				return convertActCoverageTypeCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.RELATIONSHIP_CODES:
				return convertRelationshipCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VACCINE_ADMINISTERED_VALUE_SET:
				return convertVaccineAdministeredValueSetToString(eDataType, instanceValue);
			case FhirValuesetPackage.IMMUNIZATION_RECOMMENDATION_STATUS_CODES:
				return convertImmunizationRecommendationStatusCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES:
				return convertImmunizationRecommendationDateCriterionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDICATION_ADMINISTRATION_STATUS:
				return convertMedicationAdministrationStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION:
				return convertCodesForImmunizationSiteOfAdministrationToString(eDataType, instanceValue);
			case FhirValuesetPackage.IMMUNIZATION_ROUTE_CODES:
				return convertImmunizationRouteCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.IMMUNIZATION_REASON_CODES:
				return convertImmunizationReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES:
				return convertImmunizationReasonsForNotImmunizingCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_TARGET_CODES:
				return convertVaccinationProtocolDoseTargetCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_STATUS_CODES:
				return convertVaccinationProtocolDoseStatusCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES:
				return convertVaccinationProtocolDoseStatusReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BUNDLE_TYPE:
				return convertBundleTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.SEARCH_ENTRY_MODE:
				return convertSearchEntryModeToString(eDataType, instanceValue);
			case FhirValuesetPackage.HTTP_VERB:
				return convertHttpVerbToString(eDataType, instanceValue);
			case FhirValuesetPackage.PRIORITY_CODES:
				return convertPriorityCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BENEFIT_CATEGORY_CODES:
				return convertBenefitCategoryCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BENEFIT_SUB_CATEGORY_CODES:
				return convertBenefitSubCategoryCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.NETWORK_TYPE_CODES:
				return convertNetworkTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.UNIT_TYPE_CODES:
				return convertUnitTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BENEFIT_TERM_CODES:
				return convertBenefitTermCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.BENEFIT_TYPE_CODES:
				return convertBenefitTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADJUDICATION_ERROR_CODES:
				return convertAdjudicationErrorCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDICATION_DISPENSE_STATUS:
				return convertMedicationDispenseStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACT_PHARMACY_SUPPLY_TYPE:
				return convertActPharmacySupplyTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.CLAIM_TYPE:
				return convertClaimTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.USE:
				return convertUseToString(eDataType, instanceValue);
			case FhirValuesetPackage.FUNDS_RESERVATION_CODES:
				return convertFundsReservationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PAYEE_TYPE_CODES:
				return convertPayeeTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.IC_D10_CODES:
				return convertIcD10CodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.CONDITIONS_CODES:
				return convertConditionsCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXCEPTION_CODES:
				return convertExceptionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACT_INCIDENT_CODE:
				return convertActIncidentCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.INTERVENTION_CODES:
				return convertInterventionCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACT_INVOICE_GROUP_CODE:
				return convertActInvoiceGroupCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.USCLS_CODES:
				return convertUsclsCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXAMPLE_SERVICE_PLACE_CODES:
				return convertExampleServicePlaceCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.UDI_CODES:
				return convertUdiCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.TOOTH_CODES:
				return convertToothCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.SURFACE_CODES:
				return convertSurfaceCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MODIFIER_TYPE_CODES:
				return convertModifierTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORAL_PROSTHO_MATERIAL_TYPE_CODES:
				return convertOralProsthoMaterialTypeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADDITIONAL_MATERIAL_CODES:
				return convertAdditionalMaterialCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.TEETH_CODES:
				return convertTeethCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MISSING_TOOTH_REASON_CODES:
				return convertMissingToothReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADJUDICATION_CODES:
				return convertAdjudicationCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PAYMENT_ADJUSTMENT_REASON_CODES:
				return convertPaymentAdjustmentReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ADJUDICATION_REASON_CODES:
				return convertAdjudicationReasonCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.GUIDE_DEPENDENCY_TYPE:
				return convertGuideDependencyTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.GUIDE_RESOURCE_PURPOSE:
				return convertGuideResourcePurposeToString(eDataType, instanceValue);
			case FhirValuesetPackage.GUIDE_PAGE_KIND:
				return convertGuidePageKindToString(eDataType, instanceValue);
			case FhirValuesetPackage.XPATH_USAGE_TYPE:
				return convertXPathUsageTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_PARTICIPANT_TYPE:
				return convertOrderSetParticipantTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_TYPE:
				return convertOrderSetItemTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_GROUPING_BEHAVIOR:
				return convertOrderSetItemGroupingBehaviorToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_SELECTION_BEHAVIOR:
				return convertOrderSetItemSelectionBehaviorToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_REQUIRED_BEHAVIOR:
				return convertOrderSetItemRequiredBehaviorToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_PRECHECK_BEHAVIOR:
				return convertOrderSetItemPrecheckBehaviorToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_SET_ITEM_CARDINALITY_BEHAVIOR:
				return convertOrderSetItemCardinalityBehaviorToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROVENANCE_EVENT_CURRENT_STATE:
				return convertProvenanceEventCurrentStateToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROVENANCE_PARTICIPANT_ROLE:
				return convertProvenanceParticipantRoleToString(eDataType, instanceValue);
			case FhirValuesetPackage.V3_CODE_SYSTEM_ROLE_LINK_TYPE:
				return convertV3CodeSystemRoleLinkTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROVENANCE_ENTITY_ROLE:
				return convertProvenanceEntityRoleToString(eDataType, instanceValue);
			case FhirValuesetPackage.PROCESS_OUTCOME_CODES:
				return convertProcessOutcomeCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEASURE_POPULATION_TYPE:
				return convertMeasurePopulationTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.PAYMENT_STATUS_CODES:
				return convertPaymentStatusCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.EXAMPLE_USE_CODES_FOR_LIST:
				return convertExampleUseCodesForListToString(eDataType, instanceValue);
			case FhirValuesetPackage.LIST_STATUS:
				return convertListStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.PATIENT_MEDICINE_CHANGE_TYPES:
				return convertPatientMedicineChangeTypesToString(eDataType, instanceValue);
			case FhirValuesetPackage.GUIDANCE_RESPONSE_STATUS:
				return convertGuidanceResponseStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.GUIDANCE_RESPONSE_ACTION_TYPE:
				return convertGuidanceResponseActionTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.DETECTED_ISSUE_CATEGORY:
				return convertDetectedIssueCategoryToString(eDataType, instanceValue);
			case FhirValuesetPackage.DETECTED_ISSUE_SEVERITY:
				return convertDetectedIssueSeverityToString(eDataType, instanceValue);
			case FhirValuesetPackage.DETECTED_ISSUE_MITIGATION_ACTION:
				return convertDetectedIssueMitigationActionToString(eDataType, instanceValue);
			case FhirValuesetPackage.ACCOUNT_STATUS:
				return convertAccountStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.REASON_MEDICATION_GIVEN_CODES:
				return convertReasonMedicationGivenCodesToString(eDataType, instanceValue);
			case FhirValuesetPackage.PARTICIPANT_STATUS:
				return convertParticipantStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_ID:
				return convertAuditEventIdToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_SUB_TYPE:
				return convertAuditEventSubTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_ACTION:
				return convertAuditEventActionToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_OUTCOME:
				return convertAuditEventOutcomeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_ACTIVE_PARTICIPANT_ROLE_ID_CODE:
				return convertAuditActiveParticipantRoleIdCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.MEDIA_TYPE_CODE:
				return convertMediaTypeCodeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE:
				return convertAuditEventParticipantNetworkTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_SOURCE_TYPE:
				return convertAuditEventSourceTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_TYPE:
				return convertAuditEventObjectTypeToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_ROLE:
				return convertAuditEventObjectRoleToString(eDataType, instanceValue);
			case FhirValuesetPackage.AUDIT_EVENT_OBJECT_LIFECYCLE:
				return convertAuditEventObjectLifecycleToString(eDataType, instanceValue);
			case FhirValuesetPackage.BASIC_RESOURCE_TYPES:
				return convertBasicResourceTypesToString(eDataType, instanceValue);
			case FhirValuesetPackage.ORDER_STATUS:
				return convertOrderStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_DELIVERY_STATUS:
				return convertSupplyDeliveryStatusToString(eDataType, instanceValue);
			case FhirValuesetPackage.SUPPLY_ITEM_TYPE:
				return convertSupplyItemTypeToString(eDataType, instanceValue);
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
	public NarrativeStatus createNarrativeStatusFromString(EDataType eDataType, String initialValue) {
		NarrativeStatus result = NarrativeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUseFromString(EDataType eDataType, String initialValue) {
		IdentifierUse result = IdentifierUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseToString(EDataType eDataType, Object instanceValue) {
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
	public ContactPointSystem createContactPointSystemFromString(EDataType eDataType, String initialValue) {
		ContactPointSystem result = ContactPointSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUseFromString(EDataType eDataType, String initialValue) {
		ContactPointUse result = ContactPointUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUseFromString(EDataType eDataType, String initialValue) {
		AddressUse result = AddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressTypeFromString(EDataType eDataType, String initialValue) {
		AddressType result = AddressType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeToString(EDataType eDataType, Object instanceValue) {
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
	public NameUse createNameUseFromString(EDataType eDataType, String initialValue) {
		NameUse result = NameUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGenderFromString(EDataType eDataType, String initialValue) {
		AdministrativeGender result = AdministrativeGender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderToString(EDataType eDataType, Object instanceValue) {
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
	public PractitionerSpecialty createPractitionerSpecialtyFromString(EDataType eDataType, String initialValue) {
		PractitionerSpecialty result = PractitionerSpecialty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPractitionerSpecialtyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatusFromString(EDataType eDataType, String initialValue) {
		LocationStatus result = LocationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationModeFromString(EDataType eDataType, String initialValue) {
		LocationMode result = LocationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocationRoleType createServiceDeliveryLocationRoleTypeFromString(EDataType eDataType, String initialValue) {
		ServiceDeliveryLocationRoleType result = ServiceDeliveryLocationRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceDeliveryLocationRoleTypeToString(EDataType eDataType, Object instanceValue) {
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
	public DaysOfWeek createDaysOfWeekFromString(EDataType eDataType, String initialValue) {
		DaysOfWeek result = DaysOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 createAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12FromString(EDataType eDataType, String initialValue) {
		AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 result = AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12ToString(EDataType eDataType, Object instanceValue) {
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
	public AnimalSpecies createAnimalSpeciesFromString(EDataType eDataType, String initialValue) {
		AnimalSpecies result = AnimalSpecies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimalSpeciesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimalBreeds createAnimalBreedsFromString(EDataType eDataType, String initialValue) {
		AnimalBreeds result = AnimalBreeds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimalBreedsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderStatus createGenderStatusFromString(EDataType eDataType, String initialValue) {
		GenderStatus result = GenderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
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
	public QuantityComparator createQuantityComparatorFromString(EDataType eDataType, String initialValue) {
		QuantityComparator result = QuantityComparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorToString(EDataType eDataType, Object instanceValue) {
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
	public DeviceStatus createDeviceStatusFromString(EDataType eDataType, String initialValue) {
		DeviceStatus result = DeviceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTimeFromString(EDataType eDataType, String initialValue) {
		UnitsOfTime result = UnitsOfTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTimingFromString(EDataType eDataType, String initialValue) {
		EventTiming result = EventTiming.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingToString(EDataType eDataType, Object instanceValue) {
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
	public ModuleMetadataType createModuleMetadataTypeFromString(EDataType eDataType, String initialValue) {
		ModuleMetadataType result = ModuleMetadataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleMetadataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataStatus createModuleMetadataStatusFromString(EDataType eDataType, String initialValue) {
		ModuleMetadataStatus result = ModuleMetadataStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleMetadataStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataFocusType createModuleMetadataFocusTypeFromString(EDataType eDataType, String initialValue) {
		ModuleMetadataFocusType result = ModuleMetadataFocusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleMetadataFocusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataContributorType createModuleMetadataContributorTypeFromString(EDataType eDataType, String initialValue) {
		ModuleMetadataContributorType result = ModuleMetadataContributorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleMetadataContributorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevelFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevel result = IdentityAssuranceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataResourceType createModuleMetadataResourceTypeFromString(EDataType eDataType, String initialValue) {
		ModuleMetadataResourceType result = ModuleMetadataResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleMetadataResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUseFromString(EDataType eDataType, String initialValue) {
		OperationParameterUse result = OperationParameterUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypesUsedInOperationDefinitions createParameterTypesUsedInOperationDefinitionsFromString(EDataType eDataType, String initialValue) {
		ParameterTypesUsedInOperationDefinitions result = ParameterTypesUsedInOperationDefinitions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypesUsedInOperationDefinitionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus createConformanceResourceStatusFromString(EDataType eDataType, String initialValue) {
		ConformanceResourceStatus result = ConformanceResourceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceResourceStatusToString(EDataType eDataType, Object instanceValue) {
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
	public StructureDefinitionCodes createStructureDefinitionCodesFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionCodes result = StructureDefinitionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKind createStructureDefinitionKindFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKind result = StructureDefinitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindToString(EDataType eDataType, Object instanceValue) {
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
	public ExtensionContext createExtensionContextFromString(EDataType eDataType, String initialValue) {
		ExtensionContext result = ExtensionContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentationFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentation result = PropertyRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationToString(EDataType eDataType, Object instanceValue) {
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
	public SlicingRules createSlicingRulesFromString(EDataType eDataType, String initialValue) {
		SlicingRules result = SlicingRules.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationModeFromString(EDataType eDataType, String initialValue) {
		AggregationMode result = AggregationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverityFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverity result = ConstraintSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrengthFromString(EDataType eDataType, String initialValue) {
		BindingStrength result = BindingStrength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthToString(EDataType eDataType, Object instanceValue) {
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
	public FilterOperator createFilterOperatorFromString(EDataType eDataType, String initialValue) {
		FilterOperator result = FilterOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtMedicationCodes createSnomedCtMedicationCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtMedicationCodes result = SnomedCtMedicationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtMedicationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFormCodes createMedicationFormCodesFromString(EDataType eDataType, String initialValue) {
		MedicationFormCodes result = MedicationFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationFormCodesToString(EDataType eDataType, Object instanceValue) {
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
	public SnomedCtFormCodes createSnomedCtFormCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtFormCodes result = SnomedCtFormCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtFormCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemParticipationMode createV3CodeSystemParticipationModeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemParticipationMode result = V3CodeSystemParticipationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemParticipationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatus createCommunicationStatusFromString(EDataType eDataType, String initialValue) {
		CommunicationStatus result = CommunicationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterState createEncounterStateFromString(EDataType eDataType, String initialValue) {
		EncounterState result = EncounterState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClass createEncounterClassFromString(EDataType eDataType, String initialValue) {
		EncounterClass result = EncounterClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterClassToString(EDataType eDataType, Object instanceValue) {
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
	public EncounterPriority createEncounterPriorityFromString(EDataType eDataType, String initialValue) {
		EncounterPriority result = EncounterPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatusFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatus result = EpisodeOfCareStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ConditionClinicalStatusCodes createConditionClinicalStatusCodesFromString(EDataType eDataType, String initialValue) {
		ConditionClinicalStatusCodes result = ConditionClinicalStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatus createConditionVerificationStatusFromString(EDataType eDataType, String initialValue) {
		ConditionVerificationStatus result = ConditionVerificationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ClinicalImpressionStatus createClinicalImpressionStatusFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatus result = ClinicalImpressionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSubstanceAndNegationCodes createAllergyIntoleranceSubstanceAndNegationCodesFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSubstanceAndNegationCodes result = AllergyIntoleranceSubstanceAndNegationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSubstanceAndNegationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatus createAllergyIntoleranceStatusFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceStatus result = AllergyIntoleranceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticalityFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticality result = AllergyIntoleranceCriticality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType createAllergyIntoleranceTypeFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceType result = AllergyIntoleranceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategoryFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategory result = AllergyIntoleranceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertainty createAllergyIntoleranceCertaintyFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCertainty result = AllergyIntoleranceCertainty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtManifestationCodes createSnomedCtManifestationCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtManifestationCodes result = SnomedCtManifestationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtManifestationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverityFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverity result = AllergyIntoleranceSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtRouteCodes createSnomedCtRouteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtRouteCodes result = SnomedCtRouteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtRouteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtClinicalFindings createSnomedCtClinicalFindingsFromString(EDataType eDataType, String initialValue) {
		SnomedCtClinicalFindings result = SnomedCtClinicalFindings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtClinicalFindingsToString(EDataType eDataType, Object instanceValue) {
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
	public ObservationStatus createObservationStatusFromString(EDataType eDataType, String initialValue) {
		ObservationStatus result = ObservationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ObservationValueAbsentReason createObservationValueAbsentReasonFromString(EDataType eDataType, String initialValue) {
		ObservationValueAbsentReason result = ObservationValueAbsentReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationValueAbsentReasonToString(EDataType eDataType, Object instanceValue) {
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
	public SnomedCtBodyStructures createSnomedCtBodyStructuresFromString(EDataType eDataType, String initialValue) {
		SnomedCtBodyStructures result = SnomedCtBodyStructures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtBodyStructuresToString(EDataType eDataType, Object instanceValue) {
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
	public SpecimenStatus createSpecimenStatusFromString(EDataType eDataType, String initialValue) {
		SpecimenStatus result = SpecimenStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2SpecimenType createV2SpecimenTypeFromString(EDataType eDataType, String initialValue) {
		V2SpecimenType result = V2SpecimenType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2SpecimenTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollectionMethod createSpecimenCollectionMethodFromString(EDataType eDataType, String initialValue) {
		SpecimenCollectionMethod result = SpecimenCollectionMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenCollectionMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatmentProcedure createSpecimenTreatmentProcedureFromString(EDataType eDataType, String initialValue) {
		SpecimenTreatmentProcedure result = SpecimenTreatmentProcedure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenTreatmentProcedureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainerFromString(EDataType eDataType, String initialValue) {
		SpecimenContainer result = SpecimenContainer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V2AdditivePreservative createV2AdditivePreservativeFromString(EDataType eDataType, String initialValue) {
		V2AdditivePreservative result = V2AdditivePreservative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV2AdditivePreservativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple createMeasmntPrincipleFromString(EDataType eDataType, String initialValue) {
		MeasmntPrinciple result = MeasmntPrinciple.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatusFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatus result = DeviceMetricOperationalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor createDeviceMetricColorFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColor result = DeviceMetricColor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategoryFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategory result = DeviceMetricCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationTypeFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationType result = DeviceMetricCalibrationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationStateFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationState result = DeviceMetricCalibrationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateToString(EDataType eDataType, Object instanceValue) {
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
	public ObservationRelationshipType createObservationRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ObservationRelationshipType result = ObservationRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatus createQuestionnaireStatusFromString(EDataType eDataType, String initialValue) {
		QuestionnaireStatus result = QuestionnaireStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusToString(EDataType eDataType, Object instanceValue) {
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
	public QuestionnaireItemType createQuestionnaireItemTypeFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemType result = QuestionnaireItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeToString(EDataType eDataType, Object instanceValue) {
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
	public QuestionnaireResponseStatus createQuestionnaireResponseStatusFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatus result = QuestionnaireResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatus createFamilyHistoryStatusFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatus result = FamilyHistoryStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember createFamilyMemberFromString(EDataType eDataType, String initialValue) {
		FamilyMember result = FamilyMember.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyMemberToString(EDataType eDataType, Object instanceValue) {
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
	public DiagnosticReportStatus createDiagnosticReportStatusFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatus result = DiagnosticReportStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusToString(EDataType eDataType, Object instanceValue) {
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
	public DocumentTypeValueSet createDocumentTypeValueSetFromString(EDataType eDataType, String initialValue) {
		DocumentTypeValueSet result = DocumentTypeValueSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeValueSetToString(EDataType eDataType, Object instanceValue) {
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
	public DocumentReferenceStatus createDocumentReferenceStatusFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatus result = DocumentReferenceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatusFromString(EDataType eDataType, String initialValue) {
		CompositionStatus result = CompositionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipType createDocumentRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipType result = DocumentRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
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
	public V3CodeSystemActCode createV3CodeSystemActCodeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemActCode result = V3CodeSystemActCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemActCodeToString(EDataType eDataType, Object instanceValue) {
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
	public DiagnosticOrderStatus createDiagnosticOrderStatusFromString(EDataType eDataType, String initialValue) {
		DiagnosticOrderStatus result = DiagnosticOrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderPriority createDiagnosticOrderPriorityFromString(EDataType eDataType, String initialValue) {
		DiagnosticOrderPriority result = DiagnosticOrderPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderEventCodes createDiagnosticOrderEventCodesFromString(EDataType eDataType, String initialValue) {
		DiagnosticOrderEventCodes result = DiagnosticOrderEventCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderEventCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoincDiagnosticOrderCodes createLoincDiagnosticOrderCodesFromString(EDataType eDataType, String initialValue) {
		LoincDiagnosticOrderCodes result = LoincDiagnosticOrderCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoincDiagnosticOrderCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCodessnomedCT createProcedureCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureCodessnomedCT result = ProcedureCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
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
	public ProcedureRequestStatus createProcedureRequestStatusFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestStatus result = ProcedureRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority createProcedureRequestPriorityFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestPriority result = ProcedureRequestPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatus createReferralStatusFromString(EDataType eDataType, String initialValue) {
		ReferralStatus result = ReferralStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionModalityCodes createAcquisitionModalityCodesFromString(EDataType eDataType, String initialValue) {
		AcquisitionModalityCodes result = AcquisitionModalityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcquisitionModalityCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability createInstanceAvailabilityFromString(EDataType eDataType, String initialValue) {
		InstanceAvailability result = InstanceAvailability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus createProcedureStatusFromString(EDataType eDataType, String initialValue) {
		ProcedureStatus result = ProcedureStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCategoryCodessnomedCT createProcedureCategoryCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureCategoryCodessnomedCT result = ProcedureCategoryCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureCategoryCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNotPerformedReasonsnomeDCT createProcedureNotPerformedReasonsnomeDCTFromString(EDataType eDataType, String initialValue) {
		ProcedureNotPerformedReasonsnomeDCT result = ProcedureNotPerformedReasonsnomeDCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureNotPerformedReasonsnomeDCTToString(EDataType eDataType, Object instanceValue) {
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
	public ProcedureOutcomeCodessnomedCT createProcedureOutcomeCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureOutcomeCodessnomedCT result = ProcedureOutcomeCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureOutcomeCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFollowUpCodessnomedCT createProcedureFollowUpCodessnomedCTFromString(EDataType eDataType, String initialValue) {
		ProcedureFollowUpCodessnomedCT result = ProcedureFollowUpCodessnomedCT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureFollowUpCodessnomedCTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus createCarePlanStatusFromString(EDataType eDataType, String initialValue) {
		CarePlanStatus result = CarePlanStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusToString(EDataType eDataType, Object instanceValue) {
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
	public CarePlanRelationship createCarePlanRelationshipFromString(EDataType eDataType, String initialValue) {
		CarePlanRelationship result = CarePlanRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanRelationshipToString(EDataType eDataType, Object instanceValue) {
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
	public GoalStatus createGoalStatusFromString(EDataType eDataType, String initialValue) {
		GoalStatus result = GoalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusReason createGoalStatusReasonFromString(EDataType eDataType, String initialValue) {
		GoalStatusReason result = GoalStatusReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusReasonToString(EDataType eDataType, Object instanceValue) {
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
	public MedicationStatementStatus createMedicationStatementStatusFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatus result = MedicationStatementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonMedicationNotGivenCodes createReasonMedicationNotGivenCodesFromString(EDataType eDataType, String initialValue) {
		ReasonMedicationNotGivenCodes result = ReasonMedicationNotGivenCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonMedicationNotGivenCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodysiteLocationModifier createBodysiteLocationModifierFromString(EDataType eDataType, String initialValue) {
		BodysiteLocationModifier result = BodysiteLocationModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBodysiteLocationModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnomedCtAnatomicalStructureForAdministrationSiteCodes createSnomedCtAnatomicalStructureForAdministrationSiteCodesFromString(EDataType eDataType, String initialValue) {
		SnomedCtAnatomicalStructureForAdministrationSiteCodes result = SnomedCtAnatomicalStructureForAdministrationSiteCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSnomedCtAnatomicalStructureForAdministrationSiteCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus createNutritionOrderStatusFromString(EDataType eDataType, String initialValue) {
		NutritionOrderStatus result = NutritionOrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusToString(EDataType eDataType, Object instanceValue) {
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
	public AppointmentStatus createAppointmentStatusFromString(EDataType eDataType, String initialValue) {
		AppointmentStatus result = AppointmentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusToString(EDataType eDataType, Object instanceValue) {
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
	public SlotStatus createSlotStatusFromString(EDataType eDataType, String initialValue) {
		SlotStatus result = SlotStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ParticipantRequired createParticipantRequiredFromString(EDataType eDataType, String initialValue) {
		ParticipantRequired result = ParticipantRequired.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatusFromString(EDataType eDataType, String initialValue) {
		ParticipationStatus result = ParticipationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatus createCommunicationRequestStatusFromString(EDataType eDataType, String initialValue) {
		CommunicationRequestStatus result = CommunicationRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestStatus createDeviceUseRequestStatusFromString(EDataType eDataType, String initialValue) {
		DeviceUseRequestStatus result = DeviceUseRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestPriority createDeviceUseRequestPriorityFromString(EDataType eDataType, String initialValue) {
		DeviceUseRequestPriority result = DeviceUseRequestPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderStatus createMedicationOrderStatusFromString(EDataType eDataType, String initialValue) {
		MedicationOrderStatus result = MedicationOrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationOrderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActSubstanceAdminSubstitutionCode createActSubstanceAdminSubstitutionCodeFromString(EDataType eDataType, String initialValue) {
		ActSubstanceAdminSubstitutionCode result = ActSubstanceAdminSubstitutionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActSubstanceAdminSubstitutionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdminSubstitutionReason createSubstanceAdminSubstitutionReasonFromString(EDataType eDataType, String initialValue) {
		SubstanceAdminSubstitutionReason result = SubstanceAdminSubstitutionReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstanceAdminSubstitutionReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList createActionListFromString(EDataType eDataType, String initialValue) {
		ActionList result = ActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesetCodes createRulesetCodesFromString(EDataType eDataType, String initialValue) {
		RulesetCodes result = RulesetCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesetCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus createSupplyRequestStatusFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatus result = SupplyRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusToString(EDataType eDataType, Object instanceValue) {
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
	public SupplyRequestWhen createSupplyRequestWhenFromString(EDataType eDataType, String initialValue) {
		SupplyRequestWhen result = SupplyRequestWhen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestWhenToString(EDataType eDataType, Object instanceValue) {
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
	public VisionEyes createVisionEyesFromString(EDataType eDataType, String initialValue) {
		VisionEyes result = VisionEyes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBaseFromString(EDataType eDataType, String initialValue) {
		VisionBase result = VisionBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategory createCarePlanActivityCategoryFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityCategory result = CarePlanActivityCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivityFromString(EDataType eDataType, String initialValue) {
		CarePlanActivity result = CarePlanActivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityReason createActivityReasonFromString(EDataType eDataType, String initialValue) {
		ActivityReason result = ActivityReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus createCarePlanActivityStatusFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatus result = CarePlanActivityStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusToString(EDataType eDataType, Object instanceValue) {
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
	public KoStitle createKoStitleFromString(EDataType eDataType, String initialValue) {
		KoStitle result = KoStitle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKoStitleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType createDigitalMediaTypeFromString(EDataType eDataType, String initialValue) {
		DigitalMediaType result = DigitalMediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaSubType createMediaSubTypeFromString(EDataType eDataType, String initialValue) {
		MediaSubType result = MediaSubType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaSubTypeToString(EDataType eDataType, Object instanceValue) {
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
	public EncounterLocationStatus createEncounterLocationStatusFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatus result = EncounterLocationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemTypeFromString(EDataType eDataType, String initialValue) {
		NamingSystemType result = NamingSystemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierType result = NamingSystemIdentifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence createConceptMapEquivalenceFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalence result = ConceptMapEquivalence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceToString(EDataType eDataType, Object instanceValue) {
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
	public FlagStatus createFlagStatusFromString(EDataType eDataType, String initialValue) {
		FlagStatus result = FlagStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusToString(EDataType eDataType, Object instanceValue) {
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
	public SequenceType createSequenceTypeFromString(EDataType eDataType, String initialValue) {
		SequenceType result = SequenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbSnp createDbSnpFromString(EDataType eDataType, String initialValue) {
		DbSnp result = DbSnp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbSnpToString(EDataType eDataType, Object instanceValue) {
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
	public Loinc530345Answerlist createLoinc530345AnswerlistFromString(EDataType eDataType, String initialValue) {
		Loinc530345Answerlist result = Loinc530345Answerlist.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoinc530345AnswerlistToString(EDataType eDataType, Object instanceValue) {
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
	public PurposeOfUse createPurposeOfUseFromString(EDataType eDataType, String initialValue) {
		PurposeOfUse result = PurposeOfUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurposeOfUseToString(EDataType eDataType, Object instanceValue) {
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
	public ContractTermSubTypeCodes createContractTermSubTypeCodesFromString(EDataType eDataType, String initialValue) {
		ContractTermSubTypeCodes result = ContractTermSubTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractTermSubTypeCodesToString(EDataType eDataType, Object instanceValue) {
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
	public FhirDocumentClassCodes createFhirDocumentClassCodesFromString(EDataType eDataType, String initialValue) {
		FhirDocumentClassCodes result = FhirDocumentClassCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFhirDocumentClassCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V3CodeSystemConfidentiality createV3CodeSystemConfidentialityFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemConfidentiality result = V3CodeSystemConfidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemConfidentialityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationMode createCompositionAttestationModeFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationMode result = CompositionAttestationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeToString(EDataType eDataType, Object instanceValue) {
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
	public ListMode createListModeFromString(EDataType eDataType, String initialValue) {
		ListMode result = ListMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeToString(EDataType eDataType, Object instanceValue) {
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
	public RemittanceOutcome createRemittanceOutcomeFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcome result = RemittanceOutcome.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeToString(EDataType eDataType, Object instanceValue) {
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
	public NoteType createNoteTypeFromString(EDataType eDataType, String initialValue) {
		NoteType result = NoteType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceStatementKind createConformanceStatementKindFromString(EDataType eDataType, String initialValue) {
		ConformanceStatementKind result = ConformanceStatementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceStatementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCode createUnknownContentCodeFromString(EDataType eDataType, String initialValue) {
		UnknownContentCode result = UnknownContentCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceMode createRestfulConformanceModeFromString(EDataType eDataType, String initialValue) {
		RestfulConformanceMode result = RestfulConformanceMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulConformanceModeToString(EDataType eDataType, Object instanceValue) {
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
	public TypeRestfulInteraction createTypeRestfulInteractionFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteraction result = TypeRestfulInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicyFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicy result = ResourceVersionPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus createConditionalDeleteStatusFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatus result = ConditionalDeleteStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamTypeFromString(EDataType eDataType, String initialValue) {
		SearchParamType result = SearchParamType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCode createSearchModifierCodeFromString(EDataType eDataType, String initialValue) {
		SearchModifierCode result = SearchModifierCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteractionFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteraction result = SystemRestfulInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionMode createTransactionModeFromString(EDataType eDataType, String initialValue) {
		TransactionMode result = TransactionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKindFromString(EDataType eDataType, String initialValue) {
		OperationKind result = OperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindToString(EDataType eDataType, Object instanceValue) {
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
	public MessageSignificanceCategory createMessageSignificanceCategoryFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategory result = MessageSignificanceCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventMode createConformanceEventModeFromString(EDataType eDataType, String initialValue) {
		ConformanceEventMode result = ConformanceEventMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceEventModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentModeFromString(EDataType eDataType, String initialValue) {
		DocumentMode result = DocumentMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileOriginType createProfileOriginTypeFromString(EDataType eDataType, String initialValue) {
		ProfileOriginType result = ProfileOriginType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileOriginTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileDestinationType createProfileDestinationTypeFromString(EDataType eDataType, String initialValue) {
		ProfileDestinationType result = ProfileDestinationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfileDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperationCodes createTestScriptOperationCodesFromString(EDataType eDataType, String initialValue) {
		TestScriptOperationCodes result = TestScriptOperationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptOperationCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentTypeFromString(EDataType eDataType, String initialValue) {
		ContentType result = ContentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType createAssertionDirectionTypeFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionType result = AssertionDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType createAssertionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorType result = AssertionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes createAssertionResponseTypesFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypes result = AssertionResponseTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringency createDataElementStringencyFromString(EDataType eDataType, String initialValue) {
		DataElementStringency result = DataElementStringency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleTriggerType createDecisionSupportRuleTriggerTypeFromString(EDataType eDataType, String initialValue) {
		DecisionSupportRuleTriggerType result = DecisionSupportRuleTriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionSupportRuleTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleParticipantType createDecisionSupportRuleParticipantTypeFromString(EDataType eDataType, String initialValue) {
		DecisionSupportRuleParticipantType result = DecisionSupportRuleParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionSupportRuleParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleActionType createDecisionSupportRuleActionTypeFromString(EDataType eDataType, String initialValue) {
		DecisionSupportRuleActionType result = DecisionSupportRuleActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionSupportRuleActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseTypeFromString(EDataType eDataType, String initialValue) {
		ResponseType result = ResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverityFromString(EDataType eDataType, String initialValue) {
		IssueSeverity result = IssueSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueTypeFromString(EDataType eDataType, String initialValue) {
		IssueType result = IssueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeToString(EDataType eDataType, Object instanceValue) {
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
	public SubscriptionStatus createSubscriptionStatusFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatus result = SubscriptionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelType createSubscriptionChannelTypeFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelType result = SubscriptionChannelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionTag createSubscriptionTagFromString(EDataType eDataType, String initialValue) {
		SubscriptionTag result = SubscriptionTag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionTagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActCoverageTypeCode createActCoverageTypeCodeFromString(EDataType eDataType, String initialValue) {
		ActCoverageTypeCode result = ActCoverageTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActCoverageTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipCodes createRelationshipCodesFromString(EDataType eDataType, String initialValue) {
		RelationshipCodes result = RelationshipCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipCodesToString(EDataType eDataType, Object instanceValue) {
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
	public MedicationAdministrationStatus createMedicationAdministrationStatusFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatus result = MedicationAdministrationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ImmunizationReasonsForNotImmunizingCodes createImmunizationReasonsForNotImmunizingCodesFromString(EDataType eDataType, String initialValue) {
		ImmunizationReasonsForNotImmunizingCodes result = ImmunizationReasonsForNotImmunizingCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationReasonsForNotImmunizingCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseTargetCodes createVaccinationProtocolDoseTargetCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseTargetCodes result = VaccinationProtocolDoseTargetCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseTargetCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseStatusCodes createVaccinationProtocolDoseStatusCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseStatusCodes result = VaccinationProtocolDoseStatusCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseStatusCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaccinationProtocolDoseStatusReasonCodes createVaccinationProtocolDoseStatusReasonCodesFromString(EDataType eDataType, String initialValue) {
		VaccinationProtocolDoseStatusReasonCodes result = VaccinationProtocolDoseStatusReasonCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVaccinationProtocolDoseStatusReasonCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleTypeFromString(EDataType eDataType, String initialValue) {
		BundleType result = BundleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryModeFromString(EDataType eDataType, String initialValue) {
		SearchEntryMode result = SearchEntryMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpVerb createHttpVerbFromString(EDataType eDataType, String initialValue) {
		HttpVerb result = HttpVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityCodes createPriorityCodesFromString(EDataType eDataType, String initialValue) {
		PriorityCodes result = PriorityCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityCodesToString(EDataType eDataType, Object instanceValue) {
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
	public BenefitSubCategoryCodes createBenefitSubCategoryCodesFromString(EDataType eDataType, String initialValue) {
		BenefitSubCategoryCodes result = BenefitSubCategoryCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitSubCategoryCodesToString(EDataType eDataType, Object instanceValue) {
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
	public MedicationDispenseStatus createMedicationDispenseStatusFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatus result = MedicationDispenseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActPharmacySupplyType createActPharmacySupplyTypeFromString(EDataType eDataType, String initialValue) {
		ActPharmacySupplyType result = ActPharmacySupplyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActPharmacySupplyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimType createClaimTypeFromString(EDataType eDataType, String initialValue) {
		ClaimType result = ClaimType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUseFromString(EDataType eDataType, String initialValue) {
		Use result = Use.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseToString(EDataType eDataType, Object instanceValue) {
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
	public PayeeTypeCodes createPayeeTypeCodesFromString(EDataType eDataType, String initialValue) {
		PayeeTypeCodes result = PayeeTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayeeTypeCodesToString(EDataType eDataType, Object instanceValue) {
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
	public ConditionsCodes createConditionsCodesFromString(EDataType eDataType, String initialValue) {
		ConditionsCodes result = ConditionsCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionsCodesToString(EDataType eDataType, Object instanceValue) {
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
	public ActIncidentCode createActIncidentCodeFromString(EDataType eDataType, String initialValue) {
		ActIncidentCode result = ActIncidentCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActIncidentCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionCodes createInterventionCodesFromString(EDataType eDataType, String initialValue) {
		InterventionCodes result = InterventionCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterventionCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActInvoiceGroupCode createActInvoiceGroupCodeFromString(EDataType eDataType, String initialValue) {
		ActInvoiceGroupCode result = ActInvoiceGroupCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActInvoiceGroupCodeToString(EDataType eDataType, Object instanceValue) {
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
	public UdiCodes createUdiCodesFromString(EDataType eDataType, String initialValue) {
		UdiCodes result = UdiCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUdiCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToothCodes createToothCodesFromString(EDataType eDataType, String initialValue) {
		ToothCodes result = ToothCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToothCodesToString(EDataType eDataType, Object instanceValue) {
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
	public OralProsthoMaterialTypeCodes createOralProsthoMaterialTypeCodesFromString(EDataType eDataType, String initialValue) {
		OralProsthoMaterialTypeCodes result = OralProsthoMaterialTypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOralProsthoMaterialTypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalMaterialCodes createAdditionalMaterialCodesFromString(EDataType eDataType, String initialValue) {
		AdditionalMaterialCodes result = AdditionalMaterialCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalMaterialCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeethCodes createTeethCodesFromString(EDataType eDataType, String initialValue) {
		TeethCodes result = TeethCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTeethCodesToString(EDataType eDataType, Object instanceValue) {
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
	public AdjudicationCodes createAdjudicationCodesFromString(EDataType eDataType, String initialValue) {
		AdjudicationCodes result = AdjudicationCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicationCodesToString(EDataType eDataType, Object instanceValue) {
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
	public GuideDependencyType createGuideDependencyTypeFromString(EDataType eDataType, String initialValue) {
		GuideDependencyType result = GuideDependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideResourcePurpose createGuideResourcePurposeFromString(EDataType eDataType, String initialValue) {
		GuideResourcePurpose result = GuideResourcePurpose.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideResourcePurposeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKind createGuidePageKindFromString(EDataType eDataType, String initialValue) {
		GuidePageKind result = GuidePageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageType createXPathUsageTypeFromString(EDataType eDataType, String initialValue) {
		XPathUsageType result = XPathUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetParticipantType createOrderSetParticipantTypeFromString(EDataType eDataType, String initialValue) {
		OrderSetParticipantType result = OrderSetParticipantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetParticipantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemType createOrderSetItemTypeFromString(EDataType eDataType, String initialValue) {
		OrderSetItemType result = OrderSetItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemGroupingBehavior createOrderSetItemGroupingBehaviorFromString(EDataType eDataType, String initialValue) {
		OrderSetItemGroupingBehavior result = OrderSetItemGroupingBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemGroupingBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemSelectionBehavior createOrderSetItemSelectionBehaviorFromString(EDataType eDataType, String initialValue) {
		OrderSetItemSelectionBehavior result = OrderSetItemSelectionBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemSelectionBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemRequiredBehavior createOrderSetItemRequiredBehaviorFromString(EDataType eDataType, String initialValue) {
		OrderSetItemRequiredBehavior result = OrderSetItemRequiredBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemRequiredBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemPrecheckBehavior createOrderSetItemPrecheckBehaviorFromString(EDataType eDataType, String initialValue) {
		OrderSetItemPrecheckBehavior result = OrderSetItemPrecheckBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemPrecheckBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemCardinalityBehavior createOrderSetItemCardinalityBehaviorFromString(EDataType eDataType, String initialValue) {
		OrderSetItemCardinalityBehavior result = OrderSetItemCardinalityBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderSetItemCardinalityBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEventCurrentState createProvenanceEventCurrentStateFromString(EDataType eDataType, String initialValue) {
		ProvenanceEventCurrentState result = ProvenanceEventCurrentState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEventCurrentStateToString(EDataType eDataType, Object instanceValue) {
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
	public V3CodeSystemRoleLinkType createV3CodeSystemRoleLinkTypeFromString(EDataType eDataType, String initialValue) {
		V3CodeSystemRoleLinkType result = V3CodeSystemRoleLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV3CodeSystemRoleLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRoleFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRole result = ProvenanceEntityRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOutcomeCodes createProcessOutcomeCodesFromString(EDataType eDataType, String initialValue) {
		ProcessOutcomeCodes result = ProcessOutcomeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessOutcomeCodesToString(EDataType eDataType, Object instanceValue) {
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
	public ListStatus createListStatusFromString(EDataType eDataType, String initialValue) {
		ListStatus result = ListStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusToString(EDataType eDataType, Object instanceValue) {
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
	public GuidanceResponseStatus createGuidanceResponseStatusFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatus result = GuidanceResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseActionType createGuidanceResponseActionTypeFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseActionType result = GuidanceResponseActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseActionTypeToString(EDataType eDataType, Object instanceValue) {
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
	public DetectedIssueSeverity createDetectedIssueSeverityFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverity result = DetectedIssueSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityToString(EDataType eDataType, Object instanceValue) {
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
	public AccountStatus createAccountStatusFromString(EDataType eDataType, String initialValue) {
		AccountStatus result = AccountStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusToString(EDataType eDataType, Object instanceValue) {
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
	public ParticipantStatus createParticipantStatusFromString(EDataType eDataType, String initialValue) {
		ParticipantStatus result = ParticipantStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantStatusToString(EDataType eDataType, Object instanceValue) {
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
	public AuditEventAction createAuditEventActionFromString(EDataType eDataType, String initialValue) {
		AuditEventAction result = AuditEventAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcomeFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcome result = AuditEventOutcome.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditActiveParticipantRoleIdCode createAuditActiveParticipantRoleIdCodeFromString(EDataType eDataType, String initialValue) {
		AuditActiveParticipantRoleIdCode result = AuditActiveParticipantRoleIdCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditActiveParticipantRoleIdCodeToString(EDataType eDataType, Object instanceValue) {
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
	public AuditEventParticipantNetworkType createAuditEventParticipantNetworkTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventParticipantNetworkType result = AuditEventParticipantNetworkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventParticipantNetworkTypeToString(EDataType eDataType, Object instanceValue) {
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
	public AuditEventObjectType createAuditEventObjectTypeFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectType result = AuditEventObjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectRole createAuditEventObjectRoleFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectRole result = AuditEventObjectRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectLifecycle createAuditEventObjectLifecycleFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectLifecycle result = AuditEventObjectLifecycle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectLifecycleToString(EDataType eDataType, Object instanceValue) {
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
	public OrderStatus createOrderStatusFromString(EDataType eDataType, String initialValue) {
		OrderStatus result = OrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatus createSupplyDeliveryStatusFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatus result = SupplyDeliveryStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyItemType createSupplyItemTypeFromString(EDataType eDataType, String initialValue) {
		SupplyItemType result = SupplyItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValuesetPackage getFhirValuesetPackage() {
		return (FhirValuesetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirValuesetPackage getPackage() {
		return FhirValuesetPackage.eINSTANCE;
	}

} //FhirValuesetFactoryImpl
