/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hl7.knowledgeartifact.r1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R1FactoryImpl extends EFactoryImpl implements R1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static R1Factory init() {
		try {
			R1Factory theR1Factory = (R1Factory)EPackage.Registry.INSTANCE.getEFactory(R1Package.eNS_URI);
			if (theR1Factory != null) {
				return theR1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new R1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1FactoryImpl() {
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
			case R1Package.ACTION_GROUP: return createActionGroup();
			case R1Package.ACTION_REF: return createActionRef();
			case R1Package.ACTOR: return createActor();
			case R1Package.ACTORS_TYPE: return createActorsType();
			case R1Package.ADDRESSES_TYPE: return createAddressesType();
			case R1Package.APPLICABILITY_TYPE: return createApplicabilityType();
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT: return createArtifactLifeCycleEvent();
			case R1Package.ARTIFACT_TYPE_TYPE: return createArtifactTypeType();
			case R1Package.BEHAVIORS: return createBehaviors();
			case R1Package.CARDINALITY_BEHAVIOR: return createCardinalityBehavior();
			case R1Package.CATEGORIES_TYPE: return createCategoriesType();
			case R1Package.CODES_TYPE: return createCodesType();
			case R1Package.COLLECT_INFORMATION_ACTION: return createCollectInformationAction();
			case R1Package.CONDITION: return createCondition();
			case R1Package.CONDITION_ROLE_TYPE1: return createConditionRoleType1();
			case R1Package.CONDITIONS: return createConditions();
			case R1Package.CONSTRAINT_TYPE_TYPE: return createConstraintTypeType();
			case R1Package.CONTACTS_TYPE: return createContactsType();
			case R1Package.CONTENT_TYPE: return createContentType();
			case R1Package.CONTRIBUTION: return createContribution();
			case R1Package.CONTRIBUTIONS_TYPE: return createContributionsType();
			case R1Package.COVERAGE: return createCoverage();
			case R1Package.CREATE_ACTION: return createCreateAction();
			case R1Package.DATA_EVENT_TRIGGER: return createDataEventTrigger();
			case R1Package.DATA_MODELS_TYPE: return createDataModelsType();
			case R1Package.DECLARE_RESPONSE_ACTION: return createDeclareResponseAction();
			case R1Package.DOCUMENTATION_ITEM: return createDocumentationItem();
			case R1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case R1Package.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
			case R1Package.ENUMERATION_ITEM: return createEnumerationItem();
			case R1Package.EVENT_HISTORY_TYPE: return createEventHistoryType();
			case R1Package.EVENT_TYPE_TYPE: return createEventTypeType();
			case R1Package.EVIDENCE: return createEvidence();
			case R1Package.EXPRESSION_CONSTRAINT: return createExpressionConstraint();
			case R1Package.EXPRESSIONS_TYPE: return createExpressionsType();
			case R1Package.EXTERNAL_DATA_TYPE: return createExternalDataType();
			case R1Package.FIRE_EVENT_ACTION: return createFireEventAction();
			case R1Package.FOCUS_TYPE: return createFocusType();
			case R1Package.FORMATTED_NUMBER: return createFormattedNumber();
			case R1Package.FORMATTED_TEXT: return createFormattedText();
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR: return createGroupOrganizationBehavior();
			case R1Package.GROUP_SELECTION_BEHAVIOR: return createGroupSelectionBehavior();
			case R1Package.IDENTIFIERS_TYPE: return createIdentifiersType();
			case R1Package.IDENTIFIERS_TYPE1: return createIdentifiersType1();
			case R1Package.INLINE_RESOURCE: return createInlineResource();
			case R1Package.ITEM_CODES_TYPE: return createItemCodesType();
			case R1Package.KEY_TERMS_TYPE: return createKeyTermsType();
			case R1Package.KNOWLEDGE_DOCUMENT: return createKnowledgeDocument();
			case R1Package.KNOWLEDGE_RESOURCE: return createKnowledgeResource();
			case R1Package.LIBRARIES_TYPE: return createLibrariesType();
			case R1Package.LIBRARY_REFERENCE: return createLibraryReference();
			case R1Package.LOOKUP_CONSTRAINT: return createLookupConstraint();
			case R1Package.MASK_CONSTRAINT: return createMaskConstraint();
			case R1Package.METADATA: return createMetadata();
			case R1Package.MODEL_REFERENCE: return createModelReference();
			case R1Package.NAMED_EVENT_TRIGGER: return createNamedEventTrigger();
			case R1Package.ORGANIZATION: return createOrganization();
			case R1Package.PERIODIC_EVENT_TRIGGER: return createPeriodicEventTrigger();
			case R1Package.PERMISSIONS_TYPE: return createPermissionsType();
			case R1Package.PERSON: return createPerson();
			case R1Package.PRECHECK_BEHAVIOR: return createPrecheckBehavior();
			case R1Package.PUBLISHERS_TYPE: return createPublishersType();
			case R1Package.READ_ONLY_BEHAVIOR: return createReadOnlyBehavior();
			case R1Package.REFERENCED_MODEL_TYPE: return createReferencedModelType();
			case R1Package.RELATED_RESOURCES_TYPE: return createRelatedResourcesType();
			case R1Package.RELATIONSHIP_TYPE: return createRelationshipType();
			case R1Package.REMOVE_ACTION: return createRemoveAction();
			case R1Package.REPRESENTED_CONCEPTS_TYPE: return createRepresentedConceptsType();
			case R1Package.REQUIRED_BEHAVIOR: return createRequiredBehavior();
			case R1Package.RESOURCE_RELATIONSHIP_REFERENCE: return createResourceRelationshipReference();
			case R1Package.RESOURCES_TYPE: return createResourcesType();
			case R1Package.RESPONSE_BINDING: return createResponseBinding();
			case R1Package.RESPONSE_CARDINALITY_TYPE: return createResponseCardinalityType();
			case R1Package.RESPONSE_DATA_TYPE_TYPE: return createResponseDataTypeType();
			case R1Package.RIGHTS_DECLARATION: return createRightsDeclaration();
			case R1Package.ROLE_TYPE: return createRoleType();
			case R1Package.STATUS_TYPE: return createStatusType();
			case R1Package.SUB_ELEMENTS_TYPE: return createSubElementsType();
			case R1Package.SUPPORTING_EVIDENCE: return createSupportingEvidence();
			case R1Package.SUPPORTING_RESOURCE: return createSupportingResource();
			case R1Package.TEMPLATE_IDS_TYPE: return createTemplateIdsType();
			case R1Package.TEMPLATE_IDS_TYPE1: return createTemplateIdsType1();
			case R1Package.TRIGGERS: return createTriggers();
			case R1Package.UPDATE_ACTION: return createUpdateAction();
			case R1Package.USAGE_TERMS_TYPE: return createUsageTermsType();
			case R1Package.VALUE_SET_CONSTRAINT: return createValueSetConstraint();
			case R1Package.VERSIONED_IDENTIFIER: return createVersionedIdentifier();
			case R1Package.VISUAL_STYLE_BEHAVIOR: return createVisualStyleBehavior();
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE:
				return createArtifactLifeCycleEventTypeFromString(eDataType, initialValue);
			case R1Package.ARTIFACT_STATUS_TYPE:
				return createArtifactStatusTypeFromString(eDataType, initialValue);
			case R1Package.ARTIFACT_TYPE:
				return createArtifactTypeFromString(eDataType, initialValue);
			case R1Package.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case R1Package.CARDINALITY_BEHAVIOR_TYPE:
				return createCardinalityBehaviorTypeFromString(eDataType, initialValue);
			case R1Package.COMPOND_ARTIFACT_TYPE:
				return createCompondArtifactTypeFromString(eDataType, initialValue);
			case R1Package.CONDITION_ROLE_TYPE:
				return createConditionRoleTypeFromString(eDataType, initialValue);
			case R1Package.CONTRIBUTOR_TYPE:
				return createContributorTypeFromString(eDataType, initialValue);
			case R1Package.COVERAGE_TYPE:
				return createCoverageTypeFromString(eDataType, initialValue);
			case R1Package.DATA_EVENT_TYPE:
				return createDataEventTypeFromString(eDataType, initialValue);
			case R1Package.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE:
				return createGroupOrganizationBehaviorTypeFromString(eDataType, initialValue);
			case R1Package.GROUP_SELECTION_BEHAVIOR_TYPE:
				return createGroupSelectionBehaviorTypeFromString(eDataType, initialValue);
			case R1Package.PRECHECK_BEHAVIOR_TYPE:
				return createPrecheckBehaviorTypeFromString(eDataType, initialValue);
			case R1Package.RANGE_CONSTRAINT_TYPE:
				return createRangeConstraintTypeFromString(eDataType, initialValue);
			case R1Package.REQUIRED_BEHAVIOR_TYPE:
				return createRequiredBehaviorTypeFromString(eDataType, initialValue);
			case R1Package.RESOURCE_RELATIONSHIP_TYPE:
				return createResourceRelationshipTypeFromString(eDataType, initialValue);
			case R1Package.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT:
				return createArtifactLifeCycleEventTypeObjectFromString(eDataType, initialValue);
			case R1Package.ARTIFACT_STATUS_TYPE_OBJECT:
				return createArtifactStatusTypeObjectFromString(eDataType, initialValue);
			case R1Package.ARTIFACT_TYPE_OBJECT:
				return createArtifactTypeObjectFromString(eDataType, initialValue);
			case R1Package.CARDINALITY_BEHAVIOR_TYPE_OBJECT:
				return createCardinalityBehaviorTypeObjectFromString(eDataType, initialValue);
			case R1Package.CARDINALITY_OBJECT:
				return createCardinalityObjectFromString(eDataType, initialValue);
			case R1Package.COMPOND_ARTIFACT_TYPE_OBJECT:
				return createCompondArtifactTypeObjectFromString(eDataType, initialValue);
			case R1Package.CONDITION_ROLE_TYPE_OBJECT:
				return createConditionRoleTypeObjectFromString(eDataType, initialValue);
			case R1Package.CONTRIBUTOR_TYPE_OBJECT:
				return createContributorTypeObjectFromString(eDataType, initialValue);
			case R1Package.COVERAGE_TYPE_OBJECT:
				return createCoverageTypeObjectFromString(eDataType, initialValue);
			case R1Package.DATA_EVENT_TYPE_OBJECT:
				return createDataEventTypeObjectFromString(eDataType, initialValue);
			case R1Package.EVENT_TYPE_OBJECT:
				return createEventTypeObjectFromString(eDataType, initialValue);
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT:
				return createGroupOrganizationBehaviorTypeObjectFromString(eDataType, initialValue);
			case R1Package.GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT:
				return createGroupSelectionBehaviorTypeObjectFromString(eDataType, initialValue);
			case R1Package.PRECHECK_BEHAVIOR_TYPE_OBJECT:
				return createPrecheckBehaviorTypeObjectFromString(eDataType, initialValue);
			case R1Package.RANGE_CONSTRAINT_TYPE_OBJECT:
				return createRangeConstraintTypeObjectFromString(eDataType, initialValue);
			case R1Package.REQUIRED_BEHAVIOR_TYPE_OBJECT:
				return createRequiredBehaviorTypeObjectFromString(eDataType, initialValue);
			case R1Package.RESOURCE_RELATIONSHIP_TYPE_OBJECT:
				return createResourceRelationshipTypeObjectFromString(eDataType, initialValue);
			case R1Package.VALUE_TYPE_OBJECT:
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
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE:
				return convertArtifactLifeCycleEventTypeToString(eDataType, instanceValue);
			case R1Package.ARTIFACT_STATUS_TYPE:
				return convertArtifactStatusTypeToString(eDataType, instanceValue);
			case R1Package.ARTIFACT_TYPE:
				return convertArtifactTypeToString(eDataType, instanceValue);
			case R1Package.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case R1Package.CARDINALITY_BEHAVIOR_TYPE:
				return convertCardinalityBehaviorTypeToString(eDataType, instanceValue);
			case R1Package.COMPOND_ARTIFACT_TYPE:
				return convertCompondArtifactTypeToString(eDataType, instanceValue);
			case R1Package.CONDITION_ROLE_TYPE:
				return convertConditionRoleTypeToString(eDataType, instanceValue);
			case R1Package.CONTRIBUTOR_TYPE:
				return convertContributorTypeToString(eDataType, instanceValue);
			case R1Package.COVERAGE_TYPE:
				return convertCoverageTypeToString(eDataType, instanceValue);
			case R1Package.DATA_EVENT_TYPE:
				return convertDataEventTypeToString(eDataType, instanceValue);
			case R1Package.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE:
				return convertGroupOrganizationBehaviorTypeToString(eDataType, instanceValue);
			case R1Package.GROUP_SELECTION_BEHAVIOR_TYPE:
				return convertGroupSelectionBehaviorTypeToString(eDataType, instanceValue);
			case R1Package.PRECHECK_BEHAVIOR_TYPE:
				return convertPrecheckBehaviorTypeToString(eDataType, instanceValue);
			case R1Package.RANGE_CONSTRAINT_TYPE:
				return convertRangeConstraintTypeToString(eDataType, instanceValue);
			case R1Package.REQUIRED_BEHAVIOR_TYPE:
				return convertRequiredBehaviorTypeToString(eDataType, instanceValue);
			case R1Package.RESOURCE_RELATIONSHIP_TYPE:
				return convertResourceRelationshipTypeToString(eDataType, instanceValue);
			case R1Package.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			case R1Package.ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT:
				return convertArtifactLifeCycleEventTypeObjectToString(eDataType, instanceValue);
			case R1Package.ARTIFACT_STATUS_TYPE_OBJECT:
				return convertArtifactStatusTypeObjectToString(eDataType, instanceValue);
			case R1Package.ARTIFACT_TYPE_OBJECT:
				return convertArtifactTypeObjectToString(eDataType, instanceValue);
			case R1Package.CARDINALITY_BEHAVIOR_TYPE_OBJECT:
				return convertCardinalityBehaviorTypeObjectToString(eDataType, instanceValue);
			case R1Package.CARDINALITY_OBJECT:
				return convertCardinalityObjectToString(eDataType, instanceValue);
			case R1Package.COMPOND_ARTIFACT_TYPE_OBJECT:
				return convertCompondArtifactTypeObjectToString(eDataType, instanceValue);
			case R1Package.CONDITION_ROLE_TYPE_OBJECT:
				return convertConditionRoleTypeObjectToString(eDataType, instanceValue);
			case R1Package.CONTRIBUTOR_TYPE_OBJECT:
				return convertContributorTypeObjectToString(eDataType, instanceValue);
			case R1Package.COVERAGE_TYPE_OBJECT:
				return convertCoverageTypeObjectToString(eDataType, instanceValue);
			case R1Package.DATA_EVENT_TYPE_OBJECT:
				return convertDataEventTypeObjectToString(eDataType, instanceValue);
			case R1Package.EVENT_TYPE_OBJECT:
				return convertEventTypeObjectToString(eDataType, instanceValue);
			case R1Package.GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT:
				return convertGroupOrganizationBehaviorTypeObjectToString(eDataType, instanceValue);
			case R1Package.GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT:
				return convertGroupSelectionBehaviorTypeObjectToString(eDataType, instanceValue);
			case R1Package.PRECHECK_BEHAVIOR_TYPE_OBJECT:
				return convertPrecheckBehaviorTypeObjectToString(eDataType, instanceValue);
			case R1Package.RANGE_CONSTRAINT_TYPE_OBJECT:
				return convertRangeConstraintTypeObjectToString(eDataType, instanceValue);
			case R1Package.REQUIRED_BEHAVIOR_TYPE_OBJECT:
				return convertRequiredBehaviorTypeObjectToString(eDataType, instanceValue);
			case R1Package.RESOURCE_RELATIONSHIP_TYPE_OBJECT:
				return convertResourceRelationshipTypeObjectToString(eDataType, instanceValue);
			case R1Package.VALUE_TYPE_OBJECT:
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
	public ArtifactTypeType createArtifactTypeType() {
		ArtifactTypeTypeImpl artifactTypeType = new ArtifactTypeTypeImpl();
		return artifactTypeType;
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
	public CollectInformationAction createCollectInformationAction() {
		CollectInformationActionImpl collectInformationAction = new CollectInformationActionImpl();
		return collectInformationAction;
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
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
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
	public EventHistoryType createEventHistoryType() {
		EventHistoryTypeImpl eventHistoryType = new EventHistoryTypeImpl();
		return eventHistoryType;
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
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
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
	public ReferencedModelType createReferencedModelType() {
		ReferencedModelTypeImpl referencedModelType = new ReferencedModelTypeImpl();
		return referencedModelType;
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
	public UsageTermsType createUsageTermsType() {
		UsageTermsTypeImpl usageTermsType = new UsageTermsTypeImpl();
		return usageTermsType;
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
		return createArtifactLifeCycleEventTypeFromString(R1Package.Literals.ARTIFACT_LIFE_CYCLE_EVENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactLifeCycleEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactLifeCycleEventTypeToString(R1Package.Literals.ARTIFACT_LIFE_CYCLE_EVENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactStatusType createArtifactStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactStatusTypeFromString(R1Package.Literals.ARTIFACT_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactStatusTypeToString(R1Package.Literals.ARTIFACT_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactTypeFromString(R1Package.Literals.ARTIFACT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactTypeToString(R1Package.Literals.ARTIFACT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityBehaviorType createCardinalityBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCardinalityBehaviorTypeFromString(R1Package.Literals.CARDINALITY_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityBehaviorTypeToString(R1Package.Literals.CARDINALITY_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityObjectFromString(EDataType eDataType, String initialValue) {
		return createCardinalityFromString(R1Package.Literals.CARDINALITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCardinalityToString(R1Package.Literals.CARDINALITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompondArtifactType createCompondArtifactTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCompondArtifactTypeFromString(R1Package.Literals.COMPOND_ARTIFACT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompondArtifactTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompondArtifactTypeToString(R1Package.Literals.COMPOND_ARTIFACT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRoleType createConditionRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionRoleTypeFromString(R1Package.Literals.CONDITION_ROLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionRoleTypeToString(R1Package.Literals.CONDITION_ROLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeFromString(R1Package.Literals.CONTRIBUTOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeToString(R1Package.Literals.CONTRIBUTOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageType createCoverageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCoverageTypeFromString(R1Package.Literals.COVERAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCoverageTypeToString(R1Package.Literals.COVERAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventType createDataEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataEventTypeFromString(R1Package.Literals.DATA_EVENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataEventTypeToString(R1Package.Literals.DATA_EVENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTypeFromString(R1Package.Literals.EVENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeToString(R1Package.Literals.EVENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupOrganizationBehaviorType createGroupOrganizationBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupOrganizationBehaviorTypeFromString(R1Package.Literals.GROUP_ORGANIZATION_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupOrganizationBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupOrganizationBehaviorTypeToString(R1Package.Literals.GROUP_ORGANIZATION_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectionBehaviorType createGroupSelectionBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupSelectionBehaviorTypeFromString(R1Package.Literals.GROUP_SELECTION_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupSelectionBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupSelectionBehaviorTypeToString(R1Package.Literals.GROUP_SELECTION_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecheckBehaviorType createPrecheckBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrecheckBehaviorTypeFromString(R1Package.Literals.PRECHECK_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrecheckBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrecheckBehaviorTypeToString(R1Package.Literals.PRECHECK_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConstraintType createRangeConstraintTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeConstraintTypeFromString(R1Package.Literals.RANGE_CONSTRAINT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeConstraintTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeConstraintTypeToString(R1Package.Literals.RANGE_CONSTRAINT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBehaviorType createRequiredBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRequiredBehaviorTypeFromString(R1Package.Literals.REQUIRED_BEHAVIOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiredBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequiredBehaviorTypeToString(R1Package.Literals.REQUIRED_BEHAVIOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRelationshipType createResourceRelationshipTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceRelationshipTypeFromString(R1Package.Literals.RESOURCE_RELATIONSHIP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceRelationshipTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceRelationshipTypeToString(R1Package.Literals.RESOURCE_RELATIONSHIP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeFromString(R1Package.Literals.VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeToString(R1Package.Literals.VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Package getR1Package() {
		return (R1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static R1Package getPackage() {
		return R1Package.eINSTANCE;
	}

} //R1FactoryImpl
