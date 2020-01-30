/**
 */
package fhiRCore.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fhiRCore.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = fhiRCore.resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Organization Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Contact</em>'.
	 * @generated
	 */
	OrganizationContact createOrganizationContact();

	/**
	 * Returns a new object of class '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner</em>'.
	 * @generated
	 */
	Practitioner createPractitioner();

	/**
	 * Returns a new object of class '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Qualification</em>'.
	 * @generated
	 */
	PractitionerQualification createPractitionerQualification();

	/**
	 * Returns a new object of class '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set</em>'.
	 * @generated
	 */
	ValueSet createValueSet();

	/**
	 * Returns a new object of class '<em>Value Set Compose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose</em>'.
	 * @generated
	 */
	ValueSetCompose createValueSetCompose();

	/**
	 * Returns a new object of class '<em>Value Set Compose Concept Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose Concept Set</em>'.
	 * @generated
	 */
	ValueSetComposeConceptSet createValueSetComposeConceptSet();

	/**
	 * Returns a new object of class '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * @generated
	 */
	ValueSetComposeConceptSetConceptReference createValueSetComposeConceptSetConceptReference();

	/**
	 * Returns a new object of class '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * @generated
	 */
	ValueSetComposeConceptSetConceptReferenceDesignation createValueSetComposeConceptSetConceptReferenceDesignation();

	/**
	 * Returns a new object of class '<em>Value Set Compose Concept Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose Concept Set Filter</em>'.
	 * @generated
	 */
	ValueSetComposeConceptSetFilter createValueSetComposeConceptSetFilter();

	/**
	 * Returns a new object of class '<em>Value Set Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Expansion</em>'.
	 * @generated
	 */
	ValueSetExpansion createValueSetExpansion();

	/**
	 * Returns a new object of class '<em>Value Set Expansion Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Expansion Parameter</em>'.
	 * @generated
	 */
	ValueSetExpansionParameter createValueSetExpansionParameter();

	/**
	 * Returns a new object of class '<em>Value Set Expansion Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Expansion Contains</em>'.
	 * @generated
	 */
	ValueSetExpansionContains createValueSetExpansionContains();

	/**
	 * Returns a new object of class '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint</em>'.
	 * @generated
	 */
	Endpoint createEndpoint();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report</em>'.
	 * @generated
	 */
	MeasureReport createMeasureReport();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Group</em>'.
	 * @generated
	 */
	MeasureGroup createMeasureGroup();

	/**
	 * Returns a new object of class '<em>Measure Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Group Population</em>'.
	 * @generated
	 */
	MeasureGroupPopulation createMeasureGroupPopulation();

	/**
	 * Returns a new object of class '<em>Measure Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Group Stratifier</em>'.
	 * @generated
	 */
	MeasureGroupStratifier createMeasureGroupStratifier();

	/**
	 * Returns a new object of class '<em>Measure Group Stratifier Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Group Stratifier Component</em>'.
	 * @generated
	 */
	MeasureGroupStratifierComponent createMeasureGroupStratifierComponent();

	/**
	 * Returns a new object of class '<em>Measure Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Supplemental Data</em>'.
	 * @generated
	 */
	MeasureSupplementalData createMeasureSupplementalData();

	/**
	 * Returns a new object of class '<em>Measure Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group</em>'.
	 * @generated
	 */
	MeasureReportGroup createMeasureReportGroup();

	/**
	 * Returns a new object of class '<em>Measure Report Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group Population</em>'.
	 * @generated
	 */
	MeasureReportGroupPopulation createMeasureReportGroupPopulation();

	/**
	 * Returns a new object of class '<em>Measure Report Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group Stratifier</em>'.
	 * @generated
	 */
	MeasureReportGroupStratifier createMeasureReportGroupStratifier();

	/**
	 * Returns a new object of class '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * @generated
	 */
	MeasureReportGroupStratifierStratifierGroup createMeasureReportGroupStratifierStratifierGroup();

	/**
	 * Returns a new object of class '<em>Measure Report Group Stratifier Stratifier Group Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group Stratifier Stratifier Group Component</em>'.
	 * @generated
	 */
	MeasureReportGroupStratifierStratifierGroupComponent createMeasureReportGroupStratifierStratifierGroupComponent();

	/**
	 * Returns a new object of class '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * @generated
	 */
	MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Contact</em>'.
	 * @generated
	 */
	PatientContact createPatientContact();

	/**
	 * Returns a new object of class '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Communication</em>'.
	 * @generated
	 */
	PatientCommunication createPatientCommunication();

	/**
	 * Returns a new object of class '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Link</em>'.
	 * @generated
	 */
	PatientLink createPatientLink();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Entry</em>'.
	 * @generated
	 */
	ListEntry createListEntry();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	Encounter createEncounter();

	/**
	 * Returns a new object of class '<em>Encounter Status History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Status History</em>'.
	 * @generated
	 */
	EncounterStatusHistory createEncounterStatusHistory();

	/**
	 * Returns a new object of class '<em>Encounter Class History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Class History</em>'.
	 * @generated
	 */
	EncounterClassHistory createEncounterClassHistory();

	/**
	 * Returns a new object of class '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Participant</em>'.
	 * @generated
	 */
	EncounterParticipant createEncounterParticipant();

	/**
	 * Returns a new object of class '<em>Encounter Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Diagnosis</em>'.
	 * @generated
	 */
	EncounterDiagnosis createEncounterDiagnosis();

	/**
	 * Returns a new object of class '<em>Encounter Hospitalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Hospitalization</em>'.
	 * @generated
	 */
	EncounterHospitalization createEncounterHospitalization();

	/**
	 * Returns a new object of class '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location</em>'.
	 * @generated
	 */
	EncounterLocation createEncounterLocation();

	/**
	 * Returns a new object of class '<em>Episode Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care</em>'.
	 * @generated
	 */
	EpisodeOfCare createEpisodeOfCare();

	/**
	 * Returns a new object of class '<em>Episode Of Care Status History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care Status History</em>'.
	 * @generated
	 */
	EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory();

	/**
	 * Returns a new object of class '<em>Episode Of Care Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care Diagnosis</em>'.
	 * @generated
	 */
	EpisodeOfCareDiagnosis createEpisodeOfCareDiagnosis();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Condition Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Stage</em>'.
	 * @generated
	 */
	ConditionStage createConditionStage();

	/**
	 * Returns a new object of class '<em>Condition Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Evidence</em>'.
	 * @generated
	 */
	ConditionEvidence createConditionEvidence();

	/**
	 * Returns a new object of class '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression</em>'.
	 * @generated
	 */
	ClinicalImpression createClinicalImpression();

	/**
	 * Returns a new object of class '<em>Clinical Impression Investigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Investigation</em>'.
	 * @generated
	 */
	ClinicalImpressionInvestigation createClinicalImpressionInvestigation();

	/**
	 * Returns a new object of class '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Finding</em>'.
	 * @generated
	 */
	ClinicalImpressionFinding createClinicalImpressionFinding();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Component</em>'.
	 * @generated
	 */
	ObservationComponent createObservationComponent();

	/**
	 * Returns a new object of class '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Reference Range</em>'.
	 * @generated
	 */
	ObservationReferenceRange createObservationReferenceRange();

	/**
	 * Returns a new object of class '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan</em>'.
	 * @generated
	 */
	CarePlan createCarePlan();

	/**
	 * Returns a new object of class '<em>Plan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition</em>'.
	 * @generated
	 */
	PlanDefinition createPlanDefinition();

	/**
	 * Returns a new object of class '<em>Plan Definition Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Goal</em>'.
	 * @generated
	 */
	PlanDefinitionGoal createPlanDefinitionGoal();

	/**
	 * Returns a new object of class '<em>Plan Definition Goal Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Goal Target</em>'.
	 * @generated
	 */
	PlanDefinitionGoalTarget createPlanDefinitionGoalTarget();

	/**
	 * Returns a new object of class '<em>Plan Definition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Action</em>'.
	 * @generated
	 */
	PlanDefinitionAction createPlanDefinitionAction();

	/**
	 * Returns a new object of class '<em>Plan Definition Action Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Action Condition</em>'.
	 * @generated
	 */
	PlanDefinitionActionCondition createPlanDefinitionActionCondition();

	/**
	 * Returns a new object of class '<em>Plan Definition Action Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Action Related Action</em>'.
	 * @generated
	 */
	PlanDefinitionActionRelatedAction createPlanDefinitionActionRelatedAction();

	/**
	 * Returns a new object of class '<em>Plan Definition Action Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Action Participant</em>'.
	 * @generated
	 */
	PlanDefinitionActionParticipant createPlanDefinitionActionParticipant();

	/**
	 * Returns a new object of class '<em>Structure Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map</em>'.
	 * @generated
	 */
	StructureMap createStructureMap();

	/**
	 * Returns a new object of class '<em>Structure Map Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Structure</em>'.
	 * @generated
	 */
	StructureMapStructure createStructureMapStructure();

	/**
	 * Returns a new object of class '<em>Structure Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group</em>'.
	 * @generated
	 */
	StructureMapGroup createStructureMapGroup();

	/**
	 * Returns a new object of class '<em>Structure Map Group Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Input</em>'.
	 * @generated
	 */
	StructureMapGroupInput createStructureMapGroupInput();

	/**
	 * Returns a new object of class '<em>Structure Map Group Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Rule</em>'.
	 * @generated
	 */
	StructureMapGroupRule createStructureMapGroupRule();

	/**
	 * Returns a new object of class '<em>Structure Map Group Rule Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Rule Source</em>'.
	 * @generated
	 */
	StructureMapGroupRuleSource createStructureMapGroupRuleSource();

	/**
	 * Returns a new object of class '<em>Structure Map Group Rule Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Rule Target</em>'.
	 * @generated
	 */
	StructureMapGroupRuleTarget createStructureMapGroupRuleTarget();

	/**
	 * Returns a new object of class '<em>Structure Map Group Rule Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Rule Target Parameter</em>'.
	 * @generated
	 */
	StructureMapGroupRuleTargetParameter createStructureMapGroupRuleTargetParameter();

	/**
	 * Returns a new object of class '<em>Structure Map Group Rule Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group Rule Dependent</em>'.
	 * @generated
	 */
	StructureMapGroupRuleDependent createStructureMapGroupRuleDependent();

	/**
	 * Returns a new object of class '<em>Plan Definition Action Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Definition Action Dynamic Value</em>'.
	 * @generated
	 */
	PlanDefinitionActionDynamicValue createPlanDefinitionActionDynamicValue();

	/**
	 * Returns a new object of class '<em>Care Plan Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Activity</em>'.
	 * @generated
	 */
	CarePlanActivity createCarePlanActivity();

	/**
	 * Returns a new object of class '<em>Care Plan Activity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Activity Detail</em>'.
	 * @generated
	 */
	CarePlanActivityDetail createCarePlanActivityDetail();

	/**
	 * Returns a new object of class '<em>Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Team</em>'.
	 * @generated
	 */
	CareTeam createCareTeam();

	/**
	 * Returns a new object of class '<em>Care Team Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Team Participant</em>'.
	 * @generated
	 */
	CareTeamParticipant createCareTeamParticipant();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Goal Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Target</em>'.
	 * @generated
	 */
	GoalTarget createGoalTarget();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns a new object of class '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Participant</em>'.
	 * @generated
	 */
	AppointmentParticipant createAppointmentParticipant();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Request</em>'.
	 * @generated
	 */
	ServiceRequest createServiceRequest();

	/**
	 * Returns a new object of class '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Definition</em>'.
	 * @generated
	 */
	ActivityDefinition createActivityDefinition();

	/**
	 * Returns a new object of class '<em>Activity Definition Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Definition Participant</em>'.
	 * @generated
	 */
	ActivityDefinitionParticipant createActivityDefinitionParticipant();

	/**
	 * Returns a new object of class '<em>Activity Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Definition Dynamic Value</em>'.
	 * @generated
	 */
	ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Location Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Position</em>'.
	 * @generated
	 */
	LocationPosition createLocationPosition();

	/**
	 * Returns a new object of class '<em>Location Hours Of Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Hours Of Operation</em>'.
	 * @generated
	 */
	LocationHoursOfOperation createLocationHoursOfOperation();

	/**
	 * Returns a new object of class '<em>Specimen Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Definition</em>'.
	 * @generated
	 */
	SpecimenDefinition createSpecimenDefinition();

	/**
	 * Returns a new object of class '<em>Specimen Definition Type Tested</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Definition Type Tested</em>'.
	 * @generated
	 */
	SpecimenDefinitionTypeTested createSpecimenDefinitionTypeTested();

	/**
	 * Returns a new object of class '<em>Specimen Definition Type Tested Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Definition Type Tested Container</em>'.
	 * @generated
	 */
	SpecimenDefinitionTypeTestedContainer createSpecimenDefinitionTypeTestedContainer();

	/**
	 * Returns a new object of class '<em>Specimen Definition Type Tested Container Additive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Definition Type Tested Container Additive</em>'.
	 * @generated
	 */
	SpecimenDefinitionTypeTestedContainerAdditive createSpecimenDefinitionTypeTestedContainerAdditive();

	/**
	 * Returns a new object of class '<em>Specimen Definition Type Tested Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Definition Type Tested Handling</em>'.
	 * @generated
	 */
	SpecimenDefinitionTypeTestedHandling createSpecimenDefinitionTypeTestedHandling();

	/**
	 * Returns a new object of class '<em>Observation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Definition</em>'.
	 * @generated
	 */
	ObservationDefinition createObservationDefinition();

	/**
	 * Returns a new object of class '<em>Observation Definition Quantitative Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Definition Quantitative Details</em>'.
	 * @generated
	 */
	ObservationDefinitionQuantitativeDetails createObservationDefinitionQuantitativeDetails();

	/**
	 * Returns a new object of class '<em>Observation Definition Qualified Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Definition Qualified Interval</em>'.
	 * @generated
	 */
	ObservationDefinitionQualifiedInterval createObservationDefinitionQualifiedInterval();

	/**
	 * Returns a new object of class '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage</em>'.
	 * @generated
	 */
	Coverage createCoverage();

	/**
	 * Returns a new object of class '<em>Coverage Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Class</em>'.
	 * @generated
	 */
	CoverageClass createCoverageClass();

	/**
	 * Returns a new object of class '<em>Coverage Cost To Beneficiary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Cost To Beneficiary</em>'.
	 * @generated
	 */
	CoverageCostToBeneficiary createCoverageCostToBeneficiary();

	/**
	 * Returns a new object of class '<em>Coverage Cost To Beneficiary Exemption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Cost To Beneficiary Exemption</em>'.
	 * @generated
	 */
	CoverageCostToBeneficiaryExemption createCoverageCostToBeneficiaryExemption();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Contract Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Content Definition</em>'.
	 * @generated
	 */
	ContractContentDefinition createContractContentDefinition();

	/**
	 * Returns a new object of class '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term</em>'.
	 * @generated
	 */
	ContractTerm createContractTerm();

	/**
	 * Returns a new object of class '<em>Contract Term Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Security Label</em>'.
	 * @generated
	 */
	ContractTermSecurityLabel createContractTermSecurityLabel();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Offer</em>'.
	 * @generated
	 */
	ContractTermContractOffer createContractTermContractOffer();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Offer Contract Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Offer Contract Party</em>'.
	 * @generated
	 */
	ContractTermContractOfferContractParty createContractTermContractOfferContractParty();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Offer Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Offer Answer</em>'.
	 * @generated
	 */
	ContractTermContractOfferAnswer createContractTermContractOfferAnswer();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Asset</em>'.
	 * @generated
	 */
	ContractTermContractAsset createContractTermContractAsset();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Asset Asset Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Asset Asset Context</em>'.
	 * @generated
	 */
	ContractTermContractAssetAssetContext createContractTermContractAssetAssetContext();

	/**
	 * Returns a new object of class '<em>Contract Term Contract Asset Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Contract Asset Valued Item</em>'.
	 * @generated
	 */
	ContractTermContractAssetValuedItem createContractTermContractAssetValuedItem();

	/**
	 * Returns a new object of class '<em>Contract Term Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Action</em>'.
	 * @generated
	 */
	ContractTermAction createContractTermAction();

	/**
	 * Returns a new object of class '<em>Contract Term Action Action Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Action Action Subject</em>'.
	 * @generated
	 */
	ContractTermActionActionSubject createContractTermActionActionSubject();

	/**
	 * Returns a new object of class '<em>Contract Signatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Signatory</em>'.
	 * @generated
	 */
	ContractSignatory createContractSignatory();

	/**
	 * Returns a new object of class '<em>Contract Friendly Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Friendly Language</em>'.
	 * @generated
	 */
	ContractFriendlyLanguage createContractFriendlyLanguage();

	/**
	 * Returns a new object of class '<em>Contract Legal Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Legal Language</em>'.
	 * @generated
	 */
	ContractLegalLanguage createContractLegalLanguage();

	/**
	 * Returns a new object of class '<em>Contract Computable Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Computable Language</em>'.
	 * @generated
	 */
	ContractComputableLanguage createContractComputableLanguage();

	/**
	 * Returns a new object of class '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Person</em>'.
	 * @generated
	 */
	RelatedPerson createRelatedPerson();

	/**
	 * Returns a new object of class '<em>Related Person Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Person Communication</em>'.
	 * @generated
	 */
	RelatedPersonCommunication createRelatedPersonCommunication();

	/**
	 * Returns a new object of class '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance</em>'.
	 * @generated
	 */
	Provenance createProvenance();

	/**
	 * Returns a new object of class '<em>Provenance Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Agent</em>'.
	 * @generated
	 */
	ProvenanceAgent createProvenanceAgent();

	/**
	 * Returns a new object of class '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Entity</em>'.
	 * @generated
	 */
	ProvenanceEntity createProvenanceEntity();

	/**
	 * Returns a new object of class '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen</em>'.
	 * @generated
	 */
	Specimen createSpecimen();

	/**
	 * Returns a new object of class '<em>Specimen Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Collection</em>'.
	 * @generated
	 */
	SpecimenCollection createSpecimenCollection();

	/**
	 * Returns a new object of class '<em>Specimen Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Processing</em>'.
	 * @generated
	 */
	SpecimenProcessing createSpecimenProcessing();

	/**
	 * Returns a new object of class '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Container</em>'.
	 * @generated
	 */
	SpecimenContainer createSpecimenContainer();

	/**
	 * Returns a new object of class '<em>Substance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance</em>'.
	 * @generated
	 */
	Substance createSubstance();

	/**
	 * Returns a new object of class '<em>Substance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Instance</em>'.
	 * @generated
	 */
	SubstanceInstance createSubstanceInstance();

	/**
	 * Returns a new object of class '<em>Substance Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Ingredient</em>'.
	 * @generated
	 */
	SubstanceIngredient createSubstanceIngredient();

	/**
	 * Returns a new object of class '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration</em>'.
	 * @generated
	 */
	MedicationAdministration createMedicationAdministration();

	/**
	 * Returns a new object of class '<em>Medication Administration Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Performer</em>'.
	 * @generated
	 */
	MedicationAdministrationPerformer createMedicationAdministrationPerformer();

	/**
	 * Returns a new object of class '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Dosage</em>'.
	 * @generated
	 */
	MedicationAdministrationDosage createMedicationAdministrationDosage();

	/**
	 * Returns a new object of class '<em>Medication Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Request</em>'.
	 * @generated
	 */
	MedicationRequest createMedicationRequest();

	/**
	 * Returns a new object of class '<em>Medication Request Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Request Dispense Request</em>'.
	 * @generated
	 */
	MedicationRequestDispenseRequest createMedicationRequestDispenseRequest();

	/**
	 * Returns a new object of class '<em>Medication Request Dispense Request Initial Fill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Request Dispense Request Initial Fill</em>'.
	 * @generated
	 */
	MedicationRequestDispenseRequestInitialFill createMedicationRequestDispenseRequestInitialFill();

	/**
	 * Returns a new object of class '<em>Medication Request Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Request Substitution</em>'.
	 * @generated
	 */
	MedicationRequestSubstitution createMedicationRequestSubstitution();

	/**
	 * Returns a new object of class '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue</em>'.
	 * @generated
	 */
	DetectedIssue createDetectedIssue();

	/**
	 * Returns a new object of class '<em>Detected Issue Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue Evidence</em>'.
	 * @generated
	 */
	DetectedIssueEvidence createDetectedIssueEvidence();

	/**
	 * Returns a new object of class '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue Mitigation</em>'.
	 * @generated
	 */
	DetectedIssueMitigation createDetectedIssueMitigation();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Device Udi Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Udi Carrier</em>'.
	 * @generated
	 */
	DeviceUdiCarrier createDeviceUdiCarrier();

	/**
	 * Returns a new object of class '<em>Device Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Device Name</em>'.
	 * @generated
	 */
	DeviceDeviceName createDeviceDeviceName();

	/**
	 * Returns a new object of class '<em>Device Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Specialization</em>'.
	 * @generated
	 */
	DeviceSpecialization createDeviceSpecialization();

	/**
	 * Returns a new object of class '<em>Device Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Version</em>'.
	 * @generated
	 */
	DeviceVersion createDeviceVersion();

	/**
	 * Returns a new object of class '<em>Device Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Property</em>'.
	 * @generated
	 */
	DeviceProperty createDeviceProperty();

	/**
	 * Returns a new object of class '<em>Device Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition</em>'.
	 * @generated
	 */
	DeviceDefinition createDeviceDefinition();

	/**
	 * Returns a new object of class '<em>Device Definition Udi Device Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Udi Device Identifier</em>'.
	 * @generated
	 */
	DeviceDefinitionUdiDeviceIdentifier createDeviceDefinitionUdiDeviceIdentifier();

	/**
	 * Returns a new object of class '<em>Device Definition Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Device Name</em>'.
	 * @generated
	 */
	DeviceDefinitionDeviceName createDeviceDefinitionDeviceName();

	/**
	 * Returns a new object of class '<em>Device Definition Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Specialization</em>'.
	 * @generated
	 */
	DeviceDefinitionSpecialization createDeviceDefinitionSpecialization();

	/**
	 * Returns a new object of class '<em>Device Definition Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Capability</em>'.
	 * @generated
	 */
	DeviceDefinitionCapability createDeviceDefinitionCapability();

	/**
	 * Returns a new object of class '<em>Device Definition Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Property</em>'.
	 * @generated
	 */
	DeviceDefinitionProperty createDeviceDefinitionProperty();

	/**
	 * Returns a new object of class '<em>Device Definition Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Definition Material</em>'.
	 * @generated
	 */
	DeviceDefinitionMaterial createDeviceDefinitionMaterial();

	/**
	 * Returns a new object of class '<em>Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference</em>'.
	 * @generated
	 */
	DocumentReference createDocumentReference();

	/**
	 * Returns a new object of class '<em>Document Reference Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Relates To</em>'.
	 * @generated
	 */
	DocumentReferenceRelatesTo createDocumentReferenceRelatesTo();

	/**
	 * Returns a new object of class '<em>Document Reference Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Content</em>'.
	 * @generated
	 */
	DocumentReferenceContent createDocumentReferenceContent();

	/**
	 * Returns a new object of class '<em>Document Reference Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Context</em>'.
	 * @generated
	 */
	DocumentReferenceContext createDocumentReferenceContext();

	/**
	 * Returns a new object of class '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns a new object of class '<em>Risk Assessment Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment Prediction</em>'.
	 * @generated
	 */
	RiskAssessmentPrediction createRiskAssessmentPrediction();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Account Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Coverage</em>'.
	 * @generated
	 */
	AccountCoverage createAccountCoverage();

	/**
	 * Returns a new object of class '<em>Account Guarantor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Guarantor</em>'.
	 * @generated
	 */
	AccountGuarantor createAccountGuarantor();

	/**
	 * Returns a new object of class '<em>Medicinal Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product</em>'.
	 * @generated
	 */
	MedicinalProduct createMedicinalProduct();

	/**
	 * Returns a new object of class '<em>Medicinal Product Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Contact</em>'.
	 * @generated
	 */
	MedicinalProductContact createMedicinalProductContact();

	/**
	 * Returns a new object of class '<em>Medicinal Product Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Name</em>'.
	 * @generated
	 */
	MedicinalProductName createMedicinalProductName();

	/**
	 * Returns a new object of class '<em>Medicinal Product Name Name Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Name Name Part</em>'.
	 * @generated
	 */
	MedicinalProductNameNamePart createMedicinalProductNameNamePart();

	/**
	 * Returns a new object of class '<em>Medicinal Product Name Country Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Name Country Language</em>'.
	 * @generated
	 */
	MedicinalProductNameCountryLanguage createMedicinalProductNameCountryLanguage();

	/**
	 * Returns a new object of class '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * @generated
	 */
	MedicinalProductManufacturingBusinessOperation createMedicinalProductManufacturingBusinessOperation();

	/**
	 * Returns a new object of class '<em>Medicinal Product Special Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Special Designation</em>'.
	 * @generated
	 */
	MedicinalProductSpecialDesignation createMedicinalProductSpecialDesignation();

	/**
	 * Returns a new object of class '<em>Medicinal Product Pharmaceutical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Pharmaceutical</em>'.
	 * @generated
	 */
	MedicinalProductPharmaceutical createMedicinalProductPharmaceutical();

	/**
	 * Returns a new object of class '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * @generated
	 */
	MedicinalProductPharmaceuticalCharacteristics createMedicinalProductPharmaceuticalCharacteristics();

	/**
	 * Returns a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * @generated
	 */
	MedicinalProductPharmaceuticalRouteOfAdministration createMedicinalProductPharmaceuticalRouteOfAdministration();

	/**
	 * Returns a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species</em>'.
	 * @generated
	 */
	MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies();

	/**
	 * Returns a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</em>'.
	 * @generated
	 */
	MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod();

	/**
	 * Returns a new object of class '<em>Medicinal Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Ingredient</em>'.
	 * @generated
	 */
	MedicinalProductIngredient createMedicinalProductIngredient();

	/**
	 * Returns a new object of class '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * @generated
	 */
	MedicinalProductIngredientSpecifiedSubstance createMedicinalProductIngredientSpecifiedSubstance();

	/**
	 * Returns a new object of class '<em>Medicinal Product Ingredient Specified Substance Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Ingredient Specified Substance Strength</em>'.
	 * @generated
	 */
	MedicinalProductIngredientSpecifiedSubstanceStrength createMedicinalProductIngredientSpecifiedSubstanceStrength();

	/**
	 * Returns a new object of class '<em>Medicinal Product Ingredient Specified Substance Strength Reference Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Ingredient Specified Substance Strength Reference Strength</em>'.
	 * @generated
	 */
	MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength createMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength();

	/**
	 * Returns a new object of class '<em>Medicinal Product Ingredient Substance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Ingredient Substance</em>'.
	 * @generated
	 */
	MedicinalProductIngredientSubstance createMedicinalProductIngredientSubstance();

	/**
	 * Returns a new object of class '<em>Medicinal Product Packaged</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Packaged</em>'.
	 * @generated
	 */
	MedicinalProductPackaged createMedicinalProductPackaged();

	/**
	 * Returns a new object of class '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * @generated
	 */
	MedicinalProductPackagedBatchIdentifier createMedicinalProductPackagedBatchIdentifier();

	/**
	 * Returns a new object of class '<em>Medicinal Product Packaged Package Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Packaged Package Item</em>'.
	 * @generated
	 */
	MedicinalProductPackagedPackageItem createMedicinalProductPackagedPackageItem();

	/**
	 * Returns a new object of class '<em>Medicinal Product Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Authorization</em>'.
	 * @generated
	 */
	MedicinalProductAuthorization createMedicinalProductAuthorization();

	/**
	 * Returns a new object of class '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * @generated
	 */
	MedicinalProductAuthorizationJurisdictionalAuthorization createMedicinalProductAuthorizationJurisdictionalAuthorization();

	/**
	 * Returns a new object of class '<em>Medicinal Product Authorization Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Authorization Procedure</em>'.
	 * @generated
	 */
	MedicinalProductAuthorizationProcedure createMedicinalProductAuthorizationProcedure();

	/**
	 * Returns a new object of class '<em>Medicinal Product Manufactured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Manufactured</em>'.
	 * @generated
	 */
	MedicinalProductManufactured createMedicinalProductManufactured();

	/**
	 * Returns a new object of class '<em>Research Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Study</em>'.
	 * @generated
	 */
	ResearchStudy createResearchStudy();

	/**
	 * Returns a new object of class '<em>Research Study Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Study Arm</em>'.
	 * @generated
	 */
	ResearchStudyArm createResearchStudyArm();

	/**
	 * Returns a new object of class '<em>Research Study Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Study Objective</em>'.
	 * @generated
	 */
	ResearchStudyObjective createResearchStudyObjective();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Group Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Characteristic</em>'.
	 * @generated
	 */
	GroupCharacteristic createGroupCharacteristic();

	/**
	 * Returns a new object of class '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Member</em>'.
	 * @generated
	 */
	GroupMember createGroupMember();

	/**
	 * Returns a new object of class '<em>Evidence Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Variable</em>'.
	 * @generated
	 */
	EvidenceVariable createEvidenceVariable();

	/**
	 * Returns a new object of class '<em>Evidence Variable Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Variable Characteristic</em>'.
	 * @generated
	 */
	EvidenceVariableCharacteristic createEvidenceVariableCharacteristic();

	/**
	 * Returns a new object of class '<em>Research Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Subject</em>'.
	 * @generated
	 */
	ResearchSubject createResearchSubject();

	/**
	 * Returns a new object of class '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent</em>'.
	 * @generated
	 */
	Consent createConsent();

	/**
	 * Returns a new object of class '<em>Consent Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Policy</em>'.
	 * @generated
	 */
	ConsentPolicy createConsentPolicy();

	/**
	 * Returns a new object of class '<em>Consent Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Verification</em>'.
	 * @generated
	 */
	ConsentVerification createConsentVerification();

	/**
	 * Returns a new object of class '<em>Consentprovision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consentprovision</em>'.
	 * @generated
	 */
	Consentprovision createConsentprovision();

	/**
	 * Returns a new object of class '<em>Consentprovisionprovision Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consentprovisionprovision Actor</em>'.
	 * @generated
	 */
	ConsentprovisionprovisionActor createConsentprovisionprovisionActor();

	/**
	 * Returns a new object of class '<em>Consentprovisionprovision Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consentprovisionprovision Data</em>'.
	 * @generated
	 */
	ConsentprovisionprovisionData createConsentprovisionprovisionData();

	/**
	 * Returns a new object of class '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Definition</em>'.
	 * @generated
	 */
	EventDefinition createEventDefinition();

	/**
	 * Returns a new object of class '<em>Charge Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item</em>'.
	 * @generated
	 */
	ChargeItem createChargeItem();

	/**
	 * Returns a new object of class '<em>Charge Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item Definition</em>'.
	 * @generated
	 */
	ChargeItemDefinition createChargeItemDefinition();

	/**
	 * Returns a new object of class '<em>Charge Item Definition Applicability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item Definition Applicability</em>'.
	 * @generated
	 */
	ChargeItemDefinitionApplicability createChargeItemDefinitionApplicability();

	/**
	 * Returns a new object of class '<em>Charge Item Definition Property Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item Definition Property Group</em>'.
	 * @generated
	 */
	ChargeItemDefinitionPropertyGroup createChargeItemDefinitionPropertyGroup();

	/**
	 * Returns a new object of class '<em>Charge Item Definition Property Group Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item Definition Property Group Price Component</em>'.
	 * @generated
	 */
	ChargeItemDefinitionPropertyGroupPriceComponent createChargeItemDefinitionPropertyGroupPriceComponent();

	/**
	 * Returns a new object of class '<em>Charge Item Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Item Performer</em>'.
	 * @generated
	 */
	ChargeItemPerformer createChargeItemPerformer();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Ingredient</em>'.
	 * @generated
	 */
	MedicationIngredient createMedicationIngredient();

	/**
	 * Returns a new object of class '<em>Medication Batch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Batch</em>'.
	 * @generated
	 */
	MedicationBatch createMedicationBatch();

	/**
	 * Returns a new object of class '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report</em>'.
	 * @generated
	 */
	DiagnosticReport createDiagnosticReport();

	/**
	 * Returns a new object of class '<em>Diagnostic Report Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report Media</em>'.
	 * @generated
	 */
	DiagnosticReportMedia createDiagnosticReportMedia();

	/**
	 * Returns a new object of class '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study</em>'.
	 * @generated
	 */
	ImagingStudy createImagingStudy();

	/**
	 * Returns a new object of class '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series</em>'.
	 * @generated
	 */
	ImagingStudySeries createImagingStudySeries();

	/**
	 * Returns a new object of class '<em>Imaging Study Series Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series Performer</em>'.
	 * @generated
	 */
	ImagingStudySeriesPerformer createImagingStudySeriesPerformer();

	/**
	 * Returns a new object of class '<em>Imaging Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series Instance</em>'.
	 * @generated
	 */
	ImagingStudySeriesInstance createImagingStudySeriesInstance();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Performer</em>'.
	 * @generated
	 */
	ProcedurePerformer createProcedurePerformer();

	/**
	 * Returns a new object of class '<em>Procedure Focal Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Focal Device</em>'.
	 * @generated
	 */
	ProcedureFocalDevice createProcedureFocalDevice();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication</em>'.
	 * @generated
	 */
	Communication createCommunication();

	/**
	 * Returns a new object of class '<em>Communication Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Payload</em>'.
	 * @generated
	 */
	CommunicationPayload createCommunicationPayload();

	/**
	 * Returns a new object of class '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response</em>'.
	 * @generated
	 */
	ClaimResponse createClaimResponse();

	/**
	 * Returns a new object of class '<em>Claim Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Item</em>'.
	 * @generated
	 */
	ClaimResponseItem createClaimResponseItem();

	/**
	 * Returns a new object of class '<em>Claim Response Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Item Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseItemAdjudication createClaimResponseItemAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Item Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Item Item Detail</em>'.
	 * @generated
	 */
	ClaimResponseItemItemDetail createClaimResponseItemItemDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * @generated
	 */
	ClaimResponseItemItemDetailSubDetail createClaimResponseItemItemDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item</em>'.
	 * @generated
	 */
	ClaimResponseAddedItem createClaimResponseAddedItem();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item Added Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item Added Item Detail</em>'.
	 * @generated
	 */
	ClaimResponseAddedItemAddedItemDetail createClaimResponseAddedItemAddedItemDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item Added Item Detail Added Item Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item Added Item Detail Added Item Sub Detail</em>'.
	 * @generated
	 */
	ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail createClaimResponseAddedItemAddedItemDetailAddedItemSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Total</em>'.
	 * @generated
	 */
	ClaimResponseTotal createClaimResponseTotal();

	/**
	 * Returns a new object of class '<em>Claim Response Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Payment</em>'.
	 * @generated
	 */
	ClaimResponsePayment createClaimResponsePayment();

	/**
	 * Returns a new object of class '<em>Claim Response Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Note</em>'.
	 * @generated
	 */
	ClaimResponseNote createClaimResponseNote();

	/**
	 * Returns a new object of class '<em>Claim Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Insurance</em>'.
	 * @generated
	 */
	ClaimResponseInsurance createClaimResponseInsurance();

	/**
	 * Returns a new object of class '<em>Claim Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Error</em>'.
	 * @generated
	 */
	ClaimResponseError createClaimResponseError();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Claim Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Related Claim</em>'.
	 * @generated
	 */
	ClaimRelatedClaim createClaimRelatedClaim();

	/**
	 * Returns a new object of class '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Payee</em>'.
	 * @generated
	 */
	ClaimPayee createClaimPayee();

	/**
	 * Returns a new object of class '<em>Claim Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Care Team</em>'.
	 * @generated
	 */
	ClaimCareTeam createClaimCareTeam();

	/**
	 * Returns a new object of class '<em>Claim Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Supporting Information</em>'.
	 * @generated
	 */
	ClaimSupportingInformation createClaimSupportingInformation();

	/**
	 * Returns a new object of class '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Diagnosis</em>'.
	 * @generated
	 */
	ClaimDiagnosis createClaimDiagnosis();

	/**
	 * Returns a new object of class '<em>Claim Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Procedure</em>'.
	 * @generated
	 */
	ClaimProcedure createClaimProcedure();

	/**
	 * Returns a new object of class '<em>Claim Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Insurance</em>'.
	 * @generated
	 */
	ClaimInsurance createClaimInsurance();

	/**
	 * Returns a new object of class '<em>Claim Accident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Accident</em>'.
	 * @generated
	 */
	ClaimAccident createClaimAccident();

	/**
	 * Returns a new object of class '<em>Claim Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Item</em>'.
	 * @generated
	 */
	ClaimItem createClaimItem();

	/**
	 * Returns a new object of class '<em>Claim Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Item Detail</em>'.
	 * @generated
	 */
	ClaimItemDetail createClaimItemDetail();

	/**
	 * Returns a new object of class '<em>Claim Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Item Detail Sub Detail</em>'.
	 * @generated
	 */
	ClaimItemDetailSubDetail createClaimItemDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Device Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Request</em>'.
	 * @generated
	 */
	DeviceRequest createDeviceRequest();

	/**
	 * Returns a new object of class '<em>Device Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Request Parameter</em>'.
	 * @generated
	 */
	DeviceRequestParameter createDeviceRequestParameter();

	/**
	 * Returns a new object of class '<em>Communication Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Request</em>'.
	 * @generated
	 */
	CommunicationRequest createCommunicationRequest();

	/**
	 * Returns a new object of class '<em>Communication Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Request Payload</em>'.
	 * @generated
	 */
	CommunicationRequestPayload createCommunicationRequestPayload();

	/**
	 * Returns a new object of class '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service</em>'.
	 * @generated
	 */
	HealthcareService createHealthcareService();

	/**
	 * Returns a new object of class '<em>Healthcare Service Eligibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Eligibility</em>'.
	 * @generated
	 */
	HealthcareServiceEligibility createHealthcareServiceEligibility();

	/**
	 * Returns a new object of class '<em>Healthcare Service Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Available Time</em>'.
	 * @generated
	 */
	HealthcareServiceAvailableTime createHealthcareServiceAvailableTime();

	/**
	 * Returns a new object of class '<em>Healthcare Service Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Not Available</em>'.
	 * @generated
	 */
	HealthcareServiceNotAvailable createHealthcareServiceNotAvailable();

	/**
	 * Returns a new object of class '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System</em>'.
	 * @generated
	 */
	NamingSystem createNamingSystem();

	/**
	 * Returns a new object of class '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Unique Id</em>'.
	 * @generated
	 */
	NamingSystemUniqueId createNamingSystemUniqueId();

	/**
	 * Returns a new object of class '<em>Body Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Structure</em>'.
	 * @generated
	 */
	BodyStructure createBodyStructure();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Task Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Restriction</em>'.
	 * @generated
	 */
	TaskRestriction createTaskRestriction();

	/**
	 * Returns a new object of class '<em>Task Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Parameter</em>'.
	 * @generated
	 */
	TaskParameter createTaskParameter();

	/**
	 * Returns a new object of class '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Output</em>'.
	 * @generated
	 */
	TaskOutput createTaskOutput();

	/**
	 * Returns a new object of class '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response</em>'.
	 * @generated
	 */
	QuestionnaireResponse createQuestionnaireResponse();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Questionnaire Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item</em>'.
	 * @generated
	 */
	QuestionnaireItem createQuestionnaireItem();

	/**
	 * Returns a new object of class '<em>Questionnaire Item Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item Enable When</em>'.
	 * @generated
	 */
	QuestionnaireItemEnableWhen createQuestionnaireItemEnableWhen();

	/**
	 * Returns a new object of class '<em>Questionnaire Item Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item Answer Option</em>'.
	 * @generated
	 */
	QuestionnaireItemAnswerOption createQuestionnaireItemAnswerOption();

	/**
	 * Returns a new object of class '<em>Questionnaire Item Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item Initial</em>'.
	 * @generated
	 */
	QuestionnaireItemInitial createQuestionnaireItemInitial();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Item</em>'.
	 * @generated
	 */
	QuestionnaireResponseItem createQuestionnaireResponseItem();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Item Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Item Answer</em>'.
	 * @generated
	 */
	QuestionnaireResponseItemAnswer createQuestionnaireResponseItemAnswer();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit</em>'.
	 * @generated
	 */
	ExplanationOfBenefit createExplanationOfBenefit();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Related Claim</em>'.
	 * @generated
	 */
	ExplanationOfBenefitRelatedClaim createExplanationOfBenefitRelatedClaim();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Payee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Payee</em>'.
	 * @generated
	 */
	ExplanationOfBenefitPayee createExplanationOfBenefitPayee();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Care Team</em>'.
	 * @generated
	 */
	ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Supporting Information</em>'.
	 * @generated
	 */
	ExplanationOfBenefitSupportingInformation createExplanationOfBenefitSupportingInformation();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Diagnosis</em>'.
	 * @generated
	 */
	ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Procedure</em>'.
	 * @generated
	 */
	ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Insurance</em>'.
	 * @generated
	 */
	ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Accident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Accident</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAccident createExplanationOfBenefitAccident();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Item</em>'.
	 * @generated
	 */
	ExplanationOfBenefitItem createExplanationOfBenefitItem();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * @generated
	 */
	ExplanationOfBenefitItemAdjudication createExplanationOfBenefitItemAdjudication();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Item Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitItemDetail createExplanationOfBenefitItemDetail();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitItemDetailSubDetail createExplanationOfBenefitItemDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Added Item</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAddedItem createExplanationOfBenefitAddedItem();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Added Item Added Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Added Item Added Item Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAddedItemAddedItemDetail createExplanationOfBenefitAddedItemAddedItemDetail();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Added Item Added Item Detail Added Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Added Item Added Item Detail Added Item Detail Sub Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail createExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Total</em>'.
	 * @generated
	 */
	ExplanationOfBenefitTotal createExplanationOfBenefitTotal();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Payment</em>'.
	 * @generated
	 */
	ExplanationOfBenefitPayment createExplanationOfBenefitPayment();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Note</em>'.
	 * @generated
	 */
	ExplanationOfBenefitNote createExplanationOfBenefitNote();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * @generated
	 */
	ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * @generated
	 */
	ExplanationOfBenefitBenefitBalanceBenefit createExplanationOfBenefitBenefitBalanceBenefit();

	/**
	 * Returns a new object of class '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map</em>'.
	 * @generated
	 */
	ConceptMap createConceptMap();

	/**
	 * Returns a new object of class '<em>Concept Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Group</em>'.
	 * @generated
	 */
	ConceptMapGroup createConceptMapGroup();

	/**
	 * Returns a new object of class '<em>Concept Map Group Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Group Source Element</em>'.
	 * @generated
	 */
	ConceptMapGroupSourceElement createConceptMapGroupSourceElement();

	/**
	 * Returns a new object of class '<em>Concept Map Group Source Element Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Group Source Element Target Element</em>'.
	 * @generated
	 */
	ConceptMapGroupSourceElementTargetElement createConceptMapGroupSourceElementTargetElement();

	/**
	 * Returns a new object of class '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * @generated
	 */
	ConceptMapGroupSourceElementTargetElementOtherElement createConceptMapGroupSourceElementTargetElementOtherElement();

	/**
	 * Returns a new object of class '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System</em>'.
	 * @generated
	 */
	CodeSystem createCodeSystem();

	/**
	 * Returns a new object of class '<em>Code System Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Filter</em>'.
	 * @generated
	 */
	CodeSystemFilter createCodeSystemFilter();

	/**
	 * Returns a new object of class '<em>Code System Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Property</em>'.
	 * @generated
	 */
	CodeSystemProperty createCodeSystemProperty();

	/**
	 * Returns a new object of class '<em>Code System Concept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Concept Definition</em>'.
	 * @generated
	 */
	CodeSystemConceptDefinition createCodeSystemConceptDefinition();

	/**
	 * Returns a new object of class '<em>Code System Concept Definition Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Concept Definition Designation</em>'.
	 * @generated
	 */
	CodeSystemConceptDefinitionDesignation createCodeSystemConceptDefinitionDesignation();

	/**
	 * Returns a new object of class '<em>Code System Concept Definition Concept Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Concept Definition Concept Property</em>'.
	 * @generated
	 */
	CodeSystemConceptDefinitionConceptProperty createCodeSystemConceptDefinitionConceptProperty();

	/**
	 * Returns a new object of class '<em>Concept Map Group Unmapped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Group Unmapped</em>'.
	 * @generated
	 */
	ConceptMapGroupUnmapped createConceptMapGroupUnmapped();

	/**
	 * Returns a new object of class '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Group</em>'.
	 * @generated
	 */
	RequestGroup createRequestGroup();

	/**
	 * Returns a new object of class '<em>Request Group Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Group Action</em>'.
	 * @generated
	 */
	RequestGroupAction createRequestGroupAction();

	/**
	 * Returns a new object of class '<em>Request Group Action Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Group Action Condition</em>'.
	 * @generated
	 */
	RequestGroupActionCondition createRequestGroupActionCondition();

	/**
	 * Returns a new object of class '<em>Request Group Action Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Group Action Related Action</em>'.
	 * @generated
	 */
	RequestGroupActionRelatedAction createRequestGroupActionRelatedAction();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities</em>'.
	 * @generated
	 */
	TerminologyCapabilities createTerminologyCapabilities();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Software</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesSoftware createTerminologyCapabilitiesSoftware();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Implementation</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesImplementation createTerminologyCapabilitiesImplementation();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Code System</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesCodeSystem createTerminologyCapabilitiesCodeSystem();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Code System Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Code System Version</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesCodeSystemVersion createTerminologyCapabilitiesCodeSystemVersion();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Code System Version Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Code System Version Filter</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesCodeSystemVersionFilter createTerminologyCapabilitiesCodeSystemVersionFilter();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Expansion</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesExpansion createTerminologyCapabilitiesExpansion();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Expansion Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Expansion Parameter</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesExpansionParameter createTerminologyCapabilitiesExpansionParameter();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Validate Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Validate Code</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesValidateCode createTerminologyCapabilitiesValidateCode();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Translation</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesTranslation createTerminologyCapabilitiesTranslation();

	/**
	 * Returns a new object of class '<em>Terminology Capabilities Closure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Capabilities Closure</em>'.
	 * @generated
	 */
	TerminologyCapabilitiesClosure createTerminologyCapabilitiesClosure();

	/**
	 * Returns a new object of class '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric</em>'.
	 * @generated
	 */
	DeviceMetric createDeviceMetric();

	/**
	 * Returns a new object of class '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Calibration</em>'.
	 * @generated
	 */
	DeviceMetricCalibration createDeviceMetricCalibration();

	/**
	 * Returns a new object of class '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flag</em>'.
	 * @generated
	 */
	Flag createFlag();

	/**
	 * Returns a new object of class '<em>Immunization Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Evaluation</em>'.
	 * @generated
	 */
	ImmunizationEvaluation createImmunizationEvaluation();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Immunization Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Performer</em>'.
	 * @generated
	 */
	ImmunizationPerformer createImmunizationPerformer();

	/**
	 * Returns a new object of class '<em>Immunization Education</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Education</em>'.
	 * @generated
	 */
	ImmunizationEducation createImmunizationEducation();

	/**
	 * Returns a new object of class '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Reaction</em>'.
	 * @generated
	 */
	ImmunizationReaction createImmunizationReaction();

	/**
	 * Returns a new object of class '<em>Immunization Protocol Applied</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Protocol Applied</em>'.
	 * @generated
	 */
	ImmunizationProtocolApplied createImmunizationProtocolApplied();

	/**
	 * Returns a new object of class '<em>Medicinal Product Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Indication</em>'.
	 * @generated
	 */
	MedicinalProductIndication createMedicinalProductIndication();

	/**
	 * Returns a new object of class '<em>Medicinal Product Indication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Indication Other Therapy</em>'.
	 * @generated
	 */
	MedicinalProductIndicationOtherTherapy createMedicinalProductIndicationOtherTherapy();

	/**
	 * Returns a new object of class '<em>Medicinal Product Undesirable Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Undesirable Effect</em>'.
	 * @generated
	 */
	MedicinalProductUndesirableEffect createMedicinalProductUndesirableEffect();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest</em>'.
	 * @generated
	 */
	DocumentManifest createDocumentManifest();

	/**
	 * Returns a new object of class '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest Related</em>'.
	 * @generated
	 */
	DocumentManifestRelated createDocumentManifestRelated();

	/**
	 * Returns a new object of class '<em>Guidance Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response</em>'.
	 * @generated
	 */
	GuidanceResponse createGuidanceResponse();

	/**
	 * Returns a new object of class '<em>Operation Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Outcome</em>'.
	 * @generated
	 */
	OperationOutcome createOperationOutcome();

	/**
	 * Returns a new object of class '<em>Operation Outcome Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Outcome Issue</em>'.
	 * @generated
	 */
	OperationOutcomeIssue createOperationOutcomeIssue();

	/**
	 * Returns a new object of class '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters</em>'.
	 * @generated
	 */
	Parameters createParameters();

	/**
	 * Returns a new object of class '<em>Parameters Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Parameter</em>'.
	 * @generated
	 */
	ParametersParameter createParametersParameter();

	/**
	 * Returns a new object of class '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide</em>'.
	 * @generated
	 */
	ImplementationGuide createImplementationGuide();

	/**
	 * Returns a new object of class '<em>Implementation Guide Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Depends On</em>'.
	 * @generated
	 */
	ImplementationGuideDependsOn createImplementationGuideDependsOn();

	/**
	 * Returns a new object of class '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Global</em>'.
	 * @generated
	 */
	ImplementationGuideGlobal createImplementationGuideGlobal();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition</em>'.
	 * @generated
	 */
	ImplementationGuideDefinition createImplementationGuideDefinition();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition Grouping</em>'.
	 * @generated
	 */
	ImplementationGuideDefinitionGrouping createImplementationGuideDefinitionGrouping();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition Resource</em>'.
	 * @generated
	 */
	ImplementationGuideDefinitionResource createImplementationGuideDefinitionResource();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition Page</em>'.
	 * @generated
	 */
	ImplementationGuideDefinitionPage createImplementationGuideDefinitionPage();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition Parameter</em>'.
	 * @generated
	 */
	ImplementationGuideDefinitionParameter createImplementationGuideDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Implementation Guide Definition Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Definition Template</em>'.
	 * @generated
	 */
	ImplementationGuideDefinitionTemplate createImplementationGuideDefinitionTemplate();

	/**
	 * Returns a new object of class '<em>Implementation Guide Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Manifest</em>'.
	 * @generated
	 */
	ImplementationGuideManifest createImplementationGuideManifest();

	/**
	 * Returns a new object of class '<em>Implementation Guide Manifest Manifest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Manifest Manifest Resource</em>'.
	 * @generated
	 */
	ImplementationGuideManifestManifestResource createImplementationGuideManifestManifestResource();

	/**
	 * Returns a new object of class '<em>Implementation Guide Manifest Manifest Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Manifest Manifest Page</em>'.
	 * @generated
	 */
	ImplementationGuideManifestManifestPage createImplementationGuideManifestManifestPage();

	/**
	 * Returns a new object of class '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter</em>'.
	 * @generated
	 */
	SearchParameter createSearchParameter();

	/**
	 * Returns a new object of class '<em>Search Parameter Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter Component</em>'.
	 * @generated
	 */
	SearchParameterComponent createSearchParameterComponent();

	/**
	 * Returns a new object of class '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition</em>'.
	 * @generated
	 */
	OperationDefinition createOperationDefinition();

	/**
	 * Returns a new object of class '<em>Operation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Parameter</em>'.
	 * @generated
	 */
	OperationDefinitionParameter createOperationDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Operation Definition Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Parameter Binding</em>'.
	 * @generated
	 */
	OperationDefinitionParameterBinding createOperationDefinitionParameterBinding();

	/**
	 * Returns a new object of class '<em>Operation Definition Parameter Referenced From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Parameter Referenced From</em>'.
	 * @generated
	 */
	OperationDefinitionParameterReferencedFrom createOperationDefinitionParameterReferencedFrom();

	/**
	 * Returns a new object of class '<em>Operation Definition Overload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Overload</em>'.
	 * @generated
	 */
	OperationDefinitionOverload createOperationDefinitionOverload();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation</em>'.
	 * @generated
	 */
	PaymentReconciliation createPaymentReconciliation();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation Details</em>'.
	 * @generated
	 */
	PaymentReconciliationDetails createPaymentReconciliationDetails();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation Notes</em>'.
	 * @generated
	 */
	PaymentReconciliationNotes createPaymentReconciliationNotes();

	/**
	 * Returns a new object of class '<em>Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role</em>'.
	 * @generated
	 */
	PractitionerRole createPractitionerRole();

	/**
	 * Returns a new object of class '<em>Practitioner Role Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role Available Time</em>'.
	 * @generated
	 */
	PractitionerRoleAvailableTime createPractitionerRoleAvailableTime();

	/**
	 * Returns a new object of class '<em>Practitioner Role Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role Not Available</em>'.
	 * @generated
	 */
	PractitionerRoleNotAvailable createPractitionerRoleNotAvailable();

	/**
	 * Returns a new object of class '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Statement</em>'.
	 * @generated
	 */
	DeviceUseStatement createDeviceUseStatement();

	/**
	 * Returns a new object of class '<em>Family Member History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member History</em>'.
	 * @generated
	 */
	FamilyMemberHistory createFamilyMemberHistory();

	/**
	 * Returns a new object of class '<em>Family Member History Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member History Condition</em>'.
	 * @generated
	 */
	FamilyMemberHistoryCondition createFamilyMemberHistoryCondition();

	/**
	 * Returns a new object of class '<em>Organization Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Affiliation</em>'.
	 * @generated
	 */
	OrganizationAffiliation createOrganizationAffiliation();

	/**
	 * Returns a new object of class '<em>Research Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Definition</em>'.
	 * @generated
	 */
	ResearchDefinition createResearchDefinition();

	/**
	 * Returns a new object of class '<em>Research Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Element Definition</em>'.
	 * @generated
	 */
	ResearchElementDefinition createResearchElementDefinition();

	/**
	 * Returns a new object of class '<em>Research Element Definition Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Element Definition Characteristic</em>'.
	 * @generated
	 */
	ResearchElementDefinitionCharacteristic createResearchElementDefinitionCharacteristic();

	/**
	 * Returns a new object of class '<em>Adverse Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverse Event</em>'.
	 * @generated
	 */
	AdverseEvent createAdverseEvent();

	/**
	 * Returns a new object of class '<em>Adverse Event Suspect Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverse Event Suspect Entity</em>'.
	 * @generated
	 */
	AdverseEventSuspectEntity createAdverseEventSuspectEntity();

	/**
	 * Returns a new object of class '<em>Adverse Event Suspect Entity Causality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverse Event Suspect Entity Causality</em>'.
	 * @generated
	 */
	AdverseEventSuspectEntityCausality createAdverseEventSuspectEntityCausality();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesis createRiskEvidenceSynthesis();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesisSampleSize createRiskEvidenceSynthesisSampleSize();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesisRiskEstimate createRiskEvidenceSynthesisRiskEstimate();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis Risk Estimate Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis Risk Estimate Precision Estimate</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesisRiskEstimatePrecisionEstimate createRiskEvidenceSynthesisRiskEstimatePrecisionEstimate();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis Certainty</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesisCertainty createRiskEvidenceSynthesisCertainty();

	/**
	 * Returns a new object of class '<em>Risk Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * @generated
	 */
	RiskEvidenceSynthesisCertaintyCertaintySubcomponent createRiskEvidenceSynthesisCertaintyCertaintySubcomponent();

	/**
	 * Returns a new object of class '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script</em>'.
	 * @generated
	 */
	TestScript createTestScript();

	/**
	 * Returns a new object of class '<em>Test Script Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Origin</em>'.
	 * @generated
	 */
	TestScriptOrigin createTestScriptOrigin();

	/**
	 * Returns a new object of class '<em>Test Script Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Destination</em>'.
	 * @generated
	 */
	TestScriptDestination createTestScriptDestination();

	/**
	 * Returns a new object of class '<em>Test Script Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Metadata</em>'.
	 * @generated
	 */
	TestScriptMetadata createTestScriptMetadata();

	/**
	 * Returns a new object of class '<em>Test Script Metadata Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Metadata Link</em>'.
	 * @generated
	 */
	TestScriptMetadataLink createTestScriptMetadataLink();

	/**
	 * Returns a new object of class '<em>Test Script Metadata Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Metadata Capability</em>'.
	 * @generated
	 */
	TestScriptMetadataCapability createTestScriptMetadataCapability();

	/**
	 * Returns a new object of class '<em>Capability Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement</em>'.
	 * @generated
	 */
	CapabilityStatement createCapabilityStatement();

	/**
	 * Returns a new object of class '<em>Capability Statement Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Software</em>'.
	 * @generated
	 */
	CapabilityStatementSoftware createCapabilityStatementSoftware();

	/**
	 * Returns a new object of class '<em>Capability Statement Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Implementation</em>'.
	 * @generated
	 */
	CapabilityStatementImplementation createCapabilityStatementImplementation();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest</em>'.
	 * @generated
	 */
	CapabilityStatementRest createCapabilityStatementRest();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest Security</em>'.
	 * @generated
	 */
	CapabilityStatementRestSecurity createCapabilityStatementRestSecurity();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest Resource</em>'.
	 * @generated
	 */
	CapabilityStatementRestResource createCapabilityStatementRestResource();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * @generated
	 */
	CapabilityStatementRestResourceResourceInteraction createCapabilityStatementRestResourceResourceInteraction();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest Resource Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest Resource Search Param</em>'.
	 * @generated
	 */
	CapabilityStatementRestResourceSearchParam createCapabilityStatementRestResourceSearchParam();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest Resource Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest Resource Operation</em>'.
	 * @generated
	 */
	CapabilityStatementRestResourceOperation createCapabilityStatementRestResourceOperation();

	/**
	 * Returns a new object of class '<em>Capability Statement Rest System Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Rest System Interaction</em>'.
	 * @generated
	 */
	CapabilityStatementRestSystemInteraction createCapabilityStatementRestSystemInteraction();

	/**
	 * Returns a new object of class '<em>Compartment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Definition</em>'.
	 * @generated
	 */
	CompartmentDefinition createCompartmentDefinition();

	/**
	 * Returns a new object of class '<em>Compartment Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Definition Resource</em>'.
	 * @generated
	 */
	CompartmentDefinitionResource createCompartmentDefinitionResource();

	/**
	 * Returns a new object of class '<em>Capability Statement Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Messaging</em>'.
	 * @generated
	 */
	CapabilityStatementMessaging createCapabilityStatementMessaging();

	/**
	 * Returns a new object of class '<em>Capability Statement Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Messaging Endpoint</em>'.
	 * @generated
	 */
	CapabilityStatementMessagingEndpoint createCapabilityStatementMessagingEndpoint();

	/**
	 * Returns a new object of class '<em>Capability Statement Messaging Supported Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Messaging Supported Message</em>'.
	 * @generated
	 */
	CapabilityStatementMessagingSupportedMessage createCapabilityStatementMessagingSupportedMessage();

	/**
	 * Returns a new object of class '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition</em>'.
	 * @generated
	 */
	MessageDefinition createMessageDefinition();

	/**
	 * Returns a new object of class '<em>Message Definition Focus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition Focus</em>'.
	 * @generated
	 */
	MessageDefinitionFocus createMessageDefinitionFocus();

	/**
	 * Returns a new object of class '<em>Message Definition Allowed Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition Allowed Response</em>'.
	 * @generated
	 */
	MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse();

	/**
	 * Returns a new object of class '<em>Graph Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Definition</em>'.
	 * @generated
	 */
	GraphDefinition createGraphDefinition();

	/**
	 * Returns a new object of class '<em>Graph Definition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Definition Link</em>'.
	 * @generated
	 */
	GraphDefinitionLink createGraphDefinitionLink();

	/**
	 * Returns a new object of class '<em>Graph Definition Link Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Definition Link Target</em>'.
	 * @generated
	 */
	GraphDefinitionLinkTarget createGraphDefinitionLinkTarget();

	/**
	 * Returns a new object of class '<em>Graph Definition Link Target Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Definition Link Target Compartment</em>'.
	 * @generated
	 */
	GraphDefinitionLinkTargetCompartment createGraphDefinitionLinkTargetCompartment();

	/**
	 * Returns a new object of class '<em>Capability Statement Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Statement Document</em>'.
	 * @generated
	 */
	CapabilityStatementDocument createCapabilityStatementDocument();

	/**
	 * Returns a new object of class '<em>Test Script Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Fixture</em>'.
	 * @generated
	 */
	TestScriptFixture createTestScriptFixture();

	/**
	 * Returns a new object of class '<em>Test Script Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Variable</em>'.
	 * @generated
	 */
	TestScriptVariable createTestScriptVariable();

	/**
	 * Returns a new object of class '<em>Test Script Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup</em>'.
	 * @generated
	 */
	TestScriptSetup createTestScriptSetup();

	/**
	 * Returns a new object of class '<em>Test Script Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Setup Action</em>'.
	 * @generated
	 */
	TestScriptSetupSetupAction createTestScriptSetupSetupAction();

	/**
	 * Returns a new object of class '<em>Test Script Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Setup Action Operation</em>'.
	 * @generated
	 */
	TestScriptSetupSetupActionOperation createTestScriptSetupSetupActionOperation();

	/**
	 * Returns a new object of class '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * @generated
	 */
	TestScriptSetupSetupActionOperationRequestHeader createTestScriptSetupSetupActionOperationRequestHeader();

	/**
	 * Returns a new object of class '<em>Test Script Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Setup Action Assert</em>'.
	 * @generated
	 */
	TestScriptSetupSetupActionAssert createTestScriptSetupSetupActionAssert();

	/**
	 * Returns a new object of class '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Test</em>'.
	 * @generated
	 */
	TestScriptTest createTestScriptTest();

	/**
	 * Returns a new object of class '<em>Test Script Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Test Test Action</em>'.
	 * @generated
	 */
	TestScriptTestTestAction createTestScriptTestTestAction();

	/**
	 * Returns a new object of class '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Teardown</em>'.
	 * @generated
	 */
	TestScriptTeardown createTestScriptTeardown();

	/**
	 * Returns a new object of class '<em>Test Script Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Teardown Teardown Action</em>'.
	 * @generated
	 */
	TestScriptTeardownTeardownAction createTestScriptTeardownTeardownAction();

	/**
	 * Returns a new object of class '<em>Biologically Derived Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biologically Derived Product</em>'.
	 * @generated
	 */
	BiologicallyDerivedProduct createBiologicallyDerivedProduct();

	/**
	 * Returns a new object of class '<em>Biologically Derived Product Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biologically Derived Product Collection</em>'.
	 * @generated
	 */
	BiologicallyDerivedProductCollection createBiologicallyDerivedProductCollection();

	/**
	 * Returns a new object of class '<em>Biologically Derived Product Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biologically Derived Product Processing</em>'.
	 * @generated
	 */
	BiologicallyDerivedProductProcessing createBiologicallyDerivedProductProcessing();

	/**
	 * Returns a new object of class '<em>Biologically Derived Product Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biologically Derived Product Manipulation</em>'.
	 * @generated
	 */
	BiologicallyDerivedProductManipulation createBiologicallyDerivedProductManipulation();

	/**
	 * Returns a new object of class '<em>Biologically Derived Product Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biologically Derived Product Storage</em>'.
	 * @generated
	 */
	BiologicallyDerivedProductStorage createBiologicallyDerivedProductStorage();

	/**
	 * Returns a new object of class '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Request</em>'.
	 * @generated
	 */
	EnrollmentRequest createEnrollmentRequest();

	/**
	 * Returns a new object of class '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header</em>'.
	 * @generated
	 */
	MessageHeader createMessageHeader();

	/**
	 * Returns a new object of class '<em>Message Header Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Message Destination</em>'.
	 * @generated
	 */
	MessageHeaderMessageDestination createMessageHeaderMessageDestination();

	/**
	 * Returns a new object of class '<em>Message Header Message Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Message Source</em>'.
	 * @generated
	 */
	MessageHeaderMessageSource createMessageHeaderMessageSource();

	/**
	 * Returns a new object of class '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Response</em>'.
	 * @generated
	 */
	MessageHeaderResponse createMessageHeaderResponse();

	/**
	 * Returns a new object of class '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Notice</em>'.
	 * @generated
	 */
	PaymentNotice createPaymentNotice();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Subscription Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription Channel</em>'.
	 * @generated
	 */
	SubscriptionChannel createSubscriptionChannel();

	/**
	 * Returns a new object of class '<em>Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage</em>'.
	 * @generated
	 */
	Linkage createLinkage();

	/**
	 * Returns a new object of class '<em>Linkage Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage Item</em>'.
	 * @generated
	 */
	LinkageItem createLinkageItem();

	/**
	 * Returns a new object of class '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Entry</em>'.
	 * @generated
	 */
	CatalogEntry createCatalogEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Related Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog Entry Related Entry</em>'.
	 * @generated
	 */
	CatalogEntryRelatedEntry createCatalogEntryRelatedEntry();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Composition Attester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Attester</em>'.
	 * @generated
	 */
	CompositionAttester createCompositionAttester();

	/**
	 * Returns a new object of class '<em>Composition Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Relates To</em>'.
	 * @generated
	 */
	CompositionRelatesTo createCompositionRelatesTo();

	/**
	 * Returns a new object of class '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Event</em>'.
	 * @generated
	 */
	CompositionEvent createCompositionEvent();

	/**
	 * Returns a new object of class '<em>Composition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Section</em>'.
	 * @generated
	 */
	CompositionSection createCompositionSection();

	/**
	 * Returns a new object of class '<em>Substance Nucleic Acid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Nucleic Acid</em>'.
	 * @generated
	 */
	SubstanceNucleicAcid createSubstanceNucleicAcid();

	/**
	 * Returns a new object of class '<em>Substance Nucleic Acid Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Nucleic Acid Subunit</em>'.
	 * @generated
	 */
	SubstanceNucleicAcidSubunit createSubstanceNucleicAcidSubunit();

	/**
	 * Returns a new object of class '<em>Substance Nucleic Acid Subunit Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Nucleic Acid Subunit Linkage</em>'.
	 * @generated
	 */
	SubstanceNucleicAcidSubunitLinkage createSubstanceNucleicAcidSubunitLinkage();

	/**
	 * Returns a new object of class '<em>Substance Nucleic Acid Subunit Sugar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Nucleic Acid Subunit Sugar</em>'.
	 * @generated
	 */
	SubstanceNucleicAcidSubunitSugar createSubstanceNucleicAcidSubunitSugar();

	/**
	 * Returns a new object of class '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request</em>'.
	 * @generated
	 */
	SupplyRequest createSupplyRequest();

	/**
	 * Returns a new object of class '<em>Supply Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request Parameter</em>'.
	 * @generated
	 */
	SupplyRequestParameter createSupplyRequestParameter();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesis createEffectEvidenceSynthesis();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisSampleSize createEffectEvidenceSynthesisSampleSize();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisResultsByExposure createEffectEvidenceSynthesisResultsByExposure();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisEffectEstimate createEffectEvidenceSynthesisEffectEstimate();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Effect Estimate Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Effect Estimate Precision Estimate</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisEffectEstimatePrecisionEstimate createEffectEvidenceSynthesisEffectEstimatePrecisionEstimate();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Certainty</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisCertainty createEffectEvidenceSynthesisCertainty();

	/**
	 * Returns a new object of class '<em>Effect Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * @generated
	 */
	EffectEvidenceSynthesisCertaintyCertaintySubcomponent createEffectEvidenceSynthesisCertaintyCertaintySubcomponent();

	/**
	 * Returns a new object of class '<em>Insurance Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan</em>'.
	 * @generated
	 */
	InsurancePlan createInsurancePlan();

	/**
	 * Returns a new object of class '<em>Insurance Plan Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Contact</em>'.
	 * @generated
	 */
	InsurancePlanContact createInsurancePlanContact();

	/**
	 * Returns a new object of class '<em>Insurance Plan Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Coverage</em>'.
	 * @generated
	 */
	InsurancePlanCoverage createInsurancePlanCoverage();

	/**
	 * Returns a new object of class '<em>Insurance Plan Coverage Coverage Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Coverage Coverage Benefit</em>'.
	 * @generated
	 */
	InsurancePlanCoverageCoverageBenefit createInsurancePlanCoverageCoverageBenefit();

	/**
	 * Returns a new object of class '<em>Insurance Plan Coverage Coverage Benefit Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Coverage Coverage Benefit Limit</em>'.
	 * @generated
	 */
	InsurancePlanCoverageCoverageBenefitLimit createInsurancePlanCoverageCoverageBenefitLimit();

	/**
	 * Returns a new object of class '<em>Insurance Plan Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Plan</em>'.
	 * @generated
	 */
	InsurancePlanPlan createInsurancePlanPlan();

	/**
	 * Returns a new object of class '<em>Insurance Plan Plan General Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Plan General Cost</em>'.
	 * @generated
	 */
	InsurancePlanPlanGeneralCost createInsurancePlanPlanGeneralCost();

	/**
	 * Returns a new object of class '<em>Insurance Plan Plan Specific Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Plan Specific Cost</em>'.
	 * @generated
	 */
	InsurancePlanPlanSpecificCost createInsurancePlanPlanSpecificCost();

	/**
	 * Returns a new object of class '<em>Insurance Plan Plan Specific Cost Plan Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Plan Specific Cost Plan Benefit</em>'.
	 * @generated
	 */
	InsurancePlanPlanSpecificCostPlanBenefit createInsurancePlanPlanSpecificCostPlanBenefit();

	/**
	 * Returns a new object of class '<em>Insurance Plan Plan Specific Cost Plan Benefit Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Plan Plan Specific Cost Plan Benefit Cost</em>'.
	 * @generated
	 */
	InsurancePlanPlanSpecificCostPlanBenefitCost createInsurancePlanPlanSpecificCostPlanBenefitCost();

	/**
	 * Returns a new object of class '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence</em>'.
	 * @generated
	 */
	Evidence createEvidence();

	/**
	 * Returns a new object of class '<em>Substance Reference Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Reference Information</em>'.
	 * @generated
	 */
	SubstanceReferenceInformation createSubstanceReferenceInformation();

	/**
	 * Returns a new object of class '<em>Substance Reference Information Gene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Reference Information Gene</em>'.
	 * @generated
	 */
	SubstanceReferenceInformationGene createSubstanceReferenceInformationGene();

	/**
	 * Returns a new object of class '<em>Substance Reference Information Gene Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Reference Information Gene Element</em>'.
	 * @generated
	 */
	SubstanceReferenceInformationGeneElement createSubstanceReferenceInformationGeneElement();

	/**
	 * Returns a new object of class '<em>Substance Reference Information Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Reference Information Classification</em>'.
	 * @generated
	 */
	SubstanceReferenceInformationClassification createSubstanceReferenceInformationClassification();

	/**
	 * Returns a new object of class '<em>Substance Reference Information Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Reference Information Target</em>'.
	 * @generated
	 */
	SubstanceReferenceInformationTarget createSubstanceReferenceInformationTarget();

	/**
	 * Returns a new object of class '<em>Substance Polymer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer</em>'.
	 * @generated
	 */
	SubstancePolymer createSubstancePolymer();

	/**
	 * Returns a new object of class '<em>Substance Polymer Monomer Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Monomer Set</em>'.
	 * @generated
	 */
	SubstancePolymerMonomerSet createSubstancePolymerMonomerSet();

	/**
	 * Returns a new object of class '<em>Substance Polymer Monomer Set Starting Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Monomer Set Starting Material</em>'.
	 * @generated
	 */
	SubstancePolymerMonomerSetStartingMaterial createSubstancePolymerMonomerSetStartingMaterial();

	/**
	 * Returns a new object of class '<em>Substance Polymer Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Repeat</em>'.
	 * @generated
	 */
	SubstancePolymerRepeat createSubstancePolymerRepeat();

	/**
	 * Returns a new object of class '<em>Substance Polymer Repeat Repeat Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Repeat Repeat Unit</em>'.
	 * @generated
	 */
	SubstancePolymerRepeatRepeatUnit createSubstancePolymerRepeatRepeatUnit();

	/**
	 * Returns a new object of class '<em>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</em>'.
	 * @generated
	 */
	SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation createSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation();

	/**
	 * Returns a new object of class '<em>Substance Polymer Repeat Repeat Unit Structural Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Polymer Repeat Repeat Unit Structural Representation</em>'.
	 * @generated
	 */
	SubstancePolymerRepeatRepeatUnitStructuralRepresentation createSubstancePolymerRepeatRepeatUnitStructuralRepresentation();

	/**
	 * Returns a new object of class '<em>Substance Protein</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Protein</em>'.
	 * @generated
	 */
	SubstanceProtein createSubstanceProtein();

	/**
	 * Returns a new object of class '<em>Substance Protein Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Protein Subunit</em>'.
	 * @generated
	 */
	SubstanceProteinSubunit createSubstanceProteinSubunit();

	/**
	 * Returns a new object of class '<em>Substance Source Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material</em>'.
	 * @generated
	 */
	SubstanceSourceMaterial createSubstanceSourceMaterial();

	/**
	 * Returns a new object of class '<em>Substance Source Material Fraction Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Fraction Description</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialFractionDescription createSubstanceSourceMaterialFractionDescription();

	/**
	 * Returns a new object of class '<em>Substance Source Material Organism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Organism</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialOrganism createSubstanceSourceMaterialOrganism();

	/**
	 * Returns a new object of class '<em>Substance Source Material Organism Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Organism Author</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialOrganismAuthor createSubstanceSourceMaterialOrganismAuthor();

	/**
	 * Returns a new object of class '<em>Substance Source Material Organism Hybrid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Organism Hybrid</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialOrganismHybrid createSubstanceSourceMaterialOrganismHybrid();

	/**
	 * Returns a new object of class '<em>Substance Source Material Organism Organism General</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Organism Organism General</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialOrganismOrganismGeneral createSubstanceSourceMaterialOrganismOrganismGeneral();

	/**
	 * Returns a new object of class '<em>Substance Source Material Part Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Source Material Part Description</em>'.
	 * @generated
	 */
	SubstanceSourceMaterialPartDescription createSubstanceSourceMaterialPartDescription();

	/**
	 * Returns a new object of class '<em>Medicinal Product Contraindication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Contraindication</em>'.
	 * @generated
	 */
	MedicinalProductContraindication createMedicinalProductContraindication();

	/**
	 * Returns a new object of class '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * @generated
	 */
	MedicinalProductContraindicationOtherTherapy createMedicinalProductContraindicationOtherTherapy();

	/**
	 * Returns a new object of class '<em>Molecular Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence</em>'.
	 * @generated
	 */
	MolecularSequence createMolecularSequence();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Reference Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Reference Seq</em>'.
	 * @generated
	 */
	MolecularSequenceReferenceSeq createMolecularSequenceReferenceSeq();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Variant</em>'.
	 * @generated
	 */
	MolecularSequenceVariant createMolecularSequenceVariant();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Quality</em>'.
	 * @generated
	 */
	MolecularSequenceQuality createMolecularSequenceQuality();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Quality Roc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Quality Roc</em>'.
	 * @generated
	 */
	MolecularSequenceQualityRoc createMolecularSequenceQualityRoc();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Repository</em>'.
	 * @generated
	 */
	MolecularSequenceRepository createMolecularSequenceRepository();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Structure Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Structure Variant</em>'.
	 * @generated
	 */
	MolecularSequenceStructureVariant createMolecularSequenceStructureVariant();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Structure Variant Outer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Structure Variant Outer</em>'.
	 * @generated
	 */
	MolecularSequenceStructureVariantOuter createMolecularSequenceStructureVariantOuter();

	/**
	 * Returns a new object of class '<em>Molecular Sequence Structure Variant Inner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecular Sequence Structure Variant Inner</em>'.
	 * @generated
	 */
	MolecularSequenceStructureVariantInner createMolecularSequenceStructureVariantInner();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	AllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Reaction</em>'.
	 * @generated
	 */
	AllergyIntoleranceReaction createAllergyIntoleranceReaction();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Invoice Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Participant</em>'.
	 * @generated
	 */
	InvoiceParticipant createInvoiceParticipant();

	/**
	 * Returns a new object of class '<em>Invoice Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Line Item</em>'.
	 * @generated
	 */
	InvoiceLineItem createInvoiceLineItem();

	/**
	 * Returns a new object of class '<em>Invoice Line Item Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Line Item Price Component</em>'.
	 * @generated
	 */
	InvoiceLineItemPriceComponent createInvoiceLineItemPriceComponent();

	/**
	 * Returns a new object of class '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Response</em>'.
	 * @generated
	 */
	EnrollmentResponse createEnrollmentResponse();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation</em>'.
	 * @generated
	 */
	ImmunizationRecommendation createImmunizationRecommendation();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * @generated
	 */
	ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * @generated
	 */
	ImmunizationRecommendationRecommendationDateCriterion createImmunizationRecommendationRecommendationDateCriterion();

	/**
	 * Returns a new object of class '<em>Verification Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Result</em>'.
	 * @generated
	 */
	VerificationResult createVerificationResult();

	/**
	 * Returns a new object of class '<em>Verification Result Primary Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Result Primary Source</em>'.
	 * @generated
	 */
	VerificationResultPrimarySource createVerificationResultPrimarySource();

	/**
	 * Returns a new object of class '<em>Verification Result Attestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Result Attestation</em>'.
	 * @generated
	 */
	VerificationResultAttestation createVerificationResultAttestation();

	/**
	 * Returns a new object of class '<em>Verification Result Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Result Validator</em>'.
	 * @generated
	 */
	VerificationResultValidator createVerificationResultValidator();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Link</em>'.
	 * @generated
	 */
	BundleLink createBundleLink();

	/**
	 * Returns a new object of class '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry</em>'.
	 * @generated
	 */
	BundleEntry createBundleEntry();

	/**
	 * Returns a new object of class '<em>Entry Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Resource</em>'.
	 * @generated
	 */
	Entry_Resource createEntry_Resource();

	/**
	 * Returns a new object of class '<em>Bundle Entry Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry Search</em>'.
	 * @generated
	 */
	BundleEntrySearch createBundleEntrySearch();

	/**
	 * Returns a new object of class '<em>Bundle Entry Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry Request</em>'.
	 * @generated
	 */
	BundleEntryRequest createBundleEntryRequest();

	/**
	 * Returns a new object of class '<em>Bundle Entry Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry Response</em>'.
	 * @generated
	 */
	BundleEntryResponse createBundleEntryResponse();

	/**
	 * Returns a new object of class '<em>Test Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report</em>'.
	 * @generated
	 */
	TestReport createTestReport();

	/**
	 * Returns a new object of class '<em>Test Report Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Participant</em>'.
	 * @generated
	 */
	TestReportParticipant createTestReportParticipant();

	/**
	 * Returns a new object of class '<em>Test Report Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Setup</em>'.
	 * @generated
	 */
	TestReportSetup createTestReportSetup();

	/**
	 * Returns a new object of class '<em>Test Report Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Setup Setup Action</em>'.
	 * @generated
	 */
	TestReportSetupSetupAction createTestReportSetupSetupAction();

	/**
	 * Returns a new object of class '<em>Test Report Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Setup Setup Action Operation</em>'.
	 * @generated
	 */
	TestReportSetupSetupActionOperation createTestReportSetupSetupActionOperation();

	/**
	 * Returns a new object of class '<em>Test Report Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Setup Setup Action Assert</em>'.
	 * @generated
	 */
	TestReportSetupSetupActionAssert createTestReportSetupSetupActionAssert();

	/**
	 * Returns a new object of class '<em>Test Report Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Test</em>'.
	 * @generated
	 */
	TestReportTest createTestReportTest();

	/**
	 * Returns a new object of class '<em>Test Report Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Test Test Action</em>'.
	 * @generated
	 */
	TestReportTestTestAction createTestReportTestTestAction();

	/**
	 * Returns a new object of class '<em>Test Report Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Teardown</em>'.
	 * @generated
	 */
	TestReportTeardown createTestReportTeardown();

	/**
	 * Returns a new object of class '<em>Test Report Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Report Teardown Teardown Action</em>'.
	 * @generated
	 */
	TestReportTeardownTeardownAction createTestReportTeardownTeardownAction();

	/**
	 * Returns a new object of class '<em>Nutrition Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order</em>'.
	 * @generated
	 */
	NutritionOrder createNutritionOrder();

	/**
	 * Returns a new object of class '<em>Nutrition Order Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Oral Diet</em>'.
	 * @generated
	 */
	NutritionOrderOralDiet createNutritionOrderOralDiet();

	/**
	 * Returns a new object of class '<em>Nutrition Order Oral Diet Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Oral Diet Nutrient</em>'.
	 * @generated
	 */
	NutritionOrderOralDietNutrient createNutritionOrderOralDietNutrient();

	/**
	 * Returns a new object of class '<em>Nutrition Order Oral Diet Texture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Oral Diet Texture</em>'.
	 * @generated
	 */
	NutritionOrderOralDietTexture createNutritionOrderOralDietTexture();

	/**
	 * Returns a new object of class '<em>Nutrition Order Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Supplement</em>'.
	 * @generated
	 */
	NutritionOrderSupplement createNutritionOrderSupplement();

	/**
	 * Returns a new object of class '<em>Nutrition Order Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Enteral Formula</em>'.
	 * @generated
	 */
	NutritionOrderEnteralFormula createNutritionOrderEnteralFormula();

	/**
	 * Returns a new object of class '<em>Nutrition Order Enteral Formula Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Enteral Formula Administration</em>'.
	 * @generated
	 */
	NutritionOrderEnteralFormulaAdministration createNutritionOrderEnteralFormulaAdministration();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Person Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Link</em>'.
	 * @generated
	 */
	PersonLink createPersonLink();

	/**
	 * Returns a new object of class '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement</em>'.
	 * @generated
	 */
	MedicationStatement createMedicationStatement();

	/**
	 * Returns a new object of class '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Response</em>'.
	 * @generated
	 */
	AppointmentResponse createAppointmentResponse();

	/**
	 * Returns a new object of class '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event</em>'.
	 * @generated
	 */
	AuditEvent createAuditEvent();

	/**
	 * Returns a new object of class '<em>Audit Event Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Agent</em>'.
	 * @generated
	 */
	AuditEventAgent createAuditEventAgent();

	/**
	 * Returns a new object of class '<em>Audit Event Agent Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Agent Network</em>'.
	 * @generated
	 */
	AuditEventAgentNetwork createAuditEventAgentNetwork();

	/**
	 * Returns a new object of class '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Source</em>'.
	 * @generated
	 */
	AuditEventSource createAuditEventSource();

	/**
	 * Returns a new object of class '<em>Audit Event Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Entity</em>'.
	 * @generated
	 */
	AuditEventEntity createAuditEventEntity();

	/**
	 * Returns a new object of class '<em>Audit Event Entity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Entity Detail</em>'.
	 * @generated
	 */
	AuditEventEntityDetail createAuditEventEntityDetail();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Request</em>'.
	 * @generated
	 */
	CoverageEligibilityRequest createCoverageEligibilityRequest();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Request Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Request Supporting Information</em>'.
	 * @generated
	 */
	CoverageEligibilityRequestSupportingInformation createCoverageEligibilityRequestSupportingInformation();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Request Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Request Insurance</em>'.
	 * @generated
	 */
	CoverageEligibilityRequestInsurance createCoverageEligibilityRequestInsurance();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Request Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Request Details</em>'.
	 * @generated
	 */
	CoverageEligibilityRequestDetails createCoverageEligibilityRequestDetails();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Request Details Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Request Details Diagnosis</em>'.
	 * @generated
	 */
	CoverageEligibilityRequestDetailsDiagnosis createCoverageEligibilityRequestDetailsDiagnosis();

	/**
	 * Returns a new object of class '<em>Medicinal Product Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Interaction</em>'.
	 * @generated
	 */
	MedicinalProductInteraction createMedicinalProductInteraction();

	/**
	 * Returns a new object of class '<em>Medicinal Product Interaction Interactant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicinal Product Interaction Interactant</em>'.
	 * @generated
	 */
	MedicinalProductInteractionInteractant createMedicinalProductInteractionInteractant();

	/**
	 * Returns a new object of class '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription</em>'.
	 * @generated
	 */
	VisionPrescription createVisionPrescription();

	/**
	 * Returns a new object of class '<em>Vision Prescription Lens Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription Lens Specification</em>'.
	 * @generated
	 */
	VisionPrescriptionLensSpecification createVisionPrescriptionLensSpecification();

	/**
	 * Returns a new object of class '<em>Vision Prescription Lens Specification Prism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription Lens Specification Prism</em>'.
	 * @generated
	 */
	VisionPrescriptionLensSpecificationPrism createVisionPrescriptionLensSpecificationPrism();

	/**
	 * Returns a new object of class '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Delivery</em>'.
	 * @generated
	 */
	SupplyDelivery createSupplyDelivery();

	/**
	 * Returns a new object of class '<em>Supply Delivery Supplied Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Delivery Supplied Item</em>'.
	 * @generated
	 */
	SupplyDeliverySuppliedItem createSupplyDeliverySuppliedItem();

	/**
	 * Returns a new object of class '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense</em>'.
	 * @generated
	 */
	MedicationDispense createMedicationDispense();

	/**
	 * Returns a new object of class '<em>Medication Dispense Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Performer</em>'.
	 * @generated
	 */
	MedicationDispensePerformer createMedicationDispensePerformer();

	/**
	 * Returns a new object of class '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Substitution</em>'.
	 * @generated
	 */
	MedicationDispenseSubstitution createMedicationDispenseSubstitution();

	/**
	 * Returns a new object of class '<em>Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge</em>'.
	 * @generated
	 */
	MedicationKnowledge createMedicationKnowledge();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * @generated
	 */
	MedicationKnowledgeRelatedMedicationKnowledge createMedicationKnowledgeRelatedMedicationKnowledge();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Monograph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Monograph</em>'.
	 * @generated
	 */
	MedicationKnowledgeMonograph createMedicationKnowledgeMonograph();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Ingredient</em>'.
	 * @generated
	 */
	MedicationKnowledgeIngredient createMedicationKnowledgeIngredient();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Cost</em>'.
	 * @generated
	 */
	MedicationKnowledgeCost createMedicationKnowledgeCost();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Monitoring Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Monitoring Program</em>'.
	 * @generated
	 */
	MedicationKnowledgeMonitoringProgram createMedicationKnowledgeMonitoringProgram();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Administration Guidelines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Administration Guidelines</em>'.
	 * @generated
	 */
	MedicationKnowledgeAdministrationGuidelines createMedicationKnowledgeAdministrationGuidelines();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Administration Guidelines Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Administration Guidelines Dosage</em>'.
	 * @generated
	 */
	MedicationKnowledgeAdministrationGuidelinesDosage createMedicationKnowledgeAdministrationGuidelinesDosage();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Administration Guidelines Patient Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Administration Guidelines Patient Characteristics</em>'.
	 * @generated
	 */
	MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics createMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Medicine Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Medicine Classification</em>'.
	 * @generated
	 */
	MedicationKnowledgeMedicineClassification createMedicationKnowledgeMedicineClassification();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Packaging</em>'.
	 * @generated
	 */
	MedicationKnowledgePackaging createMedicationKnowledgePackaging();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Drug Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Drug Characteristic</em>'.
	 * @generated
	 */
	MedicationKnowledgeDrugCharacteristic createMedicationKnowledgeDrugCharacteristic();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Regulatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Regulatory</em>'.
	 * @generated
	 */
	MedicationKnowledgeRegulatory createMedicationKnowledgeRegulatory();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Regulatory Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Regulatory Substitution</em>'.
	 * @generated
	 */
	MedicationKnowledgeRegulatorySubstitution createMedicationKnowledgeRegulatorySubstitution();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Regulatory Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Regulatory Schedule</em>'.
	 * @generated
	 */
	MedicationKnowledgeRegulatorySchedule createMedicationKnowledgeRegulatorySchedule();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Regulatory Max Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Regulatory Max Dispense</em>'.
	 * @generated
	 */
	MedicationKnowledgeRegulatoryMaxDispense createMedicationKnowledgeRegulatoryMaxDispense();

	/**
	 * Returns a new object of class '<em>Medication Knowledge Kinetics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Knowledge Kinetics</em>'.
	 * @generated
	 */
	MedicationKnowledgeKinetics createMedicationKnowledgeKinetics();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Response</em>'.
	 * @generated
	 */
	CoverageEligibilityResponse createCoverageEligibilityResponse();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Response Insurance</em>'.
	 * @generated
	 */
	CoverageEligibilityResponseInsurance createCoverageEligibilityResponseInsurance();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Response Insurance Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Response Insurance Items</em>'.
	 * @generated
	 */
	CoverageEligibilityResponseInsuranceItems createCoverageEligibilityResponseInsuranceItems();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Response Insurance Items Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Response Insurance Items Benefit</em>'.
	 * @generated
	 */
	CoverageEligibilityResponseInsuranceItemsBenefit createCoverageEligibilityResponseInsuranceItemsBenefit();

	/**
	 * Returns a new object of class '<em>Coverage Eligibility Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Eligibility Response Errors</em>'.
	 * @generated
	 */
	CoverageEligibilityResponseErrors createCoverageEligibilityResponseErrors();

	/**
	 * Returns a new object of class '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition</em>'.
	 * @generated
	 */
	StructureDefinition createStructureDefinition();

	/**
	 * Returns a new object of class '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Mapping</em>'.
	 * @generated
	 */
	StructureDefinitionMapping createStructureDefinitionMapping();

	/**
	 * Returns a new object of class '<em>Structure Definition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Context</em>'.
	 * @generated
	 */
	StructureDefinitionContext createStructureDefinitionContext();

	/**
	 * Returns a new object of class '<em>Structure Definition Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Snapshot</em>'.
	 * @generated
	 */
	StructureDefinitionSnapshot createStructureDefinitionSnapshot();

	/**
	 * Returns a new object of class '<em>Structure Definition Differential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Differential</em>'.
	 * @generated
	 */
	StructureDefinitionDifferential createStructureDefinitionDifferential();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
