/**
 */
package fhiRCore.resources.util;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Element;

import fhiRCore.resources.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fhiRCore.resources.ResourcesPackage
 * @generated
 */
public class ResourcesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesSwitch<Adapter> modelSwitch =
		new ResourcesSwitch<Adapter>() {
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseDomainResource(DomainResource object) {
				return createDomainResourceAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseOrganizationContact(OrganizationContact object) {
				return createOrganizationContactAdapter();
			}
			@Override
			public Adapter casePractitioner(Practitioner object) {
				return createPractitionerAdapter();
			}
			@Override
			public Adapter casePractitionerQualification(PractitionerQualification object) {
				return createPractitionerQualificationAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseValueSetCompose(ValueSetCompose object) {
				return createValueSetComposeAdapter();
			}
			@Override
			public Adapter caseValueSetComposeConceptSet(ValueSetComposeConceptSet object) {
				return createValueSetComposeConceptSetAdapter();
			}
			@Override
			public Adapter caseValueSetComposeConceptSetConceptReference(ValueSetComposeConceptSetConceptReference object) {
				return createValueSetComposeConceptSetConceptReferenceAdapter();
			}
			@Override
			public Adapter caseValueSetComposeConceptSetConceptReferenceDesignation(ValueSetComposeConceptSetConceptReferenceDesignation object) {
				return createValueSetComposeConceptSetConceptReferenceDesignationAdapter();
			}
			@Override
			public Adapter caseValueSetComposeConceptSetFilter(ValueSetComposeConceptSetFilter object) {
				return createValueSetComposeConceptSetFilterAdapter();
			}
			@Override
			public Adapter caseValueSetExpansion(ValueSetExpansion object) {
				return createValueSetExpansionAdapter();
			}
			@Override
			public Adapter caseValueSetExpansionParameter(ValueSetExpansionParameter object) {
				return createValueSetExpansionParameterAdapter();
			}
			@Override
			public Adapter caseValueSetExpansionContains(ValueSetExpansionContains object) {
				return createValueSetExpansionContainsAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseMeasureReport(MeasureReport object) {
				return createMeasureReportAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasureGroup(MeasureGroup object) {
				return createMeasureGroupAdapter();
			}
			@Override
			public Adapter caseMeasureGroupPopulation(MeasureGroupPopulation object) {
				return createMeasureGroupPopulationAdapter();
			}
			@Override
			public Adapter caseMeasureGroupStratifier(MeasureGroupStratifier object) {
				return createMeasureGroupStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureGroupStratifierComponent(MeasureGroupStratifierComponent object) {
				return createMeasureGroupStratifierComponentAdapter();
			}
			@Override
			public Adapter caseMeasureSupplementalData(MeasureSupplementalData object) {
				return createMeasureSupplementalDataAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroup(MeasureReportGroup object) {
				return createMeasureReportGroupAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroupPopulation(MeasureReportGroupPopulation object) {
				return createMeasureReportGroupPopulationAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroupStratifier(MeasureReportGroupStratifier object) {
				return createMeasureReportGroupStratifierAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroupStratifierStratifierGroup(MeasureReportGroupStratifierStratifierGroup object) {
				return createMeasureReportGroupStratifierStratifierGroupAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroupStratifierStratifierGroupComponent(MeasureReportGroupStratifierStratifierGroupComponent object) {
				return createMeasureReportGroupStratifierStratifierGroupComponentAdapter();
			}
			@Override
			public Adapter caseMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation(MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation object) {
				return createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationAdapter();
			}
			@Override
			public Adapter casePatient(Patient object) {
				return createPatientAdapter();
			}
			@Override
			public Adapter casePatientContact(PatientContact object) {
				return createPatientContactAdapter();
			}
			@Override
			public Adapter casePatientCommunication(PatientCommunication object) {
				return createPatientCommunicationAdapter();
			}
			@Override
			public Adapter casePatientLink(PatientLink object) {
				return createPatientLinkAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListEntry(ListEntry object) {
				return createListEntryAdapter();
			}
			@Override
			public Adapter caseEncounter(Encounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseEncounterStatusHistory(EncounterStatusHistory object) {
				return createEncounterStatusHistoryAdapter();
			}
			@Override
			public Adapter caseEncounterClassHistory(EncounterClassHistory object) {
				return createEncounterClassHistoryAdapter();
			}
			@Override
			public Adapter caseEncounterParticipant(EncounterParticipant object) {
				return createEncounterParticipantAdapter();
			}
			@Override
			public Adapter caseEncounterDiagnosis(EncounterDiagnosis object) {
				return createEncounterDiagnosisAdapter();
			}
			@Override
			public Adapter caseEncounterHospitalization(EncounterHospitalization object) {
				return createEncounterHospitalizationAdapter();
			}
			@Override
			public Adapter caseEncounterLocation(EncounterLocation object) {
				return createEncounterLocationAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCare(EpisodeOfCare object) {
				return createEpisodeOfCareAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
				return createEpisodeOfCareStatusHistoryAdapter();
			}
			@Override
			public Adapter caseEpisodeOfCareDiagnosis(EpisodeOfCareDiagnosis object) {
				return createEpisodeOfCareDiagnosisAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionStage(ConditionStage object) {
				return createConditionStageAdapter();
			}
			@Override
			public Adapter caseConditionEvidence(ConditionEvidence object) {
				return createConditionEvidenceAdapter();
			}
			@Override
			public Adapter caseClinicalImpression(ClinicalImpression object) {
				return createClinicalImpressionAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionInvestigation(ClinicalImpressionInvestigation object) {
				return createClinicalImpressionInvestigationAdapter();
			}
			@Override
			public Adapter caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
				return createClinicalImpressionFindingAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseObservationComponent(ObservationComponent object) {
				return createObservationComponentAdapter();
			}
			@Override
			public Adapter caseObservationReferenceRange(ObservationReferenceRange object) {
				return createObservationReferenceRangeAdapter();
			}
			@Override
			public Adapter caseCarePlan(CarePlan object) {
				return createCarePlanAdapter();
			}
			@Override
			public Adapter casePlanDefinition(PlanDefinition object) {
				return createPlanDefinitionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionGoal(PlanDefinitionGoal object) {
				return createPlanDefinitionGoalAdapter();
			}
			@Override
			public Adapter casePlanDefinitionGoalTarget(PlanDefinitionGoalTarget object) {
				return createPlanDefinitionGoalTargetAdapter();
			}
			@Override
			public Adapter casePlanDefinitionAction(PlanDefinitionAction object) {
				return createPlanDefinitionActionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActionCondition(PlanDefinitionActionCondition object) {
				return createPlanDefinitionActionConditionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActionRelatedAction(PlanDefinitionActionRelatedAction object) {
				return createPlanDefinitionActionRelatedActionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActionParticipant(PlanDefinitionActionParticipant object) {
				return createPlanDefinitionActionParticipantAdapter();
			}
			@Override
			public Adapter caseStructureMap(StructureMap object) {
				return createStructureMapAdapter();
			}
			@Override
			public Adapter caseStructureMapStructure(StructureMapStructure object) {
				return createStructureMapStructureAdapter();
			}
			@Override
			public Adapter caseStructureMapGroup(StructureMapGroup object) {
				return createStructureMapGroupAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupInput(StructureMapGroupInput object) {
				return createStructureMapGroupInputAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupRule(StructureMapGroupRule object) {
				return createStructureMapGroupRuleAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupRuleSource(StructureMapGroupRuleSource object) {
				return createStructureMapGroupRuleSourceAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupRuleTarget(StructureMapGroupRuleTarget object) {
				return createStructureMapGroupRuleTargetAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupRuleTargetParameter(StructureMapGroupRuleTargetParameter object) {
				return createStructureMapGroupRuleTargetParameterAdapter();
			}
			@Override
			public Adapter caseStructureMapGroupRuleDependent(StructureMapGroupRuleDependent object) {
				return createStructureMapGroupRuleDependentAdapter();
			}
			@Override
			public Adapter casePlanDefinitionActionDynamicValue(PlanDefinitionActionDynamicValue object) {
				return createPlanDefinitionActionDynamicValueAdapter();
			}
			@Override
			public Adapter caseCarePlanActivity(CarePlanActivity object) {
				return createCarePlanActivityAdapter();
			}
			@Override
			public Adapter caseCarePlanActivityDetail(CarePlanActivityDetail object) {
				return createCarePlanActivityDetailAdapter();
			}
			@Override
			public Adapter caseCareTeam(CareTeam object) {
				return createCareTeamAdapter();
			}
			@Override
			public Adapter caseCareTeamParticipant(CareTeamParticipant object) {
				return createCareTeamParticipantAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseGoalTarget(GoalTarget object) {
				return createGoalTargetAdapter();
			}
			@Override
			public Adapter caseAppointment(Appointment object) {
				return createAppointmentAdapter();
			}
			@Override
			public Adapter caseAppointmentParticipant(AppointmentParticipant object) {
				return createAppointmentParticipantAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseServiceRequest(ServiceRequest object) {
				return createServiceRequestAdapter();
			}
			@Override
			public Adapter caseActivityDefinition(ActivityDefinition object) {
				return createActivityDefinitionAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionParticipant(ActivityDefinitionParticipant object) {
				return createActivityDefinitionParticipantAdapter();
			}
			@Override
			public Adapter caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
				return createActivityDefinitionDynamicValueAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseLocationPosition(LocationPosition object) {
				return createLocationPositionAdapter();
			}
			@Override
			public Adapter caseLocationHoursOfOperation(LocationHoursOfOperation object) {
				return createLocationHoursOfOperationAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinition(SpecimenDefinition object) {
				return createSpecimenDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionTypeTested(SpecimenDefinitionTypeTested object) {
				return createSpecimenDefinitionTypeTestedAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionTypeTestedContainer(SpecimenDefinitionTypeTestedContainer object) {
				return createSpecimenDefinitionTypeTestedContainerAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionTypeTestedContainerAdditive(SpecimenDefinitionTypeTestedContainerAdditive object) {
				return createSpecimenDefinitionTypeTestedContainerAdditiveAdapter();
			}
			@Override
			public Adapter caseSpecimenDefinitionTypeTestedHandling(SpecimenDefinitionTypeTestedHandling object) {
				return createSpecimenDefinitionTypeTestedHandlingAdapter();
			}
			@Override
			public Adapter caseObservationDefinition(ObservationDefinition object) {
				return createObservationDefinitionAdapter();
			}
			@Override
			public Adapter caseObservationDefinitionQuantitativeDetails(ObservationDefinitionQuantitativeDetails object) {
				return createObservationDefinitionQuantitativeDetailsAdapter();
			}
			@Override
			public Adapter caseObservationDefinitionQualifiedInterval(ObservationDefinitionQualifiedInterval object) {
				return createObservationDefinitionQualifiedIntervalAdapter();
			}
			@Override
			public Adapter caseCoverage(Coverage object) {
				return createCoverageAdapter();
			}
			@Override
			public Adapter caseCoverageClass(CoverageClass object) {
				return createCoverageClassAdapter();
			}
			@Override
			public Adapter caseCoverageCostToBeneficiary(CoverageCostToBeneficiary object) {
				return createCoverageCostToBeneficiaryAdapter();
			}
			@Override
			public Adapter caseCoverageCostToBeneficiaryExemption(CoverageCostToBeneficiaryExemption object) {
				return createCoverageCostToBeneficiaryExemptionAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseContractContentDefinition(ContractContentDefinition object) {
				return createContractContentDefinitionAdapter();
			}
			@Override
			public Adapter caseContractTerm(ContractTerm object) {
				return createContractTermAdapter();
			}
			@Override
			public Adapter caseContractTermSecurityLabel(ContractTermSecurityLabel object) {
				return createContractTermSecurityLabelAdapter();
			}
			@Override
			public Adapter caseContractTermContractOffer(ContractTermContractOffer object) {
				return createContractTermContractOfferAdapter();
			}
			@Override
			public Adapter caseContractTermContractOfferContractParty(ContractTermContractOfferContractParty object) {
				return createContractTermContractOfferContractPartyAdapter();
			}
			@Override
			public Adapter caseContractTermContractOfferAnswer(ContractTermContractOfferAnswer object) {
				return createContractTermContractOfferAnswerAdapter();
			}
			@Override
			public Adapter caseContractTermContractAsset(ContractTermContractAsset object) {
				return createContractTermContractAssetAdapter();
			}
			@Override
			public Adapter caseContractTermContractAssetAssetContext(ContractTermContractAssetAssetContext object) {
				return createContractTermContractAssetAssetContextAdapter();
			}
			@Override
			public Adapter caseContractTermContractAssetValuedItem(ContractTermContractAssetValuedItem object) {
				return createContractTermContractAssetValuedItemAdapter();
			}
			@Override
			public Adapter caseContractTermAction(ContractTermAction object) {
				return createContractTermActionAdapter();
			}
			@Override
			public Adapter caseContractTermActionActionSubject(ContractTermActionActionSubject object) {
				return createContractTermActionActionSubjectAdapter();
			}
			@Override
			public Adapter caseContractSignatory(ContractSignatory object) {
				return createContractSignatoryAdapter();
			}
			@Override
			public Adapter caseContractFriendlyLanguage(ContractFriendlyLanguage object) {
				return createContractFriendlyLanguageAdapter();
			}
			@Override
			public Adapter caseContractLegalLanguage(ContractLegalLanguage object) {
				return createContractLegalLanguageAdapter();
			}
			@Override
			public Adapter caseContractComputableLanguage(ContractComputableLanguage object) {
				return createContractComputableLanguageAdapter();
			}
			@Override
			public Adapter caseRelatedPerson(RelatedPerson object) {
				return createRelatedPersonAdapter();
			}
			@Override
			public Adapter caseRelatedPersonCommunication(RelatedPersonCommunication object) {
				return createRelatedPersonCommunicationAdapter();
			}
			@Override
			public Adapter caseProvenance(Provenance object) {
				return createProvenanceAdapter();
			}
			@Override
			public Adapter caseProvenanceAgent(ProvenanceAgent object) {
				return createProvenanceAgentAdapter();
			}
			@Override
			public Adapter caseProvenanceEntity(ProvenanceEntity object) {
				return createProvenanceEntityAdapter();
			}
			@Override
			public Adapter caseSpecimen(Specimen object) {
				return createSpecimenAdapter();
			}
			@Override
			public Adapter caseSpecimenCollection(SpecimenCollection object) {
				return createSpecimenCollectionAdapter();
			}
			@Override
			public Adapter caseSpecimenProcessing(SpecimenProcessing object) {
				return createSpecimenProcessingAdapter();
			}
			@Override
			public Adapter caseSpecimenContainer(SpecimenContainer object) {
				return createSpecimenContainerAdapter();
			}
			@Override
			public Adapter caseSubstance(Substance object) {
				return createSubstanceAdapter();
			}
			@Override
			public Adapter caseSubstanceInstance(SubstanceInstance object) {
				return createSubstanceInstanceAdapter();
			}
			@Override
			public Adapter caseSubstanceIngredient(SubstanceIngredient object) {
				return createSubstanceIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationAdministration(MedicationAdministration object) {
				return createMedicationAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationPerformer(MedicationAdministrationPerformer object) {
				return createMedicationAdministrationPerformerAdapter();
			}
			@Override
			public Adapter caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
				return createMedicationAdministrationDosageAdapter();
			}
			@Override
			public Adapter caseMedicationRequest(MedicationRequest object) {
				return createMedicationRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
				return createMedicationRequestDispenseRequestAdapter();
			}
			@Override
			public Adapter caseMedicationRequestDispenseRequestInitialFill(MedicationRequestDispenseRequestInitialFill object) {
				return createMedicationRequestDispenseRequestInitialFillAdapter();
			}
			@Override
			public Adapter caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
				return createMedicationRequestSubstitutionAdapter();
			}
			@Override
			public Adapter caseDetectedIssue(DetectedIssue object) {
				return createDetectedIssueAdapter();
			}
			@Override
			public Adapter caseDetectedIssueEvidence(DetectedIssueEvidence object) {
				return createDetectedIssueEvidenceAdapter();
			}
			@Override
			public Adapter caseDetectedIssueMitigation(DetectedIssueMitigation object) {
				return createDetectedIssueMitigationAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceUdiCarrier(DeviceUdiCarrier object) {
				return createDeviceUdiCarrierAdapter();
			}
			@Override
			public Adapter caseDeviceDeviceName(DeviceDeviceName object) {
				return createDeviceDeviceNameAdapter();
			}
			@Override
			public Adapter caseDeviceSpecialization(DeviceSpecialization object) {
				return createDeviceSpecializationAdapter();
			}
			@Override
			public Adapter caseDeviceVersion(DeviceVersion object) {
				return createDeviceVersionAdapter();
			}
			@Override
			public Adapter caseDeviceProperty(DeviceProperty object) {
				return createDevicePropertyAdapter();
			}
			@Override
			public Adapter caseDeviceDefinition(DeviceDefinition object) {
				return createDeviceDefinitionAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier object) {
				return createDeviceDefinitionUdiDeviceIdentifierAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionDeviceName(DeviceDefinitionDeviceName object) {
				return createDeviceDefinitionDeviceNameAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionSpecialization(DeviceDefinitionSpecialization object) {
				return createDeviceDefinitionSpecializationAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionCapability(DeviceDefinitionCapability object) {
				return createDeviceDefinitionCapabilityAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionProperty(DeviceDefinitionProperty object) {
				return createDeviceDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseDeviceDefinitionMaterial(DeviceDefinitionMaterial object) {
				return createDeviceDefinitionMaterialAdapter();
			}
			@Override
			public Adapter caseDocumentReference(DocumentReference object) {
				return createDocumentReferenceAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
				return createDocumentReferenceRelatesToAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceContent(DocumentReferenceContent object) {
				return createDocumentReferenceContentAdapter();
			}
			@Override
			public Adapter caseDocumentReferenceContext(DocumentReferenceContext object) {
				return createDocumentReferenceContextAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
				return createRiskAssessmentPredictionAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseAccountCoverage(AccountCoverage object) {
				return createAccountCoverageAdapter();
			}
			@Override
			public Adapter caseAccountGuarantor(AccountGuarantor object) {
				return createAccountGuarantorAdapter();
			}
			@Override
			public Adapter caseMedicinalProduct(MedicinalProduct object) {
				return createMedicinalProductAdapter();
			}
			@Override
			public Adapter caseMedicinalProductContact(MedicinalProductContact object) {
				return createMedicinalProductContactAdapter();
			}
			@Override
			public Adapter caseMedicinalProductName(MedicinalProductName object) {
				return createMedicinalProductNameAdapter();
			}
			@Override
			public Adapter caseMedicinalProductNameNamePart(MedicinalProductNameNamePart object) {
				return createMedicinalProductNameNamePartAdapter();
			}
			@Override
			public Adapter caseMedicinalProductNameCountryLanguage(MedicinalProductNameCountryLanguage object) {
				return createMedicinalProductNameCountryLanguageAdapter();
			}
			@Override
			public Adapter caseMedicinalProductManufacturingBusinessOperation(MedicinalProductManufacturingBusinessOperation object) {
				return createMedicinalProductManufacturingBusinessOperationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductSpecialDesignation(MedicinalProductSpecialDesignation object) {
				return createMedicinalProductSpecialDesignationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPharmaceutical(MedicinalProductPharmaceutical object) {
				return createMedicinalProductPharmaceuticalAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPharmaceuticalCharacteristics(MedicinalProductPharmaceuticalCharacteristics object) {
				return createMedicinalProductPharmaceuticalCharacteristicsAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPharmaceuticalRouteOfAdministration(MedicinalProductPharmaceuticalRouteOfAdministration object) {
				return createMedicinalProductPharmaceuticalRouteOfAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies(MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies object) {
				return createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod(MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod object) {
				return createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIngredient(MedicinalProductIngredient object) {
				return createMedicinalProductIngredientAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIngredientSpecifiedSubstance(MedicinalProductIngredientSpecifiedSubstance object) {
				return createMedicinalProductIngredientSpecifiedSubstanceAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIngredientSpecifiedSubstanceStrength(MedicinalProductIngredientSpecifiedSubstanceStrength object) {
				return createMedicinalProductIngredientSpecifiedSubstanceStrengthAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength(MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength object) {
				return createMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIngredientSubstance(MedicinalProductIngredientSubstance object) {
				return createMedicinalProductIngredientSubstanceAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPackaged(MedicinalProductPackaged object) {
				return createMedicinalProductPackagedAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPackagedBatchIdentifier(MedicinalProductPackagedBatchIdentifier object) {
				return createMedicinalProductPackagedBatchIdentifierAdapter();
			}
			@Override
			public Adapter caseMedicinalProductPackagedPackageItem(MedicinalProductPackagedPackageItem object) {
				return createMedicinalProductPackagedPackageItemAdapter();
			}
			@Override
			public Adapter caseMedicinalProductAuthorization(MedicinalProductAuthorization object) {
				return createMedicinalProductAuthorizationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductAuthorizationJurisdictionalAuthorization(MedicinalProductAuthorizationJurisdictionalAuthorization object) {
				return createMedicinalProductAuthorizationJurisdictionalAuthorizationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductAuthorizationProcedure(MedicinalProductAuthorizationProcedure object) {
				return createMedicinalProductAuthorizationProcedureAdapter();
			}
			@Override
			public Adapter caseMedicinalProductManufactured(MedicinalProductManufactured object) {
				return createMedicinalProductManufacturedAdapter();
			}
			@Override
			public Adapter caseResearchStudy(ResearchStudy object) {
				return createResearchStudyAdapter();
			}
			@Override
			public Adapter caseResearchStudyArm(ResearchStudyArm object) {
				return createResearchStudyArmAdapter();
			}
			@Override
			public Adapter caseResearchStudyObjective(ResearchStudyObjective object) {
				return createResearchStudyObjectiveAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupCharacteristic(GroupCharacteristic object) {
				return createGroupCharacteristicAdapter();
			}
			@Override
			public Adapter caseGroupMember(GroupMember object) {
				return createGroupMemberAdapter();
			}
			@Override
			public Adapter caseEvidenceVariable(EvidenceVariable object) {
				return createEvidenceVariableAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableCharacteristic(EvidenceVariableCharacteristic object) {
				return createEvidenceVariableCharacteristicAdapter();
			}
			@Override
			public Adapter caseResearchSubject(ResearchSubject object) {
				return createResearchSubjectAdapter();
			}
			@Override
			public Adapter caseConsent(Consent object) {
				return createConsentAdapter();
			}
			@Override
			public Adapter caseConsentPolicy(ConsentPolicy object) {
				return createConsentPolicyAdapter();
			}
			@Override
			public Adapter caseConsentVerification(ConsentVerification object) {
				return createConsentVerificationAdapter();
			}
			@Override
			public Adapter caseConsentprovision(Consentprovision object) {
				return createConsentprovisionAdapter();
			}
			@Override
			public Adapter caseConsentprovisionprovisionActor(ConsentprovisionprovisionActor object) {
				return createConsentprovisionprovisionActorAdapter();
			}
			@Override
			public Adapter caseConsentprovisionprovisionData(ConsentprovisionprovisionData object) {
				return createConsentprovisionprovisionDataAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseChargeItem(ChargeItem object) {
				return createChargeItemAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinition(ChargeItemDefinition object) {
				return createChargeItemDefinitionAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinitionApplicability(ChargeItemDefinitionApplicability object) {
				return createChargeItemDefinitionApplicabilityAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinitionPropertyGroup(ChargeItemDefinitionPropertyGroup object) {
				return createChargeItemDefinitionPropertyGroupAdapter();
			}
			@Override
			public Adapter caseChargeItemDefinitionPropertyGroupPriceComponent(ChargeItemDefinitionPropertyGroupPriceComponent object) {
				return createChargeItemDefinitionPropertyGroupPriceComponentAdapter();
			}
			@Override
			public Adapter caseChargeItemPerformer(ChargeItemPerformer object) {
				return createChargeItemPerformerAdapter();
			}
			@Override
			public Adapter caseMedication(Medication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationIngredient(MedicationIngredient object) {
				return createMedicationIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationBatch(MedicationBatch object) {
				return createMedicationBatchAdapter();
			}
			@Override
			public Adapter caseDiagnosticReport(DiagnosticReport object) {
				return createDiagnosticReportAdapter();
			}
			@Override
			public Adapter caseDiagnosticReportMedia(DiagnosticReportMedia object) {
				return createDiagnosticReportMediaAdapter();
			}
			@Override
			public Adapter caseImagingStudy(ImagingStudy object) {
				return createImagingStudyAdapter();
			}
			@Override
			public Adapter caseImagingStudySeries(ImagingStudySeries object) {
				return createImagingStudySeriesAdapter();
			}
			@Override
			public Adapter caseImagingStudySeriesPerformer(ImagingStudySeriesPerformer object) {
				return createImagingStudySeriesPerformerAdapter();
			}
			@Override
			public Adapter caseImagingStudySeriesInstance(ImagingStudySeriesInstance object) {
				return createImagingStudySeriesInstanceAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseProcedurePerformer(ProcedurePerformer object) {
				return createProcedurePerformerAdapter();
			}
			@Override
			public Adapter caseProcedureFocalDevice(ProcedureFocalDevice object) {
				return createProcedureFocalDeviceAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseCommunicationPayload(CommunicationPayload object) {
				return createCommunicationPayloadAdapter();
			}
			@Override
			public Adapter caseClaimResponse(ClaimResponse object) {
				return createClaimResponseAdapter();
			}
			@Override
			public Adapter caseClaimResponseItem(ClaimResponseItem object) {
				return createClaimResponseItemAdapter();
			}
			@Override
			public Adapter caseClaimResponseItemAdjudication(ClaimResponseItemAdjudication object) {
				return createClaimResponseItemAdjudicationAdapter();
			}
			@Override
			public Adapter caseClaimResponseItemItemDetail(ClaimResponseItemItemDetail object) {
				return createClaimResponseItemItemDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseItemItemDetailSubDetail(ClaimResponseItemItemDetailSubDetail object) {
				return createClaimResponseItemItemDetailSubDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseAddedItem(ClaimResponseAddedItem object) {
				return createClaimResponseAddedItemAdapter();
			}
			@Override
			public Adapter caseClaimResponseAddedItemAddedItemDetail(ClaimResponseAddedItemAddedItemDetail object) {
				return createClaimResponseAddedItemAddedItemDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseAddedItemAddedItemDetailAddedItemSubDetail(ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail object) {
				return createClaimResponseAddedItemAddedItemDetailAddedItemSubDetailAdapter();
			}
			@Override
			public Adapter caseClaimResponseTotal(ClaimResponseTotal object) {
				return createClaimResponseTotalAdapter();
			}
			@Override
			public Adapter caseClaimResponsePayment(ClaimResponsePayment object) {
				return createClaimResponsePaymentAdapter();
			}
			@Override
			public Adapter caseClaimResponseNote(ClaimResponseNote object) {
				return createClaimResponseNoteAdapter();
			}
			@Override
			public Adapter caseClaimResponseInsurance(ClaimResponseInsurance object) {
				return createClaimResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimResponseError(ClaimResponseError object) {
				return createClaimResponseErrorAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseClaimRelatedClaim(ClaimRelatedClaim object) {
				return createClaimRelatedClaimAdapter();
			}
			@Override
			public Adapter caseClaimPayee(ClaimPayee object) {
				return createClaimPayeeAdapter();
			}
			@Override
			public Adapter caseClaimCareTeam(ClaimCareTeam object) {
				return createClaimCareTeamAdapter();
			}
			@Override
			public Adapter caseClaimSupportingInformation(ClaimSupportingInformation object) {
				return createClaimSupportingInformationAdapter();
			}
			@Override
			public Adapter caseClaimDiagnosis(ClaimDiagnosis object) {
				return createClaimDiagnosisAdapter();
			}
			@Override
			public Adapter caseClaimProcedure(ClaimProcedure object) {
				return createClaimProcedureAdapter();
			}
			@Override
			public Adapter caseClaimInsurance(ClaimInsurance object) {
				return createClaimInsuranceAdapter();
			}
			@Override
			public Adapter caseClaimAccident(ClaimAccident object) {
				return createClaimAccidentAdapter();
			}
			@Override
			public Adapter caseClaimItem(ClaimItem object) {
				return createClaimItemAdapter();
			}
			@Override
			public Adapter caseClaimItemDetail(ClaimItemDetail object) {
				return createClaimItemDetailAdapter();
			}
			@Override
			public Adapter caseClaimItemDetailSubDetail(ClaimItemDetailSubDetail object) {
				return createClaimItemDetailSubDetailAdapter();
			}
			@Override
			public Adapter caseDeviceRequest(DeviceRequest object) {
				return createDeviceRequestAdapter();
			}
			@Override
			public Adapter caseDeviceRequestParameter(DeviceRequestParameter object) {
				return createDeviceRequestParameterAdapter();
			}
			@Override
			public Adapter caseCommunicationRequest(CommunicationRequest object) {
				return createCommunicationRequestAdapter();
			}
			@Override
			public Adapter caseCommunicationRequestPayload(CommunicationRequestPayload object) {
				return createCommunicationRequestPayloadAdapter();
			}
			@Override
			public Adapter caseHealthcareService(HealthcareService object) {
				return createHealthcareServiceAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceEligibility(HealthcareServiceEligibility object) {
				return createHealthcareServiceEligibilityAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceAvailableTime(HealthcareServiceAvailableTime object) {
				return createHealthcareServiceAvailableTimeAdapter();
			}
			@Override
			public Adapter caseHealthcareServiceNotAvailable(HealthcareServiceNotAvailable object) {
				return createHealthcareServiceNotAvailableAdapter();
			}
			@Override
			public Adapter caseNamingSystem(NamingSystem object) {
				return createNamingSystemAdapter();
			}
			@Override
			public Adapter caseNamingSystemUniqueId(NamingSystemUniqueId object) {
				return createNamingSystemUniqueIdAdapter();
			}
			@Override
			public Adapter caseBodyStructure(BodyStructure object) {
				return createBodyStructureAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskRestriction(TaskRestriction object) {
				return createTaskRestrictionAdapter();
			}
			@Override
			public Adapter caseTaskParameter(TaskParameter object) {
				return createTaskParameterAdapter();
			}
			@Override
			public Adapter caseTaskOutput(TaskOutput object) {
				return createTaskOutputAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponse(QuestionnaireResponse object) {
				return createQuestionnaireResponseAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItem(QuestionnaireItem object) {
				return createQuestionnaireItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemEnableWhen(QuestionnaireItemEnableWhen object) {
				return createQuestionnaireItemEnableWhenAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemAnswerOption(QuestionnaireItemAnswerOption object) {
				return createQuestionnaireItemAnswerOptionAdapter();
			}
			@Override
			public Adapter caseQuestionnaireItemInitial(QuestionnaireItemInitial object) {
				return createQuestionnaireItemInitialAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
				return createQuestionnaireResponseItemAdapter();
			}
			@Override
			public Adapter caseQuestionnaireResponseItemAnswer(QuestionnaireResponseItemAnswer object) {
				return createQuestionnaireResponseItemAnswerAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefit(ExplanationOfBenefit object) {
				return createExplanationOfBenefitAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitRelatedClaim(ExplanationOfBenefitRelatedClaim object) {
				return createExplanationOfBenefitRelatedClaimAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
				return createExplanationOfBenefitPayeeAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
				return createExplanationOfBenefitCareTeamAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitSupportingInformation(ExplanationOfBenefitSupportingInformation object) {
				return createExplanationOfBenefitSupportingInformationAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
				return createExplanationOfBenefitDiagnosisAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
				return createExplanationOfBenefitProcedureAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
				return createExplanationOfBenefitInsuranceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
				return createExplanationOfBenefitAccidentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
				return createExplanationOfBenefitItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItemAdjudication(ExplanationOfBenefitItemAdjudication object) {
				return createExplanationOfBenefitItemAdjudicationAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItemDetail(ExplanationOfBenefitItemDetail object) {
				return createExplanationOfBenefitItemDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitItemDetailSubDetail(ExplanationOfBenefitItemDetailSubDetail object) {
				return createExplanationOfBenefitItemDetailSubDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAddedItem(ExplanationOfBenefitAddedItem object) {
				return createExplanationOfBenefitAddedItemAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAddedItemAddedItemDetail(ExplanationOfBenefitAddedItemAddedItemDetail object) {
				return createExplanationOfBenefitAddedItemAddedItemDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail(ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail object) {
				return createExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetailAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitTotal(ExplanationOfBenefitTotal object) {
				return createExplanationOfBenefitTotalAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
				return createExplanationOfBenefitPaymentAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitNote(ExplanationOfBenefitNote object) {
				return createExplanationOfBenefitNoteAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
				return createExplanationOfBenefitBenefitBalanceAdapter();
			}
			@Override
			public Adapter caseExplanationOfBenefitBenefitBalanceBenefit(ExplanationOfBenefitBenefitBalanceBenefit object) {
				return createExplanationOfBenefitBenefitBalanceBenefitAdapter();
			}
			@Override
			public Adapter caseConceptMap(ConceptMap object) {
				return createConceptMapAdapter();
			}
			@Override
			public Adapter caseConceptMapGroup(ConceptMapGroup object) {
				return createConceptMapGroupAdapter();
			}
			@Override
			public Adapter caseConceptMapGroupSourceElement(ConceptMapGroupSourceElement object) {
				return createConceptMapGroupSourceElementAdapter();
			}
			@Override
			public Adapter caseConceptMapGroupSourceElementTargetElement(ConceptMapGroupSourceElementTargetElement object) {
				return createConceptMapGroupSourceElementTargetElementAdapter();
			}
			@Override
			public Adapter caseConceptMapGroupSourceElementTargetElementOtherElement(ConceptMapGroupSourceElementTargetElementOtherElement object) {
				return createConceptMapGroupSourceElementTargetElementOtherElementAdapter();
			}
			@Override
			public Adapter caseCodeSystem(CodeSystem object) {
				return createCodeSystemAdapter();
			}
			@Override
			public Adapter caseCodeSystemFilter(CodeSystemFilter object) {
				return createCodeSystemFilterAdapter();
			}
			@Override
			public Adapter caseCodeSystemProperty(CodeSystemProperty object) {
				return createCodeSystemPropertyAdapter();
			}
			@Override
			public Adapter caseCodeSystemConceptDefinition(CodeSystemConceptDefinition object) {
				return createCodeSystemConceptDefinitionAdapter();
			}
			@Override
			public Adapter caseCodeSystemConceptDefinitionDesignation(CodeSystemConceptDefinitionDesignation object) {
				return createCodeSystemConceptDefinitionDesignationAdapter();
			}
			@Override
			public Adapter caseCodeSystemConceptDefinitionConceptProperty(CodeSystemConceptDefinitionConceptProperty object) {
				return createCodeSystemConceptDefinitionConceptPropertyAdapter();
			}
			@Override
			public Adapter caseConceptMapGroupUnmapped(ConceptMapGroupUnmapped object) {
				return createConceptMapGroupUnmappedAdapter();
			}
			@Override
			public Adapter caseRequestGroup(RequestGroup object) {
				return createRequestGroupAdapter();
			}
			@Override
			public Adapter caseRequestGroupAction(RequestGroupAction object) {
				return createRequestGroupActionAdapter();
			}
			@Override
			public Adapter caseRequestGroupActionCondition(RequestGroupActionCondition object) {
				return createRequestGroupActionConditionAdapter();
			}
			@Override
			public Adapter caseRequestGroupActionRelatedAction(RequestGroupActionRelatedAction object) {
				return createRequestGroupActionRelatedActionAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilities(TerminologyCapabilities object) {
				return createTerminologyCapabilitiesAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesSoftware(TerminologyCapabilitiesSoftware object) {
				return createTerminologyCapabilitiesSoftwareAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesImplementation(TerminologyCapabilitiesImplementation object) {
				return createTerminologyCapabilitiesImplementationAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesCodeSystem(TerminologyCapabilitiesCodeSystem object) {
				return createTerminologyCapabilitiesCodeSystemAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesCodeSystemVersion(TerminologyCapabilitiesCodeSystemVersion object) {
				return createTerminologyCapabilitiesCodeSystemVersionAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesCodeSystemVersionFilter(TerminologyCapabilitiesCodeSystemVersionFilter object) {
				return createTerminologyCapabilitiesCodeSystemVersionFilterAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesExpansion(TerminologyCapabilitiesExpansion object) {
				return createTerminologyCapabilitiesExpansionAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesExpansionParameter(TerminologyCapabilitiesExpansionParameter object) {
				return createTerminologyCapabilitiesExpansionParameterAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesValidateCode(TerminologyCapabilitiesValidateCode object) {
				return createTerminologyCapabilitiesValidateCodeAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesTranslation(TerminologyCapabilitiesTranslation object) {
				return createTerminologyCapabilitiesTranslationAdapter();
			}
			@Override
			public Adapter caseTerminologyCapabilitiesClosure(TerminologyCapabilitiesClosure object) {
				return createTerminologyCapabilitiesClosureAdapter();
			}
			@Override
			public Adapter caseDeviceMetric(DeviceMetric object) {
				return createDeviceMetricAdapter();
			}
			@Override
			public Adapter caseDeviceMetricCalibration(DeviceMetricCalibration object) {
				return createDeviceMetricCalibrationAdapter();
			}
			@Override
			public Adapter caseFlag(Flag object) {
				return createFlagAdapter();
			}
			@Override
			public Adapter caseImmunizationEvaluation(ImmunizationEvaluation object) {
				return createImmunizationEvaluationAdapter();
			}
			@Override
			public Adapter caseImmunization(Immunization object) {
				return createImmunizationAdapter();
			}
			@Override
			public Adapter caseImmunizationPerformer(ImmunizationPerformer object) {
				return createImmunizationPerformerAdapter();
			}
			@Override
			public Adapter caseImmunizationEducation(ImmunizationEducation object) {
				return createImmunizationEducationAdapter();
			}
			@Override
			public Adapter caseImmunizationReaction(ImmunizationReaction object) {
				return createImmunizationReactionAdapter();
			}
			@Override
			public Adapter caseImmunizationProtocolApplied(ImmunizationProtocolApplied object) {
				return createImmunizationProtocolAppliedAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIndication(MedicinalProductIndication object) {
				return createMedicinalProductIndicationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductIndicationOtherTherapy(MedicinalProductIndicationOtherTherapy object) {
				return createMedicinalProductIndicationOtherTherapyAdapter();
			}
			@Override
			public Adapter caseMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect object) {
				return createMedicinalProductUndesirableEffectAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseDocumentManifest(DocumentManifest object) {
				return createDocumentManifestAdapter();
			}
			@Override
			public Adapter caseDocumentManifestRelated(DocumentManifestRelated object) {
				return createDocumentManifestRelatedAdapter();
			}
			@Override
			public Adapter caseGuidanceResponse(GuidanceResponse object) {
				return createGuidanceResponseAdapter();
			}
			@Override
			public Adapter caseOperationOutcome(OperationOutcome object) {
				return createOperationOutcomeAdapter();
			}
			@Override
			public Adapter caseOperationOutcomeIssue(OperationOutcomeIssue object) {
				return createOperationOutcomeIssueAdapter();
			}
			@Override
			public Adapter caseParameters(Parameters object) {
				return createParametersAdapter();
			}
			@Override
			public Adapter caseParametersParameter(ParametersParameter object) {
				return createParametersParameterAdapter();
			}
			@Override
			public Adapter caseImplementationGuide(ImplementationGuide object) {
				return createImplementationGuideAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDependsOn(ImplementationGuideDependsOn object) {
				return createImplementationGuideDependsOnAdapter();
			}
			@Override
			public Adapter caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
				return createImplementationGuideGlobalAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinition(ImplementationGuideDefinition object) {
				return createImplementationGuideDefinitionAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinitionGrouping(ImplementationGuideDefinitionGrouping object) {
				return createImplementationGuideDefinitionGroupingAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinitionResource(ImplementationGuideDefinitionResource object) {
				return createImplementationGuideDefinitionResourceAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinitionPage(ImplementationGuideDefinitionPage object) {
				return createImplementationGuideDefinitionPageAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinitionParameter(ImplementationGuideDefinitionParameter object) {
				return createImplementationGuideDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseImplementationGuideDefinitionTemplate(ImplementationGuideDefinitionTemplate object) {
				return createImplementationGuideDefinitionTemplateAdapter();
			}
			@Override
			public Adapter caseImplementationGuideManifest(ImplementationGuideManifest object) {
				return createImplementationGuideManifestAdapter();
			}
			@Override
			public Adapter caseImplementationGuideManifestManifestResource(ImplementationGuideManifestManifestResource object) {
				return createImplementationGuideManifestManifestResourceAdapter();
			}
			@Override
			public Adapter caseImplementationGuideManifestManifestPage(ImplementationGuideManifestManifestPage object) {
				return createImplementationGuideManifestManifestPageAdapter();
			}
			@Override
			public Adapter caseSearchParameter(SearchParameter object) {
				return createSearchParameterAdapter();
			}
			@Override
			public Adapter caseSearchParameterComponent(SearchParameterComponent object) {
				return createSearchParameterComponentAdapter();
			}
			@Override
			public Adapter caseOperationDefinition(OperationDefinition object) {
				return createOperationDefinitionAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionParameter(OperationDefinitionParameter object) {
				return createOperationDefinitionParameterAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionParameterBinding(OperationDefinitionParameterBinding object) {
				return createOperationDefinitionParameterBindingAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionParameterReferencedFrom(OperationDefinitionParameterReferencedFrom object) {
				return createOperationDefinitionParameterReferencedFromAdapter();
			}
			@Override
			public Adapter caseOperationDefinitionOverload(OperationDefinitionOverload object) {
				return createOperationDefinitionOverloadAdapter();
			}
			@Override
			public Adapter casePaymentReconciliation(PaymentReconciliation object) {
				return createPaymentReconciliationAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationDetails(PaymentReconciliationDetails object) {
				return createPaymentReconciliationDetailsAdapter();
			}
			@Override
			public Adapter casePaymentReconciliationNotes(PaymentReconciliationNotes object) {
				return createPaymentReconciliationNotesAdapter();
			}
			@Override
			public Adapter casePractitionerRole(PractitionerRole object) {
				return createPractitionerRoleAdapter();
			}
			@Override
			public Adapter casePractitionerRoleAvailableTime(PractitionerRoleAvailableTime object) {
				return createPractitionerRoleAvailableTimeAdapter();
			}
			@Override
			public Adapter casePractitionerRoleNotAvailable(PractitionerRoleNotAvailable object) {
				return createPractitionerRoleNotAvailableAdapter();
			}
			@Override
			public Adapter caseDeviceUseStatement(DeviceUseStatement object) {
				return createDeviceUseStatementAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistory(FamilyMemberHistory object) {
				return createFamilyMemberHistoryAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
				return createFamilyMemberHistoryConditionAdapter();
			}
			@Override
			public Adapter caseOrganizationAffiliation(OrganizationAffiliation object) {
				return createOrganizationAffiliationAdapter();
			}
			@Override
			public Adapter caseResearchDefinition(ResearchDefinition object) {
				return createResearchDefinitionAdapter();
			}
			@Override
			public Adapter caseResearchElementDefinition(ResearchElementDefinition object) {
				return createResearchElementDefinitionAdapter();
			}
			@Override
			public Adapter caseResearchElementDefinitionCharacteristic(ResearchElementDefinitionCharacteristic object) {
				return createResearchElementDefinitionCharacteristicAdapter();
			}
			@Override
			public Adapter caseAdverseEvent(AdverseEvent object) {
				return createAdverseEventAdapter();
			}
			@Override
			public Adapter caseAdverseEventSuspectEntity(AdverseEventSuspectEntity object) {
				return createAdverseEventSuspectEntityAdapter();
			}
			@Override
			public Adapter caseAdverseEventSuspectEntityCausality(AdverseEventSuspectEntityCausality object) {
				return createAdverseEventSuspectEntityCausalityAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesis(RiskEvidenceSynthesis object) {
				return createRiskEvidenceSynthesisAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesisSampleSize(RiskEvidenceSynthesisSampleSize object) {
				return createRiskEvidenceSynthesisSampleSizeAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesisRiskEstimate(RiskEvidenceSynthesisRiskEstimate object) {
				return createRiskEvidenceSynthesisRiskEstimateAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesisRiskEstimatePrecisionEstimate(RiskEvidenceSynthesisRiskEstimatePrecisionEstimate object) {
				return createRiskEvidenceSynthesisRiskEstimatePrecisionEstimateAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesisCertainty(RiskEvidenceSynthesisCertainty object) {
				return createRiskEvidenceSynthesisCertaintyAdapter();
			}
			@Override
			public Adapter caseRiskEvidenceSynthesisCertaintyCertaintySubcomponent(RiskEvidenceSynthesisCertaintyCertaintySubcomponent object) {
				return createRiskEvidenceSynthesisCertaintyCertaintySubcomponentAdapter();
			}
			@Override
			public Adapter caseTestScript(TestScript object) {
				return createTestScriptAdapter();
			}
			@Override
			public Adapter caseTestScriptOrigin(TestScriptOrigin object) {
				return createTestScriptOriginAdapter();
			}
			@Override
			public Adapter caseTestScriptDestination(TestScriptDestination object) {
				return createTestScriptDestinationAdapter();
			}
			@Override
			public Adapter caseTestScriptMetadata(TestScriptMetadata object) {
				return createTestScriptMetadataAdapter();
			}
			@Override
			public Adapter caseTestScriptMetadataLink(TestScriptMetadataLink object) {
				return createTestScriptMetadataLinkAdapter();
			}
			@Override
			public Adapter caseTestScriptMetadataCapability(TestScriptMetadataCapability object) {
				return createTestScriptMetadataCapabilityAdapter();
			}
			@Override
			public Adapter caseCapabilityStatement(CapabilityStatement object) {
				return createCapabilityStatementAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
				return createCapabilityStatementSoftwareAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
				return createCapabilityStatementImplementationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRest(CapabilityStatementRest object) {
				return createCapabilityStatementRestAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestSecurity(CapabilityStatementRestSecurity object) {
				return createCapabilityStatementRestSecurityAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestResource(CapabilityStatementRestResource object) {
				return createCapabilityStatementRestResourceAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestResourceResourceInteraction(CapabilityStatementRestResourceResourceInteraction object) {
				return createCapabilityStatementRestResourceResourceInteractionAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestResourceSearchParam(CapabilityStatementRestResourceSearchParam object) {
				return createCapabilityStatementRestResourceSearchParamAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestResourceOperation(CapabilityStatementRestResourceOperation object) {
				return createCapabilityStatementRestResourceOperationAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementRestSystemInteraction(CapabilityStatementRestSystemInteraction object) {
				return createCapabilityStatementRestSystemInteractionAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinition(CompartmentDefinition object) {
				return createCompartmentDefinitionAdapter();
			}
			@Override
			public Adapter caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
				return createCompartmentDefinitionResourceAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
				return createCapabilityStatementMessagingAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementMessagingEndpoint(CapabilityStatementMessagingEndpoint object) {
				return createCapabilityStatementMessagingEndpointAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementMessagingSupportedMessage(CapabilityStatementMessagingSupportedMessage object) {
				return createCapabilityStatementMessagingSupportedMessageAdapter();
			}
			@Override
			public Adapter caseMessageDefinition(MessageDefinition object) {
				return createMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionFocus(MessageDefinitionFocus object) {
				return createMessageDefinitionFocusAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
				return createMessageDefinitionAllowedResponseAdapter();
			}
			@Override
			public Adapter caseGraphDefinition(GraphDefinition object) {
				return createGraphDefinitionAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionLink(GraphDefinitionLink object) {
				return createGraphDefinitionLinkAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionLinkTarget(GraphDefinitionLinkTarget object) {
				return createGraphDefinitionLinkTargetAdapter();
			}
			@Override
			public Adapter caseGraphDefinitionLinkTargetCompartment(GraphDefinitionLinkTargetCompartment object) {
				return createGraphDefinitionLinkTargetCompartmentAdapter();
			}
			@Override
			public Adapter caseCapabilityStatementDocument(CapabilityStatementDocument object) {
				return createCapabilityStatementDocumentAdapter();
			}
			@Override
			public Adapter caseTestScriptFixture(TestScriptFixture object) {
				return createTestScriptFixtureAdapter();
			}
			@Override
			public Adapter caseTestScriptVariable(TestScriptVariable object) {
				return createTestScriptVariableAdapter();
			}
			@Override
			public Adapter caseTestScriptSetup(TestScriptSetup object) {
				return createTestScriptSetupAdapter();
			}
			@Override
			public Adapter caseTestScriptSetupSetupAction(TestScriptSetupSetupAction object) {
				return createTestScriptSetupSetupActionAdapter();
			}
			@Override
			public Adapter caseTestScriptSetupSetupActionOperation(TestScriptSetupSetupActionOperation object) {
				return createTestScriptSetupSetupActionOperationAdapter();
			}
			@Override
			public Adapter caseTestScriptSetupSetupActionOperationRequestHeader(TestScriptSetupSetupActionOperationRequestHeader object) {
				return createTestScriptSetupSetupActionOperationRequestHeaderAdapter();
			}
			@Override
			public Adapter caseTestScriptSetupSetupActionAssert(TestScriptSetupSetupActionAssert object) {
				return createTestScriptSetupSetupActionAssertAdapter();
			}
			@Override
			public Adapter caseTestScriptTest(TestScriptTest object) {
				return createTestScriptTestAdapter();
			}
			@Override
			public Adapter caseTestScriptTestTestAction(TestScriptTestTestAction object) {
				return createTestScriptTestTestActionAdapter();
			}
			@Override
			public Adapter caseTestScriptTeardown(TestScriptTeardown object) {
				return createTestScriptTeardownAdapter();
			}
			@Override
			public Adapter caseTestScriptTeardownTeardownAction(TestScriptTeardownTeardownAction object) {
				return createTestScriptTeardownTeardownActionAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProduct(BiologicallyDerivedProduct object) {
				return createBiologicallyDerivedProductAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductCollection(BiologicallyDerivedProductCollection object) {
				return createBiologicallyDerivedProductCollectionAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductProcessing(BiologicallyDerivedProductProcessing object) {
				return createBiologicallyDerivedProductProcessingAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductManipulation(BiologicallyDerivedProductManipulation object) {
				return createBiologicallyDerivedProductManipulationAdapter();
			}
			@Override
			public Adapter caseBiologicallyDerivedProductStorage(BiologicallyDerivedProductStorage object) {
				return createBiologicallyDerivedProductStorageAdapter();
			}
			@Override
			public Adapter caseEnrollmentRequest(EnrollmentRequest object) {
				return createEnrollmentRequestAdapter();
			}
			@Override
			public Adapter caseMessageHeader(MessageHeader object) {
				return createMessageHeaderAdapter();
			}
			@Override
			public Adapter caseMessageHeaderMessageDestination(MessageHeaderMessageDestination object) {
				return createMessageHeaderMessageDestinationAdapter();
			}
			@Override
			public Adapter caseMessageHeaderMessageSource(MessageHeaderMessageSource object) {
				return createMessageHeaderMessageSourceAdapter();
			}
			@Override
			public Adapter caseMessageHeaderResponse(MessageHeaderResponse object) {
				return createMessageHeaderResponseAdapter();
			}
			@Override
			public Adapter casePaymentNotice(PaymentNotice object) {
				return createPaymentNoticeAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseSubscriptionChannel(SubscriptionChannel object) {
				return createSubscriptionChannelAdapter();
			}
			@Override
			public Adapter caseLinkage(Linkage object) {
				return createLinkageAdapter();
			}
			@Override
			public Adapter caseLinkageItem(LinkageItem object) {
				return createLinkageItemAdapter();
			}
			@Override
			public Adapter caseCatalogEntry(CatalogEntry object) {
				return createCatalogEntryAdapter();
			}
			@Override
			public Adapter caseCatalogEntryRelatedEntry(CatalogEntryRelatedEntry object) {
				return createCatalogEntryRelatedEntryAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseCompositionAttester(CompositionAttester object) {
				return createCompositionAttesterAdapter();
			}
			@Override
			public Adapter caseCompositionRelatesTo(CompositionRelatesTo object) {
				return createCompositionRelatesToAdapter();
			}
			@Override
			public Adapter caseCompositionEvent(CompositionEvent object) {
				return createCompositionEventAdapter();
			}
			@Override
			public Adapter caseCompositionSection(CompositionSection object) {
				return createCompositionSectionAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcid(SubstanceNucleicAcid object) {
				return createSubstanceNucleicAcidAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidSubunit(SubstanceNucleicAcidSubunit object) {
				return createSubstanceNucleicAcidSubunitAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidSubunitLinkage(SubstanceNucleicAcidSubunitLinkage object) {
				return createSubstanceNucleicAcidSubunitLinkageAdapter();
			}
			@Override
			public Adapter caseSubstanceNucleicAcidSubunitSugar(SubstanceNucleicAcidSubunitSugar object) {
				return createSubstanceNucleicAcidSubunitSugarAdapter();
			}
			@Override
			public Adapter caseSupplyRequest(SupplyRequest object) {
				return createSupplyRequestAdapter();
			}
			@Override
			public Adapter caseSupplyRequestParameter(SupplyRequestParameter object) {
				return createSupplyRequestParameterAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesis(EffectEvidenceSynthesis object) {
				return createEffectEvidenceSynthesisAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisSampleSize(EffectEvidenceSynthesisSampleSize object) {
				return createEffectEvidenceSynthesisSampleSizeAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisResultsByExposure(EffectEvidenceSynthesisResultsByExposure object) {
				return createEffectEvidenceSynthesisResultsByExposureAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisEffectEstimate(EffectEvidenceSynthesisEffectEstimate object) {
				return createEffectEvidenceSynthesisEffectEstimateAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisEffectEstimatePrecisionEstimate(EffectEvidenceSynthesisEffectEstimatePrecisionEstimate object) {
				return createEffectEvidenceSynthesisEffectEstimatePrecisionEstimateAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisCertainty(EffectEvidenceSynthesisCertainty object) {
				return createEffectEvidenceSynthesisCertaintyAdapter();
			}
			@Override
			public Adapter caseEffectEvidenceSynthesisCertaintyCertaintySubcomponent(EffectEvidenceSynthesisCertaintyCertaintySubcomponent object) {
				return createEffectEvidenceSynthesisCertaintyCertaintySubcomponentAdapter();
			}
			@Override
			public Adapter caseInsurancePlan(InsurancePlan object) {
				return createInsurancePlanAdapter();
			}
			@Override
			public Adapter caseInsurancePlanContact(InsurancePlanContact object) {
				return createInsurancePlanContactAdapter();
			}
			@Override
			public Adapter caseInsurancePlanCoverage(InsurancePlanCoverage object) {
				return createInsurancePlanCoverageAdapter();
			}
			@Override
			public Adapter caseInsurancePlanCoverageCoverageBenefit(InsurancePlanCoverageCoverageBenefit object) {
				return createInsurancePlanCoverageCoverageBenefitAdapter();
			}
			@Override
			public Adapter caseInsurancePlanCoverageCoverageBenefitLimit(InsurancePlanCoverageCoverageBenefitLimit object) {
				return createInsurancePlanCoverageCoverageBenefitLimitAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlan(InsurancePlanPlan object) {
				return createInsurancePlanPlanAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlanGeneralCost(InsurancePlanPlanGeneralCost object) {
				return createInsurancePlanPlanGeneralCostAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlanSpecificCost(InsurancePlanPlanSpecificCost object) {
				return createInsurancePlanPlanSpecificCostAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlanSpecificCostPlanBenefit(InsurancePlanPlanSpecificCostPlanBenefit object) {
				return createInsurancePlanPlanSpecificCostPlanBenefitAdapter();
			}
			@Override
			public Adapter caseInsurancePlanPlanSpecificCostPlanBenefitCost(InsurancePlanPlanSpecificCostPlanBenefitCost object) {
				return createInsurancePlanPlanSpecificCostPlanBenefitCostAdapter();
			}
			@Override
			public Adapter caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformation(SubstanceReferenceInformation object) {
				return createSubstanceReferenceInformationAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationGene(SubstanceReferenceInformationGene object) {
				return createSubstanceReferenceInformationGeneAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationGeneElement(SubstanceReferenceInformationGeneElement object) {
				return createSubstanceReferenceInformationGeneElementAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationClassification(SubstanceReferenceInformationClassification object) {
				return createSubstanceReferenceInformationClassificationAdapter();
			}
			@Override
			public Adapter caseSubstanceReferenceInformationTarget(SubstanceReferenceInformationTarget object) {
				return createSubstanceReferenceInformationTargetAdapter();
			}
			@Override
			public Adapter caseSubstancePolymer(SubstancePolymer object) {
				return createSubstancePolymerAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerMonomerSet(SubstancePolymerMonomerSet object) {
				return createSubstancePolymerMonomerSetAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerMonomerSetStartingMaterial(SubstancePolymerMonomerSetStartingMaterial object) {
				return createSubstancePolymerMonomerSetStartingMaterialAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeat(SubstancePolymerRepeat object) {
				return createSubstancePolymerRepeatAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeatRepeatUnit(SubstancePolymerRepeatRepeatUnit object) {
				return createSubstancePolymerRepeatRepeatUnitAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation(SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation object) {
				return createSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationAdapter();
			}
			@Override
			public Adapter caseSubstancePolymerRepeatRepeatUnitStructuralRepresentation(SubstancePolymerRepeatRepeatUnitStructuralRepresentation object) {
				return createSubstancePolymerRepeatRepeatUnitStructuralRepresentationAdapter();
			}
			@Override
			public Adapter caseSubstanceProtein(SubstanceProtein object) {
				return createSubstanceProteinAdapter();
			}
			@Override
			public Adapter caseSubstanceProteinSubunit(SubstanceProteinSubunit object) {
				return createSubstanceProteinSubunitAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterial(SubstanceSourceMaterial object) {
				return createSubstanceSourceMaterialAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialFractionDescription(SubstanceSourceMaterialFractionDescription object) {
				return createSubstanceSourceMaterialFractionDescriptionAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganism(SubstanceSourceMaterialOrganism object) {
				return createSubstanceSourceMaterialOrganismAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganismAuthor(SubstanceSourceMaterialOrganismAuthor object) {
				return createSubstanceSourceMaterialOrganismAuthorAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganismHybrid(SubstanceSourceMaterialOrganismHybrid object) {
				return createSubstanceSourceMaterialOrganismHybridAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialOrganismOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral object) {
				return createSubstanceSourceMaterialOrganismOrganismGeneralAdapter();
			}
			@Override
			public Adapter caseSubstanceSourceMaterialPartDescription(SubstanceSourceMaterialPartDescription object) {
				return createSubstanceSourceMaterialPartDescriptionAdapter();
			}
			@Override
			public Adapter caseMedicinalProductContraindication(MedicinalProductContraindication object) {
				return createMedicinalProductContraindicationAdapter();
			}
			@Override
			public Adapter caseMedicinalProductContraindicationOtherTherapy(MedicinalProductContraindicationOtherTherapy object) {
				return createMedicinalProductContraindicationOtherTherapyAdapter();
			}
			@Override
			public Adapter caseMolecularSequence(MolecularSequence object) {
				return createMolecularSequenceAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceReferenceSeq(MolecularSequenceReferenceSeq object) {
				return createMolecularSequenceReferenceSeqAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceVariant(MolecularSequenceVariant object) {
				return createMolecularSequenceVariantAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceQuality(MolecularSequenceQuality object) {
				return createMolecularSequenceQualityAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceQualityRoc(MolecularSequenceQualityRoc object) {
				return createMolecularSequenceQualityRocAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceRepository(MolecularSequenceRepository object) {
				return createMolecularSequenceRepositoryAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceStructureVariant(MolecularSequenceStructureVariant object) {
				return createMolecularSequenceStructureVariantAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceStructureVariantOuter(MolecularSequenceStructureVariantOuter object) {
				return createMolecularSequenceStructureVariantOuterAdapter();
			}
			@Override
			public Adapter caseMolecularSequenceStructureVariantInner(MolecularSequenceStructureVariantInner object) {
				return createMolecularSequenceStructureVariantInnerAdapter();
			}
			@Override
			public Adapter caseAllergyIntolerance(AllergyIntolerance object) {
				return createAllergyIntoleranceAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
				return createAllergyIntoleranceReactionAdapter();
			}
			@Override
			public Adapter caseInvoice(Invoice object) {
				return createInvoiceAdapter();
			}
			@Override
			public Adapter caseInvoiceParticipant(InvoiceParticipant object) {
				return createInvoiceParticipantAdapter();
			}
			@Override
			public Adapter caseInvoiceLineItem(InvoiceLineItem object) {
				return createInvoiceLineItemAdapter();
			}
			@Override
			public Adapter caseInvoiceLineItemPriceComponent(InvoiceLineItemPriceComponent object) {
				return createInvoiceLineItemPriceComponentAdapter();
			}
			@Override
			public Adapter caseEnrollmentResponse(EnrollmentResponse object) {
				return createEnrollmentResponseAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendation(ImmunizationRecommendation object) {
				return createImmunizationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
				return createImmunizationRecommendationRecommendationAdapter();
			}
			@Override
			public Adapter caseImmunizationRecommendationRecommendationDateCriterion(ImmunizationRecommendationRecommendationDateCriterion object) {
				return createImmunizationRecommendationRecommendationDateCriterionAdapter();
			}
			@Override
			public Adapter caseVerificationResult(VerificationResult object) {
				return createVerificationResultAdapter();
			}
			@Override
			public Adapter caseVerificationResultPrimarySource(VerificationResultPrimarySource object) {
				return createVerificationResultPrimarySourceAdapter();
			}
			@Override
			public Adapter caseVerificationResultAttestation(VerificationResultAttestation object) {
				return createVerificationResultAttestationAdapter();
			}
			@Override
			public Adapter caseVerificationResultValidator(VerificationResultValidator object) {
				return createVerificationResultValidatorAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseBundleLink(BundleLink object) {
				return createBundleLinkAdapter();
			}
			@Override
			public Adapter caseBundleEntry(BundleEntry object) {
				return createBundleEntryAdapter();
			}
			@Override
			public Adapter caseEntry_Resource(Entry_Resource object) {
				return createEntry_ResourceAdapter();
			}
			@Override
			public Adapter caseBundleEntrySearch(BundleEntrySearch object) {
				return createBundleEntrySearchAdapter();
			}
			@Override
			public Adapter caseBundleEntryRequest(BundleEntryRequest object) {
				return createBundleEntryRequestAdapter();
			}
			@Override
			public Adapter caseBundleEntryResponse(BundleEntryResponse object) {
				return createBundleEntryResponseAdapter();
			}
			@Override
			public Adapter caseTestReport(TestReport object) {
				return createTestReportAdapter();
			}
			@Override
			public Adapter caseTestReportParticipant(TestReportParticipant object) {
				return createTestReportParticipantAdapter();
			}
			@Override
			public Adapter caseTestReportSetup(TestReportSetup object) {
				return createTestReportSetupAdapter();
			}
			@Override
			public Adapter caseTestReportSetupSetupAction(TestReportSetupSetupAction object) {
				return createTestReportSetupSetupActionAdapter();
			}
			@Override
			public Adapter caseTestReportSetupSetupActionOperation(TestReportSetupSetupActionOperation object) {
				return createTestReportSetupSetupActionOperationAdapter();
			}
			@Override
			public Adapter caseTestReportSetupSetupActionAssert(TestReportSetupSetupActionAssert object) {
				return createTestReportSetupSetupActionAssertAdapter();
			}
			@Override
			public Adapter caseTestReportTest(TestReportTest object) {
				return createTestReportTestAdapter();
			}
			@Override
			public Adapter caseTestReportTestTestAction(TestReportTestTestAction object) {
				return createTestReportTestTestActionAdapter();
			}
			@Override
			public Adapter caseTestReportTeardown(TestReportTeardown object) {
				return createTestReportTeardownAdapter();
			}
			@Override
			public Adapter caseTestReportTeardownTeardownAction(TestReportTeardownTeardownAction object) {
				return createTestReportTeardownTeardownActionAdapter();
			}
			@Override
			public Adapter caseNutritionOrder(NutritionOrder object) {
				return createNutritionOrderAdapter();
			}
			@Override
			public Adapter caseNutritionOrderOralDiet(NutritionOrderOralDiet object) {
				return createNutritionOrderOralDietAdapter();
			}
			@Override
			public Adapter caseNutritionOrderOralDietNutrient(NutritionOrderOralDietNutrient object) {
				return createNutritionOrderOralDietNutrientAdapter();
			}
			@Override
			public Adapter caseNutritionOrderOralDietTexture(NutritionOrderOralDietTexture object) {
				return createNutritionOrderOralDietTextureAdapter();
			}
			@Override
			public Adapter caseNutritionOrderSupplement(NutritionOrderSupplement object) {
				return createNutritionOrderSupplementAdapter();
			}
			@Override
			public Adapter caseNutritionOrderEnteralFormula(NutritionOrderEnteralFormula object) {
				return createNutritionOrderEnteralFormulaAdapter();
			}
			@Override
			public Adapter caseNutritionOrderEnteralFormulaAdministration(NutritionOrderEnteralFormulaAdministration object) {
				return createNutritionOrderEnteralFormulaAdministrationAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePersonLink(PersonLink object) {
				return createPersonLinkAdapter();
			}
			@Override
			public Adapter caseMedicationStatement(MedicationStatement object) {
				return createMedicationStatementAdapter();
			}
			@Override
			public Adapter caseAppointmentResponse(AppointmentResponse object) {
				return createAppointmentResponseAdapter();
			}
			@Override
			public Adapter caseAuditEvent(AuditEvent object) {
				return createAuditEventAdapter();
			}
			@Override
			public Adapter caseAuditEventAgent(AuditEventAgent object) {
				return createAuditEventAgentAdapter();
			}
			@Override
			public Adapter caseAuditEventAgentNetwork(AuditEventAgentNetwork object) {
				return createAuditEventAgentNetworkAdapter();
			}
			@Override
			public Adapter caseAuditEventSource(AuditEventSource object) {
				return createAuditEventSourceAdapter();
			}
			@Override
			public Adapter caseAuditEventEntity(AuditEventEntity object) {
				return createAuditEventEntityAdapter();
			}
			@Override
			public Adapter caseAuditEventEntityDetail(AuditEventEntityDetail object) {
				return createAuditEventEntityDetailAdapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequest(CoverageEligibilityRequest object) {
				return createCoverageEligibilityRequestAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestSupportingInformation(CoverageEligibilityRequestSupportingInformation object) {
				return createCoverageEligibilityRequestSupportingInformationAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestInsurance(CoverageEligibilityRequestInsurance object) {
				return createCoverageEligibilityRequestInsuranceAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestDetails(CoverageEligibilityRequestDetails object) {
				return createCoverageEligibilityRequestDetailsAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityRequestDetailsDiagnosis(CoverageEligibilityRequestDetailsDiagnosis object) {
				return createCoverageEligibilityRequestDetailsDiagnosisAdapter();
			}
			@Override
			public Adapter caseMedicinalProductInteraction(MedicinalProductInteraction object) {
				return createMedicinalProductInteractionAdapter();
			}
			@Override
			public Adapter caseMedicinalProductInteractionInteractant(MedicinalProductInteractionInteractant object) {
				return createMedicinalProductInteractionInteractantAdapter();
			}
			@Override
			public Adapter caseVisionPrescription(VisionPrescription object) {
				return createVisionPrescriptionAdapter();
			}
			@Override
			public Adapter caseVisionPrescriptionLensSpecification(VisionPrescriptionLensSpecification object) {
				return createVisionPrescriptionLensSpecificationAdapter();
			}
			@Override
			public Adapter caseVisionPrescriptionLensSpecificationPrism(VisionPrescriptionLensSpecificationPrism object) {
				return createVisionPrescriptionLensSpecificationPrismAdapter();
			}
			@Override
			public Adapter caseSupplyDelivery(SupplyDelivery object) {
				return createSupplyDeliveryAdapter();
			}
			@Override
			public Adapter caseSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem object) {
				return createSupplyDeliverySuppliedItemAdapter();
			}
			@Override
			public Adapter caseMedicationDispense(MedicationDispense object) {
				return createMedicationDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationDispensePerformer(MedicationDispensePerformer object) {
				return createMedicationDispensePerformerAdapter();
			}
			@Override
			public Adapter caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
				return createMedicationDispenseSubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledge(MedicationKnowledge object) {
				return createMedicationKnowledgeAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge object) {
				return createMedicationKnowledgeRelatedMedicationKnowledgeAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMonograph(MedicationKnowledgeMonograph object) {
				return createMedicationKnowledgeMonographAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeIngredient(MedicationKnowledgeIngredient object) {
				return createMedicationKnowledgeIngredientAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeCost(MedicationKnowledgeCost object) {
				return createMedicationKnowledgeCostAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMonitoringProgram(MedicationKnowledgeMonitoringProgram object) {
				return createMedicationKnowledgeMonitoringProgramAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeAdministrationGuidelines(MedicationKnowledgeAdministrationGuidelines object) {
				return createMedicationKnowledgeAdministrationGuidelinesAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeAdministrationGuidelinesDosage(MedicationKnowledgeAdministrationGuidelinesDosage object) {
				return createMedicationKnowledgeAdministrationGuidelinesDosageAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics object) {
				return createMedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeMedicineClassification(MedicationKnowledgeMedicineClassification object) {
				return createMedicationKnowledgeMedicineClassificationAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgePackaging(MedicationKnowledgePackaging object) {
				return createMedicationKnowledgePackagingAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeDrugCharacteristic(MedicationKnowledgeDrugCharacteristic object) {
				return createMedicationKnowledgeDrugCharacteristicAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRegulatory(MedicationKnowledgeRegulatory object) {
				return createMedicationKnowledgeRegulatoryAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRegulatorySubstitution(MedicationKnowledgeRegulatorySubstitution object) {
				return createMedicationKnowledgeRegulatorySubstitutionAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRegulatorySchedule(MedicationKnowledgeRegulatorySchedule object) {
				return createMedicationKnowledgeRegulatoryScheduleAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeRegulatoryMaxDispense(MedicationKnowledgeRegulatoryMaxDispense object) {
				return createMedicationKnowledgeRegulatoryMaxDispenseAdapter();
			}
			@Override
			public Adapter caseMedicationKnowledgeKinetics(MedicationKnowledgeKinetics object) {
				return createMedicationKnowledgeKineticsAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponse(CoverageEligibilityResponse object) {
				return createCoverageEligibilityResponseAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseInsurance(CoverageEligibilityResponseInsurance object) {
				return createCoverageEligibilityResponseInsuranceAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseInsuranceItems(CoverageEligibilityResponseInsuranceItems object) {
				return createCoverageEligibilityResponseInsuranceItemsAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseInsuranceItemsBenefit(CoverageEligibilityResponseInsuranceItemsBenefit object) {
				return createCoverageEligibilityResponseInsuranceItemsBenefitAdapter();
			}
			@Override
			public Adapter caseCoverageEligibilityResponseErrors(CoverageEligibilityResponseErrors object) {
				return createCoverageEligibilityResponseErrorsAdapter();
			}
			@Override
			public Adapter caseStructureDefinition(StructureDefinition object) {
				return createStructureDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionMapping(StructureDefinitionMapping object) {
				return createStructureDefinitionMappingAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionContext(StructureDefinitionContext object) {
				return createStructureDefinitionContextAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
				return createStructureDefinitionSnapshotAdapter();
			}
			@Override
			public Adapter caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
				return createStructureDefinitionDifferentialAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseBackboneElement(BackboneElement object) {
				return createBackboneElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DomainResource
	 * @generated
	 */
	public Adapter createDomainResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OrganizationContact <em>Organization Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OrganizationContact
	 * @generated
	 */
	public Adapter createOrganizationContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Practitioner <em>Practitioner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Practitioner
	 * @generated
	 */
	public Adapter createPractitionerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PractitionerQualification <em>Practitioner Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PractitionerQualification
	 * @generated
	 */
	public Adapter createPractitionerQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetCompose <em>Value Set Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetCompose
	 * @generated
	 */
	public Adapter createValueSetComposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetComposeConceptSet <em>Value Set Compose Concept Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetComposeConceptSet
	 * @generated
	 */
	public Adapter createValueSetComposeConceptSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference <em>Value Set Compose Concept Set Concept Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetComposeConceptSetConceptReference
	 * @generated
	 */
	public Adapter createValueSetComposeConceptSetConceptReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation <em>Value Set Compose Concept Set Concept Reference Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation
	 * @generated
	 */
	public Adapter createValueSetComposeConceptSetConceptReferenceDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetComposeConceptSetFilter <em>Value Set Compose Concept Set Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetComposeConceptSetFilter
	 * @generated
	 */
	public Adapter createValueSetComposeConceptSetFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetExpansion <em>Value Set Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetExpansion
	 * @generated
	 */
	public Adapter createValueSetExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetExpansionParameter <em>Value Set Expansion Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetExpansionParameter
	 * @generated
	 */
	public Adapter createValueSetExpansionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSetExpansionContains <em>Value Set Expansion Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSetExpansionContains
	 * @generated
	 */
	public Adapter createValueSetExpansionContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReport <em>Measure Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReport
	 * @generated
	 */
	public Adapter createMeasureReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureGroup
	 * @generated
	 */
	public Adapter createMeasureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureGroupPopulation <em>Measure Group Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureGroupPopulation
	 * @generated
	 */
	public Adapter createMeasureGroupPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureGroupStratifier <em>Measure Group Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureGroupStratifier
	 * @generated
	 */
	public Adapter createMeasureGroupStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureGroupStratifierComponent <em>Measure Group Stratifier Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureGroupStratifierComponent
	 * @generated
	 */
	public Adapter createMeasureGroupStratifierComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureSupplementalData <em>Measure Supplemental Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureSupplementalData
	 * @generated
	 */
	public Adapter createMeasureSupplementalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroup <em>Measure Report Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroup
	 * @generated
	 */
	public Adapter createMeasureReportGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroupPopulation <em>Measure Report Group Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroupPopulation
	 * @generated
	 */
	public Adapter createMeasureReportGroupPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroupStratifier <em>Measure Report Group Stratifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroupStratifier
	 * @generated
	 */
	public Adapter createMeasureReportGroupStratifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroup <em>Measure Report Group Stratifier Stratifier Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroupStratifierStratifierGroup
	 * @generated
	 */
	public Adapter createMeasureReportGroupStratifierStratifierGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent <em>Measure Report Group Stratifier Stratifier Group Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent
	 * @generated
	 */
	public Adapter createMeasureReportGroupStratifierStratifierGroupComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation <em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation
	 * @generated
	 */
	public Adapter createMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PatientContact <em>Patient Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PatientContact
	 * @generated
	 */
	public Adapter createPatientContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PatientCommunication <em>Patient Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PatientCommunication
	 * @generated
	 */
	public Adapter createPatientCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PatientLink <em>Patient Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PatientLink
	 * @generated
	 */
	public Adapter createPatientLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ListEntry <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ListEntry
	 * @generated
	 */
	public Adapter createListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterStatusHistory <em>Encounter Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterStatusHistory
	 * @generated
	 */
	public Adapter createEncounterStatusHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterClassHistory <em>Encounter Class History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterClassHistory
	 * @generated
	 */
	public Adapter createEncounterClassHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterParticipant
	 * @generated
	 */
	public Adapter createEncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterDiagnosis <em>Encounter Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterDiagnosis
	 * @generated
	 */
	public Adapter createEncounterDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterHospitalization <em>Encounter Hospitalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterHospitalization
	 * @generated
	 */
	public Adapter createEncounterHospitalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EncounterLocation
	 * @generated
	 */
	public Adapter createEncounterLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EpisodeOfCare <em>Episode Of Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EpisodeOfCare
	 * @generated
	 */
	public Adapter createEpisodeOfCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EpisodeOfCareStatusHistory <em>Episode Of Care Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EpisodeOfCareStatusHistory
	 * @generated
	 */
	public Adapter createEpisodeOfCareStatusHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EpisodeOfCareDiagnosis <em>Episode Of Care Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EpisodeOfCareDiagnosis
	 * @generated
	 */
	public Adapter createEpisodeOfCareDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConditionStage
	 * @generated
	 */
	public Adapter createConditionStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConditionEvidence <em>Condition Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConditionEvidence
	 * @generated
	 */
	public Adapter createConditionEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClinicalImpression <em>Clinical Impression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClinicalImpression
	 * @generated
	 */
	public Adapter createClinicalImpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClinicalImpressionInvestigation <em>Clinical Impression Investigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClinicalImpressionInvestigation
	 * @generated
	 */
	public Adapter createClinicalImpressionInvestigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClinicalImpressionFinding <em>Clinical Impression Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClinicalImpressionFinding
	 * @generated
	 */
	public Adapter createClinicalImpressionFindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationComponent <em>Observation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationComponent
	 * @generated
	 */
	public Adapter createObservationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationReferenceRange <em>Observation Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationReferenceRange
	 * @generated
	 */
	public Adapter createObservationReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CarePlan <em>Care Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CarePlan
	 * @generated
	 */
	public Adapter createCarePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinition <em>Plan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinition
	 * @generated
	 */
	public Adapter createPlanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionGoal <em>Plan Definition Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionGoal
	 * @generated
	 */
	public Adapter createPlanDefinitionGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionGoalTarget <em>Plan Definition Goal Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionGoalTarget
	 * @generated
	 */
	public Adapter createPlanDefinitionGoalTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionAction <em>Plan Definition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionAction
	 * @generated
	 */
	public Adapter createPlanDefinitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionActionCondition <em>Plan Definition Action Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionActionCondition
	 * @generated
	 */
	public Adapter createPlanDefinitionActionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionActionRelatedAction <em>Plan Definition Action Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionActionRelatedAction
	 * @generated
	 */
	public Adapter createPlanDefinitionActionRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionActionParticipant <em>Plan Definition Action Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionActionParticipant
	 * @generated
	 */
	public Adapter createPlanDefinitionActionParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMap
	 * @generated
	 */
	public Adapter createStructureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapStructure <em>Structure Map Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapStructure
	 * @generated
	 */
	public Adapter createStructureMapStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroup <em>Structure Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroup
	 * @generated
	 */
	public Adapter createStructureMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupInput <em>Structure Map Group Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupInput
	 * @generated
	 */
	public Adapter createStructureMapGroupInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupRule <em>Structure Map Group Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupRule
	 * @generated
	 */
	public Adapter createStructureMapGroupRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupRuleSource <em>Structure Map Group Rule Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupRuleSource
	 * @generated
	 */
	public Adapter createStructureMapGroupRuleSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupRuleTarget <em>Structure Map Group Rule Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupRuleTarget
	 * @generated
	 */
	public Adapter createStructureMapGroupRuleTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupRuleTargetParameter <em>Structure Map Group Rule Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupRuleTargetParameter
	 * @generated
	 */
	public Adapter createStructureMapGroupRuleTargetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureMapGroupRuleDependent <em>Structure Map Group Rule Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureMapGroupRuleDependent
	 * @generated
	 */
	public Adapter createStructureMapGroupRuleDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionActionDynamicValue <em>Plan Definition Action Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionActionDynamicValue
	 * @generated
	 */
	public Adapter createPlanDefinitionActionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CarePlanActivity <em>Care Plan Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CarePlanActivity
	 * @generated
	 */
	public Adapter createCarePlanActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CarePlanActivityDetail <em>Care Plan Activity Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CarePlanActivityDetail
	 * @generated
	 */
	public Adapter createCarePlanActivityDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CareTeam <em>Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CareTeam
	 * @generated
	 */
	public Adapter createCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CareTeamParticipant <em>Care Team Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CareTeamParticipant
	 * @generated
	 */
	public Adapter createCareTeamParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GoalTarget <em>Goal Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GoalTarget
	 * @generated
	 */
	public Adapter createGoalTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Appointment
	 * @generated
	 */
	public Adapter createAppointmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AppointmentParticipant <em>Appointment Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AppointmentParticipant
	 * @generated
	 */
	public Adapter createAppointmentParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ServiceRequest
	 * @generated
	 */
	public Adapter createServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ActivityDefinition <em>Activity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ActivityDefinition
	 * @generated
	 */
	public Adapter createActivityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ActivityDefinitionParticipant <em>Activity Definition Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ActivityDefinitionParticipant
	 * @generated
	 */
	public Adapter createActivityDefinitionParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ActivityDefinitionDynamicValue <em>Activity Definition Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ActivityDefinitionDynamicValue
	 * @generated
	 */
	public Adapter createActivityDefinitionDynamicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.LocationPosition <em>Location Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.LocationPosition
	 * @generated
	 */
	public Adapter createLocationPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.LocationHoursOfOperation <em>Location Hours Of Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.LocationHoursOfOperation
	 * @generated
	 */
	public Adapter createLocationHoursOfOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenDefinition <em>Specimen Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenDefinition
	 * @generated
	 */
	public Adapter createSpecimenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenDefinitionTypeTested <em>Specimen Definition Type Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenDefinitionTypeTested
	 * @generated
	 */
	public Adapter createSpecimenDefinitionTypeTestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedContainer <em>Specimen Definition Type Tested Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenDefinitionTypeTestedContainer
	 * @generated
	 */
	public Adapter createSpecimenDefinitionTypeTestedContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive <em>Specimen Definition Type Tested Container Additive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive
	 * @generated
	 */
	public Adapter createSpecimenDefinitionTypeTestedContainerAdditiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling <em>Specimen Definition Type Tested Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenDefinitionTypeTestedHandling
	 * @generated
	 */
	public Adapter createSpecimenDefinitionTypeTestedHandlingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationDefinition <em>Observation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationDefinition
	 * @generated
	 */
	public Adapter createObservationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationDefinitionQuantitativeDetails <em>Observation Definition Quantitative Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationDefinitionQuantitativeDetails
	 * @generated
	 */
	public Adapter createObservationDefinitionQuantitativeDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationDefinitionQualifiedInterval <em>Observation Definition Qualified Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationDefinitionQualifiedInterval
	 * @generated
	 */
	public Adapter createObservationDefinitionQualifiedIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageClass <em>Coverage Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageClass
	 * @generated
	 */
	public Adapter createCoverageClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageCostToBeneficiary <em>Coverage Cost To Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageCostToBeneficiary
	 * @generated
	 */
	public Adapter createCoverageCostToBeneficiaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageCostToBeneficiaryExemption <em>Coverage Cost To Beneficiary Exemption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageCostToBeneficiaryExemption
	 * @generated
	 */
	public Adapter createCoverageCostToBeneficiaryExemptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractContentDefinition <em>Contract Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractContentDefinition
	 * @generated
	 */
	public Adapter createContractContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTerm <em>Contract Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTerm
	 * @generated
	 */
	public Adapter createContractTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermSecurityLabel <em>Contract Term Security Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermSecurityLabel
	 * @generated
	 */
	public Adapter createContractTermSecurityLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractOffer <em>Contract Term Contract Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractOffer
	 * @generated
	 */
	public Adapter createContractTermContractOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractOfferContractParty <em>Contract Term Contract Offer Contract Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractOfferContractParty
	 * @generated
	 */
	public Adapter createContractTermContractOfferContractPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractOfferAnswer <em>Contract Term Contract Offer Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractOfferAnswer
	 * @generated
	 */
	public Adapter createContractTermContractOfferAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractAsset <em>Contract Term Contract Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractAsset
	 * @generated
	 */
	public Adapter createContractTermContractAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractAssetAssetContext <em>Contract Term Contract Asset Asset Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractAssetAssetContext
	 * @generated
	 */
	public Adapter createContractTermContractAssetAssetContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermContractAssetValuedItem <em>Contract Term Contract Asset Valued Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermContractAssetValuedItem
	 * @generated
	 */
	public Adapter createContractTermContractAssetValuedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermAction <em>Contract Term Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermAction
	 * @generated
	 */
	public Adapter createContractTermActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractTermActionActionSubject <em>Contract Term Action Action Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractTermActionActionSubject
	 * @generated
	 */
	public Adapter createContractTermActionActionSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractSignatory <em>Contract Signatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractSignatory
	 * @generated
	 */
	public Adapter createContractSignatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractFriendlyLanguage <em>Contract Friendly Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractFriendlyLanguage
	 * @generated
	 */
	public Adapter createContractFriendlyLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractLegalLanguage <em>Contract Legal Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractLegalLanguage
	 * @generated
	 */
	public Adapter createContractLegalLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ContractComputableLanguage <em>Contract Computable Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ContractComputableLanguage
	 * @generated
	 */
	public Adapter createContractComputableLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RelatedPerson <em>Related Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RelatedPerson
	 * @generated
	 */
	public Adapter createRelatedPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RelatedPersonCommunication <em>Related Person Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RelatedPersonCommunication
	 * @generated
	 */
	public Adapter createRelatedPersonCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ProvenanceAgent <em>Provenance Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ProvenanceAgent
	 * @generated
	 */
	public Adapter createProvenanceAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ProvenanceEntity <em>Provenance Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ProvenanceEntity
	 * @generated
	 */
	public Adapter createProvenanceEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Specimen <em>Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Specimen
	 * @generated
	 */
	public Adapter createSpecimenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenCollection <em>Specimen Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenCollection
	 * @generated
	 */
	public Adapter createSpecimenCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenProcessing <em>Specimen Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenProcessing
	 * @generated
	 */
	public Adapter createSpecimenProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SpecimenContainer <em>Specimen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SpecimenContainer
	 * @generated
	 */
	public Adapter createSpecimenContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Substance <em>Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Substance
	 * @generated
	 */
	public Adapter createSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceInstance <em>Substance Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceInstance
	 * @generated
	 */
	public Adapter createSubstanceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceIngredient <em>Substance Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceIngredient
	 * @generated
	 */
	public Adapter createSubstanceIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationAdministration <em>Medication Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationAdministration
	 * @generated
	 */
	public Adapter createMedicationAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationAdministrationPerformer <em>Medication Administration Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationAdministrationPerformer
	 * @generated
	 */
	public Adapter createMedicationAdministrationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationAdministrationDosage <em>Medication Administration Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationAdministrationDosage
	 * @generated
	 */
	public Adapter createMedicationAdministrationDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationRequest <em>Medication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationRequest
	 * @generated
	 */
	public Adapter createMedicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationRequestDispenseRequest <em>Medication Request Dispense Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationRequestDispenseRequest
	 * @generated
	 */
	public Adapter createMedicationRequestDispenseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationRequestDispenseRequestInitialFill <em>Medication Request Dispense Request Initial Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationRequestDispenseRequestInitialFill
	 * @generated
	 */
	public Adapter createMedicationRequestDispenseRequestInitialFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationRequestSubstitution <em>Medication Request Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationRequestSubstitution
	 * @generated
	 */
	public Adapter createMedicationRequestSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DetectedIssue <em>Detected Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DetectedIssue
	 * @generated
	 */
	public Adapter createDetectedIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DetectedIssueEvidence <em>Detected Issue Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DetectedIssueEvidence
	 * @generated
	 */
	public Adapter createDetectedIssueEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DetectedIssueMitigation <em>Detected Issue Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DetectedIssueMitigation
	 * @generated
	 */
	public Adapter createDetectedIssueMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceUdiCarrier <em>Device Udi Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceUdiCarrier
	 * @generated
	 */
	public Adapter createDeviceUdiCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDeviceName <em>Device Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDeviceName
	 * @generated
	 */
	public Adapter createDeviceDeviceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceSpecialization <em>Device Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceSpecialization
	 * @generated
	 */
	public Adapter createDeviceSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceVersion <em>Device Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceVersion
	 * @generated
	 */
	public Adapter createDeviceVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceProperty <em>Device Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceProperty
	 * @generated
	 */
	public Adapter createDevicePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinition <em>Device Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinition
	 * @generated
	 */
	public Adapter createDeviceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier <em>Device Definition Udi Device Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier
	 * @generated
	 */
	public Adapter createDeviceDefinitionUdiDeviceIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionDeviceName <em>Device Definition Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionDeviceName
	 * @generated
	 */
	public Adapter createDeviceDefinitionDeviceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionSpecialization <em>Device Definition Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionSpecialization
	 * @generated
	 */
	public Adapter createDeviceDefinitionSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionCapability <em>Device Definition Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionCapability
	 * @generated
	 */
	public Adapter createDeviceDefinitionCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionProperty <em>Device Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionProperty
	 * @generated
	 */
	public Adapter createDeviceDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceDefinitionMaterial <em>Device Definition Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceDefinitionMaterial
	 * @generated
	 */
	public Adapter createDeviceDefinitionMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentReference <em>Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentReference
	 * @generated
	 */
	public Adapter createDocumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentReferenceRelatesTo <em>Document Reference Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentReferenceRelatesTo
	 * @generated
	 */
	public Adapter createDocumentReferenceRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentReferenceContent <em>Document Reference Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentReferenceContent
	 * @generated
	 */
	public Adapter createDocumentReferenceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentReferenceContext <em>Document Reference Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentReferenceContext
	 * @generated
	 */
	public Adapter createDocumentReferenceContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskAssessmentPrediction <em>Risk Assessment Prediction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskAssessmentPrediction
	 * @generated
	 */
	public Adapter createRiskAssessmentPredictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AccountCoverage <em>Account Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AccountCoverage
	 * @generated
	 */
	public Adapter createAccountCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AccountGuarantor <em>Account Guarantor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AccountGuarantor
	 * @generated
	 */
	public Adapter createAccountGuarantorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProduct <em>Medicinal Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProduct
	 * @generated
	 */
	public Adapter createMedicinalProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductContact <em>Medicinal Product Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductContact
	 * @generated
	 */
	public Adapter createMedicinalProductContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductName <em>Medicinal Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductName
	 * @generated
	 */
	public Adapter createMedicinalProductNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductNameNamePart <em>Medicinal Product Name Name Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductNameNamePart
	 * @generated
	 */
	public Adapter createMedicinalProductNameNamePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductNameCountryLanguage <em>Medicinal Product Name Country Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductNameCountryLanguage
	 * @generated
	 */
	public Adapter createMedicinalProductNameCountryLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductManufacturingBusinessOperation <em>Medicinal Product Manufacturing Business Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductManufacturingBusinessOperation
	 * @generated
	 */
	public Adapter createMedicinalProductManufacturingBusinessOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductSpecialDesignation <em>Medicinal Product Special Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductSpecialDesignation
	 * @generated
	 */
	public Adapter createMedicinalProductSpecialDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPharmaceutical <em>Medicinal Product Pharmaceutical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPharmaceutical
	 * @generated
	 */
	public Adapter createMedicinalProductPharmaceuticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPharmaceuticalCharacteristics <em>Medicinal Product Pharmaceutical Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPharmaceuticalCharacteristics
	 * @generated
	 */
	public Adapter createMedicinalProductPharmaceuticalCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration <em>Medicinal Product Pharmaceutical Route Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration
	 * @generated
	 */
	public Adapter createMedicinalProductPharmaceuticalRouteOfAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies <em>Medicinal Product Pharmaceutical Route Of Administration Target Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies
	 * @generated
	 */
	public Adapter createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod <em>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod
	 * @generated
	 */
	public Adapter createMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIngredient <em>Medicinal Product Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIngredient
	 * @generated
	 */
	public Adapter createMedicinalProductIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstance <em>Medicinal Product Ingredient Specified Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstance
	 * @generated
	 */
	public Adapter createMedicinalProductIngredientSpecifiedSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength <em>Medicinal Product Ingredient Specified Substance Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrength
	 * @generated
	 */
	public Adapter createMedicinalProductIngredientSpecifiedSubstanceStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength <em>Medicinal Product Ingredient Specified Substance Strength Reference Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength
	 * @generated
	 */
	public Adapter createMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIngredientSubstance <em>Medicinal Product Ingredient Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIngredientSubstance
	 * @generated
	 */
	public Adapter createMedicinalProductIngredientSubstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPackaged <em>Medicinal Product Packaged</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPackaged
	 * @generated
	 */
	public Adapter createMedicinalProductPackagedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier <em>Medicinal Product Packaged Batch Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPackagedBatchIdentifier
	 * @generated
	 */
	public Adapter createMedicinalProductPackagedBatchIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductPackagedPackageItem <em>Medicinal Product Packaged Package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductPackagedPackageItem
	 * @generated
	 */
	public Adapter createMedicinalProductPackagedPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductAuthorization <em>Medicinal Product Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductAuthorization
	 * @generated
	 */
	public Adapter createMedicinalProductAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization <em>Medicinal Product Authorization Jurisdictional Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization
	 * @generated
	 */
	public Adapter createMedicinalProductAuthorizationJurisdictionalAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure <em>Medicinal Product Authorization Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductAuthorizationProcedure
	 * @generated
	 */
	public Adapter createMedicinalProductAuthorizationProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductManufactured <em>Medicinal Product Manufactured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductManufactured
	 * @generated
	 */
	public Adapter createMedicinalProductManufacturedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchStudy <em>Research Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchStudy
	 * @generated
	 */
	public Adapter createResearchStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchStudyArm <em>Research Study Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchStudyArm
	 * @generated
	 */
	public Adapter createResearchStudyArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchStudyObjective <em>Research Study Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchStudyObjective
	 * @generated
	 */
	public Adapter createResearchStudyObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GroupCharacteristic <em>Group Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GroupCharacteristic
	 * @generated
	 */
	public Adapter createGroupCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GroupMember
	 * @generated
	 */
	public Adapter createGroupMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EvidenceVariable <em>Evidence Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EvidenceVariable
	 * @generated
	 */
	public Adapter createEvidenceVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EvidenceVariableCharacteristic <em>Evidence Variable Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EvidenceVariableCharacteristic
	 * @generated
	 */
	public Adapter createEvidenceVariableCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchSubject <em>Research Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchSubject
	 * @generated
	 */
	public Adapter createResearchSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Consent
	 * @generated
	 */
	public Adapter createConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConsentPolicy <em>Consent Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConsentPolicy
	 * @generated
	 */
	public Adapter createConsentPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConsentVerification <em>Consent Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConsentVerification
	 * @generated
	 */
	public Adapter createConsentVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Consentprovision <em>Consentprovision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Consentprovision
	 * @generated
	 */
	public Adapter createConsentprovisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConsentprovisionprovisionActor <em>Consentprovisionprovision Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConsentprovisionprovisionActor
	 * @generated
	 */
	public Adapter createConsentprovisionprovisionActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConsentprovisionprovisionData <em>Consentprovisionprovision Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConsentprovisionprovisionData
	 * @generated
	 */
	public Adapter createConsentprovisionprovisionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItem <em>Charge Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItem
	 * @generated
	 */
	public Adapter createChargeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItemDefinition <em>Charge Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItemDefinition
	 * @generated
	 */
	public Adapter createChargeItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItemDefinitionApplicability <em>Charge Item Definition Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItemDefinitionApplicability
	 * @generated
	 */
	public Adapter createChargeItemDefinitionApplicabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroup <em>Charge Item Definition Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItemDefinitionPropertyGroup
	 * @generated
	 */
	public Adapter createChargeItemDefinitionPropertyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent <em>Charge Item Definition Property Group Price Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItemDefinitionPropertyGroupPriceComponent
	 * @generated
	 */
	public Adapter createChargeItemDefinitionPropertyGroupPriceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ChargeItemPerformer <em>Charge Item Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ChargeItemPerformer
	 * @generated
	 */
	public Adapter createChargeItemPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationIngredient <em>Medication Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationIngredient
	 * @generated
	 */
	public Adapter createMedicationIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationBatch <em>Medication Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationBatch
	 * @generated
	 */
	public Adapter createMedicationBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DiagnosticReport <em>Diagnostic Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DiagnosticReport
	 * @generated
	 */
	public Adapter createDiagnosticReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DiagnosticReportMedia <em>Diagnostic Report Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DiagnosticReportMedia
	 * @generated
	 */
	public Adapter createDiagnosticReportMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImagingStudy <em>Imaging Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImagingStudy
	 * @generated
	 */
	public Adapter createImagingStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImagingStudySeries <em>Imaging Study Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImagingStudySeries
	 * @generated
	 */
	public Adapter createImagingStudySeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImagingStudySeriesPerformer <em>Imaging Study Series Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImagingStudySeriesPerformer
	 * @generated
	 */
	public Adapter createImagingStudySeriesPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImagingStudySeriesInstance <em>Imaging Study Series Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImagingStudySeriesInstance
	 * @generated
	 */
	public Adapter createImagingStudySeriesInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ProcedurePerformer <em>Procedure Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ProcedurePerformer
	 * @generated
	 */
	public Adapter createProcedurePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ProcedureFocalDevice <em>Procedure Focal Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ProcedureFocalDevice
	 * @generated
	 */
	public Adapter createProcedureFocalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CommunicationPayload <em>Communication Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CommunicationPayload
	 * @generated
	 */
	public Adapter createCommunicationPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponse <em>Claim Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponse
	 * @generated
	 */
	public Adapter createClaimResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseItem <em>Claim Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseItem
	 * @generated
	 */
	public Adapter createClaimResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseItemAdjudication <em>Claim Response Item Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseItemAdjudication
	 * @generated
	 */
	public Adapter createClaimResponseItemAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseItemItemDetail <em>Claim Response Item Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseItemItemDetail
	 * @generated
	 */
	public Adapter createClaimResponseItemItemDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail <em>Claim Response Item Item Detail Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseItemItemDetailSubDetail
	 * @generated
	 */
	public Adapter createClaimResponseItemItemDetailSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseAddedItem <em>Claim Response Added Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseAddedItem
	 * @generated
	 */
	public Adapter createClaimResponseAddedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetail <em>Claim Response Added Item Added Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseAddedItemAddedItemDetail
	 * @generated
	 */
	public Adapter createClaimResponseAddedItemAddedItemDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail <em>Claim Response Added Item Added Item Detail Added Item Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail
	 * @generated
	 */
	public Adapter createClaimResponseAddedItemAddedItemDetailAddedItemSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseTotal <em>Claim Response Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseTotal
	 * @generated
	 */
	public Adapter createClaimResponseTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponsePayment <em>Claim Response Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponsePayment
	 * @generated
	 */
	public Adapter createClaimResponsePaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseNote <em>Claim Response Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseNote
	 * @generated
	 */
	public Adapter createClaimResponseNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseInsurance <em>Claim Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseInsurance
	 * @generated
	 */
	public Adapter createClaimResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimResponseError <em>Claim Response Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimResponseError
	 * @generated
	 */
	public Adapter createClaimResponseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimRelatedClaim <em>Claim Related Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimRelatedClaim
	 * @generated
	 */
	public Adapter createClaimRelatedClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimPayee <em>Claim Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimPayee
	 * @generated
	 */
	public Adapter createClaimPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimCareTeam <em>Claim Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimCareTeam
	 * @generated
	 */
	public Adapter createClaimCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimSupportingInformation <em>Claim Supporting Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimSupportingInformation
	 * @generated
	 */
	public Adapter createClaimSupportingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimDiagnosis <em>Claim Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimDiagnosis
	 * @generated
	 */
	public Adapter createClaimDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimProcedure <em>Claim Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimProcedure
	 * @generated
	 */
	public Adapter createClaimProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimInsurance <em>Claim Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimInsurance
	 * @generated
	 */
	public Adapter createClaimInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimAccident <em>Claim Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimAccident
	 * @generated
	 */
	public Adapter createClaimAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimItem <em>Claim Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimItem
	 * @generated
	 */
	public Adapter createClaimItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimItemDetail <em>Claim Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimItemDetail
	 * @generated
	 */
	public Adapter createClaimItemDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ClaimItemDetailSubDetail <em>Claim Item Detail Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ClaimItemDetailSubDetail
	 * @generated
	 */
	public Adapter createClaimItemDetailSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceRequest <em>Device Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceRequest
	 * @generated
	 */
	public Adapter createDeviceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceRequestParameter <em>Device Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceRequestParameter
	 * @generated
	 */
	public Adapter createDeviceRequestParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CommunicationRequest <em>Communication Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CommunicationRequest
	 * @generated
	 */
	public Adapter createCommunicationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CommunicationRequestPayload <em>Communication Request Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CommunicationRequestPayload
	 * @generated
	 */
	public Adapter createCommunicationRequestPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.HealthcareService <em>Healthcare Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.HealthcareService
	 * @generated
	 */
	public Adapter createHealthcareServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.HealthcareServiceEligibility <em>Healthcare Service Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.HealthcareServiceEligibility
	 * @generated
	 */
	public Adapter createHealthcareServiceEligibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.HealthcareServiceAvailableTime <em>Healthcare Service Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.HealthcareServiceAvailableTime
	 * @generated
	 */
	public Adapter createHealthcareServiceAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.HealthcareServiceNotAvailable <em>Healthcare Service Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.HealthcareServiceNotAvailable
	 * @generated
	 */
	public Adapter createHealthcareServiceNotAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NamingSystem <em>Naming System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NamingSystem
	 * @generated
	 */
	public Adapter createNamingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NamingSystemUniqueId <em>Naming System Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NamingSystemUniqueId
	 * @generated
	 */
	public Adapter createNamingSystemUniqueIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BodyStructure <em>Body Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BodyStructure
	 * @generated
	 */
	public Adapter createBodyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TaskRestriction <em>Task Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TaskRestriction
	 * @generated
	 */
	public Adapter createTaskRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TaskParameter <em>Task Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TaskParameter
	 * @generated
	 */
	public Adapter createTaskParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TaskOutput
	 * @generated
	 */
	public Adapter createTaskOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireResponse <em>Questionnaire Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireResponse
	 * @generated
	 */
	public Adapter createQuestionnaireResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireItem <em>Questionnaire Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireItem
	 * @generated
	 */
	public Adapter createQuestionnaireItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireItemEnableWhen <em>Questionnaire Item Enable When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireItemEnableWhen
	 * @generated
	 */
	public Adapter createQuestionnaireItemEnableWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireItemAnswerOption <em>Questionnaire Item Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireItemAnswerOption
	 * @generated
	 */
	public Adapter createQuestionnaireItemAnswerOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireItemInitial <em>Questionnaire Item Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireItemInitial
	 * @generated
	 */
	public Adapter createQuestionnaireItemInitialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireResponseItem <em>Questionnaire Response Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireResponseItem
	 * @generated
	 */
	public Adapter createQuestionnaireResponseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.QuestionnaireResponseItemAnswer <em>Questionnaire Response Item Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.QuestionnaireResponseItemAnswer
	 * @generated
	 */
	public Adapter createQuestionnaireResponseItemAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefit <em>Explanation Of Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefit
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitRelatedClaim <em>Explanation Of Benefit Related Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitRelatedClaim
	 * @generated
	 */
	public Adapter createExplanationOfBenefitRelatedClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitPayee <em>Explanation Of Benefit Payee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitPayee
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPayeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitCareTeam <em>Explanation Of Benefit Care Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitCareTeam
	 * @generated
	 */
	public Adapter createExplanationOfBenefitCareTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitSupportingInformation <em>Explanation Of Benefit Supporting Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitSupportingInformation
	 * @generated
	 */
	public Adapter createExplanationOfBenefitSupportingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitDiagnosis <em>Explanation Of Benefit Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitDiagnosis
	 * @generated
	 */
	public Adapter createExplanationOfBenefitDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitProcedure <em>Explanation Of Benefit Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitProcedure
	 * @generated
	 */
	public Adapter createExplanationOfBenefitProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitInsurance <em>Explanation Of Benefit Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitInsurance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitAccident <em>Explanation Of Benefit Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitAccident
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitItem <em>Explanation Of Benefit Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitItemAdjudication <em>Explanation Of Benefit Item Adjudication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitItemAdjudication
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemAdjudicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitItemDetail <em>Explanation Of Benefit Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitItemDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitItemDetailSubDetail <em>Explanation Of Benefit Item Detail Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitItemDetailSubDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitItemDetailSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitAddedItem <em>Explanation Of Benefit Added Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitAddedItem
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAddedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitAddedItemAddedItemDetail <em>Explanation Of Benefit Added Item Added Item Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitAddedItemAddedItemDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAddedItemAddedItemDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail <em>Explanation Of Benefit Added Item Added Item Detail Added Item Detail Sub Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail
	 * @generated
	 */
	public Adapter createExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitTotal <em>Explanation Of Benefit Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitTotal
	 * @generated
	 */
	public Adapter createExplanationOfBenefitTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitPayment <em>Explanation Of Benefit Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitPayment
	 * @generated
	 */
	public Adapter createExplanationOfBenefitPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitNote <em>Explanation Of Benefit Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitNote
	 * @generated
	 */
	public Adapter createExplanationOfBenefitNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalance <em>Explanation Of Benefit Benefit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitBenefitBalance
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBenefitBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit <em>Explanation Of Benefit Benefit Balance Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ExplanationOfBenefitBenefitBalanceBenefit
	 * @generated
	 */
	public Adapter createExplanationOfBenefitBenefitBalanceBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMap <em>Concept Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMap
	 * @generated
	 */
	public Adapter createConceptMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMapGroup <em>Concept Map Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMapGroup
	 * @generated
	 */
	public Adapter createConceptMapGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMapGroupSourceElement <em>Concept Map Group Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMapGroupSourceElement
	 * @generated
	 */
	public Adapter createConceptMapGroupSourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement <em>Concept Map Group Source Element Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMapGroupSourceElementTargetElement
	 * @generated
	 */
	public Adapter createConceptMapGroupSourceElementTargetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement <em>Concept Map Group Source Element Target Element Other Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement
	 * @generated
	 */
	public Adapter createConceptMapGroupSourceElementTargetElementOtherElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystem
	 * @generated
	 */
	public Adapter createCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemFilter <em>Code System Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemFilter
	 * @generated
	 */
	public Adapter createCodeSystemFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemProperty <em>Code System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemProperty
	 * @generated
	 */
	public Adapter createCodeSystemPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemConceptDefinition <em>Code System Concept Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemConceptDefinition
	 * @generated
	 */
	public Adapter createCodeSystemConceptDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation <em>Code System Concept Definition Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemConceptDefinitionDesignation
	 * @generated
	 */
	public Adapter createCodeSystemConceptDefinitionDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemConceptDefinitionConceptProperty <em>Code System Concept Definition Concept Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemConceptDefinitionConceptProperty
	 * @generated
	 */
	public Adapter createCodeSystemConceptDefinitionConceptPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ConceptMapGroupUnmapped <em>Concept Map Group Unmapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ConceptMapGroupUnmapped
	 * @generated
	 */
	public Adapter createConceptMapGroupUnmappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroup <em>Request Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroup
	 * @generated
	 */
	public Adapter createRequestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroupAction <em>Request Group Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroupAction
	 * @generated
	 */
	public Adapter createRequestGroupActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroupActionCondition <em>Request Group Action Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroupActionCondition
	 * @generated
	 */
	public Adapter createRequestGroupActionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroupActionRelatedAction <em>Request Group Action Related Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroupActionRelatedAction
	 * @generated
	 */
	public Adapter createRequestGroupActionRelatedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilities <em>Terminology Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilities
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesSoftware <em>Terminology Capabilities Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesSoftware
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesImplementation <em>Terminology Capabilities Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesImplementation
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem <em>Terminology Capabilities Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesCodeSystem
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion <em>Terminology Capabilities Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesCodeSystemVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter <em>Terminology Capabilities Code System Version Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesCodeSystemVersionFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesExpansion <em>Terminology Capabilities Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesExpansion
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesExpansionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter <em>Terminology Capabilities Expansion Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesExpansionParameter
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesExpansionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesValidateCode <em>Terminology Capabilities Validate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesValidateCode
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesValidateCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesTranslation <em>Terminology Capabilities Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesTranslation
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TerminologyCapabilitiesClosure <em>Terminology Capabilities Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TerminologyCapabilitiesClosure
	 * @generated
	 */
	public Adapter createTerminologyCapabilitiesClosureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceMetric <em>Device Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceMetric
	 * @generated
	 */
	public Adapter createDeviceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceMetricCalibration <em>Device Metric Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceMetricCalibration
	 * @generated
	 */
	public Adapter createDeviceMetricCalibrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Flag
	 * @generated
	 */
	public Adapter createFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationEvaluation <em>Immunization Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationEvaluation
	 * @generated
	 */
	public Adapter createImmunizationEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Immunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Immunization
	 * @generated
	 */
	public Adapter createImmunizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationPerformer <em>Immunization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationPerformer
	 * @generated
	 */
	public Adapter createImmunizationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationEducation <em>Immunization Education</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationEducation
	 * @generated
	 */
	public Adapter createImmunizationEducationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationReaction <em>Immunization Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationReaction
	 * @generated
	 */
	public Adapter createImmunizationReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationProtocolApplied <em>Immunization Protocol Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationProtocolApplied
	 * @generated
	 */
	public Adapter createImmunizationProtocolAppliedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIndication <em>Medicinal Product Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIndication
	 * @generated
	 */
	public Adapter createMedicinalProductIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductIndicationOtherTherapy <em>Medicinal Product Indication Other Therapy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductIndicationOtherTherapy
	 * @generated
	 */
	public Adapter createMedicinalProductIndicationOtherTherapyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductUndesirableEffect <em>Medicinal Product Undesirable Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductUndesirableEffect
	 * @generated
	 */
	public Adapter createMedicinalProductUndesirableEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentManifest <em>Document Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentManifest
	 * @generated
	 */
	public Adapter createDocumentManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DocumentManifestRelated <em>Document Manifest Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DocumentManifestRelated
	 * @generated
	 */
	public Adapter createDocumentManifestRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GuidanceResponse <em>Guidance Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GuidanceResponse
	 * @generated
	 */
	public Adapter createGuidanceResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationOutcome <em>Operation Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationOutcome
	 * @generated
	 */
	public Adapter createOperationOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationOutcomeIssue <em>Operation Outcome Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationOutcomeIssue
	 * @generated
	 */
	public Adapter createOperationOutcomeIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ParametersParameter <em>Parameters Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ParametersParameter
	 * @generated
	 */
	public Adapter createParametersParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuide <em>Implementation Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuide
	 * @generated
	 */
	public Adapter createImplementationGuideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDependsOn <em>Implementation Guide Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDependsOn
	 * @generated
	 */
	public Adapter createImplementationGuideDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideGlobal <em>Implementation Guide Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideGlobal
	 * @generated
	 */
	public Adapter createImplementationGuideGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinition <em>Implementation Guide Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinition
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinitionGrouping <em>Implementation Guide Definition Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinitionGrouping
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinitionResource <em>Implementation Guide Definition Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinitionResource
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinitionPage <em>Implementation Guide Definition Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinitionPage
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinitionParameter <em>Implementation Guide Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinitionParameter
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideDefinitionTemplate <em>Implementation Guide Definition Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideDefinitionTemplate
	 * @generated
	 */
	public Adapter createImplementationGuideDefinitionTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideManifest <em>Implementation Guide Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideManifest
	 * @generated
	 */
	public Adapter createImplementationGuideManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideManifestManifestResource <em>Implementation Guide Manifest Manifest Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideManifestManifestResource
	 * @generated
	 */
	public Adapter createImplementationGuideManifestManifestResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImplementationGuideManifestManifestPage <em>Implementation Guide Manifest Manifest Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImplementationGuideManifestManifestPage
	 * @generated
	 */
	public Adapter createImplementationGuideManifestManifestPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SearchParameter <em>Search Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SearchParameter
	 * @generated
	 */
	public Adapter createSearchParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SearchParameterComponent <em>Search Parameter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SearchParameterComponent
	 * @generated
	 */
	public Adapter createSearchParameterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationDefinition
	 * @generated
	 */
	public Adapter createOperationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationDefinitionParameter <em>Operation Definition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationDefinitionParameter
	 * @generated
	 */
	public Adapter createOperationDefinitionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationDefinitionParameterBinding <em>Operation Definition Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationDefinitionParameterBinding
	 * @generated
	 */
	public Adapter createOperationDefinitionParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom <em>Operation Definition Parameter Referenced From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationDefinitionParameterReferencedFrom
	 * @generated
	 */
	public Adapter createOperationDefinitionParameterReferencedFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OperationDefinitionOverload <em>Operation Definition Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OperationDefinitionOverload
	 * @generated
	 */
	public Adapter createOperationDefinitionOverloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PaymentReconciliation <em>Payment Reconciliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PaymentReconciliation
	 * @generated
	 */
	public Adapter createPaymentReconciliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PaymentReconciliationDetails <em>Payment Reconciliation Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PaymentReconciliationDetails
	 * @generated
	 */
	public Adapter createPaymentReconciliationDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PaymentReconciliationNotes <em>Payment Reconciliation Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PaymentReconciliationNotes
	 * @generated
	 */
	public Adapter createPaymentReconciliationNotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PractitionerRole
	 * @generated
	 */
	public Adapter createPractitionerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PractitionerRoleAvailableTime <em>Practitioner Role Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PractitionerRoleAvailableTime
	 * @generated
	 */
	public Adapter createPractitionerRoleAvailableTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PractitionerRoleNotAvailable <em>Practitioner Role Not Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PractitionerRoleNotAvailable
	 * @generated
	 */
	public Adapter createPractitionerRoleNotAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DeviceUseStatement <em>Device Use Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DeviceUseStatement
	 * @generated
	 */
	public Adapter createDeviceUseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.FamilyMemberHistory <em>Family Member History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.FamilyMemberHistory
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.FamilyMemberHistoryCondition <em>Family Member History Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.FamilyMemberHistoryCondition
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.OrganizationAffiliation <em>Organization Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.OrganizationAffiliation
	 * @generated
	 */
	public Adapter createOrganizationAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchDefinition <em>Research Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchDefinition
	 * @generated
	 */
	public Adapter createResearchDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchElementDefinition <em>Research Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchElementDefinition
	 * @generated
	 */
	public Adapter createResearchElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ResearchElementDefinitionCharacteristic <em>Research Element Definition Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ResearchElementDefinitionCharacteristic
	 * @generated
	 */
	public Adapter createResearchElementDefinitionCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AdverseEvent <em>Adverse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AdverseEvent
	 * @generated
	 */
	public Adapter createAdverseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AdverseEventSuspectEntity <em>Adverse Event Suspect Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AdverseEventSuspectEntity
	 * @generated
	 */
	public Adapter createAdverseEventSuspectEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AdverseEventSuspectEntityCausality <em>Adverse Event Suspect Entity Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AdverseEventSuspectEntityCausality
	 * @generated
	 */
	public Adapter createAdverseEventSuspectEntityCausalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesis
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesisSampleSize <em>Risk Evidence Synthesis Sample Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesisSampleSize
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisSampleSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesisRiskEstimate <em>Risk Evidence Synthesis Risk Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesisRiskEstimate
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisRiskEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesisRiskEstimatePrecisionEstimate <em>Risk Evidence Synthesis Risk Estimate Precision Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesisRiskEstimatePrecisionEstimate
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisRiskEstimatePrecisionEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesisCertainty <em>Risk Evidence Synthesis Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesisCertainty
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisCertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent <em>Risk Evidence Synthesis Certainty Certainty Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent
	 * @generated
	 */
	public Adapter createRiskEvidenceSynthesisCertaintyCertaintySubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScript <em>Test Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScript
	 * @generated
	 */
	public Adapter createTestScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptOrigin <em>Test Script Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptOrigin
	 * @generated
	 */
	public Adapter createTestScriptOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptDestination <em>Test Script Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptDestination
	 * @generated
	 */
	public Adapter createTestScriptDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptMetadata <em>Test Script Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptMetadata
	 * @generated
	 */
	public Adapter createTestScriptMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptMetadataLink <em>Test Script Metadata Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptMetadataLink
	 * @generated
	 */
	public Adapter createTestScriptMetadataLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptMetadataCapability <em>Test Script Metadata Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptMetadataCapability
	 * @generated
	 */
	public Adapter createTestScriptMetadataCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatement <em>Capability Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatement
	 * @generated
	 */
	public Adapter createCapabilityStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementSoftware <em>Capability Statement Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementSoftware
	 * @generated
	 */
	public Adapter createCapabilityStatementSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementImplementation <em>Capability Statement Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementImplementation
	 * @generated
	 */
	public Adapter createCapabilityStatementImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRest <em>Capability Statement Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRest
	 * @generated
	 */
	public Adapter createCapabilityStatementRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestSecurity <em>Capability Statement Rest Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestSecurity
	 * @generated
	 */
	public Adapter createCapabilityStatementRestSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestResource <em>Capability Statement Rest Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestResource
	 * @generated
	 */
	public Adapter createCapabilityStatementRestResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestResourceResourceInteraction <em>Capability Statement Rest Resource Resource Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestResourceResourceInteraction
	 * @generated
	 */
	public Adapter createCapabilityStatementRestResourceResourceInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestResourceSearchParam <em>Capability Statement Rest Resource Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestResourceSearchParam
	 * @generated
	 */
	public Adapter createCapabilityStatementRestResourceSearchParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestResourceOperation <em>Capability Statement Rest Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestResourceOperation
	 * @generated
	 */
	public Adapter createCapabilityStatementRestResourceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementRestSystemInteraction <em>Capability Statement Rest System Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementRestSystemInteraction
	 * @generated
	 */
	public Adapter createCapabilityStatementRestSystemInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompartmentDefinition <em>Compartment Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompartmentDefinition
	 * @generated
	 */
	public Adapter createCompartmentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompartmentDefinitionResource <em>Compartment Definition Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompartmentDefinitionResource
	 * @generated
	 */
	public Adapter createCompartmentDefinitionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementMessaging <em>Capability Statement Messaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementMessaging
	 * @generated
	 */
	public Adapter createCapabilityStatementMessagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementMessagingEndpoint <em>Capability Statement Messaging Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementMessagingEndpoint
	 * @generated
	 */
	public Adapter createCapabilityStatementMessagingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementMessagingSupportedMessage <em>Capability Statement Messaging Supported Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementMessagingSupportedMessage
	 * @generated
	 */
	public Adapter createCapabilityStatementMessagingSupportedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageDefinitionFocus <em>Message Definition Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageDefinitionFocus
	 * @generated
	 */
	public Adapter createMessageDefinitionFocusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageDefinitionAllowedResponse <em>Message Definition Allowed Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageDefinitionAllowedResponse
	 * @generated
	 */
	public Adapter createMessageDefinitionAllowedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GraphDefinition <em>Graph Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GraphDefinition
	 * @generated
	 */
	public Adapter createGraphDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GraphDefinitionLink <em>Graph Definition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GraphDefinitionLink
	 * @generated
	 */
	public Adapter createGraphDefinitionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GraphDefinitionLinkTarget <em>Graph Definition Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GraphDefinitionLinkTarget
	 * @generated
	 */
	public Adapter createGraphDefinitionLinkTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment <em>Graph Definition Link Target Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GraphDefinitionLinkTargetCompartment
	 * @generated
	 */
	public Adapter createGraphDefinitionLinkTargetCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CapabilityStatementDocument <em>Capability Statement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CapabilityStatementDocument
	 * @generated
	 */
	public Adapter createCapabilityStatementDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptFixture <em>Test Script Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptFixture
	 * @generated
	 */
	public Adapter createTestScriptFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptVariable <em>Test Script Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptVariable
	 * @generated
	 */
	public Adapter createTestScriptVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptSetup <em>Test Script Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptSetup
	 * @generated
	 */
	public Adapter createTestScriptSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptSetupSetupAction <em>Test Script Setup Setup Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptSetupSetupAction
	 * @generated
	 */
	public Adapter createTestScriptSetupSetupActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation <em>Test Script Setup Setup Action Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptSetupSetupActionOperation
	 * @generated
	 */
	public Adapter createTestScriptSetupSetupActionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader <em>Test Script Setup Setup Action Operation Request Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader
	 * @generated
	 */
	public Adapter createTestScriptSetupSetupActionOperationRequestHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert <em>Test Script Setup Setup Action Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptSetupSetupActionAssert
	 * @generated
	 */
	public Adapter createTestScriptSetupSetupActionAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptTest <em>Test Script Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptTest
	 * @generated
	 */
	public Adapter createTestScriptTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptTestTestAction <em>Test Script Test Test Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptTestTestAction
	 * @generated
	 */
	public Adapter createTestScriptTestTestActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptTeardown <em>Test Script Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptTeardown
	 * @generated
	 */
	public Adapter createTestScriptTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestScriptTeardownTeardownAction <em>Test Script Teardown Teardown Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestScriptTeardownTeardownAction
	 * @generated
	 */
	public Adapter createTestScriptTeardownTeardownActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BiologicallyDerivedProduct <em>Biologically Derived Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BiologicallyDerivedProduct
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BiologicallyDerivedProductCollection <em>Biologically Derived Product Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BiologicallyDerivedProductCollection
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BiologicallyDerivedProductProcessing <em>Biologically Derived Product Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BiologicallyDerivedProductProcessing
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BiologicallyDerivedProductManipulation <em>Biologically Derived Product Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BiologicallyDerivedProductManipulation
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductManipulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BiologicallyDerivedProductStorage <em>Biologically Derived Product Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BiologicallyDerivedProductStorage
	 * @generated
	 */
	public Adapter createBiologicallyDerivedProductStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EnrollmentRequest <em>Enrollment Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EnrollmentRequest
	 * @generated
	 */
	public Adapter createEnrollmentRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageHeader <em>Message Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageHeader
	 * @generated
	 */
	public Adapter createMessageHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageHeaderMessageDestination <em>Message Header Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageHeaderMessageDestination
	 * @generated
	 */
	public Adapter createMessageHeaderMessageDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageHeaderMessageSource <em>Message Header Message Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageHeaderMessageSource
	 * @generated
	 */
	public Adapter createMessageHeaderMessageSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MessageHeaderResponse <em>Message Header Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MessageHeaderResponse
	 * @generated
	 */
	public Adapter createMessageHeaderResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PaymentNotice <em>Payment Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PaymentNotice
	 * @generated
	 */
	public Adapter createPaymentNoticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubscriptionChannel <em>Subscription Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubscriptionChannel
	 * @generated
	 */
	public Adapter createSubscriptionChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Linkage <em>Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Linkage
	 * @generated
	 */
	public Adapter createLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.LinkageItem <em>Linkage Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.LinkageItem
	 * @generated
	 */
	public Adapter createLinkageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CatalogEntry <em>Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CatalogEntry
	 * @generated
	 */
	public Adapter createCatalogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CatalogEntryRelatedEntry <em>Catalog Entry Related Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CatalogEntryRelatedEntry
	 * @generated
	 */
	public Adapter createCatalogEntryRelatedEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompositionAttester <em>Composition Attester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompositionAttester
	 * @generated
	 */
	public Adapter createCompositionAttesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompositionRelatesTo <em>Composition Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompositionRelatesTo
	 * @generated
	 */
	public Adapter createCompositionRelatesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompositionEvent <em>Composition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompositionEvent
	 * @generated
	 */
	public Adapter createCompositionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompositionSection <em>Composition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompositionSection
	 * @generated
	 */
	public Adapter createCompositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceNucleicAcid <em>Substance Nucleic Acid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceNucleicAcid
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit <em>Substance Nucleic Acid Subunit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceNucleicAcidSubunit
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidSubunitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceNucleicAcidSubunitLinkage <em>Substance Nucleic Acid Subunit Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceNucleicAcidSubunitLinkage
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidSubunitLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar <em>Substance Nucleic Acid Subunit Sugar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceNucleicAcidSubunitSugar
	 * @generated
	 */
	public Adapter createSubstanceNucleicAcidSubunitSugarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SupplyRequest <em>Supply Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SupplyRequest
	 * @generated
	 */
	public Adapter createSupplyRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SupplyRequestParameter <em>Supply Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SupplyRequestParameter
	 * @generated
	 */
	public Adapter createSupplyRequestParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesis <em>Effect Evidence Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesis
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize <em>Effect Evidence Synthesis Sample Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisSampleSize
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisSampleSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure <em>Effect Evidence Synthesis Results By Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisResultsByExposureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate <em>Effect Evidence Synthesis Effect Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisEffectEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate <em>Effect Evidence Synthesis Effect Estimate Precision Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisEffectEstimatePrecisionEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisCertainty <em>Effect Evidence Synthesis Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisCertainty
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisCertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EffectEvidenceSynthesisCertaintyCertaintySubcomponent <em>Effect Evidence Synthesis Certainty Certainty Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EffectEvidenceSynthesisCertaintyCertaintySubcomponent
	 * @generated
	 */
	public Adapter createEffectEvidenceSynthesisCertaintyCertaintySubcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlan <em>Insurance Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlan
	 * @generated
	 */
	public Adapter createInsurancePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanContact <em>Insurance Plan Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanContact
	 * @generated
	 */
	public Adapter createInsurancePlanContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanCoverage <em>Insurance Plan Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanCoverage
	 * @generated
	 */
	public Adapter createInsurancePlanCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefit <em>Insurance Plan Coverage Coverage Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanCoverageCoverageBenefit
	 * @generated
	 */
	public Adapter createInsurancePlanCoverageCoverageBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit <em>Insurance Plan Coverage Coverage Benefit Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanCoverageCoverageBenefitLimit
	 * @generated
	 */
	public Adapter createInsurancePlanCoverageCoverageBenefitLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanPlan <em>Insurance Plan Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanPlan
	 * @generated
	 */
	public Adapter createInsurancePlanPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanPlanGeneralCost <em>Insurance Plan Plan General Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanPlanGeneralCost
	 * @generated
	 */
	public Adapter createInsurancePlanPlanGeneralCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanPlanSpecificCost <em>Insurance Plan Plan Specific Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanPlanSpecificCost
	 * @generated
	 */
	public Adapter createInsurancePlanPlanSpecificCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit <em>Insurance Plan Plan Specific Cost Plan Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefit
	 * @generated
	 */
	public Adapter createInsurancePlanPlanSpecificCostPlanBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost <em>Insurance Plan Plan Specific Cost Plan Benefit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InsurancePlanPlanSpecificCostPlanBenefitCost
	 * @generated
	 */
	public Adapter createInsurancePlanPlanSpecificCostPlanBenefitCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceReferenceInformation <em>Substance Reference Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceReferenceInformation
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceReferenceInformationGene <em>Substance Reference Information Gene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceReferenceInformationGene
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationGeneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement <em>Substance Reference Information Gene Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceReferenceInformationGeneElement
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationGeneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceReferenceInformationClassification <em>Substance Reference Information Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceReferenceInformationClassification
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceReferenceInformationTarget <em>Substance Reference Information Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceReferenceInformationTarget
	 * @generated
	 */
	public Adapter createSubstanceReferenceInformationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymer <em>Substance Polymer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymer
	 * @generated
	 */
	public Adapter createSubstancePolymerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerMonomerSet <em>Substance Polymer Monomer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerMonomerSet
	 * @generated
	 */
	public Adapter createSubstancePolymerMonomerSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial <em>Substance Polymer Monomer Set Starting Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial
	 * @generated
	 */
	public Adapter createSubstancePolymerMonomerSetStartingMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerRepeat <em>Substance Polymer Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerRepeat
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit <em>Substance Polymer Repeat Repeat Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerRepeatRepeatUnit
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatRepeatUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation <em>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation <em>Substance Polymer Repeat Repeat Unit Structural Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation
	 * @generated
	 */
	public Adapter createSubstancePolymerRepeatRepeatUnitStructuralRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceProtein <em>Substance Protein</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceProtein
	 * @generated
	 */
	public Adapter createSubstanceProteinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceProteinSubunit <em>Substance Protein Subunit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceProteinSubunit
	 * @generated
	 */
	public Adapter createSubstanceProteinSubunitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterial <em>Substance Source Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterial
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialFractionDescription <em>Substance Source Material Fraction Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialFractionDescription
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialFractionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism <em>Substance Source Material Organism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialOrganism
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor <em>Substance Source Material Organism Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid <em>Substance Source Material Organism Hybrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialOrganismHybrid
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismHybridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral <em>Substance Source Material Organism Organism General</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialOrganismOrganismGeneral
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialOrganismOrganismGeneralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SubstanceSourceMaterialPartDescription <em>Substance Source Material Part Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SubstanceSourceMaterialPartDescription
	 * @generated
	 */
	public Adapter createSubstanceSourceMaterialPartDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductContraindication <em>Medicinal Product Contraindication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductContraindication
	 * @generated
	 */
	public Adapter createMedicinalProductContraindicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductContraindicationOtherTherapy <em>Medicinal Product Contraindication Other Therapy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductContraindicationOtherTherapy
	 * @generated
	 */
	public Adapter createMedicinalProductContraindicationOtherTherapyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequence <em>Molecular Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequence
	 * @generated
	 */
	public Adapter createMolecularSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceReferenceSeq <em>Molecular Sequence Reference Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceReferenceSeq
	 * @generated
	 */
	public Adapter createMolecularSequenceReferenceSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceVariant <em>Molecular Sequence Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceVariant
	 * @generated
	 */
	public Adapter createMolecularSequenceVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceQuality <em>Molecular Sequence Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceQuality
	 * @generated
	 */
	public Adapter createMolecularSequenceQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceQualityRoc <em>Molecular Sequence Quality Roc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceQualityRoc
	 * @generated
	 */
	public Adapter createMolecularSequenceQualityRocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceRepository <em>Molecular Sequence Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceRepository
	 * @generated
	 */
	public Adapter createMolecularSequenceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceStructureVariant <em>Molecular Sequence Structure Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceStructureVariant
	 * @generated
	 */
	public Adapter createMolecularSequenceStructureVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceStructureVariantOuter <em>Molecular Sequence Structure Variant Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceStructureVariantOuter
	 * @generated
	 */
	public Adapter createMolecularSequenceStructureVariantOuterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MolecularSequenceStructureVariantInner <em>Molecular Sequence Structure Variant Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MolecularSequenceStructureVariantInner
	 * @generated
	 */
	public Adapter createMolecularSequenceStructureVariantInnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AllergyIntolerance
	 * @generated
	 */
	public Adapter createAllergyIntoleranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AllergyIntoleranceReaction <em>Allergy Intolerance Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AllergyIntoleranceReaction
	 * @generated
	 */
	public Adapter createAllergyIntoleranceReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Invoice
	 * @generated
	 */
	public Adapter createInvoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InvoiceParticipant <em>Invoice Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InvoiceParticipant
	 * @generated
	 */
	public Adapter createInvoiceParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InvoiceLineItem <em>Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InvoiceLineItem
	 * @generated
	 */
	public Adapter createInvoiceLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.InvoiceLineItemPriceComponent <em>Invoice Line Item Price Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.InvoiceLineItemPriceComponent
	 * @generated
	 */
	public Adapter createInvoiceLineItemPriceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EnrollmentResponse <em>Enrollment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EnrollmentResponse
	 * @generated
	 */
	public Adapter createEnrollmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationRecommendation <em>Immunization Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation <em>Immunization Recommendation Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationRecommendationRecommendation
	 * @generated
	 */
	public Adapter createImmunizationRecommendationRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion <em>Immunization Recommendation Recommendation Date Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion
	 * @generated
	 */
	public Adapter createImmunizationRecommendationRecommendationDateCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VerificationResult <em>Verification Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VerificationResult
	 * @generated
	 */
	public Adapter createVerificationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VerificationResultPrimarySource <em>Verification Result Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VerificationResultPrimarySource
	 * @generated
	 */
	public Adapter createVerificationResultPrimarySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VerificationResultAttestation <em>Verification Result Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VerificationResultAttestation
	 * @generated
	 */
	public Adapter createVerificationResultAttestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VerificationResultValidator <em>Verification Result Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VerificationResultValidator
	 * @generated
	 */
	public Adapter createVerificationResultValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BundleLink <em>Bundle Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BundleLink
	 * @generated
	 */
	public Adapter createBundleLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BundleEntry <em>Bundle Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BundleEntry
	 * @generated
	 */
	public Adapter createBundleEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Entry_Resource <em>Entry Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Entry_Resource
	 * @generated
	 */
	public Adapter createEntry_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BundleEntrySearch <em>Bundle Entry Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BundleEntrySearch
	 * @generated
	 */
	public Adapter createBundleEntrySearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BundleEntryRequest <em>Bundle Entry Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BundleEntryRequest
	 * @generated
	 */
	public Adapter createBundleEntryRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.BundleEntryResponse <em>Bundle Entry Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.BundleEntryResponse
	 * @generated
	 */
	public Adapter createBundleEntryResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReport <em>Test Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReport
	 * @generated
	 */
	public Adapter createTestReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportParticipant <em>Test Report Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportParticipant
	 * @generated
	 */
	public Adapter createTestReportParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportSetup <em>Test Report Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportSetup
	 * @generated
	 */
	public Adapter createTestReportSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportSetupSetupAction <em>Test Report Setup Setup Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportSetupSetupAction
	 * @generated
	 */
	public Adapter createTestReportSetupSetupActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportSetupSetupActionOperation <em>Test Report Setup Setup Action Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportSetupSetupActionOperation
	 * @generated
	 */
	public Adapter createTestReportSetupSetupActionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportSetupSetupActionAssert <em>Test Report Setup Setup Action Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportSetupSetupActionAssert
	 * @generated
	 */
	public Adapter createTestReportSetupSetupActionAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportTest <em>Test Report Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportTest
	 * @generated
	 */
	public Adapter createTestReportTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportTestTestAction <em>Test Report Test Test Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportTestTestAction
	 * @generated
	 */
	public Adapter createTestReportTestTestActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportTeardown <em>Test Report Teardown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportTeardown
	 * @generated
	 */
	public Adapter createTestReportTeardownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.TestReportTeardownTeardownAction <em>Test Report Teardown Teardown Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.TestReportTeardownTeardownAction
	 * @generated
	 */
	public Adapter createTestReportTeardownTeardownActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrder <em>Nutrition Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrder
	 * @generated
	 */
	public Adapter createNutritionOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderOralDiet <em>Nutrition Order Oral Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderOralDiet
	 * @generated
	 */
	public Adapter createNutritionOrderOralDietAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderOralDietNutrient <em>Nutrition Order Oral Diet Nutrient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderOralDietNutrient
	 * @generated
	 */
	public Adapter createNutritionOrderOralDietNutrientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderOralDietTexture <em>Nutrition Order Oral Diet Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderOralDietTexture
	 * @generated
	 */
	public Adapter createNutritionOrderOralDietTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderSupplement <em>Nutrition Order Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderSupplement
	 * @generated
	 */
	public Adapter createNutritionOrderSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderEnteralFormula <em>Nutrition Order Enteral Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderEnteralFormula
	 * @generated
	 */
	public Adapter createNutritionOrderEnteralFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.NutritionOrderEnteralFormulaAdministration <em>Nutrition Order Enteral Formula Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.NutritionOrderEnteralFormulaAdministration
	 * @generated
	 */
	public Adapter createNutritionOrderEnteralFormulaAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PersonLink <em>Person Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PersonLink
	 * @generated
	 */
	public Adapter createPersonLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationStatement <em>Medication Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationStatement
	 * @generated
	 */
	public Adapter createMedicationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AppointmentResponse <em>Appointment Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AppointmentResponse
	 * @generated
	 */
	public Adapter createAppointmentResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEvent <em>Audit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEvent
	 * @generated
	 */
	public Adapter createAuditEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEventAgent <em>Audit Event Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEventAgent
	 * @generated
	 */
	public Adapter createAuditEventAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEventAgentNetwork <em>Audit Event Agent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEventAgentNetwork
	 * @generated
	 */
	public Adapter createAuditEventAgentNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEventSource <em>Audit Event Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEventSource
	 * @generated
	 */
	public Adapter createAuditEventSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEventEntity <em>Audit Event Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEventEntity
	 * @generated
	 */
	public Adapter createAuditEventEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.AuditEventEntityDetail <em>Audit Event Entity Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.AuditEventEntityDetail
	 * @generated
	 */
	public Adapter createAuditEventEntityDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityRequest <em>Coverage Eligibility Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityRequest
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityRequestSupportingInformation <em>Coverage Eligibility Request Supporting Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityRequestSupportingInformation
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestSupportingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityRequestInsurance <em>Coverage Eligibility Request Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityRequestInsurance
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityRequestDetails <em>Coverage Eligibility Request Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityRequestDetails
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityRequestDetailsDiagnosis <em>Coverage Eligibility Request Details Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityRequestDetailsDiagnosis
	 * @generated
	 */
	public Adapter createCoverageEligibilityRequestDetailsDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductInteraction <em>Medicinal Product Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductInteraction
	 * @generated
	 */
	public Adapter createMedicinalProductInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicinalProductInteractionInteractant <em>Medicinal Product Interaction Interactant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicinalProductInteractionInteractant
	 * @generated
	 */
	public Adapter createMedicinalProductInteractionInteractantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VisionPrescription <em>Vision Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VisionPrescription
	 * @generated
	 */
	public Adapter createVisionPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VisionPrescriptionLensSpecification <em>Vision Prescription Lens Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VisionPrescriptionLensSpecification
	 * @generated
	 */
	public Adapter createVisionPrescriptionLensSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.VisionPrescriptionLensSpecificationPrism <em>Vision Prescription Lens Specification Prism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.VisionPrescriptionLensSpecificationPrism
	 * @generated
	 */
	public Adapter createVisionPrescriptionLensSpecificationPrismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SupplyDelivery <em>Supply Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SupplyDelivery
	 * @generated
	 */
	public Adapter createSupplyDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.SupplyDeliverySuppliedItem <em>Supply Delivery Supplied Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.SupplyDeliverySuppliedItem
	 * @generated
	 */
	public Adapter createSupplyDeliverySuppliedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationDispense <em>Medication Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationDispense
	 * @generated
	 */
	public Adapter createMedicationDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationDispensePerformer <em>Medication Dispense Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationDispensePerformer
	 * @generated
	 */
	public Adapter createMedicationDispensePerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationDispenseSubstitution <em>Medication Dispense Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationDispenseSubstitution
	 * @generated
	 */
	public Adapter createMedicationDispenseSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledge <em>Medication Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledge
	 * @generated
	 */
	public Adapter createMedicationKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeRelatedMedicationKnowledge <em>Medication Knowledge Related Medication Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeRelatedMedicationKnowledge
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRelatedMedicationKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeMonograph <em>Medication Knowledge Monograph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeMonograph
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMonographAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeIngredient <em>Medication Knowledge Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeIngredient
	 * @generated
	 */
	public Adapter createMedicationKnowledgeIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeCost <em>Medication Knowledge Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeCost
	 * @generated
	 */
	public Adapter createMedicationKnowledgeCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeMonitoringProgram <em>Medication Knowledge Monitoring Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeMonitoringProgram
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMonitoringProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines <em>Medication Knowledge Administration Guidelines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines
	 * @generated
	 */
	public Adapter createMedicationKnowledgeAdministrationGuidelinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage <em>Medication Knowledge Administration Guidelines Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage
	 * @generated
	 */
	public Adapter createMedicationKnowledgeAdministrationGuidelinesDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics <em>Medication Knowledge Administration Guidelines Patient Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics
	 * @generated
	 */
	public Adapter createMedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeMedicineClassification <em>Medication Knowledge Medicine Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeMedicineClassification
	 * @generated
	 */
	public Adapter createMedicationKnowledgeMedicineClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgePackaging <em>Medication Knowledge Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgePackaging
	 * @generated
	 */
	public Adapter createMedicationKnowledgePackagingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeDrugCharacteristic <em>Medication Knowledge Drug Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeDrugCharacteristic
	 * @generated
	 */
	public Adapter createMedicationKnowledgeDrugCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeRegulatory <em>Medication Knowledge Regulatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeRegulatory
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRegulatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeRegulatorySubstitution <em>Medication Knowledge Regulatory Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeRegulatorySubstitution
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRegulatorySubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeRegulatorySchedule <em>Medication Knowledge Regulatory Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeRegulatorySchedule
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRegulatoryScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense <em>Medication Knowledge Regulatory Max Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense
	 * @generated
	 */
	public Adapter createMedicationKnowledgeRegulatoryMaxDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.MedicationKnowledgeKinetics <em>Medication Knowledge Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.MedicationKnowledgeKinetics
	 * @generated
	 */
	public Adapter createMedicationKnowledgeKineticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityResponse <em>Coverage Eligibility Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityResponse
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityResponseInsurance <em>Coverage Eligibility Response Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityResponseInsurance
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems <em>Coverage Eligibility Response Insurance Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityResponseInsuranceItems
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseInsuranceItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItemsBenefit <em>Coverage Eligibility Response Insurance Items Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityResponseInsuranceItemsBenefit
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseInsuranceItemsBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CoverageEligibilityResponseErrors <em>Coverage Eligibility Response Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CoverageEligibilityResponseErrors
	 * @generated
	 */
	public Adapter createCoverageEligibilityResponseErrorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureDefinition
	 * @generated
	 */
	public Adapter createStructureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureDefinitionMapping <em>Structure Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureDefinitionMapping
	 * @generated
	 */
	public Adapter createStructureDefinitionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureDefinitionContext <em>Structure Definition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureDefinitionContext
	 * @generated
	 */
	public Adapter createStructureDefinitionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureDefinitionSnapshot <em>Structure Definition Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureDefinitionSnapshot
	 * @generated
	 */
	public Adapter createStructureDefinitionSnapshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.StructureDefinitionDifferential <em>Structure Definition Differential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.StructureDefinitionDifferential
	 * @generated
	 */
	public Adapter createStructureDefinitionDifferentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.BackboneElement
	 * @generated
	 */
	public Adapter createBackboneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResourcesAdapterFactory
