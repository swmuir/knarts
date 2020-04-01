/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataTypesPackageImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

import org.eclipse.mdht.hl7.fhir.profiles.impl.ProfilesPackageImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

import org.eclipse.mdht.hl7.fhir.resources.impl.ResourcesPackageImpl;

import org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsFactory;
import org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueSetsPackageImpl extends EPackageImpl implements ValueSetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "valueSets.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageContextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextOfUseValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jurisdictionValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definitionUseCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDefinedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonLanguagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signatureTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2036027EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingAbbreviationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designationUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctAdditionalDosageInstructionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctMedicationAsNeededReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctAnatomicalStructureForAdministrationSiteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctAdministrationMethodCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseAndRateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allSecurityLabelsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonTagsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum organizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointConnectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointPayloadTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum libraryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definitionTopicEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureScoringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeMeasureScoringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurePopulationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureDataUsageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maritalStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientContactRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleUseCodesForListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActEncounterCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum episodeOfCareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionDiagnosisSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionProblemDiagnosisCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctBodyStructuresEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum investigationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planDefinitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctClinicalFindingsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStartEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionParticipantRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum careTeamCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantRolesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalAchievementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityOutcomeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentCancellationReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum practiceSettingCodeValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20276EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCodesSnomedcTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20116EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ServiceDeliveryLocationRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctMedicationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20487EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preparePatientEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenCollectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerMaterialsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenContainerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerCapEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20371EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rejectionCriterionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum handlingConditionSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationMethodsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ucumCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationReferenceRangeMeaningCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationReferenceRangeAppliesToCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceRequestCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceRequestOrderDetailsCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageTypeAndSelfPayCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriberRelationshipCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageClassCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageCopayTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleCoverageFinancialExceptionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceLegalStateCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractContentDerivationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceExpirationTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceScopeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractSubtypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceDefinitionTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceDefinitionSubtypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTermTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractTermSubtypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceScopeCodesAEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceScopeCodesBEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceSecurityControlCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourcePartyRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActConsentDirectiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceDecisionModeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceAssetScopeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceAssetTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceAssetSubTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentContentClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceAssetContextCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceAssetAvailiabilityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractActorRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3PurposeOfUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractResourceActionStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceParticipantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceParticipantRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceActivityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractSignerTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirSpecimenCollectionMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20916EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenProcessingProcedureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20493EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctReasonMedicationNotGivenCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationAdministrationCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationAdministrationPerformerFunctionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonMedicationGivenCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedurePerformerRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationRequestCourseOfTherapyCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActSubstanceAdminSubstitutionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3SubstanceAdminSubstitutionReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectedIssueCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manifestationAndSymptomCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectedIssueMitigationActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDeviceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceSafetyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDeviceStatusReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataAbsentReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationInterpretationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentClassValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentReferenceFormatCodeSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum facilityTypeCodeValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalImpressionPrognosisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskProbabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionStageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosisRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum admitSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v20092EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialCourtesyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialArrangementsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dischargeDispositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listOrderCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientMedicineChangeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listEmptyReasonsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchStudyPrimaryPurposeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchStudyPhaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchStudyReasonStoppedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum researchStudyObjectiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentScopeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentPolicyRuleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentContentCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargeItemCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctFormCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum icD10CodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticServiceSectionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincDiagnosticReportCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acquisitionModalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureNotPerformedReasonSnomeDCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCategoryCodesSnomedcTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureOutcomeCodesSnomedcTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureFollowUpCodesSnomedcTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureDeviceActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lateralityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imagingStudySeriesPerformerFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaModalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaCollectionViewProjectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationNotDoneReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ParticipationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationTopicEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleClaimSubTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processPriorityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fundsReservationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleRelatedClaimRelationshipCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimPayeeTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimCareTeamRoleCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleProviderQualificationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimInformationCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exceptionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum missingToothReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleDiagnosisTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleDiagnosisOnAdmissionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleDiagnosisRelatedGroupCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleProcedureTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum icD10ProcedureCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActIncidentCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleRevenueCenterCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usclsCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleProgramReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleServicePlaceCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oralSiteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum surfaceCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationValueCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum examplePaymentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentAdjustmentReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicationErrorCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceProvisionConditionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctMorphologicAbnormalitiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodystructureLocationQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireQuestionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireAnswerCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitTermCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vitalSignsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricAndComponentTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationEvaluationTargetDiseaseCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccineAdministeredValueSetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationOriginCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codesForImmunizationSiteOfAdministrationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationFunctionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationSubpotentReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationProgramEligibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationFundingSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationTargetDiseaseCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationEvaluationDoseStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationEvaluationDoseStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationOutcomeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum practitionerRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyHistoryAbsentReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3FamilyMemberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionOutcomeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum organizationAffiliationRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adverseEventCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctClinicalFindingsAEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adverseEventSeriousnessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adverseEventCausalityAssessmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adverseEventCausalityMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synthesisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum studyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskEstimateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum precisionEstimateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualityOfEvidenceRatingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certaintySubcomponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certaintySubcomponentRatingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptProfileOriginTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptProfileDestinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restfulSecurityServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTransportEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptOperationCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleMessageReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDocumentTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentSectionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctSupplyItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evidenceVariantStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectEstimateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum insurancePlanTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceHistoryRecordActivityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chromosomehumanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ensemblEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fdAStandardSequenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fdAMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum catalogTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationTargetDiseaseCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationRecommendationDateCriterionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum needEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationprocessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primarysourcetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationresultcommunicationmethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationstatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum canpushupdatesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pushtypeavailableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foodTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutrientModifierCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureModifierCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureModifiedFoodTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fluidConsistencyTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplementTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralFormulaTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralFormulaAdditiveTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enteralRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedctDrugTherapyStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventIdEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventSubTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventEntityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventEntityRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectLifecycleEventsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicResourceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exampleVisionPrescriptionProductCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispenseStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispenseCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispensePerformerFunctionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3ActPharmacySupplyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationKnowledgePackageTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationKnowledgeCharacteristicCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageEligibilityResponseAuthSupportCodesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValueSetsPackageImpl() {
		super(eNS_URI, ValueSetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ValueSetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ValueSetsPackage init() {
		if (isInited) return (ValueSetsPackage)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredValueSetsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ValueSetsPackageImpl theValueSetsPackage = registeredValueSetsPackage instanceof ValueSetsPackageImpl ? (ValueSetsPackageImpl)registeredValueSetsPackage : new ValueSetsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(registeredPackage instanceof DataTypesPackageImpl ? registeredPackage : DataTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : ResourcesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilesPackage.eNS_URI);
		ProfilesPackageImpl theProfilesPackage = (ProfilesPackageImpl)(registeredPackage instanceof ProfilesPackageImpl ? registeredPackage : ProfilesPackage.eINSTANCE);

		// Load packages
		theValueSetsPackage.loadPackage();
		theResourcesPackage.loadPackage();

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();
		theProfilesPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();
		theProfilesPackage.initializePackageContents();

		// Fix loaded packages
		theValueSetsPackage.fixPackageContents();
		theResourcesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theValueSetsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValueSetsPackage.eNS_URI, theValueSetsPackage);
		return theValueSetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		if (dataTypeEEnum == null) {
			dataTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceType() {
		if (resourceTypeEEnum == null) {
			resourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentifierTypeCodes() {
		if (identifierTypeCodesEEnum == null) {
			identifierTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return identifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUsageContextType() {
		if (usageContextTypeEEnum == null) {
			usageContextTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return usageContextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextOfUseValueSet() {
		if (contextOfUseValueSetEEnum == null) {
			contextOfUseValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return contextOfUseValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJurisdictionValueSet() {
		if (jurisdictionValueSetEEnum == null) {
			jurisdictionValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return jurisdictionValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefinitionUseCodes() {
		if (definitionUseCodesEEnum == null) {
			definitionUseCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return definitionUseCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFhirDefinedType() {
		if (fhirDefinedTypeEEnum == null) {
			fhirDefinedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return fhirDefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLoincCodes() {
		if (loincCodesEEnum == null) {
			loincCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return loincCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommonLanguages() {
		if (commonLanguagesEEnum == null) {
			commonLanguagesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return commonLanguagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSignatureTypeCodes() {
		if (signatureTypeCodesEEnum == null) {
			signatureTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return signatureTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV2036027() {
		if (v2036027EEnum == null) {
			v2036027EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return v2036027EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimingAbbreviation() {
		if (timingAbbreviationEEnum == null) {
			timingAbbreviationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return timingAbbreviationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubjectType() {
		if (subjectTypeEEnum == null) {
			subjectTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return subjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDesignationUse() {
		if (designationUseEEnum == null) {
			designationUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return designationUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExpressionLanguage() {
		if (expressionLanguageEEnum == null) {
			expressionLanguageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return expressionLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctAdditionalDosageInstructions() {
		if (snomedctAdditionalDosageInstructionsEEnum == null) {
			snomedctAdditionalDosageInstructionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return snomedctAdditionalDosageInstructionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctMedicationAsNeededReasonCodes() {
		if (snomedctMedicationAsNeededReasonCodesEEnum == null) {
			snomedctMedicationAsNeededReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return snomedctMedicationAsNeededReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctAnatomicalStructureForAdministrationSiteCodes() {
		if (snomedctAnatomicalStructureForAdministrationSiteCodesEEnum == null) {
			snomedctAnatomicalStructureForAdministrationSiteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return snomedctAnatomicalStructureForAdministrationSiteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctRouteCodes() {
		if (snomedctRouteCodesEEnum == null) {
			snomedctRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return snomedctRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctAdministrationMethodCodes() {
		if (snomedctAdministrationMethodCodesEEnum == null) {
			snomedctAdministrationMethodCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return snomedctAdministrationMethodCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDoseAndRateType() {
		if (doseAndRateTypeEEnum == null) {
			doseAndRateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return doseAndRateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAllSecurityLabels() {
		if (allSecurityLabelsEEnum == null) {
			allSecurityLabelsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return allSecurityLabelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommonTags() {
		if (commonTagsEEnum == null) {
			commonTagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return commonTagsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrganizationType() {
		if (organizationTypeEEnum == null) {
			organizationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return organizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContactEntityType() {
		if (contactEntityTypeEEnum == null) {
			contactEntityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return contactEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEndpointConnectionType() {
		if (endpointConnectionTypeEEnum == null) {
			endpointConnectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return endpointConnectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEndpointPayloadType() {
		if (endpointPayloadTypeEEnum == null) {
			endpointPayloadTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return endpointPayloadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLibraryType() {
		if (libraryTypeEEnum == null) {
			libraryTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return libraryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefinitionTopic() {
		if (definitionTopicEEnum == null) {
			definitionTopicEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return definitionTopicEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasureScoring() {
		if (measureScoringEEnum == null) {
			measureScoringEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return measureScoringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompositeMeasureScoring() {
		if (compositeMeasureScoringEEnum == null) {
			compositeMeasureScoringEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return compositeMeasureScoringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasureType() {
		if (measureTypeEEnum == null) {
			measureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return measureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasurePopulationType() {
		if (measurePopulationTypeEEnum == null) {
			measurePopulationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return measurePopulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasureDataUsage() {
		if (measureDataUsageEEnum == null) {
			measureDataUsageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return measureDataUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMaritalStatusCodes() {
		if (maritalStatusCodesEEnum == null) {
			maritalStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return maritalStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPatientContactRelationship() {
		if (patientContactRelationshipEEnum == null) {
			patientContactRelationshipEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return patientContactRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleUseCodesForList() {
		if (exampleUseCodesForListEEnum == null) {
			exampleUseCodesForListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return exampleUseCodesForListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActEncounterCode() {
		if (v3ActEncounterCodeEEnum == null) {
			v3ActEncounterCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return v3ActEncounterCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncounterType() {
		if (encounterTypeEEnum == null) {
			encounterTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return encounterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceType() {
		if (serviceTypeEEnum == null) {
			serviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return serviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActPriority() {
		if (v3ActPriorityEEnum == null) {
			v3ActPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return v3ActPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEpisodeOfCareType() {
		if (episodeOfCareTypeEEnum == null) {
			episodeOfCareTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return episodeOfCareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionCategoryCodes() {
		if (conditionCategoryCodesEEnum == null) {
			conditionCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return conditionCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionDiagnosisSeverity() {
		if (conditionDiagnosisSeverityEEnum == null) {
			conditionDiagnosisSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return conditionDiagnosisSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionProblemDiagnosisCodes() {
		if (conditionProblemDiagnosisCodesEEnum == null) {
			conditionProblemDiagnosisCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return conditionProblemDiagnosisCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctBodyStructures() {
		if (snomedctBodyStructuresEEnum == null) {
			snomedctBodyStructuresEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return snomedctBodyStructuresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionStage() {
		if (conditionStageEEnum == null) {
			conditionStageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return conditionStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInvestigationType() {
		if (investigationTypeEEnum == null) {
			investigationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return investigationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlanDefinitionType() {
		if (planDefinitionTypeEEnum == null) {
			planDefinitionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return planDefinitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalCategory() {
		if (goalCategoryEEnum == null) {
			goalCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return goalCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctClinicalFindings() {
		if (snomedctClinicalFindingsEEnum == null) {
			snomedctClinicalFindingsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return snomedctClinicalFindingsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalPriority() {
		if (goalPriorityEEnum == null) {
			goalPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return goalPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalStartEvent() {
		if (goalStartEventEEnum == null) {
			goalStartEventEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return goalStartEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionParticipantRole() {
		if (actionParticipantRoleEEnum == null) {
			actionParticipantRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return actionParticipantRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		if (actionTypeEEnum == null) {
			actionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCarePlanCategory() {
		if (carePlanCategoryEEnum == null) {
			carePlanCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return carePlanCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCareTeamCategory() {
		if (careTeamCategoryEEnum == null) {
			careTeamCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return careTeamCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParticipantRoles() {
		if (participantRolesEEnum == null) {
			participantRolesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return participantRolesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGoalAchievementStatus() {
		if (goalAchievementStatusEEnum == null) {
			goalAchievementStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return goalAchievementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCarePlanActivityOutcome() {
		if (carePlanActivityOutcomeEEnum == null) {
			carePlanActivityOutcomeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return carePlanActivityOutcomeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAppointmentCancellationReason() {
		if (appointmentCancellationReasonEEnum == null) {
			appointmentCancellationReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return appointmentCancellationReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceCategory() {
		if (serviceCategoryEEnum == null) {
			serviceCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return serviceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPracticeSettingCodeValueSet() {
		if (practiceSettingCodeValueSetEEnum == null) {
			practiceSettingCodeValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return practiceSettingCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20276() {
		if (v20276EEnum == null) {
			v20276EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return v20276EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncounterReasonCodes() {
		if (encounterReasonCodesEEnum == null) {
			encounterReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return encounterReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureCodesSnomedcT() {
		if (procedureCodesSnomedcTEEnum == null) {
			procedureCodesSnomedcTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return procedureCodesSnomedcTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20116() {
		if (v20116EEnum == null) {
			v20116EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return v20116EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ServiceDeliveryLocationRoleType() {
		if (v3ServiceDeliveryLocationRoleTypeEEnum == null) {
			v3ServiceDeliveryLocationRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return v3ServiceDeliveryLocationRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocationType() {
		if (locationTypeEEnum == null) {
			locationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctMedicationCodes() {
		if (snomedctMedicationCodesEEnum == null) {
			snomedctMedicationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return snomedctMedicationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20487() {
		if (v20487EEnum == null) {
			v20487EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return v20487EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPreparePatient() {
		if (preparePatientEEnum == null) {
			preparePatientEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return preparePatientEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecimenCollection() {
		if (specimenCollectionEEnum == null) {
			specimenCollectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(73);
		}
		return specimenCollectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContainerMaterials() {
		if (containerMaterialsEEnum == null) {
			containerMaterialsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(74);
		}
		return containerMaterialsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecimenContainerType() {
		if (specimenContainerTypeEEnum == null) {
			specimenContainerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(75);
		}
		return specimenContainerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContainerCap() {
		if (containerCapEEnum == null) {
			containerCapEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(76);
		}
		return containerCapEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20371() {
		if (v20371EEnum == null) {
			v20371EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(77);
		}
		return v20371EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRejectionCriterion() {
		if (rejectionCriterionEEnum == null) {
			rejectionCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(78);
		}
		return rejectionCriterionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHandlingConditionSet() {
		if (handlingConditionSetEEnum == null) {
			handlingConditionSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(79);
		}
		return handlingConditionSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationCategoryCodes() {
		if (observationCategoryCodesEEnum == null) {
			observationCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(80);
		}
		return observationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationMethods() {
		if (observationMethodsEEnum == null) {
			observationMethodsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(81);
		}
		return observationMethodsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUcumCodes() {
		if (ucumCodesEEnum == null) {
			ucumCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(82);
		}
		return ucumCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationReferenceRangeMeaningCodes() {
		if (observationReferenceRangeMeaningCodesEEnum == null) {
			observationReferenceRangeMeaningCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(83);
		}
		return observationReferenceRangeMeaningCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationReferenceRangeAppliesToCodes() {
		if (observationReferenceRangeAppliesToCodesEEnum == null) {
			observationReferenceRangeAppliesToCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(84);
		}
		return observationReferenceRangeAppliesToCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceRequestCategoryCodes() {
		if (serviceRequestCategoryCodesEEnum == null) {
			serviceRequestCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(85);
		}
		return serviceRequestCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceRequestOrderDetailsCodes() {
		if (serviceRequestOrderDetailsCodesEEnum == null) {
			serviceRequestOrderDetailsCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(86);
		}
		return serviceRequestOrderDetailsCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureReasonCodes() {
		if (procedureReasonCodesEEnum == null) {
			procedureReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(87);
		}
		return procedureReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoverageTypeAndSelfPayCodes() {
		if (coverageTypeAndSelfPayCodesEEnum == null) {
			coverageTypeAndSelfPayCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(88);
		}
		return coverageTypeAndSelfPayCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubscriberRelationshipCodes() {
		if (subscriberRelationshipCodesEEnum == null) {
			subscriberRelationshipCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(89);
		}
		return subscriberRelationshipCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoverageClassCodes() {
		if (coverageClassCodesEEnum == null) {
			coverageClassCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(90);
		}
		return coverageClassCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoverageCopayTypeCodes() {
		if (coverageCopayTypeCodesEEnum == null) {
			coverageCopayTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(91);
		}
		return coverageCopayTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleCoverageFinancialExceptionCodes() {
		if (exampleCoverageFinancialExceptionCodesEEnum == null) {
			exampleCoverageFinancialExceptionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(92);
		}
		return exampleCoverageFinancialExceptionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceLegalStateCodes() {
		if (contractResourceLegalStateCodesEEnum == null) {
			contractResourceLegalStateCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(93);
		}
		return contractResourceLegalStateCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractContentDerivationCodes() {
		if (contractContentDerivationCodesEEnum == null) {
			contractContentDerivationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(94);
		}
		return contractContentDerivationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceExpirationTypeCodes() {
		if (contractResourceExpirationTypeCodesEEnum == null) {
			contractResourceExpirationTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(95);
		}
		return contractResourceExpirationTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceScopeCodes() {
		if (contractResourceScopeCodesEEnum == null) {
			contractResourceScopeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(96);
		}
		return contractResourceScopeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractTypeCodes() {
		if (contractTypeCodesEEnum == null) {
			contractTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(97);
		}
		return contractTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractSubtypeCodes() {
		if (contractSubtypeCodesEEnum == null) {
			contractSubtypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(98);
		}
		return contractSubtypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceDefinitionTypeCodes() {
		if (contractResourceDefinitionTypeCodesEEnum == null) {
			contractResourceDefinitionTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(99);
		}
		return contractResourceDefinitionTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceDefinitionSubtypeCodes() {
		if (contractResourceDefinitionSubtypeCodesEEnum == null) {
			contractResourceDefinitionSubtypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(100);
		}
		return contractResourceDefinitionSubtypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractTermTypeCodes() {
		if (contractTermTypeCodesEEnum == null) {
			contractTermTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(101);
		}
		return contractTermTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractTermSubtypeCodes() {
		if (contractTermSubtypeCodesEEnum == null) {
			contractTermSubtypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(102);
		}
		return contractTermSubtypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceScopeCodesA() {
		if (contractResourceScopeCodesAEEnum == null) {
			contractResourceScopeCodesAEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(103);
		}
		return contractResourceScopeCodesAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceScopeCodesB() {
		if (contractResourceScopeCodesBEEnum == null) {
			contractResourceScopeCodesBEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(104);
		}
		return contractResourceScopeCodesBEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceSecurityControlCodes() {
		if (contractResourceSecurityControlCodesEEnum == null) {
			contractResourceSecurityControlCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(105);
		}
		return contractResourceSecurityControlCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourcePartyRoleCodes() {
		if (contractResourcePartyRoleCodesEEnum == null) {
			contractResourcePartyRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(106);
		}
		return contractResourcePartyRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActConsentDirective() {
		if (v3ActConsentDirectiveEEnum == null) {
			v3ActConsentDirectiveEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(107);
		}
		return v3ActConsentDirectiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceDecisionModeCodes() {
		if (contractResourceDecisionModeCodesEEnum == null) {
			contractResourceDecisionModeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(108);
		}
		return contractResourceDecisionModeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceAssetScopeCodes() {
		if (contractResourceAssetScopeCodesEEnum == null) {
			contractResourceAssetScopeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(109);
		}
		return contractResourceAssetScopeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceAssetTypeCodes() {
		if (contractResourceAssetTypeCodesEEnum == null) {
			contractResourceAssetTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(110);
		}
		return contractResourceAssetTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceAssetSubTypeCodes() {
		if (contractResourceAssetSubTypeCodesEEnum == null) {
			contractResourceAssetSubTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(111);
		}
		return contractResourceAssetSubTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentContentClass() {
		if (consentContentClassEEnum == null) {
			consentContentClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(112);
		}
		return consentContentClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceAssetContextCodes() {
		if (contractResourceAssetContextCodesEEnum == null) {
			contractResourceAssetContextCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(113);
		}
		return contractResourceAssetContextCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceAssetAvailiabilityCodes() {
		if (contractResourceAssetAvailiabilityCodesEEnum == null) {
			contractResourceAssetAvailiabilityCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(114);
		}
		return contractResourceAssetAvailiabilityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractActionCodes() {
		if (contractActionCodesEEnum == null) {
			contractActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(115);
		}
		return contractActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractActorRoleCodes() {
		if (contractActorRoleCodesEEnum == null) {
			contractActorRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(116);
		}
		return contractActorRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3PurposeOfUse() {
		if (v3PurposeOfUseEEnum == null) {
			v3PurposeOfUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(117);
		}
		return v3PurposeOfUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractResourceActionStatusCodes() {
		if (contractResourceActionStatusCodesEEnum == null) {
			contractResourceActionStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(118);
		}
		return contractResourceActionStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProvenanceParticipantType() {
		if (provenanceParticipantTypeEEnum == null) {
			provenanceParticipantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(119);
		}
		return provenanceParticipantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProvenanceParticipantRole() {
		if (provenanceParticipantRoleEEnum == null) {
			provenanceParticipantRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(120);
		}
		return provenanceParticipantRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPatientRelationshipType() {
		if (patientRelationshipTypeEEnum == null) {
			patientRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(121);
		}
		return patientRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProvenanceActivityType() {
		if (provenanceActivityTypeEEnum == null) {
			provenanceActivityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(122);
		}
		return provenanceActivityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecurityRoleType() {
		if (securityRoleTypeEEnum == null) {
			securityRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(123);
		}
		return securityRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContractSignerTypeCodes() {
		if (contractSignerTypeCodesEEnum == null) {
			contractSignerTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(124);
		}
		return contractSignerTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFhirSpecimenCollectionMethod() {
		if (fhirSpecimenCollectionMethodEEnum == null) {
			fhirSpecimenCollectionMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(125);
		}
		return fhirSpecimenCollectionMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20916() {
		if (v20916EEnum == null) {
			v20916EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(126);
		}
		return v20916EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecimenProcessingProcedure() {
		if (specimenProcessingProcedureEEnum == null) {
			specimenProcessingProcedureEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(127);
		}
		return specimenProcessingProcedureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubstanceCategoryCodes() {
		if (substanceCategoryCodesEEnum == null) {
			substanceCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(128);
		}
		return substanceCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSubstanceCode() {
		if (substanceCodeEEnum == null) {
			substanceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(129);
		}
		return substanceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20493() {
		if (v20493EEnum == null) {
			v20493EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(130);
		}
		return v20493EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParticipantType() {
		if (participantTypeEEnum == null) {
			participantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(131);
		}
		return participantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctReasonMedicationNotGivenCodes() {
		if (snomedctReasonMedicationNotGivenCodesEEnum == null) {
			snomedctReasonMedicationNotGivenCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(132);
		}
		return snomedctReasonMedicationNotGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationAdministrationCategoryCodes() {
		if (medicationAdministrationCategoryCodesEEnum == null) {
			medicationAdministrationCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(133);
		}
		return medicationAdministrationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationAdministrationPerformerFunctionCodes() {
		if (medicationAdministrationPerformerFunctionCodesEEnum == null) {
			medicationAdministrationPerformerFunctionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(134);
		}
		return medicationAdministrationPerformerFunctionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReasonMedicationGivenCodes() {
		if (reasonMedicationGivenCodesEEnum == null) {
			reasonMedicationGivenCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(135);
		}
		return reasonMedicationGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationRequestStatusReasonCodes() {
		if (medicationRequestStatusReasonCodesEEnum == null) {
			medicationRequestStatusReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(136);
		}
		return medicationRequestStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationRequestCategoryCodes() {
		if (medicationRequestCategoryCodesEEnum == null) {
			medicationRequestCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(137);
		}
		return medicationRequestCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedurePerformerRoleCodes() {
		if (procedurePerformerRoleCodesEEnum == null) {
			procedurePerformerRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(138);
		}
		return procedurePerformerRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationRequestCourseOfTherapyCodes() {
		if (medicationRequestCourseOfTherapyCodesEEnum == null) {
			medicationRequestCourseOfTherapyCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(139);
		}
		return medicationRequestCourseOfTherapyCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActSubstanceAdminSubstitutionCode() {
		if (v3ActSubstanceAdminSubstitutionCodeEEnum == null) {
			v3ActSubstanceAdminSubstitutionCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(140);
		}
		return v3ActSubstanceAdminSubstitutionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3SubstanceAdminSubstitutionReason() {
		if (v3SubstanceAdminSubstitutionReasonEEnum == null) {
			v3SubstanceAdminSubstitutionReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(141);
		}
		return v3SubstanceAdminSubstitutionReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDetectedIssueCategory() {
		if (detectedIssueCategoryEEnum == null) {
			detectedIssueCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(142);
		}
		return detectedIssueCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getManifestationAndSymptomCodes() {
		if (manifestationAndSymptomCodesEEnum == null) {
			manifestationAndSymptomCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(143);
		}
		return manifestationAndSymptomCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDetectedIssueMitigationAction() {
		if (detectedIssueMitigationActionEEnum == null) {
			detectedIssueMitigationActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(144);
		}
		return detectedIssueMitigationActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFhirDeviceTypes() {
		if (fhirDeviceTypesEEnum == null) {
			fhirDeviceTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(145);
		}
		return fhirDeviceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceSafety() {
		if (deviceSafetyEEnum == null) {
			deviceSafetyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(146);
		}
		return deviceSafetyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFhirDeviceStatusReason() {
		if (fhirDeviceStatusReasonEEnum == null) {
			fhirDeviceStatusReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(147);
		}
		return fhirDeviceStatusReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceType() {
		if (deviceTypeEEnum == null) {
			deviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(148);
		}
		return deviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataAbsentReason() {
		if (dataAbsentReasonEEnum == null) {
			dataAbsentReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(149);
		}
		return dataAbsentReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObservationInterpretationCodes() {
		if (observationInterpretationCodesEEnum == null) {
			observationInterpretationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(150);
		}
		return observationInterpretationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentClassValueSet() {
		if (documentClassValueSetEEnum == null) {
			documentClassValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(151);
		}
		return documentClassValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentReferenceFormatCodeSet() {
		if (documentReferenceFormatCodeSetEEnum == null) {
			documentReferenceFormatCodeSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(152);
		}
		return documentReferenceFormatCodeSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActCode() {
		if (v3ActCodeEEnum == null) {
			v3ActCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(153);
		}
		return v3ActCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFacilityTypeCodeValueSet() {
		if (facilityTypeCodeValueSetEEnum == null) {
			facilityTypeCodeValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(154);
		}
		return facilityTypeCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClinicalImpressionPrognosis() {
		if (clinicalImpressionPrognosisEEnum == null) {
			clinicalImpressionPrognosisEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(155);
		}
		return clinicalImpressionPrognosisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskProbability() {
		if (riskProbabilityEEnum == null) {
			riskProbabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(156);
		}
		return riskProbabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionStageType() {
		if (conditionStageTypeEEnum == null) {
			conditionStageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(157);
		}
		return conditionStageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDiagnosisRole() {
		if (diagnosisRoleEEnum == null) {
			diagnosisRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(158);
		}
		return diagnosisRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccountTypes() {
		if (accountTypesEEnum == null) {
			accountTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(159);
		}
		return accountTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdmitSource() {
		if (admitSourceEEnum == null) {
			admitSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(160);
		}
		return admitSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV20092() {
		if (v20092EEnum == null) {
			v20092EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(161);
		}
		return v20092EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDiet() {
		if (dietEEnum == null) {
			dietEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(162);
		}
		return dietEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecialCourtesy() {
		if (specialCourtesyEEnum == null) {
			specialCourtesyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(163);
		}
		return specialCourtesyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpecialArrangements() {
		if (specialArrangementsEEnum == null) {
			specialArrangementsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(164);
		}
		return specialArrangementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDischargeDisposition() {
		if (dischargeDispositionEEnum == null) {
			dischargeDispositionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(165);
		}
		return dischargeDispositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getListOrderCodes() {
		if (listOrderCodesEEnum == null) {
			listOrderCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(166);
		}
		return listOrderCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPatientMedicineChangeTypes() {
		if (patientMedicineChangeTypesEEnum == null) {
			patientMedicineChangeTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(167);
		}
		return patientMedicineChangeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getListEmptyReasons() {
		if (listEmptyReasonsEEnum == null) {
			listEmptyReasonsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(168);
		}
		return listEmptyReasonsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResearchStudyPrimaryPurposeType() {
		if (researchStudyPrimaryPurposeTypeEEnum == null) {
			researchStudyPrimaryPurposeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(169);
		}
		return researchStudyPrimaryPurposeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResearchStudyPhase() {
		if (researchStudyPhaseEEnum == null) {
			researchStudyPhaseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(170);
		}
		return researchStudyPhaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResearchStudyReasonStopped() {
		if (researchStudyReasonStoppedEEnum == null) {
			researchStudyReasonStoppedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(171);
		}
		return researchStudyReasonStoppedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResearchStudyObjectiveType() {
		if (researchStudyObjectiveTypeEEnum == null) {
			researchStudyObjectiveTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(172);
		}
		return researchStudyObjectiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentScopeCodes() {
		if (consentScopeCodesEEnum == null) {
			consentScopeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(173);
		}
		return consentScopeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentCategoryCodes() {
		if (consentCategoryCodesEEnum == null) {
			consentCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(174);
		}
		return consentCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentPolicyRuleCodes() {
		if (consentPolicyRuleCodesEEnum == null) {
			consentPolicyRuleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(175);
		}
		return consentPolicyRuleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentActionCodes() {
		if (consentActionCodesEEnum == null) {
			consentActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(176);
		}
		return consentActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsentContentCodes() {
		if (consentContentCodesEEnum == null) {
			consentContentCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(177);
		}
		return consentContentCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChargeItemCode() {
		if (chargeItemCodeEEnum == null) {
			chargeItemCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(178);
		}
		return chargeItemCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctFormCodes() {
		if (snomedctFormCodesEEnum == null) {
			snomedctFormCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(179);
		}
		return snomedctFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIcD10Codes() {
		if (icD10CodesEEnum == null) {
			icD10CodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(180);
		}
		return icD10CodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDiagnosticServiceSectionCodes() {
		if (diagnosticServiceSectionCodesEEnum == null) {
			diagnosticServiceSectionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(181);
		}
		return diagnosticServiceSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLoincDiagnosticReportCodes() {
		if (loincDiagnosticReportCodesEEnum == null) {
			loincDiagnosticReportCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(182);
		}
		return loincDiagnosticReportCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAcquisitionModality() {
		if (acquisitionModalityEEnum == null) {
			acquisitionModalityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(183);
		}
		return acquisitionModalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureNotPerformedReasonSnomeDCT() {
		if (procedureNotPerformedReasonSnomeDCTEEnum == null) {
			procedureNotPerformedReasonSnomeDCTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(184);
		}
		return procedureNotPerformedReasonSnomeDCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureCategoryCodesSnomedcT() {
		if (procedureCategoryCodesSnomedcTEEnum == null) {
			procedureCategoryCodesSnomedcTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(185);
		}
		return procedureCategoryCodesSnomedcTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureOutcomeCodesSnomedcT() {
		if (procedureOutcomeCodesSnomedcTEEnum == null) {
			procedureOutcomeCodesSnomedcTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(186);
		}
		return procedureOutcomeCodesSnomedcTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureFollowUpCodesSnomedcT() {
		if (procedureFollowUpCodesSnomedcTEEnum == null) {
			procedureFollowUpCodesSnomedcTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(187);
		}
		return procedureFollowUpCodesSnomedcTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcedureDeviceActionCodes() {
		if (procedureDeviceActionCodesEEnum == null) {
			procedureDeviceActionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(188);
		}
		return procedureDeviceActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLaterality() {
		if (lateralityEEnum == null) {
			lateralityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(189);
		}
		return lateralityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImagingStudySeriesPerformerFunction() {
		if (imagingStudySeriesPerformerFunctionEEnum == null) {
			imagingStudySeriesPerformerFunctionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(190);
		}
		return imagingStudySeriesPerformerFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaType() {
		if (mediaTypeEEnum == null) {
			mediaTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(191);
		}
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaModality() {
		if (mediaModalityEEnum == null) {
			mediaModalityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(192);
		}
		return mediaModalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaCollectionViewProjection() {
		if (mediaCollectionViewProjectionEEnum == null) {
			mediaCollectionViewProjectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(193);
		}
		return mediaCollectionViewProjectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommunicationNotDoneReason() {
		if (communicationNotDoneReasonEEnum == null) {
			communicationNotDoneReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(194);
		}
		return communicationNotDoneReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommunicationCategory() {
		if (communicationCategoryEEnum == null) {
			communicationCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(195);
		}
		return communicationCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ParticipationMode() {
		if (v3ParticipationModeEEnum == null) {
			v3ParticipationModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(196);
		}
		return v3ParticipationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommunicationTopic() {
		if (communicationTopicEEnum == null) {
			communicationTopicEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(197);
		}
		return communicationTopicEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClaimTypeCodes() {
		if (claimTypeCodesEEnum == null) {
			claimTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(198);
		}
		return claimTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleClaimSubTypeCodes() {
		if (exampleClaimSubTypeCodesEEnum == null) {
			exampleClaimSubTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(199);
		}
		return exampleClaimSubTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessPriorityCodes() {
		if (processPriorityCodesEEnum == null) {
			processPriorityCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(200);
		}
		return processPriorityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFundsReservationCodes() {
		if (fundsReservationCodesEEnum == null) {
			fundsReservationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(201);
		}
		return fundsReservationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleRelatedClaimRelationshipCodes() {
		if (exampleRelatedClaimRelationshipCodesEEnum == null) {
			exampleRelatedClaimRelationshipCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(202);
		}
		return exampleRelatedClaimRelationshipCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClaimPayeeTypeCodes() {
		if (claimPayeeTypeCodesEEnum == null) {
			claimPayeeTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(203);
		}
		return claimPayeeTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClaimCareTeamRoleCodes() {
		if (claimCareTeamRoleCodesEEnum == null) {
			claimCareTeamRoleCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(204);
		}
		return claimCareTeamRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleProviderQualificationCodes() {
		if (exampleProviderQualificationCodesEEnum == null) {
			exampleProviderQualificationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(205);
		}
		return exampleProviderQualificationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClaimInformationCategoryCodes() {
		if (claimInformationCategoryCodesEEnum == null) {
			claimInformationCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(206);
		}
		return claimInformationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExceptionCodes() {
		if (exceptionCodesEEnum == null) {
			exceptionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(207);
		}
		return exceptionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMissingToothReasonCodes() {
		if (missingToothReasonCodesEEnum == null) {
			missingToothReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(208);
		}
		return missingToothReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleDiagnosisTypeCodes() {
		if (exampleDiagnosisTypeCodesEEnum == null) {
			exampleDiagnosisTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(209);
		}
		return exampleDiagnosisTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleDiagnosisOnAdmissionCodes() {
		if (exampleDiagnosisOnAdmissionCodesEEnum == null) {
			exampleDiagnosisOnAdmissionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(210);
		}
		return exampleDiagnosisOnAdmissionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleDiagnosisRelatedGroupCodes() {
		if (exampleDiagnosisRelatedGroupCodesEEnum == null) {
			exampleDiagnosisRelatedGroupCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(211);
		}
		return exampleDiagnosisRelatedGroupCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleProcedureTypeCodes() {
		if (exampleProcedureTypeCodesEEnum == null) {
			exampleProcedureTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(212);
		}
		return exampleProcedureTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIcD10ProcedureCodes() {
		if (icD10ProcedureCodesEEnum == null) {
			icD10ProcedureCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(213);
		}
		return icD10ProcedureCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActIncidentCode() {
		if (v3ActIncidentCodeEEnum == null) {
			v3ActIncidentCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(214);
		}
		return v3ActIncidentCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleRevenueCenterCodes() {
		if (exampleRevenueCenterCodesEEnum == null) {
			exampleRevenueCenterCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(215);
		}
		return exampleRevenueCenterCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBenefitCategoryCodes() {
		if (benefitCategoryCodesEEnum == null) {
			benefitCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(216);
		}
		return benefitCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUsclsCodes() {
		if (usclsCodesEEnum == null) {
			usclsCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(217);
		}
		return usclsCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModifierTypeCodes() {
		if (modifierTypeCodesEEnum == null) {
			modifierTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(218);
		}
		return modifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleProgramReasonCodes() {
		if (exampleProgramReasonCodesEEnum == null) {
			exampleProgramReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(219);
		}
		return exampleProgramReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleServicePlaceCodes() {
		if (exampleServicePlaceCodesEEnum == null) {
			exampleServicePlaceCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(220);
		}
		return exampleServicePlaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOralSiteCodes() {
		if (oralSiteCodesEEnum == null) {
			oralSiteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(221);
		}
		return oralSiteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSurfaceCodes() {
		if (surfaceCodesEEnum == null) {
			surfaceCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(222);
		}
		return surfaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdjudicationValueCodes() {
		if (adjudicationValueCodesEEnum == null) {
			adjudicationValueCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(223);
		}
		return adjudicationValueCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdjudicationReasonCodes() {
		if (adjudicationReasonCodesEEnum == null) {
			adjudicationReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(224);
		}
		return adjudicationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExamplePaymentTypeCodes() {
		if (examplePaymentTypeCodesEEnum == null) {
			examplePaymentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(225);
		}
		return examplePaymentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentAdjustmentReasonCodes() {
		if (paymentAdjustmentReasonCodesEEnum == null) {
			paymentAdjustmentReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(226);
		}
		return paymentAdjustmentReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormCodes() {
		if (formCodesEEnum == null) {
			formCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(227);
		}
		return formCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActReason() {
		if (v3ActReasonEEnum == null) {
			v3ActReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(228);
		}
		return v3ActReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdjudicationErrorCodes() {
		if (adjudicationErrorCodesEEnum == null) {
			adjudicationErrorCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(229);
		}
		return adjudicationErrorCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceProvisionConditions() {
		if (serviceProvisionConditionsEEnum == null) {
			serviceProvisionConditionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(230);
		}
		return serviceProvisionConditionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgram() {
		if (programEEnum == null) {
			programEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(231);
		}
		return programEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferralMethod() {
		if (referralMethodEEnum == null) {
			referralMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(232);
		}
		return referralMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctMorphologicAbnormalities() {
		if (snomedctMorphologicAbnormalitiesEEnum == null) {
			snomedctMorphologicAbnormalitiesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(233);
		}
		return snomedctMorphologicAbnormalitiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBodystructureLocationQualifier() {
		if (bodystructureLocationQualifierEEnum == null) {
			bodystructureLocationQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(234);
		}
		return bodystructureLocationQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTaskCode() {
		if (taskCodeEEnum == null) {
			taskCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(235);
		}
		return taskCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuestionnaireQuestionCodes() {
		if (questionnaireQuestionCodesEEnum == null) {
			questionnaireQuestionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(236);
		}
		return questionnaireQuestionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuestionnaireAnswerCodes() {
		if (questionnaireAnswerCodesEEnum == null) {
			questionnaireAnswerCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(237);
		}
		return questionnaireAnswerCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNetworkTypeCodes() {
		if (networkTypeCodesEEnum == null) {
			networkTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(238);
		}
		return networkTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitTypeCodes() {
		if (unitTypeCodesEEnum == null) {
			unitTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(239);
		}
		return unitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBenefitTermCodes() {
		if (benefitTermCodesEEnum == null) {
			benefitTermCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(240);
		}
		return benefitTermCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBenefitTypeCodes() {
		if (benefitTypeCodesEEnum == null) {
			benefitTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(241);
		}
		return benefitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVitalSigns() {
		if (vitalSignsEEnum == null) {
			vitalSignsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(242);
		}
		return vitalSignsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeviceMetricAndComponentTypes() {
		if (deviceMetricAndComponentTypesEEnum == null) {
			deviceMetricAndComponentTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(243);
		}
		return deviceMetricAndComponentTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlagCategory() {
		if (flagCategoryEEnum == null) {
			flagCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(244);
		}
		return flagCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlagCode() {
		if (flagCodeEEnum == null) {
			flagCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(245);
		}
		return flagCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationEvaluationTargetDiseaseCodes() {
		if (immunizationEvaluationTargetDiseaseCodesEEnum == null) {
			immunizationEvaluationTargetDiseaseCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(246);
		}
		return immunizationEvaluationTargetDiseaseCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationStatusReasonCodes() {
		if (immunizationStatusReasonCodesEEnum == null) {
			immunizationStatusReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(247);
		}
		return immunizationStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVaccineAdministeredValueSet() {
		if (vaccineAdministeredValueSetEEnum == null) {
			vaccineAdministeredValueSetEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(248);
		}
		return vaccineAdministeredValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationOriginCodes() {
		if (immunizationOriginCodesEEnum == null) {
			immunizationOriginCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(249);
		}
		return immunizationOriginCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCodesForImmunizationSiteOfAdministration() {
		if (codesForImmunizationSiteOfAdministrationEEnum == null) {
			codesForImmunizationSiteOfAdministrationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(250);
		}
		return codesForImmunizationSiteOfAdministrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationRouteCodes() {
		if (immunizationRouteCodesEEnum == null) {
			immunizationRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(251);
		}
		return immunizationRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationFunctionCodes() {
		if (immunizationFunctionCodesEEnum == null) {
			immunizationFunctionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(252);
		}
		return immunizationFunctionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationReasonCodes() {
		if (immunizationReasonCodesEEnum == null) {
			immunizationReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(253);
		}
		return immunizationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationSubpotentReason() {
		if (immunizationSubpotentReasonEEnum == null) {
			immunizationSubpotentReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(254);
		}
		return immunizationSubpotentReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationProgramEligibility() {
		if (immunizationProgramEligibilityEEnum == null) {
			immunizationProgramEligibilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(255);
		}
		return immunizationProgramEligibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationFundingSource() {
		if (immunizationFundingSourceEEnum == null) {
			immunizationFundingSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(256);
		}
		return immunizationFundingSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationTargetDiseaseCodes() {
		if (immunizationTargetDiseaseCodesEEnum == null) {
			immunizationTargetDiseaseCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(257);
		}
		return immunizationTargetDiseaseCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationEvaluationDoseStatusCodes() {
		if (immunizationEvaluationDoseStatusCodesEEnum == null) {
			immunizationEvaluationDoseStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(258);
		}
		return immunizationEvaluationDoseStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationEvaluationDoseStatusReasonCodes() {
		if (immunizationEvaluationDoseStatusReasonCodesEEnum == null) {
			immunizationEvaluationDoseStatusReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(259);
		}
		return immunizationEvaluationDoseStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationOutcomeCodes() {
		if (operationOutcomeCodesEEnum == null) {
			operationOutcomeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(260);
		}
		return operationOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentTypeCodes() {
		if (paymentTypeCodesEEnum == null) {
			paymentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(261);
		}
		return paymentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPractitionerRole() {
		if (practitionerRoleEEnum == null) {
			practitionerRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(262);
		}
		return practitionerRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFamilyHistoryAbsentReason() {
		if (familyHistoryAbsentReasonEEnum == null) {
			familyHistoryAbsentReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(263);
		}
		return familyHistoryAbsentReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3FamilyMember() {
		if (v3FamilyMemberEEnum == null) {
			v3FamilyMemberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(264);
		}
		return v3FamilyMemberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionOutcomeCodes() {
		if (conditionOutcomeCodesEEnum == null) {
			conditionOutcomeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(265);
		}
		return conditionOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrganizationAffiliationRole() {
		if (organizationAffiliationRoleEEnum == null) {
			organizationAffiliationRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(266);
		}
		return organizationAffiliationRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdverseEventCategory() {
		if (adverseEventCategoryEEnum == null) {
			adverseEventCategoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(267);
		}
		return adverseEventCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctClinicalFindingsA() {
		if (snomedctClinicalFindingsAEEnum == null) {
			snomedctClinicalFindingsAEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(268);
		}
		return snomedctClinicalFindingsAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdverseEventSeriousness() {
		if (adverseEventSeriousnessEEnum == null) {
			adverseEventSeriousnessEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(269);
		}
		return adverseEventSeriousnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdverseEventCausalityAssessment() {
		if (adverseEventCausalityAssessmentEEnum == null) {
			adverseEventCausalityAssessmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(270);
		}
		return adverseEventCausalityAssessmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdverseEventCausalityMethod() {
		if (adverseEventCausalityMethodEEnum == null) {
			adverseEventCausalityMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(271);
		}
		return adverseEventCausalityMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSynthesisType() {
		if (synthesisTypeEEnum == null) {
			synthesisTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(272);
		}
		return synthesisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStudyType() {
		if (studyTypeEEnum == null) {
			studyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(273);
		}
		return studyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskEstimateType() {
		if (riskEstimateTypeEEnum == null) {
			riskEstimateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(274);
		}
		return riskEstimateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrecisionEstimateType() {
		if (precisionEstimateTypeEEnum == null) {
			precisionEstimateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(275);
		}
		return precisionEstimateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQualityOfEvidenceRating() {
		if (qualityOfEvidenceRatingEEnum == null) {
			qualityOfEvidenceRatingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(276);
		}
		return qualityOfEvidenceRatingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCertaintySubcomponentType() {
		if (certaintySubcomponentTypeEEnum == null) {
			certaintySubcomponentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(277);
		}
		return certaintySubcomponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCertaintySubcomponentRating() {
		if (certaintySubcomponentRatingEEnum == null) {
			certaintySubcomponentRatingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(278);
		}
		return certaintySubcomponentRatingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTestScriptProfileOriginType() {
		if (testScriptProfileOriginTypeEEnum == null) {
			testScriptProfileOriginTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(279);
		}
		return testScriptProfileOriginTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTestScriptProfileDestinationType() {
		if (testScriptProfileDestinationTypeEEnum == null) {
			testScriptProfileDestinationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(280);
		}
		return testScriptProfileDestinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRestfulSecurityService() {
		if (restfulSecurityServiceEEnum == null) {
			restfulSecurityServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(281);
		}
		return restfulSecurityServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageTransport() {
		if (messageTransportEEnum == null) {
			messageTransportEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(282);
		}
		return messageTransportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageEvent() {
		if (messageEventEEnum == null) {
			messageEventEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(283);
		}
		return messageEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTestScriptOperationCode() {
		if (testScriptOperationCodeEEnum == null) {
			testScriptOperationCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(284);
		}
		return testScriptOperationCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleMessageReasonCodes() {
		if (exampleMessageReasonCodesEEnum == null) {
			exampleMessageReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(285);
		}
		return exampleMessageReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentStatusCodes() {
		if (paymentStatusCodesEEnum == null) {
			paymentStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(286);
		}
		return paymentStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFhirDocumentTypeCodes() {
		if (fhirDocumentTypeCodesEEnum == null) {
			fhirDocumentTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(287);
		}
		return fhirDocumentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentSectionCodes() {
		if (documentSectionCodesEEnum == null) {
			documentSectionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(288);
		}
		return documentSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSupplyType() {
		if (supplyTypeEEnum == null) {
			supplyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(289);
		}
		return supplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctSupplyItem() {
		if (snomedctSupplyItemEEnum == null) {
			snomedctSupplyItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(290);
		}
		return snomedctSupplyItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSupplyRequestReason() {
		if (supplyRequestReasonEEnum == null) {
			supplyRequestReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(291);
		}
		return supplyRequestReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvidenceVariantState() {
		if (evidenceVariantStateEEnum == null) {
			evidenceVariantStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(292);
		}
		return evidenceVariantStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEffectEstimateType() {
		if (effectEstimateTypeEEnum == null) {
			effectEstimateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(293);
		}
		return effectEstimateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInsurancePlanType() {
		if (insurancePlanTypeEEnum == null) {
			insurancePlanTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(294);
		}
		return insurancePlanTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProvenanceHistoryRecordActivityCodes() {
		if (provenanceHistoryRecordActivityCodesEEnum == null) {
			provenanceHistoryRecordActivityCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(295);
		}
		return provenanceHistoryRecordActivityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChromosomehuman() {
		if (chromosomehumanEEnum == null) {
			chromosomehumanEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(296);
		}
		return chromosomehumanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnsembl() {
		if (ensemblEEnum == null) {
			ensemblEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(297);
		}
		return ensemblEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFdAStandardSequence() {
		if (fdAStandardSequenceEEnum == null) {
			fdAStandardSequenceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(298);
		}
		return fdAStandardSequenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFdAMethod() {
		if (fdAMethodEEnum == null) {
			fdAMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(299);
		}
		return fdAMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAllergyIntoleranceSubstanceProductConditionAndNegationCodes() {
		if (allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum == null) {
			allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(300);
		}
		return allergyIntoleranceSubstanceProductConditionAndNegationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCatalogType() {
		if (catalogTypeEEnum == null) {
			catalogTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(301);
		}
		return catalogTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationRecommendationTargetDiseaseCodes() {
		if (immunizationRecommendationTargetDiseaseCodesEEnum == null) {
			immunizationRecommendationTargetDiseaseCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(302);
		}
		return immunizationRecommendationTargetDiseaseCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationRecommendationStatusCodes() {
		if (immunizationRecommendationStatusCodesEEnum == null) {
			immunizationRecommendationStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(303);
		}
		return immunizationRecommendationStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationRecommendationReasonCodes() {
		if (immunizationRecommendationReasonCodesEEnum == null) {
			immunizationRecommendationReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(304);
		}
		return immunizationRecommendationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmunizationRecommendationDateCriterionCodes() {
		if (immunizationRecommendationDateCriterionCodesEEnum == null) {
			immunizationRecommendationDateCriterionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(305);
		}
		return immunizationRecommendationDateCriterionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeed() {
		if (needEEnum == null) {
			needEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(306);
		}
		return needEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationtype() {
		if (validationtypeEEnum == null) {
			validationtypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(307);
		}
		return validationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationprocess() {
		if (validationprocessEEnum == null) {
			validationprocessEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(308);
		}
		return validationprocessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFailureaction() {
		if (failureactionEEnum == null) {
			failureactionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(309);
		}
		return failureactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimarysourcetype() {
		if (primarysourcetypeEEnum == null) {
			primarysourcetypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(310);
		}
		return primarysourcetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerificationresultcommunicationmethod() {
		if (verificationresultcommunicationmethodEEnum == null) {
			verificationresultcommunicationmethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(311);
		}
		return verificationresultcommunicationmethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationstatus() {
		if (validationstatusEEnum == null) {
			validationstatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(312);
		}
		return validationstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCanpushupdates() {
		if (canpushupdatesEEnum == null) {
			canpushupdatesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(313);
		}
		return canpushupdatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPushtypeavailable() {
		if (pushtypeavailableEEnum == null) {
			pushtypeavailableEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(314);
		}
		return pushtypeavailableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFoodTypeCodes() {
		if (foodTypeCodesEEnum == null) {
			foodTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(315);
		}
		return foodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDietCodes() {
		if (dietCodesEEnum == null) {
			dietCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(316);
		}
		return dietCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNutrientModifierCodes() {
		if (nutrientModifierCodesEEnum == null) {
			nutrientModifierCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(317);
		}
		return nutrientModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextureModifierCodes() {
		if (textureModifierCodesEEnum == null) {
			textureModifierCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(318);
		}
		return textureModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextureModifiedFoodTypeCodes() {
		if (textureModifiedFoodTypeCodesEEnum == null) {
			textureModifiedFoodTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(319);
		}
		return textureModifiedFoodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFluidConsistencyTypeCodes() {
		if (fluidConsistencyTypeCodesEEnum == null) {
			fluidConsistencyTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(320);
		}
		return fluidConsistencyTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSupplementTypeCodes() {
		if (supplementTypeCodesEEnum == null) {
			supplementTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(321);
		}
		return supplementTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnteralFormulaTypeCodes() {
		if (enteralFormulaTypeCodesEEnum == null) {
			enteralFormulaTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(322);
		}
		return enteralFormulaTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnteralFormulaAdditiveTypeCode() {
		if (enteralFormulaAdditiveTypeCodeEEnum == null) {
			enteralFormulaAdditiveTypeCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(323);
		}
		return enteralFormulaAdditiveTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnteralRouteCodes() {
		if (enteralRouteCodesEEnum == null) {
			enteralRouteCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(324);
		}
		return enteralRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSnomedctDrugTherapyStatusCodes() {
		if (snomedctDrugTherapyStatusCodesEEnum == null) {
			snomedctDrugTherapyStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(325);
		}
		return snomedctDrugTherapyStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationStatusCodes() {
		if (medicationStatusCodesEEnum == null) {
			medicationStatusCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(326);
		}
		return medicationStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuditEventId() {
		if (auditEventIdEEnum == null) {
			auditEventIdEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(327);
		}
		return auditEventIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuditEventSubType() {
		if (auditEventSubTypeEEnum == null) {
			auditEventSubTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(328);
		}
		return auditEventSubTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParticipationRoleType() {
		if (participationRoleTypeEEnum == null) {
			participationRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(329);
		}
		return participationRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediaTypeCode() {
		if (mediaTypeCodeEEnum == null) {
			mediaTypeCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(330);
		}
		return mediaTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuditEventSourceType() {
		if (auditEventSourceTypeEEnum == null) {
			auditEventSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(331);
		}
		return auditEventSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuditEventEntityType() {
		if (auditEventEntityTypeEEnum == null) {
			auditEventEntityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(332);
		}
		return auditEventEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuditEventEntityRole() {
		if (auditEventEntityRoleEEnum == null) {
			auditEventEntityRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(333);
		}
		return auditEventEntityRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObjectLifecycleEvents() {
		if (objectLifecycleEventsEEnum == null) {
			objectLifecycleEventsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(334);
		}
		return objectLifecycleEventsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBasicResourceTypes() {
		if (basicResourceTypesEEnum == null) {
			basicResourceTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(335);
		}
		return basicResourceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExampleVisionPrescriptionProductCodes() {
		if (exampleVisionPrescriptionProductCodesEEnum == null) {
			exampleVisionPrescriptionProductCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(336);
		}
		return exampleVisionPrescriptionProductCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationDispenseStatusReasonCodes() {
		if (medicationDispenseStatusReasonCodesEEnum == null) {
			medicationDispenseStatusReasonCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(337);
		}
		return medicationDispenseStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationDispenseCategoryCodes() {
		if (medicationDispenseCategoryCodesEEnum == null) {
			medicationDispenseCategoryCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(338);
		}
		return medicationDispenseCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationDispensePerformerFunctionCodes() {
		if (medicationDispensePerformerFunctionCodesEEnum == null) {
			medicationDispensePerformerFunctionCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(339);
		}
		return medicationDispensePerformerFunctionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getV3ActPharmacySupplyType() {
		if (v3ActPharmacySupplyTypeEEnum == null) {
			v3ActPharmacySupplyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(340);
		}
		return v3ActPharmacySupplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationKnowledgePackageTypeCodes() {
		if (medicationKnowledgePackageTypeCodesEEnum == null) {
			medicationKnowledgePackageTypeCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(341);
		}
		return medicationKnowledgePackageTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMedicationKnowledgeCharacteristicCodes() {
		if (medicationKnowledgeCharacteristicCodesEEnum == null) {
			medicationKnowledgeCharacteristicCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(342);
		}
		return medicationKnowledgeCharacteristicCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoverageEligibilityResponseAuthSupportCodes() {
		if (coverageEligibilityResponseAuthSupportCodesEEnum == null) {
			coverageEligibilityResponseAuthSupportCodesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI).getEClassifiers().get(343);
		}
		return coverageEligibilityResponseAuthSupportCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetsFactory getValueSetsFactory() {
		return (ValueSetsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.mdht.hl7.fhir.valueSets." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ValueSetsPackageImpl
