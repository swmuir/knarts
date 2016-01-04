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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.fhir.core.resource.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirResourceFactoryImpl extends EFactoryImpl implements FhirResourceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirResourceFactory init() {
		try {
			FhirResourceFactory theFhirResourceFactory = (FhirResourceFactory)EPackage.Registry.INSTANCE.getEFactory(FhirResourcePackage.eNS_URI);
			if (theFhirResourceFactory != null) {
				return theFhirResourceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirResourceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirResourceFactoryImpl() {
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
			case FhirResourcePackage.PRACTITIONER: return createPractitioner();
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE: return createPractitionerPractitionerRole();
			case FhirResourcePackage.LOCATION: return createLocation();
			case FhirResourcePackage.LOCATION_POSITION: return createLocationPosition();
			case FhirResourcePackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirResourcePackage.HEALTHCARE_SERVICE_SERVICE_TYPE: return createHealthcareServiceServiceType();
			case FhirResourcePackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case FhirResourcePackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case FhirResourcePackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirResourcePackage.PATIENT: return createPatient();
			case FhirResourcePackage.PATIENT_CONTACT: return createPatientContact();
			case FhirResourcePackage.PATIENT_ANIMAL: return createPatientAnimal();
			case FhirResourcePackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirResourcePackage.PATIENT_LINK: return createPatientLink();
			case FhirResourcePackage.RELATED_PERSON: return createRelatedPerson();
			case FhirResourcePackage.DEVICE: return createDevice();
			case FhirResourcePackage.LIBRARY: return createLibrary();
			case FhirResourcePackage.MODULE_METADATA: return createModuleMetadata();
			case FhirResourcePackage.MODULE_METADATA_COVERAGE: return createModuleMetadataCoverage();
			case FhirResourcePackage.MODULE_METADATA_CONTRIBUTOR: return createModuleMetadataContributor();
			case FhirResourcePackage.MODULE_METADATA_RELATED_RESOURCE: return createModuleMetadataRelatedResource();
			case FhirResourcePackage.MODULE_DEFINITION: return createModuleDefinition();
			case FhirResourcePackage.MODULE_DEFINITION_MODEL: return createModuleDefinitionModel();
			case FhirResourcePackage.MODULE_DEFINITION_LIBRARY: return createModuleDefinitionLibrary();
			case FhirResourcePackage.MODULE_DEFINITION_CODE_SYSTEM: return createModuleDefinitionCodeSystem();
			case FhirResourcePackage.MODULE_DEFINITION_VALUE_SET: return createModuleDefinitionValueSet();
			case FhirResourcePackage.MODULE_DEFINITION_PARAMETER: return createModuleDefinitionParameter();
			case FhirResourcePackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirResourcePackage.STRUCTURE_DEFINITION_CONTACT: return createStructureDefinitionContact();
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirResourcePackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirResourcePackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirResourcePackage.MODULE_DEFINITION_DATA: return createModuleDefinitionData();
			case FhirResourcePackage.MODULE_DEFINITION_DATA_CODE_FILTER: return createModuleDefinitionDataCodeFilter();
			case FhirResourcePackage.MODULE_DEFINITION_DATA_DATE_FILTER: return createModuleDefinitionDataDateFilter();
			case FhirResourcePackage.PERSON: return createPerson();
			case FhirResourcePackage.PERSON_LINK: return createPersonLink();
			case FhirResourcePackage.VALUE_SET: return createValueSet();
			case FhirResourcePackage.VALUE_SET_CONTACT: return createValueSetContact();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM: return createValueSetCodeSystem();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION: return createValueSetCodeSystemConceptDefinition();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: return createValueSetCodeSystemConceptDefinitionDesignation();
			case FhirResourcePackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET: return createValueSetComposeConceptSet();
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: return createValueSetComposeConceptSetConceptReference();
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: return createValueSetComposeConceptSetFilter();
			case FhirResourcePackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirResourcePackage.VALUE_SET_EXPANSION_PARAMETER: return createValueSetExpansionParameter();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS: return createValueSetExpansionContains();
			case FhirResourcePackage.COMMUNICATION: return createCommunication();
			case FhirResourcePackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirResourcePackage.ENCOUNTER: return createEncounter();
			case FhirResourcePackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case FhirResourcePackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirResourcePackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirResourcePackage.CONDITION: return createCondition();
			case FhirResourcePackage.CONDITION_STAGE: return createConditionStage();
			case FhirResourcePackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case FhirResourcePackage.REFERRAL_REQUEST: return createReferralRequest();
			case FhirResourcePackage.EPISODE_OF_CARE_CARE_TEAM: return createEpisodeOfCareCareTeam();
			case FhirResourcePackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirResourcePackage.APPOINTMENT: return createAppointment();
			case FhirResourcePackage.SLOT: return createSlot();
			case FhirResourcePackage.SCHEDULE: return createSchedule();
			case FhirResourcePackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case FhirResourcePackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirResourcePackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirResourcePackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirResourcePackage.GROUP: return createGroup();
			case FhirResourcePackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirResourcePackage.GROUP_MEMBER: return createGroupMember();
			case FhirResourcePackage.MEDICATION: return createMedication();
			case FhirResourcePackage.MEDICATION_PRODUCT: return createMedicationProduct();
			case FhirResourcePackage.MEDICATION_PRODUCT_INGREDIENT: return createMedicationProductIngredient();
			case FhirResourcePackage.MEDICATION_PRODUCT_BATCH: return createMedicationProductBatch();
			case FhirResourcePackage.MEDICATION_PACKAGE: return createMedicationPackage();
			case FhirResourcePackage.MEDICATION_PACKAGE_CONTENT: return createMedicationPackageContent();
			case FhirResourcePackage.SUBSTANCE: return createSubstance();
			case FhirResourcePackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case FhirResourcePackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirResourcePackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirResourcePackage.CLINICAL_IMPRESSION_INVESTIGATIONS: return createClinicalImpressionInvestigations();
			case FhirResourcePackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirResourcePackage.CLINICAL_IMPRESSION_RULED_OUT: return createClinicalImpressionRuledOut();
			case FhirResourcePackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirResourcePackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case FhirResourcePackage.OBSERVATION: return createObservation();
			case FhirResourcePackage.SPECIMEN: return createSpecimen();
			case FhirResourcePackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirResourcePackage.SPECIMEN_TREATMENT: return createSpecimenTreatment();
			case FhirResourcePackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirResourcePackage.OBSERVATION_RELATED: return createObservationRelated();
			case FhirResourcePackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case FhirResourcePackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirResourcePackage.DEVICE_COMPONENT: return createDeviceComponent();
			case FhirResourcePackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: return createDeviceComponentProductionSpecification();
			case FhirResourcePackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case FhirResourcePackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirResourcePackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: return createQuestionnaireResponseItemAnswer();
			case FhirResourcePackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirResourcePackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirResourcePackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirResourcePackage.DIAGNOSTIC_REPORT_IMAGE: return createDiagnosticReportImage();
			case FhirResourcePackage.MEDIA: return createMedia();
			case FhirResourcePackage.DIAGNOSTIC_ORDER: return createDiagnosticOrder();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_EVENT: return createDiagnosticOrderEvent();
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM: return createDiagnosticOrderItem();
			case FhirResourcePackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirResourcePackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT_RELATED: return createDocumentReferenceContextRelated();
			case FhirResourcePackage.PROCEDURE_REQUEST: return createProcedureRequest();
			case FhirResourcePackage.IMAGING_STUDY: return createImagingStudy();
			case FhirResourcePackage.PROCEDURE: return createProcedure();
			case FhirResourcePackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case FhirResourcePackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE: return createImagingStudySeriesInstance();
			case FhirResourcePackage.CARE_PLAN: return createCarePlan();
			case FhirResourcePackage.CARE_PLAN_RELATED_PLAN: return createCarePlanRelatedPlan();
			case FhirResourcePackage.CARE_PLAN_PARTICIPANT: return createCarePlanParticipant();
			case FhirResourcePackage.GOAL: return createGoal();
			case FhirResourcePackage.GOAL_OUTCOME: return createGoalOutcome();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY_DETAIL: return createCarePlanActivityDetail();
			case FhirResourcePackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE: return createMedicationStatementDosage();
			case FhirResourcePackage.BODY_SITE: return createBodySite();
			case FhirResourcePackage.NUTRITION_ORDER: return createNutritionOrder();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_NUTRIENT: return createNutritionOrderOralDietNutrient();
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE: return createNutritionOrderOralDietTexture();
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION: return createNutritionOrderEnteralFormulaAdministration();
			case FhirResourcePackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirResourcePackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirResourcePackage.DEVICE_USE_REQUEST: return createDeviceUseRequest();
			case FhirResourcePackage.MEDICATION_ORDER: return createMedicationOrder();
			case FhirResourcePackage.MEDICATION_ORDER_DOSAGE_INSTRUCTION: return createMedicationOrderDosageInstruction();
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST: return createMedicationOrderDispenseRequest();
			case FhirResourcePackage.MEDICATION_ORDER_SUBSTITUTION: return createMedicationOrderSubstitution();
			case FhirResourcePackage.ORDER: return createOrder();
			case FhirResourcePackage.ORDER_WHEN: return createOrderWhen();
			case FhirResourcePackage.PROCESS_REQUEST: return createProcessRequest();
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS: return createProcessRequestItems();
			case FhirResourcePackage.SUPPLY_REQUEST: return createSupplyRequest();
			case FhirResourcePackage.SUPPLY_REQUEST_WHEN: return createSupplyRequestWhen();
			case FhirResourcePackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE: return createVisionPrescriptionDispense();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION: return createImagingObjectSelection();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY: return createImagingObjectSelectionStudy();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES: return createImagingObjectSelectionStudySeries();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE: return createImagingObjectSelectionStudySeriesInstance();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES: return createImagingObjectSelectionStudySeriesInstanceFrames();
			case FhirResourcePackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirResourcePackage.NAMING_SYSTEM_CONTACT: return createNamingSystemContact();
			case FhirResourcePackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE: return createDecisionSupportServiceModule();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER: return createDecisionSupportServiceModuleParameter();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER_CODE_FILTER: return createDecisionSupportServiceModuleParameterCodeFilter();
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER_DATE_FILTER: return createDecisionSupportServiceModuleParameterDateFilter();
			case FhirResourcePackage.CONCEPT_MAP: return createConceptMap();
			case FhirResourcePackage.CONCEPT_MAP_CONTACT: return createConceptMapContact();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT: return createConceptMapSourceElement();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT: return createConceptMapSourceElementTargetElement();
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: return createConceptMapSourceElementTargetElementOtherElement();
			case FhirResourcePackage.FLAG: return createFlag();
			case FhirResourcePackage.SEQUENCE: return createSequence();
			case FhirResourcePackage.SEQUENCE_COORDINATE: return createSequenceCoordinate();
			case FhirResourcePackage.SEQUENCE_QUALITY: return createSequenceQuality();
			case FhirResourcePackage.SEQUENCE_CHIP: return createSequenceChip();
			case FhirResourcePackage.SEQUENCE_REPOSITORY: return createSequenceRepository();
			case FhirResourcePackage.CONTRACT: return createContract();
			case FhirResourcePackage.CONTRACT_ACTOR: return createContractActor();
			case FhirResourcePackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirResourcePackage.CONTRACT_SIGNATORY: return createContractSignatory();
			case FhirResourcePackage.CONTRACT_TERM: return createContractTerm();
			case FhirResourcePackage.CONTRACT_TERM_TERM_ACTOR: return createContractTermTermActor();
			case FhirResourcePackage.CONTRACT_TERM_TERM_VALUED_ITEM: return createContractTermTermValuedItem();
			case FhirResourcePackage.CONTRACT_FRIENDLY_LANGUAGE: return createContractFriendlyLanguage();
			case FhirResourcePackage.CONTRACT_LEGAL_LANGUAGE: return createContractLegalLanguage();
			case FhirResourcePackage.CONTRACT_COMPUTABLE_LANGUAGE: return createContractComputableLanguage();
			case FhirResourcePackage.COMPOSITION: return createComposition();
			case FhirResourcePackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirResourcePackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirResourcePackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirResourcePackage.BINARY: return createBinary();
			case FhirResourcePackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case FhirResourcePackage.DOCUMENT_MANIFEST_CONTENT: return createDocumentManifestContent();
			case FhirResourcePackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case FhirResourcePackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS: return createPaymentReconciliationDetails();
			case FhirResourcePackage.PAYMENT_RECONCILIATION_NOTES: return createPaymentReconciliationNotes();
			case FhirResourcePackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case FhirResourcePackage.TEST_SCRIPT: return createTestScript();
			case FhirResourcePackage.TEST_SCRIPT_CONTACT: return createTestScriptContact();
			case FhirResourcePackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_LINK: return createTestScriptMetadataLink();
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY: return createTestScriptMetadataCapability();
			case FhirResourcePackage.CONFORMANCE: return createConformance();
			case FhirResourcePackage.CONFORMANCE_CONTACT: return createConformanceContact();
			case FhirResourcePackage.CONFORMANCE_SOFTWARE: return createConformanceSoftware();
			case FhirResourcePackage.CONFORMANCE_IMPLEMENTATION: return createConformanceImplementation();
			case FhirResourcePackage.CONFORMANCE_REST: return createConformanceRest();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY: return createConformanceRestSecurity();
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY_CERTIFICATE: return createConformanceRestSecurityCertificate();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE: return createConformanceRestResource();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_RESOURCE_INTERACTION: return createConformanceRestResourceResourceInteraction();
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM: return createConformanceRestResourceSearchParam();
			case FhirResourcePackage.CONFORMANCE_REST_SYSTEM_INTERACTION: return createConformanceRestSystemInteraction();
			case FhirResourcePackage.CONFORMANCE_REST_OPERATION: return createConformanceRestOperation();
			case FhirResourcePackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirResourcePackage.OPERATION_DEFINITION_CONTACT: return createOperationDefinitionContact();
			case FhirResourcePackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirResourcePackage.OPERATION_DEFINITION_PARAMETER_BINDING: return createOperationDefinitionParameterBinding();
			case FhirResourcePackage.CONFORMANCE_MESSAGING: return createConformanceMessaging();
			case FhirResourcePackage.CONFORMANCE_MESSAGING_ENDPOINT: return createConformanceMessagingEndpoint();
			case FhirResourcePackage.CONFORMANCE_MESSAGING_EVENT: return createConformanceMessagingEvent();
			case FhirResourcePackage.CONFORMANCE_DOCUMENT: return createConformanceDocument();
			case FhirResourcePackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case FhirResourcePackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case FhirResourcePackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case FhirResourcePackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION: return createTestScriptSetupSetupAction();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: return createTestScriptSetupSetupActionOperation();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: return createTestScriptSetupSetupActionOperationRequestHeader();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: return createTestScriptSetupSetupActionAssert();
			case FhirResourcePackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case FhirResourcePackage.TEST_SCRIPT_TEST_TEST_ACTION: return createTestScriptTestTestAction();
			case FhirResourcePackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case FhirResourcePackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: return createTestScriptTeardownTeardownAction();
			case FhirResourcePackage.DATA_ELEMENT: return createDataElement();
			case FhirResourcePackage.DATA_ELEMENT_CONTACT: return createDataElementContact();
			case FhirResourcePackage.DATA_ELEMENT_MAPPING: return createDataElementMapping();
			case FhirResourcePackage.DECISION_SUPPORT_RULE: return createDecisionSupportRule();
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER: return createDecisionSupportRuleTrigger();
			case FhirResourcePackage.DECISION_SUPPORT_RULE_ACTION: return createDecisionSupportRuleAction();
			case FhirResourcePackage.DECISION_SUPPORT_RULE_ACTION_CUSTOMIZATION: return createDecisionSupportRuleActionCustomization();
			case FhirResourcePackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirResourcePackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirResourcePackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirResourcePackage.MESSAGE_HEADER_MESSAGE_SOURCE: return createMessageHeaderMessageSource();
			case FhirResourcePackage.MESSAGE_HEADER_MESSAGE_DESTINATION: return createMessageHeaderMessageDestination();
			case FhirResourcePackage.SUBSCRIPTION: return createSubscription();
			case FhirResourcePackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case FhirResourcePackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirResourcePackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirResourcePackage.COVERAGE: return createCoverage();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationRecommendationDateCriterion();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL: return createImmunizationRecommendationRecommendationProtocol();
			case FhirResourcePackage.IMMUNIZATION: return createImmunization();
			case FhirResourcePackage.IMMUNIZATION_EXPLANATION: return createImmunizationExplanation();
			case FhirResourcePackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL: return createImmunizationVaccinationProtocol();
			case FhirResourcePackage.BUNDLE: return createBundle();
			case FhirResourcePackage.BUNDLE_LINK: return createBundleLink();
			case FhirResourcePackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirResourcePackage.BUNDLE_ENTRY_SEARCH: return createBundleEntrySearch();
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST: return createBundleEntryRequest();
			case FhirResourcePackage.BUNDLE_ENTRY_RESPONSE: return createBundleEntryResponse();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE: return createEligibilityResponse();
			case FhirResourcePackage.ELIGIBILITY_REQUEST: return createEligibilityRequest();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS: return createEligibilityResponseBenefits();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS_BENEFIT: return createEligibilityResponseBenefitsBenefit();
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_ERRORS: return createEligibilityResponseErrors();
			case FhirResourcePackage.PARAMETERS: return createParameters();
			case FhirResourcePackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirResourcePackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirResourcePackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION: return createMedicationDispenseDosageInstruction();
			case FhirResourcePackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirResourcePackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirResourcePackage.CLAIM: return createClaim();
			case FhirResourcePackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirResourcePackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirResourcePackage.CLAIM_COVERAGE: return createClaimCoverage();
			case FhirResourcePackage.CLAIM_ITEMS: return createClaimItems();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL: return createClaimItemsDetail();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL_SUB_DETAIL: return createClaimItemsDetailSubDetail();
			case FhirResourcePackage.CLAIM_ITEMS_PROSTHESIS: return createClaimItemsProsthesis();
			case FhirResourcePackage.CLAIM_MISSING_TEETH: return createClaimMissingTeeth();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS: return createClaimResponseItems();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_ADJUDICATION: return createClaimResponseItemsItemAdjudication();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL: return createClaimResponseItemsItemDetail();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_DETAIL_ADJUDICATION: return createClaimResponseItemsItemDetailDetailAdjudication();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL: return createClaimResponseItemsItemDetailSubDetail();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION: return createClaimResponseItemsItemDetailSubDetailSubdetailAdjudication();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM: return createClaimResponseAddedItem();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_ADJUDICATION: return createClaimResponseAddedItemAddedItemAdjudication();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL: return createClaimResponseAddedItemAddedItemsDetail();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL_ADDED_ITEM_DETAIL_ADJUDICATION: return createClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication();
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS: return createClaimResponseErrors();
			case FhirResourcePackage.CLAIM_RESPONSE_NOTES: return createClaimResponseNotes();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE: return createClaimResponseCoverage();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_COVERAGE: return createExplanationOfBenefitCoverage();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS: return createExplanationOfBenefitItems();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_ITEM_ADJUDICATION: return createExplanationOfBenefitItemsItemAdjudication();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL: return createExplanationOfBenefitItemsDetail();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_DETAIL_ADJUDICATION: return createExplanationOfBenefitItemsDetailDetailAdjudication();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_SUB_DETAIL: return createExplanationOfBenefitItemsDetailSubDetail();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_SUB_DETAIL_SUB_DETAIL_ADJUDICATION: return createExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS: return createExplanationOfBenefitItemsProsthesis();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: return createExplanationOfBenefitAddedItem();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_ADJUDICATION: return createExplanationOfBenefitAddedItemAddedItemAdjudication();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL: return createExplanationOfBenefitAddedItemAddedItemsDetail();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL_ADDED_ITEM_DETAIL_ADJUDICATION: return createExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH: return createExplanationOfBenefitMissingTeeth();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_NOTES: return createExplanationOfBenefitNotes();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: return createExplanationOfBenefitBenefitBalanceBenefit();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_CONTACT: return createImplementationGuideContact();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_DEPENDENCY: return createImplementationGuideDependency();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE: return createImplementationGuidePackage();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE: return createImplementationGuidePackageResource();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case FhirResourcePackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirResourcePackage.SEARCH_PARAMETER_CONTACT: return createSearchParameterContact();
			case FhirResourcePackage.EXPANSION_PROFILE: return createExpansionProfile();
			case FhirResourcePackage.EXPANSION_PROFILE_CONTACT: return createExpansionProfileContact();
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM: return createExpansionProfileCodeSystem();
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE: return createExpansionProfileCodeSystemCodeSystemInclude();
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE_CODE_SYSTEM_INCLUDE_CODE_SYSTEM: return createExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem();
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_EXCLUDE: return createExpansionProfileCodeSystemCodeSystemExclude();
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_EXCLUDE_CODE_SYSTEM_EXCLUDE_CODE_SYSTEM: return createExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION: return createExpansionProfileDesignation();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE: return createExpansionProfileDesignationDesignationInclude();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE_DESIGNATION_INCLUDE_DESIGNATION: return createExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE: return createExpansionProfileDesignationDesignationExclude();
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION: return createExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation();
			case FhirResourcePackage.ORDER_SET: return createOrderSet();
			case FhirResourcePackage.ORDER_SET_ITEM: return createOrderSetItem();
			case FhirResourcePackage.ORDER_SET_ITEM_CUSTOMIZATION: return createOrderSetItemCustomization();
			case FhirResourcePackage.PROVENANCE: return createProvenance();
			case FhirResourcePackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirResourcePackage.PROVENANCE_AGENT_RELATED_AGENT: return createProvenanceAgentRelatedAgent();
			case FhirResourcePackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirResourcePackage.PROCESS_RESPONSE: return createProcessResponse();
			case FhirResourcePackage.PROCESS_RESPONSE_NOTES: return createProcessResponseNotes();
			case FhirResourcePackage.MEASURE: return createMeasure();
			case FhirResourcePackage.MEASURE_POPULATION: return createMeasurePopulation();
			case FhirResourcePackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirResourcePackage.LIST: return createList();
			case FhirResourcePackage.LIST_ENTRY: return createListEntry();
			case FhirResourcePackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION: return createGuidanceResponseAction();
			case FhirResourcePackage.DETECTED_ISSUE: return createDetectedIssue();
			case FhirResourcePackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case FhirResourcePackage.ACCOUNT: return createAccount();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirResourcePackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirResourcePackage.AUDIT_EVENT: return createAuditEvent();
			case FhirResourcePackage.AUDIT_EVENT_EVENT: return createAuditEventEvent();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT: return createAuditEventParticipant();
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT_NETWORK: return createAuditEventParticipantNetwork();
			case FhirResourcePackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT: return createAuditEventObject();
			case FhirResourcePackage.AUDIT_EVENT_OBJECT_DETAIL: return createAuditEventObjectDetail();
			case FhirResourcePackage.BASIC: return createBasic();
			case FhirResourcePackage.ORDER_RESPONSE: return createOrderResponse();
			case FhirResourcePackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case FhirResourcePackage.ORGANIZATION: return createOrganization();
			case FhirResourcePackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerPractitionerRole createPractitionerPractitionerRole() {
		PractitionerPractitionerRoleImpl practitionerPractitionerRole = new PractitionerPractitionerRoleImpl();
		return practitionerPractitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceServiceType createHealthcareServiceServiceType() {
		HealthcareServiceServiceTypeImpl healthcareServiceServiceType = new HealthcareServiceServiceTypeImpl();
		return healthcareServiceServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal createPatientAnimal() {
		PatientAnimalImpl patientAnimal = new PatientAnimalImpl();
		return patientAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata createModuleMetadata() {
		ModuleMetadataImpl moduleMetadata = new ModuleMetadataImpl();
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataCoverage createModuleMetadataCoverage() {
		ModuleMetadataCoverageImpl moduleMetadataCoverage = new ModuleMetadataCoverageImpl();
		return moduleMetadataCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataContributor createModuleMetadataContributor() {
		ModuleMetadataContributorImpl moduleMetadataContributor = new ModuleMetadataContributorImpl();
		return moduleMetadataContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadataRelatedResource createModuleMetadataRelatedResource() {
		ModuleMetadataRelatedResourceImpl moduleMetadataRelatedResource = new ModuleMetadataRelatedResourceImpl();
		return moduleMetadataRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition createModuleDefinition() {
		ModuleDefinitionImpl moduleDefinition = new ModuleDefinitionImpl();
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionModel createModuleDefinitionModel() {
		ModuleDefinitionModelImpl moduleDefinitionModel = new ModuleDefinitionModelImpl();
		return moduleDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionLibrary createModuleDefinitionLibrary() {
		ModuleDefinitionLibraryImpl moduleDefinitionLibrary = new ModuleDefinitionLibraryImpl();
		return moduleDefinitionLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionCodeSystem createModuleDefinitionCodeSystem() {
		ModuleDefinitionCodeSystemImpl moduleDefinitionCodeSystem = new ModuleDefinitionCodeSystemImpl();
		return moduleDefinitionCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionValueSet createModuleDefinitionValueSet() {
		ModuleDefinitionValueSetImpl moduleDefinitionValueSet = new ModuleDefinitionValueSetImpl();
		return moduleDefinitionValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionParameter createModuleDefinitionParameter() {
		ModuleDefinitionParameterImpl moduleDefinitionParameter = new ModuleDefinitionParameterImpl();
		return moduleDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionContact createStructureDefinitionContact() {
		StructureDefinitionContactImpl structureDefinitionContact = new StructureDefinitionContactImpl();
		return structureDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionData createModuleDefinitionData() {
		ModuleDefinitionDataImpl moduleDefinitionData = new ModuleDefinitionDataImpl();
		return moduleDefinitionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionDataCodeFilter createModuleDefinitionDataCodeFilter() {
		ModuleDefinitionDataCodeFilterImpl moduleDefinitionDataCodeFilter = new ModuleDefinitionDataCodeFilterImpl();
		return moduleDefinitionDataCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinitionDataDateFilter createModuleDefinitionDataDateFilter() {
		ModuleDefinitionDataDateFilterImpl moduleDefinitionDataDateFilter = new ModuleDefinitionDataDateFilterImpl();
		return moduleDefinitionDataDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContact createValueSetContact() {
		ValueSetContactImpl valueSetContact = new ValueSetContactImpl();
		return valueSetContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCodeSystem createValueSetCodeSystem() {
		ValueSetCodeSystemImpl valueSetCodeSystem = new ValueSetCodeSystemImpl();
		return valueSetCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCodeSystemConceptDefinition createValueSetCodeSystemConceptDefinition() {
		ValueSetCodeSystemConceptDefinitionImpl valueSetCodeSystemConceptDefinition = new ValueSetCodeSystemConceptDefinitionImpl();
		return valueSetCodeSystemConceptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCodeSystemConceptDefinitionDesignation createValueSetCodeSystemConceptDefinitionDesignation() {
		ValueSetCodeSystemConceptDefinitionDesignationImpl valueSetCodeSystemConceptDefinitionDesignation = new ValueSetCodeSystemConceptDefinitionDesignationImpl();
		return valueSetCodeSystemConceptDefinitionDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSet createValueSetComposeConceptSet() {
		ValueSetComposeConceptSetImpl valueSetComposeConceptSet = new ValueSetComposeConceptSetImpl();
		return valueSetComposeConceptSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSetConceptReference createValueSetComposeConceptSetConceptReference() {
		ValueSetComposeConceptSetConceptReferenceImpl valueSetComposeConceptSetConceptReference = new ValueSetComposeConceptSetConceptReferenceImpl();
		return valueSetComposeConceptSetConceptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetComposeConceptSetFilter createValueSetComposeConceptSetFilter() {
		ValueSetComposeConceptSetFilterImpl valueSetComposeConceptSetFilter = new ValueSetComposeConceptSetFilterImpl();
		return valueSetComposeConceptSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansionParameter createValueSetExpansionParameter() {
		ValueSetExpansionParameterImpl valueSetExpansionParameter = new ValueSetExpansionParameterImpl();
		return valueSetExpansionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansionContains createValueSetExpansionContains() {
		ValueSetExpansionContainsImpl valueSetExpansionContains = new ValueSetExpansionContainsImpl();
		return valueSetExpansionContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest createReferralRequest() {
		ReferralRequestImpl referralRequest = new ReferralRequestImpl();
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareCareTeam createEpisodeOfCareCareTeam() {
		EpisodeOfCareCareTeamImpl episodeOfCareCareTeam = new EpisodeOfCareCareTeamImpl();
		return episodeOfCareCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct createMedicationProduct() {
		MedicationProductImpl medicationProduct = new MedicationProductImpl();
		return medicationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProductIngredient createMedicationProductIngredient() {
		MedicationProductIngredientImpl medicationProductIngredient = new MedicationProductIngredientImpl();
		return medicationProductIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProductBatch createMedicationProductBatch() {
		MedicationProductBatchImpl medicationProductBatch = new MedicationProductBatchImpl();
		return medicationProductBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage createMedicationPackage() {
		MedicationPackageImpl medicationPackage = new MedicationPackageImpl();
		return medicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackageContent createMedicationPackageContent() {
		MedicationPackageContentImpl medicationPackageContent = new MedicationPackageContentImpl();
		return medicationPackageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionInvestigations createClinicalImpressionInvestigations() {
		ClinicalImpressionInvestigationsImpl clinicalImpressionInvestigations = new ClinicalImpressionInvestigationsImpl();
		return clinicalImpressionInvestigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionRuledOut createClinicalImpressionRuledOut() {
		ClinicalImpressionRuledOutImpl clinicalImpressionRuledOut = new ClinicalImpressionRuledOutImpl();
		return clinicalImpressionRuledOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatment createSpecimenTreatment() {
		SpecimenTreatmentImpl specimenTreatment = new SpecimenTreatmentImpl();
		return specimenTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelated createObservationRelated() {
		ObservationRelatedImpl observationRelated = new ObservationRelatedImpl();
		return observationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponentProductionSpecification createDeviceComponentProductionSpecification() {
		DeviceComponentProductionSpecificationImpl deviceComponentProductionSpecification = new DeviceComponentProductionSpecificationImpl();
		return deviceComponentProductionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItemAnswer createQuestionnaireResponseItemAnswer() {
		QuestionnaireResponseItemAnswerImpl questionnaireResponseItemAnswer = new QuestionnaireResponseItemAnswerImpl();
		return questionnaireResponseItemAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportImage createDiagnosticReportImage() {
		DiagnosticReportImageImpl diagnosticReportImage = new DiagnosticReportImageImpl();
		return diagnosticReportImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrder createDiagnosticOrder() {
		DiagnosticOrderImpl diagnosticOrder = new DiagnosticOrderImpl();
		return diagnosticOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderEvent createDiagnosticOrderEvent() {
		DiagnosticOrderEventImpl diagnosticOrderEvent = new DiagnosticOrderEventImpl();
		return diagnosticOrderEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderItem createDiagnosticOrderItem() {
		DiagnosticOrderItemImpl diagnosticOrderItem = new DiagnosticOrderItemImpl();
		return diagnosticOrderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContextRelated createDocumentReferenceContextRelated() {
		DocumentReferenceContextRelatedImpl documentReferenceContextRelated = new DocumentReferenceContextRelatedImpl();
		return documentReferenceContextRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest createProcedureRequest() {
		ProcedureRequestImpl procedureRequest = new ProcedureRequestImpl();
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeriesInstance createImagingStudySeriesInstance() {
		ImagingStudySeriesInstanceImpl imagingStudySeriesInstance = new ImagingStudySeriesInstanceImpl();
		return imagingStudySeriesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanRelatedPlan createCarePlanRelatedPlan() {
		CarePlanRelatedPlanImpl carePlanRelatedPlan = new CarePlanRelatedPlanImpl();
		return carePlanRelatedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanParticipant createCarePlanParticipant() {
		CarePlanParticipantImpl carePlanParticipant = new CarePlanParticipantImpl();
		return carePlanParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOutcome createGoalOutcome() {
		GoalOutcomeImpl goalOutcome = new GoalOutcomeImpl();
		return goalOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityDetail createCarePlanActivityDetail() {
		CarePlanActivityDetailImpl carePlanActivityDetail = new CarePlanActivityDetailImpl();
		return carePlanActivityDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementDosage createMedicationStatementDosage() {
		MedicationStatementDosageImpl medicationStatementDosage = new MedicationStatementDosageImpl();
		return medicationStatementDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite createBodySite() {
		BodySiteImpl bodySite = new BodySiteImpl();
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDietNutrient createNutritionOrderOralDietNutrient() {
		NutritionOrderOralDietNutrientImpl nutritionOrderOralDietNutrient = new NutritionOrderOralDietNutrientImpl();
		return nutritionOrderOralDietNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDietTexture createNutritionOrderOralDietTexture() {
		NutritionOrderOralDietTextureImpl nutritionOrderOralDietTexture = new NutritionOrderOralDietTextureImpl();
		return nutritionOrderOralDietTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormulaAdministration createNutritionOrderEnteralFormulaAdministration() {
		NutritionOrderEnteralFormulaAdministrationImpl nutritionOrderEnteralFormulaAdministration = new NutritionOrderEnteralFormulaAdministrationImpl();
		return nutritionOrderEnteralFormulaAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest createDeviceUseRequest() {
		DeviceUseRequestImpl deviceUseRequest = new DeviceUseRequestImpl();
		return deviceUseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder createMedicationOrder() {
		MedicationOrderImpl medicationOrder = new MedicationOrderImpl();
		return medicationOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDosageInstruction createMedicationOrderDosageInstruction() {
		MedicationOrderDosageInstructionImpl medicationOrderDosageInstruction = new MedicationOrderDosageInstructionImpl();
		return medicationOrderDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderDispenseRequest createMedicationOrderDispenseRequest() {
		MedicationOrderDispenseRequestImpl medicationOrderDispenseRequest = new MedicationOrderDispenseRequestImpl();
		return medicationOrderDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderSubstitution createMedicationOrderSubstitution() {
		MedicationOrderSubstitutionImpl medicationOrderSubstitution = new MedicationOrderSubstitutionImpl();
		return medicationOrderSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderWhen createOrderWhen() {
		OrderWhenImpl orderWhen = new OrderWhenImpl();
		return orderWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestItems createProcessRequestItems() {
		ProcessRequestItemsImpl processRequestItems = new ProcessRequestItemsImpl();
		return processRequestItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestWhen createSupplyRequestWhen() {
		SupplyRequestWhenImpl supplyRequestWhen = new SupplyRequestWhenImpl();
		return supplyRequestWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionDispense createVisionPrescriptionDispense() {
		VisionPrescriptionDispenseImpl visionPrescriptionDispense = new VisionPrescriptionDispenseImpl();
		return visionPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelection createImagingObjectSelection() {
		ImagingObjectSelectionImpl imagingObjectSelection = new ImagingObjectSelectionImpl();
		return imagingObjectSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionStudy createImagingObjectSelectionStudy() {
		ImagingObjectSelectionStudyImpl imagingObjectSelectionStudy = new ImagingObjectSelectionStudyImpl();
		return imagingObjectSelectionStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionStudySeries createImagingObjectSelectionStudySeries() {
		ImagingObjectSelectionStudySeriesImpl imagingObjectSelectionStudySeries = new ImagingObjectSelectionStudySeriesImpl();
		return imagingObjectSelectionStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionStudySeriesInstance createImagingObjectSelectionStudySeriesInstance() {
		ImagingObjectSelectionStudySeriesInstanceImpl imagingObjectSelectionStudySeriesInstance = new ImagingObjectSelectionStudySeriesInstanceImpl();
		return imagingObjectSelectionStudySeriesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionStudySeriesInstanceFrames createImagingObjectSelectionStudySeriesInstanceFrames() {
		ImagingObjectSelectionStudySeriesInstanceFramesImpl imagingObjectSelectionStudySeriesInstanceFrames = new ImagingObjectSelectionStudySeriesInstanceFramesImpl();
		return imagingObjectSelectionStudySeriesInstanceFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemContact createNamingSystemContact() {
		NamingSystemContactImpl namingSystemContact = new NamingSystemContactImpl();
		return namingSystemContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportServiceModule createDecisionSupportServiceModule() {
		DecisionSupportServiceModuleImpl decisionSupportServiceModule = new DecisionSupportServiceModuleImpl();
		return decisionSupportServiceModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportServiceModuleParameter createDecisionSupportServiceModuleParameter() {
		DecisionSupportServiceModuleParameterImpl decisionSupportServiceModuleParameter = new DecisionSupportServiceModuleParameterImpl();
		return decisionSupportServiceModuleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportServiceModuleParameterCodeFilter createDecisionSupportServiceModuleParameterCodeFilter() {
		DecisionSupportServiceModuleParameterCodeFilterImpl decisionSupportServiceModuleParameterCodeFilter = new DecisionSupportServiceModuleParameterCodeFilterImpl();
		return decisionSupportServiceModuleParameterCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportServiceModuleParameterDateFilter createDecisionSupportServiceModuleParameterDateFilter() {
		DecisionSupportServiceModuleParameterDateFilterImpl decisionSupportServiceModuleParameterDateFilter = new DecisionSupportServiceModuleParameterDateFilterImpl();
		return decisionSupportServiceModuleParameterDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapContact createConceptMapContact() {
		ConceptMapContactImpl conceptMapContact = new ConceptMapContactImpl();
		return conceptMapContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapSourceElement createConceptMapSourceElement() {
		ConceptMapSourceElementImpl conceptMapSourceElement = new ConceptMapSourceElementImpl();
		return conceptMapSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapSourceElementTargetElement createConceptMapSourceElementTargetElement() {
		ConceptMapSourceElementTargetElementImpl conceptMapSourceElementTargetElement = new ConceptMapSourceElementTargetElementImpl();
		return conceptMapSourceElementTargetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapSourceElementTargetElementOtherElement createConceptMapSourceElementTargetElementOtherElement() {
		ConceptMapSourceElementTargetElementOtherElementImpl conceptMapSourceElementTargetElementOtherElement = new ConceptMapSourceElementTargetElementOtherElementImpl();
		return conceptMapSourceElementTargetElementOtherElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceCoordinate createSequenceCoordinate() {
		SequenceCoordinateImpl sequenceCoordinate = new SequenceCoordinateImpl();
		return sequenceCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceQuality createSequenceQuality() {
		SequenceQualityImpl sequenceQuality = new SequenceQualityImpl();
		return sequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceChip createSequenceChip() {
		SequenceChipImpl sequenceChip = new SequenceChipImpl();
		return sequenceChip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRepository createSequenceRepository() {
		SequenceRepositoryImpl sequenceRepository = new SequenceRepositoryImpl();
		return sequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActor createContractActor() {
		ContractActorImpl contractActor = new ContractActorImpl();
		return contractActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSignatory createContractSignatory() {
		ContractSignatoryImpl contractSignatory = new ContractSignatoryImpl();
		return contractSignatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTermActor createContractTermTermActor() {
		ContractTermTermActorImpl contractTermTermActor = new ContractTermTermActorImpl();
		return contractTermTermActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTermTermValuedItem createContractTermTermValuedItem() {
		ContractTermTermValuedItemImpl contractTermTermValuedItem = new ContractTermTermValuedItemImpl();
		return contractTermTermValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendlyLanguage createContractFriendlyLanguage() {
		ContractFriendlyLanguageImpl contractFriendlyLanguage = new ContractFriendlyLanguageImpl();
		return contractFriendlyLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegalLanguage createContractLegalLanguage() {
		ContractLegalLanguageImpl contractLegalLanguage = new ContractLegalLanguageImpl();
		return contractLegalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractComputableLanguage createContractComputableLanguage() {
		ContractComputableLanguageImpl contractComputableLanguage = new ContractComputableLanguageImpl();
		return contractComputableLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestContent createDocumentManifestContent() {
		DocumentManifestContentImpl documentManifestContent = new DocumentManifestContentImpl();
		return documentManifestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationDetails createPaymentReconciliationDetails() {
		PaymentReconciliationDetailsImpl paymentReconciliationDetails = new PaymentReconciliationDetailsImpl();
		return paymentReconciliationDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationNotes createPaymentReconciliationNotes() {
		PaymentReconciliationNotesImpl paymentReconciliationNotes = new PaymentReconciliationNotesImpl();
		return paymentReconciliationNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptContact createTestScriptContact() {
		TestScriptContactImpl testScriptContact = new TestScriptContactImpl();
		return testScriptContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadataLink createTestScriptMetadataLink() {
		TestScriptMetadataLinkImpl testScriptMetadataLink = new TestScriptMetadataLinkImpl();
		return testScriptMetadataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadataCapability createTestScriptMetadataCapability() {
		TestScriptMetadataCapabilityImpl testScriptMetadataCapability = new TestScriptMetadataCapabilityImpl();
		return testScriptMetadataCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance createConformance() {
		ConformanceImpl conformance = new ConformanceImpl();
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceContact createConformanceContact() {
		ConformanceContactImpl conformanceContact = new ConformanceContactImpl();
		return conformanceContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSoftware createConformanceSoftware() {
		ConformanceSoftwareImpl conformanceSoftware = new ConformanceSoftwareImpl();
		return conformanceSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceImplementation createConformanceImplementation() {
		ConformanceImplementationImpl conformanceImplementation = new ConformanceImplementationImpl();
		return conformanceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRest createConformanceRest() {
		ConformanceRestImpl conformanceRest = new ConformanceRestImpl();
		return conformanceRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestSecurity createConformanceRestSecurity() {
		ConformanceRestSecurityImpl conformanceRestSecurity = new ConformanceRestSecurityImpl();
		return conformanceRestSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestSecurityCertificate createConformanceRestSecurityCertificate() {
		ConformanceRestSecurityCertificateImpl conformanceRestSecurityCertificate = new ConformanceRestSecurityCertificateImpl();
		return conformanceRestSecurityCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestResource createConformanceRestResource() {
		ConformanceRestResourceImpl conformanceRestResource = new ConformanceRestResourceImpl();
		return conformanceRestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestResourceResourceInteraction createConformanceRestResourceResourceInteraction() {
		ConformanceRestResourceResourceInteractionImpl conformanceRestResourceResourceInteraction = new ConformanceRestResourceResourceInteractionImpl();
		return conformanceRestResourceResourceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestResourceSearchParam createConformanceRestResourceSearchParam() {
		ConformanceRestResourceSearchParamImpl conformanceRestResourceSearchParam = new ConformanceRestResourceSearchParamImpl();
		return conformanceRestResourceSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestSystemInteraction createConformanceRestSystemInteraction() {
		ConformanceRestSystemInteractionImpl conformanceRestSystemInteraction = new ConformanceRestSystemInteractionImpl();
		return conformanceRestSystemInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRestOperation createConformanceRestOperation() {
		ConformanceRestOperationImpl conformanceRestOperation = new ConformanceRestOperationImpl();
		return conformanceRestOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionContact createOperationDefinitionContact() {
		OperationDefinitionContactImpl operationDefinitionContact = new OperationDefinitionContactImpl();
		return operationDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameterBinding createOperationDefinitionParameterBinding() {
		OperationDefinitionParameterBindingImpl operationDefinitionParameterBinding = new OperationDefinitionParameterBindingImpl();
		return operationDefinitionParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceMessaging createConformanceMessaging() {
		ConformanceMessagingImpl conformanceMessaging = new ConformanceMessagingImpl();
		return conformanceMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceMessagingEndpoint createConformanceMessagingEndpoint() {
		ConformanceMessagingEndpointImpl conformanceMessagingEndpoint = new ConformanceMessagingEndpointImpl();
		return conformanceMessagingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceMessagingEvent createConformanceMessagingEvent() {
		ConformanceMessagingEventImpl conformanceMessagingEvent = new ConformanceMessagingEventImpl();
		return conformanceMessagingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceDocument createConformanceDocument() {
		ConformanceDocumentImpl conformanceDocument = new ConformanceDocumentImpl();
		return conformanceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupAction createTestScriptSetupSetupAction() {
		TestScriptSetupSetupActionImpl testScriptSetupSetupAction = new TestScriptSetupSetupActionImpl();
		return testScriptSetupSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionOperation createTestScriptSetupSetupActionOperation() {
		TestScriptSetupSetupActionOperationImpl testScriptSetupSetupActionOperation = new TestScriptSetupSetupActionOperationImpl();
		return testScriptSetupSetupActionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionOperationRequestHeader createTestScriptSetupSetupActionOperationRequestHeader() {
		TestScriptSetupSetupActionOperationRequestHeaderImpl testScriptSetupSetupActionOperationRequestHeader = new TestScriptSetupSetupActionOperationRequestHeaderImpl();
		return testScriptSetupSetupActionOperationRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssert createTestScriptSetupSetupActionAssert() {
		TestScriptSetupSetupActionAssertImpl testScriptSetupSetupActionAssert = new TestScriptSetupSetupActionAssertImpl();
		return testScriptSetupSetupActionAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTestTestAction createTestScriptTestTestAction() {
		TestScriptTestTestActionImpl testScriptTestTestAction = new TestScriptTestTestActionImpl();
		return testScriptTestTestAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardownTeardownAction createTestScriptTeardownTeardownAction() {
		TestScriptTeardownTeardownActionImpl testScriptTeardownTeardownAction = new TestScriptTeardownTeardownActionImpl();
		return testScriptTeardownTeardownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementContact createDataElementContact() {
		DataElementContactImpl dataElementContact = new DataElementContactImpl();
		return dataElementContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementMapping createDataElementMapping() {
		DataElementMappingImpl dataElementMapping = new DataElementMappingImpl();
		return dataElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRule createDecisionSupportRule() {
		DecisionSupportRuleImpl decisionSupportRule = new DecisionSupportRuleImpl();
		return decisionSupportRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleTrigger createDecisionSupportRuleTrigger() {
		DecisionSupportRuleTriggerImpl decisionSupportRuleTrigger = new DecisionSupportRuleTriggerImpl();
		return decisionSupportRuleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleAction createDecisionSupportRuleAction() {
		DecisionSupportRuleActionImpl decisionSupportRuleAction = new DecisionSupportRuleActionImpl();
		return decisionSupportRuleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSupportRuleActionCustomization createDecisionSupportRuleActionCustomization() {
		DecisionSupportRuleActionCustomizationImpl decisionSupportRuleActionCustomization = new DecisionSupportRuleActionCustomizationImpl();
		return decisionSupportRuleActionCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderMessageSource createMessageHeaderMessageSource() {
		MessageHeaderMessageSourceImpl messageHeaderMessageSource = new MessageHeaderMessageSourceImpl();
		return messageHeaderMessageSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderMessageDestination createMessageHeaderMessageDestination() {
		MessageHeaderMessageDestinationImpl messageHeaderMessageDestination = new MessageHeaderMessageDestinationImpl();
		return messageHeaderMessageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendationDateCriterion createImmunizationRecommendationRecommendationDateCriterion() {
		ImmunizationRecommendationRecommendationDateCriterionImpl immunizationRecommendationRecommendationDateCriterion = new ImmunizationRecommendationRecommendationDateCriterionImpl();
		return immunizationRecommendationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendationProtocol createImmunizationRecommendationRecommendationProtocol() {
		ImmunizationRecommendationRecommendationProtocolImpl immunizationRecommendationRecommendationProtocol = new ImmunizationRecommendationRecommendationProtocolImpl();
		return immunizationRecommendationRecommendationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation createImmunizationExplanation() {
		ImmunizationExplanationImpl immunizationExplanation = new ImmunizationExplanationImpl();
		return immunizationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol() {
		ImmunizationVaccinationProtocolImpl immunizationVaccinationProtocol = new ImmunizationVaccinationProtocolImpl();
		return immunizationVaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntrySearch createBundleEntrySearch() {
		BundleEntrySearchImpl bundleEntrySearch = new BundleEntrySearchImpl();
		return bundleEntrySearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryRequest createBundleEntryRequest() {
		BundleEntryRequestImpl bundleEntryRequest = new BundleEntryRequestImpl();
		return bundleEntryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntryResponse createBundleEntryResponse() {
		BundleEntryResponseImpl bundleEntryResponse = new BundleEntryResponseImpl();
		return bundleEntryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse createEligibilityResponse() {
		EligibilityResponseImpl eligibilityResponse = new EligibilityResponseImpl();
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest createEligibilityRequest() {
		EligibilityRequestImpl eligibilityRequest = new EligibilityRequestImpl();
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseBenefits createEligibilityResponseBenefits() {
		EligibilityResponseBenefitsImpl eligibilityResponseBenefits = new EligibilityResponseBenefitsImpl();
		return eligibilityResponseBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseBenefitsBenefit createEligibilityResponseBenefitsBenefit() {
		EligibilityResponseBenefitsBenefitImpl eligibilityResponseBenefitsBenefit = new EligibilityResponseBenefitsBenefitImpl();
		return eligibilityResponseBenefitsBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseErrors createEligibilityResponseErrors() {
		EligibilityResponseErrorsImpl eligibilityResponseErrors = new EligibilityResponseErrorsImpl();
		return eligibilityResponseErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseDosageInstruction createMedicationDispenseDosageInstruction() {
		MedicationDispenseDosageInstructionImpl medicationDispenseDosageInstruction = new MedicationDispenseDosageInstructionImpl();
		return medicationDispenseDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCoverage createClaimCoverage() {
		ClaimCoverageImpl claimCoverage = new ClaimCoverageImpl();
		return claimCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItems createClaimItems() {
		ClaimItemsImpl claimItems = new ClaimItemsImpl();
		return claimItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemsDetail createClaimItemsDetail() {
		ClaimItemsDetailImpl claimItemsDetail = new ClaimItemsDetailImpl();
		return claimItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemsDetailSubDetail createClaimItemsDetailSubDetail() {
		ClaimItemsDetailSubDetailImpl claimItemsDetailSubDetail = new ClaimItemsDetailSubDetailImpl();
		return claimItemsDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemsProsthesis createClaimItemsProsthesis() {
		ClaimItemsProsthesisImpl claimItemsProsthesis = new ClaimItemsProsthesisImpl();
		return claimItemsProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimMissingTeeth createClaimMissingTeeth() {
		ClaimMissingTeethImpl claimMissingTeeth = new ClaimMissingTeethImpl();
		return claimMissingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItems createClaimResponseItems() {
		ClaimResponseItemsImpl claimResponseItems = new ClaimResponseItemsImpl();
		return claimResponseItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemsItemAdjudication createClaimResponseItemsItemAdjudication() {
		ClaimResponseItemsItemAdjudicationImpl claimResponseItemsItemAdjudication = new ClaimResponseItemsItemAdjudicationImpl();
		return claimResponseItemsItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemsItemDetail createClaimResponseItemsItemDetail() {
		ClaimResponseItemsItemDetailImpl claimResponseItemsItemDetail = new ClaimResponseItemsItemDetailImpl();
		return claimResponseItemsItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemsItemDetailDetailAdjudication createClaimResponseItemsItemDetailDetailAdjudication() {
		ClaimResponseItemsItemDetailDetailAdjudicationImpl claimResponseItemsItemDetailDetailAdjudication = new ClaimResponseItemsItemDetailDetailAdjudicationImpl();
		return claimResponseItemsItemDetailDetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemsItemDetailSubDetail createClaimResponseItemsItemDetailSubDetail() {
		ClaimResponseItemsItemDetailSubDetailImpl claimResponseItemsItemDetailSubDetail = new ClaimResponseItemsItemDetailSubDetailImpl();
		return claimResponseItemsItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication createClaimResponseItemsItemDetailSubDetailSubdetailAdjudication() {
		ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl claimResponseItemsItemDetailSubDetailSubdetailAdjudication = new ClaimResponseItemsItemDetailSubDetailSubdetailAdjudicationImpl();
		return claimResponseItemsItemDetailSubDetailSubdetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItem createClaimResponseAddedItem() {
		ClaimResponseAddedItemImpl claimResponseAddedItem = new ClaimResponseAddedItemImpl();
		return claimResponseAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItemAddedItemAdjudication createClaimResponseAddedItemAddedItemAdjudication() {
		ClaimResponseAddedItemAddedItemAdjudicationImpl claimResponseAddedItemAddedItemAdjudication = new ClaimResponseAddedItemAddedItemAdjudicationImpl();
		return claimResponseAddedItemAddedItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItemAddedItemsDetail createClaimResponseAddedItemAddedItemsDetail() {
		ClaimResponseAddedItemAddedItemsDetailImpl claimResponseAddedItemAddedItemsDetail = new ClaimResponseAddedItemAddedItemsDetailImpl();
		return claimResponseAddedItemAddedItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication createClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication() {
		ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationImpl claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication = new ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationImpl();
		return claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseErrors createClaimResponseErrors() {
		ClaimResponseErrorsImpl claimResponseErrors = new ClaimResponseErrorsImpl();
		return claimResponseErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseNotes createClaimResponseNotes() {
		ClaimResponseNotesImpl claimResponseNotes = new ClaimResponseNotesImpl();
		return claimResponseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseCoverage createClaimResponseCoverage() {
		ClaimResponseCoverageImpl claimResponseCoverage = new ClaimResponseCoverageImpl();
		return claimResponseCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCoverage createExplanationOfBenefitCoverage() {
		ExplanationOfBenefitCoverageImpl explanationOfBenefitCoverage = new ExplanationOfBenefitCoverageImpl();
		return explanationOfBenefitCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItems createExplanationOfBenefitItems() {
		ExplanationOfBenefitItemsImpl explanationOfBenefitItems = new ExplanationOfBenefitItemsImpl();
		return explanationOfBenefitItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsItemAdjudication createExplanationOfBenefitItemsItemAdjudication() {
		ExplanationOfBenefitItemsItemAdjudicationImpl explanationOfBenefitItemsItemAdjudication = new ExplanationOfBenefitItemsItemAdjudicationImpl();
		return explanationOfBenefitItemsItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsDetail createExplanationOfBenefitItemsDetail() {
		ExplanationOfBenefitItemsDetailImpl explanationOfBenefitItemsDetail = new ExplanationOfBenefitItemsDetailImpl();
		return explanationOfBenefitItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsDetailDetailAdjudication createExplanationOfBenefitItemsDetailDetailAdjudication() {
		ExplanationOfBenefitItemsDetailDetailAdjudicationImpl explanationOfBenefitItemsDetailDetailAdjudication = new ExplanationOfBenefitItemsDetailDetailAdjudicationImpl();
		return explanationOfBenefitItemsDetailDetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsDetailSubDetail createExplanationOfBenefitItemsDetailSubDetail() {
		ExplanationOfBenefitItemsDetailSubDetailImpl explanationOfBenefitItemsDetailSubDetail = new ExplanationOfBenefitItemsDetailSubDetailImpl();
		return explanationOfBenefitItemsDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication createExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication() {
		ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudicationImpl explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication = new ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudicationImpl();
		return explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsProsthesis createExplanationOfBenefitItemsProsthesis() {
		ExplanationOfBenefitItemsProsthesisImpl explanationOfBenefitItemsProsthesis = new ExplanationOfBenefitItemsProsthesisImpl();
		return explanationOfBenefitItemsProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItem createExplanationOfBenefitAddedItem() {
		ExplanationOfBenefitAddedItemImpl explanationOfBenefitAddedItem = new ExplanationOfBenefitAddedItemImpl();
		return explanationOfBenefitAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItemAddedItemAdjudication createExplanationOfBenefitAddedItemAddedItemAdjudication() {
		ExplanationOfBenefitAddedItemAddedItemAdjudicationImpl explanationOfBenefitAddedItemAddedItemAdjudication = new ExplanationOfBenefitAddedItemAddedItemAdjudicationImpl();
		return explanationOfBenefitAddedItemAddedItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItemAddedItemsDetail createExplanationOfBenefitAddedItemAddedItemsDetail() {
		ExplanationOfBenefitAddedItemAddedItemsDetailImpl explanationOfBenefitAddedItemAddedItemsDetail = new ExplanationOfBenefitAddedItemAddedItemsDetailImpl();
		return explanationOfBenefitAddedItemAddedItemsDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication createExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication() {
		ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudicationImpl explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication = new ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudicationImpl();
		return explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitMissingTeeth createExplanationOfBenefitMissingTeeth() {
		ExplanationOfBenefitMissingTeethImpl explanationOfBenefitMissingTeeth = new ExplanationOfBenefitMissingTeethImpl();
		return explanationOfBenefitMissingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitNotes createExplanationOfBenefitNotes() {
		ExplanationOfBenefitNotesImpl explanationOfBenefitNotes = new ExplanationOfBenefitNotesImpl();
		return explanationOfBenefitNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalanceBenefit createExplanationOfBenefitBenefitBalanceBenefit() {
		ExplanationOfBenefitBenefitBalanceBenefitImpl explanationOfBenefitBenefitBalanceBenefit = new ExplanationOfBenefitBenefitBalanceBenefitImpl();
		return explanationOfBenefitBenefitBalanceBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideContact createImplementationGuideContact() {
		ImplementationGuideContactImpl implementationGuideContact = new ImplementationGuideContactImpl();
		return implementationGuideContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDependency createImplementationGuideDependency() {
		ImplementationGuideDependencyImpl implementationGuideDependency = new ImplementationGuideDependencyImpl();
		return implementationGuideDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackage createImplementationGuidePackage() {
		ImplementationGuidePackageImpl implementationGuidePackage = new ImplementationGuidePackageImpl();
		return implementationGuidePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackageResource createImplementationGuidePackageResource() {
		ImplementationGuidePackageResourceImpl implementationGuidePackageResource = new ImplementationGuidePackageResourceImpl();
		return implementationGuidePackageResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterContact createSearchParameterContact() {
		SearchParameterContactImpl searchParameterContact = new SearchParameterContactImpl();
		return searchParameterContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfile createExpansionProfile() {
		ExpansionProfileImpl expansionProfile = new ExpansionProfileImpl();
		return expansionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileContact createExpansionProfileContact() {
		ExpansionProfileContactImpl expansionProfileContact = new ExpansionProfileContactImpl();
		return expansionProfileContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem createExpansionProfileCodeSystem() {
		ExpansionProfileCodeSystemImpl expansionProfileCodeSystem = new ExpansionProfileCodeSystemImpl();
		return expansionProfileCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystemCodeSystemInclude createExpansionProfileCodeSystemCodeSystemInclude() {
		ExpansionProfileCodeSystemCodeSystemIncludeImpl expansionProfileCodeSystemCodeSystemInclude = new ExpansionProfileCodeSystemCodeSystemIncludeImpl();
		return expansionProfileCodeSystemCodeSystemInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem createExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem() {
		ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystemImpl expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem = new ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystemImpl();
		return expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystemCodeSystemExclude createExpansionProfileCodeSystemCodeSystemExclude() {
		ExpansionProfileCodeSystemCodeSystemExcludeImpl expansionProfileCodeSystemCodeSystemExclude = new ExpansionProfileCodeSystemCodeSystemExcludeImpl();
		return expansionProfileCodeSystemCodeSystemExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem createExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem() {
		ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystemImpl expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem = new ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystemImpl();
		return expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation createExpansionProfileDesignation() {
		ExpansionProfileDesignationImpl expansionProfileDesignation = new ExpansionProfileDesignationImpl();
		return expansionProfileDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationInclude createExpansionProfileDesignationDesignationInclude() {
		ExpansionProfileDesignationDesignationIncludeImpl expansionProfileDesignationDesignationInclude = new ExpansionProfileDesignationDesignationIncludeImpl();
		return expansionProfileDesignationDesignationInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation createExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation() {
		ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignationImpl expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation = new ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignationImpl();
		return expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationExclude createExpansionProfileDesignationDesignationExclude() {
		ExpansionProfileDesignationDesignationExcludeImpl expansionProfileDesignationDesignationExclude = new ExpansionProfileDesignationDesignationExcludeImpl();
		return expansionProfileDesignationDesignationExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation createExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation() {
		ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation = new ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl();
		return expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSet createOrderSet() {
		OrderSetImpl orderSet = new OrderSetImpl();
		return orderSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItem createOrderSetItem() {
		OrderSetItemImpl orderSetItem = new OrderSetItemImpl();
		return orderSetItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSetItemCustomization createOrderSetItemCustomization() {
		OrderSetItemCustomizationImpl orderSetItemCustomization = new OrderSetItemCustomizationImpl();
		return orderSetItemCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgentRelatedAgent createProvenanceAgentRelatedAgent() {
		ProvenanceAgentRelatedAgentImpl provenanceAgentRelatedAgent = new ProvenanceAgentRelatedAgentImpl();
		return provenanceAgentRelatedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse createProcessResponse() {
		ProcessResponseImpl processResponse = new ProcessResponseImpl();
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseNotes createProcessResponseNotes() {
		ProcessResponseNotesImpl processResponseNotes = new ProcessResponseNotesImpl();
		return processResponseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulation createMeasurePopulation() {
		MeasurePopulationImpl measurePopulation = new MeasurePopulationImpl();
		return measurePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseAction createGuidanceResponseAction() {
		GuidanceResponseActionImpl guidanceResponseAction = new GuidanceResponseActionImpl();
		return guidanceResponseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEvent createAuditEventEvent() {
		AuditEventEventImpl auditEventEvent = new AuditEventEventImpl();
		return auditEventEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipant createAuditEventParticipant() {
		AuditEventParticipantImpl auditEventParticipant = new AuditEventParticipantImpl();
		return auditEventParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipantNetwork createAuditEventParticipantNetwork() {
		AuditEventParticipantNetworkImpl auditEventParticipantNetwork = new AuditEventParticipantNetworkImpl();
		return auditEventParticipantNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObject createAuditEventObject() {
		AuditEventObjectImpl auditEventObject = new AuditEventObjectImpl();
		return auditEventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectDetail createAuditEventObjectDetail() {
		AuditEventObjectDetailImpl auditEventObjectDetail = new AuditEventObjectDetailImpl();
		return auditEventObjectDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderResponse createOrderResponse() {
		OrderResponseImpl orderResponse = new OrderResponseImpl();
		return orderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirResourcePackage getFhirResourcePackage() {
		return (FhirResourcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirResourcePackage getPackage() {
		return FhirResourcePackage.eINSTANCE;
	}

} //FhirResourceFactoryImpl
