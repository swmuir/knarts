/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hl7.knowledgeartifact.r2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R2FactoryImpl extends EFactoryImpl implements R2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static R2Factory init() {
		try {
			R2Factory theR2Factory = (R2Factory)EPackage.Registry.INSTANCE.getEFactory(R2Package.eNS_URI);
			if (theR2Factory != null) {
				return theR2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new R2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case R2Package.ACTION_GROUP: return createActionGroup();
			case R2Package.ACTION_REF: return createActionRef();
			case R2Package.ACTOR: return createActor();
			case R2Package.ACTORS_TYPE: return createActorsType();
			case R2Package.ADDRESSES_TYPE: return createAddressesType();
			case R2Package.APPLICABILITY_TYPE: return createApplicabilityType();
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT: return createArtifactLifeCycleEvent();
			case R2Package.ARTIFACT_SUMMARY: return createArtifactSummary();
			case R2Package.ARTIFACT_TYPE_TYPE: return createArtifactTypeType();
			case R2Package.ARTIFACT_TYPE_TYPE1: return createArtifactTypeType1();
			case R2Package.BEHAVIORS: return createBehaviors();
			case R2Package.BINDING_MODEL_TYPE: return createBindingModelType();
			case R2Package.BINDING_MODEL_TYPE1: return createBindingModelType1();
			case R2Package.BINDING_NAME_TYPE: return createBindingNameType();
			case R2Package.BINDING_TYPE: return createBindingType();
			case R2Package.BINDING_TYPE_TYPE: return createBindingTypeType();
			case R2Package.CARDINALITY_BEHAVIOR: return createCardinalityBehavior();
			case R2Package.CATEGORIES_TYPE: return createCategoriesType();
			case R2Package.CODES_TYPE: return createCodesType();
			case R2Package.CODING: return createCoding();
			case R2Package.COLLECT_INFORMATION_ACTION: return createCollectInformationAction();
			case R2Package.COMPLETION: return createCompletion();
			case R2Package.COMPONENT_EVENT_BINDING: return createComponentEventBinding();
			case R2Package.COMPONENT_EVENT_MAPPINGS: return createComponentEventMappings();
			case R2Package.COMPOSITE: return createComposite();
			case R2Package.CONDITION: return createCondition();
			case R2Package.CONDITION_ROLE_TYPE1: return createConditionRoleType1();
			case R2Package.CONDITIONS: return createConditions();
			case R2Package.CONSTRAINT_TYPE_TYPE: return createConstraintTypeType();
			case R2Package.CONTACTS_TYPE: return createContactsType();
			case R2Package.CONTAINED_ARTIFACT: return createContainedArtifact();
			case R2Package.CONTAINED_ARTIFACT_LIST: return createContainedArtifactList();
			case R2Package.CONTENT_HASH_TYPE: return createContentHashType();
			case R2Package.CONTENT_SIGNIFIER: return createContentSignifier();
			case R2Package.CONTENT_TYPE: return createContentType();
			case R2Package.CONTEXT: return createContext();
			case R2Package.CONTRIBUTION: return createContribution();
			case R2Package.CONTRIBUTIONS_TYPE: return createContributionsType();
			case R2Package.CONTROL_BLOCK: return createControlBlock();
			case R2Package.CONTROLLING_ARTIFACT_TYPE: return createControllingArtifactType();
			case R2Package.COVERAGE: return createCoverage();
			case R2Package.CREATE_ACTION: return createCreateAction();
			case R2Package.DATA_EVENT_TRIGGER: return createDataEventTrigger();
			case R2Package.DATA_MODELS_TYPE: return createDataModelsType();
			case R2Package.DECLARE_RESPONSE_ACTION: return createDeclareResponseAction();
			case R2Package.DOCUMENTATION_ITEM: return createDocumentationItem();
			case R2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case R2Package.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
			case R2Package.ENUMERATION_ITEM: return createEnumerationItem();
			case R2Package.EVENT_BINDING: return createEventBinding();
			case R2Package.EVENT_BINDING_TYPE_TYPE: return createEventBindingTypeType();
			case R2Package.EVENT_DEF_TYPE: return createEventDefType();
			case R2Package.EVENT_HISTORY_TYPE: return createEventHistoryType();
			case R2Package.EVENT_NAME_TYPE: return createEventNameType();
			case R2Package.EVENT_TYPE_TYPE: return createEventTypeType();
			case R2Package.EVIDENCE: return createEvidence();
			case R2Package.EXPRESSION_CONSTRAINT: return createExpressionConstraint();
			case R2Package.EXPRESSIONS_TYPE: return createExpressionsType();
			case R2Package.EXTERNAL_DATA_TYPE: return createExternalDataType();
			case R2Package.FIRE_EVENT_ACTION: return createFireEventAction();
			case R2Package.FOCUS_TYPE: return createFocusType();
			case R2Package.FORMATTED_NUMBER: return createFormattedNumber();
			case R2Package.FORMATTED_TEXT: return createFormattedText();
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR: return createGroupOrganizationBehavior();
			case R2Package.GROUP_SELECTION_BEHAVIOR: return createGroupSelectionBehavior();
			case R2Package.IDENTIFIERS_TYPE: return createIdentifiersType();
			case R2Package.IDENTIFIERS_TYPE1: return createIdentifiersType1();
			case R2Package.IDENTIFIERS_TYPE2: return createIdentifiersType2();
			case R2Package.INITIAL_ARTIFACT_TYPE: return createInitialArtifactType();
			case R2Package.INLINE_RESOURCE: return createInlineResource();
			case R2Package.ITEM_CODES_TYPE: return createItemCodesType();
			case R2Package.KEY_TERMS_TYPE: return createKeyTermsType();
			case R2Package.KNOWLEDGE_DOCUMENT: return createKnowledgeDocument();
			case R2Package.KNOWLEDGE_RESOURCE: return createKnowledgeResource();
			case R2Package.LIBRARIES_TYPE: return createLibrariesType();
			case R2Package.LIBRARY_REFERENCE: return createLibraryReference();
			case R2Package.LOOKUP_CONSTRAINT: return createLookupConstraint();
			case R2Package.MANIFEST: return createManifest();
			case R2Package.MAPPING_TYPE: return createMappingType();
			case R2Package.MASK_CONSTRAINT: return createMaskConstraint();
			case R2Package.METADATA: return createMetadata();
			case R2Package.METADATA_BINDING: return createMetadataBinding();
			case R2Package.MODEL_REFERENCE: return createModelReference();
			case R2Package.NAMED_EVENT_DEF: return createNamedEventDef();
			case R2Package.NAMED_EVENT_TRIGGER: return createNamedEventTrigger();
			case R2Package.NAME_TYPE: return createNameType();
			case R2Package.ORGANIZATION: return createOrganization();
			case R2Package.PERIODIC_EVENT_TRIGGER: return createPeriodicEventTrigger();
			case R2Package.PERMISSIONS_TYPE: return createPermissionsType();
			case R2Package.PERSON: return createPerson();
			case R2Package.PRECHECK_BEHAVIOR: return createPrecheckBehavior();
			case R2Package.PUBLISHERS_TYPE: return createPublishersType();
			case R2Package.READ_ONLY_BEHAVIOR: return createReadOnlyBehavior();
			case R2Package.REFERENCE: return createReference();
			case R2Package.REFERENCED_MODEL_TYPE: return createReferencedModelType();
			case R2Package.REFERENCE_LIST: return createReferenceList();
			case R2Package.RELATED_RESOURCES_TYPE: return createRelatedResourcesType();
			case R2Package.RELATIONSHIP_TYPE: return createRelationshipType();
			case R2Package.REMOVE_ACTION: return createRemoveAction();
			case R2Package.REPRESENTED_CONCEPTS_TYPE: return createRepresentedConceptsType();
			case R2Package.REQUIRED_BEHAVIOR: return createRequiredBehavior();
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE: return createResourceRelationshipReference();
			case R2Package.RESOURCES_TYPE: return createResourcesType();
			case R2Package.RESPONSE_BINDING: return createResponseBinding();
			case R2Package.RESPONSE_CARDINALITY_TYPE: return createResponseCardinalityType();
			case R2Package.RESPONSE_DATA_TYPE_TYPE: return createResponseDataTypeType();
			case R2Package.RIGHTS_DECLARATION: return createRightsDeclaration();
			case R2Package.ROLE_TYPE: return createRoleType();
			case R2Package.SPECIFIC_EVENT_BINDING: return createSpecificEventBinding();
			case R2Package.SPECIFIC_METADATA_BINDING: return createSpecificMetadataBinding();
			case R2Package.STATUS_TYPE: return createStatusType();
			case R2Package.SUB_ELEMENTS_TYPE: return createSubElementsType();
			case R2Package.SUPPORTING_EVIDENCE: return createSupportingEvidence();
			case R2Package.SUPPORTING_RESOURCE: return createSupportingResource();
			case R2Package.TEMPLATE_IDS_TYPE: return createTemplateIdsType();
			case R2Package.TEMPLATE_IDS_TYPE1: return createTemplateIdsType1();
			case R2Package.TRIGGER_BINDINGS: return createTriggerBindings();
			case R2Package.TRIGGERS: return createTriggers();
			case R2Package.UPDATE_ACTION: return createUpdateAction();
			case R2Package.URL_TYPE: return createUrlType();
			case R2Package.USAGE_TERMS_TYPE: return createUsageTermsType();
			case R2Package.UUID_TYPE: return createUuidType();
			case R2Package.VALUE_SET_CONSTRAINT: return createValueSetConstraint();
			case R2Package.VERSIONED_IDENTIFIER: return createVersionedIdentifier();
			case R2Package.VISUAL_STYLE_BEHAVIOR: return createVisualStyleBehavior();
			case R2Package.WRAPPED_CONTENT: return createWrappedContent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE:
				return createArtifactLifeCycleEventTypeFromString(eDataType, initialValue);
			case R2Package.ARTIFACT_STATUS_TYPE:
				return createArtifactStatusTypeFromString(eDataType, initialValue);
			case R2Package.ARTIFACT_TYPE:
				return createArtifactTypeFromString(eDataType, initialValue);
			case R2Package.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case R2Package.CARDINALITY_BEHAVIOR_TYPE:
				return createCardinalityBehaviorTypeFromString(eDataType, initialValue);
			case R2Package.COMPOND_ARTIFACT_TYPE:
				return createCompondArtifactTypeFromString(eDataType, initialValue);
			case R2Package.CONDITION_ROLE_TYPE:
				return createConditionRoleTypeFromString(eDataType, initialValue);
			case R2Package.CONTRIBUTOR_TYPE:
				return createContributorTypeFromString(eDataType, initialValue);
			case R2Package.COVERAGE_TYPE:
				return createCoverageTypeFromString(eDataType, initialValue);
			case R2Package.DATA_EVENT_TYPE:
				return createDataEventTypeFromString(eDataType, initialValue);
			case R2Package.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE:
				return createGroupOrganizationBehaviorTypeFromString(eDataType, initialValue);
			case R2Package.GROUP_SELECTION_BEHAVIOR_TYPE:
				return createGroupSelectionBehaviorTypeFromString(eDataType, initialValue);
			case R2Package.METADATA_BINDING_TYPE:
				return createMetadataBindingTypeFromString(eDataType, initialValue);
			case R2Package.PRECHECK_BEHAVIOR_TYPE:
				return createPrecheckBehaviorTypeFromString(eDataType, initialValue);
			case R2Package.RANGE_CONSTRAINT_TYPE:
				return createRangeConstraintTypeFromString(eDataType, initialValue);
			case R2Package.REQUIRED_BEHAVIOR_TYPE:
				return createRequiredBehaviorTypeFromString(eDataType, initialValue);
			case R2Package.RESOURCE_RELATIONSHIP_TYPE:
				return createResourceRelationshipTypeFromString(eDataType, initialValue);
			case R2Package.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT:
				return createArtifactLifeCycleEventTypeObjectFromString(eDataType, initialValue);
			case R2Package.ARTIFACT_STATUS_TYPE_OBJECT:
				return createArtifactStatusTypeObjectFromString(eDataType, initialValue);
			case R2Package.ARTIFACT_TYPE_OBJECT:
				return createArtifactTypeObjectFromString(eDataType, initialValue);
			case R2Package.CARDINALITY_BEHAVIOR_TYPE_OBJECT:
				return createCardinalityBehaviorTypeObjectFromString(eDataType, initialValue);
			case R2Package.CARDINALITY_OBJECT:
				return createCardinalityObjectFromString(eDataType, initialValue);
			case R2Package.COMPOND_ARTIFACT_TYPE_OBJECT:
				return createCompondArtifactTypeObjectFromString(eDataType, initialValue);
			case R2Package.CONDITION_ROLE_TYPE_OBJECT:
				return createConditionRoleTypeObjectFromString(eDataType, initialValue);
			case R2Package.CONTRIBUTOR_TYPE_OBJECT:
				return createContributorTypeObjectFromString(eDataType, initialValue);
			case R2Package.COVERAGE_TYPE_OBJECT:
				return createCoverageTypeObjectFromString(eDataType, initialValue);
			case R2Package.DATA_EVENT_TYPE_OBJECT:
				return createDataEventTypeObjectFromString(eDataType, initialValue);
			case R2Package.EVENT_TYPE_OBJECT:
				return createEventTypeObjectFromString(eDataType, initialValue);
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT:
				return createGroupOrganizationBehaviorTypeObjectFromString(eDataType, initialValue);
			case R2Package.GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT:
				return createGroupSelectionBehaviorTypeObjectFromString(eDataType, initialValue);
			case R2Package.METADATA_BINDING_TYPE_OBJECT:
				return createMetadataBindingTypeObjectFromString(eDataType, initialValue);
			case R2Package.PRECHECK_BEHAVIOR_TYPE_OBJECT:
				return createPrecheckBehaviorTypeObjectFromString(eDataType, initialValue);
			case R2Package.RANGE_CONSTRAINT_TYPE_OBJECT:
				return createRangeConstraintTypeObjectFromString(eDataType, initialValue);
			case R2Package.REQUIRED_BEHAVIOR_TYPE_OBJECT:
				return createRequiredBehaviorTypeObjectFromString(eDataType, initialValue);
			case R2Package.RESOURCE_RELATIONSHIP_TYPE_OBJECT:
				return createResourceRelationshipTypeObjectFromString(eDataType, initialValue);
			case R2Package.VALUE_TYPE_OBJECT:
				return createValueTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE:
				return convertArtifactLifeCycleEventTypeToString(eDataType, instanceValue);
			case R2Package.ARTIFACT_STATUS_TYPE:
				return convertArtifactStatusTypeToString(eDataType, instanceValue);
			case R2Package.ARTIFACT_TYPE:
				return convertArtifactTypeToString(eDataType, instanceValue);
			case R2Package.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case R2Package.CARDINALITY_BEHAVIOR_TYPE:
				return convertCardinalityBehaviorTypeToString(eDataType, instanceValue);
			case R2Package.COMPOND_ARTIFACT_TYPE:
				return convertCompondArtifactTypeToString(eDataType, instanceValue);
			case R2Package.CONDITION_ROLE_TYPE:
				return convertConditionRoleTypeToString(eDataType, instanceValue);
			case R2Package.CONTRIBUTOR_TYPE:
				return convertContributorTypeToString(eDataType, instanceValue);
			case R2Package.COVERAGE_TYPE:
				return convertCoverageTypeToString(eDataType, instanceValue);
			case R2Package.DATA_EVENT_TYPE:
				return convertDataEventTypeToString(eDataType, instanceValue);
			case R2Package.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE:
				return convertGroupOrganizationBehaviorTypeToString(eDataType, instanceValue);
			case R2Package.GROUP_SELECTION_BEHAVIOR_TYPE:
				return convertGroupSelectionBehaviorTypeToString(eDataType, instanceValue);
			case R2Package.METADATA_BINDING_TYPE:
				return convertMetadataBindingTypeToString(eDataType, instanceValue);
			case R2Package.PRECHECK_BEHAVIOR_TYPE:
				return convertPrecheckBehaviorTypeToString(eDataType, instanceValue);
			case R2Package.RANGE_CONSTRAINT_TYPE:
				return convertRangeConstraintTypeToString(eDataType, instanceValue);
			case R2Package.REQUIRED_BEHAVIOR_TYPE:
				return convertRequiredBehaviorTypeToString(eDataType, instanceValue);
			case R2Package.RESOURCE_RELATIONSHIP_TYPE:
				return convertResourceRelationshipTypeToString(eDataType, instanceValue);
			case R2Package.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			case R2Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT:
				return convertArtifactLifeCycleEventTypeObjectToString(eDataType, instanceValue);
			case R2Package.ARTIFACT_STATUS_TYPE_OBJECT:
				return convertArtifactStatusTypeObjectToString(eDataType, instanceValue);
			case R2Package.ARTIFACT_TYPE_OBJECT:
				return convertArtifactTypeObjectToString(eDataType, instanceValue);
			case R2Package.CARDINALITY_BEHAVIOR_TYPE_OBJECT:
				return convertCardinalityBehaviorTypeObjectToString(eDataType, instanceValue);
			case R2Package.CARDINALITY_OBJECT:
				return convertCardinalityObjectToString(eDataType, instanceValue);
			case R2Package.COMPOND_ARTIFACT_TYPE_OBJECT:
				return convertCompondArtifactTypeObjectToString(eDataType, instanceValue);
			case R2Package.CONDITION_ROLE_TYPE_OBJECT:
				return convertConditionRoleTypeObjectToString(eDataType, instanceValue);
			case R2Package.CONTRIBUTOR_TYPE_OBJECT:
				return convertContributorTypeObjectToString(eDataType, instanceValue);
			case R2Package.COVERAGE_TYPE_OBJECT:
				return convertCoverageTypeObjectToString(eDataType, instanceValue);
			case R2Package.DATA_EVENT_TYPE_OBJECT:
				return convertDataEventTypeObjectToString(eDataType, instanceValue);
			case R2Package.EVENT_TYPE_OBJECT:
				return convertEventTypeObjectToString(eDataType, instanceValue);
			case R2Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT:
				return convertGroupOrganizationBehaviorTypeObjectToString(eDataType, instanceValue);
			case R2Package.GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT:
				return convertGroupSelectionBehaviorTypeObjectToString(eDataType, instanceValue);
			case R2Package.METADATA_BINDING_TYPE_OBJECT:
				return convertMetadataBindingTypeObjectToString(eDataType, instanceValue);
			case R2Package.PRECHECK_BEHAVIOR_TYPE_OBJECT:
				return convertPrecheckBehaviorTypeObjectToString(eDataType, instanceValue);
			case R2Package.RANGE_CONSTRAINT_TYPE_OBJECT:
				return convertRangeConstraintTypeObjectToString(eDataType, instanceValue);
			case R2Package.REQUIRED_BEHAVIOR_TYPE_OBJECT:
				return convertRequiredBehaviorTypeObjectToString(eDataType, instanceValue);
			case R2Package.RESOURCE_RELATIONSHIP_TYPE_OBJECT:
				return convertResourceRelationshipTypeObjectToString(eDataType, instanceValue);
			case R2Package.VALUE_TYPE_OBJECT:
				return convertValueTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRef createActionRef() {
		ActionRefImpl actionRef = new ActionRefImpl();
		return actionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorsType createActorsType() {
		ActorsTypeImpl actorsType = new ActorsTypeImpl();
		return actorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressesType createAddressesType() {
		AddressesTypeImpl addressesType = new AddressesTypeImpl();
		return addressesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicabilityType createApplicabilityType() {
		ApplicabilityTypeImpl applicabilityType = new ApplicabilityTypeImpl();
		return applicabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLifeCycleEvent createArtifactLifeCycleEvent() {
		ArtifactLifeCycleEventImpl artifactLifeCycleEvent = new ArtifactLifeCycleEventImpl();
		return artifactLifeCycleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSummary createArtifactSummary() {
		ArtifactSummaryImpl artifactSummary = new ArtifactSummaryImpl();
		return artifactSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTypeType createArtifactTypeType() {
		ArtifactTypeTypeImpl artifactTypeType = new ArtifactTypeTypeImpl();
		return artifactTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTypeType1 createArtifactTypeType1() {
		ArtifactTypeType1Impl artifactTypeType1 = new ArtifactTypeType1Impl();
		return artifactTypeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviors createBehaviors() {
		BehaviorsImpl behaviors = new BehaviorsImpl();
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModelType createBindingModelType() {
		BindingModelTypeImpl bindingModelType = new BindingModelTypeImpl();
		return bindingModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModelType1 createBindingModelType1() {
		BindingModelType1Impl bindingModelType1 = new BindingModelType1Impl();
		return bindingModelType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingNameType createBindingNameType() {
		BindingNameTypeImpl bindingNameType = new BindingNameTypeImpl();
		return bindingNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType createBindingType() {
		BindingTypeImpl bindingType = new BindingTypeImpl();
		return bindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingTypeType createBindingTypeType() {
		BindingTypeTypeImpl bindingTypeType = new BindingTypeTypeImpl();
		return bindingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityBehavior createCardinalityBehavior() {
		CardinalityBehaviorImpl cardinalityBehavior = new CardinalityBehaviorImpl();
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesType createCategoriesType() {
		CategoriesTypeImpl categoriesType = new CategoriesTypeImpl();
		return categoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesType createCodesType() {
		CodesTypeImpl codesType = new CodesTypeImpl();
		return codesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectInformationAction createCollectInformationAction() {
		CollectInformationActionImpl collectInformationAction = new CollectInformationActionImpl();
		return collectInformationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Completion createCompletion() {
		CompletionImpl completion = new CompletionImpl();
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentEventBinding createComponentEventBinding() {
		ComponentEventBindingImpl componentEventBinding = new ComponentEventBindingImpl();
		return componentEventBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentEventMappings createComponentEventMappings() {
		ComponentEventMappingsImpl componentEventMappings = new ComponentEventMappingsImpl();
		return componentEventMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRoleType1 createConditionRoleType1() {
		ConditionRoleType1Impl conditionRoleType1 = new ConditionRoleType1Impl();
		return conditionRoleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditions createConditions() {
		ConditionsImpl conditions = new ConditionsImpl();
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeType createConstraintTypeType() {
		ConstraintTypeTypeImpl constraintTypeType = new ConstraintTypeTypeImpl();
		return constraintTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactsType createContactsType() {
		ContactsTypeImpl contactsType = new ContactsTypeImpl();
		return contactsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedArtifact createContainedArtifact() {
		ContainedArtifactImpl containedArtifact = new ContainedArtifactImpl();
		return containedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedArtifactList createContainedArtifactList() {
		ContainedArtifactListImpl containedArtifactList = new ContainedArtifactListImpl();
		return containedArtifactList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHashType createContentHashType() {
		ContentHashTypeImpl contentHashType = new ContentHashTypeImpl();
		return contentHashType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentSignifier createContentSignifier() {
		ContentSignifierImpl contentSignifier = new ContentSignifierImpl();
		return contentSignifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionsType createContributionsType() {
		ContributionsTypeImpl contributionsType = new ContributionsTypeImpl();
		return contributionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlBlock createControlBlock() {
		ControlBlockImpl controlBlock = new ControlBlockImpl();
		return controlBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllingArtifactType createControllingArtifactType() {
		ControllingArtifactTypeImpl controllingArtifactType = new ControllingArtifactTypeImpl();
		return controllingArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAction createCreateAction() {
		CreateActionImpl createAction = new CreateActionImpl();
		return createAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventTrigger createDataEventTrigger() {
		DataEventTriggerImpl dataEventTrigger = new DataEventTriggerImpl();
		return dataEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelsType createDataModelsType() {
		DataModelsTypeImpl dataModelsType = new DataModelsTypeImpl();
		return dataModelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareResponseAction createDeclareResponseAction() {
		DeclareResponseActionImpl declareResponseAction = new DeclareResponseActionImpl();
		return declareResponseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationItem createDocumentationItem() {
		DocumentationItemImpl documentationItem = new DocumentationItemImpl();
		return documentationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationConstraint createEnumerationConstraint() {
		EnumerationConstraintImpl enumerationConstraint = new EnumerationConstraintImpl();
		return enumerationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationItem createEnumerationItem() {
		EnumerationItemImpl enumerationItem = new EnumerationItemImpl();
		return enumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinding createEventBinding() {
		EventBindingImpl eventBinding = new EventBindingImpl();
		return eventBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBindingTypeType createEventBindingTypeType() {
		EventBindingTypeTypeImpl eventBindingTypeType = new EventBindingTypeTypeImpl();
		return eventBindingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefType createEventDefType() {
		EventDefTypeImpl eventDefType = new EventDefTypeImpl();
		return eventDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHistoryType createEventHistoryType() {
		EventHistoryTypeImpl eventHistoryType = new EventHistoryTypeImpl();
		return eventHistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventNameType createEventNameType() {
		EventNameTypeImpl eventNameType = new EventNameTypeImpl();
		return eventNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType createEventTypeType() {
		EventTypeTypeImpl eventTypeType = new EventTypeTypeImpl();
		return eventTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionConstraint createExpressionConstraint() {
		ExpressionConstraintImpl expressionConstraint = new ExpressionConstraintImpl();
		return expressionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsType createExpressionsType() {
		ExpressionsTypeImpl expressionsType = new ExpressionsTypeImpl();
		return expressionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataType createExternalDataType() {
		ExternalDataTypeImpl externalDataType = new ExternalDataTypeImpl();
		return externalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FireEventAction createFireEventAction() {
		FireEventActionImpl fireEventAction = new FireEventActionImpl();
		return fireEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FocusType createFocusType() {
		FocusTypeImpl focusType = new FocusTypeImpl();
		return focusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedNumber createFormattedNumber() {
		FormattedNumberImpl formattedNumber = new FormattedNumberImpl();
		return formattedNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText createFormattedText() {
		FormattedTextImpl formattedText = new FormattedTextImpl();
		return formattedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupOrganizationBehavior createGroupOrganizationBehavior() {
		GroupOrganizationBehaviorImpl groupOrganizationBehavior = new GroupOrganizationBehaviorImpl();
		return groupOrganizationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectionBehavior createGroupSelectionBehavior() {
		GroupSelectionBehaviorImpl groupSelectionBehavior = new GroupSelectionBehaviorImpl();
		return groupSelectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType createIdentifiersType() {
		IdentifiersTypeImpl identifiersType = new IdentifiersTypeImpl();
		return identifiersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType1 createIdentifiersType1() {
		IdentifiersType1Impl identifiersType1 = new IdentifiersType1Impl();
		return identifiersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType2 createIdentifiersType2() {
		IdentifiersType2Impl identifiersType2 = new IdentifiersType2Impl();
		return identifiersType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialArtifactType createInitialArtifactType() {
		InitialArtifactTypeImpl initialArtifactType = new InitialArtifactTypeImpl();
		return initialArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineResource createInlineResource() {
		InlineResourceImpl inlineResource = new InlineResourceImpl();
		return inlineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemCodesType createItemCodesType() {
		ItemCodesTypeImpl itemCodesType = new ItemCodesTypeImpl();
		return itemCodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTermsType createKeyTermsType() {
		KeyTermsTypeImpl keyTermsType = new KeyTermsTypeImpl();
		return keyTermsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeDocument createKnowledgeDocument() {
		KnowledgeDocumentImpl knowledgeDocument = new KnowledgeDocumentImpl();
		return knowledgeDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeResource createKnowledgeResource() {
		KnowledgeResourceImpl knowledgeResource = new KnowledgeResourceImpl();
		return knowledgeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibrariesType createLibrariesType() {
		LibrariesTypeImpl librariesType = new LibrariesTypeImpl();
		return librariesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReference createLibraryReference() {
		LibraryReferenceImpl libraryReference = new LibraryReferenceImpl();
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupConstraint createLookupConstraint() {
		LookupConstraintImpl lookupConstraint = new LookupConstraintImpl();
		return lookupConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest createManifest() {
		ManifestImpl manifest = new ManifestImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingType() {
		MappingTypeImpl mappingType = new MappingTypeImpl();
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskConstraint createMaskConstraint() {
		MaskConstraintImpl maskConstraint = new MaskConstraintImpl();
		return maskConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBinding createMetadataBinding() {
		MetadataBindingImpl metadataBinding = new MetadataBindingImpl();
		return metadataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEventDef createNamedEventDef() {
		NamedEventDefImpl namedEventDef = new NamedEventDefImpl();
		return namedEventDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEventTrigger createNamedEventTrigger() {
		NamedEventTriggerImpl namedEventTrigger = new NamedEventTriggerImpl();
		return namedEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEventTrigger createPeriodicEventTrigger() {
		PeriodicEventTriggerImpl periodicEventTrigger = new PeriodicEventTriggerImpl();
		return periodicEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionsType createPermissionsType() {
		PermissionsTypeImpl permissionsType = new PermissionsTypeImpl();
		return permissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecheckBehavior createPrecheckBehavior() {
		PrecheckBehaviorImpl precheckBehavior = new PrecheckBehaviorImpl();
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishersType createPublishersType() {
		PublishersTypeImpl publishersType = new PublishersTypeImpl();
		return publishersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadOnlyBehavior createReadOnlyBehavior() {
		ReadOnlyBehaviorImpl readOnlyBehavior = new ReadOnlyBehaviorImpl();
		return readOnlyBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedModelType createReferencedModelType() {
		ReferencedModelTypeImpl referencedModelType = new ReferencedModelTypeImpl();
		return referencedModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceList createReferenceList() {
		ReferenceListImpl referenceList = new ReferenceListImpl();
		return referenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedResourcesType createRelatedResourcesType() {
		RelatedResourcesTypeImpl relatedResourcesType = new RelatedResourcesTypeImpl();
		return relatedResourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAction createRemoveAction() {
		RemoveActionImpl removeAction = new RemoveActionImpl();
		return removeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentedConceptsType createRepresentedConceptsType() {
		RepresentedConceptsTypeImpl representedConceptsType = new RepresentedConceptsTypeImpl();
		return representedConceptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBehavior createRequiredBehavior() {
		RequiredBehaviorImpl requiredBehavior = new RequiredBehaviorImpl();
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRelationshipReference createResourceRelationshipReference() {
		ResourceRelationshipReferenceImpl resourceRelationshipReference = new ResourceRelationshipReferenceImpl();
		return resourceRelationshipReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesType createResourcesType() {
		ResourcesTypeImpl resourcesType = new ResourcesTypeImpl();
		return resourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBinding createResponseBinding() {
		ResponseBindingImpl responseBinding = new ResponseBindingImpl();
		return responseBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseCardinalityType createResponseCardinalityType() {
		ResponseCardinalityTypeImpl responseCardinalityType = new ResponseCardinalityTypeImpl();
		return responseCardinalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDataTypeType createResponseDataTypeType() {
		ResponseDataTypeTypeImpl responseDataTypeType = new ResponseDataTypeTypeImpl();
		return responseDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightsDeclaration createRightsDeclaration() {
		RightsDeclarationImpl rightsDeclaration = new RightsDeclarationImpl();
		return rightsDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificEventBinding createSpecificEventBinding() {
		SpecificEventBindingImpl specificEventBinding = new SpecificEventBindingImpl();
		return specificEventBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificMetadataBinding createSpecificMetadataBinding() {
		SpecificMetadataBindingImpl specificMetadataBinding = new SpecificMetadataBindingImpl();
		return specificMetadataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusType() {
		StatusTypeImpl statusType = new StatusTypeImpl();
		return statusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubElementsType createSubElementsType() {
		SubElementsTypeImpl subElementsType = new SubElementsTypeImpl();
		return subElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingEvidence createSupportingEvidence() {
		SupportingEvidenceImpl supportingEvidence = new SupportingEvidenceImpl();
		return supportingEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportingResource createSupportingResource() {
		SupportingResourceImpl supportingResource = new SupportingResourceImpl();
		return supportingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateIdsType createTemplateIdsType() {
		TemplateIdsTypeImpl templateIdsType = new TemplateIdsTypeImpl();
		return templateIdsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateIdsType1 createTemplateIdsType1() {
		TemplateIdsType1Impl templateIdsType1 = new TemplateIdsType1Impl();
		return templateIdsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerBindings createTriggerBindings() {
		TriggerBindingsImpl triggerBindings = new TriggerBindingsImpl();
		return triggerBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triggers createTriggers() {
		TriggersImpl triggers = new TriggersImpl();
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAction createUpdateAction() {
		UpdateActionImpl updateAction = new UpdateActionImpl();
		return updateAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlType createUrlType() {
		UrlTypeImpl urlType = new UrlTypeImpl();
		return urlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTermsType createUsageTermsType() {
		UsageTermsTypeImpl usageTermsType = new UsageTermsTypeImpl();
		return usageTermsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UuidType createUuidType() {
		UuidTypeImpl uuidType = new UuidTypeImpl();
		return uuidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConstraint createValueSetConstraint() {
		ValueSetConstraintImpl valueSetConstraint = new ValueSetConstraintImpl();
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedIdentifier createVersionedIdentifier() {
		VersionedIdentifierImpl versionedIdentifier = new VersionedIdentifierImpl();
		return versionedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualStyleBehavior createVisualStyleBehavior() {
		VisualStyleBehaviorImpl visualStyleBehavior = new VisualStyleBehaviorImpl();
		return visualStyleBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrappedContent createWrappedContent() {
		WrappedContentImpl wrappedContent = new WrappedContentImpl();
		return wrappedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLifeCycleEventType createArtifactLifeCycleEventTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactLifeCycleEventType result = ArtifactLifeCycleEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactLifeCycleEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactStatusType createArtifactStatusTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactStatusType result = ArtifactStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactType result = ArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityBehaviorType createCardinalityBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		CardinalityBehaviorType result = CardinalityBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompondArtifactType createCompondArtifactTypeFromString(EDataType eDataType, String initialValue) {
		CompondArtifactType result = CompondArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompondArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRoleType createConditionRoleTypeFromString(EDataType eDataType, String initialValue) {
		ConditionRoleType result = ConditionRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorTypeFromString(EDataType eDataType, String initialValue) {
		ContributorType result = ContributorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageType createCoverageTypeFromString(EDataType eDataType, String initialValue) {
		CoverageType result = CoverageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventType createDataEventTypeFromString(EDataType eDataType, String initialValue) {
		DataEventType result = DataEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupOrganizationBehaviorType createGroupOrganizationBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		GroupOrganizationBehaviorType result = GroupOrganizationBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupOrganizationBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectionBehaviorType createGroupSelectionBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		GroupSelectionBehaviorType result = GroupSelectionBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupSelectionBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBindingType createMetadataBindingTypeFromString(EDataType eDataType, String initialValue) {
		MetadataBindingType result = MetadataBindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetadataBindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecheckBehaviorType createPrecheckBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		PrecheckBehaviorType result = PrecheckBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrecheckBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConstraintType createRangeConstraintTypeFromString(EDataType eDataType, String initialValue) {
		RangeConstraintType result = RangeConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBehaviorType createRequiredBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		RequiredBehaviorType result = RequiredBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiredBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRelationshipType createResourceRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ResourceRelationshipType result = ResourceRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
		ValueType result = ValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLifeCycleEventType createArtifactLifeCycleEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactLifeCycleEventTypeFromString(R2Package.eINSTANCE.getArtifactLifeCycleEventType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactLifeCycleEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactLifeCycleEventTypeToString(R2Package.eINSTANCE.getArtifactLifeCycleEventType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactStatusType createArtifactStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactStatusTypeFromString(R2Package.eINSTANCE.getArtifactStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactStatusTypeToString(R2Package.eINSTANCE.getArtifactStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactTypeFromString(R2Package.eINSTANCE.getArtifactType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactTypeToString(R2Package.eINSTANCE.getArtifactType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityBehaviorType createCardinalityBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCardinalityBehaviorTypeFromString(R2Package.eINSTANCE.getCardinalityBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityBehaviorTypeToString(R2Package.eINSTANCE.getCardinalityBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityObjectFromString(EDataType eDataType, String initialValue) {
		return createCardinalityFromString(R2Package.eINSTANCE.getCardinality(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityToString(R2Package.eINSTANCE.getCardinality(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompondArtifactType createCompondArtifactTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCompondArtifactTypeFromString(R2Package.eINSTANCE.getCompondArtifactType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompondArtifactTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompondArtifactTypeToString(R2Package.eINSTANCE.getCompondArtifactType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRoleType createConditionRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionRoleTypeFromString(R2Package.eINSTANCE.getConditionRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionRoleTypeToString(R2Package.eINSTANCE.getConditionRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeFromString(R2Package.eINSTANCE.getContributorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeToString(R2Package.eINSTANCE.getContributorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageType createCoverageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCoverageTypeFromString(R2Package.eINSTANCE.getCoverageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCoverageTypeToString(R2Package.eINSTANCE.getCoverageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventType createDataEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataEventTypeFromString(R2Package.eINSTANCE.getDataEventType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataEventTypeToString(R2Package.eINSTANCE.getDataEventType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTypeFromString(R2Package.eINSTANCE.getEventType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeToString(R2Package.eINSTANCE.getEventType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupOrganizationBehaviorType createGroupOrganizationBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupOrganizationBehaviorTypeFromString(R2Package.eINSTANCE.getGroupOrganizationBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupOrganizationBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupOrganizationBehaviorTypeToString(R2Package.eINSTANCE.getGroupOrganizationBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectionBehaviorType createGroupSelectionBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupSelectionBehaviorTypeFromString(R2Package.eINSTANCE.getGroupSelectionBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupSelectionBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupSelectionBehaviorTypeToString(R2Package.eINSTANCE.getGroupSelectionBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBindingType createMetadataBindingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMetadataBindingTypeFromString(R2Package.eINSTANCE.getMetadataBindingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetadataBindingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMetadataBindingTypeToString(R2Package.eINSTANCE.getMetadataBindingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecheckBehaviorType createPrecheckBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrecheckBehaviorTypeFromString(R2Package.eINSTANCE.getPrecheckBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrecheckBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrecheckBehaviorTypeToString(R2Package.eINSTANCE.getPrecheckBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConstraintType createRangeConstraintTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeConstraintTypeFromString(R2Package.eINSTANCE.getRangeConstraintType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeConstraintTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeConstraintTypeToString(R2Package.eINSTANCE.getRangeConstraintType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBehaviorType createRequiredBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRequiredBehaviorTypeFromString(R2Package.eINSTANCE.getRequiredBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiredBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequiredBehaviorTypeToString(R2Package.eINSTANCE.getRequiredBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRelationshipType createResourceRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceRelationshipTypeFromString(R2Package.eINSTANCE.getResourceRelationshipType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceRelationshipTypeToString(R2Package.eINSTANCE.getResourceRelationshipType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeFromString(R2Package.eINSTANCE.getValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeToString(R2Package.eINSTANCE.getValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Package getR2Package() {
		return (R2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static R2Package getPackage() {
		return R2Package.eINSTANCE;
	}

} //R2FactoryImpl
