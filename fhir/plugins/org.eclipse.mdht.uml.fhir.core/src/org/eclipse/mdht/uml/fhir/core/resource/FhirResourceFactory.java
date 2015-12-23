/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage
 * @generated
 */
public interface FhirResourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirResourceFactory eINSTANCE = org.eclipse.mdht.uml.fhir.core.resource.impl.FhirResourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner</em>'.
	 * @generated
	 */
	Practitioner createPractitioner();

	/**
	 * Returns a new object of class '<em>Practitioner Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Practitioner Role</em>'.
	 * @generated
	 */
	PractitionerPractitionerRole createPractitionerPractitionerRole();

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
	 * Returns a new object of class '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service</em>'.
	 * @generated
	 */
	HealthcareService createHealthcareService();

	/**
	 * Returns a new object of class '<em>Healthcare Service Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Service Type</em>'.
	 * @generated
	 */
	HealthcareServiceServiceType createHealthcareServiceServiceType();

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
	 * Returns a new object of class '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Qualification</em>'.
	 * @generated
	 */
	PractitionerQualification createPractitionerQualification();

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
	 * Returns a new object of class '<em>Patient Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Animal</em>'.
	 * @generated
	 */
	PatientAnimal createPatientAnimal();

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
	 * Returns a new object of class '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Person</em>'.
	 * @generated
	 */
	RelatedPerson createRelatedPerson();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

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
	 * Returns a new object of class '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Participant</em>'.
	 * @generated
	 */
	AppointmentParticipant createAppointmentParticipant();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Referral Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Request</em>'.
	 * @generated
	 */
	ReferralRequest createReferralRequest();

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
	 * Returns a new object of class '<em>Episode Of Care Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care Care Team</em>'.
	 * @generated
	 */
	EpisodeOfCareCareTeam createEpisodeOfCareCareTeam();

	/**
	 * Returns a new object of class '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Participant</em>'.
	 * @generated
	 */
	EncounterParticipant createEncounterParticipant();

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
	 * Returns a new object of class '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression</em>'.
	 * @generated
	 */
	ClinicalImpression createClinicalImpression();

	/**
	 * Returns a new object of class '<em>Clinical Impression Investigations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Investigations</em>'.
	 * @generated
	 */
	ClinicalImpressionInvestigations createClinicalImpressionInvestigations();

	/**
	 * Returns a new object of class '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Finding</em>'.
	 * @generated
	 */
	ClinicalImpressionFinding createClinicalImpressionFinding();

	/**
	 * Returns a new object of class '<em>Clinical Impression Ruled Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Ruled Out</em>'.
	 * @generated
	 */
	ClinicalImpressionRuledOut createClinicalImpressionRuledOut();

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
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

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
	 * Returns a new object of class '<em>Specimen Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Treatment</em>'.
	 * @generated
	 */
	SpecimenTreatment createSpecimenTreatment();

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
	 * Returns a new object of class '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Container</em>'.
	 * @generated
	 */
	SpecimenContainer createSpecimenContainer();

	/**
	 * Returns a new object of class '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Reference Range</em>'.
	 * @generated
	 */
	ObservationReferenceRange createObservationReferenceRange();

	/**
	 * Returns a new object of class '<em>Observation Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Related</em>'.
	 * @generated
	 */
	ObservationRelated createObservationRelated();

	/**
	 * Returns a new object of class '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Component</em>'.
	 * @generated
	 */
	ObservationComponent createObservationComponent();

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
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Product</em>'.
	 * @generated
	 */
	MedicationProduct createMedicationProduct();

	/**
	 * Returns a new object of class '<em>Medication Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Product Ingredient</em>'.
	 * @generated
	 */
	MedicationProductIngredient createMedicationProductIngredient();

	/**
	 * Returns a new object of class '<em>Medication Product Batch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Product Batch</em>'.
	 * @generated
	 */
	MedicationProductBatch createMedicationProductBatch();

	/**
	 * Returns a new object of class '<em>Medication Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Package</em>'.
	 * @generated
	 */
	MedicationPackage createMedicationPackage();

	/**
	 * Returns a new object of class '<em>Medication Package Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Package Content</em>'.
	 * @generated
	 */
	MedicationPackageContent createMedicationPackageContent();

	/**
	 * Returns a new object of class '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric</em>'.
	 * @generated
	 */
	DeviceMetric createDeviceMetric();

	/**
	 * Returns a new object of class '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Component</em>'.
	 * @generated
	 */
	DeviceComponent createDeviceComponent();

	/**
	 * Returns a new object of class '<em>Device Component Production Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Component Production Specification</em>'.
	 * @generated
	 */
	DeviceComponentProductionSpecification createDeviceComponentProductionSpecification();

	/**
	 * Returns a new object of class '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Calibration</em>'.
	 * @generated
	 */
	DeviceMetricCalibration createDeviceMetricCalibration();

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
	 * Returns a new object of class '<em>Questionnaire Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Group</em>'.
	 * @generated
	 */
	QuestionnaireGroup createQuestionnaireGroup();

	/**
	 * Returns a new object of class '<em>Questionnaire Group Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Group Question</em>'.
	 * @generated
	 */
	QuestionnaireGroupQuestion createQuestionnaireGroupQuestion();

	/**
	 * Returns a new object of class '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set</em>'.
	 * @generated
	 */
	ValueSet createValueSet();

	/**
	 * Returns a new object of class '<em>Value Set Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Contact</em>'.
	 * @generated
	 */
	ValueSetContact createValueSetContact();

	/**
	 * Returns a new object of class '<em>Value Set Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Code System</em>'.
	 * @generated
	 */
	ValueSetCodeSystem createValueSetCodeSystem();

	/**
	 * Returns a new object of class '<em>Value Set Code System Concept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Code System Concept Definition</em>'.
	 * @generated
	 */
	ValueSetCodeSystemConceptDefinition createValueSetCodeSystemConceptDefinition();

	/**
	 * Returns a new object of class '<em>Value Set Code System Concept Definition Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Code System Concept Definition Designation</em>'.
	 * @generated
	 */
	ValueSetCodeSystemConceptDefinitionDesignation createValueSetCodeSystemConceptDefinitionDesignation();

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
	 * Returns a new object of class '<em>Questionnaire Response Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Group</em>'.
	 * @generated
	 */
	QuestionnaireResponseGroup createQuestionnaireResponseGroup();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Group Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Group Question</em>'.
	 * @generated
	 */
	QuestionnaireResponseGroupQuestion createQuestionnaireResponseGroupQuestion();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Group Question Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Group Question Answer</em>'.
	 * @generated
	 */
	QuestionnaireResponseGroupQuestionAnswer createQuestionnaireResponseGroupQuestionAnswer();

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
	 * Returns a new object of class '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report</em>'.
	 * @generated
	 */
	DiagnosticReport createDiagnosticReport();

	/**
	 * Returns a new object of class '<em>Diagnostic Report Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report Image</em>'.
	 * @generated
	 */
	DiagnosticReportImage createDiagnosticReportImage();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Diagnostic Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order</em>'.
	 * @generated
	 */
	DiagnosticOrder createDiagnosticOrder();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Event</em>'.
	 * @generated
	 */
	DiagnosticOrderEvent createDiagnosticOrderEvent();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Item</em>'.
	 * @generated
	 */
	DiagnosticOrderItem createDiagnosticOrderItem();

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
	 * Returns a new object of class '<em>Document Reference Context Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Context Related</em>'.
	 * @generated
	 */
	DocumentReferenceContextRelated createDocumentReferenceContextRelated();

	/**
	 * Returns a new object of class '<em>Procedure Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Request</em>'.
	 * @generated
	 */
	ProcedureRequest createProcedureRequest();

	/**
	 * Returns a new object of class '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study</em>'.
	 * @generated
	 */
	ImagingStudy createImagingStudy();

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
	 * Returns a new object of class '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series</em>'.
	 * @generated
	 */
	ImagingStudySeries createImagingStudySeries();

	/**
	 * Returns a new object of class '<em>Imaging Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series Instance</em>'.
	 * @generated
	 */
	ImagingStudySeriesInstance createImagingStudySeriesInstance();

	/**
	 * Returns a new object of class '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan</em>'.
	 * @generated
	 */
	CarePlan createCarePlan();

	/**
	 * Returns a new object of class '<em>Care Plan Related Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Related Plan</em>'.
	 * @generated
	 */
	CarePlanRelatedPlan createCarePlanRelatedPlan();

	/**
	 * Returns a new object of class '<em>Care Plan Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Participant</em>'.
	 * @generated
	 */
	CarePlanParticipant createCarePlanParticipant();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Goal Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Outcome</em>'.
	 * @generated
	 */
	GoalOutcome createGoalOutcome();

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
	 * Returns a new object of class '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement</em>'.
	 * @generated
	 */
	MedicationStatement createMedicationStatement();

	/**
	 * Returns a new object of class '<em>Medication Statement Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement Dosage</em>'.
	 * @generated
	 */
	MedicationStatementDosage createMedicationStatementDosage();

	/**
	 * Returns a new object of class '<em>Body Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Site</em>'.
	 * @generated
	 */
	BodySite createBodySite();

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
	 * Returns a new object of class '<em>Device Use Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Request</em>'.
	 * @generated
	 */
	DeviceUseRequest createDeviceUseRequest();

	/**
	 * Returns a new object of class '<em>Medication Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order</em>'.
	 * @generated
	 */
	MedicationOrder createMedicationOrder();

	/**
	 * Returns a new object of class '<em>Medication Order Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Dosage Instruction</em>'.
	 * @generated
	 */
	MedicationOrderDosageInstruction createMedicationOrderDosageInstruction();

	/**
	 * Returns a new object of class '<em>Medication Order Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Dispense Request</em>'.
	 * @generated
	 */
	MedicationOrderDispenseRequest createMedicationOrderDispenseRequest();

	/**
	 * Returns a new object of class '<em>Medication Order Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Substitution</em>'.
	 * @generated
	 */
	MedicationOrderSubstitution createMedicationOrderSubstitution();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Order When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order When</em>'.
	 * @generated
	 */
	OrderWhen createOrderWhen();

	/**
	 * Returns a new object of class '<em>Process Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Request</em>'.
	 * @generated
	 */
	ProcessRequest createProcessRequest();

	/**
	 * Returns a new object of class '<em>Process Request Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Request Items</em>'.
	 * @generated
	 */
	ProcessRequestItems createProcessRequestItems();

	/**
	 * Returns a new object of class '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request</em>'.
	 * @generated
	 */
	SupplyRequest createSupplyRequest();

	/**
	 * Returns a new object of class '<em>Supply Request When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request When</em>'.
	 * @generated
	 */
	SupplyRequestWhen createSupplyRequestWhen();

	/**
	 * Returns a new object of class '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription</em>'.
	 * @generated
	 */
	VisionPrescription createVisionPrescription();

	/**
	 * Returns a new object of class '<em>Vision Prescription Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription Dispense</em>'.
	 * @generated
	 */
	VisionPrescriptionDispense createVisionPrescriptionDispense();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection</em>'.
	 * @generated
	 */
	ImagingObjectSelection createImagingObjectSelection();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Study</em>'.
	 * @generated
	 */
	ImagingObjectSelectionStudy createImagingObjectSelectionStudy();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Study Series</em>'.
	 * @generated
	 */
	ImagingObjectSelectionStudySeries createImagingObjectSelectionStudySeries();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Study Series Instance</em>'.
	 * @generated
	 */
	ImagingObjectSelectionStudySeriesInstance createImagingObjectSelectionStudySeriesInstance();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Study Series Instance Frames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Study Series Instance Frames</em>'.
	 * @generated
	 */
	ImagingObjectSelectionStudySeriesInstanceFrames createImagingObjectSelectionStudySeriesInstanceFrames();

	/**
	 * Returns a new object of class '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest</em>'.
	 * @generated
	 */
	DocumentManifest createDocumentManifest();

	/**
	 * Returns a new object of class '<em>Document Manifest Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest Content</em>'.
	 * @generated
	 */
	DocumentManifestContent createDocumentManifestContent();

	/**
	 * Returns a new object of class '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest Related</em>'.
	 * @generated
	 */
	DocumentManifestRelated createDocumentManifestRelated();

	/**
	 * Returns a new object of class '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Request</em>'.
	 * @generated
	 */
	EnrollmentRequest createEnrollmentRequest();

	/**
	 * Returns a new object of class '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage</em>'.
	 * @generated
	 */
	Coverage createCoverage();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Contract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Actor</em>'.
	 * @generated
	 */
	ContractActor createContractActor();

	/**
	 * Returns a new object of class '<em>Contract Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Valued Item</em>'.
	 * @generated
	 */
	ContractValuedItem createContractValuedItem();

	/**
	 * Returns a new object of class '<em>Contract Signatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Signatory</em>'.
	 * @generated
	 */
	ContractSignatory createContractSignatory();

	/**
	 * Returns a new object of class '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term</em>'.
	 * @generated
	 */
	ContractTerm createContractTerm();

	/**
	 * Returns a new object of class '<em>Contract Term Term Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Term Actor</em>'.
	 * @generated
	 */
	ContractTermTermActor createContractTermTermActor();

	/**
	 * Returns a new object of class '<em>Contract Term Term Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term Term Valued Item</em>'.
	 * @generated
	 */
	ContractTermTermValuedItem createContractTermTermValuedItem();

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
	 * Returns a new object of class '<em>Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance</em>'.
	 * @generated
	 */
	Conformance createConformance();

	/**
	 * Returns a new object of class '<em>Conformance Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Contact</em>'.
	 * @generated
	 */
	ConformanceContact createConformanceContact();

	/**
	 * Returns a new object of class '<em>Conformance Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Software</em>'.
	 * @generated
	 */
	ConformanceSoftware createConformanceSoftware();

	/**
	 * Returns a new object of class '<em>Conformance Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Implementation</em>'.
	 * @generated
	 */
	ConformanceImplementation createConformanceImplementation();

	/**
	 * Returns a new object of class '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition</em>'.
	 * @generated
	 */
	StructureDefinition createStructureDefinition();

	/**
	 * Returns a new object of class '<em>Structure Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Contact</em>'.
	 * @generated
	 */
	StructureDefinitionContact createStructureDefinitionContact();

	/**
	 * Returns a new object of class '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Mapping</em>'.
	 * @generated
	 */
	StructureDefinitionMapping createStructureDefinitionMapping();

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
	 * Returns a new object of class '<em>Conformance Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest</em>'.
	 * @generated
	 */
	ConformanceRest createConformanceRest();

	/**
	 * Returns a new object of class '<em>Conformance Rest Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Security</em>'.
	 * @generated
	 */
	ConformanceRestSecurity createConformanceRestSecurity();

	/**
	 * Returns a new object of class '<em>Conformance Rest Security Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Security Certificate</em>'.
	 * @generated
	 */
	ConformanceRestSecurityCertificate createConformanceRestSecurityCertificate();

	/**
	 * Returns a new object of class '<em>Conformance Rest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Resource</em>'.
	 * @generated
	 */
	ConformanceRestResource createConformanceRestResource();

	/**
	 * Returns a new object of class '<em>Conformance Rest Resource Resource Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Resource Resource Interaction</em>'.
	 * @generated
	 */
	ConformanceRestResourceResourceInteraction createConformanceRestResourceResourceInteraction();

	/**
	 * Returns a new object of class '<em>Conformance Rest Resource Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Resource Search Param</em>'.
	 * @generated
	 */
	ConformanceRestResourceSearchParam createConformanceRestResourceSearchParam();

	/**
	 * Returns a new object of class '<em>Conformance Rest System Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest System Interaction</em>'.
	 * @generated
	 */
	ConformanceRestSystemInteraction createConformanceRestSystemInteraction();

	/**
	 * Returns a new object of class '<em>Conformance Rest Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest Operation</em>'.
	 * @generated
	 */
	ConformanceRestOperation createConformanceRestOperation();

	/**
	 * Returns a new object of class '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition</em>'.
	 * @generated
	 */
	OperationDefinition createOperationDefinition();

	/**
	 * Returns a new object of class '<em>Operation Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Contact</em>'.
	 * @generated
	 */
	OperationDefinitionContact createOperationDefinitionContact();

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
	 * Returns a new object of class '<em>Conformance Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Messaging</em>'.
	 * @generated
	 */
	ConformanceMessaging createConformanceMessaging();

	/**
	 * Returns a new object of class '<em>Conformance Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Messaging Endpoint</em>'.
	 * @generated
	 */
	ConformanceMessagingEndpoint createConformanceMessagingEndpoint();

	/**
	 * Returns a new object of class '<em>Conformance Messaging Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Messaging Event</em>'.
	 * @generated
	 */
	ConformanceMessagingEvent createConformanceMessagingEvent();

	/**
	 * Returns a new object of class '<em>Conformance Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Document</em>'.
	 * @generated
	 */
	ConformanceDocument createConformanceDocument();

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
	 * Returns a new object of class '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Notice</em>'.
	 * @generated
	 */
	PaymentNotice createPaymentNotice();

	/**
	 * Returns a new object of class '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide</em>'.
	 * @generated
	 */
	ImplementationGuide createImplementationGuide();

	/**
	 * Returns a new object of class '<em>Implementation Guide Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Contact</em>'.
	 * @generated
	 */
	ImplementationGuideContact createImplementationGuideContact();

	/**
	 * Returns a new object of class '<em>Implementation Guide Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Dependency</em>'.
	 * @generated
	 */
	ImplementationGuideDependency createImplementationGuideDependency();

	/**
	 * Returns a new object of class '<em>Implementation Guide Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Package</em>'.
	 * @generated
	 */
	ImplementationGuidePackage createImplementationGuidePackage();

	/**
	 * Returns a new object of class '<em>Implementation Guide Package Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Package Resource</em>'.
	 * @generated
	 */
	ImplementationGuidePackageResource createImplementationGuidePackageResource();

	/**
	 * Returns a new object of class '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Global</em>'.
	 * @generated
	 */
	ImplementationGuideGlobal createImplementationGuideGlobal();

	/**
	 * Returns a new object of class '<em>Implementation Guide Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Page</em>'.
	 * @generated
	 */
	ImplementationGuidePage createImplementationGuidePage();

	/**
	 * Returns a new object of class '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter</em>'.
	 * @generated
	 */
	SearchParameter createSearchParameter();

	/**
	 * Returns a new object of class '<em>Search Parameter Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter Contact</em>'.
	 * @generated
	 */
	SearchParameterContact createSearchParameterContact();

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
	 * Returns a new object of class '<em>Order Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Response</em>'.
	 * @generated
	 */
	OrderResponse createOrderResponse();

	/**
	 * Returns a new object of class '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Statement</em>'.
	 * @generated
	 */
	DeviceUseStatement createDeviceUseStatement();

	/**
	 * Returns a new object of class '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header</em>'.
	 * @generated
	 */
	MessageHeader createMessageHeader();

	/**
	 * Returns a new object of class '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Response</em>'.
	 * @generated
	 */
	MessageHeaderResponse createMessageHeaderResponse();

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
	 * Returns a new object of class '<em>Message Header Message Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Message Source</em>'.
	 * @generated
	 */
	MessageHeaderMessageSource createMessageHeaderMessageSource();

	/**
	 * Returns a new object of class '<em>Message Header Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Message Destination</em>'.
	 * @generated
	 */
	MessageHeaderMessageDestination createMessageHeaderMessageDestination();

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
	 * Returns a new object of class '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * @generated
	 */
	ImmunizationRecommendationRecommendationProtocol createImmunizationRecommendationRecommendationProtocol();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Immunization Explanation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Explanation</em>'.
	 * @generated
	 */
	ImmunizationExplanation createImmunizationExplanation();

	/**
	 * Returns a new object of class '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Reaction</em>'.
	 * @generated
	 */
	ImmunizationReaction createImmunizationReaction();

	/**
	 * Returns a new object of class '<em>Immunization Vaccination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Vaccination Protocol</em>'.
	 * @generated
	 */
	ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol();

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
	 * Returns a new object of class '<em>Provenance Agent Related Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Agent Related Agent</em>'.
	 * @generated
	 */
	ProvenanceAgentRelatedAgent createProvenanceAgentRelatedAgent();

	/**
	 * Returns a new object of class '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Entity</em>'.
	 * @generated
	 */
	ProvenanceEntity createProvenanceEntity();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit</em>'.
	 * @generated
	 */
	ExplanationOfBenefit createExplanationOfBenefit();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Payee</em>'.
	 * @generated
	 */
	ClaimPayee createClaimPayee();

	/**
	 * Returns a new object of class '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Diagnosis</em>'.
	 * @generated
	 */
	ClaimDiagnosis createClaimDiagnosis();

	/**
	 * Returns a new object of class '<em>Claim Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Coverage</em>'.
	 * @generated
	 */
	ClaimCoverage createClaimCoverage();

	/**
	 * Returns a new object of class '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response</em>'.
	 * @generated
	 */
	ClaimResponse createClaimResponse();

	/**
	 * Returns a new object of class '<em>Claim Response Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items</em>'.
	 * @generated
	 */
	ClaimResponseItems createClaimResponseItems();

	/**
	 * Returns a new object of class '<em>Claim Response Items Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items Item Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseItemsItemAdjudication createClaimResponseItemsItemAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Items Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items Item Detail</em>'.
	 * @generated
	 */
	ClaimResponseItemsItemDetail createClaimResponseItemsItemDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Items Item Detail Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items Item Detail Detail Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseItemsItemDetailDetailAdjudication createClaimResponseItemsItemDetailDetailAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Items Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items Item Detail Sub Detail</em>'.
	 * @generated
	 */
	ClaimResponseItemsItemDetailSubDetail createClaimResponseItemsItemDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Items Item Detail Sub Detail Subdetail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Items Item Detail Sub Detail Subdetail Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication createClaimResponseItemsItemDetailSubDetailSubdetailAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item</em>'.
	 * @generated
	 */
	ClaimResponseAddedItem createClaimResponseAddedItem();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item Added Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item Added Item Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseAddedItemAddedItemAdjudication createClaimResponseAddedItemAddedItemAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item Added Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item Added Items Detail</em>'.
	 * @generated
	 */
	ClaimResponseAddedItemAddedItemsDetail createClaimResponseAddedItemAddedItemsDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication createClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Errors</em>'.
	 * @generated
	 */
	ClaimResponseErrors createClaimResponseErrors();

	/**
	 * Returns a new object of class '<em>Claim Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Notes</em>'.
	 * @generated
	 */
	ClaimResponseNotes createClaimResponseNotes();

	/**
	 * Returns a new object of class '<em>Claim Response Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Coverage</em>'.
	 * @generated
	 */
	ClaimResponseCoverage createClaimResponseCoverage();

	/**
	 * Returns a new object of class '<em>Claim Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Items</em>'.
	 * @generated
	 */
	ClaimItems createClaimItems();

	/**
	 * Returns a new object of class '<em>Claim Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Items Detail</em>'.
	 * @generated
	 */
	ClaimItemsDetail createClaimItemsDetail();

	/**
	 * Returns a new object of class '<em>Claim Items Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Items Detail Sub Detail</em>'.
	 * @generated
	 */
	ClaimItemsDetailSubDetail createClaimItemsDetailSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Items Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Items Prosthesis</em>'.
	 * @generated
	 */
	ClaimItemsProsthesis createClaimItemsProsthesis();

	/**
	 * Returns a new object of class '<em>Claim Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Missing Teeth</em>'.
	 * @generated
	 */
	ClaimMissingTeeth createClaimMissingTeeth();

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
	 * Returns a new object of class '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map</em>'.
	 * @generated
	 */
	ConceptMap createConceptMap();

	/**
	 * Returns a new object of class '<em>Concept Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Contact</em>'.
	 * @generated
	 */
	ConceptMapContact createConceptMapContact();

	/**
	 * Returns a new object of class '<em>Concept Map Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Source Element</em>'.
	 * @generated
	 */
	ConceptMapSourceElement createConceptMapSourceElement();

	/**
	 * Returns a new object of class '<em>Concept Map Source Element Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Source Element Target Element</em>'.
	 * @generated
	 */
	ConceptMapSourceElementTargetElement createConceptMapSourceElementTargetElement();

	/**
	 * Returns a new object of class '<em>Concept Map Source Element Target Element Other Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Source Element Target Element Other Element</em>'.
	 * @generated
	 */
	ConceptMapSourceElementTargetElementOtherElement createConceptMapSourceElementTargetElementOtherElement();

	/**
	 * Returns a new object of class '<em>Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Response</em>'.
	 * @generated
	 */
	EligibilityResponse createEligibilityResponse();

	/**
	 * Returns a new object of class '<em>Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Request</em>'.
	 * @generated
	 */
	EligibilityRequest createEligibilityRequest();

	/**
	 * Returns a new object of class '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flag</em>'.
	 * @generated
	 */
	Flag createFlag();

	/**
	 * Returns a new object of class '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Response</em>'.
	 * @generated
	 */
	AppointmentResponse createAppointmentResponse();

	/**
	 * Returns a new object of class '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration</em>'.
	 * @generated
	 */
	MedicationAdministration createMedicationAdministration();

	/**
	 * Returns a new object of class '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Dosage</em>'.
	 * @generated
	 */
	MedicationAdministrationDosage createMedicationAdministrationDosage();

	/**
	 * Returns a new object of class '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Response</em>'.
	 * @generated
	 */
	EnrollmentResponse createEnrollmentResponse();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script</em>'.
	 * @generated
	 */
	TestScript createTestScript();

	/**
	 * Returns a new object of class '<em>Test Script Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Contact</em>'.
	 * @generated
	 */
	TestScriptContact createTestScriptContact();

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
	 * Returns a new object of class '<em>Test Script Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Action</em>'.
	 * @generated
	 */
	TestScriptSetupAction createTestScriptSetupAction();

	/**
	 * Returns a new object of class '<em>Test Script Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Action Operation</em>'.
	 * @generated
	 */
	TestScriptSetupActionOperation createTestScriptSetupActionOperation();

	/**
	 * Returns a new object of class '<em>Test Script Setup Action Operation Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Action Operation Request Header</em>'.
	 * @generated
	 */
	TestScriptSetupActionOperationRequestHeader createTestScriptSetupActionOperationRequestHeader();

	/**
	 * Returns a new object of class '<em>Test Script Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup Action Assert</em>'.
	 * @generated
	 */
	TestScriptSetupActionAssert createTestScriptSetupActionAssert();

	/**
	 * Returns a new object of class '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Test</em>'.
	 * @generated
	 */
	TestScriptTest createTestScriptTest();

	/**
	 * Returns a new object of class '<em>Test Script Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Test Action</em>'.
	 * @generated
	 */
	TestScriptTestAction createTestScriptTestAction();

	/**
	 * Returns a new object of class '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Teardown</em>'.
	 * @generated
	 */
	TestScriptTeardown createTestScriptTeardown();

	/**
	 * Returns a new object of class '<em>Test Script Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Teardown Action</em>'.
	 * @generated
	 */
	TestScriptTeardownAction createTestScriptTeardownAction();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense</em>'.
	 * @generated
	 */
	MedicationDispense createMedicationDispense();

	/**
	 * Returns a new object of class '<em>Medication Dispense Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Dosage Instruction</em>'.
	 * @generated
	 */
	MedicationDispenseDosageInstruction createMedicationDispenseDosageInstruction();

	/**
	 * Returns a new object of class '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Substitution</em>'.
	 * @generated
	 */
	MedicationDispenseSubstitution createMedicationDispenseSubstitution();

	/**
	 * Returns a new object of class '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element</em>'.
	 * @generated
	 */
	DataElement createDataElement();

	/**
	 * Returns a new object of class '<em>Data Element Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element Contact</em>'.
	 * @generated
	 */
	DataElementContact createDataElementContact();

	/**
	 * Returns a new object of class '<em>Data Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element Mapping</em>'.
	 * @generated
	 */
	DataElementMapping createDataElementMapping();

	/**
	 * Returns a new object of class '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event</em>'.
	 * @generated
	 */
	AuditEvent createAuditEvent();

	/**
	 * Returns a new object of class '<em>Audit Event Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Event</em>'.
	 * @generated
	 */
	AuditEventEvent createAuditEventEvent();

	/**
	 * Returns a new object of class '<em>Audit Event Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Participant</em>'.
	 * @generated
	 */
	AuditEventParticipant createAuditEventParticipant();

	/**
	 * Returns a new object of class '<em>Audit Event Participant Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Participant Network</em>'.
	 * @generated
	 */
	AuditEventParticipantNetwork createAuditEventParticipantNetwork();

	/**
	 * Returns a new object of class '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Source</em>'.
	 * @generated
	 */
	AuditEventSource createAuditEventSource();

	/**
	 * Returns a new object of class '<em>Audit Event Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Object</em>'.
	 * @generated
	 */
	AuditEventObject createAuditEventObject();

	/**
	 * Returns a new object of class '<em>Audit Event Object Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Object Detail</em>'.
	 * @generated
	 */
	AuditEventObjectDetail createAuditEventObjectDetail();

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
	 * Returns a new object of class '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue</em>'.
	 * @generated
	 */
	DetectedIssue createDetectedIssue();

	/**
	 * Returns a new object of class '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue Mitigation</em>'.
	 * @generated
	 */
	DetectedIssueMitigation createDetectedIssueMitigation();

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
	 * Returns a new object of class '<em>Process Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Response</em>'.
	 * @generated
	 */
	ProcessResponse createProcessResponse();

	/**
	 * Returns a new object of class '<em>Process Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Response Notes</em>'.
	 * @generated
	 */
	ProcessResponseNotes createProcessResponseNotes();

	/**
	 * Returns a new object of class '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System</em>'.
	 * @generated
	 */
	NamingSystem createNamingSystem();

	/**
	 * Returns a new object of class '<em>Naming System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Contact</em>'.
	 * @generated
	 */
	NamingSystemContact createNamingSystemContact();

	/**
	 * Returns a new object of class '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Unique Id</em>'.
	 * @generated
	 */
	NamingSystemUniqueId createNamingSystemUniqueId();

	/**
	 * Returns a new object of class '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Delivery</em>'.
	 * @generated
	 */
	SupplyDelivery createSupplyDelivery();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FhirResourcePackage getFhirResourcePackage();

} //FhirResourceFactory
