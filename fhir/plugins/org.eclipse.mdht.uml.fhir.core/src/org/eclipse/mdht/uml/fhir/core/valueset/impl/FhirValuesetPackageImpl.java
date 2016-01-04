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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

import org.eclipse.mdht.uml.fhir.core.resource.impl.FhirResourcePackageImpl;

import org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode;
import org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode;
import org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode;
import org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType;
import org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode;
import org.eclipse.mdht.uml.fhir.core.valueset.ActionList;
import org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason;
import org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.AddressType;
import org.eclipse.mdht.uml.fhir.core.valueset.AddressUse;
import org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender;
import org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource;
import org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode;
import org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType;
import org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds;
import org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies;
import org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12;
import org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType;
import org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType;
import org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType;
import org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType;
import org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes;
import org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength;
import org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier;
import org.eclipse.mdht.uml.fhir.core.valueset.BundleType;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship;
import org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ClaimType;
import org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration;
import org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode;
import org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode;
import org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind;
import org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity;
import org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType;
import org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem;
import org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse;
import org.eclipse.mdht.uml.fhir.core.valueset.ContentType;
import org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency;
import org.eclipse.mdht.uml.fhir.core.valueset.DataType;
import org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek;
import org.eclipse.mdht.uml.fhir.core.valueset.DbSnp;
import org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType;
import org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType;
import org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType;
import org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse;
import org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction;
import org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority;
import org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority;
import org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.Diet;
import org.eclipse.mdht.uml.fhir.core.valueset.DietCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType;
import org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterState;
import org.eclipse.mdht.uml.fhir.core.valueset.EncounterType;
import org.eclipse.mdht.uml.fhir.core.valueset.Ensembl;
import org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode;
import org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.EventTiming;
import org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList;
import org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext;
import org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetFactory;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage;
import org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator;
import org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.FlagCode;
import org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.FormCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority;
import org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent;
import org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason;
import org.eclipse.mdht.uml.fhir.core.valueset.GroupType;
import org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType;
import org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType;
import org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind;
import org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose;
import org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb;
import org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes;
import org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse;
import org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel;
import org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability;
import org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType;
import org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity;
import org.eclipse.mdht.uml.fhir.core.valueset.IssueType;
import org.eclipse.mdht.uml.fhir.core.valueset.KoStitle;
import org.eclipse.mdht.uml.fhir.core.valueset.Laterality;
import org.eclipse.mdht.uml.fhir.core.valueset.LinkType;
import org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons;
import org.eclipse.mdht.uml.fhir.core.valueset.ListMode;
import org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ListStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.LocationMode;
import org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.LocationType;
import org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist;
import org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple;
import org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType;
import org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection;
import org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType;
import org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode;
import org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent;
import org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory;
import org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport;
import org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType;
import org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType;
import org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType;
import org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType;
import org.eclipse.mdht.uml.fhir.core.valueset.NameUse;
import org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType;
import org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType;
import org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.NoteType;
import org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason;
import org.eclipse.mdht.uml.fhir.core.valueset.OperationKind;
import org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse;
import org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType;
import org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType;
import org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions;
import org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired;
import org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles;
import org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType;
import org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship;
import org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes;
import org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType;
import org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole;
import org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty;
import org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType;
import org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType;
import org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation;
import org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole;
import org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState;
import org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole;
import org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse;
import org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator;
import org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType;
import org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod;
import org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome;
import org.eclipse.mdht.uml.fhir.core.valueset.ResourceType;
import org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy;
import org.eclipse.mdht.uml.fhir.core.valueset.ResponseType;
import org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode;
import org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService;
import org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability;
import org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode;
import org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode;
import org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType;
import org.eclipse.mdht.uml.fhir.core.valueset.SequenceType;
import org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType;
import org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions;
import org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules;
import org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure;
import org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind;
import org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType;
import org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag;
import org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason;
import org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen;
import org.eclipse.mdht.uml.fhir.core.valueset.SupplyType;
import org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction;
import org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation;
import org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode;
import org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction;
import org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime;
import org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode;
import org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.Use;
import org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative;
import org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType;
import org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode;
import org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality;
import org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode;
import org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType;
import org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes;
import org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet;
import org.eclipse.mdht.uml.fhir.core.valueset.VisionBase;
import org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes;
import org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirValuesetPackageImpl extends EPackageImpl implements FhirValuesetPackage {
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
	private EEnum allSecurityLabelsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum narrativeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierUseEEnum = null;

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
	private EEnum organizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressTypeEEnum = null;

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
	private EEnum nameUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrativeGenderEEnum = null;

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
	private EEnum practitionerSpecialtyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceDeliveryLocationRoleTypeEEnum = null;

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
	private EEnum practiceSettingCodeValueSetEEnum = null;

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
	private EEnum referralMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daysOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum = null;

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
	private EEnum animalSpeciesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum animalBreedsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

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
	private EEnum quantityComparatorEEnum = null;

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
	private EEnum deviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsOfTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTimingEEnum = null;

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
	private EEnum moduleMetadataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleMetadataStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleMetadataFocusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleMetadataContributorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityAssuranceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleMetadataResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationParameterUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypesUsedInOperationDefinitionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceResourceStatusEEnum = null;

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
	private EEnum structureDefinitionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureDefinitionKindEEnum = null;

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
	private EEnum extensionContextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRepresentationEEnum = null;

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
	private EEnum slicingRulesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStrengthEEnum = null;

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
	private EEnum filterOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtMedicationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationFormCodesEEnum = null;

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
	private EEnum snomedCtFormCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemParticipationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterClassEEnum = null;

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
	private EEnum encounterPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum episodeOfCareStatusEEnum = null;

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
	private EEnum conditionCategoryCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionClinicalStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionVerificationStatusEEnum = null;

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
	private EEnum conditionStageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalImpressionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSubstanceAndNegationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCriticalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCertaintyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtManifestationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtRouteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtClinicalFindingsEEnum = null;

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
	private EEnum observationStatusEEnum = null;

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
	private EEnum observationValueAbsentReasonEEnum = null;

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
	private EEnum snomedCtBodyStructuresEEnum = null;

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
	private EEnum specimenStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2SpecimenTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenCollectionMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenTreatmentProcedureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specimenContainerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v2AdditivePreservativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measmntPrincipleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricOperationalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricColorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationStateEEnum = null;

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
	private EEnum observationRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireStatusEEnum = null;

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
	private EEnum questionnaireItemTypeEEnum = null;

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
	private EEnum questionnaireResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyHistoryStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyMemberEEnum = null;

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
	private EEnum diagnosticReportStatusEEnum = null;

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
	private EEnum documentTypeValueSetEEnum = null;

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
	private EEnum documentReferenceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentRelationshipTypeEEnum = null;

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
	private EEnum v3CodeSystemActCodeEEnum = null;

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
	private EEnum diagnosticOrderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticOrderPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticOrderEventCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loincDiagnosticOrderCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCodessnomedCTEEnum = null;

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
	private EEnum procedureRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRequestPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acquisitionModalityCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceAvailabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureCategoryCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureNotPerformedReasonsnomeDCTEEnum = null;

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
	private EEnum procedureOutcomeCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureFollowUpCodessnomedCTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanStatusEEnum = null;

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
	private EEnum carePlanRelationshipEEnum = null;

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
	private EEnum goalStartEventEEnum = null;

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
	private EEnum goalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStatusReasonEEnum = null;

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
	private EEnum medicationStatementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonMedicationNotGivenCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodysiteLocationModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutritionOrderStatusEEnum = null;

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
	private EEnum riskProbabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentStatusEEnum = null;

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
	private EEnum slotStatusEEnum = null;

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
	private EEnum participantRequiredEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceUseRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceUseRequestPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationOrderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actSubstanceAdminSubstitutionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substanceAdminSubstitutionReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rulesetCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestStatusEEnum = null;

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
	private EEnum supplyRequestReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyRequestWhenEEnum = null;

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
	private EEnum visionEyesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionBaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityStatusEEnum = null;

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
	private EEnum koStitleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitalMediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaSubTypeEEnum = null;

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
	private EEnum manifestationAndSymptomCodesEEnum = null;

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
	private EEnum encounterLocationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemIdentifierTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptMapEquivalenceEEnum = null;

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
	private EEnum flagStatusEEnum = null;

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
	private EEnum sequenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbSnpEEnum = null;

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
	private EEnum loinc530345AnswerlistEEnum = null;

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
	private EEnum contractActionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purposeOfUseEEnum = null;

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
	private EEnum contractSignerTypeCodesEEnum = null;

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
	private EEnum contractTermSubTypeCodesEEnum = null;

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
	private EEnum fhirDocumentClassCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v3CodeSystemConfidentialityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionAttestationModeEEnum = null;

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
	private EEnum listModeEEnum = null;

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
	private EEnum listEmptyReasonsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum remittanceOutcomeEEnum = null;

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
	private EEnum formCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceStatementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unknownContentCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restfulConformanceModeEEnum = null;

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
	private EEnum typeRestfulInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceVersionPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionalDeleteStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchParamTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchModifierCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemRestfulInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationKindEEnum = null;

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
	private EEnum messageSignificanceCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceEventModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum profileOriginTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum profileDestinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testScriptOperationCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionResponseTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataElementStringencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionSupportRuleTriggerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionSupportRuleParticipantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionSupportRuleActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueTypeEEnum = null;

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
	private EEnum exampleMessageReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionChannelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionTagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actCoverageTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipCodesEEnum = null;

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
	private EEnum immunizationRecommendationStatusCodesEEnum = null;

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
	private EEnum medicationAdministrationStatusEEnum = null;

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
	private EEnum immunizationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immunizationReasonsForNotImmunizingCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseTargetCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseStatusCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vaccinationProtocolDoseStatusReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bundleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchEntryModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityCodesEEnum = null;

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
	private EEnum benefitSubCategoryCodesEEnum = null;

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
	private EEnum adjudicationErrorCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispenseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actPharmacySupplyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useEEnum = null;

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
	private EEnum payeeTypeCodesEEnum = null;

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
	private EEnum conditionsCodesEEnum = null;

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
	private EEnum actIncidentCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interventionCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actInvoiceGroupCodeEEnum = null;

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
	private EEnum exampleServicePlaceCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum udiCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toothCodesEEnum = null;

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
	private EEnum modifierTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oralProsthoMaterialTypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additionalMaterialCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum teethCodesEEnum = null;

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
	private EEnum adjudicationCodesEEnum = null;

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
	private EEnum adjudicationReasonCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guideDependencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guideResourcePurposeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guidePageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xPathUsageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetParticipantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemGroupingBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemSelectionBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemRequiredBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemPrecheckBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderSetItemCardinalityBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceEventCurrentStateEEnum = null;

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
	private EEnum v3CodeSystemRoleLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceEntityRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processOutcomeCodesEEnum = null;

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
	private EEnum paymentStatusCodesEEnum = null;

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
	private EEnum listStatusEEnum = null;

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
	private EEnum guidanceResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guidanceResponseActionTypeEEnum = null;

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
	private EEnum detectedIssueSeverityEEnum = null;

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
	private EEnum accountStatusEEnum = null;

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
	private EEnum participantStatusEEnum = null;

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
	private EEnum auditEventActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventOutcomeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditActiveParticipantRoleIdCodeEEnum = null;

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
	private EEnum auditEventParticipantNetworkTypeEEnum = null;

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
	private EEnum auditEventObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventObjectRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventObjectLifecycleEEnum = null;

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
	private EEnum orderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyDeliveryStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyItemTypeEEnum = null;

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
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FhirValuesetPackageImpl() {
		super(eNS_URI, FhirValuesetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FhirValuesetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FhirValuesetPackage init() {
		if (isInited) return (FhirValuesetPackage)EPackage.Registry.INSTANCE.getEPackage(FhirValuesetPackage.eNS_URI);

		// Obtain or create and register package
		FhirValuesetPackageImpl theFhirValuesetPackage = (FhirValuesetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FhirValuesetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FhirValuesetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FhirDatatypePackageImpl theFhirDatatypePackage = (FhirDatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) instanceof FhirDatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) : FhirDatatypePackage.eINSTANCE);
		FhirResourcePackageImpl theFhirResourcePackage = (FhirResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI) instanceof FhirResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI) : FhirResourcePackage.eINSTANCE);

		// Load packages
		theFhirResourcePackage.loadPackage();

		// Create package meta-data objects
		theFhirValuesetPackage.createPackageContents();
		theFhirDatatypePackage.createPackageContents();

		// Initialize created meta-data
		theFhirValuesetPackage.initializePackageContents();
		theFhirDatatypePackage.initializePackageContents();

		// Fix loaded packages
		theFhirResourcePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFhirValuesetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FhirValuesetPackage.eNS_URI, theFhirValuesetPackage);
		return theFhirValuesetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllSecurityLabels() {
		return allSecurityLabelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNarrativeStatus() {
		return narrativeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentifierUse() {
		return identifierUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentifierTypeCodes() {
		return identifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrganizationType() {
		return organizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointSystem() {
		return contactPointSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointUse() {
		return contactPointUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressUse() {
		return addressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressType() {
		return addressTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactEntityType() {
		return contactEntityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameUse() {
		return nameUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdministrativeGender() {
		return administrativeGenderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPractitionerRole() {
		return practitionerRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPractitionerSpecialty() {
		return practitionerSpecialtyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationStatus() {
		return locationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationMode() {
		return locationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceDeliveryLocationRoleType() {
		return serviceDeliveryLocationRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationType() {
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPracticeSettingCodeValueSet() {
		return practiceSettingCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceProvisionConditions() {
		return serviceProvisionConditionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralMethod() {
		return referralMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaysOfWeek() {
		return daysOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12() {
		return anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaritalStatusCodes() {
		return maritalStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientContactRelationship() {
		return patientContactRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimalSpecies() {
		return animalSpeciesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimalBreeds() {
		return animalBreedsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderStatus() {
		return genderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkType() {
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientRelationshipType() {
		return patientRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantityComparator() {
		return quantityComparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignatureTypeCodes() {
		return signatureTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceStatus() {
		return deviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitsOfTime() {
		return unitsOfTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTiming() {
		return eventTimingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingAbbreviation() {
		return timingAbbreviationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleMetadataType() {
		return moduleMetadataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleMetadataStatus() {
		return moduleMetadataStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleMetadataFocusType() {
		return moduleMetadataFocusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleMetadataContributorType() {
		return moduleMetadataContributorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentityAssuranceLevel() {
		return identityAssuranceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleMetadataResourceType() {
		return moduleMetadataResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationParameterUse() {
		return operationParameterUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterTypesUsedInOperationDefinitions() {
		return parameterTypesUsedInOperationDefinitionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceResourceStatus() {
		return conformanceResourceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextOfUseValueSet() {
		return contextOfUseValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureDefinitionCodes() {
		return structureDefinitionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureDefinitionKind() {
		return structureDefinitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDefinedType() {
		return fhirDefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtensionContext() {
		return extensionContextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRepresentation() {
		return propertyRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincCodes() {
		return loincCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlicingRules() {
		return slicingRulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationMode() {
		return aggregationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintSeverity() {
		return constraintSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingStrength() {
		return bindingStrengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignationUse() {
		return designationUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterOperator() {
		return filterOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupType() {
		return groupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtMedicationCodes() {
		return snomedCtMedicationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationFormCodes() {
		return medicationFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceCategoryCodes() {
		return substanceCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceCode() {
		return substanceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtFormCodes() {
		return snomedCtFormCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemParticipationMode() {
		return v3CodeSystemParticipationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationStatus() {
		return communicationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterState() {
		return encounterStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterClass() {
		return encounterClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterType() {
		return encounterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterPriority() {
		return encounterPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpisodeOfCareStatus() {
		return episodeOfCareStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionProblemDiagnosisCodes() {
		return conditionProblemDiagnosisCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionCategoryCodes() {
		return conditionCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionClinicalStatusCodes() {
		return conditionClinicalStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionVerificationStatus() {
		return conditionVerificationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionDiagnosisSeverity() {
		return conditionDiagnosisSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionStage() {
		return conditionStageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalImpressionStatus() {
		return clinicalImpressionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceSubstanceAndNegationCodes() {
		return allergyIntoleranceSubstanceAndNegationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceStatus() {
		return allergyIntoleranceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCriticality() {
		return allergyIntoleranceCriticalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceType() {
		return allergyIntoleranceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCategory() {
		return allergyIntoleranceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCertainty() {
		return allergyIntoleranceCertaintyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtManifestationCodes() {
		return snomedCtManifestationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceSeverity() {
		return allergyIntoleranceSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtRouteCodes() {
		return snomedCtRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtClinicalFindings() {
		return snomedCtClinicalFindingsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvestigationType() {
		return investigationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationStatus() {
		return observationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationCategoryCodes() {
		return observationCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationValueAbsentReason() {
		return observationValueAbsentReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationInterpretationCodes() {
		return observationInterpretationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtBodyStructures() {
		return snomedCtBodyStructuresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationMethods() {
		return observationMethodsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenStatus() {
		return specimenStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2SpecimenType() {
		return v2SpecimenTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenCollectionMethod() {
		return specimenCollectionMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenTreatmentProcedure() {
		return specimenTreatmentProcedureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecimenContainer() {
		return specimenContainerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV2AdditivePreservative() {
		return v2AdditivePreservativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasmntPrinciple() {
		return measmntPrincipleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricOperationalStatus() {
		return deviceMetricOperationalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricColor() {
		return deviceMetricColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCategory() {
		return deviceMetricCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationType() {
		return deviceMetricCalibrationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationState() {
		return deviceMetricCalibrationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationReferenceRangeMeaningCodes() {
		return observationReferenceRangeMeaningCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationRelationshipType() {
		return observationRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireStatus() {
		return questionnaireStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireQuestionCodes() {
		return questionnaireQuestionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireItemType() {
		return questionnaireItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireAnswerCodes() {
		return questionnaireAnswerCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireResponseStatus() {
		return questionnaireResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamilyHistoryStatus() {
		return familyHistoryStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamilyMember() {
		return familyMemberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionOutcomeCodes() {
		return conditionOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticReportStatus() {
		return diagnosticReportStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticServiceSectionCodes() {
		return diagnosticServiceSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincDiagnosticReportCodes() {
		return loincDiagnosticReportCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentTypeValueSet() {
		return documentTypeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentClassValueSet() {
		return documentClassValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentReferenceStatus() {
		return documentReferenceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionStatus() {
		return compositionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentRelationshipType() {
		return documentRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentReferenceFormatCodeSet() {
		return documentReferenceFormatCodeSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemActCode() {
		return v3CodeSystemActCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFacilityTypeCodeValueSet() {
		return facilityTypeCodeValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticOrderStatus() {
		return diagnosticOrderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticOrderPriority() {
		return diagnosticOrderPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticOrderEventCodes() {
		return diagnosticOrderEventCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoincDiagnosticOrderCodes() {
		return loincDiagnosticOrderCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureCodessnomedCT() {
		return procedureCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureReasonCodes() {
		return procedureReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestStatus() {
		return procedureRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestPriority() {
		return procedureRequestPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralStatus() {
		return referralStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcquisitionModalityCodes() {
		return acquisitionModalityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceAvailability() {
		return instanceAvailabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureStatus() {
		return procedureStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureCategoryCodessnomedCT() {
		return procedureCategoryCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureNotPerformedReasonsnomeDCT() {
		return procedureNotPerformedReasonsnomeDCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedurePerformerRoleCodes() {
		return procedurePerformerRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureOutcomeCodessnomedCT() {
		return procedureOutcomeCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureFollowUpCodessnomedCT() {
		return procedureFollowUpCodessnomedCTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanStatus() {
		return carePlanStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanCategory() {
		return carePlanCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanRelationship() {
		return carePlanRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantRoles() {
		return participantRolesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStartEvent() {
		return goalStartEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalCategory() {
		return goalCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStatus() {
		return goalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStatusReason() {
		return goalStatusReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalPriority() {
		return goalPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationStatementStatus() {
		return medicationStatementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReasonMedicationNotGivenCodes() {
		return reasonMedicationNotGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBodysiteLocationModifier() {
		return bodysiteLocationModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSnomedCtAnatomicalStructureForAdministrationSiteCodes() {
		return snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNutritionOrderStatus() {
		return nutritionOrderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiet() {
		return dietEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFoodTypeCodes() {
		return foodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDietCodes() {
		return dietCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNutrientModifierCodes() {
		return nutrientModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureModifierCodes() {
		return textureModifierCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureModifiedFoodTypeCodes() {
		return textureModifiedFoodTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFluidConsistencyTypeCodes() {
		return fluidConsistencyTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplementTypeCodes() {
		return supplementTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralFormulaTypeCodes() {
		return enteralFormulaTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralFormulaAdditiveTypeCode() {
		return enteralFormulaAdditiveTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnteralRouteCodes() {
		return enteralRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskProbability() {
		return riskProbabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppointmentStatus() {
		return appointmentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterReasonCodes() {
		return encounterReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlotStatus() {
		return slotStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantType() {
		return participantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantRequired() {
		return participantRequiredEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationStatus() {
		return participationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationRequestStatus() {
		return communicationRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceUseRequestStatus() {
		return deviceUseRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceUseRequestPriority() {
		return deviceUseRequestPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationOrderStatus() {
		return medicationOrderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActSubstanceAdminSubstitutionCode() {
		return actSubstanceAdminSubstitutionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubstanceAdminSubstitutionReason() {
		return substanceAdminSubstitutionReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionList() {
		return actionListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRulesetCodes() {
		return rulesetCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestStatus() {
		return supplyRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyType() {
		return supplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestReason() {
		return supplyRequestReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyRequestWhen() {
		return supplyRequestWhenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleVisionPrescriptionProductCodes() {
		return exampleVisionPrescriptionProductCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionEyes() {
		return visionEyesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionBase() {
		return visionBaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityCategory() {
		return carePlanActivityCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivity() {
		return carePlanActivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityReason() {
		return activityReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityStatus() {
		return carePlanActivityStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureDeviceActionCodes() {
		return procedureDeviceActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLaterality() {
		return lateralityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKoStitle() {
		return koStitleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDigitalMediaType() {
		return digitalMediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaSubType() {
		return mediaSubTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaCollectionViewProjection() {
		return mediaCollectionViewProjectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManifestationAndSymptomCodes() {
		return manifestationAndSymptomCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdmitSource() {
		return admitSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialCourtesy() {
		return specialCourtesyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialArrangements() {
		return specialArrangementsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDischargeDisposition() {
		return dischargeDispositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterLocationStatus() {
		return encounterLocationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemType() {
		return namingSystemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemIdentifierType() {
		return namingSystemIdentifierTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptMapEquivalence() {
		return conceptMapEquivalenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagCategory() {
		return flagCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagStatus() {
		return flagStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagCode() {
		return flagCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceType() {
		return sequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbSnp() {
		return dbSnpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnsembl() {
		return ensemblEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoinc530345Answerlist() {
		return loinc530345AnswerlistEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTypeCodes() {
		return contractTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractSubtypeCodes() {
		return contractSubtypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractActionCodes() {
		return contractActionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurposeOfUse() {
		return purposeOfUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractActorRoleCodes() {
		return contractActorRoleCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractSignerTypeCodes() {
		return contractSignerTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTermTypeCodes() {
		return contractTermTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractTermSubTypeCodes() {
		return contractTermSubTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDocumentTypeCodes() {
		return fhirDocumentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDocumentClassCodes() {
		return fhirDocumentClassCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemConfidentiality() {
		return v3CodeSystemConfidentialityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionAttestationMode() {
		return compositionAttestationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentSectionCodes() {
		return documentSectionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListMode() {
		return listModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListOrderCodes() {
		return listOrderCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListEmptyReasons() {
		return listEmptyReasonsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRemittanceOutcome() {
		return remittanceOutcomeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentTypeCodes() {
		return paymentTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormCodes() {
		return formCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoteType() {
		return noteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceStatementKind() {
		return conformanceStatementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnknownContentCode() {
		return unknownContentCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestfulConformanceMode() {
		return restfulConformanceModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestfulSecurityService() {
		return restfulSecurityServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestfulInteraction() {
		return typeRestfulInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceVersionPolicy() {
		return resourceVersionPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionalDeleteStatus() {
		return conditionalDeleteStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchParamType() {
		return searchParamTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchModifierCode() {
		return searchModifierCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemRestfulInteraction() {
		return systemRestfulInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionMode() {
		return transactionModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationKind() {
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageTransport() {
		return messageTransportEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageEvent() {
		return messageEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSignificanceCategory() {
		return messageSignificanceCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceEventMode() {
		return conformanceEventModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentMode() {
		return documentModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProfileOriginType() {
		return profileOriginTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProfileDestinationType() {
		return profileDestinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestScriptOperationCodes() {
		return testScriptOperationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentType() {
		return contentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionDirectionType() {
		return assertionDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionOperatorType() {
		return assertionOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionResponseTypes() {
		return assertionResponseTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataElementStringency() {
		return dataElementStringencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionSupportRuleTriggerType() {
		return decisionSupportRuleTriggerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionSupportRuleParticipantType() {
		return decisionSupportRuleParticipantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionSupportRuleActionType() {
		return decisionSupportRuleActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseType() {
		return responseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueSeverity() {
		return issueSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueType() {
		return issueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationOutcomeCodes() {
		return operationOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleMessageReasonCodes() {
		return exampleMessageReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionStatus() {
		return subscriptionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionChannelType() {
		return subscriptionChannelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionTag() {
		return subscriptionTagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActCoverageTypeCode() {
		return actCoverageTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipCodes() {
		return relationshipCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccineAdministeredValueSet() {
		return vaccineAdministeredValueSetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRecommendationStatusCodes() {
		return immunizationRecommendationStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRecommendationDateCriterionCodes() {
		return immunizationRecommendationDateCriterionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationAdministrationStatus() {
		return medicationAdministrationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodesForImmunizationSiteOfAdministration() {
		return codesForImmunizationSiteOfAdministrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationRouteCodes() {
		return immunizationRouteCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationReasonCodes() {
		return immunizationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImmunizationReasonsForNotImmunizingCodes() {
		return immunizationReasonsForNotImmunizingCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseTargetCodes() {
		return vaccinationProtocolDoseTargetCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseStatusCodes() {
		return vaccinationProtocolDoseStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVaccinationProtocolDoseStatusReasonCodes() {
		return vaccinationProtocolDoseStatusReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBundleType() {
		return bundleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchEntryMode() {
		return searchEntryModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpVerb() {
		return httpVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityCodes() {
		return priorityCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitCategoryCodes() {
		return benefitCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitSubCategoryCodes() {
		return benefitSubCategoryCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkTypeCodes() {
		return networkTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitTypeCodes() {
		return unitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitTermCodes() {
		return benefitTermCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitTypeCodes() {
		return benefitTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationErrorCodes() {
		return adjudicationErrorCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationDispenseStatus() {
		return medicationDispenseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActPharmacySupplyType() {
		return actPharmacySupplyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimType() {
		return claimTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUse() {
		return useEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFundsReservationCodes() {
		return fundsReservationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayeeTypeCodes() {
		return payeeTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIcD10Codes() {
		return icD10CodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionsCodes() {
		return conditionsCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExceptionCodes() {
		return exceptionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActIncidentCode() {
		return actIncidentCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterventionCodes() {
		return interventionCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActInvoiceGroupCode() {
		return actInvoiceGroupCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsclsCodes() {
		return usclsCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleServicePlaceCodes() {
		return exampleServicePlaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUdiCodes() {
		return udiCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToothCodes() {
		return toothCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSurfaceCodes() {
		return surfaceCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModifierTypeCodes() {
		return modifierTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOralProsthoMaterialTypeCodes() {
		return oralProsthoMaterialTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditionalMaterialCodes() {
		return additionalMaterialCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTeethCodes() {
		return teethCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMissingToothReasonCodes() {
		return missingToothReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationCodes() {
		return adjudicationCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentAdjustmentReasonCodes() {
		return paymentAdjustmentReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicationReasonCodes() {
		return adjudicationReasonCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuideDependencyType() {
		return guideDependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuideResourcePurpose() {
		return guideResourcePurposeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuidePageKind() {
		return guidePageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXPathUsageType() {
		return xPathUsageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetParticipantType() {
		return orderSetParticipantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemType() {
		return orderSetItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemGroupingBehavior() {
		return orderSetItemGroupingBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemSelectionBehavior() {
		return orderSetItemSelectionBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemRequiredBehavior() {
		return orderSetItemRequiredBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemPrecheckBehavior() {
		return orderSetItemPrecheckBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderSetItemCardinalityBehavior() {
		return orderSetItemCardinalityBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceEventCurrentState() {
		return provenanceEventCurrentStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceParticipantRole() {
		return provenanceParticipantRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV3CodeSystemRoleLinkType() {
		return v3CodeSystemRoleLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceEntityRole() {
		return provenanceEntityRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessOutcomeCodes() {
		return processOutcomeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurePopulationType() {
		return measurePopulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentStatusCodes() {
		return paymentStatusCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExampleUseCodesForList() {
		return exampleUseCodesForListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListStatus() {
		return listStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientMedicineChangeTypes() {
		return patientMedicineChangeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuidanceResponseStatus() {
		return guidanceResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuidanceResponseActionType() {
		return guidanceResponseActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueCategory() {
		return detectedIssueCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueSeverity() {
		return detectedIssueSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectedIssueMitigationAction() {
		return detectedIssueMitigationActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccountStatus() {
		return accountStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReasonMedicationGivenCodes() {
		return reasonMedicationGivenCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantStatus() {
		return participantStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventId() {
		return auditEventIdEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventSubType() {
		return auditEventSubTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventAction() {
		return auditEventActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventOutcome() {
		return auditEventOutcomeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditActiveParticipantRoleIdCode() {
		return auditActiveParticipantRoleIdCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaTypeCode() {
		return mediaTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventParticipantNetworkType() {
		return auditEventParticipantNetworkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventSourceType() {
		return auditEventSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectType() {
		return auditEventObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectRole() {
		return auditEventObjectRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectLifecycle() {
		return auditEventObjectLifecycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasicResourceTypes() {
		return basicResourceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderStatus() {
		return orderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyDeliveryStatus() {
		return supplyDeliveryStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyItemType() {
		return supplyItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValuesetFactory getFhirValuesetFactory() {
		return (FhirValuesetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		allSecurityLabelsEEnum = createEEnum(ALL_SECURITY_LABELS);
		narrativeStatusEEnum = createEEnum(NARRATIVE_STATUS);
		identifierUseEEnum = createEEnum(IDENTIFIER_USE);
		identifierTypeCodesEEnum = createEEnum(IDENTIFIER_TYPE_CODES);
		organizationTypeEEnum = createEEnum(ORGANIZATION_TYPE);
		contactPointSystemEEnum = createEEnum(CONTACT_POINT_SYSTEM);
		contactPointUseEEnum = createEEnum(CONTACT_POINT_USE);
		addressUseEEnum = createEEnum(ADDRESS_USE);
		addressTypeEEnum = createEEnum(ADDRESS_TYPE);
		contactEntityTypeEEnum = createEEnum(CONTACT_ENTITY_TYPE);
		nameUseEEnum = createEEnum(NAME_USE);
		administrativeGenderEEnum = createEEnum(ADMINISTRATIVE_GENDER);
		practitionerRoleEEnum = createEEnum(PRACTITIONER_ROLE);
		practitionerSpecialtyEEnum = createEEnum(PRACTITIONER_SPECIALTY);
		locationStatusEEnum = createEEnum(LOCATION_STATUS);
		locationModeEEnum = createEEnum(LOCATION_MODE);
		serviceDeliveryLocationRoleTypeEEnum = createEEnum(SERVICE_DELIVERY_LOCATION_ROLE_TYPE);
		locationTypeEEnum = createEEnum(LOCATION_TYPE);
		practiceSettingCodeValueSetEEnum = createEEnum(PRACTICE_SETTING_CODE_VALUE_SET);
		serviceProvisionConditionsEEnum = createEEnum(SERVICE_PROVISION_CONDITIONS);
		referralMethodEEnum = createEEnum(REFERRAL_METHOD);
		daysOfWeekEEnum = createEEnum(DAYS_OF_WEEK);
		anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum = createEEnum(ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12);
		maritalStatusCodesEEnum = createEEnum(MARITAL_STATUS_CODES);
		patientContactRelationshipEEnum = createEEnum(PATIENT_CONTACT_RELATIONSHIP);
		animalSpeciesEEnum = createEEnum(ANIMAL_SPECIES);
		animalBreedsEEnum = createEEnum(ANIMAL_BREEDS);
		genderStatusEEnum = createEEnum(GENDER_STATUS);
		linkTypeEEnum = createEEnum(LINK_TYPE);
		patientRelationshipTypeEEnum = createEEnum(PATIENT_RELATIONSHIP_TYPE);
		quantityComparatorEEnum = createEEnum(QUANTITY_COMPARATOR);
		signatureTypeCodesEEnum = createEEnum(SIGNATURE_TYPE_CODES);
		deviceStatusEEnum = createEEnum(DEVICE_STATUS);
		unitsOfTimeEEnum = createEEnum(UNITS_OF_TIME);
		eventTimingEEnum = createEEnum(EVENT_TIMING);
		timingAbbreviationEEnum = createEEnum(TIMING_ABBREVIATION);
		moduleMetadataTypeEEnum = createEEnum(MODULE_METADATA_TYPE);
		moduleMetadataStatusEEnum = createEEnum(MODULE_METADATA_STATUS);
		moduleMetadataFocusTypeEEnum = createEEnum(MODULE_METADATA_FOCUS_TYPE);
		moduleMetadataContributorTypeEEnum = createEEnum(MODULE_METADATA_CONTRIBUTOR_TYPE);
		identityAssuranceLevelEEnum = createEEnum(IDENTITY_ASSURANCE_LEVEL);
		moduleMetadataResourceTypeEEnum = createEEnum(MODULE_METADATA_RESOURCE_TYPE);
		operationParameterUseEEnum = createEEnum(OPERATION_PARAMETER_USE);
		parameterTypesUsedInOperationDefinitionsEEnum = createEEnum(PARAMETER_TYPES_USED_IN_OPERATION_DEFINITIONS);
		conformanceResourceStatusEEnum = createEEnum(CONFORMANCE_RESOURCE_STATUS);
		contextOfUseValueSetEEnum = createEEnum(CONTEXT_OF_USE_VALUE_SET);
		structureDefinitionCodesEEnum = createEEnum(STRUCTURE_DEFINITION_CODES);
		structureDefinitionKindEEnum = createEEnum(STRUCTURE_DEFINITION_KIND);
		fhirDefinedTypeEEnum = createEEnum(FHIR_DEFINED_TYPE);
		extensionContextEEnum = createEEnum(EXTENSION_CONTEXT);
		propertyRepresentationEEnum = createEEnum(PROPERTY_REPRESENTATION);
		loincCodesEEnum = createEEnum(LOINC_CODES);
		slicingRulesEEnum = createEEnum(SLICING_RULES);
		aggregationModeEEnum = createEEnum(AGGREGATION_MODE);
		constraintSeverityEEnum = createEEnum(CONSTRAINT_SEVERITY);
		bindingStrengthEEnum = createEEnum(BINDING_STRENGTH);
		designationUseEEnum = createEEnum(DESIGNATION_USE);
		filterOperatorEEnum = createEEnum(FILTER_OPERATOR);
		groupTypeEEnum = createEEnum(GROUP_TYPE);
		snomedCtMedicationCodesEEnum = createEEnum(SNOMED_CT_MEDICATION_CODES);
		medicationFormCodesEEnum = createEEnum(MEDICATION_FORM_CODES);
		substanceCategoryCodesEEnum = createEEnum(SUBSTANCE_CATEGORY_CODES);
		substanceCodeEEnum = createEEnum(SUBSTANCE_CODE);
		snomedCtFormCodesEEnum = createEEnum(SNOMED_CT_FORM_CODES);
		v3CodeSystemParticipationModeEEnum = createEEnum(V3_CODE_SYSTEM_PARTICIPATION_MODE);
		communicationStatusEEnum = createEEnum(COMMUNICATION_STATUS);
		encounterStateEEnum = createEEnum(ENCOUNTER_STATE);
		encounterClassEEnum = createEEnum(ENCOUNTER_CLASS);
		encounterTypeEEnum = createEEnum(ENCOUNTER_TYPE);
		encounterPriorityEEnum = createEEnum(ENCOUNTER_PRIORITY);
		episodeOfCareStatusEEnum = createEEnum(EPISODE_OF_CARE_STATUS);
		conditionProblemDiagnosisCodesEEnum = createEEnum(CONDITION_PROBLEM_DIAGNOSIS_CODES);
		conditionCategoryCodesEEnum = createEEnum(CONDITION_CATEGORY_CODES);
		conditionClinicalStatusCodesEEnum = createEEnum(CONDITION_CLINICAL_STATUS_CODES);
		conditionVerificationStatusEEnum = createEEnum(CONDITION_VERIFICATION_STATUS);
		conditionDiagnosisSeverityEEnum = createEEnum(CONDITION_DIAGNOSIS_SEVERITY);
		conditionStageEEnum = createEEnum(CONDITION_STAGE);
		clinicalImpressionStatusEEnum = createEEnum(CLINICAL_IMPRESSION_STATUS);
		allergyIntoleranceSubstanceAndNegationCodesEEnum = createEEnum(ALLERGY_INTOLERANCE_SUBSTANCE_AND_NEGATION_CODES);
		allergyIntoleranceStatusEEnum = createEEnum(ALLERGY_INTOLERANCE_STATUS);
		allergyIntoleranceCriticalityEEnum = createEEnum(ALLERGY_INTOLERANCE_CRITICALITY);
		allergyIntoleranceTypeEEnum = createEEnum(ALLERGY_INTOLERANCE_TYPE);
		allergyIntoleranceCategoryEEnum = createEEnum(ALLERGY_INTOLERANCE_CATEGORY);
		allergyIntoleranceCertaintyEEnum = createEEnum(ALLERGY_INTOLERANCE_CERTAINTY);
		snomedCtManifestationCodesEEnum = createEEnum(SNOMED_CT_MANIFESTATION_CODES);
		allergyIntoleranceSeverityEEnum = createEEnum(ALLERGY_INTOLERANCE_SEVERITY);
		snomedCtRouteCodesEEnum = createEEnum(SNOMED_CT_ROUTE_CODES);
		snomedCtClinicalFindingsEEnum = createEEnum(SNOMED_CT_CLINICAL_FINDINGS);
		investigationTypeEEnum = createEEnum(INVESTIGATION_TYPE);
		observationStatusEEnum = createEEnum(OBSERVATION_STATUS);
		observationCategoryCodesEEnum = createEEnum(OBSERVATION_CATEGORY_CODES);
		observationValueAbsentReasonEEnum = createEEnum(OBSERVATION_VALUE_ABSENT_REASON);
		observationInterpretationCodesEEnum = createEEnum(OBSERVATION_INTERPRETATION_CODES);
		snomedCtBodyStructuresEEnum = createEEnum(SNOMED_CT_BODY_STRUCTURES);
		observationMethodsEEnum = createEEnum(OBSERVATION_METHODS);
		specimenStatusEEnum = createEEnum(SPECIMEN_STATUS);
		v2SpecimenTypeEEnum = createEEnum(V2_SPECIMEN_TYPE);
		specimenCollectionMethodEEnum = createEEnum(SPECIMEN_COLLECTION_METHOD);
		specimenTreatmentProcedureEEnum = createEEnum(SPECIMEN_TREATMENT_PROCEDURE);
		specimenContainerEEnum = createEEnum(SPECIMEN_CONTAINER);
		v2AdditivePreservativeEEnum = createEEnum(V2_ADDITIVE_PRESERVATIVE);
		measmntPrincipleEEnum = createEEnum(MEASMNT_PRINCIPLE);
		deviceMetricOperationalStatusEEnum = createEEnum(DEVICE_METRIC_OPERATIONAL_STATUS);
		deviceMetricColorEEnum = createEEnum(DEVICE_METRIC_COLOR);
		deviceMetricCategoryEEnum = createEEnum(DEVICE_METRIC_CATEGORY);
		deviceMetricCalibrationTypeEEnum = createEEnum(DEVICE_METRIC_CALIBRATION_TYPE);
		deviceMetricCalibrationStateEEnum = createEEnum(DEVICE_METRIC_CALIBRATION_STATE);
		observationReferenceRangeMeaningCodesEEnum = createEEnum(OBSERVATION_REFERENCE_RANGE_MEANING_CODES);
		observationRelationshipTypeEEnum = createEEnum(OBSERVATION_RELATIONSHIP_TYPE);
		questionnaireStatusEEnum = createEEnum(QUESTIONNAIRE_STATUS);
		questionnaireQuestionCodesEEnum = createEEnum(QUESTIONNAIRE_QUESTION_CODES);
		questionnaireItemTypeEEnum = createEEnum(QUESTIONNAIRE_ITEM_TYPE);
		questionnaireAnswerCodesEEnum = createEEnum(QUESTIONNAIRE_ANSWER_CODES);
		questionnaireResponseStatusEEnum = createEEnum(QUESTIONNAIRE_RESPONSE_STATUS);
		familyHistoryStatusEEnum = createEEnum(FAMILY_HISTORY_STATUS);
		familyMemberEEnum = createEEnum(FAMILY_MEMBER);
		conditionOutcomeCodesEEnum = createEEnum(CONDITION_OUTCOME_CODES);
		diagnosticReportStatusEEnum = createEEnum(DIAGNOSTIC_REPORT_STATUS);
		diagnosticServiceSectionCodesEEnum = createEEnum(DIAGNOSTIC_SERVICE_SECTION_CODES);
		loincDiagnosticReportCodesEEnum = createEEnum(LOINC_DIAGNOSTIC_REPORT_CODES);
		documentTypeValueSetEEnum = createEEnum(DOCUMENT_TYPE_VALUE_SET);
		documentClassValueSetEEnum = createEEnum(DOCUMENT_CLASS_VALUE_SET);
		documentReferenceStatusEEnum = createEEnum(DOCUMENT_REFERENCE_STATUS);
		compositionStatusEEnum = createEEnum(COMPOSITION_STATUS);
		documentRelationshipTypeEEnum = createEEnum(DOCUMENT_RELATIONSHIP_TYPE);
		documentReferenceFormatCodeSetEEnum = createEEnum(DOCUMENT_REFERENCE_FORMAT_CODE_SET);
		v3CodeSystemActCodeEEnum = createEEnum(V3_CODE_SYSTEM_ACT_CODE);
		facilityTypeCodeValueSetEEnum = createEEnum(FACILITY_TYPE_CODE_VALUE_SET);
		diagnosticOrderStatusEEnum = createEEnum(DIAGNOSTIC_ORDER_STATUS);
		diagnosticOrderPriorityEEnum = createEEnum(DIAGNOSTIC_ORDER_PRIORITY);
		diagnosticOrderEventCodesEEnum = createEEnum(DIAGNOSTIC_ORDER_EVENT_CODES);
		loincDiagnosticOrderCodesEEnum = createEEnum(LOINC_DIAGNOSTIC_ORDER_CODES);
		procedureCodessnomedCTEEnum = createEEnum(PROCEDURE_CODESSNOMED_CT);
		procedureReasonCodesEEnum = createEEnum(PROCEDURE_REASON_CODES);
		procedureRequestStatusEEnum = createEEnum(PROCEDURE_REQUEST_STATUS);
		procedureRequestPriorityEEnum = createEEnum(PROCEDURE_REQUEST_PRIORITY);
		referralStatusEEnum = createEEnum(REFERRAL_STATUS);
		acquisitionModalityCodesEEnum = createEEnum(ACQUISITION_MODALITY_CODES);
		instanceAvailabilityEEnum = createEEnum(INSTANCE_AVAILABILITY);
		procedureStatusEEnum = createEEnum(PROCEDURE_STATUS);
		procedureCategoryCodessnomedCTEEnum = createEEnum(PROCEDURE_CATEGORY_CODESSNOMED_CT);
		procedureNotPerformedReasonsnomeDCTEEnum = createEEnum(PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT);
		procedurePerformerRoleCodesEEnum = createEEnum(PROCEDURE_PERFORMER_ROLE_CODES);
		procedureOutcomeCodessnomedCTEEnum = createEEnum(PROCEDURE_OUTCOME_CODESSNOMED_CT);
		procedureFollowUpCodessnomedCTEEnum = createEEnum(PROCEDURE_FOLLOW_UP_CODESSNOMED_CT);
		carePlanStatusEEnum = createEEnum(CARE_PLAN_STATUS);
		carePlanCategoryEEnum = createEEnum(CARE_PLAN_CATEGORY);
		carePlanRelationshipEEnum = createEEnum(CARE_PLAN_RELATIONSHIP);
		participantRolesEEnum = createEEnum(PARTICIPANT_ROLES);
		goalStartEventEEnum = createEEnum(GOAL_START_EVENT);
		goalCategoryEEnum = createEEnum(GOAL_CATEGORY);
		goalStatusEEnum = createEEnum(GOAL_STATUS);
		goalStatusReasonEEnum = createEEnum(GOAL_STATUS_REASON);
		goalPriorityEEnum = createEEnum(GOAL_PRIORITY);
		medicationStatementStatusEEnum = createEEnum(MEDICATION_STATEMENT_STATUS);
		reasonMedicationNotGivenCodesEEnum = createEEnum(REASON_MEDICATION_NOT_GIVEN_CODES);
		bodysiteLocationModifierEEnum = createEEnum(BODYSITE_LOCATION_MODIFIER);
		snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum = createEEnum(SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES);
		nutritionOrderStatusEEnum = createEEnum(NUTRITION_ORDER_STATUS);
		dietEEnum = createEEnum(DIET);
		foodTypeCodesEEnum = createEEnum(FOOD_TYPE_CODES);
		dietCodesEEnum = createEEnum(DIET_CODES);
		nutrientModifierCodesEEnum = createEEnum(NUTRIENT_MODIFIER_CODES);
		textureModifierCodesEEnum = createEEnum(TEXTURE_MODIFIER_CODES);
		textureModifiedFoodTypeCodesEEnum = createEEnum(TEXTURE_MODIFIED_FOOD_TYPE_CODES);
		fluidConsistencyTypeCodesEEnum = createEEnum(FLUID_CONSISTENCY_TYPE_CODES);
		supplementTypeCodesEEnum = createEEnum(SUPPLEMENT_TYPE_CODES);
		enteralFormulaTypeCodesEEnum = createEEnum(ENTERAL_FORMULA_TYPE_CODES);
		enteralFormulaAdditiveTypeCodeEEnum = createEEnum(ENTERAL_FORMULA_ADDITIVE_TYPE_CODE);
		enteralRouteCodesEEnum = createEEnum(ENTERAL_ROUTE_CODES);
		riskProbabilityEEnum = createEEnum(RISK_PROBABILITY);
		appointmentStatusEEnum = createEEnum(APPOINTMENT_STATUS);
		encounterReasonCodesEEnum = createEEnum(ENCOUNTER_REASON_CODES);
		slotStatusEEnum = createEEnum(SLOT_STATUS);
		participantTypeEEnum = createEEnum(PARTICIPANT_TYPE);
		participantRequiredEEnum = createEEnum(PARTICIPANT_REQUIRED);
		participationStatusEEnum = createEEnum(PARTICIPATION_STATUS);
		communicationRequestStatusEEnum = createEEnum(COMMUNICATION_REQUEST_STATUS);
		deviceUseRequestStatusEEnum = createEEnum(DEVICE_USE_REQUEST_STATUS);
		deviceUseRequestPriorityEEnum = createEEnum(DEVICE_USE_REQUEST_PRIORITY);
		medicationOrderStatusEEnum = createEEnum(MEDICATION_ORDER_STATUS);
		actSubstanceAdminSubstitutionCodeEEnum = createEEnum(ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE);
		substanceAdminSubstitutionReasonEEnum = createEEnum(SUBSTANCE_ADMIN_SUBSTITUTION_REASON);
		actionListEEnum = createEEnum(ACTION_LIST);
		rulesetCodesEEnum = createEEnum(RULESET_CODES);
		supplyRequestStatusEEnum = createEEnum(SUPPLY_REQUEST_STATUS);
		supplyTypeEEnum = createEEnum(SUPPLY_TYPE);
		supplyRequestReasonEEnum = createEEnum(SUPPLY_REQUEST_REASON);
		supplyRequestWhenEEnum = createEEnum(SUPPLY_REQUEST_WHEN);
		exampleVisionPrescriptionProductCodesEEnum = createEEnum(EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES);
		visionEyesEEnum = createEEnum(VISION_EYES);
		visionBaseEEnum = createEEnum(VISION_BASE);
		carePlanActivityCategoryEEnum = createEEnum(CARE_PLAN_ACTIVITY_CATEGORY);
		carePlanActivityEEnum = createEEnum(CARE_PLAN_ACTIVITY);
		activityReasonEEnum = createEEnum(ACTIVITY_REASON);
		carePlanActivityStatusEEnum = createEEnum(CARE_PLAN_ACTIVITY_STATUS);
		procedureDeviceActionCodesEEnum = createEEnum(PROCEDURE_DEVICE_ACTION_CODES);
		lateralityEEnum = createEEnum(LATERALITY);
		koStitleEEnum = createEEnum(KO_STITLE);
		digitalMediaTypeEEnum = createEEnum(DIGITAL_MEDIA_TYPE);
		mediaSubTypeEEnum = createEEnum(MEDIA_SUB_TYPE);
		mediaCollectionViewProjectionEEnum = createEEnum(MEDIA_COLLECTION_VIEW_PROJECTION);
		manifestationAndSymptomCodesEEnum = createEEnum(MANIFESTATION_AND_SYMPTOM_CODES);
		admitSourceEEnum = createEEnum(ADMIT_SOURCE);
		specialCourtesyEEnum = createEEnum(SPECIAL_COURTESY);
		specialArrangementsEEnum = createEEnum(SPECIAL_ARRANGEMENTS);
		dischargeDispositionEEnum = createEEnum(DISCHARGE_DISPOSITION);
		encounterLocationStatusEEnum = createEEnum(ENCOUNTER_LOCATION_STATUS);
		namingSystemTypeEEnum = createEEnum(NAMING_SYSTEM_TYPE);
		namingSystemIdentifierTypeEEnum = createEEnum(NAMING_SYSTEM_IDENTIFIER_TYPE);
		conceptMapEquivalenceEEnum = createEEnum(CONCEPT_MAP_EQUIVALENCE);
		flagCategoryEEnum = createEEnum(FLAG_CATEGORY);
		flagStatusEEnum = createEEnum(FLAG_STATUS);
		flagCodeEEnum = createEEnum(FLAG_CODE);
		sequenceTypeEEnum = createEEnum(SEQUENCE_TYPE);
		dbSnpEEnum = createEEnum(DB_SNP);
		ensemblEEnum = createEEnum(ENSEMBL);
		loinc530345AnswerlistEEnum = createEEnum(LOINC530345_ANSWERLIST);
		contractTypeCodesEEnum = createEEnum(CONTRACT_TYPE_CODES);
		contractSubtypeCodesEEnum = createEEnum(CONTRACT_SUBTYPE_CODES);
		contractActionCodesEEnum = createEEnum(CONTRACT_ACTION_CODES);
		purposeOfUseEEnum = createEEnum(PURPOSE_OF_USE);
		contractActorRoleCodesEEnum = createEEnum(CONTRACT_ACTOR_ROLE_CODES);
		contractSignerTypeCodesEEnum = createEEnum(CONTRACT_SIGNER_TYPE_CODES);
		contractTermTypeCodesEEnum = createEEnum(CONTRACT_TERM_TYPE_CODES);
		contractTermSubTypeCodesEEnum = createEEnum(CONTRACT_TERM_SUB_TYPE_CODES);
		fhirDocumentTypeCodesEEnum = createEEnum(FHIR_DOCUMENT_TYPE_CODES);
		fhirDocumentClassCodesEEnum = createEEnum(FHIR_DOCUMENT_CLASS_CODES);
		v3CodeSystemConfidentialityEEnum = createEEnum(V3_CODE_SYSTEM_CONFIDENTIALITY);
		compositionAttestationModeEEnum = createEEnum(COMPOSITION_ATTESTATION_MODE);
		documentSectionCodesEEnum = createEEnum(DOCUMENT_SECTION_CODES);
		listModeEEnum = createEEnum(LIST_MODE);
		listOrderCodesEEnum = createEEnum(LIST_ORDER_CODES);
		listEmptyReasonsEEnum = createEEnum(LIST_EMPTY_REASONS);
		remittanceOutcomeEEnum = createEEnum(REMITTANCE_OUTCOME);
		paymentTypeCodesEEnum = createEEnum(PAYMENT_TYPE_CODES);
		formCodesEEnum = createEEnum(FORM_CODES);
		noteTypeEEnum = createEEnum(NOTE_TYPE);
		conformanceStatementKindEEnum = createEEnum(CONFORMANCE_STATEMENT_KIND);
		unknownContentCodeEEnum = createEEnum(UNKNOWN_CONTENT_CODE);
		restfulConformanceModeEEnum = createEEnum(RESTFUL_CONFORMANCE_MODE);
		restfulSecurityServiceEEnum = createEEnum(RESTFUL_SECURITY_SERVICE);
		typeRestfulInteractionEEnum = createEEnum(TYPE_RESTFUL_INTERACTION);
		resourceVersionPolicyEEnum = createEEnum(RESOURCE_VERSION_POLICY);
		conditionalDeleteStatusEEnum = createEEnum(CONDITIONAL_DELETE_STATUS);
		searchParamTypeEEnum = createEEnum(SEARCH_PARAM_TYPE);
		searchModifierCodeEEnum = createEEnum(SEARCH_MODIFIER_CODE);
		systemRestfulInteractionEEnum = createEEnum(SYSTEM_RESTFUL_INTERACTION);
		transactionModeEEnum = createEEnum(TRANSACTION_MODE);
		operationKindEEnum = createEEnum(OPERATION_KIND);
		messageTransportEEnum = createEEnum(MESSAGE_TRANSPORT);
		messageEventEEnum = createEEnum(MESSAGE_EVENT);
		messageSignificanceCategoryEEnum = createEEnum(MESSAGE_SIGNIFICANCE_CATEGORY);
		conformanceEventModeEEnum = createEEnum(CONFORMANCE_EVENT_MODE);
		documentModeEEnum = createEEnum(DOCUMENT_MODE);
		profileOriginTypeEEnum = createEEnum(PROFILE_ORIGIN_TYPE);
		profileDestinationTypeEEnum = createEEnum(PROFILE_DESTINATION_TYPE);
		testScriptOperationCodesEEnum = createEEnum(TEST_SCRIPT_OPERATION_CODES);
		contentTypeEEnum = createEEnum(CONTENT_TYPE);
		assertionDirectionTypeEEnum = createEEnum(ASSERTION_DIRECTION_TYPE);
		assertionOperatorTypeEEnum = createEEnum(ASSERTION_OPERATOR_TYPE);
		assertionResponseTypesEEnum = createEEnum(ASSERTION_RESPONSE_TYPES);
		dataElementStringencyEEnum = createEEnum(DATA_ELEMENT_STRINGENCY);
		decisionSupportRuleTriggerTypeEEnum = createEEnum(DECISION_SUPPORT_RULE_TRIGGER_TYPE);
		decisionSupportRuleParticipantTypeEEnum = createEEnum(DECISION_SUPPORT_RULE_PARTICIPANT_TYPE);
		decisionSupportRuleActionTypeEEnum = createEEnum(DECISION_SUPPORT_RULE_ACTION_TYPE);
		responseTypeEEnum = createEEnum(RESPONSE_TYPE);
		issueSeverityEEnum = createEEnum(ISSUE_SEVERITY);
		issueTypeEEnum = createEEnum(ISSUE_TYPE);
		operationOutcomeCodesEEnum = createEEnum(OPERATION_OUTCOME_CODES);
		exampleMessageReasonCodesEEnum = createEEnum(EXAMPLE_MESSAGE_REASON_CODES);
		subscriptionStatusEEnum = createEEnum(SUBSCRIPTION_STATUS);
		subscriptionChannelTypeEEnum = createEEnum(SUBSCRIPTION_CHANNEL_TYPE);
		subscriptionTagEEnum = createEEnum(SUBSCRIPTION_TAG);
		actCoverageTypeCodeEEnum = createEEnum(ACT_COVERAGE_TYPE_CODE);
		relationshipCodesEEnum = createEEnum(RELATIONSHIP_CODES);
		vaccineAdministeredValueSetEEnum = createEEnum(VACCINE_ADMINISTERED_VALUE_SET);
		immunizationRecommendationStatusCodesEEnum = createEEnum(IMMUNIZATION_RECOMMENDATION_STATUS_CODES);
		immunizationRecommendationDateCriterionCodesEEnum = createEEnum(IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES);
		medicationAdministrationStatusEEnum = createEEnum(MEDICATION_ADMINISTRATION_STATUS);
		codesForImmunizationSiteOfAdministrationEEnum = createEEnum(CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION);
		immunizationRouteCodesEEnum = createEEnum(IMMUNIZATION_ROUTE_CODES);
		immunizationReasonCodesEEnum = createEEnum(IMMUNIZATION_REASON_CODES);
		immunizationReasonsForNotImmunizingCodesEEnum = createEEnum(IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES);
		vaccinationProtocolDoseTargetCodesEEnum = createEEnum(VACCINATION_PROTOCOL_DOSE_TARGET_CODES);
		vaccinationProtocolDoseStatusCodesEEnum = createEEnum(VACCINATION_PROTOCOL_DOSE_STATUS_CODES);
		vaccinationProtocolDoseStatusReasonCodesEEnum = createEEnum(VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES);
		bundleTypeEEnum = createEEnum(BUNDLE_TYPE);
		searchEntryModeEEnum = createEEnum(SEARCH_ENTRY_MODE);
		httpVerbEEnum = createEEnum(HTTP_VERB);
		priorityCodesEEnum = createEEnum(PRIORITY_CODES);
		benefitCategoryCodesEEnum = createEEnum(BENEFIT_CATEGORY_CODES);
		benefitSubCategoryCodesEEnum = createEEnum(BENEFIT_SUB_CATEGORY_CODES);
		networkTypeCodesEEnum = createEEnum(NETWORK_TYPE_CODES);
		unitTypeCodesEEnum = createEEnum(UNIT_TYPE_CODES);
		benefitTermCodesEEnum = createEEnum(BENEFIT_TERM_CODES);
		benefitTypeCodesEEnum = createEEnum(BENEFIT_TYPE_CODES);
		adjudicationErrorCodesEEnum = createEEnum(ADJUDICATION_ERROR_CODES);
		medicationDispenseStatusEEnum = createEEnum(MEDICATION_DISPENSE_STATUS);
		actPharmacySupplyTypeEEnum = createEEnum(ACT_PHARMACY_SUPPLY_TYPE);
		claimTypeEEnum = createEEnum(CLAIM_TYPE);
		useEEnum = createEEnum(USE);
		fundsReservationCodesEEnum = createEEnum(FUNDS_RESERVATION_CODES);
		payeeTypeCodesEEnum = createEEnum(PAYEE_TYPE_CODES);
		icD10CodesEEnum = createEEnum(IC_D10_CODES);
		conditionsCodesEEnum = createEEnum(CONDITIONS_CODES);
		exceptionCodesEEnum = createEEnum(EXCEPTION_CODES);
		actIncidentCodeEEnum = createEEnum(ACT_INCIDENT_CODE);
		interventionCodesEEnum = createEEnum(INTERVENTION_CODES);
		actInvoiceGroupCodeEEnum = createEEnum(ACT_INVOICE_GROUP_CODE);
		usclsCodesEEnum = createEEnum(USCLS_CODES);
		exampleServicePlaceCodesEEnum = createEEnum(EXAMPLE_SERVICE_PLACE_CODES);
		udiCodesEEnum = createEEnum(UDI_CODES);
		toothCodesEEnum = createEEnum(TOOTH_CODES);
		surfaceCodesEEnum = createEEnum(SURFACE_CODES);
		modifierTypeCodesEEnum = createEEnum(MODIFIER_TYPE_CODES);
		oralProsthoMaterialTypeCodesEEnum = createEEnum(ORAL_PROSTHO_MATERIAL_TYPE_CODES);
		additionalMaterialCodesEEnum = createEEnum(ADDITIONAL_MATERIAL_CODES);
		teethCodesEEnum = createEEnum(TEETH_CODES);
		missingToothReasonCodesEEnum = createEEnum(MISSING_TOOTH_REASON_CODES);
		adjudicationCodesEEnum = createEEnum(ADJUDICATION_CODES);
		paymentAdjustmentReasonCodesEEnum = createEEnum(PAYMENT_ADJUSTMENT_REASON_CODES);
		adjudicationReasonCodesEEnum = createEEnum(ADJUDICATION_REASON_CODES);
		guideDependencyTypeEEnum = createEEnum(GUIDE_DEPENDENCY_TYPE);
		guideResourcePurposeEEnum = createEEnum(GUIDE_RESOURCE_PURPOSE);
		guidePageKindEEnum = createEEnum(GUIDE_PAGE_KIND);
		xPathUsageTypeEEnum = createEEnum(XPATH_USAGE_TYPE);
		orderSetParticipantTypeEEnum = createEEnum(ORDER_SET_PARTICIPANT_TYPE);
		orderSetItemTypeEEnum = createEEnum(ORDER_SET_ITEM_TYPE);
		orderSetItemGroupingBehaviorEEnum = createEEnum(ORDER_SET_ITEM_GROUPING_BEHAVIOR);
		orderSetItemSelectionBehaviorEEnum = createEEnum(ORDER_SET_ITEM_SELECTION_BEHAVIOR);
		orderSetItemRequiredBehaviorEEnum = createEEnum(ORDER_SET_ITEM_REQUIRED_BEHAVIOR);
		orderSetItemPrecheckBehaviorEEnum = createEEnum(ORDER_SET_ITEM_PRECHECK_BEHAVIOR);
		orderSetItemCardinalityBehaviorEEnum = createEEnum(ORDER_SET_ITEM_CARDINALITY_BEHAVIOR);
		provenanceEventCurrentStateEEnum = createEEnum(PROVENANCE_EVENT_CURRENT_STATE);
		provenanceParticipantRoleEEnum = createEEnum(PROVENANCE_PARTICIPANT_ROLE);
		v3CodeSystemRoleLinkTypeEEnum = createEEnum(V3_CODE_SYSTEM_ROLE_LINK_TYPE);
		provenanceEntityRoleEEnum = createEEnum(PROVENANCE_ENTITY_ROLE);
		processOutcomeCodesEEnum = createEEnum(PROCESS_OUTCOME_CODES);
		measurePopulationTypeEEnum = createEEnum(MEASURE_POPULATION_TYPE);
		paymentStatusCodesEEnum = createEEnum(PAYMENT_STATUS_CODES);
		exampleUseCodesForListEEnum = createEEnum(EXAMPLE_USE_CODES_FOR_LIST);
		listStatusEEnum = createEEnum(LIST_STATUS);
		patientMedicineChangeTypesEEnum = createEEnum(PATIENT_MEDICINE_CHANGE_TYPES);
		guidanceResponseStatusEEnum = createEEnum(GUIDANCE_RESPONSE_STATUS);
		guidanceResponseActionTypeEEnum = createEEnum(GUIDANCE_RESPONSE_ACTION_TYPE);
		detectedIssueCategoryEEnum = createEEnum(DETECTED_ISSUE_CATEGORY);
		detectedIssueSeverityEEnum = createEEnum(DETECTED_ISSUE_SEVERITY);
		detectedIssueMitigationActionEEnum = createEEnum(DETECTED_ISSUE_MITIGATION_ACTION);
		accountStatusEEnum = createEEnum(ACCOUNT_STATUS);
		reasonMedicationGivenCodesEEnum = createEEnum(REASON_MEDICATION_GIVEN_CODES);
		participantStatusEEnum = createEEnum(PARTICIPANT_STATUS);
		auditEventIdEEnum = createEEnum(AUDIT_EVENT_ID);
		auditEventSubTypeEEnum = createEEnum(AUDIT_EVENT_SUB_TYPE);
		auditEventActionEEnum = createEEnum(AUDIT_EVENT_ACTION);
		auditEventOutcomeEEnum = createEEnum(AUDIT_EVENT_OUTCOME);
		auditActiveParticipantRoleIdCodeEEnum = createEEnum(AUDIT_ACTIVE_PARTICIPANT_ROLE_ID_CODE);
		mediaTypeCodeEEnum = createEEnum(MEDIA_TYPE_CODE);
		auditEventParticipantNetworkTypeEEnum = createEEnum(AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE);
		auditEventSourceTypeEEnum = createEEnum(AUDIT_EVENT_SOURCE_TYPE);
		auditEventObjectTypeEEnum = createEEnum(AUDIT_EVENT_OBJECT_TYPE);
		auditEventObjectRoleEEnum = createEEnum(AUDIT_EVENT_OBJECT_ROLE);
		auditEventObjectLifecycleEEnum = createEEnum(AUDIT_EVENT_OBJECT_LIFECYCLE);
		basicResourceTypesEEnum = createEEnum(BASIC_RESOURCE_TYPES);
		orderStatusEEnum = createEEnum(ORDER_STATUS);
		supplyDeliveryStatusEEnum = createEEnum(SUPPLY_DELIVERY_STATUS);
		supplyItemTypeEEnum = createEEnum(SUPPLY_ITEM_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.ADDRESS);
		addEEnumLiteral(dataTypeEEnum, DataType.AGE);
		addEEnumLiteral(dataTypeEEnum, DataType.ANNOTATION);
		addEEnumLiteral(dataTypeEEnum, DataType.ATTACHMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.BACKBONE_ELEMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.CODEABLE_CONCEPT);
		addEEnumLiteral(dataTypeEEnum, DataType.CODING);
		addEEnumLiteral(dataTypeEEnum, DataType.CONTACT_POINT);
		addEEnumLiteral(dataTypeEEnum, DataType.COUNT);
		addEEnumLiteral(dataTypeEEnum, DataType.DISTANCE);
		addEEnumLiteral(dataTypeEEnum, DataType.DURATION);
		addEEnumLiteral(dataTypeEEnum, DataType.ELEMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.ELEMENT_DEFINITION);
		addEEnumLiteral(dataTypeEEnum, DataType.EXTENSION);
		addEEnumLiteral(dataTypeEEnum, DataType.HUMAN_NAME);
		addEEnumLiteral(dataTypeEEnum, DataType.IDENTIFIER);
		addEEnumLiteral(dataTypeEEnum, DataType.META);
		addEEnumLiteral(dataTypeEEnum, DataType.MONEY);
		addEEnumLiteral(dataTypeEEnum, DataType.NARRATIVE);
		addEEnumLiteral(dataTypeEEnum, DataType.PERIOD);
		addEEnumLiteral(dataTypeEEnum, DataType.QUANTITY);
		addEEnumLiteral(dataTypeEEnum, DataType.RANGE);
		addEEnumLiteral(dataTypeEEnum, DataType.RATIO);
		addEEnumLiteral(dataTypeEEnum, DataType.REFERENCE);
		addEEnumLiteral(dataTypeEEnum, DataType.SAMPLED_DATA);
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNATURE);
		addEEnumLiteral(dataTypeEEnum, DataType.SIMPLE_QUANTITY);
		addEEnumLiteral(dataTypeEEnum, DataType.TIMING);
		addEEnumLiteral(dataTypeEEnum, DataType.BASE64_BINARY);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.CODE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE_TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.DECIMAL);
		addEEnumLiteral(dataTypeEEnum, DataType.ID);
		addEEnumLiteral(dataTypeEEnum, DataType.INSTANT);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.MARKDOWN);
		addEEnumLiteral(dataTypeEEnum, DataType.OID);
		addEEnumLiteral(dataTypeEEnum, DataType.POSITIVE_INT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_INT);
		addEEnumLiteral(dataTypeEEnum, DataType.URI);
		addEEnumLiteral(dataTypeEEnum, DataType.UUID);
		addEEnumLiteral(dataTypeEEnum, DataType.XHTML);

		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ACCOUNT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ALLERGY_INTOLERANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.APPOINTMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.APPOINTMENT_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.AUDIT_EVENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BASIC);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BINARY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BODY_SITE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BUNDLE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CARE_PLAN);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLAIM);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLAIM_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLINICAL_IMPRESSION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMMUNICATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMMUNICATION_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMPOSITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONCEPT_MAP);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONDITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONFORMANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONTRACT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COVERAGE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DATA_ELEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DECISION_SUPPORT_RULE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DECISION_SUPPORT_SERVICE_MODULE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DETECTED_ISSUE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_COMPONENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_METRIC);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_USE_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_USE_STATEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DIAGNOSTIC_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DIAGNOSTIC_REPORT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOCUMENT_MANIFEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOCUMENT_REFERENCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOMAIN_RESOURCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ELIGIBILITY_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ELIGIBILITY_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENCOUNTER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENROLLMENT_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENROLLMENT_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EPISODE_OF_CARE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EXPANSION_PROFILE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EXPLANATION_OF_BENEFIT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FAMILY_MEMBER_HISTORY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FLAG);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.GOAL);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.GROUP);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.GUIDANCE_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.HEALTHCARE_SERVICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMAGING_OBJECT_SELECTION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMAGING_STUDY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMMUNIZATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMMUNIZATION_RECOMMENDATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMPLEMENTATION_GUIDE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.LIBRARY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.LIST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.LOCATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEASURE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDIA);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_ADMINISTRATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_DISPENSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_STATEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MESSAGE_HEADER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MODULE_DEFINITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MODULE_METADATA);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NAMING_SYSTEM);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NUTRITION_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OBSERVATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OPERATION_DEFINITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OPERATION_OUTCOME);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORDER_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORDER_SET);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORGANIZATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PARAMETERS);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PATIENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PAYMENT_NOTICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PAYMENT_RECONCILIATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PERSON);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PRACTITIONER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCEDURE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCEDURE_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCESS_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCESS_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROVENANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.QUESTIONNAIRE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.QUESTIONNAIRE_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.REFERRAL_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RELATED_PERSON);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RESOURCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RISK_ASSESSMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SCHEDULE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SEARCH_PARAMETER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SEQUENCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SLOT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SPECIMEN);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.STRUCTURE_DEFINITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUBSCRIPTION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUBSTANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUPPLY_DELIVERY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUPPLY_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.TEST_SCRIPT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.VALUE_SET);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.VISION_PRESCRIPTION);

		initEEnum(allSecurityLabelsEEnum, AllSecurityLabels.class, "AllSecurityLabels");

		initEEnum(narrativeStatusEEnum, NarrativeStatus.class, "NarrativeStatus");
		addEEnumLiteral(narrativeStatusEEnum, NarrativeStatus.GENERATED);
		addEEnumLiteral(narrativeStatusEEnum, NarrativeStatus.EXTENSIONS);
		addEEnumLiteral(narrativeStatusEEnum, NarrativeStatus.ADDITIONAL);
		addEEnumLiteral(narrativeStatusEEnum, NarrativeStatus.EMPTY);

		initEEnum(identifierUseEEnum, IdentifierUse.class, "IdentifierUse");
		addEEnumLiteral(identifierUseEEnum, IdentifierUse.USUAL);
		addEEnumLiteral(identifierUseEEnum, IdentifierUse.OFFICIAL);
		addEEnumLiteral(identifierUseEEnum, IdentifierUse.TEMP);
		addEEnumLiteral(identifierUseEEnum, IdentifierUse.SECONDARY);

		initEEnum(identifierTypeCodesEEnum, IdentifierTypeCodes.class, "IdentifierTypeCodes");
		addEEnumLiteral(identifierTypeCodesEEnum, IdentifierTypeCodes.UDI);
		addEEnumLiteral(identifierTypeCodesEEnum, IdentifierTypeCodes.SNO);
		addEEnumLiteral(identifierTypeCodesEEnum, IdentifierTypeCodes.SB);
		addEEnumLiteral(identifierTypeCodesEEnum, IdentifierTypeCodes.PLAC);
		addEEnumLiteral(identifierTypeCodesEEnum, IdentifierTypeCodes.FILL);

		initEEnum(organizationTypeEEnum, OrganizationType.class, "OrganizationType");
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.PROV);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.DEPT);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.TEAM);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.GOVT);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.INS);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.EDU);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.RELI);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.CRS);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.CG);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.BUS);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.OTHER);

		initEEnum(contactPointSystemEEnum, ContactPointSystem.class, "ContactPointSystem");
		addEEnumLiteral(contactPointSystemEEnum, ContactPointSystem.PHONE);
		addEEnumLiteral(contactPointSystemEEnum, ContactPointSystem.FAX);
		addEEnumLiteral(contactPointSystemEEnum, ContactPointSystem.EMAIL);
		addEEnumLiteral(contactPointSystemEEnum, ContactPointSystem.PAGER);
		addEEnumLiteral(contactPointSystemEEnum, ContactPointSystem.OTHER);

		initEEnum(contactPointUseEEnum, ContactPointUse.class, "ContactPointUse");
		addEEnumLiteral(contactPointUseEEnum, ContactPointUse.HOME);
		addEEnumLiteral(contactPointUseEEnum, ContactPointUse.WORK);
		addEEnumLiteral(contactPointUseEEnum, ContactPointUse.TEMP);
		addEEnumLiteral(contactPointUseEEnum, ContactPointUse.OLD);
		addEEnumLiteral(contactPointUseEEnum, ContactPointUse.MOBILE);

		initEEnum(addressUseEEnum, AddressUse.class, "AddressUse");
		addEEnumLiteral(addressUseEEnum, AddressUse.HOME);
		addEEnumLiteral(addressUseEEnum, AddressUse.WORK);
		addEEnumLiteral(addressUseEEnum, AddressUse.TEMP);
		addEEnumLiteral(addressUseEEnum, AddressUse.OLD);

		initEEnum(addressTypeEEnum, AddressType.class, "AddressType");
		addEEnumLiteral(addressTypeEEnum, AddressType.POSTAL);
		addEEnumLiteral(addressTypeEEnum, AddressType.PHYSICAL);
		addEEnumLiteral(addressTypeEEnum, AddressType.BOTH);

		initEEnum(contactEntityTypeEEnum, ContactEntityType.class, "ContactEntityType");
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.BILL);
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.ADMIN);
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.HR);
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.PAYOR);
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.PATINF);
		addEEnumLiteral(contactEntityTypeEEnum, ContactEntityType.PRESS);

		initEEnum(nameUseEEnum, NameUse.class, "NameUse");
		addEEnumLiteral(nameUseEEnum, NameUse.USUAL);
		addEEnumLiteral(nameUseEEnum, NameUse.OFFICIAL);
		addEEnumLiteral(nameUseEEnum, NameUse.TEMP);
		addEEnumLiteral(nameUseEEnum, NameUse.NICKNAME);
		addEEnumLiteral(nameUseEEnum, NameUse.ANONYMOUS);
		addEEnumLiteral(nameUseEEnum, NameUse.OLD);
		addEEnumLiteral(nameUseEEnum, NameUse.MAIDEN);

		initEEnum(administrativeGenderEEnum, AdministrativeGender.class, "AdministrativeGender");
		addEEnumLiteral(administrativeGenderEEnum, AdministrativeGender.MALE);
		addEEnumLiteral(administrativeGenderEEnum, AdministrativeGender.FEMALE);
		addEEnumLiteral(administrativeGenderEEnum, AdministrativeGender.OTHER);
		addEEnumLiteral(administrativeGenderEEnum, AdministrativeGender.UNKNOWN);

		initEEnum(practitionerRoleEEnum, PractitionerRole.class, "PractitionerRole");
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.DOCTOR);
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.NURSE);
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.PHARMACIST);
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.RESEARCHER);
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.TEACHER);
		addEEnumLiteral(practitionerRoleEEnum, PractitionerRole.ICT);

		initEEnum(practitionerSpecialtyEEnum, PractitionerSpecialty.class, "PractitionerSpecialty");
		addEEnumLiteral(practitionerSpecialtyEEnum, PractitionerSpecialty.CARDIO);
		addEEnumLiteral(practitionerSpecialtyEEnum, PractitionerSpecialty.DENT);
		addEEnumLiteral(practitionerSpecialtyEEnum, PractitionerSpecialty.DIETARY);
		addEEnumLiteral(practitionerSpecialtyEEnum, PractitionerSpecialty.MIDW);
		addEEnumLiteral(practitionerSpecialtyEEnum, PractitionerSpecialty.SYSARCH);

		initEEnum(locationStatusEEnum, LocationStatus.class, "LocationStatus");
		addEEnumLiteral(locationStatusEEnum, LocationStatus.ACTIVE);
		addEEnumLiteral(locationStatusEEnum, LocationStatus.SUSPENDED);
		addEEnumLiteral(locationStatusEEnum, LocationStatus.INACTIVE);

		initEEnum(locationModeEEnum, LocationMode.class, "LocationMode");
		addEEnumLiteral(locationModeEEnum, LocationMode.INSTANCE);
		addEEnumLiteral(locationModeEEnum, LocationMode.KIND);

		initEEnum(serviceDeliveryLocationRoleTypeEEnum, ServiceDeliveryLocationRoleType.class, "ServiceDeliveryLocationRoleType");

		initEEnum(locationTypeEEnum, LocationType.class, "LocationType");
		addEEnumLiteral(locationTypeEEnum, LocationType.BU);
		addEEnumLiteral(locationTypeEEnum, LocationType.WI);
		addEEnumLiteral(locationTypeEEnum, LocationType.LVL);
		addEEnumLiteral(locationTypeEEnum, LocationType.CO);
		addEEnumLiteral(locationTypeEEnum, LocationType.RO);
		addEEnumLiteral(locationTypeEEnum, LocationType.BD);
		addEEnumLiteral(locationTypeEEnum, LocationType.VE);
		addEEnumLiteral(locationTypeEEnum, LocationType.HO);
		addEEnumLiteral(locationTypeEEnum, LocationType.CA);
		addEEnumLiteral(locationTypeEEnum, LocationType.RD);
		addEEnumLiteral(locationTypeEEnum, LocationType.JDN);
		addEEnumLiteral(locationTypeEEnum, LocationType.AREA);

		initEEnum(practiceSettingCodeValueSetEEnum, PracticeSettingCodeValueSet.class, "PracticeSettingCodeValueSet");

		initEEnum(serviceProvisionConditionsEEnum, ServiceProvisionConditions.class, "ServiceProvisionConditions");
		addEEnumLiteral(serviceProvisionConditionsEEnum, ServiceProvisionConditions.FREE);
		addEEnumLiteral(serviceProvisionConditionsEEnum, ServiceProvisionConditions.DISC);
		addEEnumLiteral(serviceProvisionConditionsEEnum, ServiceProvisionConditions.COST);

		initEEnum(referralMethodEEnum, ReferralMethod.class, "ReferralMethod");
		addEEnumLiteral(referralMethodEEnum, ReferralMethod.FAX);
		addEEnumLiteral(referralMethodEEnum, ReferralMethod.PHONE);
		addEEnumLiteral(referralMethodEEnum, ReferralMethod.ELEC);
		addEEnumLiteral(referralMethodEEnum, ReferralMethod.SEMAIL);
		addEEnumLiteral(referralMethodEEnum, ReferralMethod.MAIL);

		initEEnum(daysOfWeekEEnum, DaysOfWeek.class, "DaysOfWeek");
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.MON);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.TUE);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.WED);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.THU);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.FRI);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.SAT);
		addEEnumLiteral(daysOfWeekEEnum, DaysOfWeek.SUN);

		initEEnum(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12.class, "AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12");
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._100000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._111399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121216);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121217);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121218);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121221);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121316);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121317);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121318);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121321);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121322);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._121411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._130000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._131100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._131111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._131112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._132511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._133611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._134499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._135100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._135111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._135112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._135199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._139999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._140000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._141999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._142116);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._149999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._200000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._210000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._211499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212316);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212317);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212318);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212415);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212416);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._212499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._220000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._221214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._222312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._223311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._224999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._225499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._230000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._231299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._232611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233600);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233612);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._233999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234517);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234518);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._234999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._240000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._241599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._242000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._242100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._242111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._242112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._242211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._249311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._250000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._251999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._252712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253316);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253317);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253318);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253321);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253322);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253323);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253324);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253517);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253518);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253521);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._253999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254415);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254416);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254417);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254418);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254421);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254422);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254423);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254424);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._254499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._260000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._261399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._262100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._262111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._262112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._262113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._263312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._270000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._271311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272600);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272612);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._272613);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._300000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._310000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._311499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312116);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._312999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._313214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._320000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._321214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._322313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323316);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._323412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._324311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._330000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._331213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._332000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._332111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._332211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._333411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._334115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._340000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._341100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._341111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._341112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._341113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._342414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._351411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._360000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._361311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._362411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._390000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._391111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._392312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._393311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._394299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399517);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399917);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._399999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._400000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411713);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411714);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411715);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._411716);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._420000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._421100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._421111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._421112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._421113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._421114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._422100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._422111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._422112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._422115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._422116);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._423413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._431999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._440000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._441312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442216);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442217);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._442299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._450000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451600);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451612);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451799);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451800);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451811);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451812);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451813);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._451899);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452216);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452217);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452315);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452316);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452317);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452318);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452321);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452322);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452323);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._452499);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._500000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._510000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._511100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._511111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._511112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._512000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._512111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._512200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._512211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._512299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._521000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._521111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._521200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._521211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._521212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._530000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._531111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._532100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._532111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._532112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._532113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._540000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._541000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._541100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._541111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._541112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._541211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._542100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._542111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._542112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._542113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._542114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._550000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._551311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._552314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._561999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._590000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591116);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._591212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599517);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599518);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599521);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599600);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599612);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599613);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._599999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._600000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._610000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611314);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._611399);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._612115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621713);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._621999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._630000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._631100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._631111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._631112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._639911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._700000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._710000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711713);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711714);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711715);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711716);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711799);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._711999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712917);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712918);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712921);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712922);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._712999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721216);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._721999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._730000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._731312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._732111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._733115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._741111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._800000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811600);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811612);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._811699);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821700);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821712);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821713);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821714);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._821915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._830000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831116);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831117);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831118);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._831313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832114);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832115);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832199);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._832211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839917);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._839999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841213);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841214);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841215);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841216);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841300);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841312);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841313);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841513);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841514);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841515);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841516);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841517);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841599);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._841999);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851299);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._851311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._890000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891100);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891112);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891113);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._891211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899000);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899111);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899200);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899211);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899212);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899311);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899400);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899411);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899412);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899413);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899414);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899415);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899500);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899511);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899512);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899611);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899711);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899900);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899911);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899912);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899913);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899914);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899915);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899916);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899917);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899918);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899921);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899922);
		addEEnumLiteral(anzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12EEnum, AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12._899999);

		initEEnum(maritalStatusCodesEEnum, MaritalStatusCodes.class, "MaritalStatusCodes");
		addEEnumLiteral(maritalStatusCodesEEnum, MaritalStatusCodes.U);

		initEEnum(patientContactRelationshipEEnum, PatientContactRelationship.class, "PatientContactRelationship");
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.EMERGENCY);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.FAMILY);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.GUARDIAN);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.FRIEND);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.PARTNER);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.WORK);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.CAREGIVER);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.AGENT);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.GUARANTOR);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.OWNER);
		addEEnumLiteral(patientContactRelationshipEEnum, PatientContactRelationship.PARENT);

		initEEnum(animalSpeciesEEnum, AnimalSpecies.class, "AnimalSpecies");
		addEEnumLiteral(animalSpeciesEEnum, AnimalSpecies.CANISLF);
		addEEnumLiteral(animalSpeciesEEnum, AnimalSpecies.OVISA);
		addEEnumLiteral(animalSpeciesEEnum, AnimalSpecies.SERINUSCD);

		initEEnum(animalBreedsEEnum, AnimalBreeds.class, "AnimalBreeds");
		addEEnumLiteral(animalBreedsEEnum, AnimalBreeds.GSD);
		addEEnumLiteral(animalBreedsEEnum, AnimalBreeds.IRT);
		addEEnumLiteral(animalBreedsEEnum, AnimalBreeds.TIBMAS);
		addEEnumLiteral(animalBreedsEEnum, AnimalBreeds.GRET);

		initEEnum(genderStatusEEnum, GenderStatus.class, "GenderStatus");
		addEEnumLiteral(genderStatusEEnum, GenderStatus.NEUTERED);
		addEEnumLiteral(genderStatusEEnum, GenderStatus.INTACT);
		addEEnumLiteral(genderStatusEEnum, GenderStatus.UNKNOWN);

		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.REPLACE);
		addEEnumLiteral(linkTypeEEnum, LinkType.REFER);
		addEEnumLiteral(linkTypeEEnum, LinkType.SEEALSO);

		initEEnum(patientRelationshipTypeEEnum, PatientRelationshipType.class, "PatientRelationshipType");

		initEEnum(quantityComparatorEEnum, QuantityComparator.class, "QuantityComparator");
		addEEnumLiteral(quantityComparatorEEnum, QuantityComparator.LESS_THAN);
		addEEnumLiteral(quantityComparatorEEnum, QuantityComparator.LESS_THAN_OR_EQUAL);
		addEEnumLiteral(quantityComparatorEEnum, QuantityComparator.GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(quantityComparatorEEnum, QuantityComparator.GREATER_THAN);

		initEEnum(signatureTypeCodesEEnum, SignatureTypeCodes.class, "SignatureTypeCodes");
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511211);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511212);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511213);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511214);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511215);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511216);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511217);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511218);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._128401006511219);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112110);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112111);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112112);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112113);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112114);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112115);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112116);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112117);
		addEEnumLiteral(signatureTypeCodesEEnum, SignatureTypeCodes._1284010065112118);

		initEEnum(deviceStatusEEnum, DeviceStatus.class, "DeviceStatus");
		addEEnumLiteral(deviceStatusEEnum, DeviceStatus.AVAILABLE);
		addEEnumLiteral(deviceStatusEEnum, DeviceStatus.NOTAVAILABLE);
		addEEnumLiteral(deviceStatusEEnum, DeviceStatus.ENTEREDINERROR);

		initEEnum(unitsOfTimeEEnum, UnitsOfTime.class, "UnitsOfTime");

		initEEnum(eventTimingEEnum, EventTiming.class, "EventTiming");

		initEEnum(timingAbbreviationEEnum, TimingAbbreviation.class, "TimingAbbreviation");
		addEEnumLiteral(timingAbbreviationEEnum, TimingAbbreviation.QD);
		addEEnumLiteral(timingAbbreviationEEnum, TimingAbbreviation.QOD);
		addEEnumLiteral(timingAbbreviationEEnum, TimingAbbreviation.Q4H);
		addEEnumLiteral(timingAbbreviationEEnum, TimingAbbreviation.Q6H);

		initEEnum(moduleMetadataTypeEEnum, ModuleMetadataType.class, "ModuleMetadataType");
		addEEnumLiteral(moduleMetadataTypeEEnum, ModuleMetadataType.MODULE);
		addEEnumLiteral(moduleMetadataTypeEEnum, ModuleMetadataType.LIBRARY);
		addEEnumLiteral(moduleMetadataTypeEEnum, ModuleMetadataType.DECISIONSUPPORTRULE);
		addEEnumLiteral(moduleMetadataTypeEEnum, ModuleMetadataType.DOCUMENTATIONTEMPLATE);
		addEEnumLiteral(moduleMetadataTypeEEnum, ModuleMetadataType.ORDERSET);

		initEEnum(moduleMetadataStatusEEnum, ModuleMetadataStatus.class, "ModuleMetadataStatus");
		addEEnumLiteral(moduleMetadataStatusEEnum, ModuleMetadataStatus.DRAFT);
		addEEnumLiteral(moduleMetadataStatusEEnum, ModuleMetadataStatus.TEST);
		addEEnumLiteral(moduleMetadataStatusEEnum, ModuleMetadataStatus.ACTIVE);
		addEEnumLiteral(moduleMetadataStatusEEnum, ModuleMetadataStatus.INACTIVE);

		initEEnum(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.class, "ModuleMetadataFocusType");
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.PATIENTGENDER);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.PATIENTAGEGROUP);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.CLINICALFOCUS);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.TARGETUSER);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.WORKFLOWSETTING);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.WORKFLOWTASK);
		addEEnumLiteral(moduleMetadataFocusTypeEEnum, ModuleMetadataFocusType.CLINICALVENUE);

		initEEnum(moduleMetadataContributorTypeEEnum, ModuleMetadataContributorType.class, "ModuleMetadataContributorType");
		addEEnumLiteral(moduleMetadataContributorTypeEEnum, ModuleMetadataContributorType.AUTHOR);
		addEEnumLiteral(moduleMetadataContributorTypeEEnum, ModuleMetadataContributorType.EDITOR);
		addEEnumLiteral(moduleMetadataContributorTypeEEnum, ModuleMetadataContributorType.REVIEWER);
		addEEnumLiteral(moduleMetadataContributorTypeEEnum, ModuleMetadataContributorType.ENDORSER);

		initEEnum(identityAssuranceLevelEEnum, IdentityAssuranceLevel.class, "IdentityAssuranceLevel");
		addEEnumLiteral(identityAssuranceLevelEEnum, IdentityAssuranceLevel.LEVEL1);
		addEEnumLiteral(identityAssuranceLevelEEnum, IdentityAssuranceLevel.LEVEL2);
		addEEnumLiteral(identityAssuranceLevelEEnum, IdentityAssuranceLevel.LEVEL3);
		addEEnumLiteral(identityAssuranceLevelEEnum, IdentityAssuranceLevel.LEVEL4);

		initEEnum(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.class, "ModuleMetadataResourceType");
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.DOCUMENTATION);
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.EVIDENCE);
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.CITATION);
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.PREDECESSOR);
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.SUCCESSOR);
		addEEnumLiteral(moduleMetadataResourceTypeEEnum, ModuleMetadataResourceType.DERIVEDFROM);

		initEEnum(operationParameterUseEEnum, OperationParameterUse.class, "OperationParameterUse");
		addEEnumLiteral(operationParameterUseEEnum, OperationParameterUse.IN);
		addEEnumLiteral(operationParameterUseEEnum, OperationParameterUse.OUT);

		initEEnum(parameterTypesUsedInOperationDefinitionsEEnum, ParameterTypesUsedInOperationDefinitions.class, "ParameterTypesUsedInOperationDefinitions");

		initEEnum(conformanceResourceStatusEEnum, ConformanceResourceStatus.class, "ConformanceResourceStatus");
		addEEnumLiteral(conformanceResourceStatusEEnum, ConformanceResourceStatus.DRAFT);
		addEEnumLiteral(conformanceResourceStatusEEnum, ConformanceResourceStatus.ACTIVE);
		addEEnumLiteral(conformanceResourceStatusEEnum, ConformanceResourceStatus.RETIRED);

		initEEnum(contextOfUseValueSetEEnum, ContextOfUseValueSet.class, "ContextOfUseValueSet");

		initEEnum(structureDefinitionCodesEEnum, StructureDefinitionCodes.class, "StructureDefinitionCodes");

		initEEnum(structureDefinitionKindEEnum, StructureDefinitionKind.class, "StructureDefinitionKind");
		addEEnumLiteral(structureDefinitionKindEEnum, StructureDefinitionKind.DATATYPE);
		addEEnumLiteral(structureDefinitionKindEEnum, StructureDefinitionKind.RESOURCE);
		addEEnumLiteral(structureDefinitionKindEEnum, StructureDefinitionKind.LOGICAL);

		initEEnum(fhirDefinedTypeEEnum, FhirDefinedType.class, "FhirDefinedType");

		initEEnum(extensionContextEEnum, ExtensionContext.class, "ExtensionContext");
		addEEnumLiteral(extensionContextEEnum, ExtensionContext.RESOURCE);
		addEEnumLiteral(extensionContextEEnum, ExtensionContext.DATATYPE);
		addEEnumLiteral(extensionContextEEnum, ExtensionContext.MAPPING);
		addEEnumLiteral(extensionContextEEnum, ExtensionContext.EXTENSION);

		initEEnum(propertyRepresentationEEnum, PropertyRepresentation.class, "PropertyRepresentation");
		addEEnumLiteral(propertyRepresentationEEnum, PropertyRepresentation.XML_ATTR);

		initEEnum(loincCodesEEnum, LoincCodes.class, "LoincCodes");

		initEEnum(slicingRulesEEnum, SlicingRules.class, "SlicingRules");
		addEEnumLiteral(slicingRulesEEnum, SlicingRules.CLOSED);
		addEEnumLiteral(slicingRulesEEnum, SlicingRules.OPEN);
		addEEnumLiteral(slicingRulesEEnum, SlicingRules.OPEN_AT_END);

		initEEnum(aggregationModeEEnum, AggregationMode.class, "AggregationMode");
		addEEnumLiteral(aggregationModeEEnum, AggregationMode.CONTAINED);
		addEEnumLiteral(aggregationModeEEnum, AggregationMode.REFERENCED);

		initEEnum(constraintSeverityEEnum, ConstraintSeverity.class, "ConstraintSeverity");
		addEEnumLiteral(constraintSeverityEEnum, ConstraintSeverity.ERROR);
		addEEnumLiteral(constraintSeverityEEnum, ConstraintSeverity.WARNING);

		initEEnum(bindingStrengthEEnum, BindingStrength.class, "BindingStrength");
		addEEnumLiteral(bindingStrengthEEnum, BindingStrength.REQUIRED);
		addEEnumLiteral(bindingStrengthEEnum, BindingStrength.EXTENSIBLE);
		addEEnumLiteral(bindingStrengthEEnum, BindingStrength.PREFERRED);
		addEEnumLiteral(bindingStrengthEEnum, BindingStrength.EXAMPLE);

		initEEnum(designationUseEEnum, DesignationUse.class, "DesignationUse");

		initEEnum(filterOperatorEEnum, FilterOperator.class, "FilterOperator");
		addEEnumLiteral(filterOperatorEEnum, FilterOperator._);
		addEEnumLiteral(filterOperatorEEnum, FilterOperator.ISA);
		addEEnumLiteral(filterOperatorEEnum, FilterOperator.ISNOTA);
		addEEnumLiteral(filterOperatorEEnum, FilterOperator.REGEX);
		addEEnumLiteral(filterOperatorEEnum, FilterOperator.IN);
		addEEnumLiteral(filterOperatorEEnum, FilterOperator.NOTIN);

		initEEnum(groupTypeEEnum, GroupType.class, "GroupType");
		addEEnumLiteral(groupTypeEEnum, GroupType.PERSON);
		addEEnumLiteral(groupTypeEEnum, GroupType.ANIMAL);
		addEEnumLiteral(groupTypeEEnum, GroupType.PRACTITIONER);
		addEEnumLiteral(groupTypeEEnum, GroupType.DEVICE);
		addEEnumLiteral(groupTypeEEnum, GroupType.MEDICATION);
		addEEnumLiteral(groupTypeEEnum, GroupType.SUBSTANCE);

		initEEnum(snomedCtMedicationCodesEEnum, SnomedCtMedicationCodes.class, "SnomedCtMedicationCodes");

		initEEnum(medicationFormCodesEEnum, MedicationFormCodes.class, "MedicationFormCodes");

		initEEnum(substanceCategoryCodesEEnum, SubstanceCategoryCodes.class, "SubstanceCategoryCodes");
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.ALLERGEN);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.BIOLOGICAL);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.BODY);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.CHEMICAL);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.FOOD);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.DRUG);
		addEEnumLiteral(substanceCategoryCodesEEnum, SubstanceCategoryCodes.MATERIAL);

		initEEnum(substanceCodeEEnum, SubstanceCode.class, "SubstanceCode");

		initEEnum(snomedCtFormCodesEEnum, SnomedCtFormCodes.class, "SnomedCtFormCodes");

		initEEnum(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.class, "V3CodeSystemParticipationMode");
		addEEnumLiteral(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.ELECTRONIC);
		addEEnumLiteral(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.PHYSICAL);
		addEEnumLiteral(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.REMOTE);
		addEEnumLiteral(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.VERBAL);
		addEEnumLiteral(v3CodeSystemParticipationModeEEnum, V3CodeSystemParticipationMode.WRITTEN);

		initEEnum(communicationStatusEEnum, CommunicationStatus.class, "CommunicationStatus");
		addEEnumLiteral(communicationStatusEEnum, CommunicationStatus.INPROGRESS);
		addEEnumLiteral(communicationStatusEEnum, CommunicationStatus.COMPLETED);
		addEEnumLiteral(communicationStatusEEnum, CommunicationStatus.SUSPENDED);
		addEEnumLiteral(communicationStatusEEnum, CommunicationStatus.REJECTED);
		addEEnumLiteral(communicationStatusEEnum, CommunicationStatus.FAILED);

		initEEnum(encounterStateEEnum, EncounterState.class, "EncounterState");
		addEEnumLiteral(encounterStateEEnum, EncounterState.PLANNED);
		addEEnumLiteral(encounterStateEEnum, EncounterState.ARRIVED);
		addEEnumLiteral(encounterStateEEnum, EncounterState.INPROGRESS);
		addEEnumLiteral(encounterStateEEnum, EncounterState.ONLEAVE);
		addEEnumLiteral(encounterStateEEnum, EncounterState.FINISHED);
		addEEnumLiteral(encounterStateEEnum, EncounterState.CANCELLED);

		initEEnum(encounterClassEEnum, EncounterClass.class, "EncounterClass");
		addEEnumLiteral(encounterClassEEnum, EncounterClass.INPATIENT);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.OUTPATIENT);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.AMBULATORY);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.EMERGENCY);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.HOME);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.FIELD);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.DAYTIME);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.VIRTUAL);
		addEEnumLiteral(encounterClassEEnum, EncounterClass.OTHER);

		initEEnum(encounterTypeEEnum, EncounterType.class, "EncounterType");
		addEEnumLiteral(encounterTypeEEnum, EncounterType.ADMS);
		addEEnumLiteral(encounterTypeEEnum, EncounterType.BDB_MCLIN);
		addEEnumLiteral(encounterTypeEEnum, EncounterType.CCS60);
		addEEnumLiteral(encounterTypeEEnum, EncounterType.OKI);

		initEEnum(encounterPriorityEEnum, EncounterPriority.class, "EncounterPriority");
		addEEnumLiteral(encounterPriorityEEnum, EncounterPriority.IMM);
		addEEnumLiteral(encounterPriorityEEnum, EncounterPriority.EMG);
		addEEnumLiteral(encounterPriorityEEnum, EncounterPriority.URG);
		addEEnumLiteral(encounterPriorityEEnum, EncounterPriority.SURG);
		addEEnumLiteral(encounterPriorityEEnum, EncounterPriority.NOURG);

		initEEnum(episodeOfCareStatusEEnum, EpisodeOfCareStatus.class, "EpisodeOfCareStatus");
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.PLANNED);
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.WAITLIST);
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.ACTIVE);
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.ONHOLD);
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.FINISHED);
		addEEnumLiteral(episodeOfCareStatusEEnum, EpisodeOfCareStatus.CANCELLED);

		initEEnum(conditionProblemDiagnosisCodesEEnum, ConditionProblemDiagnosisCodes.class, "ConditionProblemDiagnosisCodes");

		initEEnum(conditionCategoryCodesEEnum, ConditionCategoryCodes.class, "ConditionCategoryCodes");
		addEEnumLiteral(conditionCategoryCodesEEnum, ConditionCategoryCodes.COMPLAINT);
		addEEnumLiteral(conditionCategoryCodesEEnum, ConditionCategoryCodes.SYMPTOM);
		addEEnumLiteral(conditionCategoryCodesEEnum, ConditionCategoryCodes.FINDING);
		addEEnumLiteral(conditionCategoryCodesEEnum, ConditionCategoryCodes.DIAGNOSIS);

		initEEnum(conditionClinicalStatusCodesEEnum, ConditionClinicalStatusCodes.class, "ConditionClinicalStatusCodes");
		addEEnumLiteral(conditionClinicalStatusCodesEEnum, ConditionClinicalStatusCodes.ACTIVE);
		addEEnumLiteral(conditionClinicalStatusCodesEEnum, ConditionClinicalStatusCodes.RELAPSE);
		addEEnumLiteral(conditionClinicalStatusCodesEEnum, ConditionClinicalStatusCodes.REMISSION);
		addEEnumLiteral(conditionClinicalStatusCodesEEnum, ConditionClinicalStatusCodes.RESOLVED);

		initEEnum(conditionVerificationStatusEEnum, ConditionVerificationStatus.class, "ConditionVerificationStatus");
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.PROVISIONAL);
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.DIFFERENTIAL);
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.CONFIRMED);
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.REFUTED);
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.ENTEREDINERROR);
		addEEnumLiteral(conditionVerificationStatusEEnum, ConditionVerificationStatus.UNKNOWN);

		initEEnum(conditionDiagnosisSeverityEEnum, ConditionDiagnosisSeverity.class, "ConditionDiagnosisSeverity");

		initEEnum(conditionStageEEnum, ConditionStage.class, "ConditionStage");

		initEEnum(clinicalImpressionStatusEEnum, ClinicalImpressionStatus.class, "ClinicalImpressionStatus");
		addEEnumLiteral(clinicalImpressionStatusEEnum, ClinicalImpressionStatus.INPROGRESS);
		addEEnumLiteral(clinicalImpressionStatusEEnum, ClinicalImpressionStatus.COMPLETED);
		addEEnumLiteral(clinicalImpressionStatusEEnum, ClinicalImpressionStatus.ENTEREDINERROR);

		initEEnum(allergyIntoleranceSubstanceAndNegationCodesEEnum, AllergyIntoleranceSubstanceAndNegationCodes.class, "AllergyIntoleranceSubstanceAndNegationCodes");

		initEEnum(allergyIntoleranceStatusEEnum, AllergyIntoleranceStatus.class, "AllergyIntoleranceStatus");
		addEEnumLiteral(allergyIntoleranceStatusEEnum, AllergyIntoleranceStatus.ACTIVE);
		addEEnumLiteral(allergyIntoleranceStatusEEnum, AllergyIntoleranceStatus.INACTIVE);

		initEEnum(allergyIntoleranceCriticalityEEnum, AllergyIntoleranceCriticality.class, "AllergyIntoleranceCriticality");
		addEEnumLiteral(allergyIntoleranceCriticalityEEnum, AllergyIntoleranceCriticality.CRITL);
		addEEnumLiteral(allergyIntoleranceCriticalityEEnum, AllergyIntoleranceCriticality.CRITH);
		addEEnumLiteral(allergyIntoleranceCriticalityEEnum, AllergyIntoleranceCriticality.CRITU);

		initEEnum(allergyIntoleranceTypeEEnum, AllergyIntoleranceType.class, "AllergyIntoleranceType");
		addEEnumLiteral(allergyIntoleranceTypeEEnum, AllergyIntoleranceType.ALLERGY);
		addEEnumLiteral(allergyIntoleranceTypeEEnum, AllergyIntoleranceType.INTOLERANCE);

		initEEnum(allergyIntoleranceCategoryEEnum, AllergyIntoleranceCategory.class, "AllergyIntoleranceCategory");
		addEEnumLiteral(allergyIntoleranceCategoryEEnum, AllergyIntoleranceCategory.FOOD);
		addEEnumLiteral(allergyIntoleranceCategoryEEnum, AllergyIntoleranceCategory.MEDICATION);
		addEEnumLiteral(allergyIntoleranceCategoryEEnum, AllergyIntoleranceCategory.ENVIRONMENT);
		addEEnumLiteral(allergyIntoleranceCategoryEEnum, AllergyIntoleranceCategory.OTHER);

		initEEnum(allergyIntoleranceCertaintyEEnum, AllergyIntoleranceCertainty.class, "AllergyIntoleranceCertainty");
		addEEnumLiteral(allergyIntoleranceCertaintyEEnum, AllergyIntoleranceCertainty.UNLIKELY);
		addEEnumLiteral(allergyIntoleranceCertaintyEEnum, AllergyIntoleranceCertainty.LIKELY);
		addEEnumLiteral(allergyIntoleranceCertaintyEEnum, AllergyIntoleranceCertainty.CONFIRMED);

		initEEnum(snomedCtManifestationCodesEEnum, SnomedCtManifestationCodes.class, "SnomedCtManifestationCodes");

		initEEnum(allergyIntoleranceSeverityEEnum, AllergyIntoleranceSeverity.class, "AllergyIntoleranceSeverity");
		addEEnumLiteral(allergyIntoleranceSeverityEEnum, AllergyIntoleranceSeverity.MILD);
		addEEnumLiteral(allergyIntoleranceSeverityEEnum, AllergyIntoleranceSeverity.MODERATE);
		addEEnumLiteral(allergyIntoleranceSeverityEEnum, AllergyIntoleranceSeverity.SEVERE);

		initEEnum(snomedCtRouteCodesEEnum, SnomedCtRouteCodes.class, "SnomedCtRouteCodes");

		initEEnum(snomedCtClinicalFindingsEEnum, SnomedCtClinicalFindings.class, "SnomedCtClinicalFindings");

		initEEnum(investigationTypeEEnum, InvestigationType.class, "InvestigationType");

		initEEnum(observationStatusEEnum, ObservationStatus.class, "ObservationStatus");
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.REGISTERED);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.PRELIMINARY);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.FINAL);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.AMENDED);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.CANCELLED);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.ENTEREDINERROR);
		addEEnumLiteral(observationStatusEEnum, ObservationStatus.UNKNOWN);

		initEEnum(observationCategoryCodesEEnum, ObservationCategoryCodes.class, "ObservationCategoryCodes");
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.SOCIALHISTORY);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.VITALSIGNS);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.IMAGING);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.LABORATORY);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.PROCEDURE);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.SURVEY);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.EXAM);
		addEEnumLiteral(observationCategoryCodesEEnum, ObservationCategoryCodes.THERAPY);

		initEEnum(observationValueAbsentReasonEEnum, ObservationValueAbsentReason.class, "ObservationValueAbsentReason");

		initEEnum(observationInterpretationCodesEEnum, ObservationInterpretationCodes.class, "ObservationInterpretationCodes");

		initEEnum(snomedCtBodyStructuresEEnum, SnomedCtBodyStructures.class, "SnomedCtBodyStructures");

		initEEnum(observationMethodsEEnum, ObservationMethods.class, "ObservationMethods");

		initEEnum(specimenStatusEEnum, SpecimenStatus.class, "SpecimenStatus");
		addEEnumLiteral(specimenStatusEEnum, SpecimenStatus.AVAILABLE);
		addEEnumLiteral(specimenStatusEEnum, SpecimenStatus.UNAVAILABLE);
		addEEnumLiteral(specimenStatusEEnum, SpecimenStatus.UNSATISFACTORY);
		addEEnumLiteral(specimenStatusEEnum, SpecimenStatus.ENTEREDINERROR);

		initEEnum(v2SpecimenTypeEEnum, V2SpecimenType.class, "V2SpecimenType");
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType._);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ABS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ACNE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ACNFLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AIRS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ALL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AMN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AMP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ANGI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ARTC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ASERU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ASP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ATTE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AUTOA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AUTOC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.AUTP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BBL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BCYST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BDY);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BIFL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLDA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLDCO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLDV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLEB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BLIST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BOIL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BON);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BONE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BOWL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BPH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BPU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BRN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BRSH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BRTH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BRUS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BUB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BULLA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.BX);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CALC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CARBU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CAT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CBITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CDM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CLIPP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CNJT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CNL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.COL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CONE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSCR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSERU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSF);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSMY);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CSVR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CTP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CUR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CVM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CVPS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CVPT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CYN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.CYST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DBITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DCS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DEC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DEION);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DIA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DIAF);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DISCHG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DIV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DRN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DRNG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DRNGP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.DUFL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EARW);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EBRUSH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EEYE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EFF);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EFFUS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EFOD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EISO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ELT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ENVIR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EOS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EOTH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ESOI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ESOS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ETA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ETTP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ETTUB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EWHI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EXG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EXS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.EXUDTE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FAW);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FBLOOD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FGA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FIB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FIST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FLT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FLU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FLUID);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FOLEY);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FRS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FSCLP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.FUR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GAS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GASA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GASAN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GASBR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GASD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GAST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GENL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GENV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GRAFT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GRAFTS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GRANU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GROSH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GSOL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GSPEC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.GTUBE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HAR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HBITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HBLUD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HEMAQ);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HEMO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HERNI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HEV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HIC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.HYDC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IBITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ICYST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IDC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IHG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ILEO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ILLEG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IMP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.INCI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.INFIL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.INS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.INTRD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ISLT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IUD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IVCAT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IVFLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.IVTIP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.JEJU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.JNTFLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.JP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.KELOI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.KIDFLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LAVG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LAVGG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LAVGP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LAVPG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LENS1);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LENS2);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LESN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LIQ);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LIQO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LNA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LNV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LSAC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.LYM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MAC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MAHUR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MAR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MASS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MBLD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MEC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MILK);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MLK);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MUCOS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.MUCUS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NAIL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NASDR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NEDL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NEPH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NGASP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NGAST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NGS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NODUL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.NSECR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ORH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.ORL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.OTH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PACEM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PAFL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PCFL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PDSIT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PDTS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PELVA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PENIL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PERIA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PILOC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PINS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PIS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLAN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLAS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLEVS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PLR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PMN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PND);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.POL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.POPGS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.POPLG);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.POPLV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PORTA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PPP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PROST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PRP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PSC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PUNCT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PUS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PUSFR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.PUST);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.QC3);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RANDU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RBC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RBITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RECT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RECTA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RENALC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RENC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.RES);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SAL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SCAR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SCLV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SCROA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SECRE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SER);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SHU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SHUNF);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SHUNT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SITE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SKBP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SKN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SMM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SMN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SNV);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPRM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPRP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPRPB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPTC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPTT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPUT1);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPUTIN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SPUTSP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.STER);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.STL);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.STONE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SUBMA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SUBMX);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SUMP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SUP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SUTUR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SWGZ);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.SWT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TASP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TEAR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.THRB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TISS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TISU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TLC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TRAC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TRANS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TSERU);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TSTES);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TTRA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TUBES);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TUMOR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.TZANC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.UDENT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.UMED);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.UR);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URINB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URINC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URINM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URINN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URINP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URNS);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.URT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.USCOP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.USPEC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.USUB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.VASTIP);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.VENT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.VITF);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.VOM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WASH);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WASI);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WAT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WB);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WBC);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WEN);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WICK);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WND);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WNDA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WNDD);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WNDE);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WORM);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WRT);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WWA);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WWO);
		addEEnumLiteral(v2SpecimenTypeEEnum, V2SpecimenType.WWT);

		initEEnum(specimenCollectionMethodEEnum, SpecimenCollectionMethod.class, "SpecimenCollectionMethod");

		initEEnum(specimenTreatmentProcedureEEnum, SpecimenTreatmentProcedure.class, "SpecimenTreatmentProcedure");

		initEEnum(specimenContainerEEnum, SpecimenContainer.class, "SpecimenContainer");

		initEEnum(v2AdditivePreservativeEEnum, V2AdditivePreservative.class, "V2AdditivePreservative");
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.ACDA);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.ACDB);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.ACET);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.AMIES);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.BACTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.BF10);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.BOR);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.BOUIN);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.BSKM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.C32);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.C38);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.CARS);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.CARY);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.CHLTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.CTAD);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.EDTK);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.EDTK15);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.EDTK75);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.EDTN);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.ENT);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.EN_T);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.F10);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.FDP);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.FL10);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.FL100);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.HCL6);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.HEPA);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.HEPL);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.HEPN);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.HNO3);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.JKM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.KARN);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.KOX);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.LIA);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.M4);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.M4RT);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.M5);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.MICHTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.MMDTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.NAF);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.NAPS);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.NONE);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.PAGE);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.PHENOL);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.PVA);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.RLM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.SILICA);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.SPS);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.SST);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.STUTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.THROM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.THYMOL);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.THYO);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.TOLU);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.URETM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.VIRTM);
		addEEnumLiteral(v2AdditivePreservativeEEnum, V2AdditivePreservative.WEST);

		initEEnum(measmntPrincipleEEnum, MeasmntPrinciple.class, "MeasmntPrinciple");
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.OTHER);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.CHEMICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.ELECTRICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.IMPEDANCE);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.NUCLEAR);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.OPTICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.THERMAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.BIOLOGICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.MECHANICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.ACOUSTICAL);
		addEEnumLiteral(measmntPrincipleEEnum, MeasmntPrinciple.MANUAL);

		initEEnum(deviceMetricOperationalStatusEEnum, DeviceMetricOperationalStatus.class, "DeviceMetricOperationalStatus");
		addEEnumLiteral(deviceMetricOperationalStatusEEnum, DeviceMetricOperationalStatus.ON);
		addEEnumLiteral(deviceMetricOperationalStatusEEnum, DeviceMetricOperationalStatus.OFF);
		addEEnumLiteral(deviceMetricOperationalStatusEEnum, DeviceMetricOperationalStatus.STANDBY);

		initEEnum(deviceMetricColorEEnum, DeviceMetricColor.class, "DeviceMetricColor");
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.BLACK);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.RED);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.GREEN);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.YELLOW);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.BLUE);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.MAGENTA);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.CYAN);
		addEEnumLiteral(deviceMetricColorEEnum, DeviceMetricColor.WHITE);

		initEEnum(deviceMetricCategoryEEnum, DeviceMetricCategory.class, "DeviceMetricCategory");
		addEEnumLiteral(deviceMetricCategoryEEnum, DeviceMetricCategory.MEASUREMENT);
		addEEnumLiteral(deviceMetricCategoryEEnum, DeviceMetricCategory.SETTING);
		addEEnumLiteral(deviceMetricCategoryEEnum, DeviceMetricCategory.CALCULATION);
		addEEnumLiteral(deviceMetricCategoryEEnum, DeviceMetricCategory.UNSPECIFIED);

		initEEnum(deviceMetricCalibrationTypeEEnum, DeviceMetricCalibrationType.class, "DeviceMetricCalibrationType");
		addEEnumLiteral(deviceMetricCalibrationTypeEEnum, DeviceMetricCalibrationType.UNSPECIFIED);
		addEEnumLiteral(deviceMetricCalibrationTypeEEnum, DeviceMetricCalibrationType.OFFSET);
		addEEnumLiteral(deviceMetricCalibrationTypeEEnum, DeviceMetricCalibrationType.GAIN);
		addEEnumLiteral(deviceMetricCalibrationTypeEEnum, DeviceMetricCalibrationType.TWOPOINT);

		initEEnum(deviceMetricCalibrationStateEEnum, DeviceMetricCalibrationState.class, "DeviceMetricCalibrationState");
		addEEnumLiteral(deviceMetricCalibrationStateEEnum, DeviceMetricCalibrationState.NOTCALIBRATED);
		addEEnumLiteral(deviceMetricCalibrationStateEEnum, DeviceMetricCalibrationState.CALIBRATIONREQUIRED);
		addEEnumLiteral(deviceMetricCalibrationStateEEnum, DeviceMetricCalibrationState.CALIBRATED);
		addEEnumLiteral(deviceMetricCalibrationStateEEnum, DeviceMetricCalibrationState.UNSPECIFIED);

		initEEnum(observationReferenceRangeMeaningCodesEEnum, ObservationReferenceRangeMeaningCodes.class, "ObservationReferenceRangeMeaningCodes");
		addEEnumLiteral(observationReferenceRangeMeaningCodesEEnum, ObservationReferenceRangeMeaningCodes.TYPE);
		addEEnumLiteral(observationReferenceRangeMeaningCodesEEnum, ObservationReferenceRangeMeaningCodes.ENDOCRINE);

		initEEnum(observationRelationshipTypeEEnum, ObservationRelationshipType.class, "ObservationRelationshipType");
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.HASMEMBER);
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.DERIVEDFROM);
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.SEQUELTO);
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.REPLACES);
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.QUALIFIEDBY);
		addEEnumLiteral(observationRelationshipTypeEEnum, ObservationRelationshipType.INTERFEREDBY);

		initEEnum(questionnaireStatusEEnum, QuestionnaireStatus.class, "QuestionnaireStatus");
		addEEnumLiteral(questionnaireStatusEEnum, QuestionnaireStatus.DRAFT);
		addEEnumLiteral(questionnaireStatusEEnum, QuestionnaireStatus.PUBLISHED);
		addEEnumLiteral(questionnaireStatusEEnum, QuestionnaireStatus.RETIRED);

		initEEnum(questionnaireQuestionCodesEEnum, QuestionnaireQuestionCodes.class, "QuestionnaireQuestionCodes");

		initEEnum(questionnaireItemTypeEEnum, QuestionnaireItemType.class, "QuestionnaireItemType");
		addEEnumLiteral(questionnaireItemTypeEEnum, QuestionnaireItemType.GROUP);
		addEEnumLiteral(questionnaireItemTypeEEnum, QuestionnaireItemType.DISPLAY);
		addEEnumLiteral(questionnaireItemTypeEEnum, QuestionnaireItemType.QUESTION);

		initEEnum(questionnaireAnswerCodesEEnum, QuestionnaireAnswerCodes.class, "QuestionnaireAnswerCodes");

		initEEnum(questionnaireResponseStatusEEnum, QuestionnaireResponseStatus.class, "QuestionnaireResponseStatus");
		addEEnumLiteral(questionnaireResponseStatusEEnum, QuestionnaireResponseStatus.INPROGRESS);
		addEEnumLiteral(questionnaireResponseStatusEEnum, QuestionnaireResponseStatus.COMPLETED);
		addEEnumLiteral(questionnaireResponseStatusEEnum, QuestionnaireResponseStatus.AMENDED);

		initEEnum(familyHistoryStatusEEnum, FamilyHistoryStatus.class, "FamilyHistoryStatus");
		addEEnumLiteral(familyHistoryStatusEEnum, FamilyHistoryStatus.PARTIAL);
		addEEnumLiteral(familyHistoryStatusEEnum, FamilyHistoryStatus.COMPLETED);
		addEEnumLiteral(familyHistoryStatusEEnum, FamilyHistoryStatus.ENTEREDINERROR);
		addEEnumLiteral(familyHistoryStatusEEnum, FamilyHistoryStatus.HEALTHUNKNOWN);

		initEEnum(familyMemberEEnum, FamilyMember.class, "FamilyMember");

		initEEnum(conditionOutcomeCodesEEnum, ConditionOutcomeCodes.class, "ConditionOutcomeCodes");

		initEEnum(diagnosticReportStatusEEnum, DiagnosticReportStatus.class, "DiagnosticReportStatus");
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.REGISTERED);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.PARTIAL);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.FINAL);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.CORRECTED);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.APPENDED);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.CANCELLED);
		addEEnumLiteral(diagnosticReportStatusEEnum, DiagnosticReportStatus.ENTEREDINERROR);

		initEEnum(diagnosticServiceSectionCodesEEnum, DiagnosticServiceSectionCodes.class, "DiagnosticServiceSectionCodes");

		initEEnum(loincDiagnosticReportCodesEEnum, LoincDiagnosticReportCodes.class, "LoincDiagnosticReportCodes");

		initEEnum(documentTypeValueSetEEnum, DocumentTypeValueSet.class, "DocumentTypeValueSet");

		initEEnum(documentClassValueSetEEnum, DocumentClassValueSet.class, "DocumentClassValueSet");

		initEEnum(documentReferenceStatusEEnum, DocumentReferenceStatus.class, "DocumentReferenceStatus");
		addEEnumLiteral(documentReferenceStatusEEnum, DocumentReferenceStatus.CURRENT);
		addEEnumLiteral(documentReferenceStatusEEnum, DocumentReferenceStatus.SUPERSEDED);
		addEEnumLiteral(documentReferenceStatusEEnum, DocumentReferenceStatus.ENTEREDINERROR);

		initEEnum(compositionStatusEEnum, CompositionStatus.class, "CompositionStatus");
		addEEnumLiteral(compositionStatusEEnum, CompositionStatus.PRELIMINARY);
		addEEnumLiteral(compositionStatusEEnum, CompositionStatus.FINAL);
		addEEnumLiteral(compositionStatusEEnum, CompositionStatus.AMENDED);
		addEEnumLiteral(compositionStatusEEnum, CompositionStatus.ENTEREDINERROR);

		initEEnum(documentRelationshipTypeEEnum, DocumentRelationshipType.class, "DocumentRelationshipType");
		addEEnumLiteral(documentRelationshipTypeEEnum, DocumentRelationshipType.REPLACES);
		addEEnumLiteral(documentRelationshipTypeEEnum, DocumentRelationshipType.TRANSFORMS);
		addEEnumLiteral(documentRelationshipTypeEEnum, DocumentRelationshipType.SIGNS);
		addEEnumLiteral(documentRelationshipTypeEEnum, DocumentRelationshipType.APPENDS);

		initEEnum(documentReferenceFormatCodeSetEEnum, DocumentReferenceFormatCodeSet.class, "DocumentReferenceFormatCodeSet");

		initEEnum(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.class, "V3CodeSystemActCode");
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_ACCOUNT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_ADJUDICATION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_ADJUDICATION_RESULT_ACTION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_BILLABLE_MODIFIER_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_BILLING_ARRANGEMENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_BOUNDED_ROI_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_CARE_PROVISION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_CLAIM_ATTACHMENT_CATEGORY_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_CONSENT_TYPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_CONTAINER_REGISTRATION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_CONTROL_VARIABLE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_COVERAGE_CONFIRMATION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_COVERAGE_LIMIT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_COVERAGE_TYPE_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_DETECTED_ISSUE_MANAGEMENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_EXPOSURE_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_FINANCIAL_TRANSACTION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INCIDENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INFORMATION_ACCESS_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INFORMATION_ACCESS_CONTEXT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INFORMATION_CATEGORY_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INVOICE_ELEMENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INVOICE_ELEMENT_SUMMARY_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_INVOICE_OVERRIDE_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_LIST_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_MONITORING_PROTOCOL_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_NON_OBSERVATION_INDICATION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_OBSERVATION_VERIFICATION_TYPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_PAYMENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_PHARMACY_SUPPLY_TYPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_POLICY_TYPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_PRODUCT_ACQUISITION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_SPECIMEN_TRANSPORT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_SPECIMEN_TREATMENT_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_SUBSTANCE_ADMINISTRATION_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_TASK_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_TRANSPORTATION_MODE_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.OBSERVATION_TYPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ROI_OVERLAY_SHAPE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.C);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.DIET);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.DRUGPRG);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.F);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.PRLMN);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.SECOBS);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.SUBSIDFFS);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.WRKCOMP);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.ACT_PROCEDURE_CODE);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.HL7_DEFINED_ACT_CODES);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.COPAY);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.DEDUCT);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.DOSEIND);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.PRA);
		addEEnumLiteral(v3CodeSystemActCodeEEnum, V3CodeSystemActCode.STORE);

		initEEnum(facilityTypeCodeValueSetEEnum, FacilityTypeCodeValueSet.class, "FacilityTypeCodeValueSet");

		initEEnum(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.class, "DiagnosticOrderStatus");
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.PROPOSED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.DRAFT);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.PLANNED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.REQUESTED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.RECEIVED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.ACCEPTED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.INPROGRESS);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.REVIEW);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.COMPLETED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.CANCELLED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.SUSPENDED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.REJECTED);
		addEEnumLiteral(diagnosticOrderStatusEEnum, DiagnosticOrderStatus.FAILED);

		initEEnum(diagnosticOrderPriorityEEnum, DiagnosticOrderPriority.class, "DiagnosticOrderPriority");
		addEEnumLiteral(diagnosticOrderPriorityEEnum, DiagnosticOrderPriority.ROUTINE);
		addEEnumLiteral(diagnosticOrderPriorityEEnum, DiagnosticOrderPriority.URGENT);
		addEEnumLiteral(diagnosticOrderPriorityEEnum, DiagnosticOrderPriority.STAT);
		addEEnumLiteral(diagnosticOrderPriorityEEnum, DiagnosticOrderPriority.ASAP);

		initEEnum(diagnosticOrderEventCodesEEnum, DiagnosticOrderEventCodes.class, "DiagnosticOrderEventCodes");

		initEEnum(loincDiagnosticOrderCodesEEnum, LoincDiagnosticOrderCodes.class, "LoincDiagnosticOrderCodes");

		initEEnum(procedureCodessnomedCTEEnum, ProcedureCodessnomedCT.class, "ProcedureCodessnomedCT");

		initEEnum(procedureReasonCodesEEnum, ProcedureReasonCodes.class, "ProcedureReasonCodes");

		initEEnum(procedureRequestStatusEEnum, ProcedureRequestStatus.class, "ProcedureRequestStatus");
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.PROPOSED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.DRAFT);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.REQUESTED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.RECEIVED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.ACCEPTED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.INPROGRESS);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.COMPLETED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.SUSPENDED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.REJECTED);
		addEEnumLiteral(procedureRequestStatusEEnum, ProcedureRequestStatus.ABORTED);

		initEEnum(procedureRequestPriorityEEnum, ProcedureRequestPriority.class, "ProcedureRequestPriority");
		addEEnumLiteral(procedureRequestPriorityEEnum, ProcedureRequestPriority.ROUTINE);
		addEEnumLiteral(procedureRequestPriorityEEnum, ProcedureRequestPriority.URGENT);
		addEEnumLiteral(procedureRequestPriorityEEnum, ProcedureRequestPriority.STAT);
		addEEnumLiteral(procedureRequestPriorityEEnum, ProcedureRequestPriority.ASAP);

		initEEnum(referralStatusEEnum, ReferralStatus.class, "ReferralStatus");
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.DRAFT);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.REQUESTED);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.ACTIVE);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.CANCELLED);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.ACCEPTED);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.REJECTED);
		addEEnumLiteral(referralStatusEEnum, ReferralStatus.COMPLETED);

		initEEnum(acquisitionModalityCodesEEnum, AcquisitionModalityCodes.class, "AcquisitionModalityCodes");

		initEEnum(instanceAvailabilityEEnum, InstanceAvailability.class, "InstanceAvailability");

		initEEnum(procedureStatusEEnum, ProcedureStatus.class, "ProcedureStatus");
		addEEnumLiteral(procedureStatusEEnum, ProcedureStatus.INPROGRESS);
		addEEnumLiteral(procedureStatusEEnum, ProcedureStatus.ABORTED);
		addEEnumLiteral(procedureStatusEEnum, ProcedureStatus.COMPLETED);
		addEEnumLiteral(procedureStatusEEnum, ProcedureStatus.ENTEREDINERROR);

		initEEnum(procedureCategoryCodessnomedCTEEnum, ProcedureCategoryCodessnomedCT.class, "ProcedureCategoryCodessnomedCT");

		initEEnum(procedureNotPerformedReasonsnomeDCTEEnum, ProcedureNotPerformedReasonsnomeDCT.class, "ProcedureNotPerformedReasonsnomeDCT");

		initEEnum(procedurePerformerRoleCodesEEnum, ProcedurePerformerRoleCodes.class, "ProcedurePerformerRoleCodes");

		initEEnum(procedureOutcomeCodessnomedCTEEnum, ProcedureOutcomeCodessnomedCT.class, "ProcedureOutcomeCodessnomedCT");

		initEEnum(procedureFollowUpCodessnomedCTEEnum, ProcedureFollowUpCodessnomedCT.class, "ProcedureFollowUpCodessnomedCT");

		initEEnum(carePlanStatusEEnum, CarePlanStatus.class, "CarePlanStatus");
		addEEnumLiteral(carePlanStatusEEnum, CarePlanStatus.PROPOSED);
		addEEnumLiteral(carePlanStatusEEnum, CarePlanStatus.DRAFT);
		addEEnumLiteral(carePlanStatusEEnum, CarePlanStatus.ACTIVE);
		addEEnumLiteral(carePlanStatusEEnum, CarePlanStatus.COMPLETED);
		addEEnumLiteral(carePlanStatusEEnum, CarePlanStatus.CANCELLED);

		initEEnum(carePlanCategoryEEnum, CarePlanCategory.class, "CarePlanCategory");

		initEEnum(carePlanRelationshipEEnum, CarePlanRelationship.class, "CarePlanRelationship");
		addEEnumLiteral(carePlanRelationshipEEnum, CarePlanRelationship.INCLUDES);
		addEEnumLiteral(carePlanRelationshipEEnum, CarePlanRelationship.REPLACES);
		addEEnumLiteral(carePlanRelationshipEEnum, CarePlanRelationship.FULFILLS);

		initEEnum(participantRolesEEnum, ParticipantRoles.class, "ParticipantRoles");

		initEEnum(goalStartEventEEnum, GoalStartEvent.class, "GoalStartEvent");

		initEEnum(goalCategoryEEnum, GoalCategory.class, "GoalCategory");
		addEEnumLiteral(goalCategoryEEnum, GoalCategory.DIETARY);
		addEEnumLiteral(goalCategoryEEnum, GoalCategory.SAFETY);
		addEEnumLiteral(goalCategoryEEnum, GoalCategory.BEHAVIORAL);
		addEEnumLiteral(goalCategoryEEnum, GoalCategory.NURSING);
		addEEnumLiteral(goalCategoryEEnum, GoalCategory.PHYSIOTHERAPY);

		initEEnum(goalStatusEEnum, GoalStatus.class, "GoalStatus");
		addEEnumLiteral(goalStatusEEnum, GoalStatus.PROPOSED);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.PLANNED);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.ACCEPTED);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.REJECTED);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.INPROGRESS);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.ACHIEVED);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.SUSTAINING);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.ONHOLD);
		addEEnumLiteral(goalStatusEEnum, GoalStatus.CANCELLED);

		initEEnum(goalStatusReasonEEnum, GoalStatusReason.class, "GoalStatusReason");
		addEEnumLiteral(goalStatusReasonEEnum, GoalStatusReason.SURGERY);
		addEEnumLiteral(goalStatusReasonEEnum, GoalStatusReason.LIFEEVENT);
		addEEnumLiteral(goalStatusReasonEEnum, GoalStatusReason.REPLACED);
		addEEnumLiteral(goalStatusReasonEEnum, GoalStatusReason.PATIENTREQUEST);

		initEEnum(goalPriorityEEnum, GoalPriority.class, "GoalPriority");
		addEEnumLiteral(goalPriorityEEnum, GoalPriority.HIGH);
		addEEnumLiteral(goalPriorityEEnum, GoalPriority.MEDIUM);
		addEEnumLiteral(goalPriorityEEnum, GoalPriority.LOW);

		initEEnum(medicationStatementStatusEEnum, MedicationStatementStatus.class, "MedicationStatementStatus");
		addEEnumLiteral(medicationStatementStatusEEnum, MedicationStatementStatus.ACTIVE);
		addEEnumLiteral(medicationStatementStatusEEnum, MedicationStatementStatus.COMPLETED);
		addEEnumLiteral(medicationStatementStatusEEnum, MedicationStatementStatus.ENTEREDINERROR);
		addEEnumLiteral(medicationStatementStatusEEnum, MedicationStatementStatus.INTENDED);

		initEEnum(reasonMedicationNotGivenCodesEEnum, ReasonMedicationNotGivenCodes.class, "ReasonMedicationNotGivenCodes");
		addEEnumLiteral(reasonMedicationNotGivenCodesEEnum, ReasonMedicationNotGivenCodes.A);
		addEEnumLiteral(reasonMedicationNotGivenCodesEEnum, ReasonMedicationNotGivenCodes.B);
		addEEnumLiteral(reasonMedicationNotGivenCodesEEnum, ReasonMedicationNotGivenCodes.C);
		addEEnumLiteral(reasonMedicationNotGivenCodesEEnum, ReasonMedicationNotGivenCodes.D);

		initEEnum(bodysiteLocationModifierEEnum, BodysiteLocationModifier.class, "BodysiteLocationModifier");

		initEEnum(snomedCtAnatomicalStructureForAdministrationSiteCodesEEnum, SnomedCtAnatomicalStructureForAdministrationSiteCodes.class, "SnomedCtAnatomicalStructureForAdministrationSiteCodes");

		initEEnum(nutritionOrderStatusEEnum, NutritionOrderStatus.class, "NutritionOrderStatus");
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.PROPOSED);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.DRAFT);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.PLANNED);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.REQUESTED);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.ACTIVE);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.ONHOLD);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.COMPLETED);
		addEEnumLiteral(nutritionOrderStatusEEnum, NutritionOrderStatus.CANCELLED);

		initEEnum(dietEEnum, Diet.class, "Diet");
		addEEnumLiteral(dietEEnum, Diet.VEGETARIAN);
		addEEnumLiteral(dietEEnum, Diet.DAIRYFREE);
		addEEnumLiteral(dietEEnum, Diet.NUTFREE);
		addEEnumLiteral(dietEEnum, Diet.GLUTENFREE);
		addEEnumLiteral(dietEEnum, Diet.VEGAN);
		addEEnumLiteral(dietEEnum, Diet.HALAL);
		addEEnumLiteral(dietEEnum, Diet.KOSHER);

		initEEnum(foodTypeCodesEEnum, FoodTypeCodes.class, "FoodTypeCodes");

		initEEnum(dietCodesEEnum, DietCodes.class, "DietCodes");

		initEEnum(nutrientModifierCodesEEnum, NutrientModifierCodes.class, "NutrientModifierCodes");

		initEEnum(textureModifierCodesEEnum, TextureModifierCodes.class, "TextureModifierCodes");

		initEEnum(textureModifiedFoodTypeCodesEEnum, TextureModifiedFoodTypeCodes.class, "TextureModifiedFoodTypeCodes");

		initEEnum(fluidConsistencyTypeCodesEEnum, FluidConsistencyTypeCodes.class, "FluidConsistencyTypeCodes");

		initEEnum(supplementTypeCodesEEnum, SupplementTypeCodes.class, "SupplementTypeCodes");

		initEEnum(enteralFormulaTypeCodesEEnum, EnteralFormulaTypeCodes.class, "EnteralFormulaTypeCodes");

		initEEnum(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.class, "EnteralFormulaAdditiveTypeCode");
		addEEnumLiteral(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.LIPID);
		addEEnumLiteral(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.PROTEIN);
		addEEnumLiteral(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.CARBOHYDRATE);
		addEEnumLiteral(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.FIBER);
		addEEnumLiteral(enteralFormulaAdditiveTypeCodeEEnum, EnteralFormulaAdditiveTypeCode.WATER);

		initEEnum(enteralRouteCodesEEnum, EnteralRouteCodes.class, "EnteralRouteCodes");

		initEEnum(riskProbabilityEEnum, RiskProbability.class, "RiskProbability");
		addEEnumLiteral(riskProbabilityEEnum, RiskProbability.NEGLIGIBLE);
		addEEnumLiteral(riskProbabilityEEnum, RiskProbability.LOW);
		addEEnumLiteral(riskProbabilityEEnum, RiskProbability.MODERATE);
		addEEnumLiteral(riskProbabilityEEnum, RiskProbability.HIGH);
		addEEnumLiteral(riskProbabilityEEnum, RiskProbability.CERTAIN);

		initEEnum(appointmentStatusEEnum, AppointmentStatus.class, "AppointmentStatus");
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.PROPOSED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.PENDING);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.BOOKED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.ARRIVED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.FULFILLED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.CANCELLED);
		addEEnumLiteral(appointmentStatusEEnum, AppointmentStatus.NOSHOW);

		initEEnum(encounterReasonCodesEEnum, EncounterReasonCodes.class, "EncounterReasonCodes");

		initEEnum(slotStatusEEnum, SlotStatus.class, "SlotStatus");
		addEEnumLiteral(slotStatusEEnum, SlotStatus.BUSY);
		addEEnumLiteral(slotStatusEEnum, SlotStatus.FREE);
		addEEnumLiteral(slotStatusEEnum, SlotStatus.BUSYUNAVAILABLE);
		addEEnumLiteral(slotStatusEEnum, SlotStatus.BUSYTENTATIVE);

		initEEnum(participantTypeEEnum, ParticipantType.class, "ParticipantType");
		addEEnumLiteral(participantTypeEEnum, ParticipantType.TRANSLATOR);
		addEEnumLiteral(participantTypeEEnum, ParticipantType.EMERGENCY);

		initEEnum(participantRequiredEEnum, ParticipantRequired.class, "ParticipantRequired");
		addEEnumLiteral(participantRequiredEEnum, ParticipantRequired.REQUIRED);
		addEEnumLiteral(participantRequiredEEnum, ParticipantRequired.OPTIONAL);
		addEEnumLiteral(participantRequiredEEnum, ParticipantRequired.INFORMATIONONLY);

		initEEnum(participationStatusEEnum, ParticipationStatus.class, "ParticipationStatus");
		addEEnumLiteral(participationStatusEEnum, ParticipationStatus.ACCEPTED);
		addEEnumLiteral(participationStatusEEnum, ParticipationStatus.DECLINED);
		addEEnumLiteral(participationStatusEEnum, ParticipationStatus.TENTATIVE);
		addEEnumLiteral(participationStatusEEnum, ParticipationStatus.NEEDSACTION);

		initEEnum(communicationRequestStatusEEnum, CommunicationRequestStatus.class, "CommunicationRequestStatus");
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.PROPOSED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.PLANNED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.REQUESTED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.RECEIVED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.ACCEPTED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.INPROGRESS);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.COMPLETED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.SUSPENDED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.REJECTED);
		addEEnumLiteral(communicationRequestStatusEEnum, CommunicationRequestStatus.FAILED);

		initEEnum(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.class, "DeviceUseRequestStatus");
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.PROPOSED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.PLANNED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.REQUESTED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.RECEIVED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.ACCEPTED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.INPROGRESS);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.COMPLETED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.SUSPENDED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.REJECTED);
		addEEnumLiteral(deviceUseRequestStatusEEnum, DeviceUseRequestStatus.ABORTED);

		initEEnum(deviceUseRequestPriorityEEnum, DeviceUseRequestPriority.class, "DeviceUseRequestPriority");
		addEEnumLiteral(deviceUseRequestPriorityEEnum, DeviceUseRequestPriority.ROUTINE);
		addEEnumLiteral(deviceUseRequestPriorityEEnum, DeviceUseRequestPriority.URGENT);
		addEEnumLiteral(deviceUseRequestPriorityEEnum, DeviceUseRequestPriority.STAT);
		addEEnumLiteral(deviceUseRequestPriorityEEnum, DeviceUseRequestPriority.ASAP);

		initEEnum(medicationOrderStatusEEnum, MedicationOrderStatus.class, "MedicationOrderStatus");
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.ACTIVE);
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.ONHOLD);
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.COMPLETED);
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.ENTEREDINERROR);
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.STOPPED);
		addEEnumLiteral(medicationOrderStatusEEnum, MedicationOrderStatus.DRAFT);

		initEEnum(actSubstanceAdminSubstitutionCodeEEnum, ActSubstanceAdminSubstitutionCode.class, "ActSubstanceAdminSubstitutionCode");

		initEEnum(substanceAdminSubstitutionReasonEEnum, SubstanceAdminSubstitutionReason.class, "SubstanceAdminSubstitutionReason");

		initEEnum(actionListEEnum, ActionList.class, "ActionList");
		addEEnumLiteral(actionListEEnum, ActionList.CANCEL);
		addEEnumLiteral(actionListEEnum, ActionList.POLL);
		addEEnumLiteral(actionListEEnum, ActionList.REPROCESS);
		addEEnumLiteral(actionListEEnum, ActionList.STATUS);

		initEEnum(rulesetCodesEEnum, RulesetCodes.class, "RulesetCodes");
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.X124010);
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.X125010);
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.X127010);
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.CDANETV2);
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.CDANETV4);
		addEEnumLiteral(rulesetCodesEEnum, RulesetCodes.CPHA3);

		initEEnum(supplyRequestStatusEEnum, SupplyRequestStatus.class, "SupplyRequestStatus");
		addEEnumLiteral(supplyRequestStatusEEnum, SupplyRequestStatus.REQUESTED);
		addEEnumLiteral(supplyRequestStatusEEnum, SupplyRequestStatus.COMPLETED);
		addEEnumLiteral(supplyRequestStatusEEnum, SupplyRequestStatus.FAILED);
		addEEnumLiteral(supplyRequestStatusEEnum, SupplyRequestStatus.CANCELLED);

		initEEnum(supplyTypeEEnum, SupplyType.class, "SupplyType");
		addEEnumLiteral(supplyTypeEEnum, SupplyType.CENTRAL);
		addEEnumLiteral(supplyTypeEEnum, SupplyType.NONSTOCK);

		initEEnum(supplyRequestReasonEEnum, SupplyRequestReason.class, "SupplyRequestReason");
		addEEnumLiteral(supplyRequestReasonEEnum, SupplyRequestReason.PATIENTCARE);
		addEEnumLiteral(supplyRequestReasonEEnum, SupplyRequestReason.WARDSTOCK);

		initEEnum(supplyRequestWhenEEnum, SupplyRequestWhen.class, "SupplyRequestWhen");

		initEEnum(exampleVisionPrescriptionProductCodesEEnum, ExampleVisionPrescriptionProductCodes.class, "ExampleVisionPrescriptionProductCodes");
		addEEnumLiteral(exampleVisionPrescriptionProductCodesEEnum, ExampleVisionPrescriptionProductCodes.LENS);
		addEEnumLiteral(exampleVisionPrescriptionProductCodesEEnum, ExampleVisionPrescriptionProductCodes.CONTACT);

		initEEnum(visionEyesEEnum, VisionEyes.class, "VisionEyes");
		addEEnumLiteral(visionEyesEEnum, VisionEyes.RIGHT);
		addEEnumLiteral(visionEyesEEnum, VisionEyes.LEFT);

		initEEnum(visionBaseEEnum, VisionBase.class, "VisionBase");
		addEEnumLiteral(visionBaseEEnum, VisionBase.UP);
		addEEnumLiteral(visionBaseEEnum, VisionBase.DOWN);
		addEEnumLiteral(visionBaseEEnum, VisionBase.IN);
		addEEnumLiteral(visionBaseEEnum, VisionBase.OUT);

		initEEnum(carePlanActivityCategoryEEnum, CarePlanActivityCategory.class, "CarePlanActivityCategory");
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.DIET);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.DRUG);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.ENCOUNTER);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.OBSERVATION);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.PROCEDURE);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.SUPPLY);
		addEEnumLiteral(carePlanActivityCategoryEEnum, CarePlanActivityCategory.OTHER);

		initEEnum(carePlanActivityEEnum, CarePlanActivity.class, "CarePlanActivity");

		initEEnum(activityReasonEEnum, ActivityReason.class, "ActivityReason");

		initEEnum(carePlanActivityStatusEEnum, CarePlanActivityStatus.class, "CarePlanActivityStatus");
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.NOTSTARTED);
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.SCHEDULED);
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.INPROGRESS);
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.ONHOLD);
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.COMPLETED);
		addEEnumLiteral(carePlanActivityStatusEEnum, CarePlanActivityStatus.CANCELLED);

		initEEnum(procedureDeviceActionCodesEEnum, ProcedureDeviceActionCodes.class, "ProcedureDeviceActionCodes");
		addEEnumLiteral(procedureDeviceActionCodesEEnum, ProcedureDeviceActionCodes.IMPLANTED);
		addEEnumLiteral(procedureDeviceActionCodesEEnum, ProcedureDeviceActionCodes.EXPLANTED);
		addEEnumLiteral(procedureDeviceActionCodesEEnum, ProcedureDeviceActionCodes.MANIPULATED);

		initEEnum(lateralityEEnum, Laterality.class, "Laterality");

		initEEnum(koStitleEEnum, KoStitle.class, "KoStitle");

		initEEnum(digitalMediaTypeEEnum, DigitalMediaType.class, "DigitalMediaType");
		addEEnumLiteral(digitalMediaTypeEEnum, DigitalMediaType.PHOTO);
		addEEnumLiteral(digitalMediaTypeEEnum, DigitalMediaType.VIDEO);
		addEEnumLiteral(digitalMediaTypeEEnum, DigitalMediaType.AUDIO);

		initEEnum(mediaSubTypeEEnum, MediaSubType.class, "MediaSubType");
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.DIAGRAM);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.FAX);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.SCAN);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.RETINA);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.FINGERPRINT);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.IRIS);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.PALM);
		addEEnumLiteral(mediaSubTypeEEnum, MediaSubType.FACE);

		initEEnum(mediaCollectionViewProjectionEEnum, MediaCollectionViewProjection.class, "MediaCollectionViewProjection");

		initEEnum(manifestationAndSymptomCodesEEnum, ManifestationAndSymptomCodes.class, "ManifestationAndSymptomCodes");

		initEEnum(admitSourceEEnum, AdmitSource.class, "AdmitSource");
		addEEnumLiteral(admitSourceEEnum, AdmitSource.HOSPTRANS);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.EMD);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.OUTP);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.BORN);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.GP);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.MP);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.NURSING);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.PSYCH);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.REHAB);
		addEEnumLiteral(admitSourceEEnum, AdmitSource.OTHER);

		initEEnum(specialCourtesyEEnum, SpecialCourtesy.class, "SpecialCourtesy");

		initEEnum(specialArrangementsEEnum, SpecialArrangements.class, "SpecialArrangements");
		addEEnumLiteral(specialArrangementsEEnum, SpecialArrangements.WHEEL);
		addEEnumLiteral(specialArrangementsEEnum, SpecialArrangements.STRET);
		addEEnumLiteral(specialArrangementsEEnum, SpecialArrangements.INT);
		addEEnumLiteral(specialArrangementsEEnum, SpecialArrangements.ATT);
		addEEnumLiteral(specialArrangementsEEnum, SpecialArrangements.DOG);

		initEEnum(dischargeDispositionEEnum, DischargeDisposition.class, "DischargeDisposition");
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.HOME);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.OTHERHCF);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.HOSP);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.LONG);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.AADVICE);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.EXP);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.PSY);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.REHAB);
		addEEnumLiteral(dischargeDispositionEEnum, DischargeDisposition.OTH);

		initEEnum(encounterLocationStatusEEnum, EncounterLocationStatus.class, "EncounterLocationStatus");
		addEEnumLiteral(encounterLocationStatusEEnum, EncounterLocationStatus.PLANNED);
		addEEnumLiteral(encounterLocationStatusEEnum, EncounterLocationStatus.ACTIVE);
		addEEnumLiteral(encounterLocationStatusEEnum, EncounterLocationStatus.RESERVED);
		addEEnumLiteral(encounterLocationStatusEEnum, EncounterLocationStatus.COMPLETED);

		initEEnum(namingSystemTypeEEnum, NamingSystemType.class, "NamingSystemType");
		addEEnumLiteral(namingSystemTypeEEnum, NamingSystemType.CODESYSTEM);
		addEEnumLiteral(namingSystemTypeEEnum, NamingSystemType.IDENTIFIER);
		addEEnumLiteral(namingSystemTypeEEnum, NamingSystemType.ROOT);

		initEEnum(namingSystemIdentifierTypeEEnum, NamingSystemIdentifierType.class, "NamingSystemIdentifierType");
		addEEnumLiteral(namingSystemIdentifierTypeEEnum, NamingSystemIdentifierType.OID);
		addEEnumLiteral(namingSystemIdentifierTypeEEnum, NamingSystemIdentifierType.UUID);
		addEEnumLiteral(namingSystemIdentifierTypeEEnum, NamingSystemIdentifierType.URI);
		addEEnumLiteral(namingSystemIdentifierTypeEEnum, NamingSystemIdentifierType.OTHER);

		initEEnum(conceptMapEquivalenceEEnum, ConceptMapEquivalence.class, "ConceptMapEquivalence");
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.EQUIVALENT);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.WIDER);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.SUBSUMES);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.NARROWER);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.SPECIALIZES);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.INEXACT);
		addEEnumLiteral(conceptMapEquivalenceEEnum, ConceptMapEquivalence.UNMATCHED);

		initEEnum(flagCategoryEEnum, FlagCategory.class, "FlagCategory");
		addEEnumLiteral(flagCategoryEEnum, FlagCategory.DIET);
		addEEnumLiteral(flagCategoryEEnum, FlagCategory.DRUG);
		addEEnumLiteral(flagCategoryEEnum, FlagCategory.LAB);
		addEEnumLiteral(flagCategoryEEnum, FlagCategory.ADMIN);
		addEEnumLiteral(flagCategoryEEnum, FlagCategory.CONTACT);

		initEEnum(flagStatusEEnum, FlagStatus.class, "FlagStatus");
		addEEnumLiteral(flagStatusEEnum, FlagStatus.ACTIVE);
		addEEnumLiteral(flagStatusEEnum, FlagStatus.INACTIVE);
		addEEnumLiteral(flagStatusEEnum, FlagStatus.ENTEREDINERROR);

		initEEnum(flagCodeEEnum, FlagCode.class, "FlagCode");

		initEEnum(sequenceTypeEEnum, SequenceType.class, "SequenceType");
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.AA);
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.DNA);
		addEEnumLiteral(sequenceTypeEEnum, SequenceType.RNA);

		initEEnum(dbSnpEEnum, DbSnp.class, "DbSnp");

		initEEnum(ensemblEEnum, Ensembl.class, "Ensembl");

		initEEnum(loinc530345AnswerlistEEnum, Loinc530345Answerlist.class, "Loinc530345Answerlist");
		addEEnumLiteral(loinc530345AnswerlistEEnum, Loinc530345Answerlist.LA67038);
		addEEnumLiteral(loinc530345AnswerlistEEnum, Loinc530345Answerlist.LA67046);
		addEEnumLiteral(loinc530345AnswerlistEEnum, Loinc530345Answerlist.LA67053);
		addEEnumLiteral(loinc530345AnswerlistEEnum, Loinc530345Answerlist.LA67061);
		addEEnumLiteral(loinc530345AnswerlistEEnum, Loinc530345Answerlist.LA67079);

		initEEnum(contractTypeCodesEEnum, ContractTypeCodes.class, "ContractTypeCodes");
		addEEnumLiteral(contractTypeCodesEEnum, ContractTypeCodes.PRIVACY);
		addEEnumLiteral(contractTypeCodesEEnum, ContractTypeCodes.DISCLOSURE);

		initEEnum(contractSubtypeCodesEEnum, ContractSubtypeCodes.class, "ContractSubtypeCodes");
		addEEnumLiteral(contractSubtypeCodesEEnum, ContractSubtypeCodes.DISCLOSURE_CA);
		addEEnumLiteral(contractSubtypeCodesEEnum, ContractSubtypeCodes.DISCLOSURE_US);

		initEEnum(contractActionCodesEEnum, ContractActionCodes.class, "ContractActionCodes");
		addEEnumLiteral(contractActionCodesEEnum, ContractActionCodes.ACTIONA);
		addEEnumLiteral(contractActionCodesEEnum, ContractActionCodes.ACTIONB);

		initEEnum(purposeOfUseEEnum, PurposeOfUse.class, "PurposeOfUse");

		initEEnum(contractActorRoleCodesEEnum, ContractActorRoleCodes.class, "ContractActorRoleCodes");
		addEEnumLiteral(contractActorRoleCodesEEnum, ContractActorRoleCodes.PRACTITIONER);
		addEEnumLiteral(contractActorRoleCodesEEnum, ContractActorRoleCodes.PATIENT);

		initEEnum(contractSignerTypeCodesEEnum, ContractSignerTypeCodes.class, "ContractSignerTypeCodes");
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511211);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511212);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511213);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511214);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511215);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511216);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511217);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511218);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._128401006511219);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112110);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112111);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112112);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112113);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112114);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112115);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112116);
		addEEnumLiteral(contractSignerTypeCodesEEnum, ContractSignerTypeCodes._1284010065112117);

		initEEnum(contractTermTypeCodesEEnum, ContractTermTypeCodes.class, "ContractTermTypeCodes");
		addEEnumLiteral(contractTermTypeCodesEEnum, ContractTermTypeCodes.ORAL_HEALTH);
		addEEnumLiteral(contractTermTypeCodesEEnum, ContractTermTypeCodes.VISION);

		initEEnum(contractTermSubTypeCodesEEnum, ContractTermSubTypeCodes.class, "ContractTermSubTypeCodes");
		addEEnumLiteral(contractTermSubTypeCodesEEnum, ContractTermSubTypeCodes.ORAL_HEALTH_BASIC);
		addEEnumLiteral(contractTermSubTypeCodesEEnum, ContractTermSubTypeCodes.ORAL_HEALTH_MAJOR);
		addEEnumLiteral(contractTermSubTypeCodesEEnum, ContractTermSubTypeCodes.ORAL_HEALTH_ORTHODONTIC);

		initEEnum(fhirDocumentTypeCodesEEnum, FhirDocumentTypeCodes.class, "FhirDocumentTypeCodes");

		initEEnum(fhirDocumentClassCodesEEnum, FhirDocumentClassCodes.class, "FhirDocumentClassCodes");

		initEEnum(v3CodeSystemConfidentialityEEnum, V3CodeSystemConfidentiality.class, "V3CodeSystemConfidentiality");
		addEEnumLiteral(v3CodeSystemConfidentialityEEnum, V3CodeSystemConfidentiality.CONFIDENTIALITY);
		addEEnumLiteral(v3CodeSystemConfidentialityEEnum, V3CodeSystemConfidentiality.CONFIDENTIALITY_BY_ACCESS_KIND);
		addEEnumLiteral(v3CodeSystemConfidentialityEEnum, V3CodeSystemConfidentiality.CONFIDENTIALITY_BY_INFO_TYPE);
		addEEnumLiteral(v3CodeSystemConfidentialityEEnum, V3CodeSystemConfidentiality.CONFIDENTIALITY_MODIFIERS);

		initEEnum(compositionAttestationModeEEnum, CompositionAttestationMode.class, "CompositionAttestationMode");
		addEEnumLiteral(compositionAttestationModeEEnum, CompositionAttestationMode.PERSONAL);
		addEEnumLiteral(compositionAttestationModeEEnum, CompositionAttestationMode.PROFESSIONAL);
		addEEnumLiteral(compositionAttestationModeEEnum, CompositionAttestationMode.LEGAL);
		addEEnumLiteral(compositionAttestationModeEEnum, CompositionAttestationMode.OFFICIAL);

		initEEnum(documentSectionCodesEEnum, DocumentSectionCodes.class, "DocumentSectionCodes");

		initEEnum(listModeEEnum, ListMode.class, "ListMode");
		addEEnumLiteral(listModeEEnum, ListMode.WORKING);
		addEEnumLiteral(listModeEEnum, ListMode.SNAPSHOT);
		addEEnumLiteral(listModeEEnum, ListMode.CHANGES);

		initEEnum(listOrderCodesEEnum, ListOrderCodes.class, "ListOrderCodes");
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.USER);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.SYSTEM);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.EVENTDATE);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.ENTRYDATE);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.PRIORITY);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.ALPHABETIC);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.CATEGORY);
		addEEnumLiteral(listOrderCodesEEnum, ListOrderCodes.PATIENT);

		initEEnum(listEmptyReasonsEEnum, ListEmptyReasons.class, "ListEmptyReasons");
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.NILKNOWN);
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.NOTASKED);
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.WITHHELD);
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.UNAVAILABLE);
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.NOTSTARTED);
		addEEnumLiteral(listEmptyReasonsEEnum, ListEmptyReasons.CLOSED);

		initEEnum(remittanceOutcomeEEnum, RemittanceOutcome.class, "RemittanceOutcome");
		addEEnumLiteral(remittanceOutcomeEEnum, RemittanceOutcome.COMPLETE);
		addEEnumLiteral(remittanceOutcomeEEnum, RemittanceOutcome.ERROR);

		initEEnum(paymentTypeCodesEEnum, PaymentTypeCodes.class, "PaymentTypeCodes");
		addEEnumLiteral(paymentTypeCodesEEnum, PaymentTypeCodes.PAYMENT);
		addEEnumLiteral(paymentTypeCodesEEnum, PaymentTypeCodes.ADJUSTMENT);
		addEEnumLiteral(paymentTypeCodesEEnum, PaymentTypeCodes.ADVANCE);

		initEEnum(formCodesEEnum, FormCodes.class, "FormCodes");
		addEEnumLiteral(formCodesEEnum, FormCodes._1);
		addEEnumLiteral(formCodesEEnum, FormCodes._2);

		initEEnum(noteTypeEEnum, NoteType.class, "NoteType");
		addEEnumLiteral(noteTypeEEnum, NoteType.DISPLAY);
		addEEnumLiteral(noteTypeEEnum, NoteType.PRINT);
		addEEnumLiteral(noteTypeEEnum, NoteType.PRINTOPER);

		initEEnum(conformanceStatementKindEEnum, ConformanceStatementKind.class, "ConformanceStatementKind");
		addEEnumLiteral(conformanceStatementKindEEnum, ConformanceStatementKind.INSTANCE);
		addEEnumLiteral(conformanceStatementKindEEnum, ConformanceStatementKind.CAPABILITY);
		addEEnumLiteral(conformanceStatementKindEEnum, ConformanceStatementKind.REQUIREMENTS);

		initEEnum(unknownContentCodeEEnum, UnknownContentCode.class, "UnknownContentCode");
		addEEnumLiteral(unknownContentCodeEEnum, UnknownContentCode.NO);
		addEEnumLiteral(unknownContentCodeEEnum, UnknownContentCode.EXTENSIONS);
		addEEnumLiteral(unknownContentCodeEEnum, UnknownContentCode.ELEMENTS);
		addEEnumLiteral(unknownContentCodeEEnum, UnknownContentCode.BOTH);

		initEEnum(restfulConformanceModeEEnum, RestfulConformanceMode.class, "RestfulConformanceMode");
		addEEnumLiteral(restfulConformanceModeEEnum, RestfulConformanceMode.CLIENT);
		addEEnumLiteral(restfulConformanceModeEEnum, RestfulConformanceMode.SERVER);

		initEEnum(restfulSecurityServiceEEnum, RestfulSecurityService.class, "RestfulSecurityService");
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.OAUTH);
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.SMAR_TON_FHIR);
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.NTLM);
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.BASIC);
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.KERBEROS);
		addEEnumLiteral(restfulSecurityServiceEEnum, RestfulSecurityService.CERTIFICATES);

		initEEnum(typeRestfulInteractionEEnum, TypeRestfulInteraction.class, "TypeRestfulInteraction");

		initEEnum(resourceVersionPolicyEEnum, ResourceVersionPolicy.class, "ResourceVersionPolicy");
		addEEnumLiteral(resourceVersionPolicyEEnum, ResourceVersionPolicy.NOVERSION);
		addEEnumLiteral(resourceVersionPolicyEEnum, ResourceVersionPolicy.VERSIONED);
		addEEnumLiteral(resourceVersionPolicyEEnum, ResourceVersionPolicy.VERSIONEDUPDATE);

		initEEnum(conditionalDeleteStatusEEnum, ConditionalDeleteStatus.class, "ConditionalDeleteStatus");
		addEEnumLiteral(conditionalDeleteStatusEEnum, ConditionalDeleteStatus.NOTSUPPORTED);
		addEEnumLiteral(conditionalDeleteStatusEEnum, ConditionalDeleteStatus.SINGLE);
		addEEnumLiteral(conditionalDeleteStatusEEnum, ConditionalDeleteStatus.MULTIPLE);

		initEEnum(searchParamTypeEEnum, SearchParamType.class, "SearchParamType");
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.NUMBER);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.DATE);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.STRING);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.TOKEN);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.REFERENCE);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.COMPOSITE);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.QUANTITY);
		addEEnumLiteral(searchParamTypeEEnum, SearchParamType.URI);

		initEEnum(searchModifierCodeEEnum, SearchModifierCode.class, "SearchModifierCode");
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.MISSING);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.EXACT);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.CONTAINS);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.NOT);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.TEXT);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.IN);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.NOTIN);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.BELOW);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.ABOVE);
		addEEnumLiteral(searchModifierCodeEEnum, SearchModifierCode.TYPE);

		initEEnum(systemRestfulInteractionEEnum, SystemRestfulInteraction.class, "SystemRestfulInteraction");

		initEEnum(transactionModeEEnum, TransactionMode.class, "TransactionMode");
		addEEnumLiteral(transactionModeEEnum, TransactionMode.NOTSUPPORTED);
		addEEnumLiteral(transactionModeEEnum, TransactionMode.BATCH);
		addEEnumLiteral(transactionModeEEnum, TransactionMode.TRANSACTION);
		addEEnumLiteral(transactionModeEEnum, TransactionMode.BOTH);

		initEEnum(operationKindEEnum, OperationKind.class, "OperationKind");
		addEEnumLiteral(operationKindEEnum, OperationKind.OPERATION);
		addEEnumLiteral(operationKindEEnum, OperationKind.QUERY);

		initEEnum(messageTransportEEnum, MessageTransport.class, "MessageTransport");
		addEEnumLiteral(messageTransportEEnum, MessageTransport.HTTP);
		addEEnumLiteral(messageTransportEEnum, MessageTransport.FTP);
		addEEnumLiteral(messageTransportEEnum, MessageTransport.MLLP);

		initEEnum(messageEventEEnum, MessageEvent.class, "MessageEvent");
		addEEnumLiteral(messageEventEEnum, MessageEvent.MEDICATION_ADMINISTRATION_COMPLETE);
		addEEnumLiteral(messageEventEEnum, MessageEvent.MEDICATION_ADMINISTRATION_NULLIFICATION);
		addEEnumLiteral(messageEventEEnum, MessageEvent.MEDICATION_ADMINISTRATION_RECORDING);
		addEEnumLiteral(messageEventEEnum, MessageEvent.MEDICATION_ADMINISTRATION_UPDATE);
		addEEnumLiteral(messageEventEEnum, MessageEvent.ADMINNOTIFY);
		addEEnumLiteral(messageEventEEnum, MessageEvent.DIAGNOSTICREPORTPROVIDE);
		addEEnumLiteral(messageEventEEnum, MessageEvent.OBSERVATIONPROVIDE);
		addEEnumLiteral(messageEventEEnum, MessageEvent.PATIENTLINK);
		addEEnumLiteral(messageEventEEnum, MessageEvent.PATIENTUNLINK);
		addEEnumLiteral(messageEventEEnum, MessageEvent.VALUESETEXPAND);

		initEEnum(messageSignificanceCategoryEEnum, MessageSignificanceCategory.class, "MessageSignificanceCategory");
		addEEnumLiteral(messageSignificanceCategoryEEnum, MessageSignificanceCategory.CONSEQUENCE);
		addEEnumLiteral(messageSignificanceCategoryEEnum, MessageSignificanceCategory.CURRENCY);
		addEEnumLiteral(messageSignificanceCategoryEEnum, MessageSignificanceCategory.NOTIFICATION);

		initEEnum(conformanceEventModeEEnum, ConformanceEventMode.class, "ConformanceEventMode");
		addEEnumLiteral(conformanceEventModeEEnum, ConformanceEventMode.SENDER);
		addEEnumLiteral(conformanceEventModeEEnum, ConformanceEventMode.RECEIVER);

		initEEnum(documentModeEEnum, DocumentMode.class, "DocumentMode");
		addEEnumLiteral(documentModeEEnum, DocumentMode.PRODUCER);
		addEEnumLiteral(documentModeEEnum, DocumentMode.CONSUMER);

		initEEnum(profileOriginTypeEEnum, ProfileOriginType.class, "ProfileOriginType");
		addEEnumLiteral(profileOriginTypeEEnum, ProfileOriginType.FHI_RDSTU2_CLIENT);
		addEEnumLiteral(profileOriginTypeEEnum, ProfileOriginType.FHI_RDSTU2_SD_CFORM_FILLER);

		initEEnum(profileDestinationTypeEEnum, ProfileDestinationType.class, "ProfileDestinationType");
		addEEnumLiteral(profileDestinationTypeEEnum, ProfileDestinationType.FHI_RDSTU2_SERVER);
		addEEnumLiteral(profileDestinationTypeEEnum, ProfileDestinationType.FHI_RDSTU2_SD_CFORM_MANAGER);
		addEEnumLiteral(profileDestinationTypeEEnum, ProfileDestinationType.FHI_RDSTU2_SD_CFORM_RECEIVER);
		addEEnumLiteral(profileDestinationTypeEEnum, ProfileDestinationType.FHI_RDSTU2_SD_CFORM_PROCESSOR);

		initEEnum(testScriptOperationCodesEEnum, TestScriptOperationCodes.class, "TestScriptOperationCodes");
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.READ);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.VREAD);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.UPDATE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.DELETE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.HISTORY);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.CREATE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.SEARCH);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.TRANSACTION);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.CONFORMANCE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.CLOSURE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.DOCUMENT);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.EVERYTHING);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.EXPAND);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.FIND);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.LOOKUP);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.META);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.METAADD);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.METADELETE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.POPULATE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.PROCESSMESSAGE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.QUESTIONNAIRE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.TRANSLATE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.VALIDATE);
		addEEnumLiteral(testScriptOperationCodesEEnum, TestScriptOperationCodes.VALIDATECODE);

		initEEnum(contentTypeEEnum, ContentType.class, "ContentType");
		addEEnumLiteral(contentTypeEEnum, ContentType.XML);
		addEEnumLiteral(contentTypeEEnum, ContentType.JSON);

		initEEnum(assertionDirectionTypeEEnum, AssertionDirectionType.class, "AssertionDirectionType");
		addEEnumLiteral(assertionDirectionTypeEEnum, AssertionDirectionType.RESPONSE);
		addEEnumLiteral(assertionDirectionTypeEEnum, AssertionDirectionType.REQUEST);

		initEEnum(assertionOperatorTypeEEnum, AssertionOperatorType.class, "AssertionOperatorType");
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.EQUALS);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.NOT_EQUALS);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.IN);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.NOT_IN);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.GREATER_THAN);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.LESS_THAN);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.EMPTY);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.NOT_EMPTY);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.CONTAINS);
		addEEnumLiteral(assertionOperatorTypeEEnum, AssertionOperatorType.NOT_CONTAINS);

		initEEnum(assertionResponseTypesEEnum, AssertionResponseTypes.class, "AssertionResponseTypes");
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.OKAY);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.CREATED);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.NO_CONTENT);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.NOT_MODIFIED);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.BAD);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.FORBIDDEN);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.NOT_FOUND);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.METHOD_NOT_ALLOWED);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.CONFLICT);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.GONE);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.PRECONDITION_FAILED);
		addEEnumLiteral(assertionResponseTypesEEnum, AssertionResponseTypes.UNPROCESSABLE);

		initEEnum(dataElementStringencyEEnum, DataElementStringency.class, "DataElementStringency");
		addEEnumLiteral(dataElementStringencyEEnum, DataElementStringency.COMPARABLE);
		addEEnumLiteral(dataElementStringencyEEnum, DataElementStringency.FLEXIBLE);

		initEEnum(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.class, "DecisionSupportRuleTriggerType");
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.NAMEDEVENT);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.PERIODIC);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.DATAADDED);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.DATAMODIFIED);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.DATAREMOVED);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.DATAACCESSED);
		addEEnumLiteral(decisionSupportRuleTriggerTypeEEnum, DecisionSupportRuleTriggerType.DATAACCESSENDED);

		initEEnum(decisionSupportRuleParticipantTypeEEnum, DecisionSupportRuleParticipantType.class, "DecisionSupportRuleParticipantType");
		addEEnumLiteral(decisionSupportRuleParticipantTypeEEnum, DecisionSupportRuleParticipantType.PATIENT);
		addEEnumLiteral(decisionSupportRuleParticipantTypeEEnum, DecisionSupportRuleParticipantType.PERSON);
		addEEnumLiteral(decisionSupportRuleParticipantTypeEEnum, DecisionSupportRuleParticipantType.PRACTITIONER);
		addEEnumLiteral(decisionSupportRuleParticipantTypeEEnum, DecisionSupportRuleParticipantType.RELATEDPERSON);

		initEEnum(decisionSupportRuleActionTypeEEnum, DecisionSupportRuleActionType.class, "DecisionSupportRuleActionType");
		addEEnumLiteral(decisionSupportRuleActionTypeEEnum, DecisionSupportRuleActionType.CREATE);
		addEEnumLiteral(decisionSupportRuleActionTypeEEnum, DecisionSupportRuleActionType.UPDATE);
		addEEnumLiteral(decisionSupportRuleActionTypeEEnum, DecisionSupportRuleActionType.REMOVE);
		addEEnumLiteral(decisionSupportRuleActionTypeEEnum, DecisionSupportRuleActionType.FIREEVENT);

		initEEnum(responseTypeEEnum, ResponseType.class, "ResponseType");
		addEEnumLiteral(responseTypeEEnum, ResponseType.OK);
		addEEnumLiteral(responseTypeEEnum, ResponseType.TRANSIENTERROR);
		addEEnumLiteral(responseTypeEEnum, ResponseType.FATALERROR);

		initEEnum(issueSeverityEEnum, IssueSeverity.class, "IssueSeverity");
		addEEnumLiteral(issueSeverityEEnum, IssueSeverity.FATAL);
		addEEnumLiteral(issueSeverityEEnum, IssueSeverity.ERROR);
		addEEnumLiteral(issueSeverityEEnum, IssueSeverity.WARNING);
		addEEnumLiteral(issueSeverityEEnum, IssueSeverity.INFORMATION);

		initEEnum(issueTypeEEnum, IssueType.class, "IssueType");
		addEEnumLiteral(issueTypeEEnum, IssueType.INVALID);
		addEEnumLiteral(issueTypeEEnum, IssueType.SECURITY);
		addEEnumLiteral(issueTypeEEnum, IssueType.PROCESSING);
		addEEnumLiteral(issueTypeEEnum, IssueType.TRANSIENT);
		addEEnumLiteral(issueTypeEEnum, IssueType.INFORMATIONAL);

		initEEnum(operationOutcomeCodesEEnum, OperationOutcomeCodes.class, "OperationOutcomeCodes");
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_AUTH_REQUIRED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_BAD_FORMAT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_BAD_SYNTAX);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_CANT_PARSE_CONTENT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_CANT_PARSE_ROOT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_CREATED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_DATE_FORMAT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_DELETED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_DELETED_DONE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_DELETED_ID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_DUPLICATE_ID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_ERROR_PARSING);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_ID_INVALID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_ID_TOO_LONG);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_INVALID_ID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_JSON_OBJECT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_LOCAL_FAIL);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_NO_MATCH);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_NO_EXIST);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_NO_MODULE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_NO_SUMMARY);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_OP_NOT_ALLOWED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_PARAM_CHAINED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_PARAM_NO_REPEAT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_PARAM_UNKNOWN);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_PARAM_INVALID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_PARAM_MODIFIER_INVALID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_EXAMPLE_PROTECTED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_ID_FAIL);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_NOT_ALLOWED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_REQUIRED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_ID_MISMATCH);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_ID_MISSING);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_RESOURCE_TYPE_MISMATCH);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_SORT_UNKNOWN);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_TRANSACTION_DUPLICATE_ID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_TRANSACTION_MISSING_ID);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_UNHANDLED_NODE_TYPE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_UNKNOWN_CONTENT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_UNKNOWN_OPERATION);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_UNKNOWN_TYPE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_UPDATED);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_VERSION_AWARE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_VERSION_AWARE_CONFLICT);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_VERSION_AWARE_URL);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.MSG_WRONG_NS);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.SEARCH_MULTIPLE);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.UPDATE_MULTIPLE_MATCHES);
		addEEnumLiteral(operationOutcomeCodesEEnum, OperationOutcomeCodes.SEARCH_NONE);

		initEEnum(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.class, "ExampleMessageReasonCodes");
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.ADMIT);
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.DISCHARGE);
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.ABSENT);
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.RETURN);
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.MOVED);
		addEEnumLiteral(exampleMessageReasonCodesEEnum, ExampleMessageReasonCodes.EDIT);

		initEEnum(subscriptionStatusEEnum, SubscriptionStatus.class, "SubscriptionStatus");
		addEEnumLiteral(subscriptionStatusEEnum, SubscriptionStatus.REQUESTED);
		addEEnumLiteral(subscriptionStatusEEnum, SubscriptionStatus.ACTIVE);
		addEEnumLiteral(subscriptionStatusEEnum, SubscriptionStatus.ERROR);
		addEEnumLiteral(subscriptionStatusEEnum, SubscriptionStatus.OFF);

		initEEnum(subscriptionChannelTypeEEnum, SubscriptionChannelType.class, "SubscriptionChannelType");
		addEEnumLiteral(subscriptionChannelTypeEEnum, SubscriptionChannelType.RESTHOOK);
		addEEnumLiteral(subscriptionChannelTypeEEnum, SubscriptionChannelType.WEBSOCKET);
		addEEnumLiteral(subscriptionChannelTypeEEnum, SubscriptionChannelType.EMAIL);
		addEEnumLiteral(subscriptionChannelTypeEEnum, SubscriptionChannelType.SMS);
		addEEnumLiteral(subscriptionChannelTypeEEnum, SubscriptionChannelType.MESSAGE);

		initEEnum(subscriptionTagEEnum, SubscriptionTag.class, "SubscriptionTag");
		addEEnumLiteral(subscriptionTagEEnum, SubscriptionTag.QUEUED);
		addEEnumLiteral(subscriptionTagEEnum, SubscriptionTag.DELIVERED);

		initEEnum(actCoverageTypeCodeEEnum, ActCoverageTypeCode.class, "ActCoverageTypeCode");

		initEEnum(relationshipCodesEEnum, RelationshipCodes.class, "RelationshipCodes");
		addEEnumLiteral(relationshipCodesEEnum, RelationshipCodes._1);
		addEEnumLiteral(relationshipCodesEEnum, RelationshipCodes._2);
		addEEnumLiteral(relationshipCodesEEnum, RelationshipCodes._3);
		addEEnumLiteral(relationshipCodesEEnum, RelationshipCodes._4);
		addEEnumLiteral(relationshipCodesEEnum, RelationshipCodes._5);

		initEEnum(vaccineAdministeredValueSetEEnum, VaccineAdministeredValueSet.class, "VaccineAdministeredValueSet");

		initEEnum(immunizationRecommendationStatusCodesEEnum, ImmunizationRecommendationStatusCodes.class, "ImmunizationRecommendationStatusCodes");
		addEEnumLiteral(immunizationRecommendationStatusCodesEEnum, ImmunizationRecommendationStatusCodes.DUE);
		addEEnumLiteral(immunizationRecommendationStatusCodesEEnum, ImmunizationRecommendationStatusCodes.OVERDUE);

		initEEnum(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.class, "ImmunizationRecommendationDateCriterionCodes");
		addEEnumLiteral(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.DUE);
		addEEnumLiteral(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.RECOMMENDED);
		addEEnumLiteral(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.EARLIEST);
		addEEnumLiteral(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.OVERDUE);
		addEEnumLiteral(immunizationRecommendationDateCriterionCodesEEnum, ImmunizationRecommendationDateCriterionCodes.LATEST);

		initEEnum(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.class, "MedicationAdministrationStatus");
		addEEnumLiteral(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.INPROGRESS);
		addEEnumLiteral(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.ONHOLD);
		addEEnumLiteral(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.COMPLETED);
		addEEnumLiteral(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.ENTEREDINERROR);
		addEEnumLiteral(medicationAdministrationStatusEEnum, MedicationAdministrationStatus.STOPPED);

		initEEnum(codesForImmunizationSiteOfAdministrationEEnum, CodesForImmunizationSiteOfAdministration.class, "CodesForImmunizationSiteOfAdministration");

		initEEnum(immunizationRouteCodesEEnum, ImmunizationRouteCodes.class, "ImmunizationRouteCodes");

		initEEnum(immunizationReasonCodesEEnum, ImmunizationReasonCodes.class, "ImmunizationReasonCodes");

		initEEnum(immunizationReasonsForNotImmunizingCodesEEnum, ImmunizationReasonsForNotImmunizingCodes.class, "ImmunizationReasonsForNotImmunizingCodes");

		initEEnum(vaccinationProtocolDoseTargetCodesEEnum, VaccinationProtocolDoseTargetCodes.class, "VaccinationProtocolDoseTargetCodes");

		initEEnum(vaccinationProtocolDoseStatusCodesEEnum, VaccinationProtocolDoseStatusCodes.class, "VaccinationProtocolDoseStatusCodes");
		addEEnumLiteral(vaccinationProtocolDoseStatusCodesEEnum, VaccinationProtocolDoseStatusCodes.COUNT);
		addEEnumLiteral(vaccinationProtocolDoseStatusCodesEEnum, VaccinationProtocolDoseStatusCodes.NOCOUNT);

		initEEnum(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.class, "VaccinationProtocolDoseStatusReasonCodes");
		addEEnumLiteral(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.ADVSTORAGE);
		addEEnumLiteral(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.COLDCHBRK);
		addEEnumLiteral(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.EXPLOT);
		addEEnumLiteral(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.OUTSIDESCHED);
		addEEnumLiteral(vaccinationProtocolDoseStatusReasonCodesEEnum, VaccinationProtocolDoseStatusReasonCodes.PRODRECALL);

		initEEnum(bundleTypeEEnum, BundleType.class, "BundleType");
		addEEnumLiteral(bundleTypeEEnum, BundleType.DOCUMENT);
		addEEnumLiteral(bundleTypeEEnum, BundleType.MESSAGE);
		addEEnumLiteral(bundleTypeEEnum, BundleType.TRANSACTION);
		addEEnumLiteral(bundleTypeEEnum, BundleType.TRANSACTIONRESPONSE);
		addEEnumLiteral(bundleTypeEEnum, BundleType.BATCH);
		addEEnumLiteral(bundleTypeEEnum, BundleType.BATCHRESPONSE);
		addEEnumLiteral(bundleTypeEEnum, BundleType.HISTORY);
		addEEnumLiteral(bundleTypeEEnum, BundleType.SEARCHSET);
		addEEnumLiteral(bundleTypeEEnum, BundleType.COLLECTION);

		initEEnum(searchEntryModeEEnum, SearchEntryMode.class, "SearchEntryMode");
		addEEnumLiteral(searchEntryModeEEnum, SearchEntryMode.MATCH);
		addEEnumLiteral(searchEntryModeEEnum, SearchEntryMode.INCLUDE);
		addEEnumLiteral(searchEntryModeEEnum, SearchEntryMode.OUTCOME);

		initEEnum(httpVerbEEnum, HttpVerb.class, "HttpVerb");
		addEEnumLiteral(httpVerbEEnum, HttpVerb.GET);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.POST);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.PUT);
		addEEnumLiteral(httpVerbEEnum, HttpVerb.DELETE);

		initEEnum(priorityCodesEEnum, PriorityCodes.class, "PriorityCodes");
		addEEnumLiteral(priorityCodesEEnum, PriorityCodes.STAT);
		addEEnumLiteral(priorityCodesEEnum, PriorityCodes.NORMAL);
		addEEnumLiteral(priorityCodesEEnum, PriorityCodes.DEFERRED);

		initEEnum(benefitCategoryCodesEEnum, BenefitCategoryCodes.class, "BenefitCategoryCodes");
		addEEnumLiteral(benefitCategoryCodesEEnum, BenefitCategoryCodes.ORAL);
		addEEnumLiteral(benefitCategoryCodesEEnum, BenefitCategoryCodes.VISION);
		addEEnumLiteral(benefitCategoryCodesEEnum, BenefitCategoryCodes.MEDICAL);
		addEEnumLiteral(benefitCategoryCodesEEnum, BenefitCategoryCodes.PHARMACY);

		initEEnum(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.class, "BenefitSubCategoryCodes");
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.ORALBASIC);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.ORALMAJOR);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.ORALORTHO);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.VISIONEXAM);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.VISIONGLASSES);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.VISIONCONTACTS);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.MEDICALPRIMARYCARE);
		addEEnumLiteral(benefitSubCategoryCodesEEnum, BenefitSubCategoryCodes.PHARMACYDISPENSE);

		initEEnum(networkTypeCodesEEnum, NetworkTypeCodes.class, "NetworkTypeCodes");
		addEEnumLiteral(networkTypeCodesEEnum, NetworkTypeCodes.IN);
		addEEnumLiteral(networkTypeCodesEEnum, NetworkTypeCodes.OUT);

		initEEnum(unitTypeCodesEEnum, UnitTypeCodes.class, "UnitTypeCodes");
		addEEnumLiteral(unitTypeCodesEEnum, UnitTypeCodes.INDIVIDUAL);
		addEEnumLiteral(unitTypeCodesEEnum, UnitTypeCodes.FAMILY);

		initEEnum(benefitTermCodesEEnum, BenefitTermCodes.class, "BenefitTermCodes");
		addEEnumLiteral(benefitTermCodesEEnum, BenefitTermCodes.ANNUAL);
		addEEnumLiteral(benefitTermCodesEEnum, BenefitTermCodes.LIFETIME);

		initEEnum(benefitTypeCodesEEnum, BenefitTypeCodes.class, "BenefitTypeCodes");
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.DEDUCTABLE);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.VISIT);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.COPAY);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.VISIONEXAM);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.VISIONGLASSES);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.VISIONCONTACTS);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.MEDICALPRIMARYCARE);
		addEEnumLiteral(benefitTypeCodesEEnum, BenefitTypeCodes.PHARMACYDISPENSE);

		initEEnum(adjudicationErrorCodesEEnum, AdjudicationErrorCodes.class, "AdjudicationErrorCodes");
		addEEnumLiteral(adjudicationErrorCodesEEnum, AdjudicationErrorCodes.A001);
		addEEnumLiteral(adjudicationErrorCodesEEnum, AdjudicationErrorCodes.A002);

		initEEnum(medicationDispenseStatusEEnum, MedicationDispenseStatus.class, "MedicationDispenseStatus");
		addEEnumLiteral(medicationDispenseStatusEEnum, MedicationDispenseStatus.INPROGRESS);
		addEEnumLiteral(medicationDispenseStatusEEnum, MedicationDispenseStatus.ONHOLD);
		addEEnumLiteral(medicationDispenseStatusEEnum, MedicationDispenseStatus.COMPLETED);
		addEEnumLiteral(medicationDispenseStatusEEnum, MedicationDispenseStatus.ENTEREDINERROR);
		addEEnumLiteral(medicationDispenseStatusEEnum, MedicationDispenseStatus.STOPPED);

		initEEnum(actPharmacySupplyTypeEEnum, ActPharmacySupplyType.class, "ActPharmacySupplyType");

		initEEnum(claimTypeEEnum, ClaimType.class, "ClaimType");
		addEEnumLiteral(claimTypeEEnum, ClaimType.INSTITUTIONAL);
		addEEnumLiteral(claimTypeEEnum, ClaimType.ORAL);
		addEEnumLiteral(claimTypeEEnum, ClaimType.PHARMACY);
		addEEnumLiteral(claimTypeEEnum, ClaimType.PROFESSIONAL);
		addEEnumLiteral(claimTypeEEnum, ClaimType.VISION);

		initEEnum(useEEnum, Use.class, "Use");
		addEEnumLiteral(useEEnum, Use.COMPLETE);
		addEEnumLiteral(useEEnum, Use.PROPOSED);
		addEEnumLiteral(useEEnum, Use.EXPLORATORY);
		addEEnumLiteral(useEEnum, Use.OTHER);

		initEEnum(fundsReservationCodesEEnum, FundsReservationCodes.class, "FundsReservationCodes");
		addEEnumLiteral(fundsReservationCodesEEnum, FundsReservationCodes.PATIENT);
		addEEnumLiteral(fundsReservationCodesEEnum, FundsReservationCodes.PROVIDER);
		addEEnumLiteral(fundsReservationCodesEEnum, FundsReservationCodes.NONE);

		initEEnum(payeeTypeCodesEEnum, PayeeTypeCodes.class, "PayeeTypeCodes");
		addEEnumLiteral(payeeTypeCodesEEnum, PayeeTypeCodes.SUBSCRIBER);
		addEEnumLiteral(payeeTypeCodesEEnum, PayeeTypeCodes.PROVIDER);
		addEEnumLiteral(payeeTypeCodesEEnum, PayeeTypeCodes.OTHER);

		initEEnum(icD10CodesEEnum, IcD10Codes.class, "IcD10Codes");

		initEEnum(conditionsCodesEEnum, ConditionsCodes.class, "ConditionsCodes");
		addEEnumLiteral(conditionsCodesEEnum, ConditionsCodes._123987);

		initEEnum(exceptionCodesEEnum, ExceptionCodes.class, "ExceptionCodes");
		addEEnumLiteral(exceptionCodesEEnum, ExceptionCodes.STUDENT);
		addEEnumLiteral(exceptionCodesEEnum, ExceptionCodes.DISABLED);

		initEEnum(actIncidentCodeEEnum, ActIncidentCode.class, "ActIncidentCode");

		initEEnum(interventionCodesEEnum, InterventionCodes.class, "InterventionCodes");
		addEEnumLiteral(interventionCodesEEnum, InterventionCodes.UNKNOWN);
		addEEnumLiteral(interventionCodesEEnum, InterventionCodes.OTHER);

		initEEnum(actInvoiceGroupCodeEEnum, ActInvoiceGroupCode.class, "ActInvoiceGroupCode");

		initEEnum(usclsCodesEEnum, UsclsCodes.class, "UsclsCodes");
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._1101);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._1102);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._1103);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._1201);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._1205);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._2101);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._2102);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._2141);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._2601);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._11101);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._11102);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._11103);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._11104);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._21211);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._21212);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._27211);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._99111);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._99333);
		addEEnumLiteral(usclsCodesEEnum, UsclsCodes._99555);

		initEEnum(exampleServicePlaceCodesEEnum, ExampleServicePlaceCodes.class, "ExampleServicePlaceCodes");
		addEEnumLiteral(exampleServicePlaceCodesEEnum, ExampleServicePlaceCodes.EMERGENCY);
		addEEnumLiteral(exampleServicePlaceCodesEEnum, ExampleServicePlaceCodes.CLINIC);

		initEEnum(udiCodesEEnum, UdiCodes.class, "UdiCodes");
		addEEnumLiteral(udiCodesEEnum, UdiCodes.GUDID);

		initEEnum(toothCodesEEnum, ToothCodes.class, "ToothCodes");
		addEEnumLiteral(toothCodesEEnum, ToothCodes._0);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._1);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._2);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._3);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._4);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._5);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._6);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._7);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._8);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._11);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._12);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._13);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._14);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._15);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._16);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._17);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._18);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._21);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._22);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._23);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._24);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._25);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._26);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._27);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._28);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._31);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._32);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._33);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._34);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._35);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._36);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._37);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._38);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._41);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._42);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._43);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._44);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._45);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._46);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._47);
		addEEnumLiteral(toothCodesEEnum, ToothCodes._48);

		initEEnum(surfaceCodesEEnum, SurfaceCodes.class, "SurfaceCodes");
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.M);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.O);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.I);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.D);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.B);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.V);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.L);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.MO);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.DO);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.DI);
		addEEnumLiteral(surfaceCodesEEnum, SurfaceCodes.MOD);

		initEEnum(modifierTypeCodesEEnum, ModifierTypeCodes.class, "ModifierTypeCodes");
		addEEnumLiteral(modifierTypeCodesEEnum, ModifierTypeCodes.A);
		addEEnumLiteral(modifierTypeCodesEEnum, ModifierTypeCodes.B);
		addEEnumLiteral(modifierTypeCodesEEnum, ModifierTypeCodes.C);
		addEEnumLiteral(modifierTypeCodesEEnum, ModifierTypeCodes.E);
		addEEnumLiteral(modifierTypeCodesEEnum, ModifierTypeCodes.X);

		initEEnum(oralProsthoMaterialTypeCodesEEnum, OralProsthoMaterialTypeCodes.class, "OralProsthoMaterialTypeCodes");
		addEEnumLiteral(oralProsthoMaterialTypeCodesEEnum, OralProsthoMaterialTypeCodes._1);
		addEEnumLiteral(oralProsthoMaterialTypeCodesEEnum, OralProsthoMaterialTypeCodes._2);
		addEEnumLiteral(oralProsthoMaterialTypeCodesEEnum, OralProsthoMaterialTypeCodes._3);
		addEEnumLiteral(oralProsthoMaterialTypeCodesEEnum, OralProsthoMaterialTypeCodes._4);

		initEEnum(additionalMaterialCodesEEnum, AdditionalMaterialCodes.class, "AdditionalMaterialCodes");
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.XRAY);
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.IMAGE);
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.EMAIL);
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.MODEL);
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.DOCUMENT);
		addEEnumLiteral(additionalMaterialCodesEEnum, AdditionalMaterialCodes.OTHER);

		initEEnum(teethCodesEEnum, TeethCodes.class, "TeethCodes");
		addEEnumLiteral(teethCodesEEnum, TeethCodes._11);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._12);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._13);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._14);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._15);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._16);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._17);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._18);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._21);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._22);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._23);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._24);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._25);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._26);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._27);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._28);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._31);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._32);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._33);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._34);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._35);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._36);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._37);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._38);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._41);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._42);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._43);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._44);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._45);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._46);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._47);
		addEEnumLiteral(teethCodesEEnum, TeethCodes._48);

		initEEnum(missingToothReasonCodesEEnum, MissingToothReasonCodes.class, "MissingToothReasonCodes");
		addEEnumLiteral(missingToothReasonCodesEEnum, MissingToothReasonCodes.E);
		addEEnumLiteral(missingToothReasonCodesEEnum, MissingToothReasonCodes.C);
		addEEnumLiteral(missingToothReasonCodesEEnum, MissingToothReasonCodes.U);
		addEEnumLiteral(missingToothReasonCodesEEnum, MissingToothReasonCodes.O);

		initEEnum(adjudicationCodesEEnum, AdjudicationCodes.class, "AdjudicationCodes");
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.TOTAL);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.COPAY);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.ELIGIBLE);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.DEDUCTIBLE);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.ELIGPERCENT);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.TAX);
		addEEnumLiteral(adjudicationCodesEEnum, AdjudicationCodes.BENEFIT);

		initEEnum(paymentAdjustmentReasonCodesEEnum, PaymentAdjustmentReasonCodes.class, "PaymentAdjustmentReasonCodes");
		addEEnumLiteral(paymentAdjustmentReasonCodesEEnum, PaymentAdjustmentReasonCodes.A001);
		addEEnumLiteral(paymentAdjustmentReasonCodesEEnum, PaymentAdjustmentReasonCodes.A002);

		initEEnum(adjudicationReasonCodesEEnum, AdjudicationReasonCodes.class, "AdjudicationReasonCodes");
		addEEnumLiteral(adjudicationReasonCodesEEnum, AdjudicationReasonCodes.AR001);
		addEEnumLiteral(adjudicationReasonCodesEEnum, AdjudicationReasonCodes.AR002);

		initEEnum(guideDependencyTypeEEnum, GuideDependencyType.class, "GuideDependencyType");
		addEEnumLiteral(guideDependencyTypeEEnum, GuideDependencyType.REFERENCE);
		addEEnumLiteral(guideDependencyTypeEEnum, GuideDependencyType.INCLUSION);

		initEEnum(guideResourcePurposeEEnum, GuideResourcePurpose.class, "GuideResourcePurpose");
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.EXAMPLE);
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.TERMINOLOGY);
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.PROFILE);
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.EXTENSION);
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.DICTIONARY);
		addEEnumLiteral(guideResourcePurposeEEnum, GuideResourcePurpose.LOGICAL);

		initEEnum(guidePageKindEEnum, GuidePageKind.class, "GuidePageKind");
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.PAGE);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.EXAMPLE);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.LIST);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.INCLUDE);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.DIRECTORY);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.TOC);
		addEEnumLiteral(guidePageKindEEnum, GuidePageKind.RESOURCE);

		initEEnum(xPathUsageTypeEEnum, XPathUsageType.class, "XPathUsageType");
		addEEnumLiteral(xPathUsageTypeEEnum, XPathUsageType.NORMAL);
		addEEnumLiteral(xPathUsageTypeEEnum, XPathUsageType.PHONETIC);
		addEEnumLiteral(xPathUsageTypeEEnum, XPathUsageType.NEARBY);
		addEEnumLiteral(xPathUsageTypeEEnum, XPathUsageType.DISTANCE);
		addEEnumLiteral(xPathUsageTypeEEnum, XPathUsageType.OTHER);

		initEEnum(orderSetParticipantTypeEEnum, OrderSetParticipantType.class, "OrderSetParticipantType");
		addEEnumLiteral(orderSetParticipantTypeEEnum, OrderSetParticipantType.PATIENT);
		addEEnumLiteral(orderSetParticipantTypeEEnum, OrderSetParticipantType.PERSON);
		addEEnumLiteral(orderSetParticipantTypeEEnum, OrderSetParticipantType.PRACTITIONER);
		addEEnumLiteral(orderSetParticipantTypeEEnum, OrderSetParticipantType.RELATEDPERSON);

		initEEnum(orderSetItemTypeEEnum, OrderSetItemType.class, "OrderSetItemType");
		addEEnumLiteral(orderSetItemTypeEEnum, OrderSetItemType.CREATE);
		addEEnumLiteral(orderSetItemTypeEEnum, OrderSetItemType.UPDATE);
		addEEnumLiteral(orderSetItemTypeEEnum, OrderSetItemType.REMOVE);
		addEEnumLiteral(orderSetItemTypeEEnum, OrderSetItemType.FIREEVENT);

		initEEnum(orderSetItemGroupingBehaviorEEnum, OrderSetItemGroupingBehavior.class, "OrderSetItemGroupingBehavior");
		addEEnumLiteral(orderSetItemGroupingBehaviorEEnum, OrderSetItemGroupingBehavior.VISUALGROUP);
		addEEnumLiteral(orderSetItemGroupingBehaviorEEnum, OrderSetItemGroupingBehavior.LOGICALGROUP);
		addEEnumLiteral(orderSetItemGroupingBehaviorEEnum, OrderSetItemGroupingBehavior.SENTENCEGROUP);

		initEEnum(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.class, "OrderSetItemSelectionBehavior");
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.ANY);
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.ALL);
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.ALLORNONE);
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.EXACTLYONE);
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.ATMOSTONE);
		addEEnumLiteral(orderSetItemSelectionBehaviorEEnum, OrderSetItemSelectionBehavior.ONEORMORE);

		initEEnum(orderSetItemRequiredBehaviorEEnum, OrderSetItemRequiredBehavior.class, "OrderSetItemRequiredBehavior");
		addEEnumLiteral(orderSetItemRequiredBehaviorEEnum, OrderSetItemRequiredBehavior.MUST);
		addEEnumLiteral(orderSetItemRequiredBehaviorEEnum, OrderSetItemRequiredBehavior.COULD);
		addEEnumLiteral(orderSetItemRequiredBehaviorEEnum, OrderSetItemRequiredBehavior.MUSTUNLESSDOCUMENTED);

		initEEnum(orderSetItemPrecheckBehaviorEEnum, OrderSetItemPrecheckBehavior.class, "OrderSetItemPrecheckBehavior");
		addEEnumLiteral(orderSetItemPrecheckBehaviorEEnum, OrderSetItemPrecheckBehavior.YES);
		addEEnumLiteral(orderSetItemPrecheckBehaviorEEnum, OrderSetItemPrecheckBehavior.NO);

		initEEnum(orderSetItemCardinalityBehaviorEEnum, OrderSetItemCardinalityBehavior.class, "OrderSetItemCardinalityBehavior");
		addEEnumLiteral(orderSetItemCardinalityBehaviorEEnum, OrderSetItemCardinalityBehavior.SINGLE);
		addEEnumLiteral(orderSetItemCardinalityBehaviorEEnum, OrderSetItemCardinalityBehavior.MULTIPLE);

		initEEnum(provenanceEventCurrentStateEEnum, ProvenanceEventCurrentState.class, "ProvenanceEventCurrentState");

		initEEnum(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.class, "ProvenanceParticipantRole");
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.ENTERER);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.PERFORMER);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.AUTHOR);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.VERIFIER);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.ATTESTER);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.INFORMANT);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.CUSTODIAN);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.ASSEMBLER);
		addEEnumLiteral(provenanceParticipantRoleEEnum, ProvenanceParticipantRole.COMPOSER);

		initEEnum(v3CodeSystemRoleLinkTypeEEnum, V3CodeSystemRoleLinkType.class, "V3CodeSystemRoleLinkType");
		addEEnumLiteral(v3CodeSystemRoleLinkTypeEEnum, V3CodeSystemRoleLinkType.REL);

		initEEnum(provenanceEntityRoleEEnum, ProvenanceEntityRole.class, "ProvenanceEntityRole");
		addEEnumLiteral(provenanceEntityRoleEEnum, ProvenanceEntityRole.DERIVATION);

		initEEnum(processOutcomeCodesEEnum, ProcessOutcomeCodes.class, "ProcessOutcomeCodes");
		addEEnumLiteral(processOutcomeCodesEEnum, ProcessOutcomeCodes.COMPLETE);
		addEEnumLiteral(processOutcomeCodesEEnum, ProcessOutcomeCodes.PENDED);
		addEEnumLiteral(processOutcomeCodesEEnum, ProcessOutcomeCodes.ERROR);

		initEEnum(measurePopulationTypeEEnum, MeasurePopulationType.class, "MeasurePopulationType");
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.INITIALPOPULATION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.NUMERATOR);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.NUMERATOREXCLUSION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.DENOMINATOR);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.DENOMINATOREXCLUSION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.DENOMINATOREXCEPTION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.MEASUREPOPULATION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.MEASUREPOPULATIONEXCLUSION);
		addEEnumLiteral(measurePopulationTypeEEnum, MeasurePopulationType.MEASURESCORE);

		initEEnum(paymentStatusCodesEEnum, PaymentStatusCodes.class, "PaymentStatusCodes");
		addEEnumLiteral(paymentStatusCodesEEnum, PaymentStatusCodes.PAID);
		addEEnumLiteral(paymentStatusCodesEEnum, PaymentStatusCodes.CLEARED);

		initEEnum(exampleUseCodesForListEEnum, ExampleUseCodesForList.class, "ExampleUseCodesForList");
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.ALERTS);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.ADVERSERXNS);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.ALLERGIES);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.MEDICATIONS);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.PROBLEMS);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.WORKLIST);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.WAITING);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.PROTOCOLS);
		addEEnumLiteral(exampleUseCodesForListEEnum, ExampleUseCodesForList.PLANS);

		initEEnum(listStatusEEnum, ListStatus.class, "ListStatus");
		addEEnumLiteral(listStatusEEnum, ListStatus.CURRENT);
		addEEnumLiteral(listStatusEEnum, ListStatus.RETIRED);
		addEEnumLiteral(listStatusEEnum, ListStatus.ENTEREDINERROR);

		initEEnum(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes.class, "PatientMedicineChangeTypes");
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._01);
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._02);
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._03);
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._04);
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._05);
		addEEnumLiteral(patientMedicineChangeTypesEEnum, PatientMedicineChangeTypes._06);

		initEEnum(guidanceResponseStatusEEnum, GuidanceResponseStatus.class, "GuidanceResponseStatus");
		addEEnumLiteral(guidanceResponseStatusEEnum, GuidanceResponseStatus.SUCCESS);
		addEEnumLiteral(guidanceResponseStatusEEnum, GuidanceResponseStatus.DATAREQUESTED);
		addEEnumLiteral(guidanceResponseStatusEEnum, GuidanceResponseStatus.DATAREQUIRED);
		addEEnumLiteral(guidanceResponseStatusEEnum, GuidanceResponseStatus.INPROGRESS);
		addEEnumLiteral(guidanceResponseStatusEEnum, GuidanceResponseStatus.FAILURE);

		initEEnum(guidanceResponseActionTypeEEnum, GuidanceResponseActionType.class, "GuidanceResponseActionType");
		addEEnumLiteral(guidanceResponseActionTypeEEnum, GuidanceResponseActionType.CREATE);
		addEEnumLiteral(guidanceResponseActionTypeEEnum, GuidanceResponseActionType.UPDATE);
		addEEnumLiteral(guidanceResponseActionTypeEEnum, GuidanceResponseActionType.REMOVE);
		addEEnumLiteral(guidanceResponseActionTypeEEnum, GuidanceResponseActionType.FIREEVENT);

		initEEnum(detectedIssueCategoryEEnum, DetectedIssueCategory.class, "DetectedIssueCategory");

		initEEnum(detectedIssueSeverityEEnum, DetectedIssueSeverity.class, "DetectedIssueSeverity");
		addEEnumLiteral(detectedIssueSeverityEEnum, DetectedIssueSeverity.HIGH);
		addEEnumLiteral(detectedIssueSeverityEEnum, DetectedIssueSeverity.MODERATE);
		addEEnumLiteral(detectedIssueSeverityEEnum, DetectedIssueSeverity.LOW);

		initEEnum(detectedIssueMitigationActionEEnum, DetectedIssueMitigationAction.class, "DetectedIssueMitigationAction");

		initEEnum(accountStatusEEnum, AccountStatus.class, "AccountStatus");
		addEEnumLiteral(accountStatusEEnum, AccountStatus.ACTIVE);
		addEEnumLiteral(accountStatusEEnum, AccountStatus.INACTIVE);

		initEEnum(reasonMedicationGivenCodesEEnum, ReasonMedicationGivenCodes.class, "ReasonMedicationGivenCodes");
		addEEnumLiteral(reasonMedicationGivenCodesEEnum, ReasonMedicationGivenCodes.A);
		addEEnumLiteral(reasonMedicationGivenCodesEEnum, ReasonMedicationGivenCodes.B);
		addEEnumLiteral(reasonMedicationGivenCodesEEnum, ReasonMedicationGivenCodes.C);

		initEEnum(participantStatusEEnum, ParticipantStatus.class, "ParticipantStatus");
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.ACCEPTED);
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.DECLINED);
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.TENTATIVE);
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.INPROCESS);
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.COMPLETED);
		addEEnumLiteral(participantStatusEEnum, ParticipantStatus.NEEDSACTION);

		initEEnum(auditEventIdEEnum, AuditEventId.class, "AuditEventId");
		addEEnumLiteral(auditEventIdEEnum, AuditEventId.REST);

		initEEnum(auditEventSubTypeEEnum, AuditEventSubType.class, "AuditEventSubType");

		initEEnum(auditEventActionEEnum, AuditEventAction.class, "AuditEventAction");
		addEEnumLiteral(auditEventActionEEnum, AuditEventAction.C);
		addEEnumLiteral(auditEventActionEEnum, AuditEventAction.R);
		addEEnumLiteral(auditEventActionEEnum, AuditEventAction.U);
		addEEnumLiteral(auditEventActionEEnum, AuditEventAction.D);
		addEEnumLiteral(auditEventActionEEnum, AuditEventAction.E);

		initEEnum(auditEventOutcomeEEnum, AuditEventOutcome.class, "AuditEventOutcome");
		addEEnumLiteral(auditEventOutcomeEEnum, AuditEventOutcome._0);
		addEEnumLiteral(auditEventOutcomeEEnum, AuditEventOutcome._4);
		addEEnumLiteral(auditEventOutcomeEEnum, AuditEventOutcome._8);
		addEEnumLiteral(auditEventOutcomeEEnum, AuditEventOutcome._12);

		initEEnum(auditActiveParticipantRoleIdCodeEEnum, AuditActiveParticipantRoleIdCode.class, "AuditActiveParticipantRoleIdCode");

		initEEnum(mediaTypeCodeEEnum, MediaTypeCode.class, "MediaTypeCode");

		initEEnum(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType.class, "AuditEventParticipantNetworkType");
		addEEnumLiteral(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType._1);
		addEEnumLiteral(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType._2);
		addEEnumLiteral(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType._3);
		addEEnumLiteral(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType._4);
		addEEnumLiteral(auditEventParticipantNetworkTypeEEnum, AuditEventParticipantNetworkType._5);

		initEEnum(auditEventSourceTypeEEnum, AuditEventSourceType.class, "AuditEventSourceType");
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._1);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._2);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._3);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._4);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._5);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._6);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._7);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._8);
		addEEnumLiteral(auditEventSourceTypeEEnum, AuditEventSourceType._9);

		initEEnum(auditEventObjectTypeEEnum, AuditEventObjectType.class, "AuditEventObjectType");
		addEEnumLiteral(auditEventObjectTypeEEnum, AuditEventObjectType._1);
		addEEnumLiteral(auditEventObjectTypeEEnum, AuditEventObjectType._2);
		addEEnumLiteral(auditEventObjectTypeEEnum, AuditEventObjectType._3);
		addEEnumLiteral(auditEventObjectTypeEEnum, AuditEventObjectType._4);

		initEEnum(auditEventObjectRoleEEnum, AuditEventObjectRole.class, "AuditEventObjectRole");
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._1);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._2);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._3);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._4);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._5);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._6);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._7);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._8);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._9);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._10);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._11);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._12);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._13);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._14);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._15);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._16);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._17);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._18);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._19);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._20);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._21);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._22);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._23);
		addEEnumLiteral(auditEventObjectRoleEEnum, AuditEventObjectRole._24);

		initEEnum(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle.class, "AuditEventObjectLifecycle");
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._1);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._2);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._3);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._4);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._5);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._6);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._7);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._8);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._9);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._10);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._11);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._12);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._13);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._14);
		addEEnumLiteral(auditEventObjectLifecycleEEnum, AuditEventObjectLifecycle._15);

		initEEnum(basicResourceTypesEEnum, BasicResourceTypes.class, "BasicResourceTypes");
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.CONSENT);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.REFERRAL);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.ADVEVENT);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.APTMTREQ);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.TRANSFER);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.DIET);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.ADMINACT);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.EXPOSURE);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.INVESTIGATION);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.ACCOUNT);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.INVOICE);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.ADJUDICAT);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.PREDETREQ);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.PREDETERMINE);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.STUDY);
		addEEnumLiteral(basicResourceTypesEEnum, BasicResourceTypes.PROTOCOL);

		initEEnum(orderStatusEEnum, OrderStatus.class, "OrderStatus");
		addEEnumLiteral(orderStatusEEnum, OrderStatus.PENDING);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.REVIEW);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.REJECTED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.ERROR);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.ACCEPTED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.CANCELLED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.ABORTED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.COMPLETED);

		initEEnum(supplyDeliveryStatusEEnum, SupplyDeliveryStatus.class, "SupplyDeliveryStatus");
		addEEnumLiteral(supplyDeliveryStatusEEnum, SupplyDeliveryStatus.INPROGRESS);
		addEEnumLiteral(supplyDeliveryStatusEEnum, SupplyDeliveryStatus.COMPLETED);
		addEEnumLiteral(supplyDeliveryStatusEEnum, SupplyDeliveryStatus.ABANDONED);

		initEEnum(supplyItemTypeEEnum, SupplyItemType.class, "SupplyItemType");
		addEEnumLiteral(supplyItemTypeEEnum, SupplyItemType.MEDICATION);
		addEEnumLiteral(supplyItemTypeEEnum, SupplyItemType.DEVICE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	

		
	}

} //FhirValuesetPackageImpl
