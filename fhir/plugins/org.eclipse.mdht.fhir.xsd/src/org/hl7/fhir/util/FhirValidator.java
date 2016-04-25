/**
 */
package org.hl7.fhir.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.ActionDefinition;
import org.hl7.fhir.ActionDefinitionBehavior;
import org.hl7.fhir.ActionDefinitionCustomization;
import org.hl7.fhir.ActionDefinitionRelatedAction;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionRelationshipAnchor;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionType;
import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCertainty;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceStatus;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventParticipantNetworkType;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanParticipant;
import org.hl7.fhir.CarePlanRelatedPlan;
import org.hl7.fhir.CarePlanRelationship;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimCoverage;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.ClaimOnset;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseAdjudication1;
import org.hl7.fhir.ClaimResponseAdjudication2;
import org.hl7.fhir.ClaimResponseAdjudication3;
import org.hl7.fhir.ClaimResponseAdjudication4;
import org.hl7.fhir.ClaimResponseCoverage;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimType;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigations;
import org.hl7.fhir.ClinicalImpressionRuledOut;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContact;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestStatus;
import org.hl7.fhir.CommunicationStatus;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionContact;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapContact;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.Conformance;
import org.hl7.fhir.ConformanceCertificate;
import org.hl7.fhir.ConformanceContact;
import org.hl7.fhir.ConformanceDocument;
import org.hl7.fhir.ConformanceEndpoint;
import org.hl7.fhir.ConformanceEvent;
import org.hl7.fhir.ConformanceEventMode;
import org.hl7.fhir.ConformanceImplementation;
import org.hl7.fhir.ConformanceInteraction;
import org.hl7.fhir.ConformanceInteraction1;
import org.hl7.fhir.ConformanceMessaging;
import org.hl7.fhir.ConformanceOperation;
import org.hl7.fhir.ConformanceResource;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.ConformanceRest;
import org.hl7.fhir.ConformanceSearchParam;
import org.hl7.fhir.ConformanceSecurity;
import org.hl7.fhir.ConformanceSoftware;
import org.hl7.fhir.ConformanceStatementKind;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.DWebType;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementContact;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DecisionSupportRule;
import org.hl7.fhir.DecisionSupportServiceModule;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseRequestPriority;
import org.hl7.fhir.DeviceUseRequestStatus;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticOrder;
import org.hl7.fhir.DiagnosticOrderEvent;
import org.hl7.fhir.DiagnosticOrderItem;
import org.hl7.fhir.DiagnosticOrderPriority;
import org.hl7.fhir.DiagnosticOrderStatus;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClass;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterState;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingList;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileCodeSystem;
import org.hl7.fhir.ExpansionProfileCodeSystem1;
import org.hl7.fhir.ExpansionProfileCodeSystem2;
import org.hl7.fhir.ExpansionProfileContact;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileExclude1;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.ExpansionProfileInclude1;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitAdjudication1;
import org.hl7.fhir.ExplanationOfBenefitAdjudication2;
import org.hl7.fhir.ExplanationOfBenefitAdjudication3;
import org.hl7.fhir.ExplanationOfBenefitAdjudication4;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCoverage;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitMissingTeeth;
import org.hl7.fhir.ExplanationOfBenefitNote;
import org.hl7.fhir.ExplanationOfBenefitOnset;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProsthesis;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseAction;
import org.hl7.fhir.GuidanceResponseBehavior;
import org.hl7.fhir.GuidanceResponseRelatedAction;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuideDependencyType;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.ImagingExcerpt;
import org.hl7.fhir.ImagingExcerptDicom;
import org.hl7.fhir.ImagingExcerptDicom1;
import org.hl7.fhir.ImagingExcerptDicom2;
import org.hl7.fhir.ImagingExcerptInstance;
import org.hl7.fhir.ImagingExcerptSeries;
import org.hl7.fhir.ImagingExcerptStudy;
import org.hl7.fhir.ImagingExcerptViewable;
import org.hl7.fhir.ImagingObjectSelection;
import org.hl7.fhir.ImagingObjectSelectionFrame;
import org.hl7.fhir.ImagingObjectSelectionInstance;
import org.hl7.fhir.ImagingObjectSelectionSeries;
import org.hl7.fhir.ImagingObjectSelectionStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideContact;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.InstanceAvailabilityList;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.Library;
import org.hl7.fhir.LibraryCodeSystem;
import org.hl7.fhir.LibraryLibrary;
import org.hl7.fhir.LibraryModel;
import org.hl7.fhir.LibraryValueSet;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureDataUsage;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasurePopulationType;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportGroup1;
import org.hl7.fhir.MeasureReportGroup2;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportSupplementalData;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureScoring;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureType;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispenseDosageInstruction;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationOrder;
import org.hl7.fhir.MedicationOrderDispenseRequest;
import org.hl7.fhir.MedicationOrderDosageInstruction;
import org.hl7.fhir.MedicationOrderStatus;
import org.hl7.fhir.MedicationOrderSubstitution;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementDosage;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.Meta;
import org.hl7.fhir.ModuleDefinition;
import org.hl7.fhir.ModuleDefinitionCodeFilter;
import org.hl7.fhir.ModuleDefinitionCodeSystem;
import org.hl7.fhir.ModuleDefinitionData;
import org.hl7.fhir.ModuleDefinitionDateFilter;
import org.hl7.fhir.ModuleDefinitionLibrary;
import org.hl7.fhir.ModuleDefinitionModel;
import org.hl7.fhir.ModuleDefinitionParameter;
import org.hl7.fhir.ModuleDefinitionValueSet;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.ModuleMetadataContact;
import org.hl7.fhir.ModuleMetadataContact1;
import org.hl7.fhir.ModuleMetadataContributor;
import org.hl7.fhir.ModuleMetadataContributorType;
import org.hl7.fhir.ModuleMetadataCoverage;
import org.hl7.fhir.ModuleMetadataRelatedResource;
import org.hl7.fhir.ModuleMetadataResourceType;
import org.hl7.fhir.ModuleMetadataStatus;
import org.hl7.fhir.ModuleMetadataType;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemContact;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionContact;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.Order;
import org.hl7.fhir.OrderResponse;
import org.hl7.fhir.OrderSet;
import org.hl7.fhir.OrderStatus;
import org.hl7.fhir.OrderWhen;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantType;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerPractitionerRole;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseNotes;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.Protocol;
import org.hl7.fhir.ProtocolActivity;
import org.hl7.fhir.ProtocolComponent;
import org.hl7.fhir.ProtocolCondition;
import org.hl7.fhir.ProtocolDetail;
import org.hl7.fhir.ProtocolNext;
import org.hl7.fhir.ProtocolPrecondition;
import org.hl7.fhir.ProtocolStatus;
import org.hl7.fhir.ProtocolStep;
import org.hl7.fhir.ProtocolType;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceRelatedAgent;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireStatus;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferralCategory;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralStatus;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.RestfulConformanceMode;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterContact;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceInner;
import org.hl7.fhir.SequenceOuter;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceStructureVariation;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceVariation;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenTreatment;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContact;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContact;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapListMode;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestWhen;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskPriority;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptContact;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptParam;
import org.hl7.fhir.TestScriptParam1;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptParam3;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRule;
import org.hl7.fhir.TestScriptRule1;
import org.hl7.fhir.TestScriptRule2;
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset;
import org.hl7.fhir.TestScriptRuleset1;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TransactionMode;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionList;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeList;
import org.hl7.fhir.UnknownContentCode;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Use;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContact;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;
import org.hl7.fhir.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FhirValidator INSTANCE = new FhirValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.fhir";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FhirPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS:
				return validateAccountStatus((AccountStatus)value, diagnostics, context);
			case FhirPackage.ACTION_DEFINITION:
				return validateActionDefinition((ActionDefinition)value, diagnostics, context);
			case FhirPackage.ACTION_DEFINITION_BEHAVIOR:
				return validateActionDefinitionBehavior((ActionDefinitionBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_DEFINITION_CUSTOMIZATION:
				return validateActionDefinitionCustomization((ActionDefinitionCustomization)value, diagnostics, context);
			case FhirPackage.ACTION_DEFINITION_RELATED_ACTION:
				return validateActionDefinitionRelatedAction((ActionDefinitionRelatedAction)value, diagnostics, context);
			case FhirPackage.ACTION_LIST:
				return validateActionList((ActionList)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_ANCHOR:
				return validateActionRelationshipAnchor((ActionRelationshipAnchor)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE:
				return validateActionRelationshipType((ActionRelationshipType)value, diagnostics, context);
			case FhirPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY:
				return validateActivityDefinitionCategory((ActivityDefinitionCategory)value, diagnostics, context);
			case FhirPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE:
				return validateAddressUse((AddressUse)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER:
				return validateAdministrativeGender((AdministrativeGender)value, diagnostics, context);
			case FhirPackage.AGE:
				return validateAge((Age)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE:
				return validateAggregationMode((AggregationMode)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return validateAllergyIntoleranceCategory((AllergyIntoleranceCategory)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return validateAllergyIntoleranceCertainty((AllergyIntoleranceCertainty)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return validateAllergyIntoleranceCriticality((AllergyIntoleranceCriticality)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION:
				return validateAllergyIntoleranceReaction((AllergyIntoleranceReaction)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return validateAllergyIntoleranceSeverity((AllergyIntoleranceSeverity)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS:
				return validateAllergyIntoleranceStatus((AllergyIntoleranceStatus)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE:
				return validateAllergyIntoleranceType((AllergyIntoleranceType)value, diagnostics, context);
			case FhirPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case FhirPackage.APPOINTMENT:
				return validateAppointment((Appointment)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_PARTICIPANT:
				return validateAppointmentParticipant((AppointmentParticipant)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_RESPONSE:
				return validateAppointmentResponse((AppointmentResponse)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS:
				return validateAppointmentStatus((AppointmentStatus)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE:
				return validateAssertionDirectionType((AssertionDirectionType)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE:
				return validateAssertionOperatorType((AssertionOperatorType)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES:
				return validateAssertionResponseTypes((AssertionResponseTypes)value, diagnostics, context);
			case FhirPackage.ATTACHMENT:
				return validateAttachment((Attachment)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT:
				return validateAuditEvent((AuditEvent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION:
				return validateAuditEventAction((AuditEventAction)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT:
				return validateAuditEventAgent((AuditEventAgent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_DETAIL:
				return validateAuditEventDetail((AuditEventDetail)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ENTITY:
				return validateAuditEventEntity((AuditEventEntity)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_NETWORK:
				return validateAuditEventNetwork((AuditEventNetwork)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME:
				return validateAuditEventOutcome((AuditEventOutcome)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE:
				return validateAuditEventParticipantNetworkType((AuditEventParticipantNetworkType)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_SOURCE:
				return validateAuditEventSource((AuditEventSource)value, diagnostics, context);
			case FhirPackage.BACKBONE_ELEMENT:
				return validateBackboneElement((BackboneElement)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case FhirPackage.BASIC:
				return validateBasic((Basic)value, diagnostics, context);
			case FhirPackage.BINARY:
				return validateBinary((Binary)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH:
				return validateBindingStrength((BindingStrength)value, diagnostics, context);
			case FhirPackage.BODY_SITE:
				return validateBodySite((BodySite)value, diagnostics, context);
			case FhirPackage.BOOLEAN:
				return validateBoolean((org.hl7.fhir.Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case FhirPackage.BUNDLE_ENTRY:
				return validateBundleEntry((BundleEntry)value, diagnostics, context);
			case FhirPackage.BUNDLE_LINK:
				return validateBundleLink((BundleLink)value, diagnostics, context);
			case FhirPackage.BUNDLE_REQUEST:
				return validateBundleRequest((BundleRequest)value, diagnostics, context);
			case FhirPackage.BUNDLE_RESPONSE:
				return validateBundleResponse((BundleResponse)value, diagnostics, context);
			case FhirPackage.BUNDLE_SEARCH:
				return validateBundleSearch((BundleSearch)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE:
				return validateBundleType((BundleType)value, diagnostics, context);
			case FhirPackage.CARE_PLAN:
				return validateCarePlan((CarePlan)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY:
				return validateCarePlanActivity((CarePlanActivity)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS:
				return validateCarePlanActivityStatus((CarePlanActivityStatus)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_DETAIL:
				return validateCarePlanDetail((CarePlanDetail)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_PARTICIPANT:
				return validateCarePlanParticipant((CarePlanParticipant)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_RELATED_PLAN:
				return validateCarePlanRelatedPlan((CarePlanRelatedPlan)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_RELATIONSHIP:
				return validateCarePlanRelationship((CarePlanRelationship)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS:
				return validateCarePlanStatus((CarePlanStatus)value, diagnostics, context);
			case FhirPackage.CARE_TEAM:
				return validateCareTeam((CareTeam)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_PARTICIPANT:
				return validateCareTeamParticipant((CareTeamParticipant)value, diagnostics, context);
			case FhirPackage.CLAIM:
				return validateClaim((Claim)value, diagnostics, context);
			case FhirPackage.CLAIM_COVERAGE:
				return validateClaimCoverage((ClaimCoverage)value, diagnostics, context);
			case FhirPackage.CLAIM_DETAIL:
				return validateClaimDetail((ClaimDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_DIAGNOSIS:
				return validateClaimDiagnosis((ClaimDiagnosis)value, diagnostics, context);
			case FhirPackage.CLAIM_ITEM:
				return validateClaimItem((ClaimItem)value, diagnostics, context);
			case FhirPackage.CLAIM_MISSING_TEETH:
				return validateClaimMissingTeeth((ClaimMissingTeeth)value, diagnostics, context);
			case FhirPackage.CLAIM_ONSET:
				return validateClaimOnset((ClaimOnset)value, diagnostics, context);
			case FhirPackage.CLAIM_PAYEE:
				return validateClaimPayee((ClaimPayee)value, diagnostics, context);
			case FhirPackage.CLAIM_PROCEDURE:
				return validateClaimProcedure((ClaimProcedure)value, diagnostics, context);
			case FhirPackage.CLAIM_PROSTHESIS:
				return validateClaimProsthesis((ClaimProsthesis)value, diagnostics, context);
			case FhirPackage.CLAIM_RELATED:
				return validateClaimRelated((ClaimRelated)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE:
				return validateClaimResponse((ClaimResponse)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM:
				return validateClaimResponseAddItem((ClaimResponseAddItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION:
				return validateClaimResponseAdjudication((ClaimResponseAdjudication)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION1:
				return validateClaimResponseAdjudication1((ClaimResponseAdjudication1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION2:
				return validateClaimResponseAdjudication2((ClaimResponseAdjudication2)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION3:
				return validateClaimResponseAdjudication3((ClaimResponseAdjudication3)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION4:
				return validateClaimResponseAdjudication4((ClaimResponseAdjudication4)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE:
				return validateClaimResponseCoverage((ClaimResponseCoverage)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL:
				return validateClaimResponseDetail((ClaimResponseDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1:
				return validateClaimResponseDetail1((ClaimResponseDetail1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ERROR:
				return validateClaimResponseError((ClaimResponseError)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ITEM:
				return validateClaimResponseItem((ClaimResponseItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_NOTE:
				return validateClaimResponseNote((ClaimResponseNote)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL:
				return validateClaimResponseSubDetail((ClaimResponseSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_SUB_DETAIL:
				return validateClaimSubDetail((ClaimSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_TYPE:
				return validateClaimType((ClaimType)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION:
				return validateClinicalImpression((ClinicalImpression)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING:
				return validateClinicalImpressionFinding((ClinicalImpressionFinding)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATIONS:
				return validateClinicalImpressionInvestigations((ClinicalImpressionInvestigations)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_RULED_OUT:
				return validateClinicalImpressionRuledOut((ClinicalImpressionRuledOut)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS:
				return validateClinicalImpressionStatus((ClinicalImpressionStatus)value, diagnostics, context);
			case FhirPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case FhirPackage.CODEABLE_CONCEPT:
				return validateCodeableConcept((CodeableConcept)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM:
				return validateCodeSystem((CodeSystem)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONCEPT:
				return validateCodeSystemConcept((CodeSystemConcept)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTACT:
				return validateCodeSystemContact((CodeSystemContact)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE:
				return validateCodeSystemContentMode((CodeSystemContentMode)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_DESIGNATION:
				return validateCodeSystemDesignation((CodeSystemDesignation)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_FILTER:
				return validateCodeSystemFilter((CodeSystemFilter)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY:
				return validateCodeSystemProperty((CodeSystemProperty)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY1:
				return validateCodeSystemProperty1((CodeSystemProperty1)value, diagnostics, context);
			case FhirPackage.CODING:
				return validateCoding((Coding)value, diagnostics, context);
			case FhirPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_PAYLOAD:
				return validateCommunicationPayload((CommunicationPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST:
				return validateCommunicationRequest((CommunicationRequest)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD:
				return validateCommunicationRequestPayload((CommunicationRequestPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS:
				return validateCommunicationRequestStatus((CommunicationRequestStatus)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_STATUS:
				return validateCommunicationStatus((CommunicationStatus)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION:
				return validateCompartmentDefinition((CompartmentDefinition)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION_CONTACT:
				return validateCompartmentDefinitionContact((CompartmentDefinitionContact)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE:
				return validateCompartmentDefinitionResource((CompartmentDefinitionResource)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE:
				return validateCompartmentType((CompartmentType)value, diagnostics, context);
			case FhirPackage.COMPOSITION:
				return validateComposition((Composition)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE:
				return validateCompositionAttestationMode((CompositionAttestationMode)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTER:
				return validateCompositionAttester((CompositionAttester)value, diagnostics, context);
			case FhirPackage.COMPOSITION_EVENT:
				return validateCompositionEvent((CompositionEvent)value, diagnostics, context);
			case FhirPackage.COMPOSITION_SECTION:
				return validateCompositionSection((CompositionSection)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS:
				return validateCompositionStatus((CompositionStatus)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP:
				return validateConceptMap((ConceptMap)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_CONTACT:
				return validateConceptMapContact((ConceptMapContact)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON:
				return validateConceptMapDependsOn((ConceptMapDependsOn)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_ELEMENT:
				return validateConceptMapElement((ConceptMapElement)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE:
				return validateConceptMapEquivalence((ConceptMapEquivalence)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_TARGET:
				return validateConceptMapTarget((ConceptMapTarget)value, diagnostics, context);
			case FhirPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS:
				return validateConditionalDeleteStatus((ConditionalDeleteStatus)value, diagnostics, context);
			case FhirPackage.CONDITION_EVIDENCE:
				return validateConditionEvidence((ConditionEvidence)value, diagnostics, context);
			case FhirPackage.CONDITION_STAGE:
				return validateConditionStage((ConditionStage)value, diagnostics, context);
			case FhirPackage.CONDITION_VERIFICATION_STATUS:
				return validateConditionVerificationStatus((ConditionVerificationStatus)value, diagnostics, context);
			case FhirPackage.CONFORMANCE:
				return validateConformance((Conformance)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_CERTIFICATE:
				return validateConformanceCertificate((ConformanceCertificate)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_CONTACT:
				return validateConformanceContact((ConformanceContact)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_DOCUMENT:
				return validateConformanceDocument((ConformanceDocument)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_ENDPOINT:
				return validateConformanceEndpoint((ConformanceEndpoint)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT:
				return validateConformanceEvent((ConformanceEvent)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT_MODE:
				return validateConformanceEventMode((ConformanceEventMode)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_IMPLEMENTATION:
				return validateConformanceImplementation((ConformanceImplementation)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_INTERACTION:
				return validateConformanceInteraction((ConformanceInteraction)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_INTERACTION1:
				return validateConformanceInteraction1((ConformanceInteraction1)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_MESSAGING:
				return validateConformanceMessaging((ConformanceMessaging)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_OPERATION:
				return validateConformanceOperation((ConformanceOperation)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE:
				return validateConformanceResource((ConformanceResource)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS:
				return validateConformanceResourceStatus((ConformanceResourceStatus)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_REST:
				return validateConformanceRest((ConformanceRest)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM:
				return validateConformanceSearchParam((ConformanceSearchParam)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SECURITY:
				return validateConformanceSecurity((ConformanceSecurity)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SOFTWARE:
				return validateConformanceSoftware((ConformanceSoftware)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND:
				return validateConformanceStatementKind((ConformanceStatementKind)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY:
				return validateConstraintSeverity((ConstraintSeverity)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT:
				return validateContactPoint((ContactPoint)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM:
				return validateContactPointSystem((ContactPointSystem)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE:
				return validateContactPointUse((ContactPointUse)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE:
				return validateContentType((ContentType)value, diagnostics, context);
			case FhirPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case FhirPackage.CONTRACT_AGENT:
				return validateContractAgent((ContractAgent)value, diagnostics, context);
			case FhirPackage.CONTRACT_AGENT1:
				return validateContractAgent1((ContractAgent1)value, diagnostics, context);
			case FhirPackage.CONTRACT_FRIENDLY:
				return validateContractFriendly((ContractFriendly)value, diagnostics, context);
			case FhirPackage.CONTRACT_LEGAL:
				return validateContractLegal((ContractLegal)value, diagnostics, context);
			case FhirPackage.CONTRACT_RULE:
				return validateContractRule((ContractRule)value, diagnostics, context);
			case FhirPackage.CONTRACT_SIGNER:
				return validateContractSigner((ContractSigner)value, diagnostics, context);
			case FhirPackage.CONTRACT_TERM:
				return validateContractTerm((ContractTerm)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM:
				return validateContractValuedItem((ContractValuedItem)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM1:
				return validateContractValuedItem1((ContractValuedItem1)value, diagnostics, context);
			case FhirPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case FhirPackage.COVERAGE:
				return validateCoverage((Coverage)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT:
				return validateDataElement((DataElement)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_CONTACT:
				return validateDataElementContact((DataElementContact)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_MAPPING:
				return validateDataElementMapping((DataElementMapping)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_STRINGENCY:
				return validateDataElementStringency((DataElementStringency)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT:
				return validateDataRequirement((DataRequirement)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER:
				return validateDataRequirementCodeFilter((DataRequirementCodeFilter)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER:
				return validateDataRequirementDateFilter((DataRequirementDateFilter)value, diagnostics, context);
			case FhirPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case FhirPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK:
				return validateDaysOfWeek((DaysOfWeek)value, diagnostics, context);
			case FhirPackage.DECIMAL:
				return validateDecimal((Decimal)value, diagnostics, context);
			case FhirPackage.DECISION_SUPPORT_RULE:
				return validateDecisionSupportRule((DecisionSupportRule)value, diagnostics, context);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE:
				return validateDecisionSupportServiceModule((DecisionSupportServiceModule)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE:
				return validateDetectedIssue((DetectedIssue)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_MITIGATION:
				return validateDetectedIssueMitigation((DetectedIssueMitigation)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY:
				return validateDetectedIssueSeverity((DetectedIssueSeverity)value, diagnostics, context);
			case FhirPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT:
				return validateDeviceComponent((DeviceComponent)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION:
				return validateDeviceComponentProductionSpecification((DeviceComponentProductionSpecification)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC:
				return validateDeviceMetric((DeviceMetric)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION:
				return validateDeviceMetricCalibration((DeviceMetricCalibration)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return validateDeviceMetricCalibrationState((DeviceMetricCalibrationState)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return validateDeviceMetricCalibrationType((DeviceMetricCalibrationType)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY:
				return validateDeviceMetricCategory((DeviceMetricCategory)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR:
				return validateDeviceMetricColor((DeviceMetricColor)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return validateDeviceMetricOperationalStatus((DeviceMetricOperationalStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS:
				return validateDeviceStatus((DeviceStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST:
				return validateDeviceUseRequest((DeviceUseRequest)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY:
				return validateDeviceUseRequestPriority((DeviceUseRequestPriority)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS:
				return validateDeviceUseRequestStatus((DeviceUseRequestStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT:
				return validateDeviceUseStatement((DeviceUseStatement)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER:
				return validateDiagnosticOrder((DiagnosticOrder)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_EVENT:
				return validateDiagnosticOrderEvent((DiagnosticOrderEvent)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM:
				return validateDiagnosticOrderItem((DiagnosticOrderItem)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY:
				return validateDiagnosticOrderPriority((DiagnosticOrderPriority)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS:
				return validateDiagnosticOrderStatus((DiagnosticOrderStatus)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT:
				return validateDiagnosticReport((DiagnosticReport)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE:
				return validateDiagnosticReportImage((DiagnosticReportImage)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS:
				return validateDiagnosticReportStatus((DiagnosticReportStatus)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE:
				return validateDigitalMediaType((DigitalMediaType)value, diagnostics, context);
			case FhirPackage.DISTANCE:
				return validateDistance((Distance)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST:
				return validateDocumentManifest((DocumentManifest)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT:
				return validateDocumentManifestContent((DocumentManifestContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_RELATED:
				return validateDocumentManifestRelated((DocumentManifestRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE:
				return validateDocumentMode((DocumentMode)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE:
				return validateDocumentReference((DocumentReference)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT:
				return validateDocumentReferenceContent((DocumentReferenceContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT:
				return validateDocumentReferenceContext((DocumentReferenceContext)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATED:
				return validateDocumentReferenceRelated((DocumentReferenceRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO:
				return validateDocumentReferenceRelatesTo((DocumentReferenceRelatesTo)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS:
				return validateDocumentReferenceStatus((DocumentReferenceStatus)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return validateDocumentRelationshipType((DocumentRelationshipType)value, diagnostics, context);
			case FhirPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FhirPackage.DOMAIN_RESOURCE:
				return validateDomainResource((DomainResource)value, diagnostics, context);
			case FhirPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case FhirPackage.DWEB_TYPE:
				return validateDWebType((DWebType)value, diagnostics, context);
			case FhirPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION:
				return validateElementDefinition((ElementDefinition)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BASE:
				return validateElementDefinitionBase((ElementDefinitionBase)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BINDING:
				return validateElementDefinitionBinding((ElementDefinitionBinding)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT:
				return validateElementDefinitionConstraint((ElementDefinitionConstraint)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_MAPPING:
				return validateElementDefinitionMapping((ElementDefinitionMapping)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_SLICING:
				return validateElementDefinitionSlicing((ElementDefinitionSlicing)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_TYPE:
				return validateElementDefinitionType((ElementDefinitionType)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST:
				return validateEligibilityRequest((EligibilityRequest)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE:
				return validateEligibilityResponse((EligibilityResponse)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE:
				return validateEligibilityResponseBenefitBalance((EligibilityResponseBenefitBalance)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_ERROR:
				return validateEligibilityResponseError((EligibilityResponseError)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL:
				return validateEligibilityResponseFinancial((EligibilityResponseFinancial)value, diagnostics, context);
			case FhirPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS:
				return validateEncounterClass((EncounterClass)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION:
				return validateEncounterHospitalization((EncounterHospitalization)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS:
				return validateEncounterLocationStatus((EncounterLocationStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATE:
				return validateEncounterState((EncounterState)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_HISTORY:
				return validateEncounterStatusHistory((EncounterStatusHistory)value, diagnostics, context);
			case FhirPackage.ENDPOINT:
				return validateEndpoint((Endpoint)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS:
				return validateEndpointStatus((EndpointStatus)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_REQUEST:
				return validateEnrollmentRequest((EnrollmentRequest)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_RESPONSE:
				return validateEnrollmentResponse((EnrollmentResponse)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE:
				return validateEpisodeOfCare((EpisodeOfCare)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS:
				return validateEpisodeOfCareStatus((EpisodeOfCareStatus)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY:
				return validateEpisodeOfCareStatusHistory((EpisodeOfCareStatusHistory)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING:
				return validateEventTiming((EventTiming)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE:
				return validateExpansionProfile((ExpansionProfile)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM:
				return validateExpansionProfileCodeSystem((ExpansionProfileCodeSystem)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM1:
				return validateExpansionProfileCodeSystem1((ExpansionProfileCodeSystem1)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_CODE_SYSTEM2:
				return validateExpansionProfileCodeSystem2((ExpansionProfileCodeSystem2)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_CONTACT:
				return validateExpansionProfileContact((ExpansionProfileContact)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION:
				return validateExpansionProfileDesignation((ExpansionProfileDesignation)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION1:
				return validateExpansionProfileDesignation1((ExpansionProfileDesignation1)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION2:
				return validateExpansionProfileDesignation2((ExpansionProfileDesignation2)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE:
				return validateExpansionProfileExclude((ExpansionProfileExclude)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE1:
				return validateExpansionProfileExclude1((ExpansionProfileExclude1)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_INCLUDE:
				return validateExpansionProfileInclude((ExpansionProfileInclude)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_INCLUDE1:
				return validateExpansionProfileInclude1((ExpansionProfileInclude1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT:
				return validateExplanationOfBenefit((ExplanationOfBenefit)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM:
				return validateExplanationOfBenefitAddItem((ExplanationOfBenefitAddItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION:
				return validateExplanationOfBenefitAdjudication((ExplanationOfBenefitAdjudication)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION1:
				return validateExplanationOfBenefitAdjudication1((ExplanationOfBenefitAdjudication1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION2:
				return validateExplanationOfBenefitAdjudication2((ExplanationOfBenefitAdjudication2)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION3:
				return validateExplanationOfBenefitAdjudication3((ExplanationOfBenefitAdjudication3)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION4:
				return validateExplanationOfBenefitAdjudication4((ExplanationOfBenefitAdjudication4)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE:
				return validateExplanationOfBenefitBenefitBalance((ExplanationOfBenefitBenefitBalance)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_COVERAGE:
				return validateExplanationOfBenefitCoverage((ExplanationOfBenefitCoverage)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL:
				return validateExplanationOfBenefitDetail((ExplanationOfBenefitDetail)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1:
				return validateExplanationOfBenefitDetail1((ExplanationOfBenefitDetail1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS:
				return validateExplanationOfBenefitDiagnosis((ExplanationOfBenefitDiagnosis)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL:
				return validateExplanationOfBenefitFinancial((ExplanationOfBenefitFinancial)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM:
				return validateExplanationOfBenefitItem((ExplanationOfBenefitItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH:
				return validateExplanationOfBenefitMissingTeeth((ExplanationOfBenefitMissingTeeth)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_NOTE:
				return validateExplanationOfBenefitNote((ExplanationOfBenefitNote)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ONSET:
				return validateExplanationOfBenefitOnset((ExplanationOfBenefitOnset)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE:
				return validateExplanationOfBenefitPayee((ExplanationOfBenefitPayee)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE:
				return validateExplanationOfBenefitProcedure((ExplanationOfBenefitProcedure)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROSTHESIS:
				return validateExplanationOfBenefitProsthesis((ExplanationOfBenefitProsthesis)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED:
				return validateExplanationOfBenefitRelated((ExplanationOfBenefitRelated)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL:
				return validateExplanationOfBenefitSubDetail((ExplanationOfBenefitSubDetail)value, diagnostics, context);
			case FhirPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT:
				return validateExtensionContext((ExtensionContext)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS:
				return validateFamilyHistoryStatus((FamilyHistoryStatus)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY:
				return validateFamilyMemberHistory((FamilyMemberHistory)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION:
				return validateFamilyMemberHistoryCondition((FamilyMemberHistoryCondition)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR:
				return validateFilterOperator((FilterOperator)value, diagnostics, context);
			case FhirPackage.FLAG:
				return validateFlag((Flag)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS:
				return validateFlagStatus((FlagStatus)value, diagnostics, context);
			case FhirPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case FhirPackage.GOAL_OUTCOME:
				return validateGoalOutcome((GoalOutcome)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS:
				return validateGoalStatus((GoalStatus)value, diagnostics, context);
			case FhirPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case FhirPackage.GROUP_CHARACTERISTIC:
				return validateGroupCharacteristic((GroupCharacteristic)value, diagnostics, context);
			case FhirPackage.GROUP_MEMBER:
				return validateGroupMember((GroupMember)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE:
				return validateGuidanceResponse((GuidanceResponse)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_ACTION:
				return validateGuidanceResponseAction((GuidanceResponseAction)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_BEHAVIOR:
				return validateGuidanceResponseBehavior((GuidanceResponseBehavior)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_RELATED_ACTION:
				return validateGuidanceResponseRelatedAction((GuidanceResponseRelatedAction)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS:
				return validateGuidanceResponseStatus((GuidanceResponseStatus)value, diagnostics, context);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE:
				return validateGuideDependencyType((GuideDependencyType)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_KIND:
				return validateGuidePageKind((GuidePageKind)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE:
				return validateHealthcareService((HealthcareService)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME:
				return validateHealthcareServiceAvailableTime((HealthcareServiceAvailableTime)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE:
				return validateHealthcareServiceNotAvailable((HealthcareServiceNotAvailable)value, diagnostics, context);
			case FhirPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case FhirPackage.HUMAN_NAME:
				return validateHumanName((HumanName)value, diagnostics, context);
			case FhirPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case FhirPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE:
				return validateIdentifierUse((IdentifierUse)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL:
				return validateIdentityAssuranceLevel((IdentityAssuranceLevel)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT:
				return validateImagingExcerpt((ImagingExcerpt)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_DICOM:
				return validateImagingExcerptDicom((ImagingExcerptDicom)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_DICOM1:
				return validateImagingExcerptDicom1((ImagingExcerptDicom1)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_DICOM2:
				return validateImagingExcerptDicom2((ImagingExcerptDicom2)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_INSTANCE:
				return validateImagingExcerptInstance((ImagingExcerptInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_SERIES:
				return validateImagingExcerptSeries((ImagingExcerptSeries)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_STUDY:
				return validateImagingExcerptStudy((ImagingExcerptStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_EXCERPT_VIEWABLE:
				return validateImagingExcerptViewable((ImagingExcerptViewable)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION:
				return validateImagingObjectSelection((ImagingObjectSelection)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_FRAME:
				return validateImagingObjectSelectionFrame((ImagingObjectSelectionFrame)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE:
				return validateImagingObjectSelectionInstance((ImagingObjectSelectionInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_SERIES:
				return validateImagingObjectSelectionSeries((ImagingObjectSelectionSeries)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_STUDY:
				return validateImagingObjectSelectionStudy((ImagingObjectSelectionStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY:
				return validateImagingStudy((ImagingStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_INSTANCE:
				return validateImagingStudyInstance((ImagingStudyInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_SERIES:
				return validateImagingStudySeries((ImagingStudySeries)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EXPLANATION:
				return validateImmunizationExplanation((ImmunizationExplanation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_REACTION:
				return validateImmunizationReaction((ImmunizationReaction)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION:
				return validateImmunizationRecommendation((ImmunizationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION:
				return validateImmunizationRecommendationDateCriterion((ImmunizationRecommendationDateCriterion)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL:
				return validateImmunizationRecommendationProtocol((ImmunizationRecommendationProtocol)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION:
				return validateImmunizationRecommendationRecommendation((ImmunizationRecommendationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL:
				return validateImmunizationVaccinationProtocol((ImmunizationVaccinationProtocol)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE:
				return validateImplementationGuide((ImplementationGuide)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_CONTACT:
				return validateImplementationGuideContact((ImplementationGuideContact)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDENCY:
				return validateImplementationGuideDependency((ImplementationGuideDependency)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL:
				return validateImplementationGuideGlobal((ImplementationGuideGlobal)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE:
				return validateImplementationGuidePackage((ImplementationGuidePackage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE:
				return validateImplementationGuidePage((ImplementationGuidePage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE:
				return validateImplementationGuideResource((ImplementationGuideResource)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY:
				return validateInstanceAvailability((InstanceAvailability)value, diagnostics, context);
			case FhirPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
			case FhirPackage.INTEGER:
				return validateInteger((org.hl7.fhir.Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY:
				return validateIssueSeverity((IssueSeverity)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE:
				return validateIssueType((IssueType)value, diagnostics, context);
			case FhirPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case FhirPackage.LIBRARY_CODE_SYSTEM:
				return validateLibraryCodeSystem((LibraryCodeSystem)value, diagnostics, context);
			case FhirPackage.LIBRARY_LIBRARY:
				return validateLibraryLibrary((LibraryLibrary)value, diagnostics, context);
			case FhirPackage.LIBRARY_MODEL:
				return validateLibraryModel((LibraryModel)value, diagnostics, context);
			case FhirPackage.LIBRARY_VALUE_SET:
				return validateLibraryValueSet((LibraryValueSet)value, diagnostics, context);
			case FhirPackage.LINKAGE:
				return validateLinkage((Linkage)value, diagnostics, context);
			case FhirPackage.LINKAGE_ITEM:
				return validateLinkageItem((LinkageItem)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE:
				return validateLinkageType((LinkageType)value, diagnostics, context);
			case FhirPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case FhirPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FhirPackage.LIST_ENTRY:
				return validateListEntry((ListEntry)value, diagnostics, context);
			case FhirPackage.LIST_MODE:
				return validateListMode((ListMode)value, diagnostics, context);
			case FhirPackage.LIST_STATUS:
				return validateListStatus((ListStatus)value, diagnostics, context);
			case FhirPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE:
				return validateLocationMode((LocationMode)value, diagnostics, context);
			case FhirPackage.LOCATION_POSITION:
				return validateLocationPosition((LocationPosition)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS:
				return validateLocationStatus((LocationStatus)value, diagnostics, context);
			case FhirPackage.MARKDOWN:
				return validateMarkdown((Markdown)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE:
				return validateMeasmntPrinciple((MeasmntPrinciple)value, diagnostics, context);
			case FhirPackage.MEASURE:
				return validateMeasure((Measure)value, diagnostics, context);
			case FhirPackage.MEASURE_DATA_USAGE:
				return validateMeasureDataUsage((MeasureDataUsage)value, diagnostics, context);
			case FhirPackage.MEASURE_GROUP:
				return validateMeasureGroup((MeasureGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION:
				return validateMeasurePopulation((MeasurePopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION_TYPE:
				return validateMeasurePopulationType((MeasurePopulationType)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT:
				return validateMeasureReport((MeasureReport)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP:
				return validateMeasureReportGroup((MeasureReportGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP1:
				return validateMeasureReportGroup1((MeasureReportGroup1)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP2:
				return validateMeasureReportGroup2((MeasureReportGroup2)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION:
				return validateMeasureReportPopulation((MeasureReportPopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION1:
				return validateMeasureReportPopulation1((MeasureReportPopulation1)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS:
				return validateMeasureReportStatus((MeasureReportStatus)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STRATIFIER:
				return validateMeasureReportStratifier((MeasureReportStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_SUPPLEMENTAL_DATA:
				return validateMeasureReportSupplementalData((MeasureReportSupplementalData)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE:
				return validateMeasureReportType((MeasureReportType)value, diagnostics, context);
			case FhirPackage.MEASURE_SCORING:
				return validateMeasureScoring((MeasureScoring)value, diagnostics, context);
			case FhirPackage.MEASURE_STRATIFIER:
				return validateMeasureStratifier((MeasureStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA:
				return validateMeasureSupplementalData((MeasureSupplementalData)value, diagnostics, context);
			case FhirPackage.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case FhirPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case FhirPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION:
				return validateMedicationAdministration((MedicationAdministration)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE:
				return validateMedicationAdministrationDosage((MedicationAdministrationDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS:
				return validateMedicationAdministrationStatus((MedicationAdministrationStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_BATCH:
				return validateMedicationBatch((MedicationBatch)value, diagnostics, context);
			case FhirPackage.MEDICATION_CONTENT:
				return validateMedicationContent((MedicationContent)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE:
				return validateMedicationDispense((MedicationDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION:
				return validateMedicationDispenseDosageInstruction((MedicationDispenseDosageInstruction)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS:
				return validateMedicationDispenseStatus((MedicationDispenseStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION:
				return validateMedicationDispenseSubstitution((MedicationDispenseSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_INGREDIENT:
				return validateMedicationIngredient((MedicationIngredient)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER:
				return validateMedicationOrder((MedicationOrder)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER_DISPENSE_REQUEST:
				return validateMedicationOrderDispenseRequest((MedicationOrderDispenseRequest)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER_DOSAGE_INSTRUCTION:
				return validateMedicationOrderDosageInstruction((MedicationOrderDosageInstruction)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER_STATUS:
				return validateMedicationOrderStatus((MedicationOrderStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER_SUBSTITUTION:
				return validateMedicationOrderSubstitution((MedicationOrderSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_PACKAGE:
				return validateMedicationPackage((MedicationPackage)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRODUCT:
				return validateMedicationProduct((MedicationProduct)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT:
				return validateMedicationStatement((MedicationStatement)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE:
				return validateMedicationStatementDosage((MedicationStatementDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS:
				return validateMedicationStatementStatus((MedicationStatementStatus)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER:
				return validateMessageHeader((MessageHeader)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_DESTINATION:
				return validateMessageHeaderDestination((MessageHeaderDestination)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_RESPONSE:
				return validateMessageHeaderResponse((MessageHeaderResponse)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_SOURCE:
				return validateMessageHeaderSource((MessageHeaderSource)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return validateMessageSignificanceCategory((MessageSignificanceCategory)value, diagnostics, context);
			case FhirPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION:
				return validateModuleDefinition((ModuleDefinition)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_CODE_FILTER:
				return validateModuleDefinitionCodeFilter((ModuleDefinitionCodeFilter)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_CODE_SYSTEM:
				return validateModuleDefinitionCodeSystem((ModuleDefinitionCodeSystem)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_DATA:
				return validateModuleDefinitionData((ModuleDefinitionData)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_DATE_FILTER:
				return validateModuleDefinitionDateFilter((ModuleDefinitionDateFilter)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_LIBRARY:
				return validateModuleDefinitionLibrary((ModuleDefinitionLibrary)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_MODEL:
				return validateModuleDefinitionModel((ModuleDefinitionModel)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_PARAMETER:
				return validateModuleDefinitionParameter((ModuleDefinitionParameter)value, diagnostics, context);
			case FhirPackage.MODULE_DEFINITION_VALUE_SET:
				return validateModuleDefinitionValueSet((ModuleDefinitionValueSet)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA:
				return validateModuleMetadata((ModuleMetadata)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_CONTACT:
				return validateModuleMetadataContact((ModuleMetadataContact)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_CONTACT1:
				return validateModuleMetadataContact1((ModuleMetadataContact1)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR:
				return validateModuleMetadataContributor((ModuleMetadataContributor)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR_TYPE:
				return validateModuleMetadataContributorType((ModuleMetadataContributorType)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_COVERAGE:
				return validateModuleMetadataCoverage((ModuleMetadataCoverage)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_RELATED_RESOURCE:
				return validateModuleMetadataRelatedResource((ModuleMetadataRelatedResource)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_RESOURCE_TYPE:
				return validateModuleMetadataResourceType((ModuleMetadataResourceType)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_STATUS:
				return validateModuleMetadataStatus((ModuleMetadataStatus)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_TYPE:
				return validateModuleMetadataType((ModuleMetadataType)value, diagnostics, context);
			case FhirPackage.MONEY:
				return validateMoney((Money)value, diagnostics, context);
			case FhirPackage.NAME_USE:
				return validateNameUse((NameUse)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM:
				return validateNamingSystem((NamingSystem)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_CONTACT:
				return validateNamingSystemContact((NamingSystemContact)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return validateNamingSystemIdentifierType((NamingSystemIdentifierType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE:
				return validateNamingSystemType((NamingSystemType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID:
				return validateNamingSystemUniqueId((NamingSystemUniqueId)value, diagnostics, context);
			case FhirPackage.NARRATIVE:
				return validateNarrative((Narrative)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS:
				return validateNarrativeStatus((NarrativeStatus)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER:
				return validateNutritionOrder((NutritionOrder)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION:
				return validateNutritionOrderAdministration((NutritionOrderAdministration)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA:
				return validateNutritionOrderEnteralFormula((NutritionOrderEnteralFormula)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_NUTRIENT:
				return validateNutritionOrderNutrient((NutritionOrderNutrient)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET:
				return validateNutritionOrderOralDiet((NutritionOrderOralDiet)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS:
				return validateNutritionOrderStatus((NutritionOrderStatus)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT:
				return validateNutritionOrderSupplement((NutritionOrderSupplement)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_TEXTURE:
				return validateNutritionOrderTexture((NutritionOrderTexture)value, diagnostics, context);
			case FhirPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case FhirPackage.OBSERVATION_COMPONENT:
				return validateObservationComponent((ObservationComponent)value, diagnostics, context);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE:
				return validateObservationReferenceRange((ObservationReferenceRange)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATED:
				return validateObservationRelated((ObservationRelated)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return validateObservationRelationshipType((ObservationRelationshipType)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS:
				return validateObservationStatus((ObservationStatus)value, diagnostics, context);
			case FhirPackage.OID:
				return validateOid((Oid)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION:
				return validateOperationDefinition((OperationDefinition)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_BINDING:
				return validateOperationDefinitionBinding((OperationDefinitionBinding)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_CONTACT:
				return validateOperationDefinitionContact((OperationDefinitionContact)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_PARAMETER:
				return validateOperationDefinitionParameter((OperationDefinitionParameter)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND:
				return validateOperationKind((OperationKind)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME:
				return validateOperationOutcome((OperationOutcome)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME_ISSUE:
				return validateOperationOutcomeIssue((OperationOutcomeIssue)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE:
				return validateOperationParameterUse((OperationParameterUse)value, diagnostics, context);
			case FhirPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case FhirPackage.ORDER_RESPONSE:
				return validateOrderResponse((OrderResponse)value, diagnostics, context);
			case FhirPackage.ORDER_SET:
				return validateOrderSet((OrderSet)value, diagnostics, context);
			case FhirPackage.ORDER_STATUS:
				return validateOrderStatus((OrderStatus)value, diagnostics, context);
			case FhirPackage.ORDER_WHEN:
				return validateOrderWhen((OrderWhen)value, diagnostics, context);
			case FhirPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case FhirPackage.ORGANIZATION_CONTACT:
				return validateOrganizationContact((OrganizationContact)value, diagnostics, context);
			case FhirPackage.PARAMETER_DEFINITION:
				return validateParameterDefinition((ParameterDefinition)value, diagnostics, context);
			case FhirPackage.PARAMETERS:
				return validateParameters((Parameters)value, diagnostics, context);
			case FhirPackage.PARAMETERS_PARAMETER:
				return validateParametersParameter((ParametersParameter)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED:
				return validateParticipantRequired((ParticipantRequired)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_TYPE:
				return validateParticipantType((ParticipantType)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS:
				return validateParticipationStatus((ParticipationStatus)value, diagnostics, context);
			case FhirPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case FhirPackage.PATIENT_ANIMAL:
				return validatePatientAnimal((PatientAnimal)value, diagnostics, context);
			case FhirPackage.PATIENT_COMMUNICATION:
				return validatePatientCommunication((PatientCommunication)value, diagnostics, context);
			case FhirPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact)value, diagnostics, context);
			case FhirPackage.PATIENT_LINK:
				return validatePatientLink((PatientLink)value, diagnostics, context);
			case FhirPackage.PAYMENT_NOTICE:
				return validatePaymentNotice((PaymentNotice)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION:
				return validatePaymentReconciliation((PaymentReconciliation)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL:
				return validatePaymentReconciliationDetail((PaymentReconciliationDetail)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_NOTE:
				return validatePaymentReconciliationNote((PaymentReconciliationNote)value, diagnostics, context);
			case FhirPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case FhirPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case FhirPackage.PERSON_LINK:
				return validatePersonLink((PersonLink)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT:
				return validatePositiveInt((PositiveInt)value, diagnostics, context);
			case FhirPackage.PRACTITIONER:
				return validatePractitioner((Practitioner)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE:
				return validatePractitionerPractitionerRole((PractitionerPractitionerRole)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_QUALIFICATION:
				return validatePractitionerQualification((PractitionerQualification)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE:
				return validatePractitionerRole((PractitionerRole)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME:
				return validatePractitionerRoleAvailableTime((PractitionerRoleAvailableTime)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE:
				return validatePractitionerRoleNotAvailable((PractitionerRoleNotAvailable)value, diagnostics, context);
			case FhirPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case FhirPackage.PROCEDURE_FOCAL_DEVICE:
				return validateProcedureFocalDevice((ProcedureFocalDevice)value, diagnostics, context);
			case FhirPackage.PROCEDURE_PERFORMER:
				return validateProcedurePerformer((ProcedurePerformer)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST:
				return validateProcedureRequest((ProcedureRequest)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY:
				return validateProcedureRequestPriority((ProcedureRequestPriority)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_STATUS:
				return validateProcedureRequestStatus((ProcedureRequestStatus)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS:
				return validateProcedureStatus((ProcedureStatus)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST:
				return validateProcessRequest((ProcessRequest)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST_ITEM:
				return validateProcessRequestItem((ProcessRequestItem)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE:
				return validateProcessResponse((ProcessResponse)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE_NOTES:
				return validateProcessResponseNotes((ProcessResponseNotes)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION:
				return validatePropertyRepresentation((PropertyRepresentation)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case FhirPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case FhirPackage.PROTOCOL_ACTIVITY:
				return validateProtocolActivity((ProtocolActivity)value, diagnostics, context);
			case FhirPackage.PROTOCOL_COMPONENT:
				return validateProtocolComponent((ProtocolComponent)value, diagnostics, context);
			case FhirPackage.PROTOCOL_CONDITION:
				return validateProtocolCondition((ProtocolCondition)value, diagnostics, context);
			case FhirPackage.PROTOCOL_DETAIL:
				return validateProtocolDetail((ProtocolDetail)value, diagnostics, context);
			case FhirPackage.PROTOCOL_NEXT:
				return validateProtocolNext((ProtocolNext)value, diagnostics, context);
			case FhirPackage.PROTOCOL_PRECONDITION:
				return validateProtocolPrecondition((ProtocolPrecondition)value, diagnostics, context);
			case FhirPackage.PROTOCOL_STATUS:
				return validateProtocolStatus((ProtocolStatus)value, diagnostics, context);
			case FhirPackage.PROTOCOL_STEP:
				return validateProtocolStep((ProtocolStep)value, diagnostics, context);
			case FhirPackage.PROTOCOL_TYPE:
				return validateProtocolType((ProtocolType)value, diagnostics, context);
			case FhirPackage.PROVENANCE:
				return validateProvenance((Provenance)value, diagnostics, context);
			case FhirPackage.PROVENANCE_AGENT:
				return validateProvenanceAgent((ProvenanceAgent)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY:
				return validateProvenanceEntity((ProvenanceEntity)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE:
				return validateProvenanceEntityRole((ProvenanceEntityRole)value, diagnostics, context);
			case FhirPackage.PROVENANCE_RELATED_AGENT:
				return validateProvenanceRelatedAgent((ProvenanceRelatedAgent)value, diagnostics, context);
			case FhirPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR:
				return validateQuantityComparator((QuantityComparator)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE:
				return validateQuestionnaire((Questionnaire)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN:
				return validateQuestionnaireEnableWhen((QuestionnaireEnableWhen)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM:
				return validateQuestionnaireItem((QuestionnaireItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE:
				return validateQuestionnaireItemType((QuestionnaireItemType)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_OPTION:
				return validateQuestionnaireOption((QuestionnaireOption)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE:
				return validateQuestionnaireResponse((QuestionnaireResponse)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER:
				return validateQuestionnaireResponseAnswer((QuestionnaireResponseAnswer)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM:
				return validateQuestionnaireResponseItem((QuestionnaireResponseItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return validateQuestionnaireResponseStatus((QuestionnaireResponseStatus)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS:
				return validateQuestionnaireStatus((QuestionnaireStatus)value, diagnostics, context);
			case FhirPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case FhirPackage.RATIO:
				return validateRatio((Ratio)value, diagnostics, context);
			case FhirPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES:
				return validateReferenceVersionRules((ReferenceVersionRules)value, diagnostics, context);
			case FhirPackage.REFERRAL_CATEGORY:
				return validateReferralCategory((ReferralCategory)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST:
				return validateReferralRequest((ReferralRequest)value, diagnostics, context);
			case FhirPackage.REFERRAL_STATUS:
				return validateReferralStatus((ReferralStatus)value, diagnostics, context);
			case FhirPackage.RELATED_PERSON:
				return validateRelatedPerson((RelatedPerson)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME:
				return validateRemittanceOutcome((RemittanceOutcome)value, diagnostics, context);
			case FhirPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case FhirPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY:
				return validateResourceVersionPolicy((ResourceVersionPolicy)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE:
				return validateResponseType((ResponseType)value, diagnostics, context);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE:
				return validateRestfulConformanceMode((RestfulConformanceMode)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT:
				return validateRiskAssessment((RiskAssessment)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT_PREDICTION:
				return validateRiskAssessmentPrediction((RiskAssessmentPrediction)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA:
				return validateSampledData((SampledData)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE:
				return validateSampledDataDataType((SampledDataDataType)value, diagnostics, context);
			case FhirPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE:
				return validateSearchEntryMode((SearchEntryMode)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE:
				return validateSearchModifierCode((SearchModifierCode)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER:
				return validateSearchParameter((SearchParameter)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER_CONTACT:
				return validateSearchParameterContact((SearchParameterContact)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE:
				return validateSearchParamType((SearchParamType)value, diagnostics, context);
			case FhirPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case FhirPackage.SEQUENCE_INNER:
				return validateSequenceInner((SequenceInner)value, diagnostics, context);
			case FhirPackage.SEQUENCE_OUTER:
				return validateSequenceOuter((SequenceOuter)value, diagnostics, context);
			case FhirPackage.SEQUENCE_QUALITY:
				return validateSequenceQuality((SequenceQuality)value, diagnostics, context);
			case FhirPackage.SEQUENCE_REFERENCE_SEQ:
				return validateSequenceReferenceSeq((SequenceReferenceSeq)value, diagnostics, context);
			case FhirPackage.SEQUENCE_REPOSITORY:
				return validateSequenceRepository((SequenceRepository)value, diagnostics, context);
			case FhirPackage.SEQUENCE_STRUCTURE_VARIATION:
				return validateSequenceStructureVariation((SequenceStructureVariation)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case FhirPackage.SEQUENCE_VARIATION:
				return validateSequenceVariation((SequenceVariation)value, diagnostics, context);
			case FhirPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case FhirPackage.SIMPLE_QUANTITY:
				return validateSimpleQuantity((SimpleQuantity)value, diagnostics, context);
			case FhirPackage.SLICING_RULES:
				return validateSlicingRules((SlicingRules)value, diagnostics, context);
			case FhirPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS:
				return validateSlotStatus((SlotStatus)value, diagnostics, context);
			case FhirPackage.SPECIMEN:
				return validateSpecimen((Specimen)value, diagnostics, context);
			case FhirPackage.SPECIMEN_COLLECTION:
				return validateSpecimenCollection((SpecimenCollection)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINER:
				return validateSpecimenContainer((SpecimenContainer)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS:
				return validateSpecimenStatus((SpecimenStatus)value, diagnostics, context);
			case FhirPackage.SPECIMEN_TREATMENT:
				return validateSpecimenTreatment((SpecimenTreatment)value, diagnostics, context);
			case FhirPackage.STRING:
				return validateString((org.hl7.fhir.String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION:
				return validateStructureDefinition((StructureDefinition)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_CONTACT:
				return validateStructureDefinitionContact((StructureDefinitionContact)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL:
				return validateStructureDefinitionDifferential((StructureDefinitionDifferential)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND:
				return validateStructureDefinitionKind((StructureDefinitionKind)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING:
				return validateStructureDefinitionMapping((StructureDefinitionMapping)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT:
				return validateStructureDefinitionSnapshot((StructureDefinitionSnapshot)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP:
				return validateStructureMap((StructureMap)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTACT:
				return validateStructureMapContact((StructureMapContact)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE:
				return validateStructureMapContextType((StructureMapContextType)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_DEPENDENT:
				return validateStructureMapDependent((StructureMapDependent)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP:
				return validateStructureMapGroup((StructureMapGroup)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT:
				return validateStructureMapInput((StructureMapInput)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE:
				return validateStructureMapInputMode((StructureMapInputMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE:
				return validateStructureMapListMode((StructureMapListMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE:
				return validateStructureMapModelMode((StructureMapModelMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_PARAMETER:
				return validateStructureMapParameter((StructureMapParameter)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_RULE:
				return validateStructureMapRule((StructureMapRule)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE:
				return validateStructureMapSource((StructureMapSource)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_STRUCTURE:
				return validateStructureMapStructure((StructureMapStructure)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET:
				return validateStructureMapTarget((StructureMapTarget)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM:
				return validateStructureMapTransform((StructureMapTransform)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL:
				return validateSubscriptionChannel((SubscriptionChannel)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return validateSubscriptionChannelType((SubscriptionChannelType)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS:
				return validateSubscriptionStatus((SubscriptionStatus)value, diagnostics, context);
			case FhirPackage.SUBSTANCE:
				return validateSubstance((Substance)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INGREDIENT:
				return validateSubstanceIngredient((SubstanceIngredient)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INSTANCE:
				return validateSubstanceInstance((SubstanceInstance)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY:
				return validateSupplyDelivery((SupplyDelivery)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS:
				return validateSupplyDeliveryStatus((SupplyDeliveryStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST:
				return validateSupplyRequest((SupplyRequest)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS:
				return validateSupplyRequestStatus((SupplyRequestStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_WHEN:
				return validateSupplyRequestWhen((SupplyRequestWhen)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION:
				return validateSystemRestfulInteraction((SystemRestfulInteraction)value, diagnostics, context);
			case FhirPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case FhirPackage.TASK_INPUT:
				return validateTaskInput((TaskInput)value, diagnostics, context);
			case FhirPackage.TASK_OUTPUT:
				return validateTaskOutput((TaskOutput)value, diagnostics, context);
			case FhirPackage.TASK_PRIORITY:
				return validateTaskPriority((TaskPriority)value, diagnostics, context);
			case FhirPackage.TASK_STATUS:
				return validateTaskStatus((TaskStatus)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT:
				return validateTestScript((TestScript)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION:
				return validateTestScriptAction((TestScriptAction)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION1:
				return validateTestScriptAction1((TestScriptAction1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION2:
				return validateTestScriptAction2((TestScriptAction2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ASSERT:
				return validateTestScriptAssert((TestScriptAssert)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_CAPABILITY:
				return validateTestScriptCapability((TestScriptCapability)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_CONTACT:
				return validateTestScriptContact((TestScriptContact)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_DESTINATION:
				return validateTestScriptDestination((TestScriptDestination)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_FIXTURE:
				return validateTestScriptFixture((TestScriptFixture)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_LINK:
				return validateTestScriptLink((TestScriptLink)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_METADATA:
				return validateTestScriptMetadata((TestScriptMetadata)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_OPERATION:
				return validateTestScriptOperation((TestScriptOperation)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ORIGIN:
				return validateTestScriptOrigin((TestScriptOrigin)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM:
				return validateTestScriptParam((TestScriptParam)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM1:
				return validateTestScriptParam1((TestScriptParam1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM2:
				return validateTestScriptParam2((TestScriptParam2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM3:
				return validateTestScriptParam3((TestScriptParam3)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER:
				return validateTestScriptRequestHeader((TestScriptRequestHeader)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE:
				return validateTestScriptRule((TestScriptRule)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE1:
				return validateTestScriptRule1((TestScriptRule1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE2:
				return validateTestScriptRule2((TestScriptRule2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE3:
				return validateTestScriptRule3((TestScriptRule3)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULESET:
				return validateTestScriptRuleset((TestScriptRuleset)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULESET1:
				return validateTestScriptRuleset1((TestScriptRuleset1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_SETUP:
				return validateTestScriptSetup((TestScriptSetup)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEARDOWN:
				return validateTestScriptTeardown((TestScriptTeardown)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEST:
				return validateTestScriptTest((TestScriptTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_VARIABLE:
				return validateTestScriptVariable((TestScriptVariable)value, diagnostics, context);
			case FhirPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case FhirPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case FhirPackage.TIMING_REPEAT:
				return validateTimingRepeat((TimingRepeat)value, diagnostics, context);
			case FhirPackage.TRANSACTION_MODE:
				return validateTransactionMode((TransactionMode)value, diagnostics, context);
			case FhirPackage.TRIGGER_DEFINITION:
				return validateTriggerDefinition((TriggerDefinition)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE:
				return validateTypeDerivationRule((TypeDerivationRule)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION:
				return validateTypeRestfulInteraction((TypeRestfulInteraction)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME:
				return validateUnitsOfTime((UnitsOfTime)value, diagnostics, context);
			case FhirPackage.UNKNOWN_CONTENT_CODE:
				return validateUnknownContentCode((UnknownContentCode)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT:
				return validateUnsignedInt((UnsignedInt)value, diagnostics, context);
			case FhirPackage.URI:
				return validateUri((Uri)value, diagnostics, context);
			case FhirPackage.USE:
				return validateUse((Use)value, diagnostics, context);
			case FhirPackage.UUID:
				return validateUuid((Uuid)value, diagnostics, context);
			case FhirPackage.VALUE_SET:
				return validateValueSet((ValueSet)value, diagnostics, context);
			case FhirPackage.VALUE_SET_COMPOSE:
				return validateValueSetCompose((ValueSetCompose)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONCEPT:
				return validateValueSetConcept((ValueSetConcept)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTACT:
				return validateValueSetContact((ValueSetContact)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTAINS:
				return validateValueSetContains((ValueSetContains)value, diagnostics, context);
			case FhirPackage.VALUE_SET_DESIGNATION:
				return validateValueSetDesignation((ValueSetDesignation)value, diagnostics, context);
			case FhirPackage.VALUE_SET_EXPANSION:
				return validateValueSetExpansion((ValueSetExpansion)value, diagnostics, context);
			case FhirPackage.VALUE_SET_FILTER:
				return validateValueSetFilter((ValueSetFilter)value, diagnostics, context);
			case FhirPackage.VALUE_SET_INCLUDE:
				return validateValueSetInclude((ValueSetInclude)value, diagnostics, context);
			case FhirPackage.VALUE_SET_PARAMETER:
				return validateValueSetParameter((ValueSetParameter)value, diagnostics, context);
			case FhirPackage.VISION_BASE:
				return validateVisionBase((VisionBase)value, diagnostics, context);
			case FhirPackage.VISION_EYES:
				return validateVisionEyes((VisionEyes)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION:
				return validateVisionPrescription((VisionPrescription)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE:
				return validateVisionPrescriptionDispense((VisionPrescriptionDispense)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE:
				return validateXPathUsageType((XPathUsageType)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST:
				return validateEventTimingList((EventTimingList)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return validateInstanceAvailabilityList((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return validateSystemRestfulInteractionList((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return validateTypeRestfulInteractionList((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return validateUnitsOfTimeList((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return validateAccountStatusList((String)value, diagnostics, context);
			case FhirPackage.ACTION_LIST_LIST:
				return validateActionListList((String)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_ANCHOR_LIST:
				return validateActionRelationshipAnchorList((String)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return validateActionRelationshipTypeList((String)value, diagnostics, context);
			case FhirPackage.ACTION_TYPE_LIST:
				return validateActionTypeList((String)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST:
				return validateActivityDefinitionCategoryList((String)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return validateAddressTypeList((String)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_LIST:
				return validateAddressUseList((String)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return validateAdministrativeGenderList((String)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return validateAggregationModeList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return validateAllergyIntoleranceCategoryList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return validateAllergyIntoleranceCertaintyList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return validateAllergyIntoleranceCriticalityList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return validateAllergyIntoleranceSeverityList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return validateAllergyIntoleranceStatusList((String)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return validateAllergyIntoleranceTypeList((String)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return validateAppointmentStatusList((String)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return validateAssertionDirectionTypeList((String)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return validateAssertionOperatorTypeList((String)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return validateAssertionResponseTypesList((String)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return validateAuditEventActionList((String)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return validateAuditEventOutcomeList((String)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST:
				return validateAuditEventParticipantNetworkTypeList((String)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return validateBase64BinaryPrimitive((byte[])value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return validateBindingStrengthList((String)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return validateBooleanPrimitive((Boolean)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return validateBooleanPrimitiveObject((Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return validateBundleTypeList((String)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return validateCarePlanActivityStatusList((String)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_RELATIONSHIP_LIST:
				return validateCarePlanRelationshipList((String)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return validateCarePlanStatusList((String)value, diagnostics, context);
			case FhirPackage.CLAIM_TYPE_LIST:
				return validateClaimTypeList((String)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return validateClinicalImpressionStatusList((String)value, diagnostics, context);
			case FhirPackage.CODE_PRIMITIVE:
				return validateCodePrimitive((String)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return validateCodeSystemContentModeList((String)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return validateCommunicationRequestStatusList((String)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return validateCommunicationStatusList((String)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return validateCompartmentTypeList((String)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return validateCompositionAttestationModeList((String)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return validateCompositionStatusList((String)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return validateConceptMapEquivalenceList((String)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return validateConditionalDeleteStatusList((String)value, diagnostics, context);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return validateConditionVerificationStatusList((String)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return validateConformanceEventModeList((String)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return validateConformanceResourceStatusList((String)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_STATEMENT_KIND_LIST:
				return validateConformanceStatementKindList((String)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return validateConstraintSeverityList((String)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return validateContactPointSystemList((String)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return validateContactPointUseList((String)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE_LIST:
				return validateContentTypeList((String)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return validateDataElementStringencyList((String)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE:
				return validateDatePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return validateDatePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return validateDateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return validateDateTimePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return validateDaysOfWeekList((String)value, diagnostics, context);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return validateDecimalPrimitive((BigDecimal)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return validateDetectedIssueSeverityList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return validateDeviceMetricCalibrationStateList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return validateDeviceMetricCalibrationTypeList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return validateDeviceMetricCategoryList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return validateDeviceMetricColorList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return validateDeviceMetricOperationalStatusList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS_LIST:
				return validateDeviceStatusList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST:
				return validateDeviceUseRequestPriorityList((String)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST:
				return validateDeviceUseRequestStatusList((String)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST:
				return validateDiagnosticOrderPriorityList((String)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST:
				return validateDiagnosticOrderStatusList((String)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return validateDiagnosticReportStatusList((String)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return validateDigitalMediaTypeList((String)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return validateDocumentModeList((String)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return validateDocumentReferenceStatusList((String)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return validateDocumentRelationshipTypeList((String)value, diagnostics, context);
			case FhirPackage.DWEB_TYPE_LIST:
				return validateDWebTypeList((String)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS_LIST:
				return validateEncounterClassList((String)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return validateEncounterLocationStatusList((String)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATE_LIST:
				return validateEncounterStateList((String)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return validateEndpointStatusList((String)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return validateEpisodeOfCareStatusList((String)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return validateEventTimingListObject((EventTimingList)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return validateExtensionContextList((String)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return validateFamilyHistoryStatusList((String)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return validateFilterOperatorList((String)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_LIST:
				return validateFlagStatusList((String)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS_LIST:
				return validateGoalStatusList((String)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_LIST:
				return validateGroupTypeList((String)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return validateGuidanceResponseStatusList((String)value, diagnostics, context);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return validateGuideDependencyTypeList((String)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return validateGuidePageKindList((String)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_LIST:
				return validateHTTPVerbList((String)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return validateIdentifierUseList((String)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return validateIdentityAssuranceLevelList((String)value, diagnostics, context);
			case FhirPackage.ID_PRIMITIVE:
				return validateIdPrimitive((String)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return validateInstanceAvailabilityListObject((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.INSTANT_PRIMITIVE:
				return validateInstantPrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE:
				return validateIntegerPrimitive((Integer)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return validateIntegerPrimitiveObject((Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return validateIssueSeverityList((String)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE_LIST:
				return validateIssueTypeList((String)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return validateLinkageTypeList((String)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_LIST:
				return validateLinkTypeList((String)value, diagnostics, context);
			case FhirPackage.LIST_MODE_LIST:
				return validateListModeList((String)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_LIST:
				return validateListStatusList((String)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_LIST:
				return validateLocationModeList((String)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_LIST:
				return validateLocationStatusList((String)value, diagnostics, context);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return validateMarkdownPrimitive((String)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return validateMeasmntPrincipleList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_DATA_USAGE_LIST:
				return validateMeasureDataUsageList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST:
				return validateMeasurePopulationTypeList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return validateMeasureReportStatusList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return validateMeasureReportTypeList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_SCORING_LIST:
				return validateMeasureScoringList((String)value, diagnostics, context);
			case FhirPackage.MEASURE_TYPE_LIST:
				return validateMeasureTypeList((String)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return validateMedicationAdministrationStatusList((String)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return validateMedicationDispenseStatusList((String)value, diagnostics, context);
			case FhirPackage.MEDICATION_ORDER_STATUS_LIST:
				return validateMedicationOrderStatusList((String)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return validateMedicationStatementStatusList((String)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return validateMessageSignificanceCategoryList((String)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_CONTRIBUTOR_TYPE_LIST:
				return validateModuleMetadataContributorTypeList((String)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_RESOURCE_TYPE_LIST:
				return validateModuleMetadataResourceTypeList((String)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_STATUS_LIST:
				return validateModuleMetadataStatusList((String)value, diagnostics, context);
			case FhirPackage.MODULE_METADATA_TYPE_LIST:
				return validateModuleMetadataTypeList((String)value, diagnostics, context);
			case FhirPackage.NAME_USE_LIST:
				return validateNameUseList((String)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return validateNamingSystemIdentifierTypeList((String)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return validateNamingSystemTypeList((String)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return validateNarrativeStatusList((String)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_LIST:
				return validateNoteTypeList((String)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return validateNutritionOrderStatusList((String)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return validateObservationRelationshipTypeList((String)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return validateObservationStatusList((String)value, diagnostics, context);
			case FhirPackage.OID_PRIMITIVE:
				return validateOidPrimitive((String)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_LIST:
				return validateOperationKindList((String)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return validateOperationParameterUseList((String)value, diagnostics, context);
			case FhirPackage.ORDER_STATUS_LIST:
				return validateOrderStatusList((String)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return validateParticipantRequiredList((String)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_TYPE_LIST:
				return validateParticipantTypeList((String)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return validateParticipationStatusList((String)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return validatePositiveIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return validateProcedureRequestPriorityList((String)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return validateProcedureRequestStatusList((String)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return validateProcedureStatusList((String)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return validatePropertyRepresentationList((String)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return validatePropertyTypeList((String)value, diagnostics, context);
			case FhirPackage.PROTOCOL_STATUS_LIST:
				return validateProtocolStatusList((String)value, diagnostics, context);
			case FhirPackage.PROTOCOL_TYPE_LIST:
				return validateProtocolTypeList((String)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return validateProvenanceEntityRoleList((String)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return validateQuantityComparatorList((String)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return validateQuestionnaireItemTypeList((String)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return validateQuestionnaireResponseStatusList((String)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return validateQuestionnaireStatusList((String)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return validateReferenceVersionRulesList((String)value, diagnostics, context);
			case FhirPackage.REFERRAL_CATEGORY_LIST:
				return validateReferralCategoryList((String)value, diagnostics, context);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return validateReferralStatusList((String)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return validateRemittanceOutcomeList((String)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return validateResourceVersionPolicyList((String)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return validateResponseTypeList((String)value, diagnostics, context);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return validateRestfulConformanceModeList((String)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return validateSampledDataDataTypePrimitive((String)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return validateSearchEntryModeList((String)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return validateSearchModifierCodeList((String)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return validateSearchParamTypeList((String)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return validateSequenceTypeList((String)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_LIST:
				return validateSlicingRulesList((String)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_LIST:
				return validateSlotStatusList((String)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return validateSpecimenStatusList((String)value, diagnostics, context);
			case FhirPackage.STRING_PRIMITIVE:
				return validateStringPrimitive((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return validateStructureDefinitionKindList((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return validateStructureMapContextTypeList((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return validateStructureMapInputModeList((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_LIST_MODE_LIST:
				return validateStructureMapListModeList((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return validateStructureMapModelModeList((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return validateStructureMapTransformList((String)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return validateSubscriptionChannelTypeList((String)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return validateSubscriptionStatusList((String)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return validateSupplyDeliveryStatusList((String)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return validateSupplyRequestStatusList((String)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateSystemRestfulInteractionListObject((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.TASK_PRIORITY_LIST:
				return validateTaskPriorityList((String)value, diagnostics, context);
			case FhirPackage.TASK_STATUS_LIST:
				return validateTaskStatusList((String)value, diagnostics, context);
			case FhirPackage.TIME_PRIMITIVE:
				return validateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.TRANSACTION_MODE_LIST:
				return validateTransactionModeList((String)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return validateTriggerTypeList((String)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return validateTypeDerivationRuleList((String)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateTypeRestfulInteractionListObject((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return validateUnitsOfTimeListObject((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return validateUnknownContentCodeList((String)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return validateUnsignedIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.URI_PRIMITIVE:
				return validateUriPrimitive((String)value, diagnostics, context);
			case FhirPackage.USE_LIST:
				return validateUseList((String)value, diagnostics, context);
			case FhirPackage.UUID_PRIMITIVE:
				return validateUuidPrimitive((String)value, diagnostics, context);
			case FhirPackage.VISION_BASE_LIST:
				return validateVisionBaseList((String)value, diagnostics, context);
			case FhirPackage.VISION_EYES_LIST:
				return validateVisionEyesList((String)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return validateXPathUsageTypeList((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatus(AccountStatus accountStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionDefinition(ActionDefinition actionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionDefinitionBehavior(ActionDefinitionBehavior actionDefinitionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionDefinitionBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionDefinitionCustomization(ActionDefinitionCustomization actionDefinitionCustomization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionDefinitionCustomization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionDefinitionRelatedAction(ActionDefinitionRelatedAction actionDefinitionRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionDefinitionRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionList(ActionList actionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipAnchor(ActionRelationshipAnchor actionRelationshipAnchor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRelationshipAnchor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipType(ActionRelationshipType actionRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionCategory(ActivityDefinitionCategory activityDefinitionCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinitionCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUse(AddressUse addressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGender(AdministrativeGender administrativeGender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrativeGender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAge(Age age, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(age, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationMode(AggregationMode aggregationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntolerance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategory(AllergyIntoleranceCategory allergyIntoleranceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCertainty(AllergyIntoleranceCertainty allergyIntoleranceCertainty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCertainty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticality(AllergyIntoleranceCriticality allergyIntoleranceCriticality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCriticality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceReaction(AllergyIntoleranceReaction allergyIntoleranceReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverity(AllergyIntoleranceSeverity allergyIntoleranceSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatus(AllergyIntoleranceStatus allergyIntoleranceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceType(AllergyIntoleranceType allergyIntoleranceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentParticipant(AppointmentParticipant appointmentParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentResponse(AppointmentResponse appointmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatus(AppointmentStatus appointmentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionType(AssertionDirectionType assertionDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorType(AssertionOperatorType assertionOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypes(AssertionResponseTypes assertionResponseTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionResponseTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachment(Attachment attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEvent(AuditEvent auditEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAction(AuditEventAction auditEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgent(AuditEventAgent auditEventAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventDetail(AuditEventDetail auditEventDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventEntity(AuditEventEntity auditEventEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventNetwork(AuditEventNetwork auditEventNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcome(AuditEventOutcome auditEventOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipantNetworkType(AuditEventParticipantNetworkType auditEventParticipantNetworkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventParticipantNetworkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventSource(AuditEventSource auditEventSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneElement(BackboneElement backboneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(Binary binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrength(BindingStrength bindingStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySite(BodySite bodySite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodySite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.hl7.fhir.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleEntry(BundleEntry bundleEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleLink(BundleLink bundleLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleRequest(BundleRequest bundleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResponse(BundleResponse bundleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleSearch(BundleSearch bundleSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleSearch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleType(BundleType bundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlan(CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivity(CarePlanActivity carePlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatus(CarePlanActivityStatus carePlanActivityStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDetail(CarePlanDetail carePlanDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipant(CarePlanParticipant carePlanParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedPlan(CarePlanRelatedPlan carePlanRelatedPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanRelatedPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelationship(CarePlanRelationship carePlanRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatus(CarePlanStatus carePlanStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeam(CareTeam careTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamParticipant(CareTeamParticipant careTeamParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeamParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimCoverage(ClaimCoverage claimCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDetail(ClaimDetail claimDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDiagnosis(ClaimDiagnosis claimDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimItem(ClaimItem claimItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimMissingTeeth(ClaimMissingTeeth claimMissingTeeth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimMissingTeeth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimOnset(ClaimOnset claimOnset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimOnset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimPayee(ClaimPayee claimPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimProcedure(ClaimProcedure claimProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimProsthesis(ClaimProsthesis claimProsthesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimProsthesis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimRelated(ClaimRelated claimRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponse(ClaimResponse claimResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAddItem(ClaimResponseAddItem claimResponseAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication(ClaimResponseAdjudication claimResponseAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication1(ClaimResponseAdjudication1 claimResponseAdjudication1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication2(ClaimResponseAdjudication2 claimResponseAdjudication2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication3(ClaimResponseAdjudication3 claimResponseAdjudication3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication4(ClaimResponseAdjudication4 claimResponseAdjudication4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseCoverage(ClaimResponseCoverage claimResponseCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail(ClaimResponseDetail claimResponseDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail1(ClaimResponseDetail1 claimResponseDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseError(ClaimResponseError claimResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseItem(ClaimResponseItem claimResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseNote(ClaimResponseNote claimResponseNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseSubDetail(ClaimResponseSubDetail claimResponseSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSubDetail(ClaimSubDetail claimSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimType(ClaimType claimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpression(ClinicalImpression clinicalImpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionFinding(ClinicalImpressionFinding clinicalImpressionFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionFinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionInvestigations(ClinicalImpressionInvestigations clinicalImpressionInvestigations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionInvestigations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionRuledOut(ClinicalImpressionRuledOut clinicalImpressionRuledOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionRuledOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatus(ClinicalImpressionStatus clinicalImpressionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableConcept(CodeableConcept codeableConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystem(CodeSystem codeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemConcept(CodeSystemConcept codeSystemConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContact(CodeSystemContact codeSystemContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentMode(CodeSystemContentMode codeSystemContentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemContentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemDesignation(CodeSystemDesignation codeSystemDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemFilter(CodeSystemFilter codeSystemFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty(CodeSystemProperty codeSystemProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty1(CodeSystemProperty1 codeSystemProperty1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoding(Coding coding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPayload(CommunicationPayload communicationPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequest(CommunicationRequest communicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestPayload(CommunicationRequestPayload communicationRequestPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestStatus(CommunicationRequestStatus communicationRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStatus(CommunicationStatus communicationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinition(CompartmentDefinition compartmentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinitionContact(CompartmentDefinitionContact compartmentDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinitionResource(CompartmentDefinitionResource compartmentDefinitionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinitionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentType(CompartmentType compartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationMode(CompositionAttestationMode compositionAttestationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttestationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttester(CompositionAttester compositionAttester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionEvent(CompositionEvent compositionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionSection(CompositionSection compositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatus(CompositionStatus compositionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMap(ConceptMap conceptMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapContact(ConceptMapContact conceptMapContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapDependsOn(ConceptMapDependsOn conceptMapDependsOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapDependsOn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapElement(ConceptMapElement conceptMapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalence(ConceptMapEquivalence conceptMapEquivalence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapEquivalence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapTarget(ConceptMapTarget conceptMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatus(ConditionalDeleteStatus conditionalDeleteStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalDeleteStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEvidence(ConditionEvidence conditionEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionStage(ConditionStage conditionStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionVerificationStatus(ConditionVerificationStatus conditionVerificationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionVerificationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformance(Conformance conformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceCertificate(ConformanceCertificate conformanceCertificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceCertificate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceContact(ConformanceContact conformanceContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceDocument(ConformanceDocument conformanceDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEndpoint(ConformanceEndpoint conformanceEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEvent(ConformanceEvent conformanceEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEventMode(ConformanceEventMode conformanceEventMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceEventMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceImplementation(ConformanceImplementation conformanceImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceInteraction(ConformanceInteraction conformanceInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceInteraction1(ConformanceInteraction1 conformanceInteraction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceInteraction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceMessaging(ConformanceMessaging conformanceMessaging, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceMessaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceOperation(ConformanceOperation conformanceOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResource(ConformanceResource conformanceResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResourceStatus(ConformanceResourceStatus conformanceResourceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceResourceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceRest(ConformanceRest conformanceRest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceRest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSearchParam(ConformanceSearchParam conformanceSearchParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSearchParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSecurity(ConformanceSecurity conformanceSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSecurity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSoftware(ConformanceSoftware conformanceSoftware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSoftware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceStatementKind(ConformanceStatementKind conformanceStatementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceStatementKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverity(ConstraintSeverity constraintSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPoint(ContactPoint contactPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystem(ContactPointSystem contactPointSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUse(ContactPointUse contactPointUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(ContentType contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAgent(ContractAgent contractAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAgent1(ContractAgent1 contractAgent1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAgent1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractFriendly(ContractFriendly contractFriendly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractFriendly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractLegal(ContractLegal contractLegal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractLegal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractRule(ContractRule contractRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSigner(ContractSigner contractSigner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSigner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractTerm(ContractTerm contractTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem(ContractValuedItem contractValuedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem1(ContractValuedItem1 contractValuedItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverage(Coverage coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElement(DataElement dataElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementContact(DataElementContact dataElementContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementMapping(DataElementMapping dataElementMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementStringency(DataElementStringency dataElementStringency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementStringency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirement(DataRequirement dataRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementCodeFilter(DataRequirementCodeFilter dataRequirementCodeFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementCodeFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementDateFilter(DataRequirementDateFilter dataRequirementDateFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementDateFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeek(DaysOfWeek daysOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daysOfWeek, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(Decimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionSupportRule(DecisionSupportRule decisionSupportRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decisionSupportRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionSupportServiceModule(DecisionSupportServiceModule decisionSupportServiceModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decisionSupportServiceModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssue(DetectedIssue detectedIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueMitigation(DetectedIssueMitigation detectedIssueMitigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueMitigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverity(DetectedIssueSeverity detectedIssueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponent(DeviceComponent deviceComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponentProductionSpecification(DeviceComponentProductionSpecification deviceComponentProductionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponentProductionSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetric(DeviceMetric deviceMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibration(DeviceMetricCalibration deviceMetricCalibration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationState(DeviceMetricCalibrationState deviceMetricCalibrationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationType(DeviceMetricCalibrationType deviceMetricCalibrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategory(DeviceMetricCategory deviceMetricCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColor(DeviceMetricColor deviceMetricColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatus(DeviceMetricOperationalStatus deviceMetricOperationalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricOperationalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatus(DeviceStatus deviceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequest(DeviceUseRequest deviceUseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestPriority(DeviceUseRequestPriority deviceUseRequestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestStatus(DeviceUseRequestStatus deviceUseRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatement(DeviceUseStatement deviceUseStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrder(DiagnosticOrder diagnosticOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderEvent(DiagnosticOrderEvent diagnosticOrderEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderItem(DiagnosticOrderItem diagnosticOrderItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderPriority(DiagnosticOrderPriority diagnosticOrderPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderStatus(DiagnosticOrderStatus diagnosticOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReport(DiagnosticReport diagnosticReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportImage(DiagnosticReportImage diagnosticReportImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportImage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatus(DiagnosticReportStatus diagnosticReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaType(DigitalMediaType digitalMediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalMediaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifest(DocumentManifest documentManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestContent(DocumentManifestContent documentManifestContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestRelated(DocumentManifestRelated documentManifestRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentMode(DocumentMode documentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReference(DocumentReference documentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContent(DocumentReferenceContent documentReferenceContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContext(DocumentReferenceContext documentReferenceContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelated(DocumentReferenceRelated documentReferenceRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelatesTo(DocumentReferenceRelatesTo documentReferenceRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatus(DocumentReferenceStatus documentReferenceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipType(DocumentRelationshipType documentRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainResource(DomainResource domainResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(duration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWebType(DWebType dWebType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dWebType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBase(ElementDefinitionBase elementDefinitionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBinding(ElementDefinitionBinding elementDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionConstraint(ElementDefinitionConstraint elementDefinitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionMapping(ElementDefinitionMapping elementDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionSlicing(ElementDefinitionSlicing elementDefinitionSlicing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionSlicing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionType(ElementDefinitionType elementDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequest(EligibilityRequest eligibilityRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponse(EligibilityResponse eligibilityResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseBenefitBalance(EligibilityResponseBenefitBalance eligibilityResponseBenefitBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseBenefitBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseError(EligibilityResponseError eligibilityResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseFinancial(EligibilityResponseFinancial eligibilityResponseFinancial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseFinancial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClass(EncounterClass encounterClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHospitalization(EncounterHospitalization encounterHospitalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterHospitalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatus(EncounterLocationStatus encounterLocationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterState(EncounterState encounterState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusHistory(EncounterStatusHistory encounterStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatus(EndpointStatus endpointStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentRequest(EnrollmentRequest enrollmentRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentResponse(EnrollmentResponse enrollmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCare(EpisodeOfCare episodeOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatus(EpisodeOfCareStatus episodeOfCareStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory episodeOfCareStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTiming(EventTiming eventTiming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTiming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfile(ExpansionProfile expansionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileCodeSystem(ExpansionProfileCodeSystem expansionProfileCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileCodeSystem1(ExpansionProfileCodeSystem1 expansionProfileCodeSystem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileCodeSystem1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileCodeSystem2(ExpansionProfileCodeSystem2 expansionProfileCodeSystem2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileCodeSystem2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileContact(ExpansionProfileContact expansionProfileContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation(ExpansionProfileDesignation expansionProfileDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation1(ExpansionProfileDesignation1 expansionProfileDesignation1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation2(ExpansionProfileDesignation2 expansionProfileDesignation2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileExclude(ExpansionProfileExclude expansionProfileExclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileExclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileExclude1(ExpansionProfileExclude1 expansionProfileExclude1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileExclude1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileInclude(ExpansionProfileInclude expansionProfileInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileInclude1(ExpansionProfileInclude1 expansionProfileInclude1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileInclude1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefit(ExplanationOfBenefit explanationOfBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem explanationOfBenefitAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication explanationOfBenefitAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication1(ExplanationOfBenefitAdjudication1 explanationOfBenefitAdjudication1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication2(ExplanationOfBenefitAdjudication2 explanationOfBenefitAdjudication2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication3(ExplanationOfBenefitAdjudication3 explanationOfBenefitAdjudication3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication4(ExplanationOfBenefitAdjudication4 explanationOfBenefitAdjudication4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitBenefitBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitCoverage(ExplanationOfBenefitCoverage explanationOfBenefitCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail(ExplanationOfBenefitDetail explanationOfBenefitDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 explanationOfBenefitDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial explanationOfBenefitFinancial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitFinancial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitItem(ExplanationOfBenefitItem explanationOfBenefitItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitMissingTeeth(ExplanationOfBenefitMissingTeeth explanationOfBenefitMissingTeeth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitMissingTeeth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitNote(ExplanationOfBenefitNote explanationOfBenefitNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitOnset(ExplanationOfBenefitOnset explanationOfBenefitOnset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitOnset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitPayee(ExplanationOfBenefitPayee explanationOfBenefitPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure explanationOfBenefitProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProsthesis(ExplanationOfBenefitProsthesis explanationOfBenefitProsthesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProsthesis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitRelated(ExplanationOfBenefitRelated explanationOfBenefitRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail explanationOfBenefitSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContext(ExtensionContext extensionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatus(FamilyHistoryStatus familyHistoryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyHistoryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistory(FamilyMemberHistory familyMemberHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistoryCondition(FamilyMemberHistoryCondition familyMemberHistoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistoryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperator(FilterOperator filterOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlag(Flag flag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatus(FlagStatus flagStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalOutcome(GoalOutcome goalOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatus(GoalStatus goalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupCharacteristic(GroupCharacteristic groupCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMember(GroupMember groupMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponse(GuidanceResponse guidanceResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseAction(GuidanceResponseAction guidanceResponseAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseBehavior(GuidanceResponseBehavior guidanceResponseBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseRelatedAction(GuidanceResponseRelatedAction guidanceResponseRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatus(GuidanceResponseStatus guidanceResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideDependencyType(GuideDependencyType guideDependencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideDependencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageKind(GuidePageKind guidePageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidePageKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareService(HealthcareService healthcareService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceAvailableTime(HealthcareServiceAvailableTime healthcareServiceAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceNotAvailable(HealthcareServiceNotAvailable healthcareServiceNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpVerb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanName(HumanName humanName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humanName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(id, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUse(IdentifierUse identifierUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevel(IdentityAssuranceLevel identityAssuranceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityAssuranceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerpt(ImagingExcerpt imagingExcerpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerpt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptDicom(ImagingExcerptDicom imagingExcerptDicom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptDicom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptDicom1(ImagingExcerptDicom1 imagingExcerptDicom1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptDicom1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptDicom2(ImagingExcerptDicom2 imagingExcerptDicom2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptDicom2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptInstance(ImagingExcerptInstance imagingExcerptInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptSeries(ImagingExcerptSeries imagingExcerptSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptStudy(ImagingExcerptStudy imagingExcerptStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingExcerptViewable(ImagingExcerptViewable imagingExcerptViewable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingExcerptViewable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelection(ImagingObjectSelection imagingObjectSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionFrame(ImagingObjectSelectionFrame imagingObjectSelectionFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionFrame, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionInstance(ImagingObjectSelectionInstance imagingObjectSelectionInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionSeries(ImagingObjectSelectionSeries imagingObjectSelectionSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionStudy(ImagingObjectSelectionStudy imagingObjectSelectionStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudy(ImagingStudy imagingStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyInstance(ImagingStudyInstance imagingStudyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudySeries(ImagingStudySeries imagingStudySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationExplanation(ImmunizationExplanation immunizationExplanation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationExplanation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationReaction(ImmunizationReaction immunizationReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendation(ImmunizationRecommendation immunizationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationDateCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationProtocol(ImmunizationRecommendationProtocol immunizationRecommendationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol immunizationVaccinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationVaccinationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuide(ImplementationGuide implementationGuide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideContact(ImplementationGuideContact implementationGuideContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideDependency(ImplementationGuideDependency implementationGuideDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideGlobal(ImplementationGuideGlobal implementationGuideGlobal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideGlobal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePackage(ImplementationGuidePackage implementationGuidePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePage(ImplementationGuidePage implementationGuidePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideResource(ImplementationGuideResource implementationGuideResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailability(InstanceAvailability instanceAvailability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceAvailability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(org.hl7.fhir.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverity(IssueSeverity issueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(IssueType issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryCodeSystem(LibraryCodeSystem libraryCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryLibrary(LibraryLibrary libraryLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryModel(LibraryModel libraryModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryValueSet(LibraryValueSet libraryValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkage(Linkage linkage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageItem(LinkageItem linkageItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageType(LinkageType linkageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntry(ListEntry listEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListMode(ListMode listMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatus(ListStatus listStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationMode(LocationMode locationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPosition(LocationPosition locationPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatus(LocationStatus locationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdown(Markdown markdown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markdown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrinciple(MeasmntPrinciple measmntPrinciple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measmntPrinciple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureDataUsage(MeasureDataUsage measureDataUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureDataUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroup(MeasureGroup measureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulation(MeasurePopulation measurePopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulationType(MeasurePopulationType measurePopulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePopulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReport(MeasureReport measureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup(MeasureReportGroup measureReportGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup1(MeasureReportGroup1 measureReportGroup1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup2(MeasureReportGroup2 measureReportGroup2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation(MeasureReportPopulation measureReportPopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation1(MeasureReportPopulation1 measureReportPopulation1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatus(MeasureReportStatus measureReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStratifier(MeasureReportStratifier measureReportStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportSupplementalData(MeasureReportSupplementalData measureReportSupplementalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportSupplementalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportType(MeasureReportType measureReportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureScoring(MeasureScoring measureScoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureScoring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureStratifier(MeasureStratifier measureStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSupplementalData(MeasureSupplementalData measureSupplementalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureSupplementalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministration(MedicationAdministration medicationAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationDosage(MedicationAdministrationDosage medicationAdministrationDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatus(MedicationAdministrationStatus medicationAdministrationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationBatch(MedicationBatch medicationBatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationBatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationContent(MedicationContent medicationContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense(MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseDosageInstruction(MedicationDispenseDosageInstruction medicationDispenseDosageInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseDosageInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatus(MedicationDispenseStatus medicationDispenseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseSubstitution(MedicationDispenseSubstitution medicationDispenseSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationIngredient(MedicationIngredient medicationIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrder(MedicationOrder medicationOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderDispenseRequest(MedicationOrderDispenseRequest medicationOrderDispenseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationOrderDispenseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderDosageInstruction(MedicationOrderDosageInstruction medicationOrderDosageInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationOrderDosageInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderStatus(MedicationOrderStatus medicationOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderSubstitution(MedicationOrderSubstitution medicationOrderSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationOrderSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPackage(MedicationPackage medicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProduct(MedicationProduct medicationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatement(MedicationStatement medicationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementDosage(MedicationStatementDosage medicationStatementDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatus(MedicationStatementStatus medicationStatementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeader(MessageHeader messageHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderDestination(MessageHeaderDestination messageHeaderDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderResponse(MessageHeaderResponse messageHeaderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderSource(MessageHeaderSource messageHeaderSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategory(MessageSignificanceCategory messageSignificanceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSignificanceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinition(ModuleDefinition moduleDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionCodeFilter(ModuleDefinitionCodeFilter moduleDefinitionCodeFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionCodeFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionCodeSystem(ModuleDefinitionCodeSystem moduleDefinitionCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionData(ModuleDefinitionData moduleDefinitionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionDateFilter(ModuleDefinitionDateFilter moduleDefinitionDateFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionDateFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionLibrary(ModuleDefinitionLibrary moduleDefinitionLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionModel(ModuleDefinitionModel moduleDefinitionModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionParameter(ModuleDefinitionParameter moduleDefinitionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleDefinitionValueSet(ModuleDefinitionValueSet moduleDefinitionValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleDefinitionValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadata(ModuleMetadata moduleMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataContact(ModuleMetadataContact moduleMetadataContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataContact1(ModuleMetadataContact1 moduleMetadataContact1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataContact1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataContributor(ModuleMetadataContributor moduleMetadataContributor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataContributor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataContributorType(ModuleMetadataContributorType moduleMetadataContributorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataContributorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataCoverage(ModuleMetadataCoverage moduleMetadataCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataRelatedResource(ModuleMetadataRelatedResource moduleMetadataRelatedResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataRelatedResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataResourceType(ModuleMetadataResourceType moduleMetadataResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataStatus(ModuleMetadataStatus moduleMetadataStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataType(ModuleMetadataType moduleMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Money money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(money, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUse(NameUse nameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystem(NamingSystem namingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemContact(NamingSystemContact namingSystemContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierType(NamingSystemIdentifierType namingSystemIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemType(NamingSystemType namingSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemUniqueId(NamingSystemUniqueId namingSystemUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemUniqueId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrative(Narrative narrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatus(NarrativeStatus narrativeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrder(NutritionOrder nutritionOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderAdministration(NutritionOrderAdministration nutritionOrderAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderEnteralFormula(NutritionOrderEnteralFormula nutritionOrderEnteralFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderEnteralFormula, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderNutrient(NutritionOrderNutrient nutritionOrderNutrient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderNutrient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderOralDiet(NutritionOrderOralDiet nutritionOrderOralDiet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderOralDiet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatus(NutritionOrderStatus nutritionOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderSupplement(NutritionOrderSupplement nutritionOrderSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderTexture(NutritionOrderTexture nutritionOrderTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationComponent(ObservationComponent observationComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReferenceRange(ObservationReferenceRange observationReferenceRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationReferenceRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelated(ObservationRelated observationRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipType(ObservationRelationshipType observationRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatus(ObservationStatus observationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(Oid oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinition(OperationDefinition operationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionBinding(OperationDefinitionBinding operationDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionContact(OperationDefinitionContact operationDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionParameter(OperationDefinitionParameter operationDefinitionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKind(OperationKind operationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcome(OperationOutcome operationOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcomeIssue(OperationOutcomeIssue operationOutcomeIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcomeIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUse(OperationParameterUse operationParameterUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderResponse(OrderResponse orderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderSet(OrderSet orderSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatus(OrderStatus orderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderWhen(OrderWhen orderWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationContact(OrganizationContact organizationContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDefinition(ParameterDefinition parameterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersParameter(ParametersParameter parametersParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequired(ParticipantRequired participantRequired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRequired, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantType(ParticipantType participantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatus(ParticipationStatus participationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAnimal(PatientAnimal patientAnimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientAnimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCommunication(PatientCommunication patientCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLink(PatientLink patientLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentNotice(PaymentNotice paymentNotice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentNotice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliation(PaymentReconciliation paymentReconciliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationDetail(PaymentReconciliationDetail paymentReconciliationDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationNote(PaymentReconciliationNote paymentReconciliationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(period, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLink(PersonLink personLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(PositiveInt positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitioner(Practitioner practitioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitioner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerPractitionerRole(PractitionerPractitionerRole practitionerPractitionerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerPractitionerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerQualification(PractitionerQualification practitionerQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerQualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRole(PractitionerRole practitionerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleAvailableTime(PractitionerRoleAvailableTime practitionerRoleAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleNotAvailable(PractitionerRoleNotAvailable practitionerRoleNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureFocalDevice(ProcedureFocalDevice procedureFocalDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureFocalDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformer(ProcedurePerformer procedurePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedurePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequest(ProcedureRequest procedureRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestPriority(ProcedureRequestPriority procedureRequestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestStatus(ProcedureRequestStatus procedureRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatus(ProcedureStatus procedureStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequest(ProcessRequest processRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequestItem(ProcessRequestItem processRequestItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequestItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponse(ProcessResponse processResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponseNotes(ProcessResponseNotes processResponseNotes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponseNotes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentation(PropertyRepresentation propertyRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolActivity(ProtocolActivity protocolActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolComponent(ProtocolComponent protocolComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolCondition(ProtocolCondition protocolCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolDetail(ProtocolDetail protocolDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolNext(ProtocolNext protocolNext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolNext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolPrecondition(ProtocolPrecondition protocolPrecondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolPrecondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStatus(ProtocolStatus protocolStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStep(ProtocolStep protocolStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolType(ProtocolType protocolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenance(Provenance provenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAgent(ProvenanceAgent provenanceAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntity(ProvenanceEntity provenanceEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRole(ProvenanceEntityRole provenanceEntityRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntityRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceRelatedAgent(ProvenanceRelatedAgent provenanceRelatedAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceRelatedAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparator(QuantityComparator quantityComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireEnableWhen(QuestionnaireEnableWhen questionnaireEnableWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireEnableWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItem(QuestionnaireItem questionnaireItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemType(QuestionnaireItemType questionnaireItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireOption(QuestionnaireOption questionnaireOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponse(QuestionnaireResponse questionnaireResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseAnswer(QuestionnaireResponseAnswer questionnaireResponseAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseItem(QuestionnaireResponseItem questionnaireResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatus(QuestionnaireResponseStatus questionnaireResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatus(QuestionnaireStatus questionnaireStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatio(Ratio ratio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRules(ReferenceVersionRules referenceVersionRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceVersionRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralCategory(ReferralCategory referralCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequest(ReferralRequest referralRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralStatus(ReferralStatus referralStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPerson(RelatedPerson relatedPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcome(RemittanceOutcome remittanceOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remittanceOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceContainer(ResourceContainer resourceContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicy(ResourceVersionPolicy resourceVersionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulConformanceMode(RestfulConformanceMode restfulConformanceMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restfulConformanceMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessment(RiskAssessment riskAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessmentPrediction(RiskAssessmentPrediction riskAssessmentPrediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessmentPrediction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledData(SampledData sampledData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataType(SampledDataDataType sampledDataDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledDataDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryMode(SearchEntryMode searchEntryMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchEntryMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCode(SearchModifierCode searchModifierCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchModifierCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameter(SearchParameter searchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameterContact(SearchParameterContact searchParameterContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameterContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamType(SearchParamType searchParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceInner(SequenceInner sequenceInner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceInner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceOuter(SequenceOuter sequenceOuter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceOuter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceQuality(SequenceQuality sequenceQuality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceQuality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceReferenceSeq(SequenceReferenceSeq sequenceReferenceSeq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceReferenceSeq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRepository(SequenceRepository sequenceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceStructureVariation(SequenceStructureVariation sequenceStructureVariation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceStructureVariation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceVariation(SequenceVariation sequenceVariation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceVariation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQuantity(SimpleQuantity simpleQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRules(SlicingRules slicingRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slicingRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatus(SlotStatus slotStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollection(SpecimenCollection specimenCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainer(SpecimenContainer specimenContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatus(SpecimenStatus specimenStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenTreatment(SpecimenTreatment specimenTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenTreatment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.hl7.fhir.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinition(StructureDefinition structureDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionContact(StructureDefinitionContact structureDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionDifferential(StructureDefinitionDifferential structureDefinitionDifferential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionDifferential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKind(StructureDefinitionKind structureDefinitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionMapping(StructureDefinitionMapping structureDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionSnapshot(StructureDefinitionSnapshot structureDefinitionSnapshot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionSnapshot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMap(StructureMap structureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContact(StructureMapContact structureMapContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextType(StructureMapContextType structureMapContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapDependent(StructureMapDependent structureMapDependent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapDependent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroup(StructureMapGroup structureMapGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInput(StructureMapInput structureMapInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputMode(StructureMapInputMode structureMapInputMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInputMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapListMode(StructureMapListMode structureMapListMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapListMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelMode(StructureMapModelMode structureMapModelMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapModelMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapParameter(StructureMapParameter structureMapParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapRule(StructureMapRule structureMapRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSource(StructureMapSource structureMapSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapStructure(StructureMapStructure structureMapStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTarget(StructureMapTarget structureMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransform(StructureMapTransform structureMapTransform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTransform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannel(SubscriptionChannel subscriptionChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelType(SubscriptionChannelType subscriptionChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatus(SubscriptionStatus subscriptionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstance(Substance substance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceIngredient(SubstanceIngredient substanceIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceInstance(SubstanceInstance substanceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDelivery(SupplyDelivery supplyDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDelivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatus(SupplyDeliveryStatus supplyDeliveryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliveryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequest(SupplyRequest supplyRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatus(SupplyRequestStatus supplyRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestWhen(SupplyRequestWhen supplyRequestWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteraction(SystemRestfulInteraction systemRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskInput(TaskInput taskInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskOutput(TaskOutput taskOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskPriority(TaskPriority taskPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatus(TaskStatus taskStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScript(TestScript testScript, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction(TestScriptAction testScriptAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction1(TestScriptAction1 testScriptAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction2(TestScriptAction2 testScriptAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAssert(TestScriptAssert testScriptAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptCapability(TestScriptCapability testScriptCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptContact(TestScriptContact testScriptContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptDestination(TestScriptDestination testScriptDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptFixture(TestScriptFixture testScriptFixture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptFixture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptLink(TestScriptLink testScriptLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptMetadata(TestScriptMetadata testScriptMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOperation(TestScriptOperation testScriptOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOrigin(TestScriptOrigin testScriptOrigin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOrigin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam(TestScriptParam testScriptParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam1(TestScriptParam1 testScriptParam1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam2(TestScriptParam2 testScriptParam2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam3(TestScriptParam3 testScriptParam3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestHeader(TestScriptRequestHeader testScriptRequestHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRequestHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule(TestScriptRule testScriptRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule1(TestScriptRule1 testScriptRule1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule2(TestScriptRule2 testScriptRule2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule3(TestScriptRule3 testScriptRule3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRuleset(TestScriptRuleset testScriptRuleset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRuleset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRuleset1(TestScriptRuleset1 testScriptRuleset1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRuleset1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptSetup(TestScriptSetup testScriptSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTeardown(TestScriptTeardown testScriptTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTest(TestScriptTest testScriptTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptVariable(TestScriptVariable testScriptVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingRepeat(TimingRepeat timingRepeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingRepeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionMode(TransactionMode transactionMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerDefinition(TriggerDefinition triggerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRule(TypeDerivationRule typeDerivationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDerivationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteraction(TypeRestfulInteraction typeRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTime(UnitsOfTime unitsOfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsOfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownContentCode(UnknownContentCode unknownContentCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownContentCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInt(UnsignedInt unsignedInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(Uri uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(use, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(Uuid uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSet(ValueSet valueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetCompose(ValueSetCompose valueSetCompose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetCompose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetConcept(ValueSetConcept valueSetConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContact(ValueSetContact valueSetContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContains(ValueSetContains valueSetContains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContains, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDesignation(ValueSetDesignation valueSetDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetExpansion(ValueSetExpansion valueSetExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetFilter(ValueSetFilter valueSetFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetInclude(ValueSetInclude valueSetInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetParameter(ValueSetParameter valueSetParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBase(VisionBase visionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyes(VisionEyes visionEyes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionEyes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescription(VisionPrescription visionPrescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescriptionDispense(VisionPrescriptionDispense visionPrescriptionDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescriptionDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageType(XPathUsageType xPathUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xPathUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingList(EventTimingList eventTimingList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityList(InstanceAvailabilityList instanceAvailabilityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionList(SystemRestfulInteractionList systemRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionList(TypeRestfulInteractionList typeRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeList(UnitsOfTimeList unitsOfTimeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusList(String accountStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionListList(String actionListList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipAnchorList(String actionRelationshipAnchorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipTypeList(String actionRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTypeList(String actionTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionCategoryList(String activityDefinitionCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeList(String addressTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseList(String addressUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderList(String administrativeGenderList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeList(String aggregationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategoryList(String allergyIntoleranceCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCertaintyList(String allergyIntoleranceCertaintyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityList(String allergyIntoleranceCriticalityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityList(String allergyIntoleranceSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatusList(String allergyIntoleranceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeList(String allergyIntoleranceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusList(String appointmentStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeList(String assertionDirectionTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeList(String assertionOperatorTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesList(String assertionResponseTypesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionList(String auditEventActionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeList(String auditEventOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipantNetworkTypeList(String auditEventParticipantNetworkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthList(String bindingStrengthList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitiveObject(Boolean booleanPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeList(String bundleTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusList(String carePlanActivityStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelationshipList(String carePlanRelationshipList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatusList(String carePlanStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimTypeList(String claimTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusList(String clinicalImpressionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodePrimitive_Pattern(codePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodePrimitive_MinLength(codePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CODE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+([\\s]?[^\\s]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_Pattern(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, CODE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_MinLength(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codePrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentModeList(String codeSystemContentModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestStatusList(String communicationRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStatusList(String communicationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentTypeList(String compartmentTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeList(String compositionAttestationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusList(String compositionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceList(String conceptMapEquivalenceList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusList(String conditionalDeleteStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionVerificationStatusList(String conditionVerificationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEventModeList(String conformanceEventModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResourceStatusList(String conformanceResourceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceStatementKindList(String conformanceStatementKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityList(String constraintSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemList(String contactPointSystemList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseList(String contactPointUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeList(String contentTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementStringencyList(String dataElementStringencyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePrimitive_Pattern(datePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive_Pattern(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDatePrimitive(), datePrimitive, DATE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase_MemberTypes(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePrimitive_Pattern(dateTimePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?)?)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive_Pattern(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDateTimePrimitive(), dateTimePrimitive, DATE_TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase_MemberTypes(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekList(String daysOfWeekList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPrimitive_Pattern(decimalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DECIMAL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Decimal Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive_Pattern(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDecimalPrimitive(), decimalPrimitive, DECIMAL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverityList(String detectedIssueSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateList(String deviceMetricCalibrationStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeList(String deviceMetricCalibrationTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryList(String deviceMetricCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorList(String deviceMetricColorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusList(String deviceMetricOperationalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatusList(String deviceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestPriorityList(String deviceUseRequestPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestStatusList(String deviceUseRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderPriorityList(String diagnosticOrderPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderStatusList(String diagnosticOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusList(String diagnosticReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaTypeList(String digitalMediaTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeList(String documentModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusList(String documentReferenceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeList(String documentRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDWebTypeList(String dWebTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassList(String encounterClassList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusList(String encounterLocationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStateList(String encounterStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatusList(String endpointStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusList(String episodeOfCareStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingListObject(EventTimingList eventTimingListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextList(String extensionContextList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusList(String familyHistoryStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorList(String filterOperatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusList(String flagStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatusList(String goalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeList(String groupTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatusList(String guidanceResponseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideDependencyTypeList(String guideDependencyTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageKindList(String guidePageKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbList(String httpVerbList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseList(String identifierUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelList(String identityAssuranceLevelList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdPrimitive_Pattern(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MinLength(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MaxLength(idPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] ID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9\\-\\.]{1,64}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_Pattern(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, ID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MinLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MaxLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length <= 64;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityListObject(InstanceAvailabilityList instanceAvailabilityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive_Pattern(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIntegerPrimitive(), integerPrimitive, INTEGER_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitiveObject(Integer integerPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityList(String issueSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueTypeList(String issueTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageTypeList(String linkageTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeList(String linkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeList(String listModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusList(String listStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeList(String locationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusList(String locationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkdownPrimitive_MinLength(markdownPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_MinLength(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markdownPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getMarkdownPrimitive(), markdownPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrincipleList(String measmntPrincipleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureDataUsageList(String measureDataUsageList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulationTypeList(String measurePopulationTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatusList(String measureReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportTypeList(String measureReportTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureScoringList(String measureScoringList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureTypeList(String measureTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatusList(String medicationAdministrationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusList(String medicationDispenseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderStatusList(String medicationOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusList(String medicationStatementStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryList(String messageSignificanceCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataContributorTypeList(String moduleMetadataContributorTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataResourceTypeList(String moduleMetadataResourceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataStatusList(String moduleMetadataStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleMetadataTypeList(String moduleMetadataTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseList(String nameUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeList(String namingSystemIdentifierTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeList(String namingSystemTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusList(String narrativeStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeList(String noteTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatusList(String nutritionOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipTypeList(String observationRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusList(String observationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOidPrimitive_Pattern(oidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateOidPrimitive_MinLength(oidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] OID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_Pattern(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, OID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_MinLength(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindList(String operationKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseList(String operationParameterUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatusList(String orderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredList(String participantRequiredList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantTypeList(String participantTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusList(String participationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntPrimitive_Pattern(positiveIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive_Pattern(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getPositiveIntPrimitive(), positiveIntPrimitive, POSITIVE_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestPriorityList(String procedureRequestPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestStatusList(String procedureRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusList(String procedureStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationList(String propertyRepresentationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeList(String propertyTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStatusList(String protocolStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTypeList(String protocolTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleList(String provenanceEntityRoleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorList(String quantityComparatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemTypeList(String questionnaireItemTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatusList(String questionnaireResponseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatusList(String questionnaireStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRulesList(String referenceVersionRulesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralCategoryList(String referralCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralStatusList(String referralStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeList(String remittanceOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyList(String resourceVersionPolicyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeList(String responseTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulConformanceModeList(String restfulConformanceModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSampledDataDataTypePrimitive_Pattern(sampledDataDataTypePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSampledDataDataTypePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])( ((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sampled Data Data Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive_Pattern(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getSampledDataDataTypePrimitive(), sampledDataDataTypePrimitive, SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeList(String searchEntryModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeList(String searchModifierCodeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeList(String searchParamTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeList(String sequenceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesList(String slicingRulesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusList(String slotStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatusList(String specimenStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringPrimitive_MinLength(stringPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>String Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive_MinLength(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getStringPrimitive(), stringPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindList(String structureDefinitionKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextTypeList(String structureMapContextTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputModeList(String structureMapInputModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapListModeList(String structureMapListModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelModeList(String structureMapModelModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransformList(String structureMapTransformList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeList(String subscriptionChannelTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusList(String subscriptionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusList(String supplyDeliveryStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusList(String supplyRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionListObject(SystemRestfulInteractionList systemRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskPriorityList(String taskPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatusList(String taskStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePrimitive_Pattern(timePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive_Pattern(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getTimePrimitive(), timePrimitive, TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionModeList(String transactionModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeList(String triggerTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRuleList(String typeDerivationRuleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionListObject(TypeRestfulInteractionList typeRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeListObject(UnitsOfTimeList unitsOfTimeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownContentCodeList(String unknownContentCodeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(unsignedIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnsignedIntPrimitive_Pattern(unsignedIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|([1-9][0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unsigned Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive_Pattern(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUnsignedIntPrimitive(), unsignedIntPrimitive, UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseList(String useList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidPrimitive_Pattern(uuidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuidPrimitive_MinLength(uuidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UUID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_Pattern(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, UUID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_MinLength(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseList(String visionBaseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesList(String visionEyesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageTypeList(String xPathUsageTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FhirValidator
