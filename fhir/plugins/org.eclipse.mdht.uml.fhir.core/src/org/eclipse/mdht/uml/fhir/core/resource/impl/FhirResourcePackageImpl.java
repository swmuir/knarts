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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourceFactory;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

import org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage;

import org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirResourcePackageImpl extends EPackageImpl implements FhirResourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "resource.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerPractitionerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceNotAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerQualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAnimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareCareTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterHospitalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionInvestigationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionRuledOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationReferenceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductBatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPackageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentProductionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCalibrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireGroupQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetCodeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetCodeSystemConceptDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetCodeSystemConceptDefinitionDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetConceptReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeConceptSetFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionContainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseGroupQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireResponseGroupQuestionAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceRelatesToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContextRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFocalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanRelatedPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementDosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderOralDietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderOralDietNutrientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderOralDietTextureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderEnteralFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderEnteralFormulaAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentPredictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationOrderDosageInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationOrderDispenseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationOrderSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyRequestWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionStudySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionStudySeriesInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionStudySeriesInstanceFramesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractValuedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractSignatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermTermActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermTermValuedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractFriendlyLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractLegalLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractComputableLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionAttesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionDifferentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestSecurityCertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestResourceResourceInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestResourceSearchParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestSystemInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceMessagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceMessagingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceMessagingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentNoticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePackageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuideGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationGuidePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderMessageSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderMessageDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationDateCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationExplanationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationVaccinationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceAgentRelatedAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimPayeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsItemAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsItemDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsItemDetailDetailAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsItemDetailSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemsItemDetailSubDetailSubdetailAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemAddedItemAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemAddedItemsDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseErrorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemsDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemsDetailSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemsProsthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimMissingTeethEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapSourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapSourceElementTargetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapSourceElementTargetElementOtherElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationDosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptMetadataCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupActionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupActionOperationRequestHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptSetupActionAssertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTestActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTeardownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScriptTeardownActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseDosageInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventParticipantNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectedIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectedIssueMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntrySearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemUniqueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationContactEClass = null;

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FhirResourcePackageImpl() {
		super(eNS_URI, FhirResourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FhirResourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FhirResourcePackage init() {
		if (isInited) return (FhirResourcePackage)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI);

		// Obtain or create and register package
		FhirResourcePackageImpl theFhirResourcePackage = (FhirResourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FhirResourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FhirResourcePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FhirValuesetPackageImpl theFhirValuesetPackage = (FhirValuesetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirValuesetPackage.eNS_URI) instanceof FhirValuesetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirValuesetPackage.eNS_URI) : FhirValuesetPackage.eINSTANCE);
		FhirDatatypePackageImpl theFhirDatatypePackage = (FhirDatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) instanceof FhirDatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) : FhirDatatypePackage.eINSTANCE);

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
		theFhirResourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FhirResourcePackage.eNS_URI, theFhirResourcePackage);
		return theFhirResourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitioner() {
		if (practitionerEClass == null) {
			practitionerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(0);
		}
		return practitionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Identifier() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Active() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Name() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Telecom() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Address() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Gender() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_BirthDate() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Photo() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_PractitionerRole() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Qualification() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Communication() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainResource() {
		if (domainResourceEClass == null) {
			domainResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(1);
		}
		return domainResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Text() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Contained() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Extension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_ModifierExtension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		if (resourceEClass == null) {
			resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(2);
		}
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Id() {
        return (EReference)getResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Meta() {
        return (EReference)getResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ImplicitRules() {
        return (EReference)getResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Language() {
        return (EReference)getResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerPractitionerRole() {
		if (practitionerPractitionerRoleEClass == null) {
			practitionerPractitionerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(3);
		}
		return practitionerPractitionerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_ManagingOrganization() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Role() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Specialty() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Period() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Location() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_HealthcareService() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(4);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Identifier() {
        return (EReference)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Status() {
        return (EReference)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Name() {
        return (EReference)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Description() {
        return (EReference)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Mode() {
        return (EReference)getLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Type() {
        return (EReference)getLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Telecom() {
        return (EReference)getLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Address() {
        return (EReference)getLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PhysicalType() {
        return (EReference)getLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Position() {
        return (EReference)getLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ManagingOrganization() {
        return (EReference)getLocation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PartOf() {
        return (EReference)getLocation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPosition() {
		if (locationPositionEClass == null) {
			locationPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(5);
		}
		return locationPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Longitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Latitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Altitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareService() {
		if (healthcareServiceEClass == null) {
			healthcareServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(6);
		}
		return healthcareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Identifier() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProvidedBy() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceCategory() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceType() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Location() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Comment() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ExtraDetails() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Photo() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Telecom() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_CoverageArea() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceProvisionCode() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Eligibility() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_EligibilityNote() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProgramName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Characteristic() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ReferralMethod() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_PublicKey() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AppointmentRequired() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailableTime() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_NotAvailable() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailabilityExceptions() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceServiceType() {
		if (healthcareServiceServiceTypeEClass == null) {
			healthcareServiceServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(7);
		}
		return healthcareServiceServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceServiceType_Type() {
        return (EReference)getHealthcareServiceServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceServiceType_Specialty() {
        return (EReference)getHealthcareServiceServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceAvailableTime() {
		if (healthcareServiceAvailableTimeEClass == null) {
			healthcareServiceAvailableTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(8);
		}
		return healthcareServiceAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_DaysOfWeek() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AllDay() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableStartTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableEndTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceNotAvailable() {
		if (healthcareServiceNotAvailableEClass == null) {
			healthcareServiceNotAvailableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(9);
		}
		return healthcareServiceNotAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_Description() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_During() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerQualification() {
		if (practitionerQualificationEClass == null) {
			practitionerQualificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(10);
		}
		return practitionerQualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Identifier() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Code() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Period() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Issuer() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		if (patientEClass == null) {
			patientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(11);
		}
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Identifier() {
        return (EReference)getPatient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Active() {
        return (EReference)getPatient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Name() {
        return (EReference)getPatient().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Telecom() {
        return (EReference)getPatient().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Gender() {
        return (EReference)getPatient().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_BirthDate() {
        return (EReference)getPatient().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Deceasedx() {
        return (EReference)getPatient().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Address() {
        return (EReference)getPatient().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MaritalStatus() {
        return (EReference)getPatient().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MultipleBirthx() {
        return (EReference)getPatient().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Photo() {
        return (EReference)getPatient().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Contact() {
        return (EReference)getPatient().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Animal() {
        return (EReference)getPatient().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Communication() {
        return (EReference)getPatient().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_CareProvider() {
        return (EReference)getPatient().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_ManagingOrganization() {
        return (EReference)getPatient().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Link() {
        return (EReference)getPatient().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContact() {
		if (patientContactEClass == null) {
			patientContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(12);
		}
		return patientContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Relationship() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Name() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Telecom() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Address() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Gender() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Organization() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Period() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAnimal() {
		if (patientAnimalEClass == null) {
			patientAnimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(13);
		}
		return patientAnimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Species() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Breed() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_GenderStatus() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientCommunication() {
		if (patientCommunicationEClass == null) {
			patientCommunicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(14);
		}
		return patientCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Language() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Preferred() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientLink() {
		if (patientLinkEClass == null) {
			patientLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(15);
		}
		return patientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Other() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Type() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedPerson() {
		if (relatedPersonEClass == null) {
			relatedPersonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(16);
		}
		return relatedPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Identifier() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Patient() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Relationship() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Name() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Telecom() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Gender() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_BirthDate() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Address() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Photo() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Period() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		if (deviceEClass == null) {
			deviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(17);
		}
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Identifier() {
        return (EReference)getDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Type() {
        return (EReference)getDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Note() {
        return (EReference)getDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Status() {
        return (EReference)getDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Manufacturer() {
        return (EReference)getDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Model() {
        return (EReference)getDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Version() {
        return (EReference)getDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_ManufactureDate() {
        return (EReference)getDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Expiry() {
        return (EReference)getDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Udi() {
        return (EReference)getDevice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_LotNumber() {
        return (EReference)getDevice().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Owner() {
        return (EReference)getDevice().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Location() {
        return (EReference)getDevice().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Patient() {
        return (EReference)getDevice().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Contact() {
        return (EReference)getDevice().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Url() {
        return (EReference)getDevice().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		if (appointmentEClass == null) {
			appointmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(18);
		}
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Identifier() {
        return (EReference)getAppointment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Status() {
        return (EReference)getAppointment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Type() {
        return (EReference)getAppointment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Reason() {
        return (EReference)getAppointment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Priority() {
        return (EReference)getAppointment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Description() {
        return (EReference)getAppointment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Start() {
        return (EReference)getAppointment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_End() {
        return (EReference)getAppointment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_MinutesDuration() {
        return (EReference)getAppointment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Slot() {
        return (EReference)getAppointment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Comment() {
        return (EReference)getAppointment().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Participant() {
        return (EReference)getAppointment().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		if (slotEClass == null) {
			slotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(19);
		}
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Identifier() {
        return (EReference)getSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Type() {
        return (EReference)getSlot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Schedule() {
        return (EReference)getSlot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_FreeBusyType() {
        return (EReference)getSlot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Start() {
        return (EReference)getSlot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_End() {
        return (EReference)getSlot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Overbooked() {
        return (EReference)getSlot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Comment() {
        return (EReference)getSlot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		if (scheduleEClass == null) {
			scheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(20);
		}
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Identifier() {
        return (EReference)getSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Type() {
        return (EReference)getSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Actor() {
        return (EReference)getSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_PlanningHorizon() {
        return (EReference)getSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Comment() {
        return (EReference)getSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentParticipant() {
		if (appointmentParticipantEClass == null) {
			appointmentParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(21);
		}
		return appointmentParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Type() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Actor() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Required() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Status() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		if (accountEClass == null) {
			accountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(22);
		}
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Identifier() {
        return (EReference)getAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Name() {
        return (EReference)getAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Type() {
        return (EReference)getAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Status() {
        return (EReference)getAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_ActivePeriod() {
        return (EReference)getAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Currency() {
        return (EReference)getAccount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Balance() {
        return (EReference)getAccount().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_CoveragePeriod() {
        return (EReference)getAccount().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Subject() {
        return (EReference)getAccount().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Owner() {
        return (EReference)getAccount().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Description() {
        return (EReference)getAccount().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralRequest() {
		if (referralRequestEClass == null) {
			referralRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(23);
		}
		return referralRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Status() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Identifier() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Date() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Type() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Specialty() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Priority() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Patient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Requester() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Recipient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Encounter() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_DateSent() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Reason() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Description() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_ServiceRequested() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_SupportingInformation() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_FulfillmentTime() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(24);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Identifier() {
        return (EReference)getEncounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Status() {
        return (EReference)getEncounter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_StatusHistory() {
        return (EReference)getEncounter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Class() {
        return (EReference)getEncounter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Type() {
        return (EReference)getEncounter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Priority() {
        return (EReference)getEncounter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Patient() {
        return (EReference)getEncounter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_EpisodeOfCare() {
        return (EReference)getEncounter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_IncomingReferral() {
        return (EReference)getEncounter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Participant() {
        return (EReference)getEncounter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Appointment() {
        return (EReference)getEncounter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Period() {
        return (EReference)getEncounter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Length() {
        return (EReference)getEncounter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Reason() {
        return (EReference)getEncounter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Indication() {
        return (EReference)getEncounter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Hospitalization() {
        return (EReference)getEncounter().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Location() {
        return (EReference)getEncounter().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_ServiceProvider() {
        return (EReference)getEncounter().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_PartOf() {
        return (EReference)getEncounter().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterStatusHistory() {
		if (encounterStatusHistoryEClass == null) {
			encounterStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(25);
		}
		return encounterStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Status() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Period() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCare() {
		if (episodeOfCareEClass == null) {
			episodeOfCareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(26);
		}
		return episodeOfCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Identifier() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Status() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_StatusHistory() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Type() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Condition() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Patient() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ManagingOrganization() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Period() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ReferralRequest() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_CareManager() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_CareTeam() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareStatusHistory() {
		if (episodeOfCareStatusHistoryEClass == null) {
			episodeOfCareStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(27);
		}
		return episodeOfCareStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Status() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Period() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(28);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Identifier() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Patient() {
        return (EReference)getCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Encounter() {
        return (EReference)getCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Asserter() {
        return (EReference)getCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_DateRecorded() {
        return (EReference)getCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Code() {
        return (EReference)getCondition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Category() {
        return (EReference)getCondition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ClinicalStatus() {
        return (EReference)getCondition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_VerificationStatus() {
        return (EReference)getCondition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Severity() {
        return (EReference)getCondition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Onsetx() {
        return (EReference)getCondition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Abatementx() {
        return (EReference)getCondition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Stage() {
        return (EReference)getCondition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Evidence() {
        return (EReference)getCondition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_BodySite() {
        return (EReference)getCondition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Notes() {
        return (EReference)getCondition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionStage() {
		if (conditionStageEClass == null) {
			conditionStageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(29);
		}
		return conditionStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Summary() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Assessment() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEvidence() {
		if (conditionEvidenceEClass == null) {
			conditionEvidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(30);
		}
		return conditionEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Code() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Detail() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareCareTeam() {
		if (episodeOfCareCareTeamEClass == null) {
			episodeOfCareCareTeamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(31);
		}
		return episodeOfCareCareTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Role() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Period() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Member() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterParticipant() {
		if (encounterParticipantEClass == null) {
			encounterParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(32);
		}
		return encounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Type() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Period() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Individual() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterHospitalization() {
		if (encounterHospitalizationEClass == null) {
			encounterHospitalizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(33);
		}
		return encounterHospitalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_PreAdmissionIdentifier() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Origin() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_AdmitSource() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_AdmittingDiagnosis() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_ReAdmission() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DietPreference() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialCourtesy() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialArrangement() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Destination() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDisposition() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDiagnosis() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(34);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Location() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Status() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Period() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpression() {
		if (clinicalImpressionEClass == null) {
			clinicalImpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(35);
		}
		return clinicalImpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Patient() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Assessor() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Status() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Date() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Description() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Previous() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Problem() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Triggerx() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Investigations() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Protocol() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Summary() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Finding() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Resolved() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_RuledOut() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Prognosis() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Plan() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Action() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionInvestigations() {
		if (clinicalImpressionInvestigationsEClass == null) {
			clinicalImpressionInvestigationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(36);
		}
		return clinicalImpressionInvestigationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigations_Code() {
        return (EReference)getClinicalImpressionInvestigations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigations_Item() {
        return (EReference)getClinicalImpressionInvestigations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionFinding() {
		if (clinicalImpressionFindingEClass == null) {
			clinicalImpressionFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(37);
		}
		return clinicalImpressionFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Item() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Cause() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionRuledOut() {
		if (clinicalImpressionRuledOutEClass == null) {
			clinicalImpressionRuledOutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(38);
		}
		return clinicalImpressionRuledOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionRuledOut_Item() {
        return (EReference)getClinicalImpressionRuledOut().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionRuledOut_Reason() {
        return (EReference)getClinicalImpressionRuledOut().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(39);
		}
		return allergyIntoleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Identifier() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Onset() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_RecordedDate() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Recorder() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Patient() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Reporter() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Substance() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Status() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Criticality() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Type() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Category() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_LastOccurence() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Note() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Reaction() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceReaction() {
		if (allergyIntoleranceReactionEClass == null) {
			allergyIntoleranceReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(40);
		}
		return allergyIntoleranceReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Substance() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Certainty() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Manifestation() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Description() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Onset() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Severity() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_ExposureRoute() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceReaction_Note() {
        return (EReference)getAllergyIntoleranceReaction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		if (observationEClass == null) {
			observationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(41);
		}
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Identifier() {
        return (EReference)getObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Status() {
        return (EReference)getObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Category() {
        return (EReference)getObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Code() {
        return (EReference)getObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Subject() {
        return (EReference)getObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Encounter() {
        return (EReference)getObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Effectivex() {
        return (EReference)getObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Issued() {
        return (EReference)getObservation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Performer() {
        return (EReference)getObservation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Valuex() {
        return (EReference)getObservation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_DataAbsentReason() {
        return (EReference)getObservation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Interpretation() {
        return (EReference)getObservation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Comments() {
        return (EReference)getObservation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_BodySite() {
        return (EReference)getObservation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Method() {
        return (EReference)getObservation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Specimen() {
        return (EReference)getObservation().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Device() {
        return (EReference)getObservation().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ReferenceRange() {
        return (EReference)getObservation().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Related() {
        return (EReference)getObservation().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Component() {
        return (EReference)getObservation().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimen() {
		if (specimenEClass == null) {
			specimenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(42);
		}
		return specimenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Identifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Status() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Type() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Parent() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Subject() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_AccessionIdentifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_ReceivedTime() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Collection() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Treatment() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Container() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenCollection() {
		if (specimenCollectionEClass == null) {
			specimenCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(43);
		}
		return specimenCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Collector() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Comment() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Collectedx() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Quantity() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Method() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_BodySite() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenTreatment() {
		if (specimenTreatmentEClass == null) {
			specimenTreatmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(44);
		}
		return specimenTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Description() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Procedure() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Additive() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstance() {
		if (substanceEClass == null) {
			substanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(45);
		}
		return substanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Identifier() {
        return (EReference)getSubstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Category() {
        return (EReference)getSubstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Code() {
        return (EReference)getSubstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Description() {
        return (EReference)getSubstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Instance() {
        return (EReference)getSubstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Ingredient() {
        return (EReference)getSubstance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceInstance() {
		if (substanceInstanceEClass == null) {
			substanceInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(46);
		}
		return substanceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Identifier() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Expiry() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Quantity() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceIngredient() {
		if (substanceIngredientEClass == null) {
			substanceIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(47);
		}
		return substanceIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Quantity() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Substance() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenContainer() {
		if (specimenContainerEClass == null) {
			specimenContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(48);
		}
		return specimenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Identifier() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Description() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Type() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Capacity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_SpecimenQuantity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Additivex() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationReferenceRange() {
		if (observationReferenceRangeEClass == null) {
			observationReferenceRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(49);
		}
		return observationReferenceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Low() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_High() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Meaning() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Age() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Text() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationRelated() {
		if (observationRelatedEClass == null) {
			observationRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(50);
		}
		return observationRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Type() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Target() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationComponent() {
		if (observationComponentEClass == null) {
			observationComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(51);
		}
		return observationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_Code() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_Valuex() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_DataAbsentReason() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationComponent_ReferenceRange() {
        return (EReference)getObservationComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		if (groupEClass == null) {
			groupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(52);
		}
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Identifier() {
        return (EReference)getGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Type() {
        return (EReference)getGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Actual() {
        return (EReference)getGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Code() {
        return (EReference)getGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Name() {
        return (EReference)getGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Quantity() {
        return (EReference)getGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Characteristic() {
        return (EReference)getGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Member() {
        return (EReference)getGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupCharacteristic() {
		if (groupCharacteristicEClass == null) {
			groupCharacteristicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(53);
		}
		return groupCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Code() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Valuex() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Exclude() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Period() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupMember() {
		if (groupMemberEClass == null) {
			groupMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(54);
		}
		return groupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Entity() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Period() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Inactive() {
        return (EReference)getGroupMember().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(55);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Code() {
        return (EReference)getMedication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_IsBrand() {
        return (EReference)getMedication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Manufacturer() {
        return (EReference)getMedication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Product() {
        return (EReference)getMedication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Package() {
        return (EReference)getMedication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProduct() {
		if (medicationProductEClass == null) {
			medicationProductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(56);
		}
		return medicationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Form() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Ingredient() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Batch() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProductIngredient() {
		if (medicationProductIngredientEClass == null) {
			medicationProductIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(57);
		}
		return medicationProductIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductIngredient_Item() {
        return (EReference)getMedicationProductIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductIngredient_Amount() {
        return (EReference)getMedicationProductIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProductBatch() {
		if (medicationProductBatchEClass == null) {
			medicationProductBatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(58);
		}
		return medicationProductBatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductBatch_LotNumber() {
        return (EReference)getMedicationProductBatch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProductBatch_ExpirationDate() {
        return (EReference)getMedicationProductBatch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPackage() {
		if (medicationPackageEClass == null) {
			medicationPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(59);
		}
		return medicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Container() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Content() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPackageContent() {
		if (medicationPackageContentEClass == null) {
			medicationPackageContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(60);
		}
		return medicationPackageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackageContent_Item() {
        return (EReference)getMedicationPackageContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackageContent_Amount() {
        return (EReference)getMedicationPackageContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetric() {
		if (deviceMetricEClass == null) {
			deviceMetricEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(61);
		}
		return deviceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Type() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Identifier() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Unit() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Source() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Parent() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_OperationalStatus() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Color() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Category() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_MeasurementPeriod() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Calibration() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponent() {
		if (deviceComponentEClass == null) {
			deviceComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(62);
		}
		return deviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Type() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Identifier() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LastSystemChange() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Source() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Parent() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_OperationalStatus() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ParameterGroup() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_MeasurementPrinciple() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ProductionSpecification() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LanguageCode() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponentProductionSpecification() {
		if (deviceComponentProductionSpecificationEClass == null) {
			deviceComponentProductionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(63);
		}
		return deviceComponentProductionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_SpecType() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ComponentId() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ProductionSpec() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCalibration() {
		if (deviceMetricCalibrationEClass == null) {
			deviceMetricCalibrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(64);
		}
		return deviceMetricCalibrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Type() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_State() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Time() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponse() {
		if (questionnaireResponseEClass == null) {
			questionnaireResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(65);
		}
		return questionnaireResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Identifier() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Questionnaire() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Status() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Subject() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Author() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Authored() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Source() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Encounter() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponse_Group() {
        return (EReference)getQuestionnaireResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		if (questionnaireEClass == null) {
			questionnaireEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(66);
		}
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Identifier() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Version() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Status() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Date() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Publisher() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Telecom() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_SubjectType() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Group() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireGroup() {
		if (questionnaireGroupEClass == null) {
			questionnaireGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(67);
		}
		return questionnaireGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_LinkId() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Title() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Concept() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Text() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Required() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Repeats() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Group() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Question() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireGroupQuestion() {
		if (questionnaireGroupQuestionEClass == null) {
			questionnaireGroupQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(68);
		}
		return questionnaireGroupQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_LinkId() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Concept() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Text() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Type() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Required() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Repeats() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Options() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_PermittedAnswer() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroupQuestion_Group() {
        return (EReference)getQuestionnaireGroupQuestion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		if (valueSetEClass == null) {
			valueSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(69);
		}
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Url() {
        return (EReference)getValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Identifier() {
        return (EReference)getValueSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Version() {
        return (EReference)getValueSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Name() {
        return (EReference)getValueSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Status() {
        return (EReference)getValueSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Experimental() {
        return (EReference)getValueSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Publisher() {
        return (EReference)getValueSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Contact() {
        return (EReference)getValueSet().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Date() {
        return (EReference)getValueSet().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_LockedDate() {
        return (EReference)getValueSet().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Description() {
        return (EReference)getValueSet().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_UseContext() {
        return (EReference)getValueSet().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Immutable() {
        return (EReference)getValueSet().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Requirements() {
        return (EReference)getValueSet().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Copyright() {
        return (EReference)getValueSet().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Extensible() {
        return (EReference)getValueSet().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_CodeSystem() {
        return (EReference)getValueSet().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Compose() {
        return (EReference)getValueSet().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Expansion() {
        return (EReference)getValueSet().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetContact() {
		if (valueSetContactEClass == null) {
			valueSetContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(70);
		}
		return valueSetContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContact_Name() {
        return (EReference)getValueSetContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContact_Telecom() {
        return (EReference)getValueSetContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCodeSystem() {
		if (valueSetCodeSystemEClass == null) {
			valueSetCodeSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(71);
		}
		return valueSetCodeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystem_System() {
        return (EReference)getValueSetCodeSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystem_Version() {
        return (EReference)getValueSetCodeSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystem_CaseSensitive() {
        return (EReference)getValueSetCodeSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystem_Concept() {
        return (EReference)getValueSetCodeSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCodeSystemConceptDefinition() {
		if (valueSetCodeSystemConceptDefinitionEClass == null) {
			valueSetCodeSystemConceptDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(72);
		}
		return valueSetCodeSystemConceptDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Code() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Abstract() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Display() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Definition() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Designation() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinition_Concept() {
        return (EReference)getValueSetCodeSystemConceptDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCodeSystemConceptDefinitionDesignation() {
		if (valueSetCodeSystemConceptDefinitionDesignationEClass == null) {
			valueSetCodeSystemConceptDefinitionDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(73);
		}
		return valueSetCodeSystemConceptDefinitionDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinitionDesignation_Language() {
        return (EReference)getValueSetCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinitionDesignation_Use() {
        return (EReference)getValueSetCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCodeSystemConceptDefinitionDesignation_Value() {
        return (EReference)getValueSetCodeSystemConceptDefinitionDesignation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCompose() {
		if (valueSetComposeEClass == null) {
			valueSetComposeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(74);
		}
		return valueSetComposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Import() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Include() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Exclude() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSet() {
		if (valueSetComposeConceptSetEClass == null) {
			valueSetComposeConceptSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(75);
		}
		return valueSetComposeConceptSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_System() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Version() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Concept() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSet_Filter() {
        return (EReference)getValueSetComposeConceptSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSetConceptReference() {
		if (valueSetComposeConceptSetConceptReferenceEClass == null) {
			valueSetComposeConceptSetConceptReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(76);
		}
		return valueSetComposeConceptSetConceptReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Code() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Display() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetConceptReference_Designation() {
        return (EReference)getValueSetComposeConceptSetConceptReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetComposeConceptSetFilter() {
		if (valueSetComposeConceptSetFilterEClass == null) {
			valueSetComposeConceptSetFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(77);
		}
		return valueSetComposeConceptSetFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Property() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Op() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetComposeConceptSetFilter_Value() {
        return (EReference)getValueSetComposeConceptSetFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansion() {
		if (valueSetExpansionEClass == null) {
			valueSetExpansionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(78);
		}
		return valueSetExpansionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Identifier() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Timestamp() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Total() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Offset() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Parameter() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Contains() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansionParameter() {
		if (valueSetExpansionParameterEClass == null) {
			valueSetExpansionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(79);
		}
		return valueSetExpansionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionParameter_Name() {
        return (EReference)getValueSetExpansionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionParameter_Valuex() {
        return (EReference)getValueSetExpansionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansionContains() {
		if (valueSetExpansionContainsEClass == null) {
			valueSetExpansionContainsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(80);
		}
		return valueSetExpansionContainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_System() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Abstract() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Version() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Code() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Display() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansionContains_Contains() {
        return (EReference)getValueSetExpansionContains().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponseGroup() {
		if (questionnaireResponseGroupEClass == null) {
			questionnaireResponseGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(81);
		}
		return questionnaireResponseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_LinkId() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_Title() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_Text() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_Subject() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_Group() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroup_Question() {
        return (EReference)getQuestionnaireResponseGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponseGroupQuestion() {
		if (questionnaireResponseGroupQuestionEClass == null) {
			questionnaireResponseGroupQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(82);
		}
		return questionnaireResponseGroupQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroupQuestion_LinkId() {
        return (EReference)getQuestionnaireResponseGroupQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroupQuestion_Text() {
        return (EReference)getQuestionnaireResponseGroupQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroupQuestion_Answer() {
        return (EReference)getQuestionnaireResponseGroupQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireResponseGroupQuestionAnswer() {
		if (questionnaireResponseGroupQuestionAnswerEClass == null) {
			questionnaireResponseGroupQuestionAnswerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(83);
		}
		return questionnaireResponseGroupQuestionAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroupQuestionAnswer_Valuex() {
        return (EReference)getQuestionnaireResponseGroupQuestionAnswer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireResponseGroupQuestionAnswer_Group() {
        return (EReference)getQuestionnaireResponseGroupQuestionAnswer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistory() {
		if (familyMemberHistoryEClass == null) {
			familyMemberHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(84);
		}
		return familyMemberHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Identifier() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Patient() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Date() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Status() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Name() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Relationship() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Gender() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Bornx() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Agex() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Deceasedx() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Note() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Condition() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistoryCondition() {
		if (familyMemberHistoryConditionEClass == null) {
			familyMemberHistoryConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(85);
		}
		return familyMemberHistoryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Code() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Outcome() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Onsetx() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Note() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReport() {
		if (diagnosticReportEClass == null) {
			diagnosticReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(86);
		}
		return diagnosticReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Identifier() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Status() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Category() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Code() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Subject() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Encounter() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Effectivex() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Issued() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Performer() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Request() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Specimen() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Result() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_ImagingStudy() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Image() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Conclusion() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_CodedDiagnosis() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_PresentedForm() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReportImage() {
		if (diagnosticReportImageEClass == null) {
			diagnosticReportImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(87);
		}
		return diagnosticReportImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Comment() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Link() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		if (mediaEClass == null) {
			mediaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(88);
		}
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Type() {
        return (EReference)getMedia().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subtype() {
        return (EReference)getMedia().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Identifier() {
        return (EReference)getMedia().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subject() {
        return (EReference)getMedia().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Operator() {
        return (EReference)getMedia().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_View() {
        return (EReference)getMedia().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_DeviceName() {
        return (EReference)getMedia().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Height() {
        return (EReference)getMedia().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Width() {
        return (EReference)getMedia().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Frames() {
        return (EReference)getMedia().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Duration() {
        return (EReference)getMedia().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Content() {
        return (EReference)getMedia().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrder() {
		if (diagnosticOrderEClass == null) {
			diagnosticOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(89);
		}
		return diagnosticOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Subject() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Orderer() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Identifier() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Encounter() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Reason() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_SupportingInformation() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Specimen() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Status() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Priority() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Event() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Item() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Note() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderEvent() {
		if (diagnosticOrderEventEClass == null) {
			diagnosticOrderEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(90);
		}
		return diagnosticOrderEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Status() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Description() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_DateTime() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Actor() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderItem() {
		if (diagnosticOrderItemEClass == null) {
			diagnosticOrderItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(91);
		}
		return diagnosticOrderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Code() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Specimen() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_BodySite() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Status() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Event() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReference() {
		if (documentReferenceEClass == null) {
			documentReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(92);
		}
		return documentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_MasterIdentifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Identifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Subject() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Type() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Class() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Author() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Custodian() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Authenticator() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Created() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Indexed() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Status() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_DocStatus() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_RelatesTo() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Description() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_SecurityLabel() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Content() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Context() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceRelatesTo() {
		if (documentReferenceRelatesToEClass == null) {
			documentReferenceRelatesToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(93);
		}
		return documentReferenceRelatesToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Code() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Target() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContent() {
		if (documentReferenceContentEClass == null) {
			documentReferenceContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(94);
		}
		return documentReferenceContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContent_Attachment() {
        return (EReference)getDocumentReferenceContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContent_Format() {
        return (EReference)getDocumentReferenceContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContext() {
		if (documentReferenceContextEClass == null) {
			documentReferenceContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(95);
		}
		return documentReferenceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Encounter() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Event() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Period() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_FacilityType() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_PracticeSetting() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_SourcePatientInfo() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Related() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContextRelated() {
		if (documentReferenceContextRelatedEClass == null) {
			documentReferenceContextRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(96);
		}
		return documentReferenceContextRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContextRelated_Identifier() {
        return (EReference)getDocumentReferenceContextRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContextRelated_Ref() {
        return (EReference)getDocumentReferenceContextRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequest() {
		if (procedureRequestEClass == null) {
			procedureRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(97);
		}
		return procedureRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Identifier() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Subject() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Code() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_BodySite() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Reasonx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Scheduledx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Encounter() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Performer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Status() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Notes() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_AsNeededx() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_OrderedOn() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Orderer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Priority() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudy() {
		if (imagingStudyEClass == null) {
			imagingStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(98);
		}
		return imagingStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Started() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Patient() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Uid() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Accession() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Identifier() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Order() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_ModalityList() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Referrer() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Availability() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Url() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfSeries() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfInstances() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Procedure() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Interpreter() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Description() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Series() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(99);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Identifier() {
        return (EReference)getProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Subject() {
        return (EReference)getProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Status() {
        return (EReference)getProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Category() {
        return (EReference)getProcedure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Code() {
        return (EReference)getProcedure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_NotPerformed() {
        return (EReference)getProcedure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ReasonNotPerformed() {
        return (EReference)getProcedure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_BodySite() {
        return (EReference)getProcedure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Reasonx() {
        return (EReference)getProcedure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Performer() {
        return (EReference)getProcedure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Performedx() {
        return (EReference)getProcedure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Encounter() {
        return (EReference)getProcedure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Location() {
        return (EReference)getProcedure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Outcome() {
        return (EReference)getProcedure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Report() {
        return (EReference)getProcedure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Complication() {
        return (EReference)getProcedure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_FollowUp() {
        return (EReference)getProcedure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Request() {
        return (EReference)getProcedure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Notes() {
        return (EReference)getProcedure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_FocalDevice() {
        return (EReference)getProcedure().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Used() {
        return (EReference)getProcedure().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePerformer() {
		if (procedurePerformerEClass == null) {
			procedurePerformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(100);
		}
		return procedurePerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Actor() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Role() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureFocalDevice() {
		if (procedureFocalDeviceEClass == null) {
			procedureFocalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(101);
		}
		return procedureFocalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureFocalDevice_Action() {
        return (EReference)getProcedureFocalDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureFocalDevice_Manipulated() {
        return (EReference)getProcedureFocalDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeries() {
		if (imagingStudySeriesEClass == null) {
			imagingStudySeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(102);
		}
		return imagingStudySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Number() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Modality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Uid() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Description() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_NumberOfInstances() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Availability() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Url() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_BodySite() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Laterality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Started() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Instance() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeriesInstance() {
		if (imagingStudySeriesInstanceEClass == null) {
			imagingStudySeriesInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(103);
		}
		return imagingStudySeriesInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Number() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Uid() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_SopClass() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Type() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Title() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeriesInstance_Content() {
        return (EReference)getImagingStudySeriesInstance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlan() {
		if (carePlanEClass == null) {
			carePlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(104);
		}
		return carePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Identifier() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Subject() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Status() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Context() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Period() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Author() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Modified() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Category() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Description() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Addresses() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Support() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_RelatedPlan() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Participant() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Goal() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Activity() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Note() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanRelatedPlan() {
		if (carePlanRelatedPlanEClass == null) {
			carePlanRelatedPlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(105);
		}
		return carePlanRelatedPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanRelatedPlan_Code() {
        return (EReference)getCarePlanRelatedPlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanRelatedPlan_Plan() {
        return (EReference)getCarePlanRelatedPlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanParticipant() {
		if (carePlanParticipantEClass == null) {
			carePlanParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(106);
		}
		return carePlanParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanParticipant_Role() {
        return (EReference)getCarePlanParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanParticipant_Member() {
        return (EReference)getCarePlanParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		if (goalEClass == null) {
			goalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(107);
		}
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Identifier() {
        return (EReference)getGoal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Subject() {
        return (EReference)getGoal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Startx() {
        return (EReference)getGoal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Targetx() {
        return (EReference)getGoal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Category() {
        return (EReference)getGoal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Description() {
        return (EReference)getGoal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Status() {
        return (EReference)getGoal().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_StatusDate() {
        return (EReference)getGoal().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_StatusReason() {
        return (EReference)getGoal().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Author() {
        return (EReference)getGoal().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Priority() {
        return (EReference)getGoal().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Addresses() {
        return (EReference)getGoal().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Note() {
        return (EReference)getGoal().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Outcome() {
        return (EReference)getGoal().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalOutcome() {
		if (goalOutcomeEClass == null) {
			goalOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(108);
		}
		return goalOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOutcome_Resultx() {
        return (EReference)getGoalOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivity() {
		if (carePlanActivityEClass == null) {
			carePlanActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(109);
		}
		return carePlanActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_ActionResulting() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Progress() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Reference() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Detail() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivityDetail() {
		if (carePlanActivityDetailEClass == null) {
			carePlanActivityDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(110);
		}
		return carePlanActivityDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Category() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Code() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_ReasonCode() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_ReasonReference() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Goal() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Status() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_StatusReason() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Prohibited() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Scheduledx() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Location() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Performer() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Productx() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_DailyAmount() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Quantity() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivityDetail_Description() {
        return (EReference)getCarePlanActivityDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatement() {
		if (medicationStatementEClass == null) {
			medicationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(111);
		}
		return medicationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Identifier() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Patient() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_InformationSource() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_DateAsserted() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Status() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_WasNotTaken() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonNotTaken() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonForUsex() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Effectivex() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Note() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_SupportingInformation() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Medicationx() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Dosage() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatementDosage() {
		if (medicationStatementDosageEClass == null) {
			medicationStatementDosageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(112);
		}
		return medicationStatementDosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Text() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Timing() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_AsNeededx() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Sitex() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Route() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Method() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Quantityx() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Ratex() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_MaxDosePerPeriod() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySite() {
		if (bodySiteEClass == null) {
			bodySiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(113);
		}
		return bodySiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Patient() {
        return (EReference)getBodySite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Identifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Code() {
        return (EReference)getBodySite().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Modifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Description() {
        return (EReference)getBodySite().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Image() {
        return (EReference)getBodySite().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrder() {
		if (nutritionOrderEClass == null) {
			nutritionOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(114);
		}
		return nutritionOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Patient() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Orderer() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Identifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Encounter() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_DateTime() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Status() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_AllergyIntolerance() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_FoodPreferenceModifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_ExcludeFoodModifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_OralDiet() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Supplement() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_EnteralFormula() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderOralDiet() {
		if (nutritionOrderOralDietEClass == null) {
			nutritionOrderOralDietEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(115);
		}
		return nutritionOrderOralDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Type() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Schedule() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Nutrient() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Texture() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_FluidConsistencyType() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Instruction() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderOralDietNutrient() {
		if (nutritionOrderOralDietNutrientEClass == null) {
			nutritionOrderOralDietNutrientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(116);
		}
		return nutritionOrderOralDietNutrientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDietNutrient_Modifier() {
        return (EReference)getNutritionOrderOralDietNutrient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDietNutrient_Amount() {
        return (EReference)getNutritionOrderOralDietNutrient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderOralDietTexture() {
		if (nutritionOrderOralDietTextureEClass == null) {
			nutritionOrderOralDietTextureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(117);
		}
		return nutritionOrderOralDietTextureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDietTexture_Modifier() {
        return (EReference)getNutritionOrderOralDietTexture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDietTexture_FoodType() {
        return (EReference)getNutritionOrderOralDietTexture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderSupplement() {
		if (nutritionOrderSupplementEClass == null) {
			nutritionOrderSupplementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(118);
		}
		return nutritionOrderSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Type() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_ProductName() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Schedule() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Quantity() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Instruction() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderEnteralFormula() {
		if (nutritionOrderEnteralFormulaEClass == null) {
			nutritionOrderEnteralFormulaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(119);
		}
		return nutritionOrderEnteralFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_BaseFormulaType() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_BaseFormulaProductName() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdditiveType() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdditiveProductName() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_CaloricDensity() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_RouteofAdministration() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_Administration() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_MaxVolumeToDeliver() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdministrationInstruction() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderEnteralFormulaAdministration() {
		if (nutritionOrderEnteralFormulaAdministrationEClass == null) {
			nutritionOrderEnteralFormulaAdministrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(120);
		}
		return nutritionOrderEnteralFormulaAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormulaAdministration_Schedule() {
        return (EReference)getNutritionOrderEnteralFormulaAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormulaAdministration_Quantity() {
        return (EReference)getNutritionOrderEnteralFormulaAdministration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormulaAdministration_Ratex() {
        return (EReference)getNutritionOrderEnteralFormulaAdministration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessment() {
		if (riskAssessmentEClass == null) {
			riskAssessmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(121);
		}
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Subject() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Date() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Condition() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Encounter() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Performer() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Identifier() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Method() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Basis() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Prediction() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Mitigation() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessmentPrediction() {
		if (riskAssessmentPredictionEClass == null) {
			riskAssessmentPredictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(122);
		}
		return riskAssessmentPredictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Outcome() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Probabilityx() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_RelativeRisk() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Whenx() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Rationale() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequest() {
		if (communicationRequestEClass == null) {
			communicationRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(123);
		}
		return communicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Identifier() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Category() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Sender() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Recipient() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Payload() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Medium() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Requester() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Status() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Encounter() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Scheduledx() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Reason() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_RequestedOn() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Subject() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Priority() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequestPayload() {
		if (communicationRequestPayloadEClass == null) {
			communicationRequestPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(124);
		}
		return communicationRequestPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequestPayload_Contentx() {
        return (EReference)getCommunicationRequestPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseRequest() {
		if (deviceUseRequestEClass == null) {
			deviceUseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(125);
		}
		return deviceUseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_BodySitex() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Status() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Device() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Encounter() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Identifier() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Indication() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Notes() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_PrnReason() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_OrderedOn() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_RecordedOn() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Subject() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Timingx() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Priority() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrder() {
		if (medicationOrderEClass == null) {
			medicationOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(126);
		}
		return medicationOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Identifier() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_DateWritten() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Status() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_DateEnded() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_ReasonEnded() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Patient() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Prescriber() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Encounter() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Reasonx() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Note() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Medicationx() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_DosageInstruction() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_DispenseRequest() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_Substitution() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrder_PriorPrescription() {
        return (EReference)getMedicationOrder().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrderDosageInstruction() {
		if (medicationOrderDosageInstructionEClass == null) {
			medicationOrderDosageInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(127);
		}
		return medicationOrderDosageInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Text() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_AdditionalInstructions() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Timing() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_AsNeededx() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Sitex() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Route() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Method() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Dosex() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_Ratex() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDosageInstruction_MaxDosePerPeriod() {
        return (EReference)getMedicationOrderDosageInstruction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrderDispenseRequest() {
		if (medicationOrderDispenseRequestEClass == null) {
			medicationOrderDispenseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(128);
		}
		return medicationOrderDispenseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDispenseRequest_Medicationx() {
        return (EReference)getMedicationOrderDispenseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDispenseRequest_ValidityPeriod() {
        return (EReference)getMedicationOrderDispenseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDispenseRequest_NumberOfRepeatsAllowed() {
        return (EReference)getMedicationOrderDispenseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDispenseRequest_Quantity() {
        return (EReference)getMedicationOrderDispenseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderDispenseRequest_ExpectedSupplyDuration() {
        return (EReference)getMedicationOrderDispenseRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationOrderSubstitution() {
		if (medicationOrderSubstitutionEClass == null) {
			medicationOrderSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(129);
		}
		return medicationOrderSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderSubstitution_Type() {
        return (EReference)getMedicationOrderSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationOrderSubstitution_Reason() {
        return (EReference)getMedicationOrderSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		if (orderEClass == null) {
			orderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(130);
		}
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Identifier() {
        return (EReference)getOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Date() {
        return (EReference)getOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Subject() {
        return (EReference)getOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Source() {
        return (EReference)getOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Target() {
        return (EReference)getOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Reasonx() {
        return (EReference)getOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_When() {
        return (EReference)getOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Detail() {
        return (EReference)getOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderWhen() {
		if (orderWhenEClass == null) {
			orderWhenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(131);
		}
		return orderWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderWhen_Code() {
        return (EReference)getOrderWhen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderWhen_Schedule() {
        return (EReference)getOrderWhen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequest() {
		if (processRequestEClass == null) {
			processRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(132);
		}
		return processRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Action() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Identifier() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Ruleset() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_OriginalRuleset() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Created() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Target() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Provider() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Organization() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Request() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Response() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Nullify() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Reference() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Item() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Include() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Exclude() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Period() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequestItems() {
		if (processRequestItemsEClass == null) {
			processRequestItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(133);
		}
		return processRequestItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequestItems_SequenceLinkId() {
        return (EReference)getProcessRequestItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyRequest() {
		if (supplyRequestEClass == null) {
			supplyRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(134);
		}
		return supplyRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Patient() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Source() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Date() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Identifier() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Status() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Kind() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_OrderedItem() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Supplier() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_Reasonx() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequest_When() {
        return (EReference)getSupplyRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyRequestWhen() {
		if (supplyRequestWhenEClass == null) {
			supplyRequestWhenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(135);
		}
		return supplyRequestWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequestWhen_Code() {
        return (EReference)getSupplyRequestWhen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyRequestWhen_Schedule() {
        return (EReference)getSupplyRequestWhen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescription() {
		if (visionPrescriptionEClass == null) {
			visionPrescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(136);
		}
		return visionPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Identifier() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_DateWritten() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Patient() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Prescriber() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Encounter() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Reasonx() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Dispense() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescriptionDispense() {
		if (visionPrescriptionDispenseEClass == null) {
			visionPrescriptionDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(137);
		}
		return visionPrescriptionDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Product() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Eye() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Sphere() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Cylinder() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Axis() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Prism() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Base() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Add() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Power() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_BackCurve() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Diameter() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Duration() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Color() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Brand() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Notes() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelection() {
		if (imagingObjectSelectionEClass == null) {
			imagingObjectSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(138);
		}
		return imagingObjectSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Uid() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Patient() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Title() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Description() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Author() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_AuthoringTime() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Study() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionStudy() {
		if (imagingObjectSelectionStudyEClass == null) {
			imagingObjectSelectionStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(139);
		}
		return imagingObjectSelectionStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Uid() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Url() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_ImagingStudy() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Series() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionStudySeries() {
		if (imagingObjectSelectionStudySeriesEClass == null) {
			imagingObjectSelectionStudySeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(140);
		}
		return imagingObjectSelectionStudySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeries_Uid() {
        return (EReference)getImagingObjectSelectionStudySeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeries_Url() {
        return (EReference)getImagingObjectSelectionStudySeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeries_Instance() {
        return (EReference)getImagingObjectSelectionStudySeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionStudySeriesInstance() {
		if (imagingObjectSelectionStudySeriesInstanceEClass == null) {
			imagingObjectSelectionStudySeriesInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(141);
		}
		return imagingObjectSelectionStudySeriesInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstance_SopClass() {
        return (EReference)getImagingObjectSelectionStudySeriesInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstance_Uid() {
        return (EReference)getImagingObjectSelectionStudySeriesInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstance_Url() {
        return (EReference)getImagingObjectSelectionStudySeriesInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstance_Frames() {
        return (EReference)getImagingObjectSelectionStudySeriesInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionStudySeriesInstanceFrames() {
		if (imagingObjectSelectionStudySeriesInstanceFramesEClass == null) {
			imagingObjectSelectionStudySeriesInstanceFramesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(142);
		}
		return imagingObjectSelectionStudySeriesInstanceFramesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstanceFrames_FrameNumbers() {
        return (EReference)getImagingObjectSelectionStudySeriesInstanceFrames().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudySeriesInstanceFrames_Url() {
        return (EReference)getImagingObjectSelectionStudySeriesInstanceFrames().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifest() {
		if (documentManifestEClass == null) {
			documentManifestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(143);
		}
		return documentManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_MasterIdentifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Identifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Subject() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Recipient() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Type() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Author() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Created() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Source() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Status() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Description() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Content() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Related() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestContent() {
		if (documentManifestContentEClass == null) {
			documentManifestContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(144);
		}
		return documentManifestContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestContent_Px() {
        return (EReference)getDocumentManifestContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestRelated() {
		if (documentManifestRelatedEClass == null) {
			documentManifestRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(145);
		}
		return documentManifestRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Identifier() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Ref() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentRequest() {
		if (enrollmentRequestEClass == null) {
			enrollmentRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(146);
		}
		return enrollmentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Identifier() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Ruleset() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_OriginalRuleset() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Created() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Target() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Provider() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Organization() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Subject() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Coverage() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Relationship() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		if (coverageEClass == null) {
			coverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(147);
		}
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Issuer() {
        return (EReference)getCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Bin() {
        return (EReference)getCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Period() {
        return (EReference)getCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Type() {
        return (EReference)getCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_SubscriberId() {
        return (EReference)getCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Identifier() {
        return (EReference)getCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Group() {
        return (EReference)getCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Plan() {
        return (EReference)getCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_SubPlan() {
        return (EReference)getCoverage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Dependent() {
        return (EReference)getCoverage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Sequence() {
        return (EReference)getCoverage().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Subscriber() {
        return (EReference)getCoverage().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Network() {
        return (EReference)getCoverage().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Contract() {
        return (EReference)getCoverage().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		if (contractEClass == null) {
			contractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(148);
		}
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Identifier() {
        return (EReference)getContract().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Issued() {
        return (EReference)getContract().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Applies() {
        return (EReference)getContract().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Subject() {
        return (EReference)getContract().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Authority() {
        return (EReference)getContract().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Domain() {
        return (EReference)getContract().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Type() {
        return (EReference)getContract().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_SubType() {
        return (EReference)getContract().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Action() {
        return (EReference)getContract().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ActionReason() {
        return (EReference)getContract().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Actor() {
        return (EReference)getContract().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ValuedItem() {
        return (EReference)getContract().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Signer() {
        return (EReference)getContract().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Term() {
        return (EReference)getContract().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Bindingx() {
        return (EReference)getContract().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Friendly() {
        return (EReference)getContract().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Legal() {
        return (EReference)getContract().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Rule() {
        return (EReference)getContract().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractActor() {
		if (contractActorEClass == null) {
			contractActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(149);
		}
		return contractActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor_Entity() {
        return (EReference)getContractActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor_Role() {
        return (EReference)getContractActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractValuedItem() {
		if (contractValuedItemEClass == null) {
			contractValuedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(150);
		}
		return contractValuedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Entityx() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Identifier() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_EffectiveTime() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Quantity() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_UnitPrice() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Factor() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Points() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Net() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractSignatory() {
		if (contractSignatoryEClass == null) {
			contractSignatoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(151);
		}
		return contractSignatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Type() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Party() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSignatory_Signature() {
        return (EReference)getContractSignatory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTerm() {
		if (contractTermEClass == null) {
			contractTermEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(152);
		}
		return contractTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Identifier() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Issued() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Applies() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Type() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_SubType() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Subject() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Action() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ActionReason() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Actor() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Text() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ValuedItem() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Group() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTermTermActor() {
		if (contractTermTermActorEClass == null) {
			contractTermTermActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(153);
		}
		return contractTermTermActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermActor_Entity() {
        return (EReference)getContractTermTermActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermActor_Role() {
        return (EReference)getContractTermTermActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTermTermValuedItem() {
		if (contractTermTermValuedItemEClass == null) {
			contractTermTermValuedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(154);
		}
		return contractTermTermValuedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Entityx() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Identifier() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_EffectiveTime() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Quantity() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_UnitPrice() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Factor() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Points() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTermTermValuedItem_Net() {
        return (EReference)getContractTermTermValuedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractFriendlyLanguage() {
		if (contractFriendlyLanguageEClass == null) {
			contractFriendlyLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(155);
		}
		return contractFriendlyLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFriendlyLanguage_Contentx() {
        return (EReference)getContractFriendlyLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractLegalLanguage() {
		if (contractLegalLanguageEClass == null) {
			contractLegalLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(156);
		}
		return contractLegalLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractLegalLanguage_Contentx() {
        return (EReference)getContractLegalLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractComputableLanguage() {
		if (contractComputableLanguageEClass == null) {
			contractComputableLanguageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(157);
		}
		return contractComputableLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractComputableLanguage_Contentx() {
        return (EReference)getContractComputableLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		if (compositionEClass == null) {
			compositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(158);
		}
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Identifier() {
        return (EReference)getComposition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Date() {
        return (EReference)getComposition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Type() {
        return (EReference)getComposition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Class() {
        return (EReference)getComposition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Title() {
        return (EReference)getComposition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Status() {
        return (EReference)getComposition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Confidentiality() {
        return (EReference)getComposition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Subject() {
        return (EReference)getComposition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Author() {
        return (EReference)getComposition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Attester() {
        return (EReference)getComposition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Custodian() {
        return (EReference)getComposition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Event() {
        return (EReference)getComposition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Encounter() {
        return (EReference)getComposition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Section() {
        return (EReference)getComposition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionAttester() {
		if (compositionAttesterEClass == null) {
			compositionAttesterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(159);
		}
		return compositionAttesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Mode() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Time() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Party() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionEvent() {
		if (compositionEventEClass == null) {
			compositionEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(160);
		}
		return compositionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Code() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Period() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Detail() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionSection() {
		if (compositionSectionEClass == null) {
			compositionSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(161);
		}
		return compositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Title() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Code() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Text() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Mode() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_OrderedBy() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Entry() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_EmptyReason() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Section() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		if (subscriptionEClass == null) {
			subscriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(162);
		}
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Criteria() {
        return (EReference)getSubscription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Contact() {
        return (EReference)getSubscription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Reason() {
        return (EReference)getSubscription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Status() {
        return (EReference)getSubscription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Error() {
        return (EReference)getSubscription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Channel() {
        return (EReference)getSubscription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_End() {
        return (EReference)getSubscription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Tag() {
        return (EReference)getSubscription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionChannel() {
		if (subscriptionChannelEClass == null) {
			subscriptionChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(163);
		}
		return subscriptionChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Type() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Endpoint() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Payload() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Header() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		if (parametersEClass == null) {
			parametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(164);
		}
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameters_Parameter() {
        return (EReference)getParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersParameter() {
		if (parametersParameterEClass == null) {
			parametersParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(165);
		}
		return parametersParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Name() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Valuex() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Resource() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Part() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformance() {
		if (conformanceEClass == null) {
			conformanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(166);
		}
		return conformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Url() {
        return (EReference)getConformance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Version() {
        return (EReference)getConformance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Name() {
        return (EReference)getConformance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Status() {
        return (EReference)getConformance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Experimental() {
        return (EReference)getConformance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Publisher() {
        return (EReference)getConformance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Contact() {
        return (EReference)getConformance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Date() {
        return (EReference)getConformance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Description() {
        return (EReference)getConformance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Requirements() {
        return (EReference)getConformance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Copyright() {
        return (EReference)getConformance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Kind() {
        return (EReference)getConformance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Software() {
        return (EReference)getConformance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Implementation() {
        return (EReference)getConformance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_FhirVersion() {
        return (EReference)getConformance().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_AcceptUnknown() {
        return (EReference)getConformance().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Format() {
        return (EReference)getConformance().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Profile() {
        return (EReference)getConformance().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Rest() {
        return (EReference)getConformance().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Messaging() {
        return (EReference)getConformance().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Document() {
        return (EReference)getConformance().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceContact() {
		if (conformanceContactEClass == null) {
			conformanceContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(167);
		}
		return conformanceContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceContact_Name() {
        return (EReference)getConformanceContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceContact_Telecom() {
        return (EReference)getConformanceContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceSoftware() {
		if (conformanceSoftwareEClass == null) {
			conformanceSoftwareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(168);
		}
		return conformanceSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_Name() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_Version() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_ReleaseDate() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceImplementation() {
		if (conformanceImplementationEClass == null) {
			conformanceImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(169);
		}
		return conformanceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceImplementation_Description() {
        return (EReference)getConformanceImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceImplementation_Url() {
        return (EReference)getConformanceImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinition() {
		if (structureDefinitionEClass == null) {
			structureDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(170);
		}
		return structureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Url() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Identifier() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Version() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Name() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Display() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Status() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Experimental() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Publisher() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Contact() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Date() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Description() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_UseContext() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Requirements() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Copyright() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Code() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_FhirVersion() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Mapping() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Kind() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_ConstrainedType() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Abstract() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_ContextType() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Context() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Base() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Snapshot() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Differential() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionContact() {
		if (structureDefinitionContactEClass == null) {
			structureDefinitionContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(171);
		}
		return structureDefinitionContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionContact_Name() {
        return (EReference)getStructureDefinitionContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionContact_Telecom() {
        return (EReference)getStructureDefinitionContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionMapping() {
		if (structureDefinitionMappingEClass == null) {
			structureDefinitionMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(172);
		}
		return structureDefinitionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Identity() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Uri() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Name() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Comments() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionSnapshot() {
		if (structureDefinitionSnapshotEClass == null) {
			structureDefinitionSnapshotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(173);
		}
		return structureDefinitionSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionSnapshot_Element() {
        return (EReference)getStructureDefinitionSnapshot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionDifferential() {
		if (structureDefinitionDifferentialEClass == null) {
			structureDefinitionDifferentialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(174);
		}
		return structureDefinitionDifferentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionDifferential_Element() {
        return (EReference)getStructureDefinitionDifferential().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRest() {
		if (conformanceRestEClass == null) {
			conformanceRestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(175);
		}
		return conformanceRestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Mode() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Documentation() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Security() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Resource() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Interaction() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_TransactionMode() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_SearchParam() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Operation() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Compartment() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestSecurity() {
		if (conformanceRestSecurityEClass == null) {
			conformanceRestSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(176);
		}
		return conformanceRestSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurity_Cors() {
        return (EReference)getConformanceRestSecurity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurity_Service() {
        return (EReference)getConformanceRestSecurity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurity_Description() {
        return (EReference)getConformanceRestSecurity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurity_Certificate() {
        return (EReference)getConformanceRestSecurity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestSecurityCertificate() {
		if (conformanceRestSecurityCertificateEClass == null) {
			conformanceRestSecurityCertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(177);
		}
		return conformanceRestSecurityCertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurityCertificate_Type() {
        return (EReference)getConformanceRestSecurityCertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSecurityCertificate_Blob() {
        return (EReference)getConformanceRestSecurityCertificate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestResource() {
		if (conformanceRestResourceEClass == null) {
			conformanceRestResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(178);
		}
		return conformanceRestResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_Type() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_Profile() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_Interaction() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_Versioning() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_ReadHistory() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_UpdateCreate() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_ConditionalCreate() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_ConditionalUpdate() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_ConditionalDelete() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_SearchInclude() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_SearchRevInclude() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResource_SearchParam() {
        return (EReference)getConformanceRestResource().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestResourceResourceInteraction() {
		if (conformanceRestResourceResourceInteractionEClass == null) {
			conformanceRestResourceResourceInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(179);
		}
		return conformanceRestResourceResourceInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceResourceInteraction_Code() {
        return (EReference)getConformanceRestResourceResourceInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceResourceInteraction_Documentation() {
        return (EReference)getConformanceRestResourceResourceInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestResourceSearchParam() {
		if (conformanceRestResourceSearchParamEClass == null) {
			conformanceRestResourceSearchParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(180);
		}
		return conformanceRestResourceSearchParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Name() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Definition() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Type() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Documentation() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Target() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Modifier() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestResourceSearchParam_Chain() {
        return (EReference)getConformanceRestResourceSearchParam().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestSystemInteraction() {
		if (conformanceRestSystemInteractionEClass == null) {
			conformanceRestSystemInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(181);
		}
		return conformanceRestSystemInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSystemInteraction_Code() {
        return (EReference)getConformanceRestSystemInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestSystemInteraction_Documentation() {
        return (EReference)getConformanceRestSystemInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRestOperation() {
		if (conformanceRestOperationEClass == null) {
			conformanceRestOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(182);
		}
		return conformanceRestOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestOperation_Name() {
        return (EReference)getConformanceRestOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRestOperation_Definition() {
        return (EReference)getConformanceRestOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinition() {
		if (operationDefinitionEClass == null) {
			operationDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(183);
		}
		return operationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Url() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Version() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Name() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Status() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Kind() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Experimental() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Publisher() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Contact() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Date() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Description() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Requirements() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Idempotent() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Code() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Notes() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Base() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_System() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Type() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Instance() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Parameter() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionContact() {
		if (operationDefinitionContactEClass == null) {
			operationDefinitionContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(184);
		}
		return operationDefinitionContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionContact_Name() {
        return (EReference)getOperationDefinitionContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionContact_Telecom() {
        return (EReference)getOperationDefinitionContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionParameter() {
		if (operationDefinitionParameterEClass == null) {
			operationDefinitionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(185);
		}
		return operationDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Name() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Use() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Min() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Max() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Documentation() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Type() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Profile() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Binding() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Part() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionParameterBinding() {
		if (operationDefinitionParameterBindingEClass == null) {
			operationDefinitionParameterBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(186);
		}
		return operationDefinitionParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameterBinding_Strength() {
        return (EReference)getOperationDefinitionParameterBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameterBinding_ValueSetx() {
        return (EReference)getOperationDefinitionParameterBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceMessaging() {
		if (conformanceMessagingEClass == null) {
			conformanceMessagingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(187);
		}
		return conformanceMessagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Endpoint() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_ReliableCache() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Documentation() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Event() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceMessagingEndpoint() {
		if (conformanceMessagingEndpointEClass == null) {
			conformanceMessagingEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(188);
		}
		return conformanceMessagingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEndpoint_Protocol() {
        return (EReference)getConformanceMessagingEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEndpoint_Address() {
        return (EReference)getConformanceMessagingEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceMessagingEvent() {
		if (conformanceMessagingEventEClass == null) {
			conformanceMessagingEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(189);
		}
		return conformanceMessagingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Code() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Category() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Mode() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Focus() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Request() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Response() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessagingEvent_Documentation() {
        return (EReference)getConformanceMessagingEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceDocument() {
		if (conformanceDocumentEClass == null) {
			conformanceDocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(190);
		}
		return conformanceDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Mode() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Documentation() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Profile() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		if (personEClass == null) {
			personEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(191);
		}
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Identifier() {
        return (EReference)getPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name() {
        return (EReference)getPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Telecom() {
        return (EReference)getPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Gender() {
        return (EReference)getPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_BirthDate() {
        return (EReference)getPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Address() {
        return (EReference)getPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Photo() {
        return (EReference)getPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_ManagingOrganization() {
        return (EReference)getPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Active() {
        return (EReference)getPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Link() {
        return (EReference)getPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonLink() {
		if (personLinkEClass == null) {
			personLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(192);
		}
		return personLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Target() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Assurance() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentNotice() {
		if (paymentNoticeEClass == null) {
			paymentNoticeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(193);
		}
		return paymentNoticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Identifier() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Ruleset() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_OriginalRuleset() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Created() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Target() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Provider() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Organization() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Request() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Response() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_PaymentStatus() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuide() {
		if (implementationGuideEClass == null) {
			implementationGuideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(194);
		}
		return implementationGuideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Url() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Version() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Name() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Status() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Experimental() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Publisher() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Contact() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Date() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Description() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_UseContext() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Copyright() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_FhirVersion() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Dependency() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Package() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Global() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Binary() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuide_Page() {
        return (EReference)getImplementationGuide().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuideContact() {
		if (implementationGuideContactEClass == null) {
			implementationGuideContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(195);
		}
		return implementationGuideContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideContact_Name() {
        return (EReference)getImplementationGuideContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideContact_Telecom() {
        return (EReference)getImplementationGuideContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuideDependency() {
		if (implementationGuideDependencyEClass == null) {
			implementationGuideDependencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(196);
		}
		return implementationGuideDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideDependency_Type() {
        return (EReference)getImplementationGuideDependency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideDependency_Uri() {
        return (EReference)getImplementationGuideDependency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePackage() {
		if (implementationGuidePackageEClass == null) {
			implementationGuidePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(197);
		}
		return implementationGuidePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Name() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Description() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackage_Resource() {
        return (EReference)getImplementationGuidePackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePackageResource() {
		if (implementationGuidePackageResourceEClass == null) {
			implementationGuidePackageResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(198);
		}
		return implementationGuidePackageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Purpose() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Name() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Description() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Acronym() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_Sourcex() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePackageResource_ExampleFor() {
        return (EReference)getImplementationGuidePackageResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuideGlobal() {
		if (implementationGuideGlobalEClass == null) {
			implementationGuideGlobalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(199);
		}
		return implementationGuideGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideGlobal_Type() {
        return (EReference)getImplementationGuideGlobal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuideGlobal_Profile() {
        return (EReference)getImplementationGuideGlobal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationGuidePage() {
		if (implementationGuidePageEClass == null) {
			implementationGuidePageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(200);
		}
		return implementationGuidePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Source() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Name() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Kind() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Type() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Package() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Format() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationGuidePage_Page() {
        return (EReference)getImplementationGuidePage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameter() {
		if (searchParameterEClass == null) {
			searchParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(201);
		}
		return searchParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Url() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Name() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Status() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Experimental() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Publisher() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Contact() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Date() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Requirements() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Code() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Base() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Type() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Description() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Xpath() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_XpathUsage() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Target() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameterContact() {
		if (searchParameterContactEClass == null) {
			searchParameterContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(202);
		}
		return searchParameterContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterContact_Name() {
        return (EReference)getSearchParameterContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterContact_Telecom() {
        return (EReference)getSearchParameterContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		if (communicationEClass == null) {
			communicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(203);
		}
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Identifier() {
        return (EReference)getCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Category() {
        return (EReference)getCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sender() {
        return (EReference)getCommunication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Recipient() {
        return (EReference)getCommunication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Payload() {
        return (EReference)getCommunication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Medium() {
        return (EReference)getCommunication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Status() {
        return (EReference)getCommunication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Encounter() {
        return (EReference)getCommunication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sent() {
        return (EReference)getCommunication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Received() {
        return (EReference)getCommunication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Reason() {
        return (EReference)getCommunication().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Subject() {
        return (EReference)getCommunication().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_RequestDetail() {
        return (EReference)getCommunication().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPayload() {
		if (communicationPayloadEClass == null) {
			communicationPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(204);
		}
		return communicationPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPayload_Contentx() {
        return (EReference)getCommunicationPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderResponse() {
		if (orderResponseEClass == null) {
			orderResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(205);
		}
		return orderResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Identifier() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Request() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Date() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Who() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_OrderStatus() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Description() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Fulfillment() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseStatement() {
		if (deviceUseStatementEClass == null) {
			deviceUseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(206);
		}
		return deviceUseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_BodySitex() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_WhenUsed() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Device() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Identifier() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Indication() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Notes() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_RecordedOn() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Subject() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Timingx() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeader() {
		if (messageHeaderEClass == null) {
			messageHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(207);
		}
		return messageHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Timestamp() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Event() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Response() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Source() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Destination() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Enterer() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Author() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Receiver() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Responsible() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Reason() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Data() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderResponse() {
		if (messageHeaderResponseEClass == null) {
			messageHeaderResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(208);
		}
		return messageHeaderResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Identifier() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Code() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Details() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcome() {
		if (operationOutcomeEClass == null) {
			operationOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(209);
		}
		return operationOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcome_Issue() {
        return (EReference)getOperationOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcomeIssue() {
		if (operationOutcomeIssueEClass == null) {
			operationOutcomeIssueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(210);
		}
		return operationOutcomeIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Severity() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Code() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Details() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Diagnostics() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Location() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderMessageSource() {
		if (messageHeaderMessageSourceEClass == null) {
			messageHeaderMessageSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(211);
		}
		return messageHeaderMessageSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Name() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Software() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Version() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Contact() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageSource_Endpoint() {
        return (EReference)getMessageHeaderMessageSource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderMessageDestination() {
		if (messageHeaderMessageDestinationEClass == null) {
			messageHeaderMessageDestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(212);
		}
		return messageHeaderMessageDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Name() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Target() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderMessageDestination_Endpoint() {
        return (EReference)getMessageHeaderMessageDestination().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendation() {
		if (immunizationRecommendationEClass == null) {
			immunizationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(213);
		}
		return immunizationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Identifier() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Patient() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Recommendation() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendation() {
		if (immunizationRecommendationRecommendationEClass == null) {
			immunizationRecommendationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(214);
		}
		return immunizationRecommendationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Date() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_VaccineCode() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DoseNumber() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_ForecastStatus() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DateCriterion() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Protocol() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingImmunization() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingPatientInformation() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendationDateCriterion() {
		if (immunizationRecommendationRecommendationDateCriterionEClass == null) {
			immunizationRecommendationRecommendationDateCriterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(215);
		}
		return immunizationRecommendationRecommendationDateCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationDateCriterion_Code() {
        return (EReference)getImmunizationRecommendationRecommendationDateCriterion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationDateCriterion_Value() {
        return (EReference)getImmunizationRecommendationRecommendationDateCriterion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendationProtocol() {
		if (immunizationRecommendationRecommendationProtocolEClass == null) {
			immunizationRecommendationRecommendationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(216);
		}
		return immunizationRecommendationRecommendationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_DoseSequence() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Description() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Authority() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendationProtocol_Series() {
        return (EReference)getImmunizationRecommendationRecommendationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(217);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Identifier() {
        return (EReference)getImmunization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Status() {
        return (EReference)getImmunization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Date() {
        return (EReference)getImmunization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccineCode() {
        return (EReference)getImmunization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Patient() {
        return (EReference)getImmunization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_WasNotGiven() {
        return (EReference)getImmunization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Reported() {
        return (EReference)getImmunization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Performer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Requester() {
        return (EReference)getImmunization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Encounter() {
        return (EReference)getImmunization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Manufacturer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Location() {
        return (EReference)getImmunization().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_LotNumber() {
        return (EReference)getImmunization().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_ExpirationDate() {
        return (EReference)getImmunization().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Site() {
        return (EReference)getImmunization().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Route() {
        return (EReference)getImmunization().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_DoseQuantity() {
        return (EReference)getImmunization().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Note() {
        return (EReference)getImmunization().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Explanation() {
        return (EReference)getImmunization().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Reaction() {
        return (EReference)getImmunization().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccinationProtocol() {
        return (EReference)getImmunization().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationExplanation() {
		if (immunizationExplanationEClass == null) {
			immunizationExplanationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(218);
		}
		return immunizationExplanationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_Reason() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_ReasonNotGiven() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationReaction() {
		if (immunizationReactionEClass == null) {
			immunizationReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(219);
		}
		return immunizationReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Date() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Detail() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Reported() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationVaccinationProtocol() {
		if (immunizationVaccinationProtocolEClass == null) {
			immunizationVaccinationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(220);
		}
		return immunizationVaccinationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseSequence() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Description() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Authority() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Series() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_SeriesDoses() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_TargetDisease() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatus() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatusReason() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenance() {
		if (provenanceEClass == null) {
			provenanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(221);
		}
		return provenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Target() {
        return (EReference)getProvenance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Period() {
        return (EReference)getProvenance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Recorded() {
        return (EReference)getProvenance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Reason() {
        return (EReference)getProvenance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Activity() {
        return (EReference)getProvenance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Location() {
        return (EReference)getProvenance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Policy() {
        return (EReference)getProvenance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Agent() {
        return (EReference)getProvenance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Entity() {
        return (EReference)getProvenance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Signature() {
        return (EReference)getProvenance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceAgent() {
		if (provenanceAgentEClass == null) {
			provenanceAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(222);
		}
		return provenanceAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Role() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Actor() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_UserId() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_RelatedAgent() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceAgentRelatedAgent() {
		if (provenanceAgentRelatedAgentEClass == null) {
			provenanceAgentRelatedAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(223);
		}
		return provenanceAgentRelatedAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgentRelatedAgent_Type() {
        return (EReference)getProvenanceAgentRelatedAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgentRelatedAgent_Target() {
        return (EReference)getProvenanceAgentRelatedAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceEntity() {
		if (provenanceEntityEClass == null) {
			provenanceEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(224);
		}
		return provenanceEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Role() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Type() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Reference() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Display() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Agent() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefit() {
		if (explanationOfBenefitEClass == null) {
			explanationOfBenefitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(225);
		}
		return explanationOfBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Identifier() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Request() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Outcome() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Disposition() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Ruleset() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_OriginalRuleset() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Created() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Organization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_RequestProvider() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_RequestOrganization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		if (claimEClass == null) {
			claimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(226);
		}
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Type() {
        return (EReference)getClaim().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Identifier() {
        return (EReference)getClaim().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Ruleset() {
        return (EReference)getClaim().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_OriginalRuleset() {
        return (EReference)getClaim().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Created() {
        return (EReference)getClaim().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Target() {
        return (EReference)getClaim().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Provider() {
        return (EReference)getClaim().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Organization() {
        return (EReference)getClaim().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Use() {
        return (EReference)getClaim().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Priority() {
        return (EReference)getClaim().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_FundsReserve() {
        return (EReference)getClaim().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Enterer() {
        return (EReference)getClaim().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Facility() {
        return (EReference)getClaim().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Prescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_OriginalPrescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Payee() {
        return (EReference)getClaim().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Referral() {
        return (EReference)getClaim().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Diagnosis() {
        return (EReference)getClaim().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Condition() {
        return (EReference)getClaim().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Patient() {
        return (EReference)getClaim().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Coverage() {
        return (EReference)getClaim().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Exception() {
        return (EReference)getClaim().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_School() {
        return (EReference)getClaim().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Accident() {
        return (EReference)getClaim().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_AccidentType() {
        return (EReference)getClaim().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_InterventionException() {
        return (EReference)getClaim().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Item() {
        return (EReference)getClaim().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_AdditionalMaterials() {
        return (EReference)getClaim().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_MissingTeeth() {
        return (EReference)getClaim().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimPayee() {
		if (claimPayeeEClass == null) {
			claimPayeeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(227);
		}
		return claimPayeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Type() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Provider() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Organization() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Person() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimDiagnosis() {
		if (claimDiagnosisEClass == null) {
			claimDiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(228);
		}
		return claimDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Sequence() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Diagnosis() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimCoverage() {
		if (claimCoverageEClass == null) {
			claimCoverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(229);
		}
		return claimCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Sequence() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Focal() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Coverage() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_BusinessArrangement() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Relationship() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_PreAuthRef() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_ClaimResponse() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_OriginalRuleset() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponse() {
		if (claimResponseEClass == null) {
			claimResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(230);
		}
		return claimResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Identifier() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Request() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Ruleset() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_OriginalRuleset() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Created() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Organization() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestProvider() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestOrganization() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Outcome() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Disposition() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PayeeType() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Item() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_AddItem() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Error() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalCost() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_UnallocDeductable() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalBenefit() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAdjustment() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAdjustmentReason() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentDate() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAmount() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentRef() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Reserved() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Form() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Note() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Coverage() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItems() {
		if (claimResponseItemsEClass == null) {
			claimResponseItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(231);
		}
		return claimResponseItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItems_SequenceLinkId() {
        return (EReference)getClaimResponseItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItems_NoteNumber() {
        return (EReference)getClaimResponseItems().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItems_Adjudication() {
        return (EReference)getClaimResponseItems().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItems_Detail() {
        return (EReference)getClaimResponseItems().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemsItemAdjudication() {
		if (claimResponseItemsItemAdjudicationEClass == null) {
			claimResponseItemsItemAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(232);
		}
		return claimResponseItemsItemAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemAdjudication_Code() {
        return (EReference)getClaimResponseItemsItemAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemAdjudication_Amount() {
        return (EReference)getClaimResponseItemsItemAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemAdjudication_Value() {
        return (EReference)getClaimResponseItemsItemAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemsItemDetail() {
		if (claimResponseItemsItemDetailEClass == null) {
			claimResponseItemsItemDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(233);
		}
		return claimResponseItemsItemDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetail_SequenceLinkId() {
        return (EReference)getClaimResponseItemsItemDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetail_Adjudication() {
        return (EReference)getClaimResponseItemsItemDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetail_SubDetail() {
        return (EReference)getClaimResponseItemsItemDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemsItemDetailDetailAdjudication() {
		if (claimResponseItemsItemDetailDetailAdjudicationEClass == null) {
			claimResponseItemsItemDetailDetailAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(234);
		}
		return claimResponseItemsItemDetailDetailAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailDetailAdjudication_Code() {
        return (EReference)getClaimResponseItemsItemDetailDetailAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailDetailAdjudication_Amount() {
        return (EReference)getClaimResponseItemsItemDetailDetailAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailDetailAdjudication_Value() {
        return (EReference)getClaimResponseItemsItemDetailDetailAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemsItemDetailSubDetail() {
		if (claimResponseItemsItemDetailSubDetailEClass == null) {
			claimResponseItemsItemDetailSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(235);
		}
		return claimResponseItemsItemDetailSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailSubDetail_SequenceLinkId() {
        return (EReference)getClaimResponseItemsItemDetailSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailSubDetail_Adjudication() {
        return (EReference)getClaimResponseItemsItemDetailSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication() {
		if (claimResponseItemsItemDetailSubDetailSubdetailAdjudicationEClass == null) {
			claimResponseItemsItemDetailSubDetailSubdetailAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(236);
		}
		return claimResponseItemsItemDetailSubDetailSubdetailAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication_Code() {
        return (EReference)getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication_Amount() {
        return (EReference)getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication_Value() {
        return (EReference)getClaimResponseItemsItemDetailSubDetailSubdetailAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItem() {
		if (claimResponseAddedItemEClass == null) {
			claimResponseAddedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(237);
		}
		return claimResponseAddedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_SequenceLinkId() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Service() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Fee() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_NoteNumberLinkId() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Adjudication() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItem_Detail() {
        return (EReference)getClaimResponseAddedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItemAddedItemAdjudication() {
		if (claimResponseAddedItemAddedItemAdjudicationEClass == null) {
			claimResponseAddedItemAddedItemAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(238);
		}
		return claimResponseAddedItemAddedItemAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemAdjudication_Code() {
        return (EReference)getClaimResponseAddedItemAddedItemAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemAdjudication_Amount() {
        return (EReference)getClaimResponseAddedItemAddedItemAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemAdjudication_Value() {
        return (EReference)getClaimResponseAddedItemAddedItemAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItemAddedItemsDetail() {
		if (claimResponseAddedItemAddedItemsDetailEClass == null) {
			claimResponseAddedItemAddedItemsDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(239);
		}
		return claimResponseAddedItemAddedItemsDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Service() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Fee() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetail_Adjudication() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication() {
		if (claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationEClass == null) {
			claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(240);
		}
		return claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication_Code() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication_Amount() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication_Value() {
        return (EReference)getClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseErrors() {
		if (claimResponseErrorsEClass == null) {
			claimResponseErrorsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(241);
		}
		return claimResponseErrorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseErrors_SequenceLinkId() {
        return (EReference)getClaimResponseErrors().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseErrors_DetailSequenceLinkId() {
        return (EReference)getClaimResponseErrors().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseErrors_SubdetailSequenceLinkId() {
        return (EReference)getClaimResponseErrors().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseErrors_Code() {
        return (EReference)getClaimResponseErrors().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseNotes() {
		if (claimResponseNotesEClass == null) {
			claimResponseNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(242);
		}
		return claimResponseNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNotes_Number() {
        return (EReference)getClaimResponseNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNotes_Type() {
        return (EReference)getClaimResponseNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNotes_Text() {
        return (EReference)getClaimResponseNotes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseCoverage() {
		if (claimResponseCoverageEClass == null) {
			claimResponseCoverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(243);
		}
		return claimResponseCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Sequence() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Focal() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Coverage() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_BusinessArrangement() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Relationship() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_PreAuthRef() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_ClaimResponse() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_OriginalRuleset() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItems() {
		if (claimItemsEClass == null) {
			claimItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(244);
		}
		return claimItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Sequence() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Type() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Provider() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_DiagnosisLinkId() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Service() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_ServiceDate() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Quantity() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_UnitPrice() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Factor() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Points() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Net() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Udi() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_BodySite() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_SubSite() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Modifier() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Detail() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItems_Prosthesis() {
        return (EReference)getClaimItems().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemsDetail() {
		if (claimItemsDetailEClass == null) {
			claimItemsDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(245);
		}
		return claimItemsDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Sequence() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Type() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Service() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Quantity() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_UnitPrice() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Factor() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Points() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Net() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_Udi() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetail_SubDetail() {
        return (EReference)getClaimItemsDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemsDetailSubDetail() {
		if (claimItemsDetailSubDetailEClass == null) {
			claimItemsDetailSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(246);
		}
		return claimItemsDetailSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Sequence() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Type() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Service() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Quantity() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_UnitPrice() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Factor() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Points() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Net() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsDetailSubDetail_Udi() {
        return (EReference)getClaimItemsDetailSubDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItemsProsthesis() {
		if (claimItemsProsthesisEClass == null) {
			claimItemsProsthesisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(247);
		}
		return claimItemsProsthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsProsthesis_Initial() {
        return (EReference)getClaimItemsProsthesis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsProsthesis_PriorDate() {
        return (EReference)getClaimItemsProsthesis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItemsProsthesis_PriorMaterial() {
        return (EReference)getClaimItemsProsthesis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimMissingTeeth() {
		if (claimMissingTeethEClass == null) {
			claimMissingTeethEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(248);
		}
		return claimMissingTeethEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_Tooth() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_Reason() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_ExtractionDate() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		if (listEClass == null) {
			listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(249);
		}
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Identifier() {
        return (EReference)getList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Title() {
        return (EReference)getList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Code() {
        return (EReference)getList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Subject() {
        return (EReference)getList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Source() {
        return (EReference)getList().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Encounter() {
        return (EReference)getList().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Status() {
        return (EReference)getList().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Date() {
        return (EReference)getList().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_OrderedBy() {
        return (EReference)getList().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Mode() {
        return (EReference)getList().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Note() {
        return (EReference)getList().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Entry() {
        return (EReference)getList().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_EmptyReason() {
        return (EReference)getList().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEntry() {
		if (listEntryEClass == null) {
			listEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(250);
		}
		return listEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Flag() {
        return (EReference)getListEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Deleted() {
        return (EReference)getListEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Date() {
        return (EReference)getListEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Item() {
        return (EReference)getListEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMap() {
		if (conceptMapEClass == null) {
			conceptMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(251);
		}
		return conceptMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Url() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Identifier() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Version() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Name() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Status() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Experimental() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Publisher() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Contact() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Date() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Description() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_UseContext() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Requirements() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Copyright() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Sourcex() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Targetx() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Element() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapContact() {
		if (conceptMapContactEClass == null) {
			conceptMapContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(252);
		}
		return conceptMapContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapContact_Name() {
        return (EReference)getConceptMapContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapContact_Telecom() {
        return (EReference)getConceptMapContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapSourceElement() {
		if (conceptMapSourceElementEClass == null) {
			conceptMapSourceElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(253);
		}
		return conceptMapSourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElement_CodeSystem() {
        return (EReference)getConceptMapSourceElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElement_Code() {
        return (EReference)getConceptMapSourceElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElement_Target() {
        return (EReference)getConceptMapSourceElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapSourceElementTargetElement() {
		if (conceptMapSourceElementTargetElementEClass == null) {
			conceptMapSourceElementTargetElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(254);
		}
		return conceptMapSourceElementTargetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_CodeSystem() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_Code() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_Equivalence() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_Comments() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_DependsOn() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElement_Product() {
        return (EReference)getConceptMapSourceElementTargetElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapSourceElementTargetElementOtherElement() {
		if (conceptMapSourceElementTargetElementOtherElementEClass == null) {
			conceptMapSourceElementTargetElementOtherElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(255);
		}
		return conceptMapSourceElementTargetElementOtherElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElementOtherElement_Element() {
        return (EReference)getConceptMapSourceElementTargetElementOtherElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElementOtherElement_CodeSystem() {
        return (EReference)getConceptMapSourceElementTargetElementOtherElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapSourceElementTargetElementOtherElement_Code() {
        return (EReference)getConceptMapSourceElementTargetElementOtherElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponse() {
		if (eligibilityResponseEClass == null) {
			eligibilityResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(256);
		}
		return eligibilityResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Identifier() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Request() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Outcome() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Disposition() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Ruleset() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_OriginalRuleset() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Created() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Organization() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestProvider() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestOrganization() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityRequest() {
		if (eligibilityRequestEClass == null) {
			eligibilityRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(257);
		}
		return eligibilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Identifier() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Ruleset() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_OriginalRuleset() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Created() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Target() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Provider() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Organization() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlag() {
		if (flagEClass == null) {
			flagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(258);
		}
		return flagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Identifier() {
        return (EReference)getFlag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Category() {
        return (EReference)getFlag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Status() {
        return (EReference)getFlag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Period() {
        return (EReference)getFlag().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Subject() {
        return (EReference)getFlag().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Encounter() {
        return (EReference)getFlag().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Author() {
        return (EReference)getFlag().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Code() {
        return (EReference)getFlag().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentResponse() {
		if (appointmentResponseEClass == null) {
			appointmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(259);
		}
		return appointmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Identifier() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Appointment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Start() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_End() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantType() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Actor() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantStatus() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Comment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministration() {
		if (medicationAdministrationEClass == null) {
			medicationAdministrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(260);
		}
		return medicationAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Identifier() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Status() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Patient() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Practitioner() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Encounter() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Prescription() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_WasNotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonNotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_EffectiveTimex() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Medicationx() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Device() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Note() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Dosage() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministrationDosage() {
		if (medicationAdministrationDosageEClass == null) {
			medicationAdministrationDosageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(261);
		}
		return medicationAdministrationDosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Text() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Sitex() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Route() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Method() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Quantity() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Ratex() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentResponse() {
		if (enrollmentResponseEClass == null) {
			enrollmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(262);
		}
		return enrollmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Identifier() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Request() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Outcome() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Disposition() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Ruleset() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_OriginalRuleset() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Created() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Organization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestProvider() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestOrganization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		if (binaryEClass == null) {
			binaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(263);
		}
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_ContentType() {
        return (EReference)getBinary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Content() {
        return (EReference)getBinary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScript() {
		if (testScriptEClass == null) {
			testScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(264);
		}
		return testScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Url() {
        return (EReference)getTestScript().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Version() {
        return (EReference)getTestScript().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Name() {
        return (EReference)getTestScript().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Status() {
        return (EReference)getTestScript().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Identifier() {
        return (EReference)getTestScript().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Experimental() {
        return (EReference)getTestScript().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Publisher() {
        return (EReference)getTestScript().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Contact() {
        return (EReference)getTestScript().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Date() {
        return (EReference)getTestScript().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Description() {
        return (EReference)getTestScript().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_UseContext() {
        return (EReference)getTestScript().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Requirements() {
        return (EReference)getTestScript().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Copyright() {
        return (EReference)getTestScript().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Metadata() {
        return (EReference)getTestScript().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Multiserver() {
        return (EReference)getTestScript().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Fixture() {
        return (EReference)getTestScript().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Profile() {
        return (EReference)getTestScript().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Variable() {
        return (EReference)getTestScript().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Setup() {
        return (EReference)getTestScript().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Test() {
        return (EReference)getTestScript().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScript_Teardown() {
        return (EReference)getTestScript().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptContact() {
		if (testScriptContactEClass == null) {
			testScriptContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(265);
		}
		return testScriptContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptContact_Name() {
        return (EReference)getTestScriptContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptContact_Telecom() {
        return (EReference)getTestScriptContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadata() {
		if (testScriptMetadataEClass == null) {
			testScriptMetadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(266);
		}
		return testScriptMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadata_Link() {
        return (EReference)getTestScriptMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadata_Capability() {
        return (EReference)getTestScriptMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadataLink() {
		if (testScriptMetadataLinkEClass == null) {
			testScriptMetadataLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(267);
		}
		return testScriptMetadataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataLink_Url() {
        return (EReference)getTestScriptMetadataLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataLink_Description() {
        return (EReference)getTestScriptMetadataLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptMetadataCapability() {
		if (testScriptMetadataCapabilityEClass == null) {
			testScriptMetadataCapabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(268);
		}
		return testScriptMetadataCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Required() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Validated() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Description() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Destination() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Link() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptMetadataCapability_Conformance() {
        return (EReference)getTestScriptMetadataCapability().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptFixture() {
		if (testScriptFixtureEClass == null) {
			testScriptFixtureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(269);
		}
		return testScriptFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Autocreate() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Autodelete() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptFixture_Resource() {
        return (EReference)getTestScriptFixture().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptVariable() {
		if (testScriptVariableEClass == null) {
			testScriptVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(270);
		}
		return testScriptVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Name() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_HeaderField() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_Path() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptVariable_SourceId() {
        return (EReference)getTestScriptVariable().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetup() {
		if (testScriptSetupEClass == null) {
			testScriptSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(271);
		}
		return testScriptSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetup_Metadata() {
        return (EReference)getTestScriptSetup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetup_Action() {
        return (EReference)getTestScriptSetup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupAction() {
		if (testScriptSetupActionEClass == null) {
			testScriptSetupActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(272);
		}
		return testScriptSetupActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupAction_Operation() {
        return (EReference)getTestScriptSetupAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupAction_Assert() {
        return (EReference)getTestScriptSetupAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupActionOperation() {
		if (testScriptSetupActionOperationEClass == null) {
			testScriptSetupActionOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(273);
		}
		return testScriptSetupActionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Type() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Resource() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Label() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Description() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Accept() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_ContentType() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Destination() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_EncodeRequestUrl() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Params() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_RequestHeader() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_ResponseId() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_SourceId() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_TargetId() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperation_Url() {
        return (EReference)getTestScriptSetupActionOperation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupActionOperationRequestHeader() {
		if (testScriptSetupActionOperationRequestHeaderEClass == null) {
			testScriptSetupActionOperationRequestHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(274);
		}
		return testScriptSetupActionOperationRequestHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperationRequestHeader_Field() {
        return (EReference)getTestScriptSetupActionOperationRequestHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionOperationRequestHeader_Value() {
        return (EReference)getTestScriptSetupActionOperationRequestHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptSetupActionAssert() {
		if (testScriptSetupActionAssertEClass == null) {
			testScriptSetupActionAssertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(275);
		}
		return testScriptSetupActionAssertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Label() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Description() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Direction() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_CompareToSourceId() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_CompareToSourcePath() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_ContentType() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_HeaderField() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_MinimumId() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_NavigationLinks() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Operator() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Path() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Resource() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Response() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_ResponseCode() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_SourceId() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_ValidateProfileId() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_Value() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptSetupActionAssert_WarningOnly() {
        return (EReference)getTestScriptSetupActionAssert().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTest() {
		if (testScriptTestEClass == null) {
			testScriptTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(276);
		}
		return testScriptTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Name() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Description() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Metadata() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTest_Action() {
        return (EReference)getTestScriptTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTestAction() {
		if (testScriptTestActionEClass == null) {
			testScriptTestActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(277);
		}
		return testScriptTestActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTestAction_Operation() {
        return (EReference)getTestScriptTestAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTestAction_Assert() {
        return (EReference)getTestScriptTestAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTeardown() {
		if (testScriptTeardownEClass == null) {
			testScriptTeardownEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(278);
		}
		return testScriptTeardownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTeardown_Action() {
        return (EReference)getTestScriptTeardown().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScriptTeardownAction() {
		if (testScriptTeardownActionEClass == null) {
			testScriptTeardownActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(279);
		}
		return testScriptTeardownActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScriptTeardownAction_Operation() {
        return (EReference)getTestScriptTeardownAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		if (basicEClass == null) {
			basicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(280);
		}
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Identifier() {
        return (EReference)getBasic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Code() {
        return (EReference)getBasic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Subject() {
        return (EReference)getBasic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Author() {
        return (EReference)getBasic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Created() {
        return (EReference)getBasic().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(281);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Identifier() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Status() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Patient() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Dispenser() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_AuthorizingPrescription() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Type() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Quantity() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DaysSupply() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Medicationx() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenPrepared() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenHandedOver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Destination() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Receiver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Note() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DosageInstruction() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Substitution() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseDosageInstruction() {
		if (medicationDispenseDosageInstructionEClass == null) {
			medicationDispenseDosageInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(282);
		}
		return medicationDispenseDosageInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Text() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_AdditionalInstructions() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Timing() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_AsNeededx() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Sitex() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Route() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Method() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Dosex() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Ratex() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_MaxDosePerPeriod() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseSubstitution() {
		if (medicationDispenseSubstitutionEClass == null) {
			medicationDispenseSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(283);
		}
		return medicationDispenseSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Type() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Reason() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_ResponsibleParty() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		if (dataElementEClass == null) {
			dataElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(284);
		}
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Url() {
        return (EReference)getDataElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Identifier() {
        return (EReference)getDataElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Version() {
        return (EReference)getDataElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Name() {
        return (EReference)getDataElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Status() {
        return (EReference)getDataElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Experimental() {
        return (EReference)getDataElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Publisher() {
        return (EReference)getDataElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Contact() {
        return (EReference)getDataElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Date() {
        return (EReference)getDataElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_UseContext() {
        return (EReference)getDataElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Copyright() {
        return (EReference)getDataElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Stringency() {
        return (EReference)getDataElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Mapping() {
        return (EReference)getDataElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Element() {
        return (EReference)getDataElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementContact() {
		if (dataElementContactEClass == null) {
			dataElementContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(285);
		}
		return dataElementContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementContact_Name() {
        return (EReference)getDataElementContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementContact_Telecom() {
        return (EReference)getDataElementContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementMapping() {
		if (dataElementMappingEClass == null) {
			dataElementMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(286);
		}
		return dataElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Identity() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Uri() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Name() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Comments() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEvent() {
		if (auditEventEClass == null) {
			auditEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(287);
		}
		return auditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Event() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Participant() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Source() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Object() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventEvent() {
		if (auditEventEventEClass == null) {
			auditEventEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(288);
		}
		return auditEventEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Type() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Subtype() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Action() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_DateTime() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Outcome() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_OutcomeDesc() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_PurposeOfEvent() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventParticipant() {
		if (auditEventParticipantEClass == null) {
			auditEventParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(289);
		}
		return auditEventParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Role() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Reference() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_UserId() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_AltId() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Name() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Requestor() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Location() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Policy() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Media() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Network() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_PurposeOfUse() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventParticipantNetwork() {
		if (auditEventParticipantNetworkEClass == null) {
			auditEventParticipantNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(290);
		}
		return auditEventParticipantNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipantNetwork_Address() {
        return (EReference)getAuditEventParticipantNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipantNetwork_Type() {
        return (EReference)getAuditEventParticipantNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventSource() {
		if (auditEventSourceEClass == null) {
			auditEventSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(291);
		}
		return auditEventSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Site() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Identifier() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Type() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObject() {
		if (auditEventObjectEClass == null) {
			auditEventObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(292);
		}
		return auditEventObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Identifier() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Reference() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Type() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Role() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Lifecycle() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_SecurityLabel() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Name() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Description() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Query() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Detail() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObjectDetail() {
		if (auditEventObjectDetailEClass == null) {
			auditEventObjectDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(293);
		}
		return auditEventObjectDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObjectDetail_Type() {
        return (EReference)getAuditEventObjectDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObjectDetail_Value() {
        return (EReference)getAuditEventObjectDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliation() {
		if (paymentReconciliationEClass == null) {
			paymentReconciliationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(294);
		}
		return paymentReconciliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Identifier() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Request() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Outcome() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Disposition() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Ruleset() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_OriginalRuleset() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Created() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Period() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Organization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestProvider() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestOrganization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Detail() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Form() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Total() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Note() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationDetails() {
		if (paymentReconciliationDetailsEClass == null) {
			paymentReconciliationDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(295);
		}
		return paymentReconciliationDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Type() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Request() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Responce() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Submitter() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Payee() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Date() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetails_Amount() {
        return (EReference)getPaymentReconciliationDetails().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationNotes() {
		if (paymentReconciliationNotesEClass == null) {
			paymentReconciliationNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(296);
		}
		return paymentReconciliationNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNotes_Type() {
        return (EReference)getPaymentReconciliationNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNotes_Text() {
        return (EReference)getPaymentReconciliationNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetectedIssue() {
		if (detectedIssueEClass == null) {
			detectedIssueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(297);
		}
		return detectedIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Patient() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Category() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Severity() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Implicated() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Detail() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Date() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Author() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Identifier() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Reference() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssue_Mitigation() {
        return (EReference)getDetectedIssue().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetectedIssueMitigation() {
		if (detectedIssueMitigationEClass == null) {
			detectedIssueMitigationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(298);
		}
		return detectedIssueMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Action() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Date() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetectedIssueMitigation_Author() {
        return (EReference)getDetectedIssueMitigation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		if (bundleEClass == null) {
			bundleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(299);
		}
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Type() {
        return (EReference)getBundle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Total() {
        return (EReference)getBundle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Link() {
        return (EReference)getBundle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Entry() {
        return (EReference)getBundle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Signature() {
        return (EReference)getBundle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleLink() {
		if (bundleLinkEClass == null) {
			bundleLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(300);
		}
		return bundleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Relation() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Url() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntry() {
		if (bundleEntryEClass == null) {
			bundleEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(301);
		}
		return bundleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Link() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_FullUrl() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Resource() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Search() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Request() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Response() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntrySearch() {
		if (bundleEntrySearchEClass == null) {
			bundleEntrySearchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(302);
		}
		return bundleEntrySearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntrySearch_Mode() {
        return (EReference)getBundleEntrySearch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntrySearch_Score() {
        return (EReference)getBundleEntrySearch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntryRequest() {
		if (bundleEntryRequestEClass == null) {
			bundleEntryRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(303);
		}
		return bundleEntryRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_Method() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_Url() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfNoneMatch() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfModifiedSince() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfMatch() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryRequest_IfNoneExist() {
        return (EReference)getBundleEntryRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntryResponse() {
		if (bundleEntryResponseEClass == null) {
			bundleEntryResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(304);
		}
		return bundleEntryResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Status() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Location() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_Etag() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntryResponse_LastModified() {
        return (EReference)getBundleEntryResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponse() {
		if (processResponseEClass == null) {
			processResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(305);
		}
		return processResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Identifier() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Request() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Outcome() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Disposition() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Ruleset() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_OriginalRuleset() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Created() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Organization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestProvider() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestOrganization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Form() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Notes() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Error() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponseNotes() {
		if (processResponseNotesEClass == null) {
			processResponseNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(306);
		}
		return processResponseNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNotes_Type() {
        return (EReference)getProcessResponseNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNotes_Text() {
        return (EReference)getProcessResponseNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystem() {
		if (namingSystemEClass == null) {
			namingSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(307);
		}
		return namingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Name() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Status() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Kind() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Publisher() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Contact() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Responsible() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Date() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Type() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Description() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_UseContext() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Usage() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_UniqueId() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_ReplacedBy() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemContact() {
		if (namingSystemContactEClass == null) {
			namingSystemContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(308);
		}
		return namingSystemContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemContact_Name() {
        return (EReference)getNamingSystemContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemContact_Telecom() {
        return (EReference)getNamingSystemContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemUniqueId() {
		if (namingSystemUniqueIdEClass == null) {
			namingSystemUniqueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(309);
		}
		return namingSystemUniqueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Type() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Value() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Preferred() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Period() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyDelivery() {
		if (supplyDeliveryEClass == null) {
			supplyDeliveryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(310);
		}
		return supplyDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Identifier() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Status() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Patient() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Type() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Quantity() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_SuppliedItem() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Supplier() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_WhenPrepared() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Time() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Destination() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDelivery_Receiver() {
        return (EReference)getSupplyDelivery().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		if (organizationEClass == null) {
			organizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(311);
		}
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Identifier() {
        return (EReference)getOrganization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Active() {
        return (EReference)getOrganization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Type() {
        return (EReference)getOrganization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Name() {
        return (EReference)getOrganization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Telecom() {
        return (EReference)getOrganization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Address() {
        return (EReference)getOrganization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_PartOf() {
        return (EReference)getOrganization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Contact() {
        return (EReference)getOrganization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationContact() {
		if (organizationContactEClass == null) {
			organizationContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI).getEClassifiers().get(312);
		}
		return organizationContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Purpose() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Name() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Telecom() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Address() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirResourceFactory getFhirResourceFactory() {
		return (FhirResourceFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.eclipse.mdht.uml.fhir.core.resource." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FhirResourcePackageImpl
