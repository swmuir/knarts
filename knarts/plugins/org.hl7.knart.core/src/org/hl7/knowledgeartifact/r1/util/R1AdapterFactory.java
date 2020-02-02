/**
 */
package org.hl7.knowledgeartifact.r1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.ANY;
import org.hl7.cdsdt.r2.HXIT;
import org.hl7.cdsdt.r2.II;

import org.hl7.knowledgeartifact.r1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package
 * @generated
 */
public class R1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = R1Package.eINSTANCE;
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
	protected R1Switch<Adapter> modelSwitch =
		new R1Switch<Adapter>() {
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
			public Adapter caseArtifactTypeType(ArtifactTypeType object) {
				return createArtifactTypeTypeAdapter();
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
			public Adapter caseCollectInformationAction(CollectInformationAction object) {
				return createCollectInformationActionAdapter();
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
			public Adapter caseContentType(ContentType object) {
				return createContentTypeAdapter();
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
			public Adapter caseEventHistoryType(EventHistoryType object) {
				return createEventHistoryTypeAdapter();
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
			public Adapter caseMaskConstraint(MaskConstraint object) {
				return createMaskConstraintAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseNamedEventTrigger(NamedEventTrigger object) {
				return createNamedEventTriggerAdapter();
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
			public Adapter caseReferencedModelType(ReferencedModelType object) {
				return createReferencedModelTypeAdapter();
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
			public Adapter caseTriggers(Triggers object) {
				return createTriggersAdapter();
			}
			@Override
			public Adapter caseUpdateAction(UpdateAction object) {
				return createUpdateActionAdapter();
			}
			@Override
			public Adapter caseUsageTermsType(UsageTermsType object) {
				return createUsageTermsTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ActionBase <em>Action Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase
	 * @generated
	 */
	public Adapter createActionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup
	 * @generated
	 */
	public Adapter createActionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ActionRef
	 * @generated
	 */
	public Adapter createActionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ActorsType <em>Actors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ActorsType
	 * @generated
	 */
	public Adapter createActorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.AddressesType <em>Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.AddressesType
	 * @generated
	 */
	public Adapter createAddressesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ApplicabilityType <em>Applicability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ApplicabilityType
	 * @generated
	 */
	public Adapter createApplicabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent
	 * @generated
	 */
	public Adapter createArtifactLifeCycleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ArtifactTypeType <em>Artifact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactTypeType
	 * @generated
	 */
	public Adapter createArtifactTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.AtomicAction
	 * @generated
	 */
	public Adapter createAtomicActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Behaviors
	 * @generated
	 */
	public Adapter createBehaviorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.CardinalityBehavior <em>Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehavior
	 * @generated
	 */
	public Adapter createCardinalityBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.CategoriesType
	 * @generated
	 */
	public Adapter createCategoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.CodesType <em>Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.CodesType
	 * @generated
	 */
	public Adapter createCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.CollectInformationAction <em>Collect Information Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.CollectInformationAction
	 * @generated
	 */
	public Adapter createCollectInformationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType1 <em>Condition Role Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType1
	 * @generated
	 */
	public Adapter createConditionRoleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Conditions
	 * @generated
	 */
	public Adapter createConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ConstraintTypeType <em>Constraint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ConstraintTypeType
	 * @generated
	 */
	public Adapter createConstraintTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ContactsType <em>Contacts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ContactsType
	 * @generated
	 */
	public Adapter createContactsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ContentType
	 * @generated
	 */
	public Adapter createContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ContributionsType <em>Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ContributionsType
	 * @generated
	 */
	public Adapter createContributionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Coverage
	 * @generated
	 */
	public Adapter createCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.CreateAction
	 * @generated
	 */
	public Adapter createCreateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.DataEventTrigger <em>Data Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.DataEventTrigger
	 * @generated
	 */
	public Adapter createDataEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.DataModelsType <em>Data Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.DataModelsType
	 * @generated
	 */
	public Adapter createDataModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.DeclareResponseAction <em>Declare Response Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.DeclareResponseAction
	 * @generated
	 */
	public Adapter createDeclareResponseActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.DocumentationItem <em>Documentation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem
	 * @generated
	 */
	public Adapter createDocumentationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationConstraint
	 * @generated
	 */
	public Adapter createEnumerationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem
	 * @generated
	 */
	public Adapter createEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.EventHistoryType <em>Event History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.EventHistoryType
	 * @generated
	 */
	public Adapter createEventHistoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.EventTypeType
	 * @generated
	 */
	public Adapter createEventTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionConstraint
	 * @generated
	 */
	public Adapter createExpressionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ExpressionsType <em>Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionsType
	 * @generated
	 */
	public Adapter createExpressionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ExternalDataType <em>External Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType
	 * @generated
	 */
	public Adapter createExternalDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.FireEventAction <em>Fire Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.FireEventAction
	 * @generated
	 */
	public Adapter createFireEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.FocusType <em>Focus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.FocusType
	 * @generated
	 */
	public Adapter createFocusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.FormattedNumber <em>Formatted Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.FormattedNumber
	 * @generated
	 */
	public Adapter createFormattedNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.FormattedText
	 * @generated
	 */
	public Adapter createFormattedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehavior <em>Group Organization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehavior
	 * @generated
	 */
	public Adapter createGroupOrganizationBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehavior <em>Group Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehavior
	 * @generated
	 */
	public Adapter createGroupSelectionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType
	 * @generated
	 */
	public Adapter createIdentifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.IdentifiersType1 <em>Identifiers Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType1
	 * @generated
	 */
	public Adapter createIdentifiersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.InlineResource <em>Inline Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.InlineResource
	 * @generated
	 */
	public Adapter createInlineResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ItemCodesType <em>Item Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ItemCodesType
	 * @generated
	 */
	public Adapter createItemCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ItemDefinition
	 * @generated
	 */
	public Adapter createItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.KeyTermsType <em>Key Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.KeyTermsType
	 * @generated
	 */
	public Adapter createKeyTermsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument
	 * @generated
	 */
	public Adapter createKnowledgeDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource <em>Knowledge Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource
	 * @generated
	 */
	public Adapter createKnowledgeResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.LibrariesType <em>Libraries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.LibrariesType
	 * @generated
	 */
	public Adapter createLibrariesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference
	 * @generated
	 */
	public Adapter createLibraryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.LookupConstraint <em>Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.LookupConstraint
	 * @generated
	 */
	public Adapter createLookupConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.MaskConstraint <em>Mask Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.MaskConstraint
	 * @generated
	 */
	public Adapter createMaskConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.NamedEventTrigger <em>Named Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.NamedEventTrigger
	 * @generated
	 */
	public Adapter createNamedEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.PeriodicEventTrigger <em>Periodic Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.PeriodicEventTrigger
	 * @generated
	 */
	public Adapter createPeriodicEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.PermissionsType <em>Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.PermissionsType
	 * @generated
	 */
	public Adapter createPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.PrecheckBehavior <em>Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehavior
	 * @generated
	 */
	public Adapter createPrecheckBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.PublishersType <em>Publishers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.PublishersType
	 * @generated
	 */
	public Adapter createPublishersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraint
	 * @generated
	 */
	public Adapter createRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ReadOnlyBehavior <em>Read Only Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ReadOnlyBehavior
	 * @generated
	 */
	public Adapter createReadOnlyBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ReferencedModelType <em>Referenced Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ReferencedModelType
	 * @generated
	 */
	public Adapter createReferencedModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RelatedResourcesType <em>Related Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RelatedResourcesType
	 * @generated
	 */
	public Adapter createRelatedResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RemoveAction
	 * @generated
	 */
	public Adapter createRemoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RepresentedConceptsType <em>Represented Concepts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RepresentedConceptsType
	 * @generated
	 */
	public Adapter createRepresentedConceptsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RequiredBehavior <em>Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehavior
	 * @generated
	 */
	public Adapter createRequiredBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference <em>Resource Relationship Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipReference
	 * @generated
	 */
	public Adapter createResourceRelationshipReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ResourcesType
	 * @generated
	 */
	public Adapter createResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ResponseBinding
	 * @generated
	 */
	public Adapter createResponseBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ResponseCardinalityType <em>Response Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ResponseCardinalityType
	 * @generated
	 */
	public Adapter createResponseCardinalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType <em>Response Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ResponseDataTypeType
	 * @generated
	 */
	public Adapter createResponseDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RightsDeclaration
	 * @generated
	 */
	public Adapter createRightsDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.StatusType
	 * @generated
	 */
	public Adapter createStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.SubElementsType <em>Sub Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType
	 * @generated
	 */
	public Adapter createSubElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.SupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.SupportingEvidence
	 * @generated
	 */
	public Adapter createSupportingEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.SupportingResource <em>Supporting Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.SupportingResource
	 * @generated
	 */
	public Adapter createSupportingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType <em>Template Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType
	 * @generated
	 */
	public Adapter createTemplateIdsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType1 <em>Template Ids Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType1
	 * @generated
	 */
	public Adapter createTemplateIdsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.Triggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.Triggers
	 * @generated
	 */
	public Adapter createTriggersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.UpdateAction
	 * @generated
	 */
	public Adapter createUpdateActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.UsageTermsType <em>Usage Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.UsageTermsType
	 * @generated
	 */
	public Adapter createUsageTermsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.VersionedIdentifier <em>Versioned Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.VersionedIdentifier
	 * @generated
	 */
	public Adapter createVersionedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.knowledgeartifact.r1.VisualStyleBehavior <em>Visual Style Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.knowledgeartifact.r1.VisualStyleBehavior
	 * @generated
	 */
	public Adapter createVisualStyleBehaviorAdapter() {
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

} //R1AdapterFactory
