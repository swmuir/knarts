/**
 */
package org.hl7.knowledgeartifact.r2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.ANY;
import org.hl7.cdsdt.r2.HXIT;
import org.hl7.cdsdt.r2.II;

import org.hl7.knowledgeartifact.r2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package
 * @generated
 */
public class R2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = R2Package.eINSTANCE;
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
	protected R2Switch<Adapter> modelSwitch =
		new R2Switch<Adapter>() {
			@Override
			public Adapter caseActionBase(ActionBase object) {
				return createActionBaseAdapter();
			}
			@Override
			public Adapter caseActionGroup(ActionGroup object) {
				return createActionGroupAdapter();
			}
			@Override
			public Adapter caseActionRef(ActionRef object) {
				return createActionRefAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseActorsType(ActorsType object) {
				return createActorsTypeAdapter();
			}
			@Override
			public Adapter caseAddressesType(AddressesType object) {
				return createAddressesTypeAdapter();
			}
			@Override
			public Adapter caseApplicabilityType(ApplicabilityType object) {
				return createApplicabilityTypeAdapter();
			}
			@Override
			public Adapter caseArtifactLifeCycleEvent(ArtifactLifeCycleEvent object) {
				return createArtifactLifeCycleEventAdapter();
			}
			@Override
			public Adapter caseArtifactSummary(ArtifactSummary object) {
				return createArtifactSummaryAdapter();
			}
			@Override
			public Adapter caseArtifactTypeType(ArtifactTypeType object) {
				return createArtifactTypeTypeAdapter();
			}
			@Override
			public Adapter caseArtifactTypeType1(ArtifactTypeType1 object) {
				return createArtifactTypeType1Adapter();
			}
			@Override
			public Adapter caseAtomicAction(AtomicAction object) {
				return createAtomicActionAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseBehaviors(Behaviors object) {
				return createBehaviorsAdapter();
			}
			@Override
			public Adapter caseBindingModelType(BindingModelType object) {
				return createBindingModelTypeAdapter();
			}
			@Override
			public Adapter caseBindingModelType1(BindingModelType1 object) {
				return createBindingModelType1Adapter();
			}
			@Override
			public Adapter caseBindingNameType(BindingNameType object) {
				return createBindingNameTypeAdapter();
			}
			@Override
			public Adapter caseBindingType(BindingType object) {
				return createBindingTypeAdapter();
			}
			@Override
			public Adapter caseBindingTypeType(BindingTypeType object) {
				return createBindingTypeTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityBehavior(CardinalityBehavior object) {
				return createCardinalityBehaviorAdapter();
			}
			@Override
			public Adapter caseCategoriesType(CategoriesType object) {
				return createCategoriesTypeAdapter();
			}
			@Override
			public Adapter caseCodesType(CodesType object) {
				return createCodesTypeAdapter();
			}
			@Override
			public Adapter caseCoding(Coding object) {
				return createCodingAdapter();
			}
			@Override
			public Adapter caseCollectInformationAction(CollectInformationAction object) {
				return createCollectInformationActionAdapter();
			}
			@Override
			public Adapter caseCompletion(Completion object) {
				return createCompletionAdapter();
			}
			@Override
			public Adapter caseComponentEventBinding(ComponentEventBinding object) {
				return createComponentEventBindingAdapter();
			}
			@Override
			public Adapter caseComponentEventMappings(ComponentEventMappings object) {
				return createComponentEventMappingsAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionRoleType1(ConditionRoleType1 object) {
				return createConditionRoleType1Adapter();
			}
			@Override
			public Adapter caseConditions(Conditions object) {
				return createConditionsAdapter();
			}
			@Override
			public Adapter caseConstraintTypeType(ConstraintTypeType object) {
				return createConstraintTypeTypeAdapter();
			}
			@Override
			public Adapter caseContactsType(ContactsType object) {
				return createContactsTypeAdapter();
			}
			@Override
			public Adapter caseContainedArtifact(ContainedArtifact object) {
				return createContainedArtifactAdapter();
			}
			@Override
			public Adapter caseContainedArtifactList(ContainedArtifactList object) {
				return createContainedArtifactListAdapter();
			}
			@Override
			public Adapter caseContentHashType(ContentHashType object) {
				return createContentHashTypeAdapter();
			}
			@Override
			public Adapter caseContentSignifier(ContentSignifier object) {
				return createContentSignifierAdapter();
			}
			@Override
			public Adapter caseContentType(ContentType object) {
				return createContentTypeAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseContributionsType(ContributionsType object) {
				return createContributionsTypeAdapter();
			}
			@Override
			public Adapter caseControlBlock(ControlBlock object) {
				return createControlBlockAdapter();
			}
			@Override
			public Adapter caseControllingArtifactType(ControllingArtifactType object) {
				return createControllingArtifactTypeAdapter();
			}
			@Override
			public Adapter caseCoverage(Coverage object) {
				return createCoverageAdapter();
			}
			@Override
			public Adapter caseCreateAction(CreateAction object) {
				return createCreateActionAdapter();
			}
			@Override
			public Adapter caseDataEventTrigger(DataEventTrigger object) {
				return createDataEventTriggerAdapter();
			}
			@Override
			public Adapter caseDataModelsType(DataModelsType object) {
				return createDataModelsTypeAdapter();
			}
			@Override
			public Adapter caseDeclareResponseAction(DeclareResponseAction object) {
				return createDeclareResponseActionAdapter();
			}
			@Override
			public Adapter caseDocumentationItem(DocumentationItem object) {
				return createDocumentationItemAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnumerationConstraint(EnumerationConstraint object) {
				return createEnumerationConstraintAdapter();
			}
			@Override
			public Adapter caseEnumerationItem(EnumerationItem object) {
				return createEnumerationItemAdapter();
			}
			@Override
			public Adapter caseEventBinding(EventBinding object) {
				return createEventBindingAdapter();
			}
			@Override
			public Adapter caseEventBindingTypeType(EventBindingTypeType object) {
				return createEventBindingTypeTypeAdapter();
			}
			@Override
			public Adapter caseEventDefType(EventDefType object) {
				return createEventDefTypeAdapter();
			}
			@Override
			public Adapter caseEventHistoryType(EventHistoryType object) {
				return createEventHistoryTypeAdapter();
			}
			@Override
			public Adapter caseEventNameType(EventNameType object) {
				return createEventNameTypeAdapter();
			}
			@Override
			public Adapter caseEventTypeType(EventTypeType object) {
				return createEventTypeTypeAdapter();
			}
			@Override
			public Adapter caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			@Override
			public Adapter caseExpressionConstraint(ExpressionConstraint object) {
				return createExpressionConstraintAdapter();
			}
			@Override
			public Adapter caseExpressionsType(ExpressionsType object) {
				return createExpressionsTypeAdapter();
			}
			@Override
			public Adapter caseExternalDataType(ExternalDataType object) {
				return createExternalDataTypeAdapter();
			}
			@Override
			public Adapter caseFireEventAction(FireEventAction object) {
				return createFireEventActionAdapter();
			}
			@Override
			public Adapter caseFocusType(FocusType object) {
				return createFocusTypeAdapter();
			}
			@Override
			public Adapter caseFormattedNumber(FormattedNumber object) {
				return createFormattedNumberAdapter();
			}
			@Override
			public Adapter caseFormattedText(FormattedText object) {
				return createFormattedTextAdapter();
			}
			@Override
			public Adapter caseGroupOrganizationBehavior(GroupOrganizationBehavior object) {
				return createGroupOrganizationBehaviorAdapter();
			}
			@Override
			public Adapter caseGroupSelectionBehavior(GroupSelectionBehavior object) {
				return createGroupSelectionBehaviorAdapter();
			}
			@Override
			public Adapter caseIdentifiersType(IdentifiersType object) {
				return createIdentifiersTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiersType1(IdentifiersType1 object) {
				return createIdentifiersType1Adapter();
			}
			@Override
			public Adapter caseIdentifiersType2(IdentifiersType2 object) {
				return createIdentifiersType2Adapter();
			}
			@Override
			public Adapter caseInitialArtifactType(InitialArtifactType object) {
				return createInitialArtifactTypeAdapter();
			}
			@Override
			public Adapter caseInlineResource(InlineResource object) {
				return createInlineResourceAdapter();
			}
			@Override
			public Adapter caseItemCodesType(ItemCodesType object) {
				return createItemCodesTypeAdapter();
			}
			@Override
			public Adapter caseItemDefinition(ItemDefinition object) {
				return createItemDefinitionAdapter();
			}
			@Override
			public Adapter caseKeyTermsType(KeyTermsType object) {
				return createKeyTermsTypeAdapter();
			}
			@Override
			public Adapter caseKnowledgeDocument(KnowledgeDocument object) {
				return createKnowledgeDocumentAdapter();
			}
			@Override
			public Adapter caseKnowledgeResource(KnowledgeResource object) {
				return createKnowledgeResourceAdapter();
			}
			@Override
			public Adapter caseLibrariesType(LibrariesType object) {
				return createLibrariesTypeAdapter();
			}
			@Override
			public Adapter caseLibraryReference(LibraryReference object) {
				return createLibraryReferenceAdapter();
			}
			@Override
			public Adapter caseLookupConstraint(LookupConstraint object) {
				return createLookupConstraintAdapter();
			}
			@Override
			public Adapter caseManifest(Manifest object) {
				return createManifestAdapter();
			}
			@Override
			public Adapter caseMappingType(MappingType object) {
				return createMappingTypeAdapter();
			}
			@Override
			public Adapter caseMaskConstraint(MaskConstraint object) {
				return createMaskConstraintAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseMetadataBinding(MetadataBinding object) {
				return createMetadataBindingAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseNamedEventDef(NamedEventDef object) {
				return createNamedEventDefAdapter();
			}
			@Override
			public Adapter caseNamedEventTrigger(NamedEventTrigger object) {
				return createNamedEventTriggerAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter casePeriodicEventTrigger(PeriodicEventTrigger object) {
				return createPeriodicEventTriggerAdapter();
			}
			@Override
			public Adapter casePermissionsType(PermissionsType object) {
				return createPermissionsTypeAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePrecheckBehavior(PrecheckBehavior object) {
				return createPrecheckBehaviorAdapter();
			}
			@Override
			public Adapter casePublishersType(PublishersType object) {
				return createPublishersTypeAdapter();
			}
			@Override
			public Adapter caseRangeConstraint(RangeConstraint object) {
				return createRangeConstraintAdapter();
			}
			@Override
			public Adapter caseReadOnlyBehavior(ReadOnlyBehavior object) {
				return createReadOnlyBehaviorAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseReferencedModelType(ReferencedModelType object) {
				return createReferencedModelTypeAdapter();
			}
			@Override
			public Adapter caseReferenceList(ReferenceList object) {
				return createReferenceListAdapter();
			}
			@Override
			public Adapter caseRelatedResourcesType(RelatedResourcesType object) {
				return createRelatedResourcesTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRemoveAction(RemoveAction object) {
				return createRemoveActionAdapter();
			}
			@Override
			public Adapter caseRepresentedConceptsType(RepresentedConceptsType object) {
				return createRepresentedConceptsTypeAdapter();
			}
			@Override
			public Adapter caseRequiredBehavior(RequiredBehavior object) {
				return createRequiredBehaviorAdapter();
			}
			@Override
			public Adapter caseResourceRelationshipReference(ResourceRelationshipReference object) {
				return createResourceRelationshipReferenceAdapter();
			}
			@Override
			public Adapter caseResourcesType(ResourcesType object) {
				return createResourcesTypeAdapter();
			}
			@Override
			public Adapter caseResponseBinding(ResponseBinding object) {
				return createResponseBindingAdapter();
			}
			@Override
			public Adapter caseResponseCardinalityType(ResponseCardinalityType object) {
				return createResponseCardinalityTypeAdapter();
			}
			@Override
			public Adapter caseResponseDataTypeType(ResponseDataTypeType object) {
				return createResponseDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseRightsDeclaration(RightsDeclaration object) {
				return createRightsDeclarationAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseSpecificEventBinding(SpecificEventBinding object) {
				return createSpecificEventBindingAdapter();
			}
			@Override
			public Adapter caseSpecificMetadataBinding(SpecificMetadataBinding object) {
				return createSpecificMetadataBindingAdapter();
			}
			@Override
			public Adapter caseStatusType(StatusType object) {
				return createStatusTypeAdapter();
			}
			@Override
			public Adapter caseSubElementsType(SubElementsType object) {
				return createSubElementsTypeAdapter();
			}
			@Override
			public Adapter caseSupportingEvidence(SupportingEvidence object) {
				return createSupportingEvidenceAdapter();
			}
			@Override
			public Adapter caseSupportingResource(SupportingResource object) {
				return createSupportingResourceAdapter();
			}
			@Override
			public Adapter caseTemplateIdsType(TemplateIdsType object) {
				return createTemplateIdsTypeAdapter();
			}
			@Override
			public Adapter caseTemplateIdsType1(TemplateIdsType1 object) {
				return createTemplateIdsType1Adapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseTriggerBindings(TriggerBindings object) {
				return createTriggerBindingsAdapter();
			}
			@Override
			public Adapter caseTriggers(Triggers object) {
				return createTriggersAdapter();
			}
			@Override
			public Adapter caseUpdateAction(UpdateAction object) {
				return createUpdateActionAdapter();
			}
			@Override
			public Adapter caseUrlType(UrlType object) {
				return createUrlTypeAdapter();
			}
			@Override
			public Adapter caseUsageTermsType(UsageTermsType object) {
				return createUsageTermsTypeAdapter();
			}
			@Override
			public Adapter caseUuidType(UuidType object) {
				return createUuidTypeAdapter();
			}
			@Override
			public Adapter caseValueSetConstraint(ValueSetConstraint object) {
				return createValueSetConstraintAdapter();
			}
			@Override
			public Adapter caseVersionedIdentifier(VersionedIdentifier object) {
				return createVersionedIdentifierAdapter();
			}
			@Override
			public Adapter caseVisualStyleBehavior(VisualStyleBehavior object) {
				return createVisualStyleBehaviorAdapter();
			}
			@Override
			public Adapter caseWrappedContent(WrappedContent object) {
				return createWrappedContentAdapter();
			}
			@Override
			public Adapter caseHXIT(HXIT object) {
				return createHXITAdapter();
			}
			@Override
			public Adapter caseANY(ANY object) {
				return createANYAdapter();
			}
			@Override
			public Adapter caseII(II object) {
				return createIIAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ActionBase <em>Action Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase
	 * @generated
	 */
	public Adapter createActionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup
	 * @generated
	 */
	public Adapter createActionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ActionRef
	 * @generated
	 */
	public Adapter createActionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ActorsType <em>Actors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ActorsType
	 * @generated
	 */
	public Adapter createActorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.AddressesType <em>Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.AddressesType
	 * @generated
	 */
	public Adapter createAddressesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ApplicabilityType <em>Applicability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ApplicabilityType
	 * @generated
	 */
	public Adapter createApplicabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent
	 * @generated
	 */
	public Adapter createArtifactLifeCycleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary <em>Artifact Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary
	 * @generated
	 */
	public Adapter createArtifactSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType <em>Artifact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType
	 * @generated
	 */
	public Adapter createArtifactTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1 <em>Artifact Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType1
	 * @generated
	 */
	public Adapter createArtifactTypeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.AtomicAction
	 * @generated
	 */
	public Adapter createAtomicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Behaviors
	 * @generated
	 */
	public Adapter createBehaviorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.BindingModelType <em>Binding Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType
	 * @generated
	 */
	public Adapter createBindingModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.BindingModelType1 <em>Binding Model Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType1
	 * @generated
	 */
	public Adapter createBindingModelType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.BindingNameType <em>Binding Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.BindingNameType
	 * @generated
	 */
	public Adapter createBindingNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.BindingType
	 * @generated
	 */
	public Adapter createBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.BindingTypeType <em>Binding Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.BindingTypeType
	 * @generated
	 */
	public Adapter createBindingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.CardinalityBehavior <em>Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehavior
	 * @generated
	 */
	public Adapter createCardinalityBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.CategoriesType
	 * @generated
	 */
	public Adapter createCategoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.CodesType <em>Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.CodesType
	 * @generated
	 */
	public Adapter createCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Coding
	 * @generated
	 */
	public Adapter createCodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction <em>Collect Information Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.CollectInformationAction
	 * @generated
	 */
	public Adapter createCollectInformationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Completion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Completion
	 * @generated
	 */
	public Adapter createCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding <em>Component Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding
	 * @generated
	 */
	public Adapter createComponentEventBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings <em>Component Event Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventMappings
	 * @generated
	 */
	public Adapter createComponentEventMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType1 <em>Condition Role Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType1
	 * @generated
	 */
	public Adapter createConditionRoleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Conditions
	 * @generated
	 */
	public Adapter createConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ConstraintTypeType <em>Constraint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ConstraintTypeType
	 * @generated
	 */
	public Adapter createConstraintTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContactsType <em>Contacts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContactsType
	 * @generated
	 */
	public Adapter createContactsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact <em>Contained Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact
	 * @generated
	 */
	public Adapter createContainedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContainedArtifactList <em>Contained Artifact List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifactList
	 * @generated
	 */
	public Adapter createContainedArtifactListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContentHashType <em>Content Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContentHashType
	 * @generated
	 */
	public Adapter createContentHashTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContentSignifier <em>Content Signifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContentSignifier
	 * @generated
	 */
	public Adapter createContentSignifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContentType
	 * @generated
	 */
	public Adapter createContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ContributionsType <em>Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ContributionsType
	 * @generated
	 */
	public Adapter createContributionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ControlBlock <em>Control Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock
	 * @generated
	 */
	public Adapter createControlBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ControllingArtifactType <em>Controlling Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ControllingArtifactType
	 * @generated
	 */
	public Adapter createControllingArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.CreateAction
	 * @generated
	 */
	public Adapter createCreateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger <em>Data Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.DataEventTrigger
	 * @generated
	 */
	public Adapter createDataEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.DataModelsType <em>Data Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.DataModelsType
	 * @generated
	 */
	public Adapter createDataModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction <em>Declare Response Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.DeclareResponseAction
	 * @generated
	 */
	public Adapter createDeclareResponseActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.DocumentationItem <em>Documentation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem
	 * @generated
	 */
	public Adapter createDocumentationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationConstraint
	 * @generated
	 */
	public Adapter createEnumerationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem
	 * @generated
	 */
	public Adapter createEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventBinding <em>Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding
	 * @generated
	 */
	public Adapter createEventBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventBindingTypeType <em>Event Binding Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventBindingTypeType
	 * @generated
	 */
	public Adapter createEventBindingTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventDefType <em>Event Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventDefType
	 * @generated
	 */
	public Adapter createEventDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventHistoryType <em>Event History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventHistoryType
	 * @generated
	 */
	public Adapter createEventHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventNameType <em>Event Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventNameType
	 * @generated
	 */
	public Adapter createEventNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.EventTypeType
	 * @generated
	 */
	public Adapter createEventTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionConstraint
	 * @generated
	 */
	public Adapter createExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ExpressionsType <em>Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionsType
	 * @generated
	 */
	public Adapter createExpressionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ExternalDataType <em>External Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType
	 * @generated
	 */
	public Adapter createExternalDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.FireEventAction <em>Fire Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.FireEventAction
	 * @generated
	 */
	public Adapter createFireEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.FocusType <em>Focus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.FocusType
	 * @generated
	 */
	public Adapter createFocusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.FormattedNumber <em>Formatted Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.FormattedNumber
	 * @generated
	 */
	public Adapter createFormattedNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.FormattedText
	 * @generated
	 */
	public Adapter createFormattedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.GroupOrganizationBehavior <em>Group Organization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehavior
	 * @generated
	 */
	public Adapter createGroupOrganizationBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.GroupSelectionBehavior <em>Group Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehavior
	 * @generated
	 */
	public Adapter createGroupSelectionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType
	 * @generated
	 */
	public Adapter createIdentifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType1 <em>Identifiers Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType1
	 * @generated
	 */
	public Adapter createIdentifiersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType2 <em>Identifiers Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType2
	 * @generated
	 */
	public Adapter createIdentifiersType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.InitialArtifactType <em>Initial Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.InitialArtifactType
	 * @generated
	 */
	public Adapter createInitialArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.InlineResource <em>Inline Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.InlineResource
	 * @generated
	 */
	public Adapter createInlineResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ItemCodesType <em>Item Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ItemCodesType
	 * @generated
	 */
	public Adapter createItemCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ItemDefinition
	 * @generated
	 */
	public Adapter createItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.KeyTermsType <em>Key Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.KeyTermsType
	 * @generated
	 */
	public Adapter createKeyTermsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument
	 * @generated
	 */
	public Adapter createKnowledgeDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource <em>Knowledge Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource
	 * @generated
	 */
	public Adapter createKnowledgeResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.LibrariesType <em>Libraries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.LibrariesType
	 * @generated
	 */
	public Adapter createLibrariesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference
	 * @generated
	 */
	public Adapter createLibraryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.LookupConstraint <em>Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.LookupConstraint
	 * @generated
	 */
	public Adapter createLookupConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Manifest
	 * @generated
	 */
	public Adapter createManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.MappingType
	 * @generated
	 */
	public Adapter createMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.MaskConstraint <em>Mask Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.MaskConstraint
	 * @generated
	 */
	public Adapter createMaskConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.MetadataBinding <em>Metadata Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBinding
	 * @generated
	 */
	public Adapter createMetadataBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.NamedEventDef <em>Named Event Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventDef
	 * @generated
	 */
	public Adapter createNamedEventDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.NamedEventTrigger <em>Named Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventTrigger
	 * @generated
	 */
	public Adapter createNamedEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.PeriodicEventTrigger <em>Periodic Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.PeriodicEventTrigger
	 * @generated
	 */
	public Adapter createPeriodicEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.PermissionsType <em>Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.PermissionsType
	 * @generated
	 */
	public Adapter createPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.PrecheckBehavior <em>Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehavior
	 * @generated
	 */
	public Adapter createPrecheckBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.PublishersType <em>Publishers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.PublishersType
	 * @generated
	 */
	public Adapter createPublishersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraint
	 * @generated
	 */
	public Adapter createRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ReadOnlyBehavior <em>Read Only Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ReadOnlyBehavior
	 * @generated
	 */
	public Adapter createReadOnlyBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ReferencedModelType <em>Referenced Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ReferencedModelType
	 * @generated
	 */
	public Adapter createReferencedModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ReferenceList <em>Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ReferenceList
	 * @generated
	 */
	public Adapter createReferenceListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RelatedResourcesType <em>Related Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RelatedResourcesType
	 * @generated
	 */
	public Adapter createRelatedResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RemoveAction
	 * @generated
	 */
	public Adapter createRemoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RepresentedConceptsType <em>Represented Concepts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RepresentedConceptsType
	 * @generated
	 */
	public Adapter createRepresentedConceptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RequiredBehavior <em>Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehavior
	 * @generated
	 */
	public Adapter createRequiredBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipReference <em>Resource Relationship Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipReference
	 * @generated
	 */
	public Adapter createResourceRelationshipReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ResourcesType
	 * @generated
	 */
	public Adapter createResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ResponseBinding
	 * @generated
	 */
	public Adapter createResponseBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ResponseCardinalityType <em>Response Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ResponseCardinalityType
	 * @generated
	 */
	public Adapter createResponseCardinalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ResponseDataTypeType <em>Response Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ResponseDataTypeType
	 * @generated
	 */
	public Adapter createResponseDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RightsDeclaration
	 * @generated
	 */
	public Adapter createRightsDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding <em>Specific Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding
	 * @generated
	 */
	public Adapter createSpecificEventBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding <em>Specific Metadata Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.SpecificMetadataBinding
	 * @generated
	 */
	public Adapter createSpecificMetadataBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.StatusType
	 * @generated
	 */
	public Adapter createStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.SubElementsType <em>Sub Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType
	 * @generated
	 */
	public Adapter createSubElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.SupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.SupportingEvidence
	 * @generated
	 */
	public Adapter createSupportingEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.SupportingResource <em>Supporting Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.SupportingResource
	 * @generated
	 */
	public Adapter createSupportingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType <em>Template Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType
	 * @generated
	 */
	public Adapter createTemplateIdsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType1 <em>Template Ids Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType1
	 * @generated
	 */
	public Adapter createTemplateIdsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.TriggerBindings <em>Trigger Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.TriggerBindings
	 * @generated
	 */
	public Adapter createTriggerBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.Triggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.Triggers
	 * @generated
	 */
	public Adapter createTriggersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.UpdateAction
	 * @generated
	 */
	public Adapter createUpdateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.UrlType
	 * @generated
	 */
	public Adapter createUrlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.UsageTermsType <em>Usage Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.UsageTermsType
	 * @generated
	 */
	public Adapter createUsageTermsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.UuidType <em>Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.UuidType
	 * @generated
	 */
	public Adapter createUuidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.VersionedIdentifier <em>Versioned Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.VersionedIdentifier
	 * @generated
	 */
	public Adapter createVersionedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.VisualStyleBehavior <em>Visual Style Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.VisualStyleBehavior
	 * @generated
	 */
	public Adapter createVisualStyleBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r2.WrappedContent <em>Wrapped Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r2.WrappedContent
	 * @generated
	 */
	public Adapter createWrappedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.HXIT <em>HXIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.HXIT
	 * @generated
	 */
	public Adapter createHXITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ANY
	 * @generated
	 */
	public Adapter createANYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.II <em>II</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.II
	 * @generated
	 */
	public Adapter createIIAdapter() {
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

} //R2AdapterFactory
