/**
 */
package org.hl7.fhir.impl;

import java.lang.String;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Element;
import org.hl7.fhir.Extension;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Element", namespace = "http://hl7.org/fhir")
@XmlSeeAlso({ TestScriptVariableImpl.class, DocumentManifestContentImpl.class, LinkTypeImpl.class, TestScriptRule3Impl.class, ImmunizationReactionImpl.class, DeviceMetricColorImpl.class, TestScriptRequestMethodCodeImpl.class, LinkageItemImpl.class, RepositoryTypeImpl.class, ConsentData1Impl.class, TestScriptAction1Impl.class,
		CarePlanActivityStatusImpl.class, CapabilityStatementInteraction1Impl.class, ContractAgentImpl.class, ActionCardinalityBehaviorImpl.class, ExplanationOfBenefitDiagnosisImpl.class, ClaimResponseDetailImpl.class, MedicationBatchImpl.class, ProcedureRequestRequesterImpl.class, Base64BinaryImpl.class,
		ConsentExceptTypeImpl.class, DosageImpl.class, UnsignedIntImpl.class, ParticipationStatusImpl.class, DetectedIssueSeverityImpl.class, DeviceMetricOperationalStatusImpl.class, CapabilityStatementCertificateImpl.class, RequestGroupActionImpl.class, UseImpl.class, ExplanationOfBenefitFinancialImpl.class,
		MedicationRequestIntentImpl.class, CoverageGroupingImpl.class, ResourceTypeImpl.class, StructureDefinitionSnapshotImpl.class, OperationDefinitionParameterImpl.class, TestReportOperationImpl.class, PlanDefinitionDynamicValueImpl.class, SearchParameterComponentImpl.class, ExplanationOfBenefitInformationImpl.class,
		ValueSetParameterImpl.class, StructureMapGroupImpl.class, ActionRelationshipTypeImpl.class, ObservationReferenceRangeImpl.class, TestScriptAssertImpl.class, PublicationStatusImpl.class, ImmunizationRecommendationRecommendationImpl.class, ValueSetComposeImpl.class, ExtensionContextImpl.class,
		EligibilityResponseErrorImpl.class, SpecimenStatusImpl.class, ConceptMapElementImpl.class, ImagingStudySeriesImpl.class, QualityTypeImpl.class, MeasureReportStratifierImpl.class, PeriodImpl.class, AdverseEventCausalityImpl.class, BundleResponseImpl.class, HumanNameImpl.class, SlicingRulesImpl.class,
		ExplanationOfBenefitAddItemImpl.class, MetaImpl.class, ExplanationOfBenefitBenefitBalanceImpl.class, ContractLegalImpl.class, SampledDataDataTypeImpl.class, AddressTypeImpl.class, DocumentReferenceContextImpl.class, ObservationRelationshipTypeImpl.class, ClaimResponseErrorImpl.class, PractitionerQualificationImpl.class,
		AssertionOperatorTypeImpl.class, ClaimResponseItemImpl.class, EligibilityResponseInsuranceImpl.class, ImmunizationRecommendationProtocolImpl.class, StringImpl.class, RemittanceOutcomeImpl.class, AuditEventEntityImpl.class, ConsentDataMeaningImpl.class, TestReportAction2Impl.class, TestReportAssertImpl.class,
		NutritionOrderStatusImpl.class, GoalStatusImpl.class, StructureMapRuleImpl.class, IntegerImpl.class, ClaimDetailImpl.class, PatientContactImpl.class, ConditionalDeleteStatusImpl.class, ExplanationOfBenefitProcedureImpl.class, QuestionnaireItemTypeImpl.class, MeasureReportTypeImpl.class,
		MedicationAdministrationPerformerImpl.class, RequestIntentImpl.class, FinancialResourceStatusCodesImpl.class, ImmunizationRecommendationDateCriterionImpl.class, PlanDefinitionParticipantImpl.class, CarePlanDetailImpl.class, ExplanationOfBenefitItemImpl.class, HealthcareServiceNotAvailableImpl.class,
		TestScriptOperationImpl.class, TestScriptDestinationImpl.class, CarePlanStatusImpl.class, ResearchStudyArmImpl.class, ObservationStatusImpl.class, ImmunizationExplanationImpl.class, ChargeItemParticipantImpl.class, ActionConditionKindImpl.class, TestReportSetupImpl.class, GoalTargetImpl.class, DeviceUdiImpl.class,
		RatioImpl.class, ContributorTypeImpl.class, ResponseTypeImpl.class, ClinicalImpressionFindingImpl.class, DeviceRequestRequesterImpl.class, ImplementationGuideDependencyImpl.class, CodeSystemFilterImpl.class, MeasureGroupImpl.class, FHIRDefinedTypeImpl.class, SearchParamTypeImpl.class, ClaimRelatedImpl.class,
		SpecimenCollectionImpl.class, AccountCoverageImpl.class, ContractValuedItem1Impl.class, QuestionnaireEnableWhenImpl.class, MoneyImpl.class, HTTPVerbImpl.class, CapabilityStatementEventImpl.class, TestScriptRuleImpl.class, TestScriptParam2Impl.class, ActionSelectionBehaviorImpl.class, ElementDefinitionTypeImpl.class,
		ClaimResponseSubDetailImpl.class, ConceptMapDependsOnImpl.class, CapabilityStatementRestImpl.class, SupplyRequestRequesterImpl.class, EncounterLocationImpl.class, ElementDefinitionConstraintImpl.class, DeviceMetricCalibrationImpl.class, AppointmentStatusImpl.class, ExplanationOfBenefitInsuranceImpl.class,
		DiscriminatorTypeImpl.class, CountImpl.class, OperationParameterUseImpl.class, TestScriptOriginImpl.class, CodeSystemHierarchyMeaningImpl.class, ExpansionProfileIncludeImpl.class, IdentifierUseImpl.class, TestReportStatusImpl.class, ActionListImpl.class, TypeDerivationRuleImpl.class, ImagingManifestSeriesImpl.class,
		MessageHeaderSourceImpl.class, DateImpl.class, TriggerDefinitionImpl.class, AddressImpl.class, ConceptMapGroupImpl.class, CodeableConceptImpl.class, MessageSignificanceCategoryImpl.class, TaskOutputImpl.class, TimeImpl.class, ExplanationOfBenefitDetail1Impl.class, ConditionalReadStatusImpl.class,
		OrganizationContactImpl.class, AuditEventAgentImpl.class, ExplanationOfBenefitDetailImpl.class, ChargeItemStatusImpl.class, ValueSetIncludeImpl.class, TestScriptTeardownImpl.class, GraphDefinitionLinkImpl.class, CompositionEventImpl.class, QuantityImpl.class, SystemRestfulInteractionImpl.class,
		EventCapabilityModeImpl.class, OperationOutcomeIssueImpl.class, NutritionOrderAdministrationImpl.class, GraphDefinitionTargetImpl.class, StructureMapStructureImpl.class, AuditEventDetailImpl.class, MeasmntPrincipleImpl.class, ClaimPayeeImpl.class, CarePlanIntentImpl.class, ExplanationOfBenefitRelatedImpl.class,
		CapabilityStatementOperationImpl.class, TestScriptRule1Impl.class, PositiveIntImpl.class, ClaimInsuranceImpl.class, OidImpl.class, VisionEyesImpl.class, PatientCommunicationImpl.class, DocumentModeImpl.class, ContractValuedItemImpl.class, BundleRequestImpl.class, TestScriptRequestHeaderImpl.class, PatientLinkImpl.class,
		GraphCompartmentRuleImpl.class, ConsentActorImpl.class, SupplyDeliverySuppliedItemImpl.class, DeviceMetricCalibrationStateImpl.class, CodingImpl.class, MedicationPackageImpl.class, TestScriptParam1Impl.class, EpisodeOfCareStatusHistoryImpl.class, FHIRAllTypesImpl.class, ContentTypeImpl.class,
		ClaimResponseInsuranceImpl.class, AllergyIntoleranceCriticalityImpl.class, AssertionDirectionTypeImpl.class, DistanceImpl.class, FamilyHistoryStatusImpl.class, StructureMapSourceListModeImpl.class, ActionRequiredBehaviorImpl.class, ProcessResponseProcessNoteImpl.class, PropertyRepresentationImpl.class,
		StructureDefinitionKindImpl.class, PractitionerRoleAvailableTimeImpl.class, ImmunizationStatusCodesImpl.class, AccountStatusImpl.class, InstantImpl.class, AssertionResponseTypesImpl.class, ConsentActor1Impl.class, ConditionVerificationStatusImpl.class, AllergyIntoleranceSeverityImpl.class, EncounterStatusImpl.class,
		StructureMapTargetListModeImpl.class, PropertyTypeImpl.class, AttachmentImpl.class, DiagnosticReportStatusImpl.class, RequestGroupConditionImpl.class, ProvenanceEntityRoleImpl.class, StructureDefinitionDifferentialImpl.class, SequenceVariantImpl.class, ListModeImpl.class, ClaimProcedureImpl.class,
		MedicationRequestPriorityImpl.class, GroupTypeImpl.class, ExtensionImpl.class, BundleTypeImpl.class, IdentityAssuranceLevelImpl.class, TestScriptLinkImpl.class, PlanDefinitionTargetImpl.class, ContractFriendlyImpl.class, CarePlanActivityImpl.class, CompositionAttesterImpl.class, SequenceReferenceSeqImpl.class,
		VisionPrescriptionDispenseImpl.class, ClaimSubDetailImpl.class, CodeSystemConceptImpl.class, CodeImpl.class, RequestPriorityImpl.class, DeviceUseStatementStatusImpl.class, ContractResourceStatusCodesImpl.class, UriImpl.class, BackboneElementImpl.class, TestReportActionImpl.class, QuestionnaireItemImpl.class,
		ParameterDefinitionImpl.class, MedicationStatementStatusImpl.class, CapabilityStatementSearchParamImpl.class, RelatedArtifactTypeImpl.class, SampledDataImpl.class, AddressUseImpl.class, ValueSetConceptImpl.class, QuestionnaireResponseAnswerImpl.class, NutritionOrderTextureImpl.class, MeasureReportStatusImpl.class,
		StructureMapSourceImpl.class, ReferralRequestRequesterImpl.class, QuestionnaireResponseStatusImpl.class, CapabilityStatementResourceImpl.class, CapabilityStatementInteractionImpl.class, MeasureReportPopulationImpl.class, RangeImpl.class, DiagnosticReportPerformerImpl.class, MedicationRequestSubstitutionImpl.class,
		DecimalImpl.class, DataRequirementCodeFilterImpl.class, TestScriptParamImpl.class, MedicationAdministrationStatusImpl.class, BundleLinkImpl.class, ContractRuleImpl.class, ExplanationOfBenefitStatusImpl.class, TestScriptRule2Impl.class, AnnotationImpl.class, StructureMapInputModeImpl.class, NarrativeStatusImpl.class,
		ExpansionProfileExcludeImpl.class, StructureMapContextTypeImpl.class, ProcedurePerformerImpl.class, RequestGroupRelatedActionImpl.class, ValueSetContainsImpl.class, PractitionerRoleNotAvailableImpl.class, MedicationRequestStatusImpl.class, AllergyIntoleranceCategoryImpl.class, ConsentStateImpl.class,
		MedicationRequestDispenseRequestImpl.class, DeviceMetricCategoryImpl.class, SupplyDeliveryStatusImpl.class, MeasureStratifierImpl.class, ElementDefinitionSlicingImpl.class, ClaimItemImpl.class, ExpansionProfileDesignationImpl.class, CompartmentDefinitionResourceImpl.class, MarkdownImpl.class, DateTimeImpl.class,
		ConfidentialityClassificationImpl.class, ImagingStudyInstanceImpl.class, NamingSystemTypeImpl.class, StructureMapGroupTypeModeImpl.class, ClaimResponseAdjudicationImpl.class, GroupCharacteristicImpl.class, QuestionnaireResponseItemImpl.class, ValueSetFilterImpl.class, RiskAssessmentPredictionImpl.class,
		OperationKindImpl.class, ExplanationOfBenefitAccidentImpl.class, CodeSystemPropertyImpl.class, AdverseEventSuspectEntityImpl.class, AgeImpl.class, ClaimDiagnosisImpl.class, ElementDefinitionExampleImpl.class, ClaimResponseDetail1Impl.class, DetectedIssueMitigationImpl.class, CodeSystemContentModeImpl.class,
		TaskInputImpl.class, AllergyIntoleranceClinicalStatusImpl.class, PlanDefinitionGoalImpl.class, TestScriptMetadataImpl.class, ImplementationGuidePackageImpl.class, ConceptMapEquivalenceImpl.class, EpisodeOfCareDiagnosisImpl.class, EncounterClassHistoryImpl.class, ElementDefinitionMappingImpl.class,
		ClaimResponsePaymentImpl.class, VisionBaseImpl.class, ExplanationOfBenefitSubDetailImpl.class, ExpansionProfileExcludedSystemImpl.class, TimingRepeatImpl.class, ImplementationGuidePageImpl.class, ProcedureFocalDeviceImpl.class, EpisodeOfCareStatusImpl.class, StructureDefinitionMappingImpl.class,
		DeviceComponentProductionSpecificationImpl.class, ReferenceImpl.class, GuideDependencyTypeImpl.class, SubscriptionChannelTypeImpl.class, AggregationModeImpl.class, ContractAgent1Impl.class, DocumentRelationshipTypeImpl.class, EventStatusImpl.class, OperationDefinitionBindingImpl.class,
		FamilyMemberHistoryConditionImpl.class, CareTeamParticipantImpl.class, ClinicalImpressionStatusImpl.class, AuditEventOutcomeImpl.class, FHIRSubstanceStatusImpl.class, CodeSystemDesignationImpl.class, SearchEntryModeImpl.class, PlanDefinitionActionImpl.class, PaymentReconciliationProcessNoteImpl.class,
		NutritionOrderNutrientImpl.class, AuditEventAgentNetworkTypeImpl.class, ExplanationOfBenefitPayeeImpl.class, MedicationIngredientImpl.class, TestReportParticipantImpl.class, RequestStatusImpl.class, MedicationContentImpl.class, EncounterLocationStatusImpl.class, QuantityComparatorImpl.class,
		ActivityDefinitionParticipantImpl.class, EncounterDiagnosisImpl.class, ContactPointUseImpl.class, EndpointStatusImpl.class, MessageHeaderResponseImpl.class, ProcessRequestItemImpl.class, MedicationStatusImpl.class, ContactPointImpl.class, TestReportTeardownImpl.class, StructureMapTransformImpl.class,
		ReferenceVersionRulesImpl.class, TestScriptTestImpl.class, AccountGuarantorImpl.class, TaskRequesterImpl.class, RelatedArtifactImpl.class, TestScriptParam3Impl.class, DataElementStringencyImpl.class, ObservationRelatedImpl.class, ConditionEvidenceImpl.class, ClaimResponseProcessNoteImpl.class, MeasureReportGroupImpl.class,
		ConceptMapTargetImpl.class, SupplyRequestStatusImpl.class, ReferenceHandlingPolicyImpl.class, SignatureImpl.class, ConditionStageImpl.class, ListEntryImpl.class, TestReportParticipantTypeImpl.class, ResourceVersionPolicyImpl.class, RestfulCapabilityModeImpl.class, TaskRestrictionImpl.class, AuditEventNetworkImpl.class,
		MedicationDispenseSubstitutionImpl.class, ExplanationOfBenefitCareTeamImpl.class, MedicationRequestRequesterImpl.class, AllergyIntoleranceTypeImpl.class, AuditEventActionImpl.class, ActionPrecheckBehaviorImpl.class, TestScriptCapabilityImpl.class, PlanDefinitionConditionImpl.class, ElementDefinitionImpl.class,
		ExpansionProfileFixedVersionImpl.class, DataRequirementImpl.class, ResearchSubjectStatusImpl.class, StructureMapDependentImpl.class, ElementDefinitionBindingImpl.class, CommunicationRequestPayloadImpl.class, LocationPositionImpl.class, MedicationDispenseStatusImpl.class, DocumentReferenceRelatesToImpl.class,
		DigitalMediaTypeImpl.class, EncounterStatusHistoryImpl.class, GuidanceResponseStatusImpl.class, NutritionOrderSupplementImpl.class, PersonLinkImpl.class, TestScriptRulesetImpl.class, DeviceMetricCalibrationTypeImpl.class, CompositionSectionImpl.class, CapabilityStatementSecurityImpl.class, MeasureReportStratumImpl.class,
		TestReportAction1Impl.class, NoteTypeImpl.class, SubscriptionStatusImpl.class, NamingSystemIdentifierTypeImpl.class, MeasureSupplementalDataImpl.class, ResearchStudyStatusImpl.class, ContributorImpl.class, CapabilityStatementMessagingImpl.class, ExplanationOfBenefitPaymentImpl.class, EventTimingImpl.class,
		NutritionOrderOralDietImpl.class, ImmunizationVaccinationProtocolImpl.class, ConceptMapUnmappedImpl.class, MessageDefinitionAllowedResponseImpl.class, ImmunizationPractitionerImpl.class, ConsentExceptImpl.class, EncounterHospitalizationImpl.class, HealthcareServiceAvailableTimeImpl.class,
		CapabilityStatementImplementationImpl.class, ExplanationOfBenefitAdjudicationImpl.class, TimingImpl.class, DocumentManifestRelatedImpl.class, ImplementationGuideResourceImpl.class, MedicationAdministrationDosageImpl.class, ContactDetailImpl.class, LinkageTypeImpl.class, NutritionOrderEnteralFormulaImpl.class,
		ClaimInformationImpl.class, SequenceRepositoryImpl.class, CodeSystemProperty1Impl.class, FHIRDeviceStatusImpl.class, MessageDefinitionFocusImpl.class, ImagingManifestInstanceImpl.class, ConditionClinicalStatusCodesImpl.class, TestScriptFixtureImpl.class, GuidePageKindImpl.class, SearchModifierCodeImpl.class,
		SequenceQualityImpl.class, CommunicationRequestRequesterImpl.class, ActionParticipantTypeImpl.class, CommunicationPayloadImpl.class, ListStatusImpl.class, LocationModeImpl.class, SubscriptionChannelImpl.class, DataElementMappingImpl.class, ParticipantRequiredImpl.class, ConsentPolicyImpl.class, ConsentDataImpl.class,
		SpecimenContainerImpl.class, ImplementationGuideGlobalImpl.class, SlotStatusImpl.class, IssueSeverityImpl.class, TestReportTestImpl.class, ClaimResponseAddItemImpl.class, ContractSignerImpl.class, DocumentReferenceStatusImpl.class, AppointmentParticipantImpl.class, ConstraintSeverityImpl.class, TestScriptSetupImpl.class,
		CompositionStatusImpl.class, ContractTermImpl.class, ExpansionProfileDesignation2Impl.class, PlanDefinitionRelatedActionImpl.class, ObservationComponentImpl.class, TaskStatusImpl.class, SystemVersionProcessingModeImpl.class, UuidImpl.class, TestReportActionResultImpl.class, CapabilityStatementSoftwareImpl.class,
		AllergyIntoleranceReactionImpl.class, StructureMapInputImpl.class, ExplanationOfBenefitProcessNoteImpl.class, NarrativeImpl.class, EligibilityResponseBenefitBalanceImpl.class, MeasurePopulationImpl.class, ClinicalImpressionInvestigationImpl.class, ClaimAccidentImpl.class, MedicationStatementTakenImpl.class,
		CompositionAttestationModeImpl.class, DurationImpl.class, ValueSetExpansionImpl.class, CompositionRelatesToImpl.class, AllergyIntoleranceVerificationStatusImpl.class, TestScriptActionImpl.class, DataRequirementDateFilterImpl.class, CapabilityStatementSupportedMessageImpl.class, CareTeamStatusImpl.class,
		TriggerTypeImpl.class, ActivityDefinitionDynamicValueImpl.class, InstanceAvailabilityImpl.class, GraphDefinitionCompartmentImpl.class, TypeRestfulInteractionImpl.class, UDIEntryTypeImpl.class, ElementDefinitionBaseImpl.class, ParametersParameterImpl.class, AdverseEventCategoryImpl.class, ImagingManifestStudyImpl.class,
		ContactPointSystemImpl.class, AuditEventSourceImpl.class, CapabilityStatementEndpointImpl.class, ConceptMapGroupUnmappedModeImpl.class, DocumentReferenceContentImpl.class, ElementDefinitionDiscriminatorImpl.class, TestScriptAction2Impl.class, MeasureReportPopulation1Impl.class, LocationStatusImpl.class,
		TestScriptRuleset1Impl.class, QuestionnaireOptionImpl.class, GroupMemberImpl.class, DaysOfWeekImpl.class, StructureMapParameterImpl.class, ActionGroupingBehaviorImpl.class, CapabilityStatementDocumentImpl.class, OperationDefinitionOverloadImpl.class, SubstanceIngredientImpl.class, BundleEntryImpl.class,
		StructureMapTargetImpl.class, SupplyRequestOrderedItemImpl.class, ClaimCareTeamImpl.class, MedicationDispensePerformerImpl.class, EncounterParticipantImpl.class, UsageContextImpl.class, EligibilityResponseFinancialImpl.class, FilterOperatorImpl.class, NameUseImpl.class, ProvenanceEntityImpl.class, CompartmentTypeImpl.class,
		CapabilityStatementKindImpl.class, IdImpl.class, BundleSearchImpl.class, SpecimenProcessingImpl.class, BooleanImpl.class, IdentifierImpl.class, UnitsOfTimeImpl.class, DiagnosticReportImageImpl.class, UnknownContentCodeImpl.class, MessageHeaderDestinationImpl.class, BindingStrengthImpl.class, SubstanceInstanceImpl.class,
		PaymentReconciliationDetailImpl.class, ValueSetDesignationImpl.class, NamingSystemUniqueIdImpl.class, AdministrativeGenderImpl.class, XPathUsageTypeImpl.class, ProvenanceAgentImpl.class, StructureMapModelModeImpl.class, IssueTypeImpl.class, DocumentReferenceRelatedImpl.class, SearchComparatorImpl.class,
		ExpansionProfileDesignation1Impl.class, PatientAnimalImpl.class, FlagStatusImpl.class, TestReportResultImpl.class })
@XmlRootElement(name = "Element")
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public EList<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<Extension>(Extension.class, this, FhirPackage.ELEMENT__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				return getExtension();
			case FhirPackage.ELEMENT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extension>)newValue);
				return;
			case FhirPackage.ELEMENT__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				getExtension().clear();
				return;
			case FhirPackage.ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				return extension != null && !extension.isEmpty();
			case FhirPackage.ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
