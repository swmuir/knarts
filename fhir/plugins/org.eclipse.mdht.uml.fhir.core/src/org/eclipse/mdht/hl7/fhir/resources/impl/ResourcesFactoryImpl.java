/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.hl7.fhir.resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements ResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcesFactory init() {
		try {
			ResourcesFactory theResourcesFactory = (ResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcesPackage.eNS_URI);
			if (theResourcesFactory != null) {
				return theResourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactoryImpl() {
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
			case ResourcesPackage.ORGANIZATION: return createOrganization();
			case ResourcesPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			case ResourcesPackage.PRACTITIONER: return createPractitioner();
			case ResourcesPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case ResourcesPackage.VALUE_SET: return createValueSet();
			case ResourcesPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET: return createValueSetComposeConceptSet();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: return createValueSetComposeConceptSetConceptReference();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE_DESIGNATION: return createValueSetComposeConceptSetConceptReferenceDesignation();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: return createValueSetComposeConceptSetFilter();
			case ResourcesPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case ResourcesPackage.VALUE_SET_EXPANSION_PARAMETER: return createValueSetExpansionParameter();
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS: return createValueSetExpansionContains();
			case ResourcesPackage.ENDPOINT: return createEndpoint();
			case ResourcesPackage.LIBRARY: return createLibrary();
			case ResourcesPackage.MEASURE_REPORT: return createMeasureReport();
			case ResourcesPackage.MEASURE: return createMeasure();
			case ResourcesPackage.MEASURE_GROUP: return createMeasureGroup();
			case ResourcesPackage.MEASURE_GROUP_POPULATION: return createMeasureGroupPopulation();
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER: return createMeasureGroupStratifier();
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER_COMPONENT: return createMeasureGroupStratifierComponent();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case ResourcesPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case ResourcesPackage.MEASURE_REPORT_GROUP_POPULATION: return createMeasureReportGroupPopulation();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER: return createMeasureReportGroupStratifier();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP: return createMeasureReportGroupStratifierStratifierGroup();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_COMPONENT: return createMeasureReportGroupStratifierStratifierGroupComponent();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION: return createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation();
			case ResourcesPackage.PATIENT: return createPatient();
			case ResourcesPackage.PATIENT_CONTACT: return createPatientContact();
			case ResourcesPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case ResourcesPackage.PATIENT_LINK: return createPatientLink();
			case ResourcesPackage.LIST: return createList();
			case ResourcesPackage.LIST_ENTRY: return createListEntry();
			case ResourcesPackage.ENCOUNTER: return createEncounter();
			case ResourcesPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case ResourcesPackage.ENCOUNTER_CLASS_HISTORY: return createEncounterClassHistory();
			case ResourcesPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS: return createEncounterDiagnosis();
			case ResourcesPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case ResourcesPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case ResourcesPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case ResourcesPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case ResourcesPackage.EPISODE_OF_CARE_DIAGNOSIS: return createEpisodeOfCareDiagnosis();
			case ResourcesPackage.CONDITION: return createCondition();
			case ResourcesPackage.CONDITION_STAGE: return createConditionStage();
			case ResourcesPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case ResourcesPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case ResourcesPackage.CLINICAL_IMPRESSION_INVESTIGATION: return createClinicalImpressionInvestigation();
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case ResourcesPackage.OBSERVATION: return createObservation();
			case ResourcesPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case ResourcesPackage.CARE_PLAN: return createCarePlan();
			case ResourcesPackage.PLAN_DEFINITION: return createPlanDefinition();
			case ResourcesPackage.PLAN_DEFINITION_GOAL: return createPlanDefinitionGoal();
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET: return createPlanDefinitionGoalTarget();
			case ResourcesPackage.PLAN_DEFINITION_ACTION: return createPlanDefinitionAction();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_CONDITION: return createPlanDefinitionActionCondition();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_RELATED_ACTION: return createPlanDefinitionActionRelatedAction();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_PARTICIPANT: return createPlanDefinitionActionParticipant();
			case ResourcesPackage.STRUCTURE_MAP: return createStructureMap();
			case ResourcesPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case ResourcesPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT: return createStructureMapGroupInput();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE: return createStructureMapGroupRule();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE: return createStructureMapGroupRuleSource();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET: return createStructureMapGroupRuleTarget();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET_PARAMETER: return createStructureMapGroupRuleTargetParameter();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_DEPENDENT: return createStructureMapGroupRuleDependent();
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DYNAMIC_VALUE: return createPlanDefinitionActionDynamicValue();
			case ResourcesPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL: return createCarePlanActivityDetail();
			case ResourcesPackage.CARE_TEAM: return createCareTeam();
			case ResourcesPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case ResourcesPackage.GOAL: return createGoal();
			case ResourcesPackage.GOAL_TARGET: return createGoalTarget();
			case ResourcesPackage.APPOINTMENT: return createAppointment();
			case ResourcesPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case ResourcesPackage.SLOT: return createSlot();
			case ResourcesPackage.SCHEDULE: return createSchedule();
			case ResourcesPackage.SERVICE_REQUEST: return createServiceRequest();
			case ResourcesPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case ResourcesPackage.ACTIVITY_DEFINITION_PARTICIPANT: return createActivityDefinitionParticipant();
			case ResourcesPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case ResourcesPackage.LOCATION: return createLocation();
			case ResourcesPackage.LOCATION_POSITION: return createLocationPosition();
			case ResourcesPackage.LOCATION_HOURS_OF_OPERATION: return createLocationHoursOfOperation();
			case ResourcesPackage.SPECIMEN_DEFINITION: return createSpecimenDefinition();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED: return createSpecimenDefinitionTypeTested();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER: return createSpecimenDefinitionTypeTestedContainer();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE: return createSpecimenDefinitionTypeTestedContainerAdditive();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING: return createSpecimenDefinitionTypeTestedHandling();
			case ResourcesPackage.OBSERVATION_DEFINITION: return createObservationDefinition();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS: return createObservationDefinitionQuantitativeDetails();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL: return createObservationDefinitionQualifiedInterval();
			case ResourcesPackage.COVERAGE: return createCoverage();
			case ResourcesPackage.COVERAGE_CLASS: return createCoverageClass();
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY: return createCoverageCostToBeneficiary();
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY_EXEMPTION: return createCoverageCostToBeneficiaryExemption();
			case ResourcesPackage.CONTRACT: return createContract();
			case ResourcesPackage.CONTRACT_CONTENT_DEFINITION: return createContractContentDefinition();
			case ResourcesPackage.CONTRACT_TERM: return createContractTerm();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL: return createContractTermSecurityLabel();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER: return createContractTermContractOffer();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_CONTRACT_PARTY: return createContractTermContractOfferContractParty();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER: return createContractTermContractOfferAnswer();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET: return createContractTermContractAsset();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_ASSET_CONTEXT: return createContractTermContractAssetAssetContext();
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM: return createContractTermContractAssetValuedItem();
			case ResourcesPackage.CONTRACT_TERM_ACTION: return createContractTermAction();
			case ResourcesPackage.CONTRACT_TERM_ACTION_ACTION_SUBJECT: return createContractTermActionActionSubject();
			case ResourcesPackage.CONTRACT_SIGNATORY: return createContractSignatory();
			case ResourcesPackage.CONTRACT_FRIENDLY_LANGUAGE: return createContractFriendlyLanguage();
			case ResourcesPackage.CONTRACT_LEGAL_LANGUAGE: return createContractLegalLanguage();
			case ResourcesPackage.CONTRACT_COMPUTABLE_LANGUAGE: return createContractComputableLanguage();
			case ResourcesPackage.RELATED_PERSON: return createRelatedPerson();
			case ResourcesPackage.RELATED_PERSON_COMMUNICATION: return createRelatedPersonCommunication();
			case ResourcesPackage.PROVENANCE: return createProvenance();
			case ResourcesPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case ResourcesPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case ResourcesPackage.SPECIMEN: return createSpecimen();
			case ResourcesPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case ResourcesPackage.SPECIMEN_PROCESSING: return createSpecimenProcessing();
			case ResourcesPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case ResourcesPackage.SUBSTANCE: return createSubstance();
			case ResourcesPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case ResourcesPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case ResourcesPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case ResourcesPackage.MEDICATION_ADMINISTRATION_PERFORMER: return createMedicationAdministrationPerformer();
			case ResourcesPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case ResourcesPackage.MEDICATION_REQUEST: return createMedicationRequest();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: return createMedicationRequestDispenseRequest();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST_INITIAL_FILL: return createMedicationRequestDispenseRequestInitialFill();
			case ResourcesPackage.MEDICATION_REQUEST_SUBSTITUTION: return createMedicationRequestSubstitution();
			case ResourcesPackage.DETECTED_ISSUE: return createDetectedIssue();
			case ResourcesPackage.DETECTED_ISSUE_EVIDENCE: return createDetectedIssueEvidence();
			case ResourcesPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case ResourcesPackage.DEVICE: return createDevice();
			case ResourcesPackage.DEVICE_UDI_CARRIER: return createDeviceUdiCarrier();
			case ResourcesPackage.DEVICE_DEVICE_NAME: return createDeviceDeviceName();
			case ResourcesPackage.DEVICE_SPECIALIZATION: return createDeviceSpecialization();
			case ResourcesPackage.DEVICE_VERSION: return createDeviceVersion();
			case ResourcesPackage.DEVICE_PROPERTY: return createDeviceProperty();
			case ResourcesPackage.DEVICE_DEFINITION: return createDeviceDefinition();
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER: return createDeviceDefinitionUdiDeviceIdentifier();
			case ResourcesPackage.DEVICE_DEFINITION_DEVICE_NAME: return createDeviceDefinitionDeviceName();
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION: return createDeviceDefinitionSpecialization();
			case ResourcesPackage.DEVICE_DEFINITION_CAPABILITY: return createDeviceDefinitionCapability();
			case ResourcesPackage.DEVICE_DEFINITION_PROPERTY: return createDeviceDefinitionProperty();
			case ResourcesPackage.DEVICE_DEFINITION_MATERIAL: return createDeviceDefinitionMaterial();
			case ResourcesPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case ResourcesPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case ResourcesPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case ResourcesPackage.ACCOUNT: return createAccount();
			case ResourcesPackage.ACCOUNT_COVERAGE: return createAccountCoverage();
			case ResourcesPackage.ACCOUNT_GUARANTOR: return createAccountGuarantor();
			case ResourcesPackage.MEDICINAL_PRODUCT: return createMedicinalProduct();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTACT: return createMedicinalProductContact();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME: return createMedicinalProductName();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_NAME_PART: return createMedicinalProductNameNamePart();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE: return createMedicinalProductNameCountryLanguage();
			case ResourcesPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION: return createMedicinalProductManufacturingBusinessOperation();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION: return createMedicinalProductSpecialDesignation();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL: return createMedicinalProductPharmaceutical();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_CHARACTERISTICS: return createMedicinalProductPharmaceuticalCharacteristics();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION: return createMedicinalProductPharmaceuticalRouteOfAdministration();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES: return createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD: return createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT: return createMedicinalProductIngredient();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE: return createMedicinalProductIngredientSpecifiedSubstance();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH: return createMedicinalProductIngredientSpecifiedSubstanceStrength();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH: return createMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE: return createMedicinalProductIngredientSubstance();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED: return createMedicinalProductPackaged();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER: return createMedicinalProductPackagedBatchIdentifier();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM: return createMedicinalProductPackagedPackageItem();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION: return createMedicinalProductAuthorization();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION: return createMedicinalProductAuthorizationJurisdictionalAuthorization();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE: return createMedicinalProductAuthorizationProcedure();
			case ResourcesPackage.MEDICINAL_PRODUCT_MANUFACTURED: return createMedicinalProductManufactured();
			case ResourcesPackage.RESEARCH_STUDY: return createResearchStudy();
			case ResourcesPackage.RESEARCH_STUDY_ARM: return createResearchStudyArm();
			case ResourcesPackage.RESEARCH_STUDY_OBJECTIVE: return createResearchStudyObjective();
			case ResourcesPackage.GROUP: return createGroup();
			case ResourcesPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case ResourcesPackage.GROUP_MEMBER: return createGroupMember();
			case ResourcesPackage.EVIDENCE_VARIABLE: return createEvidenceVariable();
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC: return createEvidenceVariableCharacteristic();
			case ResourcesPackage.RESEARCH_SUBJECT: return createResearchSubject();
			case ResourcesPackage.CONSENT: return createConsent();
			case ResourcesPackage.CONSENT_POLICY: return createConsentPolicy();
			case ResourcesPackage.CONSENT_VERIFICATION: return createConsentVerification();
			case ResourcesPackage.CONSENTPROVISION: return createConsentprovision();
			case ResourcesPackage.CONSENTPROVISIONPROVISION_ACTOR: return createConsentprovisionprovisionActor();
			case ResourcesPackage.CONSENTPROVISIONPROVISION_DATA: return createConsentprovisionprovisionData();
			case ResourcesPackage.EVENT_DEFINITION: return createEventDefinition();
			case ResourcesPackage.CHARGE_ITEM: return createChargeItem();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION: return createChargeItemDefinition();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY: return createChargeItemDefinitionApplicability();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP: return createChargeItemDefinitionPropertyGroup();
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP_PRICE_COMPONENT: return createChargeItemDefinitionPropertyGroupPriceComponent();
			case ResourcesPackage.CHARGE_ITEM_PERFORMER: return createChargeItemPerformer();
			case ResourcesPackage.MEDICATION: return createMedication();
			case ResourcesPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case ResourcesPackage.MEDICATION_BATCH: return createMedicationBatch();
			case ResourcesPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA: return createDiagnosticReportMedia();
			case ResourcesPackage.IMAGING_STUDY: return createImagingStudy();
			case ResourcesPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case ResourcesPackage.IMAGING_STUDY_SERIES_PERFORMER: return createImagingStudySeriesPerformer();
			case ResourcesPackage.IMAGING_STUDY_SERIES_INSTANCE: return createImagingStudySeriesInstance();
			case ResourcesPackage.PROCEDURE: return createProcedure();
			case ResourcesPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case ResourcesPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case ResourcesPackage.MEDIA: return createMedia();
			case ResourcesPackage.COMMUNICATION: return createCommunication();
			case ResourcesPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case ResourcesPackage.CLAIM_RESPONSE: return createClaimResponse();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ADJUDICATION: return createClaimResponseItemAdjudication();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL: return createClaimResponseItemItemDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL_SUB_DETAIL: return createClaimResponseItemItemDetailSubDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM: return createClaimResponseAddedItem();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_DETAIL: return createClaimResponseAddedItemAddedItemDetail();
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_DETAIL_ADDED_ITEM_SUB_DETAIL: return createClaimResponseAddedItemAddedItemDetailAddedItemSubDetail();
			case ResourcesPackage.CLAIM_RESPONSE_TOTAL: return createClaimResponseTotal();
			case ResourcesPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case ResourcesPackage.CLAIM_RESPONSE_NOTE: return createClaimResponseNote();
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE: return createClaimResponseInsurance();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case ResourcesPackage.CLAIM: return createClaim();
			case ResourcesPackage.CLAIM_RELATED_CLAIM: return createClaimRelatedClaim();
			case ResourcesPackage.CLAIM_PAYEE: return createClaimPayee();
			case ResourcesPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case ResourcesPackage.CLAIM_SUPPORTING_INFORMATION: return createClaimSupportingInformation();
			case ResourcesPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case ResourcesPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case ResourcesPackage.CLAIM_INSURANCE: return createClaimInsurance();
			case ResourcesPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case ResourcesPackage.CLAIM_ITEM: return createClaimItem();
			case ResourcesPackage.CLAIM_ITEM_DETAIL: return createClaimItemDetail();
			case ResourcesPackage.CLAIM_ITEM_DETAIL_SUB_DETAIL: return createClaimItemDetailSubDetail();
			case ResourcesPackage.DEVICE_REQUEST: return createDeviceRequest();
			case ResourcesPackage.DEVICE_REQUEST_PARAMETER: return createDeviceRequestParameter();
			case ResourcesPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case ResourcesPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case ResourcesPackage.HEALTHCARE_SERVICE_ELIGIBILITY: return createHealthcareServiceEligibility();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case ResourcesPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case ResourcesPackage.NAMING_SYSTEM: return createNamingSystem();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case ResourcesPackage.BODY_STRUCTURE: return createBodyStructure();
			case ResourcesPackage.TASK: return createTask();
			case ResourcesPackage.TASK_RESTRICTION: return createTaskRestriction();
			case ResourcesPackage.TASK_PARAMETER: return createTaskParameter();
			case ResourcesPackage.TASK_OUTPUT: return createTaskOutput();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case ResourcesPackage.QUESTIONNAIRE: return createQuestionnaire();
			case ResourcesPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN: return createQuestionnaireItemEnableWhen();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION: return createQuestionnaireItemAnswerOption();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_INITIAL: return createQuestionnaireItemInitial();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: return createQuestionnaireResponseItemAnswer();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_RELATED_CLAIM: return createExplanationOfBenefitRelatedClaim();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFORMATION: return createExplanationOfBenefitSupportingInformation();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE: return createExplanationOfBenefitInsurance();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_ADJUDICATION: return createExplanationOfBenefitItemAdjudication();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL: return createExplanationOfBenefitItemDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL_SUB_DETAIL: return createExplanationOfBenefitItemDetailSubDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: return createExplanationOfBenefitAddedItem();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL: return createExplanationOfBenefitAddedItemAddedItemDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL_ADDED_ITEM_DETAIL_SUB_DETAIL: return createExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_TOTAL: return createExplanationOfBenefitTotal();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_NOTE: return createExplanationOfBenefitNote();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: return createExplanationOfBenefitBenefitBalanceBenefit();
			case ResourcesPackage.CONCEPT_MAP: return createConceptMap();
			case ResourcesPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT: return createConceptMapGroupSourceElement();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT: return createConceptMapGroupSourceElementTargetElement();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: return createConceptMapGroupSourceElementTargetElementOtherElement();
			case ResourcesPackage.CODE_SYSTEM: return createCodeSystem();
			case ResourcesPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case ResourcesPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION: return createCodeSystemConceptDefinition();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: return createCodeSystemConceptDefinitionDesignation();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_CONCEPT_PROPERTY: return createCodeSystemConceptDefinitionConceptProperty();
			case ResourcesPackage.CONCEPT_MAP_GROUP_UNMAPPED: return createConceptMapGroupUnmapped();
			case ResourcesPackage.REQUEST_GROUP: return createRequestGroup();
			case ResourcesPackage.REQUEST_GROUP_ACTION: return createRequestGroupAction();
			case ResourcesPackage.REQUEST_GROUP_ACTION_CONDITION: return createRequestGroupActionCondition();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION: return createRequestGroupActionRelatedAction();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES: return createTerminologyCapabilities();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE: return createTerminologyCapabilitiesSoftware();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION: return createTerminologyCapabilitiesImplementation();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM: return createTerminologyCapabilitiesCodeSystem();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION: return createTerminologyCapabilitiesCodeSystemVersion();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION_FILTER: return createTerminologyCapabilitiesCodeSystemVersionFilter();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION: return createTerminologyCapabilitiesExpansion();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION_PARAMETER: return createTerminologyCapabilitiesExpansionParameter();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE: return createTerminologyCapabilitiesValidateCode();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION: return createTerminologyCapabilitiesTranslation();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CLOSURE: return createTerminologyCapabilitiesClosure();
			case ResourcesPackage.DEVICE_METRIC: return createDeviceMetric();
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case ResourcesPackage.FLAG: return createFlag();
			case ResourcesPackage.IMMUNIZATION_EVALUATION: return createImmunizationEvaluation();
			case ResourcesPackage.IMMUNIZATION: return createImmunization();
			case ResourcesPackage.IMMUNIZATION_PERFORMER: return createImmunizationPerformer();
			case ResourcesPackage.IMMUNIZATION_EDUCATION: return createImmunizationEducation();
			case ResourcesPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED: return createImmunizationProtocolApplied();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION: return createMedicinalProductIndication();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY: return createMedicinalProductIndicationOtherTherapy();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT: return createMedicinalProductUndesirableEffect();
			case ResourcesPackage.BINARY: return createBinary();
			case ResourcesPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case ResourcesPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case ResourcesPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case ResourcesPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case ResourcesPackage.PARAMETERS: return createParameters();
			case ResourcesPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case ResourcesPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON: return createImplementationGuideDependsOn();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION: return createImplementationGuideDefinition();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_GROUPING: return createImplementationGuideDefinitionGrouping();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE: return createImplementationGuideDefinitionResource();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE: return createImplementationGuideDefinitionPage();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PARAMETER: return createImplementationGuideDefinitionParameter();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_TEMPLATE: return createImplementationGuideDefinitionTemplate();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST: return createImplementationGuideManifest();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE: return createImplementationGuideManifestManifestResource();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE: return createImplementationGuideManifestManifestPage();
			case ResourcesPackage.SEARCH_PARAMETER: return createSearchParameter();
			case ResourcesPackage.SEARCH_PARAMETER_COMPONENT: return createSearchParameterComponent();
			case ResourcesPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING: return createOperationDefinitionParameterBinding();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM: return createOperationDefinitionParameterReferencedFrom();
			case ResourcesPackage.OPERATION_DEFINITION_OVERLOAD: return createOperationDefinitionOverload();
			case ResourcesPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS: return createPaymentReconciliationDetails();
			case ResourcesPackage.PAYMENT_RECONCILIATION_NOTES: return createPaymentReconciliationNotes();
			case ResourcesPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: return createPractitionerRoleAvailableTime();
			case ResourcesPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: return createPractitionerRoleNotAvailable();
			case ResourcesPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case ResourcesPackage.ORGANIZATION_AFFILIATION: return createOrganizationAffiliation();
			case ResourcesPackage.RESEARCH_DEFINITION: return createResearchDefinition();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION: return createResearchElementDefinition();
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC: return createResearchElementDefinitionCharacteristic();
			case ResourcesPackage.ADVERSE_EVENT: return createAdverseEvent();
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY: return createAdverseEventSuspectEntity();
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY_CAUSALITY: return createAdverseEventSuspectEntityCausality();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS: return createRiskEvidenceSynthesis();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: return createRiskEvidenceSynthesisSampleSize();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE: return createRiskEvidenceSynthesisRiskEstimate();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE_PRECISION_ESTIMATE: return createRiskEvidenceSynthesisRiskEstimatePrecisionEstimate();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY: return createRiskEvidenceSynthesisCertainty();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT: return createRiskEvidenceSynthesisCertaintyCertaintySubcomponent();
			case ResourcesPackage.TEST_SCRIPT: return createTestScript();
			case ResourcesPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case ResourcesPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case ResourcesPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case ResourcesPackage.TEST_SCRIPT_METADATA_LINK: return createTestScriptMetadataLink();
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY: return createTestScriptMetadataCapability();
			case ResourcesPackage.CAPABILITY_STATEMENT: return createCapabilityStatement();
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE: return createCapabilityStatementSoftware();
			case ResourcesPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: return createCapabilityStatementImplementation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST: return createCapabilityStatementRest();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY: return createCapabilityStatementRestSecurity();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE: return createCapabilityStatementRestResource();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_RESOURCE_INTERACTION: return createCapabilityStatementRestResourceResourceInteraction();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_SEARCH_PARAM: return createCapabilityStatementRestResourceSearchParam();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION: return createCapabilityStatementRestResourceOperation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SYSTEM_INTERACTION: return createCapabilityStatementRestSystemInteraction();
			case ResourcesPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case ResourcesPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING: return createCapabilityStatementMessaging();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_ENDPOINT: return createCapabilityStatementMessagingEndpoint();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_SUPPORTED_MESSAGE: return createCapabilityStatementMessagingSupportedMessage();
			case ResourcesPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS: return createMessageDefinitionFocus();
			case ResourcesPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: return createMessageDefinitionAllowedResponse();
			case ResourcesPackage.GRAPH_DEFINITION: return createGraphDefinition();
			case ResourcesPackage.GRAPH_DEFINITION_LINK: return createGraphDefinitionLink();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET: return createGraphDefinitionLinkTarget();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT: return createGraphDefinitionLinkTargetCompartment();
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT: return createCapabilityStatementDocument();
			case ResourcesPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case ResourcesPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case ResourcesPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION: return createTestScriptSetupSetupAction();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: return createTestScriptSetupSetupActionOperation();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: return createTestScriptSetupSetupActionOperationRequestHeader();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: return createTestScriptSetupSetupActionAssert();
			case ResourcesPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION: return createTestScriptTestTestAction();
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: return createTestScriptTeardownTeardownAction();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT: return createBiologicallyDerivedProduct();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION: return createBiologicallyDerivedProductCollection();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING: return createBiologicallyDerivedProductProcessing();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION: return createBiologicallyDerivedProductManipulation();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE: return createBiologicallyDerivedProductStorage();
			case ResourcesPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case ResourcesPackage.MESSAGE_HEADER: return createMessageHeader();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION: return createMessageHeaderMessageDestination();
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_SOURCE: return createMessageHeaderMessageSource();
			case ResourcesPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case ResourcesPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case ResourcesPackage.SUBSCRIPTION: return createSubscription();
			case ResourcesPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case ResourcesPackage.LINKAGE: return createLinkage();
			case ResourcesPackage.LINKAGE_ITEM: return createLinkageItem();
			case ResourcesPackage.CATALOG_ENTRY: return createCatalogEntry();
			case ResourcesPackage.CATALOG_ENTRY_RELATED_ENTRY: return createCatalogEntryRelatedEntry();
			case ResourcesPackage.COMPOSITION: return createComposition();
			case ResourcesPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case ResourcesPackage.COMPOSITION_RELATES_TO: return createCompositionRelatesTo();
			case ResourcesPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case ResourcesPackage.COMPOSITION_SECTION: return createCompositionSection();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID: return createSubstanceNucleicAcid();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT: return createSubstanceNucleicAcidSubunit();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT_LINKAGE: return createSubstanceNucleicAcidSubunitLinkage();
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT_SUGAR: return createSubstanceNucleicAcidSubunitSugar();
			case ResourcesPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case ResourcesPackage.SUPPLY_REQUEST_PARAMETER: return createSupplyRequestParameter();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS: return createEffectEvidenceSynthesis();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: return createEffectEvidenceSynthesisSampleSize();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE: return createEffectEvidenceSynthesisResultsByExposure();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE: return createEffectEvidenceSynthesisEffectEstimate();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE_PRECISION_ESTIMATE: return createEffectEvidenceSynthesisEffectEstimatePrecisionEstimate();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY: return createEffectEvidenceSynthesisCertainty();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT: return createEffectEvidenceSynthesisCertaintyCertaintySubcomponent();
			case ResourcesPackage.INSURANCE_PLAN: return createInsurancePlan();
			case ResourcesPackage.INSURANCE_PLAN_CONTACT: return createInsurancePlanContact();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE: return createInsurancePlanCoverage();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE_COVERAGE_BENEFIT: return createInsurancePlanCoverageCoverageBenefit();
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE_COVERAGE_BENEFIT_LIMIT: return createInsurancePlanCoverageCoverageBenefitLimit();
			case ResourcesPackage.INSURANCE_PLAN_PLAN: return createInsurancePlanPlan();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST: return createInsurancePlanPlanGeneralCost();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST: return createInsurancePlanPlanSpecificCost();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT: return createInsurancePlanPlanSpecificCostPlanBenefit();
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT_COST: return createInsurancePlanPlanSpecificCostPlanBenefitCost();
			case ResourcesPackage.EVIDENCE: return createEvidence();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION: return createSubstanceReferenceInformation();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE: return createSubstanceReferenceInformationGene();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE_ELEMENT: return createSubstanceReferenceInformationGeneElement();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION: return createSubstanceReferenceInformationClassification();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET: return createSubstanceReferenceInformationTarget();
			case ResourcesPackage.SUBSTANCE_POLYMER: return createSubstancePolymer();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET: return createSubstancePolymerMonomerSet();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL: return createSubstancePolymerMonomerSetStartingMaterial();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT: return createSubstancePolymerRepeat();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT: return createSubstancePolymerRepeatRepeatUnit();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT_DEGREE_OF_POLYMERISATION: return createSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT_STRUCTURAL_REPRESENTATION: return createSubstancePolymerRepeatRepeatUnitStructuralRepresentation();
			case ResourcesPackage.SUBSTANCE_PROTEIN: return createSubstanceProtein();
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT: return createSubstanceProteinSubunit();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL: return createSubstanceSourceMaterial();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION: return createSubstanceSourceMaterialFractionDescription();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM: return createSubstanceSourceMaterialOrganism();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR: return createSubstanceSourceMaterialOrganismAuthor();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID: return createSubstanceSourceMaterialOrganismHybrid();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_ORGANISM_GENERAL: return createSubstanceSourceMaterialOrganismOrganismGeneral();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION: return createSubstanceSourceMaterialPartDescription();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION: return createMedicinalProductContraindication();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY: return createMedicinalProductContraindicationOtherTherapy();
			case ResourcesPackage.MOLECULAR_SEQUENCE: return createMolecularSequence();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ: return createMolecularSequenceReferenceSeq();
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT: return createMolecularSequenceVariant();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY: return createMolecularSequenceQuality();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC: return createMolecularSequenceQualityRoc();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY: return createMolecularSequenceRepository();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT: return createMolecularSequenceStructureVariant();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_OUTER: return createMolecularSequenceStructureVariantOuter();
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER: return createMolecularSequenceStructureVariantInner();
			case ResourcesPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case ResourcesPackage.INVOICE: return createInvoice();
			case ResourcesPackage.INVOICE_PARTICIPANT: return createInvoiceParticipant();
			case ResourcesPackage.INVOICE_LINE_ITEM: return createInvoiceLineItem();
			case ResourcesPackage.INVOICE_LINE_ITEM_PRICE_COMPONENT: return createInvoiceLineItemPriceComponent();
			case ResourcesPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationRecommendationDateCriterion();
			case ResourcesPackage.VERIFICATION_RESULT: return createVerificationResult();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE: return createVerificationResultPrimarySource();
			case ResourcesPackage.VERIFICATION_RESULT_ATTESTATION: return createVerificationResultAttestation();
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR: return createVerificationResultValidator();
			case ResourcesPackage.BUNDLE: return createBundle();
			case ResourcesPackage.BUNDLE_LINK: return createBundleLink();
			case ResourcesPackage.BUNDLE_ENTRY: return createBundleEntry();
			case ResourcesPackage.ENTRY_RESOURCE: return createEntry_Resource();
			case ResourcesPackage.BUNDLE_ENTRY_SEARCH: return createBundleEntrySearch();
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST: return createBundleEntryRequest();
			case ResourcesPackage.BUNDLE_ENTRY_RESPONSE: return createBundleEntryResponse();
			case ResourcesPackage.TEST_REPORT: return createTestReport();
			case ResourcesPackage.TEST_REPORT_PARTICIPANT: return createTestReportParticipant();
			case ResourcesPackage.TEST_REPORT_SETUP: return createTestReportSetup();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION: return createTestReportSetupSetupAction();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_OPERATION: return createTestReportSetupSetupActionOperation();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT: return createTestReportSetupSetupActionAssert();
			case ResourcesPackage.TEST_REPORT_TEST: return createTestReportTest();
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION: return createTestReportTestTestAction();
			case ResourcesPackage.TEST_REPORT_TEARDOWN: return createTestReportTeardown();
			case ResourcesPackage.TEST_REPORT_TEARDOWN_TEARDOWN_ACTION: return createTestReportTeardownTeardownAction();
			case ResourcesPackage.NUTRITION_ORDER: return createNutritionOrder();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET_NUTRIENT: return createNutritionOrderOralDietNutrient();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE: return createNutritionOrderOralDietTexture();
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION: return createNutritionOrderEnteralFormulaAdministration();
			case ResourcesPackage.PERSON: return createPerson();
			case ResourcesPackage.PERSON_LINK: return createPersonLink();
			case ResourcesPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case ResourcesPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case ResourcesPackage.AUDIT_EVENT: return createAuditEvent();
			case ResourcesPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case ResourcesPackage.AUDIT_EVENT_AGENT_NETWORK: return createAuditEventAgentNetwork();
			case ResourcesPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case ResourcesPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case ResourcesPackage.AUDIT_EVENT_ENTITY_DETAIL: return createAuditEventEntityDetail();
			case ResourcesPackage.BASIC: return createBasic();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST: return createCoverageEligibilityRequest();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFORMATION: return createCoverageEligibilityRequestSupportingInformation();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE: return createCoverageEligibilityRequestInsurance();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS: return createCoverageEligibilityRequestDetails();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS: return createCoverageEligibilityRequestDetailsDiagnosis();
			case ResourcesPackage.MEDICINAL_PRODUCT_INTERACTION: return createMedicinalProductInteraction();
			case ResourcesPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT: return createMedicinalProductInteractionInteractant();
			case ResourcesPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION: return createVisionPrescriptionLensSpecification();
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM: return createVisionPrescriptionLensSpecificationPrism();
			case ResourcesPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: return createSupplyDeliverySuppliedItem();
			case ResourcesPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case ResourcesPackage.MEDICATION_DISPENSE_PERFORMER: return createMedicationDispensePerformer();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case ResourcesPackage.MEDICATION_KNOWLEDGE: return createMedicationKnowledge();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE: return createMedicationKnowledgeRelatedMedicationKnowledge();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MONOGRAPH: return createMedicationKnowledgeMonograph();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT: return createMedicationKnowledgeIngredient();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_COST: return createMedicationKnowledgeCost();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM: return createMedicationKnowledgeMonitoringProgram();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES: return createMedicationKnowledgeAdministrationGuidelines();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE: return createMedicationKnowledgeAdministrationGuidelinesDosage();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS: return createMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION: return createMedicationKnowledgeMedicineClassification();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_PACKAGING: return createMedicationKnowledgePackaging();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC: return createMedicationKnowledgeDrugCharacteristic();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY: return createMedicationKnowledgeRegulatory();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION: return createMedicationKnowledgeRegulatorySubstitution();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SCHEDULE: return createMedicationKnowledgeRegulatorySchedule();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_MAX_DISPENSE: return createMedicationKnowledgeRegulatoryMaxDispense();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_KINETICS: return createMedicationKnowledgeKinetics();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE: return createCoverageEligibilityResponse();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE: return createCoverageEligibilityResponseInsurance();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS: return createCoverageEligibilityResponseInsuranceItems();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT: return createCoverageEligibilityResponseInsuranceItemsBenefit();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERRORS: return createCoverageEligibilityResponseErrors();
			case ResourcesPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case ResourcesPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case ResourcesPackage.STRUCTURE_DEFINITION_CONTEXT: return createStructureDefinitionContext();
			case ResourcesPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case ResourcesPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
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
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetComposeConceptSet createValueSetComposeConceptSet() {
		ValueSetComposeConceptSetImpl valueSetComposeConceptSet = new ValueSetComposeConceptSetImpl();
		return valueSetComposeConceptSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetComposeConceptSetConceptReference createValueSetComposeConceptSetConceptReference() {
		ValueSetComposeConceptSetConceptReferenceImpl valueSetComposeConceptSetConceptReference = new ValueSetComposeConceptSetConceptReferenceImpl();
		return valueSetComposeConceptSetConceptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetComposeConceptSetConceptReferenceDesignation createValueSetComposeConceptSetConceptReferenceDesignation() {
		ValueSetComposeConceptSetConceptReferenceDesignationImpl valueSetComposeConceptSetConceptReferenceDesignation = new ValueSetComposeConceptSetConceptReferenceDesignationImpl();
		return valueSetComposeConceptSetConceptReferenceDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetComposeConceptSetFilter createValueSetComposeConceptSetFilter() {
		ValueSetComposeConceptSetFilterImpl valueSetComposeConceptSetFilter = new ValueSetComposeConceptSetFilterImpl();
		return valueSetComposeConceptSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetExpansionParameter createValueSetExpansionParameter() {
		ValueSetExpansionParameterImpl valueSetExpansionParameter = new ValueSetExpansionParameterImpl();
		return valueSetExpansionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetExpansionContains createValueSetExpansionContains() {
		ValueSetExpansionContainsImpl valueSetExpansionContains = new ValueSetExpansionContainsImpl();
		return valueSetExpansionContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureGroupPopulation createMeasureGroupPopulation() {
		MeasureGroupPopulationImpl measureGroupPopulation = new MeasureGroupPopulationImpl();
		return measureGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureGroupStratifier createMeasureGroupStratifier() {
		MeasureGroupStratifierImpl measureGroupStratifier = new MeasureGroupStratifierImpl();
		return measureGroupStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureGroupStratifierComponent createMeasureGroupStratifierComponent() {
		MeasureGroupStratifierComponentImpl measureGroupStratifierComponent = new MeasureGroupStratifierComponentImpl();
		return measureGroupStratifierComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroupPopulation createMeasureReportGroupPopulation() {
		MeasureReportGroupPopulationImpl measureReportGroupPopulation = new MeasureReportGroupPopulationImpl();
		return measureReportGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroupStratifier createMeasureReportGroupStratifier() {
		MeasureReportGroupStratifierImpl measureReportGroupStratifier = new MeasureReportGroupStratifierImpl();
		return measureReportGroupStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroupStratifierStratifierGroup createMeasureReportGroupStratifierStratifierGroup() {
		MeasureReportGroupStratifierStratifierGroupImpl measureReportGroupStratifierStratifierGroup = new MeasureReportGroupStratifierStratifierGroupImpl();
		return measureReportGroupStratifierStratifierGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroupStratifierStratifierGroupComponent createMeasureReportGroupStratifierStratifierGroupComponent() {
		MeasureReportGroupStratifierStratifierGroupComponentImpl measureReportGroupStratifierStratifierGroupComponent = new MeasureReportGroupStratifierStratifierGroupComponentImpl();
		return measureReportGroupStratifierStratifierGroupComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation() {
		MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl measureReportGroupStratifierStratifierGroupStratifierGroupPopulation = new MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl();
		return measureReportGroupStratifierStratifierGroupStratifierGroupPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterClassHistory createEncounterClassHistory() {
		EncounterClassHistoryImpl encounterClassHistory = new EncounterClassHistoryImpl();
		return encounterClassHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareDiagnosis createEpisodeOfCareDiagnosis() {
		EpisodeOfCareDiagnosisImpl episodeOfCareDiagnosis = new EpisodeOfCareDiagnosisImpl();
		return episodeOfCareDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionInvestigation createClinicalImpressionInvestigation() {
		ClinicalImpressionInvestigationImpl clinicalImpressionInvestigation = new ClinicalImpressionInvestigationImpl();
		return clinicalImpressionInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionGoal createPlanDefinitionGoal() {
		PlanDefinitionGoalImpl planDefinitionGoal = new PlanDefinitionGoalImpl();
		return planDefinitionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionGoalTarget createPlanDefinitionGoalTarget() {
		PlanDefinitionGoalTargetImpl planDefinitionGoalTarget = new PlanDefinitionGoalTargetImpl();
		return planDefinitionGoalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionAction createPlanDefinitionAction() {
		PlanDefinitionActionImpl planDefinitionAction = new PlanDefinitionActionImpl();
		return planDefinitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionActionCondition createPlanDefinitionActionCondition() {
		PlanDefinitionActionConditionImpl planDefinitionActionCondition = new PlanDefinitionActionConditionImpl();
		return planDefinitionActionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionActionRelatedAction createPlanDefinitionActionRelatedAction() {
		PlanDefinitionActionRelatedActionImpl planDefinitionActionRelatedAction = new PlanDefinitionActionRelatedActionImpl();
		return planDefinitionActionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionActionParticipant createPlanDefinitionActionParticipant() {
		PlanDefinitionActionParticipantImpl planDefinitionActionParticipant = new PlanDefinitionActionParticipantImpl();
		return planDefinitionActionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupInput createStructureMapGroupInput() {
		StructureMapGroupInputImpl structureMapGroupInput = new StructureMapGroupInputImpl();
		return structureMapGroupInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupRule createStructureMapGroupRule() {
		StructureMapGroupRuleImpl structureMapGroupRule = new StructureMapGroupRuleImpl();
		return structureMapGroupRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupRuleSource createStructureMapGroupRuleSource() {
		StructureMapGroupRuleSourceImpl structureMapGroupRuleSource = new StructureMapGroupRuleSourceImpl();
		return structureMapGroupRuleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupRuleTarget createStructureMapGroupRuleTarget() {
		StructureMapGroupRuleTargetImpl structureMapGroupRuleTarget = new StructureMapGroupRuleTargetImpl();
		return structureMapGroupRuleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupRuleTargetParameter createStructureMapGroupRuleTargetParameter() {
		StructureMapGroupRuleTargetParameterImpl structureMapGroupRuleTargetParameter = new StructureMapGroupRuleTargetParameterImpl();
		return structureMapGroupRuleTargetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupRuleDependent createStructureMapGroupRuleDependent() {
		StructureMapGroupRuleDependentImpl structureMapGroupRuleDependent = new StructureMapGroupRuleDependentImpl();
		return structureMapGroupRuleDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionActionDynamicValue createPlanDefinitionActionDynamicValue() {
		PlanDefinitionActionDynamicValueImpl planDefinitionActionDynamicValue = new PlanDefinitionActionDynamicValueImpl();
		return planDefinitionActionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivityDetail createCarePlanActivityDetail() {
		CarePlanActivityDetailImpl carePlanActivityDetail = new CarePlanActivityDetailImpl();
		return carePlanActivityDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalTarget createGoalTarget() {
		GoalTargetImpl goalTarget = new GoalTargetImpl();
		return goalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRequest createServiceRequest() {
		ServiceRequestImpl serviceRequest = new ServiceRequestImpl();
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinitionParticipant createActivityDefinitionParticipant() {
		ActivityDefinitionParticipantImpl activityDefinitionParticipant = new ActivityDefinitionParticipantImpl();
		return activityDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationHoursOfOperation createLocationHoursOfOperation() {
		LocationHoursOfOperationImpl locationHoursOfOperation = new LocationHoursOfOperationImpl();
		return locationHoursOfOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinition createSpecimenDefinition() {
		SpecimenDefinitionImpl specimenDefinition = new SpecimenDefinitionImpl();
		return specimenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionTypeTested createSpecimenDefinitionTypeTested() {
		SpecimenDefinitionTypeTestedImpl specimenDefinitionTypeTested = new SpecimenDefinitionTypeTestedImpl();
		return specimenDefinitionTypeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionTypeTestedContainer createSpecimenDefinitionTypeTestedContainer() {
		SpecimenDefinitionTypeTestedContainerImpl specimenDefinitionTypeTestedContainer = new SpecimenDefinitionTypeTestedContainerImpl();
		return specimenDefinitionTypeTestedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionTypeTestedContainerAdditive createSpecimenDefinitionTypeTestedContainerAdditive() {
		SpecimenDefinitionTypeTestedContainerAdditiveImpl specimenDefinitionTypeTestedContainerAdditive = new SpecimenDefinitionTypeTestedContainerAdditiveImpl();
		return specimenDefinitionTypeTestedContainerAdditive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionTypeTestedHandling createSpecimenDefinitionTypeTestedHandling() {
		SpecimenDefinitionTypeTestedHandlingImpl specimenDefinitionTypeTestedHandling = new SpecimenDefinitionTypeTestedHandlingImpl();
		return specimenDefinitionTypeTestedHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinition createObservationDefinition() {
		ObservationDefinitionImpl observationDefinition = new ObservationDefinitionImpl();
		return observationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQuantitativeDetails createObservationDefinitionQuantitativeDetails() {
		ObservationDefinitionQuantitativeDetailsImpl observationDefinitionQuantitativeDetails = new ObservationDefinitionQuantitativeDetailsImpl();
		return observationDefinitionQuantitativeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQualifiedInterval createObservationDefinitionQualifiedInterval() {
		ObservationDefinitionQualifiedIntervalImpl observationDefinitionQualifiedInterval = new ObservationDefinitionQualifiedIntervalImpl();
		return observationDefinitionQualifiedInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageClass createCoverageClass() {
		CoverageClassImpl coverageClass = new CoverageClassImpl();
		return coverageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageCostToBeneficiary createCoverageCostToBeneficiary() {
		CoverageCostToBeneficiaryImpl coverageCostToBeneficiary = new CoverageCostToBeneficiaryImpl();
		return coverageCostToBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageCostToBeneficiaryExemption createCoverageCostToBeneficiaryExemption() {
		CoverageCostToBeneficiaryExemptionImpl coverageCostToBeneficiaryExemption = new CoverageCostToBeneficiaryExemptionImpl();
		return coverageCostToBeneficiaryExemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractContentDefinition createContractContentDefinition() {
		ContractContentDefinitionImpl contractContentDefinition = new ContractContentDefinitionImpl();
		return contractContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermSecurityLabel createContractTermSecurityLabel() {
		ContractTermSecurityLabelImpl contractTermSecurityLabel = new ContractTermSecurityLabelImpl();
		return contractTermSecurityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractOffer createContractTermContractOffer() {
		ContractTermContractOfferImpl contractTermContractOffer = new ContractTermContractOfferImpl();
		return contractTermContractOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractOfferContractParty createContractTermContractOfferContractParty() {
		ContractTermContractOfferContractPartyImpl contractTermContractOfferContractParty = new ContractTermContractOfferContractPartyImpl();
		return contractTermContractOfferContractParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractOfferAnswer createContractTermContractOfferAnswer() {
		ContractTermContractOfferAnswerImpl contractTermContractOfferAnswer = new ContractTermContractOfferAnswerImpl();
		return contractTermContractOfferAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractAsset createContractTermContractAsset() {
		ContractTermContractAssetImpl contractTermContractAsset = new ContractTermContractAssetImpl();
		return contractTermContractAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractAssetAssetContext createContractTermContractAssetAssetContext() {
		ContractTermContractAssetAssetContextImpl contractTermContractAssetAssetContext = new ContractTermContractAssetAssetContextImpl();
		return contractTermContractAssetAssetContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermContractAssetValuedItem createContractTermContractAssetValuedItem() {
		ContractTermContractAssetValuedItemImpl contractTermContractAssetValuedItem = new ContractTermContractAssetValuedItemImpl();
		return contractTermContractAssetValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermAction createContractTermAction() {
		ContractTermActionImpl contractTermAction = new ContractTermActionImpl();
		return contractTermAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTermActionActionSubject createContractTermActionActionSubject() {
		ContractTermActionActionSubjectImpl contractTermActionActionSubject = new ContractTermActionActionSubjectImpl();
		return contractTermActionActionSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractSignatory createContractSignatory() {
		ContractSignatoryImpl contractSignatory = new ContractSignatoryImpl();
		return contractSignatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractFriendlyLanguage createContractFriendlyLanguage() {
		ContractFriendlyLanguageImpl contractFriendlyLanguage = new ContractFriendlyLanguageImpl();
		return contractFriendlyLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractLegalLanguage createContractLegalLanguage() {
		ContractLegalLanguageImpl contractLegalLanguage = new ContractLegalLanguageImpl();
		return contractLegalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractComputableLanguage createContractComputableLanguage() {
		ContractComputableLanguageImpl contractComputableLanguage = new ContractComputableLanguageImpl();
		return contractComputableLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedPersonCommunication createRelatedPersonCommunication() {
		RelatedPersonCommunicationImpl relatedPersonCommunication = new RelatedPersonCommunicationImpl();
		return relatedPersonCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenProcessing createSpecimenProcessing() {
		SpecimenProcessingImpl specimenProcessing = new SpecimenProcessingImpl();
		return specimenProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationPerformer createMedicationAdministrationPerformer() {
		MedicationAdministrationPerformerImpl medicationAdministrationPerformer = new MedicationAdministrationPerformerImpl();
		return medicationAdministrationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequest createMedicationRequest() {
		MedicationRequestImpl medicationRequest = new MedicationRequestImpl();
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestDispenseRequest createMedicationRequestDispenseRequest() {
		MedicationRequestDispenseRequestImpl medicationRequestDispenseRequest = new MedicationRequestDispenseRequestImpl();
		return medicationRequestDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestDispenseRequestInitialFill createMedicationRequestDispenseRequestInitialFill() {
		MedicationRequestDispenseRequestInitialFillImpl medicationRequestDispenseRequestInitialFill = new MedicationRequestDispenseRequestInitialFillImpl();
		return medicationRequestDispenseRequestInitialFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestSubstitution createMedicationRequestSubstitution() {
		MedicationRequestSubstitutionImpl medicationRequestSubstitution = new MedicationRequestSubstitutionImpl();
		return medicationRequestSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueEvidence createDetectedIssueEvidence() {
		DetectedIssueEvidenceImpl detectedIssueEvidence = new DetectedIssueEvidenceImpl();
		return detectedIssueEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUdiCarrier createDeviceUdiCarrier() {
		DeviceUdiCarrierImpl deviceUdiCarrier = new DeviceUdiCarrierImpl();
		return deviceUdiCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDeviceName createDeviceDeviceName() {
		DeviceDeviceNameImpl deviceDeviceName = new DeviceDeviceNameImpl();
		return deviceDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecialization createDeviceSpecialization() {
		DeviceSpecializationImpl deviceSpecialization = new DeviceSpecializationImpl();
		return deviceSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceVersion createDeviceVersion() {
		DeviceVersionImpl deviceVersion = new DeviceVersionImpl();
		return deviceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceProperty createDeviceProperty() {
		DevicePropertyImpl deviceProperty = new DevicePropertyImpl();
		return deviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinition createDeviceDefinition() {
		DeviceDefinitionImpl deviceDefinition = new DeviceDefinitionImpl();
		return deviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionUdiDeviceIdentifier createDeviceDefinitionUdiDeviceIdentifier() {
		DeviceDefinitionUdiDeviceIdentifierImpl deviceDefinitionUdiDeviceIdentifier = new DeviceDefinitionUdiDeviceIdentifierImpl();
		return deviceDefinitionUdiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionDeviceName createDeviceDefinitionDeviceName() {
		DeviceDefinitionDeviceNameImpl deviceDefinitionDeviceName = new DeviceDefinitionDeviceNameImpl();
		return deviceDefinitionDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionSpecialization createDeviceDefinitionSpecialization() {
		DeviceDefinitionSpecializationImpl deviceDefinitionSpecialization = new DeviceDefinitionSpecializationImpl();
		return deviceDefinitionSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionCapability createDeviceDefinitionCapability() {
		DeviceDefinitionCapabilityImpl deviceDefinitionCapability = new DeviceDefinitionCapabilityImpl();
		return deviceDefinitionCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionProperty createDeviceDefinitionProperty() {
		DeviceDefinitionPropertyImpl deviceDefinitionProperty = new DeviceDefinitionPropertyImpl();
		return deviceDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionMaterial createDeviceDefinitionMaterial() {
		DeviceDefinitionMaterialImpl deviceDefinitionMaterial = new DeviceDefinitionMaterialImpl();
		return deviceDefinitionMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountCoverage createAccountCoverage() {
		AccountCoverageImpl accountCoverage = new AccountCoverageImpl();
		return accountCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountGuarantor createAccountGuarantor() {
		AccountGuarantorImpl accountGuarantor = new AccountGuarantorImpl();
		return accountGuarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProduct createMedicinalProduct() {
		MedicinalProductImpl medicinalProduct = new MedicinalProductImpl();
		return medicinalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductContact createMedicinalProductContact() {
		MedicinalProductContactImpl medicinalProductContact = new MedicinalProductContactImpl();
		return medicinalProductContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductName createMedicinalProductName() {
		MedicinalProductNameImpl medicinalProductName = new MedicinalProductNameImpl();
		return medicinalProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductNameNamePart createMedicinalProductNameNamePart() {
		MedicinalProductNameNamePartImpl medicinalProductNameNamePart = new MedicinalProductNameNamePartImpl();
		return medicinalProductNameNamePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductNameCountryLanguage createMedicinalProductNameCountryLanguage() {
		MedicinalProductNameCountryLanguageImpl medicinalProductNameCountryLanguage = new MedicinalProductNameCountryLanguageImpl();
		return medicinalProductNameCountryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductManufacturingBusinessOperation createMedicinalProductManufacturingBusinessOperation() {
		MedicinalProductManufacturingBusinessOperationImpl medicinalProductManufacturingBusinessOperation = new MedicinalProductManufacturingBusinessOperationImpl();
		return medicinalProductManufacturingBusinessOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductSpecialDesignation createMedicinalProductSpecialDesignation() {
		MedicinalProductSpecialDesignationImpl medicinalProductSpecialDesignation = new MedicinalProductSpecialDesignationImpl();
		return medicinalProductSpecialDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceutical createMedicinalProductPharmaceutical() {
		MedicinalProductPharmaceuticalImpl medicinalProductPharmaceutical = new MedicinalProductPharmaceuticalImpl();
		return medicinalProductPharmaceutical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalCharacteristics createMedicinalProductPharmaceuticalCharacteristics() {
		MedicinalProductPharmaceuticalCharacteristicsImpl medicinalProductPharmaceuticalCharacteristics = new MedicinalProductPharmaceuticalCharacteristicsImpl();
		return medicinalProductPharmaceuticalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalRouteOfAdministration createMedicinalProductPharmaceuticalRouteOfAdministration() {
		MedicinalProductPharmaceuticalRouteOfAdministrationImpl medicinalProductPharmaceuticalRouteOfAdministration = new MedicinalProductPharmaceuticalRouteOfAdministrationImpl();
		return medicinalProductPharmaceuticalRouteOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies() {
		MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesImpl medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies = new MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesImpl();
		return medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod() {
		MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod = new MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodImpl();
		return medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredient createMedicinalProductIngredient() {
		MedicinalProductIngredientImpl medicinalProductIngredient = new MedicinalProductIngredientImpl();
		return medicinalProductIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSpecifiedSubstance createMedicinalProductIngredientSpecifiedSubstance() {
		MedicinalProductIngredientSpecifiedSubstanceImpl medicinalProductIngredientSpecifiedSubstance = new MedicinalProductIngredientSpecifiedSubstanceImpl();
		return medicinalProductIngredientSpecifiedSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSpecifiedSubstanceStrength createMedicinalProductIngredientSpecifiedSubstanceStrength() {
		MedicinalProductIngredientSpecifiedSubstanceStrengthImpl medicinalProductIngredientSpecifiedSubstanceStrength = new MedicinalProductIngredientSpecifiedSubstanceStrengthImpl();
		return medicinalProductIngredientSpecifiedSubstanceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength createMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength() {
		MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength = new MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl();
		return medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSubstance createMedicinalProductIngredientSubstance() {
		MedicinalProductIngredientSubstanceImpl medicinalProductIngredientSubstance = new MedicinalProductIngredientSubstanceImpl();
		return medicinalProductIngredientSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackaged createMedicinalProductPackaged() {
		MedicinalProductPackagedImpl medicinalProductPackaged = new MedicinalProductPackagedImpl();
		return medicinalProductPackaged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackagedBatchIdentifier createMedicinalProductPackagedBatchIdentifier() {
		MedicinalProductPackagedBatchIdentifierImpl medicinalProductPackagedBatchIdentifier = new MedicinalProductPackagedBatchIdentifierImpl();
		return medicinalProductPackagedBatchIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackagedPackageItem createMedicinalProductPackagedPackageItem() {
		MedicinalProductPackagedPackageItemImpl medicinalProductPackagedPackageItem = new MedicinalProductPackagedPackageItemImpl();
		return medicinalProductPackagedPackageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorization createMedicinalProductAuthorization() {
		MedicinalProductAuthorizationImpl medicinalProductAuthorization = new MedicinalProductAuthorizationImpl();
		return medicinalProductAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorizationJurisdictionalAuthorization createMedicinalProductAuthorizationJurisdictionalAuthorization() {
		MedicinalProductAuthorizationJurisdictionalAuthorizationImpl medicinalProductAuthorizationJurisdictionalAuthorization = new MedicinalProductAuthorizationJurisdictionalAuthorizationImpl();
		return medicinalProductAuthorizationJurisdictionalAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorizationProcedure createMedicinalProductAuthorizationProcedure() {
		MedicinalProductAuthorizationProcedureImpl medicinalProductAuthorizationProcedure = new MedicinalProductAuthorizationProcedureImpl();
		return medicinalProductAuthorizationProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductManufactured createMedicinalProductManufactured() {
		MedicinalProductManufacturedImpl medicinalProductManufactured = new MedicinalProductManufacturedImpl();
		return medicinalProductManufactured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudy createResearchStudy() {
		ResearchStudyImpl researchStudy = new ResearchStudyImpl();
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyArm createResearchStudyArm() {
		ResearchStudyArmImpl researchStudyArm = new ResearchStudyArmImpl();
		return researchStudyArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyObjective createResearchStudyObjective() {
		ResearchStudyObjectiveImpl researchStudyObjective = new ResearchStudyObjectiveImpl();
		return researchStudyObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariable createEvidenceVariable() {
		EvidenceVariableImpl evidenceVariable = new EvidenceVariableImpl();
		return evidenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableCharacteristic createEvidenceVariableCharacteristic() {
		EvidenceVariableCharacteristicImpl evidenceVariableCharacteristic = new EvidenceVariableCharacteristicImpl();
		return evidenceVariableCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchSubject createResearchSubject() {
		ResearchSubjectImpl researchSubject = new ResearchSubjectImpl();
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentPolicy createConsentPolicy() {
		ConsentPolicyImpl consentPolicy = new ConsentPolicyImpl();
		return consentPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentVerification createConsentVerification() {
		ConsentVerificationImpl consentVerification = new ConsentVerificationImpl();
		return consentVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consentprovision createConsentprovision() {
		ConsentprovisionImpl consentprovision = new ConsentprovisionImpl();
		return consentprovision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentprovisionprovisionActor createConsentprovisionprovisionActor() {
		ConsentprovisionprovisionActorImpl consentprovisionprovisionActor = new ConsentprovisionprovisionActorImpl();
		return consentprovisionprovisionActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentprovisionprovisionData createConsentprovisionprovisionData() {
		ConsentprovisionprovisionDataImpl consentprovisionprovisionData = new ConsentprovisionprovisionDataImpl();
		return consentprovisionprovisionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinition createEventDefinition() {
		EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItem createChargeItem() {
		ChargeItemImpl chargeItem = new ChargeItemImpl();
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinition createChargeItemDefinition() {
		ChargeItemDefinitionImpl chargeItemDefinition = new ChargeItemDefinitionImpl();
		return chargeItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionApplicability createChargeItemDefinitionApplicability() {
		ChargeItemDefinitionApplicabilityImpl chargeItemDefinitionApplicability = new ChargeItemDefinitionApplicabilityImpl();
		return chargeItemDefinitionApplicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionPropertyGroup createChargeItemDefinitionPropertyGroup() {
		ChargeItemDefinitionPropertyGroupImpl chargeItemDefinitionPropertyGroup = new ChargeItemDefinitionPropertyGroupImpl();
		return chargeItemDefinitionPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionPropertyGroupPriceComponent createChargeItemDefinitionPropertyGroupPriceComponent() {
		ChargeItemDefinitionPropertyGroupPriceComponentImpl chargeItemDefinitionPropertyGroupPriceComponent = new ChargeItemDefinitionPropertyGroupPriceComponentImpl();
		return chargeItemDefinitionPropertyGroupPriceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemPerformer createChargeItemPerformer() {
		ChargeItemPerformerImpl chargeItemPerformer = new ChargeItemPerformerImpl();
		return chargeItemPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReportMedia createDiagnosticReportMedia() {
		DiagnosticReportMediaImpl diagnosticReportMedia = new DiagnosticReportMediaImpl();
		return diagnosticReportMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudySeriesPerformer createImagingStudySeriesPerformer() {
		ImagingStudySeriesPerformerImpl imagingStudySeriesPerformer = new ImagingStudySeriesPerformerImpl();
		return imagingStudySeriesPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudySeriesInstance createImagingStudySeriesInstance() {
		ImagingStudySeriesInstanceImpl imagingStudySeriesInstance = new ImagingStudySeriesInstanceImpl();
		return imagingStudySeriesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseItemAdjudication createClaimResponseItemAdjudication() {
		ClaimResponseItemAdjudicationImpl claimResponseItemAdjudication = new ClaimResponseItemAdjudicationImpl();
		return claimResponseItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseItemItemDetail createClaimResponseItemItemDetail() {
		ClaimResponseItemItemDetailImpl claimResponseItemItemDetail = new ClaimResponseItemItemDetailImpl();
		return claimResponseItemItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseItemItemDetailSubDetail createClaimResponseItemItemDetailSubDetail() {
		ClaimResponseItemItemDetailSubDetailImpl claimResponseItemItemDetailSubDetail = new ClaimResponseItemItemDetailSubDetailImpl();
		return claimResponseItemItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseAddedItem createClaimResponseAddedItem() {
		ClaimResponseAddedItemImpl claimResponseAddedItem = new ClaimResponseAddedItemImpl();
		return claimResponseAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseAddedItemAddedItemDetail createClaimResponseAddedItemAddedItemDetail() {
		ClaimResponseAddedItemAddedItemDetailImpl claimResponseAddedItemAddedItemDetail = new ClaimResponseAddedItemAddedItemDetailImpl();
		return claimResponseAddedItemAddedItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail createClaimResponseAddedItemAddedItemDetailAddedItemSubDetail() {
		ClaimResponseAddedItemAddedItemDetailAddedItemSubDetailImpl claimResponseAddedItemAddedItemDetailAddedItemSubDetail = new ClaimResponseAddedItemAddedItemDetailAddedItemSubDetailImpl();
		return claimResponseAddedItemAddedItemDetailAddedItemSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseTotal createClaimResponseTotal() {
		ClaimResponseTotalImpl claimResponseTotal = new ClaimResponseTotalImpl();
		return claimResponseTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseNote createClaimResponseNote() {
		ClaimResponseNoteImpl claimResponseNote = new ClaimResponseNoteImpl();
		return claimResponseNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseInsurance createClaimResponseInsurance() {
		ClaimResponseInsuranceImpl claimResponseInsurance = new ClaimResponseInsuranceImpl();
		return claimResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimRelatedClaim createClaimRelatedClaim() {
		ClaimRelatedClaimImpl claimRelatedClaim = new ClaimRelatedClaimImpl();
		return claimRelatedClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimSupportingInformation createClaimSupportingInformation() {
		ClaimSupportingInformationImpl claimSupportingInformation = new ClaimSupportingInformationImpl();
		return claimSupportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimInsurance createClaimInsurance() {
		ClaimInsuranceImpl claimInsurance = new ClaimInsuranceImpl();
		return claimInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimItemDetail createClaimItemDetail() {
		ClaimItemDetailImpl claimItemDetail = new ClaimItemDetailImpl();
		return claimItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimItemDetailSubDetail createClaimItemDetailSubDetail() {
		ClaimItemDetailSubDetailImpl claimItemDetailSubDetail = new ClaimItemDetailSubDetailImpl();
		return claimItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceRequest createDeviceRequest() {
		DeviceRequestImpl deviceRequest = new DeviceRequestImpl();
		return deviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceRequestParameter createDeviceRequestParameter() {
		DeviceRequestParameterImpl deviceRequestParameter = new DeviceRequestParameterImpl();
		return deviceRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceEligibility createHealthcareServiceEligibility() {
		HealthcareServiceEligibilityImpl healthcareServiceEligibility = new HealthcareServiceEligibilityImpl();
		return healthcareServiceEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyStructure createBodyStructure() {
		BodyStructureImpl bodyStructure = new BodyStructureImpl();
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRestriction createTaskRestriction() {
		TaskRestrictionImpl taskRestriction = new TaskRestrictionImpl();
		return taskRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskParameter createTaskParameter() {
		TaskParameterImpl taskParameter = new TaskParameterImpl();
		return taskParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemEnableWhen createQuestionnaireItemEnableWhen() {
		QuestionnaireItemEnableWhenImpl questionnaireItemEnableWhen = new QuestionnaireItemEnableWhenImpl();
		return questionnaireItemEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemAnswerOption createQuestionnaireItemAnswerOption() {
		QuestionnaireItemAnswerOptionImpl questionnaireItemAnswerOption = new QuestionnaireItemAnswerOptionImpl();
		return questionnaireItemAnswerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemInitial createQuestionnaireItemInitial() {
		QuestionnaireItemInitialImpl questionnaireItemInitial = new QuestionnaireItemInitialImpl();
		return questionnaireItemInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponseItemAnswer createQuestionnaireResponseItemAnswer() {
		QuestionnaireResponseItemAnswerImpl questionnaireResponseItemAnswer = new QuestionnaireResponseItemAnswerImpl();
		return questionnaireResponseItemAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitRelatedClaim createExplanationOfBenefitRelatedClaim() {
		ExplanationOfBenefitRelatedClaimImpl explanationOfBenefitRelatedClaim = new ExplanationOfBenefitRelatedClaimImpl();
		return explanationOfBenefitRelatedClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitSupportingInformation createExplanationOfBenefitSupportingInformation() {
		ExplanationOfBenefitSupportingInformationImpl explanationOfBenefitSupportingInformation = new ExplanationOfBenefitSupportingInformationImpl();
		return explanationOfBenefitSupportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance() {
		ExplanationOfBenefitInsuranceImpl explanationOfBenefitInsurance = new ExplanationOfBenefitInsuranceImpl();
		return explanationOfBenefitInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitItemAdjudication createExplanationOfBenefitItemAdjudication() {
		ExplanationOfBenefitItemAdjudicationImpl explanationOfBenefitItemAdjudication = new ExplanationOfBenefitItemAdjudicationImpl();
		return explanationOfBenefitItemAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitItemDetail createExplanationOfBenefitItemDetail() {
		ExplanationOfBenefitItemDetailImpl explanationOfBenefitItemDetail = new ExplanationOfBenefitItemDetailImpl();
		return explanationOfBenefitItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitItemDetailSubDetail createExplanationOfBenefitItemDetailSubDetail() {
		ExplanationOfBenefitItemDetailSubDetailImpl explanationOfBenefitItemDetailSubDetail = new ExplanationOfBenefitItemDetailSubDetailImpl();
		return explanationOfBenefitItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAddedItem createExplanationOfBenefitAddedItem() {
		ExplanationOfBenefitAddedItemImpl explanationOfBenefitAddedItem = new ExplanationOfBenefitAddedItemImpl();
		return explanationOfBenefitAddedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAddedItemAddedItemDetail createExplanationOfBenefitAddedItemAddedItemDetail() {
		ExplanationOfBenefitAddedItemAddedItemDetailImpl explanationOfBenefitAddedItemAddedItemDetail = new ExplanationOfBenefitAddedItemAddedItemDetailImpl();
		return explanationOfBenefitAddedItemAddedItemDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail createExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail() {
		ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetailImpl explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail = new ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetailImpl();
		return explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitTotal createExplanationOfBenefitTotal() {
		ExplanationOfBenefitTotalImpl explanationOfBenefitTotal = new ExplanationOfBenefitTotalImpl();
		return explanationOfBenefitTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitNote createExplanationOfBenefitNote() {
		ExplanationOfBenefitNoteImpl explanationOfBenefitNote = new ExplanationOfBenefitNoteImpl();
		return explanationOfBenefitNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitBenefitBalanceBenefit createExplanationOfBenefitBenefitBalanceBenefit() {
		ExplanationOfBenefitBenefitBalanceBenefitImpl explanationOfBenefitBenefitBalanceBenefit = new ExplanationOfBenefitBenefitBalanceBenefitImpl();
		return explanationOfBenefitBenefitBalanceBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupSourceElement createConceptMapGroupSourceElement() {
		ConceptMapGroupSourceElementImpl conceptMapGroupSourceElement = new ConceptMapGroupSourceElementImpl();
		return conceptMapGroupSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupSourceElementTargetElement createConceptMapGroupSourceElementTargetElement() {
		ConceptMapGroupSourceElementTargetElementImpl conceptMapGroupSourceElementTargetElement = new ConceptMapGroupSourceElementTargetElementImpl();
		return conceptMapGroupSourceElementTargetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupSourceElementTargetElementOtherElement createConceptMapGroupSourceElementTargetElementOtherElement() {
		ConceptMapGroupSourceElementTargetElementOtherElementImpl conceptMapGroupSourceElementTargetElementOtherElement = new ConceptMapGroupSourceElementTargetElementOtherElementImpl();
		return conceptMapGroupSourceElementTargetElementOtherElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemConceptDefinition createCodeSystemConceptDefinition() {
		CodeSystemConceptDefinitionImpl codeSystemConceptDefinition = new CodeSystemConceptDefinitionImpl();
		return codeSystemConceptDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemConceptDefinitionDesignation createCodeSystemConceptDefinitionDesignation() {
		CodeSystemConceptDefinitionDesignationImpl codeSystemConceptDefinitionDesignation = new CodeSystemConceptDefinitionDesignationImpl();
		return codeSystemConceptDefinitionDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemConceptDefinitionConceptProperty createCodeSystemConceptDefinitionConceptProperty() {
		CodeSystemConceptDefinitionConceptPropertyImpl codeSystemConceptDefinitionConceptProperty = new CodeSystemConceptDefinitionConceptPropertyImpl();
		return codeSystemConceptDefinitionConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupUnmapped createConceptMapGroupUnmapped() {
		ConceptMapGroupUnmappedImpl conceptMapGroupUnmapped = new ConceptMapGroupUnmappedImpl();
		return conceptMapGroupUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroup createRequestGroup() {
		RequestGroupImpl requestGroup = new RequestGroupImpl();
		return requestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupAction createRequestGroupAction() {
		RequestGroupActionImpl requestGroupAction = new RequestGroupActionImpl();
		return requestGroupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupActionCondition createRequestGroupActionCondition() {
		RequestGroupActionConditionImpl requestGroupActionCondition = new RequestGroupActionConditionImpl();
		return requestGroupActionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupActionRelatedAction createRequestGroupActionRelatedAction() {
		RequestGroupActionRelatedActionImpl requestGroupActionRelatedAction = new RequestGroupActionRelatedActionImpl();
		return requestGroupActionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilities createTerminologyCapabilities() {
		TerminologyCapabilitiesImpl terminologyCapabilities = new TerminologyCapabilitiesImpl();
		return terminologyCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesSoftware createTerminologyCapabilitiesSoftware() {
		TerminologyCapabilitiesSoftwareImpl terminologyCapabilitiesSoftware = new TerminologyCapabilitiesSoftwareImpl();
		return terminologyCapabilitiesSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesImplementation createTerminologyCapabilitiesImplementation() {
		TerminologyCapabilitiesImplementationImpl terminologyCapabilitiesImplementation = new TerminologyCapabilitiesImplementationImpl();
		return terminologyCapabilitiesImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesCodeSystem createTerminologyCapabilitiesCodeSystem() {
		TerminologyCapabilitiesCodeSystemImpl terminologyCapabilitiesCodeSystem = new TerminologyCapabilitiesCodeSystemImpl();
		return terminologyCapabilitiesCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesCodeSystemVersion createTerminologyCapabilitiesCodeSystemVersion() {
		TerminologyCapabilitiesCodeSystemVersionImpl terminologyCapabilitiesCodeSystemVersion = new TerminologyCapabilitiesCodeSystemVersionImpl();
		return terminologyCapabilitiesCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesCodeSystemVersionFilter createTerminologyCapabilitiesCodeSystemVersionFilter() {
		TerminologyCapabilitiesCodeSystemVersionFilterImpl terminologyCapabilitiesCodeSystemVersionFilter = new TerminologyCapabilitiesCodeSystemVersionFilterImpl();
		return terminologyCapabilitiesCodeSystemVersionFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesExpansion createTerminologyCapabilitiesExpansion() {
		TerminologyCapabilitiesExpansionImpl terminologyCapabilitiesExpansion = new TerminologyCapabilitiesExpansionImpl();
		return terminologyCapabilitiesExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesExpansionParameter createTerminologyCapabilitiesExpansionParameter() {
		TerminologyCapabilitiesExpansionParameterImpl terminologyCapabilitiesExpansionParameter = new TerminologyCapabilitiesExpansionParameterImpl();
		return terminologyCapabilitiesExpansionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesValidateCode createTerminologyCapabilitiesValidateCode() {
		TerminologyCapabilitiesValidateCodeImpl terminologyCapabilitiesValidateCode = new TerminologyCapabilitiesValidateCodeImpl();
		return terminologyCapabilitiesValidateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesTranslation createTerminologyCapabilitiesTranslation() {
		TerminologyCapabilitiesTranslationImpl terminologyCapabilitiesTranslation = new TerminologyCapabilitiesTranslationImpl();
		return terminologyCapabilitiesTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesClosure createTerminologyCapabilitiesClosure() {
		TerminologyCapabilitiesClosureImpl terminologyCapabilitiesClosure = new TerminologyCapabilitiesClosureImpl();
		return terminologyCapabilitiesClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEvaluation createImmunizationEvaluation() {
		ImmunizationEvaluationImpl immunizationEvaluation = new ImmunizationEvaluationImpl();
		return immunizationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationPerformer createImmunizationPerformer() {
		ImmunizationPerformerImpl immunizationPerformer = new ImmunizationPerformerImpl();
		return immunizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEducation createImmunizationEducation() {
		ImmunizationEducationImpl immunizationEducation = new ImmunizationEducationImpl();
		return immunizationEducation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationProtocolApplied createImmunizationProtocolApplied() {
		ImmunizationProtocolAppliedImpl immunizationProtocolApplied = new ImmunizationProtocolAppliedImpl();
		return immunizationProtocolApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIndication createMedicinalProductIndication() {
		MedicinalProductIndicationImpl medicinalProductIndication = new MedicinalProductIndicationImpl();
		return medicinalProductIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIndicationOtherTherapy createMedicinalProductIndicationOtherTherapy() {
		MedicinalProductIndicationOtherTherapyImpl medicinalProductIndicationOtherTherapy = new MedicinalProductIndicationOtherTherapyImpl();
		return medicinalProductIndicationOtherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductUndesirableEffect createMedicinalProductUndesirableEffect() {
		MedicinalProductUndesirableEffectImpl medicinalProductUndesirableEffect = new MedicinalProductUndesirableEffectImpl();
		return medicinalProductUndesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDependsOn createImplementationGuideDependsOn() {
		ImplementationGuideDependsOnImpl implementationGuideDependsOn = new ImplementationGuideDependsOnImpl();
		return implementationGuideDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinition createImplementationGuideDefinition() {
		ImplementationGuideDefinitionImpl implementationGuideDefinition = new ImplementationGuideDefinitionImpl();
		return implementationGuideDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinitionGrouping createImplementationGuideDefinitionGrouping() {
		ImplementationGuideDefinitionGroupingImpl implementationGuideDefinitionGrouping = new ImplementationGuideDefinitionGroupingImpl();
		return implementationGuideDefinitionGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinitionResource createImplementationGuideDefinitionResource() {
		ImplementationGuideDefinitionResourceImpl implementationGuideDefinitionResource = new ImplementationGuideDefinitionResourceImpl();
		return implementationGuideDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinitionPage createImplementationGuideDefinitionPage() {
		ImplementationGuideDefinitionPageImpl implementationGuideDefinitionPage = new ImplementationGuideDefinitionPageImpl();
		return implementationGuideDefinitionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinitionParameter createImplementationGuideDefinitionParameter() {
		ImplementationGuideDefinitionParameterImpl implementationGuideDefinitionParameter = new ImplementationGuideDefinitionParameterImpl();
		return implementationGuideDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinitionTemplate createImplementationGuideDefinitionTemplate() {
		ImplementationGuideDefinitionTemplateImpl implementationGuideDefinitionTemplate = new ImplementationGuideDefinitionTemplateImpl();
		return implementationGuideDefinitionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideManifest createImplementationGuideManifest() {
		ImplementationGuideManifestImpl implementationGuideManifest = new ImplementationGuideManifestImpl();
		return implementationGuideManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideManifestManifestResource createImplementationGuideManifestManifestResource() {
		ImplementationGuideManifestManifestResourceImpl implementationGuideManifestManifestResource = new ImplementationGuideManifestManifestResourceImpl();
		return implementationGuideManifestManifestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideManifestManifestPage createImplementationGuideManifestManifestPage() {
		ImplementationGuideManifestManifestPageImpl implementationGuideManifestManifestPage = new ImplementationGuideManifestManifestPageImpl();
		return implementationGuideManifestManifestPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameterComponent createSearchParameterComponent() {
		SearchParameterComponentImpl searchParameterComponent = new SearchParameterComponentImpl();
		return searchParameterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionParameterBinding createOperationDefinitionParameterBinding() {
		OperationDefinitionParameterBindingImpl operationDefinitionParameterBinding = new OperationDefinitionParameterBindingImpl();
		return operationDefinitionParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionParameterReferencedFrom createOperationDefinitionParameterReferencedFrom() {
		OperationDefinitionParameterReferencedFromImpl operationDefinitionParameterReferencedFrom = new OperationDefinitionParameterReferencedFromImpl();
		return operationDefinitionParameterReferencedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionOverload createOperationDefinitionOverload() {
		OperationDefinitionOverloadImpl operationDefinitionOverload = new OperationDefinitionOverloadImpl();
		return operationDefinitionOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliationDetails createPaymentReconciliationDetails() {
		PaymentReconciliationDetailsImpl paymentReconciliationDetails = new PaymentReconciliationDetailsImpl();
		return paymentReconciliationDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliationNotes createPaymentReconciliationNotes() {
		PaymentReconciliationNotesImpl paymentReconciliationNotes = new PaymentReconciliationNotesImpl();
		return paymentReconciliationNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRoleAvailableTime createPractitionerRoleAvailableTime() {
		PractitionerRoleAvailableTimeImpl practitionerRoleAvailableTime = new PractitionerRoleAvailableTimeImpl();
		return practitionerRoleAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRoleNotAvailable createPractitionerRoleNotAvailable() {
		PractitionerRoleNotAvailableImpl practitionerRoleNotAvailable = new PractitionerRoleNotAvailableImpl();
		return practitionerRoleNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationAffiliation createOrganizationAffiliation() {
		OrganizationAffiliationImpl organizationAffiliation = new OrganizationAffiliationImpl();
		return organizationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchDefinition createResearchDefinition() {
		ResearchDefinitionImpl researchDefinition = new ResearchDefinitionImpl();
		return researchDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchElementDefinition createResearchElementDefinition() {
		ResearchElementDefinitionImpl researchElementDefinition = new ResearchElementDefinitionImpl();
		return researchElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchElementDefinitionCharacteristic createResearchElementDefinitionCharacteristic() {
		ResearchElementDefinitionCharacteristicImpl researchElementDefinitionCharacteristic = new ResearchElementDefinitionCharacteristicImpl();
		return researchElementDefinitionCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEvent createAdverseEvent() {
		AdverseEventImpl adverseEvent = new AdverseEventImpl();
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventSuspectEntity createAdverseEventSuspectEntity() {
		AdverseEventSuspectEntityImpl adverseEventSuspectEntity = new AdverseEventSuspectEntityImpl();
		return adverseEventSuspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventSuspectEntityCausality createAdverseEventSuspectEntityCausality() {
		AdverseEventSuspectEntityCausalityImpl adverseEventSuspectEntityCausality = new AdverseEventSuspectEntityCausalityImpl();
		return adverseEventSuspectEntityCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesis createRiskEvidenceSynthesis() {
		RiskEvidenceSynthesisImpl riskEvidenceSynthesis = new RiskEvidenceSynthesisImpl();
		return riskEvidenceSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisSampleSize createRiskEvidenceSynthesisSampleSize() {
		RiskEvidenceSynthesisSampleSizeImpl riskEvidenceSynthesisSampleSize = new RiskEvidenceSynthesisSampleSizeImpl();
		return riskEvidenceSynthesisSampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisRiskEstimate createRiskEvidenceSynthesisRiskEstimate() {
		RiskEvidenceSynthesisRiskEstimateImpl riskEvidenceSynthesisRiskEstimate = new RiskEvidenceSynthesisRiskEstimateImpl();
		return riskEvidenceSynthesisRiskEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisRiskEstimatePrecisionEstimate createRiskEvidenceSynthesisRiskEstimatePrecisionEstimate() {
		RiskEvidenceSynthesisRiskEstimatePrecisionEstimateImpl riskEvidenceSynthesisRiskEstimatePrecisionEstimate = new RiskEvidenceSynthesisRiskEstimatePrecisionEstimateImpl();
		return riskEvidenceSynthesisRiskEstimatePrecisionEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisCertainty createRiskEvidenceSynthesisCertainty() {
		RiskEvidenceSynthesisCertaintyImpl riskEvidenceSynthesisCertainty = new RiskEvidenceSynthesisCertaintyImpl();
		return riskEvidenceSynthesisCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisCertaintyCertaintySubcomponent createRiskEvidenceSynthesisCertaintyCertaintySubcomponent() {
		RiskEvidenceSynthesisCertaintyCertaintySubcomponentImpl riskEvidenceSynthesisCertaintyCertaintySubcomponent = new RiskEvidenceSynthesisCertaintyCertaintySubcomponentImpl();
		return riskEvidenceSynthesisCertaintyCertaintySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptMetadataLink createTestScriptMetadataLink() {
		TestScriptMetadataLinkImpl testScriptMetadataLink = new TestScriptMetadataLinkImpl();
		return testScriptMetadataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptMetadataCapability createTestScriptMetadataCapability() {
		TestScriptMetadataCapabilityImpl testScriptMetadataCapability = new TestScriptMetadataCapabilityImpl();
		return testScriptMetadataCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatement createCapabilityStatement() {
		CapabilityStatementImpl capabilityStatement = new CapabilityStatementImpl();
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSoftware createCapabilityStatementSoftware() {
		CapabilityStatementSoftwareImpl capabilityStatementSoftware = new CapabilityStatementSoftwareImpl();
		return capabilityStatementSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementImplementation createCapabilityStatementImplementation() {
		CapabilityStatementImplementationImpl capabilityStatementImplementation = new CapabilityStatementImplementationImpl();
		return capabilityStatementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRest createCapabilityStatementRest() {
		CapabilityStatementRestImpl capabilityStatementRest = new CapabilityStatementRestImpl();
		return capabilityStatementRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestSecurity createCapabilityStatementRestSecurity() {
		CapabilityStatementRestSecurityImpl capabilityStatementRestSecurity = new CapabilityStatementRestSecurityImpl();
		return capabilityStatementRestSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestResource createCapabilityStatementRestResource() {
		CapabilityStatementRestResourceImpl capabilityStatementRestResource = new CapabilityStatementRestResourceImpl();
		return capabilityStatementRestResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestResourceResourceInteraction createCapabilityStatementRestResourceResourceInteraction() {
		CapabilityStatementRestResourceResourceInteractionImpl capabilityStatementRestResourceResourceInteraction = new CapabilityStatementRestResourceResourceInteractionImpl();
		return capabilityStatementRestResourceResourceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestResourceSearchParam createCapabilityStatementRestResourceSearchParam() {
		CapabilityStatementRestResourceSearchParamImpl capabilityStatementRestResourceSearchParam = new CapabilityStatementRestResourceSearchParamImpl();
		return capabilityStatementRestResourceSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestResourceOperation createCapabilityStatementRestResourceOperation() {
		CapabilityStatementRestResourceOperationImpl capabilityStatementRestResourceOperation = new CapabilityStatementRestResourceOperationImpl();
		return capabilityStatementRestResourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRestSystemInteraction createCapabilityStatementRestSystemInteraction() {
		CapabilityStatementRestSystemInteractionImpl capabilityStatementRestSystemInteraction = new CapabilityStatementRestSystemInteractionImpl();
		return capabilityStatementRestSystemInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementMessaging createCapabilityStatementMessaging() {
		CapabilityStatementMessagingImpl capabilityStatementMessaging = new CapabilityStatementMessagingImpl();
		return capabilityStatementMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementMessagingEndpoint createCapabilityStatementMessagingEndpoint() {
		CapabilityStatementMessagingEndpointImpl capabilityStatementMessagingEndpoint = new CapabilityStatementMessagingEndpointImpl();
		return capabilityStatementMessagingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementMessagingSupportedMessage createCapabilityStatementMessagingSupportedMessage() {
		CapabilityStatementMessagingSupportedMessageImpl capabilityStatementMessagingSupportedMessage = new CapabilityStatementMessagingSupportedMessageImpl();
		return capabilityStatementMessagingSupportedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinitionFocus createMessageDefinitionFocus() {
		MessageDefinitionFocusImpl messageDefinitionFocus = new MessageDefinitionFocusImpl();
		return messageDefinitionFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse() {
		MessageDefinitionAllowedResponseImpl messageDefinitionAllowedResponse = new MessageDefinitionAllowedResponseImpl();
		return messageDefinitionAllowedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinition createGraphDefinition() {
		GraphDefinitionImpl graphDefinition = new GraphDefinitionImpl();
		return graphDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionLink createGraphDefinitionLink() {
		GraphDefinitionLinkImpl graphDefinitionLink = new GraphDefinitionLinkImpl();
		return graphDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionLinkTarget createGraphDefinitionLinkTarget() {
		GraphDefinitionLinkTargetImpl graphDefinitionLinkTarget = new GraphDefinitionLinkTargetImpl();
		return graphDefinitionLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionLinkTargetCompartment createGraphDefinitionLinkTargetCompartment() {
		GraphDefinitionLinkTargetCompartmentImpl graphDefinitionLinkTargetCompartment = new GraphDefinitionLinkTargetCompartmentImpl();
		return graphDefinitionLinkTargetCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementDocument createCapabilityStatementDocument() {
		CapabilityStatementDocumentImpl capabilityStatementDocument = new CapabilityStatementDocumentImpl();
		return capabilityStatementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetupSetupAction createTestScriptSetupSetupAction() {
		TestScriptSetupSetupActionImpl testScriptSetupSetupAction = new TestScriptSetupSetupActionImpl();
		return testScriptSetupSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetupSetupActionOperation createTestScriptSetupSetupActionOperation() {
		TestScriptSetupSetupActionOperationImpl testScriptSetupSetupActionOperation = new TestScriptSetupSetupActionOperationImpl();
		return testScriptSetupSetupActionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetupSetupActionOperationRequestHeader createTestScriptSetupSetupActionOperationRequestHeader() {
		TestScriptSetupSetupActionOperationRequestHeaderImpl testScriptSetupSetupActionOperationRequestHeader = new TestScriptSetupSetupActionOperationRequestHeaderImpl();
		return testScriptSetupSetupActionOperationRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetupSetupActionAssert createTestScriptSetupSetupActionAssert() {
		TestScriptSetupSetupActionAssertImpl testScriptSetupSetupActionAssert = new TestScriptSetupSetupActionAssertImpl();
		return testScriptSetupSetupActionAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTestTestAction createTestScriptTestTestAction() {
		TestScriptTestTestActionImpl testScriptTestTestAction = new TestScriptTestTestActionImpl();
		return testScriptTestTestAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTeardownTeardownAction createTestScriptTeardownTeardownAction() {
		TestScriptTeardownTeardownActionImpl testScriptTeardownTeardownAction = new TestScriptTeardownTeardownActionImpl();
		return testScriptTeardownTeardownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProduct createBiologicallyDerivedProduct() {
		BiologicallyDerivedProductImpl biologicallyDerivedProduct = new BiologicallyDerivedProductImpl();
		return biologicallyDerivedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCollection createBiologicallyDerivedProductCollection() {
		BiologicallyDerivedProductCollectionImpl biologicallyDerivedProductCollection = new BiologicallyDerivedProductCollectionImpl();
		return biologicallyDerivedProductCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductProcessing createBiologicallyDerivedProductProcessing() {
		BiologicallyDerivedProductProcessingImpl biologicallyDerivedProductProcessing = new BiologicallyDerivedProductProcessingImpl();
		return biologicallyDerivedProductProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductManipulation createBiologicallyDerivedProductManipulation() {
		BiologicallyDerivedProductManipulationImpl biologicallyDerivedProductManipulation = new BiologicallyDerivedProductManipulationImpl();
		return biologicallyDerivedProductManipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStorage createBiologicallyDerivedProductStorage() {
		BiologicallyDerivedProductStorageImpl biologicallyDerivedProductStorage = new BiologicallyDerivedProductStorageImpl();
		return biologicallyDerivedProductStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderMessageDestination createMessageHeaderMessageDestination() {
		MessageHeaderMessageDestinationImpl messageHeaderMessageDestination = new MessageHeaderMessageDestinationImpl();
		return messageHeaderMessageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderMessageSource createMessageHeaderMessageSource() {
		MessageHeaderMessageSourceImpl messageHeaderMessageSource = new MessageHeaderMessageSourceImpl();
		return messageHeaderMessageSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogEntry createCatalogEntry() {
		CatalogEntryImpl catalogEntry = new CatalogEntryImpl();
		return catalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogEntryRelatedEntry createCatalogEntryRelatedEntry() {
		CatalogEntryRelatedEntryImpl catalogEntryRelatedEntry = new CatalogEntryRelatedEntryImpl();
		return catalogEntryRelatedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionRelatesTo createCompositionRelatesTo() {
		CompositionRelatesToImpl compositionRelatesTo = new CompositionRelatesToImpl();
		return compositionRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcid createSubstanceNucleicAcid() {
		SubstanceNucleicAcidImpl substanceNucleicAcid = new SubstanceNucleicAcidImpl();
		return substanceNucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidSubunit createSubstanceNucleicAcidSubunit() {
		SubstanceNucleicAcidSubunitImpl substanceNucleicAcidSubunit = new SubstanceNucleicAcidSubunitImpl();
		return substanceNucleicAcidSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidSubunitLinkage createSubstanceNucleicAcidSubunitLinkage() {
		SubstanceNucleicAcidSubunitLinkageImpl substanceNucleicAcidSubunitLinkage = new SubstanceNucleicAcidSubunitLinkageImpl();
		return substanceNucleicAcidSubunitLinkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidSubunitSugar createSubstanceNucleicAcidSubunitSugar() {
		SubstanceNucleicAcidSubunitSugarImpl substanceNucleicAcidSubunitSugar = new SubstanceNucleicAcidSubunitSugarImpl();
		return substanceNucleicAcidSubunitSugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequestParameter createSupplyRequestParameter() {
		SupplyRequestParameterImpl supplyRequestParameter = new SupplyRequestParameterImpl();
		return supplyRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesis createEffectEvidenceSynthesis() {
		EffectEvidenceSynthesisImpl effectEvidenceSynthesis = new EffectEvidenceSynthesisImpl();
		return effectEvidenceSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisSampleSize createEffectEvidenceSynthesisSampleSize() {
		EffectEvidenceSynthesisSampleSizeImpl effectEvidenceSynthesisSampleSize = new EffectEvidenceSynthesisSampleSizeImpl();
		return effectEvidenceSynthesisSampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisResultsByExposure createEffectEvidenceSynthesisResultsByExposure() {
		EffectEvidenceSynthesisResultsByExposureImpl effectEvidenceSynthesisResultsByExposure = new EffectEvidenceSynthesisResultsByExposureImpl();
		return effectEvidenceSynthesisResultsByExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisEffectEstimate createEffectEvidenceSynthesisEffectEstimate() {
		EffectEvidenceSynthesisEffectEstimateImpl effectEvidenceSynthesisEffectEstimate = new EffectEvidenceSynthesisEffectEstimateImpl();
		return effectEvidenceSynthesisEffectEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisEffectEstimatePrecisionEstimate createEffectEvidenceSynthesisEffectEstimatePrecisionEstimate() {
		EffectEvidenceSynthesisEffectEstimatePrecisionEstimateImpl effectEvidenceSynthesisEffectEstimatePrecisionEstimate = new EffectEvidenceSynthesisEffectEstimatePrecisionEstimateImpl();
		return effectEvidenceSynthesisEffectEstimatePrecisionEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisCertainty createEffectEvidenceSynthesisCertainty() {
		EffectEvidenceSynthesisCertaintyImpl effectEvidenceSynthesisCertainty = new EffectEvidenceSynthesisCertaintyImpl();
		return effectEvidenceSynthesisCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisCertaintyCertaintySubcomponent createEffectEvidenceSynthesisCertaintyCertaintySubcomponent() {
		EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl effectEvidenceSynthesisCertaintyCertaintySubcomponent = new EffectEvidenceSynthesisCertaintyCertaintySubcomponentImpl();
		return effectEvidenceSynthesisCertaintyCertaintySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlan createInsurancePlan() {
		InsurancePlanImpl insurancePlan = new InsurancePlanImpl();
		return insurancePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanContact createInsurancePlanContact() {
		InsurancePlanContactImpl insurancePlanContact = new InsurancePlanContactImpl();
		return insurancePlanContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanCoverage createInsurancePlanCoverage() {
		InsurancePlanCoverageImpl insurancePlanCoverage = new InsurancePlanCoverageImpl();
		return insurancePlanCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanCoverageCoverageBenefit createInsurancePlanCoverageCoverageBenefit() {
		InsurancePlanCoverageCoverageBenefitImpl insurancePlanCoverageCoverageBenefit = new InsurancePlanCoverageCoverageBenefitImpl();
		return insurancePlanCoverageCoverageBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanCoverageCoverageBenefitLimit createInsurancePlanCoverageCoverageBenefitLimit() {
		InsurancePlanCoverageCoverageBenefitLimitImpl insurancePlanCoverageCoverageBenefitLimit = new InsurancePlanCoverageCoverageBenefitLimitImpl();
		return insurancePlanCoverageCoverageBenefitLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlan createInsurancePlanPlan() {
		InsurancePlanPlanImpl insurancePlanPlan = new InsurancePlanPlanImpl();
		return insurancePlanPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlanGeneralCost createInsurancePlanPlanGeneralCost() {
		InsurancePlanPlanGeneralCostImpl insurancePlanPlanGeneralCost = new InsurancePlanPlanGeneralCostImpl();
		return insurancePlanPlanGeneralCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlanSpecificCost createInsurancePlanPlanSpecificCost() {
		InsurancePlanPlanSpecificCostImpl insurancePlanPlanSpecificCost = new InsurancePlanPlanSpecificCostImpl();
		return insurancePlanPlanSpecificCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlanSpecificCostPlanBenefit createInsurancePlanPlanSpecificCostPlanBenefit() {
		InsurancePlanPlanSpecificCostPlanBenefitImpl insurancePlanPlanSpecificCostPlanBenefit = new InsurancePlanPlanSpecificCostPlanBenefitImpl();
		return insurancePlanPlanSpecificCostPlanBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlanSpecificCostPlanBenefitCost createInsurancePlanPlanSpecificCostPlanBenefitCost() {
		InsurancePlanPlanSpecificCostPlanBenefitCostImpl insurancePlanPlanSpecificCostPlanBenefitCost = new InsurancePlanPlanSpecificCostPlanBenefitCostImpl();
		return insurancePlanPlanSpecificCostPlanBenefitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformation createSubstanceReferenceInformation() {
		SubstanceReferenceInformationImpl substanceReferenceInformation = new SubstanceReferenceInformationImpl();
		return substanceReferenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationGene createSubstanceReferenceInformationGene() {
		SubstanceReferenceInformationGeneImpl substanceReferenceInformationGene = new SubstanceReferenceInformationGeneImpl();
		return substanceReferenceInformationGene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationGeneElement createSubstanceReferenceInformationGeneElement() {
		SubstanceReferenceInformationGeneElementImpl substanceReferenceInformationGeneElement = new SubstanceReferenceInformationGeneElementImpl();
		return substanceReferenceInformationGeneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationClassification createSubstanceReferenceInformationClassification() {
		SubstanceReferenceInformationClassificationImpl substanceReferenceInformationClassification = new SubstanceReferenceInformationClassificationImpl();
		return substanceReferenceInformationClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationTarget createSubstanceReferenceInformationTarget() {
		SubstanceReferenceInformationTargetImpl substanceReferenceInformationTarget = new SubstanceReferenceInformationTargetImpl();
		return substanceReferenceInformationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymer createSubstancePolymer() {
		SubstancePolymerImpl substancePolymer = new SubstancePolymerImpl();
		return substancePolymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerMonomerSet createSubstancePolymerMonomerSet() {
		SubstancePolymerMonomerSetImpl substancePolymerMonomerSet = new SubstancePolymerMonomerSetImpl();
		return substancePolymerMonomerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerMonomerSetStartingMaterial createSubstancePolymerMonomerSetStartingMaterial() {
		SubstancePolymerMonomerSetStartingMaterialImpl substancePolymerMonomerSetStartingMaterial = new SubstancePolymerMonomerSetStartingMaterialImpl();
		return substancePolymerMonomerSetStartingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeat createSubstancePolymerRepeat() {
		SubstancePolymerRepeatImpl substancePolymerRepeat = new SubstancePolymerRepeatImpl();
		return substancePolymerRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeatRepeatUnit createSubstancePolymerRepeatRepeatUnit() {
		SubstancePolymerRepeatRepeatUnitImpl substancePolymerRepeatRepeatUnit = new SubstancePolymerRepeatRepeatUnitImpl();
		return substancePolymerRepeatRepeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation createSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation() {
		SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationImpl substancePolymerRepeatRepeatUnitDegreeOfPolymerisation = new SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationImpl();
		return substancePolymerRepeatRepeatUnitDegreeOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeatRepeatUnitStructuralRepresentation createSubstancePolymerRepeatRepeatUnitStructuralRepresentation() {
		SubstancePolymerRepeatRepeatUnitStructuralRepresentationImpl substancePolymerRepeatRepeatUnitStructuralRepresentation = new SubstancePolymerRepeatRepeatUnitStructuralRepresentationImpl();
		return substancePolymerRepeatRepeatUnitStructuralRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceProtein createSubstanceProtein() {
		SubstanceProteinImpl substanceProtein = new SubstanceProteinImpl();
		return substanceProtein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceProteinSubunit createSubstanceProteinSubunit() {
		SubstanceProteinSubunitImpl substanceProteinSubunit = new SubstanceProteinSubunitImpl();
		return substanceProteinSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterial createSubstanceSourceMaterial() {
		SubstanceSourceMaterialImpl substanceSourceMaterial = new SubstanceSourceMaterialImpl();
		return substanceSourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialFractionDescription createSubstanceSourceMaterialFractionDescription() {
		SubstanceSourceMaterialFractionDescriptionImpl substanceSourceMaterialFractionDescription = new SubstanceSourceMaterialFractionDescriptionImpl();
		return substanceSourceMaterialFractionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganism createSubstanceSourceMaterialOrganism() {
		SubstanceSourceMaterialOrganismImpl substanceSourceMaterialOrganism = new SubstanceSourceMaterialOrganismImpl();
		return substanceSourceMaterialOrganism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganismAuthor createSubstanceSourceMaterialOrganismAuthor() {
		SubstanceSourceMaterialOrganismAuthorImpl substanceSourceMaterialOrganismAuthor = new SubstanceSourceMaterialOrganismAuthorImpl();
		return substanceSourceMaterialOrganismAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganismHybrid createSubstanceSourceMaterialOrganismHybrid() {
		SubstanceSourceMaterialOrganismHybridImpl substanceSourceMaterialOrganismHybrid = new SubstanceSourceMaterialOrganismHybridImpl();
		return substanceSourceMaterialOrganismHybrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganismOrganismGeneral createSubstanceSourceMaterialOrganismOrganismGeneral() {
		SubstanceSourceMaterialOrganismOrganismGeneralImpl substanceSourceMaterialOrganismOrganismGeneral = new SubstanceSourceMaterialOrganismOrganismGeneralImpl();
		return substanceSourceMaterialOrganismOrganismGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialPartDescription createSubstanceSourceMaterialPartDescription() {
		SubstanceSourceMaterialPartDescriptionImpl substanceSourceMaterialPartDescription = new SubstanceSourceMaterialPartDescriptionImpl();
		return substanceSourceMaterialPartDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductContraindication createMedicinalProductContraindication() {
		MedicinalProductContraindicationImpl medicinalProductContraindication = new MedicinalProductContraindicationImpl();
		return medicinalProductContraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductContraindicationOtherTherapy createMedicinalProductContraindicationOtherTherapy() {
		MedicinalProductContraindicationOtherTherapyImpl medicinalProductContraindicationOtherTherapy = new MedicinalProductContraindicationOtherTherapyImpl();
		return medicinalProductContraindicationOtherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequence createMolecularSequence() {
		MolecularSequenceImpl molecularSequence = new MolecularSequenceImpl();
		return molecularSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceReferenceSeq createMolecularSequenceReferenceSeq() {
		MolecularSequenceReferenceSeqImpl molecularSequenceReferenceSeq = new MolecularSequenceReferenceSeqImpl();
		return molecularSequenceReferenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceVariant createMolecularSequenceVariant() {
		MolecularSequenceVariantImpl molecularSequenceVariant = new MolecularSequenceVariantImpl();
		return molecularSequenceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceQuality createMolecularSequenceQuality() {
		MolecularSequenceQualityImpl molecularSequenceQuality = new MolecularSequenceQualityImpl();
		return molecularSequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceQualityRoc createMolecularSequenceQualityRoc() {
		MolecularSequenceQualityRocImpl molecularSequenceQualityRoc = new MolecularSequenceQualityRocImpl();
		return molecularSequenceQualityRoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceRepository createMolecularSequenceRepository() {
		MolecularSequenceRepositoryImpl molecularSequenceRepository = new MolecularSequenceRepositoryImpl();
		return molecularSequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceStructureVariant createMolecularSequenceStructureVariant() {
		MolecularSequenceStructureVariantImpl molecularSequenceStructureVariant = new MolecularSequenceStructureVariantImpl();
		return molecularSequenceStructureVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceStructureVariantOuter createMolecularSequenceStructureVariantOuter() {
		MolecularSequenceStructureVariantOuterImpl molecularSequenceStructureVariantOuter = new MolecularSequenceStructureVariantOuterImpl();
		return molecularSequenceStructureVariantOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceStructureVariantInner createMolecularSequenceStructureVariantInner() {
		MolecularSequenceStructureVariantInnerImpl molecularSequenceStructureVariantInner = new MolecularSequenceStructureVariantInnerImpl();
		return molecularSequenceStructureVariantInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceParticipant createInvoiceParticipant() {
		InvoiceParticipantImpl invoiceParticipant = new InvoiceParticipantImpl();
		return invoiceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceLineItem createInvoiceLineItem() {
		InvoiceLineItemImpl invoiceLineItem = new InvoiceLineItemImpl();
		return invoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceLineItemPriceComponent createInvoiceLineItemPriceComponent() {
		InvoiceLineItemPriceComponentImpl invoiceLineItemPriceComponent = new InvoiceLineItemPriceComponentImpl();
		return invoiceLineItemPriceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendationRecommendationDateCriterion createImmunizationRecommendationRecommendationDateCriterion() {
		ImmunizationRecommendationRecommendationDateCriterionImpl immunizationRecommendationRecommendationDateCriterion = new ImmunizationRecommendationRecommendationDateCriterionImpl();
		return immunizationRecommendationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResult createVerificationResult() {
		VerificationResultImpl verificationResult = new VerificationResultImpl();
		return verificationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultPrimarySource createVerificationResultPrimarySource() {
		VerificationResultPrimarySourceImpl verificationResultPrimarySource = new VerificationResultPrimarySourceImpl();
		return verificationResultPrimarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultAttestation createVerificationResultAttestation() {
		VerificationResultAttestationImpl verificationResultAttestation = new VerificationResultAttestationImpl();
		return verificationResultAttestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultValidator createVerificationResultValidator() {
		VerificationResultValidatorImpl verificationResultValidator = new VerificationResultValidatorImpl();
		return verificationResultValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entry_Resource createEntry_Resource() {
		Entry_ResourceImpl entry_Resource = new Entry_ResourceImpl();
		return entry_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleEntrySearch createBundleEntrySearch() {
		BundleEntrySearchImpl bundleEntrySearch = new BundleEntrySearchImpl();
		return bundleEntrySearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleEntryRequest createBundleEntryRequest() {
		BundleEntryRequestImpl bundleEntryRequest = new BundleEntryRequestImpl();
		return bundleEntryRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleEntryResponse createBundleEntryResponse() {
		BundleEntryResponseImpl bundleEntryResponse = new BundleEntryResponseImpl();
		return bundleEntryResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReport createTestReport() {
		TestReportImpl testReport = new TestReportImpl();
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportParticipant createTestReportParticipant() {
		TestReportParticipantImpl testReportParticipant = new TestReportParticipantImpl();
		return testReportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetup createTestReportSetup() {
		TestReportSetupImpl testReportSetup = new TestReportSetupImpl();
		return testReportSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetupSetupAction createTestReportSetupSetupAction() {
		TestReportSetupSetupActionImpl testReportSetupSetupAction = new TestReportSetupSetupActionImpl();
		return testReportSetupSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetupSetupActionOperation createTestReportSetupSetupActionOperation() {
		TestReportSetupSetupActionOperationImpl testReportSetupSetupActionOperation = new TestReportSetupSetupActionOperationImpl();
		return testReportSetupSetupActionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetupSetupActionAssert createTestReportSetupSetupActionAssert() {
		TestReportSetupSetupActionAssertImpl testReportSetupSetupActionAssert = new TestReportSetupSetupActionAssertImpl();
		return testReportSetupSetupActionAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTest createTestReportTest() {
		TestReportTestImpl testReportTest = new TestReportTestImpl();
		return testReportTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTestTestAction createTestReportTestTestAction() {
		TestReportTestTestActionImpl testReportTestTestAction = new TestReportTestTestActionImpl();
		return testReportTestTestAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTeardown createTestReportTeardown() {
		TestReportTeardownImpl testReportTeardown = new TestReportTeardownImpl();
		return testReportTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTeardownTeardownAction createTestReportTeardownTeardownAction() {
		TestReportTeardownTeardownActionImpl testReportTeardownTeardownAction = new TestReportTeardownTeardownActionImpl();
		return testReportTeardownTeardownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderOralDietNutrient createNutritionOrderOralDietNutrient() {
		NutritionOrderOralDietNutrientImpl nutritionOrderOralDietNutrient = new NutritionOrderOralDietNutrientImpl();
		return nutritionOrderOralDietNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderOralDietTexture createNutritionOrderOralDietTexture() {
		NutritionOrderOralDietTextureImpl nutritionOrderOralDietTexture = new NutritionOrderOralDietTextureImpl();
		return nutritionOrderOralDietTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderEnteralFormulaAdministration createNutritionOrderEnteralFormulaAdministration() {
		NutritionOrderEnteralFormulaAdministrationImpl nutritionOrderEnteralFormulaAdministration = new NutritionOrderEnteralFormulaAdministrationImpl();
		return nutritionOrderEnteralFormulaAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventAgentNetwork createAuditEventAgentNetwork() {
		AuditEventAgentNetworkImpl auditEventAgentNetwork = new AuditEventAgentNetworkImpl();
		return auditEventAgentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventEntityDetail createAuditEventEntityDetail() {
		AuditEventEntityDetailImpl auditEventEntityDetail = new AuditEventEntityDetailImpl();
		return auditEventEntityDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequest createCoverageEligibilityRequest() {
		CoverageEligibilityRequestImpl coverageEligibilityRequest = new CoverageEligibilityRequestImpl();
		return coverageEligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestSupportingInformation createCoverageEligibilityRequestSupportingInformation() {
		CoverageEligibilityRequestSupportingInformationImpl coverageEligibilityRequestSupportingInformation = new CoverageEligibilityRequestSupportingInformationImpl();
		return coverageEligibilityRequestSupportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestInsurance createCoverageEligibilityRequestInsurance() {
		CoverageEligibilityRequestInsuranceImpl coverageEligibilityRequestInsurance = new CoverageEligibilityRequestInsuranceImpl();
		return coverageEligibilityRequestInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestDetails createCoverageEligibilityRequestDetails() {
		CoverageEligibilityRequestDetailsImpl coverageEligibilityRequestDetails = new CoverageEligibilityRequestDetailsImpl();
		return coverageEligibilityRequestDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestDetailsDiagnosis createCoverageEligibilityRequestDetailsDiagnosis() {
		CoverageEligibilityRequestDetailsDiagnosisImpl coverageEligibilityRequestDetailsDiagnosis = new CoverageEligibilityRequestDetailsDiagnosisImpl();
		return coverageEligibilityRequestDetailsDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductInteraction createMedicinalProductInteraction() {
		MedicinalProductInteractionImpl medicinalProductInteraction = new MedicinalProductInteractionImpl();
		return medicinalProductInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductInteractionInteractant createMedicinalProductInteractionInteractant() {
		MedicinalProductInteractionInteractantImpl medicinalProductInteractionInteractant = new MedicinalProductInteractionInteractantImpl();
		return medicinalProductInteractionInteractant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescriptionLensSpecification createVisionPrescriptionLensSpecification() {
		VisionPrescriptionLensSpecificationImpl visionPrescriptionLensSpecification = new VisionPrescriptionLensSpecificationImpl();
		return visionPrescriptionLensSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescriptionLensSpecificationPrism createVisionPrescriptionLensSpecificationPrism() {
		VisionPrescriptionLensSpecificationPrismImpl visionPrescriptionLensSpecificationPrism = new VisionPrescriptionLensSpecificationPrismImpl();
		return visionPrescriptionLensSpecificationPrism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDeliverySuppliedItem createSupplyDeliverySuppliedItem() {
		SupplyDeliverySuppliedItemImpl supplyDeliverySuppliedItem = new SupplyDeliverySuppliedItemImpl();
		return supplyDeliverySuppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispensePerformer createMedicationDispensePerformer() {
		MedicationDispensePerformerImpl medicationDispensePerformer = new MedicationDispensePerformerImpl();
		return medicationDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledge createMedicationKnowledge() {
		MedicationKnowledgeImpl medicationKnowledge = new MedicationKnowledgeImpl();
		return medicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRelatedMedicationKnowledge createMedicationKnowledgeRelatedMedicationKnowledge() {
		MedicationKnowledgeRelatedMedicationKnowledgeImpl medicationKnowledgeRelatedMedicationKnowledge = new MedicationKnowledgeRelatedMedicationKnowledgeImpl();
		return medicationKnowledgeRelatedMedicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMonograph createMedicationKnowledgeMonograph() {
		MedicationKnowledgeMonographImpl medicationKnowledgeMonograph = new MedicationKnowledgeMonographImpl();
		return medicationKnowledgeMonograph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeIngredient createMedicationKnowledgeIngredient() {
		MedicationKnowledgeIngredientImpl medicationKnowledgeIngredient = new MedicationKnowledgeIngredientImpl();
		return medicationKnowledgeIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeCost createMedicationKnowledgeCost() {
		MedicationKnowledgeCostImpl medicationKnowledgeCost = new MedicationKnowledgeCostImpl();
		return medicationKnowledgeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMonitoringProgram createMedicationKnowledgeMonitoringProgram() {
		MedicationKnowledgeMonitoringProgramImpl medicationKnowledgeMonitoringProgram = new MedicationKnowledgeMonitoringProgramImpl();
		return medicationKnowledgeMonitoringProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeAdministrationGuidelines createMedicationKnowledgeAdministrationGuidelines() {
		MedicationKnowledgeAdministrationGuidelinesImpl medicationKnowledgeAdministrationGuidelines = new MedicationKnowledgeAdministrationGuidelinesImpl();
		return medicationKnowledgeAdministrationGuidelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeAdministrationGuidelinesDosage createMedicationKnowledgeAdministrationGuidelinesDosage() {
		MedicationKnowledgeAdministrationGuidelinesDosageImpl medicationKnowledgeAdministrationGuidelinesDosage = new MedicationKnowledgeAdministrationGuidelinesDosageImpl();
		return medicationKnowledgeAdministrationGuidelinesDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics createMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics() {
		MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl medicationKnowledgeAdministrationGuidelinesPatientCharacteristics = new MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl();
		return medicationKnowledgeAdministrationGuidelinesPatientCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMedicineClassification createMedicationKnowledgeMedicineClassification() {
		MedicationKnowledgeMedicineClassificationImpl medicationKnowledgeMedicineClassification = new MedicationKnowledgeMedicineClassificationImpl();
		return medicationKnowledgeMedicineClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgePackaging createMedicationKnowledgePackaging() {
		MedicationKnowledgePackagingImpl medicationKnowledgePackaging = new MedicationKnowledgePackagingImpl();
		return medicationKnowledgePackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeDrugCharacteristic createMedicationKnowledgeDrugCharacteristic() {
		MedicationKnowledgeDrugCharacteristicImpl medicationKnowledgeDrugCharacteristic = new MedicationKnowledgeDrugCharacteristicImpl();
		return medicationKnowledgeDrugCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRegulatory createMedicationKnowledgeRegulatory() {
		MedicationKnowledgeRegulatoryImpl medicationKnowledgeRegulatory = new MedicationKnowledgeRegulatoryImpl();
		return medicationKnowledgeRegulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRegulatorySubstitution createMedicationKnowledgeRegulatorySubstitution() {
		MedicationKnowledgeRegulatorySubstitutionImpl medicationKnowledgeRegulatorySubstitution = new MedicationKnowledgeRegulatorySubstitutionImpl();
		return medicationKnowledgeRegulatorySubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRegulatorySchedule createMedicationKnowledgeRegulatorySchedule() {
		MedicationKnowledgeRegulatoryScheduleImpl medicationKnowledgeRegulatorySchedule = new MedicationKnowledgeRegulatoryScheduleImpl();
		return medicationKnowledgeRegulatorySchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRegulatoryMaxDispense createMedicationKnowledgeRegulatoryMaxDispense() {
		MedicationKnowledgeRegulatoryMaxDispenseImpl medicationKnowledgeRegulatoryMaxDispense = new MedicationKnowledgeRegulatoryMaxDispenseImpl();
		return medicationKnowledgeRegulatoryMaxDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeKinetics createMedicationKnowledgeKinetics() {
		MedicationKnowledgeKineticsImpl medicationKnowledgeKinetics = new MedicationKnowledgeKineticsImpl();
		return medicationKnowledgeKinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponse createCoverageEligibilityResponse() {
		CoverageEligibilityResponseImpl coverageEligibilityResponse = new CoverageEligibilityResponseImpl();
		return coverageEligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseInsurance createCoverageEligibilityResponseInsurance() {
		CoverageEligibilityResponseInsuranceImpl coverageEligibilityResponseInsurance = new CoverageEligibilityResponseInsuranceImpl();
		return coverageEligibilityResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseInsuranceItems createCoverageEligibilityResponseInsuranceItems() {
		CoverageEligibilityResponseInsuranceItemsImpl coverageEligibilityResponseInsuranceItems = new CoverageEligibilityResponseInsuranceItemsImpl();
		return coverageEligibilityResponseInsuranceItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseInsuranceItemsBenefit createCoverageEligibilityResponseInsuranceItemsBenefit() {
		CoverageEligibilityResponseInsuranceItemsBenefitImpl coverageEligibilityResponseInsuranceItemsBenefit = new CoverageEligibilityResponseInsuranceItemsBenefitImpl();
		return coverageEligibilityResponseInsuranceItemsBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseErrors createCoverageEligibilityResponseErrors() {
		CoverageEligibilityResponseErrorsImpl coverageEligibilityResponseErrors = new CoverageEligibilityResponseErrorsImpl();
		return coverageEligibilityResponseErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionContext createStructureDefinitionContext() {
		StructureDefinitionContextImpl structureDefinitionContext = new StructureDefinitionContextImpl();
		return structureDefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcesPackage getResourcesPackage() {
		return (ResourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesPackage getPackage() {
		return ResourcesPackage.eINSTANCE;
	}

} //ResourcesFactoryImpl
